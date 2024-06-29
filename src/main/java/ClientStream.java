import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GXWEWMHV")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "client!GXWEWMHV", name = "b", descriptor = "B")
    private byte field862 = 2;

    @OriginalMember(owner = "client!GXWEWMHV", name = "f", descriptor = "Z")
    private boolean field866 = false;

    @OriginalMember(owner = "client!GXWEWMHV", name = "k", descriptor = "Z")
    private boolean field871 = false;

    @OriginalMember(owner = "client!GXWEWMHV", name = "l", descriptor = "Z")
    private boolean field872 = false;

    @OriginalMember(owner = "client!GXWEWMHV", name = "g", descriptor = "LJWWAIQPI;")
    public GameShell field867;

    @OriginalMember(owner = "client!GXWEWMHV", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field865;

    @OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!GXWEWMHV", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field863;

    @OriginalMember(owner = "client!GXWEWMHV", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field864;

    @OriginalMember(owner = "client!GXWEWMHV", name = "i", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "client!GXWEWMHV", name = "j", descriptor = "I")
    private int field870;

    @OriginalMember(owner = "client!GXWEWMHV", name = "h", descriptor = "[B")
    private byte[] field868;

    @OriginalMember(owner = "client!GXWEWMHV", name = "<init>", descriptor = "(BLjava/net/Socket;LJWWAIQPI;)V")
    public ClientStream(byte arg0, Socket arg1, GameShell arg2) throws IOException {
        this.field867 = arg2;
        this.field865 = arg1;
        if (this.field862 == arg0) {
            boolean var4 = false;
        } else {
            this.field861 = -5;
        }
        this.field865.setSoTimeout(30000);
        this.field865.setTcpNoDelay(true);
        this.field863 = this.field865.getInputStream();
        this.field864 = this.field865.getOutputStream();
    }

    @OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "()V")
    public void method233() {
        this.field866 = true;
        try {
            if (this.field863 != null) {
                this.field863.close();
            }
            if (this.field864 != null) {
                this.field864.close();
            }
            if (this.field865 != null) {
                this.field865.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field871 = false;
        synchronized (this) {
            this.notify();
        }
        this.field868 = null;
    }

    @OriginalMember(owner = "client!GXWEWMHV", name = "b", descriptor = "()I")
    public int method234() throws IOException {
        return this.field866 ? 0 : this.field863.read();
    }

    @OriginalMember(owner = "client!GXWEWMHV", name = "c", descriptor = "()I")
    public int method235() throws IOException {
        return this.field866 ? 0 : this.field863.available();
    }

    @OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "([BII)V")
    public void method236(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field866) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field863.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "(III[B)V")
    public void method237(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field866) {
            return;
        }
        if (this.field872) {
            this.field872 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field868 == null) {
            this.field868 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field868[this.field870] = arg3[arg2 + var6];
                this.field870 = (this.field870 + 1) % 5000;
                if ((this.field869 + 4900) % 5000 == this.field870) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field871) {
                this.field871 = true;
                this.field867.method142(this, 3);
            }
            this.notify();
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!GXWEWMHV", name = "run", descriptor = "()V")
    public void run() {
        while (this.field871) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field870 == this.field869) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field871) {
                    return;
                }
                var2 = this.field869;
                if (this.field870 >= this.field869) {
                    var3 = this.field870 - this.field869;
                } else {
                    var3 = 5000 - this.field869;
                }
            }
            if (var3 > 0) {
                try {
                    this.field864.write(this.field868, var2, var3);
                } catch (IOException var7) {
                    this.field872 = true;
                }
                this.field869 = (this.field869 + var3) % 5000;
                try {
                    if (this.field870 == this.field869) {
                        this.field864.flush();
                    }
                } catch (IOException var6) {
                    this.field872 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "(Z)V")
    public void method238(boolean arg0) {
        System.out.println("dummy:" + this.field866);
        System.out.println("tcycl:" + this.field869);
        System.out.println("tnum:" + this.field870);
        System.out.println("writer:" + this.field871);
        if (arg0) {
            return;
        }
        System.out.println("ioerror:" + this.field872);
        try {
            System.out.println("available:" + this.method235());
        } catch (IOException var2) {
        }
    }
}

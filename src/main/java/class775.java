import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class775 implements Runnable {

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Z")
    private boolean field10690 = false;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    private int field10697 = 0;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Z")
    private boolean field10696 = false;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    private int field10704 = 0;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field10707;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "Llc;")
    private class675 field10703;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field10695;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field10693;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    private int field10691;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Z")
    public static boolean field10694 = true;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field10689;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field10692;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field10698;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field10699;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field10700;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field10702;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field10705;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field10708;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field10709;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Lpga;")
    private class561 field10706;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "[B")
    private byte[] field10701;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
    public final int method4302(boolean arg0) throws IOException {
        field10705++;
        if (arg0) {
            this.method4304(true);
        }
        return this.field10696 ? 0 : this.field10695.read();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public final void method4303(int arg0) {
        field10689++;
        if (this.field10696) {
            return;
        }
        this.field10695 = new class341();
        this.field10693 = new class432();
        if (arg0 != 0) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)V")
    public final void method4304(boolean arg0) {
        field10698++;
        if (this.field10696) {
            return;
        }
        synchronized (this) {
            this.field10696 = true;
            if (arg0) {
                this.run();
            }
            this.notifyAll();
        }
        if (this.field10706 != null) {
            while (this.field10706.field7769 == 0) {
                class594.method3405(1L, 16711680);
            }
            if (this.field10706.field7769 == 1) {
                try {
                    ((Thread) this.field10706.field7768).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field10706 = null;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
    public final int method4305(int arg0) throws IOException {
        field10709++;
        if (this.field10696) {
            return 0;
        } else {
            if (arg0 >= -119) {
                this.field10693 = null;
            }
            return this.field10695.available();
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
    public final void method4306(int arg0) throws IOException {
        field10702++;
        if (arg0 <= 37) {
            this.run();
        }
        if (!this.field10696 && this.field10690) {
            this.field10690 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field10708++;
        this.method4304(false);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "([BIBI)V")
    public final void method4307(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field10699++;
        if (this.field10696) {
            return;
        }
        if (this.field10690) {
            this.field10690 = false;
            throw new IOException();
        }
        if (this.field10701 == null) {
            this.field10701 = new byte[this.field10691];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field10701[this.field10697] = arg0[arg3 + var6];
                this.field10697 = (this.field10697 + 1) % this.field10691;
                if ((this.field10704 - (100 - this.field10691)) % this.field10691 == this.field10697) {
                    throw new IOException();
                }
            }
            if (this.field10706 == null) {
                this.field10706 = this.field10703.method3805(3, -94, this);
            }
            this.notifyAll();
            if (arg2 <= 23) {
                this.field10691 = 10;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field10704 == this.field10697) {
                            if (this.field10696) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field10704;
                        if (this.field10697 >= this.field10704) {
                            var3 = this.field10697 - this.field10704;
                        } else {
                            var3 = this.field10691 - this.field10704;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field10693.write(this.field10701, var2, var3);
                    } catch (IOException var9) {
                        this.field10690 = true;
                    }
                    this.field10704 = (this.field10704 + var3) % this.field10691;
                    try {
                        if (this.field10704 == this.field10697) {
                            this.field10693.flush();
                        }
                    } catch (IOException var8) {
                        this.field10690 = true;
                    }
                    continue;
                }
                try {
                    if (this.field10695 != null) {
                        this.field10695.close();
                    }
                    if (this.field10693 != null) {
                        this.field10693.close();
                    }
                    if (this.field10707 != null) {
                        this.field10707.close();
                    }
                } catch (IOException var7) {
                }
                this.field10701 = null;
                break;
            }
        } catch (Exception var12) {
            class705.method4008(var12, null, -123);
        }
        field10700++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIZ[B)V")
    public final void method4308(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (!arg2) {
            this.run();
        }
        field10692++;
        if (this.field10696) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field10695.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/net/Socket;Llc;I)V")
    public class775(Socket arg0, class675 arg1, int arg2) throws IOException {
        this.field10707 = arg0;
        this.field10703 = arg1;
        this.field10707.setSoTimeout(30000);
        this.field10707.setTcpNoDelay(true);
        this.field10695 = this.field10707.getInputStream();
        this.field10693 = this.field10707.getOutputStream();
        this.field10691 = arg2;
    }
}

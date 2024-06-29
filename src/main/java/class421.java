import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class421 implements Runnable {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Z")
    private boolean field5959 = false;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    private int field5972 = 0;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    private int field5970 = 0;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "Z")
    private boolean field5967 = false;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Lpc;")
    private class476 field5963;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field5974;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field5964;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5978;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field5976 = -1;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Ldq;")
    public static class493 field5971 = new class493(21, 14);

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "Lcw;")
    private class121 field5973;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "[B")
    private byte[] field5966;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)I", line = 4)
    public final int method2470(byte arg0) throws IOException {
        field5968++;
        if (arg0 <= 59) {
            method2476((byte) 14);
        }
        return this.field5959 ? 0 : this.field5964.available();
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V", line = 18)
    public final void method2471(byte arg0) {
        field5977++;
        if (this.field5959) {
            return;
        }
        if (arg0 > -88) {
            this.field5974 = null;
        }
        this.field5964 = new class199();
        this.field5978 = new class444();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II[BI)V", line = 36)
    public final void method2472(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != -20555) {
            this.method2473(50);
        }
        field5960++;
        if (this.field5959) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field5964.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 62)
    public final void method2473(int arg0) {
        field5962++;
        if (this.field5959) {
            return;
        }
        if (arg0 != 10228) {
            this.method2471((byte) -5);
        }
        synchronized (this) {
            this.field5959 = true;
            this.notifyAll();
        }
        if (this.field5973 != null) {
            while (this.field5973.field1628 == 0) {
                class199.method1251(1L, (byte) 105);
            }
            if (this.field5973.field1628 == 1) {
                try {
                    ((Thread) this.field5973.field1627).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5973 = null;
    }

    @OriginalMember(owner = "client!kq", name = "run", descriptor = "()V", line = 98)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5972 == this.field5970) {
                            if (this.field5959) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field5970;
                        if (this.field5970 <= this.field5972) {
                            var3 = this.field5972 - this.field5970;
                        } else {
                            var3 = 5000 - this.field5970;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field5978.write(this.field5966, var2, var3);
                    } catch (IOException var9) {
                        this.field5967 = true;
                    }
                    this.field5970 = (this.field5970 + var3) % 5000;
                    try {
                        if (this.field5972 == this.field5970) {
                            this.field5978.flush();
                        }
                    } catch (IOException var8) {
                        this.field5967 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5964 != null) {
                        this.field5964.close();
                    }
                    if (this.field5978 != null) {
                        this.field5978.close();
                    }
                    if (this.field5974 != null) {
                        this.field5974.close();
                    }
                } catch (IOException var7) {
                }
                this.field5966 = null;
                break;
            }
        } catch (Exception var12) {
            class461.method2719(var12, null, 1);
        }
        field5957++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)I", line = 171)
    public final int method2474(boolean arg0) throws IOException {
        field5975++;
        if (this.field5959) {
            return 0;
        } else if (arg0) {
            return -77;
        } else {
            return this.field5964.read();
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI[B)V", line = 186)
    public final void method2475(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field5969++;
        if (this.field5959) {
            return;
        }
        if (this.field5967) {
            this.field5967 = false;
            throw new IOException();
        }
        if (this.field5966 == null) {
            this.field5966 = new byte[5000];
        }
        if (arg1 < 101) {
            this.method2473(83);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field5966[this.field5972] = arg3[arg0 + var6];
                this.field5972 = (this.field5972 + 1) % 5000;
                if (((this.field5970 + 4900) % 5000) == this.field5972) {
                    throw new IOException();
                }
            }
            if (this.field5973 == null) {
                this.field5973 = this.field5963.method2870(false, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V", line = 240)
    public static void method2476(byte arg0) {
        if (arg0 != -35) {
            field5961 = 105;
        }
        field5971 = null;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/net/Socket;Lpc;)V", line = 307)
    public class421(Socket arg0, class476 arg1) throws IOException {
        this.field5963 = arg1;
        this.field5974 = arg0;
        this.field5974.setSoTimeout(30000);
        this.field5974.setTcpNoDelay(true);
        this.field5964 = this.field5974.getInputStream();
        this.field5978 = this.field5974.getOutputStream();
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 258)
    public final void method2477(int arg0) throws IOException {
        field5958++;
        if (arg0 != 0) {
            this.field5967 = false;
        }
        if (!this.field5959 && this.field5967) {
            this.field5967 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V", line = 286)
    protected final void finalize() {
        this.method2473(10228);
        field5965++;
    }
}

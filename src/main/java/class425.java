import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class425 implements Runnable {

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    private int field6062 = 0;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "Z")
    private boolean field6063 = false;

    @OriginalMember(owner = "client!faa", name = "u", descriptor = "I")
    private int field6075 = 0;

    @OriginalMember(owner = "client!faa", name = "t", descriptor = "Z")
    private boolean field6074 = false;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field6071;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Lwv;")
    private class705 field6058;

    @OriginalMember(owner = "client!faa", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field6078;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6057;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Ljda;")
    public static class77 field6055 = new class77("", 16);

    @OriginalMember(owner = "client!faa", name = "w", descriptor = "Leda;")
    public static class116 field6077 = new class116(26, 8);

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "F")
    public static float field6072;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!faa", name = "v", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "Lvo;")
    public static class345 field6073;

    @OriginalMember(owner = "client!faa", name = "y", descriptor = "Ltj;")
    private class614 field6079;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "[B")
    private byte[] field6064;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method2499(int arg0, int arg1, byte arg2) {
        if (arg2 < 20) {
            field6077 = null;
        }
        field6066++;
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V", line = 15)
    public final void method2500(boolean arg0) {
        field6059++;
        if (this.field6063) {
            return;
        }
        this.field6078 = new class296();
        this.field6057 = new class106();
        if (!arg0) {
            this.method2501(78);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 33)
    public final void method2501(int arg0) {
        field6067++;
        if (this.field6063 || arg0 != -2) {
            return;
        }
        synchronized (this) {
            this.field6063 = true;
            this.notifyAll();
        }
        if (this.field6079 != null) {
            while (this.field6079.field8787 == 0) {
                class564.method3300((byte) 118, 1L);
            }
            if (this.field6079.field8787 == 1) {
                try {
                    ((Thread) this.field6079.field8785).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field6079 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(III[B)V", line = 74)
    public final void method2502(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 >= -59) {
            return;
        }
        field6069++;
        if (this.field6063) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field6078.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Ljava/net/Socket;Lwv;)V", line = 324)
    public class425(Socket arg0, class705 arg1) throws IOException {
        this.field6071 = arg0;
        this.field6058 = arg1;
        this.field6071.setSoTimeout(30000);
        this.field6071.setTcpNoDelay(true);
        this.field6078 = this.field6071.getInputStream();
        this.field6057 = this.field6071.getOutputStream();
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(Z)V", line = 109)
    public static void method2503(boolean arg0) {
        field6055 = null;
        field6077 = null;
        field6073 = null;
        if (arg0) {
            method2499(27, -70, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 121)
    public final void method2504(byte arg0) throws IOException {
        field6056++;
        if (arg0 >= 76 && !this.field6063 && this.field6074) {
            this.field6074 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[BII)V", line = 146)
    public final void method2505(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6068++;
        if (this.field6063) {
            return;
        }
        if (this.field6074) {
            this.field6074 = false;
            throw new IOException();
        }
        if (this.field6064 == null) {
            this.field6064 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg2) {
                    if (this.field6079 == null) {
                        this.field6079 = this.field6058.method3968(this, 3, (byte) 13);
                    }
                    this.notifyAll();
                    break;
                }
                this.field6064[this.field6062] = arg1[arg3 + var6];
                this.field6062 = (this.field6062 + 1) % 5000;
                if ((this.field6075 + 4900) % 5000 == this.field6062) {
                    throw new IOException();
                }
                var6++;
            }
        }
        int var7 = -42 / ((26 - arg0) / 48);
    }

    @OriginalMember(owner = "client!faa", name = "finalize", descriptor = "()V", line = 199)
    protected final void finalize() {
        this.method2501(-2);
        field6061++;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)I", line = 220)
    public final int method2506(byte arg0) throws IOException {
        field6070++;
        if (this.field6063) {
            return 0;
        } else {
            if (arg0 >= -55) {
                this.field6074 = false;
            }
            return this.field6078.available();
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)I", line = 240)
    public final int method2507(byte arg0) throws IOException {
        field6060++;
        if (this.field6063) {
            return 0;
        } else {
            int var2 = 110 / ((-arg0 - 16) / 37);
            return this.field6078.read();
        }
    }

    @OriginalMember(owner = "client!faa", name = "run", descriptor = "()V", line = 254)
    public final void run() {
        field6076++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6075 == this.field6062) {
                        if (this.field6063) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field6062 < this.field6075) {
                        var2 = 5000 - this.field6075;
                    } else {
                        var2 = this.field6062 - this.field6075;
                    }
                    var3 = this.field6075;
                }
                if (var2 > 0) {
                    try {
                        this.field6057.write(this.field6064, var3, var2);
                    } catch (IOException var9) {
                        this.field6074 = true;
                    }
                    this.field6075 = (this.field6075 + var2) % 5000;
                    try {
                        if (this.field6075 == this.field6062) {
                            this.field6057.flush();
                        }
                    } catch (IOException var8) {
                        this.field6074 = true;
                    }
                }
            }
            try {
                if (this.field6078 != null) {
                    this.field6078.close();
                }
                if (this.field6057 != null) {
                    this.field6057.close();
                }
                if (this.field6071 != null) {
                    this.field6071.close();
                }
            } catch (IOException var7) {
            }
            this.field6064 = null;
        } catch (Exception var12) {
            class18.method200(null, var12, 10296);
        }
    }
}

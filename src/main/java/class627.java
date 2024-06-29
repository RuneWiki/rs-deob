import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class627 implements Runnable {

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    private int field9022 = 0;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Z")
    private boolean field9018 = false;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    private int field9031 = 0;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Z")
    private boolean field9032 = false;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field9020;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Ltga;")
    private class61 field9021;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field9026;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9033;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    private int field9029;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9039 = new String[] { method4577(method4576("\u0016eT8?")), method4577(method4576("\u0016eT\u0016~\u001fh\u0016\u0019m\u0014!")), method4577(method4576("\u0016eT2?")), method4577(method4576("\u0016eT1?")), method4577(method4576("\u0016eT6?")), method4577(method4576("\u0016eT4?")), method4577(method4576("\u001f|\u0016\u001c")), method4577(method4576("\n'T^j")), method4577(method4576("\u0016eT5?")), method4577(method4576("\u0016eT7?")), method4577(method4576("\u0016eTL~\u001f`\u000eN?")), method4577(method4576("\u0016eT3?")), method4577(method4576("\u0016eT\u0002b\u001f!")) };

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lee;")
    public static class707 field9025 = new class707();

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Luga;")
    private class218 field9023;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "[B")
    private byte[] field9036;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
    public final int method4568(int arg0) throws IOException {
        try {
            field9019++;
            if (arg0 != 31879) {
                this.method4570(-101);
            }
            return this.field9032 ? 0 : this.field9026.available();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9039[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        try {
            this.method4570(0);
            field9038++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9039[1] + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field9027++;
            try {
                while (true) {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field9031 == this.field9022) {
                            if (this.field9032) {
                                break;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var11) {
                            }
                        }
                        if (this.field9022 < this.field9031) {
                            var2 = this.field9029 - this.field9031;
                        } else {
                            var2 = this.field9022 - this.field9031;
                        }
                        var3 = this.field9031;
                    }
                    if (var2 > 0) {
                        try {
                            this.field9033.write(this.field9036, var3, var2);
                        } catch (IOException var10) {
                            this.field9018 = true;
                        }
                        this.field9031 = (this.field9031 + var2) % this.field9029;
                        try {
                            if (this.field9031 == this.field9022) {
                                this.field9033.flush();
                            }
                        } catch (IOException var9) {
                            this.field9018 = true;
                        }
                    }
                }
                try {
                    if (this.field9026 != null) {
                        this.field9026.close();
                    }
                    if (this.field9033 != null) {
                        this.field9033.close();
                    }
                    if (this.field9020 != null) {
                        this.field9020.close();
                    }
                } catch (IOException var8) {
                }
                this.field9036 = null;
            } catch (Exception var13) {
                class622.method4544(var13, null, true);
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field9039[12] + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I[BII)V")
    public final void method4569(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            field9024++;
            if (!this.field9032) {
                if (this.field9018) {
                    this.field9018 = false;
                    throw new IOException();
                }
                if (this.field9036 == null) {
                    this.field9036 = new byte[this.field9029];
                }
                synchronized (this) {
                    for (int var6 = 0; var6 < arg2; var6++) {
                        this.field9036[this.field9022] = arg1[arg0 + var6];
                        this.field9022 = (this.field9022 + 1) % this.field9029;
                        if ((this.field9031 + this.field9029 - 100) % this.field9029 == this.field9022) {
                            throw new IOException();
                        }
                    }
                    if (this.field9023 == null) {
                        this.field9023 = this.field9021.method643(this, 3, 22);
                    }
                    int var7 = 126 % ((-arg3 - 40) / 48);
                    this.notifyAll();
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9039[9] + arg0 + ',' + (arg1 == null ? field9039[6] : field9039[7]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public final void method4570(int arg0) {
        try {
            field9030++;
            if (!this.field9032) {
                synchronized (this) {
                    this.field9032 = true;
                    if (arg0 != 0) {
                        this.method4570(46);
                    }
                    this.notifyAll();
                }
                if (this.field9023 != null) {
                    while (this.field9023.field3402 == 0) {
                        class524.method3918(-4, 1L);
                    }
                    if (this.field9023.field3402 == 1) {
                        try {
                            ((Thread) this.field9023.field3407).join();
                        } catch (InterruptedException var4) {
                        }
                    }
                }
                this.field9023 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9039[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method4571(boolean arg0) {
        try {
            field9025 = null;
            if (!arg0) {
                field9025 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9039[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public final void method4572(byte arg0) throws IOException {
        try {
            field9035++;
            if (!this.field9032) {
                if (this.field9018) {
                    this.field9018 = false;
                    throw new IOException();
                } else if (arg0 < 26) {
                    this.finalize();
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9039[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public final void method4573(int arg0) {
        try {
            if (arg0 != -20471) {
                this.field9026 = null;
            }
            field9034++;
            if (!this.field9032) {
                this.field9026 = new class395();
                this.field9033 = new class234();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9039[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[BII)V")
    public final void method4574(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            field9037++;
            if (!this.field9032) {
                while (arg0 > 0) {
                    int var5 = this.field9026.read(arg1, arg2, arg0);
                    if (var5 <= 0) {
                        throw new EOFException();
                    }
                    arg2 += var5;
                    arg0 -= var5;
                }
                if (arg3 != 0) {
                    this.run();
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9039[8] + arg0 + ',' + (arg1 == null ? field9039[6] : field9039[7]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/net/Socket;Ltga;I)V")
    public class627(Socket arg0, class61 arg1, int arg2) throws IOException {
        try {
            this.field9020 = arg0;
            this.field9021 = arg1;
            this.field9020.setSoTimeout(30000);
            this.field9020.setTcpNoDelay(true);
            this.field9026 = this.field9020.getInputStream();
            this.field9033 = this.field9020.getOutputStream();
            this.field9029 = arg2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9039[10] + (arg0 == null ? field9039[6] : field9039[7]) + ',' + (arg1 == null ? field9039[6] : field9039[7]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
    public final int method4575(int arg0) throws IOException {
        try {
            if (arg0 != 1) {
                this.field9032 = false;
            }
            field9028++;
            return this.field9032 ? 0 : this.field9026.read();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9039[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4576(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4577(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

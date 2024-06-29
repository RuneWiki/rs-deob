import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class43 implements Runnable {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    private int field678 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Z")
    private boolean field684 = false;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Z")
    private boolean field668 = false;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    private int field670 = 0;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lki;")
    private class180 field681;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field675;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field680;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field674;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Lpg;")
    public static class320 field689 = new class320(64);

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field691 = -1;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "[I")
    public static int[] field693 = new int[100];

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field694 = -1;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lsf;")
    private class197 field676;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[B")
    private byte[] field677;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([Ljava/lang/String;BII[S)V", line = 5)
    public static final void method364(String[] arg0, byte arg1, int arg2, int arg3, short[] arg4) {
        if (arg1 < 50) {
            field694 = -72;
        }
        field671++;
        if (arg3 <= arg2) {
            return;
        }
        int var5 = arg2;
        int var6 = (arg2 + arg3) / 2;
        String var7 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var7;
        short var8 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var8;
        for (int var9 = arg2; var9 < arg3; var9++) {
            if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5++] = var11;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var7;
        arg4[arg3] = arg4[var5];
        arg4[var5] = var8;
        method364(arg0, (byte) 87, arg2, var5 - 1, arg4);
        method364(arg0, (byte) 108, var5 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 59)
    public final void method365(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field688++;
        if (this.field684) {
            return;
        }
        synchronized (this) {
            this.field684 = true;
            this.notifyAll();
        }
        if (this.field676 != null) {
            while (this.field676.field2956 == 0) {
                class5.method26(arg0 - 1, 1L);
            }
            if (this.field676.field2956 == 1) {
                try {
                    ((Thread) this.field676.field2959).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field676 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I", line = 97)
    public final int method366(int arg0) throws IOException {
        field686++;
        if (this.field684) {
            return 0;
        } else if (arg0 < 8) {
            return -92;
        } else {
            return this.field680.available();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BII[B)V", line = 117)
    public final void method367(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 < 97) {
            return;
        }
        field690++;
        if (this.field684) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field680.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "finalize", descriptor = "()V", line = 144)
    protected final void finalize() {
        this.method365(1);
        field679++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbf;IZ)V", line = 153)
    public static final void method368(class329 arg0, int arg1, boolean arg2) {
        if (class94.field1516 || arg2) {
            int var3 = class322.field5024;
            int var4 = var3 * 956 / 503;
            class186.field2785.method624((class188.field2816 - var4) / 2, 0, var4, var3);
            class335.field5251.method1210(class188.field2816 / 2 - (class335.field5251.field3972 / 2), 18);
        }
        arg0.method2237(class70.field1135, class188.field2816 / 2, class322.field5024 / 2 - 26, 16777215, -1);
        field685++;
        int var5 = class322.field5024 / 2 - 18;
        if (class94.field1516) {
            class167.method1189(class188.field2816 / 2 - 152, var5, 304, 34, 9179409);
            class167.method1189(class188.field2816 / 2 - 151, var5 + 1, 302, 32, 0);
            class167.method1186(class188.field2816 / 2 - 150, var5 + 2, class289.field4505 * 3, 30, 9179409);
            class167.method1186(class289.field4505 * 3 + class188.field2816 / 2 - 150, var5 + 2, 300 - (class289.field4505 * 3), 30, 0);
        } else {
            class109.method801(class188.field2816 / 2 - 152, var5, 304, 34, 9179409);
            class109.method801(class188.field2816 / 2 - 151, var5 - -1, 302, 32, 0);
            class109.method812(class188.field2816 / 2 - 150, var5 + 2, class289.field4505 * 3, 30, 9179409);
            class109.method812(class289.field4505 * 3 + (class188.field2816 / 2 - 150), var5 + 2, 300 - (class289.field4505 * 3), 30, 0);
        }
        arg0.method2237(class341.field5321, class188.field2816 / 2, class322.field5024 / arg1 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/net/Socket;Lki;)V", line = 450)
    public class43(Socket arg0, class180 arg1) throws IOException {
        this.field681 = arg1;
        this.field675 = arg0;
        this.field675.setSoTimeout(30000);
        this.field675.setTcpNoDelay(true);
        this.field680 = this.field675.getInputStream();
        this.field674 = this.field675.getOutputStream();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 201)
    public final void method369(byte arg0) {
        field673++;
        if (!this.field684 && arg0 == -66) {
            this.field680 = new class230();
            this.field674 = new class324();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[BII)V", line = 217)
    public final void method370(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field687++;
        if (this.field684) {
            return;
        }
        if (this.field668) {
            this.field668 = false;
            throw new IOException();
        }
        if (this.field677 == null) {
            this.field677 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg0 != 1) {
                field691 = 62;
            }
            while (var6 < arg3) {
                this.field677[this.field670] = arg1[arg2 + var6];
                this.field670 = (this.field670 + 1) % 5000;
                if ((this.field678 + 4900) % 5000 == this.field670) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field676 == null) {
                this.field676 = this.field681.method1291(3, 24229, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)Lce;", line = 271)
    public static final class257 method371(int arg0, boolean arg1) {
        class257 var2 = (class257) class30.field438.method2179(false, (long) arg0);
        field667++;
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            return (class257) null;
        } else {
            byte[] var3 = class31.field452.method980(4, arg0, 5);
            class257 var4 = new class257();
            if (var3 != null) {
                var4.method1763(arg0, 0, new class166(var3));
            }
            class30.field438.method2173(var4, true, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V", line = 300)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field678 == this.field670) {
                                if (this.field684) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field678;
                            if (this.field670 < this.field678) {
                                var4 = 5000 - this.field678;
                            } else {
                                var4 = this.field670 - this.field678;
                            }
                            break label88;
                        }
                    }
                    try {
                        if (this.field680 != null) {
                            this.field680.close();
                        }
                        if (this.field674 != null) {
                            this.field674.close();
                        }
                        if (this.field675 != null) {
                            this.field675.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field677 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field674.write(this.field677, var3, var4);
                    } catch (IOException var12) {
                        this.field668 = true;
                    }
                    this.field678 = (this.field678 + var4) % 5000;
                    try {
                        if (this.field678 == this.field670) {
                            this.field674.flush();
                        }
                    } catch (IOException var11) {
                        this.field668 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class184.method1322(var15, (String) null, (byte) -24);
        }
        field682++;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 369)
    public final void method372(int arg0) throws IOException {
        field683++;
        if (this.field684) {
            return;
        }
        if (this.field668) {
            this.field668 = false;
            throw new IOException();
        } else if (arg0 != 2) {
            method364((String[]) null, (byte) -18, -24, -110, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I", line = 401)
    public final int method373(int arg0) throws IOException {
        field669++;
        if (this.field684) {
            return 0;
        } else if (arg0 >= -64) {
            return 25;
        } else {
            return this.field680.read();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ll;II)Lgm;", line = 419)
    public static final class249 method374(class133 arg0, int arg1, int arg2) {
        field672++;
        if (arg1 == 3) {
            return class125.method907(arg0, arg1 ^ 0xFFFFECA7, arg2) ? class186.method1334((byte) 18) : null;
        } else {
            return (class249) null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 441)
    public static void method375(byte arg0) {
        field689 = null;
        if (arg0 == -107) {
            field693 = null;
        }
    }
}

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class447 {

    @OriginalMember(owner = "client!ika", name = "e", descriptor = "J")
    private long field6548 = -1L;

    @OriginalMember(owner = "client!ika", name = "B", descriptor = "J")
    private long field6566 = -1L;

    @OriginalMember(owner = "client!ika", name = "i", descriptor = "I")
    private int field6569 = 0;

    @OriginalMember(owner = "client!ika", name = "D", descriptor = "Lqb;")
    private class236 field6550;

    @OriginalMember(owner = "client!ika", name = "p", descriptor = "J")
    private long field6562;

    @OriginalMember(owner = "client!ika", name = "n", descriptor = "J")
    private long field6565;

    @OriginalMember(owner = "client!ika", name = "v", descriptor = "[B")
    private byte[] field6556;

    @OriginalMember(owner = "client!ika", name = "o", descriptor = "[B")
    private byte[] field6558;

    @OriginalMember(owner = "client!ika", name = "g", descriptor = "J")
    private long field6552;

    @OriginalMember(owner = "client!ika", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field6578 = new String[] { method3445(method3444("w\\{9\u0017WV-+\u001e[Y-,\u0014\u001e")), method3445(method3444("WYlv7\u0016")), method3445(method3444("\u001e[cx\u001dW^hx")), method3445(method3444("WYlv>\u0016")), method3445(method3444("PGa4")), method3445(method3444("E\u001c#v\u0006")), method3445(method3444("WYlv2\u0016")), method3445(method3444("WYlv3\u0016")), method3445(method3444("WYlv1\u0016")), method3445(method3444("WYlv6\u0016")), method3445(method3444("WYlv<\u0016")), method3445(method3444("WYlv?\u0016")), method3445(method3444("WYlv8\u0016")), method3445(method3444("WYlvGW\\d,E\u0016")), method3445(method3444("WYlv0\u0016")), method3445(method3444("WYlv:\u0016")), method3445(method3444("WYlv9\u0016")), method3445(method3444("WYlv=\u0016")) };

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "Lel;")
    public static class573 field6564 = new class573(58, 7);

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "[S")
    public static short[] field6572 = new short[256];

    @OriginalMember(owner = "client!ika", name = "r", descriptor = "Lel;")
    public static class573 field6568 = new class573(2, 1);

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "[F")
    public static float[] field6575 = new float[16384];

    @OriginalMember(owner = "client!ika", name = "l", descriptor = "[F")
    public static float[] field6574 = new float[16384];

    @OriginalMember(owner = "client!ika", name = "A", descriptor = "Lto;")
    public static class8 field6576 = null;

    @OriginalMember(owner = "client!ika", name = "u", descriptor = "Lel;")
    public static class573 field6577;

    @OriginalMember(owner = "client!ika", name = "m", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!ika", name = "C", descriptor = "I")
    private int field6551;

    @OriginalMember(owner = "client!ika", name = "w", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!ika", name = "t", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!ika", name = "j", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!ika", name = "q", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!ika", name = "x", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!ika", name = "k", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!ika", name = "f", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!ika", name = "y", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!ika", name = "s", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!ika", name = "h", descriptor = "J")
    private long field6557;

    @OriginalMember(owner = "client!ika", name = "e", descriptor = "(I)V")
    public final void method3431(int arg0) throws IOException {
        try {
            this.method3439(arg0);
            field6555++;
            this.field6550.method2011(-2968);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6578[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)V")
    public static void method3432(int arg0) {
        try {
            field6572 = null;
            field6575 = null;
            field6577 = null;
            field6576 = null;
            field6574 = null;
            field6568 = null;
            if (arg0 != 2) {
                method3441(-5, (byte) 99, 36);
            }
            field6564 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6578[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)V")
    private final void method3433(int arg0) throws IOException {
        try {
            this.field6551 = 0;
            field6561++;
            if (this.field6557 != this.field6552) {
                this.field6550.method2017(1, this.field6552);
                this.field6557 = this.field6552;
            }
            int var2 = 77 % ((arg0 + 40) / 48);
            this.field6566 = this.field6552;
            while (this.field6556.length > this.field6551) {
                int var3 = this.field6556.length - this.field6551;
                if (var3 > 200000000) {
                    var3 = 200000000;
                }
                int var4 = this.field6550.method2013(var3, this.field6556, true, this.field6551);
                if (var4 == -1) {
                    break;
                }
                this.field6557 += var4;
                this.field6551 += var4;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6578[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I[B)V")
    public final void method3434(int arg0, byte[] arg1) throws IOException {
        try {
            this.method3443(0, arg1.length, 82, arg1);
            field6549++;
            if (arg0 != -1) {
                method3435(-83, 72, -97, -102);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6578[12] + arg0 + ',' + (arg1 == null ? field6578[4] : field6578[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(IIII)V")
    public static final void method3435(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var7 = arg2 << 3;
            int var6 = arg1 << arg0;
            field6567++;
            int var8 = arg3 << 3;
            class377.field5748 = var7;
            class98.field1099 = var6;
            if (class185.field2559 == 2) {
                class320.field5061 = var6;
                class684.field9916 = var8;
                class93.field1052 = var7;
            }
            class521.method3958(-16402);
            class597.field8773 = true;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6578[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method3436(int arg0) {
        try {
            field6554++;
            return arg0 > -48 ? null : this.field6550.method2016(127);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6578[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIII)I")
    public static final int method3437(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg3 <= 35) {
                return -116;
            } else {
                field6570++;
                int var4 = 255 - arg2;
                int var7 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
                return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var7;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6578[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(JB)V")
    public final void method3438(long arg0, byte arg1) throws IOException {
        try {
            field6563++;
            if (arg0 < 0L) {
                throw new IOException(field6578[0] + arg0 + field6578[2] + this.method3436(-117));
            }
            this.field6552 = arg0;
            if (arg1 < 33) {
                this.method3436(-2);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6578[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "(I)V")
    private final void method3439(int arg0) throws IOException {
        try {
            field6571++;
            if ((long) arg0 != this.field6548) {
                if (this.field6557 != this.field6548) {
                    this.field6550.method2017(arg0 + 2, this.field6548);
                    this.field6557 = this.field6548;
                }
                this.field6550.method2012(0, this.field6558, arg0 + 2, this.field6569);
                this.field6557 += this.field6569;
                if (this.field6557 > this.field6562) {
                    this.field6562 = this.field6557;
                }
                long var2 = -1L;
                if (this.field6548 >= this.field6566 && this.field6548 < (long) this.field6551 + this.field6566) {
                    var2 = this.field6548;
                } else if (this.field6548 <= this.field6566 && ((long) this.field6569 + this.field6548) > this.field6566) {
                    var2 = this.field6566;
                }
                long var4 = -1L;
                if (this.field6548 + ((long) this.field6569) > this.field6566 && ((long) this.field6551 + this.field6566) >= ((long) this.field6569 + this.field6548)) {
                    var4 = (long) this.field6569 + this.field6548;
                } else if (this.field6548 < (this.field6566 + ((long) this.field6551)) && (long) this.field6551 + this.field6566 <= (long) this.field6569 + this.field6548) {
                    var4 = this.field6566 + ((long) this.field6551);
                }
                if (var2 > -1L && var4 > var2) {
                    int var6 = (int) (var4 - var2);
                    class467.method3556(this.field6558, (int) (var2 - this.field6548), this.field6556, (int) (var2 - this.field6566), var6);
                }
                this.field6569 = 0;
                this.field6548 = -1L;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6578[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(IB[BI)V")
    public final void method3440(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        try {
            field6559++;
            try {
                if (this.field6565 < (long) arg3 + this.field6552) {
                    this.field6565 = (long) arg3 + this.field6552;
                }
                if (this.field6548 != -1L && (this.field6552 < this.field6548 || (long) this.field6569 + this.field6548 < this.field6552)) {
                    this.method3439(-1);
                }
                if (this.field6548 != -1L && this.field6552 + ((long) arg3) > this.field6548 - -((long) this.field6558.length)) {
                    int var5 = (int) (-this.field6552 - (-this.field6548 - (long) this.field6558.length));
                    class467.method3556(arg2, arg0, this.field6558, (int) (this.field6552 - this.field6548), var5);
                    arg3 -= var5;
                    this.field6552 += var5;
                    arg0 += var5;
                    this.field6569 = this.field6558.length;
                    this.method3439(-1);
                }
                if (arg3 > this.field6558.length) {
                    if (this.field6557 != this.field6552) {
                        this.field6550.method2017(1, this.field6552);
                        this.field6557 = this.field6552;
                    }
                    this.field6550.method2012(arg0, arg2, 1, arg3);
                    this.field6557 += arg3;
                    if (this.field6562 < this.field6557) {
                        this.field6562 = this.field6557;
                    }
                    long var6 = -1L;
                    if (this.field6566 <= this.field6552 && this.field6552 < ((long) this.field6551 + this.field6566)) {
                        var6 = this.field6552;
                    } else if (this.field6552 <= this.field6566 && this.field6552 + ((long) arg3) > this.field6566) {
                        var6 = this.field6566;
                    }
                    long var8 = -1L;
                    if ((long) arg3 + this.field6552 > this.field6566 && (long) arg3 + this.field6552 <= (long) this.field6551 + this.field6566) {
                        var8 = (long) arg3 + this.field6552;
                    } else if (this.field6552 < (long) this.field6551 + this.field6566 && (long) arg3 + this.field6552 >= (long) this.field6551 + this.field6566) {
                        var8 = (long) this.field6551 + this.field6566;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class467.method3556(arg2, (int) ((long) arg0 + var6 - this.field6552), this.field6556, (int) (var6 - this.field6566), var10);
                    }
                    this.field6552 += arg3;
                } else if (arg3 > 0) {
                    if (this.field6548 == -1L) {
                        this.field6548 = this.field6552;
                    }
                    class467.method3556(arg2, arg0, this.field6558, (int) (this.field6552 - this.field6548), arg3);
                    this.field6552 += arg3;
                    if (((long) this.field6569) < (this.field6552 - this.field6548)) {
                        this.field6569 = (int) (this.field6552 - this.field6548);
                    }
                } else {
                    int var11 = -14 / ((83 - arg1) / 34);
                }
            } catch (IOException var14) {
                this.field6557 = -1L;
                throw var14;
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field6578[17] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6578[4] : field6578[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3441(int arg0, byte arg1, int arg2) {
        try {
            field6553++;
            if (arg1 >= -59) {
                return true;
            } else {
                return (arg0 & 0x70000) != 0 | class561.method4191(arg2, true, arg0) || class318.method2690((byte) 79, arg0, arg2);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6578[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)J")
    public final long method3442(byte arg0) {
        try {
            field6573++;
            int var2 = -13 / ((41 - arg0) / 53);
            return this.field6565;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6578[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(III[B)V")
    public final void method3443(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            field6560++;
            try {
                if (arg0 + arg1 > arg3.length) {
                    throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
                }
                if (arg2 <= 49) {
                    field6564 = null;
                }
                if (this.field6548 != -1L && this.field6552 >= this.field6548 && (this.field6548 + ((long) this.field6569)) >= (this.field6552 + ((long) arg1))) {
                    class467.method3556(this.field6558, (int) (this.field6552 - this.field6548), arg3, arg0, arg1);
                    this.field6552 += arg1;
                    return;
                }
                long var5 = this.field6552;
                int var7 = arg0;
                int var8 = arg1;
                if (this.field6552 >= this.field6566 && (this.field6566 + ((long) this.field6551)) > this.field6552) {
                    int var9 = (int) ((long) this.field6551 + this.field6566 - this.field6552);
                    if (var9 > arg1) {
                        var9 = arg1;
                    }
                    class467.method3556(this.field6556, (int) (this.field6552 - this.field6566), arg3, arg0, var9);
                    arg1 -= var9;
                    arg0 += var9;
                    this.field6552 += var9;
                }
                if (this.field6556.length < arg1) {
                    this.field6550.method2017(1, this.field6552);
                    this.field6557 = this.field6552;
                    while (arg1 > 0) {
                        int var10 = this.field6550.method2013(arg1, arg3, true, arg0);
                        if (var10 == -1) {
                            break;
                        }
                        arg0 += var10;
                        this.field6552 += var10;
                        this.field6557 += var10;
                        arg1 -= var10;
                    }
                } else if (arg1 > 0) {
                    this.method3433(-112);
                    int var11 = arg1;
                    if (arg1 > this.field6551) {
                        var11 = this.field6551;
                    }
                    class467.method3556(this.field6556, 0, arg3, arg0, var11);
                    arg1 -= var11;
                    arg0 += var11;
                    this.field6552 += var11;
                }
                if (this.field6548 != -1L) {
                    if (this.field6552 < this.field6548 && arg1 > 0) {
                        int var12 = (int) (this.field6548 - this.field6552) + arg0;
                        if ((arg0 + arg1) < var12) {
                            var12 = arg0 + arg1;
                        }
                        while (var12 > arg0) {
                            arg1--;
                            arg3[arg0++] = 0;
                            this.field6552++;
                        }
                    }
                    long var13 = -1L;
                    long var15 = -1L;
                    if (var5 <= this.field6548 && ((long) var8 + var5) > this.field6548) {
                        var13 = this.field6548;
                    } else if (var5 >= this.field6548 && (long) this.field6569 + this.field6548 > var5) {
                        var13 = var5;
                    }
                    if (this.field6548 + ((long) this.field6569) > var5 && var5 + ((long) var8) >= (long) this.field6569 + this.field6548) {
                        var15 = (long) this.field6569 + this.field6548;
                    } else if ((long) var8 + var5 > this.field6548 && (long) this.field6569 + this.field6548 >= (long) var8 + var5) {
                        var15 = var5 + ((long) var8);
                    }
                    if (var13 > -1L && var13 < var15) {
                        int var17 = (int) (var15 - var13);
                        class467.method3556(this.field6558, (int) (var13 - this.field6548), arg3, (int) (var13 - var5) + var7, var17);
                        if (var15 > this.field6552) {
                            arg1 = (int) ((long) arg1 - (var15 - this.field6552));
                            this.field6552 = var15;
                        }
                    }
                }
            } catch (IOException var20) {
                this.field6557 = -1L;
                throw var20;
            }
            if (arg1 > 0) {
                throw new EOFException();
            }
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field6578[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6578[4] : field6578[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lqb;II)V")
    public class447(class236 arg0, int arg1, int arg2) throws IOException {
        try {
            this.field6550 = arg0;
            this.field6565 = this.field6562 = arg0.method2014((byte) 93);
            this.field6556 = new byte[arg1];
            this.field6558 = new byte[arg2];
            this.field6552 = 0L;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6578[13] + (arg0 == null ? field6578[4] : field6578[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6574[var2] = (float) Math.sin((double) var2 * var0);
            field6575[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6577 = new class573(42, -2);
    }

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3444(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3445(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

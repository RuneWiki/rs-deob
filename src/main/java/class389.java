import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class389 {

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "[[I")
    private int[][] field5672;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    private int field5663;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    private int field5668;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5674 = new String[] { method3051(method3050("\t@b@")), method3051(method3050("\u0010E h\u0002")), method3051(method3050("\u001c\u001b \u0002W")), method3051(method3050("\u0010E n\u0002")), method3051(method3050("\u0010E \u0010C\t\\z\u0012\u0002")), method3051(method3050("\u0010E o\u0002")), method3051(method3050("\u0010E i\u0002")), method3051(method3050("\u0010E m\u0002")) };

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
    public static boolean field5673 = false;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "J")
    public static long field5666;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lvk;BLvk;)V", line = 4)
    public static final void method3045(class651 arg0, byte arg1, class651 arg2) {
        try {
            if (arg2.field9253 != null) {
                arg2.method4736(0);
            }
            field5671++;
            arg2.field9248 = arg0;
            if (arg1 == 105) {
                arg2.field9253 = arg0.field9253;
                arg2.field9253.field9248 = arg2;
                arg2.field9248.field9253 = arg2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5674[5] + (arg0 == null ? field5674[0] : field5674[2]) + ',' + arg1 + ',' + (arg2 == null ? field5674[0] : field5674[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)I", line = 23)
    public final int method3046(byte arg0, int arg1) {
        try {
            field5664++;
            if (this.field5672 != null) {
                arg1 = (int) ((long) this.field5668 * (long) arg1 / (long) this.field5663) + 6;
            }
            return arg0 <= 108 ? -119 : arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5674[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[S)[S", line = 44)
    public final short[] method3047(int arg0, short[] arg1) {
        try {
            field5669++;
            if (arg0 != 0) {
                this.method3048(-112, -27);
            }
            if (this.field5672 != null) {
                int var3 = (int) ((long) arg1.length * (long) this.field5668 / (long) this.field5663) + 14;
                int[] var4 = new int[var3];
                int var5 = 0;
                int var6 = 0;
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    short var8 = arg1[var7];
                    int[] var9 = this.field5672[var6];
                    for (int var10 = 0; var10 < 14; var10++) {
                        var4[var5 + var10] += var9[var10] * var8 >> 2;
                    }
                    int var11 = this.field5668 + var6;
                    int var12 = var11 / this.field5663;
                    var5 += var12;
                    var6 = var11 - this.field5663 * var12;
                }
                arg1 = new short[var3];
                for (int var13 = 0; var13 < var3; var13++) {
                    int var14 = var4[var13] + 8192 >> 14;
                    if (var14 < -32768) {
                        arg1[var13] = -32768;
                    } else if (var14 <= 32767) {
                        arg1[var13] = (short) var14;
                    } else {
                        arg1[var13] = 32767;
                    }
                }
            }
            return arg1;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field5674[3] + arg0 + ',' + (arg1 == null ? field5674[0] : field5674[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)I", line = 113)
    public final int method3048(int arg0, int arg1) {
        try {
            if (this.field5672 != null) {
                arg0 = (int) ((long) this.field5668 * (long) arg0 / (long) this.field5663);
            }
            field5665++;
            if (arg1 != -23722) {
                method3045(null, (byte) -12, null);
            }
            return arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5674[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[B)[B", line = 128)
    public final byte[] method3049(int arg0, byte[] arg1) {
        try {
            if (this.field5672 != null) {
                int var3 = (int) ((long) arg1.length * (long) this.field5668 / (long) this.field5663) + 14;
                int[] var4 = new int[var3];
                int var5 = 0;
                int var6 = 0;
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    byte var8 = arg1[var7];
                    int[] var9 = this.field5672[var6];
                    for (int var10 = 0; var10 < 14; var10++) {
                        var4[var5 + var10] += var9[var10] * var8;
                    }
                    int var11 = this.field5668 + var6;
                    int var12 = var11 / this.field5663;
                    var5 += var12;
                    var6 = var11 - this.field5663 * var12;
                }
                arg1 = new byte[var3];
                for (int var13 = 0; var13 < var3; var13++) {
                    int var14 = var4[var13] + 32768 >> 16;
                    if (var14 < -128) {
                        arg1[var13] = -128;
                    } else if (var14 > 127) {
                        arg1[var13] = 127;
                    } else {
                        arg1[var13] = (byte) var14;
                    }
                }
            }
            if (arg0 <= 69) {
                this.method3048(112, -63);
            }
            field5667++;
            return arg1;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field5674[1] + arg0 + ',' + (arg1 == null ? field5674[0] : field5674[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V", line = 199)
    public class389(int arg0, int arg1) {
        try {
            if (arg0 != arg1) {
                int var3 = class558.method4174(123, arg1, arg0);
                int var20 = arg0 / var3;
                int var21 = arg1 / var3;
                this.field5672 = new int[var20][14];
                this.field5663 = var20;
                this.field5668 = var21;
                for (int var4 = 0; var4 < var20; var4++) {
                    int[] var5 = this.field5672[var4];
                    double var6 = (double) var4 / (double) var20 + 6.0D;
                    int var8 = (int) Math.floor(var6 + 1.0D - 7.0D);
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = (int) Math.ceil(var6 + 7.0D);
                    if (var9 > 14) {
                        var9 = 14;
                    }
                    double var10 = (double) var21 / (double) var20;
                    while (var8 < var9) {
                        double var12 = ((double) var8 - var6) * 3.141592653589793D;
                        double var14 = var10;
                        if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
                            var14 = var10 * (Math.sin(var12) / var12);
                        }
                        double var16 = var14 * (Math.cos(((double) var8 - var6) * 0.2243994752564138D) * 0.46D + 0.54D);
                        var5[var8] = (int) Math.floor(var16 * 65536.0D + 0.5D);
                        var8++;
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field5674[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3050(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3051(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

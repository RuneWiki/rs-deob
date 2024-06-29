import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class318 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    private int field5474;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    private int field5468;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[[I")
    private int[][] field5467;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lke;")
    public static class256 field5472 = class316.method2202("niveau ", 27626);

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "J")
    public static long field5473 = 0L;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lke;")
    public static class256 field5477 = class316.method2202("Chargement en cours)3 Veuillez patienter)3", 27626);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)V", line = 13)
    public static final void method2209(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 82 % ((arg3 - 40) / 52);
        class77 var5 = class156.method1158(4, false, arg1);
        var5.method584(22992);
        var5.field1455 = arg0;
        var5.field1459 = arg2;
        field5466++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([BB)[B", line = 40)
    public final byte[] method2210(byte[] arg0, byte arg1) {
        if (this.field5467 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5474 / (long) this.field5468) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field5467[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field5474 + var6;
                int var12 = var11 / this.field5468;
                var5 += var12;
                var6 = var11 - this.field5468 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        if (arg1 < 56) {
            field5475 = 2;
        }
        field5476++;
        return arg0;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(II)V", line = 112)
    public class318(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class164.method1206(arg0, arg1, 28720);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5474 = var5;
            this.field5468 = var4;
            this.field5467 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5467[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)I", line = 175)
    public final int method2211(byte arg0, int arg1) {
        if (arg0 > -5) {
            field5477 = (class256) null;
        }
        if (this.field5467 != null) {
            arg1 = (int) ((long) this.field5474 * (long) arg1 / (long) this.field5468);
        }
        field5478++;
        return arg1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 195)
    public static void method2212(int arg0) {
        field5477 = null;
        if (arg0 != 23345) {
            method2213(-117, -33, -125, (byte) -101, -68, 63);
        }
        field5472 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIBII)V", line = 208)
    public static final void method2213(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5471++;
        int var6 = arg5 - arg2;
        int var7 = arg1 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class38.method295(arg5, arg2, arg0, -1, arg4);
            }
        } else if (var6 == 0) {
            class231.method1566(arg1, (byte) 78, arg4, arg2, arg0);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            int var8 = -118 % ((-arg3 - 63) / 48);
            boolean var9 = var7 < var6;
            if (var9) {
                int var10 = arg4;
                arg4 = arg2;
                arg2 = var10;
                int var11 = arg1;
                arg1 = arg5;
                arg5 = var11;
            }
            if (arg1 < arg4) {
                int var12 = arg2;
                int var13 = arg4;
                arg2 = arg5;
                arg5 = var12;
                arg4 = arg1;
                arg1 = var13;
            }
            int var14 = arg1 - arg4;
            int var15 = arg2;
            int var16 = arg5 - arg2;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = -(var14 >> 1);
            int var18 = arg5 > arg2 ? 1 : -1;
            if (var9) {
                for (int var20 = arg4; var20 <= arg1; var20++) {
                    var17 += var16;
                    class308.field5329[var20][var15] = arg0;
                    if (var17 > 0) {
                        var15 += var18;
                        var17 -= var14;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg1; var19++) {
                    var17 += var16;
                    class308.field5329[var15][var19] = arg0;
                    if (var17 > 0) {
                        var17 -= var14;
                        var15 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)I", line = 328)
    public final int method2214(boolean arg0, int arg1) {
        if (arg0) {
            field5472 = (class256) null;
        }
        if (this.field5467 != null) {
            arg1 = ((int) ((long) this.field5474 * (long) arg1 / (long) this.field5468)) + 6;
        }
        field5470++;
        return arg1;
    }
}

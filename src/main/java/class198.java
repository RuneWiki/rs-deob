import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class198 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "[[I")
    private int[][] field3604;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Z")
    public static boolean field3599 = false;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lcf;")
    public static class93 field3597 = class147.method1066("classement ", -48);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
    public static int[] field3607;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static void method1419(boolean arg0) {
        field3597 = null;
        if (!arg0) {
            field3597 = null;
        }
        field3607 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    public final int method1420(int arg0, int arg1) {
        if (arg1 != -15) {
            this.method1421((byte) 118, (byte[]) null);
        }
        field3596++;
        if (this.field3604 != null) {
            arg0 = (int) ((long) this.field3595 * (long) arg0 / (long) this.field3601) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1421(byte arg0, byte[] arg1) {
        if (arg0 != -33) {
            field3597 = null;
        }
        if (this.field3604 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3595 / (long) this.field3601) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3604[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3595 + var6;
                int var14 = var13 / this.field3601;
                var5 += var14;
                var6 = var13 - this.field3601 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field3598++;
        return arg1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3605++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg1 - arg6;
        int var12 = arg4 - arg6;
        int var13 = arg4 * arg4;
        int var14 = arg1 * arg1;
        int var15 = var14 << 1;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var12 << 1;
        int var19 = var16 << 1;
        int var20 = var12 * var12;
        int var21 = arg4 << 1;
        int var22 = var20 << 1;
        int var23 = (1 - var21) * var14 + var17;
        int var24 = var13 - ((var21 - 1) * var15);
        int var25 = (1 - var18) * var16 + var22;
        if (arg5 < 120) {
            field3597 = null;
        }
        int var26 = var20 - ((var18 - 1) * var19);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var20 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var15;
        int var33 = var27;
        int var34 = (var18 - 3) * var19;
        int var35 = var22 * 3;
        int var36 = var30;
        int var37 = (var12 - 1) * var29;
        int[] var38 = class76.field1406[arg2];
        int var39 = (arg4 - 1) * var28;
        class58.method337(arg7 - arg1, var38, arg0, arg7 - var11, false);
        class58.method337(arg7 - var11, var38, arg3, arg7 + var11, false);
        class58.method337(arg7 + var11, var38, arg0, arg1 + arg7, false);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var24 += var33;
                    var23 += var31;
                    var31 += var27;
                    var33 += var27;
                }
            }
            if (var24 < 0) {
                var24 += var33;
                var33 += var27;
                var8++;
                var23 += var31;
                var31 += var27;
            }
            var24 += -var32;
            var32 -= var28;
            boolean var40 = var12 >= var9;
            var23 += -var39;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var35;
                        var26 += var36;
                        var35 += var30;
                        var10++;
                        var36 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var35;
                    var35 += var30;
                    var26 += var36;
                    var36 += var30;
                    var10++;
                }
                var26 += -var34;
                var34 -= var29;
                var25 += -var37;
                var37 -= var29;
            }
            var39 -= var28;
            var9--;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class58.method337(var44, class76.field1406[var41], arg0, var46, false);
                class58.method337(var46, class76.field1406[var41], arg3, var45, false);
                class58.method337(var45, class76.field1406[var41], arg0, var43, false);
                class58.method337(var44, class76.field1406[var42], arg0, var46, false);
                class58.method337(var46, class76.field1406[var42], arg3, var45, false);
                class58.method337(var45, class76.field1406[var42], arg0, var43, false);
            } else {
                class58.method337(var44, class76.field1406[var41], arg0, var43, false);
                class58.method337(var44, class76.field1406[var42], arg0, var43, false);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1423(byte arg0, String arg1) {
        if (arg0 >= 112) {
            System.out.println("Error: " + class125.method916(0, arg1, "\n", "%0a"));
            field3606++;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)I")
    public final int method1424(int arg0, int arg1) {
        if (this.field3604 != null) {
            arg1 = (int) ((long) this.field3595 * (long) arg1 / (long) this.field3601);
        }
        if (arg0 == 14) {
            field3603++;
            return arg1;
        } else {
            return -73;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
    public class198(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class165.method1197(28, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3595 = var4;
            this.field3604 = new int[var5][14];
            this.field3601 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3604[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}

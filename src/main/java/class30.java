import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class30 extends class55 {

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "[I")
    private int[] field370;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "[I")
    private int[] field367;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Lmj;")
    private class144 field359;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Lmj;")
    private class144 field356;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Lmj;")
    private class144 field363;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "[Lmj;")
    private class144[] field368;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "Z")
    public static boolean field364 = false;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Lbc;")
    public static class282 field360;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IDILbc;IZLee;Z)[I")
    public final int[] method179(int arg0, double arg1, int arg2, class282 arg3, int arg4, boolean arg5, class69 arg6, boolean arg7) {
        field372++;
        class150.method987(arg1, -122);
        class238.field3434 = arg3;
        class60.field720 = arg6;
        int[] var10 = new int[arg2 * arg4];
        if (arg0 > -24) {
            this.method182(false, -0.9130071528965609D, 33, (class282) null, (class69) null, 23, -88);
        }
        class80.method480(arg4, 125, arg2);
        for (int var11 = 0; var11 < this.field368.length; var11++) {
            this.field368[var11].method933(90, arg4, arg2);
        }
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var12 = -1;
            var13 = arg2 - 1;
            var14 = -1;
        } else {
            var12 = arg2;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field356.field2059) {
                int[] var18 = this.field356.method12(var16, 255);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field356.method8((byte) 5, var16);
                var21 = var22[2];
                var19 = var22[0];
                var20 = var22[1];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var21[var23] >> 4;
                int var25 = var20[var23] >> 4;
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var27 = class72.field868[var26];
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class72.field868[var24];
                int var29 = class72.field868[var25];
                var10[var15++] = (var27 << 16) + (var29 << 8) + var28;
                if (arg7) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field368.length; var17++) {
            this.field368[var17].method23(23025);
        }
        return var10;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIZII)V")
    public static final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field357++;
        int var10 = arg9 - arg4;
        if (arg2 == -30650) {
            int var11 = arg1 - arg8;
            int var12 = (arg6 - arg5 << 16) / var10;
            int var13 = (arg0 - arg3 << 16) / var11;
            class245.method1586(arg2 ^ 0x77B9, arg7, 0, arg8, arg1, arg5, arg4, 0, var13, arg9, var12, arg3);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)Lmc;")
    public static final class176 method181(byte arg0) {
        field361++;
        if (arg0 <= 92) {
            method183(-73);
        }
        class285.field4400 = 0;
        return class163.method1074(0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZDILbc;Lee;II)Lo;")
    public final class201 method182(boolean arg0, double arg1, int arg2, class282 arg3, class69 arg4, int arg5, int arg6) {
        field355++;
        class150.method987(arg1, -124);
        class238.field3434 = arg3;
        class60.field720 = arg4;
        class80.method480(arg6, 121, arg5);
        class201 var9 = new class201(arg5, arg6);
        for (int var10 = 0; var10 < this.field368.length; var10++) {
            this.field368[var10].method933(120, arg6, arg5);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field356.field2059) {
                int[] var18 = this.field356.method12(var12, 255);
                var16 = var18;
                var17 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field356.method8((byte) 5, var12);
                var15 = var14[2];
                var16 = var14[1];
                var17 = var14[0];
            }
            int[] var19;
            if (this.field363.field2059) {
                var19 = this.field363.method12(var12, 255);
            } else {
                var19 = this.field363.method8((byte) 5, var12)[0];
            }
            if (arg0) {
                var11 = var12 << 2;
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var20] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class72.field868[var21];
                int var24 = var15[var20] >> 4;
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class72.field868[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class72.field868[var24];
                int var27;
                if (var23 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field2691[var11++] = (var23 << 16) + ((var27 << 24) + (var25 << 8)) + var26;
                if (arg0) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field368.length; var13++) {
            this.field368[var13].method23(23025);
        }
        if (arg2 >= -13) {
            this.method187((class69) null, 120, -112, (class282) null, 28, 0.8160724911079651D, true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static void method183(int arg0) {
        field360 = null;
        if (arg0 != -1) {
            field369 = 107;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field358++;
        class206 var10 = (class206) class51.field578.method1532(-76);
        class206 var11 = null;
        while (var10 != null) {
            if (var10.field2918 == arg2 && var10.field2925 == arg3 && var10.field2924 == arg7 && var10.field2934 == arg4) {
                var11 = var10;
                break;
            }
            var10 = (class206) class51.field578.method1523(-105);
        }
        if (var11 == null) {
            var11 = new class206();
            var11.field2918 = arg2;
            var11.field2924 = arg7;
            var11.field2925 = arg3;
            var11.field2934 = arg4;
            class48.method293((byte) 108, var11);
            class51.field578.method1522(var11, arg6 ^ 0x1A);
        }
        var11.field2927 = arg0;
        var11.field2923 = arg5;
        var11.field2933 = arg9;
        if (arg6 != -111) {
            field369 = 108;
        }
        var11.field2930 = arg8;
        var11.field2932 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;III)Llj;")
    public static final class24 method185(Component arg0, int arg1, int arg2, int arg3) {
        field371++;
        if (arg1 != -256) {
            return null;
        }
        try {
            Class var4 = Class.forName("ne");
            class24 var5 = (class24) var4.getDeclaredConstructor().newInstance();
            var5.method150(arg3, arg2, arg0, arg1 + 10828);
            return var5;
        } catch (Throwable var7) {
            class291 var6 = new class291();
            var6.method150(arg3, arg2, arg0, arg1 + 10828);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLee;Lbc;)Z")
    public final boolean method186(byte arg0, class69 arg1, class282 arg2) {
        field362++;
        if (class93.field1249 <= 0) {
            for (int var4 = 0; var4 < this.field370.length; var4++) {
                if (!arg2.method1842(this.field370[var4], -5012)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field370.length; var5++) {
                if (!arg2.method1870((byte) -86, class93.field1249, this.field370[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field367.length; var6++) {
            if (!arg1.method418(arg0 ^ 0xFFFFFFC7, this.field367[var6])) {
                return false;
            }
        }
        if (arg0 != -67) {
            this.field368 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lee;IILbc;IDZ)Lpg;")
    public final class187 method187(class69 arg0, int arg1, int arg2, class282 arg3, int arg4, double arg5, boolean arg6) {
        class150.method987(arg5, -114);
        class60.field720 = arg0;
        field365++;
        class238.field3434 = arg3;
        class80.method480(arg1, 126, arg2);
        class187 var9 = new class187(arg2, arg1);
        int var10 = 0;
        int var11 = 33 / ((-arg4 - 7) / 34);
        while (this.field368.length > var10) {
            this.field368[var10].method933(102, arg1, arg2);
            var10++;
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg1; var13++) {
            if (arg6) {
                var12 = var13;
            }
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field356.field2059) {
                int[] var19 = this.field356.method12(var13, 255);
                var16 = var19;
                var18 = var19;
                var17 = var19;
            } else {
                int[][] var15 = this.field356.method8((byte) 5, var13);
                var16 = var15[0];
                var17 = var15[2];
                var18 = var15[1];
            }
            for (int var20 = 0; var20 != arg2; var20++) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var18[var20] >> 4;
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class72.field868[var22];
                int var25 = class72.field868[var21];
                int var26 = class72.field868[var23];
                var9.field2691[var12++] = (var24 << 8) + (var25 << 16) + var26;
                if (arg6) {
                    var12 += arg2 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field368.length; var14++) {
            this.field368[var14].method23(23025);
        }
        return var9;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class30() {
        this.field370 = new int[0];
        this.field367 = new int[0];
        this.field359 = new class188(0);
        this.field359.field2057 = 1;
        this.field356 = new class188();
        this.field356.field2057 = 1;
        this.field363 = new class188();
        this.field368 = new class144[] { this.field356, this.field363, this.field359 };
        this.field363.field2057 = 1;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lqi;)V")
    public class30(class216 arg0) {
        int var2 = arg0.method1407(119);
        this.field368 = new class144[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class144 var16 = class231.method1508(arg0, 58);
            if (var16.method20(64) >= 0) {
                var3++;
            }
            if (var16.method931((byte) -26) >= 0) {
                var5++;
            }
            int var17 = var16.field2072.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1407(113);
            }
            this.field368[var6] = var16;
        }
        this.field367 = new int[var5];
        int var7 = 0;
        this.field370 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class144 var11 = this.field368[var9];
            int var12 = var11.field2072.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2072[var13] = this.field368[var4[var9][var13]];
            }
            int var14 = var11.method20(-126);
            int var15 = var11.method931((byte) -75);
            if (var14 > 0) {
                this.field370[var8++] = var14;
            }
            if (var15 > 0) {
                this.field367[var7++] = var15;
            }
            var4[var9] = null;
        }
        this.field356 = this.field368[arg0.method1407(107)];
        this.field363 = this.field368[arg0.method1407(122)];
        this.field359 = this.field368[arg0.method1407(104)];
        Object var10 = null;
    }
}

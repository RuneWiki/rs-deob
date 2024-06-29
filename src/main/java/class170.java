import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class170 extends class190 {

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field2326 = -1;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
    public static int[] field2328 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Z")
    public static boolean field2335 = false;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "F")
    public static float field2325;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lrr;")
    public class203 field2332;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lnq;")
    public static class268 field2334;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    public static int[] field2329;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[Lvf;")
    public class84[] field2333;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILuo;Z)Z")
    public final boolean method1119(int arg0, int arg1, class345 arg2, boolean arg3) {
        field2331++;
        if (this.field2333 != null) {
            for (int var5 = 0; var5 < this.field2333.length; var5++) {
                if (this.field2333[var5].method606(arg0, arg1) && this.field2332.method675(arg1, -20759, arg2, arg0)) {
                    return true;
                }
            }
        }
        if (arg3) {
            field2326 = 44;
        }
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILbe;ILuo;Lco;I)Z")
    public static final boolean method1120(int arg0, class25 arg1, int arg2, class345 arg3, class62 arg4, int arg5) {
        field2327++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field442 != null) {
            var6 = (arg1.field430 + arg4.field852 - class354.field4847) * (class354.field4846 - class354.field4848) / (class354.field4861 - class354.field4847) + class354.field4848;
            var8 = class354.field4844 - ((arg1.field445 + arg4.field858 - class354.field4854) * (class354.field4844 - class354.field4859) / (class354.field4840 - class354.field4854));
            var9 = class354.field4844 - (arg1.field456 + arg4.field858 - class354.field4854) * (class354.field4844 - class354.field4859) / (class354.field4840 - class354.field4854);
            var7 = class354.field4848 + ((class354.field4846 - class354.field4848) * (arg4.field852 + arg1.field450 - class354.field4847) / (class354.field4861 - class354.field4847));
        }
        class226 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field435 != -1) {
            if (arg4.field850 && arg1.field423 != -1) {
                var10 = arg1.method295(false, true, arg3);
            } else {
                var10 = arg1.method295(false, false, arg3);
            }
            if (var10 != null) {
                var11 = arg4.field848 - (var10.method597() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg4.field848 + (var10.method597() + 1 >> 1);
                var13 = arg4.field849 - (var10.method596() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg4.field849 + (var10.method596() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class435 var15 = null;
        int var16 = 0;
        int var17 = 0;
        if (arg2 != -31321) {
            return false;
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field446 != null) {
            var15 = class297.method1938((byte) 77, arg1.field431);
            if (var15 != null) {
                var16 = class1.field14.method2153((int[]) null, true, arg1.field446, class267.field3694, (class226[]) null);
                int var23 = arg4.field849;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2737() / 2;
                } else {
                    var17 = var23 - ((var10.method596() >> 1) + var16 * var15.method2739());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class267.field3694[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2736(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field848 + arg5 - (var18 / 2);
                var20 = arg4.field848 + (var18 / 2) + arg5;
                if (var6 > var19) {
                    var6 = var19;
                }
                var21 = arg0 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var17 + var15.method2739() * var16 + arg0;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class354.field4848 || class354.field4846 < var6 || class354.field4859 > var9 || class354.field4844 < var8) {
            return true;
        }
        if (arg1.field442 != null) {
            int[] var27 = new int[arg1.field442.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg1.field442[var28 * 2] + arg4.field852;
                int var31 = arg1.field442[var28 * 2 + 1] + arg4.field858;
                var27[var28 * 2] = (class354.field4846 - class354.field4848) * (var30 - class354.field4847) / (class354.field4861 - class354.field4847) + class354.field4848;
                var27[var28 * 2 + 1] = class354.field4844 - ((class354.field4844 - class354.field4859) * (var31 - class354.field4854) / (class354.field4840 - class354.field4854));
            }
            class32.method324(arg3, var27, arg1.field453);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg3.method2187(var27[var29 * 2 + 1], var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 2], var27[var29 * 2], (byte) 115, arg1.field422);
            }
            arg3.method2187(var27[var27.length - 1], var27[1], var27[0], var27[var27.length - 2], (byte) 127, arg1.field422);
        }
        if (var10 != null) {
            if (class222.field3105 > 0 && (class352.field4820 != -1 && class352.field4820 == arg4.field851 || class223.field3122 != -1 && class223.field3122 == arg1.field429)) {
                int var32;
                if (class377.field5396 > 50) {
                    var32 = (100 - class377.field5396) * 2;
                } else {
                    var32 = class377.field5396 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method2191(var10.method600() / 2 + 7, arg4.field848, -60, var33, arg4.field849);
                arg3.method2191(var10.method600() / 2 + 5, arg4.field848, -109, var33, arg4.field849);
                arg3.method2191(var10.method600() / 2 + 3, arg4.field848, -118, var33, arg4.field849);
                arg3.method2191(var10.method600() / 2 + 1, arg4.field848, -74, var33, arg4.field849);
                arg3.method2191(var10.method600() / 2, arg4.field848, arg2 + 31216, var33, arg4.field849);
            }
            var10.method1501(arg4.field848 - (var10.method597() >> 1), arg4.field849 + -(var10.method596() >> 1));
        }
        if (arg1.field446 != null && var15 != null) {
            class423.method2683(var16, var18, var17, true, arg3, arg1, arg4, var15);
        }
        if (arg1.field435 != -1 || arg1.field446 != null) {
            class248 var34 = new class248(arg4);
            var34.field3497 = var11;
            var34.field3500 = var13;
            var34.field3504 = var14;
            var34.field3502 = var20;
            var34.field3508 = var22;
            var34.field3498 = var19;
            var34.field3503 = var12;
            var34.field3506 = var21;
            class135.field1963.method643(var34, -51);
        }
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method1121(int arg0) {
        if (arg0 == 7) {
            field2329 = null;
            field2334 = null;
            field2328 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILnq;ZI)V")
    public static final void method1122(int arg0, int arg1, int arg2, class268 arg3, boolean arg4, int arg5) {
        class347.field4737 = arg1;
        class113.field1636 = arg5;
        class290.field4063 = 10000;
        field2330++;
        class106.field1473 = arg2;
        class247.field3487 = arg0;
        class130.field1832 = arg3;
        class388.field5578 = arg4;
    }
}

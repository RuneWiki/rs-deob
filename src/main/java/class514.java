import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class514 extends class170 {

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public int field7463 = -1;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field7460 = -1;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lbj;")
    public static class162 field7466 = new class162(68, 12);

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Los;")
    public static class309 field7468 = new class309("M", "M", "M", "M");

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Ls;")
    public static class186 field7470 = new class186(55, -2);

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[I")
    public static int[] field7471 = new int[2048];

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field7457;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public int field7459;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public int field7462;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public int field7464;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Ll;")
    public static class16 field7467;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "Lhk;")
    public static class68 field7469;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lza;I)Lnd;")
    public final class385 method15(class288 arg0, int arg1) {
        ++field7455;
        class124 var3 = arg0.method364();
        var3.method835(super.field2764, super.field2768, super.field2765);
        class385 var4 = class497.method3001(3, false);
        if (this.field7463 != -1) {
            class374 var5 = class135.field2271.method1636(this.field7463, -115).method74(2048, 0, -1, (class370) null, arg0, 0, (class57) null, (byte) 126, this.field7459);
            if (var5 != null) {
                var5.method723(var3, var4.field5620[2], 0);
            }
        }
        if (~this.field7460 != 0) {
            class374 var6 = class135.field2271.method1636(this.field7460, -122).method74(2048, 0, -1, (class370) null, arg0, 0, (class57) null, (byte) 125, this.field7464);
            if (var6 != null) {
                var6.method723(var3, var4.field5620[1], 0);
            }
        }
        class374 var7 = class135.field2271.method1636(this.field7462, -118).method74(2048, 0, -1, (class370) null, arg0, 0, (class57) null, (byte) 125, this.field7457);
        if (arg1 != 2) {
            return null;
        } else {
            if (var7 != null) {
                var7.method723(var3, var4.field5620[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILza;Lrk;ILwk;)Z")
    public static final boolean method3066(byte arg0, int arg1, class288 arg2, class25 arg3, int arg4, class97 arg5) {
        if (arg0 <= 25) {
            field7469 = null;
        }
        ++field7458;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field371 != null) {
            var7 = (-class319.field4863 + arg5.field1897 + arg3.field377) * (-class319.field4864 + class319.field4875) / (-class319.field4863 + class319.field4861) + class319.field4864;
            var6 = (arg3.field365 + arg5.field1897 + -class319.field4863) * (-class319.field4864 + class319.field4875) / (-class319.field4863 + class319.field4861) + class319.field4864;
            var8 = class319.field4870 - (class319.field4870 - class319.field4866) * (-class319.field4882 + arg3.field367 + arg5.field1893) / (-class319.field4882 + class319.field4874);
            var9 = -((-class319.field4882 + arg3.field369 + arg5.field1893) * (-class319.field4866 + class319.field4870) / (-class319.field4882 + class319.field4874)) + class319.field4870;
        }
        class24 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field356 != -1) {
            if (arg5.field1891 && arg3.field361 != -1) {
                var10 = arg3.method168(true, (byte) -55, arg2);
            } else {
                var10 = arg3.method168(false, (byte) -55, arg2);
            }
            if (var10 != null) {
                var11 = arg5.field1887 + -(var10.method147() - -1 >> 1);
                var12 = arg5.field1887 - -(1 + var10.method147() >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var13 = arg5.field1895 - (1 + var10.method165() >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg5.field1895 + (1 + var10.method165() >> 1);
                if (~var13 > ~var8) {
                    var8 = var13;
                }
                if (~var9 > ~var14) {
                    var9 = var14;
                }
            }
        }
        class126 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field370 != null) {
            var15 = class291.method1890((byte) 38, arg3.field347);
            if (var15 != null) {
                var16 = class264.field4032.method2817((byte) 112, class395.field6020, arg3.field370, (class24[]) null, (int[]) null);
                int var23 = arg5.field1895;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method995() / 2;
                } else {
                    var17 = var23 - ((var10.method165() >> 1) + var16 * var15.method996());
                }
                for (int var24 = 0; var24 < var16; ++var24) {
                    String var25 = class395.field6020[var24];
                    if (var24 < var16 + -1) {
                        var25 = var25.substring(0, var25.length() + -4);
                    }
                    int var26 = var15.method997(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg5.field1887 + arg4 - var18 / 2;
                if (~var6 < ~var19) {
                    var6 = var19;
                }
                var20 = arg5.field1887 - -(var18 / 2) + arg4;
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = var17 - -arg1;
                var22 = var17 - -(var16 * var15.method996()) - -arg1;
                if (~var21 > ~var8) {
                    var8 = var21;
                }
                if (~var22 < ~var9) {
                    var9 = var22;
                }
            }
        }
        if (~var7 <= ~class319.field4864 && ~var6 >= ~class319.field4875 && ~class319.field4866 >= ~var9 && class319.field4870 >= var8) {
            if (arg3.field371 != null) {
                int[] var27 = new int[arg3.field371.length];
                for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                    int var30 = arg3.field371[var28 * 2] + arg5.field1897;
                    int var31 = arg3.field371[var28 * 2 + 1] + arg5.field1893;
                    var27[var28 * 2] = class319.field4864 - -((class319.field4875 - class319.field4864) * (-class319.field4863 + var30) / (-class319.field4863 + class319.field4861));
                    var27[var28 * 2 + 1] = class319.field4870 - (class319.field4870 - class319.field4866) * (-class319.field4882 + var31) / (class319.field4874 - class319.field4882);
                }
                class147.method1096(arg2, var27, arg3.field382);
                for (int var29 = 0; ~var29 > ~(var27.length / 2 + -1); ++var29) {
                    arg2.method1808(var27[var29 * 2], -10151, var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 1], var27[(var29 - -1) * 2], arg3.field366);
                }
                arg2.method1808(var27[var27.length + -2], -10151, var27[1], var27[var27.length + -1], var27[0], arg3.field366);
            }
            if (var10 != null) {
                if (~class420.field6337 < -1 && (class263.field4026 != -1 && class263.field4026 == arg5.field1890 || ~class310.field4697 != 0 && ~class310.field4697 == ~arg3.field359)) {
                    int var32;
                    if (class25.field383 > 50) {
                        var32 = -(class25.field383 * 2) + 200;
                    } else {
                        var32 = class25.field383 * 2;
                    }
                    int var33 = var32 << 24 | 16776960;
                    arg2.method1803(var33, var10.method157() / 2 - -7, arg5.field1887, arg5.field1895, (byte) 116);
                    arg2.method1803(var33, 5 + var10.method157() / 2, arg5.field1887, arg5.field1895, (byte) -36);
                    arg2.method1803(var33, var10.method157() / 2 - -3, arg5.field1887, arg5.field1895, (byte) 121);
                    arg2.method1803(var33, 1 + var10.method157() / 2, arg5.field1887, arg5.field1895, (byte) -25);
                    arg2.method1803(var33, var10.method157() / 2, arg5.field1887, arg5.field1895, (byte) -102);
                }
                var10.method159(arg5.field1887 - (var10.method147() >> 1), arg5.field1895 - (var10.method165() >> 1));
            }
            if (arg3.field370 != null && var15 != null) {
                class408.method2527(var18, var17, var16, arg2, arg5, arg3, var15, -127);
            }
            if (~arg3.field356 != 0 || arg3.field370 != null) {
                class463 var34 = new class463(arg5);
                var34.field6874 = var11;
                var34.field6873 = var13;
                var34.field6871 = var21;
                var34.field6878 = var14;
                var34.field6879 = var20;
                var34.field6882 = var12;
                var34.field6881 = var19;
                var34.field6877 = var22;
                class454.field6754.method1885(false, var34);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static final void method3067(int arg0) {
        ++field7461;
        if (!class285.field4285) {
            class285.field4285 = true;
            if (!class186.field2990.field2527) {
                class301.field4539 += (-12.0F - class301.field4539) / 2.0F;
            } else {
                class113.field2041 = (float) (-16 & (int) class113.field2041 + -17);
            }
            int var1 = -102 / ((arg0 - 54) / 49);
            class23.field339 = true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLza;)V")
    public final void method9(byte arg0, class288 arg1) {
        if (arg0 > -98) {
            method3068((byte) 99);
        }
        ++field7456;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static void method3068(byte arg0) {
        field7471 = null;
        field7468 = null;
        field7469 = null;
        field7467 = null;
        field7466 = null;
        field7470 = null;
        int var1 = -53 / ((-47 - arg0) / 58);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLza;II)Z")
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field7465;
        if (arg0) {
            this.field7460 = 60;
        }
        class124 var5 = arg1.method364();
        var5.method835(super.field2764, super.field2768, super.field2765);
        class374 var6 = class135.field2271.method1636(this.field7462, -121).method74(131072, 0, -1, (class370) null, arg1, 0, (class57) null, (byte) 126, this.field7457);
        if (var6 != null && var6.method763(arg3, arg2, var5, true)) {
            return true;
        } else {
            if (~this.field7460 != 0) {
                class374 var7 = class135.field2271.method1636(this.field7460, -116).method74(131072, 0, -1, (class370) null, arg1, 0, (class57) null, (byte) 124, this.field7464);
                if (var7 != null && var7.method763(arg3, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field7463 != -1) {
                class374 var8 = class135.field2271.method1636(this.field7463, -117).method74(131072, 0, -1, (class370) null, arg1, 0, (class57) null, (byte) -40, this.field7459);
                if (var8 != null && var8.method763(arg3, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}

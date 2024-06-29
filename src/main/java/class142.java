import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class142 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1808 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
    public static boolean field1814 = false;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lam;")
    public static class286 field1812;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
    public static int[] field1810;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lfd;")
    public static final class194 method769(int arg0, int arg1, int arg2) {
        field1809++;
        class194 var3 = class57.method301(arg2, (byte) 102);
        if (arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field2620 == null || arg1 >= var3.field2620.length) {
            return null;
        } else {
            return var3.field2620[arg1];
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method770(int arg0) {
        field1810 = null;
        field1812 = null;
        if (arg0 != 8276) {
            field1810 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method771(int arg0, int arg1, int arg2, int arg3) {
        if (!class198.method1060(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class98.field1161[arg0].method271(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class62.field638) {
                    if (!class328.method1881(var4, var6, var5)) {
                        return false;
                    }
                    if (!class328.method1881(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class328.method1881(var4, var7, var5)) {
                        return false;
                    }
                    if (!class328.method1881(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class328.method1881(var4, var8, var5)) {
                    return false;
                }
                if (!class328.method1881(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class390.field5596) {
                    if (!class328.method1881(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class328.method1881(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class328.method1881(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class328.method1881(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class328.method1881(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class328.method1881(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class62.field638) {
                    if (!class328.method1881(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class328.method1881(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class328.method1881(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class328.method1881(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class328.method1881(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class328.method1881(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class390.field5596) {
                    if (!class328.method1881(var4, var6, var5)) {
                        return false;
                    }
                    if (!class328.method1881(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class328.method1881(var4, var7, var5)) {
                        return false;
                    }
                    if (!class328.method1881(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class328.method1881(var4, var8, var5)) {
                    return false;
                }
                if (!class328.method1881(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class328.method1881(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class328.method1881(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class328.method1881(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class328.method1881(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class328.method1881(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBIZII)V")
    public static final void method772(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != 87) {
            method769(72, -9, 91);
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field1813++;
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class260.field3551 - class136.field1743) * var6 / 100 + class136.field1743;
        if (var7 < class191.field2410) {
            var7 = class191.field2410;
        } else if (var7 > class115.field1438) {
            var7 = class115.field1438;
        }
        int var8 = arg0 * 512 * var7 / (arg5 * 334);
        if (class208.field2833 > var8) {
            short var9 = class208.field2833;
            var7 = arg5 * var9 * 334 / (arg0 * 512);
            if (var7 > class115.field1438) {
                var7 = class115.field1438;
                int var10 = var7 * 512 * arg0 / (var9 * 334);
                int var11 = (arg5 - var10) / 2;
                if (arg3) {
                    class88.field1003.method1584();
                    class88.field1003.method1860(arg2, -3272, var11, arg4, arg0, -16777216);
                    class88.field1003.method1860(arg2, -3272, var11, arg4 + arg5 - var11, arg0, -16777216);
                }
                arg4 += var11;
                arg5 -= var11 * 2;
            }
        } else if (class188.field2369 < var8) {
            short var12 = class188.field2369;
            var7 = arg5 * var12 * 334 / (arg0 * 512);
            if (class191.field2410 > var7) {
                var7 = class191.field2410;
                int var13 = arg5 * var12 * 334 / (var7 * 512);
                int var14 = (arg0 - var13) / 2;
                if (arg3) {
                    class88.field1003.method1584();
                    class88.field1003.method1860(arg2, -3272, arg5, arg4, var14, -16777216);
                    class88.field1003.method1860(arg2 - (var14 - arg0), -3272, arg5, arg4, var14, -16777216);
                }
                arg0 -= var14 * 2;
                arg2 += var14;
            }
        }
        class376.field5279 = (short) arg0;
        class189.field2397 = arg0 * var7 / 334;
        class189.field2396 = arg2;
        class409.field5910 = arg4;
        class71.field788 = (short) arg5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lvm;Lir;Lnj;III)Z")
    public static final boolean method773(class322 arg0, class216 arg1, class228 arg2, int arg3, int arg4, int arg5) {
        field1815++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field3120 != null) {
            var8 = class443.field6460 - ((arg2.field3124 + arg1.field2896 - class443.field6468) * (class443.field6460 - class443.field6470) / (class443.field6477 - class443.field6468));
            var9 = class443.field6460 - ((arg1.field2896 + arg2.field3139 - class443.field6468) * (class443.field6460 - class443.field6470) / (class443.field6477 - class443.field6468));
            var7 = (arg1.field2908 + arg2.field3134 - class443.field6463) * (class443.field6459 - class443.field6475) / (class443.field6464 - class443.field6463) + class443.field6475;
            var6 = (arg1.field2908 + arg2.field3136 - class443.field6463) * (class443.field6459 - class443.field6475) / (class443.field6464 - class443.field6463) + class443.field6475;
        }
        class20 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field3116 != -1) {
            if (arg1.field2902 && arg2.field3113 != -1) {
                var10 = arg2.method1242(true, arg0, 2233);
            } else {
                var10 = arg2.method1242(false, arg0, 2233);
            }
            if (var10 != null) {
                var11 = arg1.field2895 - (var10.method101() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg1.field2895 + (var10.method101() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg1.field2907 - (var10.method109() + 1 >> 1);
                var14 = arg1.field2907 + (var10.method109() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class60 var15 = null;
        int var16 = 0;
        int var17 = 87 % ((62 - arg4) / 48);
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg2.field3123 != null) {
            var15 = class106.method562(arg2.field3115, 1);
            if (var15 != null) {
                var16 = class207.field2798.method2522(arg2.field3123, (class20[]) null, (int[]) null, 28, class367.field5143);
                int var24 = arg1.field2907;
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method322() / 2;
                } else {
                    var18 = var24 - ((var10.method109() >> 1) + (var15.method325() * var16));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class367.field5143[var25];
                    if (var25 < var16 - 1) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method323(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = arg5 + arg1.field2895 - (var19 / 2);
                if (var20 < var6) {
                    var6 = var20;
                }
                var21 = var19 / 2 + arg1.field2895 + arg5;
                var22 = arg3 + var18;
                if (var21 > var7) {
                    var7 = var21;
                }
                var23 = arg3 + (var18 + (var16 * var15.method325()));
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (class443.field6475 > var7 || var6 > class443.field6459 || var9 < class443.field6470 || class443.field6460 < var8) {
            return true;
        }
        if (arg2.field3120 != null) {
            int[] var28 = new int[arg2.field3120.length];
            for (int var29 = 0; var29 < var28.length / 2; var29++) {
                int var31 = arg2.field3120[var29 * 2] + arg1.field2908;
                int var32 = arg2.field3120[var29 * 2 + 1] + arg1.field2896;
                var28[var29 * 2] = (class443.field6459 - class443.field6475) * (var31 - class443.field6463) / (class443.field6464 - class443.field6463) + class443.field6475;
                var28[var29 * 2 + 1] = class443.field6460 - ((var32 - class443.field6468) * (class443.field6460 - class443.field6470) / (class443.field6477 - class443.field6468));
            }
            class251.method1400(arg0, var28, arg2.field3130);
            for (int var30 = 0; var30 < var28.length / 2 - 1; var30++) {
                arg0.method1859(var28[var30 * 2 + 1], 23059, var28[var30 * 2], arg2.field3137, var28[var30 * 2 + 2], var28[var30 * 2 + 2 + 1]);
            }
            arg0.method1859(var28[var28.length - 1], 23059, var28[var28.length - 2], arg2.field3137, var28[0], var28[1]);
        }
        if (var10 != null) {
            if (class435.field6352 > 0 && (class230.field3169 != -1 && class230.field3169 == arg1.field2903 || class205.field2768 != -1 && class205.field2768 == arg2.field3133)) {
                int var33;
                if (class340.field4550 <= 50) {
                    var33 = class340.field4550 * 2;
                } else {
                    var33 = (100 - class340.field4550) * 2;
                }
                int var34 = var33 << 24 | 0xFFFF00;
                arg0.method1852(var34, arg1.field2895, 101, var10.method97() / 2 + 7, arg1.field2907);
                arg0.method1852(var34, arg1.field2895, 103, var10.method97() / 2 + 5, arg1.field2907);
                arg0.method1852(var34, arg1.field2895, 120, var10.method97() / 2 + 3, arg1.field2907);
                arg0.method1852(var34, arg1.field2895, 121, var10.method97() / 2 + 1, arg1.field2907);
                arg0.method1852(var34, arg1.field2895, 124, var10.method97() / 2, arg1.field2907);
            }
            var10.method93(arg1.field2895 - (var10.method101() >> 1), arg1.field2907 + -(var10.method109() >> 1));
        }
        if (arg2.field3123 != null && var15 != null) {
            class10.method45(var15, var16, arg1, arg0, -12806, var18, arg2, var19);
        }
        if (arg2.field3116 != -1 || arg2.field3123 != null) {
            class330 var35 = new class330(arg1);
            var35.field4394 = var21;
            var35.field4404 = var20;
            var35.field4408 = var12;
            var35.field4400 = var11;
            var35.field4411 = var13;
            var35.field4396 = var23;
            var35.field4406 = var14;
            var35.field4395 = var22;
            class338.field4512.method825(-105, var35);
        }
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method774(byte arg0) {
        if (class219.field2937 >= 0) {
            long var1 = class442.method2730(25207);
            class219.field2937 = (int) ((long) class219.field2937 - (var1 - class232.field3203));
            if (class219.field2937 <= 0) {
                class101.field1188 = class376.field5275.field1020;
                class279.field3788 = class376.field5275.field1015;
                class44.field455 = class376.field5275.field1014;
                class151.field1916 = class376.field5275.field1007;
                class281.field3851 = class376.field5275.field1011;
                class385.field5486 = class376.field5275.field1008;
                class379.field5352 = class376.field5275.field1017;
                class12.field115 = class376.field5275.field1024;
                class366.field5125 = class376.field5275.field1013;
                class5.field40 = class376.field5275.field1021;
                class219.field2937 = -1;
            } else {
                int var3 = (class219.field2937 << 8) / class84.field937;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class101.field1188 = ((class247.field3336 & 0xFF00) * var3 + (class376.field5275.field1020 & 0xFF00) * var4 & 0xFF0000) + ((class247.field3336 & 0xFF00FF) * var3 + (class376.field5275.field1020 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class281.field3851 = (class376.field5275.field1011 - class14.field129) * var6 + class14.field129;
                class44.field455 = ((class187.field2357 & 0xFF00) * var3 + (class376.field5275.field1014 & 0xFF00) * var4 & 0xFF0000) + ((class187.field2357 & 0xFF00FF) * var3 + (class376.field5275.field1014 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class12.field115 = (class376.field5275.field1024 - class260.field3534) * var6 + class260.field3534;
                class379.field5352 = class246.field3328 * var3 + class376.field5275.field1017 * var4 >> 8;
                class385.field5486 = (class376.field5275.field1008 - class153.field1933) * var6 + class153.field1933;
                class151.field1916 = (class376.field5275.field1007 - class68.field702) * var6 + class68.field702;
                class5.field40 = (class376.field5275.field1021 - class92.field1057) * var6 + class92.field1057;
                class279.field3788 = (class376.field5275.field1015 - class435.field6360) * var6 + class435.field6360;
                if (class41.field434 != class376.field5275.field1013) {
                    class366.field5125 = class235.field3242.method1602(class41.field434, class376.field5275.field1013, var6, class366.field5125);
                }
            }
            class232.field3203 = var1;
        }
        field1811++;
        if (arg0 >= -26) {
            method769(109, -102, -25);
        }
    }
}

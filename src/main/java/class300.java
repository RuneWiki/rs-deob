import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class300 implements class74 {

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lfi;")
    public static class331 field4272 = new class331(16);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "Lvr;")
    public static class71 field4277;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "[Lsa;")
    public static class113[] field4276;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIZIBII)V")
    public static final void method1891(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4278++;
        class249.field3392 = arg5;
        class228.field3114 = arg3;
        class402.field5872 = arg1;
        class166.field2330 = arg6;
        class164.field2294 = arg0;
        if (arg2 && class166.field2330 >= 100) {
            class272.field3852 = class402.field5872 * 128 + 64;
            class272.field3853 = class228.field3114 * 128 + 64;
            class164.field2289 = class372.method2335(class272.field3852, class410.field5931, (byte) 85, class272.field3853) - class249.field3392;
        }
        if (arg4 > -106) {
            method1898(-49, 16, (byte) -102, -94);
        }
        class231.field3128 = 2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public static void method1892(int arg0) {
        field4276 = null;
        field4277 = null;
        int var1 = 42 / ((arg0 + 7) / 54);
        field4272 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILen;IZIZLen;Ltc;Leq;ZI)Lkh;")
    public static final class11 method1893(int arg0, int arg1, class174 arg2, int arg3, boolean arg4, int arg5, boolean arg6, class174 arg7, class196 arg8, class116 arg9, boolean arg10, int arg11) {
        field4271++;
        class11 var12 = class219.method1435(arg1, arg0, arg2, (byte) 117, arg11, arg5, arg9, arg3);
        if (var12 != null) {
            return var12;
        }
        class260 var13 = class392.method2498(arg5, -128);
        if (arg3 > 1 && var13.field3579 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (arg3 >= var13.field3599[var15] && var13.field3599[var15] != 0) {
                    var14 = var13.field3579[var15];
                }
            }
            if (var14 != -1) {
                var13 = class392.method2498(var14, -121);
            }
        }
        class200 var16 = class38.method227(var13.field3550, class140.field1987, 0, arg6);
        if (var16 == null) {
            return null;
        }
        if (var13.field3564 != null) {
            for (int var17 = 0; var17 < var13.field3564.length; var17++) {
                if (var13.field3557 == null || var17 >= var13.field3557.length) {
                    var16.method1286((byte) -116, var13.field3539[var17], var13.field3564[var17]);
                } else {
                    var16.method1286((byte) -116, class397.field5785[var13.field3557[var17] & 0xFF], var13.field3564[var17]);
                }
            }
        }
        if (var13.field3522 != null) {
            for (int var18 = 0; var18 < var13.field3522.length; var18++) {
                var16.method1277(var13.field3522[var18], (byte) 75, var13.field3533[var18]);
            }
        }
        if (arg9 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (arg9.field1374[var19] < class198.field2693[var19].length) {
                    var16.method1286((byte) -116, class198.field2693[var19][arg9.field1374[var19]], class323.field4559[var19]);
                }
                if (arg9.field1374[var19] < class101.field1147[var19].length) {
                    var16.method1286((byte) -116, class101.field1147[var19][arg9.field1374[var19]], class108.field1248[var19]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field3558 != 128 || var13.field3580 != 128 || var13.field3531 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class393 var22 = arg7.method991(var16, var20, 0, var13.field3518 + 64, var13.field3575 + 768);
        if (!var22.method757()) {
            return null;
        }
        if (var21) {
            var22.method736(var13.field3558, var13.field3580, var13.field3531);
        }
        class11 var23 = null;
        if (var13.field3570 != -1) {
            var23 = method1893(0, 1, arg2, 10, true, var13.field3521, false, arg7, arg8, arg9, true, 0);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field3542 != -1) {
            var23 = method1893(arg0, arg1, arg2, arg3, false, var13.field3540, false, arg7, arg8, arg9, true, 0);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field3577;
        arg7.method971(16, 16, 512, 512);
        if (arg4) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg1 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class71 var25 = arg7.method922();
        var25.method116();
        arg7.method949(var25);
        arg7.method999(1.0F);
        arg7.method1018(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class71 var26 = arg7.method1015();
        var26.method118(-var13.field3572 << 3);
        var26.method125(var13.field3563 << 3);
        var26.method124(var13.field3574, (class286.field4025[var13.field3586 << 3] * var24 >> 15) + (var13.field3571 - (var22.method731() / 2)), (class286.field4035[var13.field3586 << 3] * var24 >> 15) + var13.field3571);
        var26.method131(var13.field3586 << 3);
        int var27 = arg7.method992();
        int var28 = arg7.method959();
        arg7.method1011(50, Integer.MAX_VALUE);
        arg7.method934();
        arg7.method957();
        arg7.method995(0, 0, 36, 32, 0, 0);
        var22.method775(var26, (class127) null, 1);
        arg7.method1011(var27, var28);
        int[] var29 = arg7.method932(0, 0, 36, 32);
        if (arg1 >= 1) {
            var29 = class314.method1965(-16777215, (byte) 88, var29);
            if (arg1 >= 2) {
                var29 = class314.method1965(-1, (byte) 88, var29);
            }
        }
        if (arg0 != 0) {
            class396.method2523(var29, 50, arg0);
        }
        arg7.method1008(var29, 0, 36, 36, 32).method90(0, 0);
        if (var13.field3570 != -1) {
            var23.method90(0, 0);
        } else if (var13.field3542 != -1) {
            var23.method90(0, 0);
        }
        if (arg11 == 1 || arg11 == 2 && (var13.field3581 == 1 || arg3 != 1) && arg3 != -1) {
            arg8.method1245(-16777215, 9, class447.method2774(-116, arg3), true, -256, 0);
        }
        int[] var30 = arg7.method932(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class164.method1059(var30[var31], -16777216);
            }
        }
        class11 var32;
        if (arg10) {
            var32 = arg7.method1008(var30, 0, 36, 36, 32);
        } else {
            var32 = arg2.method1008(var30, 0, 36, 36, 32);
        }
        if (!arg10) {
            class386 var33 = new class386();
            var33.field5645 = arg3;
            var33.field5641 = arg5;
            var33.field5642 = arg0;
            var33.field5643 = arg9 != null;
            var33.field5646 = arg2.field2424;
            var33.field5648 = arg11;
            var33.field5647 = arg1;
            class134.field1864.method874((byte) -124, var32, var33);
        }
        return var32;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)Z")
    public static final boolean method1894(int arg0) {
        field4269++;
        if (class220.field3019) {
            try {
                if ((Boolean) class250.method1569("showingVideoAd", class323.field4554.field5559, 18050)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 12422) {
            field4276 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILsl;BI)J")
    public static final long method1895(int arg0, class265 arg1, byte arg2, int arg3) {
        field4274++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        if (arg2 != -10) {
            field4275 = -37;
        }
        class327 var10 = class157.method1036(0, arg1.method225(112));
        long var11 = (long) (arg1.method210(arg2 ^ 0x5D58) << 14 | arg3 << 7 | arg0 | arg1.method214(arg2 - 112) << 20 | 0x40000000);
        if (var10.field4677 == 0) {
            var11 |= var8;
        }
        if (var10.field4628 == 1) {
            var11 |= var4;
        }
        if (var10.field4623) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method225(arg2 + 137) << 32;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    public static final void method1896(int arg0, int arg1) {
        field4279++;
        class417 var2 = (class417) class201.field2774.method1204((byte) -68, (long) arg0);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field5987.length; var3++) {
                var2.field5987[var3] = -1;
                var2.field5984[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B[I[J)V")
    public static final void method1897(byte arg0, int[] arg1, long[] arg2) {
        class282.method1809(arg2, true, 0, arg1, arg2.length - 1);
        if (arg0 == -42) {
            field4268++;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIBI)I")
    public static final int method1898(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field4270++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (arg2 == 108) {
            return var4 == 2 ? 1023 - arg3 : arg0;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IJ[IZ)Ljava/lang/String;")
    public final String method429(int arg0, long arg1, int[] arg2, boolean arg3) {
        field4273++;
        if (arg0 == 0) {
            class450 var6 = class372.method2339(-1, arg2[0]);
            return var6.method2800((byte) 43, (int) arg1);
        } else if (arg0 == 1 || arg0 == 10) {
            class260 var7 = class392.method2498((int) arg1, -116);
            return var7.field3527;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class372.method2339(-1, arg2[0]).method2800((byte) 43, (int) arg1);
        } else {
            if (arg3) {
                method1894(51);
            }
            return null;
        }
    }
}

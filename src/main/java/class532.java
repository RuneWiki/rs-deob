import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class532 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "F")
    public static float field6723 = 1.0F;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field6720;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lxa;")
    public static class468 field6729;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Ldw;")
    public class673 field6730;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[I")
    public int[] field6726;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method2870(int arg0) {
        class208 var1 = class634.field8597;
        synchronized (class634.field8597) {
            class634.field8597.method1224(false);
            if (arg0 <= 104) {
                field6723 = 1.9254756F;
            }
        }
        field6724++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static final void method2871(boolean arg0) {
        field6725++;
        class698.field9679 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIF[FFII)V")
    public static final void method2872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float[] arg7, float arg8, int arg9, int arg10) {
        field6727++;
        int var11 = arg0 - arg1;
        int var12 = arg10 - arg2;
        int var13 = arg9 - arg4;
        float var14 = arg7[2] * (float) var11 + arg7[arg3] * (float) var12 + arg7[0] * (float) var13;
        float var15 = arg7[5] * (float) var11 + arg7[3] * (float) var13 + arg7[4] * (float) var12;
        float var16 = arg7[8] * (float) var11 + arg7[7] * (float) var12 + arg7[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        float var18 = var15 + arg8 + 0.5F;
        if (arg5 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg5 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg5 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class148.field1770 = var18;
        class250.field3232 = var17;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method2873(int arg0) {
        for (class112 var1 = (class112) class578.field7755.method1909(true); var1 != null; var1 = (class112) class578.field7755.method1916((byte) 99)) {
            if (var1.field1384) {
                var1.method776(-10);
            }
        }
        field6722++;
        class112 var2 = (class112) class16.field163.method1909(true);
        if (arg0 != 128) {
            field6723 = -1.3219063F;
        }
        while (var2 != null) {
            if (var2.field1384) {
                var2.method776(124);
            }
            var2 = (class112) class16.field163.method1916((byte) 109);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Loa;IILrr;I)V")
    public static final void method2874(class650 arg0, int arg1, int arg2, class337 arg3, int arg4) {
        field6728++;
        class219 var5 = arg3.method1927(arg0, 65);
        if (var5 == null) {
            return;
        }
        arg0.method403(arg2, arg4, arg3.field4309 + arg2, arg4 - -arg3.field4211);
        if (arg1 != 3125) {
            method2876((byte) -61);
        }
        if (class666.field9038 == 2 || class666.field9038 == 5 || class136.field1651 == null) {
            arg0.method426(-16777216, var5, arg2, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class385.field4946 == 4) {
            var6 = (int) (-class689.field9561) & 0x3FFF;
            var7 = class576.field7580;
            var8 = class702.field9824;
            var9 = 4096;
        } else {
            var9 = 4096 - class352.field4559 * 16;
            var7 = class67.field815.field8011;
            var8 = class67.field815.field8018;
            var6 = (int) (-class689.field9561) + class290.field3661 & 0x3FFF;
        }
        int var10 = var8 / 128 + 48 - ((class85.field1090 - 104) * 2);
        int var11 = class656.field8932 * 4 + 48 - (var7 / 128) - ((class656.field8932 - 104) * 2);
        class136.field1651.method2551((float) arg3.field4309 / 2.0F + (float) arg2, (float) arg3.field4211 / 2.0F + (float) arg4, (float) var10, (float) var11, var9, var6 << 2, var5, arg2, arg4);
        for (class319 var12 = (class319) class703.field9847.method1909(true); var12 != null; var12 = (class319) class703.field9847.method1916((byte) 88)) {
            int var58 = var12.field3990;
            int var59 = ((class469.field5796.field6111[var58] & 0xFFFDA70) >> 14) - class227.field2938;
            int var60 = (class469.field5796.field6111[var58] & 0x3FFF) - class522.field6612;
            int var61 = var59 * 4 + 2 - (var8 / 128);
            int var62 = var60 * 4 + 2 - (var7 / 128);
            class608.method3378(arg3, class469.field5796.field6113[var58], 16805, var62, arg0, arg4, var61, var5, arg2);
        }
        for (int var13 = 0; var13 < class266.field3369; var13++) {
            int var55 = class250.field3219[var13] * 4 - ((var8 / 128) - 2);
            int var56 = class545.field6858[var13] * 4 + 2 - (var7 / 128);
            class687 var57 = class232.field3017.method2358(0, class661.field8969[var13]);
            if (var57.field9421 != null) {
                var57 = var57.method3800(class327.field4084, (byte) -127);
                if (var57 == null || var57.field9437 == -1) {
                    continue;
                }
            }
            class608.method3378(arg3, var57.field9437, arg1 ^ 0x4D90, var56, arg0, arg4, var55, var5, arg2);
        }
        for (class62 var14 = (class62) class370.field4774.method3830((byte) -6); var14 != null; var14 = (class62) class370.field4774.method3838((byte) -92)) {
            int var50 = (int) (var14.field3321 >> 28 & 0x3L);
            if (class129.field1566 == var50) {
                int var51 = (int) (var14.field3321 & 0x3FFFL) - class227.field2938;
                int var52 = (int) (var14.field3321 >> 14 & 0x3FFFL) - class522.field6612;
                int var53 = var51 * 4 + 2 - (var8 / 128);
                int var54 = var52 * 4 + 2 - (var7 / 128);
                class376.method2169(var53, class38.field551[0], (byte) 17, var54, arg4, arg2, var5, arg3);
            }
        }
        for (int var15 = 0; var15 < class99.field1276; var15++) {
            class704 var45 = (class704) class168.field1973.method3828((long) class352.field4562[var15], (byte) -91);
            if (var45 != null) {
                class506 var46 = var45.field9854;
                if (var46.method2762((byte) -21) && class67.field815.field8010 == var46.field8010) {
                    class689 var47 = var46.field6326;
                    if (var47 != null && var47.field9546 != null) {
                        var47 = var47.method3812(class327.field4084, arg1 - 3252);
                    }
                    if (var47 != null && var47.field9547 && var47.field9555) {
                        int var48 = var46.field8018 / 128 - var8 / 128;
                        int var49 = var46.field8011 / 128 - (var7 / 128);
                        if (var47.field9542 == -1) {
                            class376.method2169(var48, class38.field551[1], (byte) 17, var49, arg4, arg2, var5, arg3);
                        } else {
                            class608.method3378(arg3, var47.field9542, 16805, var49, arg0, arg4, var48, var5, arg2);
                        }
                    }
                }
            }
        }
        int var16 = class149.field1788;
        int[] var17 = class95.field1239;
        for (int var18 = 0; var18 < var16; var18++) {
            class365 var37 = class132.field1601[var17[var18]];
            if (var37 != null && var37.method2127((byte) -58) && class67.field815 != var37 && class67.field815.field8010 == var37.field8010) {
                int var38 = var37.field8018 / 128 - (var8 / 128);
                int var39 = var37.field8011 / 128 - var7 / 128;
                boolean var40 = false;
                for (int var41 = 0; var41 < class284.field3600; var41++) {
                    if (var37.field4673.equals(class136.field1659[var41]) && class618.field8380[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class348.field4476; var43++) {
                    if (var37.field4673.equals(class485.field6032[var43].field2254)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class67.field815.field4670 != 0 && var37.field4670 != 0 && class67.field815.field4670 == var37.field4670) {
                    var44 = true;
                }
                if (var37.field4697) {
                    class376.method2169(var38, class38.field551[6], (byte) 17, var39, arg4, arg2, var5, arg3);
                } else if (var40) {
                    class376.method2169(var38, class38.field551[3], (byte) 17, var39, arg4, arg2, var5, arg3);
                } else if (var42) {
                    class376.method2169(var38, class38.field551[5], (byte) 17, var39, arg4, arg2, var5, arg3);
                } else if (var44) {
                    class376.method2169(var38, class38.field551[4], (byte) 17, var39, arg4, arg2, var5, arg3);
                } else {
                    class376.method2169(var38, class38.field551[2], (byte) 17, var39, arg4, arg2, var5, arg3);
                }
            }
        }
        class26[] var19 = class565.field7071;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class26 var23 = var19[var20];
            if (var23 != null && var23.field301 != 0 && (class665.field9027 % 20) < 10) {
                if (var23.field301 == 1) {
                    class704 var24 = (class704) class168.field1973.method3828((long) var23.field300, (byte) -91);
                    if (var24 != null) {
                        class506 var25 = var24.field9854;
                        int var26 = var25.field8018 / 128 - var8 / 128;
                        int var27 = var25.field8011 / 128 - (var7 / 128);
                        class64.method511(arg4, var5, arg3, false, arg2, var26, var23.field299, 360000L, var27);
                    }
                }
                if (var23.field301 == 2) {
                    int var28 = var23.field305 / 128 - var8 / 128;
                    int var29 = var23.field304 / 128 - (var7 / 128);
                    long var30 = (long) (var23.field302 << 7);
                    long var32 = var30 * var30;
                    class64.method511(arg4, var5, arg3, false, arg2, var28, var23.field299, var32, var29);
                }
                if (var23.field301 == 10 && var23.field300 >= 0 && class132.field1601.length > var23.field300) {
                    class365 var34 = class132.field1601[var23.field300];
                    if (var34 != null) {
                        int var35 = var34.field8018 / 128 - var8 / 128;
                        int var36 = var34.field8011 / 128 - (var7 / 128);
                        class64.method511(arg4, var5, arg3, false, arg2, var35, var23.field299, 360000L, var36);
                    }
                }
            }
        }
        if (class385.field4946 == 4) {
            return;
        }
        if (class295.field3763 != 0) {
            int var21 = class295.field3763 * 4 + class67.field815.method210(false) * 2 + 2 - (var8 / 128) - 2;
            int var22 = class536.field6752 * 4 + 2 - (var7 / 128 + -(class67.field815.method210(false) * 2)) - 2;
            class376.method2169(var21, class638.field8652[class435.field5478 ? 1 : 0], (byte) 17, var22, arg4, arg2, var5, arg3);
        }
        arg0.method3630((byte) 90, 3, arg3.field4211 / 2 + arg4 - 1, arg2 - -(arg3.field4309 / 2) + -1, -1, 3);
        return;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Z")
    public static final boolean method2875(int arg0, int arg1, int arg2) {
        if (arg1 < 46) {
            return false;
        } else {
            field6721++;
            return (arg2 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method2876(byte arg0) {
        field6729 = null;
        int var1 = -87 % ((57 - arg0) / 44);
    }
}

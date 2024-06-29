import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class30 {

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IB)V")
    public static final void method156(int arg0, byte arg1) {
        if (arg1 != -21) {
            method158(true, -100, 108, null);
        }
        field288++;
        class118 var2 = class86.method755(true, 2, arg0);
        var2.method936(0);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIIII[B)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field287++;
        if (arg3 <= arg0) {
            return;
        }
        int var6 = arg0 + arg4;
        int var7 = arg3 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg2 == 28626) {
                            return;
                        } else {
                            method156(-115, (byte) -105);
                            return;
                        }
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZIILha;)V")
    public static final void method158(boolean arg0, int arg1, int arg2, class544 arg3) {
        field286++;
        if (arg1 < 0 || arg2 < 0 || class549.field7824 == 0 || class112.field1741 == 0) {
            return;
        }
        if (arg0) {
            method156(65, (byte) -88);
        }
        class73 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class250.field3989) {
            class32.method165(false, (byte) -108);
            var4 = arg3.method236();
            int[] var5 = arg3.method217();
            var6 = var5[0];
            var7 = var5[1];
            var8 = var5[2];
            var9 = var5[3];
            var10 = arg1 + class717.method3958(false, (byte) -51);
            var11 = class352.method2234((byte) -123, false) + arg2;
        } else {
            arg3.method288(class247.field3963, class370.field5620, class549.field7824, class112.field1741);
            var6 = class247.field3963;
            var7 = class370.field5620;
            var9 = class112.field1741;
            var8 = class549.field7824;
            arg3.method240(class13.field121, class382.field5739, class549.field7824, class112.field1741);
            var4 = arg3.method414();
            var4.method668(class265.field4125, class215.field3558, class582.field8235, class702.field9932, class197.field3396, class210.field3500);
            var10 = arg1;
            arg3.method244(var4);
            var11 = arg2;
        }
        if (var8 == 0) {
            var8 = 1;
        }
        if (var9 == 0) {
            var9 = 1;
        }
        class317.method2081(true, (byte) -102);
        if (class121.field1867 != null && (!class552.field7867 || (class553.field7869 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg3.method294();
            int var15 = arg3.method377();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class141.field2211) {
                var17 = var18 = (var11 - var7) * class106.field1553 / var9;
                var19 = var16 = (var10 - var6) * class106.field1553 / var8;
            } else {
                var16 = (var10 - var6) * var15 / var8;
                var17 = (var11 - var7) * var14 / var9;
                var18 = (var11 - var7) * var15 / var9;
                var19 = (var10 - var6) * var14 / var8;
            }
            int[] var20 = new int[] { var19, var17, var14 };
            var4.method666(var20);
            int[] var21 = new int[] { var16, var18, var15 };
            var4.method666(var21);
            float var22 = class199.method1492((float) var20[1], (float) var21[1], (float) var21[0], (float) var21[2], 4, (float) var20[2], (float) var20[0], true);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class145.field2251.method878(-5740) - 1 << 8) >> 9;
                var13 = var26 + (class145.field2251.method878(-5740) - 1 << 8) >> 9;
                byte var27 = class145.field2251.field9470;
                if (var27 < 3 && (class434.field6341[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class552.field7867 && (class553.field7869 & 0x40) != 0) {
                    class353 var28 = class745.method4165(-123, class711.field10004, class436.field6364);
                    if (var28 == null) {
                        class531.method3143((byte) -65);
                    } else {
                        class274.method1800(var13, " ->", true, (byte) 48, true, class400.field5936, var12, -1, (long) (var12 << 0 | var13), false, class131.field2134, 21, 0L);
                    }
                } else {
                    if (class125.field1913) {
                        class274.method1800(var13, "", true, (byte) -116, true, -1, var12, -1, (long) (var12 << 0 | var13), false, class641.field9020.method3621(107, class467.field6804), 59, 0L);
                    }
                    class274.method1800(var13, "", true, (byte) -95, true, class246.field3952, var12, -1, (long) (var12 << 0 | var13), false, class555.field7910, 16, 0L);
                    class116.field1798++;
                }
            }
        }
        if (class250.field3989) {
            class694.method3876(1);
        }
        for (int var29 = 0; var29 < (class250.field3989 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class1 var31 = var30 ? class532.field7659 : class666.field9451;
            int var32 = arg1;
            int var33 = arg2;
            if (class250.field3989) {
                class32.method165(var30, (byte) -108);
                var32 = arg1 + class717.method3958(var30, (byte) -51);
                var33 = arg2 + class352.method2234((byte) -123, var30);
            }
            class564 var34 = var31.field7;
            for (class48 var35 = (class48) var34.method3272(-125); var35 != null; var35 = (class48) var34.method3274(false)) {
                if ((class256.field4029 || class145.field2251.field9470 == var35.field792.field9470) && var35.method484(var33, var32, arg3, (byte) 35)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if (var35.field792 instanceof class559) {
                        var38 = ((class559) var35.field792).field7927;
                        var39 = ((class559) var35.field792).field7930;
                    } else {
                        var38 = var35.field792.field9477 >> 9;
                        var39 = var35.field792.field9475 >> 9;
                    }
                    if (var35.field792 instanceof class573) {
                        class573 var40 = (class573) var35.field792;
                        int var41 = var40.method878(-5740);
                        if ((var41 & 0x1) == 0 && (var40.field9477 & 0x1FF) == 0 && (var40.field9475 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field9477 & 0x1FF) == 256 && (var40.field9475 & 0x1FF) == 256) {
                            int var42 = var40.field9477 - (var40.method878(-5740) - 1 << 8);
                            int var43 = var40.field9475 - (var40.method878(-5740) - 1 << 8);
                            for (int var44 = 0; var44 < class356.field5394; var44++) {
                                class53 var51 = (class53) class332.field4881.method3512(true, (long) class45.field758[var44]);
                                if (var51 != null) {
                                    class461 var52 = var51.field847;
                                    if (class199.field3403 != var52.field1604 && var52.field1630) {
                                        int var53 = var52.field9477 - (var52.field6688.field7303 - 1 << 8);
                                        int var54 = var52.field9475 - (var52.field6688.field7303 - 1 << 8);
                                        if (var42 <= var53 && var52.field6688.field7303 <= (var40.method878(-5740) - (var53 - var42 >> 9)) && var54 >= var43 && var52.field6688.field7303 <= var40.method878(-5740) - (var54 - var43 >> 9)) {
                                            class559.method3247(var52, false, class145.field2251.field9470 != var35.field792.field9470);
                                            var52.field1604 = class199.field3403;
                                        }
                                    }
                                }
                            }
                            int var45 = class472.field6857;
                            int[] var46 = class96.field1419;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class573 var48 = class279.field4271[var46[var47]];
                                if (var48 != null && class199.field3403 != var48.field1604 && var40 != var48 && var48.field1630) {
                                    int var49 = var48.field9477 - (var48.method878(-5740) - 1 << 8);
                                    int var50 = var48.field9475 - (var48.method878(-5740) - 1 << 8);
                                    if (var49 >= var42 && var48.method878(-5740) <= var40.method878(-5740) - (var49 - var42 >> 9) && var50 >= var43 && var48.method878(-5740) <= var40.method878(-5740) - (var50 - var43 >> 9)) {
                                        class48.method483(class145.field2251.field9470 != var35.field792.field9470, var48, 84);
                                        var48.field1604 = class199.field3403;
                                    }
                                }
                            }
                        }
                        if (class199.field3403 == var40.field1604) {
                            continue;
                        }
                        class48.method483(class145.field2251.field9470 != var35.field792.field9470, var40, 113);
                        var40.field1604 = class199.field3403;
                    }
                    if (var35.field792 instanceof class461) {
                        class461 var55 = (class461) var35.field792;
                        if (var55.field6688 != null) {
                            if ((var55.field6688.field7303 & 0x1) == 0 && (var55.field9477 & 0x1FF) == 0 && (var55.field9475 & 0x1FF) == 0 || (var55.field6688.field7303 & 0x1) == 1 && (var55.field9477 & 0x1FF) == 256 && (var55.field9475 & 0x1FF) == 256) {
                                int var56 = var55.field9477 - (var55.field6688.field7303 - 1 << 8);
                                int var57 = var55.field9475 - (var55.field6688.field7303 - 1 << 8);
                                for (int var58 = 0; var58 < class356.field5394; var58++) {
                                    class53 var65 = (class53) class332.field4881.method3512(true, (long) class45.field758[var58]);
                                    if (var65 != null) {
                                        class461 var66 = var65.field847;
                                        if (class199.field3403 != var66.field1604 && var55 != var66 && var66.field1630) {
                                            int var67 = var66.field9477 - (var66.field6688.field7303 - 1 << 8);
                                            int var68 = var66.field9475 - (var66.field6688.field7303 - 1 << 8);
                                            if (var67 >= var56 && var66.field6688.field7303 <= (var55.field6688.field7303 - (var67 - var56 >> 9)) && var57 <= var68 && var66.field6688.field7303 <= var55.field6688.field7303 - (var68 - var57 >> 9)) {
                                                class559.method3247(var66, false, class145.field2251.field9470 != var35.field792.field9470);
                                                var66.field1604 = class199.field3403;
                                            }
                                        }
                                    }
                                }
                                int var59 = class472.field6857;
                                int[] var60 = class96.field1419;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class573 var62 = class279.field4271[var60[var61]];
                                    if (var62 != null && class199.field3403 != var62.field1604 && var62.field1630) {
                                        int var63 = var62.field9477 - (var62.method878(-5740) - 1 << 8);
                                        int var64 = var62.field9475 - (var62.method878(-5740) - 1 << 8);
                                        if (var56 <= var63 && var62.method878(-5740) <= (var55.field6688.field7303 - (var63 - var56 >> 9)) && var64 >= var57 && var62.method878(-5740) <= var55.field6688.field7303 - (var64 - var57 >> 9)) {
                                            class48.method483(class145.field2251.field9470 != var35.field792.field9470, var62, 102);
                                            var62.field1604 = class199.field3403;
                                        }
                                    }
                                }
                            }
                            if (class199.field3403 == var55.field1604) {
                                continue;
                            }
                            class559.method3247(var55, false, class145.field2251.field9470 != var35.field792.field9470);
                            var55.field1604 = class199.field3403;
                        }
                    }
                    if (var35.field792 instanceof class567) {
                        int var69 = class265.field4123 + var38;
                        int var70 = class723.field10155 + var39;
                        class477 var71 = (class477) class665.field9441.method3512(true, (long) (var69 | var35.field792.field9470 << 28 | var70 << 14));
                        if (var71 != null) {
                            int var72 = 0;
                            for (class51 var73 = (class51) var71.field6929.method3468((byte) 82); var73 != null; var73 = (class51) var71.field6929.method3470(0)) {
                                class688 var74 = class556.field7917.method741(116, var73.field823);
                                if (class552.field7867 && class145.field2251.field9470 == var35.field792.field9470) {
                                    class193 var75 = class493.field7149 == -1 ? null : class382.field5728.method1997((byte) 109, class493.field7149);
                                    if ((class553.field7869 & 0x1) != 0 && (var75 == null || var74.method3837(class493.field7149, var75.field3339, (byte) -117) != var75.field3339)) {
                                        class274.method1800(var39, class355.field5375 + " -> <col=ff9040>" + var74.field9714, true, (byte) 43, false, class400.field5936, var38, -1, (long) var72, false, class131.field2134, 48, (long) var73.field823);
                                        class88.field1324++;
                                    }
                                }
                                if (class145.field2251.field9470 == var35.field792.field9470) {
                                    String[] var76 = var74.field9730;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            int var79 = class380.field5712;
                                            if (var77 == 0) {
                                                var78 = 47;
                                            }
                                            if (var77 == 1) {
                                                var78 = 13;
                                            }
                                            if (var77 == 2) {
                                                var78 = 57;
                                            }
                                            if (var77 == 3) {
                                                var78 = 18;
                                            }
                                            if (var74.field9749 == var77) {
                                                var79 = var74.field9757;
                                            }
                                            if (var77 == 4) {
                                                var78 = 11;
                                            }
                                            if (var74.field9748 == var77) {
                                                var79 = var74.field9725;
                                            }
                                            class76.field1118++;
                                            class274.method1800(var39, "<col=ff9040>" + var74.field9714, true, (byte) 122, false, var79, var38, -1, (long) var72, false, var76[var77], var78, (long) var73.field823);
                                        }
                                    }
                                }
                                class490.field7063++;
                                class274.method1800(var39, "<col=ff9040>" + var74.field9714, true, (byte) 127, false, class637.field8956, var38, -1, (long) var72, class145.field2251.field9470 != var35.field792.field9470, class641.field9015.method3621(112, class467.field6804), 1011, (long) var73.field823);
                                var72++;
                            }
                        }
                    }
                    if (var35.field792 instanceof class523) {
                        class523 var80 = (class523) var35.field792;
                        class595 var81 = class576.field8167.method3074(0, var80.method87(2836));
                        if (var81.field8351 != null) {
                            var81 = var81.method3413(-1, class422.field6216);
                        }
                        if (var81 != null) {
                            if (class552.field7867 && class145.field2251.field9470 == var35.field792.field9470) {
                                class193 var82 = class493.field7149 == -1 ? null : class382.field5728.method1997((byte) 120, class493.field7149);
                                if ((class553.field7869 & 0x4) != 0 && (var82 == null || var81.method3409(class493.field7149, -88, var82.field3339) != var82.field3339)) {
                                    class645.field9196++;
                                    class274.method1800(var39, class355.field5375 + " -> <col=00ffff>" + var81.field8432, true, (byte) 120, false, class400.field5936, var38, -1, (long) var80.hashCode(), false, class131.field2134, 5, class457.method2794(var39, var38, var80, -817460050));
                                }
                            }
                            if (class145.field2251.field9470 == var35.field792.field9470) {
                                String[] var83 = var81.field8374;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 50;
                                            }
                                            int var86 = class380.field5712;
                                            if (var84 == 1) {
                                                var85 = 25;
                                            }
                                            if (var84 == 2) {
                                                var85 = 6;
                                            }
                                            if (var84 == 3) {
                                                var85 = 44;
                                            }
                                            if (var81.field8424 == var84) {
                                                var86 = var81.field8422;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1009;
                                            }
                                            if (var81.field8437 == var84) {
                                                var86 = var81.field8425;
                                            }
                                            class274.method1800(var39, "<col=00ffff>" + var81.field8432, true, (byte) 39, false, var86, var38, -1, (long) var80.hashCode(), false, var83[var84], var85, class457.method2794(var39, var38, var80, -817460050));
                                            class436.field6359++;
                                        }
                                    }
                                }
                                class274.method1800(var39, "<col=00ffff>" + var81.field8432, true, (byte) -90, false, class637.field8956, var38, -1, (long) var80.hashCode(), class145.field2251.field9470 != var35.field792.field9470, class641.field9015.method3621(90, class467.field6804), 1006, (long) var81.field8386);
                                class77.field1133++;
                            }
                        }
                    }
                }
            }
            if (class250.field3989) {
                class694.method3876(1);
            }
        }
        class317.method2081(false, (byte) -113);
    }
}

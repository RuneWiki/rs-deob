import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class class516 {

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Liia;")
    public static class89 field6964 = new class89();

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lfha;")
    public static class382 field6965 = new class382(14, 8);

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Lea;")
    public static class547 field6968 = new class547(25, 0);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;", line = 4)
    public static final String method2845(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        field6966++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 != 48) {
            return null;
        }
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIILha;)V", line = 82)
    public static final void method2846(int arg0, int arg1, int arg2, class60 arg3) {
        field6962++;
        if (arg2 < 0 || arg1 < 0 || class506.field6859 == 0 || class596.field8314 == 0) {
            return;
        }
        class10 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class247.field3206) {
            class503.method2805(false, (byte) 88);
            var4 = arg3.method357();
            int[] var5 = arg3.method453();
            var6 = var5[3];
            var7 = var5[0];
            var8 = var5[2];
            var9 = var5[1];
            var10 = arg2 + class481.method2698(false, arg0 ^ 0xFFFF84BF);
            var11 = class307.method1856(false, (byte) -67) + arg1;
        } else {
            arg3.method354(class634.field8808, class73.field785, class506.field6859, class596.field8314);
            var6 = class596.field8314;
            var9 = class73.field785;
            var7 = class634.field8808;
            var8 = class506.field6859;
            arg3.method426(class441.field6155, class571.field8036, class506.field6859, class596.field8314);
            var4 = arg3.method454();
            var4.method26(class190.field2286, class101.field1361, class291.field3850, class13.field94, class702.field9860, class249.field3230);
            var10 = arg2;
            arg3.method367(var4);
            var11 = arg1;
        }
        if (var8 == 0) {
            var8 = 1;
        }
        class558.method3158(-546, true);
        if (var6 == 0) {
            var6 = 1;
        }
        if (class86.field1182 != null && (!class595.field8291 || (class372.field5190 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg3.method400();
            int var15 = arg3.method356();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class670.field9312) {
                var17 = var16 = (var10 - var7) * class661.field9249 / var8;
                var19 = var18 = (var11 - var9) * class661.field9249 / var6;
            } else {
                var17 = (var10 - var7) * var14 / var8;
                var18 = (var11 - var9) * var15 / var6;
                var16 = (var10 - var7) * var15 / var8;
                var19 = (var11 - var9) * var14 / var6;
            }
            int[] var20 = new int[] { var17, var19, var14 };
            int[] var21 = new int[] { var16, var18, var15 };
            var4.method41(var20);
            var4.method41(var21);
            float var22 = class522.method2893(4, 10665, (float) var20[2], (float) var21[0], (float) var21[1], (float) var20[1], (float) var21[2], (float) var20[0]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class653.field9086.method543(0) - 1 << 8) >> 9;
                var13 = (class653.field9086.method543(arg0) - 1 << 8) + var26 >> 9;
                byte var27 = class653.field9086.field2175;
                if (var27 < 3 && (class114.field1506[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class595.field8291 && (class372.field5190 & 0x40) != 0) {
                    class218 var28 = class408.method2359((byte) 72, class631.field8779, class355.field4735);
                    if (var28 == null) {
                        class96.method661((byte) 100);
                    } else {
                        class218.method1237(false, true, 0L, class387.field5461, var12, " ->", true, var13, 46, (long) (var12 << 0 | var13), -1, false, class702.field9857);
                    }
                } else {
                    if (class77.field942) {
                        class218.method1237(false, true, 0L, -1, var12, "", true, var13, 60, (long) (var12 << 0 | var13), -1, false, class755.field10507.method4201(class723.field10095, (byte) 25));
                    }
                    class54.field555++;
                    class218.method1237(false, true, 0L, class301.field4078, var12, "", true, var13, 6, (long) (var12 << 0 | var13), -1, false, class29.field239);
                }
            }
        }
        if (class247.field3206) {
            class522.method2905((byte) 119);
        }
        for (int var29 = arg0; var29 < (class247.field3206 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class651 var31 = var30 ? class350.field4641 : class736.field10272;
            int var32 = arg2;
            int var33 = arg1;
            if (class247.field3206) {
                class503.method2805(var30, (byte) 88);
                var32 = arg2 + class481.method2698(var30, -31553);
                var33 = arg1 + class307.method1856(var30, (byte) -67);
            }
            class29 var34 = var31.field9074;
            for (class62 var35 = (class62) var34.method113((byte) 15); var35 != null; var35 = (class62) var34.method119(false)) {
                if ((class561.field7931 || class653.field9086.field2175 == var35.field682.field2175) && var35.method484(arg3, var32, var33, -66)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if (var35.field682 instanceof class752) {
                        var38 = ((class752) var35.field682).field10422;
                        var39 = ((class752) var35.field682).field10421;
                    } else {
                        var38 = var35.field682.field2170 >> 9;
                        var39 = var35.field682.field2165 >> 9;
                    }
                    if (var35.field682 instanceof class83) {
                        class83 var40 = (class83) var35.field682;
                        int var41 = var40.method543(arg0);
                        if ((var41 & 0x1) == 0 && (var40.field2170 & 0x1FF) == 0 && (var40.field2165 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field2170 & 0x1FF) == 256 && (var40.field2165 & 0x1FF) == 256) {
                            int var42 = var40.field2170 - (var40.method543(0) - 1 << 8);
                            int var43 = var40.field2165 - (var40.method543(arg0) - 1 << 8);
                            for (int var44 = 0; var44 < class84.field1169; var44++) {
                                class706 var51 = (class706) class681.field9475.method2552((long) class665.field9261[var44], arg0 - 1);
                                if (var51 != null) {
                                    class215 var52 = var51.field9890;
                                    if (class406.field5732 != var52.field869 && var52.field819) {
                                        int var53 = var52.field2170 - (var52.field2589.field3619 - 1 << 8);
                                        int var54 = var52.field2165 - (var52.field2589.field3619 - 1 << 8);
                                        if (var53 >= var42 && var52.field2589.field3619 <= (var40.method543(arg0) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field2589.field3619 <= (var40.method543(0) - (var54 - var43 >> 9))) {
                                            class243.method1458(var52, (byte) 55, class653.field9086.field2175 != var35.field682.field2175);
                                            var52.field869 = class406.field5732;
                                        }
                                    }
                                }
                            }
                            int var45 = class427.field6032;
                            int[] var46 = class619.field8682;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class83 var48 = class361.field4793[var46[var47]];
                                if (var48 != null && class406.field5732 != var48.field869 && var40 != var48 && var48.field819) {
                                    int var49 = var48.field2170 - (var48.method543(0) - 1 << 8);
                                    int var50 = var48.field2165 - (var48.method543(0) - 1 << 8);
                                    if (var49 >= var42 && var48.method543(arg0) <= var40.method543(0) - (var49 - var42 >> 9) && var43 <= var50 && var48.method543(arg0) <= var40.method543(0) - (var50 - var43 >> 9)) {
                                        class431.method2457(class653.field9086.field2175 != var35.field682.field2175, true, var48);
                                        var48.field869 = class406.field5732;
                                    }
                                }
                            }
                        }
                        if (class406.field5732 == var40.field869) {
                            continue;
                        }
                        class431.method2457(class653.field9086.field2175 != var35.field682.field2175, true, var40);
                        var40.field869 = class406.field5732;
                    }
                    if (var35.field682 instanceof class215) {
                        class215 var55 = (class215) var35.field682;
                        if (var55.field2589 != null) {
                            if ((var55.field2589.field3619 & 0x1) == 0 && (var55.field2170 & 0x1FF) == 0 && (var55.field2165 & 0x1FF) == 0 || (var55.field2589.field3619 & 0x1) == 1 && (var55.field2170 & 0x1FF) == 256 && (var55.field2165 & 0x1FF) == 256) {
                                int var56 = var55.field2170 - (var55.field2589.field3619 - 1 << 8);
                                int var57 = var55.field2165 - (var55.field2589.field3619 - 1 << 8);
                                for (int var58 = 0; var58 < class84.field1169; var58++) {
                                    class706 var65 = (class706) class681.field9475.method2552((long) class665.field9261[var58], -1);
                                    if (var65 != null) {
                                        class215 var66 = var65.field9890;
                                        if (class406.field5732 != var66.field869 && var55 != var66 && var66.field819) {
                                            int var67 = var66.field2170 - (var66.field2589.field3619 - 1 << 8);
                                            int var68 = var66.field2165 - (var66.field2589.field3619 - 1 << 8);
                                            if (var56 <= var67 && var55.field2589.field3619 - (var67 - var56 >> 9) >= var66.field2589.field3619 && var68 >= var57 && (var55.field2589.field3619 - (var68 - var57 >> 9)) >= var66.field2589.field3619) {
                                                class243.method1458(var66, (byte) 55, class653.field9086.field2175 != var35.field682.field2175);
                                                var66.field869 = class406.field5732;
                                            }
                                        }
                                    }
                                }
                                int var59 = class427.field6032;
                                int[] var60 = class619.field8682;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class83 var62 = class361.field4793[var60[var61]];
                                    if (var62 != null && class406.field5732 != var62.field869 && var62.field819) {
                                        int var63 = var62.field2170 - (var62.method543(0) - 1 << 8);
                                        int var64 = var62.field2165 - (var62.method543(0) - 1 << 8);
                                        if (var63 >= var56 && var62.method543(0) <= (var55.field2589.field3619 - (var63 - var56 >> 9)) && var64 >= var57 && var62.method543(0) <= (var55.field2589.field3619 - (var64 - var57 >> 9))) {
                                            class431.method2457(class653.field9086.field2175 != var35.field682.field2175, true, var62);
                                            var62.field869 = class406.field5732;
                                        }
                                    }
                                }
                            }
                            if (class406.field5732 == var55.field869) {
                                continue;
                            }
                            class243.method1458(var55, (byte) 55, class653.field9086.field2175 != var35.field682.field2175);
                            var55.field869 = class406.field5732;
                        }
                    }
                    if (var35.field682 instanceof class30) {
                        int var69 = class99.field1313 + var38;
                        int var70 = var39 + class133.field1704;
                        class270 var71 = (class270) class472.field6537.method2552((long) (var69 | var70 << 14 | var35.field682.field2175 << 28), -1);
                        if (var71 != null) {
                            int var72 = 0;
                            class48 var73 = (class48) var71.field3567.method733(arg0 ^ 0xFFFFFF93);
                            while (var73 != null) {
                                class697 var74 = class761.field10628.method4169(var73.field491, (byte) -126);
                                if (class595.field8291 && class653.field9086.field2175 == var35.field682.field2175) {
                                    class135 var75 = class77.field944 == -1 ? null : class482.field6654.method296((byte) 31, class77.field944);
                                    if ((class372.field5190 & 0x1) != 0 && (var75 == null || var74.method3939(class77.field944, (byte) -89, var75.field1718) != var75.field1718)) {
                                        class65.field707++;
                                        class218.method1237(false, true, (long) var73.field491, class387.field5461, var38, class719.field10067 + " -> <col=ff9040>" + var74.field9780, false, var39, 58, (long) var72, -1, false, class702.field9857);
                                    }
                                }
                                if (class653.field9086.field2175 == var35.field682.field2175) {
                                    String[] var76 = var74.field9775;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 13;
                                            }
                                            int var79 = class457.field6330;
                                            if (var77 == 1) {
                                                var78 = 23;
                                            }
                                            if (var77 == 2) {
                                                var78 = 2;
                                            }
                                            if (var77 == 3) {
                                                var78 = 30;
                                            }
                                            if (var74.field9764 == var77) {
                                                var79 = var74.field9766;
                                            }
                                            if (var77 == 4) {
                                                var78 = 18;
                                            }
                                            if (var74.field9744 == var77) {
                                                var79 = var74.field9809;
                                            }
                                            class218.method1237(false, true, (long) var73.field491, var79, var38, "<col=ff9040>" + var74.field9780, false, var39, var78, (long) var72, -1, false, var76[var77]);
                                            class105.field1403++;
                                        }
                                    }
                                }
                                class537.field7291++;
                                class218.method1237(false, true, (long) var73.field491, class661.field9240, var38, "<col=ff9040>" + var74.field9780, false, var39, 1008, (long) var72, -1, class653.field9086.field2175 != var35.field682.field2175, class755.field10502.method4201(class723.field10095, (byte) 25));
                                var73 = (class48) var71.field3567.method722((byte) -121);
                                var72++;
                            }
                        }
                    }
                    if (var35.field682 instanceof class722) {
                        class722 var80 = (class722) var35.field682;
                        class685 var81 = class707.field9894.method4109(var80.method680(arg0 ^ 0x7708), (byte) 119);
                        if (var81.field9528 != null) {
                            var81 = var81.method3875(class386.field5455, (byte) -55);
                        }
                        if (var81 != null) {
                            if (class595.field8291 && class653.field9086.field2175 == var35.field682.field2175) {
                                class135 var82 = class77.field944 == -1 ? null : class482.field6654.method296((byte) 31, class77.field944);
                                if ((class372.field5190 & 0x4) != 0 && (var82 == null || var81.method3889(var82.field1718, class77.field944, arg0 ^ 0x1) != var82.field1718)) {
                                    class626.field8751++;
                                    class218.method1237(false, true, class565.method3181(var80, (byte) 113, var38, var39), class387.field5461, var38, class719.field10067 + " -> <col=00ffff>" + var81.field9559, false, var39, 50, (long) var80.hashCode(), -1, false, class702.field9857);
                                }
                            }
                            if (class653.field9086.field2175 == var35.field682.field2175) {
                                String[] var83 = var81.field9544;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 15;
                                            }
                                            int var86 = class457.field6330;
                                            if (var84 == 1) {
                                                var85 = 4;
                                            }
                                            if (var84 == 2) {
                                                var85 = 8;
                                            }
                                            if (var84 == 3) {
                                                var85 = 16;
                                            }
                                            if (var81.field9614 == var84) {
                                                var86 = var81.field9622;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1007;
                                            }
                                            if (var81.field9538 == var84) {
                                                var86 = var81.field9587;
                                            }
                                            class218.method1237(false, true, class565.method3181(var80, (byte) 113, var38, var39), var86, var38, "<col=00ffff>" + var81.field9559, false, var39, var85, (long) var80.hashCode(), -1, false, var83[var84]);
                                            class611.field8585++;
                                        }
                                    }
                                }
                                class350.field4639++;
                                class218.method1237(false, true, (long) var81.field9541, class661.field9240, var38, "<col=00ffff>" + var81.field9559, false, var39, 1009, (long) var80.hashCode(), -1, class653.field9086.field2175 != var35.field682.field2175, class755.field10502.method4201(class723.field10095, (byte) 25));
                            }
                        }
                    }
                }
            }
            if (class247.field3206) {
                class522.method2905((byte) 53);
            }
        }
        class558.method3158(-546, false);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 636)
    public static void method2847(boolean arg0) {
        field6965 = null;
        if (!arg0) {
            field6967 = -29;
        }
        field6964 = null;
        field6968 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 654)
    public static final void method2849(byte arg0) {
        field6961++;
        if (class256.field3310 != null) {
            class256.field3310.method342(-1);
            class335.field4532 = null;
            class256.field3310 = null;
        }
        if (arg0 != -79) {
            field6965 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIFIFIFF[FII)V")
    public abstract void method2848(int arg0, int arg1, float arg2, int arg3, float arg4, int arg5, float arg6, float arg7, float[] arg8, int arg9, int arg10);
}

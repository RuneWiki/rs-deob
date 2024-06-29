import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class511 {

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field7306 = 64;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lwf;")
    public static class145 field7304;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7309;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[Lsf;")
    public static class547[] field7305;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2983(int arg0, String arg1) {
        if (arg0 != -2371) {
            field7307 = 127;
        }
        field7308++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method2984(byte arg0) {
        field7305 = null;
        field7304 = null;
        field7309 = null;
        if (arg0 >= -127) {
            field7305 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method2985(int arg0) {
        if (arg0 >= -59) {
            method2986(-119, -63, 21, 25, null, null, null, null, null, null, 98, (byte) -44, 60, 123, true, true, 125, 15, false);
        }
        field7303++;
        if (class117.field1458 == null) {
            class117.field1458 = class496.method2900(12227);
            class515.field7364 = class117.field1458[0];
            class11.field241 = class109.method731(81);
        }
        if (class203.field2976 == null) {
            class531.method3086(110);
        }
        class496 var1 = class515.field7364;
        int var2 = class90.method634(1);
        if (class515.field7364 == var1) {
            class14.field261 = class515.field7364.field7029.method3825((byte) -10, class526.field7494);
            if (class515.field7364.field7032) {
                class469.field6698 = (class515.field7364.field7036 - class515.field7364.field7037) * var2 / 100 + class515.field7364.field7037;
            }
            if (class515.field7364.field7035) {
                class14.field261 = class14.field261 + class469.field6698 + "%";
            }
        } else if (class515.field7364 == class496.field7058) {
            class203.field2976 = null;
            class374.method2323(3, (byte) 65);
        } else {
            class14.field261 = var1.field7028.method3825((byte) -10, class526.field7494);
            class469.field6698 = var1.field7036;
            if (class515.field7364.field7035) {
                class14.field261 = class14.field261 + var1.field7036 + "%";
            }
            if (class515.field7364.field7032 || var1.field7032) {
                class11.field241 = class109.method731(54);
            }
        }
        if (class203.field2976 == null) {
            return;
        }
        class203.field2976.method625(class11.field241, class515.field7364, class14.field261, true, class469.field6698);
        if (class380.field5449 == null) {
            return;
        }
        for (int var3 = class696.field9830 + 1; var3 < class380.field5449.length; var3++) {
            if (class380.field5449[var3].method1536(9657) >= 100 && var3 - 1 == class696.field9830 && class757.field10456 >= 1 && class203.field2976.method620(-110)) {
                try {
                    class380.field5449[var3].method1541(-122);
                } catch (Exception var4) {
                    class380.field5449 = null;
                    return;
                }
                class203.field2976.method626(class380.field5449[var3], (byte) 90);
                class696.field9830++;
                if (class696.field9830 >= (class380.field5449.length - 1) && class380.field5449.length > 1) {
                    class696.field9830 = class693.field9791.method1798(-9899) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method2986(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class790.field10837 = true;
        class727.field10183 = class711.field10005.method471() > 0;
        class282.field4336 = arg15;
        class282.field4335 = arg1 >> class310.field4616;
        class301.field4521 = arg3 >> class310.field4616;
        class544.field7647 = arg1;
        class752.field10424 = arg3;
        class102.field1284 = arg2;
        class623.field8779 = class282.field4335 - class76.field1016;
        if (class623.field8779 < 0) {
            class521.field7442 = -class623.field8779;
            class623.field8779 = 0;
        } else {
            class521.field7442 = 0;
        }
        class366.field5282 = class301.field4521 - class76.field1016;
        if (class366.field5282 < 0) {
            class428.field6015 = -class366.field5282;
            class366.field5282 = 0;
        } else {
            class428.field6015 = 0;
        }
        class481.field6840 = class76.field1016 + class282.field4335;
        if (class481.field6840 > class151.field2074) {
            class481.field6840 = class151.field2074;
        }
        class517.field7391 = class76.field1016 + class301.field4521;
        if (class517.field7391 > class12.field249) {
            class517.field7391 = class12.field249;
        }
        boolean[][] var19 = class457.field6551;
        boolean[][] var20 = class250.field3544;
        if (class282.field4336) {
            for (int var21 = 0; var21 < class76.field1016 + class76.field1016 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class76.field1016 + class76.field1016 + 2; var24++) {
                    if (var24 > 1) {
                        class663.field9310[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class282.field4335 + var21 - class76.field1016;
                    int var26 = class301.field4521 + var24 - class76.field1016;
                    if (var25 >= 0 && var26 >= 0 && var25 < class151.field2074 && var26 < class12.field249) {
                        int var27 = var25 << class310.field4616;
                        int var28 = var26 << class310.field4616;
                        int var29 = class750.field10395[class750.field10395.length - 1].method1976(var25, -1, var26) - (0x3E8 << class310.field4616 - 7);
                        int var30 = class311.field4628 == null ? class750.field10395[0].method1976(var25, -1, var26) + class13.field254 : class311.field4628[0].method1976(var25, -1, var26) + class13.field254;
                        var23 = arg16 >= 0 ? class711.field10005.method452(var27, var29, var28, var27, var30, var28, arg16) : class711.field10005.method394(var27, var29, var28, var27, var30, var28);
                        class250.field3544[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class250.field3544[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class663.field9310[var24 - 1] & class663.field9310[var24] & var22 & var23;
                        class457.field6551[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class663.field9310[class76.field1016 + class76.field1016] = var22;
                class663.field9310[class76.field1016 + class76.field1016 + 1] = var23;
            }
            if (arg16 >= 0) {
                class790.field10837 = false;
            } else {
                class338.field5020 = arg5;
                class289.field4411 = arg6;
                class243.field3471 = arg7;
                class458.field6565 = arg8;
                class761.field10493 = arg9;
                class713.method4038((byte) -121, arg10, class711.field10005);
            }
        } else {
            if (class31.field418 == null) {
                class31.field418 = new boolean[class151.field2074 + class151.field2074 + 1][class151.field2074 + class12.field249 + 1];
            }
            for (int var32 = 0; var32 < class31.field418.length; var32++) {
                for (int var42 = 0; var42 < class31.field418[0].length; var42++) {
                    class31.field418[var32][var42] = true;
                }
            }
            class250.field3544 = class31.field418;
            class457.field6551 = class31.field418;
            class623.field8779 = 0;
            class366.field5282 = 0;
            class481.field6840 = class151.field2074;
            class517.field7391 = class12.field249;
            class790.field10837 = false;
        }
        class247.method1659((byte) 83, class711.field10005);
        if (!class619.field8726.field9156) {
            class310 var33 = class619.field8726.field9153;
            for (class167 var34 = (class167) var33.method2033(0); var34 != null; var34 = (class167) var33.method2025((byte) -88)) {
                var34.method592(2);
                class192.method1407(var34, 1949);
            }
        }
        if (class727.field10183) {
            for (int var35 = 0; var35 < class540.field7582; var35++) {
                class238.field3437[var35].method3936(arg0, -3, arg14);
            }
        }
        if (class437.field6253) {
            class421.field5943 = class711.field10005.method469();
            class711.field10005.method428(class426.field5997);
            int var36 = (class426.field5997[2] - class426.field5997[0]) / class347.field5092;
            for (int var37 = 0; var37 < class347.field5092 - 1; var37++) {
                class387.field5515[var37] = (var37 + 1) * var36 + class73.field988[var37];
            }
            for (int var38 = 0; var38 < class468.field6693.length; var38++) {
                class468.field6693[var38].method2666();
            }
        }
        if (class262.field3697 != null) {
            if (class437.field6253) {
                class115.method816(0);
            }
            class96.method680(true);
            class711.field10005.method468(-1, 1583160, 40, 127);
            class50.method330(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class437.field6253) {
                class612.method3525();
            }
            class711.field10005.method418();
            class96.method680(false);
        }
        class50.method330(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class437.field6253) {
            for (int var39 = 0; var39 < class456.field6545; var39++) {
                class361.field5238[var39] = class377.field5419[var39];
            }
            class115.method816(0);
            for (int var40 = 0; var40 < class468.field6693.length; var40++) {
                class468.field6693[var40].method2666();
            }
        }
        if (class437.field6253) {
            class612.method3525();
            for (int var41 = 0; var41 < class456.field6545; var41++) {
                class377.field5419[var41] = class361.field5238[var41];
            }
            if (class622.field8775 == 2) {
                int var10002;
                if (class88.field1146[0] < class88.field1146[1]) {
                    if (class73.field988[0] + class387.field5515[0] > class426.field5997[0]) {
                        var10002 = class73.field988[0]++;
                    }
                } else if (class88.field1146[0] > class88.field1146[1] && class73.field988[0] + class387.field5515[0] < class426.field5997[2]) {
                    var10002 = class73.field988[0]--;
                }
            }
        }
        if (!class282.field4336) {
            class457.field6551 = var19;
            class250.field3544 = var20;
        }
        class692.method3893();
    }
}

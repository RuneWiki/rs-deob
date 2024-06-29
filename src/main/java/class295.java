import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class295 {

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Loa;I)V", line = 3)
    public static final void method1844(class638 arg0, int arg1) {
        field4416++;
        int var2 = class113.field1532;
        int var3 = class174.field2605;
        int var4 = class364.field5200;
        int var5 = class371.field5287 - 3;
        byte var6 = 20;
        if (class208.field3076 == null || class232.field3300 == null) {
            if (class460.field6517.method947(124, class374.field5297) && class460.field6517.method947(-63, class301.field4466)) {
                class208.field3076 = arg0.method412(class543.method2990(class460.field6517, class374.field5297, 0), true);
                class543 var7 = class543.method2990(class460.field6517, class301.field4466, 0);
                class232.field3300 = arg0.method412(var7, true);
                var7.method2988();
                class168.field2538 = arg0.method412(var7, true);
            } else {
                arg0.method472(var2, var3, var4, var6, class599.field8327 | 255 - class19.field279 << 24, 1);
            }
        }
        if (class208.field3076 != null && class232.field3300 != null) {
            int var8 = (var4 - (class232.field3300.method31() * 2)) / class208.field3076.method31();
            for (int var9 = 0; var9 < var8; var9++) {
                class208.field3076.method2660(var2 - (-class232.field3300.method31() - (var9 * class208.field3076.method31())), var3);
            }
            class232.field3300.method2660(var2, var3);
            class168.field2538.method2660(var2 + var4 - class168.field2538.method31(), var3);
        }
        class548.field7419.method1307(var3 + 14, (byte) 125, -1, -16777216 | class318.field4718, class9.field158.method42(class666.field9377, 19572), var2 + 3);
        arg0.method472(var2, var3 + var6, var4, var5 - var6, -class19.field279 + 255 << 24 | class599.field8327, 1);
        int var10 = class46.field686.method70((byte) 112);
        int var11 = 45 % ((54 - arg1) / 38);
        int var12 = class46.field686.method66(74);
        int var13 = 0;
        for (class345 var14 = (class345) class487.field6761.method1270((byte) -25); var14 != null; var14 = (class345) class487.field6761.method1282(0)) {
            int var32 = (class315.field4697 - var13 - 1) * 16 + var3 + var6 + 13;
            var13++;
            if (var2 < var10 && (var2 + var4) > var10 && (var32 - 13) < var12 && var12 < (var32 + 4) && var14.field4989) {
                arg0.method472(var2, var32 - 12, var4, 16, class327.field4832 | 255 - class584.field8161 << 24, 1);
            }
        }
        if ((class302.field4470 == null || class427.field6006 == null || class491.field6788 == null) && class460.field6517.method947(-67, class490.field6778) && class460.field6517.method947(96, class423.field5967) && class460.field6517.method947(-67, class169.field2549)) {
            class543 var15 = class543.method2990(class460.field6517, class423.field5967, 0);
            class427.field6006 = arg0.method412(var15, true);
            var15.method2988();
            class535.field7289 = arg0.method412(var15, true);
            class302.field4470 = arg0.method412(class543.method2990(class460.field6517, class490.field6778, 0), true);
            class543 var16 = class543.method2990(class460.field6517, class169.field2549, 0);
            class491.field6788 = arg0.method412(var16, true);
            var16.method2988();
            class181.field2675 = arg0.method412(var16, true);
        }
        if (class302.field4470 != null && class427.field6006 != null && class491.field6788 != null) {
            int var17 = (var4 - (class491.field6788.method31() * 2)) / class302.field4470.method31();
            for (int var18 = 0; var18 < var17; var18++) {
                class302.field4470.method2660(var2 + class491.field6788.method31() + (var18 * class302.field4470.method31()), var3 + var5 - class302.field4470.method26());
            }
            int var19 = (var5 + (-var6 - class491.field6788.method26())) / class427.field6006.method26();
            for (int var20 = 0; var20 < var19; var20++) {
                class427.field6006.method2660(var2, var6 + (var3 + (var20 * class427.field6006.method26())));
                class535.field7289.method2660(var2 + var4 - class535.field7289.method31(), var20 * class427.field6006.method26() + var6 + var3);
            }
            class491.field6788.method2660(var2, var3 + var5 - class491.field6788.method26());
            class181.field2675.method2660(var4 + var2 - class491.field6788.method31(), var3 - (-var5 + class491.field6788.method26()));
        }
        int var21 = 0;
        for (class345 var22 = (class345) class487.field6761.method1270((byte) -25); var22 != null; var22 = (class345) class487.field6761.method1282(0)) {
            int var23 = (class315.field4697 - var21 - 1) * 16 + var3 - (-var6 - 13);
            int var24 = class318.field4718 | 0xFF000000;
            if (var10 > var2 && var10 < (var2 + var4) && (var23 - 13) < var12 && var12 < var23 + 4 && var22.field4989) {
                var24 = class371.field5283 | 0xFF000000;
            }
            int[] var25 = null;
            if (class375.method2187(var22.field4983, false)) {
                var25 = class648.field9184.method3064((int) var22.field4979, -9).field3610;
            } else if (var22.field4980 != -1) {
                var25 = class648.field9184.method3064(var22.field4980, -34).field3610;
            } else if (class287.method1729(var22.field4983, (byte) 17)) {
                class178 var26 = (class178) class323.field4762.method2061(-17305, (long) ((int) var22.field4979));
                if (var26 != null) {
                    class225 var27 = var26.field2634;
                    class161 var28 = var27.field3245;
                    if (var28.field2409 != null) {
                        var28 = var28.method1114(class195.field2888, 0);
                    }
                    if (var28 != null) {
                        var25 = var28.field2429;
                    }
                }
            } else if (class471.method2680(var22.field4983, -14)) {
                Object var29 = null;
                class620 var30;
                if (var22.field4983 == 1007) {
                    var30 = class164.field2499.method2013((int) var22.field4979, false);
                } else {
                    var30 = class164.field2499.method2013((int) (var22.field4979 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var30.field8623 != null) {
                    var30 = var30.method3450(-126, class195.field2888);
                }
                if (var30 != null) {
                    var25 = var30.field8572;
                }
            }
            String var31 = class172.method1183(var22, 0);
            if (var25 != null) {
                var31 = var31 + class366.method2140(4, var25);
            }
            class548.field7419.method1311(var24, var31, class124.field1721, 0, var23, var2 + 3, class206.field3038, 0);
            if (var22.field4984) {
                class545.field7386.method2660(class432.field6119.method3314(var31, -117) + var2 + 5, var23 - 12);
            }
            var21++;
        }
        class228.method1455(class174.field2605, class364.field5200, class113.field1532, -28440, class371.field5287);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z", line = 208)
    public static final boolean method1845(int arg0) throws IOException {
        field4413++;
        if (class53.field758 == null) {
            return false;
        }
        if (class290.field4382 == null) {
            if (class564.field7609) {
                if (!class53.field758.method3124((byte) 118, 1)) {
                    return false;
                }
                class53.field758.method3129(1, 0, (byte) 24, class602.field8356.field1316);
                class564.field7609 = false;
                class220.field3192 = 0;
                class661.field9310++;
            }
            class602.field8356.field1301 = 0;
            if (class602.field8356.method3725(-59)) {
                if (!class53.field758.method3124((byte) 118, 1)) {
                    return false;
                }
                class53.field758.method3129(1, 1, (byte) 98, class602.field8356.field1316);
                class220.field3192 = 0;
                class661.field9310++;
            }
            class564.field7609 = true;
            class235[] var1 = class240.method1507(true);
            int var2 = class602.field8356.method3728(23774);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class602.field8356.field1301);
            }
            class290.field4382 = var1[var2];
            class532.field7250 = class290.field4382.field3390;
        }
        if (class532.field7250 == -1) {
            if (!class53.field758.method3124((byte) 118, 1)) {
                return false;
            }
            class53.field758.method3129(1, 0, (byte) -89, class602.field8356.field1316);
            class532.field7250 = class602.field8356.field1316[0] & 0xFF;
            class220.field3192 = 0;
            class661.field9310++;
        }
        if (class532.field7250 == -2) {
            if (!class53.field758.method3124((byte) 118, 2)) {
                return false;
            }
            class53.field758.method3129(2, 0, (byte) 34, class602.field8356.field1316);
            class602.field8356.field1301 = 0;
            class532.field7250 = class602.field8356.method743((byte) -79);
            class220.field3192 = 0;
            class661.field9310 += 2;
        }
        if (class532.field7250 > 0) {
            if (!class53.field758.method3124((byte) 118, class532.field7250)) {
                return false;
            }
            class602.field8356.field1301 = 0;
            class53.field758.method3129(class532.field7250, 0, (byte) 26, class602.field8356.field1316);
            class661.field9310 += class532.field7250;
            class220.field3192 = 0;
        }
        class182.field2681 = class324.field4794;
        class324.field4794 = class522.field7092;
        class522.field7092 = class290.field4382;
        if (class74.field1025 == class290.field4382) {
            class177.method1202(class605.field8435, arg0 ^ 0xFFFF000F);
            class290.field4382 = null;
            return true;
        } else if (class643.field9139 == class290.field4382) {
            if (class164.field2504 != null) {
                class679.method3752(class274.field3872.field917, false, -1, (byte) -121, -1);
            }
            byte[] var3 = new byte[class532.field7250];
            class602.field8356.method3731(var3, -22580, 0, class532.field7250);
            String var4 = class210.method1384(0, class532.field7250, var3, (byte) -118);
            class106.method803(true, var4, class429.field6020 == 1, class503.field6878, false);
            class290.field4382 = null;
            return true;
        } else if (class622.field8662 == class290.field4382) {
            int var5 = class602.field8356.method743((byte) -13);
            int var6 = class602.field8356.method718(81);
            int var7 = class602.field8356.method718(arg0 + 65649);
            int var8 = class602.field8356.method743((byte) -37) << 2;
            int var9 = class602.field8356.method718(arg0 + 65461);
            int var10 = class602.field8356.method718(arg0 + 65650);
            if (class546.method3002(var5, 0)) {
                class289.method1742(true, var9, var7, -64, var10, var8, var6);
            }
            class290.field4382 = null;
            return true;
        } else if (class345.field4982 == class290.field4382) {
            int var11 = class602.field8356.method697(false);
            int var12 = class602.field8356.method699(arg0 ^ 0xFFFF007D);
            int var13 = class602.field8356.method754(0);
            if (class546.method3002(var13, 0)) {
                class243.method1509(var12, var11, (byte) 89);
            }
            class290.field4382 = null;
            return true;
        } else if (class30.field366 == class290.field4382) {
            String var14 = class602.field8356.method739(-112);
            boolean var15 = class602.field8356.method718(-123) == 1;
            String var16;
            if (var15) {
                var16 = class602.field8356.method739(51);
            } else {
                var16 = var14;
            }
            int var17 = class602.field8356.method743((byte) -74);
            byte var18 = class602.field8356.method748(-813976688);
            boolean var19 = false;
            if (var18 == -128) {
                var19 = true;
            }
            if (var19) {
                if (class473.field6605 == 0) {
                    class290.field4382 = null;
                    return true;
                }
                boolean var20 = false;
                int var21;
                for (var21 = 0; class473.field6605 > var21 && (!class623.field8674[var21].field5991.equals(var16) || class623.field8674[var21].field5989 != var17); var21++) {
                }
                if (var21 < class473.field6605) {
                    while (var21 < class473.field6605 - 1) {
                        class623.field8674[var21] = class623.field8674[var21 + 1];
                        var21++;
                    }
                    class473.field6605--;
                    class623.field8674[class473.field6605] = null;
                }
            } else {
                String var22 = class602.field8356.method739(-91);
                class425 var23 = new class425();
                var23.field5992 = var14;
                var23.field5991 = var16;
                var23.field5987 = class200.method1347((byte) -125, var23.field5991);
                var23.field5988 = var22;
                var23.field5989 = var17;
                var23.field5993 = var18;
                int var24;
                for (var24 = class473.field6605 - 1; var24 >= 0; var24--) {
                    int var25 = class623.field8674[var24].field5987.compareTo(var23.field5987);
                    if (var25 == 0) {
                        class623.field8674[var24].field5989 = var17;
                        class623.field8674[var24].field5993 = var18;
                        class623.field8674[var24].field5988 = var22;
                        if (var16.equals(class253.field3576.field3975)) {
                            class474.field6628 = var18;
                        }
                        class662.field9342 = class93.field1231;
                        class290.field4382 = null;
                        return true;
                    }
                    if (var25 < 0) {
                        break;
                    }
                }
                if (class623.field8674.length <= class473.field6605) {
                    class290.field4382 = null;
                    return true;
                }
                for (int var26 = class473.field6605 - 1; var26 > var24; var26--) {
                    class623.field8674[var26 + 1] = class623.field8674[var26];
                }
                if (class473.field6605 == 0) {
                    class623.field8674 = new class425[100];
                }
                class623.field8674[var24 + 1] = var23;
                class473.field6605++;
                if (var16.equals(class253.field3576.field3975)) {
                    class474.field6628 = var18;
                }
            }
            class290.field4382 = null;
            class662.field9342 = class93.field1231;
            return true;
        } else if (class553.field7503 == class290.field4382) {
            class664.method3684(false, false);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class206.field3048) {
            String var27 = class602.field8356.method739(-3);
            String var28 = class311.method1910(class115.method850(-14478, class602.field8356), true);
            class250.method1549(var27, var27, arg0 ^ 0xFFFF, var27, 6, var28, 0);
            class290.field4382 = null;
            return true;
        } else if (class66.field870 == class290.field4382) {
            class144.field2137 = class602.field8356.method718(arg0 + 65658);
            class290.field4382 = null;
            class656.field9242 = class93.field1231;
            return true;
        } else if (class460.field6513 == class290.field4382) {
            String var29 = class602.field8356.method739(75);
            int var30 = class602.field8356.method743((byte) -5);
            String var31 = class609.field8469.method77(var30, 13529).method3717(class602.field8356, arg0 + 76237);
            class669.method3710(var29, var31, var29, 19, -80, null, var29, var30, 0);
            class290.field4382 = null;
            return true;
        } else if (class583.field8125 == class290.field4382) {
            class177.method1202(class184.field2712, 15);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class257.field3657) {
            int var32 = class602.field8356.method743((byte) -104);
            int var33 = class602.field8356.method718(-124);
            int var34 = class602.field8356.method718(arg0 + 65649);
            int var35 = class602.field8356.method743((byte) -98) << 2;
            int var36 = class602.field8356.method718(-75);
            int var37 = class602.field8356.method718(arg0 ^ 0xFFFF0058);
            if (class546.method3002(var32, 0)) {
                class11.method53(var36, (byte) 111, var33, var35, var34, var37);
            }
            class290.field4382 = null;
            return true;
        } else if (class475.field6640 == class290.field4382) {
            int var38 = class602.field8356.method754(0);
            int var39 = class602.field8356.method754(0);
            int var40 = class602.field8356.method714(false);
            if (class546.method3002(var38, 0)) {
                class144.method1013(var39, 2, var40);
            }
            class290.field4382 = null;
            return true;
        } else if (class71.field976 == class290.field4382) {
            class177.method1202(class421.field5947, 15);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class119.field1571) {
            if (class202.method1352(class340.field4947, (byte) -28)) {
                class77.field1062 = (int) ((float) class602.field8356.method743((byte) -105) * 2.5F);
            } else {
                class77.field1062 = class602.field8356.method743((byte) -88) * 30;
            }
            class290.field4382 = null;
            class656.field9242 = class93.field1231;
            return true;
        } else if (class290.field4382 == class201.field2959) {
            boolean var41 = class602.field8356.method718(-84) == 1;
            byte[] var42 = new byte[class532.field7250 - 1];
            class602.field8356.method719(var42, class532.field7250 - 1, -7861, 0);
            class627.method3486(var42, arg0 ^ 0xFFFF004E, var41);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class136.field1922) {
            int var43 = class602.field8356.method718(79);
            boolean var44 = (var43 & 0x1) == 1;
            String var45 = class602.field8356.method739(arg0 ^ 0xFFFF004F);
            String var46 = class602.field8356.method739(18);
            if (var46.equals("")) {
                var46 = var45;
            }
            String var47 = class602.field8356.method739(arg0 ^ 0xFFFF007F);
            String var48 = class602.field8356.method739(63);
            if (var48.equals("")) {
                var48 = var47;
            }
            if (var44) {
                for (int var49 = 0; var49 < class261.field3711; var49++) {
                    if (class272.field3836[var49].equals(var48)) {
                        client.field3854[var49] = var45;
                        class272.field3836[var49] = var46;
                        class325.field4809[var49] = var47;
                        class24.field327[var49] = var48;
                        break;
                    }
                }
            } else {
                client.field3854[class261.field3711] = var45;
                class272.field3836[class261.field3711] = var46;
                class325.field4809[class261.field3711] = var47;
                class24.field327[class261.field3711] = var48;
                class357.field5121[class261.field3711] = class249.method1537(2, var43) == 2;
                class261.field3711++;
            }
            class200.field2957 = class93.field1231;
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class165.field2509) {
            int var50 = class602.field8356.method747(30);
            int var51 = class602.field8356.method743((byte) -8);
            int var52 = class602.field8356.method718(77);
            class178 var53 = (class178) class323.field4762.method2061(-17305, (long) var51);
            if (var53 != null) {
                class546.method3003(var52, var50, var53.field2634, 9696);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class126.field1753) {
            class577.field7760 = class602.field8356.method713((byte) -104);
            class628.field8773 = class602.field8356.method718(arg0 ^ 0xFF92);
            class290.field4382 = null;
            return true;
        } else if (class637.field9047 == class290.field4382) {
            int var54 = class602.field8356.method726((byte) 123);
            int var55 = class602.field8356.method710(arg0 ^ 0xFFD5);
            int var56 = class602.field8356.method747(53);
            if (var56 == 65535) {
                var56 = -1;
            }
            class601.method3334(var56, (byte) -91, var55, var54);
            class290.field4382 = null;
            return true;
        } else if (class647.field9183 == class290.field4382) {
            int var57 = class602.field8356.method743((byte) -123);
            if (var57 == 65535) {
                var57 = -1;
            }
            int var58 = class602.field8356.method736(-125);
            int var59 = class602.field8356.method710(90);
            class284.method1712(arg0 ^ 0xFFFF0000, var57, var58, var59);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class184.field2711) {
            int var60 = class602.field8356.method726((byte) 126);
            int var61 = class602.field8356.method754(0);
            boolean var62 = (var60 & 0x1) == 1;
            class664.method3686(var62, var61, 26621);
            class144.field2140[class249.method1537(31, class379.field5342++)] = var61;
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class213.field3107) {
            int var63 = class602.field8356.method743((byte) -121);
            String var64 = class602.field8356.method739(-107);
            Object[] var65 = new Object[var64.length() + 1];
            for (int var66 = var64.length() - 1; var66 >= 0; var66--) {
                if (var64.charAt(var66) == 's') {
                    var65[var66 + 1] = class602.field8356.method739(arg0 + 65529);
                } else {
                    var65[var66 + 1] = Integer.valueOf(class602.field8356.method714(false));
                }
            }
            var65[0] = Integer.valueOf(class602.field8356.method714(false));
            if (class546.method3002(var63, arg0 ^ 0xFFFF0000)) {
                class388 var67 = new class388();
                var67.field5451 = var65;
                class523.method2890(var67);
            }
            class290.field4382 = null;
            return true;
        } else if (class340.field4943 == class290.field4382) {
            int var68 = class602.field8356.method718(-53);
            int var69 = var68 >> 5;
            int var70 = var68 & 0x1F;
            if (var70 == 0) {
                class652.field9219[var69] = null;
                class290.field4382 = null;
                return true;
            }
            class375 var71 = new class375();
            var71.field5317 = var70;
            var71.field5316 = class602.field8356.method718(74);
            if (var71.field5316 >= 0 && var71.field5316 < class36.field452.length) {
                if (var71.field5317 == 1 || var71.field5317 == 10) {
                    var71.field5314 = class602.field8356.method743((byte) -67);
                    class602.field8356.field1301 += 6;
                } else if (var71.field5317 >= 2 && var71.field5317 <= 6) {
                    if (var71.field5317 == 2) {
                        var71.field5322 = 256;
                        var71.field5310 = 256;
                    }
                    if (var71.field5317 == 3) {
                        var71.field5322 = 0;
                        var71.field5310 = 256;
                    }
                    if (var71.field5317 == 4) {
                        var71.field5322 = 512;
                        var71.field5310 = 256;
                    }
                    if (var71.field5317 == 5) {
                        var71.field5310 = 0;
                        var71.field5322 = 256;
                    }
                    if (var71.field5317 == 6) {
                        var71.field5322 = 256;
                        var71.field5310 = 512;
                    }
                    var71.field5317 = 2;
                    var71.field5309 = class602.field8356.method718(-83);
                    var71.field5322 += class602.field8356.method743((byte) -94) - class511.field6989 << 9;
                    var71.field5310 += class602.field8356.method743((byte) -101) - class124.field1726 << 9;
                    var71.field5320 = class602.field8356.method718(100) << 2;
                    var71.field5321 = class602.field8356.method743((byte) -26);
                }
                var71.field5319 = class602.field8356.method743((byte) -4);
                if (var71.field5319 == 65535) {
                    var71.field5319 = -1;
                }
                class652.field9219[var69] = var71;
            }
            class290.field4382 = null;
            return true;
        } else if (class355.field5092 == class290.field4382) {
            class177.method1202(class580.field7908, 15);
            class290.field4382 = null;
            return true;
        } else if (class460.field6508 == class290.field4382) {
            int var72 = class602.field8356.method743((byte) -53);
            int var73 = class602.field8356.method718(108);
            int var74 = class602.field8356.method718(109);
            int var75 = class602.field8356.method718(78);
            int var76 = class602.field8356.method718(arg0 + 65413);
            int var77 = class602.field8356.method743((byte) -48);
            if (class546.method3002(var72, 0)) {
                class459.field6496[var73] = true;
                class506.field6925[var73] = var74;
                class399.field5544[var73] = var75;
                class348.field5018[var73] = var76;
                class628.field8770[var73] = var77;
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class168.field2536) {
            int var78 = class602.field8356.method743((byte) -111);
            int var79 = class602.field8356.method703((byte) 126);
            class195.field2888.method876(arg0 ^ 0xFFFF, var78, var79);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class14.field218) {
            class528.method2930(class302.field4467, 2);
            class290.field4382 = null;
            return false;
        } else if (class623.field8693 == class290.field4382) {
            int var80 = class602.field8356.method714(false);
            class124.field1708 = class503.field6878.method613(var80, 7324);
            class290.field4382 = null;
            return true;
        } else if (class475.field6638 == class290.field4382) {
            int var81 = class602.field8356.method747(35);
            int var82 = class602.field8356.method707(18523);
            if (class546.method3002(var81, arg0 + 65536)) {
                class349.method2075(var82, -1, -1, 3, (byte) -117);
            }
            class290.field4382 = null;
            return true;
        } else if (class97.field1321 == class290.field4382) {
            class177.method1202(class662.field9336, 15);
            class290.field4382 = null;
            return true;
        } else if (arg0 != -65536) {
            return true;
        } else if (class290.field4382 == class274.field3865) {
            int var83 = class602.field8356.method743((byte) -30);
            int var84 = class602.field8356.method714(false);
            if (class546.method3002(var83, 0)) {
                class198 var85 = (class198) class368.field5262.method2061(arg0 + 48231, (long) var84);
                if (var85 != null) {
                    class258.method1594(false, -102, true, var85);
                }
                if (class88.field1195 != null) {
                    class432.method2481(class88.field1195, -121);
                    class88.field1195 = null;
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class585.field8170 == class290.field4382) {
            int var86 = class602.field8356.method747(70);
            byte var87 = class602.field8356.method750(arg0 + 78800);
            class195.field2888.method872(-1, var87, var86);
            class290.field4382 = null;
            return true;
        } else if (class626.field8736 == class290.field4382) {
            int var88 = class602.field8356.method747(83);
            int var89 = class602.field8356.method703((byte) 127);
            int var90 = class602.field8356.method718(122);
            if (class546.method3002(var88, 0)) {
                class308.method1893(7, var90, var89);
            }
            class290.field4382 = null;
            return true;
        } else if (class83.field1156 == class290.field4382) {
            class186.field2761 = class602.field8356.method748(-813976688) << 3;
            class490.field6780 = class602.field8356.method710(arg0 + 65644);
            class103.field1392 = class602.field8356.method750(13264) << 3;
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class106.field1419) {
            class261.field3711 = class602.field8356.method718(-119);
            for (int var91 = 0; var91 < class261.field3711; var91++) {
                client.field3854[var91] = class602.field8356.method739(class602.method3336(arg0, 65419));
                class272.field3836[var91] = class602.field8356.method739(-107);
                if (class272.field3836[var91].equals("")) {
                    class272.field3836[var91] = client.field3854[var91];
                }
                class325.field4809[var91] = class602.field8356.method739(class602.method3336(arg0, 65434));
                class24.field327[var91] = class602.field8356.method739(arg0 + 65537);
                if (class24.field327[var91].equals("")) {
                    class24.field327[var91] = class325.field4809[var91];
                }
                class357.field5121[var91] = false;
            }
            class200.field2957 = class93.field1231;
            class290.field4382 = null;
            return true;
        } else if (class568.field7650 == class290.field4382) {
            class257.method1590(true);
            class290.field4382 = null;
            return true;
        } else if (class525.field7186 == class290.field4382) {
            boolean var92 = class602.field8356.method718(arg0 ^ 0xFFFF0057) == 1;
            String var93 = class602.field8356.method739(arg0 ^ 0xFF8D);
            String var94 = var93;
            if (var92) {
                var94 = class602.field8356.method739(77);
            }
            long var95 = (long) class602.field8356.method743((byte) -53);
            long var97 = (long) class602.field8356.method736(-122);
            int var99 = class602.field8356.method718(arg0 ^ 0xFFFF004D);
            int var100 = class602.field8356.method743((byte) -18);
            long var101 = (var95 << 32) + var97;
            boolean var103 = false;
            int var104 = 0;
            while (true) {
                if (var104 >= 100) {
                    if (var99 <= 1 && class250.method1545(true, var94)) {
                        var103 = true;
                    }
                    break;
                }
                if (class367.field5240[var104] == var101) {
                    var103 = true;
                    break;
                }
                var104++;
            }
            if (!var103 && class153.field2297 == 0) {
                class367.field5240[class426.field5994] = var101;
                class426.field5994 = (class426.field5994 + 1) % 100;
                String var105 = class609.field8469.method77(var100, 13529).method3717(class602.field8356, 10701);
                if (var99 == 2) {
                    class669.method3710(var93, var105, "<img=1>" + var94, 18, -116, null, "<img=1>" + var93, var100, 0);
                } else if (var99 == 1) {
                    class669.method3710(var93, var105, "<img=0>" + var94, 18, arg0 + 65451, null, "<img=0>" + var93, var100, 0);
                } else {
                    class669.method3710(var93, var105, var94, 18, -114, null, var93, var100, 0);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class650.field9204 == class290.field4382) {
            while (class602.field8356.field1301 < class532.field7250) {
                boolean var116 = class602.field8356.method718(88) == 1;
                String var117 = class602.field8356.method739(36);
                String var118 = class602.field8356.method739(-112);
                int var119 = class602.field8356.method743((byte) -96);
                int var120 = class602.field8356.method718(-63);
                String var121 = "";
                boolean var122 = false;
                if (var119 > 0) {
                    var121 = class602.field8356.method739(-108);
                    var122 = class602.field8356.method718(arg0 + 65657) == 1;
                }
                for (int var123 = 0; var123 < class372.field5293; var123++) {
                    if (var116) {
                        if (var118.equals(class129.field1779[var123])) {
                            class129.field1779[var123] = var117;
                            var117 = null;
                            class460.field6515[var123] = var118;
                            break;
                        }
                    } else if (var117.equals(class129.field1779[var123])) {
                        if (class575.field7734[var123] != var119) {
                            boolean var124 = true;
                            for (class261 var125 = (class261) class174.field2600.method3676((byte) -68); var125 != null; var125 = (class261) class174.field2600.method3682(-18176)) {
                                if (var125.field3710.equals(var117)) {
                                    if (var119 != 0 && var125.field3709 == 0) {
                                        var125.method118(-30545);
                                        var124 = false;
                                    } else if (var119 == 0 && var125.field3709 != 0) {
                                        var124 = false;
                                        var125.method118(-30545);
                                    }
                                }
                            }
                            if (var124) {
                                class174.field2600.method3679(new class261(var117, var119), 0);
                            }
                            class575.field7734[var123] = var119;
                        }
                        class460.field6515[var123] = var118;
                        class653.field9224[var123] = var121;
                        class633.field8868[var123] = var120;
                        class264.field3748[var123] = var122;
                        var117 = null;
                        break;
                    }
                }
                if (var117 != null && class372.field5293 < 200) {
                    class129.field1779[class372.field5293] = var117;
                    class460.field6515[class372.field5293] = var118;
                    class575.field7734[class372.field5293] = var119;
                    class653.field9224[class372.field5293] = var121;
                    class633.field8868[class372.field5293] = var120;
                    class264.field3748[class372.field5293] = var122;
                    class372.field5293++;
                }
            }
            class200.field2957 = class93.field1231;
            class539.field7312 = 2;
            boolean var106 = false;
            int var107 = class372.field5293;
            while (var107 > 0) {
                var107--;
                boolean var108 = true;
                for (int var109 = 0; var109 < var107; var109++) {
                    if (class575.field7734[var109] != class195.field2887.field5522 && class575.field7734[var109 + 1] == class195.field2887.field5522 || class575.field7734[var109] == 0 && class575.field7734[var109 + 1] != 0) {
                        int var110 = class575.field7734[var109];
                        class575.field7734[var109] = class575.field7734[var109 + 1];
                        class575.field7734[var109 + 1] = var110;
                        String var111 = class653.field9224[var109];
                        class653.field9224[var109] = class653.field9224[var109 + 1];
                        class653.field9224[var109 + 1] = var111;
                        String var112 = class129.field1779[var109];
                        class129.field1779[var109] = class129.field1779[var109 + 1];
                        class129.field1779[var109 + 1] = var112;
                        String var113 = class460.field6515[var109];
                        class460.field6515[var109] = class460.field6515[var109 + 1];
                        class460.field6515[var109 + 1] = var113;
                        int var114 = class633.field8868[var109];
                        class633.field8868[var109] = class633.field8868[var109 + 1];
                        class633.field8868[var109 + 1] = var114;
                        boolean var115 = class264.field3748[var109];
                        class264.field3748[var109] = class264.field3748[var109 + 1];
                        var108 = false;
                        class264.field3748[var109 + 1] = var115;
                    }
                }
                if (var108) {
                    break;
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class400.field5554 == class290.field4382) {
            class290.field4382 = null;
            class200.field2957 = class93.field1231;
            class539.field7312 = 1;
            return true;
        } else if (class302.field4468 == class290.field4382) {
            class662.field9342 = class93.field1231;
            if (class532.field7250 == 0) {
                class623.field8674 = null;
                class85.field1176 = null;
                class604.field8392 = null;
                class290.field4382 = null;
                class473.field6605 = 0;
                return true;
            }
            class85.field1176 = class602.field8356.method739(-93);
            boolean var126 = class602.field8356.method718(arg0 ^ 0xFFB7) == 1;
            if (var126) {
                class602.field8356.method739(-116);
            }
            long var127 = class602.field8356.method715(true);
            class604.field8392 = class170.method1166(var127, (byte) -128);
            class672.field9461 = class602.field8356.method748(arg0 ^ 0x3084B390);
            int var129 = class602.field8356.method718(-93);
            if (var129 == 255) {
                class290.field4382 = null;
                return true;
            }
            class473.field6605 = var129;
            class425[] var130 = new class425[100];
            for (int var131 = 0; var131 < class473.field6605; var131++) {
                var130[var131] = new class425();
                var130[var131].field5992 = class602.field8356.method739(30);
                boolean var137 = class602.field8356.method718(arg0 + 65620) == 1;
                if (var137) {
                    var130[var131].field5991 = class602.field8356.method739(-121);
                } else {
                    var130[var131].field5991 = var130[var131].field5992;
                }
                var130[var131].field5987 = class200.method1347((byte) -117, var130[var131].field5991);
                var130[var131].field5989 = class602.field8356.method743((byte) -34);
                var130[var131].field5993 = class602.field8356.method748(arg0 - 813911152);
                var130[var131].field5988 = class602.field8356.method739(69);
                if (var130[var131].field5991.equals(class253.field3576.field3975)) {
                    class474.field6628 = var130[var131].field5993;
                }
            }
            boolean var132 = false;
            int var133 = class473.field6605;
            while (var133 > 0) {
                var133--;
                boolean var134 = true;
                for (int var135 = 0; var135 < var133; var135++) {
                    if (var130[var135].field5987.compareTo(var130[var135 + 1].field5987) > 0) {
                        class425 var136 = var130[var135];
                        var130[var135] = var130[var135 + 1];
                        var134 = false;
                        var130[var135 + 1] = var136;
                    }
                }
                if (var134) {
                    break;
                }
            }
            class290.field4382 = null;
            class623.field8674 = var130;
            return true;
        } else if (class686.field9643 == class290.field4382) {
            class177.method1202(class106.field1427, 15);
            class290.field4382 = null;
            return true;
        } else if (class667.field9392 == class290.field4382) {
            int var138 = class602.field8356.method697(false);
            int var139 = class602.field8356.method756((byte) 101);
            int var140 = class602.field8356.method703((byte) 127);
            int var141 = class602.field8356.method756((byte) 101);
            if (class546.method3002(var139, 0)) {
                class349.method2075(var140, var141, var138, 5, (byte) -119);
            }
            class290.field4382 = null;
            return true;
        } else if (class375.field5308 == class290.field4382) {
            int var142 = class602.field8356.method697(false);
            int var143 = class602.field8356.method747(83);
            if (class546.method3002(var143, 0)) {
                class349.method2075(var142, class27.field343, 0, 5, (byte) -125);
            }
            class290.field4382 = null;
            return true;
        } else if (class92.field1214 == class290.field4382) {
            int var144 = class602.field8356.method756((byte) 101);
            int var145 = class602.field8356.method743((byte) -90);
            if (var145 == 65535) {
                var145 = -1;
            }
            int var146 = class602.field8356.method714(false);
            if (class546.method3002(var144, 0)) {
                class607.method3356(var146, var145, -2);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class269.field3818) {
            int var147 = class602.field8356.method718(-98);
            if (class602.field8356.method718(-106) == 0) {
                class152.field2277[var147] = new class76();
            } else {
                class602.field8356.field1301--;
                class152.field2277[var147] = new class76(class602.field8356);
            }
            class290.field4382 = null;
            class364.field5201 = class93.field1231;
            return true;
        } else if (class509.field6970 == class290.field4382) {
            int var148 = class602.field8356.method710(89);
            int var149 = var148 >> 2;
            int var150 = var148 & 0x3;
            int var151 = class469.field6565[var149];
            int var152 = class602.field8356.method707(18523);
            int var153 = (var152 & 0x3F3F0F90) >> 28;
            int var154 = var152 >> 14 & 0x3FFF;
            int var155 = var152 & 0x3FFF;
            int var156 = class602.field8356.method754(0);
            int var157 = var155 - class124.field1726;
            int var158 = var154 - class511.field6989;
            if (var156 == 65535) {
                var156 = -1;
            }
            class651.method3620(var151, var149, var153, var150, var157, var156, var158, -69);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class281.field3923) {
            class195.field2888.method869((byte) -121);
            class170.field2557 += 32;
            class290.field4382 = null;
            return true;
        } else if (class414.field5854 == class290.field4382) {
            boolean var159 = class602.field8356.method718(-112) == 1;
            String var160 = class602.field8356.method739(-120);
            String var161 = var160;
            if (var159) {
                var161 = class602.field8356.method739(13);
            }
            int var162 = class602.field8356.method718(arg0 + 65615);
            int var163 = class602.field8356.method743((byte) -103);
            boolean var164 = false;
            if (var162 <= 1 && class250.method1545(true, var161)) {
                var164 = true;
            }
            if (!var164 && class153.field2297 == 0) {
                String var165 = class609.field8469.method77(var163, 13529).method3717(class602.field8356, arg0 ^ 0xFFFF29CD);
                if (var162 == 2) {
                    class669.method3710(var160, var165, "<img=1>" + var161, 25, -93, null, "<img=1>" + var160, var163, 0);
                } else if (var162 == 1) {
                    class669.method3710(var160, var165, "<img=0>" + var161, 25, -96, null, "<img=0>" + var160, var163, 0);
                } else {
                    class669.method3710(var160, var165, var161, 25, -113, null, var160, var163, 0);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class663.field9355 == class290.field4382) {
            for (int var166 = 0; var166 < class495.field6821.length; var166++) {
                if (class495.field6821[var166] != null) {
                    class495.field6821[var166].field6398 = -1;
                }
            }
            for (int var167 = 0; var167 < class679.field9578; var167++) {
                class252.field3537[var167].field2634.field6398 = -1;
            }
            class290.field4382 = null;
            return true;
        } else if (class495.field6820 == class290.field4382) {
            class420.field5943 = class602.field8356.method722(4);
            class290.field4382 = null;
            class656.field9242 = class93.field1231;
            return true;
        } else if (class290.field4382 == class230.field3282) {
            int var168 = class602.field8356.method743((byte) -52);
            int var169 = class602.field8356.method743((byte) -74);
            int var170 = class602.field8356.method743((byte) -60);
            int var171 = class602.field8356.method743((byte) -93);
            if (class546.method3002(var168, 0) && class676.field9545[var169] != null) {
                for (int var172 = var170; var172 < var171; var172++) {
                    int var173 = class602.field8356.method736(arg0 + 65416);
                    if (var172 < class676.field9545[var169].length && class676.field9545[var169][var172] != null) {
                        class676.field9545[var169][var172].field1965 = var173;
                    }
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class81.field1137 == class290.field4382) {
            class177.method1202(class364.field5198, arg0 ^ 0xFFFF000F);
            class290.field4382 = null;
            return true;
        } else if (class500.field6864 == class290.field4382) {
            class167.method1155(class602.field8356.method739(arg0 + 65410), (byte) 125);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class238.field3421) {
            class399.field5543 = class602.field8356.method753(1950018080);
            class451.field6295 = class602.field8356.method718(98) == 1;
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class159.field2382) {
            String var174 = class602.field8356.method739(-100);
            int var175 = class602.field8356.method756((byte) 101);
            int var176 = class602.field8356.method754(0);
            if (class546.method3002(var175, 0)) {
                class219.method1415(var176, 11447, var174);
            }
            class290.field4382 = null;
            return true;
        } else if (class498.field6845 == class290.field4382) {
            boolean var177 = class602.field8356.method718(arg0 + 65647) == 1;
            String var178 = class602.field8356.method739(arg0 + 65409);
            String var179 = var178;
            if (var177) {
                var179 = class602.field8356.method739(-112);
            }
            long var180 = class602.field8356.method715(true);
            long var182 = (long) class602.field8356.method743((byte) -103);
            long var184 = (long) class602.field8356.method736(arg0 + 65410);
            int var186 = class602.field8356.method718(82);
            int var187 = class602.field8356.method743((byte) -59);
            long var188 = (var182 << 32) + var184;
            boolean var190 = false;
            int var191 = 0;
            while (true) {
                if (var191 >= 100) {
                    if (var186 <= 1 && class250.method1545(true, var179)) {
                        var190 = true;
                    }
                    break;
                }
                if (class367.field5240[var191] == var188) {
                    var190 = true;
                    break;
                }
                var191++;
            }
            if (!var190 && class153.field2297 == 0) {
                class367.field5240[class426.field5994] = var188;
                class426.field5994 = (class426.field5994 + 1) % 100;
                String var192 = class609.field8469.method77(var187, arg0 ^ 0xFFFF34D9).method3717(class602.field8356, 10701);
                if (var186 == 2) {
                    class669.method3710(var178, var192, "<img=1>" + var179, 20, -89, class456.method2628(37, var180), "<img=1>" + var178, var187, 0);
                } else if (var186 == 1) {
                    class669.method3710(var178, var192, "<img=0>" + var179, 20, -88, class456.method2628(37, var180), "<img=0>" + var178, var187, 0);
                } else {
                    class669.method3710(var178, var192, var179, 20, -90, class456.method2628(37, var180), var178, var187, 0);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class531.field7239 == class290.field4382) {
            int var193 = class602.field8356.method756((byte) 101);
            int var194 = class602.field8356.method747(arg0 ^ 0xFFFF004D);
            int var195 = class602.field8356.method707(18523);
            if (class546.method3002(var193, 0)) {
                class114.method849(var194, (byte) 61, var195);
            }
            class290.field4382 = null;
            return true;
        } else if (class634.field8918 == class290.field4382) {
            int var196 = class602.field8356.method714(false);
            String var197 = class602.field8356.method739(-126);
            int var198 = class602.field8356.method743((byte) -63);
            if (class546.method3002(var198, 0)) {
                class9.method43(-122, var196, var197);
            }
            class290.field4382 = null;
            return true;
        } else if (class476.field6653 == class290.field4382) {
            int var199 = class602.field8356.method747(arg0 + 65642);
            int var200 = class602.field8356.method703((byte) 127);
            int var201 = class602.field8356.method754(arg0 + 65536);
            int var202 = class602.field8356.method713((byte) -104);
            if (class546.method3002(var201, 0)) {
                class198 var203 = (class198) class368.field5262.method2061(arg0 ^ 0xBC67, (long) var200);
                if (var203 != null) {
                    class258.method1594(false, -122, var203.field2922 != var199, var203);
                }
                class590.method3280(var200, false, var202, var199, 124);
            }
            class290.field4382 = null;
            return true;
        } else if (class435.field6145 == class290.field4382) {
            class290.field4382 = null;
            return false;
        } else if (class506.field6929 == class290.field4382) {
            class177.method1202(class644.field9149, arg0 + 65551);
            class290.field4382 = null;
            return true;
        } else if (class577.field7758 == class290.field4382) {
            class434.field6141 = class413.method2355(arg0 ^ 0xFFFF004E, class602.field8356.method718(-72));
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class18.field276) {
            int var204 = class602.field8356.method714(false);
            int var205 = class602.field8356.method743((byte) -99);
            int var206 = class602.field8356.method756((byte) 101);
            if (class546.method3002(var205, 0)) {
                class665.method3690((byte) 29, var204, var206);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class143.field2133) {
            class201.method1350(false);
            class290.field4382 = null;
            return false;
        } else if (class290.field4382 == class125.field1746) {
            int var207 = class602.field8356.method754(arg0 ^ 0xFFFF0000);
            int var208 = class602.field8356.method747(arg0 ^ 0xFFFF0023);
            if (var208 == 65535) {
                var208 = -1;
            }
            int var209 = class602.field8356.method707(arg0 + 84059);
            if (class546.method3002(var207, 0)) {
                class349.method2075(var209, var208, -1, 1, (byte) -104);
            }
            class290.field4382 = null;
            return true;
        } else if (class583.field8120 == class290.field4382) {
            int var210 = class602.field8356.method743((byte) -119);
            int var211 = class602.field8356.method747(82);
            int var212 = class602.field8356.method747(53);
            if (var212 == 65535) {
                var212 = -1;
            }
            int var213 = class602.field8356.method703((byte) 127);
            int var214 = class602.field8356.method743((byte) -2);
            if (var214 == 65535) {
                var214 = -1;
            }
            if (class546.method3002(var211, 0)) {
                for (int var215 = var212; var215 <= var214; var215++) {
                    long var216 = ((long) var213 << 32) + (long) var215;
                    class513 var218 = (class513) class422.field5960.method2061(-17305, var216);
                    class513 var219;
                    if (var218 != null) {
                        var219 = new class513(var218.field7010, var210);
                        var218.method2971(1);
                    } else if (var215 == -1) {
                        var219 = new class513(class266.method1626(var213, arg0 ^ 0xFFFF0071).field1982.field7010, var210);
                    } else {
                        var219 = new class513(0, var210);
                    }
                    class422.field5960.method2063(var216, 1, var219);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class418.field5888 == class290.field4382) {
            int var220 = class602.field8356.method743((byte) -94);
            if (var220 == 65535) {
                var220 = -1;
            }
            int var221 = class602.field8356.method718(arg0 ^ 0xFFBE);
            int var222 = class602.field8356.method743((byte) -11);
            int var223 = class602.field8356.method718(-100);
            class431.method2444(var223, var221, true, var222, var220, -1);
            class290.field4382 = null;
            return true;
        } else if (class388.field5454 == class290.field4382) {
            int var224 = class602.field8356.method697(false);
            int var225 = class602.field8356.method756((byte) 101);
            int var226 = class602.field8356.method703((byte) 127);
            if (class546.method3002(var225, 0)) {
                class198 var227 = (class198) class368.field5262.method2061(-17305, (long) var224);
                class198 var228 = (class198) class368.field5262.method2061(arg0 ^ 0xBC67, (long) var226);
                if (var228 != null) {
                    class258.method1594(false, -126, var227 == null || var227.field2922 != var228.field2922, var228);
                }
                if (var227 != null) {
                    var227.method2971(1);
                    class368.field5262.method2063((long) var226, arg0 + 65537, var227);
                }
                class140 var229 = class266.method1626(var224, arg0 + 65654);
                if (var229 != null) {
                    class432.method2481(var229, 114);
                }
                class140 var230 = class266.method1626(var226, arg0 ^ 0xFFFF0071);
                if (var230 != null) {
                    class432.method2481(var230, -78);
                    class316.method1936(var230, true, (byte) -85);
                }
                if (class677.field9551 != -1) {
                    class589.method3274(class677.field9551, 1, (byte) 52);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class52.field747 == class290.field4382) {
            int var231 = class602.field8356.method754(0);
            if (var231 == 65535) {
                var231 = -1;
            }
            int var232 = class602.field8356.method754(0);
            int var233 = class602.field8356.method714(false);
            int var234 = class602.field8356.method756((byte) 101);
            if (var234 == 65535) {
                var234 = -1;
            }
            int var235 = class602.field8356.method707(arg0 + 84059);
            if (class546.method3002(var232, 0)) {
                for (int var236 = var234; var236 <= var231; var236++) {
                    long var237 = ((long) var233 << 32) + (long) var236;
                    class513 var239 = (class513) class422.field5960.method2061(arg0 ^ 0xBC67, var237);
                    class513 var240;
                    if (var239 != null) {
                        var240 = new class513(var235, var239.field7014);
                        var239.method2971(1);
                    } else if (var236 == -1) {
                        var240 = new class513(var235, class266.method1626(var233, 106).field1982.field7014);
                    } else {
                        var240 = new class513(var235, -1);
                    }
                    class422.field5960.method2063(var237, 1, var240);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class91.field1212 == class290.field4382) {
            class216.method1406(class532.field7250, 0, class602.field8356);
            class290.field4382 = null;
            return true;
        } else if (class586.field8190 == class290.field4382) {
            class665.method3689(false);
            class290.field4382 = null;
            return false;
        } else if (class312.field4626 == class290.field4382) {
            int var241 = class602.field8356.method707(18523);
            int var242 = class602.field8356.method754(arg0 ^ 0xFFFF0000);
            class195.field2888.method872(-1, var241, var242);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class230.field3280) {
            int var243 = class602.field8356.method743((byte) -27);
            int var244 = class602.field8356.method743((byte) -22);
            int var245 = class602.field8356.method756((byte) 101);
            int var246 = class602.field8356.method747(82);
            int var247 = class602.field8356.method697(false);
            if (class546.method3002(var244, 0)) {
                class349.method2075(var247, var245 << 16 | var243, var246, 7, (byte) -111);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class154.field2323) {
            class602.field8356.field1301 += 28;
            if (class602.field8356.method717(-73)) {
                class635.method3530(27336, class602.field8356, class602.field8356.field1301 - 28);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class272.field3834) {
            class177.method1202(class583.field8122, 15);
            class290.field4382 = null;
            return true;
        } else if (class77.field1060 == class290.field4382) {
            class177.method1202(class694.field9743, 15);
            class290.field4382 = null;
            return true;
        } else if (class371.field5286 == class290.field4382) {
            int var248 = class602.field8356.method743((byte) -42);
            int var249 = class602.field8356.method718(-95);
            boolean var250 = (var249 & 0x1) == 1;
            class635.method3531(var248, var250, arg0 + 65634);
            int var251 = class602.field8356.method743((byte) -4);
            for (int var252 = 0; var252 < var251; var252++) {
                int var253 = class602.field8356.method710(-43);
                if (var253 == 255) {
                    var253 = class602.field8356.method707(18523);
                }
                int var254 = class602.field8356.method756((byte) 101);
                class394.method2248(var254 - 1, var252, var250, (byte) 91, var253, var248);
            }
            class144.field2140[class249.method1537(class379.field5342++, 31)] = var248;
            class290.field4382 = null;
            return true;
        } else if (class599.field8309 == class290.field4382) {
            int var255 = class602.field8356.method713((byte) -104);
            int var256 = class602.field8356.method713((byte) -104);
            int var257 = class602.field8356.method714(false);
            class658.field9261[var256] = var257;
            class660.field9273[var256] = var255;
            class98.field1333[var256] = 1;
            int var258 = class46.field695[var256] - 1;
            for (int var259 = 0; var259 < var258; var259++) {
                if (var257 >= class200.field2954[var259]) {
                    class98.field1333[var256] = var259 + 2;
                }
            }
            class572.field7710[class249.method1537(31, class372.field5292++)] = var256;
            class290.field4382 = null;
            return true;
        } else if (class412.field5823 == class290.field4382) {
            class124.field1722 = class602.field8356.method718(126);
            class290.field4382 = null;
            return true;
        } else if (class78.field1069 == class290.field4382) {
            int var260 = class602.field8356.method743((byte) -125);
            class286 var261;
            if (class27.field343 == var260) {
                var261 = class253.field3576;
            } else {
                var261 = class495.field6821[var260];
            }
            if (var261 == null) {
                class290.field4382 = null;
                return true;
            }
            int var262 = class602.field8356.method743((byte) -25);
            int var263 = class602.field8356.method718(-95);
            boolean var264 = (var262 & 0x8000) != 0;
            if (var261.field3975 != null && var261.field3989 != null) {
                boolean var265 = false;
                if (var263 <= 1) {
                    if (!var264 && (class451.field6295 && !class440.field6198 || class71.field977)) {
                        var265 = true;
                    } else if (class250.method1545(true, var261.field3975)) {
                        var265 = true;
                    }
                }
                if (!var265 && class153.field2297 == 0) {
                    int var266 = -1;
                    String var268;
                    if (var264) {
                        var262 &= 0x7FFF;
                        class115 var267 = class16.method82(false, class602.field8356);
                        var266 = var267.field1540;
                        var268 = var267.field1541.method3717(class602.field8356, arg0 + 76237);
                    } else {
                        var268 = class311.method1910(class115.method850(-14478, class602.field8356), true);
                    }
                    var261.field6405 = var268.trim();
                    var261.field6433 = var262 >> 8;
                    var261.field6473 = 150;
                    var261.field6425 = var262 & 0xFF;
                    int var269;
                    if (var263 == 1 || var263 == 2) {
                        var269 = var264 ? 17 : 1;
                    } else {
                        var269 = var264 ? 17 : 2;
                    }
                    if (var263 == 2) {
                        class669.method3710(var261.field3986, var268, "<img=1>" + var261.method1720(false, false), var269, -101, null, "<img=1>" + var261.method1717(true, (byte) 121), var266, 0);
                    } else if (var263 == 1) {
                        class669.method3710(var261.field3986, var268, "<img=0>" + var261.method1720(false, false), var269, -83, null, "<img=0>" + var261.method1717(true, (byte) 120), var266, 0);
                    } else {
                        class669.method3710(var261.field3986, var268, var261.method1720(false, false), var269, -109, null, var261.method1717(true, (byte) 126), var266, 0);
                    }
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class177.field2631) {
            int var270 = class602.field8356.method710(-123);
            int var271 = class602.field8356.method718(-117);
            if (var270 == 255) {
                var271 = -1;
                var270 = -1;
            }
            class590.method3281(var271, var270, 15);
            class290.field4382 = null;
            return true;
        } else if (class362.field5148 == class290.field4382) {
            int var272 = class602.field8356.method743((byte) -110);
            if (var272 == 65535) {
                var272 = -1;
            }
            int var273 = class602.field8356.method718(arg0 + 65650);
            int var274 = class602.field8356.method743((byte) -125);
            int var275 = class602.field8356.method718(arg0 ^ 0xFFFF0050);
            class431.method2444(var275, var273, false, var274, var272, -1);
            class290.field4382 = null;
            return true;
        } else if (class599.field8299 == class290.field4382) {
            class177.method1202(class45.field668, arg0 ^ 0xFFFF000F);
            class290.field4382 = null;
            return true;
        } else if (class307.field4518 == class290.field4382) {
            class186.field2761 = class602.field8356.method706((byte) 88) << 3;
            class490.field6780 = class602.field8356.method713((byte) -104);
            class103.field1392 = class602.field8356.method712(true) << 3;
            while (class532.field7250 > class602.field8356.field1301) {
                class568 var276 = class52.method372(arg0 ^ 0xFFBA)[class602.field8356.method718(106)];
                class177.method1202(var276, 15);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class267.field3791) {
            class63.method515(class503.field6878, class532.field7250, 83, class602.field8356);
            class290.field4382 = null;
            return true;
        } else if (class662.field9341 == class290.field4382) {
            boolean var277 = class602.field8356.method718(-123) == 1;
            String var278 = class602.field8356.method739(-122);
            String var279 = var278;
            if (var277) {
                var279 = class602.field8356.method739(arg0 ^ 0xFF8D);
            }
            long var280 = (long) class602.field8356.method743((byte) -89);
            long var282 = (long) class602.field8356.method736(-121);
            int var284 = class602.field8356.method718(120);
            long var285 = (var280 << 32) + var282;
            boolean var287 = false;
            int var288 = 0;
            while (true) {
                if (var288 >= 100) {
                    if (var284 <= 1) {
                        if (!(!class451.field6295 || class440.field6198) || class71.field977) {
                            var287 = true;
                        } else if (class250.method1545(true, var279)) {
                            var287 = true;
                        }
                    }
                    break;
                }
                if (class367.field5240[var288] == var285) {
                    var287 = true;
                    break;
                }
                var288++;
            }
            if (!var287 && class153.field2297 == 0) {
                class367.field5240[class426.field5994] = var285;
                class426.field5994 = (class426.field5994 + 1) % 100;
                String var289 = class311.method1910(class115.method850(-14478, class602.field8356), true);
                if (var284 == 2) {
                    class669.method3710(var278, var289, "<img=1>" + var279, 7, -91, null, "<img=1>" + var278, -1, 0);
                } else if (var284 == 1) {
                    class669.method3710(var278, var289, "<img=0>" + var279, 7, arg0 ^ 0xFF91, null, "<img=0>" + var278, -1, 0);
                } else {
                    class669.method3710(var278, var289, var279, 3, -84, null, var278, -1, 0);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class125.field1735) {
            int var290 = class602.field8356.method747(54);
            int var291 = class602.field8356.method754(arg0 + 65536);
            int var292 = class602.field8356.method703((byte) 126);
            int var293 = class602.field8356.method756((byte) 101);
            int var294 = class602.field8356.method743((byte) -51);
            if (class546.method3002(var290, 0)) {
                class206.method1366(arg0 ^ 0xFFFF00DA, var294, var292, var291, var293);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class223.field3214) {
            int var295 = class602.field8356.method754(0);
            if (var295 == 65535) {
                var295 = -1;
            }
            int var296 = class602.field8356.method747(73);
            int var297 = class602.field8356.method697(false);
            int var298 = class602.field8356.method707(18523);
            if (class546.method3002(var296, arg0 ^ 0xFFFF0000)) {
                class177.method1206(var297, var295, var298, 19786);
                class257 var299 = class648.field9184.method3064(var295, -74);
                class206.method1366(218, var299.field3681, var298, var299.field3677, var299.field3674);
                class202.method1353(var299.field3680, 10, var299.field3606, var298, var299.field3612);
            }
            class290.field4382 = null;
            return true;
        } else if (class537.field7297 == class290.field4382) {
            int var300 = class602.field8356.method754(0);
            int var301 = class602.field8356.method747(113);
            int var302 = class602.field8356.method697(false);
            int var303 = class602.field8356.method756((byte) 101);
            if (class546.method3002(var300, 0)) {
                class524.method2906(var302, (var303 << 16) + var301, (byte) 108);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class220.field3194) {
            int var304 = class602.field8356.method747(117);
            int var305 = class602.field8356.method754(0);
            int var306 = class602.field8356.method718(-57);
            if (class546.method3002(var304, 0)) {
                if (var306 == 2) {
                    class18.method95(-27);
                }
                class677.field9551 = var305;
                class671.method3711(var305, (byte) -104);
                class22.method112(false, 3);
                class523.method2894(class677.field9551);
                for (int var307 = 0; var307 < 100; var307++) {
                    class287.field3996[var307] = true;
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class88.field1193 == class290.field4382) {
            int var308 = class602.field8356.method743((byte) -47);
            if (class546.method3002(var308, arg0 ^ 0xFFFF0000)) {
                class669.method3709(105);
            }
            class290.field4382 = null;
            return true;
        } else if (class642.field9130 == class290.field4382) {
            class177.method1202(class399.field5541, 15);
            class290.field4382 = null;
            return true;
        } else if (class534.field7265 == class290.field4382) {
            int var309 = class602.field8356.method743((byte) -52);
            int var310 = class602.field8356.method747(105);
            int var311 = class602.field8356.method710(-34);
            int var312 = class602.field8356.method707(18523);
            int var313 = class602.field8356.method754(0);
            boolean var314 = (var311 & 0x80) != 0;
            if (var312 >> 30 != 0) {
                int var346 = (var312 & 0x3CE085CF) >> 28;
                int var347 = (var312 >> 14 & 0x3FFF) - class511.field6989;
                int var348 = (var312 & 0x3FFF) - class124.field1726;
                if (var347 >= 0 && var348 >= 0 && var347 < class86.field1185 && var348 < class526.field7212) {
                    int var349 = var347 * 512 + 256;
                    int var350 = var348 * 512 + 256;
                    int var351 = var346;
                    if (var346 < 3 && class105.method800((byte) 127, var348, var347)) {
                        var351 = var346 + 1;
                    }
                    class552 var352 = new class552(var310, 0, class239.field3440, var346, var351, var349, class203.method1355(var350, var349, arg0 ^ 0xFFFF0004, var346) - var313, var350, var347, var347, var348, var348, var311 & 0x7);
                    class83.field1161.method1273(new class137(var352), (byte) 122);
                }
            } else if (var312 >> 29 != 0) {
                int var315 = var312 & 0xFFFF;
                class178 var316 = (class178) class323.field4762.method2061(-17305, (long) var315);
                if (var316 != null) {
                    class225 var317 = var316.field2634;
                    if (var310 == 65535) {
                        var310 = -1;
                    }
                    boolean var318 = true;
                    int var319 = var314 ? var317.field6443 : var317.field6417;
                    if (var310 != -1 && var319 != -1) {
                        if (var310 == var319) {
                            class586 var324 = class569.field7652.method2128(var310, -1);
                            if (var324.field8178 && var324.field8185 != -1) {
                                class131 var325 = class301.field4465.method2763(var324.field8185, 31696);
                                int var326 = var325.field1801;
                                if (var326 == 0 || var326 == 2) {
                                    var318 = false;
                                } else if (var326 == 1) {
                                    var318 = true;
                                }
                            }
                        } else {
                            class586 var320 = class569.field7652.method2128(var310, -1);
                            class586 var321 = class569.field7652.method2128(var319, -1);
                            if (var320.field8185 != -1 && var321.field8185 != -1) {
                                class131 var322 = class301.field4465.method2763(var320.field8185, 31696);
                                class131 var323 = class301.field4465.method2763(var321.field8185, 31696);
                                if (var322.field1799 < var323.field1799) {
                                    var318 = false;
                                }
                            }
                        }
                    }
                    if (var318) {
                        if (var314) {
                            var317.field6432 = 1;
                            var317.field6445 = 0;
                            var317.field6385 = var313;
                            var317.field6448 = 0;
                            var317.field6460 = class239.field3440 + var309;
                            var317.field6386 = var311 & 0x7;
                            var317.field6443 = var310;
                            if (class239.field3440 < var317.field6460) {
                                var317.field6445 = -1;
                            }
                            if (var317.field6443 != -1 && class239.field3440 == var317.field6460) {
                                int var329 = class569.field7652.method2128(var317.field6443, -1).field8185;
                                if (var329 != -1) {
                                    class131 var330 = class301.field4465.method2763(var329, 31696);
                                    if (var330 != null && var330.field1806 != null) {
                                        class99.method769(false, var317.field509, var317.field520, var330, var317.field514, 50, 0);
                                    }
                                }
                            }
                        } else {
                            var317.field6424 = class239.field3440 + var309;
                            var317.field6416 = var311 & 0x7;
                            var317.field6404 = var313;
                            var317.field6423 = 0;
                            var317.field6447 = 0;
                            var317.field6417 = var310;
                            var317.field6392 = 1;
                            if (var317.field6424 > class239.field3440) {
                                var317.field6423 = -1;
                            }
                            if (var317.field6417 != -1 && class239.field3440 == var317.field6424) {
                                int var327 = class569.field7652.method2128(var317.field6417, -1).field8185;
                                if (var327 != -1) {
                                    class131 var328 = class301.field4465.method2763(var327, 31696);
                                    if (var328 != null && var328.field1806 != null) {
                                        class99.method769(false, var317.field509, var317.field520, var328, var317.field514, 50, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var312 >> 28) != 0) {
                int var331 = var312 & 0xFFFF;
                class286 var332;
                if (class27.field343 == var331) {
                    var332 = class253.field3576;
                } else {
                    var332 = class495.field6821[var331];
                }
                if (var332 != null) {
                    if (var310 == 65535) {
                        var310 = -1;
                    }
                    boolean var333 = true;
                    int var334 = var314 ? var332.field6443 : var332.field6417;
                    if (var310 != -1 && var334 != -1) {
                        if (var310 == var334) {
                            class586 var339 = class569.field7652.method2128(var310, -1);
                            if (var339.field8178 && var339.field8185 != -1) {
                                class131 var340 = class301.field4465.method2763(var339.field8185, 31696);
                                int var341 = var340.field1801;
                                if (var341 == 0 || var341 == 2) {
                                    var333 = false;
                                } else if (var341 == 1) {
                                    var333 = true;
                                }
                            }
                        } else {
                            class586 var335 = class569.field7652.method2128(var310, -1);
                            class586 var336 = class569.field7652.method2128(var334, -1);
                            if (var335.field8185 != -1 && var336.field8185 != -1) {
                                class131 var337 = class301.field4465.method2763(var335.field8185, 31696);
                                class131 var338 = class301.field4465.method2763(var336.field8185, 31696);
                                if (var338.field1799 > var337.field1799) {
                                    var333 = false;
                                }
                            }
                        }
                    }
                    if (var333) {
                        if (var314) {
                            var332.field6445 = 0;
                            var332.field6448 = 0;
                            var332.field6385 = var313;
                            var332.field6386 = var311 & 0x7;
                            var332.field6443 = var310;
                            var332.field6460 = class239.field3440 + var309;
                            var332.field6432 = 1;
                            if (var332.field6460 > class239.field3440) {
                                var332.field6445 = -1;
                            }
                            if (var332.field6443 == 65535) {
                                var332.field6443 = -1;
                            }
                            if (var332.field6443 != -1 && class239.field3440 == var332.field6460) {
                                int var342 = class569.field7652.method2128(var332.field6443, arg0 + 65535).field8185;
                                if (var342 != -1) {
                                    class131 var343 = class301.field4465.method2763(var342, 31696);
                                    if (var343 != null && var343.field1806 != null) {
                                        class99.method769(class253.field3576 == var332, var332.field509, var332.field520, var343, var332.field514, 50, 0);
                                    }
                                }
                            }
                        } else {
                            var332.field6404 = var313;
                            var332.field6417 = var310;
                            var332.field6392 = 1;
                            var332.field6416 = var311 & 0x7;
                            var332.field6423 = 0;
                            var332.field6424 = class239.field3440 + var309;
                            var332.field6447 = 0;
                            if (var332.field6417 == 65535) {
                                var332.field6417 = -1;
                            }
                            if (var332.field6424 > class239.field3440) {
                                var332.field6423 = -1;
                            }
                            if (var332.field6417 != -1 && class239.field3440 == var332.field6424) {
                                int var344 = class569.field7652.method2128(var332.field6417, -1).field8185;
                                if (var344 != -1) {
                                    class131 var345 = class301.field4465.method2763(var344, 31696);
                                    if (var345 != null && var345.field1806 != null) {
                                        class99.method769(class253.field3576 == var332, var332.field509, var332.field520, var345, var332.field514, 50, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class427.field6009 == class290.field4382) {
            if (class677.field9551 != -1) {
                class589.method3274(class677.field9551, 0, (byte) 93);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class253.field3565) {
            class177.method1202(class240.field3449, 15);
            class290.field4382 = null;
            return true;
        } else if (class380.field5353 == class290.field4382) {
            class490.field6780 = class602.field8356.method718(arg0 + 65628);
            class186.field2761 = class602.field8356.method712(true) << 3;
            class103.field1392 = class602.field8356.method748(-813976688) << 3;
            for (class435 var353 = (class435) class179.field2656.method2066(false); var353 != null; var353 = (class435) class179.field2656.method2062(-19704)) {
                int var355 = (int) (var353.field7311 >> 28 & 0x3L);
                int var356 = (int) (var353.field7311 & 0x3FFFL);
                int var357 = var356 - class511.field6989;
                int var358 = (int) (var353.field7311 >> 14 & 0x3FFFL);
                int var359 = var358 - class124.field1726;
                if (class490.field6780 == var355 && var357 >= class186.field2761 && (class186.field2761 + 8) > var357 && class103.field1392 <= var359 && (class103.field1392 + 8) > var359) {
                    var353.method2971(arg0 ^ 0xFFFF0001);
                    if (var357 >= 0 && var359 >= 0 && class86.field1185 > var357 && class526.field7212 > var359) {
                        class442.method2527(var359, var357, (byte) -1, class490.field6780);
                    }
                }
            }
            for (class81 var354 = (class81) class138.field1938.method1270((byte) -25); var354 != null; var354 = (class81) class138.field1938.method1282(0)) {
                if (class186.field2761 <= var354.field1121 && class186.field2761 + 8 > var354.field1121 && var354.field1127 >= class103.field1392 && var354.field1127 < (class103.field1392 + 8) && class490.field6780 == var354.field1126) {
                    var354.field1120 = 0;
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class663.field9357 == class290.field4382) {
            int var360 = class602.field8356.method743((byte) -50);
            if (class546.method3002(var360, 0)) {
                class539.method2968(arg0 + 65500);
            }
            class290.field4382 = null;
            return true;
        } else if (class512.field7004 == class290.field4382) {
            boolean var361 = class602.field8356.method718(-103) == 1;
            String var362 = class602.field8356.method739(124);
            String var363 = var362;
            if (var361) {
                var363 = class602.field8356.method739(36);
            }
            long var364 = class602.field8356.method715(true);
            long var366 = (long) class602.field8356.method743((byte) -48);
            long var368 = (long) class602.field8356.method736(arg0 + 65411);
            int var370 = class602.field8356.method718(-74);
            long var371 = (var366 << 32) + var368;
            boolean var373 = false;
            int var374 = 0;
            while (true) {
                if (var374 >= 100) {
                    if (var370 <= 1) {
                        if (!(!class451.field6295 || class440.field6198) || class71.field977) {
                            var373 = true;
                        } else if (class250.method1545(true, var363)) {
                            var373 = true;
                        }
                    }
                    break;
                }
                if (class367.field5240[var374] == var371) {
                    var373 = true;
                    break;
                }
                var374++;
            }
            if (!var373 && class153.field2297 == 0) {
                class367.field5240[class426.field5994] = var371;
                class426.field5994 = (class426.field5994 + 1) % 100;
                String var375 = class311.method1910(class115.method850(-14478, class602.field8356), true);
                if (var370 == 2 || var370 == 3) {
                    class669.method3710(var362, var375, "<img=1>" + var363, 9, -119, class456.method2628(37, var364), "<img=1>" + var362, -1, 0);
                } else if (var370 == 1) {
                    class669.method3710(var362, var375, "<img=0>" + var363, 9, -85, class456.method2628(37, var364), "<img=0>" + var362, -1, 0);
                } else {
                    class669.method3710(var362, var375, var363, 9, arg0 ^ 0xFFAD, class456.method2628(37, var364), var362, -1, 0);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class438.field6176 == class290.field4382) {
            class528.method2930(false, 2);
            class290.field4382 = null;
            return false;
        } else if (class410.field5802 == class290.field4382) {
            int var376 = class602.field8356.method743((byte) -64);
            if (var376 == 65535) {
                var376 = -1;
            }
            int var377 = class602.field8356.method718(arg0 + 65413);
            int var378 = class602.field8356.method743((byte) -120);
            int var379 = class602.field8356.method718(arg0 + 65415);
            class548.method3011(-12114, var376, var377, var379, var378);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class272.field3837) {
            int var380 = class602.field8356.method710(arg0 + 65628);
            int var381 = class602.field8356.method743((byte) -108);
            class195.field2888.method876(-1, var381, var380);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class235.field3397) {
            int var382 = class602.field8356.method747(88);
            int var383 = class602.field8356.method756((byte) 101);
            int var384 = class602.field8356.method743((byte) -23);
            if (class546.method3002(var383, 0)) {
                class498.method2787(true, 0, var382, var384);
            }
            class290.field4382 = null;
            return true;
        } else if (class631.field8805 == class290.field4382) {
            class177.method1202(class650.field9205, 15);
            class290.field4382 = null;
            return true;
        } else if (class455.field6350 == class290.field4382) {
            int var385 = class602.field8356.method707(18523);
            int var386 = class602.field8356.method754(0);
            int var387 = class602.field8356.method756((byte) 101);
            if (class546.method3002(var386, 0)) {
                class355.method2103(32768, var387, var385);
            }
            class290.field4382 = null;
            return true;
        } else if (class65.field861 == class290.field4382) {
            int var388 = class602.field8356.method697(false);
            int var389 = class602.field8356.method754(0);
            int var390 = class602.field8356.method699(80);
            int var391 = class602.field8356.method722(4);
            if (class546.method3002(var389, 0)) {
                class80.method634(var390, 0, var391, var388);
            }
            class290.field4382 = null;
            return true;
        } else if (class667.field9379 == class290.field4382) {
            class664.method3684(true, false);
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class237.field3413) {
            int var392 = class602.field8356.method710(113);
            int var393 = class602.field8356.method743((byte) -128);
            if (class546.method3002(var393, 0)) {
                class693.field9711 = var392;
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class185.field2730) {
            int var394 = class602.field8356.method756((byte) 101);
            int var395 = class602.field8356.method707(18523);
            int var396 = class602.field8356.method754(0);
            if (var396 == 65535) {
                var396 = -1;
            }
            if (class546.method3002(var394, 0)) {
                class349.method2075(var395, var396, -1, 2, (byte) -110);
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class235.field3388) {
            boolean var397 = class602.field8356.method718(-118) == 1;
            String var398 = class602.field8356.method739(-95);
            String var399 = var398;
            if (var397) {
                var399 = class602.field8356.method739(-126);
            }
            int var400 = class602.field8356.method718(arg0 ^ 0xFFB8);
            boolean var401 = false;
            if (var400 <= 1) {
                if (!(!class451.field6295 || class440.field6198) || class71.field977) {
                    var401 = true;
                } else if (var400 <= 1 && class250.method1545(true, var399)) {
                    var401 = true;
                }
            }
            if (!var401 && class153.field2297 == 0) {
                String var402 = class311.method1910(class115.method850(-14478, class602.field8356), true);
                if (var400 == 2) {
                    class669.method3710(var398, var402, "<img=1>" + var399, 24, arg0 ^ 0xFF81, null, "<img=1>" + var398, -1, 0);
                } else if (var400 == 1) {
                    class669.method3710(var398, var402, "<img=0>" + var399, 24, -115, null, "<img=0>" + var398, -1, 0);
                } else {
                    class669.method3710(var398, var402, var399, 24, -101, null, var398, -1, 0);
                }
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class113.field1535) {
            class354.field5078 = class532.field7250 <= 2 ? class9.field160.method42(class666.field9377, 19572) : class602.field8356.method739(26);
            class584.field8148 = class532.field7250 > 0 ? class602.field8356.method743((byte) -23) : -1;
            class290.field4382 = null;
            if (class584.field8148 == 65535) {
                class584.field8148 = -1;
            }
            return true;
        } else if (class290.field4382 == class23.field318) {
            int var403 = class602.field8356.method743((byte) -32);
            int var404 = class602.field8356.method718(-118);
            boolean var405 = (var404 & 0x1) == 1;
            while (class532.field7250 > class602.field8356.field1301) {
                int var406 = class602.field8356.method733((byte) 112);
                int var407 = class602.field8356.method743((byte) -121);
                int var408 = 0;
                if (var407 != 0) {
                    var408 = class602.field8356.method718(arg0 + 65453);
                    if (var408 == 255) {
                        var408 = class602.field8356.method714(false);
                    }
                }
                class394.method2248(var407 - 1, var406, var405, (byte) -42, var408, var403);
            }
            class144.field2140[class249.method1537(31, class379.field5342++)] = var403;
            class290.field4382 = null;
            return true;
        } else if (class457.field6442 == class290.field4382) {
            class177.method1202(class362.field5166, 15);
            class290.field4382 = null;
            return true;
        } else if (class556.field7516 == class290.field4382) {
            int var409 = class602.field8356.method733((byte) 88);
            int var410 = class602.field8356.method714(false);
            int var411 = class602.field8356.method718(-75);
            String var412 = "";
            String var413 = var412;
            if ((var411 & 0x1) != 0) {
                var412 = class602.field8356.method739(arg0 ^ 0xFFFF0078);
                if ((var411 & 0x2) == 0) {
                    var413 = var412;
                } else {
                    var413 = class602.field8356.method739(-126);
                }
            }
            String var414 = class602.field8356.method739(123);
            if (var409 == 99) {
                class434.method2495((byte) 27, var414);
            } else if (var413.equals("") || !class250.method1545(true, var413)) {
                class250.method1549(var412, var413, -1, var412, var409, var414, var410);
            } else {
                class290.field4382 = null;
                return true;
            }
            class290.field4382 = null;
            return true;
        } else if (class290.field4382 == class29.field358) {
            int var415 = class602.field8356.method743((byte) -32);
            int var416 = class602.field8356.method756((byte) 101);
            String var417 = class602.field8356.method739(arg0 ^ 0xFFA7);
            if (class546.method3002(var415, 0)) {
                class219.method1415(var416, arg0 + 76983, var417);
            }
            class290.field4382 = null;
            return true;
        } else if (class608.field8455 == class290.field4382) {
            class177.method1202(class673.field9479, 15);
            class290.field4382 = null;
            return true;
        } else if (class615.field8522 == class290.field4382) {
            int var418 = class602.field8356.method726((byte) 125);
            int var419 = class602.field8356.method743((byte) -34);
            if (var419 == 65535) {
                var419 = -1;
            }
            String var420 = class602.field8356.method739(100);
            int var421 = class602.field8356.method718(89);
            if (var421 >= 1 && var421 <= 8) {
                if (var420.equalsIgnoreCase("null")) {
                    var420 = null;
                }
                class425.field5986[var421 - 1] = var420;
                class474.field6629[var421 - 1] = var419;
                class423.field5968[var421 - 1] = var418 == 0;
            }
            class290.field4382 = null;
            return true;
        } else if (class318.field4721 == class290.field4382) {
            int var422 = class602.field8356.method754(0);
            int var423 = class602.field8356.method743((byte) -49);
            byte var424 = class602.field8356.method706((byte) 78);
            if (class546.method3002(var423, 0)) {
                class355.method2103(arg0 + 98304, var422, var424);
            }
            class290.field4382 = null;
            return true;
        } else {
            class139.method985((byte) -95, "T1 - " + (class290.field4382 == null ? -1 : class290.field4382.method1481(false)) + "," + (class324.field4794 == null ? -1 : class324.field4794.method1481(false)) + "," + (class182.field2681 == null ? -1 : class182.field2681.method1481(false)) + " - " + class532.field7250, null);
            class528.method2930(false, arg0 ^ 0xFFFF0002);
            return true;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z", line = 3485)
    public static final boolean method1846(int arg0, int arg1, int arg2) {
        field4415++;
        if (arg1 == -21254) {
            return (arg0 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hs", name = "toString", descriptor = "()Ljava/lang/String;", line = 3498)
    public final String toString() {
        field4414++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(II)V", line = 3511)
    public class295(int arg0, int arg1) {
        this.field4412 = arg1;
    }
}

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class41 extends class141 {

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "B")
    public byte field746 = 5;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "[F")
    public static float[] field739 = new float[4];

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field737 = new String[5];

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field742 = 1400;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Z")
    public boolean field740;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public static final void method409(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6370 != null) {
            var3.field6370 = null;
        }
        if (var3.field6365 != null) {
            var3.field6365 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public static void method410(int arg0) {
        if (arg0 != 2) {
            field737 = null;
        }
        field737 = null;
        field739 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
    public static final void method411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class69 var5 = (class69) class110.field1872.method2427(arg1 + 120); var5 != null; var5 = (class69) class110.field1872.method2422(-123)) {
            class397.method2452(var5, arg1 - 93, arg4, arg3, arg2, arg0);
        }
        field736++;
        for (class69 var6 = (class69) class510.field7530.method2427(106); var6 != null; var6 = (class69) class510.field7530.method2422(-83)) {
            byte var11 = 1;
            class435 var12 = var6.field1188.method3094(-106);
            if (var6.field1188.field7682) {
                var11 = 0;
            } else if (var6.field1188.field7666 == var12.field6454 || var6.field1188.field7666 == var12.field6493 || var6.field1188.field7666 == var12.field6490 || var6.field1188.field7666 == var12.field6488) {
                var11 = 2;
            } else if (var6.field1188.field7666 == var12.field6450 || var6.field1188.field7666 == var12.field6448 || var6.field1188.field7666 == var12.field6476 || var6.field1188.field7666 == var12.field6462) {
                var11 = 3;
            }
            if (var6.field1185 != var11) {
                int var13 = class405.method2476(var6.field1188, (byte) -7);
                if (var6.field1190 != var13) {
                    if (var6.field1181 != null) {
                        class45.field837.method2035(var6.field1181);
                        var6.field1181 = null;
                    }
                    var6.field1190 = var13;
                }
                var6.field1185 = var11;
            }
            var6.field1187 = var6.field1188.field6228;
            var6.field1183 = var6.field1188.field6228 + (var6.field1188.method1654(78) << 6);
            var6.field1198 = var6.field1188.field6233;
            var6.field1202 = var6.field1188.field6233 + (var6.field1188.method1654(97) << 6);
            class397.method2452(var6, arg1 ^ 0xFFFFFFC9, arg4, arg3, arg2, arg0);
        }
        if (arg1 != 3) {
            method411(-31, 9, -70, 82, -94);
        }
        for (class69 var7 = (class69) class284.field4051.method160((byte) -20); var7 != null; var7 = (class69) class284.field4051.method163(127)) {
            byte var8 = 1;
            class435 var9 = var7.field1194.method3094(-49);
            if (var7.field1194.field7682) {
                var8 = 0;
            } else if (var7.field1194.field7666 == var9.field6454 || var7.field1194.field7666 == var9.field6493 || var7.field1194.field7666 == var9.field6490 || var7.field1194.field7666 == var9.field6488) {
                var8 = 2;
            } else if (var7.field1194.field7666 == var9.field6450 || var7.field1194.field7666 == var9.field6448 || var7.field1194.field7666 == var9.field6476 || var7.field1194.field7666 == var9.field6462) {
                var8 = 3;
            }
            if (var7.field1185 != var8) {
                int var10 = class9.method47(var7.field1194, true);
                if (var7.field1190 != var10) {
                    if (var7.field1181 != null) {
                        class45.field837.method2035(var7.field1181);
                        var7.field1181 = null;
                    }
                    var7.field1190 = var10;
                }
                var7.field1185 = var8;
            }
            var7.field1187 = var7.field1194.field6228;
            var7.field1183 = var7.field1194.field6228 + (var7.field1194.method1654(103) << 6);
            var7.field1198 = var7.field1194.field6233;
            var7.field1202 = var7.field1194.field6233 + (var7.field1194.method1654(arg1 ^ 0x6C) << 6);
            class397.method2452(var7, 111, arg4, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public static final void method412(int arg0) {
        field734++;
        if (class350.field5217 == 0 || class350.field5217 == 5) {
            return;
        }
        try {
            if (++class495.field7315 > 2000) {
                if (class116.field1927 != null) {
                    class116.field1927.method1305((byte) 91);
                    class116.field1927 = null;
                }
                if (class190.field2835 >= 1) {
                    class68.field1169 = -5;
                    class350.field5217 = 0;
                    return;
                }
                class190.field2835++;
                if (class187.field2793 == class132.field2082) {
                    class187.field2793 = class175.field2679;
                } else {
                    class187.field2793 = class132.field2082;
                }
                class350.field5217 = 1;
                class495.field7315 = 0;
            }
            if (class350.field5217 == 1) {
                class337.field5081 = class368.field5553.method1852(class187.field2793, class315.field4742, (byte) 38);
                class350.field5217 = 2;
            }
            if (class350.field5217 == 2) {
                if (class337.field5081.field4940 == 2) {
                    throw new IOException();
                }
                if (class337.field5081.field4940 != 1) {
                    return;
                }
                class116.field1927 = new class187((Socket) class337.field5081.field4939, class368.field5553);
                class337.field5081 = null;
                long var1 = class26.field575 = class20.method168(class334.field5049, false);
                class410.field6141.field2289 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class410.field6141.method1109(false, class339.field5124.field6139);
                class410.field6141.method1109(false, var3);
                class116.field1927.method1304(class410.field6141.field2270, 0, 2, (byte) 85);
                class25.method313(false);
                int var4 = class116.field1927.method1309(120);
                class25.method313(false);
                if (var4 != 0) {
                    class350.field5217 = 0;
                    class68.field1169 = var4;
                    class116.field1927.method1305((byte) 106);
                    class116.field1927 = null;
                    return;
                }
                class350.field5217 = 3;
            }
            if (class350.field5217 == 3) {
                if (class116.field1927.method1308(14971) < 8) {
                    return;
                }
                class116.field1927.method1306(0, 0, class92.field1573.field2270, 8);
                class92.field1573.field2289 = 0;
                class21.field431 = class92.field1573.method1091((byte) 28);
                class145 var5 = new class145(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class21.field431 >> 32), (int) class21.field431 };
                var5.method1109(false, 10);
                var5.method1117(var6[0], (byte) 12);
                var5.method1117(var6[1], (byte) 12);
                var5.method1117(var6[2], (byte) 12);
                var5.method1117(var6[3], (byte) 12);
                var5.method1084(2, class20.method168(class334.field5049, false));
                var5.method1089((byte) -89, class40.field731);
                var5.method1062(3, class472.field7075, class79.field1377);
                class410.field6141.field2289 = 0;
                if (class281.field4023 == 40) {
                    class410.field6141.method1109(false, class339.field5132.field6139);
                } else {
                    class410.field6141.method1109(false, class339.field5130.field6139);
                }
                class410.field6141.method1094(1618659784, 0);
                int var7 = class410.field6141.field2289;
                class410.field6141.method1117(590, (byte) 12);
                class410.field6141.method1109(false, class290.field4136);
                class410.field6141.method1109(false, class8.method43(false));
                class410.field6141.method1094(1618659784, class466.field6952);
                class410.field6141.method1094(1618659784, class77.field1297);
                class410.field6141.method1109(false, class443.field6623.field610);
                class414.method2507((byte) 103, class410.field6141);
                class410.field6141.method1089((byte) -89, class66.field1138);
                class410.field6141.method1117(class110.field1871, (byte) 12);
                class145 var8 = class443.field6623.method2841(19707);
                class410.field6141.method1109(false, var8.field2289);
                class410.field6141.method1076(var8.field2289, -1, 0, var8.field2270);
                class72.field1247 = true;
                class410.field6141.method1094(1618659784, class334.field5043);
                class410.field6141.method1117(class98.field1634.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class80.field1417.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class445.field6649.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class451.field6741.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class209.field3017.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class5.field122.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class84.field1455.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class474.field7088.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class151.field2407.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class109.field1800.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class268.field3857.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class285.field4069.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class201.field2946.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class76.field1270.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class260.field3788.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class50.field901.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class138.field2214.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class290.field4133.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class466.field6955.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class488.field7222.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class20.field333.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class368.field5571.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class352.field5394.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class407.field6109.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class56.field981.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class457.field6853.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class419.field6273.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class57.field1008.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class100.field1641.method135((byte) 15), (byte) 12);
                class410.field6141.method1117(class42.field789.method135((byte) 15), (byte) 12);
                class410.field6141.method1076(var5.field2289, -1, 0, var5.field2270);
                class410.field6141.method1099(true, class410.field6141.field2289 - var7);
                class116.field1927.method1304(class410.field6141.field2270, 0, class410.field6141.field2289, (byte) -116);
                class410.field6141.method2691((byte) -68, var6);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class92.field1573.method2691((byte) -124, var6);
                class350.field5217 = 4;
            }
            if (class350.field5217 == 4) {
                if (class116.field1927.method1308(14971) < 1) {
                    return;
                }
                int var10 = class116.field1927.method1309(117);
                if (var10 == 21) {
                    class350.field5217 = 7;
                } else if (var10 == 29) {
                    class350.field5217 = 11;
                } else if (var10 == 1) {
                    class68.field1169 = var10;
                    class350.field5217 = 5;
                    return;
                } else if (var10 == 2) {
                    class350.field5217 = 8;
                } else if (var10 == 15) {
                    class34.field666 = -2;
                    class350.field5217 = 12;
                } else if (var10 == 23 && class190.field2835 < 1) {
                    class495.field7315 = 0;
                    class350.field5217 = 1;
                    class190.field2835++;
                    class116.field1927.method1305((byte) 100);
                    class116.field1927 = null;
                    return;
                } else {
                    class350.field5217 = 0;
                    class68.field1169 = var10;
                    class116.field1927.method1305((byte) 125);
                    class116.field1927 = null;
                    return;
                }
            }
            if (class350.field5217 == 6) {
                class410.field6141.field2289 = 0;
                class410.field6141.method2694(class339.field5131.field6139, false);
                class116.field1927.method1304(class410.field6141.field2270, 0, class410.field6141.field2289, (byte) 88);
                class350.field5217 = 4;
            } else if (class350.field5217 == 7) {
                if (class116.field1927.method1308(14971) >= 1) {
                    class369.field5586 = class116.field1927.method1309(106) * 60 + 180;
                    class350.field5217 = 0;
                    class68.field1169 = 21;
                    class116.field1927.method1305((byte) -125);
                    class116.field1927 = null;
                }
            } else if (class350.field5217 != 11) {
                int var11 = -108 / ((77 - arg0) / 36);
                if (class350.field5217 == 8) {
                    if (class116.field1927.method1308(14971) < 13) {
                        return;
                    }
                    class116.field1927.method1306(0, 0, class92.field1573.field2270, 13);
                    class92.field1573.field2289 = 0;
                    class75.field1260 = class92.field1573.method1063((byte) -116);
                    class431.field6412 = class92.field1573.method1063((byte) 122);
                    class436.field6497 = class92.field1573.method1063((byte) -80) == 1;
                    class45.field853 = class92.field1573.method1063((byte) 114) == 1;
                    class135.field2176 = class92.field1573.method1063((byte) -56) == 1;
                    class63.field1091 = class92.field1573.method1063((byte) 110) == 1;
                    class148.field2368 = class92.field1573.method1069((byte) -103);
                    class110.field1867 = class92.field1573.method1063((byte) 117) == 1;
                    class223.field3193 = class92.field1573.method1063((byte) 110) == 1;
                    class319.field4807.method2873((byte) -60, class223.field3193);
                    class367.field5550.method1313(101, class223.field3193);
                    class61.field1070.method496(true, class223.field3193);
                    if ((!class436.field6497 || class135.field2176) && !class110.field1867) {
                        try {
                            class512.method3065("unzap", class368.field5553.field4170, (byte) 10);
                        } catch (Throwable var15) {
                        }
                    } else {
                        try {
                            class512.method3065("zap", class368.field5553.field4170, (byte) 10);
                        } catch (Throwable var17) {
                            if (class528.field7788) {
                                try {
                                    class368.field5553.field4170.getAppletContext().showDocument(new URL(class368.field5553.field4170.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var16) {
                                }
                            }
                        }
                    }
                    if (class446.field6661 == class423.field6322) {
                        try {
                            class512.method3065("loggedin", class368.field5553.field4170, (byte) 10);
                        } catch (Throwable var14) {
                        }
                    }
                    class350.field5217 = 10;
                }
                if (class350.field5217 == 10) {
                    if (class92.field1573.method2697(-16552)) {
                        if (class116.field1927.method1308(14971) < 1) {
                            return;
                        }
                        class116.field1927.method1306(class92.field1573.field2289 + 2, 0, class92.field1573.field2270, 1);
                    }
                    class277.field4001 = class152.method1157(43)[class92.field1573.method2699((byte) 117)];
                    class34.field666 = class92.field1573.method1069((byte) -62);
                    class350.field5217 = 9;
                }
                if (class350.field5217 == 9) {
                    if (class116.field1927.method1308(14971) >= class34.field666) {
                        class116.field1927.method1306(0, 0, class92.field1573.field2270, class34.field666);
                        class92.field1573.field2289 = 0;
                        class68.field1169 = 2;
                        class350.field5217 = 0;
                        int var12 = class34.field666;
                        class33.method355(-15819);
                        class3.method28(class92.field1573, (byte) -127);
                        class185.field2771 = -1;
                        class111.method829(79);
                        if (class92.field1573.field2289 != var12) {
                            throw new RuntimeException("lswp pos:" + class92.field1573.field2289 + " psize:" + var12);
                        }
                        class277.field4001 = null;
                    }
                } else if (class350.field5217 == 12) {
                    if (class34.field666 == -2) {
                        if (class116.field1927.method1308(14971) < 2) {
                            return;
                        }
                        class116.field1927.method1306(0, 0, class92.field1573.field2270, 2);
                        class92.field1573.field2289 = 0;
                        class34.field666 = class92.field1573.method1069((byte) -95);
                    }
                    if (class116.field1927.method1308(14971) >= class34.field666) {
                        class116.field1927.method1306(0, 0, class92.field1573.field2270, class34.field666);
                        class92.field1573.field2289 = 0;
                        class68.field1169 = 15;
                        class350.field5217 = 0;
                        int var13 = class34.field666;
                        class90.method702(91);
                        class3.method28(class92.field1573, (byte) -108);
                        if (class92.field1573.field2289 != var13) {
                            throw new RuntimeException("lswpr pos:" + class92.field1573.field2289 + " psize:" + var13);
                        }
                        class277.field4001 = null;
                    }
                }
            } else if (class116.field1927.method1308(14971) >= 1) {
                class106.field1764 = class116.field1927.method1309(118);
                class350.field5217 = 0;
                class68.field1169 = 29;
                class116.field1927.method1305((byte) 110);
                class116.field1927 = null;
            }
        } catch (IOException var18) {
            if (class116.field1927 != null) {
                class116.field1927.method1305((byte) 112);
                class116.field1927 = null;
            }
            if (class190.field2835 >= 1) {
                class350.field5217 = 0;
                class68.field1169 = -4;
            } else {
                class190.field2835++;
                class495.field7315 = 0;
                class350.field5217 = 1;
                if (class187.field2793 == class132.field2082) {
                    class187.field2793 = class175.field2679;
                } else {
                    class187.field2793 = class132.field2082;
                }
            }
        }
    }
}

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class437 {

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lvo;")
    private class345 field6293;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[[I")
    private int[][] field6288;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    private int field6291;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "[Z")
    private boolean[] field6292;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field6285 = 0;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6290 = new String[200];

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 11)
    public static void method2558(int arg0) {
        if (arg0 != 20359) {
            method2558(-17);
        }
        field6290 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z", line = 25)
    public final boolean method2559(byte arg0) {
        if (arg0 >= -120) {
            method2561((byte) 127);
        }
        field6289++;
        return this.field6291 != -1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I", line = 40)
    public final int[] method2560(int arg0, int arg1) {
        field6294++;
        if (arg1 < 0 || arg1 >= this.field6288.length) {
            return this.field6291 == -1 ? new int[0] : new int[] { this.field6291 };
        } else if (this.field6292[arg1] && this.field6288[arg1].length > 1) {
            int var3 = this.field6291 == -1 ? 0 : 1;
            if (arg0 != 2) {
                return null;
            }
            Random var4 = new Random();
            int[] var5 = new int[this.field6288[arg1].length];
            class553.method3244(this.field6288[arg1], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class357.method2154(var4, var5.length - var3, Integer.MIN_VALUE);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field6288[arg1];
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V", line = 86)
    public static final void method2561(byte arg0) {
        field6287++;
        if (class160.field2597 == 0 || class160.field2597 == 6) {
            return;
        }
        try {
            if (++class3.field39 > 2000) {
                if (class256.field3696 != null) {
                    class256.field3696.method913(arg0 - 10523);
                    class256.field3696 = null;
                }
                if (class498.field7413 >= 2) {
                    class160.field2597 = 0;
                    class562.method3287(-5, -4);
                    return;
                }
                if (class133.field2155 == 2 || class133.field2155 == 3) {
                    class97.field1450.method1872(0);
                } else {
                    class572.field8418.method1872(arg0 - 117);
                }
                class160.field2597 = 1;
                class3.field39 = 0;
                class498.field7413++;
            }
            if (class160.field2597 == 1) {
                if (class133.field2155 == 2 || class133.field2155 == 3) {
                    class183.field2887 = class97.field1450.method1870(class653.field9220, -17813);
                } else {
                    class183.field2887 = class572.field8418.method1870(class653.field9220, -17813);
                }
                class160.field2597 = 2;
            }
            if (class160.field2597 == 2) {
                if (class183.field2887.field8787 == 2) {
                    throw new IOException();
                }
                if (class183.field2887.field8787 != 1) {
                    return;
                }
                class256.field3696 = class503.method3009((byte) -41, 7500, (Socket) class183.field2887.field8785);
                class183.field2887 = null;
                long var1 = class654.field9240 = class294.method1798(true, class616.field8808);
                class410.method2452((byte) 127);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class699 var4 = class336.method1996((byte) 117);
                var4.field9908.method2753((byte) 73, class561.field8183.field4340);
                var4.field9908.method2753((byte) 101, var3);
                class149.method1134(var4, true);
                class557.method3263(102);
                class160.field2597 = 3;
            }
            if (class160.field2597 == 3) {
                if (!class256.field3696.method921(1, -5794)) {
                    return;
                }
                class256.field3696.method918(arg0 + 18884, 0, 1, class376.field5209.field6719);
                int var5 = class376.field5209.field6719[0] & 0xFF;
                if (var5 != 0) {
                    class160.field2597 = 0;
                    class562.method3287(var5, -4);
                    class256.field3696.method913(-10406);
                    class256.field3696 = null;
                    class584.method3374(-6);
                    return;
                }
                class160.field2597 = 4;
            }
            if (class160.field2597 == 4) {
                if (!class256.field3696.method921(8, arg0 - 5911)) {
                    return;
                }
                class256.field3696.method918(19001, 0, 8, class376.field5209.field6719);
                class376.field5209.field6710 = 0;
                class489.field7015 = class376.field5209.method2727(arg0 - 117);
                class465 var6 = new class465(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class489.field7015 >> 32), (int) class489.field7015 };
                var6.method2753((byte) 120, 10);
                var6.method2733(false, var7[0]);
                var6.method2733(false, var7[1]);
                var6.method2733(false, var7[2]);
                var6.method2733(false, var7[3]);
                var6.method2721(class294.method1798(true, class616.field8808), 520596624);
                var6.method2703(false, class330.field4563);
                var6.method2721(class177.field2824, arg0 ^ 0x1F07ACE5);
                var6.method2721(class487.field6956, 520596624);
                var6.method2725(true, class23.field308, class136.field2181);
                class410.method2452((byte) 120);
                class699 var8 = class336.method1996((byte) 125);
                class373 var9 = var8.field9908;
                if (class133.field2155 == 2 || class133.field2155 == 3) {
                    if (class515.field7636 == 13) {
                        var9.method2753((byte) 105, class561.field8189.field4340);
                    } else {
                        var9.method2753((byte) 121, class561.field8187.field4340);
                    }
                    var9.method2739((byte) -86, 0);
                    int var11 = var9.field6710;
                    var9.method2733(false, 624);
                    var9.method2753((byte) 67, class70.field1107);
                    var9.method2753((byte) 50, class154.method1160(arg0 - 240));
                    var9.method2739((byte) -86, class465.field6689);
                    var9.method2739((byte) -86, class597.field8633);
                    var9.method2753((byte) 77, class525.field7713.field5969);
                    class134.method1028(var9, (byte) 122);
                    var9.method2703(false, class251.field3625);
                    var9.method2733(false, class557.field8151);
                    class465 var12 = new class465(class695.method3916(13));
                    class525.field7713.method2482(var12, -103);
                    var9.method2753((byte) 92, var12.field6710);
                    var9.method2731(0, var12.field6710, var12.field6719, 0);
                    class622.field8855 = true;
                    class465 var13 = new class465(class265.field3816.method3607(2));
                    class265.field3816.method3606((byte) 4, var13);
                    var9.method2731(0, var13.field6719.length, var13.field6719, 0);
                    var9.method2739((byte) -86, class189.field2958);
                    var9.method2721(class461.field6627, 520596624);
                    var9.method2753((byte) 53, class529.field7808 == null ? 0 : 1);
                    if (class529.field7808 != null) {
                        var9.method2703(false, class529.field7808);
                    }
                    class669.method3774((byte) -110, var9);
                    var9.method2731(0, var6.field6710, var6.field6719, 0);
                    var9.method2743(false, var9.field6710 - var11);
                } else {
                    var9.method2753((byte) 55, class561.field8190.field4340);
                    var9.method2739((byte) -86, 0);
                    int var10 = var9.field6710;
                    var9.method2733(false, 624);
                    var9.method2753((byte) 126, class486.field6942.field7806);
                    var9.method2753((byte) 83, class238.field3511);
                    class134.method1028(var9, (byte) 124);
                    var9.method2703(false, class251.field3625);
                    var9.method2733(false, class557.field8151);
                    class669.method3774((byte) -58, var9);
                    var9.method2731(0, var6.field6710, var6.field6719, arg0 ^ 0x75);
                    var9.method2743(false, var9.field6710 - var10);
                }
                class149.method1134(var8, true);
                class557.method3263(106);
                class699.field9897 = new class115(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class376.field5209.method2221(var7, -5666);
                class160.field2597 = 5;
            }
            if (class160.field2597 == 5) {
                if (!class256.field3696.method921(1, arg0 ^ 0xFFFFE92B)) {
                    return;
                }
                class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                int var15 = class376.field5209.field6719[0] & 0xFF;
                if (var15 == 21) {
                    class160.field2597 = 8;
                } else if (var15 == 29) {
                    class160.field2597 = 14;
                } else if (var15 == 1) {
                    class160.field2597 = 6;
                    class562.method3287(var15, arg0 ^ 0xFFFFFF89);
                    return;
                } else if (var15 == 2) {
                    class160.field2597 = 9;
                } else if (var15 == 15) {
                    class99.field1481 = -2;
                    class160.field2597 = 15;
                } else if (var15 == 23 && class498.field7413 < 2) {
                    class498.field7413++;
                    class3.field39 = 0;
                    class160.field2597 = 1;
                    class256.field3696.method913(-10406);
                    class256.field3696 = null;
                    return;
                } else {
                    class160.field2597 = 0;
                    class562.method3287(var15, -4);
                    class256.field3696.method913(-10406);
                    class256.field3696 = null;
                    class584.method3374(-6);
                    return;
                }
            }
            if (arg0 != 117) {
                method2558(5);
            }
            if (class160.field2597 == 7) {
                class410.method2452((byte) 127);
                class699 var16 = class336.method1996((byte) 121);
                class373 var17 = var16.field9908;
                var17.method2224(class699.field9897, 1);
                var17.method2226(-99, class561.field8197.field4340);
                class149.method1134(var16, true);
                class557.method3263(46);
                class160.field2597 = 5;
            } else if (class160.field2597 == 8) {
                if (class256.field3696.method921(1, -5794)) {
                    class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                    int var18 = class376.field5209.field6719[0] & 0xFF;
                    class160.field2597 = 0;
                    class461.field6628 = var18 * 60 + 180;
                    class562.method3287(21, -4);
                    class256.field3696.method913(-10406);
                    class256.field3696 = null;
                    class584.method3374(-6);
                }
            } else if (class160.field2597 == 14) {
                if (class256.field3696.method921(1, arg0 - 5911)) {
                    class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                    class38.field510 = class376.field5209.field6719[0] & 0xFF;
                    class160.field2597 = 0;
                    class562.method3287(29, -4);
                    class256.field3696.method913(arg0 - 10523);
                    class256.field3696 = null;
                    class584.method3374(-6);
                }
            } else if (class160.field2597 != 9) {
                if (class160.field2597 == 10) {
                    class373 var19 = class376.field5209;
                    if (class133.field2155 == 3) {
                        class210.field3212 = true;
                    } else {
                        class210.field3212 = false;
                    }
                    if (class133.field2155 == 2 || class133.field2155 == 3) {
                        if (!class256.field3696.method921(class416.field5936, -5794)) {
                            return;
                        }
                        class256.field3696.method918(19001, 0, class416.field5936, var19.field6719);
                        var19.field6710 = 0;
                        class447.field6459 = var19.method2705(-68);
                        class385.field5643 = var19.method2705(-75);
                        class296.field4187 = var19.method2705(-124) == 1;
                        class375.field5202 = var19.method2705(-83) == 1;
                        class65.field937 = var19.method2705(-102) == 1;
                        class289.field4065 = var19.method2705(arg0 - 141) == 1;
                        class609.field8749 = var19.method2755((byte) -81);
                        class165.field2721 = var19.method2705(-120) == 1;
                        class457.field6575 = var19.method2701(true);
                        class206.field3186 = var19.method2705(-91) == 1;
                        if (class133.field2155 == 3) {
                            boolean var20 = var19.method2705(-71) == 1;
                            if (var20) {
                                long var21 = var19.method2727(0);
                                String var23 = class618.method3494(var21, -32105);
                                int var24 = var19.method2705(-76);
                                byte[] var25 = new byte[var24];
                                var19.method2225(-7088, var25, 0, var24);
                                String var26 = class580.method3357((byte) -12, var25);
                                class355 var27 = null;
                                try {
                                    class614 var28 = class653.field9220.method3949("3", 0, false);
                                    while (var28.field8787 == 0) {
                                        class564.method3300((byte) 108, 1L);
                                    }
                                    if (var28.field8787 == 1) {
                                        var27 = (class355) var28.field8785;
                                        int var29 = var23.length() + 8 + 2 + 3 + 5 - (-var26.length() + -2);
                                        if (class529.field7808 != null) {
                                            var29 += class529.field7808.length() + 2;
                                        }
                                        if (var29 > 120) {
                                            throw new RuntimeException(">120");
                                        }
                                        class465 var30 = new class465(var29 + 1);
                                        var30.method2753((byte) 90, var29);
                                        var30.method2753((byte) 59, 3);
                                        var30.method2728(arg0 - 150, var23);
                                        var30.method2728(arg0 ^ 0x2B, var26);
                                        var30.method2739((byte) -86, class557.field8151);
                                        var30.method2721(class461.field6627, 520596624);
                                        var30.method2753((byte) 81, class529.field7808 == null ? 0 : 1);
                                        if (class529.field7808 != null) {
                                            var30.method2728(arg0 - 42, class529.field7808);
                                        }
                                        var30.method2749(0);
                                        var27.method2149(var30.field6719, var30.field6710, 0, 1);
                                    }
                                } catch (Exception var40) {
                                }
                                try {
                                    if (var27 != null) {
                                        var27.method2152(false);
                                    }
                                } catch (Exception var38) {
                                }
                                try {
                                    class157.method1180((byte) 64, class492.field7063, "demoaccountcreated");
                                } catch (Throwable var37) {
                                }
                            }
                        }
                        class14.field224.method2826(class206.field3186, (byte) 124);
                        class430.field6132.method43(class206.field3186, arg0 - 115);
                        class564.field8259.method3744(class206.field3186, (byte) -69);
                    } else if (class256.field3696.method921(class416.field5936, -5794)) {
                        class256.field3696.method918(arg0 ^ 0x4A4C, 0, class416.field5936, var19.field6719);
                        var19.field6710 = 0;
                        class447.field6459 = var19.method2705(-119);
                        class385.field5643 = var19.method2705(arg0 - 174);
                        class296.field4187 = var19.method2705(-111) == 1;
                        class375.field5202 = var19.method2705(-58) == 1;
                        class65.field937 = var19.method2705(arg0 - 183) == 1;
                        class342.field4740 = var19.method2744(arg0 - 118);
                        class165.field2721 = class342.field4740 > 0;
                        class75.field1176 = var19.method2755((byte) -84);
                        class598.field8641 = var19.method2755((byte) -67);
                        class415.field5893 = var19.method2755((byte) -102);
                        class74.field1174 = var19.method2691((byte) -67);
                        class300.field4214 = class653.field9220.method3965(arg0 ^ 0xFFFFFF83, class74.field1174);
                        class703.field9952 = var19.method2705(-99);
                        class538.field7895 = var19.method2755((byte) -87);
                        class674.field9584 = var19.method2755((byte) -82);
                        class123.field2006 = var19.method2705(-91) == 1;
                        class103.field1708.field3848 = class103.field1708.field3849 = var19.method2707(3);
                        class683.field9718 = var19.method2705(-69);
                        class479.field6864 = var19.method2691((byte) -67);
                        class491.field7053 = new class309();
                        class491.field7053.field4294 = var19.method2755((byte) -65);
                        if (class491.field7053.field4294 == 65535) {
                            class491.field7053.field4294 = -1;
                        }
                        class491.field7053.field4286 = var19.method2707(3);
                        if (class554.field8103 != class205.field3174) {
                            class491.field7053.field4288 = class491.field7053.field4294 + 50000;
                            class491.field7053.field4298 = class491.field7053.field4294 + 40000;
                        }
                        if (class554.field8103 != class434.field6248 && (class97.field1450.method1874(-109, class494.field7085) || class97.field1450.method1874(58, class233.field3457))) {
                            class197.method1387(0);
                        }
                    } else {
                        return;
                    }
                    if ((!class296.field4187 || class65.field937) && !class165.field2721) {
                        try {
                            class157.method1180((byte) 89, class492.field7063, "unzap");
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            class157.method1180((byte) 89, class492.field7063, "zap");
                        } catch (Throwable var39) {
                            if (class625.field8913) {
                                try {
                                    class492.field7063.getAppletContext().showDocument(new URL(class492.field7063.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var35) {
                                }
                            }
                        }
                    }
                    if (class554.field8103 == class205.field3174) {
                        try {
                            class157.method1180((byte) 116, class492.field7063, "loggedin");
                        } catch (Throwable var34) {
                        }
                    }
                    if (class133.field2155 != 2 && class133.field2155 != 3) {
                        class160.field2597 = 0;
                        class562.method3287(2, arg0 - 121);
                        class660.method3714((byte) -65);
                        class595.method3408((byte) 102, 7);
                        class447.field6457 = null;
                        return;
                    }
                    class160.field2597 = 12;
                }
                if (class160.field2597 == 12) {
                    if (!class256.field3696.method921(3, -5794)) {
                        return;
                    }
                    class256.field3696.method918(19001, 0, 3, class376.field5209.field6719);
                    class160.field2597 = 13;
                }
                if (class160.field2597 == 13) {
                    class373 var31 = class376.field5209;
                    var31.field6710 = 0;
                    if (var31.method2230(255)) {
                        if (!class256.field3696.method921(1, -5794)) {
                            return;
                        }
                        class256.field3696.method918(19001, 3, 1, var31.field6719);
                    }
                    class447.field6457 = class627.method3535((byte) -94)[var31.method2222((byte) -119)];
                    class99.field1481 = var31.method2755((byte) -73);
                    class160.field2597 = 11;
                }
                if (class160.field2597 == 11) {
                    if (class256.field3696.method921(class99.field1481, -5794)) {
                        class256.field3696.method918(19001, 0, class99.field1481, class376.field5209.field6719);
                        class376.field5209.field6710 = 0;
                        int var32 = class99.field1481;
                        class160.field2597 = 0;
                        class562.method3287(2, arg0 ^ 0xFFFFFF89);
                        class456.method2649(arg0 ^ 0x12);
                        class77.method605(class376.field5209, (byte) 72);
                        class443.field6420 = -1;
                        if (class568.field8310 == class447.field6457) {
                            class63.method521(true);
                        } else {
                            class331.method1962(-23875);
                        }
                        if (class376.field5209.field6710 != var32) {
                            throw new RuntimeException("lswp pos:" + class376.field5209.field6710 + " psize:" + var32);
                        }
                        class447.field6457 = null;
                    }
                } else if (class160.field2597 == 15) {
                    if (class99.field1481 == -2) {
                        if (!class256.field3696.method921(2, arg0 - 5911)) {
                            return;
                        }
                        class256.field3696.method918(arg0 + 18884, 0, 2, class376.field5209.field6719);
                        class376.field5209.field6710 = 0;
                        class99.field1481 = class376.field5209.method2755((byte) -46);
                    }
                    if (class256.field3696.method921(class99.field1481, -5794)) {
                        class256.field3696.method918(19001, 0, class99.field1481, class376.field5209.field6719);
                        class376.field5209.field6710 = 0;
                        class160.field2597 = 0;
                        int var33 = class99.field1481;
                        class562.method3287(15, arg0 - 121);
                        class421.method2489((byte) -48);
                        class77.method605(class376.field5209, (byte) 54);
                        if (class376.field5209.field6710 != var33) {
                            throw new RuntimeException("lswpr pos:" + class376.field5209.field6710 + " psize:" + var33);
                        }
                        class447.field6457 = null;
                    }
                }
            } else if (class256.field3696.method921(1, -5794)) {
                class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                class416.field5936 = class376.field5209.field6719[0] & 0xFF;
                class160.field2597 = 10;
            }
        } catch (IOException var41) {
            if (class256.field3696 != null) {
                class256.field3696.method913(arg0 ^ 0xFFFFD72F);
                class256.field3696 = null;
            }
            if (class498.field7413 >= 2) {
                class160.field2597 = 0;
                class562.method3287(-4, -4);
                class584.method3374(arg0 - 123);
            } else {
                if (class133.field2155 == 2 || class133.field2155 == 3) {
                    class97.field1450.method1872(0);
                } else {
                    class572.field8418.method1872(0);
                }
                class498.field7413++;
                class3.field39 = 0;
                class160.field2597 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 754)
    public class437(class529 arg0, int arg1, class345 arg2) {
        this.field6293 = arg2;
        this.field6293.method2098(0, 1);
        class465 var4 = new class465(this.field6293.method2081(-21, 0, 0));
        int var5 = var4.method2705(-80);
        if (var5 > 3) {
            this.field6291 = -1;
            this.field6288 = new int[0][];
            this.field6292 = new boolean[0];
        } else {
            int var6 = var4.method2705(-127);
            class696[] var7 = class247.method1592(0);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2705(-80);
                    if (var7[var9].field9879 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2705(-47);
                int var12 = var4.method2705(-118);
                if (var5 > 2) {
                    this.field6291 = var4.method2744(-1);
                } else {
                    this.field6291 = -1;
                }
                this.field6288 = new int[var12 + 1][];
                this.field6292 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2705(-50);
                    this.field6292[var15] = var4.method2705(-59) == 1;
                    int var16 = var4.method2755((byte) -59);
                    if (this.field6291 == -1) {
                        this.field6288[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6288[var15][var17] = var4.method2755((byte) -78);
                        }
                    } else {
                        this.field6288[var15] = new int[var16 + 1];
                        this.field6288[var15][0] = this.field6291;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6288[var15][var18 + 1] = var4.method2755((byte) -120);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field6288[var14] == null) {
                        if (this.field6291 == -1) {
                            this.field6288[var14] = new int[0];
                        } else {
                            this.field6288[var14] = new int[] { this.field6291 };
                        }
                    }
                }
            } else {
                this.field6288 = new int[0][];
                this.field6291 = -1;
                this.field6292 = new boolean[0];
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)Lgh;", line = 895)
    public final class457 method2562(int arg0, boolean arg1) {
        field6286++;
        byte[] var3 = this.field6293.method2081(-125, arg0, 1);
        if (arg1) {
            this.field6288 = null;
        }
        class457 var4 = new class457();
        var4.method2653((byte) 88, new class465(var3));
        return var4;
    }
}

import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class143 extends class217 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Ljd;")
    public static class86 field2706 = class122.method868(" )2> ", true);

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "[I")
    public static int[] field2717 = new int[5];

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "Ljd;")
    private static class86 field2714 = class122.method868("Connection lost)3", true);

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field2712 = 0;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "Ljd;")
    public static class86 field2718 = field2714;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[B")
    public static byte[] field2716 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lwj;")
    public static class6 field2708;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "[I")
    public static int[] field2711;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)V")
    public static final void method1016(int arg0, int arg1) {
        class69.field1395 = 1000 / arg1;
        int var2 = -117 % ((39 - arg0) / 36);
        field2715++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I")
    public static final int method1017(byte arg0) {
        field2709++;
        if (arg0 <= 84) {
            method1017((byte) 115);
        }
        if (class238.field4285) {
            return 0;
        } else if (class171.method1225(87)) {
            return class79.field1555 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method1018(Throwable arg0, String arg1, int arg2) {
        field2713++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class178.method1253(arg0, 17);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class66.field1303.field4514 != null) {
                class26 var8 = class66.field1303.method1719(-8216, new URL(class66.field1303.field4514.getCodeBase(), "clienterror.ws?c=" + class13.field407 + "&u=" + class5.field66 + "&v1=" + class254.field4513 + "&v2=" + class254.field4510 + "&e=" + var7));
                while (var8.field613 == 0) {
                    class91.method677(0, 1L);
                }
                if (arg2 >= 25 && var8.field613 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field611;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public static final void method1019(int arg0) {
        class62.method441(-29481, class84.field1637);
        class100.field1958++;
        field2707++;
        if (class114.field2181 && class20.field532) {
            int var1 = class6.field207;
            if (arg0 != 179) {
                field2716 = null;
            }
            int var2 = var1 - class260.field4653;
            if (var2 < class208.field3769) {
                var2 = class208.field3769;
            }
            if ((class208.field3769 + class198.field3517.field163) < (class84.field1637.field163 + var2)) {
                var2 = class208.field3769 + class198.field3517.field163 - class84.field1637.field163;
            }
            int var3 = var2 - class30.field628;
            int var4 = class90.field1841;
            int var5 = var4 - class273.field4790;
            int var6 = class84.field1637.field194;
            if (var5 < class247.field4387) {
                var5 = class247.field4387;
            }
            int var7 = var2 + class198.field3517.field138 - class208.field3769;
            if (class84.field1637.field131 + var5 > class247.field4387 + class198.field3517.field131) {
                var5 = class247.field4387 + class198.field3517.field131 - class84.field1637.field131;
            }
            int var8 = var5 - class8.field263;
            if (class100.field1958 > class84.field1637.field146 && (var6 < var3 || var3 < (-var6) || var8 > var6 || -var6 > var8)) {
                class136.field2601 = true;
            }
            int var9 = class198.field3517.field102 + var5 - class247.field4387;
            if (class84.field1637.field173 != null && class136.field2601) {
                class55 var10 = new class55();
                var10.field1113 = var9;
                var10.field1128 = class84.field1637.field173;
                var10.field1121 = var7;
                var10.field1114 = class84.field1637;
                class59.method427(var10, arg0 + 199821);
            }
            if (class56.field1151 == 0) {
                if (class136.field2601) {
                    if (class84.field1637.field76 != null) {
                        class55 var11 = new class55();
                        var11.field1121 = var7;
                        var11.field1129 = class98.field1943;
                        var11.field1128 = class84.field1637.field76;
                        var11.field1114 = class84.field1637;
                        var11.field1113 = var9;
                        class59.method427(var11, 200000);
                    }
                    if (class98.field1943 != null && client.method1107(class84.field1637) != null) {
                        class36.field809.method1356(200, true);
                        class210.field3801++;
                        class36.field809.method1380(class84.field1637.field222, -2097152);
                        class36.field809.method1396(class84.field1637.field177, -718541592);
                        class36.field809.method1394(class98.field1943.field222, 128);
                        class36.field809.method1418(114, class98.field1943.field177);
                    }
                } else if ((class141.field2670 == 1 || class156.method1137(arg0 - 280, class16.field463 + -1)) && class16.field463 > 2) {
                    class104.method744((byte) 122);
                } else if (class16.field463 > 0) {
                    class43.method347(false);
                }
                class84.field1637 = null;
            }
        } else if (class100.field1958 > 1) {
            class84.field1637 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public static void method1020(byte arg0) {
        if (arg0 != 97) {
            field2717 = null;
        }
        field2706 = null;
        field2716 = null;
        field2718 = null;
        field2714 = null;
        field2708 = null;
        field2711 = null;
        field2717 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[B)V")
    public static final void method1021(int arg0, byte[] arg1) {
        field2719++;
        class200 var2 = new class200(arg1);
        var2.field3565 = arg1.length - 2;
        class64.field1270 = var2.method1410(arg0 - 113);
        class138.field2628 = new int[class64.field1270];
        class173.field3169 = new byte[class64.field1270][];
        class24.field592 = new int[class64.field1270];
        class1.field6 = new int[class64.field1270];
        class191.field3393 = new int[class64.field1270];
        class213.field3857 = new byte[class64.field1270][];
        class264.field4673 = new boolean[class64.field1270];
        var2.field3565 = arg1.length - ((class64.field1270 * 8) + 7);
        class70.field1438 = var2.method1410(arg0 - 120);
        class169.field3121 = var2.method1410(-71);
        int var3 = (var2.method1408((byte) -58) & 0xFF) + 1;
        for (int var4 = 0; var4 < class64.field1270; var4++) {
            class138.field2628[var4] = var2.method1410(-65);
        }
        for (int var5 = 0; var5 < class64.field1270; var5++) {
            class1.field6[var5] = var2.method1410(-114);
        }
        for (int var6 = 0; var6 < class64.field1270; var6++) {
            class24.field592[var6] = var2.method1410(-124);
        }
        for (int var7 = 0; var7 < class64.field1270; var7++) {
            class191.field3393[var7] = var2.method1410(-104);
        }
        var2.field3565 = arg1.length - (class64.field1270 * 8 + var3 * 3 - 3) - 7;
        class268.field4718 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class268.field4718[var8] = var2.method1405(arg0 - 3);
            if (class268.field4718[var8] == 0) {
                class268.field4718[var8] = 1;
            }
        }
        var2.field3565 = arg0;
        for (int var9 = 0; var9 < class64.field1270; var9++) {
            int var10 = class24.field592[var9];
            boolean var11 = false;
            int var12 = class191.field3393[var9];
            int var13 = var10 * var12;
            byte[] var14 = new byte[var13];
            byte[] var15 = new byte[var13];
            class213.field3857[var9] = var15;
            class173.field3169[var9] = var14;
            int var16 = var2.method1408((byte) -128);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var13; var22++) {
                    var15[var22] = var2.method1412((byte) 122);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var13; var23++) {
                        byte var24 = var14[var23] = var2.method1412((byte) 112);
                        var11 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label88: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var10 <= var18) {
                                break label88;
                            }
                            for (int var19 = 0; var19 < var12; var19++) {
                                byte var20 = var14[var10 * var19 + var18] = var2.method1412((byte) 100);
                                var11 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var12; var21++) {
                        var15[var17 + (var10 * var21)] = var2.method1412((byte) 113);
                    }
                    var17++;
                }
            }
            class264.field4673[var9] = var11;
        }
    }
}

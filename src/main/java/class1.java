import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lu;")
    public static class135 field3 = class87.method676((byte) -69, " ");

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lu;")
    public static class135 field7 = class87.method676((byte) -49, " loggt sich aus)3");

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lu;")
    public static class135 field8 = class87.method676((byte) -92, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[[B")
    public static byte[][] field2 = new byte[1000][];

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lu;")
    private static class135 field16 = class87.method676((byte) -72, "K");

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lu;")
    public static class135 field24 = class87.method676((byte) -67, "invback");

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
    public static boolean field21 = false;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lu;")
    private static class135 field11 = class87.method676((byte) -105, "Players");

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    public static int[] field19 = new int[50];

    @OriginalMember(owner = "client!a", name = "j", descriptor = "[I")
    public static int[] field10 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lu;")
    public static class135 field5 = field16;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lu;")
    public static class135 field4 = field11;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Z")
    public static boolean field26 = false;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lu;")
    public static class135 field18 = field16;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lu;")
    private static class135 field9 = class87.method676((byte) -69, "Public chat");

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lu;")
    private static class135 field22 = class87.method676((byte) -64, "Login");

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Lu;")
    public static class135 field27 = field9;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lu;")
    public static class135 field1 = field22;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "J")
    public static long field25;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lbc;")
    public static class11 field6;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[B)V")
    public abstract void method1(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method3(byte arg0) {
        for (int var1 = 0; var1 < class126.field3009; var1++) {
            int var2 = class97.field2358[var1];
            class111 var3 = class96.field2340[var2];
            int var4 = class23.field581.method480(0);
            if ((var4 & 0x40) != 0) {
                int var5 = class23.field581.method472((byte) -123);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class23.field581.method480(0);
                if (var3.field170 == var5 && var5 != -1) {
                    int var7 = class17.method108(var5, 0).field2011;
                    if (var7 == 1) {
                        var3.field180 = 0;
                        var3.field229 = 0;
                        var3.field194 = 0;
                        var3.field177 = var6;
                    }
                    if (var7 == 2) {
                        var3.field229 = 0;
                    }
                } else if (var5 == -1 || var3.field170 == -1 || class17.method108(var5, 0).field2010 >= class17.method108(var3.field170, 0).field2010) {
                    var3.field170 = var5;
                    var3.field194 = 0;
                    var3.field180 = 0;
                    var3.field187 = var3.field195;
                    var3.field229 = 0;
                    var3.field177 = var6;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field2697 = class10.method55((byte) 124, class23.field581.method491(2));
                var3.field210 = var3.field2697.field1319;
                var3.field196 = var3.field2697.field1285;
                var3.field216 = var3.field2697.field1292;
                var3.field217 = var3.field2697.field1283;
                var3.field203 = var3.field2697.field1281;
                var3.field191 = var3.field2697.field1313;
                var3.field232 = var3.field2697.field1334;
                var3.field185 = var3.field2697.field1303;
                var3.field198 = var3.field2697.field1312;
            }
            if ((var4 & 0x10) != 0) {
                int var8 = class23.field581.method469(-128);
                int var9 = class23.field581.method469(-128);
                var3.method46(arg0 - 13254, var8, var9, class126.field2998);
                var3.field164 = class126.field2998 + 300;
                var3.field199 = class23.field581.method469(-128);
                var3.field171 = class23.field581.method469(arg0 ^ 0x45);
            }
            if ((var4 & 0x80) != 0) {
                var3.field227 = class23.field581.method491(2);
                if (var3.field227 == 65535) {
                    var3.field227 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field179 = class23.field581.method496(9);
                var3.field190 = 100;
            }
            if ((var4 & 0x20) != 0) {
                var3.field155 = class23.field581.method491(2);
                int var10 = class23.field581.method464(4);
                if (var3.field155 == 65535) {
                    var3.field155 = -1;
                }
                var3.field188 = var10 >> 16;
                var3.field193 = (var10 & 0xFFFF) + class126.field2998;
                var3.field225 = 0;
                var3.field201 = 0;
                if (class126.field2998 < var3.field193) {
                    var3.field201 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var11 = class23.field581.method484((byte) 125);
                int var12 = class23.field581.method456((byte) 98);
                var3.method46(arg0 ^ 0x343A, var11, var12, class126.field2998);
                var3.field164 = class126.field2998 + 300;
                var3.field199 = class23.field581.method469(-128);
                var3.field171 = class23.field581.method469(-128);
            }
            if ((var4 & 0x4) != 0) {
                var3.field160 = class23.field581.method483((byte) 24);
                var3.field223 = class23.field581.method491(2);
            }
        }
        if (arg0 != -59) {
            method5(null, null, 34, null);
        }
        field17++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjc;)V")
    public static final void method4(int arg0, class65 arg1) {
        field28++;
        if (class115.field2759) {
            method6((byte) -125, arg1);
            return;
        }
        if (class48.field1151 == 1 && class139.field3389 >= 715 && class20.field470 >= 453) {
            class4.field103 = !class4.field103;
            if (class4.field103) {
                class103.method844(-12);
            } else {
                class50.method378(class57.field1390, (byte) -51, 255, class19.field418, class41.field956, false);
            }
        }
        if (class83.field1963 == 5) {
            return;
        }
        if (arg0 != 1) {
            method4(-38, null);
        }
        class42.field991++;
        if (class83.field1963 != 10) {
            return;
        }
        if (class63.field1568 != 2 && class111.field2701 == 0) {
            if (class48.field1151 == 1) {
                short var2 = 463;
                byte var3 = 5;
                byte var4 = 100;
                byte var5 = 35;
                if (var3 <= class139.field3389 && class139.field3389 <= var3 + var4 && class20.field470 >= var2 && class20.field470 <= var2 + var5) {
                    class108.method876(arg0 - 102);
                    return;
                }
            }
            if (class28.field679 != null) {
                class108.method876(-94);
            }
        }
        int var6 = class48.field1151;
        int var7 = class139.field3389;
        int var8 = class20.field470;
        if (class37.field837 == 0) {
            short var9 = 302;
            short var10 = 291;
            if (var6 == 1 && var9 - 75 <= var7 && var7 <= var9 + 75 && var8 >= var10 - 20 && var10 + 20 >= var8) {
                class37.field837 = 3;
                class139.field3369 = 0;
            }
            short var11 = 462;
            if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var10 - 20 <= var8 && var8 <= var10 + 20) {
                class57.field1399 = class14.field323;
                class57.field1394 = class105.field2524;
                class37.field837 = 2;
                class139.field3369 = 0;
                class57.field1397 = class14.field334;
                return;
            }
        } else if (class37.field837 == 2) {
            short var14 = 302;
            short var15 = 321;
            short var16 = 231;
            int var20 = var16 + 30;
            if (var6 == 1 && var8 >= var20 - 15 && var8 < var20) {
                class139.field3369 = 0;
            }
            var20 += 15;
            if (var6 == 1 && var20 - 15 <= var8 && var8 < var20) {
                class139.field3369 = 1;
            }
            var20 += 15;
            if (var6 == 1 && var14 - 75 <= var7 && var7 <= var14 + 75 && var15 - 20 <= var8 && var8 <= var15 + 20) {
                class57.field1389 = class57.field1389.method1077(-123).method1088((byte) 56);
                if (class57.field1389.method1063(-64) == 0) {
                    class60.method502((byte) 116, class107.field2571, class14.field316, class14.field321);
                    return;
                }
                if (class57.field1401.method1063(-64) == 0) {
                    class60.method502((byte) 116, class87.field2068, class14.field300, class14.field336);
                    return;
                }
                class60.method502((byte) 116, class136.field3293, class14.field322, class14.field347);
                class125.method978(20, arg0);
                return;
            }
            short var17 = 462;
            if (var6 == 1 && var7 >= var17 - 75 && var17 + 75 >= var7 && var15 - 20 <= var8 && var15 + 20 >= var8) {
                class57.field1401 = class57.field1390;
                class37.field837 = 0;
                class57.field1389 = class57.field1390;
            }
            while (true) {
                while (class122.method965(arg0 - 75)) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < class86.field2052.method1063(-64); var19++) {
                        if (class32.field750 == class86.field2052.method1071(61, var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (class139.field3369 == 0) {
                        if (class46.field1106 == 85 && class57.field1389.method1063(arg0 - 65) > 0) {
                            class57.field1389 = class57.field1389.method1074(0, class57.field1389.method1063(-64) - 1, -27090);
                        }
                        if (class46.field1106 == 84 || class46.field1106 == 80) {
                            class139.field3369 = 1;
                        }
                        if (var18 && class57.field1389.method1063(-64) < 12) {
                            class57.field1389 = class57.field1389.method1070(class32.field750, 255);
                        }
                    } else if (class139.field3369 == 1) {
                        if (class46.field1106 == 85 && class57.field1401.method1063(-64) > 0) {
                            class57.field1401 = class57.field1401.method1074(0, class57.field1401.method1063(-64) - 1, -27090);
                        }
                        if (class46.field1106 == 84 || class46.field1106 == 80) {
                            class139.field3369 = 0;
                        }
                        if (var18 && class57.field1401.method1063(-64) < 20) {
                            class57.field1401 = class57.field1401.method1070(class32.field750, 255);
                        }
                    }
                }
                return;
            }
        } else if (class37.field837 == 3) {
            short var12 = 321;
            short var13 = 382;
            if (var6 == 1 && var13 - 75 <= var7 && var13 + 75 >= var7 && var12 - 20 <= var8 && var8 <= var12 + 20) {
                class37.field837 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lg;Lg;ILg;)V")
    public static final void method5(class43 arg0, class43 arg1, int arg2, class43 arg3) {
        if (arg2 != -8665) {
            field21 = false;
        }
        class34.field802 = arg1;
        field13++;
        class94.field2278 = arg0;
        class105.field2523 = arg3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjc;)V")
    private static final void method6(byte arg0, class65 arg1) {
        field20++;
        int var2 = -117 / ((arg0 + 16) / 48);
        if (class48.field1151 != 1) {
            return;
        }
        short var3 = 280;
        if (var3 <= class139.field3389 && class139.field3389 <= var3 + 14 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(0, 0, (byte) 108);
            return;
        }
        if (var3 + 15 <= class139.field3389 && class139.field3389 <= var3 + 80 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(1, 0, (byte) 108);
            return;
        }
        short var4 = 390;
        if (var4 <= class139.field3389 && var4 + 14 >= class139.field3389 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(0, 1, (byte) 108);
            return;
        }
        if (class139.field3389 >= var4 + 15 && class139.field3389 <= var4 + 80 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(1, 1, (byte) 108);
            return;
        }
        short var5 = 500;
        if (var5 <= class139.field3389 && class139.field3389 <= var5 + 14 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(0, 2, (byte) 108);
            return;
        }
        if (var5 + 15 <= class139.field3389 && var5 + 80 >= class139.field3389 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(1, 2, (byte) 108);
            return;
        }
        short var6 = 610;
        if (var6 <= class139.field3389 && var6 + 14 >= class139.field3389 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(0, 3, (byte) 108);
            return;
        }
        if (class139.field3389 >= var6 + 15 && class139.field3389 <= var6 + 80 && class20.field470 >= 4 && class20.field470 <= 18) {
            class22.method174(1, 3, (byte) 108);
            return;
        }
        if (class139.field3389 >= 708 && class20.field470 >= 4 && class139.field3389 <= 758 && class20.field470 <= 20) {
            class115.field2759 = false;
            class128.field3090.method70(0, 0);
            class76.field1790.method70(382, 0);
            class29.field694.method29(382 - class29.field694.field132 / 2, 18);
            return;
        }
        if (class117.field2815 == -1) {
            return;
        }
        class50 var7 = class99.field2406[class117.field2815];
        if (var7.field1185 == field26) {
            byte[] var8 = class107.method867(2, new class135[] { var7.field1200, class63.field1577 }).method1093(14821);
            class104.field2515 = new String(var8, 0, var8.length);
            class115.field2759 = false;
            class52.field1240 = var7.field1186;
            if (class43.field1018 != 0) {
                class62.field1556 = 43594;
                class128.field3086 = 43594;
                class43.field1018 = 0;
                class10.field238 = 443;
            }
            class128.field3090.method70(0, 0);
            class76.field1790.method70(382, 0);
            class29.field694.method29(382 - class29.field694.field132 / 2, 18);
            return;
        }
        class135 var9 = class107.method867(2, new class135[] { class20.field456, var7.field1200, class63.field1577, class113.field2725, class23.field583, class68.method547(-1, class100.field2422 ? 1 : 0), class125.field2985, class68.method547(-1, class63.field1568), class40.field929, class68.method547(-1, class42.field967) });
        try {
            arg1.getAppletContext().showDocument(var9.method1079((byte) -105), "_self");
            return;
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static void method7(boolean arg0) {
        field5 = null;
        field4 = null;
        field19 = null;
        field22 = null;
        if (arg0) {
            method4(-83, null);
        }
        field2 = null;
        field16 = null;
        field1 = null;
        field10 = null;
        field7 = null;
        field27 = null;
        field9 = null;
        field3 = null;
        field8 = null;
        field18 = null;
        field6 = null;
        field11 = null;
        field24 = null;
    }
}

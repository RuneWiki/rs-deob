import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class109 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lse;")
    private class124 field2717 = new class124();

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lrd;")
    public static class117 field2722 = class95.method812("T", (byte) 8);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[J")
    public static long[] field2720 = new long[100];

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lrd;")
    public static class117 field2718 = class95.method812("Willkommen auf RuneScape", (byte) 8);

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lrd;")
    private static class117 field2734 = class95.method812("Error connecting to server)3", (byte) 8);

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Lrd;")
    private static class117 field2733 = class95.method812("flash2:", (byte) 8);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lrd;")
    public static class117 field2715 = field2733;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
    public static volatile boolean field2727 = true;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lrd;")
    public static class117 field2732 = field2734;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Lrd;")
    private static class117 field2737 = class95.method812("The server is being updated)3", (byte) 8);

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lrd;")
    public static class117 field2729 = field2733;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lrd;")
    public static class117 field2725 = field2737;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field2739 = 0;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lra;")
    public static class114 field2726;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Lcd;")
    public static class19 field2731;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "[I")
    public static int[] field2736;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Lse;")
    public final class124 method895(int arg0) {
        field2735++;
        class124 var2 = this.field2717.field3000;
        if (arg0 > -59) {
            field2737 = null;
        }
        return this.field2717 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method896(byte arg0) {
        if (arg0 != -9) {
            return;
        }
        field2721++;
        while (class104.field2588.method740(122, class17.field395) >= 27) {
            int var1 = class104.field2588.method741(15, -30);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class93.field2334[var1] == null) {
                class93.field2334[var1] = new class36();
                var2 = true;
            }
            class36 var3 = class93.field2334[var1];
            class95.field2379[class24.field678++] = var1;
            var3.field722 = class85.field2236;
            int var4 = class104.field2588.method741(1, 3);
            int var5 = class77.field2103[class104.field2588.method741(3, 119)];
            if (var2) {
                var3.field697 = var5;
            }
            int var6 = class104.field2588.method741(5, 123);
            int var7 = class104.field2588.method741(1, 120);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class135.field3229[class47.field1329++] = var1;
            }
            var3.field1061 = class45.method492(class104.field2588.method741(13, -102), (byte) 52);
            int var8 = class104.field2588.method741(5, -13);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field689 = var3.field1061.field397;
            var3.field718 = var3.field1061.field438;
            var3.field685 = var3.field1061.field432;
            var3.field721 = var3.field1061.field405;
            if (var3.field718 == 0) {
                var3.field697 = 0;
            }
            var3.field715 = var3.field1061.field406;
            var3.field719 = var3.field1061.field419;
            var3.field728 = var3.field1061.field391;
            var3.field750 = var3.field1061.field415;
            var3.field726 = var3.field1061.field388;
            var3.method267(class144.field3516.field708[0] + var8, class144.field3516.field739[0] + var6, -128, var4 == 1);
        }
        class104.field2588.method733((byte) -61);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method897(int arg0, Throwable arg1, String arg2) {
        field2728++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class42.method476(arg1, 79);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            if (arg0 != -8638) {
                field2715 = null;
            }
            String var7 = var6.replace('#', '_');
            if (class138.field3313.field187 != null) {
                class31 var8 = class138.field3313.method67(115, new URL(class138.field3313.field187.getCodeBase(), "clienterror.ws?c=" + class137.field3302 + "&u=" + class93.field2339 + "&v1=" + class9.field197 + "&v2=" + class9.field188 + "&e=" + var7));
                while (var8.field940 == 0) {
                    class60.method611(1L, true);
                }
                if (var8.field940 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field937;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method898(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 >> 14 & 0x7FFF;
        int var5 = class90.field2308.method363(class120.field2940, arg2, arg0, arg1);
        field2723++;
        if (var5 == -1) {
            return false;
        } else if (arg3 == -125) {
            int var6 = var5 & 0x1F;
            int var7 = var5 >> 6 & 0x3;
            if (var6 == 10 || var6 == 11 || var6 == 22) {
                class62 var8 = class147.method1191((byte) 93, var4);
                int var9;
                int var10;
                if (var7 == 0 || var7 == 2) {
                    var10 = var8.field1750;
                    var9 = var8.field1737;
                } else {
                    var9 = var8.field1750;
                    var10 = var8.field1737;
                }
                int var11 = var8.field1757;
                if (var7 != 0) {
                    var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
                }
                class136.method1103(0, arg2, 2, true, arg0, 0, var10, class144.field3516.field739[0], var11, class144.field3516.field708[0], arg3 + 123, var9);
            } else {
                class136.method1103(var7, arg2, 2, true, arg0, var6 + 1, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            }
            class99.field2458 = class66.field1873;
            class90.field2311 = class68.field1909;
            class135.field3228 = 2;
            class38.field1097 = 0;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lse;I)V")
    public final void method899(class124 arg0, int arg1) {
        if (arg1 != 6995) {
            field2729 = null;
        }
        field2738++;
        if (arg0.field3004 != null) {
            arg0.method1000(arg1 - 6880);
        }
        arg0.field3000 = this.field2717.field3000;
        arg0.field3004 = this.field2717;
        arg0.field3004.field3000 = arg0;
        arg0.field3000.field3004 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)[Lra;")
    public static final class114[] method900(int arg0) {
        field2716++;
        class114[] var1 = new class114[class2.field31];
        int var2 = 86 % ((arg0 - 63) / 50);
        for (int var3 = 0; var3 < class2.field31; var3++) {
            class114 var4 = var1[var3] = new class114();
            var4.field2802 = class15.field343;
            var4.field2799 = class21.field597;
            var4.field2795 = class24.field673[var3];
            var4.field2801 = class43.field1219[var3];
            var4.field2800 = class141.field3352[var3];
            var4.field2798 = class66.field1868[var3];
            var4.field2796 = class68.field1902;
            var4.field2797 = class68.field1920[var3];
        }
        class5.method36((byte) 71);
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Z")
    public static final boolean method901(byte arg0) {
        field2724++;
        if (class119.field2923 == null) {
            return false;
        }
        try {
            int var1 = class119.field2923.method757(true);
            if (var1 == 0) {
                return false;
            }
            if (class92.field2324 == -1) {
                var1--;
                class119.field2923.method756(1, 86, class104.field2588.field326, 0);
                class104.field2588.field314 = 0;
                class92.field2324 = class104.field2588.method732((byte) 45);
                class17.field395 = class53.field1487[class92.field2324];
            }
            if (class17.field395 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class119.field2923.method756(1, 121, class104.field2588.field326, 0);
                class17.field395 = class104.field2588.field326[0] & 0xFF;
                var1--;
            }
            if (class17.field395 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class119.field2923.method756(2, 101, class104.field2588.field326, 0);
                var1 -= 2;
                class104.field2588.field314 = 0;
                class17.field395 = class104.field2588.method138((byte) 108);
            }
            if (class17.field395 > var1) {
                return false;
            }
            class104.field2588.field314 = 0;
            class119.field2923.method756(class17.field395, 115, class104.field2588.field326, 0);
            class68.field1911 = class134.field3206;
            class134.field3206 = class138.field3323;
            class119.field2922 = 0;
            class138.field3323 = class92.field2324;
            if (class92.field2324 == 236) {
                int var2 = class104.field2588.method156(255);
                int var3 = class104.field2588.method127(true);
                if (var3 == 65535) {
                    var3 = -1;
                }
                if (class134.field3210[var2] == var3) {
                    class134.method1096(class134.field3210[var2], false);
                } else {
                    class87.method782((byte) 121, class134.field3210[var2]);
                    class134.field3210[var2] = var3;
                }
                class13.field262 = true;
                class15.field339 = true;
                class92.method803((byte) -80, class134.field3210[var2]);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 248) {
                int var4 = class104.field2588.method125(-28423);
                class117 var5 = class104.field2588.method171((byte) 110);
                class144 var6 = class15.method172(var4, -13778);
                var6.field3417 = var5;
                if (var4 >> 16 == class134.field3210[class101.field2518]) {
                    class13.field262 = true;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 105) {
                int var7 = class104.field2588.method127(true);
                int var8 = class104.field2588.method121((byte) -105);
                class144 var9 = class15.method172(var8, -13778);
                var9.field3474 = var7;
                var9.field3487 = 1;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 90) {
                class14.method170(96, true);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 89) {
                long var10 = class104.field2588.method133(-128);
                byte var12 = class104.field2588.method129((byte) -85);
                long var13 = class104.field2588.method133(-128);
                long var15 = (long) class104.field2588.method138((byte) 86);
                long var17 = (long) class104.field2588.method122(17260);
                int var19 = class104.field2588.method153(true);
                long var20 = (var15 << 32) + var17;
                boolean var22 = false;
                for (int var23 = 0; var23 < 100; var23++) {
                    if (class61.field1719[var23] == var20) {
                        var22 = true;
                        break;
                    }
                }
                if (var19 <= 1) {
                    for (int var24 = 0; var24 < field2739; var24++) {
                        if (field2720[var24] == var10) {
                            var22 = true;
                            break;
                        }
                    }
                }
                if (!var22 && class121.field2960 == 0) {
                    class61.field1719[class85.field2225] = var20;
                    class85.field2225 = (class85.field2225 + 1) % 100;
                    class117 var25 = class14.method128(class104.field2588, -32079).method970(-5812);
                    class117 var26 = class18.method193(new class117[] { class67.field1883, class26.method272(false, var13), class41.field1170, class142.method1131(var12, true), class117.field2854 }, 108);
                    if (var19 == 2 || var19 == 3) {
                        class52.method572(class18.method193(new class117[] { var26, class39.field1134, class26.method272(false, var10).method957(-8191) }, 59), -1, 7, var25);
                    } else if (var19 == 1) {
                        class52.method572(class18.method193(new class117[] { var26, class61.field1698, class26.method272(false, var10).method957(-8191) }, 45), -1, 7, var25);
                    } else {
                        class52.method572(class18.method193(new class117[] { var26, class26.method272(false, var10).method957(-8191) }, 45), -1, 3, var25);
                    }
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 161) {
                long var27 = class104.field2588.method133(-128);
                long var29 = (long) class104.field2588.method138((byte) 94);
                long var31 = (long) class104.field2588.method122(17260);
                int var33 = class104.field2588.method153(true);
                long var34 = (var29 << 32) + var31;
                boolean var36 = false;
                for (int var37 = 0; var37 < 100; var37++) {
                    if (class61.field1719[var37] == var34) {
                        var36 = true;
                        break;
                    }
                }
                if (var33 <= 1) {
                    for (int var38 = 0; var38 < field2739; var38++) {
                        if (field2720[var38] == var27) {
                            var36 = true;
                            break;
                        }
                    }
                }
                if (!var36 && class121.field2960 == 0) {
                    class61.field1719[class85.field2225] = var34;
                    class85.field2225 = (class85.field2225 + 1) % 100;
                    class117 var39 = class14.method128(class104.field2588, -32079).method970(-5812);
                    if (var33 == 2 || var33 == 3) {
                        class52.method572(class18.method193(new class117[] { class39.field1134, class26.method272(false, var27).method957(-8191) }, 79), -1, 7, var39);
                    } else if (var33 == 1) {
                        class52.method572(class18.method193(new class117[] { class61.field1698, class26.method272(false, var27).method957(-8191) }, 27), -1, 7, var39);
                    } else {
                        class52.method572(class26.method272(false, var27).method957(-8191), -1, 3, var39);
                    }
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 147) {
                int var40 = class104.field2588.method132(65280);
                int var41 = class104.field2588.method138((byte) 113);
                class33.method389(13147, var41);
                if (var40 != -1) {
                    class33.method389(13147, var40);
                }
                if (class121.field2977 != -1) {
                    class87.method782((byte) 94, class121.field2977);
                    class121.field2977 = -1;
                }
                if (class27.field805 != -1) {
                    class87.method782((byte) 109, class27.field805);
                    class27.field805 = -1;
                }
                if (class56.field1553 != -1) {
                    class87.method782((byte) 114, class56.field1553);
                    class56.field1553 = -1;
                }
                if (class17.field428 == var41) {
                    class134.method1096(class17.field428, false);
                } else {
                    class87.method782((byte) 101, class17.field428);
                    class17.field428 = var41;
                    class85.method769(0, 35);
                }
                if (class100.field2495 == var41) {
                    class134.method1096(class100.field2495, false);
                } else {
                    class87.method782((byte) 98, class100.field2495);
                    class100.field2495 = var40;
                }
                class80.field2142 = 0;
                class85.field2230 = -1;
                class92.method803((byte) -128, class17.field428);
                class92.method803((byte) -95, class100.field2495);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 245) {
                class18.field462 = class104.field2588.method153(true);
                class42.field1202 = class104.field2588.method153(true);
                class77.field2095 = class104.field2588.method153(true);
                class92.field2324 = -1;
                class115.field2812 = true;
                class18.field458 = true;
                return true;
            }
            if (class92.field2324 == 209) {
                for (int var42 = 0; var42 < class141.field3346; var42++) {
                    class127 var43 = class90.method794(var42, 97);
                    if (var43 != null && var43.field3040 == 0) {
                        class101.field2514[var42] = 0;
                        class105.field2621[var42] = 0;
                    }
                }
                if (class94.field2352 != -1) {
                    class18.field458 = true;
                }
                class13.field262 = true;
                class92.field2324 = -1;
                class84.field2198 = class85.field2236;
                return true;
            }
            if (class92.field2324 == 17) {
                class53.field1510 = class104.field2588.method153(true);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 221) {
                int var44 = class104.field2588.method138((byte) 124);
                int var45 = class104.field2588.method159(-97);
                class144 var46 = class15.method172(var45, -13778);
                if (var46 != null && var46.field3533 == 0) {
                    if (var44 > var46.field3420 - var46.field3490) {
                        var44 = var46.field3420 - var46.field3490;
                    }
                    if (var44 < 0) {
                        var44 = 0;
                    }
                    var46.field3543 = var44;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 235) {
                class44.field1255 = class104.field2588.method138((byte) 80);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 112) {
                class13.field262 = true;
                int var47 = class104.field2588.method150(-2);
                int var48 = class104.field2588.method144((byte) -108);
                int var49 = class104.field2588.method144((byte) -108);
                class42.field1208[var48] = var47;
                class90.field2300[var48] = var49;
                class86.field2246[var48] = 1;
                for (int var50 = 0; var50 < 98; var50++) {
                    if (var47 >= class25.field736[var50]) {
                        class86.field2246[var48] = var50 + 2;
                    }
                }
                class92.field2324 = -1;
                class25.field760 = class85.field2236;
                return true;
            }
            if (class92.field2324 == 251) {
                int var51 = class104.field2588.method168(255);
                int var52 = class104.field2588.method144((byte) -111);
                int var53 = class104.field2588.method144((byte) 121);
                class120.field2940 = var52 >> 1;
                class144.field3516.method267(var53, var51, -127, (var52 & 0x1) == 1);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 68) {
                class18.field457 = class104.field2588.method153(true);
                class92.field2324 = -1;
                return true;
            }
            if (arg0 <= 100) {
                return true;
            }
            if (class92.field2324 == 244) {
                int var54 = class104.field2588.method132(65280);
                class33.method389(13147, var54);
                if (class56.field1553 != -1) {
                    class87.method782((byte) 88, class56.field1553);
                    class18.field458 = true;
                    class56.field1553 = -1;
                }
                if (class17.field428 != -1) {
                    class87.method782((byte) 108, class17.field428);
                    class17.field428 = -1;
                    class85.method769(0, 30);
                }
                if (class100.field2495 != -1) {
                    class87.method782((byte) 94, class100.field2495);
                    class100.field2495 = -1;
                }
                if (class121.field2977 != -1) {
                    class87.method782((byte) 112, class121.field2977);
                    class121.field2977 = -1;
                }
                if (class27.field805 == var54) {
                    class134.method1096(class27.field805, false);
                } else {
                    class87.method782((byte) 126, class27.field805);
                    class27.field805 = var54;
                }
                class15.field339 = true;
                class13.field262 = true;
                class85.field2230 = -1;
                if (class80.field2142 != 0) {
                    class18.field458 = true;
                    class80.field2142 = 0;
                }
                class92.method803((byte) -80, class27.field805);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 164) {
                long var55 = class104.field2588.method133(-128);
                class117 var57 = class14.method128(class104.field2588, -32079).method970(-5812);
                class52.method572(class26.method272(false, var55).method957(-8191), -1, 6, var57);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 175) {
                int var58 = class104.field2588.method121((byte) -123);
                class144 var59 = class15.method172(var58, -13778);
                var59.field3487 = 3;
                var59.field3474 = class144.field3516.field2502.method379(-1221765009);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 114) {
                int var60 = class104.field2588.method143(-2);
                int var61 = class104.field2588.method150(-2);
                class144 var62 = class15.method172(var61, -13778);
                if (var62.field3427 != var60 || var60 == -1) {
                    var62.field3481 = 0;
                    var62.field3540 = 0;
                    var62.field3427 = var60;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 92) {
                for (int var63 = 0; var63 < class93.field2340.length; var63++) {
                    if (class93.field2340[var63] != null) {
                        class93.field2340[var63].field703 = -1;
                    }
                }
                for (int var64 = 0; var64 < class93.field2334.length; var64++) {
                    if (class93.field2334[var64] != null) {
                        class93.field2334[var64].field703 = -1;
                    }
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 97) {
                int var65 = class104.field2588.method135((byte) -98);
                if (class94.field2352 != var65) {
                    class87.method782((byte) 88, class94.field2352);
                    class94.field2352 = var65;
                }
                class18.field458 = true;
                class92.method803((byte) -94, class94.field2352);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 101) {
                boolean var66 = class104.field2588.method153(true) == 1;
                int var67 = class104.field2588.method121((byte) -65);
                class144 var68 = class15.method172(var67, -13778);
                var68.field3539 = var66;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 76) {
                class13.field262 = true;
                int var69 = class104.field2588.method121((byte) 123);
                int var70 = class104.field2588.method138((byte) 119);
                if (var69 < -70000) {
                    var70 += 32768;
                }
                class144 var71;
                if (var69 < 0) {
                    var71 = null;
                } else {
                    var71 = class15.method172(var69, -13778);
                }
                while (class104.field2588.field314 < class17.field395) {
                    int var72 = class104.field2588.method169(121);
                    int var73 = 0;
                    int var74 = class104.field2588.method138((byte) 123);
                    if (var74 != 0) {
                        var73 = class104.field2588.method153(true);
                        if (var73 == 255) {
                            var73 = class104.field2588.method121((byte) 77);
                        }
                    }
                    if (var71 != null && var72 >= 0 && var72 < var71.field3449.length) {
                        var71.field3449[var72] = var74;
                        var71.field3464[var72] = var73;
                    }
                    class121.method988(var74 - 1, var72, (byte) 17, var70, var73);
                }
                class92.field2324 = -1;
                class99.field2463 = class85.field2236;
                return true;
            }
            if (class92.field2324 == 13) {
                class20.field492 = true;
                class116.field2827 = class104.field2588.method153(true);
                class61.field1710 = class104.field2588.method153(true);
                class105.field2634 = class104.field2588.method138((byte) 104);
                class140.field3334 = class104.field2588.method153(true);
                class108.field2706 = class104.field2588.method153(true);
                if (class108.field2706 >= 100) {
                    int var75 = class116.field2827 * 128 + 64;
                    int var76 = class61.field1710 * 128 + 64;
                    int var77 = class133.method1091(class120.field2940, var76, (byte) -80, var75) - class105.field2634;
                    int var78 = var75 - class45.field1271;
                    int var79 = var77 - class38.field1117;
                    int var80 = var76 - class4.field105;
                    int var81 = (int) Math.sqrt((double) (var78 * var78 + var80 * var80));
                    class39.field1131 = (int) (Math.atan2((double) var79, (double) var81) * 325.949D) & 0x7FF;
                    class111.field2784 = (int) (-325.949D * Math.atan2((double) var78, (double) var80)) & 0x7FF;
                    if (class39.field1131 < 128) {
                        class39.field1131 = 128;
                    }
                    if (class39.field1131 > 383) {
                        class39.field1131 = 383;
                    }
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 7) {
                if (class101.field2518 == 12) {
                    class13.field262 = true;
                }
                class73.field2035 = class104.field2588.method153(true);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 38) {
                class35.field1042 = class104.field2588.method168(255);
                class40.field1154 = class104.field2588.method156(255);
                for (int var82 = class35.field1042; var82 < class35.field1042 + 8; var82++) {
                    for (int var83 = class40.field1154; var83 < class40.field1154 + 8; var83++) {
                        if (class105.field2631[class120.field2940][var82][var83] != null) {
                            class105.field2631[class120.field2940][var82][var83] = null;
                            class85.method767((byte) -56, var83, var82);
                        }
                    }
                }
                for (class132 var84 = (class132) class43.field1227.method3(false); var84 != null; var84 = (class132) class43.field1227.method14(127)) {
                    if (var84.field3155 >= class35.field1042 && var84.field3155 < class35.field1042 + 8 && class40.field1154 <= var84.field3153 && var84.field3153 < class40.field1154 + 8 && class120.field2940 == var84.field3169) {
                        var84.field3151 = 0;
                    }
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 217) {
                class40.field1154 = class104.field2588.method153(true);
                class35.field1042 = class104.field2588.method144((byte) 45);
                while (class17.field395 > class104.field2588.field314) {
                    class92.field2324 = class104.field2588.method153(true);
                    class74.method706(-121);
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 34) {
                class93.field2347 = class104.field2588.method153(true);
                class84.field2198 = class85.field2236;
                class92.field2324 = -1;
                class13.field262 = true;
                return true;
            }
            if (class92.field2324 == 153) {
                if (class27.field805 != -1) {
                    class87.method782((byte) 118, class27.field805);
                    class13.field262 = true;
                    class15.field339 = true;
                    class27.field805 = -1;
                }
                if (class56.field1553 != -1) {
                    class87.method782((byte) 99, class56.field1553);
                    class56.field1553 = -1;
                    class18.field458 = true;
                }
                if (class17.field428 != -1) {
                    class87.method782((byte) 86, class17.field428);
                    class17.field428 = -1;
                    class85.method769(0, 30);
                }
                if (class100.field2495 != -1) {
                    class87.method782((byte) 87, class100.field2495);
                    class100.field2495 = -1;
                }
                if (class121.field2977 != -1) {
                    class87.method782((byte) 111, class121.field2977);
                    class121.field2977 = -1;
                }
                if (class80.field2142 != 0) {
                    class80.field2142 = 0;
                    class18.field458 = true;
                }
                class85.field2230 = -1;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 228) {
                int var85 = class104.field2588.method153(true);
                int var86 = class104.field2588.method153(true);
                int var87 = class104.field2588.method153(true);
                int var88 = class104.field2588.method153(true);
                class2.field39[var85] = true;
                class93.field2344[var85] = var86;
                class47.field1316[var85] = var87;
                class86.field2252[var85] = var88;
                class96.field2399[var85] = 0;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 193) {
                class23.field668 = class104.field2588.method144((byte) 98);
                if (class23.field668 == class101.field2518) {
                    class13.field262 = true;
                    if (class23.field668 == 3) {
                        class101.field2518 = 1;
                    } else {
                        class101.field2518 = 3;
                    }
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 255) {
                int var89 = class104.field2588.method127(true);
                class33.method389(13147, var89);
                if (class27.field805 != -1) {
                    class87.method782((byte) 82, class27.field805);
                    class27.field805 = -1;
                    class15.field339 = true;
                    class13.field262 = true;
                }
                if (class56.field1553 != -1) {
                    class87.method782((byte) 107, class56.field1553);
                    class56.field1553 = -1;
                    class18.field458 = true;
                }
                if (class17.field428 != -1) {
                    class87.method782((byte) 97, class17.field428);
                    class17.field428 = -1;
                    class85.method769(0, 30);
                }
                if (class100.field2495 != -1) {
                    class87.method782((byte) 89, class100.field2495);
                    class100.field2495 = -1;
                }
                if (class121.field2977 == var89) {
                    class134.method1096(class121.field2977, false);
                } else {
                    class87.method782((byte) 111, class121.field2977);
                    class121.field2977 = var89;
                }
                class85.field2230 = -1;
                if (class80.field2142 != 0) {
                    class18.field458 = true;
                    class80.field2142 = 0;
                }
                class92.method803((byte) -102, class121.field2977);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 5) {
                long var90 = class104.field2588.method133(-128);
                int var92 = class104.field2588.method138((byte) 99);
                int var93 = class104.field2588.method153(true);
                class117 var94 = class26.method272(false, var90).method957(-8191);
                for (int var95 = 0; var95 < class5.field119; var95++) {
                    if (class56.field1551[var95] == var90) {
                        if (class35.field1037[var95] != var92) {
                            class35.field1037[var95] = var92;
                            class13.field262 = true;
                            if (var92 > 0) {
                                class52.method572(class134.field3215, -1, 5, class18.method193(new class117[] { var94, class80.field2135 }, 77));
                            }
                            if (var92 == 0) {
                                class52.method572(class134.field3215, -1, 5, class18.method193(new class117[] { var94, class97.field2429 }, 97));
                            }
                        }
                        class15.field352[var95] = var93;
                        var94 = null;
                        break;
                    }
                }
                if (var94 != null && class5.field119 < 200) {
                    class56.field1551[class5.field119] = var90;
                    class72.field2025[class5.field119] = var94;
                    class35.field1037[class5.field119] = var92;
                    class15.field352[class5.field119] = var93;
                    class84.field2198 = class85.field2236;
                    class5.field119++;
                    class13.field262 = true;
                }
                boolean var96 = false;
                while (!var96) {
                    var96 = true;
                    for (int var97 = 0; var97 < class5.field119 - 1; var97++) {
                        if (class35.field1037[var97] != class138.field3317 && class35.field1037[var97 + 1] == class138.field3317 || class35.field1037[var97] == 0 && class35.field1037[var97 + 1] != 0) {
                            var96 = false;
                            int var98 = class35.field1037[var97];
                            class35.field1037[var97] = class35.field1037[var97 + 1];
                            class35.field1037[var97 + 1] = var98;
                            class117 var99 = class72.field2025[var97];
                            class72.field2025[var97] = class72.field2025[var97 + 1];
                            class72.field2025[var97 + 1] = var99;
                            long var100 = class56.field1551[var97];
                            class56.field1551[var97] = class56.field1551[var97 + 1];
                            class56.field1551[var97 + 1] = var100;
                            int var102 = class15.field352[var97];
                            class15.field352[var97] = class15.field352[var97 + 1];
                            class15.field352[var97 + 1] = var102;
                            class13.field262 = true;
                        }
                    }
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 96) {
                class20.field492 = true;
                class64.field1828 = class104.field2588.method153(true);
                class102.field2574 = class104.field2588.method153(true);
                class102.field2572 = class104.field2588.method138((byte) 87);
                class95.field2372 = class104.field2588.method153(true);
                class38.field1116 = class104.field2588.method153(true);
                if (class38.field1116 >= 100) {
                    class45.field1271 = class64.field1828 * 128 + 64;
                    class4.field105 = class102.field2574 * 128 + 64;
                    class38.field1117 = class133.method1091(class120.field2940, class4.field105, (byte) -93, class45.field1271) - class102.field2572;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 29) {
                class40.field1154 = class104.field2588.method144((byte) 54);
                class35.field1042 = class104.field2588.method156(255);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 60) {
                int var103 = class104.field2588.method150(-2);
                int var104 = class104.field2588.method138((byte) 88);
                class144 var105 = class15.method172(var103, -13778);
                class92.field2324 = -1;
                var105.field3474 = var104;
                var105.field3487 = 2;
                return true;
            }
            if (class92.field2324 == 113) {
                int var106 = class104.field2588.method138((byte) 82);
                int var107 = class104.field2588.method153(true);
                int var108 = class104.field2588.method138((byte) 108);
                class6.method45(var106, var107, var108, -96);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 66) {
                int var109 = class104.field2588.method127(true);
                class68.method669(117, var109);
                class99.field2463 = class85.field2236;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 118) {
                class14.method170(107, false);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 149) {
                class13.field262 = true;
                int var110 = class104.field2588.method121((byte) -81);
                int var111 = class104.field2588.method138((byte) 125);
                class144 var112;
                if (var110 < 0) {
                    var112 = null;
                } else {
                    var112 = class15.method172(var110, -13778);
                }
                if (var110 < -70000) {
                    var111 += 32768;
                }
                if (var112 != null) {
                    for (int var113 = 0; var113 < var112.field3449.length; var113++) {
                        var112.field3449[var113] = 0;
                        var112.field3464[var113] = 0;
                    }
                }
                class1.method13(var111, (byte) -38);
                int var114 = class104.field2588.method138((byte) 125);
                for (int var115 = 0; var115 < var114; var115++) {
                    int var116 = class104.field2588.method127(true);
                    int var117 = class104.field2588.method156(255);
                    if (var117 == 255) {
                        var117 = class104.field2588.method159(-127);
                    }
                    if (var112 != null && var112.field3449.length > var115) {
                        var112.field3449[var115] = var116;
                        var112.field3464[var115] = var117;
                    }
                    class121.method988(var116 - 1, var115, (byte) 17, var111, var117);
                }
                class92.field2324 = -1;
                class99.field2463 = class85.field2236;
                return true;
            }
            if (class92.field2324 == 223) {
                class59.method607(class104.field2588, class17.field395, (byte) -125, class4.field104);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 218) {
                class117 var118 = class104.field2588.method171((byte) 110);
                if (var118.method964(-19618, class38.field1110)) {
                    class117 var119 = var118.method963(var118.method948((byte) 112, class144.field3537), 0, (byte) -127);
                    long var120 = var119.method966(88);
                    boolean var122 = false;
                    for (int var123 = 0; var123 < field2739; var123++) {
                        if (field2720[var123] == var120) {
                            var122 = true;
                            break;
                        }
                    }
                    if (!var122 && class121.field2960 == 0) {
                        class52.method572(var119, -1, 4, client.field610);
                    }
                } else if (var118.method964(-19618, class17.field407)) {
                    boolean var130 = false;
                    class117 var131 = var118.method963(var118.method948((byte) 85, class144.field3537), 0, (byte) -127);
                    long var132 = var131.method966(63);
                    for (int var134 = 0; var134 < field2739; var134++) {
                        if (field2720[var134] == var132) {
                            var130 = true;
                            break;
                        }
                    }
                    if (!var130 && class121.field2960 == 0) {
                        class52.method572(var131, -1, 8, class140.field3344);
                    }
                } else if (var118.method964(-19618, class7.field176)) {
                    class117 var124 = var118.method963(var118.method948((byte) 97, class144.field3537), 0, (byte) -127);
                    long var125 = var124.method966(120);
                    boolean var127 = false;
                    for (int var128 = 0; var128 < field2739; var128++) {
                        if (field2720[var128] == var125) {
                            var127 = true;
                            break;
                        }
                    }
                    if (!var127 && class121.field2960 == 0) {
                        class117 var129 = var118.method963(var118.method954(93) - 9, var118.method948((byte) 86, class144.field3537) - -1, (byte) -127);
                        class52.method572(var124, -1, 8, var129);
                    }
                } else {
                    class52.method572(class134.field3215, -1, 0, var118);
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 230) {
                int var135 = class104.field2588.method138((byte) 105);
                int var136 = class104.field2588.method121((byte) 98);
                class101.field2514[var135] = var136;
                if (class105.field2621[var135] != var136) {
                    class105.field2621[var135] = var136;
                    class73.method697(var135, (byte) -117);
                    class13.field262 = true;
                    if (class94.field2352 != -1) {
                        class18.field458 = true;
                    }
                }
                class92.field2324 = -1;
                class84.field2198 = class85.field2236;
                return true;
            }
            if (class92.field2324 == 21) {
                class40.field1164 = 0;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 162) {
                class84.method760(0);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 213) {
                int var137 = class104.field2588.method135((byte) -87);
                if (var137 >= 0) {
                    class33.method389(13147, var137);
                }
                if (class35.field1038 != var137) {
                    class87.method782((byte) 91, class35.field1038);
                    class35.field1038 = var137;
                }
                class92.method803((byte) -119, class35.field1038);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 210) {
                if (class56.field1553 != -1) {
                    class87.method782((byte) 111, class56.field1553);
                    class56.field1553 = -1;
                }
                class80.field2142 = 2;
                class36.field1058 = false;
                class92.field2324 = -1;
                class134.field3209 = class134.field3215;
                class18.field458 = true;
                return true;
            }
            if (class92.field2324 == 231) {
                int var138 = class104.field2588.method159(-124);
                class144 var139 = class15.method172(var138, -13778);
                for (int var140 = 0; var140 < var139.field3449.length; var140++) {
                    var139.field3449[var140] = -1;
                    var139.field3449[var140] = 0;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 25) {
                int var141 = class104.field2588.method167(true);
                int var142 = class104.field2588.method150(-2);
                int var143 = var141 >> 10 & 0x1F;
                int var144 = var141 & 0x1F;
                class144 var145 = class15.method172(var142, -13778);
                int var146 = var141 >> 5 & 0x1F;
                class92.field2324 = -1;
                var145.field3502 = (var144 << 3) + (var143 << 19) + (var146 << 11);
                return true;
            }
            if (class92.field2324 == 71) {
                int var147 = class104.field2588.method127(true);
                class33.method389(13147, var147);
                if (class27.field805 != -1) {
                    class87.method782((byte) 126, class27.field805);
                    class15.field339 = true;
                    class13.field262 = true;
                    class27.field805 = -1;
                }
                if (class17.field428 != -1) {
                    class87.method782((byte) 119, class17.field428);
                    class17.field428 = -1;
                    class85.method769(0, 30);
                }
                if (class100.field2495 != -1) {
                    class87.method782((byte) 92, class100.field2495);
                    class100.field2495 = -1;
                }
                if (class121.field2977 != -1) {
                    class87.method782((byte) 108, class121.field2977);
                    class121.field2977 = -1;
                }
                if (class56.field1553 == var147) {
                    class134.method1096(class56.field1553, false);
                } else {
                    class87.method782((byte) 99, class56.field1553);
                    class56.field1553 = var147;
                }
                class85.field2230 = -1;
                class92.method803((byte) -116, class56.field1553);
                class18.field458 = true;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 49) {
                int var148 = class104.field2588.method159(-97);
                int var149 = class104.field2588.method132(65280);
                int var150 = class104.field2588.method167(true);
                class144 var151 = class15.method172(var148, -13778);
                var151.field3413 = (var149 << 16) + var150;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 189) {
                int var152 = class104.field2588.method121((byte) 101);
                class5.field131 = class4.field104.method63(var152, (byte) 126);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 109) {
                class117 var153 = class104.field2588.method171((byte) 110);
                Object[] var154 = new Object[var153.method954(-41) + 1];
                for (int var155 = var153.method954(-68) - 1; var155 >= 0; var155--) {
                    if (var153.method953(var155, 2) == 115) {
                        var154[var155 + 1] = class104.field2588.method171((byte) 110);
                    } else {
                        var154[var155 + 1] = Integer.valueOf(class104.field2588.method121((byte) 109));
                    }
                }
                var154[0] = Integer.valueOf(class104.field2588.method121((byte) -95));
                class118.method980((byte) 109, var154, null, 0, 0, null, 0);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 146) {
                class141.field3358 = class104.field2588.method153(true);
                if (class141.field3358 == 1) {
                    class44.field1244 = class104.field2588.method138((byte) 85);
                }
                if (class141.field3358 >= 2 && class141.field3358 <= 6) {
                    if (class141.field3358 == 2) {
                        class5.field123 = 64;
                        class93.field2335 = 64;
                    }
                    if (class141.field3358 == 3) {
                        class5.field123 = 64;
                        class93.field2335 = 0;
                    }
                    if (class141.field3358 == 4) {
                        class93.field2335 = 128;
                        class5.field123 = 64;
                    }
                    if (class141.field3358 == 5) {
                        class5.field123 = 0;
                        class93.field2335 = 64;
                    }
                    if (class141.field3358 == 6) {
                        class5.field123 = 128;
                        class93.field2335 = 64;
                    }
                    class141.field3358 = 2;
                    class116.field2832 = class104.field2588.method138((byte) 70);
                    class52.field1459 = class104.field2588.method138((byte) 115);
                    class25.field755 = class104.field2588.method153(true);
                }
                if (class141.field3358 == 10) {
                    class2.field61 = class104.field2588.method138((byte) 96);
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 134) {
                class35.field1025 = class104.field2588.method138((byte) 125) * 30;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 69) {
                class5.method40((byte) -123);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 62) {
                class46.method496(-112);
                class92.field2324 = -1;
                return false;
            }
            if (class92.field2324 == 185) {
                int var156 = class104.field2588.method138((byte) 105);
                byte var157 = class104.field2588.method136(23787);
                class101.field2514[var156] = var157;
                if (class105.field2621[var156] != var157) {
                    class105.field2621[var156] = var157;
                    class73.method697(var156, (byte) -109);
                    if (class94.field2352 != -1) {
                        class18.field458 = true;
                    }
                    class13.field262 = true;
                }
                class92.field2324 = -1;
                class84.field2198 = class85.field2236;
                return true;
            }
            if (class92.field2324 == 8) {
                class20.field492 = false;
                for (int var158 = 0; var158 < 5; var158++) {
                    class2.field39[var158] = false;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 204) {
                int var159 = class104.field2588.method121((byte) 102);
                int var160 = class104.field2588.method143(-2);
                int var161 = class104.field2588.method143(-2);
                class144 var162 = class15.method172(var159, -13778);
                var162.field3423 = var162.field3476 + var161;
                var162.field3536 = var162.field3454 + var160;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 75) {
                field2739 = class17.field395 / 8;
                for (int var163 = 0; var163 < field2739; var163++) {
                    field2720[var163] = class104.field2588.method133(-128);
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 179) {
                if (class56.field1553 != -1) {
                    class87.method782((byte) 90, class56.field1553);
                    class56.field1553 = -1;
                }
                class134.field3209 = class134.field3215;
                class92.field2324 = -1;
                class18.field458 = true;
                class36.field1058 = false;
                class80.field2142 = 1;
                return true;
            }
            if (class92.field2324 == 83) {
                int var164 = class104.field2588.method138((byte) 108);
                if (var164 == 65535) {
                    var164 = -1;
                }
                class147.method1186(-15377, var164);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 202) {
                int var165 = class104.field2588.method126(-1898165520);
                int var166 = class104.field2588.method138((byte) 78);
                if (var166 == 65535) {
                    var166 = -1;
                }
                class127.method1009(var166, (byte) -108, var165);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 142) {
                int var167 = class104.field2588.method150(-2);
                int var168 = class104.field2588.method167(true);
                int var169 = class104.field2588.method125(-28423);
                if (var168 == 65535) {
                    var168 = -1;
                }
                long var170 = ((long) var167 << 32) + (long) var168;
                class73 var172 = class127.field3025.method20(var170, true);
                if (var172 != null) {
                    var172.method691(0);
                }
                class127.field3025.method18(new class116(var169), var170, -1);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 137) {
                int var173 = class104.field2588.method159(-93);
                int var174 = class104.field2588.method127(true);
                if (var174 == 65535) {
                    var174 = -1;
                }
                int var175 = class104.field2588.method150(-2);
                class144 var176 = class15.method172(var175, -13778);
                if (var176.field3499) {
                    var176.field3526 = var173;
                    var176.field3546 = var174;
                    class49 var177 = class108.method887(-1, var174);
                    var176.field3421 = var177.field1404;
                    var176.field3491 = var177.field1376;
                    if (var176.field3437 > 0) {
                        var176.field3491 = var176.field3491 * 32 / var176.field3437;
                    }
                    var176.field3466 = var177.field1428;
                    var176.field3521 = var177.field1387;
                    var176.field3471 = var177.field1377;
                    var176.field3433 = var177.field1379;
                    class85.method772(-41, var176);
                } else if (var174 == -1) {
                    class92.field2324 = -1;
                    var176.field3487 = 0;
                    return true;
                } else {
                    class49 var178 = class108.method887(-1, var174);
                    var176.field3471 = var178.field1377;
                    var176.field3466 = var178.field1428;
                    var176.field3474 = var174;
                    var176.field3487 = 4;
                    var176.field3491 = var178.field1376 * 100 / var173;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 52 || class92.field2324 == 249 || class92.field2324 == 171 || class92.field2324 == 203 || class92.field2324 == 123 || class92.field2324 == 59 || class92.field2324 == 207 || class92.field2324 == 241 || class92.field2324 == 63 || class92.field2324 == 95 || class92.field2324 == 41) {
                class74.method706(-2);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 167) {
                int var179 = class104.field2588.method132(65280);
                int var180 = class104.field2588.method167(true);
                if (class56.field1553 != -1) {
                    class87.method782((byte) 102, class56.field1553);
                    class56.field1553 = -1;
                    class18.field458 = true;
                }
                if (class17.field428 != -1) {
                    class87.method782((byte) 111, class17.field428);
                    class17.field428 = -1;
                    class85.method769(0, 30);
                }
                if (class100.field2495 != -1) {
                    class87.method782((byte) 123, class100.field2495);
                    class100.field2495 = -1;
                }
                if (class121.field2977 == var180) {
                    class134.method1096(class121.field2977, false);
                } else {
                    class87.method782((byte) 112, class121.field2977);
                    class121.field2977 = var180;
                }
                if (class27.field805 == var179) {
                    class134.method1096(class27.field805, false);
                } else {
                    class87.method782((byte) 87, class27.field805);
                    class27.field805 = var179;
                }
                class13.field262 = true;
                if (class80.field2142 != 0) {
                    class80.field2142 = 0;
                    class18.field458 = true;
                }
                class15.field339 = true;
                class85.field2230 = -1;
                class92.method803((byte) -85, class121.field2977);
                class92.method803((byte) -93, class27.field805);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 197) {
                class134.field3221 = class104.field2588.method171((byte) 110);
                if (class56.field1553 != -1) {
                    class87.method782((byte) 85, class56.field1553);
                    class56.field1553 = -1;
                }
                class134.field3209 = class134.field3215;
                class36.field1058 = false;
                class18.field458 = true;
                class80.field2142 = 4;
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 121) {
                for (int var181 = 0; var181 < class105.field2621.length; var181++) {
                    if (class105.field2621[var181] != class101.field2514[var181]) {
                        class105.field2621[var181] = class101.field2514[var181];
                        class73.method697(var181, (byte) -118);
                        class13.field262 = true;
                    }
                }
                class92.field2324 = -1;
                class84.field2198 = class85.field2236;
                return true;
            }
            if (class92.field2324 == 208) {
                class101.field2518 = class104.field2588.method153(true);
                class92.field2324 = -1;
                class15.field339 = true;
                class13.field262 = true;
                return true;
            }
            if (class92.field2324 == 87) {
                class117 var182 = class104.field2588.method171((byte) 110);
                int var183 = class104.field2588.method168(255);
                int var184 = class104.field2588.method156(255);
                if (var184 >= 1 && var184 <= 5) {
                    if (var182.method965(class61.field1712, false)) {
                        var182 = null;
                    }
                    class138.field3307[var184 - 1] = var182;
                    class102.field2578[var184 - 1] = var183 == 0;
                }
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 177) {
                if (class101.field2518 == 12) {
                    class13.field262 = true;
                }
                class41.field1169 = class104.field2588.method155(true);
                class92.field2324 = -1;
                return true;
            }
            if (class92.field2324 == 74) {
                int var185 = class104.field2588.method167(true);
                int var186 = class104.field2588.method132(65280);
                int var187 = class104.field2588.method159(-121);
                int var188 = class104.field2588.method167(true);
                class144 var189 = class15.method172(var187, -13778);
                var189.field3471 = var188;
                class92.field2324 = -1;
                var189.field3491 = var185;
                var189.field3466 = var186;
                return true;
            }
            method897(-8638, null, "T1 - " + class92.field2324 + "," + class134.field3206 + "," + class68.field1911 + " - " + class17.field395);
            class46.method496(-119);
        } catch (IOException var193) {
            class100.method850(95);
        } catch (Exception var194) {
            String var191 = "T2 - " + class92.field2324 + "," + class134.field3206 + "," + class68.field1911 + " - " + class17.field395 + "," + (class95.field2371 + class144.field3516.field739[0]) + "," + (class144.field3516.field708[0] + class108.field2678) + " - ";
            for (int var192 = 0; class17.field395 > var192 && var192 < 50; var192++) {
                var191 = var191 + class104.field2588.field326[var192] + ",";
            }
            method897(-8638, var194, var191);
            class46.method496(-40);
        }
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public static void method902(byte arg0) {
        field2737 = null;
        field2718 = null;
        field2725 = null;
        field2720 = null;
        if (arg0 < 84) {
            method902((byte) 63);
        }
        field2732 = null;
        field2729 = null;
        field2722 = null;
        field2733 = null;
        field2734 = null;
        field2731 = null;
        field2715 = null;
        field2736 = null;
        field2726 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lse;")
    public final class124 method903(boolean arg0) {
        if (arg0) {
            field2720 = null;
        }
        field2719++;
        class124 var2 = this.field2717.field3000;
        if (this.field2717 == var2) {
            return null;
        } else {
            var2.method1000(-86);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class109() {
        this.field2717.field3004 = this.field2717;
        this.field2717.field3000 = this.field2717;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLse;)V")
    public final void method904(byte arg0, class124 arg1) {
        if (arg1.field3004 != null) {
            arg1.method1000(arg0 + 67);
        }
        arg1.field3000 = this.field2717;
        field2730++;
        arg1.field3004 = this.field2717.field3004;
        arg1.field3004.field3000 = arg1;
        if (arg0 == 38) {
            arg1.field3000.field3004 = arg1;
        }
    }
}

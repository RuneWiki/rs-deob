import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class121 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lwl;")
    public static class81 field2014 = new class81(50);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lve;")
    public static class255 field2022 = class87.method607(78, "Texturen geladen)3");

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lve;")
    public static class255 field2023 = class87.method607(31, "Weiter");

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lve;")
    public static class255 field2024 = class87.method607(126, ")2");

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "F")
    public static float field2015;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I", line = 24)
    public static final int method895(int arg0, int arg1, int arg2, int arg3) {
        field2019++;
        if (arg1 >= -71) {
            method895(73, 80, -53, 13);
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)I", line = 55)
    public static final int method896(boolean arg0) {
        if (!arg0) {
            method899(87);
        }
        field2017++;
        return ((class301.field5169 == 0 ? 0 : 1) << 22) + (class250.field4222 & 0x3 << 17) + ((class304.field5199 ? 1 : 0) << 16) + ((class258.field4390 ? 1 : 0) << 15) + ((class143.field2392 ? 1 : 0) << 8) + ((class314.field5328 ? 1 : 0) << 7) + ((class136.field2259 ? 1 : 0) << 4) + (class79.field1291 & 0x7) - (-((class47.field723 ? 1 : 0) << 3) - ((class229.field3788 ? 1 : 0) << 5) - (((class298.field5094 ? 1 : 0) << 6) - -((class136.field2262 ? 1 : 0) << 9)) + (-((class190.field3048 ? 1 : 0) << 10) - (((class13.field176 & 0x3) << 11) + ((class114.field1921 ? 1 : 0) << 13)))) - (-((class150.field2546 ? 1 : 0) << 19) + (-((class25.field392 == 0 ? 0 : 1) << 20) - ((class184.field2963 == 0 ? 0 : 1) << 21)));
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 76)
    public static void method897(int arg0) {
        field2023 = null;
        field2022 = null;
        field2014 = null;
        if (arg0 >= -74) {
            method895(-24, 37, -54, 96);
        }
        field2024 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltg;I)V", line = 92)
    public static final void method898(class301 arg0, int arg1) {
        arg0.field5156 = false;
        field2013++;
        if (arg0.field5114 != -1) {
            class271 var2 = class181.method1269(101, arg0.field5114);
            if (var2 == null || var2.field4667 == null) {
                arg0.field5114 = -1;
            } else {
                arg0.field5147++;
                if (arg0.field5163 < var2.field4667.length && arg0.field5147 > var2.field4680[arg0.field5163]) {
                    arg0.field5163++;
                    arg0.field5147 = 1;
                    class232.method1609(class276.field4742 == arg0, arg0.field5130, arg0.field5163, var2, arg0.field5173, 26694);
                }
                if (var2.field4667.length <= arg0.field5163) {
                    arg0.field5163 = 0;
                    arg0.field5147 = 0;
                    class232.method1609(class276.field4742 == arg0, arg0.field5130, arg0.field5163, var2, arg0.field5173, 26694);
                }
            }
        }
        if (arg0.field5164 != -1 && arg0.field5152 <= class277.field4768) {
            int var3 = class232.method1611(arg0.field5164, (byte) -127).field1420;
            if (var3 == -1) {
                arg0.field5164 = -1;
            } else {
                class271 var4 = class181.method1269(85, var3);
                if (var4 == null || var4.field4667 == null) {
                    arg0.field5164 = -1;
                } else {
                    if (arg0.field5165 < 0) {
                        arg0.field5165 = 0;
                        class232.method1609(class276.field4742 == arg0, arg0.field5130, 0, var4, arg0.field5173, 26694);
                    }
                    arg0.field5151++;
                    if (var4.field4667.length > arg0.field5165 && arg0.field5151 > var4.field4680[arg0.field5165]) {
                        arg0.field5151 = 1;
                        arg0.field5165++;
                        class232.method1609(class276.field4742 == arg0, arg0.field5130, arg0.field5165, var4, arg0.field5173, 26694);
                    }
                    if (var4.field4667.length <= arg0.field5165) {
                        arg0.field5164 = -1;
                    }
                }
            }
        }
        if (arg0.field5166 != -1 && arg0.field5116 <= 1) {
            class271 var5 = class181.method1269(arg1 ^ 0xFFFFFF84, arg0.field5166);
            if (var5.field4663 == 1 && arg0.field5124 > 0 && arg0.field5134 <= class277.field4768 && arg0.field5174 < class277.field4768) {
                arg0.field5116 = 1;
                return;
            }
        }
        if (arg0.field5166 != arg1 && arg0.field5116 == 0) {
            class271 var6 = class181.method1269(110, arg0.field5166);
            if (var6 == null || var6.field4667 == null) {
                arg0.field5166 = -1;
            } else {
                arg0.field5177++;
                if (var6.field4667.length > arg0.field5123 && arg0.field5177 > var6.field4680[arg0.field5123]) {
                    arg0.field5123++;
                    arg0.field5177 = 1;
                    class232.method1609(class276.field4742 == arg0, arg0.field5130, arg0.field5123, var6, arg0.field5173, 26694);
                }
                if (arg0.field5123 >= var6.field4667.length) {
                    arg0.field5135++;
                    arg0.field5123 -= var6.field4648;
                    if (arg0.field5135 >= var6.field4677) {
                        arg0.field5166 = -1;
                    } else if (arg0.field5123 >= 0 && arg0.field5123 < var6.field4667.length) {
                        class232.method1609(class276.field4742 == arg0, arg0.field5130, arg0.field5123, var6, arg0.field5173, arg1 + 26695);
                    } else {
                        arg0.field5166 = -1;
                    }
                }
                arg0.field5156 = var6.field4673;
            }
        }
        if (arg0.field5116 > 0) {
            arg0.field5116--;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 227)
    public static final void method899(int arg0) {
        class255.field4318.method1523(22260, 175);
        client.field4030++;
        field2020++;
        for (class155 var1 = (class155) class158.field2675.method288((byte) -42); var1 != null; var1 = (class155) class158.field2675.method289(86)) {
            if (var1.field2649 == 0) {
                class22.method120(true, var1, 92);
            }
        }
        int var2 = -2 % ((-arg0 - 66) / 52);
        if (class68.field1009 != null) {
            class108.method834((byte) 49, class68.field1009);
            class68.field1009 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)V", line = 264)
    public static final void method900(boolean arg0, int arg1) {
        class152 var2 = (class152) class95.field1622.method1471((byte) -117);
        if (arg1 != 0) {
            field2015 = -0.7759481F;
        }
        while (var2 != null) {
            if (var2.field2567 != null) {
                class230.field3813.method1481(var2.field2567);
                var2.field2567 = null;
            }
            if (var2.field2582 != null) {
                class230.field3813.method1481(var2.field2582);
                var2.field2582 = null;
            }
            var2.method1502((byte) -82);
            var2 = (class152) class95.field1622.method1475((byte) 83);
        }
        field2018++;
        if (!arg0) {
            return;
        }
        for (class152 var3 = (class152) class166.field2792.method1471((byte) 93); var3 != null; var3 = (class152) class166.field2792.method1475((byte) 83)) {
            if (var3.field2567 != null) {
                class230.field3813.method1481(var3.field2567);
                var3.field2567 = null;
            }
            var3.method1502((byte) -82);
        }
        for (class152 var4 = (class152) class187.field3022.method288((byte) -42); var4 != null; var4 = (class152) class187.field3022.method289(98)) {
            if (var4.field2567 != null) {
                class230.field3813.method1481(var4.field2567);
                var4.field2567 = null;
            }
            var4.method1502((byte) -82);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIII)I", line = 339)
    public static final int method901(boolean arg0, int arg1, int arg2, int arg3) {
        class262 var4 = (class262) class68.field1008.method280((long) arg1, 29153);
        field2021++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg2 != 3881) {
            return -57;
        }
        for (int var6 = 0; var6 < var4.field4448.length; var6++) {
            if (var4.field4448[var6] >= 0 && class137.field2289 > var4.field4448[var6]) {
                class192 var7 = class132.method990((byte) -119, var4.field4448[var6]);
                if (var7.field3100 != null) {
                    class172 var8 = (class172) var7.field3100.method280((long) arg3, 29153);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field4440[var6] * var8.field2849;
                        } else {
                            var5 += var8.field2849;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpb;I)V", line = 390)
    public static final void method902(class70 arg0, int arg1) {
        field2016++;
        while (true) {
            while (arg0.field1068 < arg0.field1066.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method481(0) == 1) {
                    var3 = arg0.method481(0);
                    var4 = arg0.method481(0);
                    var2 = true;
                }
                int var5 = arg0.method481(0);
                int var6 = arg0.method481(0);
                int var7 = var5 * 64 - class225.field3768;
                int var8 = class297.field5084 + class41.field636 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class282.field4846 > (var7 + 63) && class41.field636 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < var3 * 8 + 8 && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                int var13 = arg0.method481(0);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method481(0);
                                        if (class177.field2897[var9][var10] == null) {
                                            class177.field2897[var9][var10] = new byte[4096];
                                        }
                                        class177.field2897[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method423(255);
                                        if (class277.field4753[var9][var10] == null) {
                                            class277.field4753[var9][var10] = new short[4096];
                                        }
                                        class277.field4753[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg0.method481(0) & 0xFF) << 16) + (((arg0.method481(0) & 0xFF) << 8) + (arg0.method481(0) & 0xFF));
                                        if (class38.field582[var9][var10] == null) {
                                            class38.field582[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class145 var17 = class289.method2046(-12453, var16);
                                        if (var17.field2454 != null) {
                                            var17 = var17.method1089(-103);
                                            if (var17 == null || var17.field2464 == -1) {
                                                continue;
                                            }
                                        }
                                        class38.field582[var9][var10][(63 - var12 << 6) + var11] = var17.field2458 + 1;
                                        class67 var18 = new class67();
                                        var18.field990 = var17.field2464;
                                        var18.field999 = var7;
                                        var18.field1003 = var8;
                                        class215.field3654.method1472(true, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method481(0);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field1068++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field1068 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field1068 += 3;
                            }
                        }
                    }
                }
            }
            int var21 = -110 / ((-arg1 - 76) / 49);
            return;
        }
    }
}

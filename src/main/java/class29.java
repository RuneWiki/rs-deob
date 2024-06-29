import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class29 extends class313 {

    @OriginalMember(owner = "client!ha", name = "Gb", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!ha", name = "Lb", descriptor = "Ljava/lang/String;")
    public static String field440 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ha", name = "Xb", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!ha", name = "Ib", descriptor = "Lui;")
    public static class98 field437 = new class98(30);

    @OriginalMember(owner = "client!ha", name = "Hb", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!ha", name = "Jb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ha", name = "Kb", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ha", name = "Mb", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ha", name = "Nb", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!ha", name = "Ob", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ha", name = "Qb", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ha", name = "Rb", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ha", name = "Sb", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ha", name = "Tb", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ha", name = "Ub", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ha", name = "Vb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ha", name = "Wb", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ha", name = "Yb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ha", name = "Pb", descriptor = "Lok;")
    private class111 field444;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "(I)V", line = 4)
    public static final void method245(int arg0) {
        class99.field1440 = 0;
        class153.field2485 = 0;
        class180.method1255(-128);
        field446++;
        class268.method1893(-106);
        class357.method2486(~arg0);
        class126.method825(-1275);
        for (int var1 = arg0; var1 < class153.field2485; var1++) {
            int var2 = class292.field4846[var1];
            if (class58.field875 != class130.field1984[var2].field4743) {
                if (class130.field1984[var2].field579 > 0) {
                    class38.method308(class130.field1984[var2], 0);
                }
                class130.field1984[var2] = null;
            }
        }
        if (class201.field3091 != class159.field2552.field5137) {
            throw new RuntimeException("gpp1 pos:" + class159.field2552.field5137 + " psize:" + class201.field3091);
        }
        for (int var3 = 0; var3 < class38.field561; var3++) {
            if (class130.field1984[class150.field2410[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class38.field561);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "(II)I", line = 54)
    public final int method246(int arg0, int arg1) {
        field450++;
        int var3 = this.field442 >> 3;
        int var4 = arg0 - (this.field442 & 0x7);
        this.field442 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (this.field5124[var3++] & class110.field1630[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field5124[var3] & class110.field1630[var4]) + var5;
        } else {
            var6 = (this.field5124[var3] >> var4 - arg1 & class110.field1630[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V", line = 81)
    public class29(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "(I)V", line = 87)
    public static void method247(int arg0) {
        if (arg0 == 0) {
            field440 = null;
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "(II)V", line = 98)
    public static final void method248(int arg0, int arg1) {
        class178.field2780 = new int[arg0];
        class172.field2697 = new int[arg0];
        class74.field1121 = new int[arg0];
        class90.field1306 = new int[arg0];
        class18.field226 = new int[arg0];
        int var2 = -61 / ((arg1 + 24) / 49);
        field443++;
    }

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "(II)I", line = 121)
    public final int method249(int arg0, int arg1) {
        field453++;
        if (arg1 != -6941) {
            field437 = (class98) null;
        }
        return arg0 * 8 - this.field442;
    }

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "(II)V", line = 136)
    public final void method250(int arg0, int arg1) {
        field449++;
        if (arg0 == 21066) {
            this.field5124[this.field5137++] = (byte) (arg1 + this.field444.method735(107));
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)I", line = 152)
    public final int method251(boolean arg0) {
        field436++;
        if (arg0) {
            field452 = -122;
        }
        return this.field5124[this.field5137++] - this.field444.method735(123) & 0xFF;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "([II)V", line = 169)
    public final void method252(int[] arg0, int arg1) {
        field439++;
        if (arg1 != -6) {
            method245(124);
        }
        this.field444 = new class111(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(B)V", line = 184)
    public final void method253(byte arg0) {
        if (arg0 <= -14) {
            field448++;
            this.field5137 = (this.field442 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIIII)V", line = 195)
    public static final void method254(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field445++;
        class253.field4021++;
        class167.method1163(true);
        if (arg1) {
            class209.method1421(0, false, arg5 ^ 0xD5, false);
        } else {
            class186.method1285(-960410169, 0);
            class209.method1421(0, true, -70, false);
            if (class154.field2510 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class209.method1421(var7, false, -120, false);
                    class209.method1421(var7, false, arg5 ^ 0xC7, true);
                    class186.method1285(-960410169, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class186.method1285(-960410169, var6);
                    class209.method1421(var6, false, -72, false);
                    class209.method1421(var6, false, -123, true);
                }
            }
        }
        if (!arg1) {
            class361.method2507((byte) 117);
        }
        class318.method2294(-4);
        if (class245.field3886) {
            class26.method226(arg4, arg2, arg3, true, arg0, true);
            arg3 = class153.field2481;
            arg4 = class229.field3605;
            arg2 = class315.field5192;
            arg0 = class279.field4596;
        }
        class145.field2312 = arg0;
        class145.field2309 = arg3;
        if (arg5 != -129) {
            method247(-17);
        }
        if (class269.field4427 == 1) {
            int var8 = (int) class355.field5628 + class120.field1784 & 0x7FF;
            int var9 = (int) class285.field4676;
            if (var9 < class199.field3067 / 256) {
                var9 = class199.field3067 / 256;
            }
            if (class217.field3346[4] && class325.field5329[4] + 128 > var9) {
                var9 = class325.field5329[4] + 128;
            }
            class189.method1306(var9 * 3 + 600, client.method889(class329.field5388.field4796, class120.field1779, class329.field5388.field4783, -116) + -50, -465145744, var8, class249.field3957, var9, class343.field5516, arg4);
        } else if (class269.field4427 == 5) {
            class130.method847(arg4, 127);
        }
        int var10 = class41.field625;
        int var11 = class259.field4098;
        int var12 = class74.field1117;
        int var13 = class54.field817;
        int var14 = class147.field2369;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class217.field3346[var15]) {
                int var16 = (int) (Math.random() * (double) (class258.field4090[var15] * 2 + 1) + Math.sin((double) class199.field3064[var15] / 100.0D * (double) class312.field5072[var15]) * (double) class325.field5329[var15] - (double) class258.field4090[var15]);
                if (var15 == 4) {
                    class54.field817 += var16;
                    if (class54.field817 < 128) {
                        class54.field817 = 128;
                    }
                    if (class54.field817 > 383) {
                        class54.field817 = 383;
                    }
                }
                if (var15 == 0) {
                    class41.field625 += var16;
                }
                if (var15 == 3) {
                    class147.field2369 = class147.field2369 + var16 & 0x7FF;
                }
                if (var15 == 2) {
                    class259.field4098 += var16;
                }
                if (var15 == 1) {
                    class74.field1117 += var16;
                }
            }
        }
        class55.method394(arg5 ^ 0xFFFFC228);
        if (class245.field3886) {
            class335.method2375(arg3, arg0, arg2 + arg3, arg0 - -arg4);
            float var18 = (float) class54.field817 * 0.17578125F;
            float var19 = (float) class147.field2369 * 0.17578125F;
            if (class269.field4427 == 3) {
                var18 = class117.field1700 * 360.0F / 6.2831855F;
                var19 = class329.field5380 * 360.0F / 6.2831855F;
            }
            boolean var20 = false;
            int var21;
            if (class346.field5553 == 10) {
                var21 = class289.method2047(class259.field4098 >> 10, class41.field625 >> 10, (byte) 69, class75.field1138, class215.field3322);
            } else {
                var21 = class289.method2047(class329.field5388.field4757[0] >> 3, class329.field5388.field4762[0] >> 3, (byte) 69, class75.field1138, class215.field3322);
            }
            if (class238.field3763 >= 0) {
                class245.method1736();
                class174 var22 = class214.method1457(class238.field3763, (byte) -104, class198.field3041, class70.field1080, class13.field171);
                var22.method1205(class51.field762, arg3, arg0, arg2, arg4, class54.field817, class147.field2369, var21);
            } else {
                class245.method1732(var21);
            }
            class245.method1711(arg3, arg0, arg2, arg4, arg2 / 2 + arg3, arg4 / 2 + arg0, var18, var19, class269.field4438, class269.field4438);
            class27.method235(-1994937084, false);
            class245.method1723();
            class245.method1742(true);
            class245.method1743(true);
        } else {
            class317.method2273(arg3, arg0, arg3 + arg2, arg0 - -arg4);
            class272.method1915();
            if (class238.field3763 < 0) {
                class317.method2282(arg3, arg0, arg2, arg4, 0);
            } else {
                class174 var17 = class214.method1457(class238.field3763, (byte) 79, class198.field3041, class70.field1080, class13.field171);
                var17.method1201(class51.field762, arg3, arg0, arg2, arg4, class54.field817, class147.field2369, 0);
            }
        }
        if (class286.field4681 || arg3 > class138.field2181 || arg2 + arg3 <= class138.field2181 || arg0 > class39.field595 || class39.field595 >= arg0 + arg4) {
            class297.field4925 = 0;
            class295.field4900 = false;
        } else {
            class295.field4900 = true;
            class297.field4925 = 0;
            int var23 = class9.field110;
            int var24 = class296.field4918;
            int var25 = class361.field5696;
            int var26 = class293.field4861;
            class214.field3282 = (class39.field595 - arg0) * (var23 - var24) / arg4 + var24;
            client.field2074 = (var26 - var25) * (class138.field2181 - arg3) / arg2 + var25;
        }
        class190.method1316(-124);
        byte var27 = class124.method803(false) == 2 ? (byte) class253.field4021 : 1;
        if (class245.field3886) {
            class254.method1801(class58.field875, !class178.field2777);
            class269.method1897(class147.field2369, class41.field625, -99, class259.field4098, class74.field1117, class54.field817);
            class245.field3882 = class58.field875;
            class140.method990(class41.field625, class74.field1117, class259.field4098, class54.field817, class147.field2369, class138.field2175, class74.field1121, class90.field1306, class18.field226, class178.field2780, class172.field2697, class120.field1779 + 1, var27, class329.field5388.field4796 >> 7, class329.field5388.field4783 >> 7);
            class315.field5198 = true;
            class254.method1812();
            class269.method1897(0, 0, arg5 ^ 0xD4, 0, 0, 0);
            class190.method1316(-126);
            class300.method2116(true, arg3, arg0, arg4, arg2, class269.field4438, class269.field4438);
            class328.method2340(-1, class269.field4438, arg0, arg4, arg3, arg2, class269.field4438);
            class197.method1345();
        } else {
            class140.method990(class41.field625, class74.field1117, class259.field4098, class54.field817, class147.field2369, class138.field2175, class74.field1121, class90.field1306, class18.field226, class178.field2780, class172.field2697, class120.field1779 + 1, var27, class329.field5388.field4796 >> 7, class329.field5388.field4783 >> 7);
            class190.method1316(-128);
            class197.method1345();
            class300.method2116(true, arg3, arg0, arg4, arg2, 256, 256);
            class328.method2340(-1, 256, arg0, arg4, arg3, arg2, 256);
        }
        ((class55) class272.field4467).method413(false, class215.field3322);
        class102.method673(arg3, arg4, false, arg2, arg0);
        class54.field817 = var13;
        class74.field1117 = var12;
        class147.field2369 = var14;
        class259.field4098 = var11;
        class41.field625 = var10;
        if (class167.field2636 && class267.field4400.method2078(-21) == 0) {
            class167.field2636 = false;
        }
        if (class167.field2636) {
            if (class245.field3886) {
                class335.method2380(arg3, arg0, arg2, arg4, 0);
            } else {
                class317.method2282(arg3, arg0, arg2, arg4, 0);
            }
            class243.method1696(false, (byte) -119, class157.field2525);
        }
        if (!arg1 && !class167.field2636 && !class286.field4681 && class138.field2181 >= arg3 && class138.field2181 < (arg3 + arg2) && class39.field595 >= arg0 && (arg0 + arg4) > class39.field595) {
            class140.method993(125, arg2, arg3, class138.field2181, class39.field595, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(I)V", line = 466)
    public final void method255(int arg0) {
        field451++;
        this.field442 = this.field5137 * arg0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B[BII)V", line = 475)
    public final void method256(byte arg0, byte[] arg1, int arg2, int arg3) {
        field438++;
        if (arg0 >= -94) {
            field437 = (class98) null;
        }
        for (int var5 = 0; var5 < arg3; var5++) {
            arg1[var5 + arg2] = (byte) (this.field5124[this.field5137++] - this.field444.method735(115));
        }
    }
}

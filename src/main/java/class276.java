import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class276 extends class83 {

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Z")
    public boolean field4408;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "[Lfj;")
    public class276[] field4419;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field4416 = 0;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4410 = new String[200];

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "J")
    public static long field4417 = 0L;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "Lrc;")
    public static class9 field4422 = new class9(20);

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "Lll;")
    public class122 field4418;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "Lma;")
    public class142 field4425;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Ldl;")
    public static class46 field4411;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "[I")
    public static int[] field4405;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)I")
    public int method1643(byte arg0) {
        field4415++;
        if (arg0 < 86) {
            this.field4408 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZII)[I")
    public final int[] method1805(boolean arg0, int arg1, int arg2) {
        field4414++;
        if (arg0) {
            method1808(-22, 10);
        }
        return this.field4419[arg1].field4408 ? this.field4419[arg1].method23(123, arg2) : this.field4419[arg1].method300(arg2, -1)[0];
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1806(String arg0, int arg1) {
        field4409++;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class45.method276(arg0.charAt(var4), arg1 - 115) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILeh;B)V")
    public void method21(int arg0, class101 arg1, byte arg2) {
        field4412++;
        if (arg2 != -1) {
            this.method23(16, -110);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
    public int[] method23(int arg0, int arg1) {
        if (arg0 < 39) {
            field4416 = 1;
        }
        field4421++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static final void method1807(int arg0) {
        if (class104.field1822 > 1) {
            class171.field2816 = class222.field3746;
            class104.field1822--;
        }
        if (class206.field3428 > 0) {
            class206.field3428--;
        }
        field4413++;
        if (class35.field506) {
            class35.field506 = false;
            class239.method1580((byte) 77);
            return;
        }
        for (int var1 = 0; var1 < 100 && class219.method1454(-41); var1++) {
        }
        if (class59.field1026 != 30) {
            return;
        }
        class99.method624(101, 149, class168.field2778);
        Object var2 = class243.field3990.field3625;
        synchronized (class243.field3990.field3625) {
            if (!class121.field2132) {
                class243.field3990.field3634 = 0;
            } else if (class100.field1717 != 0 || class243.field3990.field3634 >= 40) {
                class73.field1200++;
                int var3 = 0;
                class168.field2778.method199(137, 22);
                class168.field2778.method682(0, 22555);
                int var4 = class168.field2778.field1762;
                for (int var5 = 0; var5 < class243.field3990.field3634 && class168.field2778.field1762 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class243.field3990.field3636[var5];
                    int var7 = class243.field3990.field3635[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (class243.field3990.field3635[var5] == -1 && class243.field3990.field3636[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class172.field2832 != var6 || class194.field3130 != var7) {
                        int var9 = var6 - class172.field2832;
                        class172.field2832 = var6;
                        int var10 = var7 - class194.field3130;
                        class194.field3130 = var7;
                        if (class45.field640 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class168.field2778.method639((class45.field640 << 12) - (-(var9 << 6) - var10), arg0 + 15263);
                            class45.field640 = 0;
                        } else if (class45.field640 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class168.field2778.method682(class45.field640 + 128, arg0 + 22551);
                            class168.field2778.method639((var9 << 8) + var10, 15267);
                            class45.field640 = 0;
                        } else if (class45.field640 < 32) {
                            class168.field2778.method682(class45.field640 + 192, 22555);
                            if (var8) {
                                class168.field2778.method698(-77, Integer.MIN_VALUE);
                            } else {
                                class168.field2778.method698(97, var7 << 16 | var6);
                            }
                            class45.field640 = 0;
                        } else {
                            class168.field2778.method639(class45.field640 + 57344, 15267);
                            if (var8) {
                                class168.field2778.method698(-100, Integer.MIN_VALUE);
                            } else {
                                class168.field2778.method698(106, var6 | var7 << 16);
                            }
                            class45.field640 = 0;
                        }
                    } else if (class45.field640 < 2047) {
                        class45.field640++;
                    }
                }
                class168.field2778.method661(class168.field2778.field1762 - var4, (byte) 69);
                if (var3 >= class243.field3990.field3634) {
                    class243.field3990.field3634 = 0;
                } else {
                    class243.field3990.field3634 -= var3;
                    for (int var11 = 0; var11 < class243.field3990.field3634; var11++) {
                        class243.field3990.field3636[var11] = class243.field3990.field3636[var11 + var3];
                        class243.field3990.field3635[var11] = class243.field3990.field3635[var11 + var3];
                    }
                }
            }
        }
        if (class100.field1717 != 0) {
            class263.field4279++;
            long var12 = (class288.field4600 - class23.field355) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class23.field355 = class288.field4600;
            int var14 = class160.field2668;
            int var15 = class115.field2069;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = (int) var12;
            byte var17 = 0;
            if (class100.field1717 == 2) {
                var17 = 1;
            }
            class168.field2778.method199(5, -95);
            class168.field2778.method688(-128, var16 | var17 << 15);
            class168.field2778.method698(-71, var14 << 16 | var15);
        }
        if (class31.field454 > 0) {
            class31.field454--;
        }
        if (class114.field2059 && class31.field454 <= 0) {
            class114.field2059 = false;
            class31.field454 = 20;
            class243.field3991++;
            class168.field2778.method199(122, arg0 + 114);
            class168.field2778.method688(-128, (int) class106.field1900);
            class168.field2778.method688(-128, (int) class195.field3151);
        }
        if (class95.field1643 && !class194.field3134) {
            class194.field3134 = true;
            class52.field907++;
            class168.field2778.method199(27, 120);
            class168.field2778.method682(1, arg0 + 22551);
        }
        if (!class95.field1643 && class194.field3134) {
            class52.field907++;
            class194.field3134 = false;
            class168.field2778.method199(27, -63);
            class168.field2778.method682(0, 22555);
        }
        if (!class196.field3172) {
            class74.field1216++;
            class168.field2778.method199(187, 115);
            class168.field2778.method676(false, class175.method1166((byte) 125));
            class196.field3172 = true;
        }
        if (class96.field1653) {
            class96.field1653 = false;
        } else {
            class68.field1125 /= 2.0F;
        }
        if (class132.field2303) {
            class132.field2303 = false;
        } else {
            class158.field2659 /= 2.0F;
        }
        class183.method1200(23947);
        if (class59.field1026 != 30) {
            return;
        }
        class247.method1655(-1);
        class176.method1174(1764);
        class291.method1966(-22);
        class114.field2058++;
        if (class114.field2058 > 750) {
            class239.method1580((byte) -59);
            return;
        }
        class7.method45(false);
        class99.method628((byte) 58);
        class132.method921(false);
        if (class162.field2689 != null) {
            class108.method742(0);
        }
        for (int var18 = class179.method1189(true, -1); var18 != -1; var18 = class179.method1189(false, -1)) {
            class89.method577(var18, (byte) -44);
            class194.field3138[class113.method791(class98.field1690++, 31)] = var18;
        }
        for (class55 var19 = class80.method518((byte) -106); var19 != null; var19 = class80.method518((byte) 80)) {
            int var20 = var19.method343(20875);
            int var21 = var19.method344((byte) -117);
            if (var20 == 1) {
                class291.field4643[var21] = var19.field947;
                class151.field2531[class113.method791(31, class258.field4212++)] = var21;
            } else if (var20 == 2) {
                class100.field1720[var21] = var19.field960;
                class175.field2878[class113.method791(class223.field3755++, 31)] = var21;
            } else if (var20 == 3) {
                class46 var22 = class108.method760(-29533, var21);
                if (!var19.field960.equals(var22.field759)) {
                    var22.field759 = var19.field960;
                    class79.method516(-373, var22);
                }
            } else if (var20 == 4) {
                class46 var39 = class108.method760(-29533, var21);
                int var40 = var19.field947;
                int var41 = var19.field953;
                int var42 = var19.field954;
                if (var39.field748 != var40 || var39.field653 != var41 || var39.field648 != var42) {
                    var39.field653 = var41;
                    var39.field648 = var42;
                    var39.field748 = var40;
                    class79.method516(-373, var39);
                }
            } else if (var20 == 5) {
                class46 var38 = class108.method760(arg0 ^ 0xFFFF8CA7, var21);
                if (var19.field947 != var38.field708 || var19.field947 == -1) {
                    var38.field802 = 0;
                    var38.field760 = 0;
                    var38.field708 = var19.field947;
                    var38.field643 = 1;
                    class79.method516(-373, var38);
                }
            } else if (var20 == 6) {
                int var32 = var19.field947;
                int var33 = var32 >> 10 & 0x1F;
                int var34 = var32 >> 5 & 0x1F;
                int var35 = var32 & 0x1F;
                int var36 = (var33 << 19) + (var35 << 3) + (var34 << 11);
                class46 var37 = class108.method760(-29533, var21);
                if (var37.field679 != var36) {
                    var37.field679 = var36;
                    class79.method516(arg0 ^ 0xFFFFFE8F, var37);
                }
            } else if (var20 == 7) {
                class46 var23 = class108.method760(-29533, var21);
                boolean var24 = var19.field947 == 1;
                if (var23.field726 != var24) {
                    var23.field726 = var24;
                    class79.method516(-373, var23);
                }
            } else if (var20 == 8) {
                class46 var31 = class108.method760(-29533, var21);
                if (var19.field947 != var31.field741 || var19.field953 != var31.field816 || var19.field954 != var31.field746) {
                    var31.field741 = var19.field947;
                    var31.field746 = var19.field954;
                    var31.field816 = var19.field953;
                    if (var31.field767 != -1) {
                        if (var31.field677 > 0) {
                            var31.field746 = var31.field746 * 32 / var31.field677;
                        } else if (var31.field688 > 0) {
                            var31.field746 = var31.field746 * 32 / var31.field688;
                        }
                    }
                    class79.method516(-373, var31);
                }
            } else if (var20 == 9) {
                class46 var30 = class108.method760(arg0 - 29537, var21);
                if (var19.field947 != var30.field767 || var19.field953 != var30.field685) {
                    var30.field685 = var19.field953;
                    var30.field767 = var19.field947;
                    class79.method516(-373, var30);
                }
            } else if (var20 == 10) {
                class46 var25 = class108.method760(-29533, var21);
                if (var19.field947 != var25.field819 || var19.field953 != var25.field788 || var19.field954 != var25.field803) {
                    var25.field788 = var19.field953;
                    var25.field803 = var19.field954;
                    var25.field819 = var19.field947;
                    class79.method516(arg0 ^ 0xFFFFFE8F, var25);
                }
            } else if (var20 == 11) {
                class46 var26 = class108.method760(-29533, var21);
                var26.field770 = 0;
                var26.field758 = var26.field740 = var19.field947;
                var26.field806 = var26.field645 = var19.field953;
                var26.field692 = 0;
                class79.method516(-373, var26);
            } else if (var20 == 12) {
                class46 var28 = class108.method760(-29533, var21);
                int var29 = var19.field947;
                if (var28 != null && var28.field812 == 0) {
                    if ((var28.field666 - var28.field715) < var29) {
                        var29 = var28.field666 - var28.field715;
                    }
                    if (var29 < 0) {
                        var29 = 0;
                    }
                    if (var28.field644 != var29) {
                        var28.field644 = var29;
                        class79.method516(-373, var28);
                    }
                }
            } else if (var20 == 13) {
                class46 var27 = class108.method760(-29533, var21);
                var27.field668 = var19.field947;
            }
        }
        class191.field3087++;
        if (class57.field1011 != 0) {
            class225.field3781 += 20;
            if (class225.field3781 >= 400) {
                class57.field1011 = 0;
            }
        }
        if (class188.field3039 != null) {
            class247.field4057++;
            if (class247.field4057 >= 15) {
                class79.method516(-373, class188.field3039);
                class188.field3039 = null;
            }
        }
        if (class75.field1231 != null) {
            class79.method516(-373, class75.field1231);
            if ((class59.field1024 + 5) < class48.field839 || class48.field839 < (class59.field1024 - 5) || class256.field4182 > (class178.field2929 + 5) || class178.field2929 - 5 > class256.field4182) {
                class192.field3111 = true;
            }
            class170.field2808++;
            if (class69.field1131 == 0) {
                if (class192.field3111 && class170.field2808 >= 5) {
                    if (class75.field1231 == field4411 && class3.field37 != class167.field2721) {
                        class236.field3893++;
                        class46 var43 = class75.field1231;
                        byte var44 = 0;
                        if (class110.field1991 == 1 && var43.field777 == 206) {
                            var44 = 1;
                        }
                        if (var43.field774[class167.field2721] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1922(var43).method1261(105)) {
                            int var45 = class3.field37;
                            int var46 = class167.field2721;
                            var43.field774[var46] = var43.field774[var45];
                            var43.field711[var46] = var43.field711[var45];
                            var43.field774[var45] = -1;
                            var43.field711[var45] = 0;
                        } else if (var44 == 1) {
                            int var47 = class3.field37;
                            int var48 = class167.field2721;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var43.method286(var47, var47 - 1, -1);
                                    var47--;
                                } else if (var47 < var48) {
                                    var43.method286(var47, var47 + 1, -1);
                                    var47++;
                                }
                            }
                        } else {
                            var43.method286(class3.field37, class167.field2721, -1);
                        }
                        class168.field2778.method199(191, -46);
                        class168.field2778.method673(class3.field37, true);
                        class168.field2778.method674((byte) -116, var44);
                        class168.field2778.method673(class167.field2721, true);
                        class168.field2778.method667(class75.field1231.field786, -1511);
                    }
                } else if ((class172.field2823 == 1 || class141.method985(class275.field4399 - 1, (byte) 121)) && class275.field4399 > 2) {
                    class126.method858((byte) -28);
                } else if (class275.field4399 > 0) {
                    class241.method1593(false);
                }
                class100.field1717 = 0;
                class247.field4057 = 10;
                class75.field1231 = null;
            }
        }
        class30.field449 = false;
        class46 var49 = class201.field3304;
        class290.field4630 = false;
        class46 var50 = class79.field1359;
        class79.field1359 = null;
        class201.field3304 = null;
        class173.field2837 = 0;
        class198.field3206 = null;
        while (class296.method1989(arg0 + 123) && class173.field2837 < 128) {
            class222.field3745[class173.field2837] = class141.field2418;
            class152.field2546[class173.field2837] = class53.field932;
            class173.field2837++;
        }
        class162.field2689 = null;
        if (client.field4545 != -1) {
            class275.method1804(0, 0, class4.field38, 112, 0, 0, client.field4545, class267.field4324);
        }
        class222.field3746++;
        while (true) {
            class198 var51;
            class46 var52;
            class46 var53;
            do {
                var51 = (class198) class181.field2966.method368(arg0 - 5);
                if (var51 == null) {
                    while (true) {
                        class198 var54;
                        class46 var55;
                        class46 var56;
                        do {
                            var54 = (class198) class9.field103.method368(-1);
                            if (var54 == null) {
                                while (true) {
                                    class198 var57;
                                    class46 var58;
                                    class46 var59;
                                    do {
                                        var57 = (class198) class28.field426.method368(-1);
                                        if (var57 == null) {
                                            if (class162.field2689 == null) {
                                                class83.field1512 = 0;
                                            }
                                            if (class6.field76 != null) {
                                                class113.method797(1758);
                                            }
                                            if (class204.field3343 > 0 && class12.field169[82] && class12.field169[81] && class25.field387 != 0) {
                                                int var60 = class176.field2886 - class25.field387;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class88.method575(var60, class273.field4378.field1486[0] + class255.field4162, -9225, class273.field4378.field1464[0] + class126.field2206);
                                            }
                                            if (class204.field3343 > 0 && class12.field169[82] && class12.field169[81]) {
                                                if (class31.field457 != -1) {
                                                    class88.method575(class176.field2886, class65.field1099 + class255.field4162, arg0 + -9229, class31.field457 + class126.field2206);
                                                }
                                                class178.field2937 = 0;
                                                class66.field1113 = 0;
                                            } else if (class66.field1113 == 2) {
                                                if (class31.field457 != -1) {
                                                    class52.field910++;
                                                    class168.field2778.method199(47, 117);
                                                    class168.field2778.method688(-128, class65.field1099 + class255.field4162);
                                                    class168.field2778.method690(class119.field2108, 104);
                                                    class168.field2778.method698(arg0 ^ 0xFFFFFF92, class47.field825);
                                                    class168.field2778.method688(-128, class31.field457 + class126.field2206);
                                                    class57.field1011 = 1;
                                                    class118.field2089 = class160.field2668;
                                                    class241.field3964 = class115.field2069;
                                                    class225.field3781 = 0;
                                                }
                                                class66.field1113 = 0;
                                            } else if (class178.field2937 == 2) {
                                                if (class31.field457 != -1) {
                                                    class157.field2629++;
                                                    class168.field2778.method199(133, arg0 - 7);
                                                    class168.field2778.method673(class126.field2206 + class31.field457, true);
                                                    class168.field2778.method688(-128, class255.field4162 + class65.field1099);
                                                    class57.field1011 = 1;
                                                    class225.field3781 = 0;
                                                    class241.field3964 = class115.field2069;
                                                    class118.field2089 = class160.field2668;
                                                }
                                                class178.field2937 = 0;
                                            } else if (class31.field457 != -1 && class66.field1113 == 0 && class178.field2937 == 0) {
                                                class85.method558((class65.field1099 << 1) - (class273.field4378.method528(arg0 + 116) - 1) >> 1, 0, (class31.field457 << 1) + 1 - class273.field4378.method528(arg0 - 5) >> 1, (byte) -118);
                                                class57.field1011 = 1;
                                                class225.field3781 = 0;
                                                class118.field2089 = class160.field2668;
                                                class241.field3964 = class115.field2069;
                                            }
                                            class31.field457 = -1;
                                            class5.method27(-118);
                                            if (class201.field3304 != var49) {
                                                if (var49 != null) {
                                                    class79.method516(arg0 - 377, var49);
                                                }
                                                if (class201.field3304 != null) {
                                                    class79.method516(-373, class201.field3304);
                                                }
                                            }
                                            if (class79.field1359 != var50 && class263.field4283 == class204.field3338) {
                                                if (var50 != null) {
                                                    class79.method516(-373, var50);
                                                }
                                                if (class79.field1359 != null) {
                                                    class79.method516(arg0 ^ 0xFFFFFE8F, class79.field1359);
                                                }
                                            }
                                            if (class79.field1359 == null) {
                                                if (class204.field3338 > 0) {
                                                    class204.field3338--;
                                                }
                                            } else if (class263.field4283 > class204.field3338) {
                                                class204.field3338++;
                                                if (class263.field4283 == class204.field3338) {
                                                    class79.method516(-373, class79.field1359);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class39.field583[var61]++;
                                            }
                                            if (arg0 != 4) {
                                                field4416 = -51;
                                            }
                                            int var62 = class114.method801((byte) 103);
                                            int var63 = class118.method811(true);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class206.field3367++;
                                                class206.field3428 = 250;
                                                class185.method1219(14500, 1);
                                                class168.field2778.method199(166, 120);
                                            }
                                            if (class60.field1048 != null && class60.field1048.field2857 == 1) {
                                                if (class60.field1048.field2859 != null) {
                                                    class291.method1967(class253.field4142, class246.field4048, 107);
                                                }
                                                class60.field1048 = null;
                                                class246.field4048 = null;
                                                class253.field4142 = false;
                                            }
                                            class273.field4380++;
                                            class205.field3361++;
                                            if (class273.field4380 > 500) {
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x4) == 4) {
                                                    class170.field2807 += class270.field4358;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class82.field1489 += class254.field4161;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class203.field3328 += class266.field4298;
                                                }
                                                class273.field4380 = 0;
                                            }
                                            if (class82.field1489 < -55) {
                                                class254.field4161 = 2;
                                            }
                                            if (class82.field1489 > 55) {
                                                class254.field4161 = -2;
                                            }
                                            class296.field4698++;
                                            if (class203.field3328 < -50) {
                                                class266.field4298 = 2;
                                            }
                                            if (class203.field3328 > 50) {
                                                class266.field4298 = -2;
                                            }
                                            if (class170.field2807 < -40) {
                                                class270.field4358 = 1;
                                            }
                                            if (class170.field2807 > 40) {
                                                class270.field4358 = -1;
                                            }
                                            if (class296.field4698 > 500) {
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class173.field2833 += class125.field2193;
                                                }
                                                class296.field4698 = 0;
                                                if ((var65 & 0x2) == 2) {
                                                    class231.field3871 += class23.field358;
                                                }
                                            }
                                            if (class231.field3871 < -20) {
                                                class23.field358 = 1;
                                            }
                                            if (class173.field2833 < -60) {
                                                class125.field2193 = 2;
                                            }
                                            if (class173.field2833 > 60) {
                                                class125.field2193 = -2;
                                            }
                                            if (class231.field3871 > 10) {
                                                class23.field358 = -1;
                                            }
                                            if (class205.field3361 > 50) {
                                                class216.field3642++;
                                                class168.field2778.method199(245, -16);
                                            }
                                            if (class46.field799) {
                                                class290.method1957(114);
                                                class46.field799 = false;
                                            }
                                            try {
                                                if (class194.field3131 != null && class168.field2778.field1762 > 0) {
                                                    class194.field3131.method1382(class168.field2778.field1730, class168.field2778.field1762, 0, (byte) -30);
                                                    class205.field3361 = 0;
                                                    class168.field2778.field1762 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class239.method1580((byte) -105);
                                                return;
                                            }
                                        }
                                        var58 = var57.field3205;
                                        if (var58.field704 < 0) {
                                            break;
                                        }
                                        var59 = class108.method760(arg0 - 29537, var58.field660);
                                    } while (var59 == null || var59.field785 == null || var59.field785.length <= var58.field704 || var59.field785[var58.field704] != var58);
                                    class71.method434(-10521, var57);
                                }
                            }
                            var55 = var54.field3205;
                            if (var55.field704 < 0) {
                                break;
                            }
                            var56 = class108.method760(-29533, var55.field660);
                        } while (var56 == null || var56.field785 == null || var55.field704 >= var56.field785.length || var56.field785[var55.field704] != var55);
                        class71.method434(-10521, var54);
                    }
                }
                var52 = var51.field3205;
                if (var52.field704 < 0) {
                    break;
                }
                var53 = class108.method760(-29533, var52.field660);
            } while (var53 == null || var53.field785 == null || var53.field785.length <= var52.field704 || var53.field785[var52.field704] != var52);
            class71.method434(-10521, var51);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[[I")
    public int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method21(123, (class101) null, (byte) 121);
        }
        field4423++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)I")
    public static final int method1808(int arg0, int arg1) {
        field4407++;
        if (arg1 != 1931665025) {
            field4422 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public void method22(int arg0) {
        if (arg0 < 66) {
            this.field4425 = null;
        }
        field4428++;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public void method1065(byte arg0) {
        if (arg0 != 21) {
            field4410 = null;
        }
        if (this.field4408) {
            this.field4425.method991((byte) -50);
            this.field4425 = null;
        } else {
            this.field4418.method833(0);
            this.field4418 = null;
        }
        field4424++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public final void method1809(int arg0, int arg1, int arg2) {
        field4426++;
        int var4 = ~this.field4427 == arg1 ? arg0 : this.field4427;
        if (this.field4408) {
            this.field4425 = new class142(var4, arg0, arg2);
        } else {
            this.field4418 = new class122(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)I")
    public int method1061(int arg0) {
        if (arg0 >= -20) {
            return -63;
        } else {
            field4406++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BII)[[I")
    public final int[][] method1810(byte arg0, int arg1, int arg2) {
        field4429++;
        int var4 = -121 / ((-arg0 - 64) / 38);
        if (this.field4419[arg2].field4408) {
            int[] var5 = this.field4419[arg2].method23(123, arg1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field4419[arg2].method300(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IZ)V")
    public class276(int arg0, boolean arg1) {
        this.field4408 = arg1;
        this.field4419 = new class276[arg0];
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    public static void method1811(int arg0) {
        field4422 = null;
        if (arg0 != 0) {
            field4416 = 104;
        }
        field4410 = null;
        field4405 = null;
        field4411 = null;
    }
}

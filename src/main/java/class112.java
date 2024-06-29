import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 extends class113 {

    @OriginalMember(owner = "client!qa", name = "yb", descriptor = "I")
    private int field2951;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    private int field2928;

    @OriginalMember(owner = "client!qa", name = "xb", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!qa", name = "Gb", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
    private int field2949;

    @OriginalMember(owner = "client!qa", name = "Ab", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!qa", name = "Cb", descriptor = "I")
    private int field2955;

    @OriginalMember(owner = "client!qa", name = "pb", descriptor = "Lqe;")
    private class116 field2942;

    @OriginalMember(owner = "client!qa", name = "Eb", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!qa", name = "rb", descriptor = "I")
    private int field2944;

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "[Lfc;")
    public static class39[] field2936 = new class39[100];

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "Lfc;")
    private static class39 field2935 = class90.method774("Free world", -102);

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "Lfc;")
    private static class39 field2937 = class90.method774("Invalid loginserver requested)3", -120);

    @OriginalMember(owner = "client!qa", name = "vb", descriptor = "Lfc;")
    private static class39 field2948 = class90.method774("Private chat", -84);

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "Lfc;")
    public static class39 field2939 = field2935;

    @OriginalMember(owner = "client!qa", name = "sb", descriptor = "Lfc;")
    private static class39 field2945 = class90.method774("Classic", -102);

    @OriginalMember(owner = "client!qa", name = "ob", descriptor = "[I")
    public static int[] field2941 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!qa", name = "Bb", descriptor = "Lfc;")
    private static class39 field2954 = class90.method774("Members only world", -116);

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "Lfc;")
    public static class39 field2930 = field2945;

    @OriginalMember(owner = "client!qa", name = "Db", descriptor = "I")
    public static int field2956 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qa", name = "nb", descriptor = "Lfc;")
    public static class39 field2940 = field2954;

    @OriginalMember(owner = "client!qa", name = "Fb", descriptor = "Lfc;")
    public static class39 field2958 = field2937;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "Lfc;")
    public static class39 field2929 = field2948;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!qa", name = "qb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!qa", name = "tb", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!qa", name = "zb", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!qa", name = "ub", descriptor = "[I")
    public static int[] field2947;

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "[Lb;")
    public static class8[] field2938;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "[[[I")
    public static int[][][] field2934;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 16)
    public static void method981(int arg0) {
        field2945 = null;
        field2938 = null;
        field2948 = null;
        field2941 = null;
        field2929 = null;
        field2954 = null;
        field2930 = null;
        field2939 = null;
        field2940 = null;
        field2934 = null;
        int var1 = -114 / ((arg0 + 17) / 50);
        field2936 = null;
        field2958 = null;
        field2937 = null;
        field2947 = null;
        field2935 = null;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(B)V", line = 52)
    public static final void method982(byte arg0) {
        field2946++;
        int var1 = -63 % ((48 - arg0) / 52);
        class131.field3309.method927(false);
        class79.field1788.method927(false);
        class90.field2135.method927(false);
        class98.field2324.method927(false);
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Z", line = 73)
    public static final boolean method983(int arg0) {
        field2933++;
        return class101.field2547 == arg0 ? class103.field2582.method183(true) : true;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Lda;", line = 92)
    public final class23 method153(int arg0) {
        field2932++;
        if (this.field2942 != null) {
            int var2 = class70.field1654 - this.field2957;
            if (var2 > 100 && this.field2942.field3041 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field2942.field3035[this.field2944] >= var2) {
                            break label42;
                        }
                        var2 -= this.field2942.field3035[this.field2944];
                        this.field2944++;
                    } while (this.field2942.field3057.length > this.field2944);
                    this.field2944 -= this.field2942.field3041;
                } while (this.field2944 >= 0 && this.field2944 < this.field2942.field3057.length);
                this.field2942 = null;
            }
            this.field2957 = class70.field1654 - var2;
        }
        class35 var3 = class90.method776(this.field2959, -126);
        if (var3.field970 != null) {
            var3 = var3.method402(false);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 64) {
                field2947 = null;
            }
            return var3.method398((byte) 120, this.field2950, this.field2942, this.field2951, this.field2928, this.field2944, this.field2949, this.field2955, this.field2953);
        }
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 163)
    public static final void method984(int arg0) {
        if (arg0 <= 78) {
            method982((byte) 70);
        }
        field2931++;
        for (int var1 = -1; var1 < class111.field2871; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class31.field862[var1];
            }
            class142 var3 = class101.field2525[var2];
            if (var3 != null) {
                class39.method460(var3, 1, -30616);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(B)V", line = 200)
    public static final void method985(byte arg0) {
        field2943++;
        while (true) {
            label391: do {
                while (class28.method347(1)) {
                    if (class126.field3198 != -1 && class60.field1466 == class126.field3198) {
                        if (class17.field482 == 85 && class107.field2677.method437(-122) > 0) {
                            class107.field2677 = class107.field2677.method456(0, 0, class107.field2677.method437(-86) - 1);
                        }
                        continue label391;
                    }
                    if (class128.field3254) {
                        if (class17.field482 == 85 && class107.field2683.method437(-63) > 0) {
                            class107.field2683 = class107.field2683.method456(0, 0, class107.field2683.method437(110) - 1);
                            class128.field3242 = true;
                        }
                        if (class109.method964(arg0 - 127, class109.field2798) && class107.field2683.method437(48) < 80) {
                            class107.field2683 = class107.field2683.method453(-1, class109.field2798);
                            class128.field3242 = true;
                        }
                        if (class17.field482 == 84) {
                            class128.field3254 = false;
                            class128.field3242 = true;
                            if (class62.field1521 == 1) {
                                long var1 = class107.field2683.method445((byte) 69);
                                class116.method1016(var1, arg0);
                            }
                            if (class62.field1521 == 2 && class92.field2165 > 0) {
                                long var3 = class107.field2683.method445((byte) 69);
                                class153.method1223(1, var3);
                            }
                            if (class62.field1521 == 3 && class107.field2683.method437(-87) > 0) {
                                class79.field1794.method393((byte) -14, 251);
                                class79.field1794.method326(0, (byte) -46);
                                class87.field1971++;
                                int var5 = class79.field1794.field710;
                                class79.field1794.method290(class137.field3421, (byte) -43);
                                class62.method613(class79.field1794, class107.field2683, 99);
                                class79.field1794.method288(arg0, class79.field1794.field710 - var5);
                                if (class92.field2164 == 2) {
                                    class43.field1156++;
                                    class92.field2164 = 1;
                                    client.field561 = true;
                                    class79.field1794.method393((byte) -14, 11);
                                    class79.field1794.method326(class94.field2203, (byte) -48);
                                    class79.field1794.method326(class92.field2164, (byte) -107);
                                    class79.field1794.method326(class13.field349, (byte) -79);
                                }
                            }
                            if (class62.field1521 == 4 && class57.field1414 < 100) {
                                long var6 = class107.field2683.method445((byte) 69);
                                class109.method963(var6, 8);
                            }
                            if (class62.field1521 == 5 && class57.field1414 > 0) {
                                long var8 = class107.field2683.method445((byte) 69);
                                class107.method946(0, var8);
                            }
                        }
                    } else if (class119.field3107 == 1) {
                        if (class17.field482 == 85 && class107.field2702.method437(116) > 0) {
                            class107.field2702 = class107.field2702.method456(0, 0, class107.field2702.method437(arg0 - 104) - 1);
                            class128.field3242 = true;
                        }
                        if (class90.method775(class109.field2798, arg0 + 1) && class107.field2702.method437(94) < 10) {
                            class107.field2702 = class107.field2702.method453(-1, class109.field2798);
                            class128.field3242 = true;
                        }
                        if (class17.field482 == 84) {
                            if (class107.field2702.method437(-87) > 0) {
                                class77.field1752++;
                                int var10 = 0;
                                if (class107.field2702.method459((byte) 124)) {
                                    var10 = class107.field2702.method457(arg0 ^ 0x6438);
                                }
                                class79.field1794.method393((byte) -14, 73);
                                class79.field1794.method283(true, var10);
                            }
                            class119.field3107 = 0;
                            class128.field3242 = true;
                        }
                    } else if (class119.field3107 == 2) {
                        if (class17.field482 == 85 && class107.field2702.method437(84) > 0) {
                            class107.field2702 = class107.field2702.method456(arg0 + 1, 0, class107.field2702.method437(127) - 1);
                            class128.field3242 = true;
                        }
                        if ((class56.method581((byte) -116, class109.field2798) || class109.field2798 == 32) && class107.field2702.method437(arg0 ^ 0xFFFFFF93) < 12) {
                            class107.field2702 = class107.field2702.method453(arg0, class109.field2798);
                            class128.field3242 = true;
                        }
                        if (class17.field482 == 84) {
                            if (class107.field2702.method437(-55) > 0) {
                                class79.field1794.method393((byte) -14, 253);
                                class55.field1389++;
                                class79.field1794.method290(class107.field2702.method445((byte) 69), (byte) -43);
                            }
                            class128.field3242 = true;
                            class119.field3107 = 0;
                        }
                    } else if (class119.field3107 == 3) {
                        if (class17.field482 == 85 && class107.field2702.method437(arg0 ^ 0x3E) > 0) {
                            class107.field2702 = class107.field2702.method456(0, 0, class107.field2702.method437(-43) - 1);
                            class128.field3242 = true;
                        }
                        if (class109.method964(-128, class109.field2798) && class107.field2702.method437(-121) < 40) {
                            class107.field2702 = class107.field2702.method453(-1, class109.field2798);
                            class128.field3242 = true;
                        }
                    } else if (class119.field3107 == 4) {
                        if (class17.field482 == 85 && class107.field2702.method437(47) > 0) {
                            class107.field2702 = class107.field2702.method456(~arg0, 0, class107.field2702.method437(91) - 1);
                            class128.field3242 = true;
                        }
                        if ((class109.method964(-128, class109.field2798) || class109.field2798 == 32) && class107.field2702.method437(arg0 + 80) < 80) {
                            class107.field2702 = class107.field2702.method453(-1, class109.field2798);
                            class128.field3242 = true;
                        }
                        if (class17.field482 == 84) {
                            if (class107.field2702.method437(-114) > 0) {
                                class98.field2321++;
                                class79.field1794.method393((byte) -14, 221);
                                class79.field1794.method326(class107.field2702.method437(-105) + 1, (byte) -52);
                                class79.field1794.method287(class107.field2702, false);
                            }
                            class119.field3107 = 0;
                            class128.field3242 = true;
                        }
                    } else if (class37.field1008 == -1 && class78.field1777 == -1) {
                        if (class36.field980 != 0 || class5.field178 > 1) {
                            class94.method795((byte) -75);
                        }
                        if (class17.field482 == 85 && class107.field2685.method437(47) > 0) {
                            class107.field2685 = class107.field2685.method456(0, 0, class107.field2685.method437(arg0 ^ 0xFFFFFF8D) - 1);
                            class128.field3242 = true;
                        }
                        if (class109.method964(arg0 ^ 0x7F, class109.field2798) && class107.field2685.method437(48) < 80) {
                            class107.field2685 = class107.field2685.method453(-1, class109.field2798);
                            class128.field3242 = true;
                        }
                        if (class17.field482 == 84 && class107.field2685.method437(89) > 0) {
                            if (class36.field980 != 0 || class5.field178 > 1) {
                                class147.field3661[class100.field2506++] = class107.field2685;
                                class146.field3647 = -1;
                                if (class100.field2506 >= 20) {
                                    class100.field2506 = 0;
                                }
                            }
                            if (class5.field178 == 2) {
                                if (class107.field2685.method461(class150.field3728, (byte) 82)) {
                                    System.gc();
                                }
                                if (class107.field2685.method461(class114.field2995, (byte) 82)) {
                                    class60.method597((byte) -2);
                                }
                                if (class107.field2685.method461(class149.field3707, (byte) 82)) {
                                    class100.field2478 = true;
                                }
                                if (class107.field2685.method461(class45.field1221, (byte) 82)) {
                                    class100.field2478 = false;
                                }
                                if (class107.field2685.method461(class103.field2589, (byte) 82)) {
                                    for (int var11 = 0; var11 < 4; var11++) {
                                        for (int var12 = 1; var12 < 103; var12++) {
                                            for (int var13 = 1; var13 < 103; var13++) {
                                                class117.field3077[var11].field2526[var12][var13] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class107.field2685.method461(class100.field2466, (byte) 82) && class36.field980 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class107.field2685.method461(class86.field1927, (byte) 82)) {
                                    class38.field1026 = true;
                                }
                            }
                            if (class107.field2685.method472(0, class110.field2849)) {
                                class79.field1794.method393((byte) -14, 56);
                                class136.field3411++;
                                class79.field1794.method326(class107.field2685.method437(arg0 ^ -75) - 1, (byte) -66);
                                class79.field1794.method287(class107.field2685.method469(2, (byte) -112), false);
                            } else {
                                class80.field1811++;
                                byte var14 = 0;
                                class39 var15 = class107.field2685.method452(true);
                                byte var16 = 0;
                                if (var15.method472(0, client.field573)) {
                                    class107.field2685 = class107.field2685.method469(client.field573.method437(arg0 ^ 0x7F), (byte) -128);
                                    var14 = 0;
                                } else if (var15.method472(0, class78.field1780)) {
                                    class107.field2685 = class107.field2685.method469(class78.field1780.method437(arg0 + 61), (byte) -114);
                                    var14 = 1;
                                } else if (var15.method472(0, class83.field1848)) {
                                    class107.field2685 = class107.field2685.method469(class83.field1848.method437(-94), (byte) -106);
                                    var14 = 2;
                                } else if (var15.method472(0, class58.field1445)) {
                                    var14 = 3;
                                    class107.field2685 = class107.field2685.method469(class58.field1445.method437(arg0 - 55), (byte) -116);
                                } else if (var15.method472(~arg0, class9.field257)) {
                                    class107.field2685 = class107.field2685.method469(class9.field257.method437(-102), (byte) -113);
                                    var14 = 4;
                                } else if (var15.method472(0, class43.field1186)) {
                                    var14 = 5;
                                    class107.field2685 = class107.field2685.method469(class43.field1186.method437(104), (byte) -118);
                                } else if (var15.method472(~arg0, class127.field3217)) {
                                    var14 = 6;
                                    class107.field2685 = class107.field2685.method469(class127.field3217.method437(arg0 - 98), (byte) -119);
                                } else if (var15.method472(0, class7.field221)) {
                                    var14 = 7;
                                    class107.field2685 = class107.field2685.method469(class7.field221.method437(-71), (byte) -122);
                                } else if (var15.method472(0, class109.field2807)) {
                                    class107.field2685 = class107.field2685.method469(class109.field2807.method437(59), (byte) -119);
                                    var14 = 8;
                                } else if (var15.method472(0, class9.field254)) {
                                    var14 = 9;
                                    class107.field2685 = class107.field2685.method469(class9.field254.method437(103), (byte) -107);
                                } else if (var15.method472(0, class139.field3512)) {
                                    var14 = 10;
                                    class107.field2685 = class107.field2685.method469(class139.field3512.method437(102), (byte) -103);
                                } else if (var15.method472(0, class50.field1281)) {
                                    class107.field2685 = class107.field2685.method469(class50.field1281.method437(arg0 ^ 0xFFFFFF93), (byte) -102);
                                    var14 = 11;
                                } else if (class38.field1037 != 0) {
                                    if (var15.method472(0, client.field555)) {
                                        var14 = 0;
                                        class107.field2685 = class107.field2685.method469(client.field555.method437(-51), (byte) -102);
                                    } else if (var15.method472(0, class78.field1776)) {
                                        var14 = 1;
                                        class107.field2685 = class107.field2685.method469(class78.field1776.method437(120), (byte) -113);
                                    } else if (var15.method472(0, class83.field1845)) {
                                        class107.field2685 = class107.field2685.method469(class83.field1845.method437(-82), (byte) -125);
                                        var14 = 2;
                                    } else if (var15.method472(0, class58.field1446)) {
                                        var14 = 3;
                                        class107.field2685 = class107.field2685.method469(class58.field1446.method437(89), (byte) -123);
                                    } else if (var15.method472(arg0 + 1, class9.field263)) {
                                        var14 = 4;
                                        class107.field2685 = class107.field2685.method469(class9.field263.method437(arg0 ^ 0xFFFFFFA8), (byte) -124);
                                    } else if (var15.method472(0, class43.field1183)) {
                                        class107.field2685 = class107.field2685.method469(class43.field1183.method437(arg0 - 68), (byte) -108);
                                        var14 = 5;
                                    } else if (var15.method472(0, class127.field3234)) {
                                        class107.field2685 = class107.field2685.method469(class127.field3234.method437(-73), (byte) -124);
                                        var14 = 6;
                                    } else if (var15.method472(arg0 + 1, class7.field205)) {
                                        class107.field2685 = class107.field2685.method469(class7.field205.method437(-108), (byte) -110);
                                        var14 = 7;
                                    } else if (var15.method472(0, class109.field2793)) {
                                        var14 = 8;
                                        class107.field2685 = class107.field2685.method469(class109.field2793.method437(47), (byte) -112);
                                    } else if (var15.method472(0, class9.field262)) {
                                        class107.field2685 = class107.field2685.method469(class9.field262.method437(arg0 ^ 0x78), (byte) -101);
                                        var14 = 9;
                                    } else if (var15.method472(~arg0, class139.field3514)) {
                                        var14 = 10;
                                        class107.field2685 = class107.field2685.method469(class139.field3514.method437(-66), (byte) -128);
                                    } else if (var15.method472(0, class50.field1253)) {
                                        var14 = 11;
                                        class107.field2685 = class107.field2685.method469(class50.field1253.method437(arg0 ^ 0x35), (byte) -128);
                                    }
                                }
                                class39 var17 = class107.field2685.method452(true);
                                if (var17.method472(0, class121.field3162)) {
                                    class107.field2685 = class107.field2685.method469(class121.field3162.method437(51), (byte) -102);
                                    var16 = 1;
                                } else if (var17.method472(0, class132.field3337)) {
                                    var16 = 2;
                                    class107.field2685 = class107.field2685.method469(class132.field3337.method437(arg0 + 42), (byte) -127);
                                } else if (var17.method472(arg0 + 1, class89.field2089)) {
                                    var16 = 3;
                                    class107.field2685 = class107.field2685.method469(class89.field2089.method437(92), (byte) -103);
                                } else if (var17.method472(0, class146.field3648)) {
                                    var16 = 4;
                                    class107.field2685 = class107.field2685.method469(class146.field3648.method437(arg0 + 38), (byte) -123);
                                } else if (var17.method472(0, class120.field3133)) {
                                    class107.field2685 = class107.field2685.method469(class120.field3133.method437(arg0 + 47), (byte) -128);
                                    var16 = 5;
                                } else if (class38.field1037 != 0) {
                                    if (var17.method472(0, class121.field3174)) {
                                        class107.field2685 = class107.field2685.method469(class121.field3174.method437(arg0 - 64), (byte) -119);
                                        var16 = 1;
                                    } else if (var17.method472(arg0 + 1, class132.field3332)) {
                                        var16 = 2;
                                        class107.field2685 = class107.field2685.method469(class132.field3332.method437(110), (byte) -126);
                                    } else if (var17.method472(0, class89.field2078)) {
                                        var16 = 3;
                                        class107.field2685 = class107.field2685.method469(class89.field2078.method437(-61), (byte) -118);
                                    } else if (var17.method472(~arg0, class146.field3649)) {
                                        var16 = 4;
                                        class107.field2685 = class107.field2685.method469(class146.field3649.method437(-66), (byte) -126);
                                    } else if (var17.method472(0, class120.field3137)) {
                                        class107.field2685 = class107.field2685.method469(class120.field3137.method437(76), (byte) -108);
                                        var16 = 5;
                                    }
                                }
                                class79.field1794.method393((byte) -14, 3);
                                class79.field1794.method326(0, (byte) -98);
                                int var18 = class79.field1794.field710;
                                class79.field1794.method326(var14, (byte) -41);
                                class79.field1794.method326(var16, (byte) -85);
                                class62.method613(class79.field1794, class107.field2685, -107);
                                class79.field1794.method288(arg0, class79.field1794.field710 - var18);
                                if (class94.field2203 == 2) {
                                    class94.field2203 = 3;
                                    class43.field1156++;
                                    client.field561 = true;
                                    class79.field1794.method393((byte) -14, 11);
                                    class79.field1794.method326(class94.field2203, (byte) -67);
                                    class79.field1794.method326(class92.field2164, (byte) -93);
                                    class79.field1794.method326(class13.field349, (byte) -69);
                                }
                            }
                            class107.field2685 = class107.field2693;
                            class128.field3242 = true;
                        }
                    }
                }
                if (arg0 != -1) {
                    method981(-53);
                    return;
                }
                return;
            } while (!class56.method581((byte) 121, class109.field2798) && class109.field2798 != 32);
            if (class107.field2677.method437(97) < 12) {
                class107.field2677 = class107.field2677.method453(-1, class109.field2798);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIIIIZLqb;)V", line = 887)
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class113 arg9) {
        this.field2951 = arg2;
        this.field2928 = arg4;
        this.field2950 = arg6;
        this.field2959 = arg0;
        this.field2949 = arg3;
        this.field2953 = arg1;
        this.field2955 = arg5;
        if (arg7 != -1) {
            this.field2942 = class38.method430(2238, arg7);
            this.field2957 = class70.field1654 - 1;
            this.field2944 = 0;
            if (this.field2942.field3028 == 0 && arg9 != null && arg9 instanceof class112) {
                class112 var11 = (class112) arg9;
                if (this.field2942 == var11.field2942) {
                    this.field2957 = var11.field2957;
                    this.field2944 = var11.field2944;
                    return;
                }
            }
            if (arg8 && this.field2942.field3041 != -1) {
                this.field2944 = (int) (Math.random() * (double) this.field2942.field3057.length);
                this.field2957 -= (int) ((double) this.field2942.field3035[this.field2944] * Math.random());
                return;
            }
        }
    }
}

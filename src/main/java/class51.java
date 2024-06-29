import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class51 extends class182 {

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "[Lpf;")
    public class141[] field903 = new class141[5];

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "[I")
    public int[] field917 = new int[5];

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public int field921 = 0;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lsg;")
    public static class169 field892 = class165.method1060(" )2> ", 1536);

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "[Lsd;")
    public static class166[] field894 = new class166[50];

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "[[I")
    public static int[][] field896 = new int[104][104];

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Lua;")
    public static class181 field895 = new class181(30);

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "Lua;")
    public static class181 field922 = new class181(30);

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lsg;")
    public static class169 field927 = class165.method1060("hitmarks", 1536);

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "Lsg;")
    public static class169 field928 = class165.method1060("(Y<)4col>", 1536);

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "Lsg;")
    public static class169 field926 = class165.method1060("Bitte wenden Sie sich an den Kundendienst)3", 1536);

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "Lsg;")
    private static class169 field930 = class165.method1060("Close", 1536);

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lsg;")
    public static class169 field925 = field930;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Lmf;")
    public class114 field910;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Loc;")
    public class129 field905;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "Lpc;")
    public class138 field918;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "Lr;")
    public class153 field913;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lra;")
    public class154 field908;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Lfd;")
    public class51 field907;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Lad;")
    public class5 field912;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lke;")
    public static class95 field893;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "Z")
    public boolean field920;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "Z")
    public boolean field923;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Z")
    public boolean field929;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "Z")
    public static boolean field931;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static final void method316(boolean arg0) {
        field897++;
        if (!arg0) {
            method317((byte) 15, null);
        }
        for (int var1 = 0; var1 < class199.field3895; var1++) {
            int var2 = class6.field120[var1];
            class197 var3 = class54.field992[var2];
            int var4 = class85.field1559.method819((byte) 22);
            if ((var4 & 0x40) != 0) {
                var3.field3872 = class149.method974(class85.field1559.method795((byte) 26), 9);
                var3.field3715 = var3.field3872.field3422;
                var3.field3708 = var3.field3872.field3390;
                var3.field3682 = var3.field3872.field3395;
                var3.field3716 = var3.field3872.field3413;
                var3.field3711 = var3.field3872.field3392;
                var3.field3722 = var3.field3872.field3401;
                var3.field3732 = var3.field3872.field3420;
                var3.field3673 = var3.field3872.field3397;
                var3.field3695 = var3.field3872.field3417;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class85.field1559.method809((byte) -123);
                int var6 = class85.field1559.method806(1645316808);
                var3.method1248(var5, -94, var6, class162.field3107);
                var3.field3724 = class162.field3107 + 300;
                var3.field3736 = class85.field1559.method819((byte) 22);
                var3.field3678 = class85.field1559.method806(1645316808);
            }
            if ((var4 & 0x80) != 0) {
                int var7 = class85.field1559.method795((byte) 26);
                int var8 = class85.field1559.method806(1645316808);
                if (var7 == 65535) {
                    var7 = -1;
                }
                if (var3.field3697 == var7 && var7 != -1) {
                    int var9 = class159.method1021((byte) 82, var7).field3355;
                    if (var9 == 1) {
                        var3.field3706 = 0;
                        var3.field3688 = 0;
                        var3.field3668 = var8;
                        var3.field3710 = 0;
                    }
                    if (var9 == 2) {
                        var3.field3710 = 0;
                    }
                } else if (var7 == -1 || var3.field3697 == -1 || class159.method1021((byte) 79, var7).field3364 >= class159.method1021((byte) 51, var3.field3697).field3364) {
                    var3.field3697 = var7;
                    var3.field3710 = 0;
                    var3.field3706 = 0;
                    var3.field3725 = var3.field3702;
                    var3.field3668 = var8;
                    var3.field3688 = 0;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field3721 = class85.field1559.method811(14811);
                var3.field3662 = class85.field1559.method795((byte) 26);
            }
            if ((var4 & 0x1) != 0) {
                var3.field3701 = class85.field1559.method785(arg0);
                if (var3.field3701 == 65535) {
                    var3.field3701 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field3703 = class85.field1559.method827((byte) 94);
                int var10 = class85.field1559.method805((byte) -116);
                if (var3.field3703 == 65535) {
                    var3.field3703 = -1;
                }
                var3.field3675 = (var10 & 0xFFFF) + class162.field3107;
                var3.field3671 = var10 >> 16;
                var3.field3714 = 0;
                var3.field3684 = 0;
                if (var3.field3675 > class162.field3107) {
                    var3.field3684 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field3726 = class85.field1559.method793((byte) -118);
                var3.field3723 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var11 = class85.field1559.method784(127);
                int var12 = class85.field1559.method784(126);
                var3.method1248(var11, -65, var12, class162.field3107);
                var3.field3724 = class162.field3107 + 300;
                var3.field3736 = class85.field1559.method784(127);
                var3.field3678 = class85.field1559.method819((byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLmg;)V")
    public static final void method317(byte arg0, class115 arg1) {
        field898++;
        if (class54.field996) {
            class43.method275(arg1, true);
            return;
        }
        if (class56.field1040 == 1 && class178.field3480 >= 715 && class42.field796 >= 453) {
            class105.field1934 = !class105.field1934;
            if (class105.field1934) {
                class61.method381(-104);
            } else {
                class64.method398(class104.field1918, false, class43.field814, 255, 104, class201.field3923);
            }
        }
        if (class111.field2031 == 5) {
            return;
        }
        class27.field560++;
        if (arg0 <= 20 || class111.field2031 != 10) {
            return;
        }
        if (class187.field3640 != 2 && class154.field2976 == 0) {
            if (class56.field1040 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class178.field3480 >= var2 && class178.field3480 <= var2 + var4 && class42.field796 >= var3 && class42.field796 <= var3 + var5) {
                    class11.method62((byte) -16);
                    return;
                }
            }
            if (class25.field524 != null) {
                class11.method62((byte) -30);
            }
        }
        int var6 = class178.field3480;
        int var7 = class56.field1040;
        int var8 = class42.field796;
        if (class26.field547 == 0) {
            short var17 = 302;
            short var18 = 291;
            if (var7 == 1 && var17 - 75 <= var6 && var17 + 75 >= var6 && var8 >= var18 - 20 && var8 <= var18 + 20) {
                class9.field247 = 0;
                class26.field547 = 3;
            }
            short var19 = 462;
            boolean var20 = false;
            if (class20.field439 != 0) {
                while (class197.method1293(false)) {
                    if (class60.field1119 == 84) {
                        var20 = true;
                        break;
                    }
                }
            }
            if (var20 || var7 == 1 && var19 - 75 <= var6 && var6 <= var19 + 75 && var18 - 20 <= var8 && var8 <= var18 + 20) {
                class26.field547 = 2;
                class43.field804 = class7.field185;
                class9.field247 = 0;
                class43.field810 = class7.field205;
                class43.field800 = class139.field2590;
            }
            return;
        }
        if (class26.field547 == 2) {
            short var9 = 231;
            short var10 = 321;
            int var21 = var9 + 30;
            short var11 = 302;
            if (var7 == 1 && var21 - 15 <= var8 && var8 < var21) {
                class9.field247 = 0;
            }
            var21 += 15;
            if (var7 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class9.field247 = 1;
            }
            var21 += 15;
            if (var7 == 1 && var11 - 75 <= var6 && var11 + 75 >= var6 && var8 >= var10 - 20 && var8 <= var10 + 20) {
                class43.field807 = class43.field807.method1118(-13).method1127((byte) -23);
                if (class43.field807.method1134(0) == 0) {
                    class145.method954(class7.field174, 7791, class7.field161, class122.field2253);
                    return;
                }
                if (class43.field806.method1134(0) == 0) {
                    class145.method954(class7.field203, 7791, class7.field141, class156.field2999);
                    return;
                }
                class145.method954(class7.field140, 7791, class7.field196, class61.field1131);
                class140.method933((byte) 121, 20);
                return;
            }
            short var12 = 462;
            if (var7 == 1 && var6 >= var12 - 75 && var12 + 75 >= var6 && var8 >= var10 - 20 && var10 + 20 >= var8) {
                class26.field547 = 0;
                class43.field807 = class43.field814;
                class43.field806 = class43.field814;
            }
            while (true) {
                boolean var13;
                label206: do {
                    while (class197.method1293(false)) {
                        var13 = false;
                        for (int var14 = 0; class32.field685.method1134(0) > var14; var14++) {
                            if (class35.field702 == class32.field685.method1128(255, var14)) {
                                var13 = true;
                                break;
                            }
                        }
                        if (class9.field247 != 0) {
                            continue label206;
                        }
                        if (class60.field1119 == 85 && class43.field807.method1134(0) > 0) {
                            class43.field807 = class43.field807.method1132(0, 117, class43.field807.method1134(0) - 1);
                        }
                        if (class60.field1119 == 84 || class60.field1119 == 80) {
                            class9.field247 = 1;
                        }
                        if (var13 && class43.field807.method1134(0) < 12) {
                            class43.field807 = class43.field807.method1137(class35.field702, (byte) -124);
                        }
                    }
                    return;
                } while (class9.field247 != 1);
                if (class60.field1119 == 85 && class43.field806.method1134(0) > 0) {
                    class43.field806 = class43.field806.method1132(0, 103, class43.field806.method1134(0) - 1);
                }
                if (class60.field1119 == 84 || class60.field1119 == 80) {
                    class9.field247 = 0;
                }
                if (class20.field439 != 0 && class60.field1119 == 84) {
                    class43.field807 = class43.field807.method1118(-13).method1127((byte) 28);
                    if (class43.field807.method1134(0) == 0) {
                        class145.method954(class7.field174, 7791, class7.field161, class122.field2253);
                        return;
                    }
                    if (class43.field806.method1134(0) == 0) {
                        class145.method954(class7.field203, 7791, class7.field141, class156.field2999);
                        return;
                    }
                    class145.method954(class7.field140, 7791, class7.field196, class61.field1131);
                    class140.method933((byte) -117, 20);
                    return;
                }
                if (var13 && class43.field806.method1134(0) < 20) {
                    class43.field806 = class43.field806.method1137(class35.field702, (byte) -100);
                }
            }
        }
        if (class26.field547 != 3) {
            return;
        }
        short var15 = 321;
        short var16 = 382;
        if (var7 == 1 && var16 - 75 <= var6 && var16 + 75 >= var6 && var15 - 20 <= var8 && var15 + 20 >= var8) {
            class26.field547 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method318(byte arg0) {
        if (arg0 != -62) {
            return;
        }
        field927 = null;
        field922 = null;
        field895 = null;
        field925 = null;
        field894 = null;
        field928 = null;
        field896 = null;
        field926 = null;
        field892 = null;
        field930 = null;
        field893 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(III)V")
    public class51(int arg0, int arg1, int arg2) {
        this.field915 = arg2;
        this.field906 = arg1;
        this.field901 = this.field916 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class170 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public int field3019 = 99;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field3034 = -1;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public int field3024 = -1;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public int field3043 = -1;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public int field3044 = 5;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Z")
    public boolean field3036 = false;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field3035 = 2;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Z")
    private boolean field3039 = false;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field3025 = -1;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public int field3047 = -1;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field3030 = 0;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lha;")
    public static class46 field3033 = class271.method1828(" zuerst von Ihrer Ignorieren)2Liste(Q", -46);

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Lfa;")
    public static class211 field3029;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Z")
    public static boolean field3038;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "[I")
    public int[] field3020;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[I")
    private int[] field3022;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "[I")
    public int[] field3040;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "[I")
    private int[] field3042;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[[I")
    public int[][] field3018;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[[[B")
    public static byte[][][] field3023;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILwk;ILme;)Lme;")
    public final class36 method1207(int arg0, int arg1, class170 arg2, int arg3, class36 arg4) {
        int var6 = this.field3020[arg1];
        class77 var7 = class155.method1143(8, var6 >> 16);
        field3031++;
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1215(arg3, 1, arg4);
        }
        int var9 = arg2.field3020[arg3];
        class77 var10 = class155.method1143(8, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class36 var12 = arg4.method224(!var7.method614(var8, arg0 + 8079), !this.field3039);
            var12.method226(var7, var8, this.field3039);
            return var12;
        } else {
            class36 var13 = arg4.method224(!var7.method614(var8, 118) & !var10.method614(var11, 122), !this.field3039 & !arg2.field3039);
            var13.method243(var7, var8, var10, var11, this.field3042, this.field3039 | arg2.field3039);
            return arg0 == -7964 ? var13 : null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        class7.field119 = class79.field1507;
        class14.field215 = class50.field869;
        class98.field1818 = class86.field1643;
        class28.field556 = class208.field3732;
        class230.field4009 = class198.field3549;
        class80.field1519 = class251.field4437;
        class97.field1804 = class89.field1667;
        class100.field1845 = class156.field2796;
        class166.field2928 = class197.field3534;
        class215.field3814 = class141.field2530;
        class212.field3773 = class261.field4556;
        class30.field578 = client.field4702;
        class269.field4642 = class76.field1404;
        class51.field892 = class201.field3580;
        class105.field1895 = class248.field4386;
        class260.field4539 = class230.field4004;
        class168.field2957 = class76.field1411;
        class119.field2245 = class126.field2315;
        class42.field706 = class234.field4070;
        class229.field3993 = class73.field1306;
        class97.field1803 = class89.field1667;
        class202.field3622 = class126.field2309;
        class34.field623 = class264.field4592;
        class6.field106 = class115.field2169;
        class60.field1003 = class173.field3087;
        class225.field3942 = class258.field4513;
        class181.field3256 = class69.field1194;
        class233.field4057 = class155.field2747;
        class185.field3297 = class274.field4789;
        class107.field1985 = class173.field3095;
        class162.field2879 = class197.field3529;
        class89.field1687 = class107.field1992;
        class203.field3635 = class120.field2252;
        class187.field3346 = class47.field822;
        class160.field2827 = class185.field3295;
        class119.field2237 = class197.field3538;
        class267.field4627 = class190.field3391;
        class151.field2694 = class97.field1807;
        class38.field666 = class265.field4602;
        class194.field3482 = class58.field966;
        class26.field522 = class149.field2669;
        class180.field3209 = class158.field2810;
        class210.field3757 = class120.field2259;
        class264.field4590 = class53.field919;
        class47.field821 = class240.field4274;
        class17.field247 = class173.field3082;
        class196.field3506 = class219.field3863;
        class50.field873 = class26.field515;
        class56.field945 = class246.field4367;
        class275.field4807 = class180.field3219;
        class218.field3847 = class207.field3715;
        class50.field878 = class261.field4555;
        class92.field1718 = class128.field2357;
        class3.field48 = class147.field2650;
        class46.field787 = class258.field4509;
        if (arg0 != 23513) {
            field3023 = null;
        }
        class197.field3514 = class71.field1252;
        class52.field912 = class217.field3839;
        class52.field895 = class259.field4522;
        field3027++;
        class239.field4263 = class258.field4494;
        class74.field1321 = class113.field2142;
        class185.field3300 = class114.field2162;
        class63.field1074 = class141.field2577;
        class229.field3996 = class114.field2154;
        class257.field4481 = class241.field4280;
        class246.field4362 = class49.field853;
        class218.field3849 = class207.field3715;
        class186.field3335 = class142.field2598;
        class225.field3941 = class100.field1847;
        class141.field2542 = class78.field1470;
        class100.field1842 = class155.field2765;
        class206.field3690 = class124.field2284;
        class162.field2861 = class216.field3830;
        class106.field1917 = class189.field3379;
        class148.field2660 = class251.field4431;
        class214.field3802 = class166.field2934;
        class53.field920 = class178.field3194;
        class180.field3221 = class142.field2597;
        class274.field4790 = class86.field1631;
        class242.field4300 = class111.field2098;
        class142.field2595 = class274.field4786;
        class183.field3286 = class227.field3978;
        class20.field274 = class61.field1026;
        class116.field2196 = class273.field4779;
        class13.field207 = class98.field1815;
        class260.field4542 = class230.field4004;
        class267.field4617 = class199.field3566;
        class58.field969 = class3.field38;
        class105.field1881 = class97.field1805;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lwe;BI)V")
    private final void method1209(class75 arg0, byte arg1, int arg2) {
        if (arg1 != -51) {
            return;
        }
        if (arg2 == 1) {
            int var13 = arg0.method545((byte) -110);
            this.field3040 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3040[var14] = arg0.method545((byte) -69);
            }
            this.field3020 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3020[var15] = arg0.method545((byte) -90);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3020[var16] = (arg0.method545((byte) -106) << 16) + this.field3020[var16];
            }
        } else if (arg2 == 2) {
            this.field3047 = arg0.method545((byte) -121);
        } else if (arg2 == 3) {
            int var11 = arg0.method558(1);
            this.field3042 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3042[var12] = arg0.method558(1);
            }
            this.field3042[var11] = 9999999;
        } else if (arg2 == 4) {
            this.field3036 = true;
        } else if (arg2 == 5) {
            this.field3044 = arg0.method558(1);
        } else if (arg2 == 6) {
            this.field3043 = arg0.method545((byte) 79);
        } else if (arg2 == 7) {
            this.field3034 = arg0.method545((byte) -69);
        } else if (arg2 == 8) {
            this.field3019 = arg0.method558(1);
        } else if (arg2 == 9) {
            this.field3025 = arg0.method558(1);
        } else if (arg2 == 10) {
            this.field3024 = arg0.method558(arg1 ^ 0xFFFFFFCC);
        } else if (arg2 == 11) {
            this.field3035 = arg0.method558(arg1 + 52);
        } else if (arg2 == 12) {
            int var8 = arg0.method558(arg1 + 52);
            this.field3022 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3022[var9] = arg0.method545((byte) -63);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3022[var10] += arg0.method545((byte) -113) << 16;
            }
        } else if (arg2 == 13) {
            int var4 = arg0.method545((byte) 94);
            this.field3018 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method558(1);
                if (var6 > 0) {
                    this.field3018[var5] = new int[var6];
                    this.field3018[var5][0] = arg0.method559(-1);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field3018[var5][var7] = arg0.method545((byte) 92);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3039 = true;
        }
        field3041++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILme;I)Lme;")
    public final class36 method1210(int arg0, int arg1, class36 arg2, int arg3) {
        if (arg3 != -2) {
            this.method1207(-3, -13, (class170) null, 78, (class36) null);
        }
        int var5 = this.field3020[arg1];
        field3021++;
        class77 var6 = class155.method1143(8, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method224(true, true);
        }
        class36 var8 = arg2.method224(!var6.method614(var7, 123), !this.field3039);
        int var9 = arg0 & 0x3;
        if (var9 == 1) {
            var8.method227();
        } else if (var9 == 2) {
            var8.method233();
        } else if (var9 == 3) {
            var8.method237();
        }
        var8.method226(var6, var7, this.field3039);
        if (var9 == 1) {
            var8.method237();
        } else if (var9 == 2) {
            var8.method233();
        } else if (var9 == 3) {
            var8.method227();
        }
        return var8;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1211(int arg0) {
        field3029 = null;
        field3033 = null;
        if (arg0 != 2) {
            method1208(-3);
        }
        field3023 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)Lbd;")
    public static final class74 method1212(int arg0, int arg1, int arg2) {
        field3046++;
        if (arg2 != 15110) {
            field3030 = 2;
        }
        for (class74 var3 = (class74) class73.field1301.method264(-105); var3 != null; var3 = (class74) class73.field1301.method269((byte) 7)) {
            if (var3.field1322 && var3.method540(false, arg1, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILme;)Lme;")
    public final class36 method1213(int arg0, int arg1, class36 arg2) {
        field3028++;
        int var4 = this.field3020[arg0];
        class77 var5 = class155.method1143(8, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method224(true, true);
        }
        class77 var7 = null;
        if (arg1 > -33) {
            method1217((class24) null, 102, 69, (byte) 79);
        }
        int var8 = 0;
        if (this.field3022 != null && arg0 < this.field3022.length) {
            int var9 = this.field3022[arg0];
            var7 = class155.method1143(8, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class36 var11 = arg2.method224(!var5.method614(var6, 119), !this.field3039);
            var11.method226(var5, var6, this.field3039);
            return var11;
        } else {
            class36 var10 = arg2.method224(!var5.method614(var6, 116) & !var7.method614(var8, 118), !this.field3039);
            var10.method226(var5, var6, this.field3039);
            var10.method226(var7, var8, this.field3039);
            return var10;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILme;I)Lme;")
    public final class36 method1214(int arg0, class36 arg1, int arg2) {
        int var4 = this.field3020[arg2];
        class77 var5 = class155.method1143(8, var4 >> 16);
        field3026++;
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg1.method238(true, true);
        } else {
            class36 var7 = arg1.method238(!var5.method614(var6, 116), !this.field3039);
            var7.method226(var5, var6, this.field3039);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IILme;)Lme;")
    public final class36 method1215(int arg0, int arg1, class36 arg2) {
        field3037++;
        if (arg1 != 1) {
            return null;
        }
        int var4 = this.field3020[arg0];
        class77 var5 = class155.method1143(8, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method224(true, true);
        } else {
            class36 var7 = arg2.method224(!var5.method614(var6, arg1 + 124), !this.field3039);
            var7.method226(var5, var6, this.field3039);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lwe;Z)V")
    public final void method1216(class75 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method558(1);
            if (var3 == 0) {
                field3032++;
                return;
            }
            this.method1209(arg0, (byte) -51, var3);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lhi;IIB)V")
    public static final void method1217(class24 arg0, int arg1, int arg2, byte arg3) {
        field3045++;
        if (class259.field4517 != null || class222.field3910 || arg0 == null || class40.method271(106, arg0) == null) {
            return;
        }
        class259.field4517 = arg0;
        class177.field3184 = class40.method271(91, arg0);
        class47.field823 = arg2;
        if (arg3 < 104) {
            method1212(70, -16, -5);
        }
        class229.field3995 = arg1;
        class222.field3914 = false;
        class242.field4286 = 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public final void method1218(boolean arg0) {
        if (this.field3025 == -1) {
            if (this.field3042 == null) {
                this.field3025 = 0;
            } else {
                this.field3025 = 2;
            }
        }
        field3048++;
        if (arg0 || this.field3024 != -1) {
            return;
        }
        if (this.field3042 == null) {
            this.field3024 = 0;
        } else {
            this.field3024 = 2;
        }
    }
}

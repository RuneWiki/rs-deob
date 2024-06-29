import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class185 {

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[Z")
    public static boolean[] field3241 = new boolean[5];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "D")
    public static double field3232 = -1.0D;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lpj;")
    private static class237 field3249 = class33.method353(" loggt sich aus)3", 50);

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lpj;")
    public static class237 field3245 = class33.method353(":trade:", 16);

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lw;")
    public static class141 field3237 = null;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "[I")
    public static int[] field3243 = new int[2];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "[B")
    public byte[] field3234;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[B")
    public byte[] field3248;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
    public static int[] field3233;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[Lmc;")
    public static class191[] field3239;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[[[B")
    public static byte[][][] field3250;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    public static final int method1263(int arg0, int arg1) {
        field3238++;
        return arg1 >= -60 ? -35 : arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class213.field3645 * arg0 + class207.field3529 * arg3 >> 16;
        int var6 = class213.field3645 * arg3 - class207.field3529 * arg0 >> 16;
        int var7 = class24.field436 * arg1 + class160.field2868 * var6 >> 16;
        int var8 = class160.field2868 * arg1 - class24.field436 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class24.field436 * arg2 + class160.field2868 * var6 >> 16;
        int var12 = class160.field2868 * arg2 - class24.field436 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class207.field3538 && var13 < class207.field3538) {
            return false;
        } else if (var9 > class240.field4226 && var13 > class240.field4226) {
            return false;
        } else if (var10 < class25.field460 && var14 < class25.field460) {
            return false;
        } else {
            return var10 <= class222.field3814 || var14 <= class222.field3814;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIILfa;)Lgk;")
    public static final class154 method1265(byte arg0, int arg1, int arg2, class239 arg3) {
        int var4 = -85 / ((-arg0 - 38) / 46);
        field3242++;
        return class123.method883(arg1, arg2, -1, arg3) ? class255.method1723((byte) 54) : null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
    public static final boolean method1266(int arg0, int arg1) {
        if (arg1 != 2925) {
            field3232 = 0.10352310875484123D;
        }
        field3244++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZ)V")
    public static final void method1267(boolean arg0, boolean arg1) {
        field3253++;
        byte[][] var2 = class83.field1555;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class96.method718((byte) -52);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class273.field4718[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x325EF0B) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = (var7 & 0xFFD012) >> 14;
                            int var12 = (var11 / 8 << 8) + (var10 / 8);
                            for (int var13 = 0; var13 < class224.field3855.length; var13++) {
                                if (class224.field3855[var13] == var12 && var2[var13] != null) {
                                    class184.method1261(var8, (var10 & 0x7) * 8, var4, var9, var5 * 8, var6 * 8, class146.field2613, var2[var13], arg0, 8, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            method1266(-65, -3);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1268(int arg0) {
        field3249 = null;
        field3245 = null;
        field3239 = null;
        field3233 = null;
        field3243 = null;
        if (arg0 != -21212) {
            field3232 = 1.4677021561625285D;
        }
        field3250 = null;
        field3241 = null;
        field3237 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIILqe;IJZ)Z")
    public static final boolean method1269(int arg0, int arg1, int arg2, int arg3, int arg4, class95 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class43.method416(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        class234.field4049 = class43.field950;
        class101.field1795 = field3249;
        class53.field1109 = class258.field4430;
        class129.field2261 = class33.field712;
        class88.field1625 = class35.field776;
        class205.field3507 = class131.field2294;
        class28.field566 = class100.field1775;
        class115.field2013 = class82.field1538;
        class211.field3600 = class62.field1246;
        class258.field4432 = class78.field1476;
        class164.field2927 = class200.field3457;
        class80.field1498 = class260.field4463;
        class272.field4682 = class148.field2637;
        if (arg0 != 1) {
            field3243 = null;
        }
        class41.field931 = class129.field2258;
        class121.field2136 = class89.field1638;
        class172.field2992 = class7.field89;
        class231.field3983 = class31.field611;
        class209.field3558 = class52.field1101;
        class223.field3836 = class48.field1039;
        class31.field615 = class55.field1146;
        class51.field1080 = class156.field2771;
        class41.field929 = class46.field995;
        class3.field33 = class36.field811;
        class153.field2725 = class175.field3072;
        class46.field992 = class124.field2186;
        class63.field1266 = class231.field3943;
        class177.field3113 = class8.field165;
        class62.field1239 = class84.field1572;
        class62.field1253 = class235.field4069;
        class106.field1869 = class129.field2253;
        class233.field4038 = class47.field1021;
        class186.field3258 = class61.field1221;
        class233.field4026 = class176.field3082;
        class38.field854 = class63.field1258;
        class36.field795 = class270.field4616;
        class272.field4693 = class23.field429;
        class121.field2137 = class45.field971;
        class158.field2856 = class261.field4472;
        class26.field477 = class64.field1281;
        class45.field983 = class56.field1159;
        class223.field3834 = class180.field3160;
        class7.field82 = class211.field3603;
        class112.field1965 = class34.field729;
        class256.field4400 = class14.field240;
        class174.field3044 = class65.field1286;
        class242.field4252 = class258.field4428;
        field3251++;
        class234.field4054 = class153.field2724;
        class176.field3085 = class255.field4380;
        class90.field1650 = class205.field3501;
        class62.field1242 = class177.field3122;
        class26.field480 = class71.field1398;
        class227.field3894 = class274.field4763;
        class127.field2222 = class108.field1930;
        class252.field4343 = class160.field2878;
        class140.field2409 = class182.field3212;
        class17.field291 = class235.field4078;
        class195.field3394 = class181.field3172;
        class118.field2066 = class85.field1578;
        class33.field715 = class230.field3925;
        class37.field831 = class8.field132;
        class149.field2652 = class166.field2935;
        class58.field1194 = class138.field2381;
        class275.field4826 = class26.field485;
        class29.field590 = class159.field2866;
        class210.field3590 = class38.field855;
        class195.field3398 = class181.field3172;
        class121.field2146 = class45.field971;
        class207.field3536 = class24.field431;
        class243.field4269 = class130.field2267;
        class13.field217 = class62.field1245;
        class239.field4181 = class202.field3465;
        class34.field722 = class39.field893;
        class233.field4032 = class224.field3861;
        class186.field3262 = class245.field4294;
        class272.field4692 = class167.field2950;
        class73.field1407 = class252.field4348;
        class74.field1423 = class124.field2181;
        class44.field964 = class155.field2743;
        class130.field2270 = class227.field3890;
        class176.field3081 = class255.field4380;
        class68.field1333 = class38.field865;
        class179.field3149 = class141.field2488;
        class174.field3058 = class110.field1934;
        class138.field2390 = class101.field1783;
        class208.field3546 = class11.field201;
        class237.field4129 = class148.field2641;
        class35.field752 = class46.field1005;
        class167.field2953 = class211.field3594;
    }
}

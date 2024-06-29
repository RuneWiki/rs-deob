import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class200 {

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public int field192 = 0;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "Ldj;")
    public static class44 field190 = class89.method650(255, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "Ldj;")
    public static class44 field188 = class89.method650(255, ":assist:");

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Lri;")
    public static class189 field194 = new class189(64);

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "Ldj;")
    private static class44 field198 = class89.method650(255, "No response from server)3");

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "Ldj;")
    public static class44 field199 = field198;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
    public static final void method84(boolean arg0, byte arg1) {
        field197++;
        if (arg1 >= -14) {
            field199 = null;
        }
        for (int var2 = 0; var2 < class158.field2755; var2++) {
            class121 var3 = class170.field2960[class158.field2751[var2]];
            long var4 = (long) class158.field2751[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method171(2047) && var3.field2156.field3599 == arg0 && var3.field2156.method1304(true)) {
                int var6 = var3.field2260 >> 7;
                int var7 = var3.field2195 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field2231 == 1 && (var3.field2260 & 0x7F) == 64 && (var3.field2195 & 0x7F) == 64) {
                        if (class58.field1085[var6][var7] == class42.field785) {
                            continue;
                        }
                        class58.field1085[var6][var7] = class42.field785;
                    }
                    if (!var3.field2156.field3610) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field2206 = class40.method278(var3.field2195 + var3.field2231 * 64 - 64, class194.field3403, var3.field2231 * 64 + var3.field2260 - 64, (byte) 101);
                    class183.method1149(class194.field3403, var3.field2260, var3.field2195, var3.field2206, var3.field2231 * 64 + 60 - 64, var3, var3.field2224, var4, var3.field2213);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[Lvc;IBI)V")
    public static final void method85(int arg0, class223[] arg1, int arg2, byte arg3, int arg4) {
        field196++;
        int var5 = -75 / ((arg3 + 79) / 35);
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class223 var7 = arg1[var6];
            if (var7 != null && var7.field4170 == arg2) {
                if (var7.field4140 == 0) {
                    var7.field4130 = var7.field4136;
                } else if (var7.field4140 == 1) {
                    var7.field4130 = arg4 - var7.field4136;
                } else if (var7.field4140 == 2) {
                    var7.field4130 = var7.field4136 * arg4 >> 14;
                } else if (var7.field4140 == 3) {
                    if (var7.field4076 == 2) {
                        var7.field4130 = (var7.field4136 - 1) * var7.field4145 + var7.field4136 * 32;
                    } else if (var7.field4076 == 7) {
                        var7.field4130 = (var7.field4136 - 1) * var7.field4145 + var7.field4136 * 115;
                    }
                }
                if (var7.field4132 > var7.field4067 - var7.field4130) {
                    var7.field4132 = var7.field4067 - var7.field4130;
                }
                if (var7.field4056 == 0) {
                    var7.field4134 = var7.field4158;
                } else if (var7.field4056 == 1) {
                    var7.field4134 = arg0 - var7.field4158;
                } else if (var7.field4056 == 2) {
                    var7.field4134 = var7.field4158 * arg0 >> 14;
                } else if (var7.field4056 == 3) {
                    if (var7.field4076 == 2) {
                        var7.field4134 = (var7.field4158 - 1) * var7.field4108 + var7.field4158 * 32;
                    } else if (var7.field4076 == 7) {
                        var7.field4134 = (var7.field4158 - 1) * var7.field4108 + var7.field4158 * 12;
                    }
                }
                if (var7.field4110 == 0) {
                    var7.field4043 = var7.field4163;
                } else if (var7.field4110 == 1) {
                    var7.field4043 = (arg0 - var7.field4134) / 2 + var7.field4163;
                } else if (var7.field4110 == 2) {
                    var7.field4043 = arg0 - var7.field4163 - var7.field4134;
                } else if (var7.field4110 == 3) {
                    var7.field4043 = var7.field4163 * arg0 >> 14;
                } else if (var7.field4110 == 4) {
                    var7.field4043 = (var7.field4163 * arg0 >> 14) + (arg0 - var7.field4134) / 2;
                } else {
                    var7.field4043 = arg0 - var7.field4134 - (var7.field4163 * arg0 >> 14);
                }
                if (var7.field4025 - var7.field4134 < var7.field4026) {
                    var7.field4026 = var7.field4025 - var7.field4134;
                }
                if (var7.field4132 < 0) {
                    var7.field4132 = 0;
                }
                if (var7.field4142 == 0) {
                    var7.field4039 = var7.field4059;
                } else if (var7.field4142 == 1) {
                    var7.field4039 = (arg4 - var7.field4130) / 2 + var7.field4059;
                } else if (var7.field4142 == 2) {
                    var7.field4039 = arg4 - var7.field4059 - var7.field4130;
                } else if (var7.field4142 == 3) {
                    var7.field4039 = var7.field4059 * arg4 >> 14;
                } else if (var7.field4142 == 4) {
                    var7.field4039 = (var7.field4059 * arg4 >> 14) + (arg4 - var7.field4130) / 2;
                } else {
                    var7.field4039 = arg4 - (var7.field4059 * arg4 >> 14) - var7.field4130;
                }
                if (var7.field4026 < 0) {
                    var7.field4026 = 0;
                }
                if (var7.field4076 == 0) {
                    class116.method818((byte) 100, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
    public static void method86(byte arg0) {
        if (arg0 != -51) {
            method89(null, 21, null, null);
        }
        field188 = null;
        field199 = null;
        field198 = null;
        field194 = null;
        field190 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lfj;BI)V")
    private final void method87(class66 arg0, byte arg1, int arg2) {
        field195++;
        if (arg2 == 5) {
            this.field192 = arg0.method500(102);
        }
        if (arg1 != -42) {
            this.method87(null, (byte) 125, 87);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILfj;)V")
    public final void method88(int arg0, class66 arg1) {
        field193++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method506(255);
            if (var3 == 0) {
                return;
            }
            this.method87(arg1, (byte) -42, var3);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ldj;ILdj;Lve;)[Lod;")
    public static final class155[] method89(class44 arg0, int arg1, class44 arg2, class225 arg3) {
        int var4 = arg3.method1463(arg0, -77);
        if (arg1 < 14) {
            method86((byte) -112);
        }
        int var5 = arg3.method1461(var4, arg2, 0);
        field189++;
        return class115.method809(var4, var5, -31242, arg3);
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)V")
    public static final void method90(int arg0, int arg1) {
        field191++;
        class93 var2 = (class93) class54.field990.method828((long) arg0, (byte) -40);
        if (var2 == null) {
            return;
        }
        int var3 = -74 / ((-arg1 - 39) / 59);
        for (int var4 = 0; var4 < var2.field1729.length; var4++) {
            var2.field1729[var4] = -1;
            var2.field1734[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public static final void method91(int arg0) {
        class184.field3199 = true;
        class193.field3382 = 0L;
        field186++;
        class29.field521 = true;
        class169.field2916.field3236 = 0;
        class124.field2219 = 0;
        class90.field1698 = 0;
        class31.field549 = 0;
        class48.field880 = 0;
        class88.field1673 = 0;
        class70.field1322 = 0;
        class44.field795 = 0;
        class20.field342 = 0;
        class44.field810 = 0;
        class221.field4010 = 0;
        class192.field3328 = 0;
        class82.field1593 = 0;
        class32.field555 = 0;
        class57.field1071 = 0;
        class40.field765 = 0;
        class216.field3931 = 0;
        class20.field347 = 0;
        class103.field1882 = 0;
        class207.field3701 = 0;
        class70.field1334 = 0;
        class171.field2980 = 0;
        class27.field489 = 0;
        class187.field3224 = 0;
        class151.field2624 = 0;
        class221.field4000 = 0;
        class66.field1230 = 0;
        class70.field1323 = 0;
        class134.field2393 = 0;
        class224.field4174 = 0;
        class162.field2799 = 0;
        class54.field974 = 0;
        class223.field4027 = 0;
        class157.field2742 = 0;
        class120.field2142 = 0;
        class214.field3848 = 0;
        class44.field789 = 0;
        class73.field1383 = 0;
        class103.field1875 = 0;
        class137.field2448 = 0;
        class227.field4262 = 0;
        class211.field3763 = 0;
        class192.field3335 = 0;
        class53.field948 = 0;
        class46.field873 = 0;
        class190.field3291 = 0;
        class124.field2254 = 0;
        class226.field4251 = 0;
        class2.field26 = 0;
        class239.field4413 = 0;
        class173.field3011 = 0;
        class192.field3305 = 0;
        class189.field3257 = 0;
        class115.field2045 = 0;
        class180.field3125 = 0;
        class44.field809 = 0;
        class223.field4151 = 0;
        class215.field3915 = 0;
        class2.field29 = 0;
        class108.field1969 = 0;
        class2.field22 = 0;
        class44.field846 = 0;
        class44.field835 = 0;
        class120.field2130 = 0;
        class66.field1217 = 0;
        class86.field1655 = 0;
        class66.field1252 = 0;
        class181.field3161 = 0;
        class74.field1414 = 0;
        class214.field3861 = 0;
        class235.field4363 = 0;
        class66.field1210 = 0;
        class135.field2413 = 0;
        class124.field2226 = 0;
        class157.field2732 = 0;
        class44.field804 = 0;
        class116.field2068 = 0;
        class225.field4209 = 0;
        class52.field933 = 0;
        class168.field2880 = 0;
        class27.field480 = 0;
        class135.field2406 = 0;
        class156.field2709 = 0;
        class15.field274 = 0;
        class178.field3059 = 0;
        class102.field1872 = 0;
        class5.field62 = 0;
        class78.field1513 = 0;
        class60.field1119 = 0;
        class82.field1603 = 0;
        class192.field3350 = 0;
        class178.field3055 = 0;
        class108.field1983 = 0;
        class214.field3845 = 0;
        class115.field2044 = 0;
        class75.field1440 = 0;
        class20.field343 = 0;
        class139.field2476 = 0;
        class67.field1263 = 0;
        class189.field3256 = 0;
        class136.field2430 = 0;
        class207.field3709 = 0;
        class115.field2055 = 0;
        class225.field4227 = 0;
        class84.field1631 = 0;
        class215.field3910 = 0;
        class66.field1197 = 0;
        class181.field3156 = 0;
        class74.field1418 = 0;
        class121.field2153 = 0;
        class225.field4231 = 0;
        class160.field2762 = 0;
        class212.field3802 = 0;
        class123.field2182 = 0;
        class215.field3906 = 0;
        class152.field2642 = 0;
        class70.field1329 = 0;
        class207.field3702 = 0;
        class4.field56 = 0;
        class66.field1225 = 0;
        class61.field1143 = 0;
        class40.field755 = 0;
        class225.field4197 = 0;
        class66.field1214 = 0;
        class211.field3776 = 0;
        class17.field308 = 0;
        class179.field3070 = 0;
        class44.field837 = 0;
        class196.field3477 = 0;
        class225.field4192 = 0;
        class151.field2626 = 0;
        class36.field654 = 0;
        field197 = 0;
        class139.field2502 = 0;
        class75.field1437 = 0;
        class30.field542 = 0;
        class137.field2442 = 0;
        class211.field3772 = 0;
        class214.field3833 = 0;
        class145.field2553 = 0;
        class204.field3641 = 0;
        client.field594 = 0;
        class211.field3761 = 0;
        class170.field2944 = 0;
        class82.field1590 = 0;
        class135.field2407 = 0;
        class3.field41 = 0;
        client.field593 = 0;
        class154.field2681 = 0;
        class179.field3076 = 0;
        class131.field2350 = 0;
        class102.field1857 = 0;
        class215.field3897 = 0;
        class44.field839 = 0;
        class7.field139 = 0;
        class83.field1614 = 0;
        class60.field1125 = 0;
        class5.field74 = 0;
        class168.field2879 = 0;
        class81.field1573 = 0;
        class93.field1727 = 0;
        class163.field2813 = 0;
        class66.field1250 = 0;
        class226.field4245 = 0;
        class74.field1425 = 0;
        class22.field373 = 0;
        class17.field303 = 0;
        class66.field1231 = 0;
        class146.field2573 = 0;
        class225.field4203 = 0;
        class4.field53 = 0;
        class226.field4244 = 0;
        class24.field419 = 0;
        class52.field932 = 0;
        class192.field3349 = 0;
        class208.field3727 = 0;
        class136.field2434 = 0;
        class57.field1063 = 0;
        class192.field3370 = 0;
        class212.field3815 = 0;
        class152.field2645 = 0;
        class183.field3189 = 0;
        class132.field2369 = 0;
        class200.field3530 = 0;
        class194.field3409 = 0;
        class207.field3706 = 0;
        class103.field1879 = 0;
        class188.field3254 = 0;
        class139.field2484 = 0;
        class225.field4237 = 0;
        class66.field1220 = 0;
        class44.field792 = 0;
        class59.field1096 = 0;
        class66.field1223 = 0;
        class192.field3340 = 0;
        class21.field360 = 0;
        class211.field3778 = 0;
        class120.field2133 = 0;
        class124.field2202 = 0;
        class196.field3467 = 0;
        class168.field2897 = 0;
        class104.field1899 = 0;
        class13.field258 = 0;
        class95.field1767 = 0;
        class218.field3944 = 0;
        class59.field1109 = 0;
        class211.field3787 = 0;
        class187.field3228 = 0;
        class202.field3593 = 0;
        class28.field497 = 0;
        class44.field814 = 0;
        class44.field807 = 0;
        class24.field405 = 0;
        class39.field727 = 0;
        class225.field4201 = 0;
        class63.field1174 = 0;
        class39.field682 = 0;
        class118.field2112 = 0;
        class70.field1327 = 0;
        class194.field3401 = 0;
        class237.field4398 = 0;
        class172.field2996 = 0;
        class133.field2376 = 0;
        class116.field2075 = 0;
        class36.field647 = 0;
        class42.field778 = 0;
        class95.field1764 = 0;
        class190.field3288 = 0;
        class192.field3346 = 0;
        class70.field1335 = 0;
        class111.field2012 = 0;
        class211.field3762 = 0;
        class24.field411 = 0;
        class58.field1089 = 0;
        class84.field1637 = 0;
        class59.field1106 = 0;
        class13.field250 = 0;
        class225.field4204 = 0;
        class192.field3322 = 0;
        class48.field891 = 0;
        class63.field1169 = 0;
        class115.field2053 = 0;
        class230.field4320 = 0;
        class156.field2712 = 0;
        class78.field1509 = 0;
        class52.field926 = 0;
        class67.field1272 = 0;
        class192.field3353 = 0;
        class66.field1213 = 0;
        class67.field1281 = 0;
        class153.field2657 = 0;
        class239.field4421 = 0;
        class192.field3367 = 0;
        class67.field1267 = 0;
        class129.field2299 = 0;
        class61.field1146 = 0;
        class79.field1520 = 0;
        class124.field2228 = 0;
        class87.field1662 = 0;
        class172.field3002 = 0;
        class54.field983 = 0;
        class182.field3175 = 0;
        class225.field4229 = 0;
        class211.field3795 = 0;
        class58.field1079 = 0;
        class203.field3632 = 0;
        class227.field4258 = 0;
        class204.field3657 = 0;
        class39.field680 = 0;
        class66.field1253 = 0;
        class14.field262 = 0;
        class118.field2102 = 0;
        class64.field1182 = 0;
        class131.field2351 = 0;
        class191.field3301 = 0;
        class72.field1375 = 0;
        class137.field2456 = 0;
        class61.field1141 = 0;
        class105.field1931 = 0;
        class180.field3118 = 0;
        class235.field4371 = 0;
        class52.field929 = 0;
        class30.field533 = 0;
        class105.field1918 = 0;
        class118.field2111 = 0;
        class44.field833 = 0;
        class220.field3984 = 0;
        class60.field1121 = 0;
        class211.field3792 = 0;
        class66.field1261 = 0;
        class39.field683 = 0;
        class67.field1271 = 0;
        class192.field3319 = 0;
        class189.field3271 = 0;
        class211.field3779 = 0;
        class173.field3007 = 0;
        class122.field2169 = 0;
        class124.field2212 = 0;
        class71.field1356 = 0;
        class228.field4287 = 0;
        class89.field1686 = 0;
        class24.field401 = 0;
        class27.field483 = 0;
        class220.field3998 = 0;
        class223.field4107 = 0;
        class74.field1406 = 0;
        class80.field1547 = 0;
        class222.field4019 = 0;
        class8.field183 = 0;
        class44.field805 = 0;
        class42.field783 = 0;
        class202.field3587 = 0;
        class105.field1917 = 0;
        class168.field2895 = 0;
        class116.field2076 = 0;
        class225.field4216 = 0;
        class66.field1204 = 0;
        class223.field4087 = 0;
        class202.field3597 = 0;
        class192.field3308 = 0;
        class197.field3486 = 0;
        class162.field2800 = 0;
        class226.field4243 = 0;
        class132.field2365 = 0;
        class52.field931 = 0;
        class10.field214 = 0;
        class32.field558 = 0;
        class57.field1058 = 0;
        class215.field3896 = 0;
        class39.field713 = 0;
        class162.field2806 = 0;
        class47.field879 = 0;
        class225.field4213 = 0;
        class234.field4351 = 0;
        class131.field2346 = 0;
        class136.field2441 = 0;
        class44.field847 = 0;
        class66.field1198 = 0;
        class20.field348 = 0;
        class211.field3759 = 0;
        class235.field4374 = 0;
        class23.field379 = 0;
        class225.field4207 = 0;
        class95.field1771 = 0;
        class83.field1624 = 0;
        class226.field4247 = 0;
        class192.field3337 = 0;
        class94.field1749 = 0;
        class36.field637 = 0;
        class82.field1610 = 0;
        class184.field3198 = 0;
        class83.field1611 = 0;
        class131.field2355 = 0;
        class156.field2719 = 0;
        class44.field823 = 0;
        class212.field3804 = 0;
        class122.field2160 = 0;
        class54.field984 = 0;
        class78.field1504 = 0;
        class61.field1135 = 0;
        class116.field2071 = 0;
        class48.field890 = 0;
        class54.field972 = 0;
        class153.field2665 = 0;
        class93.field1733 = 0;
        class146.field2566 = 0;
        class212.field3803 = 0;
        class32.field554 = 0;
        class8.field178 = 0;
        class171.field2976 = 0;
        class124.field2214 = 0;
        class53.field954 = 0;
        class66.field1247 = 0;
        class57.field1075 = 0;
        class192.field3363 = 0;
        class208.field3725 = 0;
        class13.field252 = 0;
        class168.field2887 = 0;
        class133.field2382 = 0;
        class212.field3816 = 0;
        class29.field523 = 0;
        class184.field3202 = 0;
        class48.field893 = 0;
        class15.field277 = 0;
        class38.field677 = 0;
        class204.field3667 = 0;
        class156.field2694 = 0;
        class212.field3810 = 0;
        class168.field2876 = 0;
        class225.field4238 = 0;
        class168.field2888 = 0;
        class192.field3351 = 0;
        class101.field1843 = 0;
        class224.field4176 = 0;
        class234.field4349 = 0;
        class227.field4259 = 0;
        class194.field3407 = 0;
        class208.field3724 = 0;
        class13.field235 = 0;
        class1.field10 = 0;
        class133.field2389 = 0;
        class40.field754 = 0;
        class212.field3800 = 0;
        class44.field828 = 0;
        class59.field1102 = 0;
        class132.field2368 = 0;
        class129.field2286 = 0;
        class44.field802 = 0;
        class182.field3165 = 0;
        class131.field2343 = 0;
        class202.field3580 = 0;
        class192.field3330 = 0;
        class82.field1589 = 0;
        class225.field4211 = 0;
        class17.field305 = 0;
        class117.field2090 = 0;
        class239.field4420 = 0;
        class239.field4415 = 0;
        class205.field3673 = 0;
        class67.field1262 = 0;
        class67.field1264 = 0;
        class92.field1711 = 0;
        class201.field3572 = 0;
        class227.field4263 = 0;
        class201.field3574 = 0;
        class225.field4198 = 0;
        class225.field4189 = 0;
        class153.field2675 = 0;
        class211.field3783 = 0;
        class29.field507 = 0;
        class83.field1612 = 0;
        class73.field1382 = 0;
        class218.field3948 = 0;
        class45.field853 = 0;
        class197.field3479 = 0;
        class89.field1687 = 0;
        class1.field1 = 0;
        class198.field3504 = 0;
        class238.field4410 = 0;
        class66.field1259 = 0;
        class22.field364 = 0;
        class204.field3666 = 0;
        class140.field2511 = 0;
        class39.field714 = 0;
        class116.field2074 = 0;
        class15.field273 = 0;
        class225.field4221 = 0;
        class156.field2711 = 0;
        class192.field3352 = 0;
        class44.field794 = 0;
        class121.field2155 = 0;
        class74.field1415 = 0;
        field196 = 0;
        class116.field2077 = 0;
        class13.field242 = 0;
        class239.field4419 = 0;
        class20.field340 = 0;
        class215.field3912 = 0;
        class66.field1233 = 0;
        class68.field1306 = 0;
        class66.field1199 = 0;
        class61.field1154 = 0;
        class23.field386 = 0;
        class82.field1597 = 0;
        class8.field161 = 0;
        class204.field3644 = 0;
        class112.field2013 = 0;
        class108.field1994 = 0;
        class192.field3334 = 0;
        class71.field1360 = 0;
        class82.field1608 = 0;
        class211.field3788 = 0;
        class204.field3654 = 0;
        class8.field174 = 0;
        class37.field656 = 0;
        class220.field3981 = 0;
        class44.field827 = 0;
        class143.field2541 = 0;
        class66.field1229 = 0;
        class215.field3901 = 0;
        class147.field2584 = 0;
        class44.field817 = 0;
        class1.field12 = 0;
        class50.field921 = 0;
        class147.field2598 = 0;
        class225.field4234 = 0;
        class204.field3653 = 0;
        class55.field1003 = 0;
        class131.field2348 = 0;
        class89.field1688 = 0;
        class178.field3058 = 0;
        class31.field551 = 0;
        class171.field2978 = 0;
        class44.field845 = 0;
        class23.field382 = 0;
        class234.field4355 = 0;
        class202.field3596 = 0;
        class135.field2411 = 0;
        class116.field2078 = 0;
        class72.field1366 = 0;
        client.field596 = 0;
        class223.field4116 = 0;
        class179.field3066 = 0;
        class92.field1716 = 0;
        class82.field1598 = 0;
        class200.field3539 = 0;
        class188.field3251 = 0;
        class139.field2494 = 0;
        client.field606 = 0;
        field186 = 0;
        class211.field3774 = 0;
        class41.field769 = 0;
        class74.field1420 = 0;
        class37.field663 = 0;
        class5.field76 = 0;
        class114.field2032 = 0;
        class173.field3008 = 0;
        class97.field1785 = 0;
        client.field595 = 0;
        class157.field2728 = 0;
        class66.field1246 = 0;
        class174.field3018 = 0;
        class74.field1422 = 0;
        class212.field3801 = 0;
        class227.field4265 = 0;
        class117.field2087 = 0;
        class63.field1176 = 0;
        class168.field2891 = 0;
        class192.field3329 = 0;
        class180.field3128 = 0;
        class225.field4193 = 0;
        class146.field2577 = 0;
        class44.field806 = 0;
        class74.field1405 = 0;
        class81.field1570 = 0;
        class124.field2250 = 0;
        class93.field1735 = 0;
        class94.field1757 = 0;
        class187.field3226 = 0;
        class44.field820 = 0;
        class74.field1409 = 0;
        class105.field1901 = 0;
        class83.field1617 = 0;
        class165.field2841 = 0;
        class66.field1222 = 0;
        class82.field1604 = 0;
        class44.field800 = 0;
        class225.field4199 = 0;
        class147.field2581 = 0;
        class115.field2047 = 0;
        class225.field4190 = 0;
        class205.field3670 = 0;
        class174.field3017 = 0;
        class194.field3398 = 0;
        class102.field1854 = 0;
        class89.field1694 = 0;
        class54.field985 = 0;
        class183.field3185 = 0;
        class35.field631 = 0;
        class66.field1235 = 0;
        class75.field1439 = 0;
        class223.field4072 = 0;
        class139.field2479 = 0;
        class231.field4325 = 0;
        class211.field3793 = 0;
        class74.field1429 = 0;
        class77.field1490 = 0;
        class66.field1238 = 0;
        class74.field1404 = 0;
        class114.field2030 = 0;
        class46.field870 = 0;
        class14.field265 = 0;
        class95.field1761 = 0;
        class93.field1731 = 0;
        class157.field2729 = 0;
        class2.field18 = 0;
        class36.field640 = 0;
        class58.field1087 = 0;
        class57.field1067 = 0;
        client.field600 = 0;
        class170.field2961 = 0;
        class139.field2497 = 0;
        class27.field491 = 0;
        class75.field1436 = 0;
        class227.field4267 = 0;
        class192.field3320 = 0;
        class188.field3252 = 0;
        class234.field4350 = 0;
        class60.field1128 = 0;
        class171.field2973 = 0;
        class89.field1695 = 0;
        class83.field1619 = 0;
        class66.field1234 = 0;
        class239.field4418 = 0;
        class153.field2668 = 0;
        client.field597 = 0;
        class230.field4317 = 0;
        class33.field590 = 0;
        class75.field1438 = 0;
        class207.field3711 = 0;
        class168.field2890 = 0;
        class223.field4045 = 0;
        class220.field3986 = 0;
        class7.field146 = 0;
        class192.field3345 = 0;
        class32.field569 = 0;
        class153.field2664 = 0;
        class19.field314 = 0;
        class151.field2630 = 0;
        class166.field2872 = 0;
        class8.field162 = 0;
        class71.field1361 = 0;
        class192.field3359 = 0;
        class199.field3524 = 0;
        class188.field3239 = 0;
        class114.field2031 = 0;
        class7.field142 = 0;
        class202.field3630 = 0;
        class190.field3284 = 0;
        class183.field3181 = 0;
        class154.field2682 = 0;
        class8.field176 = 0;
        class225.field4215 = 0;
        class212.field3818 = 0;
        class115.field2050 = 0;
        class128.field2282 = 0;
        class71.field1354 = 0;
        class123.field2178 = 0;
        class44.field798 = 0;
        class172.field2993 = 0;
        class27.field485 = 0;
        class187.field3222 = 0;
        class179.field3078 = 0;
        class153.field2658 = 0;
        class37.field655 = 0;
        class214.field3882 = 0;
        class44.field793 = 0;
        class163.field2811 = 0;
        class79.field1537 = 0;
        class53.field962 = 0;
        class122.field2163 = 0;
        class80.field1551 = 0;
        class237.field4392 = 0;
        class192.field3354 = 0;
        class165.field2832 = 0;
        class219.field3971 = 0;
        class197.field3487 = 0;
        class172.field2990 = 0;
        class39.field704 = 0;
        class103.field1891 = 0;
        class66.field1218 = 0;
        class44.field818 = 0;
        class74.field1408 = 0;
        class158.field2747 = 0;
        class102.field1861 = 0;
        class169.field2921 = 0;
        class82.field1594 = 0;
        class88.field1678 = 0;
        class120.field2144 = 0;
        class171.field2982 = 0;
        class211.field3765 = 0;
        class154.field2684 = 0;
        class189.field3262 = 0;
        class102.field1867 = 0;
        class74.field1410 = 0;
        class66.field1212 = 0;
        class114.field2035 = 0;
        class168.field2886 = 0;
        class200.field3534 = 0;
        class29.field512 = 0;
        class92.field1718 = 0;
        class146.field2574 = 0;
        class15.field292 = 0;
        class23.field380 = 0;
        class172.field3004 = 0;
        class190.field3277 = 0;
        class182.field3173 = 0;
        class44.field796 = 0;
        class215.field3907 = 0;
        class211.field3758 = 0;
        class66.field1209 = 0;
        class154.field2683 = 0;
        class201.field3568 = 0;
        class61.field1136 = 0;
        class5.field79 = 0;
        class190.field3287 = 0;
        class44.field819 = 0;
        class27.field482 = 0;
        class166.field2871 = 0;
        class153.field2659 = 0;
        class238.field4408 = 0;
        class181.field3155 = 0;
        class192.field3318 = 0;
        class13.field254 = 0;
        class168.field2883 = 0;
        class55.field1007 = 0;
        class191.field3302 = 0;
        class5.field66 = 0;
        class237.field4396 = 0;
        class145.field2557 = 0;
        class81.field1579 = 0;
        class178.field3061 = 0;
        class22.field372 = 0;
        client.field605 = 0;
        class156.field2714 = 0;
        class147.field2592 = 0;
        class48.field892 = 0;
        class226.field4242 = 0;
        class211.field3777 = 0;
        class230.field4310 = 0;
        class192.field3323 = 0;
        class234.field4354 = 0;
        class211.field3790 = 0;
        class108.field1987 = 0;
        class15.field283 = 0;
        class183.field3190 = 0;
        class74.field1421 = 0;
        class234.field4353 = 0;
        class133.field2385 = 0;
        class28.field498 = 0;
        class189.field3263 = 0;
        class211.field3770 = 0;
        class220.field3988 = 0;
        class40.field760 = 0;
        class118.field2109 = 0;
        class44.field824 = 0;
        class171.field2983 = 0;
        class193.field3384 = 0;
        class57.field1061 = 0;
        class211.field3782 = 0;
        class44.field838 = 0;
        class124.field2244 = 0;
        class23.field377 = 0;
        class66.field1215 = 0;
        class143.field2545 = 0;
        class22.field375 = 0;
        class187.field3227 = 0;
        class88.field1677 = 0;
        class122.field2167 = 0;
        class214.field3842 = 0;
        class223.field4128 = 0;
        class179.field3074 = 0;
        class171.field2979 = 0;
        class225.field4226 = 0;
        class187.field3229 = 0;
        class2.field23 = 0;
        class123.field2183 = 0;
        class190.field3276 = 0;
        class135.field2416 = 0;
        class108.field1971 = 0;
        class115.field2041 = 0;
        class180.field3127 = 0;
        class67.field1277 = 0;
        class207.field3703 = 0;
        class32.field556 = 0;
        class200.field3536 = 0;
        class214.field3860 = 0;
        class32.field568 = 0;
        class64.field1192 = 0;
        class180.field3117 = 0;
        class66.field1237 = 0;
        class214.field3852 = 0;
        class42.field781 = 0;
        class189.field3261 = 0;
        class210.field3747 = 0;
        class49.field918 = 0;
        class196.field3474 = 0;
        class157.field2743 = 0;
        class166.field2852 = 0;
        class66.field1196 = 0;
        class66.field1257 = 0;
        class153.field2654 = 0;
        class214.field3878 = 0;
        class57.field1060 = 0;
        class78.field1510 = 0;
        class66.field1201 = 0;
        class46.field866 = 0;
        class84.field1634 = 0;
        class5.field77 = 0;
        class189.field3267 = 0;
        class219.field3973 = 0;
        class214.field3879 = 0;
        class10.field200 = 0;
        class214.field3836 = 0;
        class135.field2414 = 0;
        class94.field1756 = 0;
        class123.field2189 = 0;
        class200.field3535 = 0;
        class19.field327 = 0;
        class225.field4191 = 0;
        class66.field1200 = 0;
        class78.field1506 = 0;
        class181.field3144 = 0;
        class172.field3000 = 0;
        class89.field1693 = 0;
        class151.field2632 = 0;
        class53.field958 = 0;
        class35.field630 = 0;
        class192.field3336 = 0;
        class57.field1069 = 0;
        class189.field3260 = 0;
        class53.field965 = 0;
        class37.field658 = 0;
        class147.field2583 = 0;
        class19.field321 = 0;
        class128.field2281 = 0;
        class197.field3485 = 0;
        class82.field1592 = 0;
        class23.field381 = 0;
        class52.field938 = 0;
        class204.field3660 = 0;
        class225.field4224 = 0;
        class80.field1555 = 0;
        class194.field3400 = 0;
        class87.field1663 = 0;
        class230.field4321 = 0;
        class129.field2297 = 0;
        class39.field734 = 0;
        class135.field2415 = 0;
        class235.field4362 = 0;
        class207.field3705 = 0;
        class213.field3826 = 0;
        class184.field3197 = 0;
        class168.field2885 = 0;
        class81.field1568 = 0;
        class92.field1713 = 0;
        class108.field1985 = 0;
        class179.field3085 = 0;
        class44.field825 = 0;
        class29.field511 = 0;
        class139.field2490 = 0;
        class79.field1532 = 0;
        class44.field791 = 0;
        class200.field3541 = 0;
        class133.field2378 = 0;
        client.field603 = 0;
        class108.field1972 = 0;
        class79.field1540 = 0;
        class200.field3533 = 0;
        class198.field3509 = 0;
        class197.field3488 = 0;
        class39.field689 = 0;
        class132.field2373 = 0;
        client.field591 = 0;
        class225.field4210 = 0;
        class204.field3651 = 0;
        class133.field2375 = 0;
        class72.field1367 = 0;
        class7.field141 = 0;
        class82.field1606 = 0;
        class128.field2285 = 0;
        class225.field4220 = 0;
        class227.field4268 = 0;
        class158.field2754 = 0;
        class3.field45 = 0;
        class230.field4314 = arg0;
        class222.field4018 = 0;
        class192.field3369 = 0;
        class192.field3310 = 0;
        class52.field941 = 0;
        class163.field2816 = 0;
        class199.field3512 = 0;
        class169.field2918 = 0;
        class183.field3194 = 0;
        class61.field1151 = 0;
        class70.field1326 = 0;
        class93.field1730 = 0;
        class115.field2043 = 0;
        class135.field2421 = 0;
        class225.field4225 = 0;
        class197.field3483 = 0;
        class203.field3631 = 0;
        class223.field4165 = 0;
        class190.field3274 = 0;
        class102.field1869 = 0;
        class82.field1600 = 0;
        class188.field3244 = 0;
        class74.field1428 = 0;
        class5.field68 = 0;
        class225.field4236 = 0;
        class122.field2158 = 0;
        class120.field2126 = 0;
        class75.field1442 = 0;
        class180.field3120 = 0;
        class162.field2807 = 0;
        class22.field368 = 0;
        class78.field1508 = 0;
        class49.field904 = 0;
        class120.field2136 = 0;
        class82.field1586 = 0;
        class32.field563 = 0;
        class188.field3250 = 0;
        class86.field1656 = 0;
        class183.field3192 = 0;
        class44.field850 = 0;
        class157.field2736 = 0;
        class19.field328 = 0;
        class111.field2004 = 0;
        class188.field3247 = 0;
        class88.field1672 = 0;
        class57.field1065 = 0;
        class226.field4240 = 0;
        class45.field856 = 0;
        class61.field1134 = 0;
        class66.field1232 = 0;
        class42.field786 = 0;
        class53.field957 = 0;
        class90.field1699 = 0;
        class44.field812 = 0;
        class36.field646 = 0;
        class59.field1100 = 0;
        class215.field3900 = 0;
        class67.field1265 = 0;
        client.field598 = 0;
        class20.field350 = 0;
        class44.field813 = 0;
        class119.field2118 = 0;
        class5.field70 = 0;
        class221.field4002 = 0;
        class66.field1207 = 0;
        class79.field1529 = 0;
        class223.field4062 = 0;
        class225.field4239 = 0;
        class108.field1976 = 0;
        class92.field1710 = 0;
        class135.field2408 = 0;
        class174.field3025 = 0;
        class150.field2617 = 0;
        class19.field316 = 0;
        class235.field4366 = 0;
        class194.field3396 = 0;
        class196.field3475 = 0;
        class79.field1516 = 0;
        class193.field3386 = 0;
        class150.field2612 = 0;
        class175.field3035 = 0;
        class15.field296 = 0;
        class218.field3953 = 0;
        class225.field4208 = 0;
        class1.field2 = 0;
        class152.field2644 = 0;
        class215.field3905 = 0;
        class28.field495 = 0;
        class147.field2591 = 0;
        class66.field1236 = 0;
        class66.field1226 = 0;
        class228.field4286 = 0;
        class77.field1496 = 0;
        class190.field3275 = 0;
        class62.field1163 = 0;
        client.field592 = 0;
        class172.field2991 = 0;
        class139.field2473 = 0;
        class66.field1241 = 0;
        class66.field1228 = 0;
        class147.field2585 = 0;
        class201.field3573 = 0;
        class103.field1877 = 0;
        class68.field1317 = 0;
        class181.field3160 = 0;
        class199.field3514 = 0;
        class211.field3766 = 0;
        class154.field2685 = 0;
        class55.field1002 = 0;
        class66.field1208 = 0;
        class220.field3992 = 0;
        class81.field1577 = 0;
        class36.field641 = 0;
        class23.field388 = 0;
        class96.field1781 = 0;
        class168.field2875 = 0;
        class173.field3012 = 0;
        class70.field1331 = 0;
        class7.field140 = 0;
        class39.field707 = 0;
        class15.field275 = 0;
        class190.field3286 = 0;
        class170.field2954 = 0;
        class147.field2606 = 0;
        class49.field909 = 0;
        class238.field4407 = 0;
        class193.field3380 = 0;
        class67.field1266 = 0;
        class108.field1968 = 0;
        class40.field752 = 0;
        class44.field831 = 0;
        class137.field2451 = 0;
        class191.field3304 = 0;
        class66.field1239 = 0;
        class239.field4417 = 0;
        class41.field768 = 0;
        class133.field2383 = 0;
        class231.field4327 = 0;
        class61.field1140 = 0;
        class192.field3312 = 0;
        class44.field811 = 0;
        class15.field282 = 0;
        class201.field3552 = 0;
        class13.field239 = 0;
        class123.field2186 = 0;
        class153.field2653 = 0;
        class222.field4016 = 0;
        class89.field1696 = 0;
        class207.field3713 = 0;
        class30.field528 = 0;
        class35.field625 = 0;
        class67.field1280 = 0;
        class66.field1240 = 0;
        class59.field1104 = 0;
        class2.field32 = 0;
        class153.field2671 = 0;
        class215.field3911 = 0;
        class70.field1328 = 0;
        class202.field3585 = 0;
        class88.field1685 = 0;
        class235.field4368 = 0;
        class8.field185 = 0;
        class224.field4182 = 0;
        class54.field982 = 0;
        class192.field3361 = 0;
        class202.field3613 = 0;
        class208.field3731 = 0;
        class143.field2534 = 0;
        class202.field3591 = 0;
        class37.field660 = 0;
        class202.field3582 = 0;
        class180.field3123 = 0;
        class192.field3309 = 0;
        class80.field1550 = 0;
        class215.field3914 = 0;
        field187 = 0;
        class66.field1256 = 0;
        class22.field371 = 0;
        class66.field1244 = 0;
        class139.field2496 = 0;
        class15.field289 = 0;
        class193.field3379 = 0;
        class98.field1810 = 0;
        class75.field1434 = 0;
        class57.field1056 = 0;
        class192.field3316 = 0;
        class153.field2673 = 0;
        class123.field2185 = 0;
        class165.field2835 = 0;
        class62.field1164 = 0;
        class40.field767 = 0;
        class2.field15 = 0;
        class20.field337 = 0;
        field195 = 0;
        class145.field2554 = 0;
        class54.field968 = 0;
        class33.field589 = 0;
        class94.field1754 = 0;
        class66.field1258 = 0;
        class216.field3942 = 0;
        class70.field1336 = 0;
        class188.field3253 = 0;
        class147.field2588 = 0;
        class226.field4246 = 0;
        class2.field28 = 0;
        class5.field64 = 0;
        class66.field1248 = 0;
        class168.field2899 = 0;
        class235.field4376 = 0;
        class55.field1004 = 0;
        class15.field290 = 0;
        class157.field2727 = 0;
        class60.field1129 = 0;
        class62.field1157 = 0;
        class24.field391 = 0;
        class1.field6 = 0;
        class53.field964 = 0;
        class54.field998 = 0;
        class227.field4261 = 0;
        class2.field20 = 0;
        class42.field782 = 0;
        class190.field3290 = 0;
        class115.field2054 = 0;
        class120.field2140 = 0;
        class30.field530 = 0;
        class33.field570 = 0;
        class192.field3364 = 0;
        class3.field39 = 0;
        class175.field3032 = 0;
        class7.field148 = 0;
        class168.field2898 = 0;
        class62.field1165 = 0;
        class180.field3111 = 0;
        class88.field1676 = 0;
        class211.field3789 = 0;
        class226.field4256 = 0;
        class168.field2877 = 0;
        class211.field3786 = 0;
        class84.field1629 = 0;
        class73.field1387 = 0;
        class145.field2555 = 0;
        class105.field1916 = 0;
        class92.field1717 = 0;
        class194.field3414 = 0;
        class82.field1591 = 0;
        class129.field2289 = 0;
        class66.field1221 = 0;
        class204.field3650 = 0;
        class66.field1255 = 0;
        class44.field790 = 0;
        class27.field479 = 0;
        class211.field3781 = 0;
        class48.field881 = 0;
        class223.field4124 = 0;
        class94.field1758 = 0;
        class44.field808 = 0;
        class5.field63 = 0;
        class71.field1347 = 0;
        class67.field1269 = 0;
        class151.field2629 = 0;
        class208.field3732 = 0;
        class182.field3176 = 0;
        class215.field3899 = 0;
        class123.field2179 = 0;
        class66.field1206 = 0;
        class13.field246 = 0;
        class162.field2808 = 0;
        class178.field3062 = 0;
        class39.field715 = 0;
        class153.field2663 = 0;
        class97.field1793 = 0;
        class103.field1873 = 0;
        class211.field3794 = 0;
        class122.field2170 = 0;
        class67.field1274 = 0;
        class190.field3282 = 0;
        class162.field2801 = 0;
        class44.field803 = 0;
        class135.field2418 = 0;
        class214.field3887 = 0;
        class49.field919 = 0;
        class2.field17 = 0;
        class44.field841 = 0;
        class42.field784 = 0;
        class44.field834 = 0;
        class71.field1352 = 0;
        class66.field1224 = 0;
        class197.field3492 = 0;
        class192.field3332 = 0;
        class169.field2915 = 0;
        class170.field2942 = 0;
        class3.field42 = 0;
        field191 = 0;
        class106.field1950 = 0;
        class44.field826 = 0;
        class13.field259 = 0;
        class5.field71 = 0;
        class236.field4381 = 0;
        class165.field2833 = 0;
        class94.field1738 = 0;
        class48.field901 = 0;
        class66.field1211 = 0;
        class168.field2904 = 0;
        class223.field4156 = 0;
        class17.field304 = 0;
        class49.field917 = 0;
        class83.field1620 = 0;
        class36.field633 = 0;
        class53.field960 = 0;
        class230.field4308 = 0;
        class36.field645 = 0;
        class61.field1133 = 0;
        class236.field4380 = 0;
        class129.field2293 = 0;
        class189.field3258 = 0;
        class54.field967 = 0;
        class94.field1750 = 0;
        class221.field4004 = 0;
        class220.field3985 = 0;
        class95.field1766 = 0;
        class154.field2678 = 0;
        class49.field911 = 0;
        class181.field3149 = 0;
        class214.field3885 = 0;
        class117.field2097 = 0;
        class15.field288 = 0;
        class215.field3894 = 0;
        class35.field629 = 0;
        class58.field1084 = 0;
        client.field601 = 0;
        class24.field413 = 0;
        class41.field770 = 0;
        class38.field673 = 0;
        class131.field2344 = 0;
        class40.field763 = 0;
        class121.field2149 = 0;
        class13.field238 = 0;
        class192.field3355 = 0;
        class214.field3835 = 0;
        class220.field3976 = 0;
        class204.field3661 = 0;
        class112.field2014 = 0;
        class103.field1884 = 0;
        class15.field286 = 0;
        class192.field3306 = 0;
        class24.field417 = 0;
        class152.field2639 = 0;
        class7.field136 = 0;
        class212.field3808 = 0;
        client.field602 = 0;
        field193 = 0;
        class211.field3784 = 0;
        field189 = 0;
        class24.field394 = 0;
        class181.field3159 = 0;
        class102.field1870 = 0;
        class78.field1498 = 0;
        class194.field3412 = 0;
        class68.field1303 = 0;
        class139.field2495 = 0;
        class44.field840 = 0;
        class190.field3280 = 0;
        class44.field830 = 0;
        class90.field1701 = 0;
        class168.field2882 = 0;
        class60.field1120 = 0;
        class192.field3360 = 0;
        class74.field1423 = 0;
        class153.field2667 = 0;
        class60.field1117 = 0;
        class194.field3394 = 0;
        class188.field3242 = 0;
        class67.field1275 = 0;
        class66.field1249 = 0;
        class54.field980 = 0;
        class136.field2437 = 0;
        class97.field1794 = 0;
        class197.field3491 = 0;
        class170.field2934 = 0;
        class153.field2662 = 0;
        class203.field3634 = 0;
        class68.field1286 = 0;
        class169.field2922 = 0;
        class214.field3865 = 0;
        class64.field1191 = 0;
        class39.field709 = 0;
        class24.field392 = 0;
        class30.field538 = 0;
        class79.field1517 = 0;
        class36.field644 = 0;
        class236.field4385 = 0;
        class137.field2462 = 0;
        class44.field829 = 0;
        class188.field3238 = 0;
        class165.field2842 = 0;
        class192.field3342 = 0;
        class156.field2722 = 0;
        class143.field2544 = 0;
        class165.field2844 = 0;
        class215.field3904 = 0;
        class215.field3898 = 0;
        class123.field2177 = 0;
        class199.field3515 = 0;
        class40.field766 = 0;
        class190.field3283 = 0;
        class44.field843 = 0;
        class64.field1186 = 0;
        class1.field5 = 0;
        class223.field4161 = 0;
        class83.field1618 = 0;
        class211.field3769 = 0;
        class220.field3993 = 0;
        class118.field2101 = 0;
        class140.field2514 = 0;
        class123.field2191 = 0;
        class63.field1177 = 0;
        class66.field1245 = 0;
        class66.field1194 = 0;
        class92.field1719 = 0;
        class97.field1788 = 0;
        class211.field3780 = 0;
        class66.field1202 = 0;
        class131.field2352 = 0;
        class58.field1080 = 0;
        class101.field1842 = 0;
        class66.field1254 = 0;
        class157.field2740 = 0;
        class238.field4406 = 0;
        class88.method646(true);
        class163.field2822 = -1;
        class172.field2995 = 0;
        class202.field3622 = -1;
        class200.field3542.field1195 = 0;
        class42.field779 = -1;
        class218.field3946 = 0;
        class53.field946 = 0;
        class8.field157 = -1;
        class218.field3957.field1195 = 0;
        for (int var1 = 0; var1 < class61.field1132.length; var1++) {
            class61.field1132[var1] = null;
        }
        class58.field1086 = false;
        class179.field3071 = 0;
        class154.method994(0, -1);
        for (int var2 = 0; var2 < 100; var2++) {
            class115.field2056[var2] = null;
        }
        class139.field2485 = 0;
        class218.field3959 = (int) (Math.random() * 30.0D) - 20;
        class203.field3636 = -1;
        class38.field668 = 0;
        class73.field1401 = 0;
        class129.field2303 = (int) (Math.random() * 120.0D) - 60;
        class73.field1384 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class202.field3614 = false;
        class198.field3511 = 0;
        class115.field2057 = 0;
        class224.field4178 = (int) (Math.random() * 100.0D) - 50;
        class158.field2755 = 0;
        class31.field550 = (int) (Math.random() * 80.0D) - 40;
        class90.field1702 = 0;
        class32.field553 = (int) (Math.random() * 110.0D) - 55;
        class39.field719 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class122.field2168[var3] = null;
            class128.field2276[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class170.field2960[var4] = null;
        }
        class96.field1774 = class122.field2168[2047] = new class24();
        class227.field4266.method1193((byte) 26);
        class234.field4352.method1193((byte) 26);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var15 = 0; var15 < 104; var15++) {
                    client.field599[var5][var14][var15] = null;
                }
            }
        }
        class210.field3754 = new class190();
        class218.field3955 = 0;
        class117.field2085 = 0;
        for (int var6 = 0; var6 < class93.field1728; var6++) {
            class9 var13 = class55.method393(0, var6);
            if (var13 != null && var13.field192 == 0) {
                class10.field201[var6] = 0;
                class136.field2435[var6] = 0;
            }
        }
        for (int var7 = 0; var7 < class27.field488.length; var7++) {
            class27.field488[var7] = -1;
        }
        if (class201.field3575 != -1) {
            class58.method442(class201.field3575, 1);
        }
        for (class104 var8 = (class104) class129.field2294.method832(112); var8 != null; var8 = (class104) class129.field2294.method829((byte) 101)) {
            class73.method570(var8, -15535, true);
        }
        class201.field3575 = -1;
        class129.field2294 = new class120(8);
        class10.field215 = null;
        class58.field1086 = false;
        class179.field3071 = 0;
        class76.field1469.method244((byte) 126, null, new int[5], false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            class14.field264[var9] = null;
            class90.field1708[var9] = false;
        }
        class10.method94((byte) 122);
        class179.field3100 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            class68.field1289[var10] = true;
        }
        class28.field496 = null;
        class151.field2634 = 0;
        class19.field317 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            class84.field1632[var11] = new class194();
        }
        for (int var12 = 0; var12 < 25; var12++) {
            class136.field2432[var12] = 0;
            class33.field584[var12] = 0;
            class156.field2716[var12] = 0;
        }
        class219.field3972 = true;
        class119.field2122 = class95.field1769;
        class3.field43 = class190.field3281 = class152.field2647 = new short[256];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method92(boolean arg0, String arg1) throws ClassNotFoundException {
        field187++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0) {
                method90(-103, -101);
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }
}

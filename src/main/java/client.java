import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class125 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lqe;")
    public static class168 field529 = class66.method448("Mem:", -116);

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lqe;")
    public static class168 field533 = class66.method448(":chalreq:", -119);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lqe;")
    public static class168 field541 = class66.method448("Texturen geladen)3", 78);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field534 = 0;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field538 = 0;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Loe;")
    public static class256 field535;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lgd;")
    public static class65[] field546;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmj;IIIIIII)V")
    public static final void method263(class129[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class129 var9 = arg0[var8];
            if (var9 != null && var9.field2276 == arg1 && (!var9.field2258 || var9.field2230 == 0 || var9.field2215 || method266(var9) != 0 || class91.field1430 == var9 || var9.field2136 == 1338) && (!var9.field2258 || !method264(var9))) {
                int var10 = var9.field2139 + arg6;
                int var11 = var9.field2231 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2230 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2175 + var10;
                    int var17 = var9.field2210 + var11;
                    if (var9.field2230 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class240.field4106 == var9) {
                    class51.field697 = true;
                    class84.field1285 = var10;
                    class123.field2033 = var11;
                }
                if (!var9.field2258 || var12 < var14 && var13 < var15) {
                    if (var9.field2230 == 0) {
                        if (!var9.field2258 && method264(var9) && class129.field2217 != var9) {
                            continue;
                        }
                        if (var9.field2196 && class146.field2550 >= var12 && class161.field2765 >= var13 && class146.field2550 < var14 && class161.field2765 < var15) {
                            for (class147 var18 = (class147) class54.field744.method315(-31594); var18 != null; var18 = (class147) class54.field744.method312(1012)) {
                                if (var18.field2560) {
                                    var18.method1234(17216);
                                }
                            }
                            if (class155.field2706 == 0) {
                                class240.field4106 = null;
                                class91.field1430 = null;
                            }
                            class208.field3617 = false;
                        }
                    }
                    if (var9.field2258) {
                        boolean var19;
                        if (class146.field2550 >= var12 && class161.field2765 >= var13 && class146.field2550 < var14 && class161.field2765 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class89.field1384 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class200.field3454 == 1 && class198.field3422 >= var12 && class9.field97 >= var13 && class198.field3422 < var14 && class9.field97 < var15) {
                            var21 = true;
                        }
                        if (class68.field952 > 0 && var9.field2122 != null) {
                            for (int var22 = 0; var22 < var9.field2122.length; var22++) {
                                for (int var23 = 0; var23 < class68.field952; var23++) {
                                    int var24 = var9.field2122[var22] & 0xFF;
                                    if (class139.field2465[var23] == var24) {
                                        class42.method283(var22 + 1, var9.field2222, class222.field3816, -1, true);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class191.method1236(class198.field3422 - var10, -23005, class9.field97 - var11, var9);
                        }
                        if (class240.field4106 != null && class240.field4106 != var9 && var19 && class33.method211((byte) 126, method266(var9))) {
                            class38.field520 = var9;
                        }
                        if (class91.field1430 == var9) {
                            class254.field4388 = true;
                            class68.field959 = var10;
                            class169.field2949 = var11;
                        }
                        if (var9.field2215 || var9.field2136 != 0) {
                            if (var19 && class46.field612 != 0 && var9.field2226 != null) {
                                class147 var25 = new class147();
                                var25.field2560 = true;
                                var25.field2552 = var9;
                                var25.field2557 = class46.field612;
                                var25.field2566 = var9.field2226;
                                class54.field744.method311((byte) 16, var25);
                            }
                            if (class240.field4106 != null || class9.field109 != null || class169.field2956 || var9.field2136 != 1400 && class208.field3617) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2136 != 0) {
                                if (var9.field2136 == 1337) {
                                    class254.field4385 = var9;
                                    class65.method443(var9, 0);
                                    continue;
                                }
                                if (var9.field2136 == 1338) {
                                    if (var21) {
                                        class104.method694(class9.field97 - var11, -38, class198.field3422 - var10, var9);
                                    }
                                    continue;
                                }
                                if (var9.field2136 == 1400) {
                                    class122.field2021 = var9;
                                    if (var21) {
                                        if (class190.field3306[82] && class29.field356 > 0) {
                                            int var26 = (int) ((double) (class198.field3422 - var10 - var9.field2175 / 2) * 2.0D / class167.field2852) + class232.field3935 + class151.field2629;
                                            int var27 = class162.field2781 + class42.field552 - (int) ((double) (class9.field97 - var11 - var9.field2210 / 2) * 2.0D / class167.field2852) - class91.field1423;
                                            class168 var28 = class50.method347(2, new class168[] { class165.field2820, class128.method867((byte) 98, var26 >> 6), class92.field1451, class128.method867((byte) 102, var27 >> 6), class92.field1451, class128.method867((byte) 110, var26 & 0x3F), class92.field1451, class128.method867((byte) 103, var27 & 0x3F) });
                                            var28.method1094(-31400);
                                            class2.method7(35, var28);
                                            class176.method1164(127);
                                            continue;
                                        }
                                        class208.field3617 = true;
                                        class71.field1075 = class146.field2550;
                                        class46.field599 = class161.field2765;
                                        class192.field3345 = class151.field2629;
                                        class161.field2763 = class91.field1423;
                                        continue;
                                    }
                                    if (var20 && class208.field3617) {
                                        class174.method1157((int) ((double) (class71.field1075 - class146.field2550) * 2.0D / class194.field3383) + class192.field3345, (byte) -43);
                                        class73.method495(-23975, (int) ((double) (class46.field599 - class161.field2765) * 2.0D / class194.field3383) + class161.field2763);
                                        continue;
                                    }
                                    class208.field3617 = false;
                                    continue;
                                }
                                if (var9.field2136 == 1401) {
                                    if (var20) {
                                        class96.method633(var9.field2175, (byte) 123, class161.field2765 - var11, class146.field2550 - var10, var9.field2210);
                                    }
                                    continue;
                                }
                                if (var9.field2136 == 1402) {
                                    class65.method443(var9, 0);
                                    continue;
                                }
                                if (var9.field2136 == 1404) {
                                    class65.method443(var9, 0);
                                    continue;
                                }
                            }
                            if (!var9.field2189 && var21) {
                                var9.field2189 = true;
                                if (var9.field2155 != null) {
                                    class147 var29 = new class147();
                                    var29.field2560 = true;
                                    var29.field2552 = var9;
                                    var29.field2553 = class198.field3422 - var10;
                                    var29.field2557 = class9.field97 - var11;
                                    var29.field2566 = var9.field2155;
                                    class54.field744.method311((byte) 16, var29);
                                }
                            }
                            if (var9.field2189 && var20 && var9.field2274 != null) {
                                class147 var30 = new class147();
                                var30.field2560 = true;
                                var30.field2552 = var9;
                                var30.field2553 = class146.field2550 - var10;
                                var30.field2557 = class161.field2765 - var11;
                                var30.field2566 = var9.field2274;
                                class54.field744.method311((byte) 16, var30);
                            }
                            if (var9.field2189 && !var20) {
                                var9.field2189 = false;
                                if (var9.field2145 != null) {
                                    class147 var31 = new class147();
                                    var31.field2560 = true;
                                    var31.field2552 = var9;
                                    var31.field2553 = class146.field2550 - var10;
                                    var31.field2557 = class161.field2765 - var11;
                                    var31.field2566 = var9.field2145;
                                    class118.field1937.method311((byte) 16, var31);
                                }
                            }
                            if (var20 && var9.field2290 != null) {
                                class147 var32 = new class147();
                                var32.field2560 = true;
                                var32.field2552 = var9;
                                var32.field2553 = class146.field2550 - var10;
                                var32.field2557 = class161.field2765 - var11;
                                var32.field2566 = var9.field2290;
                                class54.field744.method311((byte) 16, var32);
                            }
                            if (!var9.field2194 && var19) {
                                var9.field2194 = true;
                                if (var9.field2160 != null) {
                                    class147 var33 = new class147();
                                    var33.field2560 = true;
                                    var33.field2552 = var9;
                                    var33.field2553 = class146.field2550 - var10;
                                    var33.field2557 = class161.field2765 - var11;
                                    var33.field2566 = var9.field2160;
                                    class54.field744.method311((byte) 16, var33);
                                }
                            }
                            if (var9.field2194 && var19 && var9.field2242 != null) {
                                class147 var34 = new class147();
                                var34.field2560 = true;
                                var34.field2552 = var9;
                                var34.field2553 = class146.field2550 - var10;
                                var34.field2557 = class161.field2765 - var11;
                                var34.field2566 = var9.field2242;
                                class54.field744.method311((byte) 16, var34);
                            }
                            if (var9.field2194 && !var19) {
                                var9.field2194 = false;
                                if (var9.field2131 != null) {
                                    class147 var35 = new class147();
                                    var35.field2560 = true;
                                    var35.field2552 = var9;
                                    var35.field2553 = class146.field2550 - var10;
                                    var35.field2557 = class161.field2765 - var11;
                                    var35.field2566 = var9.field2131;
                                    class118.field1937.method311((byte) 16, var35);
                                }
                            }
                            if (var9.field2279 != null) {
                                class147 var36 = new class147();
                                var36.field2552 = var9;
                                var36.field2566 = var9.field2279;
                                class86.field1335.method311((byte) 16, var36);
                            }
                            if (var9.field2247 != null && class221.field3795 > var9.field2269) {
                                if (var9.field2277 == null || class221.field3795 - var9.field2269 > 32) {
                                    class147 var41 = new class147();
                                    var41.field2552 = var9;
                                    var41.field2566 = var9.field2247;
                                    class54.field744.method311((byte) 16, var41);
                                } else {
                                    label543: for (int var37 = var9.field2269; var37 < class221.field3795; var37++) {
                                        int var38 = class157.field2721[var37 & 0x1F];
                                        for (int var39 = 0; var39 < var9.field2277.length; var39++) {
                                            if (var9.field2277[var39] == var38) {
                                                class147 var40 = new class147();
                                                var40.field2552 = var9;
                                                var40.field2566 = var9.field2247;
                                                class54.field744.method311((byte) 16, var40);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field2269 = class221.field3795;
                            }
                            if (var9.field2197 != null && class91.field1427 > var9.field2214) {
                                if (var9.field2209 == null || class91.field1427 - var9.field2214 > 32) {
                                    class147 var46 = new class147();
                                    var46.field2552 = var9;
                                    var46.field2566 = var9.field2197;
                                    class54.field744.method311((byte) 16, var46);
                                } else {
                                    label519: for (int var42 = var9.field2214; var42 < class91.field1427; var42++) {
                                        int var43 = class77.field1147[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2209.length; var44++) {
                                            if (var9.field2209[var44] == var43) {
                                                class147 var45 = new class147();
                                                var45.field2552 = var9;
                                                var45.field2566 = var9.field2197;
                                                class54.field744.method311((byte) 16, var45);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field2214 = class91.field1427;
                            }
                            if (var9.field2212 != null && class79.field1191 > var9.field2176) {
                                if (var9.field2236 == null || class79.field1191 - var9.field2176 > 32) {
                                    class147 var51 = new class147();
                                    var51.field2552 = var9;
                                    var51.field2566 = var9.field2212;
                                    class54.field744.method311((byte) 16, var51);
                                } else {
                                    label495: for (int var47 = var9.field2176; var47 < class79.field1191; var47++) {
                                        int var48 = class109.field1750[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2236.length; var49++) {
                                            if (var9.field2236[var49] == var48) {
                                                class147 var50 = new class147();
                                                var50.field2552 = var9;
                                                var50.field2566 = var9.field2212;
                                                class54.field744.method311((byte) 16, var50);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field2176 = class79.field1191;
                            }
                            if (var9.field2129 != null && class101.field1609 > var9.field2234) {
                                if (var9.field2255 == null || class101.field1609 - var9.field2234 > 32) {
                                    class147 var56 = new class147();
                                    var56.field2552 = var9;
                                    var56.field2566 = var9.field2129;
                                    class54.field744.method311((byte) 16, var56);
                                } else {
                                    label471: for (int var52 = var9.field2234; var52 < class101.field1609; var52++) {
                                        int var53 = class251.field4346[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2255.length; var54++) {
                                            if (var9.field2255[var54] == var53) {
                                                class147 var55 = new class147();
                                                var55.field2552 = var9;
                                                var55.field2566 = var9.field2129;
                                                class54.field744.method311((byte) 16, var55);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field2234 = class101.field1609;
                            }
                            if (var9.field2218 != null && class194.field3389 > var9.field2232) {
                                if (var9.field2251 == null || class194.field3389 - var9.field2232 > 32) {
                                    class147 var61 = new class147();
                                    var61.field2552 = var9;
                                    var61.field2566 = var9.field2218;
                                    class54.field744.method311((byte) 16, var61);
                                } else {
                                    label447: for (int var57 = var9.field2232; var57 < class194.field3389; var57++) {
                                        int var58 = class202.field3489[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2251.length; var59++) {
                                            if (var9.field2251[var59] == var58) {
                                                class147 var60 = new class147();
                                                var60.field2552 = var9;
                                                var60.field2566 = var9.field2218;
                                                class54.field744.method311((byte) 16, var60);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field2232 = class194.field3389;
                            }
                            if (class233.field3952 > var9.field2220 && var9.field2202 != null) {
                                class147 var62 = new class147();
                                var62.field2552 = var9;
                                var62.field2566 = var9.field2202;
                                class54.field744.method311((byte) 16, var62);
                            }
                            if (class103.field1667 > var9.field2220 && var9.field2143 != null) {
                                class147 var63 = new class147();
                                var63.field2552 = var9;
                                var63.field2566 = var9.field2143;
                                class54.field744.method311((byte) 16, var63);
                            }
                            if (class32.field396 > var9.field2220 && var9.field2134 != null) {
                                class147 var64 = new class147();
                                var64.field2552 = var9;
                                var64.field2566 = var9.field2134;
                                class54.field744.method311((byte) 16, var64);
                            }
                            if (class96.field1522 > var9.field2220 && var9.field2267 != null) {
                                class147 var65 = new class147();
                                var65.field2552 = var9;
                                var65.field2566 = var9.field2267;
                                class54.field744.method311((byte) 16, var65);
                            }
                            if (class202.field3482 > var9.field2220 && var9.field2171 != null) {
                                class147 var66 = new class147();
                                var66.field2552 = var9;
                                var66.field2566 = var9.field2171;
                                class54.field744.method311((byte) 16, var66);
                            }
                            var9.field2220 = class205.field3566;
                            if (var9.field2204 != null) {
                                for (int var67 = 0; var67 < class68.field952; var67++) {
                                    class147 var68 = new class147();
                                    var68.field2552 = var9;
                                    var68.field2568 = class139.field2465[var67];
                                    var68.field2572 = class27.field332[var67];
                                    var68.field2566 = var9.field2204;
                                    class54.field744.method311((byte) 16, var68);
                                }
                            }
                            if (class228.field3877 && var9.field2211 != null) {
                                class147 var69 = new class147();
                                var69.field2552 = var9;
                                var69.field2566 = var9.field2211;
                                class54.field744.method311((byte) 16, var69);
                            }
                        }
                    }
                    if (!var9.field2258 && class240.field4106 == null && class9.field109 == null && !class169.field2956) {
                        if ((var9.field2265 >= 0 || var9.field2191 != 0) && class146.field2550 >= var12 && class161.field2765 >= var13 && class146.field2550 < var14 && class161.field2765 < var15) {
                            if (var9.field2265 >= 0) {
                                class129.field2217 = arg0[var9.field2265];
                            } else {
                                class129.field2217 = var9;
                            }
                        }
                        if (var9.field2230 == 8 && class146.field2550 >= var12 && class161.field2765 >= var13 && class146.field2550 < var14 && class161.field2765 < var15) {
                            class98.field1550 = var9;
                        }
                        if (var9.field2291 > var9.field2210) {
                            class33.method212(var9.field2175 + var10, var11, var9.field2210, class161.field2765, class146.field2550, var9.field2291, false, var9);
                        }
                    }
                    if (var9.field2230 == 0) {
                        method263(arg0, var9.field2222, var12, var13, var14, var15, var10 - var9.field2203, var11 - var9.field2224);
                        if (var9.field2263 != null) {
                            method263(var9.field2263, var9.field2222, var12, var13, var14, var15, var10 - var9.field2203, var11 - var9.field2224);
                        }
                        class114 var70 = (class114) class176.field3079.method1527((long) var9.field2222, (byte) -126);
                        if (var70 != null) {
                            class193.method1251(var14, var70.field1853, var15, var11, 116, var10, var13, var12);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmj;)Z")
    public static final boolean method264(class129 arg0) {
        if (class125.field2051) {
            if (method266(arg0) != 0) {
                return false;
            }
            if (arg0.field2230 == 0) {
                return false;
            }
        }
        return arg0.field2289;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method265(int arg0) {
        field542++;
        method269(-23295);
        class168.method1114(arg0 ^ 0xFFFF84BB);
        class125.method855(arg0 + 93);
        class104.method691(arg0 + 18683);
        class3.method19(true);
        class205.method1331((byte) -38);
        class246.method1615((byte) -127);
        class112.method760((byte) 123);
        class251.method1655((byte) 125);
        class207.method1342(arg0 ^ 0xFFFFFF96);
        class64.method436(-29598);
        class206.method1337((byte) 78);
        class222.method1455((byte) 102);
        class101.method662(arg0 ^ 0x3C9);
        class47.method324((byte) -20);
        class52.method365(2);
        class129.method869(4121);
        class121.method826((byte) -109);
        class236.method1529(false);
        class198.method1270(0);
        class54.method381((byte) -55);
        class119.method813(-99);
        class65.method445(arg0 ^ 0x18);
        class202.method1293((byte) 46);
        class173.method1139(arg0 ^ 0xCE);
        class92.method611(1);
        class139.method952((byte) 82);
        class237.method1544((byte) 42);
        class18.method95(arg0 - 24);
        class177.method1167((byte) -36);
        class23.method119(-28387);
        class180.method1183((byte) 55);
        class114.method787(-18789);
        class190.method1228((byte) 109);
        class78.method524((byte) -28);
        class108.method708(-121);
        class2.method13(-104);
        class93.method615(false);
        class7.method31(true);
        class14.method55((byte) -117);
        class142.method974((byte) -6);
        class130.method883(-116);
        class70.method477((byte) 122);
        class62.method417(true);
        class209.method1355(2);
        class212.method1367(arg0 ^ 0x5964);
        class256.method1686((byte) -109);
        class232.method1500(arg0 ^ arg0);
        class218.method1436();
        class242.method1584(-8);
        class37.method237();
        class234.method1510(arg0 ^ 0x43BA);
        class204.method1325(-60);
        class59.method406((byte) 108);
        class187.method1218(true);
        class30.method201((byte) 47);
        class38.method256(true);
        class43.method285(false);
        class175.method1158(-1);
        class44.method292(arg0 ^ 0x44);
        class158.method1035(arg0 - 20);
        class136.method920();
        class133.method897(false);
        class169.method1123(true);
        class77.method516(arg0 ^ 0x98);
        class13.method48(-27131);
        class162.method1053((byte) -102);
        class199.method1276((byte) 115);
        class17.method86(-14231);
        class36.method222((byte) 114);
        class146.method984((byte) 35);
        class141.method967();
        class57.method399((byte) -46);
        class102.method683(-6514);
        class248.method1630();
        class216.method1398();
        class255.method1679(0);
        class79.method527(0);
        class228.method1472(-8613);
        class90.method593(32560);
        class192.method1245(arg0 + 99);
        class171.method1132((byte) 126);
        class74.method501(1);
        class67.method455();
        class247.method1620(-25096);
        class66.method447(arg0 ^ 0xFFFFFFAF);
        class179.method1182((byte) 92);
        class186.method1214(95);
        class107.method703(-11818);
        class49.method334();
        class80.method529(arg0 - 146);
        class244.method1601(0);
        class148.method990(arg0 ^ 0x19);
        class29.method190(-19332);
        class95.method631((byte) 111);
        class117.method799(arg0 + 176);
        class123.method832(-126);
        class91.method597((byte) 108);
        class134.method904(arg0 - 13176);
        class176.method1162(7690);
        class116.method797(-6091);
        class213.method1376((byte) -97);
        class110.method712((byte) 77);
        class127.method861(true);
        class87.method580(false);
        class194.method1257((byte) -29);
        class230.method1488((byte) -92);
        class196.method1261(11677);
        class252.method1663(-1);
        class249.method1645((byte) -6);
        class81.method539(80);
        class35.method218(true);
        class33.method214((byte) 68);
        class34.method216((byte) 68);
        class147.method988(false);
        class60.method411(arg0 + 52);
        class106.method699(-1);
        class56.method390(-2);
        class245.method1610((byte) -128);
        class50.method345(76);
        class170.method1128((byte) -84);
        class185.method1211(-1);
        class227.method1469(arg0 - 24);
        class182.method1203(20);
        class97.method637((byte) -8);
        class48.method325();
        class128.method866(1);
        class132.method892(64);
        class229.method1474(-21957);
        class85.method566(-115);
        class154.method1017((byte) 106);
        class172.method1137((byte) 64);
        class167.method1066(-125);
        class178.method1174(11200);
        class86.method570((byte) -108);
        class253.method1669((byte) 84);
        class254.method1676(-116);
        class96.method632((byte) -65);
        class76.method515(-122);
        class120.method822((byte) 126);
        class166.method1065((byte) -51);
        class61.method414(true);
        class145.method980(true);
        class84.method553(81);
        class124.method843(95);
        class103.method689(-84);
        class219.method1451();
        class113.method780();
        class226.method1468();
        class201.method1284();
        class68.method463(-115);
        class221.method1454(0);
        class137.method943(16711935);
        class19.method99((byte) -69);
        class235.method1517();
        class215.method1388();
        class135.method908(false);
        class115.method790(125);
        class118.method808(-722533812);
        class31.method204((byte) 93);
        class82.method543((byte) -83);
        class191.method1239(-83);
        class27.method184(115);
        class143.method976(6);
        class189.method1222((byte) -128);
        class211.method1365(arg0 ^ 0x1018);
        class32.method206(arg0 ^ 0xFE8);
        class55.method385((byte) 122);
        class233.method1507((byte) -12);
        class26.method171(0);
        class152.method1007(-42);
        class69.method468(-5);
        class109.method710((byte) 61);
        class122.method831(-3832);
        class208.method1348((byte) 118);
        class46.method306((byte) -103);
        class8.method33(0);
        class138.method944((byte) -25);
        class100.method656((byte) -76);
        class155.method1020((byte) 111);
        class94.method620(arg0 ^ 0x56);
        class131.method891(arg0 - 18206);
        class83.method551(-108);
        class241.method1573(106);
        class214.method1379(false);
        class193.method1250(1758258692);
        class243.method1600(0);
        class9.method35((byte) -127);
        class1.method6(0);
        class257.method1714(97);
        class71.method489((byte) -75);
        class16.method81(-32522);
        class105.method696(-19065);
        class58.method405(0);
        class98.method648(54);
        class150.method999((byte) -120);
        class99.method650(96);
        class25.method168((byte) 113);
        class163.method1055(0);
        class88.method584(arg0 ^ 0x1A);
        class6.method28((byte) 99);
        class126.method859(-110);
        class223.method1459(false);
        class174.method1155(255);
        class45.method297(arg0 ^ 0x67);
        class200.method1279(arg0 ^ 0x2BD9);
        class51.method357(arg0 - 23);
        class161.method1048((byte) -89);
        class238.method1549((byte) -117);
        class111.method718((byte) 52);
        class159.method1040((byte) 36);
        class197.method1266((byte) -31);
        class157.method1027(arg0 ^ 0x18);
        class165.method1060((byte) 127);
        class21.method109((byte) 107);
        class4.method24(false);
        class149.method996(50);
        class42.method284((byte) -112);
        class240.method1567(false);
        class151.method1004(-1);
        class89.method589((byte) 51);
        class73.method496((byte) -104);
        class153.method1010((byte) 20);
        class63.method420((byte) -13);
        if (class125.field2094) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmj;)I")
    public static final int method266(class129 arg0) {
        class172 var1 = (class172) class70.field1040.method1527(((long) arg0.field2222 << 32) + (long) arg0.field2123, (byte) -87);
        return var1 == null ? arg0.field2133 : var1.field2991;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method267(byte arg0) {
        field536++;
        if (class254.field4403 == 1000) {
            return;
        }
        int var2 = -8 % ((-arg0 - 69) / 56);
        class133.field2326++;
        if (class133.field2326 % 1000 == 1) {
            GregorianCalendar var3 = new GregorianCalendar();
            class149.field2590 = var3.get(11) * 600 + var3.get(12) * 10 + var3.get(13) / 6;
            class120.field1972.setSeed((long) class149.field2590);
        }
        this.method276(-24071);
        class181.method1202(25682);
        class161.method1049((byte) -69);
        class177.method1165(-8886);
        class21.method110((byte) 111);
        class31.method203(true);
        if (class125.field2085 != null) {
            int var4 = class125.field2085.method262((byte) -95);
            class46.field612 = var4;
        }
        if (class254.field4403 == 0) {
            this.method272((byte) -116);
            class47.method317(0);
        } else if (class254.field4403 == 5) {
            this.method272((byte) -116);
            class47.method317(0);
        } else if (class254.field4403 == 10) {
            this.method278((byte) 65);
            class115.method795((byte) 65);
            return;
        } else if (class254.field4403 == 20) {
            this.method278((byte) 65);
            class158.method1039(-111);
        } else if (class254.field4403 == 25) {
            class47.method309((byte) 114);
        } else if (class254.field4403 == 28) {
            class47.method309((byte) 114);
            class115.method795((byte) 65);
        }
        if (class254.field4403 == 30) {
            class205.method1329(126);
        } else if (class254.field4403 == 10) {
            this.method278((byte) 65);
            return;
        } else if (class254.field4403 == 40) {
            class158.method1039(-66);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg9 && arg0 == arg8 && arg2 == arg7 && arg5 == arg6) {
            class198.method1272(arg9, arg0, arg3, arg5, 0, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg9;
            int var12 = arg0 * 3;
            int var13 = arg9 * 3;
            int var14 = arg1 * 3;
            int var15 = arg7 * 3;
            int var16 = arg8 * 3;
            int var17 = arg6 * 3;
            int var18 = var16 + arg5 - arg0 - var17;
            int var19 = var13 + var15 - var14 - var14;
            int var20 = arg2 + var14 - var15 - arg9;
            int var21 = var12 + var17 - var16 - var16;
            int var22 = var14 - var13;
            int var23 = var16 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var25;
                int var29 = var21 * var25;
                int var30 = var20 * var26;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var32 >> 12) + arg0;
                int var34 = (var28 + var31 + var30 >> 12) + arg9;
                class198.method1272(var11, var10, arg3, var33, 0, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg4 < 121) {
            field533 = null;
        }
        field530++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method269(int arg0) {
        field533 = null;
        field546 = null;
        field529 = null;
        field535 = null;
        if (arg0 == -23295) {
            field541 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method270(int arg0) {
        field545++;
        if (class249.field4311 >= 4) {
            this.method852(92, "js5crc");
            class254.field4403 = 1000;
            return;
        }
        if (class249.field4313 >= 4) {
            if (class254.field4403 <= 5) {
                this.method852(-97, "js5io");
                class254.field4403 = 1000;
                return;
            }
            class249.field4313 = 3;
            class179.field3153 = 3000;
        }
        if (class179.field3153-- > 0) {
            return;
        }
        try {
            if (class82.field1240 == 0) {
                class145.field2534 = class205.field3559.method1558(true, class85.field1294, class240.field4111);
                class82.field1240++;
            }
            if (class82.field1240 == 1) {
                if (class145.field2534.field57 == 2) {
                    this.method277((byte) -127, -1);
                    return;
                }
                if (class145.field2534.field57 == 1) {
                    class82.field1240++;
                }
            }
            if (arg0 > 25) {
                if (class82.field1240 == 2) {
                    class79.field1188 = new class251((Socket) class145.field2534.field59, class205.field3559);
                    class112 var2 = new class112(5);
                    var2.method768(15, 7295);
                    var2.method770(501, (byte) -10);
                    class79.field1188.method1650(12398, 0, var2.field1780, 5);
                    class82.field1240++;
                    class240.field4109 = class59.method407(-109);
                }
                if (class82.field1240 == 3) {
                    if (class254.field4403 <= 5 || class79.field1188.method1648(-123) > 0) {
                        int var3 = class79.field1188.method1657(5000);
                        if (var3 != 0) {
                            this.method277((byte) -58, var3);
                            return;
                        }
                        class82.field1240++;
                    } else if (class59.method407(-90) - class240.field4109 > 30000L) {
                        this.method277((byte) -50, -2);
                        return;
                    }
                }
                if (class82.field1240 == 4) {
                    class148.method991(class254.field4403 > 20, (byte) -68, class79.field1188);
                    class79.field1188 = null;
                    class46.field609 = 0;
                    class145.field2534 = null;
                    class82.field1240 = 0;
                }
            }
        } catch (IOException var4) {
            this.method277((byte) -126, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmj;)Lmj;")
    public static final class129 method271(class129 arg0) {
        int var1 = class240.method1568(1303579025, method266(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class257.method1713(arg0.field2276, 127);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field527++;
        if (!this.method850(89)) {
            return;
        }
        class83.field1272 = Integer.parseInt(this.getParameter("worldid"));
        class118.field1922 = Integer.parseInt(this.getParameter("modewhat"));
        class23.field277 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class52.field721 = true;
        } else {
            class52.field721 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class59.field811 = true;
        } else {
            class59.field811 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class197.method1265(255);
            class199.field3438 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class30.field367 = 1;
        } else {
            class30.field367 = 0;
        }
        try {
            class124.field2041 = Integer.parseInt(this.getParameter("js"));
            class46.field604 = Integer.parseInt(this.getParameter("plug"));
            class153.field2661 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var9) {
        }
        class172.field2989 = class13.field117.method1087(this, (byte) 13);
        if (class172.field2989 == null) {
            class172.field2989 = class222.field3816;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6 = var5.getBytes();
            class168 var7 = class119.method812((byte) 72, var6.length, 0, var6);
            boolean var8 = class178.method1173(4501, var7);
        }
        class85.field1294 = this.getCodeBase().getHost();
        this.method857(class118.field1922 + 32, 501, 503, (byte) 92, 765);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method272(byte arg0) {
        field531++;
        if (class165.field2814 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class59.method407(arg0);
            if (class247.field4278 == 0L) {
                class247.field4278 = var4;
            }
            if (var3 > 16384 && var4 - class247.field4278 < 5000L) {
                if (var4 - class253.field4374 > 1000L) {
                    System.gc();
                    class253.field4374 = var4;
                }
                class186.field3277 = class116.field1897;
                class145.field2532 = 5;
            } else {
                class165.field2814 = 10;
                class186.field3277 = class168.field2909;
                class145.field2532 = 5;
            }
        } else if (class165.field2814 == 10) {
            class180.method1188(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class169.field2951[var6] = new class52(104, 104);
            }
            class165.field2814 = 30;
            class186.field3277 = class142.field2506;
            class145.field2532 = 10;
        } else if (class165.field2814 == 30) {
            class82.field1248 = class149.method998(true, false, -1762, true, 0);
            class137.field2417 = class149.method998(true, false, arg0 - 1646, true, 1);
            class191.field3325 = class149.method998(false, true, -1762, true, 2);
            class208.field3616 = class149.method998(true, false, -1762, true, 3);
            class127.field2111 = class149.method998(true, false, arg0 ^ 0x692, true, 4);
            class229.field3884 = class149.method998(true, true, -1762, true, 5);
            class159.field2749 = class149.method998(true, true, arg0 - 1646, false, 6);
            class166.field2827 = class149.method998(true, false, arg0 ^ 0x692, true, 7);
            class152.field2645 = class149.method998(true, false, -1762, true, 8);
            class91.field1426 = class149.method998(true, false, -1762, true, 9);
            class200.field3452 = class149.method998(true, false, -1762, true, 10);
            class91.field1418 = class149.method998(true, false, -1762, true, 11);
            class142.field2500 = class149.method998(true, false, -1762, true, 12);
            class96.field1517 = class149.method998(true, false, -1762, true, 13);
            class21.field258 = class149.method998(true, false, -1762, false, 14);
            class31.field375 = class149.method998(true, false, -1762, true, 15);
            class135.field2356 = class149.method998(true, false, -1762, true, 16);
            class223.field3821 = class149.method998(true, false, -1762, true, 17);
            class167.field2855 = class149.method998(true, false, -1762, true, 18);
            class169.field2954 = class149.method998(true, false, -1762, true, 19);
            class214.field3709 = class149.method998(true, false, -1762, true, 20);
            class7.field83 = class149.method998(true, false, arg0 ^ 0x692, true, 21);
            class64.field907 = class149.method998(true, false, -1762, true, 22);
            class74.field1127 = class149.method998(true, true, -1762, true, 23);
            class34.field417 = class149.method998(true, false, -1762, true, 24);
            class97.field1533 = class149.method998(true, false, -1762, true, 25);
            class233.field3958 = class149.method998(true, true, -1762, true, 26);
            class186.field3277 = class254.field4387;
            class165.field2814 = 40;
            class145.field2532 = 15;
        } else if (class165.field2814 == 40) {
            byte var7 = 0;
            int var8 = var7 + class82.field1248.method1345(arg0 ^ 0x12E9) * 4 / 100;
            int var9 = var8 + class137.field2417.method1345(arg0 - 4647) * 4 / 100;
            int var10 = var9 + class191.field3325.method1345(-4763) / 100;
            int var11 = var10 + class208.field3616.method1345(-4763) * 2 / 100;
            int var12 = var11 + class127.field2111.method1345(-4763) * 6 / 100;
            int var13 = var12 + class229.field3884.method1345(-4763) * 4 / 100;
            int var14 = var13 + class159.field2749.method1345(-4763) * 2 / 100;
            int var15 = var14 + class166.field2827.method1345(arg0 - 4647) * 50 / 100;
            int var16 = var15 + class152.field2645.method1345(-4763) * 2 / 100;
            int var17 = var16 + class91.field1426.method1345(-4763) * 2 / 100;
            int var18 = var17 + class200.field3452.method1345(-4763) * 2 / 100;
            int var19 = var18 + class91.field1418.method1345(-4763) * 2 / 100;
            int var20 = var19 + class142.field2500.method1345(-4763) * 2 / 100;
            int var21 = var20 + class96.field1517.method1345(-4763) * 2 / 100;
            int var22 = var21 + class21.field258.method1345(-4763) * 2 / 100;
            int var23 = var22 + class31.field375.method1345(-4763) * 2 / 100;
            int var24 = var23 + class135.field2356.method1345(-4763) / 100;
            int var25 = var24 + class223.field3821.method1345(arg0 - 4647) / 100;
            int var26 = var25 + class167.field2855.method1345(-4763) / 100;
            int var27 = var26 + class169.field2954.method1345(-4763) / 100;
            int var28 = var27 + class214.field3709.method1345(arg0 ^ 0x12E9) / 100;
            int var29 = var28 + class7.field83.method1345(arg0 ^ 0x12E9) / 100;
            int var30 = var29 + class64.field907.method1345(-4763) / 100;
            int var31 = var30 + class74.field1127.method1345(-4763) / 100;
            int var32 = var31 + class34.field417.method1345(-4763) / 100;
            int var33 = var32 + class97.field1533.method1345(-4763) / 100;
            int var34 = var33 + class233.field3958.method1345(arg0 - 4647) / 100;
            if (var34 == 100) {
                class145.field2532 = 20;
                class186.field3277 = class32.field381;
                class73.method494(class152.field2645, -95);
                class139.method951(-123, class152.field2645);
                class98.method645(class152.field2645, true);
                class21.method111(true, class152.field2645);
                class165.field2814 = 45;
            } else {
                if (var34 != 0) {
                    class186.field3277 = class50.method347(arg0 + 118, new class168[] { class70.field1074, class128.method867((byte) 98, var34), class65.field922 });
                }
                class145.field2532 = 20;
            }
        } else if (class165.field2814 == 45) {
            class77.method517(22050, 2, class247.field4284, true);
            class233.field3965 = new class202();
            class233.field3965.method1318(128, 9, -14);
            class179.field3156 = class145.method981((byte) -106, class51.field686, class205.field3559, 22050, 0);
            class179.field3156.method1144(0, class233.field3965);
            class89.method590(class233.field3965, class31.field375, -124, class127.field2111, class21.field258);
            class45.field587 = class145.method981((byte) -120, class51.field686, class205.field3559, 2048, 1);
            class86.field1341 = new class75();
            class45.field587.method1144(0, class86.field1341);
            class108.field1736 = new class92(22050, class87.field1357);
            class207.field3595 = class159.field2749.method1705(class196.field3399, -1);
            class165.field2814 = 50;
            class145.field2532 = 30;
            class186.field3277 = class62.field853;
        } else if (class165.field2814 == 50) {
            int var35 = class4.method26(class96.field1517, false, class152.field2645);
            int var36 = class190.method1233(105);
            if (var35 < var36) {
                class186.field3277 = class50.method347(2, new class168[] { class159.field2745, class128.method867((byte) 83, var35 * 100 / var36), class65.field922 });
                class145.field2532 = 35;
            } else {
                class165.field2814 = 60;
                class145.field2532 = 35;
                class186.field3277 = class61.field837;
            }
        } else if (class165.field2814 == 60) {
            int var37 = class179.method1181(96, class152.field2645);
            int var38 = class252.method1662((byte) -88);
            if (var37 < var38) {
                class186.field3277 = class50.method347(2, new class168[] { class175.field3078, class128.method867((byte) 113, var37 * 100 / var38), class65.field922 });
                class145.field2532 = 40;
            } else {
                class145.field2532 = 40;
                class186.field3277 = class151.field2639;
                class165.field2814 = 65;
            }
        } else if (class165.field2814 == 65) {
            class57.method394(class152.field2645, 0, class96.field1517);
            class186.field3277 = class47.field616;
            class145.field2532 = 45;
            class84.method555(arg0 + 121, 5);
            class165.field2814 = 70;
        } else if (class165.field2814 == 70) {
            byte var39 = 0;
            class191.field3325.method1696(-25338);
            int var40 = var39 + class191.field3325.method1691(false);
            class135.field2356.method1696(arg0 ^ 0x628A);
            int var41 = var40 + class135.field2356.method1691(false);
            class223.field3821.method1696(-25338);
            int var42 = var41 + class223.field3821.method1691(false);
            class167.field2855.method1696(-25338);
            int var43 = var42 + class167.field2855.method1691(false);
            class169.field2954.method1696(-25338);
            int var44 = var43 + class169.field2954.method1691(false);
            class214.field3709.method1696(-25338);
            int var45 = var44 + class214.field3709.method1691(false);
            class7.field83.method1696(-25338);
            int var46 = var45 + class7.field83.method1691(false);
            class64.field907.method1696(-25338);
            int var47 = var46 + class64.field907.method1691(false);
            class34.field417.method1696(arg0 - 25222);
            int var48 = var47 + class34.field417.method1691(false);
            class97.field1533.method1696(-25338);
            int var49 = var48 + class97.field1533.method1691(false);
            if (var49 < 1000) {
                class186.field3277 = class50.method347(2, new class168[] { class147.field2561, class128.method867((byte) 94, var49 / 10), class65.field922 });
                class145.field2532 = 50;
            } else {
                class57.method395(1, class191.field3325);
                class117.method803((byte) -54, class191.field3325);
                class242.method1587((byte) -123, class191.field3325);
                class249.method1644((byte) -60, class191.field3325, class166.field2827);
                class87.method581(class59.field811, (byte) 85, class135.field2356, class166.field2827);
                class187.method1215(-7, class167.field2855, class166.field2827);
                class29.method194(class173.field3022, class169.field2954, false, class166.field2827, class59.field811);
                class73.method498(class191.field3325, true);
                class214.method1383(class82.field1248, (byte) -10, class137.field2417, class214.field3709);
                class255.method1678(true, class166.field2827, class7.field83);
                class213.method1371(-1, class64.field907);
                class65.method441(class191.field3325, 16);
                class168.method1088(class152.field2645, class166.field2827, class96.field1517, class208.field3616, (byte) -109);
                class236.method1528(class191.field3325, (byte) -18);
                class155.method1024((byte) -117, class223.field3821);
                class171.method1135(false, class34.field417, new class196(), class97.field1533);
                class135.method909(class97.field1533, (byte) 106, class34.field417);
                class186.field3277 = class60.field824;
                class145.field2532 = 50;
                class194.method1259(0);
                class165.field2814 = 80;
            }
        } else if (class165.field2814 == 80) {
            int var50 = class118.method805(class152.field2645, -128);
            int var51 = class247.method1617(16);
            if (var51 > var50) {
                class186.field3277 = class50.method347(2, new class168[] { class117.field1910, class128.method867((byte) 83, var50 * 100 / var51), class65.field922 });
                class145.field2532 = 60;
            } else {
                class246.method1612(class152.field2645, true);
                class165.field2814 = 90;
                class186.field3277 = class133.field2325;
                class145.field2532 = 60;
            }
        } else if (class165.field2814 == 90) {
            if (class233.field3958.method1696(-25338)) {
                class102 var52 = new class102(class91.field1426, class233.field3958, class152.field2645, 20, !class3.field34);
                class248.method1635(var52);
                if (class132.field2323 == 1) {
                    class248.method1622(0.9F);
                }
                if (class132.field2323 == 2) {
                    class248.method1622(0.8F);
                }
                if (class132.field2323 == 3) {
                    class248.method1622(0.7F);
                }
                if (class132.field2323 == 4) {
                    class248.method1622(0.6F);
                }
                class145.field2532 = 70;
                class186.field3277 = class234.field3986;
                class165.field2814 = 100;
            } else {
                class186.field3277 = class50.method347(2, new class168[] { class150.field2595, class128.method867((byte) 99, class233.field3958.method1691(false)), class65.field922 });
                class145.field2532 = 70;
            }
        } else if (class165.field2814 == 100) {
            if (class114.method785(class152.field2645, false)) {
                class165.field2814 = 110;
            }
        } else if (class165.field2814 == 110) {
            class180.field3216 = new class205();
            class205.field3559.method1553((byte) 61, 10, class180.field3216);
            class165.field2814 = 120;
            class186.field3277 = class82.field1245;
            class145.field2532 = 75;
        } else if (class165.field2814 == 120) {
            if (class200.field3452.method1706(class7.field77, (byte) -21, class222.field3816)) {
                class249 var53 = new class249(class200.field3452.method1699(class222.field3816, class7.field77, 0));
                class118.method810(var53, -1697);
                class186.field3277 = class57.field790;
                class145.field2532 = 80;
                class165.field2814 = 130;
            } else {
                class186.field3277 = class50.method347(2, new class168[] { class4.field48, class244.field4238 });
                class145.field2532 = 80;
            }
        } else if (class165.field2814 == 130) {
            if (!class208.field3616.method1696(-25338)) {
                class186.field3277 = class50.method347(2, new class168[] { class101.field1616, class128.method867((byte) 85, class208.field3616.method1691(false) * 4 / 5), class65.field922 });
                class145.field2532 = 85;
            } else if (!class142.field2500.method1696(-25338)) {
                class186.field3277 = class50.method347(2, new class168[] { class101.field1616, class128.method867((byte) 110, class142.field2500.method1691(false) / 6 + 80), class65.field922 });
                class145.field2532 = 85;
            } else if (class96.field1517.method1696(-25338)) {
                class165.field2814 = 140;
                class145.field2532 = 100;
                class186.field3277 = class254.field4390;
            } else {
                class186.field3277 = class50.method347(2, new class168[] { class101.field1616, class128.method867((byte) 117, class96.field1517.method1691(false) / 20 + 96), class65.field922 });
                class145.field2532 = 85;
            }
        } else if (class165.field2814 == 140) {
            class36.field444 = class208.field3616.method1705(class206.field3572, arg0 ^ 0x73);
            class229.field3884.method1702((byte) 27, false, true);
            class159.field2749.method1702((byte) 27, true, true);
            class152.field2645.method1702((byte) 27, true, true);
            class96.field1517.method1702((byte) 27, true, true);
            class200.field3452.method1702((byte) 27, true, true);
            class208.field3616.method1702((byte) 27, true, true);
            class84.method555(5, 8);
        } else if (arg0 != -116) {
            field546 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method273(byte arg0) {
        field539++;
        if (arg0 != -38 || class254.field4403 == 1000) {
            return;
        }
        boolean var2 = class211.method1366(arg0 ^ 0x58);
        boolean var3 = false;
        if (var2 && class147.field2574 && class179.field3156 != null) {
            class179.field3156.method1151(117);
        }
        if (class61.field838 && (class254.field4403 == 30 || class254.field4403 == 10)) {
            class107.method702(true);
        }
        if (class198.field3420) {
            var3 = true;
            class198.field3420 = false;
        }
        if (class254.field4403 == 0) {
            class177.method1168(class145.field2532, 22, class186.field3277, null, var3);
        } else if (class254.field4403 == 5) {
            class211.method1364(class123.field2028, arg0 ^ 0xFFFFE934);
        } else if (class254.field4403 == 10 || class254.field4403 == 20) {
            class154.method1015(0);
        } else if (class254.field4403 == 25 || class254.field4403 == 28) {
            if (class80.field1208 == 1) {
                if (class207.field3603 > class170.field2967) {
                    class170.field2967 = class207.field3603;
                }
                int var5 = (class170.field2967 - class207.field3603) * 50 / class170.field2967;
                class159.method1043(class50.method347(2, new class168[] { class100.field1581, class83.field1262, class128.method867((byte) 126, var5), class73.field1105 }), 119, false);
            } else if (class80.field1208 == 2) {
                if (class172.field2987 < class23.field263) {
                    class172.field2987 = class23.field263;
                }
                int var4 = (class172.field2987 - class23.field263) * 50 / class172.field2987 + 50;
                class159.method1043(class50.method347(2, new class168[] { class100.field1581, class83.field1262, class128.method867((byte) 117, var4), class73.field1105 }), 62, false);
            } else {
                class159.method1043(class100.field1581, arg0 + 112, false);
            }
        } else if (class254.field4403 == 30) {
            class254.method1674((byte) 91);
        } else if (class254.field4403 == 40) {
            class159.method1043(class50.method347(arg0 ^ 0xFFFFFFD8, new class168[] { class185.field3269, class98.field1537, class242.field4136 }), 111, false);
        }
        if ((class254.field4403 == 30 || class254.field4403 == 10) && class93.field1462 == 0 && !var3) {
            try {
                Graphics var8 = class51.field686.getGraphics();
                for (int var9 = 0; var9 < class149.field2586; var9++) {
                    if (class255.field4409[var9]) {
                        class204.field3544.method21(var8, class157.field2717[var9], class124.field2049[var9], (byte) 113, class169.field2952[var9], class133.field2335[var9]);
                        class255.field4409[var9] = false;
                    }
                }
            } catch (Exception var10) {
                class51.field686.repaint();
            }
        } else if (class254.field4403 > 0) {
            try {
                Graphics var6 = class51.field686.getGraphics();
                class204.field3544.method17(5, var6, 0, 0);
                for (int var7 = 0; var7 < class149.field2586; var7++) {
                    class255.field4409[var7] = false;
                }
            } catch (Exception var11) {
                class51.field686.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method274(int arg0) {
        class86.method572(0, class205.field3559, class52.field721);
        class88.field1376 = class23.field277 == 0 ? 443 : class83.field1272 + 50000;
        class121.field2009 = ~class23.field277 == arg0 ? 43594 : class83.field1272 + 40000;
        class240.field4111 = class121.field2009;
        field543++;
        if (class30.field367 == 1) {
            class234.field3972 = class178.field3129;
            class209.field3634 = class249.field4305;
            class190.field3303 = class257.field4496;
            class147.field2551 = class190.field3310;
        } else {
            class209.field3634 = class64.field903;
            class147.field2551 = class229.field3891;
            class190.field3303 = class232.field3945;
            class234.field3972 = class176.field3088;
        }
        class59.field815 = class253.field4372 = class147.field2564 = class211.field3649 = new short[256];
        class196.method1262(-21);
        class170.method1127(arg0 - 21300, class51.field686);
        class14.method54(92, class51.field686);
        class125.field2085 = class6.method29(101);
        if (class125.field2085 != null) {
            class125.field2085.method261(class51.field686, true);
        }
        class200.field3457 = class239.field4086;
        try {
            if (class205.field3559.field4102 != null) {
                class99.field1560 = new class64(class205.field3559.field4102, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class94.field1479[var2] = new class64(class205.field3559.field4098[var2], 6000, 0);
                }
                class83.field1267 = new class64(class205.field3559.field4084, 6000, 0);
                class199.field3437 = new class206(255, class99.field1560, class83.field1267, 500000);
                class34.field423 = new class64(class205.field3559.field4091, 24, 0);
                class205.field3559.field4091 = null;
                class205.field3559.field4084 = null;
                class205.field3559.field4098 = null;
                class205.field3559.field4102 = null;
            }
        } catch (IOException var3) {
            class83.field1267 = null;
            class199.field3437 = null;
            class99.field1560 = null;
            class34.field423 = null;
        }
        if (class23.field277 != 0) {
            class70.field1028 = true;
        }
        class129.field2158 = class16.field140;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field540++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class229.method1480(true);
            }
            class83.field1272 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class23.field277 = 0;
            } else if (arg0[1].equals("office")) {
                class23.field277 = 1;
            } else if (arg0[1].equals("local")) {
                class23.field277 = 2;
            } else {
                class229.method1480(true);
            }
            if (arg0[2].equals("live")) {
                class118.field1922 = 0;
            } else if (arg0[2].equals("rc")) {
                class118.field1922 = 1;
            } else if (arg0[2].equals("wip")) {
                class118.field1922 = 2;
            } else {
                class229.method1480(true);
            }
            if (arg0[4].equals("free")) {
                class59.field811 = false;
            } else if (arg0[4].equals("members")) {
                class59.field811 = true;
            } else {
                class229.method1480(true);
            }
            if (arg0[5].equals("english")) {
                class199.field3438 = 0;
            } else if (arg0[5].equals("german")) {
                class197.method1265(255);
                class199.field3438 = 1;
            } else {
                class229.method1480(true);
            }
            if (arg0[6].equals("game0")) {
                class30.field367 = 0;
            } else if (arg0[6].equals("game1")) {
                class30.field367 = 1;
            } else {
                class229.method1480(true);
            }
            if (arg0.length != 8) {
                class52.field721 = false;
            } else if (arg0[7].equals("safemode")) {
                class52.field721 = true;
            } else {
                class229.method1480(true);
            }
            class85.field1294 = "127.0.0.1";
            class172.field2989 = class222.field3816;
            class153.field2661 = 0;
            client var1 = new client();
            var1.method847(27, "runescape", class118.field1922 + 32, 765, 501, 503, (byte) -106);
            class58.field803.setLocation(40, 40);
        } catch (Exception var3) {
            class112.method763(var3, null, 81);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method275(int arg0) {
        if (class71.field1083 != null) {
            class71.field1083.detach();
        }
        if (class205.field3559 != null) {
            class205.field3559.method1560(this.getClass(), -25852);
        }
        if (class180.field3216 != null) {
            class180.field3216.field3565 = false;
        }
        class180.field3216 = null;
        if (class169.field2953 != null) {
            class169.field2953.method1653(-38);
            class169.field2953 = null;
        }
        class150.method1001(-60, class51.field686);
        field544++;
        class237.method1543(8, class51.field686);
        if (class125.field2085 != null) {
            class125.field2085.method260(class51.field686, 509);
        }
        class98.method646(0);
        class131.method888(63);
        class125.field2085 = null;
        int var2 = -48 / ((arg0 + 90) / 35);
        if (class179.field3156 != null) {
            class179.field3156.method1146(0);
        }
        if (class45.field587 != null) {
            class45.field587.method1146(0);
        }
        class172.method1136((byte) -119);
        class36.method220(false);
        try {
            if (class99.field1560 != null) {
                class99.field1560.method430((byte) 121);
            }
            if (class94.field1479 != null) {
                for (int var3 = 0; var3 < class94.field1479.length; var3++) {
                    if (class94.field1479[var3] != null) {
                        class94.field1479[var3].method430((byte) -2);
                    }
                }
            }
            if (class83.field1267 != null) {
                class83.field1267.method430((byte) 123);
            }
            if (class34.field423 != null) {
                class34.field423.method430((byte) 122);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method276(int arg0) {
        field528++;
        if (arg0 != -24071) {
            this.method277((byte) 13, 41);
        }
        boolean var2 = class157.method1026(114);
        if (!var2) {
            this.method270(arg0 ^ 0xFFFFA1BD);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method277(byte arg0, int arg1) {
        if (class240.field4111 == class121.field2009) {
            class240.field4111 = class88.field1376;
        } else {
            class240.field4111 = class121.field2009;
        }
        class145.field2534 = null;
        field537++;
        class46.field609++;
        class79.field1188 = null;
        if (arg0 >= -26) {
            field535 = null;
        }
        class82.field1240 = 0;
        if (class46.field609 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class254.field4403 > 5) {
                class179.field3153 = 3000;
            } else {
                this.method852(95, "js5connect_full");
                class254.field4403 = 1000;
            }
        } else if (class46.field609 >= 2 && arg1 == 6) {
            this.method852(-123, "js5connect_outofdate");
            class254.field4403 = 1000;
        } else if (class46.field609 >= 4) {
            if (class254.field4403 > 5) {
                class179.field3153 = 3000;
            } else {
                this.method852(-55, "js5connect");
                class254.field4403 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method278(byte arg0) {
        class63.method419(this, (byte) 80);
        field532++;
        if (arg0 != 65) {
            method269(-99);
        }
        for (class68.field952 = 0; class45.method299(19061) && class68.field952 < 128; class68.field952++) {
            class139.field2465[class68.field952] = class124.field2046;
            class27.field332[class68.field952] = class78.field1182;
        }
        class146.field2539++;
        if (class137.field2426 != -1) {
            class193.method1251(class223.field3837, class137.field2426, class42.field551, 0, -74, 0, 0, 0);
        }
        class205.field3566++;
        class245.method1608(-33);
        while (true) {
            class147 var2;
            class129 var3;
            class129 var4;
            do {
                var2 = (class147) class86.field1335.method321((byte) -113);
                if (var2 == null) {
                    while (true) {
                        class147 var5;
                        class129 var6;
                        class129 var7;
                        do {
                            var5 = (class147) class118.field1937.method321((byte) -93);
                            if (var5 == null) {
                                while (true) {
                                    class147 var8;
                                    class129 var9;
                                    class129 var10;
                                    do {
                                        var8 = (class147) class54.field744.method321((byte) -98);
                                        if (var8 == null) {
                                            if (class240.field4106 != null) {
                                                class84.method559(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2552;
                                        if (var9.field2123 < 0) {
                                            break;
                                        }
                                        var10 = class257.method1713(var9.field2276, 126);
                                    } while (var10 == null || var10.field2263 == null || var10.field2263.length <= var9.field2123 || var10.field2263[var9.field2123] != var9);
                                    class82.method545(var8, (byte) 106);
                                }
                            }
                            var6 = var5.field2552;
                            if (var6.field2123 < 0) {
                                break;
                            }
                            var7 = class257.method1713(var6.field2276, 126);
                        } while (var7 == null || var7.field2263 == null || var7.field2263.length <= var6.field2123 || var7.field2263[var6.field2123] != var6);
                        class82.method545(var5, (byte) 106);
                    }
                }
                var3 = var2.field2552;
                if (var3.field2123 < 0) {
                    break;
                }
                var4 = class257.method1713(var3.field2276, 126);
            } while (var4 == null || var4.field2263 == null || var4.field2263.length <= var3.field2123 || var4.field2263[var3.field2123] != var3);
            class82.method545(var2, (byte) 106);
        }
    }
}

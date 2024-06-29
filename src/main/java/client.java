import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class163 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lhi;")
    public static class82 field2194 = class95.method664((byte) -79, "0");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    public static int[] field2197 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 4)
    private final void method852(byte arg0) {
        field2184++;
        if (arg0 <= 47) {
            field2197 = (int[]) null;
        }
        boolean var2 = class244.field4238.method1365(false);
        if (!var2) {
            this.method872((byte) -34);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 29)
    public final void method853(int arg0) {
        field2183++;
        if (class147.field2485) {
            class147.method1005();
        }
        if (class48.field795 != null) {
            class144.method978(-2, class55.field881, class48.field795);
            class48.field795 = null;
        }
        if (class55.field881 != null) {
            class55.field881.method830(this.getClass(), arg0 + 15069);
        }
        if (class187.field3154 != null) {
            class187.field3154.field915 = false;
        }
        if (arg0 != -15069) {
            method867((class82) null, 124, false);
        }
        class187.field3154 = null;
        if (class66.field1036 != null) {
            class66.field1036.method2085(true);
            class66.field1036 = null;
        }
        class113.method776(class122.field2134, arg0 + 15069);
        class42.method320(class122.field2134, arg0 + 15173);
        if (class294.field4926 != null) {
            class294.field4926.method944((byte) 53, class122.field2134);
        }
        class63.method406(0);
        class221.method1564(0);
        class294.field4926 = null;
        if (class67.field1048 != null) {
            class67.field1048.method758((byte) 106);
        }
        if (class142.field2435 != null) {
            class142.field2435.method758((byte) 124);
        }
        class244.field4238.method1376((byte) 125);
        class228.field3945.method1614(24094);
        try {
            if (class321.field5535 != null) {
                class321.field5535.method953((byte) -98);
            }
            if (class28.field384 != null) {
                for (int var2 = 0; var2 < class28.field384.length; var2++) {
                    if (class28.field384[var2] != null) {
                        class28.field384[var2].method953((byte) -110);
                    }
                }
            }
            if (class117.field2057 != null) {
                class117.field2057.method953((byte) -86);
            }
            if (class87.field1548 != null) {
                class87.field1548.method953((byte) -104);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 118)
    public static final void method854(byte arg0) {
        field2195++;
        if (class62.field977 != null || class194.field3290 != null) {
            return;
        }
        int var1 = class229.field3953;
        if (class187.field3153) {
            if (var1 != 1) {
                int var6 = class211.field3702;
                int var7 = class202.field3471;
                if ((class33.field495 - 10) > var6 || class33.field495 + class88.field1563 + 10 < var6 || class28.field367 - 10 > var7 || var7 > (class28.field367 + class164.field2874 + 10)) {
                    class187.field3153 = false;
                    class143.method977(class33.field495, class88.field1563, class164.field2874, true, class28.field367);
                }
            }
            if (var1 == 1) {
                int var8 = class28.field367;
                int var9 = class33.field495;
                int var10 = class88.field1563;
                int var11 = class166.field2904;
                int var12 = class255.field4394;
                int var13 = -1;
                for (int var14 = 0; var14 < class309.field5262; var14++) {
                    int var15 = (class309.field5262 - var14 - 1) * 15 + var8 + 31;
                    if (var9 < var11 && (var9 + var10) > var11 && var15 - 13 < var12 && var12 < var15 + 3) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class149.method1029(-1, var13);
                }
                class187.field3153 = false;
                class143.method977(class33.field495, class88.field1563, class164.field2874, true, class28.field367);
            }
        } else {
            if (var1 == 1 && class309.field5262 > 0) {
                short var2 = class135.field2333[class309.field5262 - 1];
                if (var2 == 41 || var2 == 46 || var2 == 18 || var2 == 11 || var2 == 4 || var2 == 9 || var2 == 12 || var2 == 34 || var2 == 40 || var2 == 48 || var2 == 8 || var2 == 1003) {
                    int var3 = class28.field375[class309.field5262 - 1];
                    int var4 = class262.field4486[class309.field5262 - 1];
                    class75 var5 = class282.method1965(var3, (byte) 6);
                    if (class141.method962(method871(var5), 1) || class48.method347((byte) 121, method871(var5))) {
                        class105.field1863 = false;
                        class130.field2263 = 0;
                        if (class62.field977 != null) {
                            class138.method937(class62.field977, 16);
                        }
                        class62.field977 = class282.method1965(var3, (byte) 6);
                        class34.field507 = var4;
                        class161.field2809 = class255.field4394;
                        class40.field695 = class166.field2904;
                        class138.method937(class62.field977, 16);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class245.field4256 == 1 && class309.field5262 > 2 || class24.method157((byte) -119, class309.field5262 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class309.field5262 > 0 || class238.field4147 == 1) {
                class250.method1795(5);
            }
            if (var1 == 1 && class309.field5262 > 0 || class238.field4147 == 2) {
                class144.method980(-3);
            }
        }
        if (arg0 < 15) {
            main((String[]) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 247)
    public static void method855(int arg0) {
        field2197 = null;
        if (arg0 != 255) {
            method864((byte) 17);
        }
        field2194 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 274)
    public final void method856(int arg0) {
        class273.method1911(false);
        field2191++;
        if (arg0 != -14084) {
            method860(true, (class222) null);
        }
        class228.field3945 = new class226();
        class244.field4238 = new class196();
        if (class38.field657 == 0) {
        }
        class159.method1151(-121, class55.field881);
        if (class91.field1640 == 0) {
            class261.field4469 = this.getCodeBase().getHost();
            class164.field2879 = 443;
            class47.field791 = 43594;
        } else if (class91.field1640 == 1) {
            class261.field4469 = this.getCodeBase().getHost();
            class47.field791 = class61.field963 + 40000;
            class164.field2879 = class61.field963 + 50000;
        } else if (class91.field1640 == 2) {
            class261.field4469 = "127.0.0.1";
            class47.field791 = class61.field963 + 40000;
            class164.field2879 = class61.field963 + 50000;
        }
        class135.field2339 = class261.field4469;
        if (class120.field2113 == 3 && class91.field1640 != 2) {
            class47.field786 = class61.field963;
        }
        class203.field3530 = class164.field2879;
        class92.field1643 = class47.field791;
        class124.field2178 = class156.field2654 = class66.field1037 = class34.field531 = new short[256];
        class34.field516 = class47.field791;
        if (class22.field307 == 1) {
            class23.field317 = true;
            class42.field742 = class33.field499;
            class67.field1045 = class207.field3609;
            class85.field1524 = 0;
            class85.field1528 = 16777215;
            class34.field535 = class143.field2448;
            class29.field392 = class171.field2953;
        } else {
            class29.field392 = class17.field183;
            class34.field535 = class293.field4913;
            class67.field1045 = class65.field1021;
            class42.field742 = class226.field3919;
        }
        class39.field686 = class34.field516;
        class90.method641((byte) 124);
        class33.method257((byte) -122, class122.field2134);
        class199.method1387(class122.field2134, -17706);
        class294.field4926 = class3.method21(-126);
        if (class294.field4926 != null) {
            class294.field4926.method946(class122.field2134, true);
        }
        class307.field5232 = class120.field2113;
        try {
            if (class55.field881.field2115 != null) {
                class321.field5535 = new class140(class55.field881.field2115, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class28.field384[var2] = new class140(class55.field881.field2112[var2], 6000, 0);
                }
                class117.field2057 = new class140(class55.field881.field2123, 6000, 0);
                class201.field3458 = new class282(255, class321.field5535, class117.field2057, 500000);
                class87.field1548 = new class140(class55.field881.field2124, 24, 0);
                class55.field881.field2123 = null;
                class55.field881.field2115 = null;
                class55.field881.field2124 = null;
                class55.field881.field2112 = null;
            }
        } catch (IOException var4) {
            class321.field5535 = null;
            class201.field3458 = null;
            class117.field2057 = null;
            class87.field1548 = null;
        }
        class305.field5179 = class68.field1058;
        if (class91.field1640 != 0) {
            class52.field841 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lme;IIIIIII)V", line = 389)
    public static final void method857(class75[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class75 var9 = arg0[var8];
            if (var9 != null && var9.field1280 == arg1 && (!var9.field1136 || var9.field1184 == 0 || var9.field1218 || method871(var9) != 0 || class237.field4109 == var9 || var9.field1210 == 1338) && (!var9.field1136 || !method874(var9))) {
                int var10 = var9.field1151 + arg6;
                int var11 = var9.field1294 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1184 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1216 + var10;
                    int var17 = var9.field1205 + var11;
                    if (var9.field1184 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class194.field3290 == var9) {
                    class36.field573 = true;
                    class262.field4488 = var10;
                    class257.field4423 = var11;
                }
                if (!var9.field1136 || var12 < var14 && var13 < var15) {
                    if (var9.field1184 == 0) {
                        if (!var9.field1136 && method874(var9) && class302.field5154 != var9) {
                            continue;
                        }
                        if (var9.field1183 && class211.field3702 >= var12 && class202.field3471 >= var13 && class211.field3702 < var14 && class202.field3471 < var15) {
                            for (class331 var18 = (class331) class197.field3366.method1936(16173); var18 != null; var18 = (class331) class197.field3366.method1926((byte) 90)) {
                                if (var18.field5637) {
                                    var18.method961((byte) 70);
                                    var18.field5649.field1256 = false;
                                }
                            }
                            if (class20.field260 == 0) {
                                class194.field3290 = null;
                                class237.field4109 = null;
                            }
                            class267.field4536 = false;
                        }
                    }
                    if (var9.field1136) {
                        boolean var19;
                        if (class211.field3702 >= var12 && class202.field3471 >= var13 && class211.field3702 < var14 && class202.field3471 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class272.field4579 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class229.field3953 == 1 && class166.field2904 >= var12 && class255.field4394 >= var13 && class166.field2904 < var14 && class255.field4394 < var15) {
                            var21 = true;
                        }
                        if (class180.field3074 > 0 && var9.field1225 != null) {
                            for (int var22 = 0; var22 < var9.field1225.length; var22++) {
                                for (int var23 = 0; var23 < class180.field3074; var23++) {
                                    int var24 = var9.field1225[var22] & 0xFF;
                                    if (class101.field1803[var23] == var24) {
                                        if (var9.field1278 != null) {
                                            byte var25 = var9.field1278[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class19.field235[86] || (var25 & 0x1) != 0 && !class19.field235[82] || (var25 & 0x4) != 0 && !class19.field235[81])) {
                                                continue;
                                            }
                                        }
                                        class111.method769(var9.field1172, 63, var22 + 1, class129.field2247, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class201.method1415((byte) -78, var9, class255.field4394 - var11, class166.field2904 - var10);
                        }
                        if (class194.field3290 != null && class194.field3290 != var9 && var19 && class242.method1734(method871(var9), 0)) {
                            class166.field2911 = var9;
                        }
                        if (class237.field4109 == var9) {
                            class325.field5575 = true;
                            class316.field5433 = var10;
                            class164.field2877 = var11;
                        }
                        if (var9.field1218 || var9.field1210 != 0) {
                            if (var19 && class4.field39 != 0 && var9.field1181 != null) {
                                class331 var26 = new class331();
                                var26.field5637 = true;
                                var26.field5649 = var9;
                                var26.field5638 = class4.field39;
                                var26.field5635 = var9.field1181;
                                class197.field3366.method1940((byte) -113, var26);
                            }
                            if (class194.field3290 != null || class62.field977 != null || class187.field3153 || var9.field1210 != 1400 && class267.field4536) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1210 != 0) {
                                if (var9.field1210 == 1337) {
                                    class81.field1382 = var9;
                                    class138.method937(var9, 16);
                                    continue;
                                }
                                if (var9.field1210 == 1338) {
                                    if (var21) {
                                        class126.field2216 = class166.field2904 - var10;
                                        class129.field2249 = class255.field4394 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1210 == 1400) {
                                    class293.field4917 = var9;
                                    if (var21) {
                                        if (class19.field235[82] && class323.field5545 > 0) {
                                            int var27 = (int) ((double) (class166.field2904 - var10 - var9.field1216 / 2) * 2.0D / (double) class69.field1065);
                                            int var28 = (int) ((double) (class255.field4394 - var11 - var9.field1205 / 2) * 2.0D / (double) class69.field1065);
                                            int var29 = class82.field1445 + var27;
                                            int var30 = class315.field5426 + var28;
                                            int var31 = class166.field2905 + var29;
                                            int var32 = class157.field2719 + class17.field181 - var30 - 1;
                                            class100.method683(var31, 0, var32, true);
                                            class104.method719(true);
                                            continue;
                                        }
                                        class267.field4536 = true;
                                        class21.field289 = class211.field3702;
                                        class4.field35 = class202.field3471;
                                        class60.field945 = class82.field1445;
                                        class273.field4593 = class315.field5426;
                                        continue;
                                    }
                                    if (var20 && class267.field4536) {
                                        class72.method455((int) ((double) (class21.field289 - class211.field3702) * 2.0D / (double) class119.field2106) + class60.field945, (byte) -84);
                                        class226.method1609((int) ((double) (class4.field35 - class202.field3471) * 2.0D / (double) class119.field2106) + class273.field4593, -5107);
                                        continue;
                                    }
                                    class267.field4536 = false;
                                    continue;
                                }
                                if (var9.field1210 == 1401) {
                                    if (var20) {
                                        class166.method1198(var9.field1216, class202.field3471 - var11, var9.field1205, class211.field3702 - var10, 127);
                                    }
                                    continue;
                                }
                                if (var9.field1210 == 1402) {
                                    if (!class147.field2485) {
                                        class138.method937(var9, 16);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field1261 && var21) {
                                var9.field1261 = true;
                                if (var9.field1222 != null) {
                                    class331 var33 = new class331();
                                    var33.field5637 = true;
                                    var33.field5649 = var9;
                                    var33.field5648 = class166.field2904 - var10;
                                    var33.field5638 = class255.field4394 - var11;
                                    var33.field5635 = var9.field1222;
                                    class197.field3366.method1940((byte) -90, var33);
                                }
                            }
                            if (var9.field1261 && var20 && var9.field1271 != null) {
                                class331 var34 = new class331();
                                var34.field5637 = true;
                                var34.field5649 = var9;
                                var34.field5648 = class211.field3702 - var10;
                                var34.field5638 = class202.field3471 - var11;
                                var34.field5635 = var9.field1271;
                                class197.field3366.method1940((byte) -116, var34);
                            }
                            if (var9.field1261 && !var20) {
                                var9.field1261 = false;
                                if (var9.field1277 != null) {
                                    class331 var35 = new class331();
                                    var35.field5637 = true;
                                    var35.field5649 = var9;
                                    var35.field5648 = class211.field3702 - var10;
                                    var35.field5638 = class202.field3471 - var11;
                                    var35.field5635 = var9.field1277;
                                    class212.field3706.method1940((byte) 127, var35);
                                }
                            }
                            if (var20 && var9.field1145 != null) {
                                class331 var36 = new class331();
                                var36.field5637 = true;
                                var36.field5649 = var9;
                                var36.field5648 = class211.field3702 - var10;
                                var36.field5638 = class202.field3471 - var11;
                                var36.field5635 = var9.field1145;
                                class197.field3366.method1940((byte) 29, var36);
                            }
                            if (!var9.field1256 && var19) {
                                var9.field1256 = true;
                                if (var9.field1189 != null) {
                                    class331 var37 = new class331();
                                    var37.field5637 = true;
                                    var37.field5649 = var9;
                                    var37.field5648 = class211.field3702 - var10;
                                    var37.field5638 = class202.field3471 - var11;
                                    var37.field5635 = var9.field1189;
                                    class197.field3366.method1940((byte) -106, var37);
                                }
                            }
                            if (var9.field1256 && var19 && var9.field1204 != null) {
                                class331 var38 = new class331();
                                var38.field5637 = true;
                                var38.field5649 = var9;
                                var38.field5648 = class211.field3702 - var10;
                                var38.field5638 = class202.field3471 - var11;
                                var38.field5635 = var9.field1204;
                                class197.field3366.method1940((byte) -124, var38);
                            }
                            if (var9.field1256 && !var19) {
                                var9.field1256 = false;
                                if (var9.field1197 != null) {
                                    class331 var39 = new class331();
                                    var39.field5637 = true;
                                    var39.field5649 = var9;
                                    var39.field5648 = class211.field3702 - var10;
                                    var39.field5638 = class202.field3471 - var11;
                                    var39.field5635 = var9.field1197;
                                    class212.field3706.method1940((byte) 33, var39);
                                }
                            }
                            if (var9.field1200 != null) {
                                class331 var40 = new class331();
                                var40.field5649 = var9;
                                var40.field5635 = var9.field1200;
                                class215.field3743.method1940((byte) 19, var40);
                            }
                            if (var9.field1178 != null && class42.field746 > var9.field1159) {
                                if (var9.field1254 == null || class42.field746 - var9.field1159 > 32) {
                                    class331 var45 = new class331();
                                    var45.field5649 = var9;
                                    var45.field5635 = var9.field1178;
                                    class197.field3366.method1940((byte) -104, var45);
                                } else {
                                    label548: for (int var41 = var9.field1159; var41 < class42.field746; var41++) {
                                        int var42 = class236.field4101[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1254.length; var43++) {
                                            if (var9.field1254[var43] == var42) {
                                                class331 var44 = new class331();
                                                var44.field5649 = var9;
                                                var44.field5635 = var9.field1178;
                                                class197.field3366.method1940((byte) 48, var44);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1159 = class42.field746;
                            }
                            if (var9.field1149 != null && class53.field851 > var9.field1148) {
                                if (var9.field1161 == null || class53.field851 - var9.field1148 > 32) {
                                    class331 var50 = new class331();
                                    var50.field5649 = var9;
                                    var50.field5635 = var9.field1149;
                                    class197.field3366.method1940((byte) 44, var50);
                                } else {
                                    label524: for (int var46 = var9.field1148; var46 < class53.field851; var46++) {
                                        int var47 = class249.field4299[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1161.length; var48++) {
                                            if (var9.field1161[var48] == var47) {
                                                class331 var49 = new class331();
                                                var49.field5649 = var9;
                                                var49.field5635 = var9.field1149;
                                                class197.field3366.method1940((byte) -106, var49);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1148 = class53.field851;
                            }
                            if (var9.field1241 != null && class44.field766 > var9.field1195) {
                                if (var9.field1156 == null || class44.field766 - var9.field1195 > 32) {
                                    class331 var55 = new class331();
                                    var55.field5649 = var9;
                                    var55.field5635 = var9.field1241;
                                    class197.field3366.method1940((byte) 82, var55);
                                } else {
                                    label500: for (int var51 = var9.field1195; var51 < class44.field766; var51++) {
                                        int var52 = class29.field395[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1156.length; var53++) {
                                            if (var9.field1156[var53] == var52) {
                                                class331 var54 = new class331();
                                                var54.field5649 = var9;
                                                var54.field5635 = var9.field1241;
                                                class197.field3366.method1940((byte) -112, var54);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1195 = class44.field766;
                            }
                            if (var9.field1191 != null && class83.field1479 > var9.field1245) {
                                if (var9.field1296 == null || class83.field1479 - var9.field1245 > 32) {
                                    class331 var60 = new class331();
                                    var60.field5649 = var9;
                                    var60.field5635 = var9.field1191;
                                    class197.field3366.method1940((byte) -122, var60);
                                } else {
                                    label476: for (int var56 = var9.field1245; var56 < class83.field1479; var56++) {
                                        int var57 = class35.field568[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1296.length; var58++) {
                                            if (var9.field1296[var58] == var57) {
                                                class331 var59 = new class331();
                                                var59.field5649 = var9;
                                                var59.field5635 = var9.field1191;
                                                class197.field3366.method1940((byte) -110, var59);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1245 = class83.field1479;
                            }
                            if (var9.field1219 != null && class110.field1980 > var9.field1265) {
                                if (var9.field1242 == null || class110.field1980 - var9.field1265 > 32) {
                                    class331 var65 = new class331();
                                    var65.field5649 = var9;
                                    var65.field5635 = var9.field1219;
                                    class197.field3366.method1940((byte) -117, var65);
                                } else {
                                    label452: for (int var61 = var9.field1265; var61 < class110.field1980; var61++) {
                                        int var62 = class93.field1714[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1242.length; var63++) {
                                            if (var9.field1242[var63] == var62) {
                                                class331 var64 = new class331();
                                                var64.field5649 = var9;
                                                var64.field5635 = var9.field1219;
                                                class197.field3366.method1940((byte) 10, var64);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field1265 = class110.field1980;
                            }
                            if (class138.field2369 > var9.field1207 && var9.field1246 != null) {
                                class331 var66 = new class331();
                                var66.field5649 = var9;
                                var66.field5635 = var9.field1246;
                                class197.field3366.method1940((byte) -112, var66);
                            }
                            if (class232.field4012 > var9.field1207 && var9.field1208 != null) {
                                class331 var67 = new class331();
                                var67.field5649 = var9;
                                var67.field5635 = var9.field1208;
                                class197.field3366.method1940((byte) 58, var67);
                            }
                            if (class276.field4640 > var9.field1207 && var9.field1185 != null) {
                                class331 var68 = new class331();
                                var68.field5649 = var9;
                                var68.field5635 = var9.field1185;
                                class197.field3366.method1940((byte) -102, var68);
                            }
                            if (class183.field3122 > var9.field1207 && var9.field1266 != null) {
                                class331 var69 = new class331();
                                var69.field5649 = var9;
                                var69.field5635 = var9.field1266;
                                class197.field3366.method1940((byte) 127, var69);
                            }
                            if (class131.field2271 > var9.field1207 && var9.field1175 != null) {
                                class331 var70 = new class331();
                                var70.field5649 = var9;
                                var70.field5635 = var9.field1175;
                                class197.field3366.method1940((byte) -92, var70);
                            }
                            var9.field1207 = class157.field2726;
                            if (var9.field1215 != null) {
                                for (int var71 = 0; var71 < class180.field3074; var71++) {
                                    class331 var72 = new class331();
                                    var72.field5649 = var9;
                                    var72.field5644 = class101.field1803[var71];
                                    var72.field5636 = class99.field1785[var71];
                                    var72.field5635 = var9.field1215;
                                    class197.field3366.method1940((byte) 46, var72);
                                }
                            }
                            if (class288.field4841 && var9.field1214 != null) {
                                class331 var73 = new class331();
                                var73.field5649 = var9;
                                var73.field5635 = var9.field1214;
                                class197.field3366.method1940((byte) -94, var73);
                            }
                        }
                    }
                    if (!var9.field1136 && class194.field3290 == null && class62.field977 == null && !class187.field3153) {
                        if ((var9.field1199 >= 0 || var9.field1226 != 0) && class211.field3702 >= var12 && class202.field3471 >= var13 && class211.field3702 < var14 && class202.field3471 < var15) {
                            if (var9.field1199 >= 0) {
                                class302.field5154 = arg0[var9.field1199];
                            } else {
                                class302.field5154 = var9;
                            }
                        }
                        if (var9.field1184 == 8 && class211.field3702 >= var12 && class202.field3471 >= var13 && class211.field3702 < var14 && class202.field3471 < var15) {
                            class157.field2730 = var9;
                        }
                        if (var9.field1224 > var9.field1205) {
                            class124.method847(45, var9.field1224, class211.field3702, class202.field3471, var9.field1216 + var10, var9.field1205, var11, var9);
                        }
                    }
                    if (var9.field1184 == 0) {
                        method857(arg0, var9.field1172, var12, var13, var14, var15, var10 - var9.field1146, var11 - var9.field1188);
                        if (var9.field1274 != null) {
                            method857(var9.field1274, var9.field1172, var12, var13, var14, var15, var10 - var9.field1146, var11 - var9.field1188);
                        }
                        class146 var74 = (class146) class191.field3195.method507((long) var9.field1172, 602425312);
                        if (var74 != null) {
                            class279.method1944(var11, var15, var12, var74.field2474, (byte) 38, var13, var10, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lhi;I)[Lhi;", line = 1144)
    public static final class82[] method858(class82[] arg0, int arg1) {
        field2188++;
        class82[] var2 = new class82[5];
        for (int var3 = arg1; var3 < 5; var3++) {
            var2[var3] = class29.method182(-6039, new class82[] { class327.method2240((byte) -74, var3), class98.field1770 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class29.method182(-6039, new class82[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 1171)
    public static final void method859(int arg0, byte arg1) {
        class209.field3682[1] = (float) class277.method1935(255, arg0 >> 8) / 255.0F;
        field2196++;
        class209.field3682[0] = (float) class277.method1935(255, arg0 >> 16) / 255.0F;
        if (arg1 < 38) {
            field2194 = (class82) null;
        }
        class209.field3682[2] = (float) class277.method1935(255, arg0) / 255.0F;
        class60.method394(3, -1);
        class60.method394(4, -1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLum;)V", line = 1189)
    private static final void method860(boolean arg0, class222 arg1) {
        field2201++;
        if (!arg0) {
            method858((class82[]) null, 19);
        }
        class55.field884 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1204)
    public final void method861(int arg0) {
        field2199++;
        if (class61.field959 == 1000) {
            return;
        }
        class212.field3708++;
        if ((class212.field3708 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class273.field4611 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class45.field773.setSeed((long) class273.field4611);
        }
        this.method852((byte) 72);
        if (class328.field5598 != null) {
            class328.field5598.method1558(-20290);
        }
        class68.method431(-95);
        if (arg0 >= -86) {
            this.method856(74);
        }
        class283.method1968(95);
        class19.method129((byte) -121);
        class79.method506((byte) 126);
        if (class147.field2485) {
            class6.method38();
        }
        if (class294.field4926 != null) {
            int var3 = class294.field4926.method943((byte) 100);
            class4.field39 = var3;
        }
        if (class61.field959 == 0) {
            this.method863(4);
            class15.method84(true);
        } else if (class61.field959 == 5) {
            this.method863(4);
            class15.method84(true);
        } else if (class61.field959 == 25 || class61.field959 == 28) {
            class294.method2021((byte) -125);
        }
        if (class61.field959 == 10) {
            this.method873(9341);
            class142.method965((byte) -59);
            class168.method1202(-21238);
            class286.method1988(-27325);
        } else if (class61.field959 == 30) {
            class229.method1631(100);
        } else if (class61.field959 == 40) {
            class286.method1988(-27325);
            if (class95.field1735 != -3) {
                if (class95.field1735 == 15) {
                    class149.method1030((byte) -127);
                } else if (class95.field1735 != 2) {
                    class222.method1571(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1296)
    public static final void method862(int arg0) {
        while (true) {
            if (class35.field545.method1497(128, class199.field3421) >= 27) {
                int var1 = class35.field545.method1499((byte) 125, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class99.field1777[var1] == null) {
                        var2 = true;
                        class99.field1777[var1] = new class275();
                    }
                    class275 var3 = class99.field1777[var1];
                    class43.field749[class25.field333++] = var1;
                    var3.field1680 = class212.field3708;
                    if (var3.field4628 != null && var3.field4628.method1656(-16)) {
                        class183.method1271((byte) -127, var3);
                    }
                    int var4 = class35.field545.method1499((byte) -77, 5);
                    int var5 = class35.field545.method1499((byte) 106, 1);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var6 = class281.field4727[class35.field545.method1499((byte) -63, 3)];
                    if (var2) {
                        var3.field1673 = var3.field1704 = var6;
                    }
                    int var7 = class35.field545.method1499((byte) -73, 1);
                    if (var7 == 1) {
                        class44.field760[class106.field1877++] = var1;
                    }
                    var3.method1918(120, class222.method1574(true, class35.field545.method1499((byte) -43, 14)));
                    int var8 = class35.field545.method1499((byte) -33, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method656(-106, var3.field4628.field4052);
                    var3.field1675 = var3.field4628.field4067;
                    var3.field1663 = var3.field4628.field4018;
                    var3.field1694 = var3.field4628.field4037;
                    var3.field1717 = var3.field4628.field4072;
                    var3.field1703 = var3.field4628.field4038;
                    var3.field1654 = var3.field4628.field4059;
                    var3.field1702 = var3.field4628.field4035;
                    var3.field1710 = var3.field4628.field4054;
                    if (var3.field1710 == 0) {
                        var3.field1704 = 0;
                    }
                    var3.method653(var3.method520(true), 7, class168.field2932.field1723[0] + var4, class168.field2932.field1720[0] + var8, var5 == 1);
                    if (var3.field4628.method1656(-16)) {
                        class81.method519(class297.field5058, var3.field1723[0], 0, var3.field1720[0], (byte) -83, (class81) null, var3, (class157) null);
                    }
                    continue;
                }
            }
            field2182++;
            if (arg0 != -5) {
                main((String[]) null);
            }
            class35.field545.method1506(-69);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1377)
    private final void method863(int arg0) {
        field2187++;
        if (!class87.field1554) {
            label236: while (true) {
                do {
                    if (!class25.method166(true)) {
                        break label236;
                    }
                } while (class199.field3414 != 115 && class199.field3414 != 83);
                class87.field1554 = true;
            }
        }
        if (class267.field4539 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class57.method391(19211);
            if (class269.field4563 == 0L) {
                class269.field4563 = var4;
            }
            if (var3 > 16384 && (var4 - class269.field4563) < 5000L) {
                if (var4 - class288.field4833 > 1000L) {
                    System.gc();
                    class288.field4833 = var4;
                }
                class327.field5597 = 5;
                class16.field144 = class25.field344;
            } else {
                class16.field144 = class136.field2350;
                class327.field5597 = 5;
                class267.field4539 = 10;
            }
        } else if (class267.field4539 == 10) {
            class2.method4(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class180.field3071[var6] = new class189(104, 104);
            }
            class267.field4539 = 30;
            class327.field5597 = 10;
            class16.field144 = class279.field4682;
        } else if (class267.field4539 == 30) {
            if (class328.field5598 == null) {
                class328.field5598 = new class220(class244.field4238, class228.field3945);
            }
            if (class328.field5598.method1560(99)) {
                class111.field2009 = class263.method1872(false, 0, -87, true, true);
                class191.field3190 = class263.method1872(false, 1, -97, true, true);
                class130.field2265 = class263.method1872(true, 2, -108, false, true);
                class164.field2880 = class263.method1872(false, 3, arg0 - 105, true, true);
                class286.field4822 = class263.method1872(false, 4, -77, true, true);
                class184.field3134 = class263.method1872(true, 5, -63, true, true);
                class33.field484 = class263.method1872(true, 6, -57, true, false);
                class284.field4764 = class263.method1872(false, 7, arg0 - 86, true, true);
                class182.field3117 = class263.method1872(false, 8, arg0 ^ 0xFFFFFFA9, true, true);
                class267.field4535 = class263.method1872(false, 9, -108, true, true);
                class279.field4679 = class263.method1872(false, 10, -48, true, true);
                class296.field5051 = class263.method1872(false, 11, -88, true, true);
                class52.field846 = class263.method1872(false, 12, -78, true, true);
                class62.field976 = class263.method1872(false, 13, -74, true, true);
                class88.field1565 = class263.method1872(false, 14, -53, true, false);
                class327.field5586 = class263.method1872(false, 15, arg0 ^ 0xFFFFFF85, true, true);
                class19.field254 = class263.method1872(false, 16, -126, true, true);
                class231.field3984 = class263.method1872(false, 17, -86, true, true);
                class80.field1366 = class263.method1872(false, 18, -49, true, true);
                class34.field530 = class263.method1872(false, 19, -86, true, true);
                class302.field5147 = class263.method1872(false, 20, arg0 ^ 0xFFFFFF94, true, true);
                class243.field4219 = class263.method1872(false, 21, -53, true, true);
                class35.field563 = class263.method1872(false, 22, -84, true, true);
                class209.field3676 = class263.method1872(true, 23, -123, true, true);
                class63.field982 = class263.method1872(false, 24, arg0 ^ 0xFFFFFFC0, true, true);
                class203.field3497 = class263.method1872(false, 25, -69, true, true);
                class119.field2103 = class263.method1872(true, 26, -75, true, true);
                class277.field4662 = class263.method1872(false, 27, arg0 - 88, true, true);
                class327.field5597 = 15;
                class267.field4539 = 40;
                class16.field144 = class165.field2889;
            } else {
                class327.field5597 = 12;
                class16.field144 = class157.field2673;
            }
        } else if (class267.field4539 == 40) {
            int var28 = 0;
            for (int var29 = 0; var29 < 28; var29++) {
                var28 += class98.field1764[var29].method1486((byte) 91) * class74.field1134[var29] / 100;
            }
            if (var28 == 100) {
                class327.field5597 = 20;
                class16.field144 = class74.field1135;
                class134.method916(class182.field3117, 64);
                class234.method1665(class182.field3117, (byte) -97);
                class73.method461(true, class182.field3117);
                class267.field4539 = 45;
            } else {
                if (var28 != 0) {
                    class16.field144 = class29.method182(-6039, new class82[] { class164.field2869, class327.method2240((byte) -74, var28), class253.field4357 });
                }
                class327.field5597 = 20;
            }
        } else if (class267.field4539 == 45) {
            class305.method2108(22050, true, class308.field5238, 2);
            class166.field2901 = new class203();
            class166.field2901.method1444(9, 128, (byte) -128);
            class67.field1048 = class256.method1829(22050, (byte) 28, class55.field881, class122.field2134, 0);
            class67.field1048.method753(class166.field2901, (byte) 18);
            class191.method1327(class286.field4822, class88.field1565, 106, class166.field2901, class327.field5586);
            class142.field2435 = class256.method1829(2048, (byte) 28, class55.field881, class122.field2134, 1);
            class219.field3803 = new class125();
            class142.field2435.method753(class219.field3803, (byte) 18);
            class64.field992 = new class143(22050, class307.field5236);
            class63.field984 = class33.field484.method1594(class202.field3475, -37);
            class327.field5597 = 30;
            class16.field144 = class307.field5231;
            class267.field4539 = 50;
        } else if (class267.field4539 == 50) {
            int var7 = class123.method843(class182.field3117, class62.field976, 0);
            int var8 = class65.method415((byte) -73);
            if (var8 <= var7) {
                class267.field4539 = 60;
                class16.field144 = class227.field3928;
                class327.field5597 = 35;
            } else {
                class16.field144 = class29.method182(arg0 ^ 0xFFFFE86D, new class82[] { class33.field486, class327.method2240((byte) -74, var7 * 100 / var8), class253.field4357 });
                class327.field5597 = 35;
            }
        } else if (class267.field4539 == 60) {
            int var26 = class66.method421((byte) -15, class182.field3117);
            int var27 = class164.method1184((byte) -127);
            if (var27 <= var26) {
                class267.field4539 = 65;
                class16.field144 = class280.field4700;
                class327.field5597 = 40;
            } else {
                class16.field144 = class29.method182(-6039, new class82[] { class114.field2042, class327.method2240((byte) -74, var26 * 100 / var27), class253.field4357 });
                class327.field5597 = 40;
            }
        } else if (class267.field4539 == 65) {
            class156.method1113(true, class62.field976, class182.field3117);
            class327.field5597 = 45;
            class16.field144 = class87.field1550;
            class292.method2014(28, 5);
            class267.field4539 = 70;
        } else if (class267.field4539 == 70) {
            byte var9 = 0;
            class130.field2265.method1570(-20653);
            int var10 = var9 + class130.field2265.method1602(25383);
            class19.field254.method1570(arg0 - 20657);
            int var11 = var10 + class19.field254.method1602(arg0 ^ 0x6323);
            class231.field3984.method1570(arg0 ^ 0xFFFFAF57);
            int var12 = var11 + class231.field3984.method1602(25383);
            class80.field1366.method1570(-20653);
            int var13 = var12 + class80.field1366.method1602(arg0 ^ 0x6323);
            class34.field530.method1570(-20653);
            int var14 = var13 + class34.field530.method1602(25383);
            class302.field5147.method1570(arg0 ^ 0xFFFFAF57);
            int var15 = var14 + class302.field5147.method1602(25383);
            class243.field4219.method1570(-20653);
            int var16 = var15 + class243.field4219.method1602(25383);
            class35.field563.method1570(-20653);
            int var17 = var16 + class35.field563.method1602(25383);
            class63.field982.method1570(-20653);
            int var18 = var17 + class63.field982.method1602(25383);
            class203.field3497.method1570(-20653);
            int var19 = var18 + class203.field3497.method1602(arg0 ^ 0x6323);
            class277.field4662.method1570(-20653);
            int var20 = var19 + class277.field4662.method1602(arg0 + 25379);
            if (var20 < 1100) {
                class16.field144 = class29.method182(arg0 - 6043, new class82[] { class253.field4356, class327.method2240((byte) -74, var20 / 11), class253.field4357 });
                class327.field5597 = 50;
            } else {
                class255.method1823((byte) -39, class130.field2265);
                class286.method1985(class130.field2265, 16767793);
                class48.method345(5, class130.field2265);
                class56.method389(class130.field2265, arg0 ^ 0x5, class284.field4764);
                class264.method1876((byte) -118, class19.field254, true, class284.field4764);
                class289.method1997(-108, class80.field1366, class284.field4764);
                class293.method2016(true, -119, class34.field530, class284.field4764, class250.field4311);
                class20.method141((byte) -127, class130.field2265);
                class132.method910(class191.field3190, arg0 ^ 0xFFFFA6EE, class302.field5147, class111.field2009);
                class202.method1421((byte) 86, class284.field4764, class243.field4219);
                class189.method1310(class35.field563, -124);
                class202.method1419(arg0 ^ 0x5A5E, class130.field2265);
                class285.method1982(class164.field2880, (byte) -26, class62.field976, class284.field4764, class182.field3117);
                method860(true, class130.field2265);
                class307.method2121(21870, class231.field3984);
                class65.method417(1, new class65(), class203.field3497, class63.field982);
                class203.method1458((byte) 62, class63.field982, class203.field3497);
                class16.field144 = class129.field2253;
                class327.field5597 = 50;
                class249.method1794(0);
                class267.field4539 = 80;
            }
        } else if (class267.field4539 == 80) {
            int var24 = class263.method1871(class182.field3117, (byte) 4);
            int var25 = class296.method2045(arg0 - 4);
            if (var24 >= var25) {
                class227.method1618(false, class182.field3117);
                class16.field144 = class253.field4360;
                class267.field4539 = 90;
                class327.field5597 = 60;
            } else {
                class16.field144 = class29.method182(-6039, new class82[] { class241.field4182, class327.method2240((byte) -74, var24 * 100 / var25), class253.field4357 });
                class327.field5597 = 60;
            }
        } else if (class267.field4539 != 90) {
            if (arg0 != 4) {
                field2194 = (class82) null;
            }
            if (class267.field4539 == 100) {
                if (class17.method100(class182.field3117, -97)) {
                    class267.field4539 = 110;
                }
            } else if (class267.field4539 == 110) {
                class187.field3154 = new class56();
                class55.field881.method821(class187.field3154, 10, (byte) -34);
                class327.field5597 = 75;
                class16.field144 = class105.field1864;
                class267.field4539 = 120;
            } else if (class267.field4539 == 120) {
                if (class279.field4679.method1582(class81.field1396, class129.field2247, -56)) {
                    class73 var22 = new class73(class279.field4679.method1567(arg0 ^ 0x4, class81.field1396, class129.field2247));
                    class275.method1921(-1, var22);
                    class267.field4539 = 130;
                    class16.field144 = class286.field4815;
                    class327.field5597 = 80;
                } else {
                    class16.field144 = class29.method182(-6039, new class82[] { class198.field3387, class229.field3954 });
                    class327.field5597 = 80;
                }
            } else if (class267.field4539 == 130) {
                if (!class164.field2880.method1570(-20653)) {
                    class16.field144 = class29.method182(-6039, new class82[] { class84.field1503, class327.method2240((byte) -74, class164.field2880.method1602(arg0 + 25379) * 3 / 4), class253.field4357 });
                    class327.field5597 = 85;
                } else if (!class52.field846.method1570(-20653)) {
                    class16.field144 = class29.method182(-6039, new class82[] { class84.field1503, class327.method2240((byte) -74, class52.field846.method1602(arg0 + 25379) / 10 + 75), class253.field4357 });
                    class327.field5597 = 85;
                } else if (!class62.field976.method1570(arg0 ^ 0xFFFFAF57)) {
                    class16.field144 = class29.method182(-6039, new class82[] { class84.field1503, class327.method2240((byte) -74, (class62.field976.method1602(25383) / 20) + 85), class253.field4357 });
                    class327.field5597 = 85;
                } else if (class209.field3676.method1600(false, class109.field1941)) {
                    class101.method687(class272.field4584, class197.field3377, class27.field362, class166.field2903, class16.field147, (byte) 123, class209.field3676);
                    class295.method2033(class277.field4662);
                    class267.field4539 = 135;
                    class16.field144 = class254.field4377;
                    class327.field5597 = 95;
                } else {
                    class16.field144 = class29.method182(-6039, new class82[] { class84.field1503, class327.method2240((byte) -74, class209.field3676.method1572((byte) -91, class109.field1941) / 10 + 90), class253.field4357 });
                    class327.field5597 = 85;
                }
            } else if (class267.field4539 == 135) {
                int var23 = class277.method1930((byte) 107);
                if (var23 == -1) {
                    class16.field144 = class84.field1513;
                    class327.field5597 = 95;
                } else if (var23 == 7 || var23 == 9) {
                    this.method1178(arg0 - 128, "worldlistfull");
                    class292.method2014(28, 1000);
                } else if (class35.field572) {
                    class267.field4539 = 140;
                    class16.field144 = class60.field952;
                    class327.field5597 = 96;
                } else {
                    this.method1178(arg0 - 106, "worldlistio_" + var23);
                    class292.method2014(28, 1000);
                }
            } else if (class267.field4539 == 140) {
                class314.field5415 = class164.field2880.method1594(class192.field3242, -17);
                class184.field3134.method1578(65536, true, false);
                class33.field484.method1578(65536, true, true);
                class182.field3117.method1578(65536, true, true);
                class62.field976.method1578(65536, true, true);
                class279.field4679.method1578(65536, true, true);
                class164.field2880.method1578(65536, true, true);
                class327.field5597 = 97;
                class293.field4905 = true;
                class267.field4539 = 150;
                class16.field144 = class27.field356;
            } else if (class267.field4539 == 150) {
                class49.method350();
                if (class87.field1554) {
                    class146.field2467 = 0;
                    class61.field960 = 0;
                    class261.field4470 = 0;
                }
                class87.field1554 = true;
                class15.method82(true, class55.field881);
                class129.method898(false, (byte) 126, -1, -1, class261.field4470);
                class327.field5597 = 100;
                class267.field4539 = 160;
                class16.field144 = class4.field33;
            } else if (class267.field4539 == 160) {
                class300.method2072(false, true);
            }
        } else if (class119.field2103.method1570(-20653)) {
            class89 var21 = new class89(class267.field4535, class119.field2103, class182.field3117, 20, !class198.field3384);
            class102.method699(var21);
            if (class112.field2032 == 1) {
                class102.method706(0.9F);
            }
            if (class112.field2032 == 2) {
                class102.method706(0.8F);
            }
            if (class112.field2032 == 3) {
                class102.method706(0.7F);
            }
            if (class112.field2032 == 4) {
                class102.method706(0.6F);
            }
            class267.field4539 = 100;
            class16.field144 = class214.field3727;
            class327.field5597 = 70;
        } else {
            class16.field144 = class29.method182(-6039, new class82[] { class181.field3086, class327.method2240((byte) -74, class119.field2103.method1602(25383)), class253.field4357 });
            class327.field5597 = 70;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I", line = 1888)
    public static final int method864(byte arg0) {
        if (arg0 == -90) {
            field2190++;
            return class211.field3704 == 0 ? 0 : class112.field2018[class211.field3704].method63();
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V", line = 1903)
    private final void method865(boolean arg0, int arg1) {
        class244.field4238.field3362 = arg1;
        class244.field4238.field3361++;
        class219.field3802 = 0;
        class325.field5584 = null;
        class130.field2259 = null;
        if (arg0) {
            method867((class82) null, 60, true);
        }
        field2202++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLum;)Z", line = 1941)
    public static final boolean method866(int arg0, int arg1, byte arg2, class222 arg3) {
        if (arg2 != 49) {
            return false;
        }
        field2185++;
        byte[] var4 = arg3.method1577(arg1, arg0, -29569);
        if (var4 == null) {
            return false;
        } else {
            class123.method842(arg2 - 49, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhi;IZ)V", line = 1958)
    public static final void method867(class82 arg0, int arg1, boolean arg2) {
        if (arg1 != -3576) {
            method858((class82[]) null, 32);
        }
        field2181++;
        if (!arg2) {
            try {
                class261.field4471.getAppletContext().showDocument(arg0.method530((byte) 63, class261.field4471.getCodeBase()), "_top");
            } catch (Exception var6) {
            }
            return;
        }
        if (class147.field2485 && class127.field2231) {
            try {
                class162.method1171("openjs", class55.field881.field2109, new Object[] { arg0.method530((byte) 63, class261.field4471.getCodeBase()).toString() }, -2745);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class261.field4471.getAppletContext().showDocument(arg0.method530((byte) 63, class261.field4471.getCodeBase()), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lme;)Lme;", line = 2002)
    public static final class75 method868(class75 arg0) {
        int var1 = class87.method613(25134, method871(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class282.method1965(arg0.field1280, (byte) 6);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2030)
    public final void method869(boolean arg0) {
        field2198++;
        if (class61.field959 == 1000 || !arg0) {
            return;
        }
        boolean var2 = class199.method1396(0);
        if (var2 && class66.field1027 && class67.field1048 != null) {
            class67.field1048.method760(0);
        }
        if ((class61.field959 == 30 || class61.field959 == 10) && (class144.field2454 || class166.field2909 != 0L && class166.field2909 < class57.method391(19211))) {
            class129.method898(class144.field2454, (byte) 101, class93.field1660, class112.field2033, class284.method1972((byte) -128));
        }
        if (class48.field795 == null) {
            Container var3;
            if (class48.field795 != null) {
                var3 = class48.field795;
            } else if (class261.field4468 == null) {
                var3 = class55.field881.field2109;
            } else {
                var3 = class261.field4468;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class261.field4468 == var3) {
                Insets var6 = class261.field4468.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class196.field3337 != var4 || class166.field2902 != var5) {
                if (class120.field2119.startsWith("mac")) {
                    class196.field3337 = var4;
                    class166.field2902 = var5;
                } else {
                    class273.method1911(false);
                }
                class166.field2909 = class57.method391(19211) + 500L;
            }
        }
        if (class48.field795 != null && !class214.field3738 && (class61.field959 == 30 || class61.field959 == 10)) {
            class129.method898(false, (byte) 84, -1, -1, class261.field4470);
        }
        boolean var7 = false;
        if (class211.field3698) {
            class211.field3698 = false;
            var7 = true;
        }
        if (var7) {
            class61.method399(-14358);
        }
        if (class147.field2485) {
            for (int var8 = 0; var8 < 100; var8++) {
                class276.field4639[var8] = true;
            }
        }
        if (class61.field959 == 0) {
            class171.method1213((Color) null, 68, var7, class327.field5597, class16.field144);
        } else if (class61.field959 == 5) {
            class286.method1983(56, false, class253.field4354);
        } else if (class61.field959 == 10) {
            class111.method770(20925);
        } else if (class61.field959 == 25 || class61.field959 == 28) {
            if (class83.field1478 == 1) {
                if (class171.field2944 > class272.field4582) {
                    class272.field4582 = class171.field2944;
                }
                int var10 = (class272.field4582 - class171.field2944) * 50 / class272.field4582;
                class323.method2230(class29.method182(-6039, new class82[] { class289.field4847, class280.field4708, class327.method2240((byte) -74, var10), class13.field104 }), (byte) 85, false);
            } else if (class83.field1478 == 2) {
                if (class231.field3983 > class331.field5647) {
                    class331.field5647 = class231.field3983;
                }
                int var9 = ((class331.field5647 - class231.field3983) * 50 / class331.field5647) + 50;
                class323.method2230(class29.method182(-6039, new class82[] { class289.field4847, class280.field4708, class327.method2240((byte) -74, var9), class13.field104 }), (byte) 87, false);
            } else {
                class323.method2230(class289.field4847, (byte) 88, false);
            }
        } else if (class61.field959 == 30) {
            class209.method1502(13923);
        } else if (class61.field959 == 40) {
            class323.method2230(class29.method182(-6039, new class82[] { class198.field3382, class235.field4095, class293.field4921 }), (byte) 120, false);
        }
        if (class147.field2485 && class61.field959 != 0) {
            class147.method993();
            for (int var11 = 0; var11 < class254.field4381; var11++) {
                class302.field5151[var11] = false;
            }
        } else if ((class61.field959 == 30 || class61.field959 == 10) && class207.field3620 == 0 && !var7) {
            try {
                Graphics var12 = class122.field2134.getGraphics();
                for (int var13 = 0; var13 < class254.field4381; var13++) {
                    if (class302.field5151[var13]) {
                        class321.field5534.method1214(108, var12, class191.field3214[var13], class117.field2058[var13], class25.field339[var13], class290.field4880[var13]);
                        class302.field5151[var13] = false;
                    }
                }
            } catch (Exception var19) {
                class122.field2134.repaint();
            }
        } else if (class61.field959 != 0) {
            try {
                Graphics var15 = class122.field2134.getGraphics();
                class321.field5534.method1215(0, var15, 0, false);
                for (int var16 = 0; var16 < class254.field4381; var16++) {
                    class302.field5151[var16] = false;
                }
            } catch (Exception var18) {
                class122.field2134.repaint();
            }
        }
        if (class293.field4905) {
            class77.method490((byte) -127);
        }
        if (class87.field1554 && class61.field959 == 10 && class255.field4382 != -1) {
            class87.field1554 = false;
            class15.method82(true, class55.field881);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2252)
    public static final void main(String[] arg0) {
        field2192++;
        try {
            if (arg0.length != 4) {
                class29.method177("argument count", 1);
            }
            class61.field963 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class91.field1640 = 2;
            if (arg0[1].equals("live")) {
                class38.field657 = 0;
            } else if (arg0[1].equals("rc")) {
                class38.field657 = 1;
            } else if (arg0[1].equals("wip")) {
                class38.field657 = 2;
            } else {
                class29.method177("modewhat", 1);
            }
            class48.field802 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class27.method169(9556, class14.method78(var2.length, -124, 0, var2));
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class53.field856 = var1;
            } else if (arg0[2].equals("english")) {
                class53.field856 = 0;
            } else if (arg0[2].equals("german")) {
                class53.field856 = 1;
            } else {
                class29.method177("language", 1);
            }
            class234.method1668(class53.field856, -2);
            class124.field2166 = false;
            class14.field117 = false;
            if (arg0[3].equals("game0")) {
                class22.field307 = 0;
            } else if (arg0[3].equals("game1")) {
                class22.field307 = 1;
            } else {
                class29.method177("game", 1);
            }
            class80.field1361 = 0;
            class208.field3655 = false;
            class159.field2765 = class129.field2247;
            class273.field4608 = 0;
            client var4 = new client();
            class280.field4704 = var4;
            var4.method1183(28, "runescape", 10, 1024, 522, class38.field657 + 32, 768);
            class261.field4468.setLocation(40, 40);
        } catch (Exception var7) {
            class48.method348(-2, (String) null, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2332)
    public final void method870(byte arg0) {
        field2186++;
        method855(255);
        class82.method566((byte) 10);
        class295.method2035();
        class269.method1892(-13239);
        class296.method2049(0);
        class216.method1543(110);
        class109.method746(-4);
        class250.method1796(0);
        class163.method1180((byte) 7);
        class147.method998();
        class71.method450(-4856);
        class280.method1953(1);
        class56.method390(false);
        class84.method585(3);
        class153.method1096(-1338837512);
        class302.method2082(79);
        class196.method1374((byte) 86);
        class226.method1612((byte) -104);
        class220.method1555(false);
        class208.method1492(255);
        class222.method1581(0);
        class140.method954(0);
        class282.method1961(false);
        class317.method2176(-9386);
        class275.method1922(0);
        class209.method1508((byte) 121);
        class189.method1307(123);
        class75.method472(-1);
        class324.method2236((byte) -77);
        class81.method514((byte) 47);
        class277.method1929((byte) 78);
        class79.method504(14805);
        class139.method942(136);
        class126.method888((byte) -126);
        class106.method732(109);
        class86.method599(true);
        class203.method1459(256);
        class110.method763(false);
        class143.method975(-26365);
        class199.method1398(false);
        class35.method273(95);
        class93.method654((byte) 101);
        class16.method94(0);
        class181.method1264(-6);
        class233.method1658(0);
        class146.method987(-111);
        class117.method796(1);
        class262.method1867(-115);
        class293.method2018(121);
        class53.method371(80);
        class137.method934((byte) -97);
        class316.method2166(true);
        class193.method1340(86);
        class245.method1758((byte) 98);
        class33.method254((byte) 94);
        class228.method1626((byte) -99);
        class276.method1924((byte) 117);
        class32.method250(-103);
        class287.method1992((byte) 123);
        class150.method1033(128);
        class152.method1045(69);
        class80.method508((byte) 120);
        class219.method1549((byte) 90);
        class330.method2256(-106);
        class157.method1130(1699683306);
        class127.method892(-80);
        class234.method1667((byte) 50);
        class85.method597();
        class131.method906(true);
        class174.method1236();
        class22.method151(0);
        class30.method199();
        class312.method2154((byte) 111);
        class318.method2190();
        class26.method167(0);
        class133.method914(true);
        class267.method1887(123);
        class247.method1763(120);
        class6.method37();
        class177.method1254((byte) 73);
        class221.method1563((byte) -44);
        class101.method686(3494);
        class212.method1524(false);
        class18.method113();
        class261.method1863((byte) -128);
        class310.method2133(true);
        class158.method1135();
        class298.method2060(0);
        class215.method1533(1);
        class236.method1672((byte) 17);
        class70.method438();
        class2.method9();
        class300.method2078(-117);
        class165.method1189(4);
        class34.method263((byte) -23);
        class142.method966(0);
        class52.method370(0);
        class320.method2215();
        class198.method1385(true);
        class238.method1677(false);
        class51.method365(2);
        class329.method2253((byte) 90);
        class305.method2109(false);
        class272.method1901(88);
        class124.method851((byte) 51);
        class260.method1850(-1);
        class187.method1294((byte) 114);
        class92.method649((byte) 107);
        class31.method245(-27782);
        class290.method2003((byte) 41);
        class64.method413((byte) -8);
        class130.method901((byte) -121);
        class119.method810(7);
        class156.method1112(-108);
        class37.method290((byte) -9);
        class194.method1357(-2010785240);
        class65.method419(true);
        class204.method1460(false);
        class89.method631(4520);
        class36.method277((byte) -107);
        class281.method1957(30460);
        class102.method689();
        class73.method462((byte) 82);
        class44.method330(-2190);
        class161.method1167((byte) -14);
        class134.method918(236);
        class67.method423(false);
        class180.method1262((byte) -80);
        class49.method353();
        class292.method2012(false);
        class100.method685((byte) -60);
        class23.method156((byte) 88);
        class331.method2260((byte) -62);
        class175.method1252(113);
        class309.method2131(17426817);
        class306.method2118(6721);
        class108.method741();
        class69.method435((byte) 69);
        class60.method398(1);
        class90.method643(9937);
        class182.method1268(8);
        class123.method844(85);
        class72.method452(15134);
        class88.method617((byte) -38);
        class41.method316();
        class159.method1150((byte) 15);
        class294.method2020(27);
        class249.method1793((byte) 103);
        class135.method926((byte) -123);
        class266.method1883();
        class284.method1970(0);
        class248.method1780();
        class246.method1759();
        class297.method2059(1);
        class328.method2245(true);
        class327.method2239(-118);
        class227.method1617((byte) 114);
        class164.method1186(false);
        class241.method1733(89);
        class63.method407(true);
        if (arg0 <= 122) {
            field2194 = (class82) null;
        }
        class40.method310(true);
        class50.method357(907);
        class118.method807();
        class66.method422(-21296);
        class116.method794();
        class253.method1817(-77);
        class256.method1838((byte) -123);
        class38.method300(true);
        class168.method1206((byte) 75);
        class138.method941(-125);
        class259.method1846((byte) 91);
        class288.method1994((byte) -88);
        class160.method1158((byte) -103);
        class307.method2119(-4);
        class83.method579(0);
        class255.method1825(true);
        class271.method1900(0);
        class112.method774(-110);
        class17.method96(2859);
        class235.method1669(67);
        class229.method1632(55);
        class68.method428(-14986);
        class254.method1821((byte) -118);
        class285.method1978((byte) 95);
        class218.method1548(-2);
        class244.method1750(-720864496);
        class91.method647(-1);
        class257.method1842(24745);
        class76.method487();
        class192.method1334((byte) 125);
        class9.method62(-123);
        class273.method1913(true);
        class321.method2226(-100);
        class325.method2238((byte) 78);
        class202.method1416(134);
        class128.method896();
        class7.method44();
        class148.method1027();
        class27.method172((byte) -88);
        class114.method778((byte) -117);
        class178.method1258();
        class240.method1724();
        class5.method32(-120);
        class251.method1806();
        class299.method2066();
        class24.method158(-115);
        class232.method1646((byte) 83);
        class105.method725((byte) -84);
        class20.method139((byte) 76);
        class19.method133((byte) -56);
        class45.method331(127);
        class242.method1737(-1565092700);
        class205.method1475((byte) -125);
        class39.method304(64);
        class15.method90(24188);
        class167.method1201(-92);
        class291.method2010((byte) 41);
        class48.method346(0);
        class62.method404(false);
        class201.method1412(1);
        class265.method1882(106);
        class184.method1275(28576);
        class237.method1673((byte) 45);
        class311.method2135(-96);
        class217.method1544(127);
        class314.method2158(true);
        class279.method1946(2);
        class286.method1991((byte) -125);
        class122.method835(-99);
        class149.method1031(-1);
        class99.method680((byte) 58);
        class166.method1197((byte) 125);
        class47.method342((byte) -114);
        class289.method1996((byte) -98);
        class14.method76(-13);
        class95.method666(-61);
        class264.method1875(4080);
        class230.method1636(-109);
        class21.method147(83);
        class55.method386(-2);
        class104.method718((byte) 120);
        class78.method492(-66);
        class214.method1528(-12218);
        class43.method324((byte) 88);
        class283.method1967(35);
        class200.method1401(-82);
        class197.method1381(0);
        class195.method1362(2);
        class171.method1210(true);
        class308.method2126(-1);
        class136.method929((byte) 111);
        class107.method735(-16709);
        class98.method677((byte) -119);
        class129.method900((byte) 24);
        class191.method1333(21115);
        class54.method377(false);
        class207.method1483((byte) -128);
        class179.method1261(116);
        class144.method979((byte) 103);
        class87.method608(-79);
        class4.method27(3);
        class25.method164(3);
        class263.method1873((byte) 110);
        class315.method2161(true);
        class61.method401(-1);
        class42.method321((byte) 121);
        class74.method467(1);
        class224.method1604(-126);
        class29.method185(0);
        class183.method1272(-30885);
        class243.method1746((byte) -112);
        class231.method1638((byte) 126);
        class28.method175((byte) -31);
        class3.method20((byte) -58);
        class77.method491(7503);
        class111.method772(-10);
        class13.method75(-1);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lme;)I", line = 2622)
    public static final int method871(class75 arg0) {
        class259 var1 = (class259) class68.field1057.method507(((long) arg0.field1172 << 32) + (long) arg0.field1238, 602425312);
        return var1 == null ? arg0.field1270 : var1.field4431;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V", line = 2631)
    private final void method872(byte arg0) {
        field2200++;
        if (class71.field1093 < class244.field4238.field3361) {
            class255.field4393 = (class244.field4238.field3361 - 1) * 250;
            if (class255.field4393 > 3000) {
                class255.field4393 = 3000;
            }
            if (class92.field1643 == class39.field686) {
                class39.field686 = class203.field3530;
            } else {
                class39.field686 = class92.field1643;
            }
            if (class244.field4238.field3361 >= 2 && class244.field4238.field3362 == 6) {
                this.method1178(-118, "js5connect_outofdate");
                class61.field959 = 1000;
                return;
            }
            if (class244.field4238.field3361 >= 4 && class244.field4238.field3362 == -1) {
                this.method1178(-115, "js5crc");
                class61.field959 = 1000;
                return;
            }
            if (class244.field4238.field3361 >= 4 && (class61.field959 == 0 || class61.field959 == 5)) {
                if (class244.field4238.field3362 == 7 || class244.field4238.field3362 == 9) {
                    this.method1178(-117, "js5connect_full");
                } else if (class244.field4238.field3362 > 0) {
                    this.method1178(-104, "js5connect");
                } else {
                    this.method1178(-124, "js5io");
                }
                class61.field959 = 1000;
                return;
            }
        }
        class71.field1093 = class244.field4238.field3361;
        if (class255.field4393 > 0) {
            class255.field4393--;
            return;
        }
        try {
            if (class219.field3802 == 0) {
                class325.field5584 = class55.field881.method831(class39.field686, (byte) 118, class135.field2339);
                class219.field3802++;
            }
            if (class219.field3802 == 1) {
                if (class325.field5584.field5121 == 2) {
                    this.method865(false, 1000);
                    return;
                }
                if (class325.field5584.field5121 == 1) {
                    class219.field3802++;
                }
            }
            if (arg0 > -5) {
                field2197 = (int[]) null;
            }
            if (class219.field3802 == 2) {
                class130.field2259 = new class302((Socket) class325.field5584.field5122, class55.field881);
                class153 var2 = new class153(5);
                var2.method1075(15, -1);
                var2.method1065(178808912, 522);
                class130.field2259.method2083(true, 5, var2.field2598, 0);
                class219.field3802++;
                class33.field496 = class57.method391(19211);
            }
            if (class219.field3802 == 3) {
                if (class61.field959 == 0 || class61.field959 == 5 || class130.field2259.method2088((byte) 91) > 0) {
                    int var3 = class130.field2259.method2089(75);
                    if (var3 != 0) {
                        this.method865(false, var3);
                        return;
                    }
                    class219.field3802++;
                } else if (class57.method391(19211) - class33.field496 > 30000L) {
                    this.method865(false, 1001);
                    return;
                }
            }
            if (class219.field3802 == 4) {
                boolean var4 = class61.field959 == 5 || class61.field959 == 10 || class61.field959 == 28;
                class244.field4238.method1375((byte) -9, class130.field2259, !var4);
                class219.field3802 = 0;
                class325.field5584 = null;
                class130.field2259 = null;
            }
        } catch (IOException var6) {
            this.method865(false, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2796)
    private final void method873(int arg0) {
        field2193++;
        class180.field3074 = 0;
        if (arg0 != 9341) {
            field2194 = (class82) null;
        }
        while (class25.method166(true) && class180.field3074 < 128) {
            class101.field1803[class180.field3074] = class124.field2180;
            class99.field1785[class180.field3074] = class199.field3414;
            class180.field3074++;
        }
        class243.field4229++;
        if (class255.field4382 != -1) {
            class279.method1944(0, class180.field3078, 0, class255.field4382, (byte) 38, 0, 0, class260.field4462);
        }
        class157.field2726++;
        if (class147.field2485) {
            int var2 = 19137023;
            label190: for (int var3 = 0; var3 < 32768; var3++) {
                class275 var4 = class99.field1777[var3];
                if (var4 != null) {
                    byte var5 = var4.field4628.field4078;
                    if ((var5 & 0x2) > 0 && var4.field1674 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1723[0] = (var4.field1685 >> 7) + var6;
                            var4.field1720[0] = (var4.field1689 >> 7) + var7;
                            class180.field3071[class297.field5058].method1308(var4.method520(true), var4.field1685 >> 7, false, var4.method520(true), var4.field1689 >> 7, 0, (byte) -64);
                            if (var4.field1723[0] >= 0 && var4.field1723[0] <= (104 - var4.method520(true)) && var4.field1720[0] >= 0 && var4.field1720[0] <= 104 - var4.method520(true) && class180.field3071[class297.field5058].method1317(var4.field1720[0], var4.field1689 >> 7, var4.field1685 >> 7, var4.field1723[0], (byte) -77)) {
                                if (var4.method520(true) > 1) {
                                    for (int var8 = var4.field1723[0]; (var4.field1723[0] + var4.method520(true)) > var8; var8++) {
                                        for (int var9 = var4.field1720[0]; var9 < (var4.field1720[0] + var4.method520(true)); var9++) {
                                            if ((var2 & class180.field3071[class297.field5058].field3159[var8][var9]) != 0) {
                                                continue label190;
                                            }
                                        }
                                    }
                                }
                                var4.field1674 = 1;
                            }
                        }
                    }
                    class52.method369(8, var4);
                    class308.method2123(false, var4);
                    class177.method1257(var4, -3802);
                    class180.field3071[class297.field5058].method1301((byte) 98, var4.field1685 >> 7, var4.field1689 >> 7, false, var4.method520(true), var4.method520(true));
                }
            }
        }
        if (!class147.field2485) {
            class137.method935((byte) -104);
        } else if (class80.field1362 == 0 && class191.field3188 == 0) {
            if (class273.field4602 == 2) {
                class54.method381(30605);
            } else {
                class272.method1902(false);
            }
            if ((class219.field3792 >> 7) < 14 || class219.field3792 >> 7 >= 90 || class4.field32 >> 7 < 14 || class4.field32 >> 7 >= 90) {
                class87.method612((byte) -47);
            }
        }
        while (true) {
            class331 var10;
            class75 var17;
            class75 var18;
            do {
                var10 = (class331) class215.field3743.method1932(-1);
                if (var10 == null) {
                    while (true) {
                        class331 var11;
                        class75 var12;
                        class75 var13;
                        do {
                            var11 = (class331) class212.field3706.method1932(-1);
                            if (var11 == null) {
                                while (true) {
                                    class331 var14;
                                    class75 var15;
                                    class75 var16;
                                    do {
                                        var14 = (class331) class197.field3366.method1932(arg0 - 9342);
                                        if (var14 == null) {
                                            if (class194.field3290 != null) {
                                                class231.method1640((byte) 117);
                                            }
                                            if (class300.field5099 != null && class300.field5099.field5121 == 1) {
                                                if (class300.field5099.field5122 != null) {
                                                    method867(class15.field127, arg0 - 12917, class207.field3619);
                                                }
                                                class15.field127 = null;
                                                class300.field5099 = null;
                                                class207.field3619 = false;
                                            }
                                            if ((class212.field3708 % 1500) == 0) {
                                                class267.method1886(arg0 ^ 0x242D);
                                            }
                                            return;
                                        }
                                        var15 = var14.field5649;
                                        if (var15.field1238 < 0) {
                                            break;
                                        }
                                        var16 = class282.method1965(var15.field1280, (byte) 6);
                                    } while (var16 == null || var16.field1274 == null || var15.field1238 >= var16.field1274.length || var16.field1274[var15.field1238] != var15);
                                    class15.method92(var14, arg0 ^ 0x2449);
                                }
                            }
                            var12 = var11.field5649;
                            if (var12.field1238 < 0) {
                                break;
                            }
                            var13 = class282.method1965(var12.field1280, (byte) 6);
                        } while (var13 == null || var13.field1274 == null || var12.field1238 >= var13.field1274.length || var13.field1274[var12.field1238] != var12);
                        class15.method92(var11, 74);
                    }
                }
                var17 = var10.field5649;
                if (var17.field1238 < 0) {
                    break;
                }
                var18 = class282.method1965(var17.field1280, (byte) 6);
            } while (var18 == null || var18.field1274 == null || var18.field1274.length <= var17.field1238 || var18.field1274[var17.field1238] != var17);
            class15.method92(var10, -56);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3020)
    public final void init() {
        field2189++;
        if (!this.method1176((byte) -12)) {
            return;
        }
        class61.field963 = Integer.parseInt(this.getParameter("worldid"));
        class91.field1640 = Integer.parseInt(this.getParameter("modewhere"));
        if (class91.field1640 < 0 || class91.field1640 > 1) {
            class91.field1640 = 0;
        }
        class38.field657 = Integer.parseInt(this.getParameter("modewhat"));
        if (class38.field657 < 0 || class38.field657 > 2) {
            class38.field657 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class48.field802 = true;
        } else {
            class48.field802 = false;
        }
        try {
            class53.field856 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class53.field856 = 0;
        }
        class234.method1668(class53.field856, -2);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class14.field117 = true;
        } else {
            class14.field117 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class124.field2166 = true;
        } else {
            class124.field2166 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class22.field307 = 1;
        } else {
            class22.field307 = 0;
        }
        try {
            class80.field1361 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class80.field1361 = 0;
        }
        class159.field2765 = class276.field4642.method527((byte) -15, this);
        if (class159.field2765 == null) {
            class159.field2765 = class129.field2247;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class273.field4608 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class273.field4608 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class208.field3655 = true;
        } else {
            class208.field3655 = false;
        }
        class280.field4704 = this;
        this.method1182(class38.field657 + 32, -18804, 765, 503, 522);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lme;)Z", line = 3102)
    public static final boolean method874(class75 arg0) {
        if (class182.field3114) {
            if (method871(arg0) != 0) {
                return false;
            }
            if (arg0.field1184 == 0) {
                return false;
            }
        }
        return arg0.field1281;
    }
}

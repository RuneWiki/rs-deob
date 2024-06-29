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
public class client extends class282 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1887 = -1;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
    public static boolean field1895 = true;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Ljl;")
    public static class101 field1885;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lad;")
    public static class161 field1893;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field1906;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[[Z")
    public static boolean[][] field1884;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[[[B")
    public static byte[][][] field1894;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method780(int arg0) {
        field1900++;
        class268.method1798(765);
        class101.field1560 = new class46();
        class151.field2532 = new class115();
        if (class44.field691 != 0) {
            class9.field157 = new byte[50][];
        }
        class87.method576(class177.field2957, 87);
        if (class165.field2737 == 0) {
            class272.field4774 = this.getCodeBase().getHost();
            class79.field1237 = 43594;
            class71.field1120 = 443;
        } else if (class165.field2737 == 1) {
            class272.field4774 = this.getCodeBase().getHost();
            class71.field1120 = class43.field672 + 50000;
            class79.field1237 = class43.field672 + 40000;
        } else if (class165.field2737 == 2) {
            class79.field1237 = class43.field672 + 40000;
            class71.field1120 = class43.field672 + 50000;
            class272.field4774 = "127.0.0.1";
        }
        if (class207.field3500 == 3 && class165.field2737 != 2) {
            class74.field1164 = class43.field672;
        }
        class138.field2359 = class79.field1237;
        if (class132.field2221 == 1) {
            class73.field1147 = class196.field3333;
            class172.field2890 = class176.field2947;
            class56.field877 = true;
            class235.field4050 = class248.field4456;
            class41.field655 = class74.field1167;
        } else {
            class172.field2890 = class5.field86;
            class73.field1147 = class173.field2901;
            class41.field655 = class163.field2682;
            class235.field4050 = class4.field82;
        }
        class8.field134 = class79.field1237;
        class146.field2481 = class238.field4231 = class203.field3466 = class84.field1325 = new short[256];
        class48.field764 = class272.field4774;
        class291.field5130 = class71.field1120;
        if (arg0 > -11) {
            this.method796(113);
        }
        class26.field375 = class138.field2359;
        class278.method1868((byte) -70);
        class58.method417((byte) -37, class93.field1466);
        class4.method27((byte) -112, class93.field1466);
        class84.field1326 = class248.method1709(true);
        if (class84.field1326 != null) {
            class84.field1326.method198(-126, class93.field1466);
        }
        class167.field2779 = class207.field3500;
        try {
            if (class177.field2957.field3508 != null) {
                class267.field4671 = new class288(class177.field2957.field3508, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class147.field2492[var2] = new class288(class177.field2957.field3499[var2], 6000, 0);
                }
                class187.field3187 = new class288(class177.field2957.field3519, 6000, 0);
                class47.field741 = new class87(255, class267.field4671, class187.field3187, 500000);
                class169.field2818 = new class288(class177.field2957.field3502, 24, 0);
                class177.field2957.field3519 = null;
                class177.field2957.field3508 = null;
                class177.field2957.field3502 = null;
                class177.field2957.field3499 = null;
            }
        } catch (IOException var3) {
            class47.field741 = null;
            class267.field4671 = null;
            class169.field2818 = null;
            class187.field3187 = null;
        }
        if (class165.field2737 != 0) {
            class243.field4373 = true;
        }
        class4.field77 = class145.field2474;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public static final void method781(boolean arg0, byte arg1) {
        class107.field1676 = null;
        class190.field3265 = null;
        class74.field1163 = null;
        class177.field2961 = null;
        class27.field379 = null;
        class201.field3408 = null;
        field1888++;
        class27.field390 = null;
        class265.field4649 = null;
        class186.field3120 = null;
        if (arg1 != -75) {
            method781(false, (byte) -48);
        }
        class78.field1216 = 0;
        class260.field4607 = null;
        if (arg0 && class73.field1155 != null) {
            class213.field3685 = class73.field1155.field114;
        } else {
            class213.field3685 = null;
        }
        class73.field1155 = null;
        class64.field1045.method1573(117);
        class108.field1686 = null;
        class153.field2572 = -1;
        class60.field984 = null;
        class82.field1291 = -1;
        class241.field4310 = null;
        class78.field1213 = null;
        class35.field494 = null;
        class242.field4356 = null;
        class2.field39 = null;
        class146.field2477 = null;
        class85.field1330 = null;
        class7.field119 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method782(int arg0) {
        if (arg0 != 0) {
            field1885 = null;
        }
        field1892++;
        if (class7.field108 != null) {
            class7.field108.field3799 = false;
        }
        class7.field108 = null;
        if (class187.field3190 != null) {
            class187.field3190.method419((byte) -66);
            class187.field3190 = null;
        }
        class26.method152(class93.field1466, arg0 - 47);
        class173.method1161(class93.field1466, (byte) -104);
        if (class84.field1326 != null) {
            class84.field1326.method196(-37, class93.field1466);
        }
        class244.method1680(arg0 + 109);
        class71.method484((byte) 118);
        class84.field1326 = null;
        if (class36.field529 != null) {
            class36.field529.method931(arg0 - 6387);
        }
        if (class61.field1000 != null) {
            class61.field1000.method931(-6387);
        }
        class151.field2532.method826((byte) -79);
        class101.field1560.method302(false);
        try {
            if (class267.field4671 != null) {
                class267.field4671.method1925(false);
            }
            if (class147.field2492 != null) {
                for (int var2 = 0; var2 < class147.field2492.length; var2++) {
                    if (class147.field2492[var2] != null) {
                        class147.field2492[var2].method1925(false);
                    }
                }
            }
            if (class187.field3187 != null) {
                class187.field3187.method1925(false);
            }
            if (class169.field2818 != null) {
                class169.field2818.method1925(false);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lpe;)Lpe;")
    public static final class237 method783(class237 arg0) {
        int var1 = class48.method319(method787(arg0), 26853);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class156.method1066(-103, arg0.field4171);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)I")
    public static final int method784(int arg0, byte arg1, int arg2) {
        field1891++;
        int var3 = arg0 >>> 31;
        int var4 = 21 % ((37 - arg1) / 59);
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lpe;IIIIIII)V")
    public static final void method785(class237[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class237 var9 = arg0[var8];
            if (var9 != null && var9.field4171 == arg1 && (!var9.field4129 || var9.field4228 == 0 || var9.field4224 || method787(var9) != 0 || class247.field4432 == var9 || var9.field4175 == 1338) && (!var9.field4129 || !method789(var9))) {
                int var10 = var9.field4183 + arg6;
                int var11 = var9.field4074 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4228 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4067 + var10;
                    int var17 = var9.field4206 + var11;
                    if (var9.field4228 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class276.field4891 == var9) {
                    class53.field826 = true;
                    class259.field4578 = var10;
                    class216.field3722 = var11;
                }
                if (!var9.field4129 || var12 < var14 && var13 < var15) {
                    if (var9.field4228 == 0) {
                        if (!var9.field4129 && method789(var9) && class232.field3995 != var9) {
                            continue;
                        }
                        if (var9.field4219 && class26.field363 >= var12 && class268.field4689 >= var13 && class26.field363 < var14 && class268.field4689 < var15) {
                            for (class85 var18 = (class85) class21.field271.method1566(-3); var18 != null; var18 = (class85) class21.field271.method1570(3)) {
                                if (var18.field1347) {
                                    var18.method441(16773377);
                                    var18.field1346.field4137 = false;
                                }
                            }
                            if (class51.field800 == 0) {
                                class276.field4891 = null;
                                class247.field4432 = null;
                            }
                            class160.field2673 = false;
                        }
                    }
                    if (var9.field4129) {
                        boolean var19;
                        if (class26.field363 >= var12 && class268.field4689 >= var13 && class26.field363 < var14 && class268.field4689 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class104.field1620 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class32.field465 == 1 && class163.field2685 >= var12 && class110.field1837 >= var13 && class163.field2685 < var14 && class110.field1837 < var15) {
                            var21 = true;
                        }
                        if (class230.field3934 > 0 && var9.field4151 != null) {
                            for (int var22 = 0; var22 < var9.field4151.length; var22++) {
                                for (int var23 = 0; var23 < class230.field3934; var23++) {
                                    int var24 = var9.field4151[var22] & 0xFF;
                                    if (class215.field3717[var23] == var24) {
                                        if (var9.field4077 != null) {
                                            byte var25 = var9.field4077[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class158.field2625[86] || (var25 & 0x1) != 0 && !class158.field2625[82] || (var25 & 0x4) != 0 && !class158.field2625[81])) {
                                                continue;
                                            }
                                        }
                                        class98.method639(var9.field4211, class179.field2989, 166, var22 + 1, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class33.method192(var9, class163.field2685 - var10, 4096, class110.field1837 - var11);
                        }
                        if (class276.field4891 != null && class276.field4891 != var9 && var19 && class185.method1235(method787(var9), 109)) {
                            class13.field207 = var9;
                        }
                        if (class247.field4432 == var9) {
                            class95.field1494 = true;
                            class177.field2953 = var10;
                            class39.field630 = var11;
                        }
                        if (var9.field4224 || var9.field4175 != 0) {
                            if (var19 && class271.field4761 != 0 && var9.field4082 != null) {
                                class85 var26 = new class85();
                                var26.field1347 = true;
                                var26.field1346 = var9;
                                var26.field1340 = class271.field4761;
                                var26.field1339 = var9.field4082;
                                class21.field271.method1574(var26, 0);
                            }
                            if (class276.field4891 != null || class198.field3376 != null || class152.field2556 || var9.field4175 != 1400 && class160.field2673) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4175 != 0) {
                                if (var9.field4175 == 1337) {
                                    class60.field987 = var9;
                                    class121.method856(24665, var9);
                                    continue;
                                }
                                if (var9.field4175 == 1338) {
                                    if (var21) {
                                        class186.field3122 = class163.field2685 - var10;
                                        class126.field2105 = class110.field1837 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4175 == 1400) {
                                    class27.field379 = var9;
                                    if (var21) {
                                        if (class158.field2625[82] && class127.field2129 > 0) {
                                            int var27 = (int) ((double) (class163.field2685 - var10 - var9.field4067 / 2) * 2.0D / (double) class79.field1229);
                                            int var28 = (int) ((double) (class110.field1837 - var11 - var9.field4206 / 2) * 2.0D / (double) class79.field1229);
                                            int var29 = class217.field3738 + var27;
                                            int var30 = class28.field414 + var28;
                                            int var31 = class13.field205 + var29;
                                            int var32 = class118.field2004 + class228.field3921 - var30 - 1;
                                            class177.method1181(var31, 0, var32, 906);
                                            class169.method1131(-8);
                                            continue;
                                        }
                                        class160.field2673 = true;
                                        class242.field4361 = class26.field363;
                                        class222.field3822 = class268.field4689;
                                        class137.field2351 = class217.field3738;
                                        class100.field1549 = class28.field414;
                                        continue;
                                    }
                                    if (var20 && class160.field2673) {
                                        class123.method889(-120, (int) ((double) (class242.field4361 - class26.field363) * 2.0D / (double) class19.field252) + class137.field2351);
                                        class172.method1156((byte) 8, (int) ((double) (class222.field3822 - class268.field4689) * 2.0D / (double) class19.field252) + class100.field1549);
                                        continue;
                                    }
                                    class160.field2673 = false;
                                    continue;
                                }
                                if (var9.field4175 == 1401) {
                                    if (var20) {
                                        class22.method137(class268.field4689 - var11, 11855, var9.field4067, var9.field4206, class26.field363 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field4175 == 1402) {
                                    class121.method856(24665, var9);
                                    continue;
                                }
                            }
                            if (!var9.field4205 && var21) {
                                var9.field4205 = true;
                                if (var9.field4135 != null) {
                                    class85 var33 = new class85();
                                    var33.field1347 = true;
                                    var33.field1346 = var9;
                                    var33.field1332 = class163.field2685 - var10;
                                    var33.field1340 = class110.field1837 - var11;
                                    var33.field1339 = var9.field4135;
                                    class21.field271.method1574(var33, 0);
                                }
                            }
                            if (var9.field4205 && var20 && var9.field4143 != null) {
                                class85 var34 = new class85();
                                var34.field1347 = true;
                                var34.field1346 = var9;
                                var34.field1332 = class26.field363 - var10;
                                var34.field1340 = class268.field4689 - var11;
                                var34.field1339 = var9.field4143;
                                class21.field271.method1574(var34, 0);
                            }
                            if (var9.field4205 && !var20) {
                                var9.field4205 = false;
                                if (var9.field4114 != null) {
                                    class85 var35 = new class85();
                                    var35.field1347 = true;
                                    var35.field1346 = var9;
                                    var35.field1332 = class26.field363 - var10;
                                    var35.field1340 = class268.field4689 - var11;
                                    var35.field1339 = var9.field4114;
                                    class9.field154.method1574(var35, 0);
                                }
                            }
                            if (var20 && var9.field4097 != null) {
                                class85 var36 = new class85();
                                var36.field1347 = true;
                                var36.field1346 = var9;
                                var36.field1332 = class26.field363 - var10;
                                var36.field1340 = class268.field4689 - var11;
                                var36.field1339 = var9.field4097;
                                class21.field271.method1574(var36, 0);
                            }
                            if (!var9.field4137 && var19) {
                                var9.field4137 = true;
                                if (var9.field4095 != null) {
                                    class85 var37 = new class85();
                                    var37.field1347 = true;
                                    var37.field1346 = var9;
                                    var37.field1332 = class26.field363 - var10;
                                    var37.field1340 = class268.field4689 - var11;
                                    var37.field1339 = var9.field4095;
                                    class21.field271.method1574(var37, 0);
                                }
                            }
                            if (var9.field4137 && var19 && var9.field4184 != null) {
                                class85 var38 = new class85();
                                var38.field1347 = true;
                                var38.field1346 = var9;
                                var38.field1332 = class26.field363 - var10;
                                var38.field1340 = class268.field4689 - var11;
                                var38.field1339 = var9.field4184;
                                class21.field271.method1574(var38, 0);
                            }
                            if (var9.field4137 && !var19) {
                                var9.field4137 = false;
                                if (var9.field4208 != null) {
                                    class85 var39 = new class85();
                                    var39.field1347 = true;
                                    var39.field1346 = var9;
                                    var39.field1332 = class26.field363 - var10;
                                    var39.field1340 = class268.field4689 - var11;
                                    var39.field1339 = var9.field4208;
                                    class9.field154.method1574(var39, 0);
                                }
                            }
                            if (var9.field4202 != null) {
                                class85 var40 = new class85();
                                var40.field1346 = var9;
                                var40.field1339 = var9.field4202;
                                class89.field1419.method1574(var40, 0);
                            }
                            if (var9.field4161 != null && class239.field4262 > var9.field4179) {
                                if (var9.field4212 == null || class239.field4262 - var9.field4179 > 32) {
                                    class85 var45 = new class85();
                                    var45.field1346 = var9;
                                    var45.field1339 = var9.field4161;
                                    class21.field271.method1574(var45, 0);
                                } else {
                                    label546: for (int var41 = var9.field4179; var41 < class239.field4262; var41++) {
                                        int var42 = class60.field985[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field4212.length; var43++) {
                                            if (var9.field4212[var43] == var42) {
                                                class85 var44 = new class85();
                                                var44.field1346 = var9;
                                                var44.field1339 = var9.field4161;
                                                class21.field271.method1574(var44, 0);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field4179 = class239.field4262;
                            }
                            if (var9.field4203 != null && class178.field2968 > var9.field4149) {
                                if (var9.field4084 == null || class178.field2968 - var9.field4149 > 32) {
                                    class85 var50 = new class85();
                                    var50.field1346 = var9;
                                    var50.field1339 = var9.field4203;
                                    class21.field271.method1574(var50, 0);
                                } else {
                                    label522: for (int var46 = var9.field4149; var46 < class178.field2968; var46++) {
                                        int var47 = class73.field1148[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field4084.length; var48++) {
                                            if (var9.field4084[var48] == var47) {
                                                class85 var49 = new class85();
                                                var49.field1346 = var9;
                                                var49.field1339 = var9.field4203;
                                                class21.field271.method1574(var49, 0);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field4149 = class178.field2968;
                            }
                            if (var9.field4177 != null && class117.field1995 > var9.field4068) {
                                if (var9.field4092 == null || class117.field1995 - var9.field4068 > 32) {
                                    class85 var55 = new class85();
                                    var55.field1346 = var9;
                                    var55.field1339 = var9.field4177;
                                    class21.field271.method1574(var55, 0);
                                } else {
                                    label498: for (int var51 = var9.field4068; var51 < class117.field1995; var51++) {
                                        int var52 = class215.field3715[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4092.length; var53++) {
                                            if (var9.field4092[var53] == var52) {
                                                class85 var54 = new class85();
                                                var54.field1346 = var9;
                                                var54.field1339 = var9.field4177;
                                                class21.field271.method1574(var54, 0);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field4068 = class117.field1995;
                            }
                            if (var9.field4093 != null && class20.field267 > var9.field4099) {
                                if (var9.field4088 == null || class20.field267 - var9.field4099 > 32) {
                                    class85 var60 = new class85();
                                    var60.field1346 = var9;
                                    var60.field1339 = var9.field4093;
                                    class21.field271.method1574(var60, 0);
                                } else {
                                    label474: for (int var56 = var9.field4099; var56 < class20.field267; var56++) {
                                        int var57 = class180.field2994[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field4088.length; var58++) {
                                            if (var9.field4088[var58] == var57) {
                                                class85 var59 = new class85();
                                                var59.field1346 = var9;
                                                var59.field1339 = var9.field4093;
                                                class21.field271.method1574(var59, 0);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field4099 = class20.field267;
                            }
                            if (var9.field4178 != null && class80.field1240 > var9.field4196) {
                                if (var9.field4225 == null || class80.field1240 - var9.field4196 > 32) {
                                    class85 var65 = new class85();
                                    var65.field1346 = var9;
                                    var65.field1339 = var9.field4178;
                                    class21.field271.method1574(var65, 0);
                                } else {
                                    label450: for (int var61 = var9.field4196; var61 < class80.field1240; var61++) {
                                        int var62 = class94.field1481[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field4225.length; var63++) {
                                            if (var9.field4225[var63] == var62) {
                                                class85 var64 = new class85();
                                                var64.field1346 = var9;
                                                var64.field1339 = var9.field4178;
                                                class21.field271.method1574(var64, 0);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field4196 = class80.field1240;
                            }
                            if (class236.field4059 > var9.field4101 && var9.field4142 != null) {
                                class85 var66 = new class85();
                                var66.field1346 = var9;
                                var66.field1339 = var9.field4142;
                                class21.field271.method1574(var66, 0);
                            }
                            if (class218.field3750 > var9.field4101 && var9.field4105 != null) {
                                class85 var67 = new class85();
                                var67.field1346 = var9;
                                var67.field1339 = var9.field4105;
                                class21.field271.method1574(var67, 0);
                            }
                            if (class105.field1631 > var9.field4101 && var9.field4223 != null) {
                                class85 var68 = new class85();
                                var68.field1346 = var9;
                                var68.field1339 = var9.field4223;
                                class21.field271.method1574(var68, 0);
                            }
                            if (class8.field143 > var9.field4101 && var9.field4153 != null) {
                                class85 var69 = new class85();
                                var69.field1346 = var9;
                                var69.field1339 = var9.field4153;
                                class21.field271.method1574(var69, 0);
                            }
                            if (class280.field4950 > var9.field4101 && var9.field4106 != null) {
                                class85 var70 = new class85();
                                var70.field1346 = var9;
                                var70.field1339 = var9.field4106;
                                class21.field271.method1574(var70, 0);
                            }
                            var9.field4101 = class221.field3804;
                            if (var9.field4176 != null) {
                                for (int var71 = 0; var71 < class230.field3934; var71++) {
                                    class85 var72 = new class85();
                                    var72.field1346 = var9;
                                    var72.field1338 = class215.field3717[var71];
                                    var72.field1341 = class140.field2414[var71];
                                    var72.field1339 = var9.field4176;
                                    class21.field271.method1574(var72, 0);
                                }
                            }
                            if (class45.field707 && var9.field4070 != null) {
                                class85 var73 = new class85();
                                var73.field1346 = var9;
                                var73.field1339 = var9.field4070;
                                class21.field271.method1574(var73, 0);
                            }
                        }
                    }
                    if (!var9.field4129 && class276.field4891 == null && class198.field3376 == null && !class152.field2556) {
                        if ((var9.field4091 >= 0 || var9.field4182 != 0) && class26.field363 >= var12 && class268.field4689 >= var13 && class26.field363 < var14 && class268.field4689 < var15) {
                            if (var9.field4091 >= 0) {
                                class232.field3995 = arg0[var9.field4091];
                            } else {
                                class232.field3995 = var9;
                            }
                        }
                        if (var9.field4228 == 8 && class26.field363 >= var12 && class268.field4689 >= var13 && class26.field363 < var14 && class268.field4689 < var15) {
                            class184.field3097 = var9;
                        }
                        if (var9.field4090 > var9.field4206) {
                            class221.method1546(var9.field4090, var11, var9, var9.field4206, -93, class268.field4689, var9.field4067 + var10, class26.field363);
                        }
                    }
                    if (var9.field4228 == 0) {
                        method785(arg0, var9.field4211, var12, var13, var14, var15, var10 - var9.field4136, var11 - var9.field4122);
                        if (var9.field4194 != null) {
                            method785(var9.field4194, var9.field4211, var12, var13, var14, var15, var10 - var9.field4136, var11 - var9.field4122);
                        }
                        class190 var74 = (class190) class120.field2022.method992((byte) 125, (long) var9.field4211);
                        if (var74 != null) {
                            class118.method843(var14, var10, var13, var74.field3259, (byte) -117, var12, var11, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method786(boolean arg0) {
        field1903++;
        method793((byte) 95);
        class37.method262((byte) 98);
        class193.method1329();
        class180.method1192(!arg0);
        class56.method362((byte) 123);
        class175.method1173(16777215);
        class7.method44(5721);
        class4.method25(1031);
        class282.method1898((byte) -13);
        class235.method1615(-14869);
        class197.method1371(-116);
        class221.method1547(4);
        class134.method963((byte) -114);
        class187.method1273((byte) -128);
        class59.method428(300);
        class115.method828(120);
        class46.method306(-19893);
        class198.method1379(255);
        class270.method1811((byte) -93);
        class101.method681((byte) 69);
        class288.method1927(1);
        class202.method1407((byte) 121);
        class163.method1092(39);
        class247.method1707(arg0);
        class165.method1105(110);
        class237.method1620(true);
        class188.method1305(-38);
        class226.method1571((byte) 106);
        class140.method990(-120);
        class169.method1129(100);
        class42.method280(false);
        class225.method1563((byte) -110);
        class105.method696(-122);
        class108.method749(-66);
        class131.method932(false);
        class287.method1921((byte) -121);
        class285.method1907(arg0);
        class2.method11((byte) -72);
        class109.method759(-11);
        class111.method777(-11940);
        class81.method547(-4);
        class275.method1856((byte) -52);
        class190.method1313((byte) -33);
        class62.method442((byte) 3);
        class171.method1144(827732357);
        class44.method288(arg0);
        class181.method1198(118);
        class278.method1874(27);
        class184.method1231(1);
        class189.method1309(-31122);
        class243.method1675((byte) -99);
        class51.method335(true);
        class71.method483(-19248);
        class28.method164(true);
        class35.method205(95);
        class223.method1554((byte) -20);
        class95.method620(1);
        class104.method694((byte) -120);
        class98.method636((byte) 119);
        class162.method1091((byte) 114);
        class133.method951(147);
        class72.method490((byte) -5);
        class179.method1188((byte) -69);
        class211.method1479();
        class40.method270(8459);
        class241.method1663(50);
        class209.method1472();
        class19.method125(-26164);
        class125.method896(-1);
        class75.method501(!arg0);
        class32.method188(-105);
        class222.method1550(-10715);
        class94.method614(1723);
        class208.method1439(1);
        class183.method1210();
        class276.method1859((byte) -108);
        class170.method1138(-18502);
        class12.method85();
        class284.method1901((byte) -66);
        class45.method295(true);
        class173.method1162(0);
        class11.method78();
        class194.method1345(-23001);
        class244.method1679((byte) 56);
        class96.method625(-3);
        class73.method493((byte) 8);
        class122.method881();
        class146.method1014(true);
        class117.method837((byte) 45);
        class118.method840(-6);
        class291.method1947(2);
        class53.method342(-21458);
        class52.method337(-26143);
        class185.method1234(67);
        class92.method602((byte) -102);
        class152.method1043(91);
        class200.method1391(128);
        class78.method529(-1);
        class63.method448((byte) 80);
        class231.method1592((byte) 119);
        class203.method1415((byte) 1);
        class13.method96((byte) 102);
        class271.method1814(2159);
        class10.method57(arg0);
        class30.method177(0);
        class236.method1619((byte) -122);
        class252.method1725(0);
        class107.method720((byte) -71);
        class210.method1476((byte) 13);
        class76.method519();
        class279.method1877(1);
        class153.method1050(4194303);
        class127.method908(false);
        class138.method974(0);
        class17.method119(-103);
        class64.method452(0);
        class290.method1944(0);
        class280.method1881(-1);
        class178.method1183((byte) 77);
        class85.method563(true);
        class67.method463((byte) 97);
        class167.method1124(-9997);
        class27.method156(true);
        class256.method1743(119);
        class79.method533(0);
        class273.method1831((byte) 2);
        class239.method1640(-32400);
        class68.method471(true);
        class228.method1584((byte) 56);
        class164.method1097();
        class204.method1419((byte) -49);
        class272.method1822(0);
        class20.method128((byte) -37);
        class281.method1885(1);
        class172.method1157(119);
        class196.method1364((byte) -118);
        class240.method1644(-119);
        class274.method1842((byte) 0);
        class100.method650((byte) 69);
        class89.method590(0);
        class74.method495(1);
        class9.method51(-63);
        class255.method1739(1);
        class38.method268();
        class254.method1734(123);
        class145.method1011(124);
        class213.method1515(-1863420381);
        class116.method831(124);
        class232.method1599(0);
        class113.method805((byte) -128);
        class242.method1671(23578);
        class120.method851(-70);
        class47.method310(0);
        class139.method979(120);
        class112.method802(-141);
        class168.method1126(-14);
        class99.method645(58);
        class159.method1081(arg0);
        class129.method918(941741986);
        class259.method1756(-2);
        class39.method269((byte) 78);
        class234.method1609(-16348);
        class88.method584(6);
        class130.method922(-24165);
        class260.method1757(-2232);
        class148.method1023(1);
        class147.method1015(false);
        class66.method456(16);
        class261.method1766();
        class24.method146(6);
        class22.method134((byte) -126);
        class21.method130(2);
        class238.method1636(-12600);
        class77.method526(false);
        class93.method610((byte) -74);
        class283.method1899();
        class141.method994();
        class16.method117();
        class43.method284(0);
        class215.method1523(false);
        class220.method1535();
        class245.method1688();
        class158.method1075(false);
        class60.method432(-30804);
        class154.method1051(-24524);
        class18.method123((byte) -123);
        class218.method1533(-12223);
        class36.method209(0);
        class8.method47(4);
        class1.method7((byte) 113);
        class262.method1769((byte) -66);
        class123.method887(66);
        class230.method1587(-51);
        class182.method1200(0);
        class49.method323(true);
        class55.method360(65535);
        class286.method1917((byte) -127);
        class41.method275((byte) -71);
        class214.method1518((byte) 43);
        class137.method972((byte) 44);
        class248.method1711((byte) 21);
        class156.method1062(-463833396);
        class191.method1323((byte) -11);
        class233.method1605(0);
        class166.method1115(true);
        class124.method891(true);
        class174.method1163((byte) 55);
        class150.method1026(-28971);
        class84.method559((byte) 25);
        class23.method139(67);
        class267.method1792((byte) -71);
        class144.method1004(90);
        class263.method1778(22909);
        class80.method538(-1);
        class143.method1001(80);
        class277.method1863(49);
        class246.method1694(123);
        class86.method574((byte) 122);
        class119.method847(0);
        class29.method165(1);
        class249.method1716((byte) 59);
        class48.method318(-64);
        class126.method904(0);
        class257.method1750((byte) 101);
        class289.method1939(73);
        class269.method1800((byte) 127);
        class26.method149(64);
        class82.method554((byte) 127);
        class33.method195(125);
        class227.method1578((byte) 116);
        class199.method1385(2008214828);
        class151.method1031(5613);
        class5.method35(false);
        class177.method1182(-94);
        class176.method1177((byte) -109);
        class264.method1782(-32053);
        class50.method326((byte) -101);
        class201.method1397((byte) -95);
        class61.method435(-4612);
        class31.method182(false);
        class268.method1797(115);
        class83.method557((byte) -127);
        class25.method148((byte) -125);
        class102.method687((byte) -116);
        class160.method1085((byte) 121);
        class121.method857(-9);
        class265.method1786(false);
        class69.method478(-2);
        class186.method1240((byte) 80);
        class224.method1559(true);
        class217.method1527(-95);
        class58.method415(false);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lpe;)I")
    public static final int method787(class237 arg0) {
        class120 var1 = (class120) class179.field2984.method992((byte) 125, ((long) arg0.field4211 << 32) + (long) arg0.field4120);
        return var1 == null ? arg0.field4198 : var1.field2027;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method788(int arg0) {
        class230.field3934 = arg0;
        field1883++;
        while (class80.method541(124) && class230.field3934 < 128) {
            class215.field3717[class230.field3934] = class48.field758;
            class140.field2414[class230.field3934] = class241.field4287;
            class230.field3934++;
        }
        class259.field4588++;
        if (class234.field4044 != -1) {
            class118.method843(class249.field4479, 0, 0, class234.field4044, (byte) -122, 0, 0, class199.field3390);
        }
        class221.field3804++;
        class198.method1382((byte) -122);
        while (true) {
            class85 var2;
            class237 var3;
            class237 var4;
            do {
                var2 = (class85) class89.field1419.method1569((byte) -9);
                if (var2 == null) {
                    while (true) {
                        class85 var5;
                        class237 var6;
                        class237 var7;
                        do {
                            var5 = (class85) class9.field154.method1569((byte) -9);
                            if (var5 == null) {
                                while (true) {
                                    class85 var8;
                                    class237 var9;
                                    class237 var10;
                                    do {
                                        var8 = (class85) class21.field271.method1569((byte) -9);
                                        if (var8 == null) {
                                            if (class276.field4891 != null) {
                                                class172.method1158((byte) 49);
                                            }
                                            if (class123.field2070 != null && class123.field2070.field4488 == 1) {
                                                if (class123.field2070.field4483 != null) {
                                                    class234.method1608(class144.field2462, 4, class179.field2988);
                                                }
                                                class144.field2462 = null;
                                                class179.field2988 = false;
                                                class123.field2070 = null;
                                            }
                                            if ((class72.field1146 % 1500) == 0) {
                                                class181.method1197(17820);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1346;
                                        if (var9.field4120 < 0) {
                                            break;
                                        }
                                        var10 = class156.method1066(arg0 ^ 0xFFFFFFAA, var9.field4171);
                                    } while (var10 == null || var10.field4194 == null || var9.field4120 >= var10.field4194.length || var10.field4194[var9.field4120] != var9);
                                    class274.method1841(var8, arg0 ^ 0x7C);
                                }
                            }
                            var6 = var5.field1346;
                            if (var6.field4120 < 0) {
                                break;
                            }
                            var7 = class156.method1066(-92, var6.field4171);
                        } while (var7 == null || var7.field4194 == null || var6.field4120 >= var7.field4194.length || var7.field4194[var6.field4120] != var6);
                        class274.method1841(var5, -124);
                    }
                }
                var3 = var2.field1346;
                if (var3.field4120 < 0) {
                    break;
                }
                var4 = class156.method1066(-78, var3.field4171);
            } while (var4 == null || var4.field4194 == null || var4.field4194.length <= var3.field4120 || var4.field4194[var3.field4120] != var3);
            class274.method1841(var2, 44);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lpe;)Z")
    public static final boolean method789(class237 arg0) {
        if (class126.field2117) {
            if (method787(arg0) != 0) {
                return false;
            }
            if (arg0.field4228 == 0) {
                return false;
            }
        }
        return arg0.field4133;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method790(int arg0) {
        int var1 = class232.method1597(45);
        field1897++;
        if (arg0 >= -96) {
            field1887 = 54;
        }
        if (var1 == 0) {
            class62.field1014 = null;
            class46.method300(16, 0);
        } else if (var1 == 1) {
            class235.method1613(0, (byte) 0);
            class46.method300(16, 512);
            class48.method320((byte) 87);
        } else {
            class235.method1613(0, (byte) (class8.field137 - 4 & 0xFF));
            class46.method300(16, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method791(int arg0) {
        field1896++;
        if (class232.field4011 == 1000) {
            return;
        }
        class72.field1146++;
        if ((class72.field1146 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class248.field4453 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class252.field4502.setSeed((long) class248.field4453);
        }
        this.method792(97);
        if (arg0 > -111) {
            field1885 = null;
        }
        if (class8.field135 != null) {
            class8.field135.method1375((byte) 115);
        }
        class274.method1844(-128);
        class126.method898((byte) 83);
        class223.method1558(89);
        class278.method1869((byte) 33);
        if (class84.field1326 != null) {
            int var3 = class84.field1326.method197((byte) -58);
            class271.field4761 = var3;
        }
        if (class232.field4011 == 0) {
            this.method797((byte) -119);
            class18.method122(0);
        } else if (class232.field4011 == 5) {
            this.method797((byte) -95);
            class18.method122(0);
        } else if (class232.field4011 == 25 || class232.field4011 == 28) {
            class116.method830((byte) 20);
        }
        if (class232.field4011 == 10) {
            this.method788(0);
            class10.method62(-3);
            class36.method212(123);
            class278.method1873(126);
        } else if (class232.field4011 == 30) {
            class165.method1098(-20895);
        } else if (class232.field4011 == 40) {
            class278.method1873(126);
            if (class168.field2808 != -3) {
                if (class168.field2808 == 15) {
                    class267.method1794((byte) 83);
                    return;
                }
                if (class168.field2808 != 2) {
                    class241.method1658(0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method792(int arg0) {
        field1886++;
        boolean var2 = class151.field2532.method825(arg0 + 1);
        if (!var2) {
            this.method796(98);
        }
        if (arg0 != 97) {
            this.method786(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class175.method1172("argument count", (byte) -69);
            }
            class43.field672 = Integer.parseInt(arg0[0]);
            class165.field2737 = 2;
            if (arg0[1].equals("live")) {
                class44.field691 = 0;
            } else if (arg0[1].equals("rc")) {
                class44.field691 = 1;
            } else if (arg0[1].equals("wip")) {
                class44.field691 = 2;
            } else {
                class175.method1172("modewhat", (byte) -125);
            }
            int var1 = -1;
            class35.field501 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class223.method1555(30181, class80.method545(var2.length, 0, var2, (byte) -19));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class181.field3023 = var1;
            } else if (arg0[2].equals("english")) {
                class181.field3023 = 0;
            } else if (arg0[2].equals("german")) {
                class181.field3023 = 1;
            } else {
                class175.method1172("language", (byte) -72);
            }
            class130.method924((byte) -119, class181.field3023);
            class109.field1804 = false;
            class30.field440 = false;
            if (arg0[3].equals("game0")) {
                class132.field2221 = 0;
            } else if (arg0[3].equals("game1")) {
                class132.field2221 = 1;
            } else {
                class175.method1172("game", (byte) -109);
            }
            class40.field641 = 0;
            class88.field1399 = class179.field2989;
            class58.field930 = 0;
            class5.field85 = false;
            client var3 = new client();
            class133.field2291 = var3;
            var3.method1894(class44.field691 + 32, 1024, 28, "runescape", 768, 31878, 525);
            class71.field1114.setLocation(40, 40);
        } catch (Exception var6) {
            class200.method1392(58, (String) null, var6);
        }
        field1902++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method793(byte arg0) {
        field1894 = null;
        field1893 = null;
        field1885 = null;
        field1884 = null;
        if (arg0 < 47) {
            method783((class237) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Leg;ILjl;)Lff;")
    public static final class4 method794(class37 arg0, int arg1, class101 arg2) {
        int var3 = arg2.method652(arg0, 111);
        field1899++;
        if (arg1 != 24021) {
            method799(14L, false);
        }
        if (var3 == -1) {
            return new class4(0);
        }
        int[] var4 = arg2.method671(var3, (byte) 49);
        class4 var5 = new class4(var4.length);
        for (int var6 = 0; var6 < var5.field74; var6++) {
            class187 var7 = new class187(arg2.method666(var4[var6], var3, (byte) -51));
            var5.field67[var6] = var7.method1253(33);
            var5.field75[var6] = var7.method1269(255);
            var5.field69[var6] = (short) var7.method1244(false);
            var5.field68[var6] = (short) var7.method1244(false);
            var5.field72[var6] = var7.method1290((byte) 90);
        }
        return var5;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    private final void method795(boolean arg0, int arg1) {
        class167.field2798 = null;
        class134.field2333 = 0;
        class151.field2532.field1972 = arg1;
        if (!arg0) {
            this.method796(-69);
        }
        class291.field5117 = null;
        field1890++;
        class151.field2532.field1975++;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method796(int arg0) {
        field1905++;
        if (class190.field3264 < class151.field2532.field1975) {
            class190.field3267 = (class151.field2532.field1975 * 50 - 50) * 5;
            if (class8.field134 == class26.field375) {
                class26.field375 = class291.field5130;
            } else {
                class26.field375 = class8.field134;
            }
            if (class190.field3267 > 3000) {
                class190.field3267 = 3000;
            }
            if (class151.field2532.field1975 >= 2 && class151.field2532.field1972 == 6) {
                this.method1891(1, "js5connect_outofdate");
                class232.field4011 = 1000;
                return;
            }
            if (class151.field2532.field1975 >= 4 && class151.field2532.field1972 == -1) {
                this.method1891(1, "js5crc");
                class232.field4011 = 1000;
                return;
            }
            if (class151.field2532.field1975 >= 4 && (class232.field4011 == 0 || class232.field4011 == 5)) {
                if (class151.field2532.field1972 == 7 || class151.field2532.field1972 == 9) {
                    this.method1891(1, "js5connect_full");
                } else if (class151.field2532.field1972 > 0) {
                    this.method1891(1, "js5connect");
                } else {
                    this.method1891(1, "js5io");
                }
                class232.field4011 = 1000;
                return;
            }
        }
        class190.field3264 = class151.field2532.field1975;
        if (class190.field3267 > 0) {
            class190.field3267--;
            return;
        }
        try {
            if (class134.field2333 == 0) {
                class167.field2798 = class177.field2957.method1435(class48.field764, 116, class26.field375);
                class134.field2333++;
            }
            if (class134.field2333 == 1) {
                if (class167.field2798.field4488 == 2) {
                    this.method795(true, 1000);
                    return;
                }
                if (class167.field2798.field4488 == 1) {
                    class134.field2333++;
                }
            }
            if (class134.field2333 == 2) {
                class291.field5117 = new class59((Socket) class167.field2798.field4483, class177.field2957);
                class187 var2 = new class187(5);
                var2.method1292(15, (byte) -64);
                var2.method1272(27862, 525);
                class291.field5117.method420(var2.field3175, 0, 5, -13789);
                class134.field2333++;
                class68.field1070 = class149.method1024(-14898);
            }
            if (class134.field2333 == 3) {
                if (class232.field4011 == 0 || class232.field4011 == 5 || class291.field5117.method430(false) > 0) {
                    int var3 = class291.field5117.method426((byte) 41);
                    if (var3 != 0) {
                        this.method795(true, var3);
                        return;
                    }
                    class134.field2333++;
                } else if (class149.method1024(-14898) - class68.field1070 > 30000L) {
                    this.method795(true, 1001);
                    return;
                }
            }
            if (class134.field2333 == 4) {
                boolean var4 = class232.field4011 == 5 || class232.field4011 == 10 || class232.field4011 == 28;
                class151.field2532.method815(!var4, 0, class291.field5117);
                class134.field2333 = 0;
                class167.field2798 = null;
                class291.field5117 = null;
            }
        } catch (IOException var5) {
            this.method795(true, 1002);
        }
        if (arg0 < 97) {
            method784(101, (byte) 30, -74);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method797(byte arg0) {
        field1904++;
        if (!class285.field5024) {
            label233: while (true) {
                do {
                    if (!class80.method541(69)) {
                        break label233;
                    }
                } while (class241.field4287 != 115 && class241.field4287 != 83);
                class285.field5024 = true;
            }
        }
        if (class37.field543 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class149.method1024(-14898);
            if (class275.field4871 == 0L) {
                class275.field4871 = var4;
            }
            if (var3 > 16384 && var4 - class275.field4871 < 5000L) {
                if (var4 - class239.field4264 > 1000L) {
                    System.gc();
                    class239.field4264 = var4;
                }
                class202.field3456 = 5;
                class96.field1509 = class83.field1308;
            } else {
                class202.field3456 = 5;
                class96.field1509 = class223.field3831;
                class37.field543 = 10;
            }
        } else if (class37.field543 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class215.field3719[var6] = new class165(104, 104);
            }
            class96.field1509 = class86.field1361;
            class37.field543 = 30;
            class202.field3456 = 10;
        } else if (class37.field543 == 30) {
            if (class8.field135 == null) {
                class8.field135 = new class198(class151.field2532, class101.field1560);
            }
            if (class8.field135.method1381(93)) {
                class61.field998 = class257.method1748(true, false, true, 192, 0);
                class99.field1542 = class257.method1748(true, false, true, 192, 1);
                class278.field4922 = class257.method1748(false, true, true, 192, 2);
                class37.field547 = class257.method1748(true, false, true, 192, 3);
                class243.field4366 = class257.method1748(true, false, true, 192, 4);
                class50.field783 = class257.method1748(true, true, true, 192, 5);
                class92.field1449 = class257.method1748(true, true, false, 192, 6);
                class94.field1482 = class257.method1748(true, false, true, 192, 7);
                class124.field2086 = class257.method1748(true, false, true, 192, 8);
                field1885 = class257.method1748(true, false, true, 192, 9);
                class124.field2077 = class257.method1748(true, false, true, 192, 10);
                class74.field1169 = class257.method1748(true, false, true, 192, 11);
                class22.field291 = class257.method1748(true, false, true, 192, 12);
                class69.field1094 = class257.method1748(true, false, true, 192, 13);
                class187.field3186 = class257.method1748(true, false, false, 192, 14);
                class92.field1442 = class257.method1748(true, false, true, 192, 15);
                class187.field3201 = class257.method1748(true, false, true, 192, 16);
                class69.field1092 = class257.method1748(true, false, true, 192, 17);
                class100.field1555 = class257.method1748(true, false, true, 192, 18);
                class235.field4049 = class257.method1748(true, false, true, 192, 19);
                class55.field832 = class257.method1748(true, false, true, 192, 20);
                class64.field1042 = class257.method1748(true, false, true, 192, 21);
                class248.field4462 = class257.method1748(true, false, true, 192, 22);
                class215.field3714 = class257.method1748(true, true, true, 192, 23);
                class270.field4736 = class257.method1748(true, false, true, 192, 24);
                class143.field2436 = class257.method1748(true, false, true, 192, 25);
                class2.field21 = class257.method1748(true, true, true, 192, 26);
                class29.field431 = class257.method1748(true, false, true, 192, 27);
                class202.field3456 = 15;
                class96.field1509 = class154.field2596;
                class37.field543 = 40;
            } else {
                class96.field1509 = class19.field256;
                class202.field3456 = 12;
            }
        } else if (class37.field543 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class227.field3902[var8].method1807(-20707) * class163.field2692[var8] / 100;
            }
            if (var7 == 100) {
                class202.field3456 = 20;
                class96.field1509 = class7.field122;
                class267.method1790(-1, class124.field2086);
                class273.method1828(4234, class124.field2086);
                class27.method158(true, class124.field2086);
                class37.field543 = 45;
            } else {
                if (var7 != 0) {
                    class96.field1509 = class156.method1061((byte) -81, new class37[] { class291.field5123, class163.method1096(var7, (byte) -35), class162.field2680 });
                }
                class202.field3456 = 20;
            }
        } else if (class37.field543 == 45) {
            class204.method1420(class144.field2467, 22050, 23288, 2);
            class281.field4952 = new class108();
            class281.field4952.method738((byte) -57, 9, 128);
            class36.field529 = class254.method1736(class93.field1466, 0, class177.field2957, 22050, (byte) 60);
            class36.field529.method937(16883, class281.field4952);
            class201.method1394(class187.field3186, class281.field4952, class92.field1442, (byte) -116, class243.field4366);
            class61.field1000 = class254.method1736(class93.field1466, 1, class177.field2957, 2048, (byte) 60);
            class127.field2127 = new class212();
            class61.field1000.method937(16883, class127.field2127);
            class152.field2557 = new class287(22050, class215.field3720);
            class1.field3 = class92.field1449.method652(class51.field799, 114);
            class202.field3456 = 30;
            class37.field543 = 50;
            class96.field1509 = class181.field3022;
        } else if (class37.field543 == 50) {
            int var9 = class51.method334(class69.field1094, -117, class124.field2086);
            int var10 = class289.method1935((byte) -81);
            if (var10 > var9) {
                class96.field1509 = class156.method1061((byte) -96, new class37[] { class182.field3046, class163.method1096(var9 * 100 / var10, (byte) -35), class162.field2680 });
                class202.field3456 = 35;
            } else {
                class96.field1509 = class129.field2144;
                class202.field3456 = 35;
                class37.field543 = 60;
            }
        } else if (class37.field543 == 60) {
            int var11 = class47.method315(class124.field2086, -1);
            int var12 = class21.method132(-1);
            if (var11 < var12) {
                class96.field1509 = class156.method1061((byte) 68, new class37[] { class30.field443, class163.method1096(var11 * 100 / var12, (byte) -35), class162.field2680 });
                class202.field3456 = 40;
            } else {
                class202.field3456 = 40;
                class37.field543 = 65;
                class96.field1509 = class150.field2527;
            }
        } else if (class37.field543 == 65) {
            class198.method1372(class69.field1094, 91, class124.field2086);
            class96.field1509 = class1.field10;
            class202.field3456 = 45;
            class102.method683(5, false);
            class37.field543 = 70;
        } else if (class37.field543 == 70) {
            class278.field4922.method651(-115);
            byte var13 = 0;
            int var14 = var13 + class278.field4922.method677(105);
            class187.field3201.method651(-126);
            int var15 = var14 + class187.field3201.method677(117);
            class69.field1092.method651(52);
            int var16 = var15 + class69.field1092.method677(115);
            class100.field1555.method651(35);
            int var17 = var16 + class100.field1555.method677(121);
            class235.field4049.method651(-123);
            int var18 = var17 + class235.field4049.method677(82);
            class55.field832.method651(-122);
            int var19 = var18 + class55.field832.method677(123);
            class64.field1042.method651(29);
            int var20 = var19 + class64.field1042.method677(64);
            class248.field4462.method651(55);
            int var21 = var20 + class248.field4462.method677(71);
            class270.field4736.method651(117);
            int var22 = var21 + class270.field4736.method677(125);
            class143.field2436.method651(-127);
            int var23 = var22 + class143.field2436.method677(66);
            class29.field431.method651(-114);
            int var24 = var23 + class29.field431.method677(108);
            if (var24 < 1100) {
                class96.field1509 = class156.method1061((byte) -100, new class37[] { class10.field167, class163.method1096(var24 / 11, (byte) -35), class162.field2680 });
                class202.field3456 = 50;
            } else {
                class112.method801(116, class278.field4922);
                class87.method575((byte) -128, class278.field4922);
                class174.method1164(class278.field4922, 207094343);
                class27.method155(false, class94.field1482, class278.field4922);
                class144.method1002(true, 12285, class187.field3201, class94.field1482);
                class273.method1829(class100.field1555, (byte) 87, class94.field1482);
                class31.method184(true, class94.field1482, class271.field4755, class235.field4049, true);
                class59.method424(18, class278.field4922);
                class257.method1749(0, class55.field832, class99.field1542, class61.field998);
                class268.method1796(0, class64.field1042, class94.field1482);
                class49.method322(true, class248.field4462);
                class44.method289(47, class278.field4922);
                class189.method1311(class124.field2086, class94.field1482, false, class37.field547, class69.field1094);
                class130.method926(class278.field4922, (byte) -115);
                class72.method491(1, class69.field1092);
                class68.method473(class270.field4736, (byte) -46, class143.field2436, new class236());
                class47.method311(class143.field2436, (byte) -126, class270.field4736);
                class202.field3456 = 50;
                class96.field1509 = class62.field1024;
                class119.method849(0);
                class37.field543 = 80;
            }
        } else if (class37.field543 == 80) {
            int var25 = class74.method497(class124.field2086, 1);
            int var26 = class275.method1851((byte) 20);
            if (var26 > var25) {
                class96.field1509 = class156.method1061((byte) 99, new class37[] { class280.field4948, class163.method1096(var25 * 100 / var26, (byte) -35), class162.field2680 });
                class202.field3456 = 60;
            } else {
                class121.method855(class124.field2086, (byte) -101);
                class96.field1509 = class233.field4032;
                class202.field3456 = 60;
                class37.field543 = 90;
            }
        } else if (class37.field543 == 90) {
            if (class2.field21.method651(-121)) {
                class107 var27 = new class107(field1885, class2.field21, class124.field2086, 20, !class31.field461);
                class76.method504(var27);
                if (class68.field1088 == 1) {
                    class76.method516(0.9F);
                }
                if (class68.field1088 == 2) {
                    class76.method516(0.8F);
                }
                if (class68.field1088 == 3) {
                    class76.method516(0.7F);
                }
                if (class68.field1088 == 4) {
                    class76.method516(0.6F);
                }
                class202.field3456 = 70;
                class37.field543 = 100;
                class96.field1509 = class61.field1002;
            } else {
                class96.field1509 = class156.method1061((byte) -124, new class37[] { class24.field310, class163.method1096(class2.field21.method677(66), (byte) -35), class162.field2680 });
                class202.field3456 = 70;
            }
        } else if (class37.field543 == 100) {
            if (class126.method901(class124.field2086, (byte) -89)) {
                class37.field543 = 110;
            }
        } else if (class37.field543 == 110) {
            class7.field108 = new class221();
            class177.field2957.method1423(class7.field108, 116, 10);
            class202.field3456 = 75;
            class37.field543 = 120;
            class96.field1509 = class147.field2499;
        } else if (class37.field543 == 120) {
            if (class124.field2077.method673(class152.field2560, -29616, class179.field2989)) {
                class279 var28 = new class279(class124.field2077.method660(class152.field2560, (byte) -88, class179.field2989));
                class246.method1693(219823489, var28);
                class202.field3456 = 80;
                class96.field1509 = class145.field2475;
                class37.field543 = 130;
            } else {
                class96.field1509 = class156.method1061((byte) 112, new class37[] { class181.field3032, class88.field1398 });
                class202.field3456 = 80;
            }
        } else if (class37.field543 == 130) {
            if (!class37.field547.method651(100)) {
                class96.field1509 = class156.method1061((byte) 70, new class37[] { class137.field2352, class163.method1096(class37.field547.method677(67) * 3 / 4, (byte) -35), class162.field2680 });
                class202.field3456 = 85;
            } else if (!class22.field291.method651(-122)) {
                class96.field1509 = class156.method1061((byte) -69, new class37[] { class137.field2352, class163.method1096(class22.field291.method677(87) / 10 + 75, (byte) -35), class162.field2680 });
                class202.field3456 = 85;
            } else if (!class69.field1094.method651(-113)) {
                class96.field1509 = class156.method1061((byte) 48, new class37[] { class137.field2352, class163.method1096(class69.field1094.method677(108) / 20 + 85, (byte) -35), class162.field2680 });
                class202.field3456 = 85;
            } else if (class215.field3714.method678(class69.field1109, 0)) {
                class33.method194(class215.field3714, class182.field3043, (byte) 117, class139.field2370, class96.field1497, class288.field5080, class104.field1621);
                class193.method1337(class29.field431);
                class202.field3456 = 95;
                class96.field1509 = class249.field4480;
                class37.field543 = 135;
            } else {
                class96.field1509 = class156.method1061((byte) -56, new class37[] { class137.field2352, class163.method1096(class215.field3714.method657(-25325, class69.field1109) / 10 + 90, (byte) -35), class162.field2680 });
                class202.field3456 = 85;
            }
        } else if (class37.field543 == 135) {
            int var29 = class81.method546(false);
            if (var29 == -1) {
                class96.field1509 = class72.field1136;
                class202.field3456 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method1891(1, "worldlistfull");
                class102.method683(1000, false);
            } else if (class80.field1258) {
                class37.field543 = 140;
                class96.field1509 = class93.field1456;
                class202.field3456 = 96;
            } else {
                this.method1891(1, "worldlistio_" + var29);
                class102.method683(1000, false);
            }
        } else if (class37.field543 == 140) {
            class62.field1016 = class37.field547.method652(class130.field2161, 105);
            class50.field783.method665(true, false, (byte) 72);
            class92.field1449.method665(true, true, (byte) 35);
            class124.field2086.method665(true, true, (byte) 105);
            class69.field1094.method665(true, true, (byte) 91);
            class124.field2077.method665(true, true, (byte) 97);
            class37.field547.method665(true, true, (byte) 81);
            class202.field3456 = 97;
            class96.field1509 = class278.field4923;
            class37.field543 = 150;
            class223.field3835 = true;
        } else if (class37.field543 == 150) {
            if (class285.field5024) {
                class121.field2037 = 0;
                class24.field315 = 0;
                class74.field1162 = 0;
            }
            class285.field5024 = true;
            class79.method532(class177.field2957, true);
            class80.method540(-1, class121.field2037, false, 19661088, -1);
            class202.field3456 = 100;
            class96.field1509 = class22.field287;
            class37.field543 = 160;
        } else if (class37.field543 == 160) {
            class180.method1190(true, true);
        } else if (arg0 > -73) {
            field1885 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method798(int arg0) {
        field1901++;
        if (class232.field4011 == 1000) {
            return;
        }
        boolean var2 = class75.method499((byte) -27);
        if (var2 && class108.field1720 && class36.field529 != null) {
            class36.field529.method935(arg0 ^ 0xFFFFB636);
        }
        if ((class232.field4011 == 30 || class232.field4011 == 10) && (class204.field3483 || class116.field1982 != 0L && class116.field1982 < class149.method1024(arg0 + 15512))) {
            class80.method540(class116.field1983, class130.method921(arg0 ^ 0x7689), class204.field3483, 19661088, class35.field492);
        }
        if (class112.field1911 == null) {
            Container var3;
            if (class112.field1911 != null) {
                var3 = class112.field1911;
            } else if (class71.field1114 == null) {
                var3 = class177.field2957.field3504;
            } else {
                var3 = class71.field1114;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class71.field1114 == var3) {
                Insets var6 = class71.field1114.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class131.field2193 != var4 || class37.field549 != var5) {
                if (class207.field3506.startsWith("mac")) {
                    class37.field549 = var5;
                    class131.field2193 = var4;
                } else {
                    class268.method1798(arg0 + 31175);
                }
                class116.field1982 = class149.method1024(-14898) + 500L;
            }
        }
        boolean var7 = false;
        if (class190.field3268) {
            class190.field3268 = false;
            var7 = true;
        }
        if (var7) {
            class234.method1607(11);
        }
        if (class232.field4011 == 0) {
            class120.method850((Color) null, class96.field1509, var7, 23931, class202.field3456);
        } else if (class232.field4011 == 5) {
            class59.method427(false, 2, class180.field3002);
        } else if (class232.field4011 == 10) {
            class66.method459(false);
        } else if (class232.field4011 == 25 || class232.field4011 == 28) {
            if (class171.field2881 == 1) {
                if (class52.field814 > class115.field1960) {
                    class115.field1960 = class52.field814;
                }
                int var8 = (class115.field1960 - class52.field814) * 50 / class115.field1960;
                class115.method824((byte) 92, class156.method1061((byte) -127, new class37[] { class228.field3926, class170.field2835, class163.method1096(var8, (byte) -35), class79.field1220 }), false);
            } else if (class171.field2881 == 2) {
                if (class288.field5088 < class137.field2353) {
                    class288.field5088 = class137.field2353;
                }
                int var9 = ((class288.field5088 - class137.field2353) * 50 / class288.field5088) + 50;
                class115.method824((byte) 70, class156.method1061((byte) -119, new class37[] { class228.field3926, class170.field2835, class163.method1096(var9, (byte) -35), class79.field1220 }), false);
            } else {
                class115.method824((byte) 76, class228.field3926, false);
            }
        } else if (class232.field4011 == 30) {
            class110.method772((byte) -75);
        } else if (class232.field4011 == 40) {
            class115.method824((byte) -65, class156.method1061((byte) -111, new class37[] { class29.field419, class98.field1520, class93.field1468 }), false);
        }
        if ((class232.field4011 == 30 || class232.field4011 == 10) && class147.field2495 == 0 && !var7) {
            try {
                Graphics var10 = class93.field1466.getGraphics();
                for (int var11 = 0; var11 < class216.field3723; var11++) {
                    if (class255.field4528[var11]) {
                        class276.field4897.method927(class277.field4908[var11], class243.field4372[var11], var10, class36.field524[var11], (byte) -108, class13.field213[var11]);
                        class255.field4528[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class93.field1466.repaint();
            }
        } else if (class232.field4011 != 0) {
            try {
                Graphics var12 = class93.field1466.getGraphics();
                class276.field4897.method920((byte) -113, var12, 0, 0);
                for (int var13 = 0; var13 < class216.field3723; var13++) {
                    class255.field4528[var13] = false;
                }
            } catch (Exception var14) {
                class93.field1466.repaint();
            }
        }
        if (arg0 != -30410) {
            return;
        }
        if (class223.field3835) {
            class129.method917(true);
        }
        if (class285.field5024 && class232.field4011 == 10 && class234.field4044 != -1) {
            class285.field5024 = false;
            class79.method532(class177.field2957, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1882++;
        if (!this.method1892(1)) {
            return;
        }
        class43.field672 = Integer.parseInt(this.getParameter("worldid"));
        class165.field2737 = Integer.parseInt(this.getParameter("modewhere"));
        if (class165.field2737 < 0 || class165.field2737 > 1) {
            class165.field2737 = 0;
        }
        class44.field691 = Integer.parseInt(this.getParameter("modewhat"));
        if (class44.field691 < 0 || class44.field691 > 2) {
            class44.field691 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class35.field501 = true;
        } else {
            class35.field501 = false;
        }
        try {
            class181.field3023 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class181.field3023 = 0;
        }
        class130.method924((byte) -119, class181.field3023);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class109.field1804 = true;
        } else {
            class109.field1804 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class30.field440 = true;
        } else {
            class30.field440 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class132.field2221 = 1;
        } else {
            class132.field2221 = 0;
        }
        try {
            class40.field641 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class40.field641 = 0;
        }
        class88.field1399 = class35.field499.method230(-123, this);
        if (class88.field1399 == null) {
            class88.field1399 = class179.field2989;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class58.field930 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class58.field930 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class5.field85 = true;
        } else {
            class5.field85 = false;
        }
        class133.field2291 = this;
        this.method1887(503, 1, 765, 525, class44.field691 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)Leg;")
    public static final class37 method799(long arg0, boolean arg1) {
        field1889++;
        if (!arg1) {
            field1893 = null;
        }
        return class228.method1585(arg0, 10, false, false);
    }
}

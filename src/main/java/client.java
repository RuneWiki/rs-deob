import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Random;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class98 {

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lhj;")
    public static class69 field2810 = class181.method1318("www)2wtrc", (byte) -123);

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lhj;")
    private static class69 field2819 = class181.method1318("K", (byte) -115);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lhj;")
    public static class69 field2815 = field2819;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Lhj;")
    public static class69 field2824 = field2819;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
    public static int[] field2808;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method734(byte arg0) {
        field2809++;
        if (class268.field4760 == 1000) {
            return;
        }
        class180.field3272++;
        if (class180.field3272 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class110.field2102 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class32.field439.setSeed((long) class110.field2102);
        }
        this.method1152((byte) -27);
        if (class138.field2586 != null) {
            class138.field2586.method1462(-8607);
        }
        class62.method372((byte) 10);
        class17.method105(-117);
        class103.method757(false);
        if (arg0 <= 80) {
            return;
        }
        class240.method1696((byte) 30);
        if (class106.field2002 != null) {
            int var3 = class106.field2002.method898((byte) 73);
            class179.field3260 = var3;
        }
        if (class268.field4760 == 0) {
            this.method1143(40);
            class88.method630((byte) -91);
        } else if (class268.field4760 == 5) {
            this.method1143(40);
            class88.method630((byte) -71);
        } else if (class268.field4760 == 25 || class268.field4760 == 28) {
            class136.method1022((byte) 69);
        }
        if (class268.field4760 == 10) {
            this.method1140(128);
            class149.method1121(-10963);
            class204.method1477(-2);
        } else if (class268.field4760 == 30) {
            class80.method572(81);
            return;
        } else if (class268.field4760 == 40) {
            class204.method1477(-2);
            if (class265.field4718 != -3) {
                if (class265.field4718 == 15) {
                    class273.method1865(-9435);
                } else if (class265.field4718 != 2) {
                    class33.method178(17300);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltk;)Ltk;")
    public static final class50 method1138(class50 arg0) {
        int var1 = class207.method1503(method1141(arg0), (byte) 117);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = method1144((byte) -9, arg0.field778);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2806++;
        int var11 = arg5 - arg2;
        if (arg5 < class22.field306) {
            var11++;
        }
        int var12 = arg3 - arg8;
        if (class84.field1626 > arg3) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var44 = arg9 + (arg1 * var13) >> 16;
            int var45 = arg9 + ((var13 + 1) * arg1) >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg8 + var13 >> 6;
                if (var47 >= 0 && (class64.field1243.length - 1) >= var47) {
                    int var48 = arg6 + var45;
                    int var49 = arg6 + var44;
                    int[][] var50 = class64.field1243[var47];
                    byte[][] var51 = class51.field904[var47];
                    byte[][] var52 = class114.field2182[var47];
                    byte[][] var53 = class65.field1260[var47];
                    byte[][] var54 = class66.field1265[var47];
                    byte[][] var55 = class168.field3098[var47];
                    for (int var56 = 0; var56 < var11; var56++) {
                        int var57 = arg4 + (arg10 * var56) >> 16;
                        int var58 = (var56 + 1) * arg10 + arg4 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg7 + var57;
                            int var61 = arg7 + var58;
                            int var62 = arg2 + var56 >> 6;
                            int var63 = arg2 + var56 & 0x3F;
                            int var64 = arg8 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var62 < 0 || var62 > var50.length - 1 || var50[var62] == null) {
                                if (class21.field299.field706 != -1) {
                                    var66 = class21.field299.field706;
                                } else if ((arg2 + var56 & 0x4) == (arg8 + var13 & 0x4)) {
                                    var66 = class89.field1690[class40.field574 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var62 < 0 || (var50.length - 1) < var62) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class15.method77(var49, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var62][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var51[var62] == null ? 0 : class89.field1690[var51[var62][var65] & 0xFF];
                            int var68 = var52[var62] == null ? 0 : class89.field1690[var52[var62][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class15.method77(var49, var60, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    byte var69 = var54[var62] == null ? 0 : var54[var62][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class15.method77(var49, var60, var46, var59, var67);
                                    } else {
                                        class131.method969(var70 >> 2, var67, var49, var59, class15.field201, var46, var69 & 0x3, var66, 76, true, var60);
                                    }
                                }
                                if (var68 != 0) {
                                    byte var71 = var53[var62][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class15.method77(var49, var60, var46, var59, var68);
                                    }
                                    class131.method969(var72 >> 2, var68, var49, var59, class15.field201, var46, var71 & 0x3, 0, 96, var67 == 0, var60);
                                }
                            }
                            if (var55[var62] != null) {
                                int var73 = var55[var62][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var49;
                                    } else {
                                        var74 = var48 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var60;
                                    } else {
                                        var75 = var61 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 == 1) {
                                        class15.method93(var49, var60, var59, var76);
                                    } else if (var73 == 2) {
                                        class15.method94(var49, var60, var46, var76);
                                    } else if (var73 == 3) {
                                        class15.method93(var74, var60, var59, var76);
                                    } else if (var73 == 4) {
                                        class15.method94(var49, var75, var46, var76);
                                    } else if (var73 == 9) {
                                        class15.method93(var49, var60, var59, 16777215);
                                        class15.method94(var49, var60, var46, var76);
                                    } else if (var73 == 10) {
                                        class15.method93(var74, var60, var59, 16777215);
                                        class15.method94(var49, var60, var46, var76);
                                    } else if (var73 == 11) {
                                        class15.method93(var74, var60, var59, 16777215);
                                        class15.method94(var49, var75, var46, var76);
                                    } else if (var73 == 12) {
                                        class15.method93(var49, var60, var59, 16777215);
                                        class15.method94(var49, var75, var46, var76);
                                    } else if (var73 == 17) {
                                        class15.method94(var49, var60, 1, var76);
                                    } else if (var73 == 18) {
                                        class15.method94(var74, var60, 1, var76);
                                    } else if (var73 == 19) {
                                        class15.method94(var74, var75, 1, var76);
                                    } else if (var73 == 20) {
                                        class15.method94(var49, var75, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class15.method94(var49 + var77, -var77 + var75, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class15.method94(var49 + var78, var60 + var78, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg6 + var45;
                    int var80 = arg6 + var44;
                    for (int var81 = 0; var81 < var11; var81++) {
                        int var82;
                        if (class21.field299.field706 != -1) {
                            var82 = class21.field299.field706;
                        } else if ((var13 + arg8 & 0x4) == (arg2 + var81 & 0x4)) {
                            var82 = class89.field1690[class40.field574 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = (arg10 * var81 + arg4 >> 16) + arg7;
                        int var84 = (arg4 + ((var81 + 1) * arg10) >> 16) + arg7;
                        int var85 = var84 - var83;
                        class15.method77(var80, var83, var46, var85, var82);
                    }
                }
            }
        }
        if (arg0 != -1) {
            field2815 = null;
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = arg1 * var14 + arg9 >> 16;
            int var16 = arg9 + ((var14 + 1) * arg1) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg6 + var16;
                int var19 = arg6 + var15;
                int var20 = arg8 + var14 >> 6;
                if (var20 >= 0 && (class140.field2616.length - 1) >= var20) {
                    short[][] var21 = class140.field2616[var20];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = arg10 * var22 + arg4 >> 16;
                        int var24 = (var22 + 1) * arg10 + arg4 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg7 + var24;
                            int var27 = arg7 + var23;
                            int var28 = arg2 + var22 >> 6;
                            if (var28 >= 0 && var28 <= (var21.length - 1)) {
                                int var29 = ((arg2 + var22 & 0x3F) << 6) + (arg8 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] & 0x3FFF;
                                    int var31 = (var21[var28][var29] & 0xF494) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var41 = class141.field2638[var30 - 1].field696 * var25 / 4;
                                            int var42 = class141.field2638[var30 - 1].field694 * var17 / 4;
                                            int var43 = class141.field2638[var30 - 1].field699 * var25 / 4;
                                            class141.field2638[var30 - 1].method874(var19, var27 - var43, var42, var41);
                                        } else if (var31 == 1) {
                                            int var38 = class216.field3911[var30 - 1].field694 * var17 / 4;
                                            int var39 = class216.field3911[var30 - 1].field696 * var25 / 4;
                                            int var40 = class216.field3911[var30 - 1].field699 * var25 / 4;
                                            class216.field3911[var30 - 1].method874(var19, var27 - var40, var38, var39);
                                        } else if (var31 == 2) {
                                            int var32 = class17.field225[var30 - 1].field696 * var25 / 4;
                                            int var33 = class17.field225[var30 - 1].field699 * var25 / 4;
                                            int var34 = class17.field225[var30 - 1].field694 * var17 / 4;
                                            class17.field225[var30 - 1].method874(var19, var27 - var33, var34, var32);
                                        } else if (var31 == 3) {
                                            int var35 = class240.field4414[var30 - 1].field696 * var25 / 4;
                                            int var36 = class240.field4414[var30 - 1].field694 * var17 / 4;
                                            int var37 = class240.field4414[var30 - 1].field699 * var25 / 4;
                                            class240.field4414[var30 - 1].method874(var19, var27 - var37, var36, var35);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2803++;
        if (!this.method728((byte) 67)) {
            return;
        }
        class204.field3666 = Integer.parseInt(this.getParameter("worldid"));
        class12.field160 = Integer.parseInt(this.getParameter("modewhat"));
        class240.field4402 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class135.field2524 = true;
        } else {
            class135.field2524 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class63.field1223 = true;
        } else {
            class63.field1223 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null) {
            try {
                class165.field3051 = Integer.parseInt(var3);
            } catch (Exception var11) {
            }
        }
        class180.method1308(class165.field3051, true);
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class47.field688 = 1;
        } else {
            class47.field688 = 0;
        }
        try {
            class200.field3615 = Integer.parseInt(this.getParameter("js"));
            class165.field3035 = Integer.parseInt(this.getParameter("plug"));
            class114.field2181 = Integer.parseInt(this.getParameter("affid"));
            class248.field4526 = Integer.parseInt(this.getParameter("haveie6")) == 1;
        } catch (Exception var10) {
        }
        class152.field2835 = class76.field1483.method437(true, this);
        if (class152.field2835 == null) {
            class152.field2835 = class209.field3816;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class69 var7 = class38.method209(105, 0, var6.length, var6);
            boolean var8 = class118.method861(0, var7);
            if (var8) {
                class192.field3473 = var7;
            }
        }
        class36.field507 = this.getCodeBase().getHost();
        this.method723(class12.field160 + 32, 765, 512, -113, 503);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    private final void method1140(int arg0) {
        field2817++;
        class192.method1393(this, (byte) 108);
        for (class186.field3351 = 0; class126.method902(117) && class186.field3351 < 128; class186.field3351++) {
            class139.field2610[class186.field3351] = class59.field1078;
            class235.field4287[class186.field3351] = class181.field3291;
        }
        if (arg0 != 128) {
            this.method734((byte) -33);
        }
        class148.field2767++;
        if (class35.field483 != -1) {
            class22.method125(0, class20.field287, 0, class35.field483, 0, class66.field1278, 0, -5);
        }
        class81.field1564++;
        class147.method1115(-15844);
        while (true) {
            class58 var2;
            class50 var3;
            class50 var4;
            do {
                var2 = (class58) class112.field2160.method1731((byte) -101);
                if (var2 == null) {
                    while (true) {
                        class58 var5;
                        class50 var6;
                        class50 var7;
                        do {
                            var5 = (class58) class66.field1271.method1731((byte) -101);
                            if (var5 == null) {
                                while (true) {
                                    class58 var8;
                                    class50 var9;
                                    class50 var10;
                                    do {
                                        var8 = (class58) class89.field1694.method1731((byte) -101);
                                        if (var8 == null) {
                                            if (class26.field370 != null) {
                                                class36.method198(true);
                                            }
                                            if (class23.field317 != null && class23.field317.field1663 == 1) {
                                                if (class23.field317.field1666 != null) {
                                                    class171.method1256(class66.field1274, 0, class59.field1070);
                                                }
                                                class59.field1070 = false;
                                                class23.field317 = null;
                                                class66.field1274 = null;
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1048;
                                        if (var9.field735 < 0) {
                                            break;
                                        }
                                        var10 = method1144((byte) -9, var9.field778);
                                    } while (var10 == null || var10.field848 == null || var10.field848.length <= var9.field735 || var10.field848[var9.field735] != var9);
                                    class179.method1304((byte) -3, var8);
                                }
                            }
                            var6 = var5.field1048;
                            if (var6.field735 < 0) {
                                break;
                            }
                            var7 = method1144((byte) -9, var6.field778);
                        } while (var7 == null || var7.field848 == null || var7.field848.length <= var6.field735 || var7.field848[var6.field735] != var6);
                        class179.method1304((byte) -120, var5);
                    }
                }
                var3 = var2.field1048;
                if (var3.field735 < 0) {
                    break;
                }
                var4 = method1144((byte) -9, var3.field778);
            } while (var4 == null || var4.field848 == null || var3.field735 >= var4.field848.length || var4.field848[var3.field735] != var3);
            class179.method1304((byte) 27, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method726(byte arg0) {
        class29.field425 = new class59();
        class81.field1556 = new class132();
        field2814++;
        class45.method252(class135.field2524, class36.field508, 64);
        if (class47.field688 == 1) {
            class186.field3369 = class213.field3875;
            class244.field4478 = class263.field4682;
            class224.field4073 = class224.field4082;
            class245.field4488 = class48.field703;
        } else {
            class244.field4478 = class201.field3627;
            class186.field3369 = class239.field4376;
            class245.field4488 = class45.field653;
            class224.field4073 = class13.field194;
        }
        class202.field3645 = class240.field4402 == 0 ? 443 : class204.field3666 + 50000;
        class164.field3030 = class26.field364 = class147.field2727 = class73.field1405 = new short[256];
        if (arg0 < 93) {
            this.method1152((byte) -109);
        }
        class66.field1281 = class240.field4402 == 0 ? 43594 : class204.field3666 + 40000;
        class167.field3085 = class66.field1281;
        class170.method1249(59);
        class163.method1213((byte) -61, class212.field3862);
        class90.method639((byte) -34, class212.field3862);
        class106.field2002 = class215.method1549(true);
        if (class106.field2002 != null) {
            class106.field2002.method897(class212.field3862, (byte) -100);
        }
        class206.field3766 = class42.field597;
        try {
            if (class36.field508.field599 != null) {
                class10.field87 = new class142(class36.field508.field599, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class192.field3483[var2] = new class142(class36.field508.field595[var2], 6000, 0);
                }
                class212.field3854 = new class142(class36.field508.field596, 6000, 0);
                class246.field4504 = new class105(255, class10.field87, class212.field3854, 500000);
                class28.field399 = new class142(class36.field508.field611, 24, 0);
                class36.field508.field611 = null;
                class36.field508.field599 = null;
                class36.field508.field595 = null;
                class36.field508.field596 = null;
            }
        } catch (IOException var3) {
            class246.field4504 = null;
            class212.field3854 = null;
            class10.field87 = null;
            class28.field399 = null;
        }
        if (class240.field4402 != 0) {
            class90.field1702 = true;
        }
        class242.field4446 = class44.field635;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltk;)I")
    public static final int method1141(class50 arg0) {
        class3 var1 = (class3) class162.field2998.method769(true, ((long) arg0.field773 << 32) + (long) arg0.field735);
        return var1 == null ? arg0.field754 : var1.field6;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method725(byte arg0) {
        field2825++;
        method1145(104);
        class69.method494((byte) -50);
        class99.method738(-1);
        class49.method276((byte) 64);
        class91.method647((byte) 124);
        class98.method729(false);
        class162.method1209(23988);
        class76.method552(30);
        class89.method637((byte) 3);
        class232.method1650(0);
        class128.method936((byte) 3);
        class173.method1268(-59);
        class132.method974(true);
        class59.method358((byte) -31);
        int var2 = 5 % ((arg0 - 73) / 37);
        class201.method1463(true);
        class193.method1397((byte) 88);
        class83.method588(true);
        class142.method1095(9179409);
        class105.method793((byte) 116);
        class241.method1710(124);
        class38.method208(-17);
        class51.method297((byte) 20);
        class263.method1804(true);
        class50.method280((byte) 113);
        class108.method809(152);
        class243.method1723((byte) -89);
        class103.method759(1624470562);
        class210.method1516(true);
        class26.method149(16600);
        class116.method858(66);
        class56.method338(1);
        class62.method409(false);
        class134.method1005(true);
        class182.method1325(127);
        class93.method677((byte) -28);
        class159.method1194(-123);
        class222.method1573(-23729);
        class217.method1554((byte) -40);
        class272.method1863(-3239);
        class186.method1357(97);
        class259.method1785((byte) -94);
        class88.method629(false);
        class230.method1647(102);
        class101.method747(-128);
        class100.method742(-80);
        class155.method1176(23);
        class71.method503((byte) -95);
        class13.method71(-16546);
        class11.method54((byte) -54);
        class254.method1764(62);
        class248.method1749(32);
        class81.method578(true);
        class167.method1235(-95);
        class144.method1098(true);
        class12.method70(-73);
        class233.method1654(0);
        class127.method905((byte) -99);
        class74.method542();
        class9.method41((byte) 17);
        class205.method1496((byte) -91);
        class238.method1679();
        class258.method1783((byte) 118);
        class44.method250((byte) 55);
        class223.method1581((byte) -120);
        class202.method1470(32768);
        class271.method1856(false);
        class153.method1161(0);
        class80.method573(121);
        class48.method272((byte) -113);
        class225.method1596();
        class250.method1751(-90);
        class85.method626(0);
        class192.method1390((byte) 57);
        class177.method1279(-13462);
        class118.method860((byte) -78);
        class212.method1532((byte) 37);
        class68.method436(1);
        class204.method1479((byte) -125);
        class53.method315((byte) 20);
        class267.method1841();
        class5.method27((byte) 118);
        class199.method1454((byte) 105);
        class104.method778((byte) -7);
        class178.method1290();
        class15.method79();
        class139.method1070(-17772);
        class151.method1137(-1);
        class43.method244((byte) 123);
        class123.method882((byte) 68);
        class148.method1118(5063219);
        class119.method866(-20348);
        class185.method1340();
        class147.method1114(-89);
        class195.method1416();
        class75.method544(false);
        class237.method1677(true);
        class97.method710(false);
        class23.method130(15378);
        class161.method1206(0);
        class79.method564(5);
        class126.method899(100);
        class157.method1186(-128);
        class257.method1774((byte) 102);
        class149.method1123(-9181);
        class131.method970((byte) -77);
        class141.method1081(-53);
        class146.method1110((byte) 94);
        class188.method1370(true);
        class145.method1104(127);
        class45.method256(13848);
        class39.method216(26272);
        class209.method1514(-10048);
        class221.method1568(-28443);
        class8.method37(2);
        class235.method1664(true);
        class196.method1437(7489);
        class34.method183(-109);
        class124.method894(260);
        class114.method848((byte) 65);
        class94.method684(10);
        class55.method329((byte) 65);
        class189.method1376(-316814520);
        class27.method154(-6);
        class58.method352(-38);
        class231.method1649(500);
        class163.method1212((byte) -119);
        class82.method582(-94);
        class207.method1501((byte) -112);
        class135.method1010((byte) 122);
        class65.method424(27160);
        class175.method1275(true);
        class22.method127(-29315);
        class200.method1459(-4278);
        class197.method1443(2);
        class107.method804();
        class115.method850(-127);
        class158.method1189(-69);
        class110.method826((byte) 125);
        class112.method834((byte) 122);
        class228.method1630((byte) -98);
        class3.method13((byte) 127);
        class247.method1744(-29);
        class95.method697(0);
        class140.method1076(25111);
        class252.method1755((byte) 125);
        class136.method1016(true);
        class244.method1733(4);
        class242.method1719(-1001);
        class208.method1506((byte) 123);
        class216.method1552(-128);
        class251.method1753(1);
        class28.method161(-257);
        class10.method47((byte) 93);
        class176.method1277((byte) -88);
        class19.method113(104);
        class164.method1217((byte) 116);
        class46.method264((byte) -66);
        class25.method140();
        class20.method118(124);
        class245.method1736((byte) -50);
        class191.method1380(-1);
        class35.method189(31567);
        class133.method989(false);
        class33.method179(8454016);
        class219.method1557();
        class214.method1543();
        class190.method1378();
        class203.method1474(false);
        class122.method879((byte) -105);
        class111.method827(-18059);
        class154.method1173();
        class96.method705();
        class138.method1065(-256);
        class166.method1233((byte) 53);
        class84.method620((byte) -116);
        class224.method1592((byte) 35);
        class236.method1668(15917);
        class54.method319(8968);
        class171.method1255((byte) 54);
        class90.method640((byte) -18);
        class130.method968(51);
        class52.method307(26480);
        class16.method102((byte) -93);
        class262.method1796(114);
        class194.method1410(0);
        class165.method1221(128);
        class265.method1835(79);
        class61.method369((byte) -82);
        class179.method1305(44);
        class60.method364(4096);
        class113.method841((byte) 36);
        class66.method427(true);
        class220.method1559(66);
        class63.method411(-126);
        class273.method1864(0);
        class57.method349(449);
        class72.method507((byte) -127);
        class64.method417(-7);
        class227.method1624((byte) 113);
        class239.method1692((byte) 126);
        class253.method1759((byte) -34);
        class29.method165((byte) 123);
        class120.method868(0);
        class270.method1853((byte) 23);
        class168.method1240(true);
        class24.method136((byte) 98);
        class156.method1180(0);
        class261.method1794((byte) 91);
        class213.method1536(-115);
        class240.method1698(false);
        class211.method1519(81);
        class266.method1840(1024);
        class47.method266(false);
        class181.method1322(-18);
        class255.method1770(25206);
        class129.method966(7);
        class70.method502(true);
        class78.method560((byte) 110);
        class102.method753(0);
        class4.method22((byte) 62);
        class32.method173((byte) -122);
        class31.method172((byte) 114);
        class73.method508((byte) -105);
        class172.method1257(108);
        class256.method1772(-690);
        class106.method799((byte) 102);
        class21.method121(1);
        class41.method228(-111);
        class170.method1247((byte) -5);
        class180.method1313(121);
        class268.method1845(116);
        class152.method1155(10);
        class109.method823((byte) -2);
        class36.method194(2);
        class206.method1499(-105);
        class40.method225(0);
        class215.method1547((byte) -28);
        class229.method1632((byte) -28);
        class246.method1741((byte) -9);
        class17.method109(-859909594);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    private final void method1142(int arg0, byte arg1) {
        class201.field3637 = null;
        class149.field2776 = 0;
        if (class66.field1281 == class167.field3085) {
            class167.field3085 = class202.field3645;
        } else {
            class167.field3085 = class66.field1281;
        }
        int var3 = -70 % ((arg1 + 60) / 36);
        class259.field4646++;
        class106.field1998 = null;
        if (class259.field4646 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class268.field4760 == 0 || class268.field4760 == 5) {
                this.method730(1, "js5connect_full");
                class268.field4760 = 1000;
            } else {
                class36.field496 = 3000;
            }
        } else if (class259.field4646 >= 2 && arg0 == 6) {
            this.method730(1, "js5connect_outofdate");
            class268.field4760 = 1000;
        } else if (class259.field4646 >= 4) {
            if (class268.field4760 == 0 || class268.field4760 == 5) {
                this.method730(1, "js5connect");
                class268.field4760 = 1000;
            } else {
                class36.field496 = 3000;
            }
        }
        field2805++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    private final void method1143(int arg0) {
        field2807++;
        if (class124.field2308 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class223.method1584(arg0 ^ 0xFFFF9CF8);
            if (class12.field130 == 0L) {
                class12.field130 = var4;
            }
            if (var3 > 16384 && (var4 - class12.field130) < 5000L) {
                if ((var4 - class149.field2785) > 1000L) {
                    System.gc();
                    class149.field2785 = var4;
                }
                class227.field4144 = class26.field376;
                class207.field3773 = 5;
            } else {
                class124.field2308 = 10;
                class227.field4144 = class189.field3423;
                class207.field3773 = 5;
            }
        } else if (class124.field2308 == 10) {
            class26.method148(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class79.field1518[var6] = new class263(104, 104);
            }
            class124.field2308 = 30;
            class207.field3773 = 10;
            class227.field4144 = class126.field2314;
        } else if (class124.field2308 == 30) {
            if (class138.field2586 == null) {
                class138.field2586 = new class201(class81.field1556, class29.field425);
            }
            if (class138.field2586.method1467(false)) {
                class38.field521 = class104.method770(true, true, 0, false, -125);
                class55.field989 = class104.method770(true, true, 1, false, -128);
                class273.field4826 = class104.method770(false, true, 2, true, 43);
                class106.field1994 = class104.method770(true, true, 3, false, 49);
                class69.field1339 = class104.method770(true, true, 4, false, 13);
                class173.field3171 = class104.method770(true, true, 5, true, 56);
                class91.field1723 = class104.method770(true, false, 6, true, 36);
                class120.field2268 = class104.method770(true, true, 7, false, arg0 ^ 0x3C);
                class98.field1859 = class104.method770(true, true, 8, false, -125);
                class255.field4589 = class104.method770(true, true, 9, false, 102);
                class194.field3544 = class104.method770(true, true, 10, false, -31);
                class212.field3845 = class104.method770(true, true, 11, false, -125);
                class147.field2723 = class104.method770(true, true, 12, false, -128);
                class146.field2696 = class104.method770(true, true, 13, false, -35);
                class90.field1711 = class104.method770(true, false, 14, false, -124);
                class51.field897 = class104.method770(true, true, 15, false, arg0 ^ 0xFFFFFFA9);
                class170.field3106 = class104.method770(true, true, 16, false, arg0 ^ 0xFFFFFFAA);
                class168.field3086 = class104.method770(true, true, 17, false, -128);
                class41.field586 = class104.method770(true, true, 18, false, -126);
                class123.field2286 = class104.method770(true, true, 19, false, -124);
                class101.field1897 = class104.method770(true, true, 20, false, -125);
                class141.field2643 = class104.method770(true, true, 21, false, 26);
                class113.field2178 = class104.method770(true, true, 22, false, arg0 ^ 0x2);
                class110.field2095 = class104.method770(true, true, 23, true, 97);
                class63.field1230 = class104.method770(true, true, 24, false, arg0 - 166);
                class78.field1499 = class104.method770(true, true, 25, false, -30);
                class141.field2636 = class104.method770(true, true, 26, true, 43);
                class124.field2308 = 40;
                class227.field4144 = class204.field3680;
                class207.field3773 = 15;
            } else {
                class207.field3773 = 12;
                class227.field4144 = class170.field3114;
            }
        } else if (class124.field2308 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class230.field4208[var8].method1406(-126) * class98.field1838[var8] / 100;
            }
            if (var7 == 100) {
                class207.field3773 = 20;
                class227.field4144 = class31.field432;
                class112.method838((byte) -79, class98.field1859);
                class5.method26(class98.field1859, 122);
                class76.method547(-115, class98.field1859);
                class182.method1324(23018, class98.field1859);
                class124.field2308 = 45;
            } else {
                if (var7 != 0) {
                    class227.field4144 = class9.method42(-120, new class69[] { class115.field2200, class98.method727(-229, var7), class108.field2038 });
                }
                class207.field3773 = 20;
            }
        } else if (class124.field2308 == 45) {
            class23.method132(2, 22050, true, class95.field1784);
            class63.field1214 = new class62();
            class63.field1214.method393(false, 9, 128);
            class29.field421 = class119.method864(0, class36.field508, class212.field3862, -16729, 22050);
            class29.field421.method994(-7667, class63.field1214);
            class191.method1384(123, class51.field897, class63.field1214, class90.field1711, class69.field1339);
            class194.field3551 = class119.method864(1, class36.field508, class212.field3862, -16729, 2048);
            class54.field959 = new class260();
            class194.field3551.method994(-7667, class54.field959);
            class263.field4689 = new class182(22050, class133.field2473);
            class84.field1621 = class91.field1723.method589((byte) -111, class71.field1384);
            class124.field2308 = 50;
            class227.field4144 = class57.field1028;
            class207.field3773 = 30;
        } else if (class124.field2308 == 50) {
            int var9 = class180.method1314(class98.field1859, class146.field2696, (byte) -90);
            int var10 = class60.method366(-82);
            if (var10 > var9) {
                class227.field4144 = class9.method42(arg0 - 116, new class69[] { class33.field467, class98.method727(arg0 ^ 0xFFFFFF33, var9 * 100 / var10), class108.field2038 });
                class207.field3773 = 35;
            } else {
                class207.field3773 = 35;
                class227.field4144 = class3.field14;
                class124.field2308 = 60;
            }
        } else if (class124.field2308 == 60) {
            int var11 = class133.method988(class98.field1859, 0);
            int var12 = class83.method606((byte) -97);
            if (var12 > var11) {
                class227.field4144 = class9.method42(arg0 ^ 0x5A, new class69[] { class253.field4572, class98.method727(-229, var11 * 100 / var12), class108.field2038 });
                class207.field3773 = 40;
            } else {
                class227.field4144 = class233.field4259;
                class124.field2308 = 65;
                class207.field3773 = 40;
            }
        } else if (class124.field2308 == 65) {
            class228.field4166 = false;
            class191.method1385(class98.field1859, false, class146.field2696);
            class207.field3773 = 45;
            class227.field4144 = class112.field2129;
            class115.method851(126, 5);
            class124.field2308 = 70;
        } else if (class124.field2308 == 70) {
            class273.field4826.method593(107);
            byte var13 = 0;
            int var14 = var13 + class273.field4826.method597(100);
            class170.field3106.method593(arg0 + 58);
            int var15 = var14 + class170.field3106.method597(100);
            class168.field3086.method593(arg0 + 62);
            int var16 = var15 + class168.field3086.method597(100);
            class41.field586.method593(104);
            int var17 = var16 + class41.field586.method597(100);
            class123.field2286.method593(arg0 + 71);
            int var18 = var17 + class123.field2286.method597(100);
            class101.field1897.method593(106);
            int var19 = var18 + class101.field1897.method597(100);
            class141.field2643.method593(arg0 + 71);
            int var20 = var19 + class141.field2643.method597(arg0 + 60);
            class113.field2178.method593(125);
            int var21 = var20 + class113.field2178.method597(100);
            class63.field1230.method593(102);
            int var22 = var21 + class63.field1230.method597(100);
            class78.field1499.method593(arg0 + 61);
            int var23 = var22 + class78.field1499.method597(100);
            if (var23 < 1000) {
                class227.field4144 = class9.method42(-106, new class69[] { class64.field1242, class98.method727(-229, var23 / 10), class108.field2038 });
                class207.field3773 = 50;
            } else {
                class158.method1190((byte) -126, class273.field4826);
                class210.method1518(class273.field4826, 191);
                class55.method328(class273.field4826, (byte) 107);
                class54.method317(arg0 - 37, class120.field2268, class273.field4826);
                class157.method1188(118, class170.field3106, class63.field1223, class120.field2268);
                class95.method692(class41.field586, -15, class120.field2268);
                class72.method506(class120.field2268, 1, class123.field2286, class63.field1223, class71.field1393);
                class205.method1490((byte) 118, class273.field4826);
                class186.method1348(class101.field1897, true, class55.field989, class38.field521);
                class151.method1136(15, class120.field2268, class141.field2643);
                class252.method1757(class113.field2178, true);
                class70.method499(class273.field4826, 85);
                class151.method1134(class98.field1859, class106.field1994, true, class120.field2268, class146.field2696);
                class21.method122(class273.field4826, 0);
                class95.method698((byte) 49, class168.field3086);
                class172.method1259(class78.field1499, class63.field1230, (byte) -46, new class34());
                class32.method174(class78.field1499, class63.field1230, -14826);
                class227.field4144 = class62.field1197;
                class207.field3773 = 50;
                class70.method501(true);
                class124.field2308 = 80;
            }
        } else if (class124.field2308 == 80) {
            int var24 = class20.method117(class98.field1859, 0);
            int var25 = class139.method1072((byte) -62);
            if (var24 < var25) {
                class227.field4144 = class9.method42(48, new class69[] { class209.field3807, class98.method727(-229, var24 * 100 / var25), class108.field2038 });
                class207.field3773 = 60;
            } else {
                class153.method1163(class98.field1859, (byte) -20);
                class124.field2308 = 90;
                class227.field4144 = class231.field4222;
                class207.field3773 = 60;
            }
        } else if (arg0 == 40) {
            if (class124.field2308 == 90) {
                if (class141.field2636.method593(110)) {
                    class104 var26 = new class104(class255.field4589, class141.field2636, class98.field1859, 20, !class57.field1030);
                    class178.method1300(var26);
                    if (class10.field88 == 1) {
                        class178.method1282(0.9F);
                    }
                    if (class10.field88 == 2) {
                        class178.method1282(0.8F);
                    }
                    if (class10.field88 == 3) {
                        class178.method1282(0.7F);
                    }
                    if (class10.field88 == 4) {
                        class178.method1282(0.6F);
                    }
                    class124.field2308 = 100;
                    class227.field4144 = class60.field1095;
                    class207.field3773 = 70;
                } else {
                    class227.field4144 = class9.method42(95, new class69[] { class257.field4612, class98.method727(-229, class141.field2636.method597(100)), class108.field2038 });
                    class207.field3773 = 70;
                }
            } else if (class124.field2308 == 100) {
                if (class50.method281(28348, class98.field1859)) {
                    class124.field2308 = 110;
                }
            } else if (class124.field2308 == 110) {
                class108.field2032 = new class89();
                class36.field508.method232(class108.field2032, 10, (byte) 107);
                class124.field2308 = 120;
                class207.field3773 = 75;
                class227.field4144 = class170.field3115;
            } else if (class124.field2308 == 120) {
                if (class194.field3544.method595(class142.field2668, class209.field3816, -12934)) {
                    class114 var27 = new class114(class194.field3544.method604((byte) -26, class209.field3816, class142.field2668));
                    class265.method1836(var27, -1380985532);
                    class124.field2308 = 130;
                    class227.field4144 = class48.field700;
                    class207.field3773 = 80;
                } else {
                    class227.field4144 = class9.method42(119, new class69[] { class78.field1511, class136.field2553 });
                    class207.field3773 = 80;
                }
            } else if (class124.field2308 == 130) {
                if (!class106.field1994.method593(106)) {
                    class227.field4144 = class9.method42(-116, new class69[] { class232.field4247, class98.method727(-229, class106.field1994.method597(100) * 3 / 4), class108.field2038 });
                    class207.field3773 = 85;
                } else if (!class147.field2723.method593(arg0 + 61)) {
                    class227.field4144 = class9.method42(-90, new class69[] { class232.field4247, class98.method727(-229, class147.field2723.method597(100) / 10 + 75), class108.field2038 });
                    class207.field3773 = 85;
                } else if (!class146.field2696.method593(108)) {
                    class227.field4144 = class9.method42(-100, new class69[] { class232.field4247, class98.method727(-229, class146.field2696.method597(100) / 20 + 85), class108.field2038 });
                    class207.field3773 = 85;
                } else if (class110.field2095.method611(50, class135.field2525)) {
                    class252.method1758(class80.field1530, class132.field2457, (byte) 96, class235.field4286, class126.field2312, class110.field2095, class272.field4821);
                    class124.field2308 = 140;
                    class227.field4144 = class94.field1754;
                    class207.field3773 = 100;
                } else {
                    class227.field4144 = class9.method42(93, new class69[] { class232.field4247, class98.method727(-229, class110.field2095.method584(5, class135.field2525) / 10 + 90), class108.field2038 });
                    class207.field3773 = 85;
                }
            } else if (class124.field2308 == 140) {
                class257.field4613 = class106.field1994.method589((byte) -111, class103.field1932);
                class173.field3171.method613(false, 0, true);
                class91.field1723.method613(true, 0, true);
                class98.field1859.method613(true, 0, true);
                class146.field2696.method613(true, 0, true);
                class194.field3544.method613(true, 0, true);
                class106.field1994.method613(true, 0, true);
                class128.field2397 = true;
                class33.method178(17300);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2804++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class208.method1508(1);
            }
            int var1 = -1;
            class204.field3666 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class240.field4402 = 0;
            } else if (arg0[1].equals("office")) {
                class240.field4402 = 1;
            } else if (arg0[1].equals("local")) {
                class240.field4402 = 2;
            } else {
                class208.method1508(1);
            }
            if (arg0[2].equals("live")) {
                class12.field160 = 0;
            } else if (arg0[2].equals("rc")) {
                class12.field160 = 1;
            } else if (arg0[2].equals("wip")) {
                class12.field160 = 2;
            } else {
                class208.method1508(1);
            }
            if (arg0[4].equals("free")) {
                class63.field1223 = false;
            } else if (arg0[4].equals("members")) {
                class63.field1223 = true;
            } else {
                class208.method1508(1);
            }
            try {
                byte[] var2 = arg0[5].getBytes("ISO-8859-1");
                var1 = class108.method811(true, class38.method209(110, 0, var2.length, var2));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class165.field3051 = var1;
            } else if (arg0[5].equals("english")) {
                class165.field3051 = 0;
            } else if (arg0[5].equals("german")) {
                class165.field3051 = 1;
            } else {
                class208.method1508(1);
            }
            class180.method1308(class165.field3051, true);
            if (arg0[6].equals("game0")) {
                class47.field688 = 0;
            } else if (arg0[6].equals("game1")) {
                class47.field688 = 1;
            } else {
                class208.method1508(1);
            }
            if (arg0.length != 8) {
                class135.field2524 = false;
            } else if (arg0[7].equals("safemode")) {
                class135.field2524 = true;
            } else {
                class208.method1508(1);
            }
            class114.field2181 = 0;
            class36.field507 = "127.0.0.1";
            class152.field2835 = class209.field3816;
            client var3 = new client();
            var3.method735("runescape", 503, class12.field160 + 32, 765, 0, 27, 512);
            class10.field85.setLocation(40, 40);
        } catch (Exception var6) {
            class222.method1575((String) null, var6, -59);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ltk;")
    public static final class50 method1144(byte arg0, int arg1) {
        field2818++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (arg0 != -9) {
            field2824 = null;
        }
        if (class116.field2222[var2] == null || class116.field2222[var2][var3] == null) {
            boolean var4 = class131.method971(var2, (byte) -126);
            if (!var4) {
                return null;
            }
        }
        return class116.field2222[var2][var3];
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public static void method1145(int arg0) {
        if (arg0 != 104) {
            main((String[]) null);
        }
        field2808 = null;
        field2824 = null;
        field2819 = null;
        field2815 = null;
        field2810 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhj;BLhj;ILhj;)V")
    public static final void method1146(class69 arg0, byte arg1, class69 arg2, int arg3, class69 arg4) {
        if (arg1 == 39) {
            class70.method498(-1, arg4, arg0, arg2, arg1 ^ 0xFFFFFFD8, arg3);
            field2811++;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltk;)Z")
    public static final boolean method1147(class50 arg0) {
        if (class88.field1684) {
            if (method1141(arg0) != 0) {
                return false;
            }
            if (arg0.field884 == 0) {
                return false;
            }
        }
        return arg0.field746;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1148(int arg0) {
        field2816++;
        if (class81.field1556.field2467 >= 4) {
            this.method730(1, "js5crc");
            class268.field4760 = 1000;
            return;
        }
        if (class81.field1556.field2469 >= 4) {
            if (class268.field4760 == 0 || class268.field4760 == 5) {
                this.method730(arg0 + 1, "js5io");
                class268.field4760 = 1000;
                return;
            }
            class81.field1556.field2469 = 3;
            class36.field496 = 3000;
        }
        if (class36.field496-- > 0) {
            return;
        }
        try {
            if (class149.field2776 == arg0) {
                class201.field3637 = class36.field508.method231(-23790, class167.field3085, class36.field507);
                class149.field2776++;
            }
            if (class149.field2776 == 1) {
                if (class201.field3637.field1663 == 2) {
                    this.method1142(-1, (byte) -119);
                    return;
                }
                if (class201.field3637.field1663 == 1) {
                    class149.field2776++;
                }
            }
            if (class149.field2776 == 2) {
                class106.field1998 = new class173((Socket) class201.field3637.field1666, class36.field508);
                class128 var2 = new class128(5);
                var2.method933(15, -20946);
                var2.method908(false, 512);
                class106.field1998.method1267(var2.field2385, (byte) 6, 0, 5);
                class149.field2776++;
                class237.field4309 = class223.method1584(-25392);
            }
            if (class149.field2776 == 3) {
                if (class268.field4760 == 0 || class268.field4760 == 5 || class106.field1998.method1269((byte) -85) > 0) {
                    int var3 = class106.field1998.method1263(2);
                    if (var3 != 0) {
                        this.method1142(var3, (byte) -97);
                        return;
                    }
                    class149.field2776++;
                } else if (class223.method1584(-25392) - class237.field4309 > 30000L) {
                    this.method1142(-2, (byte) -111);
                    return;
                }
            }
            if (class149.field2776 == 4) {
                boolean var4 = class268.field4760 == 5 || class268.field4760 == 10 || class268.field4760 == 28;
                class81.field1556.method980(!var4, class106.field1998, -20292);
                class259.field4646 = 0;
                class201.field3637 = null;
                class106.field1998 = null;
                class149.field2776 = 0;
            }
        } catch (IOException var5) {
            this.method1142(-3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method733(byte arg0) {
        field2822++;
        if (class268.field4760 == 1000) {
            return;
        }
        boolean var2 = false;
        boolean var3 = class58.method353(0);
        if (var3 && class119.field2251 && class29.field421 != null) {
            class29.field421.method996(8350);
        }
        if (class268.field4760 == 30 || class268.field4760 == 10) {
            if (class73.field1409) {
                class24.method137(0);
            } else if (class129.field2414 != 0L && class223.method1584(-25392) > class129.field2414) {
                class24.method137(0);
            }
        }
        if (class164.field3031 != 0L && class164.field3031 < class223.method1584(-25392) && class135.field2532 != null && (class268.field4760 == 30 || class268.field4760 == 25)) {
            class171.method1254(-29135);
        }
        if (class57.field1031) {
            class57.field1031 = false;
            var2 = true;
        }
        if (var2) {
            class123.method885(-120);
        }
        int var4 = 53 % ((2 - arg0) / 49);
        if (class268.field4760 == 0) {
            class16.method101((byte) -81, (Color) null, var2, class207.field3773, class227.field4144);
        } else if (class268.field4760 == 5) {
            class142.method1093(9179409, class26.field378);
        } else if (class268.field4760 == 10) {
            class211.method1522((byte) -122);
        } else if (class268.field4760 == 25 || class268.field4760 == 28) {
            if (class221.field3974 == 1) {
                if (class201.field3642 < class254.field4579) {
                    class201.field3642 = class254.field4579;
                }
                int var6 = (class201.field3642 - class254.field4579) * 50 / class201.field3642;
                class155.method1175(false, false, class9.method42(-114, new class69[] { class138.field2589, class245.field4484, class98.method727(-229, var6), class91.field1721 }));
            } else if (class221.field3974 == 2) {
                if (class216.field3906 < class157.field2931) {
                    class216.field3906 = class157.field2931;
                }
                int var5 = ((class216.field3906 - class157.field2931) * 50 / class216.field3906) + 50;
                class155.method1175(false, false, class9.method42(111, new class69[] { class138.field2589, class245.field4484, class98.method727(-229, var5), class91.field1721 }));
            } else {
                class155.method1175(false, false, class138.field2589);
            }
        } else if (class268.field4760 == 30) {
            class146.method1106(104);
        } else if (class268.field4760 == 40) {
            class155.method1175(false, false, class9.method42(-100, new class69[] { class38.field519, class69.field1318, class153.field2855 }));
        }
        if ((class268.field4760 == 30 || class268.field4760 == 10) && class91.field1727 == 0 && !var2) {
            try {
                Graphics var7 = class212.field3862.getGraphics();
                for (int var8 = 0; var8 < class151.field2797; var8++) {
                    if (class49.field723[var8]) {
                        class84.field1623.method46(var7, class101.field1891[var8], class202.field3646[var8], 1, class129.field2410[var8], class181.field3300[var8]);
                        class49.field723[var8] = false;
                    }
                }
            } catch (Exception var15) {
                class212.field3862.repaint();
            }
        } else if (class268.field4760 != 0) {
            try {
                Graphics var9 = class212.field3862.getGraphics();
                class84.field1623.method51(0, 0, -3, var9);
                for (int var10 = 0; var10 < class151.field2797; var10++) {
                    class49.field723[var10] = false;
                }
            } catch (Exception var14) {
                class212.field3862.repaint();
            }
        }
        if (class128.field2397) {
            class257.method1773(5);
        }
        if (!browsercontrol.iscreated() || class62.field1124 == 0) {
            return;
        }
        try {
            Point var11 = class212.field3862.getLocationOnScreen();
            Dimension var12 = class212.field3862.getSize();
            browsercontrol.set_position(var11.x, var11.y - class62.field1124, var12.width, class62.field1124);
        } catch (Exception var13) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1149(int arg0, int arg1, Random arg2) {
        int var3 = -82 / ((-arg0 - 24) / 56);
        field2823++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class231.method1648(500, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var5 >= var4);
            return class133.method990(arg1, -1, var5);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltk;IIIIIII)V")
    public static final void method1150(class50[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class50 var9 = arg0[var8];
            if (var9 != null && var9.field778 == arg1 && (!var9.field763 || var9.field884 == 0 || var9.field854 || method1141(var9) != 0 || class61.field1118 == var9 || var9.field828 == 1338) && (!var9.field763 || !method1147(var9))) {
                int var10 = var9.field771 + arg6;
                int var11 = var9.field740 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field884 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field798 + var10;
                    int var17 = var9.field727 + var11;
                    if (var9.field884 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class26.field370 == var9) {
                    class262.field4669 = true;
                    class168.field3089 = var10;
                    class65.field1259 = var11;
                }
                if (!var9.field763 || var12 < var14 && var13 < var15) {
                    if (var9.field884 == 0) {
                        if (!var9.field763 && method1147(var9) && class119.field2250 != var9) {
                            continue;
                        }
                        if (var9.field748 && class205.field3681 >= var12 && class72.field1398 >= var13 && class205.field3681 < var14 && class72.field1398 < var15) {
                            for (class58 var18 = (class58) class89.field1694.method1724(255); var18 != null; var18 = (class58) class89.field1694.method1726(117)) {
                                if (var18.field1046) {
                                    var18.method632(-8296);
                                }
                            }
                            if (class33.field470 == 0) {
                                class26.field370 = null;
                                class61.field1118 = null;
                            }
                            class243.field4469 = false;
                        }
                    }
                    if (var9.field763) {
                        boolean var19;
                        if (class205.field3681 >= var12 && class72.field1398 >= var13 && class205.field3681 < var14 && class72.field1398 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class206.field3763 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class8.field53 == 1 && class56.field1020 >= var12 && class207.field3776 >= var13 && class56.field1020 < var14 && class207.field3776 < var15) {
                            var21 = true;
                        }
                        if (class186.field3351 > 0 && var9.field871 != null) {
                            for (int var22 = 0; var22 < var9.field871.length; var22++) {
                                for (int var23 = 0; var23 < class186.field3351; var23++) {
                                    int var24 = var9.field871[var22] & 0xFF;
                                    if (class139.field2610[var23] == var24) {
                                        if (var9.field880 != null) {
                                            byte var25 = var9.field880[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class261.field4656[86] || (var25 & 0x1) != 0 && !class261.field4656[82] || (var25 & 0x4) != 0 && !class261.field4656[81])) {
                                                continue;
                                            }
                                        }
                                        class215.method1550(99999, class209.field3816, -1, var9.field773, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class223.method1585(var9, class56.field1020 - var10, -101, class207.field3776 - var11);
                        }
                        if (class26.field370 != null && class26.field370 != var9 && var19 && class103.method766(method1141(var9), (byte) 103)) {
                            class166.field3077 = var9;
                        }
                        if (class61.field1118 == var9) {
                            class72.field1395 = true;
                            class63.field1231 = var10;
                            class217.field3920 = var11;
                        }
                        if (var9.field854 || var9.field828 != 0) {
                            if (var19 && class179.field3260 != 0 && var9.field781 != null) {
                                class58 var26 = new class58();
                                var26.field1046 = true;
                                var26.field1048 = var9;
                                var26.field1044 = class179.field3260;
                                var26.field1050 = var9.field781;
                                class89.field1694.method1727(-114, var26);
                            }
                            if (class26.field370 != null || class5.field40 != null || class103.field1936 || var9.field828 != 1400 && class243.field4469) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field828 != 0) {
                                if (var9.field828 == 1337) {
                                    class23.field328 = var9;
                                    class204.method1478(var9, false);
                                    continue;
                                }
                                if (var9.field828 == 1338) {
                                    if (var21) {
                                        class241.method1706(class56.field1020 - var10, class207.field3776 - var11, 115742923, var9);
                                    }
                                    continue;
                                }
                                if (var9.field828 == 1400) {
                                    class157.field2918 = var9;
                                    if (var21) {
                                        if (class261.field4656[82] && class245.field4487 > 0) {
                                            int var27 = (int) ((double) (class56.field1020 - var10 - var9.field798 / 2) * 2.0D / (double) class93.field1741);
                                            int var28 = (int) ((double) (class207.field3776 - var11 - var9.field727 / 2) * 2.0D / (double) class93.field1741);
                                            int var29 = class135.field2528 + var27;
                                            int var30 = class102.field1905 + var28;
                                            int var31 = class250.field4539 + var29;
                                            int var32 = class22.field306 + class209.field3806 - var30 - 1;
                                            class236.method1671((byte) -121, 0, var32, var31);
                                            class203.method1471((byte) -126);
                                            continue;
                                        }
                                        class243.field4469 = true;
                                        class115.field2202 = class205.field3681;
                                        class144.field2681 = class72.field1398;
                                        class35.field482 = class135.field2528;
                                        class258.field4635 = class102.field1905;
                                        continue;
                                    }
                                    if (var20 && class243.field4469) {
                                        class99.method739((byte) 120, (int) ((double) (class115.field2202 - class205.field3681) * 2.0D / (double) class246.field4502) + class35.field482);
                                        class45.method251(116, (int) ((double) (class144.field2681 - class72.field1398) * 2.0D / (double) class246.field4502) + class258.field4635);
                                        continue;
                                    }
                                    class243.field4469 = false;
                                    continue;
                                }
                                if (var9.field828 == 1401) {
                                    if (var20) {
                                        class95.method689(var9.field727, -1, class72.field1398 - var11, class205.field3681 - var10, var9.field798);
                                    }
                                    continue;
                                }
                                if (var9.field828 == 1402) {
                                    class204.method1478(var9, false);
                                    continue;
                                }
                                if (var9.field828 == 1404) {
                                    class204.method1478(var9, false);
                                    continue;
                                }
                            }
                            if (!var9.field786 && var21) {
                                var9.field786 = true;
                                if (var9.field796 != null) {
                                    class58 var33 = new class58();
                                    var33.field1046 = true;
                                    var33.field1048 = var9;
                                    var33.field1053 = class56.field1020 - var10;
                                    var33.field1044 = class207.field3776 - var11;
                                    var33.field1050 = var9.field796;
                                    class89.field1694.method1727(-120, var33);
                                }
                            }
                            if (var9.field786 && var20 && var9.field891 != null) {
                                class58 var34 = new class58();
                                var34.field1046 = true;
                                var34.field1048 = var9;
                                var34.field1053 = class205.field3681 - var10;
                                var34.field1044 = class72.field1398 - var11;
                                var34.field1050 = var9.field891;
                                class89.field1694.method1727(-108, var34);
                            }
                            if (var9.field786 && !var20) {
                                var9.field786 = false;
                                if (var9.field810 != null) {
                                    class58 var35 = new class58();
                                    var35.field1046 = true;
                                    var35.field1048 = var9;
                                    var35.field1053 = class205.field3681 - var10;
                                    var35.field1044 = class72.field1398 - var11;
                                    var35.field1050 = var9.field810;
                                    class66.field1271.method1727(-93, var35);
                                }
                            }
                            if (var20 && var9.field799 != null) {
                                class58 var36 = new class58();
                                var36.field1046 = true;
                                var36.field1048 = var9;
                                var36.field1053 = class205.field3681 - var10;
                                var36.field1044 = class72.field1398 - var11;
                                var36.field1050 = var9.field799;
                                class89.field1694.method1727(-104, var36);
                            }
                            if (!var9.field805 && var19) {
                                var9.field805 = true;
                                if (var9.field785 != null) {
                                    class58 var37 = new class58();
                                    var37.field1046 = true;
                                    var37.field1048 = var9;
                                    var37.field1053 = class205.field3681 - var10;
                                    var37.field1044 = class72.field1398 - var11;
                                    var37.field1050 = var9.field785;
                                    class89.field1694.method1727(-125, var37);
                                }
                            }
                            if (var9.field805 && var19 && var9.field842 != null) {
                                class58 var38 = new class58();
                                var38.field1046 = true;
                                var38.field1048 = var9;
                                var38.field1053 = class205.field3681 - var10;
                                var38.field1044 = class72.field1398 - var11;
                                var38.field1050 = var9.field842;
                                class89.field1694.method1727(-93, var38);
                            }
                            if (var9.field805 && !var19) {
                                var9.field805 = false;
                                if (var9.field774 != null) {
                                    class58 var39 = new class58();
                                    var39.field1046 = true;
                                    var39.field1048 = var9;
                                    var39.field1053 = class205.field3681 - var10;
                                    var39.field1044 = class72.field1398 - var11;
                                    var39.field1050 = var9.field774;
                                    class66.field1271.method1727(-116, var39);
                                }
                            }
                            if (var9.field840 != null) {
                                class58 var40 = new class58();
                                var40.field1048 = var9;
                                var40.field1050 = var9.field840;
                                class112.field2160.method1727(-121, var40);
                            }
                            if (var9.field803 != null && class22.field301 > var9.field860) {
                                if (var9.field769 == null || class22.field301 - var9.field860 > 32) {
                                    class58 var45 = new class58();
                                    var45.field1048 = var9;
                                    var45.field1050 = var9.field803;
                                    class89.field1694.method1727(-107, var45);
                                } else {
                                    label550: for (int var41 = var9.field860; var41 < class22.field301; var41++) {
                                        int var42 = class167.field3081[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field769.length; var43++) {
                                            if (var9.field769[var43] == var42) {
                                                class58 var44 = new class58();
                                                var44.field1048 = var9;
                                                var44.field1050 = var9.field803;
                                                class89.field1694.method1727(-111, var44);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field860 = class22.field301;
                            }
                            if (var9.field825 != null && class24.field349 > var9.field822) {
                                if (var9.field744 == null || class24.field349 - var9.field822 > 32) {
                                    class58 var50 = new class58();
                                    var50.field1048 = var9;
                                    var50.field1050 = var9.field825;
                                    class89.field1694.method1727(-106, var50);
                                } else {
                                    label526: for (int var46 = var9.field822; var46 < class24.field349; var46++) {
                                        int var47 = class168.field3094[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field744.length; var48++) {
                                            if (var9.field744[var48] == var47) {
                                                class58 var49 = new class58();
                                                var49.field1048 = var9;
                                                var49.field1050 = var9.field825;
                                                class89.field1694.method1727(-127, var49);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field822 = class24.field349;
                            }
                            if (var9.field831 != null && class268.field4773 > var9.field795) {
                                if (var9.field881 == null || class268.field4773 - var9.field795 > 32) {
                                    class58 var55 = new class58();
                                    var55.field1048 = var9;
                                    var55.field1050 = var9.field831;
                                    class89.field1694.method1727(-100, var55);
                                } else {
                                    label502: for (int var51 = var9.field795; var51 < class268.field4773; var51++) {
                                        int var52 = class89.field1699[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field881.length; var53++) {
                                            if (var9.field881[var53] == var52) {
                                                class58 var54 = new class58();
                                                var54.field1048 = var9;
                                                var54.field1050 = var9.field831;
                                                class89.field1694.method1727(-115, var54);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field795 = class268.field4773;
                            }
                            if (var9.field734 != null && class165.field3042 > var9.field766) {
                                if (var9.field855 == null || class165.field3042 - var9.field766 > 32) {
                                    class58 var60 = new class58();
                                    var60.field1048 = var9;
                                    var60.field1050 = var9.field734;
                                    class89.field1694.method1727(-121, var60);
                                } else {
                                    label478: for (int var56 = var9.field766; var56 < class165.field3042; var56++) {
                                        int var57 = class246.field4499[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field855.length; var58++) {
                                            if (var9.field855[var58] == var57) {
                                                class58 var59 = new class58();
                                                var59.field1048 = var9;
                                                var59.field1050 = var9.field734;
                                                class89.field1694.method1727(-108, var59);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field766 = class165.field3042;
                            }
                            if (var9.field761 != null && class181.field3276 > var9.field738) {
                                if (var9.field758 == null || class181.field3276 - var9.field738 > 32) {
                                    class58 var65 = new class58();
                                    var65.field1048 = var9;
                                    var65.field1050 = var9.field761;
                                    class89.field1694.method1727(-102, var65);
                                } else {
                                    label454: for (int var61 = var9.field738; var61 < class181.field3276; var61++) {
                                        int var62 = class81.field1546[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field758.length; var63++) {
                                            if (var9.field758[var63] == var62) {
                                                class58 var64 = new class58();
                                                var64.field1048 = var9;
                                                var64.field1050 = var9.field761;
                                                class89.field1694.method1727(-98, var64);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field738 = class181.field3276;
                            }
                            if (class128.field2381 > var9.field817 && var9.field759 != null) {
                                class58 var66 = new class58();
                                var66.field1048 = var9;
                                var66.field1050 = var9.field759;
                                class89.field1694.method1727(-119, var66);
                            }
                            if (class208.field3795 > var9.field817 && var9.field820 != null) {
                                class58 var67 = new class58();
                                var67.field1048 = var9;
                                var67.field1050 = var9.field820;
                                class89.field1694.method1727(-124, var67);
                            }
                            if (class43.field616 > var9.field817 && var9.field784 != null) {
                                class58 var68 = new class58();
                                var68.field1048 = var9;
                                var68.field1050 = var9.field784;
                                class89.field1694.method1727(-104, var68);
                            }
                            if (class177.field3219 > var9.field817 && var9.field730 != null) {
                                class58 var69 = new class58();
                                var69.field1048 = var9;
                                var69.field1050 = var9.field730;
                                class89.field1694.method1727(-94, var69);
                            }
                            if (class33.field471 > var9.field817 && var9.field836 != null) {
                                class58 var70 = new class58();
                                var70.field1048 = var9;
                                var70.field1050 = var9.field836;
                                class89.field1694.method1727(-98, var70);
                            }
                            var9.field817 = class81.field1564;
                            if (var9.field886 != null) {
                                for (int var71 = 0; var71 < class186.field3351; var71++) {
                                    class58 var72 = new class58();
                                    var72.field1048 = var9;
                                    var72.field1041 = class139.field2610[var71];
                                    var72.field1055 = class235.field4287[var71];
                                    var72.field1050 = var9.field886;
                                    class89.field1694.method1727(-107, var72);
                                }
                            }
                            if (class133.field2483 && var9.field806 != null) {
                                class58 var73 = new class58();
                                var73.field1048 = var9;
                                var73.field1050 = var9.field806;
                                class89.field1694.method1727(-95, var73);
                            }
                        }
                    }
                    if (!var9.field763 && class26.field370 == null && class5.field40 == null && !class103.field1936) {
                        if ((var9.field819 >= 0 || var9.field818 != 0) && class205.field3681 >= var12 && class72.field1398 >= var13 && class205.field3681 < var14 && class72.field1398 < var15) {
                            if (var9.field819 >= 0) {
                                class119.field2250 = arg0[var9.field819];
                            } else {
                                class119.field2250 = var9;
                            }
                        }
                        if (var9.field884 == 8 && class205.field3681 >= var12 && class72.field1398 >= var13 && class205.field3681 < var14 && class72.field1398 < var15) {
                            class177.field3223 = var9;
                        }
                        if (var9.field839 > var9.field727) {
                            class221.method1562(16, class205.field3681, var9.field727, var9.field839, class72.field1398, var9.field798 + var10, var11, var9);
                        }
                    }
                    if (var9.field884 == 0) {
                        method1150(arg0, var9.field773, var12, var13, var14, var15, var10 - var9.field829, var11 - var9.field792);
                        if (var9.field848 != null) {
                            method1150(var9.field848, var9.field773, var12, var13, var14, var15, var10 - var9.field829, var11 - var9.field792);
                        }
                        class259 var74 = (class259) class156.field2910.method769(true, (long) var9.field773);
                        if (var74 != null) {
                            class22.method125(var11, var15, var13, var74.field4640, var10, var14, var12, -5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method1151(int arg0) {
        class114.field2182 = null;
        class65.field1260 = null;
        class157.field2918 = null;
        class89.field1690 = null;
        class21.field299 = null;
        class66.field1265 = null;
        int var1 = 82 / ((arg0 + 16) / 53);
        class140.field2616 = null;
        field2820++;
        class51.field904 = null;
        class21.field296 = 0;
        class17.field226 = null;
        class168.field3098 = null;
        class64.field1243 = null;
        class231.field4224.method1732(114);
        class147.field2717 = null;
        class19.field243 = null;
        class106.field2000 = null;
        class112.field2162 = null;
        class11.field108 = null;
        class61.field1117 = null;
        class129.field2412 = null;
        class161.field2984 = null;
        class98.field1839 = null;
        class161.field2982 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method1152(byte arg0) {
        field2813++;
        if (arg0 != -27) {
            field2824 = null;
        }
        boolean var2 = class81.field1556.method986(-513);
        if (!var2) {
            this.method1148(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method732(int arg0) {
        field2821++;
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class36.field508 != null) {
            class36.field508.method239(this.getClass(), 21422);
        }
        if (class108.field2032 != null) {
            class108.field2032.field1687 = false;
        }
        if (arg0 < 77) {
            field2808 = null;
        }
        class108.field2032 = null;
        if (class135.field2532 != null) {
            class135.field2532.method1270((byte) 41);
            class135.field2532 = null;
        }
        class90.method641(class212.field3862, (byte) -50);
        class176.method1278(-31547, class212.field3862);
        if (class106.field2002 != null) {
            class106.field2002.method896(class212.field3862, (byte) -83);
        }
        class172.method1258((byte) -101);
        class179.method1303((byte) -7);
        class106.field2002 = null;
        if (class29.field421 != null) {
            class29.field421.method1001(2);
        }
        if (class194.field3551 != null) {
            class194.field3551.method1001(2);
        }
        class81.field1556.method979(0);
        class29.field425.method360((byte) -111);
        try {
            if (class10.field87 != null) {
                class10.field87.method1085((byte) 100);
            }
            if (class192.field3483 != null) {
                for (int var2 = 0; var2 < class192.field3483.length; var2++) {
                    if (class192.field3483[var2] != null) {
                        class192.field3483[var2].method1085((byte) -126);
                    }
                }
            }
            if (class212.field3854 != null) {
                class212.field3854.method1085((byte) 113);
            }
            if (class28.field399 != null) {
                class28.field399.method1085((byte) 85);
            }
        } catch (IOException var3) {
        }
    }
}

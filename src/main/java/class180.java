import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class180 {

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    private int field2730 = 0;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    private int field2728 = -1;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Lel;")
    private class218 field2737 = new class218();

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "Z")
    public boolean field2741 = false;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    private int field2727;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[Lsa;")
    private class77[] field2723;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "[[I")
    private int[][] field2739;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lma;")
    public static class5 field2724 = class12.method119("gleiten:", (byte) 78);

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "[Lrj;")
    public static class237[] field2722;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method1169(boolean arg0) {
        if (class234.field3872[96]) {
            class289.field4910 += (-class289.field4910 - 24) / 2;
        } else if (class234.field3872[97]) {
            class289.field4910 += (24 - class289.field4910) / 2;
        } else {
            class289.field4910 /= 2;
        }
        class24.field416 += class289.field4910 / 2;
        int var1 = class280.field4739 + class151.field2183.field178;
        field2736++;
        int var2 = class43.field644 + class151.field2183.field211;
        if (class249.field4126 - var1 < -500 || (class249.field4126 - var1) > 500 || (class280.field4748 - var2) < -500 || (class280.field4748 - var2) > 500) {
            class249.field4126 = var1;
            class280.field4748 = var2;
        }
        if (class280.field4748 != var2) {
            class280.field4748 += (var2 - class280.field4748) / 16;
        }
        if (!arg0) {
            field2722 = (class237[]) null;
        }
        if (class234.field3872[98]) {
            class250.field4147 += (12 - class250.field4147) / 2;
        } else if (class234.field3872[99]) {
            class250.field4147 += (-class250.field4147 - 12) / 2;
        } else {
            class250.field4147 /= 2;
        }
        if (class249.field4126 != var1) {
            class249.field4126 += (var1 - class249.field4126) / 16;
        }
        class46.field707 += class250.field4147 / 2;
        class46.method345(-121);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lma;I)V", line = 62)
    public static final void method1170(class5 arg0, int arg1) {
        class135.method885(true);
        class152.method960(arg0, true);
        field2731++;
        if (arg1 != 1387280673) {
            field2734 = -72;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILni;B)Z", line = 80)
    public static final boolean method1171(int arg0, int arg1, class202 arg2, byte arg3) {
        if (arg3 >= -127) {
            return false;
        }
        field2735++;
        byte[] var4 = arg2.method1342(89, arg0, arg1);
        if (var4 == null) {
            return false;
        } else {
            class98.method632(-4096, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(III)V", line = 718)
    public class180(int arg0, int arg1, int arg2) {
        this.field2727 = arg0;
        this.field2732 = arg1;
        this.field2723 = new class77[this.field2732];
        this.field2739 = new int[this.field2727][arg2];
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 114)
    public static void method1172(byte arg0) {
        int var1 = -112 % ((85 - arg0) / 35);
        field2722 = null;
        field2724 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Lng;", line = 123)
    public static final class133 method1173(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3144;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILni;I)Lrj;", line = 137)
    public static final class237 method1174(int arg0, class202 arg1, int arg2) {
        if (arg2 != 0) {
            field2726 = -83;
        }
        field2729++;
        return class67.method486(arg0, (byte) 125, arg1) ? class230.method1641(arg2 ^ 0xFF) : null;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)[[I", line = 163)
    public final int[][] method1175(byte arg0) {
        field2738++;
        if (this.field2732 != this.field2727) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 < 78) {
            field2734 = -100;
        }
        while (this.field2727 > var2) {
            this.field2723[var2] = class169.field2578;
            var2++;
        }
        return this.field2739;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I", line = 186)
    public final int[] method1176(int arg0, int arg1) {
        if (arg1 < 121) {
            this.field2730 = -117;
        }
        field2725++;
        if (this.field2732 == this.field2727) {
            this.field2741 = this.field2723[arg0] == null;
            this.field2723[arg0] = class169.field2578;
            return this.field2739[arg0];
        } else if (this.field2727 == 1) {
            this.field2741 = this.field2728 != arg0;
            this.field2728 = arg0;
            return this.field2739[0];
        } else {
            class77 var3 = this.field2723[arg0];
            if (var3 == null) {
                this.field2741 = true;
                if (this.field2730 >= this.field2727) {
                    class77 var4 = (class77) this.field2737.method1479((byte) -123);
                    var3 = new class77(arg0, var4.field1204);
                    this.field2723[var4.field1200] = null;
                    var4.method1997(-27381);
                } else {
                    var3 = new class77(arg0, this.field2730);
                    this.field2730++;
                }
                this.field2723[arg0] = var3;
            } else {
                this.field2741 = false;
            }
            this.field2737.method1477(false, var3);
            return this.field2739[var3.field1204];
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 260)
    public final void method1177(int arg0) {
        if (arg0 != -1) {
            this.field2730 = -101;
        }
        for (int var2 = 0; var2 < this.field2727; var2++) {
            this.field2739[var2] = null;
        }
        field2733++;
        this.field2739 = (int[][]) null;
        this.field2723 = null;
        this.field2737.method1474((byte) 102);
        this.field2737 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII)V", line = 286)
    public static final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class12.field228 = arg2;
        for (int var7 = -1; var7 < (class175.field2675 + class129.field1940); var7++) {
            class12 var8;
            if (var7 == -1) {
                var8 = class151.field2183;
            } else if (var7 >= class175.field2675) {
                var8 = class119.field1804[class73.field1153[var7 - class175.field2675]];
            } else {
                var8 = class267.field4593[class118.field1785[var7]];
            }
            if (var8 != null && var8.method117((byte) -124)) {
                if (var8 instanceof class177) {
                    class288 var9 = ((class177) var8).field2699;
                    if (var9.field4891 != null) {
                        var9 = var9.method1938((byte) 34);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class175.field2675 <= var7) {
                    class288 var15 = ((class177) var8).field2699;
                    if (var15.field4891 != null) {
                        var15 = var15.method1938((byte) 34);
                    }
                    if (var15.field4906 >= 0 && var15.field4906 < field2722.length) {
                        class197.method1302(var8, arg1 >> 1, arg6, arg4, arg0 >> 1, true, var8.method123((byte) 91) + 15);
                        if (class39.field597 > -1) {
                            field2722[var15.field4906].method213(class39.field597 + arg3 - 12, class79.field1218 + arg5 + -30);
                        }
                    }
                    int var16 = 0;
                    class81[] var17 = class226.field3714;
                    while (var16 < var17.length) {
                        class81 var18 = var17[var16];
                        if (var18 != null && var18.field1259 == 1 && class73.field1153[var7 - class175.field2675] == var18.field1250 && class50.field784 % 20 < 10) {
                            class197.method1302(var8, arg1 >> 1, arg6, arg4, arg0 >> 1, true, var8.method123((byte) 105) + 15);
                            if (class39.field597 > -1) {
                                class66.field1030[var18.field1249].method213(arg3 - (12 - class39.field597), class79.field1218 + -28 + arg5);
                            }
                        }
                        var16++;
                    }
                } else {
                    class91 var10 = (class91) var8;
                    int var11 = 30;
                    if (var10.field1368 != -1 || var10.field1365 != -1) {
                        class197.method1302(var8, arg1 >> 1, arg6, arg4, arg0 >> 1, true, var8.method123((byte) 55) + 15);
                        if (class39.field597 > -1) {
                            if (var10.field1368 != -1) {
                                class185.field2841[var10.field1368].method213(arg3 + class39.field597 - 12, class79.field1218 + arg5 + -var11);
                                var11 += 25;
                            }
                            if (var10.field1365 != -1) {
                                field2722[var10.field1365].method213(arg3 + class39.field597 - 12, class79.field1218 + arg5 + -var11);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class81[] var13 = class226.field3714;
                        while (var12 < var13.length) {
                            class81 var14 = var13[var12];
                            if (var14 != null && var14.field1259 == 10 && class118.field1785[var7] == var14.field1250) {
                                class197.method1302(var8, arg1 >> 1, arg6, arg4, arg0 >> 1, true, var8.method123((byte) 117) + 15);
                                if (class39.field597 > -1) {
                                    class66.field1030[var14.field1249].method213(arg3 + class39.field597 - 12, class79.field1218 + arg5 + -var11);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field204 != null && (class175.field2675 <= var7 || class107.field1594 == 0 || class107.field1594 == 3 || class107.field1594 == 1 && class61.method450(((class91) var8).field1367, 0))) {
                    class197.method1302(var8, arg1 >> 1, arg6, arg4, arg0 >> 1, true, var8.method123((byte) 109));
                    if (class39.field597 > -1 && class12.field228 < class157.field2355) {
                        class157.field2338[class12.field228] = class201.field3197.method2013(var8.field204) / 2;
                        class157.field2352[class12.field228] = class201.field3197.field5037;
                        class157.field2359[class12.field228] = class39.field597;
                        class157.field2353[class12.field228] = class79.field1218;
                        class157.field2345[class12.field228] = var8.field224;
                        class157.field2344[class12.field228] = var8.field183;
                        class157.field2340[class12.field228] = var8.field193;
                        class157.field2341[class12.field228] = var8.field204;
                        class12.field228++;
                    }
                }
                if (var8.field212 > class50.field784) {
                    class237 var19 = class217.field3498[1];
                    class237 var20 = class217.field3498[0];
                    if (var8 instanceof class177) {
                        class177 var21 = (class177) var8;
                        class237[] var22 = (class237[]) ((class237[]) class84.field1288.method521((long) var21.field2699.field4895, (byte) 80));
                        if (var22 == null) {
                            var22 = class230.method1636(var21.field2699.field4895, 0, class206.field3285, 256);
                            if (var22 != null) {
                                class84.field1288.method519((byte) -95, var22, (long) var21.field2699.field4895);
                            }
                        }
                        if (var22 != null && var22.length == 2) {
                            var20 = var22[0];
                            var19 = var22[1];
                        }
                    }
                    class197.method1302(var8, arg1 >> 1, arg6, arg4, arg0 >> 1, true, var8.method123((byte) 98) + var20.field3914 + 10);
                    if (class39.field597 > -1) {
                        int var23 = class79.field1218 + arg5 - 3;
                        int var24 = class39.field597 + arg3 - (var20.field3918 >> 1);
                        var20.method213(var24, var23);
                        int var25 = var8.field177 * var20.field3918 / 255;
                        int var26 = var20.field3914;
                        class124.method829(var24, var23, var24 + var25, var23 + var26);
                        var19.method213(var24, var23);
                        class124.method822(arg3, arg5, arg0 + arg3, arg1 + arg5);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class50.field784 < var8.field194[var27]) {
                        class197.method1302(var8, arg1 >> 1, arg6, arg4, arg0 >> 1, true, var8.method123((byte) 96) / 2);
                        if (class39.field597 > -1) {
                            if (var27 == 1) {
                                class79.field1218 -= 20;
                            }
                            if (var27 == 2) {
                                class39.field597 -= 15;
                                class79.field1218 -= 10;
                            }
                            if (var27 == 3) {
                                class39.field597 += 15;
                                class79.field1218 -= 10;
                            }
                            class294.field4957[var8.field200[var27]].method213(arg3 + class39.field597 - 12, class79.field1218 + -12 + arg5);
                            class282.field4791.method2019(class175.method1148(var8.field187[var27], false), class39.field597 + arg3 - 1, class79.field1218 + arg5 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var28 = 0; var28 < class12.field228; var28++) {
            int var29 = class157.field2359[var28];
            int var30 = class157.field2353[var28];
            int var31 = class157.field2352[var28];
            int var32 = class157.field2338[var28];
            boolean var33 = true;
            while (var33) {
                var33 = false;
                for (int var34 = 0; var34 < var28; var34++) {
                    if (var30 + 2 > class157.field2353[var34] + -class157.field2352[var34] && var30 - var31 < class157.field2353[var34] + 2 && (var29 - var32) < (class157.field2359[var34] + class157.field2338[var34]) && (var29 + var32) > (class157.field2359[var34] - class157.field2338[var34]) && var30 > (class157.field2353[var34] - class157.field2352[var34])) {
                        var30 = class157.field2353[var34] - class157.field2352[var34];
                        var33 = true;
                    }
                }
            }
            class39.field597 = class157.field2359[var28];
            class79.field1218 = class157.field2353[var28] = var30;
            class5 var35 = class157.field2341[var28];
            if (class303.field5101 == 0) {
                int var36 = 16776960;
                if (class157.field2345[var28] < 6) {
                    var36 = client.field1762[class157.field2345[var28]];
                }
                if (class157.field2345[var28] == 6) {
                    var36 = (class60.field938 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class157.field2345[var28] == 7) {
                    var36 = class60.field938 % 20 >= 10 ? 65535 : 255;
                }
                if (class157.field2345[var28] == 8) {
                    var36 = class60.field938 % 20 < 10 ? 45056 : 8454016;
                }
                if (class157.field2345[var28] == 9) {
                    int var37 = 150 - class157.field2340[var28];
                    if (var37 < 50) {
                        var36 = var37 * 1280 + 16711680;
                    } else if (var37 < 100) {
                        var36 = 33160960 - (var37 * 327680);
                    } else if (var37 < 150) {
                        var36 = var37 * 5 + 65280 - 500;
                    }
                }
                if (class157.field2345[var28] == 10) {
                    int var38 = 150 - class157.field2340[var28];
                    if (var38 < 50) {
                        var36 = var38 * 5 + 16711680;
                    } else if (var38 < 100) {
                        var36 = 33095935 - var38 * 327680;
                    } else if (var38 < 150) {
                        var36 = var38 * 327680 + 255 - ((var38 + -100) * 5) - 32768000;
                    }
                }
                if (class157.field2345[var28] == 11) {
                    int var39 = 150 - class157.field2340[var28];
                    if (var39 < 50) {
                        var36 = 16777215 - (var39 * 327685);
                    } else if (var39 < 100) {
                        var36 = (var39 - 50) * 327685 + 65280;
                    } else if (var39 < 150) {
                        var36 = 16777215 + 32768000 - (var39 * 327680);
                    }
                }
                if (class157.field2344[var28] == 0) {
                    class201.field3197.method2019(var35, arg3 + class39.field597, arg5 - -class79.field1218, var36, 0);
                }
                if (class157.field2344[var28] == 1) {
                    class201.field3197.method2026(var35, class39.field597 + arg3, class79.field1218 + arg5, var36, 0, class60.field938);
                }
                if (class157.field2344[var28] == 2) {
                    class201.field3197.method2037(var35, class39.field597 + arg3, arg5 - -class79.field1218, var36, 0, class60.field938);
                }
                if (class157.field2344[var28] == 3) {
                    class201.field3197.method2023(var35, class39.field597 + arg3, class79.field1218 + arg5, var36, 0, class60.field938, 150 - class157.field2340[var28]);
                }
                if (class157.field2344[var28] == 4) {
                    int var40 = (150 - class157.field2340[var28]) * (class201.field3197.method2013(var35) + 100) / 150;
                    class124.method829(class39.field597 + arg3 - 50, arg5, arg3 + class39.field597 + 50, arg1 + arg5);
                    class201.field3197.method2032(var35, class39.field597 + arg3 + 50 - var40, class79.field1218 + arg5, var36, 0);
                    class124.method822(arg3, arg5, arg0 + arg3, arg1 + arg5);
                }
                if (class157.field2344[var28] == 5) {
                    int var41 = 150 - class157.field2340[var28];
                    class124.method829(arg3, arg5 + class79.field1218 - class201.field3197.field5037 - 1, arg3 - -arg0, class79.field1218 + arg5 + 5);
                    int var42 = 0;
                    if (var41 < 25) {
                        var42 = var41 - 25;
                    } else if (var41 > 125) {
                        var42 = var41 - 125;
                    }
                    class201.field3197.method2019(var35, class39.field597 + arg3, class79.field1218 + arg5 + var42, var36, 0);
                    class124.method822(arg3, arg5, arg0 + arg3, arg1 + arg5);
                }
            } else {
                class201.field3197.method2019(var35, class39.field597 + arg3, class79.field1218 + arg5, 16776960, 0);
            }
        }
        field2740++;
    }
}

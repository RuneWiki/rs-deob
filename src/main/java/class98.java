import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class98 {

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lja;")
    public static class62 field2275 = class30.method243(43, ":duelreq:");

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "[I")
    public static int[] field2277 = new int[32];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lpb;")
    public static class105 field2274 = new class105();

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lc;")
    public static class18 field2288 = new class18(50);

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lc;")
    public static class18 field2289 = new class18(100);

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2295 = 0;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "[I")
    public static int[] field2297 = new int[256];

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Lja;")
    private static class62 field2299 = class30.method243(43, "flash2:");

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lja;")
    public static class62 field2296 = field2299;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lja;")
    public static class62 field2298 = field2299;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2300 = 0;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field2276;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public int field2283;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lpd;")
    public static class108 field2292;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lcf;")
    public static class21 field2290;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Ld;")
    public static class25 field2293;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[B")
    public byte[] field2272;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[B")
    public byte[] field2279;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method757(byte arg0) {
        if (arg0 != 65) {
            method757((byte) -125);
        }
        field2298 = null;
        field2288 = null;
        field2290 = null;
        field2275 = null;
        field2293 = null;
        field2277 = null;
        field2297 = null;
        field2296 = null;
        field2292 = null;
        field2289 = null;
        field2299 = null;
        field2274 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lja;ILja;ILja;)V")
    public static final void method758(class62 arg0, int arg1, class62 arg2, int arg3, class62 arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class34.field820[var5] = class34.field820[var5 - 1];
            class118.field2696[var5] = class118.field2696[var5 - 1];
            class111.field2525[var5] = class111.field2525[var5 - 1];
            class122.field2797[var5] = class122.field2797[var5 - 1];
        }
        if (arg1 != -13412) {
            method757((byte) 113);
        }
        field2286++;
        class34.field820[0] = arg3;
        class118.field2696[0] = arg0;
        class111.field2525[0] = arg4;
        class122.field2797[0] = arg2;
        class116.field2672 = class150.field3538;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lja;")
    public static final class62 method759(byte arg0, int arg1) {
        field2280++;
        if (arg0 != 68) {
            return null;
        } else if (arg1 < 100000) {
            return class70.method594(new class62[] { client.field480, class31.method249(true, arg1), class43.field1006 }, arg0 + 1161);
        } else if (arg1 < 10000000) {
            return class70.method594(new class62[] { class148.field3492, class31.method249(true, arg1 / 1000), class138.field3219, class43.field1006 }, arg0 + 1161);
        } else {
            return class70.method594(new class62[] { class29.field705, class31.method249(true, arg1 / 1000000), class28.field698, class43.field1006 }, 1229);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILae;)V")
    public static final void method760(int arg0, class6 arg1) {
        field2278++;
        arg1.field145 = false;
        if (arg0 != 22445) {
            return;
        }
        if (arg1.field191 != -1) {
            class12 var2 = class141.method1121(arg1.field191, -24732);
            if (var2 == null || var2.field263 == null) {
                arg1.field191 = -1;
            } else {
                arg1.field171++;
                if (var2.field263.length > arg1.field161 && arg1.field171 > var2.field280[arg1.field161]) {
                    arg1.field161++;
                    arg1.field171 = 1;
                    class27.method216(64, arg1.field136, arg1.field161, arg1.field134, var2);
                }
                if (arg1.field161 >= var2.field263.length) {
                    arg1.field171 = 0;
                    arg1.field161 = 0;
                    class27.method216(64, arg1.field136, arg1.field161, arg1.field134, var2);
                }
            }
        }
        if (arg1.field195 != -1 && class86.field2060 >= arg1.field159) {
            if (arg1.field184 < 0) {
                arg1.field184 = 0;
            }
            int var3 = class38.method289(arg1.field195, 2116).field2743;
            if (var3 == -1) {
                arg1.field195 = -1;
            } else {
                class12 var4 = class141.method1121(var3, -24732);
                if (var4 == null || var4.field263 == null) {
                    arg1.field195 = -1;
                } else {
                    arg1.field198++;
                    if (arg1.field184 < var4.field263.length && var4.field280[arg1.field184] < arg1.field198) {
                        arg1.field198 = 1;
                        arg1.field184++;
                        class27.method216(64, arg1.field136, arg1.field184, arg1.field134, var4);
                    }
                    if (arg1.field184 >= var4.field263.length && (arg1.field184 < 0 || var4.field263.length <= arg1.field184)) {
                        arg1.field195 = -1;
                    }
                }
            }
        }
        if (arg1.field177 != -1 && arg1.field155 <= 1) {
            class12 var5 = class141.method1121(arg1.field177, -24732);
            if (var5.field271 == 1 && arg1.field185 > 0 && class86.field2060 >= arg1.field150 && class86.field2060 > arg1.field187) {
                arg1.field155 = 1;
                return;
            }
        }
        if (arg1.field177 != -1 && arg1.field155 == 0) {
            class12 var6 = class141.method1121(arg1.field177, arg0 ^ 0xFFFFC8C9);
            if (var6 == null || var6.field263 == null) {
                arg1.field177 = -1;
            } else {
                arg1.field139++;
                if (arg1.field169 < var6.field263.length && arg1.field139 > var6.field280[arg1.field169]) {
                    arg1.field139 = 1;
                    arg1.field169++;
                    class27.method216(64, arg1.field136, arg1.field169, arg1.field134, var6);
                }
                if (var6.field263.length <= arg1.field169) {
                    arg1.field176++;
                    arg1.field169 -= var6.field273;
                    if (arg1.field176 >= var6.field266) {
                        arg1.field177 = -1;
                    } else if (arg1.field169 >= 0 && var6.field263.length > arg1.field169) {
                        class27.method216(arg0 ^ 0x57ED, arg1.field136, arg1.field169, arg1.field134, var6);
                    } else {
                        arg1.field177 = -1;
                    }
                }
                arg1.field145 = var6.field270;
            }
        }
        if (arg1.field155 > 0) {
            arg1.field155--;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method761(int arg0) {
        field2273++;
        int var1 = class65.field1586 * 128 + 64;
        int var2 = client.field489 * 128 + 64;
        int var3 = class111.method908(128, var1, var2, class155.field3598) - class108.field2506;
        if (class140.field3248 < var2) {
            class140.field3248 += (var2 - class140.field3248) * class60.field1453 / 1000 + class4.field60;
            if (class140.field3248 > var2) {
                class140.field3248 = var2;
            }
        }
        if (var2 < class140.field3248) {
            class140.field3248 -= (class140.field3248 - var2) * class60.field1453 / 1000 + class4.field60;
            if (var2 > class140.field3248) {
                class140.field3248 = var2;
            }
        }
        int var4 = class84.field2019 * 128 + 64;
        if (var1 > class81.field1959) {
            class81.field1959 += class4.field60 + (var1 - class81.field1959) * class60.field1453 / 1000;
            if (var1 < class81.field1959) {
                class81.field1959 = var1;
            }
        }
        if (var3 > class115.field2649) {
            class115.field2649 += (var3 - class115.field2649) * class60.field1453 / 1000 + class4.field60;
            if (class115.field2649 > var3) {
                class115.field2649 = var3;
            }
        }
        if (class115.field2649 > var3) {
            class115.field2649 -= (class115.field2649 - var3) * class60.field1453 / 1000 + class4.field60;
            if (class115.field2649 < var3) {
                class115.field2649 = var3;
            }
        }
        if (class81.field1959 > var1) {
            class81.field1959 -= (class81.field1959 - var1) * class60.field1453 / 1000 + class4.field60;
            if (var1 > class81.field1959) {
                class81.field1959 = var1;
            }
        }
        int var5 = class108.field2505 * 128 + 64;
        int var6 = class111.method908(128, var5, var4, class155.field3598) - class22.field512;
        int var7 = var5 - class81.field1959;
        int var8 = var4 - class140.field3248;
        int var9 = var6 - class115.field2649;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class143.field3351;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > class20.field433) {
            class20.field433 += (var11 - class20.field433) * class57.field1419 / 1000 + class141.field3295;
            if (var11 < class20.field433) {
                class20.field433 = var11;
            }
        }
        int var14 = -78 / ((arg0 + 24) / 39);
        if (var13 > 0) {
            class143.field3351 += class57.field1419 * var13 / 1000 + class141.field3295;
            class143.field3351 &= 0x7FF;
        }
        if (var13 < 0) {
            class143.field3351 -= -var13 * class57.field1419 / 1000 + class141.field3295;
            class143.field3351 &= 0x7FF;
        }
        int var15 = var12 - class143.field3351;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (class20.field433 > var11) {
            class20.field433 -= class141.field3295 + (class20.field433 - var11) * class57.field1419 / 1000;
            if (var11 > class20.field433) {
                class20.field433 = var11;
            }
        }
        if (var15 < 0 && var13 > 0 || var15 > 0 && var13 < 0) {
            class143.field3351 = var12;
        }
    }
}

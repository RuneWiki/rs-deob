import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class125 {

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[B")
    public byte[] field1826;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Z")
    public static boolean field1823 = false;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field1831 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Lod;")
    public static class101 field1832 = class46.method335(-51, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lod;")
    private static class101 field1830 = class46.method335(-58, "Please try using a different world)3");

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lod;")
    public static class101 field1829 = field1830;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lod;")
    public static class101 field1836 = field1830;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lod;")
    public static class101 field1828 = field1830;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lod;")
    public static class101 field1833 = field1830;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lod;")
    public static class101 field1827 = field1830;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lod;")
    public static class101 field1838 = field1830;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Lcb;")
    public static class17 field1837 = new class17(64);

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "[I")
    public static int[] field1840 = new int[50];

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "Lod;")
    private static class101 field1839 = class46.method335(79, "wave2:");

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Lod;")
    public static class101 field1841 = field1839;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Lod;")
    public static class101 field1844 = field1839;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "[[[I")
    public static int[][][] field1842 = new int[4][13][13];

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "Lod;")
    public static class101 field1843 = class46.method335(-107, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Lod;")
    public static class101 field1845 = class46.method335(-88, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static void method609(boolean arg0) {
        field1836 = null;
        field1832 = null;
        field1840 = null;
        if (!arg0) {
            return;
        }
        field1830 = null;
        field1841 = null;
        field1845 = null;
        field1829 = null;
        field1838 = null;
        field1833 = null;
        field1837 = null;
        field1843 = null;
        field1827 = null;
        field1839 = null;
        field1844 = null;
        field1842 = null;
        field1828 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
    public static final void method610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class38.method278(arg4, arg2, arg1 + arg4, arg0 + arg2);
        field1825++;
        class124.method943();
        class150.field3444++;
        class108.method776((byte) 49, true);
        class1.method1(-1320915417, true);
        class108.method776((byte) 68, false);
        class1.method1(-1320915417, false);
        class11.method73(10091);
        class89.method628(124);
        if (!field1823) {
            int var5 = class97.field2100 + class155.field3563 & 0x7FF;
            int var6 = class54.field1226;
            if (class126.field2847 / 256 > var6) {
                var6 = class126.field2847 / 256;
            }
            if (class65.field1473[4] && var6 < class27.field721[4] + 128) {
                var6 = class27.field721[4] + 128;
            }
            class22.method178(class65.method449(class82.field1778.field1298, class82.field1778.field1341, class95.field2040, true) - 50, var6 * 3 + 600, (byte) 19, var5, var6, class101.field2189, class97.field2108);
        }
        int var7;
        if (field1823) {
            var7 = class143.method1143(3);
        } else {
            var7 = class78.method533(2);
        }
        int var8 = class120.field2637;
        int var9 = class26.field692;
        int var10 = class26.field677;
        int var11 = class133.field3048;
        int var12 = class132.field3033;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class65.field1473[var13]) {
                int var16 = (int) ((double) (class56.field1263[var13] * 2 + 1) * Math.random() + Math.sin((double) class102.field2238[var13] / 100.0D * (double) class143.field3292[var13]) * (double) class27.field721[var13] - (double) class56.field1263[var13]);
                if (var13 == 4) {
                    class26.field677 += var16;
                    if (class26.field677 < 128) {
                        class26.field677 = 128;
                    }
                    if (class26.field677 > 383) {
                        class26.field677 = 383;
                    }
                }
                if (var13 == 2) {
                    class133.field3048 += var16;
                }
                if (var13 == 0) {
                    class120.field2637 += var16;
                }
                if (var13 == 3) {
                    class132.field3033 = class132.field3033 + var16 & 0x7FF;
                }
                if (var13 == 1) {
                    class26.field692 += var16;
                }
            }
        }
        int var14 = class40.field947;
        if (arg3 >= -56) {
            field1845 = null;
        }
        int var15 = class105.field2264;
        if (var14 >= arg4 && var14 < arg1 + arg4 && var15 >= arg2 && var15 < arg2 + arg0) {
            class113.field2478 = true;
            class113.field2468 = 0;
            class113.field2467 = class105.field2264 - arg2;
            class113.field2454 = class40.field947 - arg4;
        } else {
            class113.field2478 = false;
            class113.field2468 = 0;
        }
        class49.method367(13057);
        class38.method275(arg4, arg2, arg1, arg0, 0);
        class49.method367(13057);
        class33.field857.method579(class120.field2637, class26.field692, class133.field3048, class26.field677, class132.field3033, var7);
        class49.method367(13057);
        class33.field857.method564();
        class44.method321(arg0, 5, arg4, arg1, arg2);
        class5.method27(arg4, arg2, 0);
        ((class118) class124.field2720).method893(class141.field3255, -54);
        class83.method607(arg1, arg2, arg0, arg4, -8);
        class132.field3033 = var12;
        class120.field2637 = var8;
        class26.field692 = var9;
        class26.field677 = var10;
        class133.field3048 = var11;
        if (class27.field729 && class141.method1123(0, false, true) == 0) {
            class27.field729 = false;
        }
        if (class27.field729) {
            class38.method275(arg4, arg2, arg1, arg0, 0);
            class125.method961(-95, false, class41.field993);
        }
        if (!class27.field729 && !class15.field330 && arg4 <= var14 && arg1 + arg4 > var14 && var15 >= arg2 && arg0 + arg2 > var15) {
            class132.method1019(arg2, (byte) -70, arg4, var15, var14);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method611(byte arg0) {
        field1824++;
        try {
            if (class11.field167 == 1) {
                int var1 = class33.field849.method71((byte) 110);
                if (var1 > 0 && class33.field849.method58((byte) 123)) {
                    int var2 = var1 - class90.field1962;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class33.field849.method82(var2, arg0 ^ 0xFFFFFFD5);
                    return;
                }
                class33.field849.method83((byte) -35);
                class33.field849.method64(true);
                if (class100.field2154 == null) {
                    class11.field167 = 0;
                } else {
                    class11.field167 = 2;
                }
                class133.field3047 = null;
                class30.field779 = null;
            }
            if (arg0 != -43) {
                method611((byte) -107);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class33.field849.method83((byte) -54);
            class100.field2154 = null;
            class11.field167 = 0;
            class133.field3047 = null;
            class30.field779 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public static final void method612(int arg0) {
        class24.field579 = arg0;
        field1822++;
        class11.field176 = 0;
        class138.method1094(arg0 ^ 0x3);
        class126.method975(9620);
        class57.method409(11);
        class154.method1192(false);
        for (int var1 = 0; var1 < class24.field579; var1++) {
            int var3 = class3.field55[var1];
            if (class143.field3305 != class94.field2032[var3].field1283) {
                class94.field2032[var3] = null;
            }
        }
        if (class8.field121 != class118.field2611.field3175) {
            throw new RuntimeException("gpp1 pos:" + class118.field2611.field3175 + " psize:" + class8.field121);
        }
        for (int var2 = 0; var2 < class150.field3442; var2++) {
            if (class94.field2032[class143.field3285[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class150.field3442);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILia;)V")
    public static final void method613(int arg0, class57 arg1) {
        arg1.field1278 = arg1.field1289;
        field1834++;
        if (arg1.field1333 == 0) {
            arg1.field1276 = 0;
            return;
        }
        if (arg1.field1300 != -1 && arg1.field1303 == 0) {
            class95 var2 = class8.method39(arg1.field1300, (byte) -75);
            if (arg1.field1286 > 0 && var2.field2044 == 0) {
                arg1.field1276++;
                return;
            }
            if (arg1.field1286 <= 0 && var2.field2052 == 0) {
                arg1.field1276++;
                return;
            }
        }
        int var3 = arg1.field1341;
        int var4 = arg1.field1298;
        int var5 = arg1.field1291[arg1.field1333 - 1] * 128 + arg1.field1334 * 64;
        int var6 = arg1.field1271[arg1.field1333 - 1] * 128 + arg1.field1334 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field1298 = var6;
            arg1.field1341 = var5;
            return;
        }
        if (var5 > var3) {
            if (var4 < var6) {
                arg1.field1307 = 1280;
            } else if (var4 > var6) {
                arg1.field1307 = 1792;
            } else {
                arg1.field1307 = 1536;
            }
        } else if (var5 >= var3) {
            if (var4 < var6) {
                arg1.field1307 = 1024;
            } else if (var4 > var6) {
                arg1.field1307 = 0;
            }
        } else if (var4 < var6) {
            arg1.field1307 = 768;
        } else if (var4 > var6) {
            arg1.field1307 = 256;
        } else {
            arg1.field1307 = 512;
        }
        int var7 = arg1.field1327;
        int var8 = arg1.field1307 - arg1.field1310 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field1302;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field1296;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field1273;
        }
        int var9 = 4;
        if (var7 == -1) {
            var7 = arg1.field1302;
        }
        arg1.field1278 = var7;
        boolean var10 = true;
        if (arg1 instanceof class62) {
            var10 = ((class62) arg1).field1374.field2566;
        }
        if (var10) {
            if (arg1.field1310 != arg1.field1307 && arg1.field1339 == -1 && arg1.field1279 != 0) {
                var9 = 2;
            }
            if (arg1.field1333 > 2) {
                var9 = 6;
            }
            if (arg1.field1333 > 3) {
                var9 = 8;
            }
            if (arg1.field1276 > 0 && arg1.field1333 > 1) {
                arg1.field1276--;
                var9 = 8;
            }
        } else {
            if (arg1.field1333 > 1) {
                var9 = 6;
            }
            if (arg1.field1333 > 2) {
                var9 = 8;
            }
            if (arg1.field1276 > 0 && arg1.field1333 > 1) {
                var9 = 8;
                arg1.field1276--;
            }
        }
        if (arg1.field1313[arg1.field1333 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var6) {
            arg1.field1298 += var9;
            if (arg1.field1298 > var6) {
                arg1.field1298 = var6;
            }
        } else if (var6 < var4) {
            arg1.field1298 -= var9;
            if (var6 > arg1.field1298) {
                arg1.field1298 = var6;
            }
        }
        if (var3 < var5) {
            arg1.field1341 += var9;
            if (arg1.field1341 > var5) {
                arg1.field1341 = var5;
            }
        } else if (var3 > var5) {
            arg1.field1341 -= var9;
            if (arg1.field1341 < var5) {
                arg1.field1341 = var5;
            }
        }
        if (var9 >= 8 && arg1.field1302 == arg1.field1278 && arg1.field1297 != -1) {
            arg1.field1278 = arg1.field1297;
        }
        if (arg0 > 82 && (arg1.field1341 == var5 && arg1.field1298 == var6)) {
            if (arg1.field1286 > 0) {
                arg1.field1286--;
            }
            arg1.field1333--;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V")
    public class84(byte[] arg0) {
        this.field1826 = arg0;
    }
}

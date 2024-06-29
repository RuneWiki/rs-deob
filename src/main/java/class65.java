import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class65 {

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    private int field1393 = 0;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[Ljd;")
    private class90[] field1366;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lrf;")
    private static class163 field1378 = class53.method392(-40, "Sorry invited players only)3");

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1381 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lrf;")
    public static class163 field1365 = class53.method392(66, "ams");

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lrf;")
    public static class163 field1383 = field1378;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lge;")
    public static class65 field1373 = new class65(32);

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[I")
    public static int[] field1386 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Lrf;")
    public static class163 field1387 = null;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lrf;")
    public static class163 field1389 = class53.method392(-98, "Welt");

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field1391 = 0;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[[B")
    public static byte[][] field1388 = new byte[250][];

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Lrf;")
    private static class163 field1395 = class53.method392(-106, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lrf;")
    public static class163 field1385 = field1395;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lrf;")
    public static class163 field1394 = class53.method392(78, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lrf;")
    public static class163 field1396 = class53.method392(-53, "::clientdrop");

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "J")
    private long field1380;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Ljd;")
    private class90 field1379;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Ljd;")
    private class90 field1392;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
    public final int method461(int arg0) {
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field1368; var3++) {
            class90 var4 = this.field1366[var3];
            for (class90 var5 = var4.field1942; var5 != var4; var5 = var5.field1942) {
                var2++;
            }
        }
        field1370++;
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjd;J)V")
    public final void method462(int arg0, class90 arg1, long arg2) {
        if (arg1.field1948 != null) {
            arg1.method630(108);
        }
        field1377++;
        class90 var5 = this.field1366[(int) ((long) (this.field1368 - 1) & arg2)];
        int var6 = -78 / ((arg0 - 60) / 48);
        arg1.field1948 = var5.field1948;
        arg1.field1942 = var5;
        arg1.field1948.field1942 = arg1;
        arg1.field1950 = arg2;
        arg1.field1942.field1948 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[Ljd;)I")
    public final int method463(int arg0, class90[] arg1) {
        field1374++;
        int var3 = 0;
        if (arg0 >= -34) {
            return -107;
        }
        for (int var4 = 0; var4 < this.field1368; var4++) {
            class90 var5 = this.field1366[var4];
            for (class90 var6 = var5.field1942; var6 != var5; var6 = var6.field1942) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Ljd;")
    public final class90 method464(int arg0) {
        field1384++;
        if (this.field1379 == null) {
            return null;
        }
        class90 var2 = this.field1366[(int) (this.field1380 & (long) (this.field1368 - 1))];
        while (this.field1379 != var2) {
            if (this.field1379.field1950 == this.field1380) {
                class90 var3 = this.field1379;
                this.field1379 = this.field1379.field1942;
                return var3;
            }
            this.field1379 = this.field1379.field1942;
        }
        this.field1379 = null;
        if (arg0 != -26421) {
            this.method468(88);
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JB)Ljd;")
    public final class90 method465(long arg0, byte arg1) {
        field1369++;
        this.field1380 = arg0;
        class90 var4 = this.field1366[(int) (arg0 & (long) (this.field1368 - 1))];
        this.field1379 = var4.field1942;
        int var5 = -59 / ((22 - arg1) / 43);
        while (this.field1379 != var4) {
            if (this.field1379.field1950 == arg0) {
                class90 var6 = this.field1379;
                this.field1379 = this.field1379.field1942;
                return var6;
            }
            this.field1379 = this.field1379.field1942;
        }
        this.field1379 = null;
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    public static final void method466(int arg0, int arg1) {
        field1375++;
        if (arg1 != 19590) {
            method469(null, -101);
        }
        if (class180.field3611 == 0) {
            class49.field949.method746(arg0, 127);
        } else {
            class209.field4074 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method467(byte arg0) {
        field1396 = null;
        field1386 = null;
        field1387 = null;
        field1365 = null;
        field1394 = null;
        field1373 = null;
        field1389 = null;
        field1378 = null;
        field1388 = null;
        field1395 = null;
        field1385 = null;
        int var1 = 57 % ((arg0 + 79) / 40);
        field1383 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Ljd;")
    public final class90 method468(int arg0) {
        this.field1393 = 0;
        if (arg0 != 1) {
            this.field1392 = null;
        }
        field1376++;
        return this.method471(-4984);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lpf;I)V")
    public static final void method469(class145 arg0, int arg1) {
        field1371++;
        for (int var2 = 0; var2 < class61.field1247.length; var2++) {
            class61.field1247[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var17 = (int) ((double) var3 * 128.0D * Math.random());
            class61.field1247[var17] = (int) (Math.random() * 256.0D);
        }
        int var5 = -100 / ((arg1 - 41) / 46);
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var3 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    class13.field245[var16] = (class61.field1247[var16 + 1] + class61.field1247[var16 - 1] + class61.field1247[var16 + -128] + class61.field1247[var16 + 128]) / 4;
                }
            }
            int[] var14 = class61.field1247;
            class61.field1247 = class13.field245;
            class13.field245 = var14;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.field2976; var8++) {
            for (int var9 = 0; var9 < arg0.field2972; var9++) {
                if (arg0.field2977[var7++] != 0) {
                    int var10 = arg0.field2975 + var9 + 16;
                    int var11 = var8 + arg0.field2970 + 16;
                    int var12 = (var11 << 7) + var10;
                    class61.field1247[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1367++;
        if (arg3 >= 1 && arg1 >= 1 && arg3 <= 102 && arg1 <= 102) {
            if (class86.field1880 && class60.field1227 != arg6) {
                return;
            }
            long var8 = 0L;
            if (arg2 == 0) {
                var8 = class6.method58(arg6, arg3, arg1);
            }
            boolean var10 = true;
            if (arg2 == 1) {
                var8 = class74.method524(arg6, arg3, arg1);
            }
            if (arg2 == 2) {
                var8 = class9.method74(arg6, arg3, arg1);
            }
            if (arg2 == 3) {
                var8 = class48.method294(arg6, arg3, arg1);
            }
            boolean var11 = false;
            boolean var12 = false;
            if (var8 != 0L) {
                int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
                int var14 = (int) var8 >> 14 & 0x1F;
                int var15 = (int) var8 >> 20 & 0x3;
                if (arg2 == 0) {
                    class166.method1131(arg6, arg3, arg1);
                    class61 var16 = class199.method1314((byte) 126, var13);
                    if (var16.field1296 != 0) {
                        class103.field2163[arg6].method864(arg1, var15, var16.field1272, var14, -4, arg3);
                    }
                }
                if (arg2 == 1) {
                    class39.method246(arg6, arg3, arg1);
                }
                if (arg2 == 2) {
                    class116.method803(arg6, arg3, arg1);
                    class61 var17 = class199.method1314((byte) 126, var13);
                    if (arg3 + var17.field1257 > 103 || arg1 + var17.field1257 > 103 || arg3 + var17.field1250 > 103 || arg1 + var17.field1250 > 103) {
                        return;
                    }
                    if (var17.field1296 != 0) {
                        class103.field2163[arg6].method863(var17.field1250, var17.field1272, var17.field1257, -12583, arg1, var15, arg3);
                    }
                }
                if (arg2 == 3) {
                    class201.method1322(arg6, arg3, arg1);
                    class61 var18 = class199.method1314((byte) 126, var13);
                    if (var18.field1296 == 1) {
                        class103.field2163[arg6].method865(arg0 ^ 0xFFFBAD8C, arg3, arg1);
                    }
                }
            }
            if (arg7 >= 0) {
                int var19 = arg6;
                if (arg6 < 3 && (class21.field372[1][arg3][arg1] & 0x2) == 2) {
                    var19 = arg6 + 1;
                }
                class72.method513(var19, arg7, arg5, arg1, arg6, class103.field2163[arg6], arg3, arg4, arg0 ^ 0x5273);
            }
        }
        if (arg0 != 21107) {
            method470(32, -80, 89, -88, 124, 13, 99, -118);
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Ljd;")
    public final class90 method471(int arg0) {
        field1382++;
        if (arg0 != -4984) {
            field1373 = null;
        }
        if (this.field1393 > 0 && this.field1366[this.field1393 - 1] != this.field1392) {
            class90 var2 = this.field1392;
            this.field1392 = var2.field1942;
            return var2;
        }
        while (this.field1393 < this.field1368) {
            class90 var3 = this.field1366[this.field1393++].field1942;
            if (this.field1366[this.field1393 - 1] != var3) {
                this.field1392 = var3.field1942;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    public class65(int arg0) {
        this.field1368 = arg0;
        this.field1366 = new class90[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class90 var3 = this.field1366[var2] = new class90();
            var3.field1942 = var3;
            var3.field1948 = var3;
        }
    }
}

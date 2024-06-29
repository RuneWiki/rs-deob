import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class225 extends class332 {

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "[I")
    public int[] field3201 = new int[5];

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public int field3217 = 0;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "[Lv;")
    public class80[] field3199 = new class80[5];

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3189 = null;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field3192 = 255;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "Lqa;")
    public class138 field3209;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Lbm;")
    public class146 field3206;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Lej;")
    public class168 field3196;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Llc;")
    public static class175 field3193;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "Ldk;")
    public class225 field3205;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Lrf;")
    public class290 field3218;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "Lm;")
    public class54 field3213;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Lwe;")
    public class57 field3203;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "Z")
    public boolean field3202;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "Z")
    public boolean field3211;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "Z")
    public boolean field3215;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)I", line = 7)
    public static final int method1548(boolean arg0, int arg1) {
        if (arg1 != -1) {
            method1549(-128);
        }
        field3191++;
        long var2 = class200.method1375(-16185);
        for (class231 var4 = arg0 ? (class231) class187.field2697.method1540(-124) : (class231) class187.field2697.method1544(arg1 ^ 0xFFFFFF80); var4 != null; var4 = (class231) class187.field2697.method1544(126)) {
            if ((var4.field3372 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3372 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field5065;
                    class226.field3235[var5] = class121.field1698[var5];
                    var4.method2285(true);
                    return var5;
                }
                var4.method2285(true);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 48)
    public static void method1549(int arg0) {
        field3193 = null;
        field3189 = null;
        if (arg0 != -65536) {
            method1549(-19);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZII[[II)I", line = 63)
    public static final int method1550(int arg0, boolean arg1, int arg2, int arg3, int[][] arg4, int arg5) {
        if (arg1) {
            method1550(98, true, -21, 12, (int[][]) ((int[][]) null), -21);
        }
        int var6 = (128 - arg2) * arg4[arg0][arg3] + arg4[arg0 + 1][arg3] * arg2 >> 7;
        field3190++;
        int var7 = (128 - arg2) * arg4[arg0][arg3 + 1] + (arg4[arg0 + 1][arg3 + 1] * arg2) >> 7;
        return (128 - arg5) * var6 + arg5 * var7 >> 7;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 84)
    public static final void method1551(byte arg0) {
        if (class295.field4611 != null) {
            class222 var1 = new class222();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class295.field4611[var2][var3] = var1;
                }
            }
        }
        field3195++;
        if (arg0 <= 111) {
            field3192 = 10;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(III)V", line = 119)
    public class225(int arg0, int arg1, int arg2) {
        this.field3204 = arg1;
        this.field3198 = this.field3200 = arg0;
        this.field3212 = arg2;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V", line = 144)
    public static final void method1552(int arg0) {
        for (int var1 = arg0; var1 < class21.field278; var1++) {
            int var2 = class129.field1772[var1];
            class184 var3 = class223.field3159[var2];
            int var4 = class307.field4742.method661(-1);
            if ((var4 & 0x8) != 0) {
                var4 += class307.field4742.method661(-1) << 8;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class307.field4742.method683((byte) 119);
                int var6 = class307.field4742.method652(0);
                if (var5 == 65535) {
                    var5 = -1;
                }
                class289.method2068((byte) 123, var3, var5, var6);
            }
            if ((var4 & 0x200) != 0) {
                var3.field2410 = class307.field4742.method624(14612);
                var3.field2399 = class307.field4742.method624(14612);
            }
            if ((var4 & 0x1) != 0) {
                int var7 = class307.field4742.method659(false);
                int var8 = class307.field4742.method669(arg0 - 31662);
                var3.method1105(var7, -96, var8, class38.field463);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2373 = class307.field4742.method628(false);
                var3.field2437 = 100;
            }
            if ((var4 & 0x10) != 0) {
                var3.field2444 = class307.field4742.method683((byte) -103);
                if (var3.field2444 == 65535) {
                    var3.field2444 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var9 = class307.field4742.method669(arg0 ^ 0xFFFF8452);
                int var10 = class307.field4742.method661(-1);
                var3.method1105(var9, -113, var10, class38.field463);
                var3.field2447 = class38.field463 + 300;
                var3.field2421 = class307.field4742.method669(-31662);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field2657.method2022(-1)) {
                    class59.method345((byte) 121, var3);
                }
                var3.method1281(class120.method815(arg0 + 28, class307.field4742.method638(arg0 + -119)), -24886);
                var3.method1103(var3.field2657.field4420, (byte) -2);
                var3.field2375 = var3.field2657.field4421;
                var3.field2360 = var3.field2657.field4423;
                if (var3.field2657.method2022(arg0 - 1)) {
                    class300.method2116(var3.field2403[0], 105, (class109) null, var3, 0, var3.field2359[0], (class238) null, class138.field1940);
                }
            }
            if ((var4 & 0x2) != 0) {
                int var11 = class307.field4742.method683((byte) -75);
                int var12 = class307.field4742.method676(true);
                if (var11 == 65535) {
                    var11 = -1;
                }
                boolean var13 = true;
                if (var11 != -1 && var3.field2372 != -1 && class185.method1289(class120.method818((byte) 96, var11).field2205, (byte) 108).field3740 < class185.method1289(class120.method818((byte) 96, var3.field2372).field2205, (byte) 105).field3740) {
                    var13 = false;
                }
                if (var13) {
                    var3.field2372 = var11;
                    var3.field2449 = 0;
                    var3.field2408 = 0;
                    var3.field2412 = 1;
                    var3.field2448 = var12 >> 16;
                    var3.field2396 = (var12 & 0xFFFF) + class38.field463;
                    if (var3.field2396 > class38.field463) {
                        var3.field2449 = -1;
                    }
                    if (var3.field2372 != -1 && class38.field463 == var3.field2396) {
                        int var14 = class120.method818((byte) 96, var3.field2372).field2205;
                        if (var14 != -1) {
                            class247 var15 = class185.method1289(var14, (byte) 109);
                            if (var15 != null && var15.field3734 != null) {
                                class337.method2329(false, var15, (byte) -97, var3.field2392, var3.field2357, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x100) != 0) {
                int var16 = class307.field4742.method661(-1);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class307.field4742.method683((byte) 123);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var19[var20] = class307.field4742.method661(class312.method2192(arg0, -1));
                    var18[var20] = class307.field4742.method655(-10505);
                }
                class198.method1365(var17, var18, var19, arg0 ^ 0x0, var3);
            }
        }
        field3210++;
    }
}

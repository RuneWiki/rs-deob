import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class31 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field437 = -1;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[J")
    public static long[] field444 = new long[256];

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Lck;")
    public static class119 field447;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[I")
    public static int[] field446;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Ldc;")
    public class19 field442;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field445;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
    public int[] field439;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[Lck;")
    public class119[] field441;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lml;IIB)V", line = 8)
    public static final void method232(class134 arg0, int arg1, int arg2, byte arg3) {
        if (arg0.field2027 == 1) {
            class281.field4644++;
            class222.method1411(class203.field3220, -32768, arg0.field2120, arg0.field2114, 0, (short) 47, 0L);
        }
        field436++;
        if (arg0.field2027 == 2 && !class114.field1725) {
            class119 var4 = class71.method512(arg0, (byte) -115);
            if (var4 != null) {
                class124.field1914++;
                class222.method1411(class170.method1074(new class119[] { class2.field24, arg0.field2128 }, -125), -32768, arg0.field2120, var4, -1, (short) 20, 0L);
            }
        }
        if (arg0.field2027 == 3) {
            class222.method1411(class203.field3220, -32768, arg0.field2120, class76.field1190, 0, (short) 14, 0L);
            class131.field1995++;
        }
        if (arg0.field2027 == 4) {
            class222.method1411(class203.field3220, -32768, arg0.field2120, arg0.field2114, 0, (short) 42, 0L);
            class217.field3494++;
        }
        int var5 = -20 % ((arg3 - 60) / 45);
        if (arg0.field2027 == 5) {
            class120.field1884++;
            class222.method1411(class203.field3220, -32768, arg0.field2120, arg0.field2114, 0, (short) 29, 0L);
        }
        if (arg0.field2027 == 6 && class191.field3064 == null) {
            class222.method1411(class203.field3220, -32768, arg0.field2120, arg0.field2114, -1, (short) 46, 0L);
            class205.field3256++;
        }
        if (arg0.field2135 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field2089; var7++) {
                for (int var8 = 0; var8 < arg0.field2141; var8++) {
                    int var9 = (arg0.field2168 + 32) * var8;
                    int var10 = (arg0.field2149 + 32) * var7;
                    if (var6 < 20) {
                        var10 += arg0.field2161[var6];
                        var9 += arg0.field2032[var6];
                    }
                    if (arg1 >= var9 && var10 <= arg2 && arg1 < (var9 + 32) && arg2 < (var10 + 32)) {
                        class204.field3241 = var6;
                        class198.field3167 = arg0;
                        if (arg0.field2042[var6] > 0) {
                            class262 var11 = class205.method1296((byte) -116, arg0.field2042[var6] - 1);
                            if (class198.field3171 == 1 && class222.method1410(client.method620(arg0), (byte) 62)) {
                                if (class166.field2621 != arg0.field2120 || class155.field2473 != var6) {
                                    class84.field1274++;
                                    class222.method1411(class170.method1074(new class119[] { class283.field4673, class287.field4727, var11.field4212 }, -111), -32768, arg0.field2120, class169.field2678, var6, (short) 17, (long) var11.field4249);
                                }
                            } else if (!class114.field1725 || !class222.method1410(client.method620(arg0), (byte) 62)) {
                                class208.field3323++;
                                class119[] var12 = var11.field4260;
                                if (class27.field405) {
                                    var12 = class232.method1497(123, var12);
                                }
                                if (class222.method1410(client.method620(arg0), (byte) 62)) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class174.field2767++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 48;
                                            } else {
                                                var14 = 5;
                                            }
                                            class222.method1411(class170.method1074(new class119[] { class226.field3618, var11.field4212 }, -82), -32768, arg0.field2120, var12[var13], var6, var14, (long) var11.field4249);
                                        } else if (var13 == 4) {
                                            class222.method1411(class170.method1074(new class119[] { class226.field3618, var11.field4212 }, -94), -32768, arg0.field2120, class209.field3343, var6, (short) 5, (long) var11.field4249);
                                            class195.field3105++;
                                        }
                                    }
                                }
                                if (class89.method606(client.method620(arg0), 7)) {
                                    class222.method1411(class170.method1074(new class119[] { class226.field3618, var11.field4212 }, -105), -32768, arg0.field2120, class169.field2678, var6, (short) 28, (long) var11.field4249);
                                    class200.field3187++;
                                }
                                if (class222.method1410(client.method620(arg0), (byte) 62) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class212.field3393++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 23;
                                            }
                                            if (var15 == 1) {
                                                var16 = 2;
                                            }
                                            if (var15 == 2) {
                                                var16 = 49;
                                            }
                                            class222.method1411(class170.method1074(new class119[] { class226.field3618, var11.field4212 }, -79), -32768, arg0.field2120, var12[var15], var6, var16, (long) var11.field4249);
                                        }
                                    }
                                }
                                class119[] var17 = arg0.field2105;
                                if (class27.field405) {
                                    var17 = class232.method1497(96, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 38;
                                            }
                                            if (var18 == 1) {
                                                var19 = 9;
                                            }
                                            class106.field1640++;
                                            if (var18 == 2) {
                                                var19 = 8;
                                            }
                                            if (var18 == 3) {
                                                var19 = 16;
                                            }
                                            if (var18 == 4) {
                                                var19 = 39;
                                            }
                                            class222.method1411(class170.method1074(new class119[] { class226.field3618, var11.field4212 }, -125), -32768, arg0.field2120, var17[var18], var6, var19, (long) var11.field4249);
                                        }
                                    }
                                }
                                class222.method1411(class170.method1074(new class119[] { class226.field3618, var11.field4212 }, -89), -32768, arg0.field2120, class64.field1015, var6, (short) 1002, (long) var11.field4249);
                            } else if ((class205.field3249 & 0x10) == 16) {
                                class265.field4332++;
                                class222.method1411(class170.method1074(new class119[] { class150.field2388, class287.field4727, var11.field4212 }, -77), -32768, arg0.field2120, class227.field3633, var6, (short) 58, (long) var11.field4249);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg0.field2097) {
            return;
        }
        if (!class114.field1725) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class119 var21 = class203.method1285(var20, arg0, (byte) 106);
                if (var21 != null) {
                    class222.method1411(arg0.field2137, -32768, arg0.field2120, var21, arg0.field2138, (short) 1006, (long) (var20 + 1));
                    class78.field1202++;
                }
            }
            class119 var22 = class71.method512(arg0, (byte) -115);
            if (var22 != null) {
                class124.field1914++;
                class222.method1411(arg0.field2137, -32768, arg0.field2120, var22, arg0.field2138, (short) 20, 0L);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                class119 var24 = class203.method1285(var23, arg0, (byte) 85);
                if (var24 != null) {
                    class222.method1411(arg0.field2137, -32768, arg0.field2120, var24, arg0.field2138, (short) 3, (long) (var23 + 1));
                    class78.field1202++;
                }
            }
            if (class144.method946((byte) -84, client.method620(arg0))) {
                class222.method1411(class203.field3220, -32768, arg0.field2120, class220.field3522, arg0.field2138, (short) 46, 0L);
                class205.field3256++;
            }
        } else if (class263.method1701(-104, client.method620(arg0)) && (class205.field3249 & 0x20) == 32) {
            class222.method1411(class170.method1074(new class119[] { class150.field2388, class22.field296, arg0.field2137 }, -76), -32768, arg0.field2120, class227.field3633, arg0.field2138, (short) 19, 0L);
            class13.field200++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B)V", line = 339)
    public static final void method233(int arg0, byte[] arg1) {
        field443++;
        int var2 = -50 / ((arg0 + 14) / 41);
        class3 var3 = new class3(arg1);
        int var4 = var3.method63((byte) 1);
        for (int var5 = 0; var5 < var4; var5++) {
            class154 var6 = new class154();
            class119 var7 = var3.method41((byte) -127);
            var6.field2455 = var3.method63((byte) 1);
            var6.field2453 = var3.method63((byte) 1);
            var6.field2450 = var3.method64((byte) 96);
            var6.field2458 = var7.method791(47, 32, -16833);
            var6.field2451 = var7.method771(-256, 47);
            class111.field1686.method999(var6, (byte) -108);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field444[var0] = var1;
        }
        field447 = class298.method1987((byte) 115, "gr-Un:");
        field446 = new int[500];
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 411)
    public static void method234(byte arg0) {
        field446 = null;
        field447 = null;
        field445 = null;
        if (arg0 <= -126) {
            field444 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I", line = 425)
    public static final int method235(int arg0, int arg1) {
        if (arg1 == 1911194728) {
            field438++;
            return arg0 >>> 8;
        } else {
            return 66;
        }
    }
}

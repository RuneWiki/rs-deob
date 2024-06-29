import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 extends class132 {

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lvd;")
    public static class222 field2118 = class212.method1357("Okay", 10731);

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "[I")
    public static int[] field2123 = new int[32768];

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lvd;")
    private static class222 field2124 = class212.method1357("Please contact customer support)3", 10731);

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Lvd;")
    public static class222 field2130 = field2124;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Z")
    public static boolean field2128 = false;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "[[[B")
    public static byte[][][] field2120;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method731(byte arg0) {
        field2120 = null;
        if (arg0 != 38) {
            field2132 = -77;
        }
        field2130 = null;
        field2123 = null;
        field2124 = null;
        field2118 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2127++;
        if (arg2 != 1) {
            field2131 = -93;
        }
        if (class112.field2107 <= arg6 && class127.field2448 >= arg0 && arg5 >= class129.field2514 && class230.field4322 >= arg3) {
            class130.method817(arg4, arg6, arg5, arg7, arg3, arg1, -10359, arg0);
        } else {
            class134.method848(arg3, arg6, arg4, arg1, arg7, arg5, arg0, -13780);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILe;JLe;Le;)V")
    public static final void method733(int arg0, int arg1, int arg2, int arg3, class44 arg4, long arg5, class44 arg6, class44 arg7) {
        class206 var9 = new class206();
        var9.field3839 = arg4;
        var9.field3838 = arg1 * 128 + 64;
        var9.field3837 = arg2 * 128 + 64;
        var9.field3841 = arg3;
        var9.field3847 = arg5;
        var9.field3846 = arg6;
        var9.field3845 = arg7;
        int var10 = 0;
        class121 var11 = class204.field3800[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2299; var12++) {
                class23 var13 = var11.field2297[var12];
                if ((var13.field536 & 0x400000L) == 4194304L) {
                    int var14 = var13.field543.method87();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3844 = -var10;
        if (class204.field3800[arg0][arg1][arg2] == null) {
            class204.field3800[arg0][arg1][arg2] = new class121(arg0, arg1, arg2);
        }
        class204.field3800[arg0][arg1][arg2].field2310 = var9;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILd;Ljava/awt/Component;)Lbh;")
    public static final class20 method734(int arg0, int arg1, int arg2, class33 arg3, Component arg4) {
        field2121++;
        if (class106.field1956 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class20 var5 = (class20) Class.forName("sa").getDeclaredConstructor().newInstance();
                var5.field474 = new int[(class168.field3201 ? 2 : 1) * 256];
                int var6 = -115 % ((arg0 + 46) / 47);
                var5.field490 = arg2;
                var5.method193(arg4);
                var5.field486 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field486 > 16384) {
                    var5.field486 = 16384;
                }
                var5.method194(var5.field486);
                if (class166.field3172 > 0 && class24.field554 == null) {
                    class24.field554 = new class118();
                    class24.field554.field2230 = arg3;
                    arg3.method283(class24.field554, class166.field3172, 0);
                }
                if (class24.field554 != null) {
                    if (class24.field554.field2242[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class24.field554.field2242[arg1] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class74 var7 = new class74(arg3, arg1);
                    var7.field490 = arg2;
                    var7.field474 = new int[(class168.field3201 ? 2 : 1) * 256];
                    var7.method193(arg4);
                    var7.field486 = 16384;
                    var7.method194(var7.field486);
                    if (class166.field3172 > 0 && class24.field554 == null) {
                        class24.field554 = new class118();
                        class24.field554.field2230 = arg3;
                        arg3.method283(class24.field554, class166.field3172, 0);
                    }
                    if (class24.field554 != null) {
                        if (class24.field554.field2242[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class24.field554.field2242[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class20();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILkf;III)V")
    public static final void method735(int arg0, class114 arg1, int arg2, int arg3, int arg4) {
        field2129++;
        if (class172.field3227 >= 400) {
            return;
        }
        if (arg1.field2156 != null) {
            arg1 = arg1.method742((byte) 89);
        }
        if (arg2 != 4) {
            field2120 = null;
        }
        if (arg1 == null || !arg1.field2153) {
            return;
        }
        class222 var5 = arg1.field2181;
        if (arg1.field2179 != 0) {
            var5 = class234.method1531(new class222[] { var5, class203.method1301((byte) 86, class17.field432.field835, arg1.field2179), class151.field2915, class20.field478, class56.method414(-98, arg1.field2179), class188.field3487 }, -10949);
        }
        if (class214.field3979 == 1) {
            class127.method803((long) arg4, class234.method1531(new class222[] { class211.field3931, class103.field1908, var5 }, -10949), (byte) 44, arg0, arg3, (short) 48, class153.field2946);
            class201.field3668++;
        } else if (!class79.field1522) {
            class58.field1083++;
            class222[] var6 = arg1.field2154;
            if (field2128) {
                var6 = class79.method522(var6, (byte) -124);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class70.field1328 != 0 || !var6[var7].method1452(class180.field3346, (byte) -127))) {
                        class66.field1253++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 21;
                        }
                        if (var7 == 1) {
                            var8 = 50;
                        }
                        if (var7 == 2) {
                            var8 = 47;
                        }
                        if (var7 == 3) {
                            var8 = 25;
                        }
                        if (var7 == 4) {
                            var8 = 7;
                        }
                        class127.method803((long) arg4, class234.method1531(new class222[] { class108.field1997, var5 }, -10949), (byte) 44, arg0, arg3, var8, var6[var7]);
                    }
                }
            }
            if (class70.field1328 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1452(class180.field3346, (byte) -126)) {
                        class54.field1020++;
                        short var10 = 0;
                        short var11 = 0;
                        if (arg1.field2179 > class17.field432.field835) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 21;
                        }
                        if (var9 == 1) {
                            var11 = 50;
                        }
                        if (var9 == 2) {
                            var11 = 47;
                        }
                        if (var9 == 3) {
                            var11 = 25;
                        }
                        if (var9 == 4) {
                            var11 = 7;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class127.method803((long) arg4, class234.method1531(new class222[] { class108.field1997, var5 }, -10949), (byte) 44, arg0, arg3, var11, var6[var9]);
                    }
                }
            }
            class127.method803((long) arg4, class234.method1531(new class222[] { class108.field1997, var5 }, -10949), (byte) 44, arg0, arg3, (short) 1006, class22.field529);
            return;
        } else if ((class22.field522 & 0x2) == 2) {
            class11.field210++;
            class127.method803((long) arg4, class234.method1531(new class222[] { class17.field429, class103.field1908, var5 }, arg2 - 10953), (byte) 44, arg0, arg3, (short) 43, class55.field1038);
            return;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class86 extends class110 {

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "[S")
    private short[] field2125 = new short[6];

    @OriginalMember(owner = "client!md", name = "mb", descriptor = "I")
    public int field2139 = -1;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "[S")
    private short[] field2132 = new short[6];

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "Z")
    public boolean field2136 = false;

    @OriginalMember(owner = "client!md", name = "nb", descriptor = "[I")
    private int[] field2140 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static volatile int field2120 = 0;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "Lmb;")
    private static class84 field2126 = class79.method672(true, "This computers address has been blocked");

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "Lmb;")
    public static class84 field2134 = class79.method672(true, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!md", name = "rb", descriptor = "Lmb;")
    public static class84 field2144 = field2126;

    @OriginalMember(owner = "client!md", name = "ob", descriptor = "Lmb;")
    private static class84 field2141 = class79.method672(true, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!md", name = "pb", descriptor = "Lmb;")
    public static class84 field2142 = field2141;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!md", name = "lb", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!md", name = "qb", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!md", name = "sb", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[I")
    private int[] field2119;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)Z")
    public final boolean method733(int arg0) {
        field2127++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field2140[var3] != -1 && !class129.field3104.method991(this.field2140[var3], 0, (byte) -112)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)Lpa;")
    public final class101 method734(int arg0) {
        field2138++;
        if (this.field2119 == null) {
            return null;
        }
        class101[] var2 = new class101[this.field2119.length];
        for (int var3 = 0; var3 < this.field2119.length; var3++) {
            var2[var3] = class101.method829(class129.field3104, this.field2119[var3], 0);
        }
        class101 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class101(var2, var2.length);
        }
        for (int var5 = arg0; var5 < 6 && this.field2132[var5] != 0; var5++) {
            var4.method834(this.field2132[var5], this.field2125[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILsd;Lsd;Lsd;)V")
    public static final void method735(int arg0, class122 arg1, class122 arg2, class122 arg3) {
        class129.field3108 = arg1;
        class69.field1685 = arg3;
        field2121++;
        if (arg0 == 256) {
            class63.field1562 = arg2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Lmb;")
    public static final class84 method736(byte arg0, int arg1) {
        field2137++;
        if (arg0 != -115) {
            method736((byte) 50, -79);
        }
        return class51.method408(new class84[] { class93.method787(22245, arg1 >> 24 & 0xFF), class80.field1988, class93.method787(arg0 + 22360, arg1 >> 16 & 0xFF), class80.field1988, class93.method787(22245, arg1 >> 8 & 0xFF), class80.field1988, class93.method787(arg0 + 22360, arg1 & 0xFF) }, -54);
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)Z")
    public final boolean method737(int arg0) {
        field2123++;
        if (arg0 != -1973) {
            return false;
        } else if (this.field2119 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2119.length; var3++) {
                if (!class129.field3104.method991(this.field2119[var3], 0, (byte) -112)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(Z)V")
    public static final void method738(boolean arg0) {
        field2143++;
        class145.field3492.method966(arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLhb;)V")
    private final void method739(int arg0, byte arg1, class51 arg2) {
        if (arg1 >= 0) {
            method744(-126, 91, (byte) -69, null);
        }
        if (arg0 == 1) {
            this.field2139 = arg2.method373(25094);
        } else if (arg0 == 2) {
            int var4 = arg2.method373(25094);
            this.field2119 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2119[var5] = arg2.method383(-2056200760);
            }
        } else if (arg0 == 3) {
            this.field2136 = true;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2132[arg0 - 40] = (short) arg2.method383(-2056200760);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2125[arg0 - 50] = (short) arg2.method383(-2056200760);
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2140[arg0 - 60] = arg2.method383(-2056200760);
        }
        field2135++;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(Z)V")
    public static void method740(boolean arg0) {
        field2142 = null;
        if (!arg0) {
            field2141 = null;
            field2144 = null;
            field2126 = null;
            field2134 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)V")
    public static final void method741(byte arg0, int arg1) {
        if (arg0 != 85) {
            method740(true);
        }
        field2129++;
        class30.method228(-95);
        int var2 = class44.method321(arg1, arg0 - 136).field170;
        if (var2 == 0) {
            return;
        }
        int var3 = class141.field3416[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method866(0.9D);
                ((class105) class104.field2528).method876((byte) 38, 0.9D);
            }
            if (var3 == 2) {
                class104.method866(0.8D);
                ((class105) class104.field2528).method876((byte) 122, 0.8D);
            }
            if (var3 == 3) {
                class104.method866(0.7D);
                ((class105) class104.field2528).method876((byte) 94, 0.7D);
            }
            if (var3 == 4) {
                class104.method866(0.6D);
                ((class105) class104.field2528).method876((byte) 102, 0.6D);
            }
            class144.method1175((byte) -102);
            class24.field572 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class128.field3096 != var4) {
                if (class128.field3096 == 0 && class90.field2244 != -1) {
                    class76.method653(class27.field655, class90.field2244, false, var4, 0, (byte) -92);
                    class76.field1920 = false;
                } else if (var4 == 0) {
                    class94.method793(arg0 - 40);
                    class76.field1920 = false;
                } else {
                    class146.method1190(17170, var4);
                }
                class128.field3096 = var4;
            }
        }
        if (var2 == 5) {
            class92.field2293 = var3;
        }
        if (var2 == 8) {
            class118.field2827 = var3;
            class65.field1615 = true;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class49.field1051 = 127;
            }
            if (var3 == 1) {
                class49.field1051 = 96;
            }
            if (var3 == 2) {
                class49.field1051 = 64;
            }
            if (var3 == 3) {
                class49.field1051 = 32;
            }
            if (var3 == 4) {
                class49.field1051 = 0;
            }
        }
        if (var2 == 9) {
            class69.field1684 = var3;
        }
        if (var2 == 6) {
            class127.field3061 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            class140.field3359 = 127;
        }
        if (var3 == 1) {
            class140.field3359 = 96;
        }
        if (var3 == 2) {
            class140.field3359 = 64;
        }
        if (var3 == 3) {
            class140.field3359 = 32;
        }
        if (var3 == 4) {
            class140.field3359 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILhb;)V")
    public final void method742(int arg0, class51 arg1) {
        field2122++;
        if (arg0 != -1) {
            this.method743(123);
        }
        while (true) {
            int var3 = arg1.method373(25094);
            if (var3 == 0) {
                return;
            }
            this.method739(var3, (byte) -109, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(I)Lpa;")
    public final class101 method743(int arg0) {
        class101[] var2 = new class101[5];
        field2130++;
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field2140[var4] != -1) {
                var2[var3++] = class101.method829(class129.field3104, this.field2140[var4], 0);
            }
        }
        class101 var5 = new class101(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2132[var6] != 0; var6++) {
            var5.method834(this.field2132[var6], this.field2125[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBLr;)V")
    public static final void method744(int arg0, int arg1, byte arg2, class112 arg3) {
        field2145++;
        if (arg3 == null) {
            return;
        }
        int var4 = class136.field3300 + class120.field2892 & 0x7FF;
        int var5 = arg0 * arg0 + arg1 * arg1;
        if (var5 > 6400 || arg2 >= -43) {
            return;
        }
        int var6 = class104.field2520[var4];
        int var7 = class104.field2527[var4];
        int var8 = var7 * 256 / (class6.field106 + 256);
        int var9 = var6 * 256 / (class6.field106 + 256);
        int var10 = arg0 * var8 + arg1 * var9 >> 16;
        int var11 = arg1 * var8 - arg0 * var9 >> 16;
        if (var5 <= 2500) {
            arg3.method928(var10 + 4 + 94 - arg3.field2689 / 2, -(arg3.field2688 / 2) - 4 + -var11 + 83);
        } else {
            arg3.method925(class141.field3380, var10 + 4 + 94 - arg3.field2689 / 2, -(arg3.field2688 / 2) + 83 + -var11 + -4);
        }
    }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class158 {

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lgk;")
    private class259 field2288 = new class259();

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Lgk;")
    private class259 field2291 = new class259();

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lgk;")
    private class259 field2292 = new class259();

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Lgk;")
    private class259 field2293 = new class259();

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Lqi;")
    private class216 field2294 = new class216(4);

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public volatile int field2298 = 0;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public volatile int field2299 = 0;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "B")
    private byte field2301 = 0;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "Lqi;")
    private class216 field2300 = new class216(8);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lrc;")
    public static class9 field2276 = new class9(5);

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    private int field2296;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "J")
    private long field2295;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "Ltb;")
    private class185 field2297;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Lda;")
    private class198 field2302;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLtb;Z)V")
    public final void method1046(byte arg0, class185 arg1, boolean arg2) {
        if (this.field2297 != null) {
            try {
                this.field2297.method1199(arg0 ^ 0xFFFFFF8B);
            } catch (Exception var8) {
            }
            this.field2297 = null;
        }
        field2287++;
        if (arg0 != 28) {
            this.field2298 = 95;
        }
        this.field2297 = arg1;
        this.method1050(arg0 ^ 0x6B);
        this.method1051(0, arg2);
        this.field2300.field3021 = 0;
        this.field2302 = null;
        while (true) {
            class198 var4 = (class198) this.field2291.method1664((byte) -81);
            if (var4 == null) {
                while (true) {
                    class198 var5 = (class198) this.field2293.method1664((byte) 69);
                    if (var5 == null) {
                        if (this.field2301 != 0) {
                            try {
                                this.field2294.field3021 = 0;
                                this.field2294.method1373(4, -13985);
                                this.field2294.method1373(this.field2301, -13985);
                                this.field2294.method1387(0, 4);
                                this.field2297.method1206(this.field2294.field3030, 4, (byte) -43, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field2297.method1199(-83);
                                } catch (Exception var6) {
                                }
                                this.field2297 = null;
                                this.field2299 = -2;
                                this.field2298++;
                            }
                        }
                        this.field2296 = 0;
                        this.field2295 = class86.method509(false);
                        return;
                    }
                    this.field2292.method1656(var5, (byte) -62);
                }
            }
            this.field2288.method1656(var4, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method1047(int arg0) {
        field2283++;
        if (this.field2297 == null) {
            return;
        }
        try {
            this.field2294.field3021 = 0;
            this.field2294.method1373(7, -13985);
            this.field2294.method1395(123, 0);
            this.field2297.method1206(this.field2294.field3030, 4, (byte) -43, 0);
            if (arg0 != 9) {
                field2290 = -117;
            }
        } catch (IOException var3) {
            try {
                this.field2297.method1199(-101);
            } catch (Exception var2) {
            }
            this.field2299 = -2;
            this.field2298++;
            this.field2297 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)Z")
    public final boolean method1048(boolean arg0) {
        field2273++;
        if (arg0) {
            return this.method1056((byte) 80) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1049(byte arg0) {
        if (arg0 >= -100) {
            field2285 = 61;
        }
        field2276 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    private final void method1050(int arg0) {
        field2281++;
        if (this.field2297 == null) {
            return;
        }
        try {
            this.field2294.field3021 = 0;
            this.field2294.method1373(6, -13985);
            this.field2294.method1395(123, 3);
            this.field2297.method1206(this.field2294.field3030, 4, (byte) -43, 0);
        } catch (IOException var3) {
            try {
                this.field2297.method1199(-103);
            } catch (Exception var2) {
            }
            this.field2298++;
            this.field2299 = -2;
            this.field2297 = null;
        }
        if (arg0 < 40) {
            this.field2294 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
    public final void method1051(int arg0, boolean arg1) {
        field2279++;
        if (this.field2297 == null) {
            return;
        }
        try {
            this.field2294.field3021 = 0;
            this.field2294.method1373(arg1 ? 2 : 3, -13985);
            this.field2294.method1395(121, 0);
            this.field2297.method1206(this.field2294.field3030, 4, (byte) -43, arg0);
        } catch (IOException var4) {
            try {
                this.field2297.method1199(-67);
            } catch (Exception var3) {
            }
            this.field2299 = -2;
            this.field2298++;
            this.field2297 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public final void method1052(int arg0) {
        if (this.field2297 != null) {
            this.field2297.method1204(-112);
        }
        field2278++;
        if (arg0 != -21) {
            this.method1050(-65);
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Z")
    public final boolean method1053(int arg0) {
        field2277++;
        if (this.field2297 != null) {
            long var2 = class86.method509(false);
            int var4 = (int) (var2 - this.field2295);
            this.field2295 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2296 += var4;
            if (this.field2296 > 30000) {
                try {
                    this.field2297.method1199(-32);
                } catch (Exception var27) {
                }
                this.field2297 = null;
            }
        }
        if (this.field2297 == null) {
            return this.method1054(true) == 0 && this.method1056((byte) 80) == 0;
        }
        try {
            this.field2297.method1210((byte) -88);
            if (arg0 >= -9) {
                this.method1050(-9);
            }
            for (class198 var5 = (class198) this.field2288.method1657((byte) 122); var5 != null; var5 = (class198) this.field2288.method1658(-30630)) {
                this.field2294.field3021 = 0;
                this.field2294.method1373(1, -13985);
                this.field2294.method1395(125, (int) var5.field651);
                this.field2297.method1206(this.field2294.field3030, 4, (byte) -43, 0);
                this.field2291.method1656(var5, (byte) -102);
            }
            for (class198 var6 = (class198) this.field2292.method1657((byte) 122); var6 != null; var6 = (class198) this.field2292.method1658(-30630)) {
                this.field2294.field3021 = 0;
                this.field2294.method1373(0, -13985);
                this.field2294.method1395(127, (int) var6.field651);
                this.field2297.method1206(this.field2294.field3030, 4, (byte) -43, 0);
                this.field2293.method1656(var6, (byte) -80);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2297.method1202((byte) 97);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2296 = 0;
                byte var9 = 0;
                if (this.field2302 == null) {
                    var9 = 8;
                } else if (this.field2302.field2821 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field2302.field2812.field3030.length - this.field2302.field2818;
                    int var11 = 512 - this.field2302.field2821;
                    if (var10 - this.field2302.field2812.field3021 < var11) {
                        var11 = var10 - this.field2302.field2812.field3021;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field2297.method1205(this.field2302.field2812.field3030, var11, false, this.field2302.field2812.field3021);
                    if (this.field2301 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2302.field2812.field3030[this.field2302.field2812.field3021 + var12] = (byte) class165.method1085(this.field2302.field2812.field3030[this.field2302.field2812.field3021 + var12], this.field2301);
                        }
                    }
                    this.field2302.field2821 += var11;
                    this.field2302.field2812.field3021 += var11;
                    if (this.field2302.field2812.field3021 == var10) {
                        this.field2302.method336(22047);
                        this.field2302.field338 = false;
                        this.field2302 = null;
                    } else if (this.field2302.field2821 == 512) {
                        this.field2302.field2821 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2300.field3021;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field2297.method1205(this.field2300.field3030, var13, false, this.field2300.field3021);
                    if (this.field2301 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2300.field3030[this.field2300.field3021 + var14] = (byte) class165.method1085(this.field2300.field3030[this.field2300.field3021 + var14], this.field2301);
                        }
                    }
                    this.field2300.field3021 += var13;
                    if (var9 <= this.field2300.field3021) {
                        if (this.field2302 == null) {
                            this.field2300.field3021 = 0;
                            int var15 = this.field2300.method1407(115);
                            int var16 = this.field2300.method1380(true);
                            int var17 = this.field2300.method1407(123);
                            int var18 = var17 & 0x7F;
                            int var19 = this.field2300.method1358(65);
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class198 var24;
                            if (var20) {
                                for (var24 = (class198) this.field2293.method1657((byte) 122); var24 != null && var24.field651 != var21; var24 = (class198) this.field2293.method1658(-30630)) {
                                }
                            } else {
                                for (var24 = (class198) this.field2291.method1657((byte) 122); var24 != null && var24.field651 != var21; var24 = (class198) this.field2291.method1658(-30630)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field2302 = var24;
                            int var25 = var18 == 0 ? 5 : 9;
                            this.field2302.field2812 = new class216(var19 + var25 + this.field2302.field2818);
                            this.field2302.field2812.method1373(var18, -13985);
                            this.field2302.field2812.method1410(var19, (byte) 101);
                            this.field2300.field3021 = 0;
                            this.field2302.field2821 = 8;
                        } else if (this.field2302.field2821 != 0) {
                            throw new IOException();
                        } else if (this.field2300.field3030[0] == -1) {
                            this.field2300.field3021 = 0;
                            this.field2302.field2821 = 1;
                        } else {
                            this.field2302 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2297.method1199(-75);
            } catch (Exception var26) {
            }
            this.field2299 = -2;
            this.field2298++;
            this.field2297 = null;
            return this.method1054(true) == 0 && this.method1056((byte) 80) == 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)I")
    public final int method1054(boolean arg0) {
        field2280++;
        if (!arg0) {
            this.method1052(33);
        }
        return this.field2288.method1663(0) + this.field2291.method1663(0);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public final void method1055(byte arg0) {
        if (arg0 != 97) {
            this.method1055((byte) -80);
        }
        if (this.field2297 != null) {
            this.field2297.method1199(arg0 - 124);
        }
        field2274++;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)I")
    private final int method1056(byte arg0) {
        if (arg0 != 80) {
            field2290 = 95;
        }
        field2282++;
        return this.field2292.method1663(0) + this.field2293.method1663(0);
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Z")
    public final boolean method1057(int arg0) {
        if (arg0 != 0) {
            this.method1046((byte) -24, (class185) null, true);
        }
        field2286++;
        return this.method1054(true) >= 20;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    public final void method1058(byte arg0) {
        try {
            if (arg0 != 120) {
                this.method1057(66);
            }
            this.field2297.method1199(-71);
        } catch (Exception var2) {
        }
        this.field2299 = -1;
        this.field2298++;
        this.field2297 = null;
        this.field2301 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field2275++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZIIZ)Lda;")
    public final class198 method1059(byte arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class198 var6 = new class198();
        if (arg4) {
            this.method1055((byte) 4);
        }
        var6.field339 = arg1;
        field2284++;
        long var7 = (long) ((arg3 << 16) + arg2);
        var6.field2818 = arg0;
        var6.field651 = var7;
        if (arg1) {
            if (this.method1054(true) >= 20) {
                throw new RuntimeException();
            }
            this.field2288.method1656(var6, (byte) -106);
        } else if (this.method1056((byte) 80) < 20) {
            this.field2292.method1656(var6, (byte) -120);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }
}

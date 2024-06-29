import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class232 {

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lns;")
    private class406 field2999 = new class406();

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lns;")
    private class406 field3002 = new class406();

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lns;")
    private class406 field3003 = new class406();

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lns;")
    private class406 field3004 = new class406();

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "Lji;")
    private class611 field3008 = new class611(4);

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public volatile int field3009 = 0;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public volatile int field3010 = 0;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "B")
    private byte field3011 = 0;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Lji;")
    private class611 field3012 = new class611(8);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Z")
    public static boolean field2988 = true;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lfc;")
    public static class262 field2995 = new class262(128, 4);

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "[I")
    public static int[] field3000 = new int[13];

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "S")
    public static short field3001 = 320;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "F")
    public static float field2993;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    private int field3006;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "J")
    private long field3005;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "Lgb;")
    private class216 field3013;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Lvt;")
    private class306 field3007;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method1371(int arg0) {
        if (this.field3007 != null) {
            this.field3007.method1854(-29789);
        }
        field2989++;
        if (arg0 >= -34) {
            this.field3005 = 81L;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method1372(int arg0) {
        if (arg0 == 5790) {
            field2995 = null;
            field3000 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
    private final int method1373(byte arg0) {
        if (arg0 <= 44) {
            field2995 = null;
        }
        field2987++;
        return this.field3003.method2344(-126) + this.field3004.method2344(-109);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIIZ)Lgb;")
    public final class216 method1374(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field2992++;
        long var6 = (long) ((arg0 << 16) + arg2);
        class216 var8 = new class216();
        var8.field2612 = arg1;
        if (arg3 < 104) {
            this.method1378(-109);
        }
        var8.field5550 = var6;
        var8.field739 = arg4;
        if (arg4) {
            if (this.method1383(-1) >= 20) {
                throw new RuntimeException();
            }
            this.field2999.method2341(var8, -106);
        } else if (this.method1373((byte) 94) < 20) {
            this.field3003.method2341(var8, -28);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Z")
    public final boolean method1375(int arg0) {
        field2991++;
        if (arg0 <= 23) {
            return true;
        } else {
            return this.method1383(-1) >= 20;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public final void method1376(int arg0) {
        field2980++;
        if (this.field3007 == null) {
            return;
        }
        try {
            this.field3008.field8520 = 0;
            this.field3008.method3393(7, 77);
            this.field3008.method3424(-24472, 0);
            if (arg0 == 29043) {
                this.field3007.method1851((byte) 77, 0, 4, this.field3008.field8529);
            }
        } catch (IOException var3) {
            try {
                this.field3007.method1854(arg0 ^ 0xFFFFFAD0);
            } catch (Exception var2) {
            }
            this.field3007 = null;
            this.field3010 = -2;
            this.field3009++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
    public final void method1377(int arg0, boolean arg1) {
        field2986++;
        if (arg0 != 2) {
            this.method1379(121);
        }
        if (this.field3007 == null) {
            return;
        }
        try {
            this.field3008.field8520 = 0;
            this.field3008.method3393(arg1 ? 2 : 3, 121);
            this.field3008.method3424(-24472, 0);
            this.field3007.method1851((byte) 77, 0, 4, this.field3008.field8529);
        } catch (IOException var4) {
            try {
                this.field3007.method1854(-29789);
            } catch (Exception var3) {
            }
            this.field3010 = -2;
            this.field3009++;
            this.field3007 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)Z")
    public final boolean method1378(int arg0) {
        field2998++;
        if (this.field3007 != null) {
            long var2 = class538.method2963(-47);
            int var4 = (int) (var2 - this.field3005);
            this.field3005 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3006 += var4;
            if (this.field3006 > 30000) {
                try {
                    this.field3007.method1854(-29789);
                } catch (Exception var27) {
                }
                this.field3007 = null;
            }
        }
        if (this.field3007 == null) {
            return this.method1383(-1) == 0 && this.method1373((byte) 49) == 0;
        }
        try {
            this.field3007.method1847(true);
            for (class216 var5 = (class216) this.field2999.method2348(-1); var5 != null; var5 = (class216) this.field2999.method2343(0)) {
                this.field3008.field8520 = 0;
                this.field3008.method3393(1, arg0 ^ 0x104C);
                this.field3008.method3424(-24472, (int) var5.field5550);
                this.field3007.method1851((byte) 77, 0, 4, this.field3008.field8529);
                this.field3002.method2341(var5, -84);
            }
            if (arg0 != 4096) {
                this.method1385(67);
            }
            for (class216 var6 = (class216) this.field3003.method2348(-1); var6 != null; var6 = (class216) this.field3003.method2343(arg0 ^ 0x1000)) {
                this.field3008.field8520 = 0;
                this.field3008.method3393(0, arg0 ^ 0x102A);
                this.field3008.method3424(arg0 - 28568, (int) var6.field5550);
                this.field3007.method1851((byte) 77, 0, 4, this.field3008.field8529);
                this.field3004.method2341(var6, -77);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3007.method1846(75);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3006 = 0;
                byte var9 = 0;
                if (this.field3013 == null) {
                    var9 = 8;
                } else if (this.field3013.field2605 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3013.field2608.field8529.length - this.field3013.field2612;
                    int var11 = 512 - this.field3013.field2605;
                    if (var10 - this.field3013.field2608.field8520 < var11) {
                        var11 = var10 - this.field3013.field2608.field8520;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field3007.method1852(this.field3013.field2608.field8520, true, var11, this.field3013.field2608.field8529);
                    if (this.field3011 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3013.field2608.field8529[this.field3013.field2608.field8520 + var12] = (byte) class158.method949(this.field3013.field2608.field8529[this.field3013.field2608.field8520 + var12], this.field3011);
                        }
                    }
                    this.field3013.field2608.field8520 += var11;
                    this.field3013.field2605 += var11;
                    if (this.field3013.field2608.field8520 == var10) {
                        this.field3013.method2287((byte) -90);
                        this.field3013.field741 = false;
                        this.field3013 = null;
                    } else if (this.field3013.field2605 == 512) {
                        this.field3013.field2605 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3012.field8520;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field3007.method1852(this.field3012.field8520, true, var13, this.field3012.field8529);
                    if (this.field3011 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3012.field8529[this.field3012.field8520 + var14] = (byte) class158.method949(this.field3012.field8529[this.field3012.field8520 + var14], this.field3011);
                        }
                    }
                    this.field3012.field8520 += var13;
                    if (var9 <= this.field3012.field8520) {
                        if (this.field3013 == null) {
                            this.field3012.field8520 = 0;
                            int var15 = this.field3012.method3428((byte) 29);
                            int var16 = this.field3012.method3402((byte) 127);
                            int var17 = this.field3012.method3428((byte) -110);
                            int var18 = this.field3012.method3418(arg0 - 4098);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class216 var24;
                            if (var20) {
                                for (var24 = (class216) this.field3004.method2348(arg0 ^ 0xFFFFEFFF); var24 != null && var24.field5550 != var21; var24 = (class216) this.field3004.method2343(0)) {
                                }
                            } else {
                                for (var24 = (class216) this.field3002.method2348(-1); var24 != null && var24.field5550 != var21; var24 = (class216) this.field3002.method2343(0)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3013 = var24;
                            this.field3013.field2608 = new class611(var18 + var25 + this.field3013.field2612);
                            this.field3013.field2608.method3393(var19, 107);
                            this.field3013.field2608.method3384(1571862888, var18);
                            this.field3012.field8520 = 0;
                            this.field3013.field2605 = 8;
                        } else if (this.field3013.field2605 != 0) {
                            throw new IOException();
                        } else if (this.field3012.field8529[0] == -1) {
                            this.field3013.field2605 = 1;
                            this.field3012.field8520 = 0;
                        } else {
                            this.field3013 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3007.method1854(arg0 ^ 0xFFFF9BA3);
            } catch (Exception var26) {
            }
            this.field3009++;
            this.field3010 = -2;
            this.field3007 = null;
            return this.method1383(arg0 ^ 0xFFFFEFFF) == 0 && this.method1373((byte) 51) == 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public final void method1379(int arg0) {
        field2990++;
        try {
            this.field3007.method1854(-29789);
            if (arg0 <= 17) {
                this.method1384((byte) 108);
            }
        } catch (Exception var2) {
        }
        this.field3009++;
        this.field3007 = null;
        this.field3010 = -1;
        this.field3011 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIFIIBI)[[I")
    public static final int[][] method1380(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, byte arg7, int arg8) {
        field2984++;
        int[][] var9 = new int[arg1][arg3];
        class75 var10 = new class75();
        var10.field909 = arg8;
        var10.field912 = arg6;
        var10.field907 = arg0;
        var10.field905 = arg2;
        var10.field915 = (int) (arg4 * 4096.0F);
        var10.method85((byte) 66);
        class639.method3594(true, arg3, arg1);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method557((byte) -127, var9[var11], var11);
        }
        if (arg7 != -63) {
            field3000 = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public final void method1381(int arg0) {
        field2994++;
        if (arg0 != 0) {
            method1386((byte) -57);
        }
        if (this.field3007 != null) {
            this.field3007.method1853(-69);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lvt;ZB)V")
    public final void method1382(class306 arg0, boolean arg1, byte arg2) {
        field2983++;
        if (arg2 != 74) {
            field2981 = 12;
        }
        if (this.field3007 != null) {
            try {
                this.field3007.method1854(arg2 ^ 0xFFFF8BE9);
            } catch (Exception var8) {
            }
            this.field3007 = null;
        }
        this.field3007 = arg0;
        this.method1384((byte) 63);
        this.method1377(2, arg1);
        this.field3012.field8520 = 0;
        this.field3013 = null;
        while (true) {
            class216 var4 = (class216) this.field3002.method2345(-16711936);
            if (var4 == null) {
                while (true) {
                    class216 var5 = (class216) this.field3004.method2345(-16711936);
                    if (var5 == null) {
                        if (this.field3011 != 0) {
                            try {
                                this.field3008.field8520 = 0;
                                this.field3008.method3393(4, 67);
                                this.field3008.method3393(this.field3011, -41);
                                this.field3008.method3423(0, 1571862888);
                                this.field3007.method1851((byte) 77, 0, 4, this.field3008.field8529);
                            } catch (IOException var7) {
                                try {
                                    this.field3007.method1854(-29789);
                                } catch (Exception var6) {
                                }
                                this.field3007 = null;
                                this.field3009++;
                                this.field3010 = -2;
                            }
                        }
                        this.field3006 = 0;
                        this.field3005 = class538.method2963(-47);
                        return;
                    }
                    this.field3003.method2341(var5, -82);
                }
            }
            this.field2999.method2341(var4, -29);
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)I")
    public final int method1383(int arg0) {
        field2985++;
        if (arg0 != -1) {
            this.method1381(15);
        }
        return this.field2999.method2344(-118) + this.field3002.method2344(-121);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    private final void method1384(byte arg0) {
        field2996++;
        if (arg0 <= 37) {
            this.method1375(-82);
        }
        if (this.field3007 == null) {
            return;
        }
        try {
            this.field3008.field8520 = 0;
            this.field3008.method3393(6, -111);
            this.field3008.method3424(-24472, 3);
            this.field3007.method1851((byte) 77, 0, 4, this.field3008.field8529);
        } catch (IOException var3) {
            try {
                this.field3007.method1854(-29789);
            } catch (Exception var2) {
            }
            this.field3009++;
            this.field3010 = -2;
            this.field3007 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)Z")
    public final boolean method1385(int arg0) {
        field2997++;
        if (arg0 != 20) {
            field2993 = 0.7821552F;
        }
        return this.method1373((byte) 53) >= 20;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public static final void method1386(byte arg0) {
        if (arg0 > -77) {
            field2993 = -0.715336F;
        }
        field2982++;
        int var1 = class11.field68.field5524.method2687((byte) 125);
        if (var1 == 0) {
            class410.field5781 = null;
            class641.method3608(0, -1003);
        } else if (var1 == 1) {
            class301.method1806(-15, (byte) 0);
            class641.method3608(512, -1003);
            if (class114.field1506 != null) {
                class563.method3170(59);
            }
        } else {
            class301.method1806(-15, (byte) (class478.field6604 - 4 & 0xFF));
            class641.method3608(2, -1003);
        }
        class566.field7984 = class61.field677;
    }
}

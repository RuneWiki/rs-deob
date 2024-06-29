import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class188 {

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    private int field2857 = 128;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    private int field2858 = 0;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Z")
    public boolean field2861 = false;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field2852 = 128;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public int field2862 = -1;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    private int field2867 = 0;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    private int field2870 = 0;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Z")
    public boolean field2874 = false;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "J")
    public static long field2873 = -1L;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lo;")
    public static class332 field2859 = new class332("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Lwe;")
    public class134 field2864;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[S")
    private short[] field2851;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "[S")
    private short[] field2863;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "[S")
    private short[] field2869;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "[S")
    private short[] field2871;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILre;)V")
    public final void method1293(int arg0, class446 arg1) {
        field2866++;
        int var3 = -117 / ((21 - arg0) / 40);
        while (true) {
            int var4 = arg1.method2628(49152);
            if (var4 == 0) {
                return;
            }
            this.method1301(arg1, (byte) 70, var4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1294(int arg0) {
        field2859 = null;
        if (arg0 >= -16) {
            field2873 = -25L;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILje;)V")
    public static final void method1295(int arg0, class178 arg1) {
        field2855++;
        if (!class432.field6152) {
            return;
        }
        class378.method2320(class69.field938, (byte) 119);
        int var2 = 46 / ((arg0 + 16) / 40);
        class391.field5751++;
        class230.field3390.method2596((byte) -75, arg1.field2631);
        class230.field3390.method2624((byte) -3, class467.field6570);
        class230.field3390.method2624((byte) -3, class335.field5024);
        class230.field3390.method2596((byte) 126, class65.field898);
        class230.field3390.method2592(arg1.field2605, (byte) -126);
        class230.field3390.method2624((byte) -3, arg1.field2534);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILtq;IIIILei;)Lns;")
    public final class57 method1296(int arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, class247 arg6) {
        field2856++;
        int var8 = arg0;
        class356 var9 = this.field2862 == -1 || arg2 == -1 ? null : arg6.method1586(this.field2862, (byte) 36);
        if (var9 != null) {
            var8 = arg0 | var9.method2194((byte) -128, arg2, arg3, false);
        }
        if (arg5 >= 0) {
            return null;
        }
        if (this.field2852 != 128) {
            var8 |= 0x2;
        }
        if (this.field2857 != 128 || this.field2870 != 0) {
            var8 |= 0x5;
        }
        class400 var10 = this.field2864.field1957;
        class57 var11;
        synchronized (this.field2864.field1957) {
            var11 = (class57) this.field2864.field1957.method2393(-122, (long) (this.field2875 |= arg1.field870 << 29));
        }
        if (var11 == null || arg1.method583(var11.method402(), var8) != 0) {
            if (var11 != null) {
                var8 = arg1.method578(var8, var11.method402());
            }
            int var12 = var8;
            if (this.field2869 != null) {
                var12 = var8 | 0x2000;
            }
            if (this.field2851 != null) {
                var12 |= 0x4000;
            }
            class246 var13 = class340.method2085((byte) 77, this.field2853, this.field2864.field1953, 0);
            if (var13 == null) {
                return null;
            }
            var11 = arg1.method555(var13, var12, this.field2864.field1958, this.field2858 + 64, this.field2867 + 850);
            if (this.field2869 != null) {
                for (int var14 = 0; var14 < this.field2869.length; var14++) {
                    var11.method420(this.field2869[var14], this.field2863[var14]);
                }
            }
            if (this.field2851 != null) {
                for (int var15 = 0; var15 < this.field2851.length; var15++) {
                    var11.method415(this.field2851[var15], this.field2871[var15]);
                }
            }
            var11.method441(var8);
            class400 var16 = this.field2864.field1957;
            synchronized (this.field2864.field1957) {
                this.field2864.field1957.method2395(0, var11, (long) (this.field2875 |= arg1.field870 << 29));
            }
        }
        class57 var17 = var9 == null ? var11.method437((byte) 2, var8, true) : var9.method2193(var8, arg2, arg3, -25227, arg4, 0, (byte) 2, var11);
        if (this.field2857 != 128 || this.field2852 != 128) {
            var17.method446(this.field2857, this.field2852, this.field2857);
        }
        if (this.field2870 != 0) {
            if (this.field2870 == 90) {
                var17.method444(4096);
            }
            if (this.field2870 == 180) {
                var17.method444(8192);
            }
            if (this.field2870 == 270) {
                var17.method444(12288);
            }
        }
        var17.method441(arg0);
        return var17;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)Lba;")
    public static final class466 method1297(int arg0) {
        field2854++;
        if (arg0 < 78) {
            field2873 = -59L;
        }
        try {
            return (class466) Class.forName("nc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([II[ILh;[I)V")
    public static final void method1298(int[] arg0, int arg1, int[] arg2, class349 arg3, int[] arg4) {
        int var5 = 0;
        if (arg1 != -2) {
            return;
        }
        while (arg2.length > var5) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg3.field4649.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field4649[var9] = null;
                    } else {
                        class356 var10 = class170.field2423.method1586(var6, (byte) 36);
                        int var11 = var10.field5415;
                        class414 var12 = arg3.field4649[var9];
                        if (var12 != null) {
                            if (var12.field5974 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field4649[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5966 = 1;
                                    var12.field5969 = 0;
                                    var12.field5975 = 0;
                                    var12.field5970 = var8;
                                    var12.field5973 = 0;
                                    class210.method1416(0, arg3.field4543, false, arg3.field4545, var10, arg1 + 15808, arg3.field4538);
                                } else if (var11 == 2) {
                                    var12.field5975 = 0;
                                }
                            } else if (var10.field5419 >= class170.field2423.method1586(var12.field5974, (byte) 36).field5419) {
                                var12 = arg3.field4649[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class414 var13 = arg3.field4649[var9] = new class414();
                            var13.field5973 = 0;
                            var13.field5970 = var8;
                            var13.field5975 = 0;
                            var13.field5969 = 0;
                            var13.field5974 = var6;
                            var13.field5966 = 1;
                            class210.method1416(0, arg3.field4543, false, arg3.field4545, var10, 15806, arg3.field4538);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
        field2860++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method1299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field2868++;
        class309 var15;
        if (arg11 >= 0) {
            int var14 = arg11 - 1;
            var15 = class18.field241[var14];
        } else {
            int var16 = -arg11 - 1;
            if (class263.field3910 == var16) {
                var15 = class472.field6622;
            } else {
                var15 = class40.field565[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class271 var17 = class206.field3124.method338((byte) 100, arg10);
        int var18;
        int var19;
        if (arg5 == 1 || arg5 == 3) {
            var18 = var17.field4014;
            var19 = var17.field4048;
        } else {
            var18 = var17.field4048;
            var19 = var17.field4014;
        }
        int var20 = (var19 >> 1) + arg13;
        int var21 = (var19 + 1 >> 1) + arg13;
        int var22 = (var18 >> 1) + arg12;
        int var23 = (var18 + 1 >> 1) + arg12;
        class48 var24 = class479.field6745[arg1];
        int var25 = var24.method199(var20, var22) + (var24.method199(var21, var22) - (-var24.method199(var20, var23) - var24.method199(var21, var23))) >> 2;
        class64 var26 = new class64();
        var26.field876 = arg12;
        var26.field884 = arg2;
        var26.field888 = var15.field4545;
        var26.field883 = class452.field6418 + arg8;
        var26.field878 = arg10;
        var26.field886 = arg13;
        var26.field881 = class452.field6418 + arg4;
        var26.field892 = arg5;
        if (arg7 < arg0) {
            int var27 = arg0;
            arg0 = arg7;
            arg7 = var27;
        }
        if (arg9 < 56) {
            return;
        }
        var26.field877 = arg7 + arg13;
        if (arg6 > arg3) {
            int var28 = arg6;
            arg6 = arg3;
            arg3 = var28;
        }
        var26.field889 = arg13 + arg0;
        var26.field874 = var25;
        var26.field887 = arg6 + arg12;
        var26.field880 = var26.field886 * 128 + var19 * 64;
        var26.field875 = arg3 + arg12;
        var26.field872 = var26.field876 * 128 + var18 * 64;
        class257.field3801.method2453((byte) -91, var26);
        var15.field4671 = var26;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static final void method1300(boolean arg0) {
        field2872++;
        if (!arg0) {
            method1297(-42);
        }
        if (class123.field1698 != null) {
            return;
        }
        int var1 = class73.field979;
        int var2 = class433.field6157;
        int var3 = class297.field4450 - var1 - class342.field5115;
        int var4 = class321.field4794 - (class233.field3411 + var2);
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class316.field4749 == null) {
                var5 = class21.field261.field2125;
            } else {
                var5 = class316.field4749;
            }
            int var6 = 0;
            int var7 = 0;
            if (class316.field4749 == var5) {
                Insets var8 = class316.field4749.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class321.field4794);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class297.field4450, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class297.field4450 + var6 - var3, var7, var3, class321.field4794);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class321.field4794 + var7 - var4, class297.field4450, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lre;BI)V")
    private final void method1301(class446 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field2853 = arg0.method2631(2530);
        } else if (arg2 == 2) {
            this.field2862 = arg0.method2631(2530);
        } else if (arg2 == 4) {
            this.field2857 = arg0.method2631(2530);
        } else if (arg2 == 5) {
            this.field2852 = arg0.method2631(2530);
        } else if (arg2 == 6) {
            this.field2870 = arg0.method2631(2530);
        } else if (arg2 == 7) {
            this.field2858 = arg0.method2628(49152);
        } else if (arg2 == 8) {
            this.field2867 = arg0.method2628(49152);
        } else if (arg2 == 9) {
            this.field2874 = true;
        } else if (arg2 == 10) {
            this.field2861 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method2628(49152);
            this.field2869 = new short[var4];
            this.field2863 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2869[var5] = (short) arg0.method2631(2530);
                this.field2863[var5] = (short) arg0.method2631(2530);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method2628(49152);
            this.field2851 = new short[var6];
            this.field2871 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2851[var7] = (short) arg0.method2631(2530);
                this.field2871[var7] = (short) arg0.method2631(2530);
            }
        }
        field2865++;
        if (arg1 <= 61) {
            this.field2851 = null;
        }
    }
}

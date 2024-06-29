import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class148 extends class260 {

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    private int field2360 = -32768;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Z")
    private boolean field2369 = false;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    private int field2361 = -1;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    private int field2377 = -1;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Lcb;")
    private class243 field2375 = null;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    private int field2382;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    private int field2366;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "Ltg;")
    private class181 field2384;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    private int field2391;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    private int field2386;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    private int field2390;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2359 = 0;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2362 = "slide:";

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lkd;")
    public static class204 field2357 = new class204(16);

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "[I")
    public static int[] field2387 = new int[4096];

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field2389 = -1;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "Z")
    public static boolean field2388 = false;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "Llb;")
    private class130 field2380;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "[I")
    public static int[] field2385;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lik;")
    public final class260 method1013(byte arg0) {
        field2368++;
        if (arg0 != -79) {
            method1016(-103, (String) null, false);
        }
        return this.method1017(false, false);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static void method1014(byte arg0) {
        field2387 = null;
        field2362 = null;
        field2385 = null;
        field2357 = null;
        if (arg0 > -56) {
            field2359 = 122;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)I")
    public static final int method1015(boolean arg0, int arg1) {
        field2367++;
        if (arg0) {
            field2357 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1016(int arg0, String arg1, boolean arg2) {
        field2371++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class184.field2892.method1814(arg1, 250);
        if (arg0 != -31620) {
            return;
        }
        int var7 = class184.field2892.method1810(arg1, 250) * 13;
        class2.method25(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var7 + var3, 0);
        class2.method24(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class184.field2892.method1813(arg1, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class154.method1072(var4 - var3, var3 + var7 + var3, var3 + var3 + var6, -var3 + var5, (byte) -116);
        if (!arg2) {
            class274.method1849((byte) -120, var6, var5, var7, var4);
            return;
        }
        try {
            Graphics var8 = class155.field2511.getGraphics();
            class79.field1263.method338(var8, -15816, 0, 0);
        } catch (Exception var9) {
            class155.field2511.repaint();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZ)Lik;")
    private final class260 method1017(boolean arg0, boolean arg1) {
        field2358++;
        boolean var3 = class219.field3586 != class124.field2012;
        class135 var4 = class209.method1447(this.field2378, -6653);
        int var5 = var4.field2208;
        if (var4.field2209 != null) {
            var4 = var4.method953(35);
        }
        if (var4 == null) {
            return null;
        }
        if (class111.field1837 != 0 && this.field2369 && (this.field2384 == null || this.field2384 != null && this.field2384.field2854 != var4.field2208)) {
            int var6 = var4.field2208;
            if (var4.field2208 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field2384 = null;
            } else {
                this.field2384 = class49.method384(var6, 45);
            }
            if (this.field2384 != null) {
                if (var4.field2188 && this.field2384.field2858 != -1) {
                    this.field2364 = (int) ((double) this.field2384.field2848.length * Math.random());
                    this.field2386 -= (int) (Math.random() * (double) this.field2384.field2836[this.field2364]);
                } else {
                    this.field2386 = class222.field3682 - 1;
                    this.field2364 = 0;
                }
            }
        }
        int var7 = this.field2366 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field2175;
            var8 = var4.field2225;
        } else {
            var8 = var4.field2175;
            var9 = var4.field2225;
        }
        int var10 = (var9 >> 1) + this.field2374;
        int var11 = (var9 + 1 >> 1) + this.field2374;
        int var12 = this.field2379 + (var8 >> 1);
        int var13 = (var8 + 1 >> 1) + this.field2379;
        this.method1019(var10 * 128, 2743, var12 * 128);
        boolean var14 = !var3 && var4.field2191 && (this.field2361 != var4.field2173 || (this.field2377 != this.field2364 || this.field2384 != null && (this.field2384.field2846 || class106.field1690) && this.field2391 != this.field2364) && class97.field1575 >= 2);
        if (arg0 && !var14) {
            return null;
        }
        int[][] var15 = class124.field2012[this.field2382];
        int var16 = var15[var13][var10] + var15[var13][var11] + var15[var12][var10] + var15[var12][var11] >> 2;
        int var17 = (this.field2379 << 7) + (var8 << 6);
        int var18 = (this.field2374 << 7) + (var9 << 6);
        boolean var19 = this.field2375 == null;
        int[][] var20 = null;
        if (var3) {
            var20 = class219.field3586[0];
        } else if (this.field2382 < 3) {
            var20 = class124.field2012[this.field2382 + 1];
        }
        class125 var21;
        if (this.field2384 == null) {
            var21 = var4.method948(false, -117, var18, var17, var16, var19 ? class275.field4351 : this.field2375, var20, this.field2366, var15, this.field2372, var14);
        } else {
            var21 = var4.method952(this.field2372, var17, var15, var14, var16, this.field2366, this.field2384, this.field2364, this.field2390, (byte) 102, var18, var20, this.field2391, var19 ? class275.field4351 : this.field2375);
        }
        if (var21 == null) {
            return null;
        } else {
            if (arg1) {
                this.field2372 = -91;
            }
            return var21.field2015;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1019(arg4, 2743, arg3);
        field2363++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()I")
    public final int method119() {
        field2383++;
        return this.field2360;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class130 arg10) {
        field2365++;
        class260 var13 = this.method1013((byte) -79);
        if (var13 != null) {
            var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2380);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ZJZIZII)V")
    public static final void method1018(int arg0, String arg1, int arg2, String arg3, boolean arg4, long arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field2376++;
        int[] var12 = new int[4];
        for (int var13 = arg2; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class221 var14 = new class221(128);
        var14.method1548(arg2 - 494964184, 10);
        var14.method1554((arg6 ? 4 : 0) | (arg4 ? 2 : 0) | (arg8 ? 1 : 0), (byte) 89);
        var14.method1502((byte) -68, arg5);
        var14.method1529((byte) 117, var12[0]);
        var14.method1563(arg3, 116);
        var14.method1529((byte) 127, var12[1]);
        var14.method1554(class54.field926, (byte) 89);
        var14.method1548(-494964184, arg7);
        var14.method1548(-494964184, arg9);
        var14.method1529((byte) 122, var12[2]);
        var14.method1554(arg0, (byte) 89);
        var14.method1554(arg10, (byte) 89);
        var14.method1529((byte) 127, var12[3]);
        var14.method1530(class247.field3950, 0, class60.field984);
        class221 var15 = new class221(128);
        var15.method1563(arg1, 75);
        int var16 = 8 - (class193.method1313(111, arg1) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1548(-494964184, (int) (Math.random() * 255.0D));
        }
        var15.method1549(0, var12);
        class68.field1113.field3655 = 0;
        class68.field1113.method1548(-494964184, 22);
        class68.field1113.method1548(-494964184, var14.field3655 + var15.field3655 + 2);
        class68.field1113.method1554(533, (byte) 89);
        class68.field1113.method1537(var14.field3653, (byte) 20, var14.field3655, 0);
        class68.field1113.method1537(var15.field3653, (byte) 20, var15.field3655, 0);
        class145.field2330 = -3;
        class70.field1154 = 0;
        class138.field2264 = 1;
        class273.field4310 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V")
    private final void method1019(int arg0, int arg1, int arg2) {
        if (this.field2384 != null) {
            int var4 = class222.field3682 - this.field2386;
            if (var4 > 100 && this.field2384.field2858 > 0) {
                int var5 = this.field2384.field2848.length - this.field2384.field2858;
                while (var5 > this.field2364 && var4 > this.field2384.field2836[this.field2364]) {
                    var4 -= this.field2384.field2836[this.field2364];
                    this.field2364++;
                }
                if (var5 <= this.field2364) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2384.field2848.length; var7++) {
                        var6 += this.field2384.field2836[var7];
                    }
                    var4 %= var6;
                }
                this.field2391 = this.field2364 + 1;
                if (this.field2384.field2848.length <= this.field2391) {
                    this.field2391 -= this.field2384.field2858;
                    if (this.field2391 < 0 || this.field2384.field2848.length <= this.field2391) {
                        this.field2391 = -1;
                    }
                }
            }
            while (var4 > this.field2384.field2836[this.field2364]) {
                class132.method934((byte) 112, this.field2384, arg2, arg0, this.field2364, false);
                var4 -= this.field2384.field2836[this.field2364];
                this.field2364++;
                if (this.field2384.field2848.length <= this.field2364) {
                    this.field2364 -= this.field2384.field2858;
                    if (this.field2364 < 0 || this.field2364 >= this.field2384.field2848.length) {
                        this.field2384 = null;
                        break;
                    }
                }
                this.field2391 = this.field2364 + 1;
                if (this.field2391 >= this.field2384.field2848.length) {
                    this.field2391 -= this.field2384.field2858;
                    if (this.field2391 < 0 || this.field2391 >= this.field2384.field2848.length) {
                        this.field2391 = -1;
                    }
                }
            }
            this.field2390 = var4;
            this.field2386 = class222.field3682 - var4;
        }
        field2373++;
        if (arg1 != 2743) {
            field2362 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2381++;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIZLik;)V")
    public class148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class260 arg8) {
        this.field2382 = arg3;
        this.field2379 = arg4;
        this.field2372 = arg1;
        this.field2378 = arg0;
        this.field2366 = arg2;
        this.field2374 = arg5;
        if (arg6 != -1) {
            this.field2384 = class49.method384(arg6, -103);
            this.field2364 = 0;
            if (this.field2384.field2848.length <= 1) {
                this.field2391 = 0;
            } else {
                this.field2391 = 1;
            }
            this.field2386 = class222.field3682 - 1;
            this.field2390 = 1;
            if (this.field2384.field2847 == 0 && arg8 != null && arg8 instanceof class148) {
                class148 var10 = (class148) arg8;
                if (this.field2384 == var10.field2384) {
                    this.field2391 = var10.field2391;
                    this.field2364 = var10.field2364;
                    this.field2390 = var10.field2390;
                    this.field2386 = var10.field2386;
                    return;
                }
            }
            if (arg7 && this.field2384.field2858 != -1) {
                this.field2364 = (int) ((double) this.field2384.field2848.length * Math.random());
                this.field2391 = this.field2364 + 1;
                if (this.field2384.field2848.length <= this.field2391) {
                    this.field2391 -= this.field2384.field2858;
                    if (this.field2391 < 0 || this.field2384.field2848.length <= this.field2391) {
                        this.field2391 = -1;
                    }
                }
                this.field2390 = (int) (Math.random() * (double) this.field2384.field2836[this.field2364]) + 1;
                this.field2386 = class222.field3682 - this.field2390;
            }
        }
        if (arg8 == null) {
            class135 var11 = class209.method1447(this.field2378, -6653);
            if (var11.field2209 != null) {
                this.field2369 = true;
                return;
            }
        }
    }
}

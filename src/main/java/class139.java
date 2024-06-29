import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class139 extends class67 {

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    private int field2377 = -1;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "Z")
    private boolean field2380 = false;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "Lrk;")
    private class14 field2388 = null;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    private int field2384 = -32768;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    private int field2390 = -1;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    private int field2386;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "Lie;")
    private class2 field2373;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    private int field2382;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "Leg;")
    public static class37 field2376 = class174.method1167("headicons_prayer", 122);

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Leg;")
    private static class37 field2385 = class174.method1167("Face here", -102);

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "Leg;")
    public static class37 field2391 = class174.method1167("Monde de jeu cr-B-B", 70);

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "Leg;")
    public static class37 field2394 = field2385;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "Ljl;")
    public static class101 field2372;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Ldk;")
    private class193 field2361;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "[I")
    public static int[] field2371;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "[Lni;")
    public static class195[] field2370;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZII)I")
    public static final int method975(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return 120;
        }
        field2362++;
        if (arg2 < arg0) {
            return arg0;
        } else if (arg3 < arg2) {
            return arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2367++;
        class67 var6 = null;
        this.method977(arg4, arg3, (byte) -69);
        if (!this.field2380) {
            if (var6 == null) {
                var6 = this.method982(4096);
            }
            if (var6 == null) {
                return;
            }
            this.method976(var6, (byte) -104);
        }
        if (this.field2361 != null) {
            this.field2361.method1332(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lme;B)V")
    private final void method976(class67 arg0, byte arg1) {
        field2395++;
        if (arg1 != -104) {
            return;
        }
        class209 var3 = (class209) arg0;
        if ((this.field2361 == null || this.field2361.field3289) && (var3.field3545 != null || var3.field3536 != null)) {
            class133 var4 = class178.method1186(this.field2389, 0);
            if (var4.field2303 != null) {
                var4 = var4.method962(-127);
            }
            if (var4 != null) {
                this.field2361 = new class193(class72.field1146, var4.field2272, var4.field2306);
            }
        }
        if (this.field2361 != null) {
            this.field2361.method1331(var3.field3545, var3.field3536, false, var3.field3558, var3.field3540, var3.field3534);
        }
        this.field2380 = true;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
    private final void method977(int arg0, int arg1, byte arg2) {
        field2379++;
        if (this.field2373 != null) {
            int var4 = class72.field1146 - this.field2382;
            if (var4 > 100 && this.field2373.field47 > 0) {
                int var5 = this.field2373.field24.length - this.field2373.field47;
                while (var5 > this.field2369 && this.field2373.field46[this.field2369] < var4) {
                    var4 -= this.field2373.field46[this.field2369];
                    this.field2369++;
                }
                if (this.field2369 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2373.field24.length; var7++) {
                        var6 += this.field2373.field46[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field2373.field46[this.field2369]) {
                            break label62;
                        }
                        class182.method1201(arg1, this.field2373, 255, arg0, false, this.field2369);
                        var4 -= this.field2373.field46[this.field2369];
                        this.field2369++;
                    } while (this.field2369 < this.field2373.field24.length);
                    this.field2369 -= this.field2373.field47;
                } while (this.field2369 >= 0 && this.field2369 < this.field2373.field24.length);
                this.field2373 = null;
            }
            this.field2382 = class72.field1146 - var4;
        }
        if (arg2 != -69) {
            this.field2396 = 91;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(BI)Z")
    public static final boolean method978(byte arg0, int arg1) {
        field2387++;
        if (arg1 < 32) {
            return false;
        } else if (arg0 != 60) {
            return true;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method979(int arg0) {
        field2376 = null;
        field2371 = null;
        field2391 = null;
        field2385 = null;
        field2394 = null;
        field2370 = null;
        if (arg0 <= 8) {
            field2394 = null;
        }
        field2372 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIIIIIIIZII)Z")
    public static final boolean method980(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field2381++;
        if (!arg9) {
            return true;
        } else if (class82.field1285.method763(-1) == 2) {
            return class61.method437(arg11, arg7, arg1, arg3, arg6, arg5, arg2, arg8, arg0, arg4, arg10, -12482);
        } else if (class82.field1285.method763(-1) > 2) {
            return class37.method244(arg10, arg8, arg3, arg1, arg7, arg6, arg0, arg11, (byte) 95, arg5, arg2, class82.field1285.method763(-1), arg4);
        } else {
            return class80.method537(arg5, arg10, arg1, arg2, arg4, arg6, arg11, (byte) -106, arg7, arg0, arg3, arg8);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10) {
        class67 var13 = this.method982(4096);
        field2374++;
        if (var13 != null) {
            this.method976(var13, (byte) -104);
            var13.method313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2361);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()I")
    public final int method308() {
        field2363++;
        return this.field2384;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(ZZ)Lme;")
    private final class67 method981(boolean arg0, boolean arg1) {
        field2392++;
        if (arg1) {
            this.finalize();
        }
        boolean var3 = class218.field3754 != class177.field2958;
        class133 var4 = class178.method1186(this.field2389, 0);
        if (var4.field2303 != null) {
            var4 = var4.method962(-126);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field2396 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2272;
            var7 = var4.field2306;
        } else {
            var6 = var4.field2306;
            var7 = var4.field2272;
        }
        int var8 = this.field2386 + (var7 >> 1);
        int var9 = (var6 >> 1) + this.field2383;
        int var10 = (var7 + 1 >> 1) + this.field2386;
        int var11 = this.field2383 + (var6 + 1 >> 1);
        this.method977(var9 * 128, var8 * 128, (byte) -69);
        boolean var12 = !var3 && var4.field2275 && (this.field2390 != var4.field2304 || this.field2377 != this.field2369 && class23.field300 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class218.field3754[this.field2364];
        int var14 = var13[var8][var9] + var13[var8][var11] + var13[var10][var11] + var13[var10][var9] >> 2;
        int var15 = (this.field2386 << 7) + (var7 << 6);
        int var16 = (this.field2383 << 7) + (var6 << 6);
        boolean var17 = this.field2388 == null;
        int[][] var18 = null;
        if (var3) {
            var18 = class177.field2958[0];
        } else if (this.field2364 < 3) {
            var18 = class218.field3754[this.field2364 + 1];
        }
        class40 var19;
        if (this.field2373 == null) {
            var19 = var4.method959(var17 ? class286.field5044 : this.field2388, this.field2396, var14, var18, var13, var15, 43, this.field2365, var16, var12, false);
        } else {
            var19 = var4.method953(var15, this.field2369, 591506851, var16, var17 ? class286.field5044 : this.field2388, this.field2373, this.field2365, this.field2396, var12, var18, var14, var13);
        }
        return var19 == null ? null : var19.field648;
    }

    @OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2368++;
        if (this.field2361 != null) {
            this.field2361.method1338();
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Lme;")
    private final class67 method982(int arg0) {
        if (arg0 == 4096) {
            field2375++;
            return this.method981(false, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILva;)V")
    public static final void method983(int arg0, class187 arg1) {
        while (arg1.field3169 < arg1.field3175.length) {
            int var2 = 0;
            int var3 = 0;
            boolean var4 = false;
            if (arg1.method1268(arg0 ^ 0xFFFF9D04) == 1) {
                var2 = arg1.method1268(255);
                var3 = arg1.method1268(arg0 ^ 0xFFFF9D04);
                var4 = true;
            }
            int var5 = arg1.method1268(arg0 + 25348);
            int var6 = arg1.method1268(255);
            int var7 = class118.field2004 + class228.field3921 - var6 * 64 - 1;
            int var8 = var5 * 64 - class13.field205;
            if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class243.field4368 && var7 < class118.field2004) {
                int var9 = var8 >> 6;
                int var10 = var7 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var4 || var11 >= var2 * 8 && var11 < var2 * 8 + 8 && var12 >= (var3 * 8) && (var3 * 8 + 8) > var12) {
                            byte var13 = arg1.method1269(arg0 ^ 0xFFFF9D04);
                            if (var13 != 0) {
                                if (class201.field3408[var9][var10] == null) {
                                    class201.field3408[var9][var10] = new byte[4096];
                                }
                                class201.field3408[var9][var10][(63 - var12 << 6) + var11] = var13;
                                byte var14 = arg1.method1269(255);
                                if (class260.field4607[var9][var10] == null) {
                                    class260.field4607[var9][var10] = new byte[4096];
                                }
                                class260.field4607[var9][var10][(63 - var12 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                    byte var16 = arg1.method1269(255);
                    if (var16 != 0) {
                        arg1.field3169++;
                    }
                }
            }
        }
        field2378++;
        if (arg0 != -25093) {
            field2385 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIIIIIZLme;)V")
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class67 arg8) {
        this.field2364 = arg3;
        this.field2383 = arg5;
        this.field2396 = arg2;
        this.field2389 = arg0;
        this.field2365 = arg1;
        this.field2386 = arg4;
        if (arg6 != -1) {
            this.field2373 = class186.method1242(0, arg6);
            this.field2369 = 0;
            this.field2382 = class72.field1146 - 1;
            if (this.field2373.field38 == 0 && arg8 != null && arg8 instanceof class139) {
                class139 var10 = (class139) arg8;
                if (this.field2373 == var10.field2373) {
                    this.field2382 = var10.field2382;
                    this.field2369 = var10.field2369;
                    return;
                }
            }
            if (arg7 && this.field2373.field47 != -1) {
                this.field2369 = (int) (Math.random() * (double) this.field2373.field24.length);
                this.field2382 -= (int) (Math.random() * (double) this.field2373.field46[this.field2369]);
                return;
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class184 extends class428 {

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Z")
    public boolean field2375 = false;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Z")
    private boolean field2384 = false;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    private int field2368 = 0;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Ltn;")
    public class118 field2398;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "J")
    private long field2383;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Lbt;")
    public class380 field2388;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Ldl;")
    public class217 field2395;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Lre;")
    public class388 field2370;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Lpn;")
    public static class72 field2400;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "[I")
    public static int[] field2403;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "F")
    public static float field2404;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    private int field2380;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    private int field2386;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    private int field2394;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    private int field2401;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field2402;

    static {
        new class40("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field2400 = new class72(0, -1);
        field2403 = new int[] { 1, 2, 4, 8 };
        new class40("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field2404 = 0.0F;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILoj;IZJ)V", line = 12)
    public final void method996(int arg0, class280 arg1, int arg2, boolean arg3, long arg4) {
        field2382++;
        if (this.field2375) {
            arg3 = false;
        } else if (class432.field6257 < this.field2395.field3033) {
            arg3 = false;
        } else if (class179.field2227[class432.field6257] < class92.field1144) {
            arg3 = false;
        } else if (this.field2384) {
            arg3 = false;
        } else if (this.field2395.field3005 != -1) {
            int var7 = (int) (arg4 - this.field2383);
            if (this.field2395.field3041 || this.field2395.field3005 >= var7) {
                var7 %= this.field2395.field3005;
            } else {
                arg3 = false;
            }
            if (!this.field2395.field3020 && this.field2395.field3029 > var7) {
                arg3 = false;
            }
            if (this.field2395.field3020 && var7 >= this.field2395.field3029) {
                arg3 = false;
            }
        }
        if (arg3) {
            this.field2368 += (int) ((double) arg0 * (Math.random() * (double) (this.field2395.field3045 - this.field2395.field3054) + (double) this.field2395.field3054));
            if (this.field2368 > 63) {
                int var8 = this.field2368 >> 6;
                this.field2368 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field2395.field3001 <= 0 && this.field2395.field3016 <= 0) {
                        var10 = this.field2396;
                        var11 = this.field2373;
                        var12 = this.field2385;
                    } else {
                        int var13 = this.field2386 + (int) (Math.random() * (double) this.field2399);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class16.field212[var14];
                        int var16 = class16.field214[var14];
                        int var17 = (int) ((double) this.field2372 * Math.random()) + this.field2371;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class16.field212[var18];
                        var11 = var16 * var19 >> 15;
                        int var20 = class16.field214[var18];
                        var12 = var20 * -1;
                        var10 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field2389 * var21 - (-(this.field2381 * var22) - this.field2380 * var23) >> 16;
                    int var25 = this.field2379 * var21 - (-(this.field2376 * var22) - this.field2378 * var23) >> 16;
                    int var26 = this.field2369 * var23 + this.field2401 * var21 + this.field2394 * var22 >> 16;
                    int var27 = (int) ((double) (this.field2395.field3018 - this.field2395.field3046) * Math.random()) + this.field2395.field3046;
                    int var28 = this.field2395.field2983 + (int) ((double) (this.field2395.field2996 - this.field2395.field2983) * Math.random());
                    int var29 = (int) (Math.random() * (double) (this.field2395.field3004 - this.field2395.field2992)) + this.field2395.field2992;
                    int var32;
                    if (this.field2395.field2987) {
                        double var30 = Math.random();
                        var32 = (int) ((double) this.field2395.field2986 * var30 + (double) this.field2395.field3059) << 8 | (int) ((double) this.field2395.field3025 * var30 + (double) this.field2395.field3028) << 16 | (int) ((double) this.field2395.field3039 * var30 + (double) this.field2395.field3032) | (int) ((double) this.field2395.field3007 + (double) this.field2395.field3052 * Math.random()) << 24;
                    } else {
                        var32 = (int) ((double) this.field2395.field3032 + Math.random() * (double) this.field2395.field3039) | (int) ((double) this.field2395.field3025 * Math.random() + (double) this.field2395.field3028) << 16 | (int) ((double) this.field2395.field3059 + Math.random() * (double) this.field2395.field2986) << 8 | (int) (Math.random() * (double) this.field2395.field3052 + (double) this.field2395.field3007) << 24;
                    }
                    int var33 = this.field2395.field3023;
                    if (!arg1.method1495() && !this.field2395.field3003) {
                        var33 = -1;
                    }
                    if (class199.field2769 == class122.field1513) {
                        new class59(this, var24, var25, var26, var11, var12, var10, var27, var28, var32, var29, var33, this.field2395.field3021);
                    } else {
                        class59 var35 = class28.field369[class122.field1513];
                        class122.field1513 = class122.field1513 + 1 & 0x3FF;
                        var35.method305(this, var24, var25, var26, var11, var12, var10, var27, var28, var32, var29, var33, this.field2395.field3021);
                    }
                }
            }
        }
        this.field2366 = arg2;
        for (class59 var36 = (class59) this.field2370.method2334(-120); var36 != null; var36 = (class59) this.field2370.method2340(28)) {
            var36.method309(arg4, arg0);
            this.field2366++;
        }
        class480.field6794 += this.field2366;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 181)
    public static final int method997(String arg0, boolean arg1) {
        if (arg1) {
            return -65;
        } else {
            field2387++;
            return class134.method633(57, arg0, 10, true);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lab;Lab;I)V", line = 195)
    public static final void method998(class256 arg0, class256 arg1, int arg2) {
        class352.field5056++;
        class244.method1332((byte) -37, class29.field376);
        field2377++;
        class230.field3185.method897(arg1.field3659, -123);
        class230.field3185.method884(arg1.field3585, true);
        class230.field3185.method898(arg0.field3585, false);
        class230.field3185.method884(arg0.field3568, true);
        if (arg2 != 1) {
            method999(-4, (class415) null, 56, 71, (byte) 48);
        }
        class230.field3185.method898(arg1.field3568, false);
        class230.field3185.method917(arg0.field3659, 49);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Loj;Ltn;Lbt;J)V", line = 441)
    public class184(class280 arg0, class118 arg1, class380 arg2, long arg3) {
        this.field2398 = arg1;
        this.field2383 = arg3;
        this.field2388 = arg2;
        this.field2395 = class323.method1966(0, this.field2398.field1470);
        if (!arg0.method1495() && this.field2395.field3035 != -1) {
            this.field2395 = class323.method1966(0, this.field2395.field3035);
        }
        this.field2370 = new class388();
        this.field2368 = (int) ((double) this.field2368 + Math.random() * 64.0D);
        this.method1000(1338076472);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILcu;IIB)V", line = 220)
    public static final void method999(int arg0, class415 arg1, int arg2, int arg3, byte arg4) {
        field2397++;
        if (arg4 != -36) {
            return;
        }
        for (class399 var5 = (class399) class445.field6339.method802((byte) 108); var5 != null; var5 = (class399) class445.field6339.method806((byte) 104)) {
            if (var5.field5668 == arg3 && (arg2 * 128) == var5.field5680 && (arg0 * 128) == var5.field5672 && var5.field5685.field5918 == arg1.field5918) {
                if (var5.field5688 != null) {
                    class226.field3136.method509(var5.field5688);
                    var5.field5688 = null;
                }
                if (var5.field5682 != null) {
                    class226.field3136.method509(var5.field5682);
                    var5.field5682 = null;
                }
                var5.method702((byte) -114);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 261)
    public final void method1000(int arg0) {
        field2393++;
        this.field2369 = this.field2398.field1466;
        this.field2376 = this.field2398.field1458;
        this.field2389 = this.field2398.field1453;
        if (arg0 != 1338076472) {
            this.field2378 = 87;
        }
        this.field2381 = this.field2398.field1465;
        this.field2378 = this.field2398.field1462;
        this.field2401 = this.field2398.field1468;
        this.field2380 = this.field2398.field1464;
        this.field2394 = this.field2398.field1455;
        this.field2379 = this.field2398.field1450;
        if (this.field2389 == this.field2381 && this.field2381 == this.field2380 && this.field2379 == this.field2376 && this.field2378 == this.field2376 && this.field2401 == this.field2394 && this.field2394 == this.field2369) {
            this.field2384 = true;
            return;
        }
        this.field2384 = false;
        int var2 = (this.field2389 + this.field2381 + this.field2380) / 3;
        int var3 = (this.field2379 + this.field2376 + this.field2378) / 3;
        int var4 = (this.field2401 + this.field2394 + this.field2369) / 3;
        if (this.field2390 == var2 && this.field2392 == var3 && this.field2367 == var4) {
            return;
        }
        this.field2392 = var3;
        this.field2390 = var2;
        this.field2367 = var4;
        int var5 = this.field2381 - this.field2389;
        int var6 = this.field2376 - this.field2379;
        int var7 = this.field2394 - this.field2401;
        int var8 = this.field2380 - this.field2389;
        int var9 = this.field2378 - this.field2379;
        int var10 = this.field2369 - this.field2401;
        this.field2373 = var6 * var10 - (var7 * var9);
        this.field2396 = var5 * var9 - (var6 * var8);
        for (this.field2385 = var7 * var8 - (var5 * var10); this.field2373 > 32767 || this.field2385 > 32767 || this.field2396 > 32767 || this.field2373 < -32767 || this.field2385 < -32767 || this.field2396 < -32767; this.field2385 >>= 0x1) {
            this.field2396 >>= 0x1;
            this.field2373 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field2385 * this.field2385 + this.field2396 * this.field2396 + this.field2373 * this.field2373));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field2385 = this.field2385 * 32767 / var11;
        this.field2373 = this.field2373 * 32767 / var11;
        this.field2396 = this.field2396 * 32767 / var11;
        if (this.field2395.field3001 <= 0 && this.field2395.field3016 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field2396, (double) this.field2373) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field2385, Math.sqrt((double) (this.field2373 * this.field2373 + (this.field2396 * this.field2396)))) * 2607.5945876176133D);
        this.field2399 = this.field2395.field3001 - this.field2395.field3036;
        this.field2386 = var12 + this.field2395.field3036 - (this.field2399 >> 1);
        this.field2372 = this.field2395.field3016 - this.field2395.field3026;
        this.field2371 = this.field2395.field3026 + var13 - (this.field2372 >> 1);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 347)
    public static void method1001(int arg0) {
        field2403 = null;
        if (arg0 == 3205) {
            field2400 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BJ)V", line = 370)
    public final void method1002(byte arg0, long arg1) {
        class59 var4 = (class59) this.field2370.method2334(-87);
        if (arg0 != -81) {
            method1001(-95);
        }
        while (var4 != null) {
            var4.method306(arg1);
            var4 = (class59) this.field2370.method2340(arg0 ^ 0xFFFFFF97);
        }
        field2391++;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 389)
    public static final void method1003(int arg0) {
        if (arg0 >= -56) {
            field2402 = -114;
        }
        if (class486.field6898 < 0) {
            class325.field4690 = -1;
            class486.field6898 = 0;
            class104.field1260 = -1;
        }
        field2374++;
        if (class486.field6898 > class429.field6212) {
            class486.field6898 = class429.field6212;
            class325.field4690 = -1;
            class104.field1260 = -1;
        }
        if (class17.field218 < 0) {
            class17.field218 = 0;
            class104.field1260 = -1;
            class325.field4690 = -1;
        }
        if (class429.field6200 < class17.field218) {
            class325.field4690 = -1;
            class104.field1260 = -1;
            class17.field218 = class429.field6200;
        }
    }
}

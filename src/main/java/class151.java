import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class151 {

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field2524 = -1;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public int field2526 = -1;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
    public boolean field2514 = false;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field2515 = -1;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public int field2534 = 2;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public int field2533 = -1;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field2520 = 99;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Z")
    private boolean field2530 = false;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public int field2535 = 5;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field2516 = -1;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
    public static int[] field2512 = new int[2000];

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lqh;")
    public static class189 field2519 = new class189(64);

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Ldf;")
    public static class51 field2537 = class46.method233("blinken3:", 100);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Loj;")
    public static class150 field2511;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "[I")
    private int[] field2527;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
    public int[] field2532;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "[I")
    public int[] field2539;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "[I")
    private int[] field2540;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[[I")
    public int[][] field2538;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method1079(int arg0) {
        if (this.field2524 == -1) {
            if (this.field2540 == null) {
                this.field2524 = 0;
            } else {
                this.field2524 = 2;
            }
        }
        if (this.field2515 == arg0) {
            if (this.field2540 == null) {
                this.field2515 = 0;
            } else {
                this.field2515 = 2;
            }
        }
        field2531++;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
    public static final int method1080(int arg0) {
        field2513++;
        if (arg0 != 17452) {
            field2512 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method1081(byte arg0) {
        if (class247.field4276 != null) {
            class247.field4276.method838(-121);
        }
        field2521++;
        if (arg0 != 113) {
            field2512 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ltb;IIZ)Ltb;")
    public final class65 method1082(class65 arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field2539[arg1];
        field2528++;
        class130 var6 = class11.method58(var5 >> 16, (byte) -115);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method447(true, true);
        }
        int var8 = arg2 & 0x3;
        if (arg3) {
            this.field2514 = false;
        }
        class65 var9 = arg0.method447(!var6.method959(var7, 0), !this.field2530);
        if (var8 == 1) {
            var9.method454();
        } else if (var8 == 2) {
            var9.method438();
        } else if (var8 == 3) {
            var9.method453();
        }
        var9.method446(var6, var7, this.field2530);
        if (var8 == 1) {
            var9.method453();
        } else if (var8 == 2) {
            var9.method438();
        } else if (var8 == 3) {
            var9.method454();
        }
        return var9;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ltb;Lmb;ZII)Ltb;")
    public final class65 method1083(class65 arg0, class151 arg1, boolean arg2, int arg3, int arg4) {
        field2541++;
        int var6 = this.field2539[arg4];
        class130 var7 = class11.method58(var6 >> 16, (byte) -115);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1089((byte) 117, arg3, arg0);
        }
        int var9 = arg1.field2539[arg3];
        class130 var10 = class11.method58(var9 >> 16, (byte) -115);
        int var11 = var9 & 0xFFFF;
        if (arg2) {
            field2537 = null;
        }
        if (var10 == null) {
            class65 var12 = arg0.method447(!var7.method959(var8, 0), !this.field2530);
            var12.method446(var7, var8, this.field2530);
            return var12;
        } else {
            class65 var13 = arg0.method447(!var7.method959(var8, 0) & !var10.method959(var11, 0), !this.field2530 & !arg1.field2530);
            var13.method444(var7, var8, var10, var11, this.field2540, this.field2530 | arg1.field2530);
            return var13;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZILtb;)Ltb;")
    public final class65 method1084(boolean arg0, int arg1, class65 arg2) {
        field2522++;
        if (arg0) {
            this.method1079(-55);
        }
        int var4 = this.field2539[arg1];
        class130 var5 = class11.method58(var4 >> 16, (byte) -115);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method449(true, true);
        } else {
            class65 var7 = arg2.method449(!var5.method959(var6, 0), !this.field2530);
            var7.method446(var5, var6, this.field2530);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILtb;I)Ltb;")
    public final class65 method1085(int arg0, class65 arg1, int arg2) {
        field2525++;
        int var4 = this.field2539[arg0];
        class130 var5 = class11.method58(var4 >> 16, (byte) -115);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method447(true, true);
        }
        class130 var7 = null;
        int var8 = 0;
        if (this.field2527 != null && this.field2527.length > arg0) {
            int var9 = this.field2527[arg0];
            var7 = class11.method58(var9 >> 16, (byte) -115);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class65 var11 = arg1.method447(!var5.method959(var6, arg2 ^ 0xFFFFA9F1), !this.field2530);
            var11.method446(var5, var6, this.field2530);
            return var11;
        }
        if (arg2 != -22031) {
            this.method1089((byte) 85, -109, (class65) null);
        }
        class65 var10 = arg1.method447(!var5.method959(var6, 0) & !var7.method959(var8, 0), !this.field2530);
        var10.method446(var5, var6, this.field2530);
        var10.method446(var7, var8, this.field2530);
        return var10;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZILlb;)V")
    private final void method1086(boolean arg0, int arg1, class121 arg2) {
        if (arg0) {
            field2537 = null;
        }
        field2510++;
        if (arg1 == 1) {
            int var4 = arg2.method876(arg0);
            this.field2532 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2532[var5] = arg2.method876(false);
            }
            this.field2539 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2539[var6] = arg2.method876(false);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2539[var7] += arg2.method876(false) << 16;
            }
        } else if (arg1 == 2) {
            this.field2526 = arg2.method876(arg0);
        } else if (arg1 == 3) {
            int var8 = arg2.method897(126);
            this.field2540 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2540[var9] = arg2.method897(120);
            }
            this.field2540[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field2514 = true;
        } else if (arg1 == 5) {
            this.field2535 = arg2.method897(118);
        } else if (arg1 == 6) {
            this.field2516 = arg2.method876(false);
        } else if (arg1 == 7) {
            this.field2533 = arg2.method876(false);
        } else if (arg1 == 8) {
            this.field2520 = arg2.method897(-29);
        } else if (arg1 == 9) {
            this.field2524 = arg2.method897(118);
        } else if (arg1 == 10) {
            this.field2515 = arg2.method897(113);
        } else if (arg1 == 11) {
            this.field2534 = arg2.method897(-15);
        } else if (arg1 == 12) {
            int var14 = arg2.method897(-77);
            this.field2527 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2527[var15] = arg2.method876(false);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field2527[var16] = (arg2.method876(arg0) << 16) + this.field2527[var16];
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method876(false);
            this.field2538 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method897(-25);
                if (var12 > 0) {
                    this.field2538[var11] = new int[var12];
                    this.field2538[var11][0] = arg2.method891((byte) -109);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field2538[var11][var13] = arg2.method876(false);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2530 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)I")
    public static final int method1087(int arg0, byte arg1, int arg2) {
        field2529++;
        int var3 = class46.method239(arg0 - 1, (byte) 125, arg2 - 1) + class46.method239(arg0 - 1, (byte) -8, arg2 + 1) + class46.method239(arg0 + 1, (byte) 127, arg2 - 1) + class46.method239(arg0 + 1, (byte) 5, arg2 + 1);
        int var4 = class46.method239(arg0, (byte) 126, arg2 - 1) - (-class46.method239(arg0, (byte) -70, arg2 + 1) - (class46.method239(arg0 - 1, (byte) 127, arg2) + class46.method239(arg0 + 1, (byte) 127, arg2)));
        if (arg1 != 67) {
            field2512 = null;
        }
        int var5 = class46.method239(arg0, (byte) -12, arg2);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Llb;Z)V")
    public final void method1088(class121 arg0, boolean arg1) {
        field2518++;
        while (true) {
            int var3 = arg0.method897(-80);
            if (var3 == 0) {
                if (arg1) {
                    method1091(-76);
                    return;
                } else {
                    return;
                }
            }
            this.method1086(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILtb;)Ltb;")
    public final class65 method1089(byte arg0, int arg1, class65 arg2) {
        field2517++;
        if (arg0 != 117) {
            return null;
        }
        int var4 = this.field2539[arg1];
        class130 var5 = class11.method58(var4 >> 16, (byte) -115);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method447(true, true);
        } else {
            class65 var7 = arg2.method447(!var5.method959(var6, 0), !this.field2530);
            var7.method446(var5, var6, this.field2530);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lmh;")
    public static final class143 method1090(int arg0) {
        field2523++;
        if (arg0 != 0) {
            field2512 = null;
        }
        try {
            return (class143) Class.forName("dh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class133();
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field2519 = null;
        if (arg0 <= 110) {
            method1090(15);
        }
        field2537 = null;
        field2512 = null;
        field2511 = null;
    }
}

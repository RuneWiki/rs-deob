import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class173 {

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public int field2388 = -1;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "Ltba;")
    private class165 field2389;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "Ljava/lang/String;")
    private String field2393;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "Ljava/lang/String;")
    private String field2400;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "[I")
    private int[] field2383;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "[I")
    private int[] field2392;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "[I")
    private int[] field2394;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "[I")
    private int[] field2395;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[I")
    private int[] field2396;

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "[I")
    private int[] field2404;

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "[I")
    private int[] field2405;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "[I")
    private int[] field2407;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field2385;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field2398;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "[[I")
    private int[][] field2399;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "[[I")
    private int[][] field2402;

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "[[I")
    private int[][] field2403;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIII)V", line = 13)
    public static final void method1191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var11 = arg4 + 1;
        class636.method3569(arg2, arg3, arg1, 347845800, class432.field5765[arg4]);
        field2384++;
        int var10 = arg0 - 1;
        class636.method3569(arg2, arg3, arg1, 347845800, class432.field5765[arg0]);
        for (int var6 = var11; var6 <= var10; var6++) {
            int[] var8 = class432.field5765[var6];
            var8[arg1] = var8[arg2] = arg3;
        }
        int var7 = 127 / ((arg5 - 82) / 35);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lsl;II)V", line = 50)
    private final void method1192(class461 arg0, int arg1, int arg2) {
        if (arg2 != 28092) {
            this.method1192(null, -75, -35);
        }
        if (arg1 == 1) {
            this.field2400 = arg0.method2625(-122);
        } else if (arg1 == 2) {
            this.field2393 = arg0.method2625(-97);
        } else if (arg1 == 3) {
            int var4 = arg0.method2600((byte) -128);
            this.field2399 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2399[var5][0] = arg0.method2566(arg2 - 28094);
                this.field2399[var5][1] = arg0.method2622(-539564808);
                this.field2399[var5][2] = arg0.method2622(-539564808);
            }
        } else if (arg1 == 4) {
            int var6 = arg0.method2600((byte) -126);
            this.field2402 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2402[var7][0] = arg0.method2566(-2);
                this.field2402[var7][1] = arg0.method2622(-539564808);
                this.field2402[var7][2] = arg0.method2622(-539564808);
            }
        } else if (arg1 == 5) {
            arg0.method2566(arg2 - 28094);
        } else if (arg1 == 6) {
            arg0.method2600((byte) -123);
        } else if (arg1 == 7) {
            arg0.method2600((byte) -127);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method2600((byte) -124);
            } else if (arg1 == 10) {
                int var22 = arg0.method2600((byte) -126);
                this.field2394 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field2394[var23] = arg0.method2622(-539564808);
                }
            } else if (arg1 == 12) {
                arg0.method2622(arg2 ^ 0xDFD68944);
            } else if (arg1 == 13) {
                int var20 = arg0.method2600((byte) -127);
                this.field2405 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field2405[var21] = arg0.method2566(arg2 - 28094);
                }
            } else if (arg1 == 14) {
                int var18 = arg0.method2600((byte) -126);
                this.field2403 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field2403[var19][0] = arg0.method2600((byte) -128);
                    this.field2403[var19][1] = arg0.method2600((byte) -127);
                }
            } else if (arg1 == 15) {
                arg0.method2566(-2);
            } else if (arg1 == 17) {
                this.field2388 = arg0.method2566(-2);
            } else if (arg1 == 18) {
                int var8 = arg0.method2600((byte) -124);
                this.field2392 = new int[var8];
                this.field2407 = new int[var8];
                this.field2395 = new int[var8];
                this.field2398 = new String[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2407[var9] = arg0.method2622(-539564808);
                    this.field2392[var9] = arg0.method2622(-539564808);
                    this.field2395[var9] = arg0.method2622(-539564808);
                    this.field2398[var9] = arg0.method2574(-1);
                }
            } else if (arg1 == 19) {
                int var16 = arg0.method2600((byte) -128);
                this.field2383 = new int[var16];
                this.field2404 = new int[var16];
                this.field2385 = new String[var16];
                this.field2396 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field2404[var17] = arg0.method2622(-539564808);
                    this.field2383[var17] = arg0.method2622(-539564808);
                    this.field2396[var17] = arg0.method2622(arg2 - 539592900);
                    this.field2385[var17] = arg0.method2574(-1);
                }
            } else if (arg1 == 249) {
                int var10 = arg0.method2600((byte) -125);
                if (this.field2389 == null) {
                    int var11 = class565.method3253(-100, var10);
                    this.field2389 = new class165(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg0.method2600((byte) -123) == 1;
                    int var14 = arg0.method2576((byte) 39);
                    class168 var15;
                    if (var13) {
                        var15 = new class645(arg0.method2574(arg2 ^ 0xFFFF9243));
                    } else {
                        var15 = new class393(arg0.method2622(-539564808));
                    }
                    this.field2389.method1153(var15, (long) var14, -1);
                }
            }
        }
        field2406++;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 288)
    public final void method1193(int arg0) {
        if (arg0 > -59) {
            this.method1192(null, 120, 114);
        }
        field2387++;
        if (this.field2393 == null) {
            this.field2393 = this.field2400;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)V", line = 318)
    public static final void method1194(int arg0, byte arg1) {
        field2401++;
        if (arg0 == -1 || !class214.field2818[arg0]) {
            return;
        }
        class659.field9178.method3167(arg0, (byte) -109);
        class218.field2938[arg0] = null;
        if (arg1 >= -1) {
            method1191(-108, 91, -124, 101, 76, 123);
        }
        class416.field5300[arg0] = null;
        class214.field2818[arg0] = false;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lsl;I)V", line = 351)
    public final void method1195(class461 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2600((byte) -128);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.field2385 = null;
                }
                field2397++;
                return;
            }
            this.method1192(arg0, var3, 28092);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class228 {

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public int field3262 = -1;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "S")
    public static short field3252 = 205;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "F")
    public static float field3253;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "Ltga;")
    private class64 field3268;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Ljava/lang/String;")
    private String field3254;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "Ljava/lang/String;")
    private String field3269;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "[I")
    private int[] field3256;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[I")
    private int[] field3257;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "[I")
    private int[] field3261;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
    private int[] field3263;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "[I")
    private int[] field3266;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "[I")
    private int[] field3267;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "[I")
    private int[] field3270;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "[I")
    private int[] field3273;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field3260;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field3265;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "[[I")
    private int[][] field3255;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "[[I")
    private int[][] field3271;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "[[I")
    private int[][] field3274;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V", line = 28)
    public static final void method1574(int arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        if (arg4 != 8) {
            field3253 = 0.47728136F;
        }
        field3264++;
        if (arg2 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg2) / 2;
        int var6 = arg2;
        String var7 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg2; var9 < arg0; var9++) {
            if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method1574(var6 - 1, arg1, arg2, arg3, arg4);
        method1574(arg0, arg1, var6 + 1, arg3, 8);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lrv;I)V", line = 84)
    public final void method1575(class120 arg0, int arg1) {
        if (arg1 != -1) {
            method1574(119, null, 48, null, 62);
        }
        field3251++;
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method1577(21526, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 111)
    public final void method1576(int arg0) {
        if (this.field3269 == null) {
            this.field3269 = this.field3254;
        }
        if (arg0 != 12326) {
            this.field3270 = null;
        }
        field3258++;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILrv;)V", line = 126)
    private final void method1577(int arg0, int arg1, class120 arg2) {
        if (arg0 != 21526) {
            this.method1575(null, 44);
        }
        field3259++;
        if (arg1 == 1) {
            this.field3254 = arg2.method874(arg0 ^ 0xFFFFABE9);
        } else if (arg1 == 2) {
            this.field3269 = arg2.method874(arg0 - 21527);
        } else if (arg1 == 3) {
            int var22 = arg2.method842(2384);
            this.field3274 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field3274[var23][0] = arg2.method898((byte) -94);
                this.field3274[var23][1] = arg2.method871(23995);
                this.field3274[var23][2] = arg2.method871(arg0 + 2469);
            }
        } else if (arg1 == 4) {
            int var20 = arg2.method842(2384);
            this.field3271 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field3271[var21][0] = arg2.method898((byte) -77);
                this.field3271[var21][1] = arg2.method871(arg0 + 2469);
                this.field3271[var21][2] = arg2.method871(class470.method2786(arg0, 2477));
            }
        } else if (arg1 == 5) {
            arg2.method898((byte) -120);
        } else if (arg1 == 6) {
            arg2.method842(2384);
        } else if (arg1 == 7) {
            arg2.method842(2384);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method842(arg0 ^ 0x5D46);
                return;
            }
            if (arg1 != 10) {
                if (arg1 == 12) {
                    arg2.method871(arg0 + 2469);
                    return;
                }
                if (arg1 != 13) {
                    if (arg1 != 14) {
                        if (arg1 == 15) {
                            arg2.method898((byte) -117);
                            return;
                        }
                        if (arg1 == 17) {
                            this.field3262 = arg2.method898((byte) -111);
                        } else if (arg1 == 18) {
                            int var4 = arg2.method842(arg0 ^ 0x5D46);
                            this.field3261 = new int[var4];
                            this.field3267 = new int[var4];
                            this.field3265 = new String[var4];
                            this.field3257 = new int[var4];
                            for (int var5 = 0; var5 < var4; var5++) {
                                this.field3267[var5] = arg2.method871(23995);
                                this.field3257[var5] = arg2.method871(23995);
                                this.field3261[var5] = arg2.method871(23995);
                                this.field3265[var5] = arg2.method861(true);
                            }
                            return;
                        } else if (arg1 == 19) {
                            int var6 = arg2.method842(2384);
                            this.field3263 = new int[var6];
                            this.field3260 = new String[var6];
                            this.field3256 = new int[var6];
                            this.field3270 = new int[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                this.field3256[var7] = arg2.method871(23995);
                                this.field3263[var7] = arg2.method871(23995);
                                this.field3270[var7] = arg2.method871(23995);
                                this.field3260[var7] = arg2.method861(true);
                            }
                            return;
                        } else if (arg1 == 249) {
                            int var8 = arg2.method842(arg0 - 19142);
                            if (this.field3268 == null) {
                                int var9 = class89.method631((byte) -116, var8);
                                this.field3268 = new class64(var9);
                            }
                            for (int var10 = 0; var10 < var8; var10++) {
                                boolean var11 = arg2.method842(2384) == 1;
                                int var12 = arg2.method833(-3);
                                class540 var13;
                                if (var11) {
                                    var13 = new class533(arg2.method861(true));
                                } else {
                                    var13 = new class633(arg2.method871(23995));
                                }
                                this.field3268.method384((long) var12, var13, false);
                            }
                            return;
                        }
                        return;
                    }
                    int var14 = arg2.method842(arg0 ^ 0x5D46);
                    this.field3255 = new int[var14][2];
                    for (int var15 = 0; var15 < var14; var15++) {
                        this.field3255[var15][0] = arg2.method842(class470.method2786(arg0, 23878));
                        this.field3255[var15][1] = arg2.method842(2384);
                    }
                    return;
                }
                int var16 = arg2.method842(2384);
                this.field3266 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field3266[var17] = arg2.method898((byte) -84);
                }
                return;
            }
            int var18 = arg2.method842(arg0 - 19142);
            this.field3273 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field3273[var19] = arg2.method871(23995);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V", line = 369)
    public static final void method1578(int arg0) {
        class491.field6977 = null;
        class569.field8062 = null;
        field3272++;
        class725.field10177 = null;
        class651.field9158 = null;
        class297.field4483 = null;
        class161.field2373 = null;
        class516.field7384 = null;
        if (arg0 != -7) {
            field3252 = 112;
        }
        class725.field10175 = null;
        class296.field4462 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class221 {

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public int field2833 = -1;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Lba;")
    private class607 field2827;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljava/lang/String;")
    private String field2820;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "Ljava/lang/String;")
    private String field2836;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "[I")
    private int[] field2822;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "[I")
    private int[] field2826;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "[I")
    private int[] field2830;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "[I")
    private int[] field2835;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "[I")
    private int[] field2837;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "[I")
    private int[] field2839;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "[I")
    private int[] field2841;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "[I")
    private int[] field2842;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field2831;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field2840;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "[[I")
    private int[][] field2821;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "[[I")
    private int[][] field2828;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "[[I")
    private int[][] field2834;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lge;Z)V")
    public final void method1415(class551 arg0, boolean arg1) {
        field2823++;
        if (arg1) {
            this.field2828 = null;
        }
        while (true) {
            int var3 = arg0.method3045(-125);
            if (var3 == 0) {
                return;
            }
            this.method1416(13, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILge;I)V")
    private final void method1416(int arg0, class551 arg1, int arg2) {
        field2843++;
        if (arg0 != 13) {
            this.field2840 = null;
        }
        if (arg2 == 1) {
            this.field2820 = arg1.method3055(-881972240);
        } else if (arg2 == 2) {
            this.field2836 = arg1.method3055(-881972240);
        } else if (arg2 == 3) {
            int var4 = arg1.method3045(-125);
            this.field2821 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2821[var5][0] = arg1.method3090(-113);
                this.field2821[var5][1] = arg1.method3048(-4);
                this.field2821[var5][2] = arg1.method3048(-4);
            }
        } else if (arg2 == 4) {
            int var6 = arg1.method3045(-128);
            this.field2834 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2834[var7][0] = arg1.method3090(class426.method2502(arg0, -99));
                this.field2834[var7][1] = arg1.method3048(-4);
                this.field2834[var7][2] = arg1.method3048(-4);
            }
        } else if (arg2 == 5) {
            arg1.method3090(-105);
        } else if (arg2 == 6) {
            arg1.method3045(-125);
        } else if (arg2 == 7) {
            arg1.method3045(-128);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method3045(-126);
                return;
            }
            if (arg2 != 10) {
                if (arg2 == 12) {
                    arg1.method3048(-4);
                    return;
                }
                if (arg2 != 13) {
                    if (arg2 != 14) {
                        if (arg2 == 15) {
                            arg1.method3090(-97);
                            return;
                        }
                        if (arg2 == 17) {
                            this.field2833 = arg1.method3090(arg0 ^ 0xFFFFFF90);
                            return;
                        }
                        if (arg2 == 18) {
                            int var16 = arg1.method3045(-126);
                            this.field2831 = new String[var16];
                            this.field2842 = new int[var16];
                            this.field2826 = new int[var16];
                            this.field2837 = new int[var16];
                            for (int var17 = 0; var17 < var16; var17++) {
                                this.field2842[var17] = arg1.method3048(-4);
                                this.field2826[var17] = arg1.method3048(class426.method2502(arg0, -15));
                                this.field2837[var17] = arg1.method3048(class426.method2502(arg0, -15));
                                this.field2831[var17] = arg1.method3077(class426.method2502(arg0, -20752));
                            }
                        } else if (arg2 == 19) {
                            int var8 = arg1.method3045(arg0 - 139);
                            this.field2835 = new int[var8];
                            this.field2839 = new int[var8];
                            this.field2841 = new int[var8];
                            this.field2840 = new String[var8];
                            for (int var9 = 0; var9 < var8; var9++) {
                                this.field2835[var9] = arg1.method3048(-4);
                                this.field2839[var9] = arg1.method3048(-4);
                                this.field2841[var9] = arg1.method3048(arg0 - 17);
                                this.field2840[var9] = arg1.method3077(-20739);
                            }
                            return;
                        } else if (arg2 == 249) {
                            int var10 = arg1.method3045(-127);
                            if (this.field2827 == null) {
                                int var11 = class468.method2685(var10, false);
                                this.field2827 = new class607(var11);
                            }
                            for (int var12 = 0; var12 < var10; var12++) {
                                boolean var13 = arg1.method3045(-126) == 1;
                                int var14 = arg1.method3043((byte) 49);
                                class108 var15;
                                if (var13) {
                                    var15 = new class63(arg1.method3077(arg0 ^ 0xFFFFAEF0));
                                } else {
                                    var15 = new class147(arg1.method3048(-4));
                                }
                                this.field2827.method3475(-120, var15, (long) var14);
                            }
                            return;
                        }
                        return;
                    }
                    int var18 = arg1.method3045(-126);
                    this.field2828 = new int[var18][2];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field2828[var19][0] = arg1.method3045(-128);
                        this.field2828[var19][1] = arg1.method3045(-126);
                    }
                    return;
                }
                int var20 = arg1.method3045(arg0 ^ 0xFFFFFF8C);
                this.field2822 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field2822[var21] = arg1.method3090(-79);
                }
                return;
            }
            int var22 = arg1.method3045(-125);
            this.field2830 = new int[var22];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2830[var23] = arg1.method3048(-4);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Z")
    public static final boolean method1417(int arg0) {
        field2824++;
        int var1 = 75 / ((41 - arg0) / 56);
        return class50.field673 > 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIBI)V")
    public static final void method1418(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2832++;
        class632 var5 = class641.method3699(-113, 10, arg1);
        var5.method3656(0);
        if (arg3 >= -41) {
            method1418(77, -76, -48, (byte) 6, 126);
        }
        var5.field9197 = arg2;
        var5.field9198 = arg0;
        var5.field9203 = arg4;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
    public static final int method1419(int arg0) {
        field2829++;
        if (arg0 < 93) {
            method1418(89, -43, -93, (byte) -53, 45);
        }
        class58 var1 = class60.field834;
        synchronized (class60.field834) {
            return class60.field834.method319(-109);
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
    public final void method1420(int arg0) {
        if (this.field2836 == null) {
            this.field2836 = this.field2820;
        }
        field2825++;
        if (arg0 != 10) {
            this.method1416(100, null, -92);
        }
    }
}

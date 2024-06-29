import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class517 extends class508 {

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "Lve;")
    private class182 field7615;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Lgk;")
    private class463 field7595;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Leh;")
    private class180 field7598;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private int field7600;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    private int field7612;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    private int field7606;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    private int field7594;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[[F")
    private float[][] field7596;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "[[F")
    private float[][] field7601;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "[[F")
    private float[][] field7613;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "Lhh;")
    private class500 field7617;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Ltp;")
    private class139 field7610;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lcm;")
    private class433 field7593;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Ltp;")
    private class139 field7614;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Lbt;")
    private class88 field7603;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "Laj;")
    private class205 field7611;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Ljr;")
    private class357 field7605;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "Loi;")
    public static class169 field7616 = new class169("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "[I")
    public static int[] field7620 = new int[1];

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "Z")
    public static boolean field7623;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    private int field7602;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    private int field7609;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "Lf;")
    public static class404 field7621;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "[Lf;")
    public static class404[] field7622;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method3066(int arg0) {
        class439.field6113.method1487(3);
        field7597++;
        class268.field3397.method718((byte) -111);
        if (class196.field2535 != null) {
            class196.field2535.method230((byte) 80, class272.field3454);
        }
        class396.field5266.method143(arg0 + 84);
        class272.field3454.setBackground(Color.black);
        class412.field5496 = -1;
        class439.field6113 = class449.method2665(class272.field3454, arg0 ^ 0xFFFFFFFB);
        class268.field3397 = class286.method1736((byte) -90, class272.field3454, true);
        if (arg0 == 0 && class196.field2535 != null) {
            class196.field2535.method227(class272.field3454, false);
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public static void method3067(int arg0) {
        field7616 = null;
        if (arg0 != 0) {
            method3071(-127);
        }
        field7620 = null;
        field7622 = null;
        field7621 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[[ZI)V")
    public final void method3068(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field7604++;
        if (this.field7593 == null || this.field7600 > arg0 + arg4 || arg0 - arg4 > this.field7612) {
            return;
        }
        if (arg1 != 0) {
            this.method3068(96, 114, -119, null, 123);
        }
        if ((arg2 + arg4) < this.field7606 || this.field7594 < arg2 - arg4) {
            return;
        }
        for (int var6 = this.field7606; var6 <= this.field7594; var6++) {
            for (int var7 = this.field7600; var7 <= this.field7612; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg2;
                if (var8 > (-arg4) && var8 < arg4 && var9 > -arg4 && var9 < arg4 && arg3[arg4 + var8][arg4 + var9]) {
                    this.field7595.method2720(20, (int) (this.field7615.method1201(44) * 255.0F) << 24);
                    this.field7595.method2788(null, this.field7614, this.field7610, (byte) -35, null);
                    this.field7595.method2769(0, this.field7593, 4, 0, this.field7609);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(SB)V")
    private final void method3069(short arg0, byte arg1) {
        if (arg1 != -5) {
            this.method3068(98, 75, -30, null, -80);
        }
        if (this.field7595.field6759) {
            this.field7603.method609(arg0, arg1 ^ 0x7A);
        } else {
            this.field7603.method564(arg0, 595249544);
        }
        field7599++;
        this.field7609++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V")
    private final void method3070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7618++;
        long var8 = -1L;
        int var10 = (arg5 << this.field7598.field3193) + arg0;
        int var11 = arg1 + (arg2 << this.field7598.field3193);
        int var12 = this.field7598.method1185(var10, var11);
        if (arg3 != 10333) {
            return;
        }
        if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class508 var13 = this.field7605.method2085(var8, -5423);
            if (var13 != null) {
                this.method3069(((class437) var13).field5990, (byte) -5);
                return;
            }
        }
        short var14 = (short) (this.field7602++);
        if (var8 != -1L) {
            this.field7605.method2096(var8, new class437(var14), (byte) 76);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg1 == 0) {
            var15 = this.field7613[arg6][arg4];
            var16 = this.field7601[arg6][arg4];
            var17 = this.field7596[arg6][arg4];
        } else if (this.field7598.field3198 == arg0 && arg1 == 0) {
            var16 = this.field7601[arg6 + 1][arg4];
            var15 = this.field7613[arg6 + 1][arg4];
            var17 = this.field7596[arg6 + 1][arg4];
        } else if (this.field7598.field3198 == arg0 && this.field7598.field3198 == arg1) {
            var17 = this.field7596[arg6 + 1][arg4 + 1];
            var15 = this.field7613[arg6 + 1][arg4 + 1];
            var16 = this.field7601[arg6 + 1][arg4 + 1];
        } else if (arg0 == 0 && this.field7598.field3198 == arg1) {
            var17 = this.field7596[arg6][arg4 + 1];
            var15 = this.field7613[arg6][arg4 + 1];
            var16 = this.field7601[arg6][arg4 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field7598.field3198;
            float var19 = (float) arg1 / (float) this.field7598.field3198;
            float var20 = this.field7601[arg6][arg4];
            float var21 = this.field7613[arg6][arg4];
            float var22 = this.field7596[arg6][arg4];
            float var23 = this.field7601[arg6 + 1][arg4];
            float var24 = this.field7613[arg6 + 1][arg4];
            float var25 = (this.field7601[arg6][arg4 + 1] - var20) * var18 + var20;
            float var26 = (this.field7613[arg6][arg4 + 1] - var21) * var18 + var21;
            float var27 = (this.field7613[arg6 + 1][arg4 + 1] - var24) * var18 + var24;
            float var28 = this.field7596[arg6 + 1][arg4];
            float var29 = (this.field7596[arg6][arg4 + 1] - var22) * var18 + var22;
            float var30 = (this.field7601[arg6 + 1][arg4 + 1] - var23) * var18 + var23;
            var16 = (var30 - var25) * var19 + var25;
            var15 = (var27 - var26) * var19 + var26;
            float var31 = (this.field7596[arg6 + 1][arg4 + 1] - var28) * var18 + var28;
            var17 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field7615.method1203((byte) -76) - var10);
        float var33 = (float) (this.field7615.method1199((byte) 3) - var12);
        float var34 = (float) (this.field7615.method1202((byte) -68) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field7615.method1194(true);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field7615.method1198((byte) -101);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF48) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field7595.field6759) {
            this.field7611.method1343((float) var10, 1829123664);
            this.field7611.method1343((float) var12, 1829123664);
            this.field7611.method1343((float) var11, 1829123664);
        } else {
            this.field7611.method1338((float) var10, (byte) -23);
            this.field7611.method1338((float) var12, (byte) -91);
            this.field7611.method1338((float) var11, (byte) -51);
        }
        this.field7611.method565(119, var45);
        this.field7611.method565(78, var46);
        this.field7611.method565(122, var47);
        this.field7611.method565(-114, 255);
        this.method3069(var14, (byte) -5);
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public static final void method3071(int arg0) {
        int var1 = 62 % ((arg0 + 43) / 36);
        if (class512.field7538.method844()) {
            class512.field7538.method877(class272.field3454);
            method3066(0);
            class512.field7538.method895(class272.field3454);
            class512.field7538.method919(class272.field3454);
        } else {
            class10.method69(class520.field7690, 5537);
        }
        field7607++;
        class218.method1396((byte) 110);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILeo;)Ljava/lang/String;")
    public static final String method3072(int arg0, class423 arg1) {
        if (arg0 <= 81) {
            return null;
        }
        field7608++;
        if (client.method3037(arg1).method1628((byte) -120) == 0) {
            return null;
        } else if (arg1.field5696 == null || arg1.field5696.trim().length() == 0) {
            return class285.field3633 ? "Hidden-use" : null;
        } else {
            return arg1.field5696;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lgk;Leh;Lve;[I)V")
    public class517(class463 arg0, class180 arg1, class182 arg2, int[] arg3) {
        this.field7615 = arg2;
        this.field7595 = arg0;
        this.field7598 = arg1;
        int var5 = this.field7615.method1194(true) - (arg1.field3198 >> 1);
        this.field7600 = this.field7615.method1203((byte) -76) - var5 >> arg1.field3193;
        this.field7612 = this.field7615.method1203((byte) -76) + var5 >> arg1.field3193;
        this.field7606 = this.field7615.method1202((byte) -60) - var5 >> arg1.field3193;
        this.field7594 = var5 + this.field7615.method1202((byte) -48) >> arg1.field3193;
        int var6 = this.field7612 + 1 - this.field7600;
        int var7 = this.field7594 + 1 - this.field7606;
        this.field7596 = new float[var6 + 1][var7 + 1];
        this.field7601 = new float[var6 + 1][var7 + 1];
        this.field7613 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field7606 + var8;
            if (var24 > 0 && var24 < this.field7598.field3194 - 1) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field7600 + var25;
                    if (var26 > 0 && this.field7598.field3197 - 1 > var26) {
                        int var27 = arg1.method1187(var26 + 1, var24) - arg1.method1187(var26 - 1, var24);
                        int var28 = arg1.method1187(var26, var24 + 1) - arg1.method1187(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field7601[var25][var8] = (float) var27 * var29;
                        this.field7613[var25][var8] = var29 * -256.0F;
                        this.field7596[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field7606; var11 <= this.field7594; var11++) {
            if (var11 >= 0 && arg1.field3194 > var11) {
                for (int var21 = this.field7600; var21 <= this.field7612; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3197) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field2309[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field7612 - this.field7600;
            }
        }
        if (var9 <= 0) {
            this.field7617 = null;
            this.field7610 = null;
            this.field7593 = null;
            this.field7614 = null;
        } else {
            this.field7603 = new class88(var9 * 2);
            this.field7611 = new class205(var9 * 16);
            this.field7605 = new class357(class124.method788(var9, -116));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field7606; var14 <= this.field7594; var14++) {
                if (var14 >= 0 && arg1.field3194 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field7600; var16 <= this.field7612; var16++) {
                        if (var16 >= 0 && arg1.field3197 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field2309[var16][var14];
                            int[] var19 = arg1.field2343[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method3070(var18[var20], var19[var20], var14, 10333, var12, var16, var15);
                                    }
                                } else if (var17 == 3) {
                                    this.method3070(0, 0, var14, 10333, var12, var16, var15);
                                    this.method3070(arg1.field3198, 0, var14, 10333, var12, var16, var15);
                                    this.method3070(0, arg1.field3198, var14, 10333, var12, var16, var15);
                                } else if (var17 == 2) {
                                    this.method3070(arg1.field3198, 0, var14, 10333, var12, var16, var15);
                                    this.method3070(arg1.field3198, arg1.field3198, var14, 10333, var12, var16, var15);
                                    this.method3070(0, 0, var14, 10333, var12, var16, var15);
                                } else if (var17 == 5) {
                                    this.method3070(arg1.field3198, arg1.field3198, var14, 10333, var12, var16, var15);
                                    this.method3070(0, arg1.field3198, var14, 10333, var12, var16, var15);
                                    this.method3070(arg1.field3198, 0, var14, 10333, var12, var16, var15);
                                } else if (var17 == 4) {
                                    this.method3070(0, arg1.field3198, var14, 10333, var12, var16, var15);
                                    this.method3070(0, 0, var14, 10333, var12, var16, var15);
                                    this.method3070(arg1.field3198, arg1.field3198, var14, 10333, var12, var16, var15);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field7612 - this.field7600;
                }
                var12++;
            }
            this.field7593 = this.field7595.method2752(this.field7603.field1223, 1, 5123, false, this.field7603.field1176);
            this.field7617 = this.field7595.method2750(this.field7611.field1176, this.field7611.field1223, false, 255, 16);
            this.field7614 = new class139(this.field7595, this.field7617, 5126, 3, 0);
            this.field7610 = new class139(this.field7595, this.field7617, 5121, 4, 12);
        }
        this.field7605 = null;
        this.field7611 = null;
        this.field7603 = null;
        this.field7601 = this.field7613 = this.field7596 = null;
    }

    static {
        new class169("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field7623 = false;
    }
}

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class506 extends class168 {

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lij;")
    private class424 field7133;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Llaa;")
    private class123 field7132;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Llp;")
    private class395 field7131;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    private int field7135;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    private int field7127;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    private int field7142;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    private int field7141;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "[[F")
    private float[][] field7143;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "[[F")
    private float[][] field7147;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "[[F")
    private float[][] field7136;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    private int field7145;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Liaa;")
    private class497 field7138;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Lia;")
    private class591 field7140;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Ltba;")
    private class165 field7124;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7134;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7148;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    private int field7146;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "[I")
    public static int[] field7144 = new int[6];

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IS)V", line = 11)
    private final void method2950(int arg0, short arg1) {
        field7126++;
        if (Stream.method3798()) {
            this.field7148.method3785(arg1);
        } else {
            this.field7148.method3795(arg1);
        }
        int var3 = 32 % ((77 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 27)
    public static void method2951(int arg0) {
        field7144 = null;
        if (arg0 != -23250) {
            field7128 = -33;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIZIZ)V", line = 37)
    public static final void method2952(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field7137++;
        class65.method603(arg3, arg4, arg0, 0, class411.field5232.length - 1, -96, arg1);
        class647.field8960 = 0;
        if (arg2) {
            field7128 = 93;
        }
        class472.field6327 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 55)
    public static final void method2953(boolean arg0, String arg1, int arg2) {
        if (!arg0) {
            field7144 = null;
        }
        field7125++;
        class37 var3 = class636.method3571(2, arg2, -71);
        var3.method232(-3);
        var3.field578 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII[[Z)V", line = 74)
    public final void method2954(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field7130++;
        if (this.field7138 == null || (arg0 + arg3) < this.field7135 || this.field7127 < (arg0 - arg3) || arg2 != 12212 || arg1 + arg3 < this.field7142 || this.field7141 < arg1 - arg3) {
            return;
        }
        for (int var6 = this.field7142; var6 <= this.field7141; var6++) {
            for (int var7 = this.field7135; var7 <= this.field7127; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if ((-arg3) < var8 && var8 < arg3 && (-arg3) < var9 && var9 < arg3 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field7133.method2417(-113, (byte) ((int) (this.field7132.method939(-11214) * 255.0F)));
                    this.field7133.method2041(0, this.field7140, (byte) 73);
                    this.field7133.method2033(17069, this.field7133.field5706);
                    this.field7133.method2030(0, this.field7146, class662.field9281, this.field7138, false, this.field7145 / 3, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBIII)V", line = 138)
    private final void method2955(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field7139++;
        long var8 = -1L;
        int var10 = (arg4 << this.field7131.field3550) + arg0;
        int var11 = arg6 + (arg5 << this.field7131.field3550);
        int var12 = this.field7131.method1676(var10, true, var11);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class168 var13 = this.field7124.method1160(var8, 121);
            if (var13 != null) {
                this.method2950(-128, ((class273) var13).field3422);
                return;
            }
        }
        short var14 = (short) (this.field7146++);
        if (var8 != -1L) {
            this.field7124.method1153(new class273(var14), var8, -1);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field7143[arg1][arg2];
            var16 = this.field7147[arg1][arg2];
            var17 = this.field7136[arg1][arg2];
        } else if (this.field7131.field3557 == arg0 && arg6 == 0) {
            var15 = this.field7143[arg1 + 1][arg2];
            var17 = this.field7136[arg1 + 1][arg2];
            var16 = this.field7147[arg1 + 1][arg2];
        } else if (this.field7131.field3557 == arg0 && this.field7131.field3557 == arg6) {
            var16 = this.field7147[arg1 + 1][arg2 + 1];
            var15 = this.field7143[arg1 + 1][arg2 + 1];
            var17 = this.field7136[arg1 + 1][arg2 + 1];
        } else if (arg0 == 0 && this.field7131.field3557 == arg6) {
            var16 = this.field7147[arg1][arg2 + 1];
            var15 = this.field7143[arg1][arg2 + 1];
            var17 = this.field7136[arg1][arg2 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field7131.field3557;
            float var19 = (float) arg6 / (float) this.field7131.field3557;
            float var20 = this.field7147[arg1][arg2];
            float var21 = this.field7143[arg1][arg2];
            float var22 = this.field7136[arg1][arg2];
            float var23 = this.field7147[arg1 + 1][arg2];
            float var24 = this.field7143[arg1 + 1][arg2];
            float var25 = (this.field7147[arg1 + 1][arg2 + 1] - var23) * var18 + var23;
            float var26 = this.field7136[arg1 + 1][arg2];
            float var27 = (this.field7147[arg1][arg2 + 1] - var20) * var18 + var20;
            float var28 = (this.field7143[arg1][arg2 + 1] - var21) * var18 + var21;
            float var29 = (this.field7136[arg1][arg2 + 1] - var22) * var18 + var22;
            float var30 = (this.field7143[arg1 + 1][arg2 + 1] - var24) * var18 + var24;
            float var31 = (this.field7136[arg1 + 1][arg2 + 1] - var26) * var18 + var26;
            var15 = (var30 - var28) * var19 + var28;
            var16 = (var25 - var27) * var19 + var27;
            var17 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field7132.method932(-16562) - var10);
        float var33 = (float) (this.field7132.method937(96) - var12);
        float var34 = (float) (this.field7132.method938(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field7132.method935(0);
        if (arg3 < 51) {
            this.field7135 = 88;
        }
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var38 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field7132.method934((byte) -97);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3798()) {
            this.field7134.method3796((float) var10);
            this.field7134.method3796((float) var12);
            this.field7134.method3796((float) var11);
        } else {
            this.field7134.method3794((float) var10);
            this.field7134.method3794((float) var12);
            this.field7134.method3794((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field7133.field5682 == 0) {
            this.field7134.method3792(var47);
            this.field7134.method3792(var46);
            this.field7134.method3792(var45);
        } else {
            this.field7134.method3792(var45);
            this.field7134.method3792(var46);
            this.field7134.method3792(var47);
        }
        this.field7134.method3792(255);
        this.method2950(-35, var14);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lij;Llp;Llaa;[I)V", line = 320)
    public class506(class424 arg0, class395 arg1, class123 arg2, int[] arg3) {
        this.field7133 = arg0;
        this.field7132 = arg2;
        this.field7131 = arg1;
        int var5 = this.field7132.method935(0) - (arg1.field3557 >> 1);
        this.field7135 = this.field7132.method932(-16562) - var5 >> arg1.field3550;
        this.field7127 = var5 + this.field7132.method932(-16562) >> arg1.field3550;
        this.field7142 = this.field7132.method938(0) - var5 >> arg1.field3550;
        this.field7141 = this.field7132.method938(0) + var5 >> arg1.field3550;
        int var6 = this.field7127 + 1 - this.field7135;
        int var7 = this.field7141 + 1 - this.field7142;
        this.field7143 = new float[var6 + 1][var7 + 1];
        this.field7147 = new float[var6 + 1][var7 + 1];
        this.field7136 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field7142 + var8;
            if (var27 > 0 && (this.field7131.field3555 - 1) > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field7135 + var28;
                    if (var29 > 0 && this.field7131.field3561 - 1 > var29) {
                        int var30 = arg1.method1677(var27, (byte) 52, var29 + 1) - arg1.method1677(var27, (byte) 19, var29 - 1);
                        int var31 = arg1.method1677(var27 + 1, (byte) 10, var29) - arg1.method1677(var27 - 1, (byte) 9, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field7147[var28][var8] = (float) var30 * var32;
                        this.field7143[var28][var8] = var32 * -256.0F;
                        this.field7136[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field7142; var10 <= this.field7141; var10++) {
            if (var10 >= 0 && var10 < arg1.field3555) {
                for (int var23 = this.field7135; var23 <= this.field7127; var23++) {
                    if (var23 >= 0 && arg1.field3561 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field5010[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field7145 += 3;
                                    }
                                }
                            } else {
                                this.field7145 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field7127 - this.field7135;
            }
        }
        if (this.field7145 <= 0) {
            this.field7138 = null;
            this.field7140 = null;
        } else {
            this.field7124 = new class165(class565.method3253(-102, this.field7145));
            this.field7138 = this.field7133.method1995(false, (byte) -81);
            this.field7138.method1008(this.field7145, 23833);
            NativeHeapBuffer var11 = this.field7133.method2359(this.field7145 * 16, false, 0);
            this.field7134 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field7138.method1369(-25053, true);
                } while (var12 == null);
                this.field7148 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field7142; var15 <= this.field7141; var15++) {
                    if (var15 >= 0 && var15 < arg1.field3555) {
                        int var16 = 0;
                        for (int var17 = this.field7135; var17 <= this.field7127; var17++) {
                            if (var17 >= 0 && arg1.field3561 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field5010[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field5028[var17][var15];
                                        int[] var21 = arg1.field5006[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2955(var20[var22], var16, var14, (byte) 55, var17, var15, var21[var22]);
                                                    var22++;
                                                    this.method2955(var20[var22], var16, var14, (byte) 89, var17, var15, var21[var22]);
                                                    var22++;
                                                    this.method2955(var20[var22], var16, var14, (byte) 102, var17, var15, var21[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2955(0, var16, var14, (byte) 109, var17, var15, 0);
                                        this.method2955(arg1.field3557, var16, var14, (byte) 119, var17, var15, 0);
                                        this.method2955(0, var16, var14, (byte) 63, var17, var15, arg1.field3557);
                                    } else if (var18 == 2) {
                                        this.method2955(arg1.field3557, var16, var14, (byte) 123, var17, var15, 0);
                                        this.method2955(arg1.field3557, var16, var14, (byte) 57, var17, var15, arg1.field3557);
                                        this.method2955(0, var16, var14, (byte) 83, var17, var15, 0);
                                    } else if (var18 == 5) {
                                        this.method2955(arg1.field3557, var16, var14, (byte) 117, var17, var15, arg1.field3557);
                                        this.method2955(0, var16, var14, (byte) 120, var17, var15, arg1.field3557);
                                        this.method2955(arg1.field3557, var16, var14, (byte) 78, var17, var15, 0);
                                    } else if (var18 == 4) {
                                        this.method2955(0, var16, var14, (byte) 52, var17, var15, arg1.field3557);
                                        this.method2955(0, var16, var14, (byte) 96, var17, var15, 0);
                                        this.method2955(arg1.field3557, var16, var14, (byte) 87, var17, var15, arg1.field3557);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field7127 - this.field7135;
                    }
                    var14++;
                }
                this.field7148.method3793();
                if (this.field7138.method1368(true)) {
                    this.field7134.method3793();
                    this.field7140 = this.field7133.method2042(false, false);
                    this.field7140.method298(16, -118, this.field7146 * 16, var11);
                    break;
                }
                this.field7134.method3797(0);
                this.field7124.method1161(false);
            }
        }
        this.field7124 = null;
        this.field7134 = null;
        this.field7147 = this.field7143 = this.field7136 = null;
        this.field7148 = null;
    }
}

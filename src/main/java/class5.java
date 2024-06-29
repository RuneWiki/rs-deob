import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class5 extends class430 {

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lch;")
    private class38 field35;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Lcj;")
    private class443 field51;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Lwh;")
    private class40 field54;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[[F")
    private float[][] field52;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[[F")
    private float[][] field43;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[[F")
    private float[][] field41;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Lfg;")
    private class436 field42;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lrr;")
    private class33 field36;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Lqp;")
    private class715 field49;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Ljaclib/memory/Stream;")
    private Stream field38;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field50;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "F")
    public static float field53;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBIIIII)V")
    private final void method20(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field45++;
        long var8 = -1L;
        int var10 = arg6 + (arg0 << this.field51.field4674);
        int var11 = (arg2 << this.field51.field4674) + arg3;
        int var12 = this.field51.method2089(26448, var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class430 var13 = this.field49.method4020(var8, (byte) -108);
            if (var13 != null) {
                this.method23(((class219) var13).field3265, true);
                return;
            }
        }
        short var14 = (short) (this.field39++);
        if (arg1 > -41) {
            this.field43 = null;
        }
        if (var8 != -1L) {
            this.field49.method4022(new class219(var14), 122, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg3 == 0) {
            var15 = this.field52[arg4][arg5];
            var16 = this.field41[arg4][arg5];
            var17 = this.field43[arg4][arg5];
        } else if (this.field51.field4675 == arg6 && arg3 == 0) {
            var16 = this.field41[arg4 + 1][arg5];
            var17 = this.field43[arg4 + 1][arg5];
            var15 = this.field52[arg4 + 1][arg5];
        } else if (this.field51.field4675 == arg6 && this.field51.field4675 == arg3) {
            var15 = this.field52[arg4 + 1][arg5 + 1];
            var16 = this.field41[arg4 + 1][arg5 + 1];
            var17 = this.field43[arg4 + 1][arg5 + 1];
        } else if (arg6 == 0 && this.field51.field4675 == arg3) {
            var17 = this.field43[arg4][arg5 + 1];
            var15 = this.field52[arg4][arg5 + 1];
            var16 = this.field41[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field51.field4675;
            float var19 = (float) arg3 / (float) this.field51.field4675;
            float var20 = this.field41[arg4][arg5];
            float var21 = this.field43[arg4][arg5];
            float var22 = this.field52[arg4][arg5];
            float var23 = this.field41[arg4 + 1][arg5];
            float var24 = this.field43[arg4 + 1][arg5];
            float var25 = (this.field43[arg4][arg5 + 1] - var21) * var18 + var21;
            float var26 = (this.field41[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            float var27 = (this.field52[arg4][arg5 + 1] - var22) * var18 + var22;
            float var28 = (this.field43[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            float var29 = this.field52[arg4 + 1][arg5];
            float var30 = (this.field41[arg4][arg5 + 1] - var20) * var18 + var20;
            float var31 = (this.field52[arg4 + 1][arg5 + 1] - var29) * var18 + var29;
            var17 = (var28 - var25) * var19 + var25;
            var16 = (var26 - var30) * var19 + var30;
            var15 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field54.method422((byte) -91) - var10);
        float var33 = (float) (this.field54.method421(127) - var12);
        float var34 = (float) (this.field54.method427(-1) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field54.method425((byte) 90);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var39 + var16 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field54.method420(-1);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method2551()) {
            this.field38.method2557((float) var10);
            this.field38.method2557((float) var12);
            this.field38.method2557((float) var11);
        } else {
            this.field38.method2564((float) var10);
            this.field38.method2564((float) var12);
            this.field38.method2564((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field35.field605 == 0) {
            this.field38.method2555(var47);
            this.field38.method2555(var46);
            this.field38.method2555(var45);
        } else {
            this.field38.method2555(var45);
            this.field38.method2555(var46);
            this.field38.method2555(var47);
        }
        this.field38.method2555(255);
        this.method23(var14, true);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V")
    public static final void method21(boolean arg0) {
        if (arg0) {
            method21(false);
        }
        class716.field10105.method2220(arg0);
        field40++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII[[Z)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field44++;
        if (this.field36 == null || this.field47 > arg0 + arg3 || (arg0 - arg3) > this.field46 || this.field37 > arg1 + arg3 || arg1 - arg3 > this.field55) {
            return;
        }
        if (arg2 != 0) {
            this.field52 = null;
        }
        for (int var6 = this.field37; var6 <= this.field55; var6++) {
            for (int var7 = this.field47; var7 <= this.field46; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if (var8 > (-arg3) && var8 < arg3 && (-arg3) < var9 && arg3 > var9 && arg4[var8 + arg3][arg3 + var9]) {
                    this.field35.method317(-126, (byte) ((int) (this.field54.method429(-1) * 255.0F)));
                    this.field35.method405(this.field42, 0, (byte) 11);
                    this.field35.method265(this.field35.field644, (byte) -108);
                    this.field35.method354(class262.field3771, 0, 127, this.field39, this.field36, this.field48 / 3, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lch;Lcj;Lwh;[I)V")
    public class5(class38 arg0, class443 arg1, class40 arg2, int[] arg3) {
        this.field35 = arg0;
        this.field51 = arg1;
        this.field54 = arg2;
        int var5 = this.field54.method425((byte) 95) - (arg1.field4675 >> 1);
        this.field47 = this.field54.method422((byte) -107) - var5 >> arg1.field4674;
        this.field46 = this.field54.method422((byte) -79) + var5 >> arg1.field4674;
        this.field37 = this.field54.method427(-1) - var5 >> arg1.field4674;
        this.field55 = this.field54.method427(-1) + var5 >> arg1.field4674;
        int var6 = this.field46 + 1 - this.field47;
        int var7 = this.field55 + 1 - this.field37;
        this.field52 = new float[var6 + 1][var7 + 1];
        this.field43 = new float[var6 + 1][var7 + 1];
        this.field41 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field37 + var8;
            if (var27 > 0 && var27 < this.field51.field4672 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = var28 + this.field47;
                    if (var29 > 0 && (this.field51.field4679 - 1) > var29) {
                        int var30 = arg1.method2087(111, var29 + 1, var27) - arg1.method2087(70, var29 - 1, var27);
                        int var31 = arg1.method2087(64, var29, var27 + 1) - arg1.method2087(94, var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field41[var28][var8] = (float) var30 * var32;
                        this.field43[var28][var8] = var32 * -256.0F;
                        this.field52[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field37; var10 <= this.field55; var10++) {
            if (var10 >= 0 && var10 < arg1.field4672) {
                for (int var23 = this.field47; var23 <= this.field46; var23++) {
                    if (var23 >= 0 && arg1.field4679 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field6298[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field48 += 3;
                                    }
                                }
                            } else {
                                this.field48 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field46 - this.field47;
            }
        }
        if (this.field48 <= 0) {
            this.field42 = null;
            this.field36 = null;
        } else {
            this.field49 = new class715(class68.method609(this.field48, (byte) -128));
            this.field36 = this.field35.method366((byte) 83, false);
            this.field36.method174(this.field48, (byte) 39);
            NativeHeapBuffer var11 = this.field35.method351(false, this.field48 * 16, 44);
            this.field38 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field36.method177(true, (byte) -122);
                } while (var12 == null);
                this.field50 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field37; var15 <= this.field55; var15++) {
                    if (var15 >= 0 && var15 < arg1.field4672) {
                        int var16 = 0;
                        for (int var17 = this.field47; var17 <= this.field46; var17++) {
                            if (var17 >= 0 && var17 < arg1.field4679) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field6298[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field6296[var17][var15];
                                        int[] var21 = arg1.field6314[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method20(var17, (byte) -70, var15, var21[var22], var16, var13, var20[var22]);
                                                    var22++;
                                                    this.method20(var17, (byte) -96, var15, var21[var22], var16, var13, var20[var22]);
                                                    var22++;
                                                    this.method20(var17, (byte) -120, var15, var21[var22], var16, var13, var20[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method20(var17, (byte) -125, var15, 0, var16, var13, 0);
                                        this.method20(var17, (byte) -115, var15, 0, var16, var13, arg1.field4675);
                                        this.method20(var17, (byte) -58, var15, arg1.field4675, var16, var13, 0);
                                    } else if (var18 == 2) {
                                        this.method20(var17, (byte) -70, var15, 0, var16, var13, arg1.field4675);
                                        this.method20(var17, (byte) -57, var15, arg1.field4675, var16, var13, arg1.field4675);
                                        this.method20(var17, (byte) -58, var15, 0, var16, var13, 0);
                                    } else if (var18 == 5) {
                                        this.method20(var17, (byte) -96, var15, arg1.field4675, var16, var13, arg1.field4675);
                                        this.method20(var17, (byte) -101, var15, arg1.field4675, var16, var13, 0);
                                        this.method20(var17, (byte) -72, var15, 0, var16, var13, arg1.field4675);
                                    } else if (var18 == 4) {
                                        this.method20(var17, (byte) -113, var15, arg1.field4675, var16, var13, 0);
                                        this.method20(var17, (byte) -105, var15, 0, var16, var13, 0);
                                        this.method20(var17, (byte) -80, var15, arg1.field4675, var16, var13, arg1.field4675);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field46 - this.field47;
                    }
                    var13++;
                }
                this.field50.method2554();
                if (this.field36.method178((byte) -120)) {
                    this.field38.method2554();
                    this.field42 = this.field35.method327(false, false);
                    this.field42.method1102(this.field39 * 16, var11, -81, 16);
                    break;
                }
                this.field38.method2553(0);
                this.field49.method4013(-3);
            }
        }
        this.field49 = null;
        this.field41 = this.field43 = this.field52 = null;
        this.field50 = null;
        this.field38 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(SZ)V")
    private final void method23(short arg0, boolean arg1) {
        if (Stream.method2551()) {
            this.field50.method2561(arg0);
        } else {
            this.field50.method2560(arg0);
        }
        if (!arg1) {
            this.method23((short) 103, true);
        }
        field34++;
    }
}

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class310 extends class65 {

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "Lvha;")
    private class63 field4669;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "Lvt;")
    private class759 field4676;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Lpj;")
    private class38 field4672;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    private int field4666;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    private int field4673;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    private int field4686;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "[[F")
    private float[][] field4670;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "[[F")
    private float[][] field4677;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "[[F")
    private float[][] field4679;

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Lpl;")
    private class616 field4674;

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "Loq;")
    private class743 field4687;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4667;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4675;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "Lfb;")
    private class669 field4678;

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "Ltm;")
    public static class334 field4680 = new class334(22, 4);

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "Lcb;")
    public static class631 field4683 = new class631(67, -1);

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "[Ltda;")
    public static class338[] field4688 = new class338[16];

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIBI)V", line = 3)
    private final void method2043(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4668++;
        long var8 = -1L;
        int var10 = (arg0 << this.field4669.field4962) + arg6;
        int var11 = arg4 + (arg2 << this.field4669.field4962);
        int var12 = this.field4669.method2162(var11, arg5 - 103, var10);
        if ((arg6 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class65 var13 = this.field4674.method3512(true, var8);
            if (var13 != null) {
                this.method2045(((class486) var13).field7028, (byte) -121);
                return;
            }
        }
        short var14 = (short) (this.field4681++);
        if (var8 != -1L) {
            this.field4674.method3516(arg5 ^ 0x97, var8, new class486(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg4 == 0) {
            var15 = this.field4670[arg1][arg3];
            var16 = this.field4679[arg1][arg3];
            var17 = this.field4677[arg1][arg3];
        } else if (this.field4669.field4958 == arg6 && arg4 == 0) {
            var16 = this.field4679[arg1 + 1][arg3];
            var17 = this.field4677[arg1 + 1][arg3];
            var15 = this.field4670[arg1 + 1][arg3];
        } else if (this.field4669.field4958 == arg6 && this.field4669.field4958 == arg4) {
            var17 = this.field4677[arg1 + 1][arg3 + 1];
            var15 = this.field4670[arg1 + 1][arg3 + 1];
            var16 = this.field4679[arg1 + 1][arg3 + 1];
        } else if (arg6 == 0 && this.field4669.field4958 == arg4) {
            var15 = this.field4670[arg1][arg3 + 1];
            var17 = this.field4677[arg1][arg3 + 1];
            var16 = this.field4679[arg1][arg3 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field4669.field4958;
            float var19 = (float) arg4 / (float) this.field4669.field4958;
            float var20 = this.field4677[arg1][arg3];
            float var21 = this.field4679[arg1][arg3];
            float var22 = this.field4670[arg1][arg3];
            float var23 = this.field4677[arg1 + 1][arg3];
            float var24 = this.field4679[arg1 + 1][arg3];
            float var25 = (this.field4677[arg1 + 1][arg3 + 1] - var23) * var18 + var23;
            float var26 = (this.field4679[arg1 + 1][arg3 + 1] - var24) * var18 + var24;
            float var27 = this.field4670[arg1 + 1][arg3];
            float var28 = (this.field4677[arg1][arg3 + 1] - var20) * var18 + var20;
            float var29 = (this.field4679[arg1][arg3 + 1] - var21) * var18 + var21;
            float var30 = (this.field4670[arg1][arg3 + 1] - var22) * var18 + var22;
            var16 = (var26 - var29) * var19 + var29;
            var17 = (var25 - var28) * var19 + var28;
            float var31 = (this.field4670[arg1 + 1][arg3 + 1] - var27) * var18 + var27;
            var15 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field4676.method4228(-106) - var10);
        float var33 = (float) (this.field4676.method4221((byte) -7) - var12);
        float var34 = (float) (this.field4676.method4223((byte) -10) - var11);
        if (arg5 != 104) {
            this.method2044(19, 57, 69, null, -99);
        }
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field4676.method4224((byte) 127);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var39 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4676.method4227(false);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF16) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method2572()) {
            this.field4667.method2576((float) var10);
            this.field4667.method2576((float) var12);
            this.field4667.method2576((float) var11);
        } else {
            this.field4667.method2579((float) var10);
            this.field4667.method2579((float) var12);
            this.field4667.method2579((float) var11);
        }
        if (this.field4672.field628 == 0) {
            this.field4667.method2574(var47);
            this.field4667.method2574(var46);
            this.field4667.method2574(var45);
        } else {
            this.field4667.method2574(var45);
            this.field4667.method2574(var46);
            this.field4667.method2574(var47);
        }
        this.field4667.method2574(255);
        this.method2045(var14, (byte) -122);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZI)V", line = 192)
    public final void method2044(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field4665++;
        if (this.field4687 == null || this.field4666 > arg0 + arg2 || arg0 - arg2 > this.field4671 || this.field4673 > (arg1 + arg2) || arg1 - arg2 > this.field4686) {
            return;
        }
        if (arg4 != 0) {
            this.field4677 = null;
        }
        for (int var6 = this.field4673; var6 <= this.field4686; var6++) {
            for (int var7 = this.field4666; var7 <= this.field4671; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if ((-arg2) < var8 && var8 < arg2 && -arg2 < var9 && var9 < arg2 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field4672.method291((byte) ((int) (this.field4676.method4226(arg4 + 5) * 255.0F)), (byte) 124);
                    this.field4672.method327(this.field4678, 0, 0);
                    this.field4672.method330(19661, this.field4672.field676);
                    this.field4672.method289(this.field4682 / 3, this.field4681, 0, this.field4687, 0, class386.field5775, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(SB)V", line = 253)
    private final void method2045(short arg0, byte arg1) {
        if (Stream.method2572()) {
            this.field4675.method2585(arg0);
        } else {
            this.field4675.method2584(arg0);
        }
        field4684++;
        if (arg1 >= -114) {
            this.method2045((short) 106, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 274)
    public static void method2046(int arg0) {
        field4680 = null;
        field4688 = null;
        field4683 = null;
        if (arg0 < 18) {
            field4680 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lpj;Lvha;Lvt;[I)V", line = 294)
    public class310(class38 arg0, class63 arg1, class759 arg2, int[] arg3) {
        this.field4669 = arg1;
        this.field4676 = arg2;
        this.field4672 = arg0;
        int var5 = this.field4676.method4224((byte) 127) - (arg1.field4958 >> 1);
        this.field4666 = this.field4676.method4228(-117) - var5 >> arg1.field4962;
        this.field4671 = this.field4676.method4228(-113) + var5 >> arg1.field4962;
        this.field4673 = this.field4676.method4223((byte) -42) - var5 >> arg1.field4962;
        this.field4686 = var5 + this.field4676.method4223((byte) -56) >> arg1.field4962;
        int var6 = this.field4671 + 1 - this.field4666;
        int var7 = this.field4686 + 1 - this.field4673;
        this.field4670 = new float[var6 + 1][var7 + 1];
        this.field4677 = new float[var6 + 1][var7 + 1];
        this.field4679 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field4673 + var8;
            if (var27 > 0 && this.field4669.field4960 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field4666 + var28;
                    if (var29 > 0 && (this.field4669.field4956 - 1) > var29) {
                        int var30 = arg1.method2160(-113, var27, var29 + 1) - arg1.method2160(-91, var27, var29 - 1);
                        int var31 = arg1.method2160(-112, var27 + 1, var29) - arg1.method2160(-90, var27 - 1, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field4677[var28][var8] = (float) var30 * var32;
                        this.field4679[var28][var8] = var32 * -256.0F;
                        this.field4670[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field4673; var10 <= this.field4686; var10++) {
            if (var10 >= 0 && arg1.field4960 > var10) {
                for (int var23 = this.field4666; var23 <= this.field4671; var23++) {
                    if (var23 >= 0 && var23 < arg1.field4956) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field984[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field4682 += 3;
                                    }
                                }
                            } else {
                                this.field4682 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field4671 - this.field4666;
            }
        }
        if (this.field4682 > 0) {
            this.field4674 = new class616(class567.method3292(this.field4682, -103));
            this.field4687 = this.field4672.method428(-113, false);
            this.field4687.method924((byte) -74, this.field4682);
            NativeHeapBuffer var11 = this.field4672.method426(false, this.field4682 * 16, 98);
            this.field4667 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field4687.method926(true, -29944);
                } while (var12 == null);
                this.field4675 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field4673; var15 <= this.field4686; var15++) {
                    if (var15 >= 0 && arg1.field4960 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field4666; var17 <= this.field4671; var17++) {
                            if (var17 >= 0 && arg1.field4956 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field984[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field1008[var17][var15];
                                        int[] var21 = arg1.field1001[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2043(var17, var16, var15, var14, var21[var22], (byte) 104, var20[var22]);
                                                    var22++;
                                                    this.method2043(var17, var16, var15, var14, var21[var22], (byte) 104, var20[var22]);
                                                    var22++;
                                                    this.method2043(var17, var16, var15, var14, var21[var22], (byte) 104, var20[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2043(var17, var16, var15, var14, 0, (byte) 104, 0);
                                        this.method2043(var17, var16, var15, var14, 0, (byte) 104, arg1.field4958);
                                        this.method2043(var17, var16, var15, var14, arg1.field4958, (byte) 104, 0);
                                    } else if (var18 == 2) {
                                        this.method2043(var17, var16, var15, var14, 0, (byte) 104, arg1.field4958);
                                        this.method2043(var17, var16, var15, var14, arg1.field4958, (byte) 104, arg1.field4958);
                                        this.method2043(var17, var16, var15, var14, 0, (byte) 104, 0);
                                    } else if (var18 == 5) {
                                        this.method2043(var17, var16, var15, var14, arg1.field4958, (byte) 104, arg1.field4958);
                                        this.method2043(var17, var16, var15, var14, arg1.field4958, (byte) 104, 0);
                                        this.method2043(var17, var16, var15, var14, 0, (byte) 104, arg1.field4958);
                                    } else if (var18 == 4) {
                                        this.method2043(var17, var16, var15, var14, arg1.field4958, (byte) 104, 0);
                                        this.method2043(var17, var16, var15, var14, 0, (byte) 104, 0);
                                        this.method2043(var17, var16, var15, var14, arg1.field4958, (byte) 104, arg1.field4958);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field4671 - this.field4666;
                    }
                    var14++;
                }
                this.field4675.method2573();
                if (this.field4687.method925((byte) 95)) {
                    this.field4667.method2573();
                    this.field4678 = this.field4672.method293(false, 6);
                    this.field4678.method698(-117, var11, 16, this.field4681 * 16);
                    break;
                }
                this.field4667.method2581(0);
                this.field4674.method3517(-80);
            }
        } else {
            this.field4678 = null;
            this.field4687 = null;
        }
        this.field4667 = null;
        this.field4677 = this.field4679 = this.field4670 = null;
        this.field4674 = null;
        this.field4675 = null;
    }
}

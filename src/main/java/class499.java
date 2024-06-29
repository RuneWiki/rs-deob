import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class499 extends class108 {

    @OriginalMember(owner = "client!fda", name = "v", descriptor = "Luca;")
    private class637 field6998;

    @OriginalMember(owner = "client!fda", name = "H", descriptor = "Lnd;")
    private class632 field7010;

    @OriginalMember(owner = "client!fda", name = "F", descriptor = "Lhm;")
    private class460 field7008;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    private int field6992;

    @OriginalMember(owner = "client!fda", name = "u", descriptor = "I")
    private int field6997;

    @OriginalMember(owner = "client!fda", name = "E", descriptor = "I")
    private int field7007;

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!fda", name = "B", descriptor = "[[F")
    private float[][] field7004;

    @OriginalMember(owner = "client!fda", name = "y", descriptor = "[[F")
    private float[][] field7001;

    @OriginalMember(owner = "client!fda", name = "A", descriptor = "[[F")
    private float[][] field7003;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    private int field6990;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "Lup;")
    private class342 field6993;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "Lsp;")
    private class620 field6991;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "Lcb;")
    private class78 field6987;

    @OriginalMember(owner = "client!fda", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6999;

    @OriginalMember(owner = "client!fda", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6996;

    @OriginalMember(owner = "client!fda", name = "x", descriptor = "I")
    private int field7000;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "[I")
    public static int[] field6988 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!fda", name = "s", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!fda", name = "C", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!fda", name = "D", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!fda", name = "G", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "[I")
    public static int[] field7002;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V", line = 4)
    public static void method2839(byte arg0) {
        field6988 = null;
        if (arg0 < -79) {
            field7002 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z", line = 20)
    public static final boolean method2840(byte arg0) {
        field7005++;
        int var1 = -5 % ((arg0 + 42) / 62);
        return class376.field5531 == 0 ? class193.field2780.method179(4) : true;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIIII)V", line = 34)
    private final void method2841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6989++;
        long var8 = -1L;
        int var10 = (arg2 << this.field7008.field7537) + arg5;
        int var11 = (arg0 << this.field7008.field7537) + arg1;
        int var12 = this.field7008.method695(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class108 var13 = this.field6987.method740(0, var8);
            if (var13 != null) {
                this.method2844(((class495) var13).field6942, (byte) -78);
                return;
            }
        }
        short var14 = (short) (this.field7000++);
        if (var8 != -1L) {
            this.field6987.method737(var8, (byte) 92, new class495(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg1 == 0) {
            var15 = this.field7004[arg4][arg6];
            var16 = this.field7003[arg4][arg6];
            var17 = this.field7001[arg4][arg6];
        } else if (this.field7008.field7544 == arg5 && arg1 == 0) {
            var17 = this.field7001[arg4 + 1][arg6];
            var16 = this.field7003[arg4 + 1][arg6];
            var15 = this.field7004[arg4 + 1][arg6];
        } else if (this.field7008.field7544 == arg5 && this.field7008.field7544 == arg1) {
            var17 = this.field7001[arg4 + 1][arg6 + 1];
            var16 = this.field7003[arg4 + 1][arg6 + 1];
            var15 = this.field7004[arg4 + 1][arg6 + 1];
        } else if (arg5 == 0 && this.field7008.field7544 == arg1) {
            var15 = this.field7004[arg4][arg6 + 1];
            var16 = this.field7003[arg4][arg6 + 1];
            var17 = this.field7001[arg4][arg6 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field7008.field7544;
            float var19 = (float) arg1 / (float) this.field7008.field7544;
            float var20 = this.field7001[arg4][arg6];
            float var21 = this.field7004[arg4][arg6];
            float var22 = this.field7003[arg4][arg6];
            float var23 = this.field7001[arg4 + 1][arg6];
            float var24 = this.field7004[arg4 + 1][arg6];
            float var25 = (this.field7001[arg4 + 1][arg6 + 1] - var23) * var18 + var23;
            float var26 = (this.field7001[arg4][arg6 + 1] - var20) * var18 + var20;
            float var27 = (this.field7004[arg4 + 1][arg6 + 1] - var24) * var18 + var24;
            float var28 = (this.field7004[arg4][arg6 + 1] - var21) * var18 + var21;
            float var29 = (this.field7003[arg4][arg6 + 1] - var22) * var18 + var22;
            float var30 = this.field7003[arg4 + 1][arg6];
            float var31 = (this.field7003[arg4 + 1][arg6 + 1] - var30) * var18 + var30;
            var15 = (var27 - var28) * var19 + var28;
            var17 = (var25 - var26) * var19 + var26;
            var16 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field6998.method3681(-27102) - var10);
        float var33 = (float) (this.field6998.method3682(false) - var12);
        float var34 = (float) (this.field6998.method3677(-26984) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        if (arg3 != -3142) {
            return;
        }
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field6998.method3683(0);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6998.method3679(1705);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF3F) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3248()) {
            this.field6999.method3250((float) var10);
            this.field6999.method3250((float) var12);
            this.field6999.method3250((float) var11);
        } else {
            this.field6999.method3247((float) var10);
            this.field6999.method3247((float) var12);
            this.field6999.method3247((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field7010.field9138 == 0) {
            this.field6999.method3242(var47);
            this.field6999.method3242(var46);
            this.field6999.method3242(var45);
        } else {
            this.field6999.method3242(var45);
            this.field6999.method3242(var46);
            this.field6999.method3242(var47);
        }
        this.field6999.method3242(255);
        this.method2844(var14, (byte) -78);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II[[ZII)V", line = 213)
    public final void method2842(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field7006++;
        if (this.field6991 == null || (arg0 + arg1) < this.field6992 || this.field6997 < (arg0 - arg1) || (arg1 + arg4) < this.field7007 || this.field6994 < arg4 - arg1) {
            return;
        }
        for (int var6 = this.field7007; var6 <= this.field6994; var6++) {
            for (int var7 = this.field6992; var7 <= this.field6997; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg4;
                if (var8 > -arg1 && var8 < arg1 && (-arg1) < var9 && arg1 > var9 && arg2[arg1 + var8][var9 + arg1]) {
                    this.field7010.method3606(7, (byte) ((int) (this.field6998.method3678(arg3 - 23151) * 255.0F)));
                    this.field7010.method114(this.field7010.field9175, (byte) -117);
                    this.field7010.method152(0, this.field6993, 84);
                    this.field7010.method134(class12.field118, 0, this.field7000, this.field6990 / 3, this.field6991, 10, 0);
                    return;
                }
            }
        }
        if (arg3 != 0) {
            this.field6994 = 0;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lae;BLjava/awt/Frame;)V", line = 277)
    public static final void method2843(class40 arg0, byte arg1, Frame arg2) {
        while (true) {
            class329 var3 = arg0.method359(arg2, 0);
            while (var3.field4739 == 0) {
                class210.method1342(-54, 10L);
            }
            if (var3.field4739 == 1) {
                field7009++;
                arg2.setVisible(false);
                if (arg1 != 10) {
                    method2840((byte) 123);
                }
                arg2.dispose();
                return;
            }
            class210.method1342(-59, 100L);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(SB)V", line = 306)
    private final void method2844(short arg0, byte arg1) {
        if (arg1 != -78) {
            return;
        }
        if (Stream.method3248()) {
            this.field6996.method3244(arg0);
        } else {
            this.field6996.method3238(arg0);
        }
        field6995++;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lnd;Lhm;Luca;[I)V", line = 331)
    public class499(class632 arg0, class460 arg1, class637 arg2, int[] arg3) {
        this.field6998 = arg2;
        this.field7010 = arg0;
        this.field7008 = arg1;
        int var5 = this.field6998.method3683(0) - (arg1.field7544 >> 1);
        this.field6992 = this.field6998.method3681(-27102) - var5 >> arg1.field7537;
        this.field6997 = this.field6998.method3681(-27102) + var5 >> arg1.field7537;
        this.field7007 = this.field6998.method3677(-26984) - var5 >> arg1.field7537;
        this.field6994 = this.field6998.method3677(-26984) + var5 >> arg1.field7537;
        int var6 = this.field6997 + 1 - this.field6992;
        int var7 = this.field6994 + 1 - this.field7007;
        this.field7004 = new float[var6 + 1][var7 + 1];
        this.field7001 = new float[var6 + 1][var7 + 1];
        this.field7003 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field7007 + var8;
            if (var25 > 0 && this.field7008.field7539 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field6992 + var26;
                    if (var27 > 0 && this.field7008.field7541 - 1 > var27) {
                        int var28 = arg1.method694(var27 + 1, var25) - arg1.method694(var27 - 1, var25);
                        int var29 = arg1.method694(var27, var25 + 1) - arg1.method694(var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field7001[var26][var8] = (float) var28 * var30;
                        this.field7004[var26][var8] = var30 * -256.0F;
                        this.field7003[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field7007; var10 <= this.field6994; var10++) {
            if (var10 >= 0 && arg1.field7539 > var10) {
                for (int var22 = this.field6992; var22 <= this.field6997; var22++) {
                    if (var22 >= 0 && var22 < arg1.field7541) {
                        int var23 = arg3[var9];
                        int[] var24 = arg1.field6624[var22][var10];
                        if (var24 != null && var23 != 0) {
                            this.field6990 += var23 == 1 ? var24.length : 3;
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6997 - this.field6992;
            }
        }
        if (this.field6990 <= 0) {
            this.field6993 = null;
            this.field6991 = null;
        } else {
            this.field6987 = new class78(class243.method1546(-26367, this.field6990));
            this.field6991 = this.field7010.method98(false, (byte) 14);
            this.field6991.method252(93, this.field6990);
            NativeHeapBuffer var11 = this.field7010.method3584(false, false, this.field6990 * 16);
            this.field6999 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field6991.method251(true, (byte) 60);
                } while (var12 == null);
                this.field6996 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field7007; var15 <= this.field6994; var15++) {
                    if (var15 >= 0 && var15 < arg1.field7539) {
                        int var16 = 0;
                        for (int var17 = this.field6992; var17 <= this.field6997; var17++) {
                            if (var17 >= 0 && arg1.field7541 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field6624[var17][var15];
                                int[] var20 = arg1.field6642[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        for (int var21 = 0; var21 < var19.length; var21++) {
                                            this.method2841(var15, var20[var21], var17, -3142, var16, var19[var21], var14);
                                        }
                                    } else if (var18 == 3) {
                                        this.method2841(var15, 0, var17, -3142, var16, 0, var14);
                                        this.method2841(var15, 0, var17, -3142, var16, arg1.field7544, var14);
                                        this.method2841(var15, arg1.field7544, var17, -3142, var16, 0, var14);
                                    } else if (var18 == 2) {
                                        this.method2841(var15, 0, var17, -3142, var16, arg1.field7544, var14);
                                        this.method2841(var15, arg1.field7544, var17, -3142, var16, arg1.field7544, var14);
                                        this.method2841(var15, 0, var17, -3142, var16, 0, var14);
                                    } else if (var18 == 5) {
                                        this.method2841(var15, arg1.field7544, var17, -3142, var16, arg1.field7544, var14);
                                        this.method2841(var15, arg1.field7544, var17, -3142, var16, 0, var14);
                                        this.method2841(var15, 0, var17, -3142, var16, arg1.field7544, var14);
                                    } else if (var18 == 4) {
                                        this.method2841(var15, arg1.field7544, var17, -3142, var16, 0, var14);
                                        this.method2841(var15, 0, var17, -3142, var16, 0, var14);
                                        this.method2841(var15, arg1.field7544, var17, -3142, var16, arg1.field7544, var14);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field6997 - this.field6992;
                    }
                    var14++;
                }
                this.field6996.method3246();
                if (this.field6991.method245(-11359)) {
                    this.field6999.method3246();
                    this.field6993 = this.field7010.method128(16240, false);
                    this.field6993.method1344(-17817, var11, this.field7000 * 16, 16);
                    break;
                }
                this.field6999.method3241(0);
                this.field6987.method739(2048);
            }
        }
        this.field7001 = this.field7004 = this.field7003 = null;
        this.field6987 = null;
        this.field6999 = null;
        this.field6996 = null;
    }
}

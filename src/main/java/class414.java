import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class414 extends class189 {

    @OriginalMember(owner = "client!mha", name = "x", descriptor = "Lwi;")
    private class465 field5835;

    @OriginalMember(owner = "client!mha", name = "G", descriptor = "Laca;")
    private class726 field5844;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "Lsr;")
    private class251 field5832;

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "I")
    private int field5837;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
    private int field5831;

    @OriginalMember(owner = "client!mha", name = "I", descriptor = "I")
    private int field5846;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
    private int field5829;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "[[F")
    private float[][] field5825;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "[[F")
    private float[][] field5821;

    @OriginalMember(owner = "client!mha", name = "H", descriptor = "[[F")
    private float[][] field5845;

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "I")
    private int field5827;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "Lkk;")
    private class188 field5822;

    @OriginalMember(owner = "client!mha", name = "y", descriptor = "Lgfa;")
    private class749 field5836;

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5828;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5826;

    @OriginalMember(owner = "client!mha", name = "J", descriptor = "Lada;")
    private class161 field5847;

    @OriginalMember(owner = "client!mha", name = "F", descriptor = "I")
    private int field5843;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "[[[I")
    public static int[][][] field5833 = new int[2][][];

    @OriginalMember(owner = "client!mha", name = "B", descriptor = "Las;")
    public static class151 field5839 = new class151(1, 2, 2, 0);

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!mha", name = "A", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!mha", name = "C", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!mha", name = "D", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!mha", name = "E", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "[[B")
    public static byte[][] field5823;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IS)V", line = 14)
    private final void method2541(int arg0, short arg1) {
        if (Stream.method3662()) {
            this.field5826.method3654(arg1);
        } else {
            this.field5826.method3655(arg1);
        }
        field5834++;
        if (arg0 != 255) {
            this.field5829 = -35;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V", line = 30)
    public static void method2542(int arg0) {
        field5823 = null;
        field5839 = null;
        if (arg0 == -4) {
            field5833 = null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIII)V", line = 46)
    private final void method2543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5830++;
        long var8 = -1L;
        int var10 = (arg1 << this.field5844.field3929) + arg3;
        int var11 = arg0 + (arg4 << this.field5844.field3929);
        int var12 = this.field5844.method1815(var11, var10, arg5 ^ 0x2D);
        if ((arg3 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class189 var13 = this.field5822.method1180((byte) 26, var8);
            if (var13 != null) {
                this.method2541(255, ((class65) var13).field793);
                return;
            }
        }
        short var14 = (short) (this.field5843++);
        if (var8 != -1L) {
            this.field5822.method1179(var8, new class65(var14), (byte) -26);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg0 == 0) {
            var15 = this.field5845[arg6][arg2];
            var16 = this.field5825[arg6][arg2];
            var17 = this.field5821[arg6][arg2];
        } else if (this.field5844.field3925 == arg3 && arg0 == 0) {
            var16 = this.field5825[arg6 + 1][arg2];
            var15 = this.field5845[arg6 + 1][arg2];
            var17 = this.field5821[arg6 + 1][arg2];
        } else if (this.field5844.field3925 == arg3 && this.field5844.field3925 == arg0) {
            var16 = this.field5825[arg6 + 1][arg2 + 1];
            var17 = this.field5821[arg6 + 1][arg2 + 1];
            var15 = this.field5845[arg6 + 1][arg2 + 1];
        } else if (arg3 == 0 && this.field5844.field3925 == arg0) {
            var15 = this.field5845[arg6][arg2 + 1];
            var16 = this.field5825[arg6][arg2 + 1];
            var17 = this.field5821[arg6][arg2 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field5844.field3925;
            float var19 = (float) arg0 / (float) this.field5844.field3925;
            float var20 = this.field5825[arg6][arg2];
            float var21 = this.field5845[arg6][arg2];
            float var22 = this.field5821[arg6][arg2];
            float var23 = this.field5825[arg6 + 1][arg2];
            float var24 = this.field5845[arg6 + 1][arg2];
            float var25 = (this.field5825[arg6 + 1][arg2 + 1] - var23) * var18 + var23;
            float var26 = (this.field5825[arg6][arg2 + 1] - var20) * var18 + var20;
            float var27 = (this.field5845[arg6][arg2 + 1] - var21) * var18 + var21;
            float var28 = (this.field5821[arg6][arg2 + 1] - var22) * var18 + var22;
            float var29 = (this.field5845[arg6 + 1][arg2 + 1] - var24) * var18 + var24;
            float var30 = this.field5821[arg6 + 1][arg2];
            var15 = (var29 - var27) * var19 + var27;
            float var31 = (this.field5821[arg6 + 1][arg2 + 1] - var30) * var18 + var30;
            var16 = (var25 - var26) * var19 + var26;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field5835.method2772(false) - var10);
        float var33 = (float) (this.field5835.method2774(-30) - var12);
        float var34 = (float) (this.field5835.method2773(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = (float) arg5 / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field5835.method2777(-1);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var39 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field5835.method2778((byte) 105);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF0F) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3662()) {
            this.field5828.method3666((float) var10);
            this.field5828.method3666((float) var12);
            this.field5828.method3666((float) var11);
        } else {
            this.field5828.method3658((float) var10);
            this.field5828.method3658((float) var12);
            this.field5828.method3658((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field5832.field3599 == 0) {
            this.field5828.method3664(var47);
            this.field5828.method3664(var46);
            this.field5828.method3664(var45);
        } else {
            this.field5828.method3664(var45);
            this.field5828.method3664(var46);
            this.field5828.method3664(var47);
        }
        this.field5828.method3664(255);
        this.method2541(255, var14);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)V", line = 226)
    public static final void method2544(boolean arg0) {
        class470.field6672.method788(-14494);
        field5842++;
        class181.field2416.method2189(-16505);
        class606.field8530.method2006(1);
        class612.field8588.method553((byte) 26);
        class231.field3110.method2802(-51);
        class682.field9361.method3418(10);
        class343.field4785.method3526(127);
        class220.field2879.method975(121);
        class130.field1568.method178(-1);
        class472.field6696.method4049(2);
        class200.field2638.method3508(32);
        class48.field564.method1417(-67);
        class569.field8079.method3090(-48);
        class70.field890.method1204(arg0);
        class605.field8497.method157((byte) -54);
        class192.field2556.method1980(true);
        class6.field64.method3773(18028);
        class538.field7542.method206(0);
        class30.field404.method3840(9441);
        class116.field1417.method1354((byte) -19);
        class207.method1271(-1842);
        class260.method1705(65);
        class37.method212(-1);
        class69.method571(arg0);
        class631.method3518(2);
        class180.field2406.method4024(0);
        class272.field3890.method4024(0);
        class378.field5300.method4024(0);
        class723.field10076.method4024(0);
        class241.field3229.method4024(0);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(II[[ZII)V", line = 263)
    public final void method2545(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field5824++;
        if (this.field5836 == null || this.field5837 > (arg1 + arg4) || this.field5831 < arg1 - arg4 || (arg3 + arg4) < this.field5846 || arg3 - arg4 > this.field5829) {
            return;
        }
        for (int var6 = this.field5846; var6 <= this.field5829; var6++) {
            for (int var7 = this.field5837; var7 <= this.field5831; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg3;
                if (-arg4 < var8 && var8 < arg4 && var9 > (-arg4) && var9 < arg4 && arg2[var8 + arg4][var9 + arg4]) {
                    this.field5832.method1608(-34, (byte) ((int) (this.field5835.method2780(-18277) * 255.0F)));
                    this.field5832.method1460(0, 1, this.field5847);
                    this.field5832.method1479(this.field5832.field3634, 16);
                    this.field5832.method1475(this.field5843, this.field5827 / 3, class441.field6289, -17390, 0, this.field5836, 0);
                    return;
                }
            }
        }
        if (arg0 > -53) {
            field5838 = -55;
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(III)Ljava/lang/String;", line = 334)
    public static final String method2546(int arg0, int arg1, int arg2) {
        if (arg0 != -29507) {
            method2546(105, -28, -26);
        }
        field5841++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lsr;Laca;Lwi;[I)V", line = 375)
    public class414(class251 arg0, class726 arg1, class465 arg2, int[] arg3) {
        this.field5835 = arg2;
        this.field5844 = arg1;
        this.field5832 = arg0;
        int var5 = this.field5835.method2777(-1) - (arg1.field3925 >> 1);
        this.field5837 = this.field5835.method2772(false) - var5 >> arg1.field3929;
        this.field5831 = this.field5835.method2772(false) + var5 >> arg1.field3929;
        this.field5846 = this.field5835.method2773(true) - var5 >> arg1.field3929;
        this.field5829 = var5 + this.field5835.method2773(true) >> arg1.field3929;
        int var6 = this.field5831 + 1 - this.field5837;
        int var7 = this.field5829 + 1 - this.field5846;
        this.field5825 = new float[var6 + 1][var7 + 1];
        this.field5821 = new float[var6 + 1][var7 + 1];
        this.field5845 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field5846 + var8;
            if (var27 > 0 && var27 < (this.field5844.field3930 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field5837 + var28;
                    if (var29 > 0 && var29 < (this.field5844.field3935 - 1)) {
                        int var30 = arg1.method1816((byte) 7, var27, var29 + 1) - arg1.method1816((byte) -63, var27, var29 - 1);
                        int var31 = arg1.method1816((byte) -82, var27 + 1, var29) - arg1.method1816((byte) 123, var27 - 1, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field5825[var28][var8] = (float) var30 * var32;
                        this.field5845[var28][var8] = var32 * -256.0F;
                        this.field5821[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field5846; var10 <= this.field5829; var10++) {
            if (var10 >= 0 && var10 < arg1.field3930) {
                for (int var23 = this.field5837; var23 <= this.field5831; var23++) {
                    if (var23 >= 0 && arg1.field3935 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field10135[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field5827 += 3;
                                    }
                                }
                            } else {
                                this.field5827 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field5831 - this.field5837;
            }
        }
        if (this.field5827 > 0) {
            this.field5822 = new class188(class123.method837(118, this.field5827));
            this.field5836 = this.field5832.method1485((byte) 64, false);
            this.field5836.method2157(this.field5827, (byte) 89);
            NativeHeapBuffer var11 = this.field5832.method1620(-16455, this.field5827 * 16, false);
            this.field5828 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field5836.method2154(27599, true);
                } while (var12 == null);
                this.field5826 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field5846; var15 <= this.field5829; var15++) {
                    if (var15 >= 0 && arg1.field3930 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field5837; var17 <= this.field5831; var17++) {
                            if (var17 >= 0 && arg1.field3935 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field10135[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field10139[var17][var15];
                                        int[] var21 = arg1.field10138[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2543(var21[var22], var17, var13, var20[var22], var15, 1, var16);
                                                    var22++;
                                                    this.method2543(var21[var22], var17, var13, var20[var22], var15, 1, var16);
                                                    var22++;
                                                    this.method2543(var21[var22], var17, var13, var20[var22], var15, 1, var16);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2543(0, var17, var13, 0, var15, 1, var16);
                                        this.method2543(0, var17, var13, arg1.field3925, var15, 1, var16);
                                        this.method2543(arg1.field3925, var17, var13, 0, var15, 1, var16);
                                    } else if (var18 == 2) {
                                        this.method2543(0, var17, var13, arg1.field3925, var15, 1, var16);
                                        this.method2543(arg1.field3925, var17, var13, arg1.field3925, var15, 1, var16);
                                        this.method2543(0, var17, var13, 0, var15, 1, var16);
                                    } else if (var18 == 5) {
                                        this.method2543(arg1.field3925, var17, var13, arg1.field3925, var15, 1, var16);
                                        this.method2543(arg1.field3925, var17, var13, 0, var15, 1, var16);
                                        this.method2543(0, var17, var13, arg1.field3925, var15, 1, var16);
                                    } else if (var18 == 4) {
                                        this.method2543(arg1.field3925, var17, var13, 0, var15, 1, var16);
                                        this.method2543(0, var17, var13, 0, var15, 1, var16);
                                        this.method2543(arg1.field3925, var17, var13, arg1.field3925, var15, 1, var16);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field5831 - this.field5837;
                    }
                    var13++;
                }
                this.field5826.method3656();
                if (this.field5836.method2156((byte) 111)) {
                    this.field5828.method3656();
                    this.field5847 = this.field5832.method1429(false, 30519);
                    this.field5847.method1062(var11, (byte) 83, this.field5843 * 16, 16);
                    break;
                }
                this.field5828.method3660(0);
                this.field5822.method1175((byte) 96);
            }
        } else {
            this.field5847 = null;
            this.field5836 = null;
        }
        this.field5828 = null;
        this.field5826 = null;
        this.field5825 = this.field5845 = this.field5821 = null;
        this.field5822 = null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(III[B)[B", line = 637)
    public static final byte[] method2547(int arg0, int arg1, int arg2, byte[] arg3) {
        field5840++;
        byte[] var4 = new byte[arg0];
        class255.method1690(arg3, arg2, var4, 0, arg0);
        return arg1 == 255 ? var4 : null;
    }
}

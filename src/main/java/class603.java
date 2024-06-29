import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class603 extends class69 {

    @OriginalMember(owner = "client!vw", name = "C", descriptor = "Lpq;")
    private class194 field8468;

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "Lsca;")
    private class251 field8461;

    @OriginalMember(owner = "client!vw", name = "x", descriptor = "Lbda;")
    private class222 field8463;

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "I")
    private int field8465;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    private int field8458;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    private int field8449;

    @OriginalMember(owner = "client!vw", name = "G", descriptor = "I")
    private int field8472;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "[[F")
    private float[][] field8459;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "[[F")
    private float[][] field8457;

    @OriginalMember(owner = "client!vw", name = "y", descriptor = "[[F")
    private float[][] field8464;

    @OriginalMember(owner = "client!vw", name = "B", descriptor = "I")
    private int field8467;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "Lgga;")
    private class511 field8451;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "Lun;")
    private class296 field8454;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "Llk;")
    private class638 field8452;

    @OriginalMember(owner = "client!vw", name = "H", descriptor = "Ljda;")
    private class90 field8473;

    @OriginalMember(owner = "client!vw", name = "F", descriptor = "Lvn;")
    private class211 field8471;

    @OriginalMember(owner = "client!vw", name = "E", descriptor = "Lls;")
    private class166 field8470;

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "Lls;")
    private class166 field8460;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "Lqk;")
    public static class1 field8456 = new class1(7, 3);

    @OriginalMember(owner = "client!vw", name = "I", descriptor = "Ljn;")
    public static class134 field8474 = new class134(69, -1);

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    private int field8453;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!vw", name = "A", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!vw", name = "D", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method3483(byte arg0, int arg1) {
        if (arg1 == 37) {
            class46.field494 = 3.0F;
        } else if (arg1 == 50) {
            class46.field494 = 4.0F;
        } else if (arg1 == 75) {
            class46.field494 = 6.0F;
        } else if (arg1 == 100) {
            class46.field494 = 8.0F;
        } else if (arg1 == 200) {
            class46.field494 = 16.0F;
        }
        class83.field1004 = -1;
        field8469++;
        if (arg0 != 117) {
            field8474 = null;
        }
        class83.field1004 = -1;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IBIIIII)V", line = 36)
    private final void method3484(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -26) {
            this.field8465 = -27;
        }
        field8462++;
        long var8 = -1L;
        int var10 = (arg3 << this.field8463.field5825) + arg4;
        int var11 = (arg5 << this.field8463.field5825) + arg2;
        int var12 = this.field8463.method2529(var11, var10, (byte) -128);
        if ((arg4 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class69 var13 = this.field8452.method3669(false, var8);
            if (var13 != null) {
                this.method3485(1, ((class463) var13).field6465);
                return;
            }
        }
        short var14 = (short) (this.field8453++);
        if (var8 != -1L) {
            this.field8452.method3666((byte) 65, var8, new class463(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg2 == 0) {
            var15 = this.field8464[arg0][arg6];
            var16 = this.field8459[arg0][arg6];
            var17 = this.field8457[arg0][arg6];
        } else if (this.field8463.field5818 == arg4 && arg2 == 0) {
            var17 = this.field8457[arg0 + 1][arg6];
            var16 = this.field8459[arg0 + 1][arg6];
            var15 = this.field8464[arg0 + 1][arg6];
        } else if (this.field8463.field5818 == arg4 && this.field8463.field5818 == arg2) {
            var17 = this.field8457[arg0 + 1][arg6 + 1];
            var16 = this.field8459[arg0 + 1][arg6 + 1];
            var15 = this.field8464[arg0 + 1][arg6 + 1];
        } else if (arg4 == 0 && this.field8463.field5818 == arg2) {
            var17 = this.field8457[arg0][arg6 + 1];
            var15 = this.field8464[arg0][arg6 + 1];
            var16 = this.field8459[arg0][arg6 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field8463.field5818;
            float var19 = (float) arg2 / (float) this.field8463.field5818;
            float var20 = this.field8464[arg0][arg6];
            float var21 = this.field8459[arg0][arg6];
            float var22 = this.field8457[arg0][arg6];
            float var23 = this.field8464[arg0 + 1][arg6];
            float var24 = this.field8459[arg0 + 1][arg6];
            float var25 = (this.field8459[arg0 + 1][arg6 + 1] - var24) * var18 + var24;
            float var26 = (this.field8464[arg0 + 1][arg6 + 1] - var23) * var18 + var23;
            float var27 = (this.field8457[arg0][arg6 + 1] - var22) * var18 + var22;
            float var28 = (this.field8464[arg0][arg6 + 1] - var20) * var18 + var20;
            float var29 = this.field8457[arg0 + 1][arg6];
            float var30 = (this.field8459[arg0][arg6 + 1] - var21) * var18 + var21;
            float var31 = (this.field8457[arg0 + 1][arg6 + 1] - var29) * var18 + var29;
            var16 = (var25 - var30) * var19 + var30;
            var15 = (var26 - var28) * var19 + var28;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field8461.method1683(10918) - var10);
        float var33 = (float) (this.field8461.method1687(1110) - var12);
        float var34 = (float) (this.field8461.method1686(false) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field8461.method1685(-56);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var38 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8461.method1684(-1);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFE0) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field8468.field2748) {
            this.field8454.method1943(-21171, (float) var10);
            this.field8454.method1943(-21171, (float) var12);
            this.field8454.method1943(-21171, (float) var11);
        } else {
            this.field8454.method1942((float) var10, arg1 ^ 0x5);
            this.field8454.method1942((float) var12, -120);
            this.field8454.method1942((float) var11, -29);
        }
        this.field8454.method3005(arg1 + 281, var45);
        this.field8454.method3005(255, var46);
        this.field8454.method3005(arg1 ^ 0xFFFFFF19, var47);
        this.field8454.method3005(255, 255);
        this.method3485(1, var14);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IS)V", line = 207)
    private final void method3485(int arg0, short arg1) {
        if (this.field8468.field2748) {
            this.field8451.method2986(arg1, 127);
        } else {
            this.field8451.method2974(arg1, (byte) -128);
        }
        if (arg0 == 1) {
            field8466++;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II[BLjava/io/File;)V", line = 236)
    public static final void method3486(int arg0, int arg1, byte[] arg2, File arg3) throws IOException {
        field8455++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        if (arg1 != 1) {
            return;
        }
        try {
            var4.readFully(arg2, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(III[[ZI)V", line = 255)
    public final void method3487(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field8450++;
        if (this.field8473 == null || arg0 + arg4 < this.field8465 || this.field8458 < (arg0 - arg4) || arg2 + arg4 < this.field8449 || (arg2 - arg4) > this.field8472) {
            return;
        }
        if (arg1 != 26984) {
            this.method3484(121, (byte) -25, 40, 17, -94, 109, 10);
        }
        for (int var6 = this.field8449; var6 <= this.field8472; var6++) {
            for (int var7 = this.field8465; var7 <= this.field8458; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg2;
                if ((-arg4) < var8 && var8 < arg4 && -arg4 < var9 && var9 < arg4 && arg3[arg4 + var8][arg4 + var9]) {
                    this.field8468.method1193((int) (this.field8461.method1688(75) * 255.0F) << 24, arg1 + 16684696);
                    this.field8468.method1248(this.field8470, null, this.field8460, (byte) -32, null);
                    this.field8468.method1211((byte) -120, this.field8467, this.field8473, 4, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V", line = 310)
    public static void method3488(byte arg0) {
        field8456 = null;
        field8474 = null;
        if (arg0 > -18) {
            method3488((byte) 107);
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lpq;Lbda;Lsca;[I)V", line = 325)
    public class603(class194 arg0, class222 arg1, class251 arg2, int[] arg3) {
        this.field8468 = arg0;
        this.field8461 = arg2;
        this.field8463 = arg1;
        int var5 = this.field8461.method1685(-27) - (arg1.field5818 >> 1);
        this.field8465 = this.field8461.method1683(10918) - var5 >> arg1.field5825;
        this.field8458 = var5 + this.field8461.method1683(10918) >> arg1.field5825;
        this.field8449 = this.field8461.method1686(false) - var5 >> arg1.field5825;
        this.field8472 = this.field8461.method1686(false) + var5 >> arg1.field5825;
        int var6 = this.field8458 + 1 - this.field8465;
        int var7 = this.field8472 - (this.field8449 - 1);
        this.field8459 = new float[var6 + 1][var7 + 1];
        this.field8457 = new float[var6 + 1][var7 + 1];
        this.field8464 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field8449;
            if (var25 > 0 && this.field8463.field5826 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field8465 + var26;
                    if (var27 > 0 && (this.field8463.field5827 - 1) > var27) {
                        int var28 = arg1.method2525(var27 + 1, var25, (byte) 114) - arg1.method2525(var27 - 1, var25, (byte) 114);
                        int var29 = arg1.method2525(var27, var25 + 1, (byte) 114) - arg1.method2525(var27, var25 - 1, (byte) 114);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field8464[var26][var8] = (float) var28 * var30;
                        this.field8459[var26][var8] = var30 * -256.0F;
                        this.field8457[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8449; var10 <= this.field8472; var10++) {
            if (var10 >= 0 && arg1.field5826 > var10) {
                for (int var21 = this.field8465; var21 <= this.field8458; var21++) {
                    if (var21 >= 0 && arg1.field5827 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field3061[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field8467 += 3;
                                    }
                                }
                            } else {
                                this.field8467 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8458 - this.field8465;
            }
        }
        if (this.field8467 > 0) {
            this.field8451 = new class511(this.field8467 * 2);
            this.field8454 = new class296(this.field8467 * 16);
            this.field8452 = new class638(class179.method1142(this.field8467, 87));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field8449; var13 <= this.field8472; var13++) {
                if (var13 >= 0 && arg1.field5826 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field8465; var15 <= this.field8458; var15++) {
                        if (var15 >= 0 && arg1.field5827 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field3061[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field3049[var15][var13];
                                    int[] var19 = arg1.field3037[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method3484(var14, (byte) -26, var19[var20], var15, var18[var20], var13, var11);
                                                var20++;
                                                this.method3484(var14, (byte) -26, var19[var20], var15, var18[var20], var13, var11);
                                                var20++;
                                                this.method3484(var14, (byte) -26, var19[var20], var15, var18[var20], var13, var11);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method3484(var14, (byte) -26, 0, var15, 0, var13, var11);
                                    this.method3484(var14, (byte) -26, 0, var15, arg1.field5818, var13, var11);
                                    this.method3484(var14, (byte) -26, arg1.field5818, var15, 0, var13, var11);
                                } else if (var16 == 2) {
                                    this.method3484(var14, (byte) -26, 0, var15, arg1.field5818, var13, var11);
                                    this.method3484(var14, (byte) -26, arg1.field5818, var15, arg1.field5818, var13, var11);
                                    this.method3484(var14, (byte) -26, 0, var15, 0, var13, var11);
                                } else if (var16 == 5) {
                                    this.method3484(var14, (byte) -26, arg1.field5818, var15, arg1.field5818, var13, var11);
                                    this.method3484(var14, (byte) -26, arg1.field5818, var15, 0, var13, var11);
                                    this.method3484(var14, (byte) -26, 0, var15, arg1.field5818, var13, var11);
                                } else if (var16 == 4) {
                                    this.method3484(var14, (byte) -26, arg1.field5818, var15, 0, var13, var11);
                                    this.method3484(var14, (byte) -26, 0, var15, 0, var13, var11);
                                    this.method3484(var14, (byte) -26, arg1.field5818, var15, arg1.field5818, var13, var11);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field8458 - this.field8465;
                }
                var11++;
            }
            this.field8473 = this.field8468.method1205((byte) 11, 5123, this.field8451.field6962, this.field8451.field6979, false);
            this.field8471 = this.field8468.method1266(-3311, 16, this.field8454.field6962, false, this.field8454.field6979);
            this.field8470 = new class166(this.field8471, 5126, 3, 0);
            this.field8460 = new class166(this.field8471, 5121, 4, 12);
        } else {
            this.field8473 = null;
            this.field8460 = null;
            this.field8470 = null;
            this.field8471 = null;
        }
        this.field8454 = null;
        this.field8452 = null;
        this.field8464 = this.field8459 = this.field8457 = null;
        this.field8451 = null;
    }
}

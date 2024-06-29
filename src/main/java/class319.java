import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class319 extends class271 {

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "Z")
    public boolean field5516 = false;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field5532 = 0;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public int field5524 = 0;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    private int field5537 = 0;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "B")
    private byte field5549 = 0;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "B")
    private byte field5547 = 0;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "[I")
    private int[] field5540;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
    public int[] field5510;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "[I")
    public int[] field5520;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "[I")
    public int[] field5534;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    private int[] field5512;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "[S")
    private short[] field5525;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "[S")
    private short[] field5519;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "[S")
    private short[] field5530;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[S")
    private short[] field5529;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "[S")
    private short[] field5526;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[F")
    private float[] field5513;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "[F")
    private float[] field5533;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "[S")
    private short[] field5535;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "[B")
    private byte[] field5539;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "[S")
    private short[] field5511;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "[S")
    private short[] field5527;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "[S")
    private short[] field5523;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "[S")
    private short[] field5515;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[B")
    private byte[] field5508;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "[S")
    private short[] field5518;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Lmb;")
    public class105 field5536;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "Lik;")
    public class258 field5544;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "Lik;")
    private class258 field5551;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "Lik;")
    private class258 field5541;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lik;")
    private class258 field5509;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "Lik;")
    private class258 field5543;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "S")
    private short field5542;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "S")
    private short field5531;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "[S")
    private short[] field5521;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "[I")
    private int[] field5522;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lhi;")
    private static class291 field5514 = new class291(10000);

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lra;")
    private static class319 field5545 = new class319();

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "Lra;")
    private static class319 field5550 = new class319();

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "Lra;")
    private static class319 field5553 = new class319();

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "Lra;")
    private static class319 field5554 = new class319();

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "Lra;")
    private static class319 field5555 = new class319();

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "Lra;")
    private static class319 field5556 = new class319();

    @OriginalMember(owner = "client!ra", name = "yb", descriptor = "[I")
    private static int[] field5565 = new int[1];

    @OriginalMember(owner = "client!ra", name = "ub", descriptor = "[I")
    private static int[] field5561 = new int[1];

    @OriginalMember(owner = "client!ra", name = "Ab", descriptor = "Z")
    private static boolean field5567 = false;

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "F")
    private static float field5558;

    @OriginalMember(owner = "client!ra", name = "sb", descriptor = "F")
    private static float field5559;

    @OriginalMember(owner = "client!ra", name = "tb", descriptor = "F")
    private static float field5560;

    @OriginalMember(owner = "client!ra", name = "vb", descriptor = "F")
    private static float field5562;

    @OriginalMember(owner = "client!ra", name = "wb", descriptor = "F")
    private static float field5563;

    @OriginalMember(owner = "client!ra", name = "xb", descriptor = "F")
    private static float field5564;

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
    private static int field5557;

    @OriginalMember(owner = "client!ra", name = "zb", descriptor = "I")
    private static int field5566;

    @OriginalMember(owner = "client!ra", name = "Bb", descriptor = "I")
    private static int field5568;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lqa;")
    private class129 field5546;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lpj;")
    private class182 field5528;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5538;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "[J")
    private static long[] field5517;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "[[I")
    private int[][] field5548;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "[[I")
    private int[][] field5552;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "()I", line = 5)
    public final int method2221() {
        return this.field5531;
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "()V", line = 11)
    public final void method131() {
        for (int var1 = 0; var1 < this.field5524; var1++) {
            this.field5510[var1] = -this.field5510[var1];
            this.field5534[var1] = -this.field5534[var1];
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZZ)Lw;", line = 23)
    public final class271 method163(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2251(arg0, arg1, arg2, field5556, field5555);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lrb;IJIIIIFF)S", line = 27)
    private final short method2222(class220 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field5540[arg1];
        int var12 = this.field5540[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field5521[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field5517[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field5521[var13] = (short) (this.field5532 + 1);
        field5517[var13] = arg2;
        this.field5519[this.field5532] = (short) arg3;
        this.field5530[this.field5532] = (short) arg4;
        this.field5529[this.field5532] = (short) arg5;
        this.field5526[this.field5532] = (short) arg6;
        this.field5513[this.field5532] = arg7;
        this.field5533[this.field5532] = arg8;
        return (short) (this.field5532++);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([FI)[F", line = 64)
    private static final float[] method2223(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class187.method1246(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIFFF)[F", line = 70)
    private static final float[] method2224(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 143)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        if (this.field5532 == 0) {
            return;
        }
        if (!this.field5536.field1499) {
            this.method2246();
        }
        short var13 = this.field5536.field1503;
        short var14 = this.field5536.field1497;
        short var15 = this.field5536.field1504;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class104.field1496) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class100.field1464) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class265.field4469) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class77.field1092) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class181.field2884[arg0];
            var27 = class181.field2886[arg0];
        }
        if (arg8 > 0L && class213.field3485 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class91.field1273 >= var28 && class91.field1273 <= var29 && class120.field1691 >= var30 && class120.field1691 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field5536.field1498;
                short var37 = this.field5536.field1501;
                short var38 = this.field5536.field1500;
                short var39 = this.field5536.field1502;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class91.field1273 >= var32 && class91.field1273 <= var33 && class120.field1691 >= var34 && class120.field1691 <= var35) {
                    if (this.field4630) {
                        class287.field4855[class303.field5213++] = arg8;
                    } else {
                        if (field5561.length < this.field5532) {
                            field5561 = new int[this.field5532];
                            field5565 = new int[this.field5532];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field5524) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field5537) {
                                        break label118;
                                    }
                                    short var80 = this.field5511[var79];
                                    short var81 = this.field5527[var79];
                                    short var82 = this.field5523[var79];
                                    if (this.method2226(class91.field1273, class120.field1691, field5565[var80], field5565[var81], field5565[var82], field5561[var80], field5561[var81], field5561[var82])) {
                                        class287.field4855[class303.field5213++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field5510[var59];
                            int var61 = this.field5520[var59];
                            int var62 = this.field5534[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field5540[var59];
                            int var76 = this.field5540[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field5521[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field5561[var78] = var73;
                                field5565[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class217.field3551;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method2234();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(SS)V", line = 421)
    public final void method2225(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5537; var3++) {
            if (this.field5515[var3] == arg0) {
                this.field5515[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class181.field2878.method1778(255, arg0 & 0xFFFF);
            var5 = class181.field2878.method1775(arg0 & 0xFFFF, 80);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class181.field2878.method1778(255, arg1 & 0xFFFF);
            var7 = class181.field2878.method1775(arg1 & 0xFFFF, 121);
        }
        if (var4 != var6 || var5 != var7) {
            this.field5551.field4423 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)Z", line = 455)
    private final boolean method2226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Z", line = 474)
    public final boolean method497() {
        return this.field5516 && this.field5510 != null && this.field5519 != null;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()I", line = 478)
    public final int method154() {
        if (!this.field5536.field1499) {
            this.method2246();
        }
        return this.field5536.field1502;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V", line = 484)
    public final void method2227(int arg0) {
        this.field5542 = (short) arg0;
        this.field5551.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Lv;", line = 490)
    public final class73 method495(int arg0, int arg1, int arg2) {
        this.field5516 = false;
        if (this.field5546 != null) {
            this.field5519 = this.field5546.field1969;
            this.field5530 = this.field5546.field1970;
            this.field5529 = this.field5546.field1968;
            this.field5526 = this.field5546.field1967;
            this.field5546 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lv;IIIZ)V", line = 504)
    public final void method494(class73 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class319 var6 = (class319) arg0;
        if (this.field5537 == 0 || var6.field5537 == 0) {
            return;
        }
        int var7 = var6.field5524;
        int[] var8 = var6.field5510;
        int[] var9 = var6.field5520;
        int[] var10 = var6.field5534;
        short[] var11 = var6.field5519;
        short[] var12 = var6.field5530;
        short[] var13 = var6.field5529;
        short[] var14 = var6.field5526;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field5546 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field5546.field1969;
            var16 = this.field5546.field1970;
            var17 = this.field5546.field1968;
            var18 = this.field5546.field1967;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5546 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5546.field1969;
            var20 = var6.field5546.field1970;
            var21 = var6.field5546.field1968;
            var22 = var6.field5546.field1967;
        }
        int[] var23 = var6.field5540;
        short[] var24 = var6.field5521;
        if (!var6.field5536.field1499) {
            var6.method2246();
        }
        short var25 = var6.field5536.field1497;
        short var26 = var6.field5536.field1504;
        short var27 = var6.field5536.field1498;
        short var28 = var6.field5536.field1501;
        short var29 = var6.field5536.field1500;
        short var30 = var6.field5536.field1502;
        for (int var31 = 0; var31 < this.field5524; var31++) {
            int var32 = this.field5520[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field5510[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5534[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5540[var31];
                        int var37 = this.field5540[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5521[var38] - 1;
                            if (var35 == -1 || this.field5526[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field5546 = new class129();
                                            var15 = this.field5546.field1969 = class22.method183(this.field5519, (byte) -94);
                                            var16 = this.field5546.field1970 = class22.method183(this.field5530, (byte) -94);
                                            var17 = this.field5546.field1968 = class22.method183(this.field5529, (byte) -94);
                                            var18 = this.field5546.field1967 = class22.method183(this.field5526, (byte) -94);
                                        }
                                        if (var19 == null) {
                                            class129 var44 = var6.field5546 = new class129();
                                            var19 = var44.field1969 = class22.method183(var11, (byte) -94);
                                            var20 = var44.field1970 = class22.method183(var12, (byte) -94);
                                            var21 = var44.field1968 = class22.method183(var13, (byte) -94);
                                            var22 = var44.field1967 = class22.method183(var14, (byte) -94);
                                        }
                                        short var45 = this.field5519[var35];
                                        short var46 = this.field5530[var35];
                                        short var47 = this.field5529[var35];
                                        short var48 = this.field5526[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field5540[var31];
                                        int var58 = this.field5540[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field5521[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "()V", line = 743)
    public final void method132() {
        for (int var1 = 0; var1 < this.field5524; var1++) {
            int var2 = this.field5534[var1];
            this.field5534[var1] = this.field5510[var1];
            this.field5510[var1] = -var2;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()V", line = 762)
    public final void method161() {
        for (int var1 = 0; var1 < this.field5524; var1++) {
            int var2 = this.field5510[var1];
            this.field5510[var1] = this.field5534[var1];
            this.field5534[var1] = -var2;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILra;[[I[[IIII)V", line = 777)
    public final void method2228(int arg0, int arg1, class319 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field5536.field1499) {
            arg2.method2246();
        }
        int var9 = arg2.field5536.field1498 + arg5;
        int var10 = arg2.field5536.field1501 + arg5;
        int var11 = arg2.field5536.field1500 + arg7;
        int var12 = arg2.field5536.field1502 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field5524; var17++) {
                int var18 = this.field5510[var17] + arg5;
                int var19 = this.field5534[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field5520[var17] = this.field5520[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field5536.field1497;
            for (int var28 = 0; var28 < this.field5524; var28++) {
                int var29 = (this.field5520[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field5510[var28] + arg5;
                    int var31 = this.field5534[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field5520[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1866(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field5536.field1504 - arg2.field5536.field1497;
            for (int var42 = 0; var42 < this.field5524; var42++) {
                int var43 = this.field5510[var42] + arg5;
                int var44 = this.field5534[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field5520[var42] = var51 + this.field5520[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field5536.field1504 - arg2.field5536.field1497;
            for (int var53 = 0; var53 < this.field5524; var53++) {
                int var54 = this.field5510[var53] + arg5;
                int var55 = this.field5534[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field5520[var53] = ((this.field5520[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field5544.field4423 = false;
        this.field5536.field1499 = false;
    }

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "()V", line = 974)
    public final void method2229() {
        if (this.field5519 == null) {
            this.method161();
            return;
        }
        for (int var1 = 0; var1 < this.field5524; var1++) {
            int var2 = this.field5510[var1];
            this.field5510[var1] = this.field5534[var1];
            this.field5534[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5532; var3++) {
            short var4 = this.field5519[var3];
            this.field5519[var3] = this.field5529[var3];
            this.field5529[var3] = (short) (-var4);
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
        if (this.field5541 != null) {
            this.field5541.field4423 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V", line = 1012)
    public final void method2230(int arg0) {
        this.field5531 = (short) arg0;
        if (this.field5541 != null) {
            this.field5541.field4423 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(SS)V", line = 1025)
    public final void method2231(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5537; var3++) {
            if (this.field5535[var3] == arg0) {
                this.field5535[var3] = arg1;
            }
        }
        this.field5551.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZZZZZZ)V", line = 1037)
    public final void method2232(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field5549 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field5532 != 0) {
            if (arg6) {
                boolean var8 = !this.field5551.field4423 && (arg1 || arg2 && !class81.field1131);
                this.method2238(false, !this.field5544.field4423 && arg0, var8, this.field5541 != null && !this.field5541.field4423 && arg2, !this.field5509.field4423 && arg3);
                if (!this.field5543.field4423 && arg4 && arg1) {
                    this.method2239();
                }
            }
            if (arg0) {
                if (this.field5544.field4423) {
                    if (!this.field5536.field1499) {
                        this.method2246();
                    }
                    this.field5510 = null;
                    this.field5520 = null;
                    this.field5534 = null;
                    this.field5521 = null;
                    this.field5540 = null;
                } else {
                    this.field5547 = (byte) (this.field5547 | 0x1);
                }
            }
            if (arg1) {
                if (this.field5551.field4423) {
                    this.field5535 = null;
                    this.field5539 = null;
                } else {
                    this.field5547 = (byte) (this.field5547 | 0x2);
                }
            }
            if (arg2 && class81.field1131) {
                if (this.field5541.field4423) {
                    this.field5519 = null;
                    this.field5530 = null;
                    this.field5529 = null;
                    this.field5526 = null;
                } else {
                    this.field5547 = (byte) (this.field5547 | 0x4);
                }
            }
            if (arg3) {
                if (this.field5509.field4423) {
                    this.field5513 = null;
                    this.field5533 = null;
                } else {
                    this.field5547 = (byte) (this.field5547 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field5543.field4423 && this.field5551.field4423) {
                    this.field5511 = null;
                    this.field5527 = null;
                    this.field5523 = null;
                } else {
                    this.field5547 = (byte) (this.field5547 | 0x10);
                }
            }
            if (arg5) {
                this.field5512 = null;
                this.field5508 = null;
                this.field5552 = (int[][]) null;
                this.field5548 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 4537)
    private class319() {
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lrb;IIZ)V", line = 4539)
    public class319(class220 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field3614];
        this.field5540 = new int[arg0.field3606 + 1];
        for (int var6 = 0; var6 < arg0.field3614; var6++) {
            if ((arg0.field3617 == null || arg0.field3617[var6] != 2) && (arg0.field3604 == null || arg0.field3604[var6] == -1 || !class181.field2878.method1783(83, arg0.field3604[var6] & 0xFFFF))) {
                var5[this.field5537++] = var6;
                this.field5540[arg0.field3588[var6]]++;
                this.field5540[arg0.field3618[var6]]++;
                this.field5540[arg0.field3575[var6]]++;
            }
        }
        long[] var7 = new long[this.field5537];
        for (int var8 = 0; var8 < this.field5537; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field3604 != null) {
                var14 = arg0.field3604[var9];
                if (var14 != -1) {
                    var12 = class181.field2878.method1777(var14 & 0xFFFF, 127);
                    var13 = class181.field2878.method1781(var14 & 0xFFFF, 255);
                }
            }
            boolean var15 = arg0.field3616 != null && arg0.field3616[var9] != 0 || var14 != -1 && !class181.field2878.method1776(var14 & 0xFFFF, false);
            if ((arg3 || var15) && arg0.field3580 != null) {
                var10 += arg0.field3580[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class146.method919(var5, var7, 0);
        this.field5524 = arg0.field3606;
        this.field5510 = arg0.field3589;
        this.field5520 = arg0.field3579;
        this.field5534 = arg0.field3603;
        this.field5512 = arg0.field3619;
        this.field5525 = arg0.field3615;
        int var20 = this.field5537 * 3;
        this.field5519 = new short[var20];
        this.field5530 = new short[var20];
        this.field5529 = new short[var20];
        this.field5526 = new short[var20];
        this.field5513 = new float[var20];
        this.field5533 = new float[var20];
        this.field5535 = new short[this.field5537];
        this.field5539 = new byte[this.field5537];
        this.field5511 = new short[this.field5537];
        this.field5527 = new short[this.field5537];
        this.field5523 = new short[this.field5537];
        this.field5515 = new short[this.field5537];
        if (arg0.field3609 != null) {
            this.field5508 = new byte[this.field5537];
        }
        if (arg0.field3574 != null) {
            this.field5518 = new short[this.field5537];
        }
        this.field5536 = new class105();
        this.field5544 = new class258();
        this.field5551 = new class258();
        if (class81.field1131) {
            this.field5541 = new class258();
        }
        this.field5509 = new class258();
        this.field5543 = new class258();
        this.field5542 = (short) arg1;
        this.field5531 = (short) arg2;
        this.field5521 = new short[var20];
        field5517 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field3606; var22++) {
            int var23 = this.field5540[var22];
            this.field5540[var22] = var21;
            var21 += var23;
        }
        this.field5540[arg0.field3606] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field3590 != null) {
            int var28 = arg0.field3613;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field5537; var36++) {
                int var37 = var5[var36];
                if (arg0.field3590[var37] != -1) {
                    int var38 = arg0.field3590[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field3588[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field3618[var37];
                        } else {
                            var40 = arg0.field3575[var37];
                        }
                        int var41 = arg0.field3589[var40];
                        int var42 = arg0.field3579[var40];
                        int var43 = arg0.field3603[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field3594[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field3587[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field3597[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field3587[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field3597[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field3582[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field3587[var44] / 1024.0F;
                        var49 = (float) arg0.field3597[var44] / 1024.0F;
                        var48 = (float) arg0.field3582[var44] / 1024.0F;
                    }
                    var27[var44] = method2224(arg0.field3610[var44], arg0.field3596[var44], arg0.field3586[var44], arg0.field3600[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field5537; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field3577[var51] & 0xFFFF;
            short var53;
            if (arg0.field3604 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field3604[var51];
            }
            int var54;
            if (arg0.field3590 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field3590[var51];
            }
            int var55;
            if (arg0.field3616 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field3616[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field3594[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field3588[var51];
                        int var67 = arg0.field3618[var51];
                        int var68 = arg0.field3575[var51];
                        short var69 = arg0.field3610[var54];
                        short var70 = arg0.field3596[var54];
                        short var71 = arg0.field3586[var54];
                        float var72 = (float) arg0.field3589[var69];
                        float var73 = (float) arg0.field3579[var69];
                        float var74 = (float) arg0.field3603[var69];
                        float var75 = (float) arg0.field3589[var70] - var72;
                        float var76 = (float) arg0.field3579[var70] - var73;
                        float var77 = (float) arg0.field3603[var70] - var74;
                        float var78 = (float) arg0.field3589[var71] - var72;
                        float var79 = (float) arg0.field3579[var71] - var73;
                        float var80 = (float) arg0.field3603[var71] - var74;
                        float var81 = (float) arg0.field3589[var66] - var72;
                        float var82 = (float) arg0.field3579[var66] - var73;
                        float var83 = (float) arg0.field3603[var66] - var74;
                        float var84 = (float) arg0.field3589[var67] - var72;
                        float var85 = (float) arg0.field3579[var67] - var73;
                        float var86 = (float) arg0.field3603[var67] - var74;
                        float var87 = (float) arg0.field3589[var68] - var72;
                        float var88 = (float) arg0.field3579[var68] - var73;
                        float var89 = (float) arg0.field3603[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field3588[var51];
                        int var102 = arg0.field3618[var51];
                        int var103 = arg0.field3575[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field3585[var54];
                        float var109 = (float) arg0.field3598[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field3582[var54] & 0xFFFF) / 1024.0F;
                            method2237(arg0.field3589[var101], arg0.field3579[var101], arg0.field3603[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field5559;
                            var57 = field5564;
                            method2237(arg0.field3589[var102], arg0.field3579[var102], arg0.field3603[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field5559;
                            var59 = field5564;
                            method2237(arg0.field3589[var103], arg0.field3579[var103], arg0.field3603[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field5559;
                            var61 = field5564;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field3611[var54] / 256.0F;
                            float var113 = (float) arg0.field3592[var54] / 256.0F;
                            int var114 = arg0.field3589[var102] - arg0.field3589[var101];
                            int var115 = arg0.field3579[var102] - arg0.field3579[var101];
                            int var116 = arg0.field3603[var102] - arg0.field3603[var101];
                            int var117 = arg0.field3589[var103] - arg0.field3589[var101];
                            int var118 = arg0.field3579[var103] - arg0.field3579[var101];
                            int var119 = arg0.field3603[var103] - arg0.field3603[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field3587[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field3597[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field3582[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method2243(var126, var127, var128);
                            method2248(arg0.field3589[var101], arg0.field3579[var101], arg0.field3603[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field5558;
                            var57 = field5563;
                            method2248(arg0.field3589[var102], arg0.field3579[var102], arg0.field3603[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field5558;
                            var59 = field5563;
                            method2248(arg0.field3589[var103], arg0.field3579[var103], arg0.field3603[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field5558;
                            var61 = field5563;
                        } else if (var65 == 3) {
                            method2236(arg0.field3589[var101], arg0.field3579[var101], arg0.field3603[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field5562;
                            var57 = field5560;
                            method2236(arg0.field3589[var102], arg0.field3579[var102], arg0.field3603[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field5562;
                            var59 = field5560;
                            method2236(arg0.field3589[var103], arg0.field3579[var103], arg0.field3603[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field5562;
                            var61 = field5560;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1524();
            byte var129;
            if (arg0.field3617 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field3617[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field3588[var51];
                class156 var133 = arg0.field3595[var132];
                this.field5511[var50] = this.method2222(arg0, var132, var130, var133.field2481, var133.field2477, var133.field2479, var133.field2485, var56, var57);
                int var134 = arg0.field3618[var51];
                class156 var135 = arg0.field3595[var134];
                this.field5527[var50] = this.method2222(arg0, var134, (long) var62 + var130, var135.field2481, var135.field2477, var135.field2479, var135.field2485, var58, var59);
                int var136 = arg0.field3575[var51];
                class156 var137 = arg0.field3595[var136];
                this.field5523[var50] = this.method2222(arg0, var136, (long) var63 + var130, var137.field2481, var137.field2477, var137.field2479, var137.field2485, var60, var61);
            } else if (var129 == 1) {
                class25 var138 = arg0.field3583[var51];
                long var139 = (long) ((var54 << 2) + (var138.field428 > 0 ? 1024 : 2048) + (var138.field431 + 256 << 12) + (var138.field429 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field5511[var50] = this.method2222(arg0, arg0.field3588[var51], var139, var138.field428, var138.field431, var138.field429, 0, var56, var57);
                this.field5527[var50] = this.method2222(arg0, arg0.field3618[var51], (long) var62 + var139, var138.field428, var138.field431, var138.field429, 0, var58, var59);
                this.field5523[var50] = this.method2222(arg0, arg0.field3575[var51], (long) var63 + var139, var138.field428, var138.field431, var138.field429, 0, var60, var61);
            }
            if (arg0.field3604 == null) {
                this.field5515[var50] = -1;
            } else {
                this.field5515[var50] = arg0.field3604[var51];
            }
            if (this.field5508 != null) {
                this.field5508[var50] = (byte) arg0.field3609[var51];
            }
            this.field5535[var50] = arg0.field3577[var51];
            if (arg0.field3616 != null) {
                this.field5539[var50] = arg0.field3616[var51];
            }
            if (arg0.field3574 != null) {
                this.field5518[var50] = arg0.field3574[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field5537; var143++) {
            short var144 = this.field5515[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field5522 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field5537; var147++) {
            short var148 = this.field5515[var147];
            if (var146 != var148) {
                this.field5522[var145++] = var147;
                var146 = var148;
            }
        }
        this.field5522[var145] = this.field5537;
        field5517 = null;
        this.field5519 = method2250(this.field5519, this.field5532);
        this.field5530 = method2250(this.field5530, this.field5532);
        this.field5529 = method2250(this.field5529, this.field5532);
        this.field5526 = method2250(this.field5526, this.field5532);
        this.field5513 = method2223(this.field5513, this.field5532);
        this.field5533 = method2223(this.field5533, this.field5532);
    }

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "()V", line = 1137)
    public final void method2233() {
        if (this.field5519 == null) {
            this.method131();
            return;
        }
        for (int var1 = 0; var1 < this.field5524; var1++) {
            this.field5510[var1] = -this.field5510[var1];
            this.field5534[var1] = -this.field5534[var1];
        }
        for (int var2 = 0; var2 < this.field5532; var2++) {
            this.field5519[var2] = (short) (-this.field5519[var2]);
            this.field5529[var2] = (short) (-this.field5529[var2]);
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
        if (this.field5541 != null) {
            this.field5541.field4423 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "()V", line = 1171)
    private final void method2234() {
        GL var1 = class217.field3551;
        if (this.field5537 == 0) {
            return;
        }
        if (this.field5549 != 0) {
            this.method2238(true, !this.field5544.field4423 && (this.field5549 & 0x1) != 0, !this.field5551.field4423 && (this.field5549 & 0x2) != 0, this.field5541 != null && !this.field5541.field4423 && (this.field5549 & 0x4) != 0, false);
        }
        this.method2238(false, !this.field5544.field4423, !this.field5551.field4423, this.field5541 != null && !this.field5541.field4423, !this.field5509.field4423);
        if (!this.field5543.field4423) {
            this.method2239();
        }
        if (this.field5547 != 0) {
            if ((this.field5547 & 0x1) != 0) {
                this.field5510 = null;
                this.field5520 = null;
                this.field5534 = null;
                this.field5521 = null;
                this.field5540 = null;
            }
            if ((this.field5547 & 0x2) != 0) {
                this.field5535 = null;
                this.field5539 = null;
            }
            if ((this.field5547 & 0x4) != 0) {
                this.field5519 = null;
                this.field5530 = null;
                this.field5529 = null;
                this.field5526 = null;
            }
            if ((this.field5547 & 0x8) != 0) {
                this.field5513 = null;
                this.field5533 = null;
            }
            if ((this.field5547 & 0x10) != 0) {
                this.field5511 = null;
                this.field5527 = null;
                this.field5523 = null;
            }
            this.field5547 = 0;
        }
        class182 var2 = null;
        if (this.field5544.field4433 != null) {
            this.field5544.field4433.method1208();
            var2 = this.field5544.field4433;
            var1.glVertexPointer(3, 5126, this.field5544.field4426, (long) this.field5544.field4432);
        }
        if (this.field5551.field4433 != null) {
            if (this.field5551.field4433 != var2) {
                this.field5551.field4433.method1208();
                var2 = this.field5551.field4433;
            }
            var1.glColorPointer(4, 5121, this.field5551.field4426, (long) this.field5551.field4432);
        }
        if (class81.field1131 && this.field5541.field4433 != null) {
            if (this.field5541.field4433 != var2) {
                this.field5541.field4433.method1208();
                var2 = this.field5541.field4433;
            }
            var1.glNormalPointer(5126, this.field5541.field4426, (long) this.field5541.field4432);
        }
        if (this.field5509.field4433 != null) {
            if (this.field5509.field4433 != var2) {
                this.field5509.field4433.method1208();
                class182 var3 = this.field5509.field4433;
            }
            var1.glTexCoordPointer(2, 5126, this.field5509.field4426, (long) this.field5509.field4432);
        }
        if (this.field5543.field4433 != null) {
            this.field5543.field4433.method1211();
        }
        if (this.field5544.field4433 == null || this.field5551.field4433 == null || class81.field1131 && this.field5541.field4433 == null || this.field5509.field4433 == null) {
            if (class217.field3526) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field5544.field4433 == null) {
                this.field5544.field4428.position(this.field5544.field4432);
                var1.glVertexPointer(3, 5126, this.field5544.field4426, this.field5544.field4428);
            }
            if (this.field5551.field4433 == null) {
                this.field5551.field4428.position(this.field5551.field4432);
                var1.glColorPointer(4, 5121, this.field5551.field4426, this.field5551.field4428);
            }
            if (class81.field1131 && this.field5541.field4433 == null) {
                this.field5541.field4428.position(this.field5541.field4432);
                var1.glNormalPointer(5126, this.field5541.field4426, this.field5541.field4428);
            }
            if (this.field5509.field4433 == null) {
                this.field5509.field4428.position(this.field5509.field4432);
                var1.glTexCoordPointer(2, 5126, this.field5509.field4426, this.field5509.field4428);
            }
        }
        if (this.field5543.field4433 == null && class217.field3526) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field5522.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field5522[var5];
            int var7 = this.field5522[var5 + 1];
            short var8 = this.field5515[var6];
            if (var8 == -1) {
                class217.method1457(-1);
                class89.method587(0, 0, -72);
            } else {
                class181.field2878.method1780(var8 & 0xFFFF, 0);
            }
            if (this.field5543.field4433 == null) {
                this.field5543.field4428.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field5543.field4428);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "()V", line = 1342)
    public final void method2235() {
        int var10002;
        if (this.field5512 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field5524; var3++) {
                int var4 = this.field5512[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field5552 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field5552[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field5524) {
                int var7 = this.field5512[var6] & 0xFF;
                this.field5552[var7][var1[var7]++] = var6++;
            }
            this.field5512 = null;
        }
        if (this.field5508 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5537; var10++) {
            int var11 = this.field5508[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field5548 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field5548[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field5537) {
            int var14 = this.field5508[var13] & 0xFF;
            this.field5548[var14][var8[var14]++] = var13++;
        }
        this.field5508 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII[FIF)V", line = 1437)
    private static final void method2236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field5562 = var16;
        field5560 = var17;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()I", line = 1487)
    public final int method138() {
        if (!this.field5536.field1499) {
            this.method2246();
        }
        return this.field5536.field1503;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1493)
    private static final void method2237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field5559 = var16;
        field5564 = var17;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZZZZ)V", line = 1540)
    private final void method2238(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field5544.field4432 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field5551.field4432 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field5541.field4432 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field5509.field4432 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field5514.field4950.length < this.field5532 * var6) {
            field5514 = new class291((this.field5532 + 100) * var6);
        } else {
            field5514.field4946 = 0;
        }
        if (arg1) {
            if (class217.field3537) {
                for (int var7 = 0; var7 < this.field5524; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field5510[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field5520[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field5534[var7]);
                    int var11 = this.field5540[var7];
                    int var12 = this.field5540[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field5521[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field5514.field4946 = var6 * var14;
                        field5514.method1967(var8, -1303690792);
                        field5514.method1967(var9, -1303690792);
                        field5514.method1967(var10, -1303690792);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field5524; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field5510[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field5520[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field5534[var15]);
                    int var19 = this.field5540[var15];
                    int var20 = this.field5540[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field5521[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field5514.field4946 = var6 * var22;
                        field5514.method1998(var16, (byte) -24);
                        field5514.method1998(var17, (byte) -61);
                        field5514.method1998(var18, (byte) 112);
                    }
                }
            }
        }
        if (arg2) {
            if (class81.field1131) {
                for (int var42 = 0; var42 < this.field5537; var42++) {
                    int var43 = method2241(this.field5535[var42], this.field5515[var42], this.field5542, this.field5539[var42]);
                    field5514.field4946 = this.field5511[var42] * var6 + this.field5551.field4432;
                    field5514.method1967(var43, -1303690792);
                    field5514.field4946 = this.field5527[var42] * var6 + this.field5551.field4432;
                    field5514.method1967(var43, -1303690792);
                    field5514.field4946 = this.field5523[var42] * var6 + this.field5551.field4432;
                    field5514.method1967(var43, -1303690792);
                }
            } else {
                int var23 = (int) class14.field194[0];
                int var24 = (int) class14.field194[1];
                int var25 = (int) class14.field194[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field5542 * 1.3F);
                int var28 = this.field5531 * var26 >> 8;
                for (int var29 = 0; var29 < this.field5537; var29++) {
                    short var30 = this.field5511[var29];
                    short var31 = this.field5526[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field5529[var30] * var25 + this.field5530[var30] * var24 + this.field5519[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field5529[var30] * var25 + this.field5530[var30] * var24 + this.field5519[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field5526[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field5527[var29];
                    short var34 = this.field5526[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field5529[var33] * var25 + this.field5530[var33] * var24 + this.field5519[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field5529[var33] * var25 + this.field5530[var33] * var24 + this.field5519[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field5526[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field5523[var29];
                    short var37 = this.field5526[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field5529[var36] * var25 + this.field5530[var36] * var24 + this.field5519[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field5529[var36] * var25 + this.field5530[var36] * var24 + this.field5519[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field5526[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method2241(this.field5535[var29], this.field5515[var29], var32, this.field5539[var29]);
                    int var40 = method2241(this.field5535[var29], this.field5515[var29], var35, this.field5539[var29]);
                    int var41 = method2241(this.field5535[var29], this.field5515[var29], var38, this.field5539[var29]);
                    field5514.field4946 = var6 * var30 + this.field5551.field4432;
                    field5514.method1967(var39, -1303690792);
                    field5514.field4946 = var6 * var33 + this.field5551.field4432;
                    field5514.method1967(var40, -1303690792);
                    field5514.field4946 = var6 * var36 + this.field5551.field4432;
                    field5514.method1967(var41, -1303690792);
                }
                this.field5519 = null;
                this.field5530 = null;
                this.field5529 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field5531;
            float var45 = 3.0F / (float) (this.field5531 / 2 + this.field5531);
            field5514.field4946 = this.field5541.field4432;
            if (class217.field3537) {
                for (int var46 = 0; var46 < this.field5532; var46++) {
                    short var47 = this.field5526[var46];
                    if (var47 == 0) {
                        field5514.method1987((float) this.field5519[var46] * var45, (byte) 85);
                        field5514.method1987((float) this.field5530[var46] * var45, (byte) 85);
                        field5514.method1987((float) this.field5529[var46] * var45, (byte) 85);
                    } else {
                        float var48 = var44 / (float) var47;
                        field5514.method1987((float) this.field5519[var46] * var48, (byte) 85);
                        field5514.method1987((float) this.field5530[var46] * var48, (byte) 85);
                        field5514.method1987((float) this.field5529[var46] * var48, (byte) 85);
                    }
                    field5514.field4946 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field5532; var49++) {
                    short var50 = this.field5526[var49];
                    if (var50 == 0) {
                        field5514.method1970((float) this.field5519[var49] * var45, 65536);
                        field5514.method1970((float) this.field5530[var49] * var45, 65536);
                        field5514.method1970((float) this.field5529[var49] * var45, 65536);
                    } else {
                        float var51 = var44 / (float) var50;
                        field5514.method1970((float) this.field5519[var49] * var51, 65536);
                        field5514.method1970((float) this.field5530[var49] * var51, 65536);
                        field5514.method1970((float) this.field5529[var49] * var51, 65536);
                    }
                    field5514.field4946 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field5514.field4946 = this.field5509.field4432;
            if (class217.field3537) {
                for (int var52 = 0; var52 < this.field5532; var52++) {
                    field5514.method1987(this.field5513[var52], (byte) 85);
                    field5514.method1987(this.field5533[var52], (byte) 85);
                    field5514.field4946 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field5532; var53++) {
                    field5514.method1970(this.field5513[var53], 65536);
                    field5514.method1970(this.field5533[var53], 65536);
                    field5514.field4946 += var6 - 8;
                }
            }
        }
        field5514.field4946 = this.field5532 * var6;
        if (arg0) {
            if (class217.field3522) {
                ByteBuffer var54 = ByteBuffer.wrap(field5514.field4950, 0, field5514.field4946);
                if (this.field5528 == null) {
                    this.field5528 = new class182(true);
                    this.field5528.method1210(var54);
                } else {
                    this.field5528.method1212(var54);
                }
                if (arg1) {
                    this.field5544.field4423 = true;
                    this.field5544.field4428 = null;
                    this.field5544.field4433 = this.field5528;
                    this.field5544.field4426 = var6;
                }
                if (arg2) {
                    this.field5551.field4423 = true;
                    this.field5551.field4428 = null;
                    this.field5551.field4433 = this.field5528;
                    this.field5551.field4426 = var6;
                }
                if (arg3) {
                    this.field5541.field4423 = true;
                    this.field5541.field4428 = null;
                    this.field5541.field4433 = this.field5528;
                    this.field5541.field4426 = var6;
                }
                if (arg4) {
                    this.field5509.field4423 = true;
                    this.field5509.field4428 = null;
                    this.field5509.field4433 = this.field5528;
                    this.field5509.field4426 = var6;
                }
            } else {
                if (field5538 == null || field5538.capacity() < field5514.field4946) {
                    field5538 = ByteBuffer.allocateDirect(var6 * 100 + field5514.field4946);
                } else {
                    field5538.clear();
                }
                field5538.put(field5514.field4950, 0, field5514.field4946);
                field5538.flip();
                if (arg1) {
                    this.field5544.field4423 = true;
                    this.field5544.field4428 = field5538;
                    this.field5544.field4433 = null;
                    this.field5544.field4426 = var6;
                }
                if (arg2) {
                    this.field5551.field4423 = true;
                    this.field5551.field4428 = field5538;
                    this.field5544.field4433 = null;
                    this.field5551.field4426 = var6;
                }
                if (arg3) {
                    this.field5541.field4423 = true;
                    this.field5541.field4428 = field5538;
                    this.field5541.field4433 = null;
                    this.field5541.field4426 = var6;
                }
                if (arg4) {
                    this.field5509.field4423 = true;
                    this.field5509.field4428 = field5538;
                    this.field5509.field4433 = null;
                    this.field5509.field4426 = var6;
                }
            }
        } else if (class217.field3526) {
            class182 var55 = new class182();
            ByteBuffer var56 = ByteBuffer.wrap(field5514.field4950, 0, field5514.field4946);
            var55.method1210(var56);
            if (arg1) {
                this.field5544.field4423 = true;
                this.field5544.field4428 = null;
                this.field5544.field4433 = var55;
                this.field5544.field4426 = var6;
            }
            if (arg2) {
                this.field5551.field4423 = true;
                this.field5551.field4428 = null;
                this.field5551.field4433 = var55;
                this.field5551.field4426 = var6;
            }
            if (arg3) {
                this.field5541.field4423 = true;
                this.field5541.field4428 = null;
                this.field5541.field4433 = var55;
                this.field5541.field4426 = var6;
            }
            if (arg4) {
                this.field5509.field4423 = true;
                this.field5509.field4428 = null;
                this.field5509.field4433 = var55;
                this.field5509.field4426 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field5514.field4946);
            var57.put(field5514.field4950, 0, field5514.field4946);
            var57.flip();
            if (arg1) {
                this.field5544.field4423 = true;
                this.field5544.field4428 = var57;
                this.field5544.field4433 = null;
                this.field5544.field4426 = var6;
            }
            if (arg2) {
                this.field5551.field4423 = true;
                this.field5551.field4428 = var57;
                this.field5544.field4433 = null;
                this.field5551.field4426 = var6;
            }
            if (arg3) {
                this.field5541.field4423 = true;
                this.field5541.field4428 = var57;
                this.field5541.field4433 = null;
                this.field5541.field4426 = var6;
            }
            if (arg4) {
                this.field5509.field4423 = true;
                this.field5509.field4428 = var57;
                this.field5509.field4433 = null;
                this.field5509.field4426 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(ZZZ)Lw;", line = 2068)
    public final class271 method140(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2251(arg0, arg1, arg2, field5554, field5553);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[IIIIZ)V", line = 2072)
    public final void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field5557 = 0;
            field5568 = 0;
            field5566 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field5552.length) {
                    int[] var14 = this.field5552[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field5557 += this.field5510[var16];
                        field5568 += this.field5520[var16];
                        field5566 += this.field5534[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field5557 = field5557 / var11 + var8;
                field5568 = field5568 / var11 + var9;
                field5566 = field5566 / var11 + var10;
            } else {
                field5557 = var8;
                field5568 = var9;
                field5566 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field5552.length) {
                    int[] var22 = this.field5552[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field5510[var24] += var17;
                        this.field5520[var24] += var18;
                        this.field5534[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5552.length) {
                    int[] var27 = this.field5552[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field5510[var29] -= field5557;
                        this.field5520[var29] -= field5568;
                        this.field5534[var29] -= field5566;
                        if (arg4 != 0) {
                            int var30 = class181.field2884[arg4];
                            int var31 = class181.field2886[arg4];
                            int var32 = this.field5520[var29] * var30 + this.field5510[var29] * var31 + 32767 >> 16;
                            this.field5520[var29] = this.field5520[var29] * var31 + 32767 - this.field5510[var29] * var30 >> 16;
                            this.field5510[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class181.field2884[arg2];
                            int var34 = class181.field2886[arg2];
                            int var35 = this.field5520[var29] * var34 + 32767 - this.field5534[var29] * var33 >> 16;
                            this.field5534[var29] = this.field5534[var29] * var34 + this.field5520[var29] * var33 + 32767 >> 16;
                            this.field5520[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class181.field2884[arg3];
                            int var37 = class181.field2886[arg3];
                            int var38 = this.field5534[var29] * var36 + this.field5510[var29] * var37 + 32767 >> 16;
                            this.field5534[var29] = this.field5534[var29] * var37 + 32767 - this.field5510[var29] * var36 >> 16;
                            this.field5510[var29] = var38;
                        }
                        this.field5510[var29] += field5557;
                        this.field5520[var29] += field5568;
                        this.field5534[var29] += field5566;
                    }
                }
            }
            if (arg5 && this.field5519 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field5552.length) {
                        int[] var41 = this.field5552[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field5540[var43];
                            int var45 = this.field5540[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field5521[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class181.field2884[arg4];
                                    int var49 = class181.field2886[arg4];
                                    int var50 = this.field5530[var47] * var48 + this.field5519[var47] * var49 + 32767 >> 16;
                                    this.field5530[var47] = (short) (this.field5530[var47] * var49 + 32767 - this.field5519[var47] * var48 >> 16);
                                    this.field5519[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class181.field2884[arg2];
                                    int var52 = class181.field2886[arg2];
                                    int var53 = this.field5530[var47] * var52 + 32767 - this.field5529[var47] * var51 >> 16;
                                    this.field5529[var47] = (short) (this.field5530[var47] * var51 + this.field5529[var47] * var52 + 32767 >> 16);
                                    this.field5530[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class181.field2884[arg3];
                                    int var55 = class181.field2886[arg3];
                                    int var56 = this.field5529[var47] * var54 + this.field5519[var47] * var55 + 32767 >> 16;
                                    this.field5529[var47] = (short) (this.field5529[var47] * var55 + 32767 - this.field5519[var47] * var54 >> 16);
                                    this.field5519[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field5541 != null) {
                    this.field5541.field4423 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field5552.length) {
                    int[] var59 = this.field5552[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field5510[var61] -= field5557;
                        this.field5520[var61] -= field5568;
                        this.field5534[var61] -= field5566;
                        this.field5510[var61] = this.field5510[var61] * arg2 >> 7;
                        this.field5520[var61] = this.field5520[var61] * arg3 >> 7;
                        this.field5534[var61] = this.field5534[var61] * arg4 >> 7;
                        this.field5510[var61] += field5557;
                        this.field5520[var61] += field5568;
                        this.field5534[var61] += field5566;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5548 != null && this.field5539 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field5548.length) {
                        int[] var64 = this.field5548[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field5539[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field5539[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field5551.field4423 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5548 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field5548.length) {
                    int[] var70 = this.field5548[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field5535[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field5535[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field5551.field4423 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "()V", line = 2479)
    private final void method2239() {
        if (field5514.field4950.length < this.field5532 * 12) {
            field5514 = new class291((this.field5532 + 100) * 12);
        } else {
            field5514.field4946 = 0;
        }
        if (class217.field3537) {
            for (int var1 = 0; var1 < this.field5537; var1++) {
                field5514.method1967(this.field5511[var1], -1303690792);
                field5514.method1967(this.field5527[var1], -1303690792);
                field5514.method1967(this.field5523[var1], -1303690792);
            }
        } else {
            for (int var2 = 0; var2 < this.field5537; var2++) {
                field5514.method1998(this.field5511[var2], (byte) -127);
                field5514.method1998(this.field5527[var2], (byte) -87);
                field5514.method1998(this.field5523[var2], (byte) -94);
            }
        }
        if (!class217.field3526) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field5514.field4946);
            var5.put(field5514.field4950, 0, field5514.field4946);
            var5.flip();
            this.field5543.field4423 = true;
            this.field5543.field4428 = var5;
            this.field5543.field4433 = null;
            return;
        }
        class182 var3 = new class182();
        ByteBuffer var4 = ByteBuffer.wrap(field5514.field4950, 0, field5514.field4946);
        var3.method1210(var4);
        this.field5543.field4423 = true;
        this.field5543.field4428 = null;
        this.field5543.field4433 = var3;
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "()Z", line = 2537)
    public final boolean method158() {
        if (this.field5552 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5524; var1++) {
            this.field5510[var1] <<= 0x4;
            this.field5520[var1] <<= 0x4;
            this.field5534[var1] <<= 0x4;
        }
        field5557 = 0;
        field5568 = 0;
        field5566 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "()V", line = 2557)
    public static void method2240() {
        field5517 = null;
        field5514 = null;
        field5538 = null;
        field5545 = null;
        field5550 = null;
        field5553 = null;
        field5554 = null;
        field5555 = null;
        field5556 = null;
        field5561 = null;
        field5565 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ISIB)I", line = 2571)
    private static final int method2241(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class181.field2885[class21.method134(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class181.field2878.method1778(255, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class181.field2878.method1775(arg1 & 0xFFFF, 84);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "()V", line = 2631)
    public static final void method2242() {
        field5545 = new class319();
        field5550 = new class319();
        field5553 = new class319();
        field5554 = new class319();
        field5555 = new class319();
        field5556 = new class319();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFF)I", line = 2641)
    private static final int method2243(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 2679)
    public final void method141(int arg0) {
        int var2 = class181.field2884[arg0];
        int var3 = class181.field2886[arg0];
        for (int var4 = 0; var4 < this.field5524; var4++) {
            int var5 = this.field5520[var4] * var3 - this.field5534[var4] * var2 >> 16;
            this.field5534[var4] = this.field5534[var4] * var3 + this.field5520[var4] * var2 >> 16;
            this.field5520[var4] = var5;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V", line = 2701)
    public final void method2244(int arg0) {
        if (this.field5519 == null) {
            this.method137(arg0);
            return;
        }
        int var2 = class181.field2884[arg0];
        int var3 = class181.field2886[arg0];
        for (int var4 = 0; var4 < this.field5524; var4++) {
            int var5 = this.field5534[var4] * var2 + this.field5510[var4] * var3 >> 16;
            this.field5534[var4] = this.field5534[var4] * var3 - this.field5510[var4] * var2 >> 16;
            this.field5510[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field5532; var6++) {
            int var7 = this.field5529[var6] * var2 + this.field5519[var6] * var3 >> 16;
            this.field5529[var6] = (short) (this.field5529[var6] * var3 - this.field5519[var6] * var2 >> 16);
            this.field5519[var6] = (short) var7;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
        if (this.field5541 != null) {
            this.field5541.field4423 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(ZZZ)Lw;", line = 2748)
    public final class271 method142(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2251(arg0, arg1, arg2, field5550, field5545);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZZZZZZZZZZ)Lra;", line = 2752)
    public final class319 method2245(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class319 var12 = new class319();
        var12.field5524 = this.field5524;
        var12.field5532 = this.field5532;
        var12.field5537 = this.field5537;
        if (arg0) {
            var12.field5510 = this.field5510;
            var12.field5534 = this.field5534;
        } else {
            var12.field5510 = class310.method2151(this.field5510, (byte) -63);
            var12.field5534 = class310.method2151(this.field5534, (byte) -92);
        }
        if (arg1) {
            var12.field5520 = this.field5520;
        } else {
            var12.field5520 = class310.method2151(this.field5520, (byte) 122);
        }
        if (arg0 && arg1) {
            var12.field5544 = this.field5544;
            var12.field5536 = this.field5536;
        } else {
            var12.field5544 = new class258();
            var12.field5536 = new class105();
        }
        if (arg2) {
            var12.field5535 = this.field5535;
        } else {
            var12.field5535 = class22.method183(this.field5535, (byte) -94);
        }
        if (arg3) {
            var12.field5539 = this.field5539;
        } else {
            var12.field5539 = class313.method2187(-1, this.field5539);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class81.field1131) {
            var12.field5551 = new class258();
        } else {
            var12.field5551 = this.field5551;
        }
        if (arg5) {
            var12.field5519 = this.field5519;
            var12.field5530 = this.field5530;
            var12.field5529 = this.field5529;
            var12.field5526 = this.field5526;
        } else {
            var12.field5519 = class22.method183(this.field5519, (byte) -94);
            var12.field5530 = class22.method183(this.field5530, (byte) -94);
            var12.field5529 = class22.method183(this.field5529, (byte) -94);
            var12.field5526 = class22.method183(this.field5526, (byte) -94);
        }
        if (!class81.field1131) {
            var12.field5541 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field5541 = this.field5541;
        } else {
            var12.field5541 = new class258();
        }
        if (arg8) {
            var12.field5513 = this.field5513;
            var12.field5533 = this.field5533;
            var12.field5509 = this.field5509;
        } else {
            var12.field5513 = class195.method1305(-29303, this.field5513);
            var12.field5533 = class195.method1305(-29303, this.field5533);
            var12.field5509 = new class258();
        }
        if (arg9) {
            var12.field5511 = this.field5511;
            var12.field5527 = this.field5527;
            var12.field5523 = this.field5523;
            var12.field5543 = this.field5543;
        } else {
            var12.field5511 = class22.method183(this.field5511, (byte) -94);
            var12.field5527 = class22.method183(this.field5527, (byte) -94);
            var12.field5523 = class22.method183(this.field5523, (byte) -94);
            var12.field5543 = new class258();
        }
        if (arg10) {
            var12.field5515 = this.field5515;
        } else {
            var12.field5515 = class22.method183(this.field5515, (byte) -94);
        }
        var12.field5512 = this.field5512;
        var12.field5552 = this.field5552;
        var12.field5508 = this.field5508;
        var12.field5548 = this.field5548;
        var12.field5522 = this.field5522;
        var12.field5521 = this.field5521;
        var12.field5540 = this.field5540;
        var12.field5542 = this.field5542;
        var12.field5531 = this.field5531;
        var12.field5525 = this.field5525;
        var12.field5518 = this.field5518;
        return var12;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "()I", line = 2889)
    public final int method149() {
        if (!this.field5536.field1499) {
            this.method2246();
        }
        return this.field5536.field1501;
    }

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "()I", line = 2896)
    public final int method164() {
        if (!this.field5536.field1499) {
            this.method2246();
        }
        return this.field5536.field1500;
    }

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "()V", line = 2903)
    private final void method2246() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field5524; var9++) {
            int var10 = this.field5510[var9];
            int var11 = this.field5520[var9];
            int var12 = this.field5534[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field5536.field1498 = (short) var1;
        this.field5536.field1501 = (short) var4;
        this.field5536.field1497 = (short) var2;
        this.field5536.field1504 = (short) var5;
        this.field5536.field1500 = (short) var3;
        this.field5536.field1502 = (short) var6;
        this.field5536.field1503 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field5536.field1499 = true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIJ)V", line = 2972)
    public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field5532 == 0) {
            return;
        }
        GL var10 = class217.field3551;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method2234();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)V", line = 2997)
    public final void method159(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5524; var4++) {
            this.field5510[var4] = this.field5510[var4] * arg0 >> 7;
            this.field5520[var4] = this.field5520[var4] * arg1 >> 7;
            this.field5534[var4] = this.field5534[var4] * arg2 >> 7;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)V", line = 3010)
    public final void method143(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field5557 = 0;
            field5568 = 0;
            field5566 = 0;
            for (int var6 = 0; var6 < this.field5524; var6++) {
                field5557 += this.field5510[var6];
                field5568 += this.field5520[var6];
                field5566 += this.field5534[var6];
                var5++;
            }
            if (var5 > 0) {
                field5557 = field5557 / var5 + arg1;
                field5568 = field5568 / var5 + arg2;
                field5566 = field5566 / var5 + arg3;
            } else {
                field5557 = arg1;
                field5568 = arg2;
                field5566 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5524; var7++) {
                this.field5510[var7] += arg1;
                this.field5520[var7] += arg2;
                this.field5534[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5524; var8++) {
                this.field5510[var8] -= field5557;
                this.field5520[var8] -= field5568;
                this.field5534[var8] -= field5566;
                if (arg3 != 0) {
                    int var9 = class181.field2884[arg3];
                    int var10 = class181.field2886[arg3];
                    int var11 = this.field5520[var8] * var9 + this.field5510[var8] * var10 + 32767 >> 16;
                    this.field5520[var8] = this.field5520[var8] * var10 + 32767 - this.field5510[var8] * var9 >> 16;
                    this.field5510[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class181.field2884[arg1];
                    int var13 = class181.field2886[arg1];
                    int var14 = this.field5520[var8] * var13 + 32767 - this.field5534[var8] * var12 >> 16;
                    this.field5534[var8] = this.field5534[var8] * var13 + this.field5520[var8] * var12 + 32767 >> 16;
                    this.field5520[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class181.field2884[arg2];
                    int var16 = class181.field2886[arg2];
                    int var17 = this.field5534[var8] * var15 + this.field5510[var8] * var16 + 32767 >> 16;
                    this.field5534[var8] = this.field5534[var8] * var16 + 32767 - this.field5510[var8] * var15 >> 16;
                    this.field5510[var8] = var17;
                }
                this.field5510[var8] += field5557;
                this.field5520[var8] += field5568;
                this.field5534[var8] += field5566;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5524; var18++) {
                this.field5510[var18] -= field5557;
                this.field5520[var18] -= field5568;
                this.field5534[var18] -= field5566;
                this.field5510[var18] = this.field5510[var18] * arg1 / 128;
                this.field5520[var18] = this.field5520[var18] * arg2 / 128;
                this.field5534[var18] = this.field5534[var18] * arg3 / 128;
                this.field5510[var18] += field5557;
                this.field5520[var18] += field5568;
                this.field5534[var18] += field5566;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5537; var19++) {
                int var20 = (this.field5539[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field5539[var19] = (byte) var20;
            }
            this.field5551.field4423 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field5537; var21++) {
                int var22 = this.field5535[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field5535[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field5551.field4423 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "()V", line = 3206)
    public final void method2247() {
        for (int var1 = 0; var1 < this.field5524; var1++) {
            this.field5534[var1] = -this.field5534[var1];
        }
        if (this.field5529 != null) {
            for (int var2 = 0; var2 < this.field5532; var2++) {
                this.field5529[var2] = (short) (-this.field5529[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field5537; var3++) {
            short var4 = this.field5511[var3];
            this.field5511[var3] = this.field5523[var3];
            this.field5523[var3] = var4;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
        if (this.field5541 != null) {
            this.field5541.field4423 = false;
        }
        this.field5543.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 3243)
    public final void method137(int arg0) {
        int var2 = class181.field2884[arg0];
        int var3 = class181.field2886[arg0];
        for (int var4 = 0; var4 < this.field5524; var4++) {
            int var5 = this.field5534[var4] * var2 + this.field5510[var4] * var3 >> 16;
            this.field5534[var4] = this.field5534[var4] * var3 - this.field5510[var4] * var2 >> 16;
            this.field5510[var4] = var5;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 3262)
    private static final void method2248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field5558 = var18;
        field5563 = var19;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "()I", line = 3340)
    public final int method147() {
        if (!this.field5536.field1499) {
            this.method2246();
        }
        return this.field5536.field1498;
    }

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "()V", line = 3346)
    public final void method2249() {
        if (this.field5519 == null) {
            this.method132();
            return;
        }
        for (int var1 = 0; var1 < this.field5524; var1++) {
            int var2 = this.field5534[var1];
            this.field5534[var1] = this.field5510[var1];
            this.field5510[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5532; var3++) {
            short var4 = this.field5529[var3];
            this.field5529[var3] = this.field5519[var3];
            this.field5519[var3] = (short) (-var4);
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
        if (this.field5541 != null) {
            this.field5541.field4423 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()V", line = 3388)
    public final void method133() {
        for (int var1 = 0; var1 < this.field5524; var1++) {
            this.field5510[var1] = this.field5510[var1] + 7 >> 4;
            this.field5520[var1] = this.field5520[var1] + 7 >> 4;
            this.field5534[var1] = this.field5534[var1] + 7 >> 4;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([SI)[S", line = 3402)
    private static final short[] method2250(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class187.method1248(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZZLra;Lra;)Lw;", line = 3412)
    private final class271 method2251(boolean arg0, boolean arg1, boolean arg2, class319 arg3, class319 arg4) {
        arg3.field5524 = this.field5524;
        arg3.field5532 = this.field5532;
        arg3.field5537 = this.field5537;
        arg3.field5542 = this.field5542;
        arg3.field5531 = this.field5531;
        arg3.field5549 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field5510 == null || arg3.field5510.length < this.field5524) {
            arg3.field5510 = new int[this.field5524 + 100];
            arg3.field5520 = new int[this.field5524 + 100];
            arg3.field5534 = new int[this.field5524 + 100];
        }
        for (int var6 = 0; var6 < this.field5524; var6++) {
            arg3.field5510[var6] = this.field5510[var6];
            arg3.field5520[var6] = this.field5520[var6];
            arg3.field5534[var6] = this.field5534[var6];
        }
        if (arg3.field5544 == null) {
            arg3.field5544 = new class258();
        }
        arg3.field5544.field4423 = false;
        if (arg3.field5536 == null) {
            arg3.field5536 = new class105();
        }
        arg3.field5536.field1499 = false;
        if (arg0) {
            arg3.field5539 = this.field5539;
        } else {
            if (arg4.field5539 == null || arg4.field5539.length < this.field5537) {
                arg4.field5539 = new byte[this.field5537 + 100];
            }
            arg3.field5539 = arg4.field5539;
            for (int var7 = 0; var7 < this.field5537; var7++) {
                arg3.field5539[var7] = this.field5539[var7];
            }
        }
        if (arg1) {
            arg3.field5535 = this.field5535;
        } else {
            if (arg4.field5535 == null || arg4.field5535.length < this.field5537) {
                arg4.field5535 = new short[this.field5537 + 100];
            }
            arg3.field5535 = arg4.field5535;
            for (int var8 = 0; var8 < this.field5537; var8++) {
                arg3.field5535[var8] = this.field5535[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field5551 = this.field5551;
        } else {
            if (arg4.field5551 == null) {
                arg4.field5551 = new class258();
            }
            arg3.field5551 = arg4.field5551;
            arg3.field5551.field4423 = false;
        }
        if (arg2 || this.field5519 == null) {
            arg3.field5519 = this.field5519;
            arg3.field5530 = this.field5530;
            arg3.field5529 = this.field5529;
            arg3.field5526 = this.field5526;
            arg3.field5541 = this.field5541;
        } else {
            if (arg4.field5519 == null || arg4.field5519.length < this.field5532) {
                arg4.field5519 = new short[this.field5532 + 100];
                arg4.field5530 = new short[this.field5532 + 100];
                arg4.field5529 = new short[this.field5532 + 100];
                arg4.field5526 = new short[this.field5532 + 100];
            }
            arg3.field5519 = arg4.field5519;
            arg3.field5530 = arg4.field5530;
            arg3.field5529 = arg4.field5529;
            arg3.field5526 = arg4.field5526;
            for (int var9 = 0; var9 < this.field5532; var9++) {
                arg3.field5519[var9] = this.field5519[var9];
                arg3.field5530[var9] = this.field5530[var9];
                arg3.field5529[var9] = this.field5529[var9];
                arg3.field5526[var9] = this.field5526[var9];
            }
            if (class81.field1131) {
                if (arg4.field5541 == null) {
                    arg4.field5541 = new class258();
                }
                arg3.field5541 = arg4.field5541;
                arg3.field5541.field4423 = false;
            } else {
                arg3.field5541 = null;
            }
        }
        arg3.field5513 = this.field5513;
        arg3.field5533 = this.field5533;
        arg3.field5512 = this.field5512;
        arg3.field5552 = this.field5552;
        arg3.field5511 = this.field5511;
        arg3.field5527 = this.field5527;
        arg3.field5523 = this.field5523;
        arg3.field5515 = this.field5515;
        arg3.field5508 = this.field5508;
        arg3.field5548 = this.field5548;
        arg3.field5509 = this.field5509;
        arg3.field5543 = this.field5543;
        arg3.field5522 = this.field5522;
        arg3.field5521 = this.field5521;
        arg3.field5540 = this.field5540;
        arg3.field4630 = this.field4630;
        arg3.field5525 = this.field5525;
        arg3.field5518 = this.field5518;
        return arg3;
    }

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "()I", line = 3564)
    public final int method2252() {
        return this.field5542;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 3571)
    public final void method148(int arg0) {
        int var2 = class181.field2884[arg0];
        int var3 = class181.field2886[arg0];
        for (int var4 = 0; var4 < this.field5524; var4++) {
            int var5 = this.field5520[var4] * var2 + this.field5510[var4] * var3 >> 16;
            this.field5520[var4] = this.field5520[var4] * var3 - this.field5510[var4] * var2 >> 16;
            this.field5510[var4] = var5;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3592)
    public final void method144(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field5557 = 0;
            field5568 = 0;
            field5566 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5552.length) {
                    int[] var16 = this.field5552[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5525 == null || (arg6 & this.field5525[var18]) != 0) {
                            field5557 += this.field5510[var18];
                            field5568 += this.field5520[var18];
                            field5566 += this.field5534[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field5557 = field5557 / var13 + var10;
                field5568 = field5568 / var13 + var11;
                field5566 = field5566 / var13 + var12;
                field5567 = true;
            } else {
                field5557 = var10;
                field5568 = var11;
                field5566 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5552.length) {
                    int[] var27 = this.field5552[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5525 == null || (arg6 & this.field5525[var29]) != 0) {
                            this.field5510[var29] += var22;
                            this.field5520[var29] += var23;
                            this.field5534[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field5552.length) {
                        int[] var92 = this.field5552[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field5525 == null || (arg6 & this.field5525[var94]) != 0) {
                                this.field5510[var94] -= field5557;
                                this.field5520[var94] -= field5568;
                                this.field5534[var94] -= field5566;
                                if (arg4 != 0) {
                                    int var95 = class181.field2884[arg4];
                                    int var96 = class181.field2886[arg4];
                                    int var97 = this.field5520[var94] * var95 + this.field5510[var94] * var96 + 32767 >> 16;
                                    this.field5520[var94] = this.field5520[var94] * var96 + 32767 - this.field5510[var94] * var95 >> 16;
                                    this.field5510[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class181.field2884[arg2];
                                    int var99 = class181.field2886[arg2];
                                    int var100 = this.field5520[var94] * var99 + 32767 - this.field5534[var94] * var98 >> 16;
                                    this.field5534[var94] = this.field5534[var94] * var99 + this.field5520[var94] * var98 + 32767 >> 16;
                                    this.field5520[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class181.field2884[arg3];
                                    int var102 = class181.field2886[arg3];
                                    int var103 = this.field5534[var94] * var101 + this.field5510[var94] * var102 + 32767 >> 16;
                                    this.field5534[var94] = this.field5534[var94] * var102 + 32767 - this.field5510[var94] * var101 >> 16;
                                    this.field5510[var94] = var103;
                                }
                                this.field5510[var94] += field5557;
                                this.field5520[var94] += field5568;
                                this.field5534[var94] += field5566;
                            }
                        }
                    }
                }
                if (arg5 && this.field5519 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field5552.length) {
                            int[] var106 = this.field5552[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field5525 == null || (arg6 & this.field5525[var108]) != 0) {
                                    int var109 = this.field5540[var108];
                                    int var110 = this.field5540[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field5521[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class181.field2884[arg4];
                                            int var114 = class181.field2886[arg4];
                                            int var115 = this.field5530[var112] * var113 + this.field5519[var112] * var114 + 32767 >> 16;
                                            this.field5530[var112] = (short) (this.field5530[var112] * var114 + 32767 - this.field5519[var112] * var113 >> 16);
                                            this.field5519[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class181.field2884[arg2];
                                            int var117 = class181.field2886[arg2];
                                            int var118 = this.field5530[var112] * var117 + 32767 - this.field5529[var112] * var116 >> 16;
                                            this.field5529[var112] = (short) (this.field5530[var112] * var116 + this.field5529[var112] * var117 + 32767 >> 16);
                                            this.field5530[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class181.field2884[arg3];
                                            int var120 = class181.field2886[arg3];
                                            int var121 = this.field5529[var112] * var119 + this.field5519[var112] * var120 + 32767 >> 16;
                                            this.field5529[var112] = (short) (this.field5529[var112] * var120 + 32767 - this.field5519[var112] * var119 >> 16);
                                            this.field5519[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5541 != null) {
                        this.field5541.field4423 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field5567) {
                    int var36 = arg7[6] * field5566 + arg7[0] * field5557 + arg7[3] * field5568 + 16384 >> 15;
                    int var37 = arg7[7] * field5566 + arg7[1] * field5557 + arg7[4] * field5568 + 16384 >> 15;
                    int var38 = arg7[8] * field5566 + arg7[2] * field5557 + arg7[5] * field5568 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field5557 = var39;
                    field5568 = var40;
                    field5566 = var41;
                    field5567 = false;
                }
                int[] var42 = new int[9];
                int var43 = class181.field2886[arg2] >> 1;
                int var44 = class181.field2884[arg2] >> 1;
                int var45 = class181.field2886[arg3] >> 1;
                int var46 = class181.field2884[arg3] >> 1;
                int var47 = class181.field2886[arg4] >> 1;
                int var48 = class181.field2884[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field5566 + var42[0] * -field5557 + var42[1] * -field5568 + 16384 >> 15;
                int var52 = var42[5] * -field5566 + var42[3] * -field5557 + var42[4] * -field5568 + 16384 >> 15;
                int var53 = var42[8] * -field5566 + var42[6] * -field5557 + var42[7] * -field5568 + 16384 >> 15;
                int var54 = field5557 + var51;
                int var55 = field5568 + var52;
                int var56 = field5566 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field5552.length) {
                        int[] var81 = this.field5552[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field5525 == null || (arg6 & this.field5525[var83]) != 0) {
                                int var84 = this.field5534[var83] * var68[2] + this.field5520[var83] * var68[1] + this.field5510[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field5534[var83] * var68[5] + this.field5520[var83] * var68[4] + this.field5510[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field5534[var83] * var68[8] + this.field5520[var83] * var68[7] + this.field5510[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field5510[var83] = var87;
                                this.field5520[var83] = var88;
                                this.field5534[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field5552.length) {
                        int[] var174 = this.field5552[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5525 == null || (arg6 & this.field5525[var176]) != 0) {
                                this.field5510[var176] -= field5557;
                                this.field5520[var176] -= field5568;
                                this.field5534[var176] -= field5566;
                                this.field5510[var176] = this.field5510[var176] * arg2 >> 7;
                                this.field5520[var176] = this.field5520[var176] * arg3 >> 7;
                                this.field5534[var176] = this.field5534[var176] * arg4 >> 7;
                                this.field5510[var176] += field5557;
                                this.field5520[var176] += field5568;
                                this.field5534[var176] += field5566;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field5567) {
                    int var128 = arg7[6] * field5566 + arg7[0] * field5557 + arg7[3] * field5568 + 16384 >> 15;
                    int var129 = arg7[7] * field5566 + arg7[1] * field5557 + arg7[4] * field5568 + 16384 >> 15;
                    int var130 = arg7[8] * field5566 + arg7[2] * field5557 + arg7[5] * field5568 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field5557 = var131;
                    field5568 = var132;
                    field5566 = var133;
                    field5567 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field5557 * var134 + 16384 >> 15;
                int var138 = -field5568 * var135 + 16384 >> 15;
                int var139 = -field5566 * var136 + 16384 >> 15;
                int var140 = field5557 + var137;
                int var141 = field5568 + var138;
                int var142 = field5566 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field5552.length) {
                        int[] var163 = this.field5552[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field5525 == null || (arg6 & this.field5525[var165]) != 0) {
                                int var166 = this.field5534[var165] * var150[2] + this.field5520[var165] * var150[1] + this.field5510[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field5534[var165] * var150[5] + this.field5520[var165] * var150[4] + this.field5510[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field5534[var165] * var150[8] + this.field5520[var165] * var150[7] + this.field5510[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field5510[var165] = var169;
                                this.field5520[var165] = var170;
                                this.field5534[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5548 != null && this.field5539 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field5548.length) {
                        int[] var179 = this.field5548[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field5518 == null || (arg6 & this.field5518[var181]) != 0) {
                                int var182 = (this.field5539[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field5539[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field5551.field4423 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5548 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field5548.length) {
                    int[] var185 = this.field5548[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field5518 == null || (arg6 & this.field5518[var187]) != 0) {
                            int var188 = this.field5535[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field5535[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field5551.field4423 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Leg;)Leg;", line = 4387)
    public final class300 method2253(class300 arg0) {
        if (this.field5532 == 0) {
            return null;
        }
        if (!this.field5536.field1499) {
            this.method2246();
        }
        int var2;
        int var3;
        if (class14.field192 > 0) {
            var2 = this.field5536.field1498 - (class14.field192 * this.field5536.field1504 >> 8) >> 3;
            var3 = this.field5536.field1501 - (class14.field192 * this.field5536.field1497 >> 8) >> 3;
        } else {
            var2 = this.field5536.field1498 - (class14.field192 * this.field5536.field1497 >> 8) >> 3;
            var3 = this.field5536.field1501 - (class14.field192 * this.field5536.field1504 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class14.field189 > 0) {
            var4 = this.field5536.field1500 - (class14.field189 * this.field5536.field1504 >> 8) >> 3;
            var5 = this.field5536.field1502 - (class14.field189 * this.field5536.field1497 >> 8) >> 3;
        } else {
            var4 = this.field5536.field1500 - (class14.field189 * this.field5536.field1497 >> 8) >> 3;
            var5 = this.field5536.field1502 - (class14.field189 * this.field5536.field1504 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class300 var8;
        if (arg0 == null || arg0.field5195.length < var6 * var7) {
            var8 = new class300(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3740 = arg0.field3746 = var6;
            arg0.field3743 = arg0.field3736 = var7;
            arg0.method2099();
        }
        var8.field3745 = var2;
        var8.field3741 = var4;
        if (field5561.length < this.field5532) {
            field5561 = new int[this.field5532];
            field5565 = new int[this.field5532];
        }
        for (int var9 = 0; var9 < this.field5524; var9++) {
            int var10 = (this.field5510[var9] - (this.field5520[var9] * class14.field192 >> 8) >> 3) - var2;
            int var11 = (this.field5534[var9] - (this.field5520[var9] * class14.field189 >> 8) >> 3) - var4;
            int var12 = this.field5540[var9];
            int var13 = this.field5540[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field5521[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field5561[var15] = var10;
                field5565[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field5537; var16++) {
            if (this.field5539[var16] <= 128) {
                short var17 = this.field5511[var16];
                short var18 = this.field5527[var16];
                short var19 = this.field5523[var16];
                int var20 = field5561[var17];
                int var21 = field5561[var18];
                int var22 = field5561[var19];
                int var23 = field5565[var17];
                int var24 = field5565[var18];
                int var25 = field5565[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class181.method1189(var8.field5195, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V", line = 4512)
    public final void method139(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5524; var4++) {
            this.field5510[var4] += arg0;
            this.field5520[var4] += arg1;
            this.field5534[var4] += arg2;
        }
        this.field5536.field1499 = false;
        this.field5544.field4423 = false;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()I", line = 4525)
    public final int method22() {
        if (!this.field5536.field1499) {
            this.method2246();
        }
        return this.field5536.field1497;
    }
}

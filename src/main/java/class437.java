import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class437 extends class278 {

    @OriginalMember(owner = "client!io", name = "D", descriptor = "Lbg;")
    private class464 field6209 = new class464();

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    private int field6217 = this.field3929 + -2;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "Leea;")
    public class131 field6223;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "[[[I")
    private int[][][] field6203;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "[[F")
    private float[][] field6226;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "[[[I")
    public int[][][] field6213;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "[[F")
    private float[][] field6227;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "[[[Laha;")
    private class380[][][] field6221;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "[[B")
    private byte[][] field6222;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "[[[I")
    public int[][][] field6214;

    @OriginalMember(owner = "client!io", name = "Y", descriptor = "[[B")
    private byte[][] field6230;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "[[[I")
    public int[][][] field6193;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "[[[I")
    private int[][][] field6198;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "[[F")
    private float[][] field6225;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "[[S")
    public short[][] field6205;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "I")
    private int field6224;

    @OriginalMember(owner = "client!io", name = "fb", descriptor = "Lkk;")
    private class188 field6237;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Lgk;")
    private class474 field6196;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    private int field6207;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    private int field6211;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!io", name = "bb", descriptor = "I")
    private int field6233;

    @OriginalMember(owner = "client!io", name = "eb", descriptor = "I")
    private int field6236;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "Lqea;")
    private class126 field6228;

    @OriginalMember(owner = "client!io", name = "X", descriptor = "Lvp;")
    public class186 field6229;

    @OriginalMember(owner = "client!io", name = "Z", descriptor = "Lvp;")
    public class186 field6231;

    @OriginalMember(owner = "client!io", name = "ab", descriptor = "Lvp;")
    public class186 field6232;

    @OriginalMember(owner = "client!io", name = "cb", descriptor = "Lvp;")
    private class186 field6234;

    @OriginalMember(owner = "client!io", name = "db", descriptor = "[Laha;")
    private class380[] field6235;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "[[[I")
    private int[][][] field6212;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lwi;[I)V", line = 6)
    public final void method1824(class465 arg0, int[] arg1) {
        ++field6216;
        this.field6209.method2770((byte) -13, new class110(this.field6223, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!io", name = "fa", descriptor = "(IILr;)Lr;", line = 17)
    public final class180 method1822(int arg0, int arg1, class180 arg2) {
        ++field6204;
        if (~(1 & this.field6222[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3925 >> this.field6223.field1786;
            class549 var5 = (class549) arg2;
            class549 var6;
            if (var5 != null && var5.method3176(var4, var4, (byte) 60)) {
                var6 = var5;
                var5.method3179(100);
            } else {
                var6 = new class549(this.field6223, var4, var4);
            }
            var6.method3177(0, var4, 0, var4, 0);
            this.method2644((byte) 102, arg0, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III[[ZZI)V", line = 51)
    public final void method1817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2643(arg0, arg3, -2, arg5, -1, arg4, arg1, arg2);
        ++field6194;
    }

    @OriginalMember(owner = "client!io", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 60)
    public final void method1811(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6219;
        if (this.field6196 != null && arg0 != null) {
            int var7 = -(this.field6223.field1879 * arg2 >> 8) + arg1 >> this.field6223.field1786;
            int var8 = -(this.field6223.field1856 * arg2 >> 8) + arg3 >> this.field6223.field1786;
            this.field6196.method2839(-1, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!io", name = "ka", descriptor = "(III)V", line = 79)
    public final void method1809(int arg0, int arg1, int arg2) {
        ++field6202;
        if (~(this.field6230[arg0][arg1] & 255) > ~arg2) {
            this.field6230[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!io", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 90)
    public final void method1810(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6208;
        if (this.field6196 != null && arg0 != null) {
            int var7 = -(this.field6223.field1879 * arg2 >> 8) + arg1 >> this.field6223.field1786;
            int var8 = -(this.field6223.field1856 * arg2 >> 8) + arg3 >> this.field6223.field1786;
            this.field6196.method2832(var7, var8, false, arg0);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Leea;IIII[[I[[II)V", line = 108)
    public class437(class131 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6223 = arg0;
        this.field6199 = arg2;
        this.field6203 = new int[arg3][arg4][];
        this.field6226 = new float[super.field3935 + 1][super.field3930 + 1];
        this.field6213 = new int[arg3][arg4][];
        this.field6227 = new float[super.field3935 + 1][super.field3930 + 1];
        this.field6221 = new class380[arg3][arg4][];
        this.field6222 = new byte[arg3][arg4];
        this.field6214 = new int[arg3][arg4][];
        this.field6230 = new byte[arg3 + 1][arg4 - -1];
        this.field6193 = new int[arg3][arg4][];
        this.field6198 = new int[arg3][arg4][];
        this.field6225 = new float[super.field3935 - -1][super.field3930 - -1];
        this.field6205 = new short[arg3 * arg4][];
        this.field6224 = 1 << this.field6217;
        for (int var9 = 1; ~var9 > ~super.field3930; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field3935; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 - -1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field6227[var10][var9] = (float) var11 * var13;
                this.field6225[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6226[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6237 = new class188(128);
        if (~(16 & this.field6199) != -1) {
            this.field6196 = new class474(this.field6223, this);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V", line = 178)
    public final void method1812(int arg0, int arg1) {
        ++field6210;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIII[[Z)V", line = 185)
    public final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6195;
        if (~this.field6233 < -1) {
            this.field6223.method912(6);
            this.field6223.method885(false, (byte) 83);
            this.field6223.method898(false, -25994);
            this.field6223.method879(false, 89);
            this.field6223.method881((byte) 87, false);
            this.field6223.method914(1, 0);
            this.field6223.method922(113, -2);
            this.field6223.method926((class210) null, 92);
            class480.field6793[14] = 0.0F;
            class480.field6793[5] = (float) arg2 / ((float) super.field3925 * 128.0F * (float) this.field6223.field1658);
            class480.field6793[9] = 0.0F;
            class480.field6793[6] = 0.0F;
            class480.field6793[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field6223.field1765;
            class480.field6793[8] = 0.0F;
            class480.field6793[4] = 0.0F;
            class480.field6793[15] = 1.0F;
            class480.field6793[7] = 0.0F;
            class480.field6793[1] = 0.0F;
            class480.field6793[3] = 0.0F;
            class480.field6793[11] = 0.0F;
            class480.field6793[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6223.field1658;
            class480.field6793[10] = 0.0F;
            class480.field6793[2] = 0.0F;
            class480.field6793[0] = (float) arg2 / ((float) super.field3925 * 128.0F * (float) this.field6223.field1765);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class480.field6793, 0);
            class480.field6793[6] = 1.0F;
            class480.field6793[4] = 0.0F;
            class480.field6793[9] = 1.0F;
            class480.field6793[14] = 0.0F;
            class480.field6793[0] = 1.0F;
            class480.field6793[11] = 0.0F;
            class480.field6793[10] = 0.0F;
            class480.field6793[15] = 1.0F;
            class480.field6793[3] = 0.0F;
            class480.field6793[5] = 0.0F;
            class480.field6793[1] = 0.0F;
            class480.field6793[13] = 0.0F;
            class480.field6793[8] = 0.0F;
            class480.field6793[7] = 0.0F;
            class480.field6793[12] = 0.0F;
            class480.field6793[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class480.field6793, 0);
            if (~(7 & this.field6199) != -1) {
                this.field6223.method898(true, -25994);
                this.field6223.method947(false);
            } else {
                this.field6223.method898(false, -25994);
            }
            this.field6223.method935(this.field6232, this.field6229, this.field6234, (byte) 125, this.field6231);
            if (this.field6211 * 2 > this.field6223.field1923.field9154.length) {
                this.field6223.field1923 = new class267(this.field6211 * 2);
            } else {
                this.field6223.field1923.field9146 = 0;
            }
            int var9 = 0;
            class267 var10 = this.field6223.field1923;
            if (!this.field6223.field1865) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field3935 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field6205[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    ++var9;
                                    var10.method3737(65535 & var14[var15], -1682769048);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field3935 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field6205[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method3745(-125, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class99 var17 = new class99(this.field6223, 5123, var10.field9154, var10.field9146);
                this.field6223.method919(111, 0, 4, var9, var17);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III[[ZZII)V", line = 354)
    public final void method1823(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field6197;
        this.method2643(arg0, arg3, -2, arg6, arg5, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[[ZIIIZII)V", line = 363)
    private final void method2643(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg2 != -2) {
            this.field6233 = 10;
        }
        if (this.field6235 != null) {
            int var9 = arg7 + arg7 + 1;
            int var10 = var9 * var9;
            if (~var10 < ~this.field6223.field1934.length) {
                this.field6223.field1934 = new int[var10];
            }
            if (~(this.field6211 * 2) < ~this.field6223.field1923.field9154.length) {
                this.field6223.field1923 = new class267(this.field6211 * 2);
            }
            int var11 = -arg7 + arg0;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg7 + arg6;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg0 + arg7;
            if (~var15 < ~(super.field3935 + -1)) {
                var15 = super.field3935 + -1;
            }
            int var16 = arg6 + arg7;
            if (~(super.field3930 - 1) > ~var16) {
                var16 = super.field3930 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field6223.field1934;
            for (int var19 = var11; var15 >= var19; ++var19) {
                boolean[] var25 = arg1[-var12 + var19];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field3935 * var26 + var19;
                    }
                }
            }
            if (arg4 != -1) {
                this.field6223.method952((float) arg4, (byte) -79);
                this.field6223.method910(-17);
            } else {
                this.field6223.method939(32);
            }
            this.field6223.method898(~(7 & this.field6199) != -1, arg2 + -25992);
            for (int var20 = 0; this.field6235.length > var20; ++var20) {
                this.field6235[var20].method2421(var17, (byte) -103, var18);
            }
            if (!this.field6209.method2757((byte) 27)) {
                int var21 = this.field6223.field1854;
                int var22 = this.field6223.field1840;
                this.field6223.method418(0, var22, this.field6223.field1831);
                this.field6223.method898(false, arg2 + -25992);
                this.field6223.method881((byte) 87, false);
                this.field6223.method914(1, 128);
                this.field6223.method922(75, -2);
                this.field6223.method926(this.field6223.field1838, 48);
                this.field6223.method946(false, 8448, 7681);
                this.field6223.method883((byte) 34, 0, 770, 34166);
                this.field6223.method948(34167, 0, 770, (byte) 122);
                for (class189 var23 = this.field6209.method2765(-12261); var23 != null; var23 = this.field6209.method2759(arg2 + -15359)) {
                    class110 var24 = (class110) var23;
                    var24.method784((byte) -125, arg7, arg1, arg0, arg6);
                }
                this.field6223.method883((byte) 34, 0, 768, 5890);
                this.field6223.method948(5890, 0, 770, (byte) 121);
                this.field6223.method926((class210) null, 100);
                this.field6223.method418(var21, var22, this.field6223.field1831);
            }
            if (this.field6196 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field6223.method935((class186) null, this.field6229, (class186) null, (byte) 113, this.field6231);
                this.field6196.method2833(arg5, arg1, arg6, (byte) -69, arg7, arg0);
                OpenGL.glPopMatrix();
            }
        }
        ++field6201;
    }

    @OriginalMember(owner = "client!io", name = "YA", descriptor = "()V", line = 511)
    public final void method1821() {
        if (this.field6233 <= 0) {
            this.field6196 = null;
        } else {
            byte[][] var1 = new byte[super.field3935 + 1][super.field3930 - -1];
            for (int var2 = 1; super.field3935 > var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field3930; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6230[var2][var103 - 1] >> 2) + (this.field6230[var2 + 1][var103] >> 3) + (this.field6230[var2][var103] >> 1) + (this.field6230[var2][var103 - -1] >> 3) + (this.field6230[var2 + -1][var103] >> 2));
                }
            }
            this.field6235 = new class380[this.field6237.method1177(-72)];
            this.field6237.method1181(this.field6235, -1);
            for (int var3 = 0; this.field6235.length > var3; ++var3) {
                this.field6235[var3].method2426(-68, this.field6233);
            }
            int var4 = 24;
            if (this.field6212 != null) {
                var4 += 4;
            }
            if ((7 & this.field6199) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field6223.field1788.method3649(this.field6233 * var4, false);
            Stream var6 = new Stream(var5);
            class380[] var7 = new class380[this.field6233];
            int var8 = class42.method282(-1350259935, this.field6233 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class188 var9 = new class188(var8);
            class380[] var10 = new class380[this.field6236];
            for (int var11 = 0; ~super.field3935 < ~var11; ++var11) {
                for (int var30 = 0; var30 < super.field3930; ++var30) {
                    if (this.field6213[var11][var30] != null) {
                        class380[] var31 = this.field6221[var11][var30];
                        int[] var32 = this.field6214[var11][var30];
                        int[] var33 = this.field6193[var11][var30];
                        int[] var34 = this.field6198[var11][var30];
                        int[] var35 = this.field6213[var11][var30];
                        int[] var36 = this.field6203 == null ? null : this.field6203[var11][var30];
                        int[] var37 = this.field6212 != null ? this.field6212[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field6227[var11][var30];
                        float var39 = this.field6225[var11][var30];
                        float var40 = this.field6226[var11][var30];
                        float var41 = this.field6227[var11][var30 + 1];
                        float var42 = this.field6225[var11][var30 + 1];
                        float var43 = this.field6226[var11][var30 + 1];
                        float var44 = this.field6227[var11 + 1][var30 + 1];
                        float var45 = this.field6225[var11 + 1][var30 + 1];
                        float var46 = this.field6226[var11 + 1][var30 - -1];
                        float var47 = this.field6227[var11 + 1][var30];
                        float var48 = this.field6225[var11 + 1][var30];
                        float var49 = this.field6226[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; var35.length > var55; ++var55) {
                            class380 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6205[super.field3935 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field3929) + var32[var57];
                            int var59 = (var30 << super.field3929) - -var33[var57];
                            int var60 = var58 >> this.field6217;
                            int var61 = var59 >> this.field6217;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var40;
                                var73 = var69 - var50;
                                var74 = var39;
                                var75 = var38;
                            } else if (~var67 == -1 && super.field3925 == var68) {
                                var75 = var41;
                                var73 = var69 - var51;
                                var74 = var42;
                                var72 = var43;
                            } else if (~super.field3925 == ~var67 && super.field3925 == var68) {
                                var74 = var45;
                                var75 = var44;
                                var73 = var69 - var52;
                                var72 = var46;
                            } else if (~super.field3925 == ~var67 && var68 == 0) {
                                var75 = var47;
                                var73 = var69 - var53;
                                var72 = var49;
                                var74 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field3925;
                                float var77 = (float) var68 / (float) super.field3925;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var74 = (-var79 + var82) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (-var78 + var81) * var77 + var78;
                                var72 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field3929) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field3929) + var51;
                                var73 = var69 - (((-var84 + var85) * var68 >> super.field3929) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class295.field4163[var86 | var62 & 65408];
                                if (~(this.field6199 & 7) == -1) {
                                    float var87 = this.field6223.field1845[2] * var72 + this.field6223.field1845[0] * var75 + this.field6223.field1845[1] * var74;
                                    var71 = var87 * (!(var87 > 0.0F) ? this.field6223.field1920 : this.field6223.field1892) + this.field6223.field1866;
                                }
                            }
                            class189 var88 = null;
                            if (~(this.field6224 + -1 & var58) == -1 && (this.field6224 + -1 & var59) == 0) {
                                var88 = var9.method1180((byte) 26, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class65) var88).field793;
                                var89 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var7[var89].field2546 < ~var31[var57].field2546) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (var62 == var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (var63 & 127) * var73 >> 7;
                                    if (var91 < 2) {
                                        var91 = 2;
                                    } else if (var91 > 126) {
                                        var91 = 126;
                                    }
                                    var90 = class295.field4163[65408 & var63 | var91];
                                    if (~(this.field6199 & 7) == -1) {
                                        float var92 = this.field6223.field1845[2] * var72 + this.field6223.field1845[1] * var74 + this.field6223.field1845[0] * var75;
                                        float var93 = var71 * (var71 > 0.0F ? this.field6223.field1892 : this.field6223.field1920) + this.field6223.field1866;
                                        int var94 = var90 >> 16 & 255;
                                        int var95 = (var90 & 65308) >> 8;
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (~var99 <= -1) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var98 << 8 | var97 << 16 | var99;
                                    }
                                }
                                if (!this.field6223.field1865) {
                                    var6.method3658((float) var58);
                                    var6.method3658((float) (this.method1815(var59, var58, -128) - -var64));
                                    var6.method3658((float) var59);
                                    var6.method3664((byte) (var90 >> 16));
                                    var6.method3664((byte) (var90 >> 8));
                                    var6.method3664((byte) var90);
                                    var6.method3664(-1);
                                    var6.method3658((float) var58);
                                    var6.method3658((float) var59);
                                    if (this.field6212 != null) {
                                        var6.method3658((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((7 & this.field6199) != 0) {
                                        var6.method3658(var75);
                                        var6.method3658(var74);
                                        var6.method3658(var72);
                                    }
                                } else {
                                    var6.method3666((float) var58);
                                    var6.method3666((float) (var64 + this.method1815(var59, var58, 55)));
                                    var6.method3666((float) var59);
                                    var6.method3664((byte) (var90 >> 16));
                                    var6.method3664((byte) (var90 >> 8));
                                    var6.method3664((byte) var90);
                                    var6.method3664(-1);
                                    var6.method3666((float) var58);
                                    var6.method3666((float) var59);
                                    if (this.field6212 != null) {
                                        var6.method3666((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field6199) != -1) {
                                        var6.method3666(var75);
                                        var6.method3666(var74);
                                        var6.method3666(var72);
                                    }
                                }
                                var89 = this.field6207++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1179(var65, new class65(var56[var57]), (byte) -26);
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method2420(255, var71, var73, var70, var89);
                            }
                            ++this.field6211;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field6207; ++var12) {
                class380 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2419(var12, (byte) 46);
                }
            }
            for (int var13 = 0; super.field3935 > var13; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field3930; ++var18) {
                    short[] var19 = this.field6205[super.field3935 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class380 var25 = var7[var22];
                            class380 var26 = var7[var23];
                            class380 var27 = var7[var24];
                            class380 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2425(var13, var18, var20, (byte) 59);
                            }
                            if (var26 != null) {
                                var26.method2425(var13, var18, var20, (byte) -109);
                                if (var28 == null || var28.field2546 > var26.field2546) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2425(var13, var18, var20, (byte) -125);
                                if (var28 == null || var27.field2546 < var28.field2546) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2419(var22, (byte) 46);
                                }
                                if (var26 != null) {
                                    var28.method2419(var23, (byte) 46);
                                }
                                if (var27 != null) {
                                    var28.method2419(var24, (byte) 46);
                                }
                                var28.method2425(var13, var18, var20, (byte) -108);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3656();
            this.field6228 = this.field6223.method920(var4, var5, 5890, false, var6.method3661());
            this.field6229 = new class186(this.field6228, 5126, 3, 0);
            this.field6234 = new class186(this.field6228, 5121, 4, 12);
            byte var14;
            if (this.field6212 == null) {
                this.field6231 = new class186(this.field6228, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field6231 = new class186(this.field6228, 5126, 3, 16);
            }
            if ((this.field6199 & 7) != 0) {
                this.field6232 = new class186(this.field6228, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6235.length];
            for (int var16 = 0; ~var16 > ~this.field6235.length; ++var16) {
                class380 var17 = this.field6235[var16];
                var15[var16] = var17.field2546;
                var17.method2424((byte) -99, this.field6207);
            }
            class135.method964(var15, 0, this.field6235);
            if (this.field6196 != null) {
                this.field6196.method2836(-106);
            }
        }
        ++field6215;
        this.field6212 = null;
        this.field6230 = null;
        this.field6227 = this.field6225 = this.field6226 = null;
        this.field6213 = null;
        this.field6203 = null;
        this.field6237 = null;
        this.field6198 = null;
        this.field6214 = this.field6193 = null;
        this.field6221 = null;
    }

    @OriginalMember(owner = "client!io", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1091)
    public final void method1818(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6218;
        class149 var15 = this.field6223.field715;
        if (arg3 != null && this.field6203 == null) {
            this.field6203 = new int[super.field3935][super.field3930][];
        }
        if (arg5 != null && this.field6212 == null) {
            this.field6212 = new int[super.field3935][super.field3930][];
        }
        this.field6214[arg0][arg1] = arg2;
        this.field6193[arg0][arg1] = arg4;
        this.field6213[arg0][arg1] = arg6;
        this.field6198[arg0][arg1] = arg7;
        if (this.field6212 != null) {
            this.field6212[arg0][arg1] = arg5;
        }
        if (this.field6203 != null) {
            this.field6203[arg0][arg1] = arg3;
        }
        class380[] var16 = this.field6221[arg0][arg1] = new class380[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field6199 & 32) != 0 && var18 != -1 && var15.method532((byte) 127, var18).field7194) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (var19 << 14);
            class189 var22;
            for (var22 = this.field6237.method1180((byte) 26, var20); var22 != null; var22 = this.field6237.method1174(0)) {
                class380 var23 = (class380) var22;
                if (~var23.field5457 == ~var18 && (float) var19 == var23.field5453 && ~var23.field5452 == ~arg10 && var23.field5436 == arg11 && ~var23.field5441 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class380(this, var18, var19, arg10, arg11, arg12);
                this.field6237.method1179(var20, var16[var17], (byte) -26);
            } else {
                var16[var17] = (class380) var22;
            }
        }
        if (arg13) {
            this.field6222[arg0][arg1] = (byte) class325.method2116(this.field6222[arg0][arg1], 1);
        }
        if (arg6.length > this.field6236) {
            this.field6236 = arg6.length;
        }
        this.field6233 += arg6.length;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1173)
    public final void method1825(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6220;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1818(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BIILlba;)V", line = 1263)
    private final void method2644(byte arg0, int arg1, int arg2, class549 arg3) {
        ++field6200;
        int[] var5 = this.field6214[arg1][arg2];
        int[] var6 = this.field6193[arg1][arg2];
        int var7 = var5.length;
        if (this.field6223.field1939.length < var7) {
            this.field6223.field1937 = new int[var7];
            this.field6223.field1939 = new int[var7];
        }
        int[] var8 = this.field6223.field1939;
        int[] var9 = this.field6223.field1937;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field6223.field1786;
            var9[var10] = var6[var10] >> this.field6223.field1786;
        }
        if (arg0 != 102) {
            this.method1818(105, 94, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 87, -123, 7, true);
        }
        int var11 = 0;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var15 - var17) * (-var14 + var12) + -((var16 - var14) * (-var13 + var15))) < -1) {
                arg3.method3180(var12, var14, var16, -122, var13, var15, var17);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1332)
    public final boolean method1813(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6206;
        if (this.field6196 != null && arg0 != null) {
            int var7 = arg1 - (this.field6223.field1879 * arg2 >> 8) >> this.field6223.field1786;
            int var8 = -(this.field6223.field1856 * arg2 >> 8) + arg3 >> this.field6223.field1786;
            return this.field6196.method2838(var8, arg0, var7, (byte) 104);
        } else {
            return false;
        }
    }
}

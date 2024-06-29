import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class295 extends class88 {

    @OriginalMember(owner = "client!wo", name = "Q", descriptor = "Lki;")
    private class364 field3852 = new class364();

    @OriginalMember(owner = "client!wo", name = "O", descriptor = "I")
    private int field3850 = this.field1168 - 2;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "[[I")
    private int[][] field3838;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "Lji;")
    public class622 field3845;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "[[[Lef;")
    private class178[][][] field3843;

    @OriginalMember(owner = "client!wo", name = "Y", descriptor = "[[F")
    private float[][] field3860;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "[[[I")
    private int[][][] field3836;

    @OriginalMember(owner = "client!wo", name = "X", descriptor = "[[F")
    private float[][] field3859;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "[[[I")
    public int[][][] field3828;

    @OriginalMember(owner = "client!wo", name = "Z", descriptor = "[[F")
    private float[][] field3861;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "[[B")
    private byte[][] field3824;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "[[[I")
    public int[][][] field3826;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "[[[I")
    public int[][][] field3847;

    @OriginalMember(owner = "client!wo", name = "R", descriptor = "[[S")
    public short[][] field3853;

    @OriginalMember(owner = "client!wo", name = "hb", descriptor = "[[B")
    private byte[][] field3869;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "[[[I")
    private int[][][] field3848;

    @OriginalMember(owner = "client!wo", name = "U", descriptor = "I")
    private int field3856;

    @OriginalMember(owner = "client!wo", name = "fb", descriptor = "Lbc;")
    private class9 field3867;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Ltfa;")
    private class614 field3829;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3842 = null;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "[I")
    public static int[] field3846 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "[B")
    public static byte[] field3819 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field3833 = -1;

    @OriginalMember(owner = "client!wo", name = "bb", descriptor = "[I")
    public static int[] field3863 = new int[1];

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!wo", name = "P", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!wo", name = "S", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!wo", name = "T", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!wo", name = "V", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!wo", name = "ab", descriptor = "I")
    private int field3862;

    @OriginalMember(owner = "client!wo", name = "db", descriptor = "I")
    private int field3865;

    @OriginalMember(owner = "client!wo", name = "eb", descriptor = "Lsj;")
    private class373 field3866;

    @OriginalMember(owner = "client!wo", name = "W", descriptor = "Lvv;")
    public class414 field3858;

    @OriginalMember(owner = "client!wo", name = "cb", descriptor = "Lvv;")
    private class414 field3864;

    @OriginalMember(owner = "client!wo", name = "ib", descriptor = "Lvv;")
    public class414 field3870;

    @OriginalMember(owner = "client!wo", name = "jb", descriptor = "Lvv;")
    public class414 field3871;

    @OriginalMember(owner = "client!wo", name = "gb", descriptor = "[Lef;")
    private class178[] field3868;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "[[[I")
    private int[][][] field3844;

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lji;IIII[[I[[II)V")
    public class295(class622 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3838 = arg5;
        this.field3845 = arg0;
        this.field3843 = new class178[arg3][arg4][];
        this.field3860 = new float[super.field1166 + 1][super.field1164 + 1];
        this.field3836 = new int[arg3][arg4][];
        this.field3859 = new float[super.field1166 + 1][super.field1164 + 1];
        this.field3835 = arg2;
        this.field3828 = new int[arg3][arg4][];
        this.field3861 = new float[super.field1166 + 1][super.field1164 - -1];
        this.field3824 = new byte[arg3][arg4];
        this.field3826 = new int[arg3][arg4][];
        this.field3847 = new int[arg3][arg4][];
        this.field3853 = new short[arg3 * arg4][];
        this.field3869 = new byte[arg3 - -1][arg4 + 1];
        this.field3848 = new int[arg3][arg4][];
        this.field3856 = 1 << this.field3850;
        for (int var9 = 1; ~super.field1164 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field1166 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 - -(arg7 * 4 * arg7) - -(var12 * var12))));
                this.field3859[var10][var9] = (float) var11 * var13;
                this.field3861[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3860[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3867 = new class9(128);
        if ((this.field3835 & 16) != 0) {
            this.field3829 = new class614(this.field3845, this);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIZ[[ZI)V")
    private final void method1746(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5, int arg6) {
        ++field3839;
        if (arg3 > 78) {
            if (this.field3868 != null) {
                int var8 = arg2 + 1 + arg2;
                int var9 = var8 * var8;
                if (this.field3845.field8719.length < var9) {
                    this.field3845.field8719 = new int[var9];
                }
                if (this.field3831 * 2 > this.field3845.field8654.field5393.length) {
                    this.field3845.field8654 = new class703(this.field3831 * 2);
                }
                int var10 = -arg2 + arg0;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = arg1 - arg2;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = arg0 + arg2;
                if (var14 > super.field1166 - 1) {
                    var14 = super.field1166 + -1;
                }
                int var15 = arg1 + arg2;
                if (super.field1164 + -1 < var15) {
                    var15 = super.field1164 + -1;
                }
                int var16 = 0;
                int[] var17 = this.field3845.field8719;
                for (int var18 = var10; ~var18 >= ~var14; ++var18) {
                    boolean[] var24 = arg5[var18 - var11];
                    for (int var25 = var12; ~var15 <= ~var25; ++var25) {
                        if (var24[var25 - var13]) {
                            var17[var16++] = super.field1166 * var25 + var18;
                        }
                    }
                }
                if (~arg6 != 0) {
                    this.field3845.method3413((byte) -9, (float) arg6);
                    this.field3845.method3458(-57);
                } else {
                    this.field3845.method3434((byte) 90);
                }
                this.field3845.method3425(~(this.field3835 & 7) != -1, 121);
                for (int var19 = 0; ~this.field3868.length < ~var19; ++var19) {
                    this.field3868[var19].method1193(var16, var17, (byte) -126);
                }
                if (!this.field3852.method2093(-2)) {
                    int var20 = this.field3845.field8716;
                    int var21 = this.field3845.field8647;
                    this.field3845.method404(0, var21, this.field3845.field8675);
                    this.field3845.method3425(false, 120);
                    this.field3845.method3424(false, -32);
                    this.field3845.method3403(128, -3);
                    this.field3845.method3459((byte) 0, -2);
                    this.field3845.method3388(this.field3845.field8652, false);
                    this.field3845.method3462(7681, -5882, 8448);
                    this.field3845.method3453(false, 770, 34166, 0);
                    this.field3845.method3389((byte) 88, 770, 0, 34167);
                    for (class424 var22 = this.field3852.method2090(true); var22 != null; var22 = this.field3852.method2088(-152)) {
                        class211 var23 = (class211) var22;
                        var23.method1360(arg1, arg0, 255, arg5, arg2);
                    }
                    this.field3845.method3453(false, 768, 5890, 0);
                    this.field3845.method3389((byte) 71, 770, 0, 5890);
                    this.field3845.method3388((class710) null, false);
                    this.field3845.method404(var20, var21, this.field3845.field8675);
                }
                if (this.field3829 != null) {
                    this.field3845.method3420((class414) null, this.field3871, true, (class414) null, this.field3858);
                    this.field3829.method3330(arg5, 126, arg2, arg0, arg1, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(IILw;)Lw;")
    public final class605 method664(int arg0, int arg1, class605 arg2) {
        ++field3822;
        if ((this.field3824[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field1163 >> this.field3845.field8571;
            class680 var5 = (class680) arg2;
            class680 var6;
            if (var5 != null && var5.method3737(var4, var4, (byte) -108)) {
                var6 = var5;
                var5.method3741((byte) -70);
            } else {
                var6 = new class680(this.field3845, var4, var4);
            }
            var6.method3738(0, 0, 0, var4, var4);
            this.method1747(arg0, (byte) 113, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wo", name = "EA", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field3869[arg0][arg1])) {
            this.field3869[arg0][arg1] = (byte) arg2;
        }
        ++field3857;
    }

    @OriginalMember(owner = "client!wo", name = "JA", descriptor = "(II)I")
    public final int method668(int arg0, int arg1) {
        ++field3854;
        return this.field3838[arg0][arg1];
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III[[ZZ)V")
    public final void method660(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field3834;
        this.method1746(arg0, arg1, arg2, 85, arg4, arg3, -1);
    }

    @OriginalMember(owner = "client!wo", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method666(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3830;
        if (this.field3829 != null && arg0 != null) {
            int var7 = arg1 - (this.field3845.field8596 * arg2 >> 8) >> this.field3845.field8571;
            int var8 = -(this.field3845.field8648 * arg2 >> 8) + arg3 >> this.field3845.field8571;
            this.field3829.method3336((byte) 98, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!wo", name = "sa", descriptor = "(II)I")
    public final int method669(int arg0, int arg1) {
        ++field3827;
        int var3 = arg0 >> super.field1168;
        int var4 = arg1 >> super.field1168;
        if (var3 >= 0 && var4 >= 0 && ~var3 >= ~(super.field1166 - 1) && super.field1164 + -1 >= var4) {
            int var5 = super.field1163 - 1 & arg0;
            int var6 = super.field1163 - 1 & arg1;
            int var7 = (super.field1163 - var5) * this.field3838[var3][var4] - -(this.field3838[var3 - -1][var4] * var5) >> super.field1168;
            int var8 = (-var5 + super.field1163) * this.field3838[var3][var4 - -1] + this.field3838[var3 + 1][var4 - -1] * var5 >> super.field1168;
            return (-var6 + super.field1163) * var7 + var6 * var8 >> super.field1168;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3821;
        if (this.field3862 > 0) {
            this.field3845.method3407((byte) 105);
            this.field3845.method3393(false, -11594);
            this.field3845.method3425(false, 91);
            this.field3845.method3439(false, (byte) -96);
            this.field3845.method3424(false, -32);
            this.field3845.method3403(0, -3);
            this.field3845.method3459((byte) 122, -2);
            this.field3845.method3388((class710) null, false);
            class188.field2417[0] = (float) arg2 / ((float) super.field1163 * 128.0F * (float) this.field3845.field8503);
            class188.field2417[9] = 0.0F;
            class188.field2417[2] = 0.0F;
            class188.field2417[11] = 0.0F;
            class188.field2417[1] = 0.0F;
            class188.field2417[14] = 0.0F;
            class188.field2417[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3845.field8407;
            class188.field2417[7] = 0.0F;
            class188.field2417[10] = 0.0F;
            class188.field2417[6] = 0.0F;
            class188.field2417[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3845.field8503) + -1.0F;
            class188.field2417[4] = 0.0F;
            class188.field2417[15] = 1.0F;
            class188.field2417[3] = 0.0F;
            class188.field2417[8] = 0.0F;
            class188.field2417[5] = (float) arg2 / ((float) super.field1163 * 128.0F * (float) this.field3845.field8407);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class188.field2417, 0);
            class188.field2417[10] = 0.0F;
            class188.field2417[14] = 0.0F;
            class188.field2417[15] = 1.0F;
            class188.field2417[0] = 1.0F;
            class188.field2417[2] = 0.0F;
            class188.field2417[1] = 0.0F;
            class188.field2417[11] = 0.0F;
            class188.field2417[5] = 0.0F;
            class188.field2417[9] = 1.0F;
            class188.field2417[4] = 0.0F;
            class188.field2417[6] = 1.0F;
            class188.field2417[13] = 0.0F;
            class188.field2417[12] = 0.0F;
            class188.field2417[3] = 0.0F;
            class188.field2417[8] = 0.0F;
            class188.field2417[7] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class188.field2417, 0);
            if ((this.field3835 & 7) != 0) {
                this.field3845.method3425(true, 115);
                this.field3845.method3399((byte) 85);
            } else {
                this.field3845.method3425(false, 94);
            }
            this.field3845.method3420(this.field3864, this.field3871, true, this.field3870, this.field3858);
            if (~this.field3845.field8654.field5393.length > ~(this.field3831 * 2)) {
                this.field3845.field8654 = new class703(this.field3831 * 2);
            } else {
                this.field3845.field8654.field5367 = 0;
            }
            int var9 = 0;
            class703 var10 = this.field3845.field8654;
            if (this.field3845.field8631) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field1166 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field3853[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method2386(65535 & var14[var15], 1103587288);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field1166 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field3853[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method2356(65535 & var20[var21], -18174);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class333 var17 = new class333(this.field3845, 5123, var10.field5393, var10.field5367);
                this.field3845.method3464(var9, 4, var17, 107, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBILbf;)V")
    private final void method1747(int arg0, byte arg1, int arg2, class680 arg3) {
        ++field3825;
        int[] var5 = this.field3847[arg0][arg2];
        int[] var6 = this.field3828[arg0][arg2];
        int var7 = var5.length;
        if (arg1 >= 49) {
            if (this.field3845.field8718.length < var7) {
                this.field3845.field8717 = new int[var7];
                this.field3845.field8718 = new int[var7];
            }
            int[] var8 = this.field3845.field8718;
            int[] var9 = this.field3845.field8717;
            for (int var10 = 0; var7 > var10; ++var10) {
                var8[var10] = var5[var10] >> this.field3845.field8571;
                var9[var10] = var6[var10] >> this.field3845.field8571;
            }
            int var11 = 0;
            while (~var11 > ~var7) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((var12 - var14) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                    arg3.method3740(var13, 781914992, var16, var14, var15, var17, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)V")
    public static final void method1748(int arg0, int arg1) {
        if (arg0 >= -107) {
            field3819 = null;
        }
        ++field3849;
        class367 var2 = class573.method3057(9, arg1, 2);
        var2.method2113(120);
    }

    @OriginalMember(owner = "client!wo", name = "ba", descriptor = "()V")
    public final void method663() {
        ++field3855;
        if (this.field3862 <= 0) {
            this.field3829 = null;
        } else {
            byte[][] var1 = new byte[super.field1166 + 1][super.field1164 + 1];
            for (int var2 = 1; var2 < super.field1166; ++var2) {
                for (int var103 = 1; super.field1164 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3869[var2][var103 + 1] >> 3) + (this.field3869[var2][var103 - 1] >> 2) + (this.field3869[var2 + 1][var103] >> 3) + (this.field3869[var2 + -1][var103] >> 2) + (this.field3869[var2][var103] >> 1));
                }
            }
            this.field3868 = new class178[this.field3867.method43((byte) 52)];
            this.field3867.method48(27731, this.field3868);
            for (int var3 = 0; this.field3868.length > var3; ++var3) {
                this.field3868[var3].method1197(true, this.field3862);
            }
            int var4 = 24;
            if (this.field3844 != null) {
                var4 += 4;
            }
            if ((7 & this.field3835) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3845.field8572.method1950(this.field3862 * var4, false);
            Stream var6 = new Stream(var5);
            class178[] var7 = new class178[this.field3862];
            int var8 = class71.method571(this.field3862 / 4, (byte) 114);
            if (~var8 > -2) {
                var8 = 1;
            }
            class9 var9 = new class9(var8);
            class178[] var10 = new class178[this.field3865];
            for (int var11 = 0; super.field1166 > var11; ++var11) {
                for (int var30 = 0; ~super.field1164 < ~var30; ++var30) {
                    if (this.field3826[var11][var30] != null) {
                        class178[] var31 = this.field3843[var11][var30];
                        int[] var32 = this.field3847[var11][var30];
                        int[] var33 = this.field3828[var11][var30];
                        int[] var34 = this.field3848[var11][var30];
                        int[] var35 = this.field3826[var11][var30];
                        int[] var36 = this.field3836 != null ? this.field3836[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field3844 == null ? null : this.field3844[var11][var30];
                        float var38 = this.field3859[var11][var30];
                        float var39 = this.field3861[var11][var30];
                        float var40 = this.field3860[var11][var30];
                        float var41 = this.field3859[var11][var30 + 1];
                        float var42 = this.field3861[var11][var30 + 1];
                        float var43 = this.field3860[var11][var30 + 1];
                        float var44 = this.field3859[var11 + 1][var30 + 1];
                        float var45 = this.field3861[var11 - -1][var30 + 1];
                        float var46 = this.field3860[var11 + 1][var30 + 1];
                        float var47 = this.field3859[var11 + 1][var30];
                        float var48 = this.field3861[var11 + 1][var30];
                        float var49 = this.field3860[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label336: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class178 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label336;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3853[super.field1166 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field1168) - -var32[var57];
                            int var59 = (var30 << super.field1168) + var33[var57];
                            int var60 = var58 >> this.field3850;
                            int var61 = var59 >> this.field3850;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var39;
                                var73 = var38;
                                var74 = var69 - var50;
                                var75 = var40;
                            } else if (~var67 == -1 && ~super.field1163 == ~var68) {
                                var73 = var41;
                                var72 = var42;
                                var75 = var43;
                                var74 = var69 - var51;
                            } else if (super.field1163 == var67 && ~super.field1163 == ~var68) {
                                var74 = var69 - var52;
                                var72 = var45;
                                var73 = var44;
                                var75 = var46;
                            } else if (super.field1163 == var67 && ~var68 == -1) {
                                var74 = var69 - var53;
                                var75 = var49;
                                var72 = var48;
                                var73 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field1163;
                                float var77 = (float) var68 / (float) super.field1163;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var72 = (-var79 + var82) * var77 + var79;
                                var73 = (-var78 + var81) * var77 + var78;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var75 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field1168) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field1168) + var51;
                                var74 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field1168));
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class505.field6642[var86 | 65408 & var62];
                                if ((7 & this.field3835) == 0) {
                                    float var87 = this.field3845.field8645[2] * var75 + this.field3845.field8645[1] * var72 + this.field3845.field8645[0] * var73;
                                    var71 = (!(var87 > 0.0F) ? this.field3845.field8684 : this.field3845.field8641) * var87 + this.field3845.field8712;
                                }
                            }
                            class424 var88 = null;
                            if ((this.field3856 + -1 & var58) == 0 && (this.field3856 + -1 & var59) == 0) {
                                var88 = var9.method39(var65, 31750);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class419) var88).field5426;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && ~var31[var57].field5499 > ~var7[var89].field5499) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (~var62 != ~var63) {
                                    int var90 = (127 & var63) * var74 >> 7;
                                    if (~var90 <= -3) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var91 = class505.field6642[var90 | var63 & 65408];
                                    if (~(7 & this.field3835) == -1) {
                                        float var92 = this.field3845.field8645[2] * var75 + this.field3845.field8645[1] * var72 + this.field3845.field8645[0] * var73;
                                        float var93 = (!(var71 > 0.0F) ? this.field3845.field8684 : this.field3845.field8641) * var71 + this.field3845.field8712;
                                        int var94 = (var91 & 16756661) >> 16;
                                        int var95 = (65422 & var91) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = var91 & 255;
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var96 >= 0) {
                                            if (~var96 < -256) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var96 << 16 | var98 << 8 | var99;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (!this.field3845.field8631) {
                                    var6.method1956((float) var58);
                                    var6.method1956((float) (this.method669(var58, var59) - -var64));
                                    var6.method1956((float) var59);
                                    var6.method1957((byte) (var91 >> 16));
                                    var6.method1957((byte) (var91 >> 8));
                                    var6.method1957((byte) var91);
                                    var6.method1957(-1);
                                    var6.method1956((float) var58);
                                    var6.method1956((float) var59);
                                    if (this.field3844 != null) {
                                        var6.method1956((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field3835) != -1) {
                                        var6.method1956(var73);
                                        var6.method1956(var72);
                                        var6.method1956(var75);
                                    }
                                } else {
                                    var6.method1958((float) var58);
                                    var6.method1958((float) (var64 + this.method669(var58, var59)));
                                    var6.method1958((float) var59);
                                    var6.method1957((byte) (var91 >> 16));
                                    var6.method1957((byte) (var91 >> 8));
                                    var6.method1957((byte) var91);
                                    var6.method1957(-1);
                                    var6.method1958((float) var58);
                                    var6.method1958((float) var59);
                                    if (this.field3844 != null) {
                                        var6.method1958((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(this.field3835 & 7) != -1) {
                                        var6.method1958(var73);
                                        var6.method1958(var72);
                                        var6.method1958(var75);
                                    }
                                }
                                var89 = this.field3841++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method38(new class419(var56[var57]), 70, var65);
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method1196(var74, 127, var71, var89, var70);
                            }
                            ++this.field3831;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field3841; ++var12) {
                class178 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1192((byte) 63, var12);
                }
            }
            for (int var13 = 0; ~super.field1166 < ~var13; ++var13) {
                for (int var18 = 0; var18 < super.field1164; ++var18) {
                    short[] var19 = this.field3853[super.field1166 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class178 var25 = var7[var22];
                            class178 var26 = var7[var23];
                            class178 var27 = var7[var24];
                            class178 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1195(var13, false, var18, var20);
                            }
                            if (var26 != null) {
                                var26.method1195(var13, false, var18, var20);
                                if (var28 == null || ~var26.field5499 > ~var28.field5499) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1195(var13, false, var18, var20);
                                if (var28 == null || ~var27.field5499 > ~var28.field5499) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1192((byte) 56, var22);
                                }
                                if (var26 != null) {
                                    var28.method1192((byte) 121, var23);
                                }
                                if (var27 != null) {
                                    var28.method1192((byte) 90, var24);
                                }
                                var28.method1195(var13, false, var18, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method1955();
            this.field3866 = this.field3845.method3384(false, 8222, var5, var4, var6.method1967());
            this.field3858 = new class414(this.field3866, 5126, 3, 0);
            this.field3864 = new class414(this.field3866, 5121, 4, 12);
            byte var14;
            if (this.field3844 != null) {
                var14 = 28;
                this.field3871 = new class414(this.field3866, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field3871 = new class414(this.field3866, 5126, 2, 16);
            }
            if ((7 & this.field3835) != 0) {
                this.field3870 = new class414(this.field3866, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3868.length];
            for (int var16 = 0; ~this.field3868.length < ~var16; ++var16) {
                class178 var17 = this.field3868[var16];
                var15[var16] = var17.field5499;
                var17.method1194(0, this.field3841);
            }
            class3.method9(var15, this.field3868, 5595);
            if (this.field3829 != null) {
                this.field3829.method3332(1);
            }
        }
        this.field3867 = null;
        this.field3869 = null;
        this.field3847 = this.field3828 = null;
        this.field3844 = null;
        this.field3859 = this.field3861 = this.field3860 = null;
        this.field3836 = null;
        this.field3826 = null;
        this.field3848 = null;
        this.field3843 = null;
    }

    @OriginalMember(owner = "client!wo", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method658(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field3844 == null) {
            this.field3844 = new int[super.field1166][super.field1164][];
        }
        ++field3823;
        if (arg3 != null && this.field3836 == null) {
            this.field3836 = new int[super.field1166][super.field1164][];
        }
        this.field3847[arg0][arg1] = arg2;
        this.field3828[arg0][arg1] = arg4;
        this.field3826[arg0][arg1] = arg6;
        this.field3848[arg0][arg1] = arg7;
        if (this.field3844 != null) {
            this.field3844[arg0][arg1] = arg5;
        }
        if (this.field3836 != null) {
            this.field3836[arg0][arg1] = arg3;
        }
        class178[] var15 = this.field3843[arg0][arg1] = new class178[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[var16];
            class424 var19;
            for (var19 = this.field3867.method39(var17, 31750); var19 != null; var19 = this.field3867.method46(0)) {
                class178 var20 = (class178) var19;
                if (~arg8[var16] == ~var20.field2213 && (float) arg9[var16] == var20.field2208 && var20.field2218 == arg10 && var20.field2219 == arg11 && var20.field2210 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class178(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3867.method38(var15[var16], -100, var17);
            } else {
                var15[var16] = (class178) var19;
            }
        }
        if (arg13) {
            this.field3824[arg0][arg1] = (byte) class131.method954(this.field3824[arg0][arg1], 1);
        }
        if (~this.field3865 > ~arg6.length) {
            this.field3865 = arg6.length;
        }
        this.field3862 += arg6.length;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lpn;[I)V")
    public final void method672(class296 arg0, int[] arg1) {
        ++field3837;
        this.field3852.method2087(new class211(this.field3845, this, arg0, arg1), -124);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method661(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3820;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method658(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
    public final void method659(int arg0, int arg1) {
        ++field3851;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static void method1749(int arg0) {
        field3846 = null;
        field3842 = null;
        field3863 = null;
        if (arg0 != 10103) {
            field3819 = null;
        }
        field3819 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method665(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3840;
        if (this.field3829 != null && arg0 != null) {
            int var7 = arg1 - (this.field3845.field8596 * arg2 >> 8) >> this.field3845.field8571;
            int var8 = arg3 - (this.field3845.field8648 * arg2 >> 8) >> this.field3845.field8571;
            return this.field3829.method3333(var7, arg0, var8, 29733);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method667(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3832;
        if (this.field3829 != null && arg0 != null) {
            int var7 = -(this.field3845.field8596 * arg2 >> 8) + arg1 >> this.field3845.field8571;
            int var8 = -(this.field3845.field8648 * arg2 >> 8) + arg3 >> this.field3845.field8571;
            this.field3829.method3335(var8, (byte) 111, arg0, var7);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class611 extends class82 {

    @OriginalMember(owner = "client!jn", name = "X", descriptor = "I")
    private int field8870 = 0;

    @OriginalMember(owner = "client!jn", name = "ab", descriptor = "[S")
    private short[] field8873 = new short[257];

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "I")
    public static int field8865 = 0;

    @OriginalMember(owner = "client!jn", name = "W", descriptor = "Z")
    public static boolean field8869 = false;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!jn", name = "U", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!jn", name = "V", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!jn", name = "Z", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!jn", name = "bb", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!jn", name = "Y", descriptor = "Lf;")
    public static class642 field8871;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "[I")
    private int[] field8862;

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "[I")
    private int[] field8864;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "[[I")
    private int[][] field8861;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V", line = 3)
    private final void method3511(int arg0) {
        ++field8866;
        int[] var2 = this.field8861[0];
        if (arg0 != -16993) {
            this.method198(-26, 98, (class374) null);
        }
        int[] var3 = this.field8861[1];
        int[] var4 = this.field8861[this.field8861.length + -2];
        int[] var5 = this.field8861[this.field8861.length + -1];
        this.field8862 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] + -var5[1] + var4[1] };
        this.field8864 = new int[] { var2[0] + var2[0] - var3[0], var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V", line = 24)
    public final void method438(int arg0) {
        if (this.field8861 == null) {
            this.field8861 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field8859;
        if (~this.field8861.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field8870 == 2) {
                this.method3511(arg0 + -16991);
            }
            class623.method3571(-93);
            this.method3512((byte) 59);
            if (arg0 != -2) {
                field8869 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 46)
    private final void method3512(byte arg0) {
        int var2 = this.field8870;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field8861.length + -1 && this.field8861[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field8861[var5 + -1];
                    int[] var7 = this.field8861[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class326.field4164[(var8 & 8173) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field8873[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field8861.length + -1) && ~var13 <= ~this.field8861[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field8861[var14 - 1];
                    int[] var16 = this.field8861[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field8873[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field8861.length - 1) < ~var22 && var21 >= this.field8861[var22][0]; ++var22) {
                }
                int[] var23 = this.field8861[var22 + -1];
                int[] var24 = this.field8861[var22];
                int var25 = this.method3515(true, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3515(true, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 + var26 - var27;
                int var32 = var25 - var26 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field8873[var20] = (short) var38;
            }
        }
        if (arg0 != 59) {
            this.field8861 = null;
        }
        ++field8863;
    }

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "(I)V", line = 226)
    public static void method3513(int arg0) {
        if (arg0 == -17303) {
            field8871 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)[I", line = 238)
    public final int[] method201(int arg0, int arg1) {
        ++field8867;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 0, arg0);
            for (int var5 = 0; ~class629.field9033 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field8873[var6];
            }
        }
        if (arg1 != 12218) {
            this.method3515(true, -35);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILos;)V", line = 279)
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (arg0 == 0) {
            this.field8870 = arg2.method2129(-97);
            this.field8861 = new int[arg2.method2129(-73)][2];
            for (int var4 = 0; var4 < this.field8861.length; ++var4) {
                this.field8861[var4][0] = arg2.method2136(false);
                this.field8861[var4][1] = arg2.method2136(false);
            }
        }
        ++field8868;
        int var5 = -66 / ((-69 - arg1) / 42);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V", line = 308)
    public static final void method3514() {
        if (class593.field8615 != null) {
            for (int var0 = 0; var0 < class593.field8615.length; ++var0) {
                for (int var1 = 0; var1 < class238.field2985; ++var1) {
                    for (int var2 = 0; var2 < class548.field8061; ++var2) {
                        if (class593.field8615[var0][var1][var2] != null) {
                            class593.field8615[var0][var1][var2].method1946(51);
                        }
                        class593.field8615[var0][var1][var2] = null;
                    }
                }
            }
        }
        class593.field8615 = null;
        class90.field1114 = null;
        if (class292.field3786 != null) {
            for (int var3 = 0; var3 < class292.field3786.length; ++var3) {
                for (int var4 = 0; var4 < class238.field2985; ++var4) {
                    for (int var5 = 0; var5 < class548.field8061; ++var5) {
                        if (class292.field3786[var3][var4][var5] != null) {
                            class292.field3786[var3][var4][var5].method1946(83);
                        }
                        class292.field3786[var3][var4][var5] = null;
                    }
                }
            }
        }
        class292.field3786 = null;
        class370.field4884 = null;
        class383.field5070 = null;
        class128.field1574 = null;
        class107.field1339 = 0;
        if (class194.field2349 != null) {
            for (int var6 = 0; var6 < class107.field1339; ++var6) {
                class194.field2349[var6] = null;
            }
        }
        if (class539.field7889 != null) {
            for (int var7 = 0; var7 < class639.field9193; ++var7) {
                class539.field7889[var7] = null;
            }
            class639.field9193 = 0;
        }
        if (class602.field8699 != null) {
            for (int var8 = 0; var8 < class460.field6344; ++var8) {
                class602.field8699[var8] = null;
            }
            for (int var9 = 0; var9 < client.field3216; ++var9) {
                for (int var10 = 0; var10 < class238.field2985; ++var10) {
                    for (int var11 = 0; var11 < class548.field8061; ++var11) {
                        class209.field2558[var9][var10][var11] = 0L;
                    }
                }
            }
            class460.field6344 = 0;
        }
        class297.field3815 = null;
        class543.method3179(0);
        class504.field6989.method1985(0);
        class640.field9217 = null;
        class523.field7333 = null;
        class597.field8645 = null;
        class367.field4820 = null;
        class617.field8932 = null;
        class638.field9190 = null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 455)
    public class611() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)[I", line = 462)
    private final int[] method3515(boolean arg0, int arg1) {
        ++field8860;
        if (~arg1 > -1) {
            return this.field8864;
        } else {
            if (!arg0) {
                this.field8870 = 97;
            }
            return ~arg1 <= ~this.field8861.length ? this.field8862 : this.field8861[arg1];
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[FFIIIIIII)V", line = 483)
    public static final void method3516(int arg0, float[] arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg4 - arg3;
        int var11 = arg0 - arg8;
        int var12 = arg6 - arg7;
        ++field8874;
        int var13 = 57 / ((25 - arg9) / 52);
        float var14 = arg1[2] * (float) var11 + arg1[1] * (float) var10 + arg1[0] * (float) var12;
        float var15 = arg1[5] * (float) var11 + arg1[4] * (float) var10 + arg1[3] * (float) var12;
        float var16 = arg1[8] * (float) var11 + arg1[7] * (float) var10 + arg1[6] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
        float var19 = 0.5F + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg2;
        if (arg5 != 1) {
            if (arg5 != 2) {
                if (~arg5 == -4) {
                    float var20 = var18;
                    var18 = var19;
                    var19 = -var20;
                }
            } else {
                var18 = -var18;
                var19 = -var19;
            }
        } else {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        }
        class459.field6324 = var19;
        class362.field4768 = var18;
    }
}

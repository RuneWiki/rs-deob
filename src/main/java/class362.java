import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class362 extends class512 {

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    private int field5631 = 0;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "[S")
    private short[] field5638 = new short[257];

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "[C")
    public static char[] field5643 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "F")
    public static float field5633;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Lqs;")
    public static class496 field5635;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lqs;")
    public static class496 field5639;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
    private int[] field5640;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "[I")
    private int[] field5645;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field5642;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "[[I")
    private int[][] field5646;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V", line = 4)
    public final void method74(int arg0) {
        if (this.field5646 == null) {
            this.field5646 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field5644;
        if (this.field5646.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field5631 == -3) {
                this.method2313(3342);
            }
            class187.method1265(256);
            this.method2312(21987);
            if (arg0 != 12388) {
                this.method2314(49, (byte) 10);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 28)
    private final void method2312(int arg0) {
        ++field5641;
        int var2 = this.field5631;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field5646.length + -1 && var4 >= this.field5646[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5646[var5 + -1];
                    int[] var7 = this.field5646[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class162.field2583[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field5638[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field5646.length - 1) < ~var14 && var13 >= this.field5646[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5646[var14 + -1];
                    int[] var16 = this.field5646[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5638[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field5646.length + -1) && ~this.field5646[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field5646[var22 - 1];
                int[] var24 = this.field5646[var22];
                int var25 = this.method2314(var22 + -2, (byte) 87)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2314(var22 + 1, (byte) 92)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - (var27 - -var25) + var26;
                int var32 = var25 - var26 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 - -var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field5638[var20] = (short) var38;
            }
        }
        if (arg0 != 21987) {
            this.field5646 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)[I", line = 209)
    public final int[] method75(int arg0, byte arg1) {
        ++field5636;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var4 = this.method3013(false, 0, arg0);
            for (int var5 = 0; ~class402.field6113 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5638[var6];
            }
        }
        int var7 = 116 % ((arg1 - 43) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 253)
    public class362() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V", line = 257)
    private final void method2313(int arg0) {
        ++field5637;
        if (arg0 == 3342) {
            int[] var2 = this.field5646[0];
            int[] var3 = this.field5646[1];
            int[] var4 = this.field5646[this.field5646.length + -2];
            int[] var5 = this.field5646[this.field5646.length - 1];
            this.field5645 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + var4[1] + -var5[1] };
            this.field5640 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] - var3[1] - -var2[1] };
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)[I", line = 281)
    private final int[] method2314(int arg0, byte arg1) {
        ++field5634;
        int var3 = 35 % ((arg1 - -29) / 46);
        if (~arg0 > -1) {
            return this.field5640;
        } else {
            return arg0 >= this.field5646.length ? this.field5645 : this.field5646[arg0];
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZILia;)V", line = 309)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field5632;
        if (!arg0) {
            this.method2312(-70);
        }
        if (~arg1 == -1) {
            this.field5631 = arg2.method126((byte) -76);
            this.field5646 = new int[arg2.method126((byte) -94)][2];
            for (int var4 = 0; var4 < this.field5646.length; ++var4) {
                this.field5646[var4][0] = arg2.method132(102);
                this.field5646[var4][1] = arg2.method132(36);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lec;ZIIJLta;III)V", line = 339)
    public static final void method2315(class68 arg0, boolean arg1, int arg2, int arg3, long arg4, class448 arg5, int arg6, int arg7, int arg8) {
        ++field5647;
        int var10 = arg7 * arg7 + arg8 * arg8;
        if ((long) var10 <= arg4) {
            if (arg1) {
                field5643 = null;
            }
            int var11 = Math.min(arg0.field1009 / 2, arg0.field1081 / 2);
            if (~(var11 * var11) > ~var10) {
                var11 -= 10;
                int var12;
                if (class190.field2963 == 4) {
                    var12 = 16383 & (int) class88.field1483;
                } else {
                    var12 = 16383 & (int) class88.field1483 + class227.field3959;
                }
                int var13 = class46.field757[var12];
                int var14 = class46.field755[var12];
                if (~class190.field2963 != -5) {
                    var14 = var14 * 256 / (class435.field6507 - -256);
                    var13 = var13 * 256 / (class435.field6507 - -256);
                }
                int var15 = arg7 * var13 + arg8 * var14 >> 15;
                int var16 = arg7 * var14 + -(arg8 * var13) >> 15;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var11);
                int var20 = (int) (Math.cos(var17) * (double) var11);
                class496.field7257[arg6].method1034((float) arg0.field1009 / 2.0F + (float) arg2 + (float) var19, (float) arg0.field1081 / 2.0F + (float) arg3 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            } else {
                class340.method2147(arg2, arg8, arg3, class502.field7337[arg6], arg5, arg7, 2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "(I)V", line = 394)
    public static void method2316(int arg0) {
        field5635 = null;
        field5642 = null;
        field5643 = null;
        if (arg0 > 64) {
            field5639 = null;
        }
    }
}

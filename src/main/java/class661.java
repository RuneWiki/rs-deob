import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class661 extends class56 {

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    private int field9072 = 0;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "[S")
    private short[] field9067 = new short[257];

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "[I")
    public static int[] field9068 = new int[2];

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "[I")
    private int[] field9073;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "[I")
    private int[] field9076;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "[[I")
    private int[][] field9074;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    private final void method3712(int arg0) {
        ++field9069;
        int var2 = this.field9072;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field9074.length + -1) < ~var5 && this.field9074[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field9074[var5 - 1];
                    int[] var7 = this.field9074[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class285.field3332[(var8 & 8163) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field9067[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field9074.length + -1 > var14 && ~var13 <= ~this.field9074[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field9074[var14 + -1];
                    int[] var16 = this.field9074[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field9067[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field9074.length - 1) && ~this.field9074[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field9074[var22 + -1];
                int[] var24 = this.field9074[var22];
                int var25 = this.method3716(-1, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3716(-1, var22 - -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + var28 - var27;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var35 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field9067[var20] = (short) var38;
            }
        }
        if (arg0 != 1458664868) {
            this.field9074 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
    public static void method3713(int arg0) {
        if (arg0 >= -92) {
            field9068 = null;
        }
        field9068 = null;
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)V")
    public static final void method3714(int arg0) {
        ++field9077;
        class583.field7964.method2800(8);
        int var1 = class583.field7964.method2802(8, -20468);
        if (~var1 > ~class3.field42) {
            for (int var2 = var1; var2 < class3.field42; ++var2) {
                class728.field10197[class274.field3218++] = class2.field29[var2];
            }
        }
        if (~class3.field42 > ~var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class3.field42 = 0;
            if (arg0 > -105) {
                method3714(9);
            }
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class2.field29[var3];
                class388 var5 = ((class273) class30.field444.method2121(100, (long) var4)).field3210;
                int var6 = class583.field7964.method2802(1, -20468);
                if (var6 == 0) {
                    class2.field29[class3.field42++] = var4;
                    var5.field3422 = class537.field7557;
                } else {
                    int var7 = class583.field7964.method2802(2, -20468);
                    if (var7 == 0) {
                        class2.field29[class3.field42++] = var4;
                        var5.field3422 = class537.field7557;
                        class7.field123[class358.field4430++] = var4;
                    } else if (~var7 == -2) {
                        class2.field29[class3.field42++] = var4;
                        var5.field3422 = class537.field7557;
                        int var8 = class583.field7964.method2802(3, -20468);
                        var5.method2273(1, var8, 0);
                        int var9 = class583.field7964.method2802(1, -20468);
                        if (var9 == 1) {
                            class7.field123[class358.field4430++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class2.field29[class3.field42++] = var4;
                        var5.field3422 = class537.field7557;
                        if (~class583.field7964.method2802(1, -20468) == -2) {
                            int var10 = class583.field7964.method2802(3, -20468);
                            var5.method2273(2, var10, 0);
                            int var11 = class583.field7964.method2802(3, -20468);
                            var5.method2273(2, var11, 0);
                        } else {
                            int var12 = class583.field7964.method2802(3, -20468);
                            var5.method2273(0, var12, 0);
                        }
                        int var13 = class583.field7964.method2802(1, -20468);
                        if (~var13 == -2) {
                            class7.field123[class358.field4430++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class728.field10197[class274.field3218++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)V")
    private final void method3715(int arg0) {
        if (arg0 != -32769) {
            method3713(-57);
        }
        ++field9078;
        int[] var2 = this.field9074[0];
        int[] var3 = this.field9074[1];
        int[] var4 = this.field9074[this.field9074.length + -2];
        int[] var5 = this.field9074[this.field9074.length + -1];
        this.field9076 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (var5[1] + -var4[1]) };
        this.field9073 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[I")
    private final int[] method3716(int arg0, int arg1) {
        ++field9075;
        if (arg0 < ~arg1) {
            return this.field9073;
        } else {
            return this.field9074.length <= arg1 ? this.field9076 : this.field9074[arg1];
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class661() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 > -44) {
            field9068 = null;
        }
        if (arg1 == 0) {
            this.field9072 = arg2.method2396((byte) 92);
            this.field9074 = new int[arg2.method2396((byte) 59)][2];
            for (int var4 = 0; ~this.field9074.length < ~var4; ++var4) {
                this.field9074[var4][0] = arg2.method2390((byte) 91);
                this.field9074[var4][1] = arg2.method2390((byte) 35);
            }
        }
        ++field9079;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        ++field9070;
        if (this.field9074 == null) {
            this.field9074 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field9074.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            int var2 = 52 / ((37 - arg0) / 62);
            if (~this.field9072 == -3) {
                this.method3715(-32769);
            }
            class120.method940((byte) -61);
            this.method3712(1458664868);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field9071;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field752.field2441) {
                int[] var4 = this.method492(0, arg1, (byte) 49);
                for (int var5 = 0; ~class642.field8759 < ~var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field9067[var6];
                }
            }
            return var3;
        }
    }
}

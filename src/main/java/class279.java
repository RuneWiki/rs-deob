import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class279 extends class478 {

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    private int field3465 = 0;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "[S")
    private short[] field3462 = new short[257];

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "[I")
    private int[] field3460;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "[I")
    private int[] field3468;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "[[I")
    private int[][] field3464;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 4)
    public final void method34(byte arg0) {
        if (arg0 != 23) {
            this.field3465 = -24;
        }
        ++field3459;
        if (this.field3464 == null) {
            this.field3464 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field3464.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3465 == -3) {
                this.method1625(-32768);
            }
            class625.method3518(arg0 ^ 23);
            this.method1627((byte) -124);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)[I", line = 28)
    private final int[] method1624(int arg0, int arg1) {
        ++field3455;
        if (arg0 < 0) {
            return this.field3468;
        } else if (~arg0 <= ~this.field3464.length) {
            return this.field3460;
        } else {
            return arg1 != -28346 ? null : this.field3464[arg0];
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 47)
    private final void method1625(int arg0) {
        ++field3466;
        int[] var2 = this.field3464[0];
        int[] var3 = this.field3464[1];
        if (arg0 == -32768) {
            int[] var4 = this.field3464[this.field3464.length + -2];
            int[] var5 = this.field3464[this.field3464.length + -1];
            this.field3460 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + var4[1] + -var5[1] };
            this.field3468 = new int[] { var2[0] - var3[0] + var2[0], var2[1] - -var2[1] + -var3[1] };
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[I", line = 69)
    public final int[] method35(int arg0, int arg1) {
        ++field3456;
        int[] var3 = super.field6886.method789(arg0, (byte) 122);
        if (arg1 != -11323) {
            method1626(-99);
        }
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(arg0, arg1 + 11274, 0);
            for (int var5 = 0; ~var5 > ~class436.field6154; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3462[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 116)
    public static final void method1626(int arg0) {
        ++field3458;
        if (arg0 > 95) {
            ++class171.field1906;
            class653 var1 = class699.method3845((byte) 45, class39.field395, class241.field2988);
            var1.field9158.method658(0, (byte) 110);
            class568.method3220(var1, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 131)
    private final void method1627(byte arg0) {
        ++field3461;
        int var2 = this.field3465;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field3464.length + -1 > var5 && this.field3464[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3464[var5 - 1];
                    int[] var7 = this.field3464[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class609.field8517[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3462[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field3464.length + -1 && var13 >= this.field3464[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3464[var14 - 1];
                    int[] var16 = this.field3464[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3462[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field3464.length + -1 && this.field3464[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field3464[var22 - 1];
                int[] var24 = this.field3464[var22];
                int var25 = this.method1624(var22 + -2, -28346)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1624(var22 + 1, -28346)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var26 + var28 - (var27 - -var25);
                int var32 = var25 - var26 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var36 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3462[var20] = (short) var38;
            }
        }
        if (arg0 >= -121) {
            method1629(true);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 315)
    public class279() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILnp;I)V", line = 318)
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field3457;
        if (arg2 == 0) {
            this.field3465 = arg1.method620((byte) -128);
            this.field3464 = new int[arg1.method620((byte) -7)][2];
            for (int var4 = 0; ~var4 > ~this.field3464.length; ++var4) {
                this.field3464[var4][0] = arg1.method643((byte) -77);
                this.field3464[var4][1] = arg1.method643((byte) -77);
            }
        }
        if (arg0 != 255) {
            this.field3468 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILsp;I)V", line = 346)
    public static final void method1628(int arg0, int arg1, int arg2, class677 arg3, int arg4) {
        ++field3467;
        if (arg0 > 11) {
            class543 var5 = arg3.method3737((byte) 67);
            int var6 = arg3.field9497 - arg3.field9446.field8518 & 16383;
            if (~arg2 != 0) {
                if (~arg3.field9448 != 0 && (var6 >= 10240 || var6 <= 2048)) {
                    int var7 = class442.field6247[arg4] + -arg3.field9446.field8518 & 16383;
                    arg3.field9473 = false;
                    if (~arg2 == -3 && ~var5.field7662 != 0) {
                        if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field7647 != 0) {
                            arg3.field9487 = var5.field7647;
                        } else if (var7 >= 10240 && var7 < 14336 && ~var5.field7680 != 0) {
                            arg3.field9487 = var5.field7680;
                        } else if (var7 > 6144 && var7 < 10240 && ~var5.field7641 != 0) {
                            arg3.field9487 = var5.field7641;
                        } else {
                            arg3.field9487 = var5.field7662;
                        }
                    } else if (~arg2 == -1 && var5.field7663 != -1) {
                        if (~var7 < -2049 && var7 <= 6144 && ~var5.field7642 != 0) {
                            arg3.field9487 = var5.field7642;
                        } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field7643 != 0) {
                            arg3.field9487 = var5.field7643;
                        } else if (var7 > 6144 && var7 < 10240 && var5.field7644 != -1) {
                            arg3.field9487 = var5.field7644;
                        } else {
                            arg3.field9487 = var5.field7663;
                        }
                    } else if (~var7 < -2049 && var7 <= 6144 && var5.field7675 != -1) {
                        arg3.field9487 = var5.field7675;
                    } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field7677 != 0) {
                        arg3.field9487 = var5.field7677;
                    } else if (var7 > 6144 && ~var7 > -10241 && var5.field7651 != -1) {
                        arg3.field9487 = var5.field7651;
                    } else {
                        arg3.field9487 = var5.field7638;
                    }
                } else if (~var6 == -1 && ~arg3.field9465 >= -26) {
                    if (~arg2 == -3 && ~var5.field7662 != 0) {
                        arg3.field9487 = var5.field7662;
                    } else if (~arg2 == -1 && var5.field7663 != -1) {
                        arg3.field9487 = var5.field7663;
                    } else {
                        arg3.field9487 = var5.field7638;
                    }
                    arg3.field9473 = false;
                } else {
                    arg3.field9473 = false;
                    if (~arg2 == -3 && ~var5.field7662 != 0) {
                        if (~arg1 > -1 && var5.field7676 != -1) {
                            arg3.field9487 = var5.field7676;
                        } else if (~arg1 < -1 && ~var5.field7657 != 0) {
                            arg3.field9487 = var5.field7657;
                        } else {
                            arg3.field9487 = var5.field7662;
                        }
                    } else if (~arg2 == -1 && ~var5.field7663 != 0) {
                        if (~arg1 > -1 && ~var5.field7649 != 0) {
                            arg3.field9487 = var5.field7649;
                        } else if (arg1 > 0 && var5.field7636 != -1) {
                            arg3.field9487 = var5.field7636;
                        } else {
                            arg3.field9487 = var5.field7663;
                        }
                    } else if (arg1 < 0 && ~var5.field7660 != 0) {
                        arg3.field9487 = var5.field7660;
                    } else if (~arg1 < -1 && var5.field7640 != -1) {
                        arg3.field9487 = var5.field7640;
                    } else {
                        arg3.field9487 = var5.field7638;
                    }
                }
            } else if (~var6 == -1 && ~arg3.field9465 >= -26) {
                if (!arg3.field9473 || !var5.method3054(arg3.field9487, 108)) {
                    arg3.field9487 = var5.method3055(0);
                    arg3.field9473 = ~arg3.field9487 != 0;
                }
            } else {
                if (arg1 < 0 && var5.field7673 != -1) {
                    arg3.field9487 = var5.field7673;
                } else if (arg1 > 0 && var5.field7654 != -1) {
                    arg3.field9487 = var5.field7654;
                } else {
                    arg3.field9487 = var5.field7638;
                }
                arg3.field9473 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V", line = 514)
    public static final void method1629(boolean arg0) {
        class291.field3642.method492((byte) -44);
        ++field3463;
        if (!arg0) {
            method1628(-30, 118, -51, (class677) null, -19);
        }
        class25.field217 = null;
        class258.field3249 = 1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 extends class223 {

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    private int field955 = 0;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    private int field954 = 2048;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    private int field947 = 10;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "[I")
    public static int[] field946 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "Z")
    public static boolean field958 = false;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "[I")
    private int[] field951;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "[I")
    private int[] field956;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static final void method488(byte arg0) {
        class49.field806.method1172((byte) 115);
        ++field952;
        int var1 = 98 % ((arg0 - 71) / 36);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    private final void method489(int arg0) {
        this.field956 = new int[this.field947 + 1];
        if (arg0 > 23) {
            ++field957;
            this.field951 = new int[this.field947 - -1];
            int var2 = 0;
            int var3 = 4096 / this.field947;
            int var4 = this.field954 * var3 >> 12;
            for (int var5 = 0; ~this.field947 < ~var5; ++var5) {
                this.field956[var5] = var2;
                this.field951[var5] = var2 + var4;
                var2 += var3;
            }
            this.field956[this.field947] = 4096;
            this.field951[this.field947] = this.field951[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lwf;IIIIIIZ)V")
    public static final void method490(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field9.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field9[var9] - class42.field713;
            int var23 = arg0.field16[var9] - class178.field2736;
            int var24 = arg0.field21[var9] - class14.field178;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field7 != null) {
                class1.field22[var9] = var25;
                class1.field20[var9] = var28;
                class1.field11[var9] = var29;
            }
            class1.field10[var9] = (var25 << 9) / var29 + class224.field3599;
            class1.field2[var9] = (var28 << 9) / var29 + class224.field3598;
        }
        class224.field3608 = 0;
        int var10 = arg0.field1.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field1[var11];
            int var13 = arg0.field3[var11];
            int var14 = arg0.field4[var11];
            int var15 = class1.field10[var12];
            int var16 = class1.field10[var13];
            int var17 = class1.field10[var14];
            int var18 = class1.field2[var12];
            int var19 = class1.field2[var13];
            int var20 = class1.field2[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class118.field1789 && class138.method1021(class26.field441 + class224.field3599, class254.field4064 + class224.field3598, var18, var19, var20, var15, var16, var17)) {
                    class106.field1659 = arg5;
                    class49.field810 = arg6;
                }
                if (!arg7) {
                    class224.field3600 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class224.field3610 || var16 > class224.field3610 || var17 > class224.field3610) {
                        class224.field3600 = true;
                    }
                    if (arg0.field7 != null && arg0.field7[var11] != -1) {
                        if (class106.field1665) {
                            if (arg0.field19) {
                                class224.method1552(var18, var19, var20, var15, var16, var17, arg0.field18[var11], arg0.field15[var11], arg0.field8[var11], class1.field22[0], class1.field22[1], class1.field22[3], class1.field20[0], class1.field20[1], class1.field20[3], class1.field11[0], class1.field11[1], class1.field11[3], arg0.field7[var11]);
                            } else {
                                class224.method1552(var18, var19, var20, var15, var16, var17, arg0.field18[var11], arg0.field15[var11], arg0.field8[var11], class1.field22[var12], class1.field22[var13], class1.field22[var14], class1.field20[var12], class1.field20[var13], class1.field20[var14], class1.field11[var12], class1.field11[var13], class1.field11[var14], arg0.field7[var11]);
                            }
                        } else {
                            int var21 = class224.field3596.method732(true, arg0.field7[var11]);
                            class224.method1556(var18, var19, var20, var15, var16, var17, class48.method402(var21, arg0.field18[var11]), class48.method402(var21, arg0.field15[var11]), class48.method402(var21, arg0.field8[var11]));
                        }
                    } else if (arg0.field18[var11] != 12345678) {
                        class224.method1556(var18, var19, var20, var15, var16, var17, arg0.field18[var11], arg0.field15[var11], arg0.field8[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            this.field954 = 14;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field955 = arg0.method265(-85);
                }
            } else {
                this.field954 = arg0.method260((byte) -67);
            }
        } else {
            this.field947 = arg0.method265(arg2 + -201);
        }
        ++field950;
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public static final void method491(int arg0) {
        ++field959;
        if (arg0 != 16) {
            method491(-42);
        }
        for (int var1 = 0; class122.field1840 > var1; ++var1) {
            int var2 = class147.field2179[var1];
            class136 var3 = class233.field3682[var2];
            int var4 = class183.field2900.method265(arg0 + -119);
            if ((32 & var4) != 0) {
                var4 += class183.field2900.method265(-92) << 8;
            }
            class33.method327(var4, var3, var2, false);
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != 500) {
            method490((class1) null, 94, 55, -66, 67, -55, 5, true);
        }
        ++field948;
        this.method489(84);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field953;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (arg0 <= 14) {
            return null;
        } else {
            if (super.field3588.field3722) {
                int var4 = class307.field4925[arg1];
                if (~this.field955 != -1) {
                    for (int var5 = 0; var5 < class250.field4008; ++var5) {
                        short var6 = 0;
                        int var7 = class106.field1662[var5];
                        int var8 = 0;
                        int var9 = this.field955;
                        if (~var9 != -2) {
                            if (var9 != 2) {
                                if (~var9 == -4) {
                                    var8 = (-var4 + var7 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var4 + -4096 + var7 >> 1) + 2048;
                            }
                        } else {
                            var8 = var7;
                        }
                        for (int var10 = 0; var10 < this.field947; ++var10) {
                            if (var8 >= this.field956[var10] && ~var8 > ~this.field956[var10 + 1]) {
                                if (~this.field951[var10] < ~var8) {
                                    var6 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var6;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field947 > var12; ++var12) {
                        if (~var4 <= ~this.field956[var12] && var4 < this.field956[var12 - -1]) {
                            if (this.field951[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class81.method633(var3, 0, class250.field4008, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
    public static void method492(boolean arg0) {
        if (arg0) {
            field958 = false;
        }
        field946 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
    public static final void method493(byte arg0) {
        ++field949;
        if (class236.field3730 != null) {
            class214 var1 = class236.field3730;
            synchronized (class236.field3730) {
                class236.field3730 = null;
            }
        }
        if (arg0 >= -58) {
            field946 = null;
        }
    }
}

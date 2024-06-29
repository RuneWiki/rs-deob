import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class61 extends class14 {

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    private int field952 = 819;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    private int field953 = 0;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    private int field960 = 1024;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    private int field951 = 1024;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    private int field958 = 2048;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    private int field962 = 409;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    private int field963 = 1024;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    private int field957 = 0;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    private int field965 = 1024;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field949 = 765;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lff;")
    public static class9 field964 = new class9(98, 4);

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 7)
    public final void method142(byte arg0) {
        ++field955;
        int var2 = 73 / ((39 - arg0) / 59);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 17)
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I", line = 49)
    public static final int method427(int arg0, byte arg1) {
        ++field961;
        if (arg1 != -39) {
            field947 = 105;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[[IIIBLjava/util/Random;)V", line = 60)
    private final void method428(int arg0, int arg1, int[][] arg2, int arg3, int arg4, byte arg5, Random arg6) {
        ++field948;
        int var8 = ~this.field963 >= -1 ? 4096 : 4096 + -class363.method2116(this.field963, arg6, true);
        int var9 = this.field960 * this.field950 >> 12;
        int var10 = this.field950 - (~var9 >= -1 ? 0 : class363.method2116(var9, arg6, true));
        if (arg0 >= class115.field1637) {
            arg0 -= class115.field1637;
        }
        if (arg5 != 126) {
            this.field952 = -66;
        }
        if (~var10 >= -1) {
            if (~class115.field1637 > ~(arg0 + arg1)) {
                int var11 = -arg0 + class115.field1637;
                for (int var12 = 0; ~arg3 < ~var12; ++var12) {
                    int[] var13 = arg2[arg4 + var12];
                    class254.method1530(var13, arg0, var11, var8);
                    class254.method1530(var13, 0, arg1 - var11, var8);
                }
            } else {
                for (int var14 = 0; arg3 > var14; ++var14) {
                    class254.method1530(arg2[arg4 - -var14], arg0, arg1, var8);
                }
            }
        } else if (~arg3 < -1 && arg1 > 0) {
            int var15 = arg1 / 2;
            int var16 = arg3 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg0 + var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; arg3 > var21; ++var21) {
                int[] var22 = arg2[arg4 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field957 == 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class494.method2839(arg0 + var24, class305.field4023)] = var22[class494.method2839(class305.field4023, arg0 + arg1 - (var24 + 1))] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class494.method2839(class305.field4023, arg0 + var26)] = var22[class494.method2839(-var26 - 1 + arg0 + arg1, class305.field4023)] = ~var23 < ~var28 ? var28 : var23;
                        }
                    }
                    if (~(var19 + var20) >= ~class115.field1637) {
                        class254.method1530(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class115.field1637;
                        class254.method1530(var22, var19, var27, var23);
                        class254.method1530(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = arg3 - var21 + -1;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field957 != -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class494.method2839(class305.field4023, arg0 + var31)] = var22[class494.method2839(-var31 + -1 + arg0 + arg1, class305.field4023)] = var32 >= var30 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class494.method2839(arg0 + var33, class305.field4023)] = var22[class494.method2839(class305.field4023, arg0 - var33 + arg1 - 1)] = var30 * var35 >> 12;
                            }
                        }
                        if (class115.field1637 >= var19 + var20) {
                            class254.method1530(var22, var19, var20, var30);
                        } else {
                            int var34 = class115.field1637 - var19;
                            class254.method1530(var22, var19, var34, var30);
                            class254.method1530(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class494.method2839(arg0 + var36, class305.field4023)] = var22[class494.method2839(class305.field4023, arg0 + arg1 + -var36 - 1)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) >= ~class115.field1637) {
                            class254.method1530(var22, var19, var20, var8);
                        } else {
                            int var37 = class115.field1637 - var19;
                            class254.method1530(var22, var19, var37, var8);
                            class254.method1530(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Z", line = 257)
    public static final boolean method429(int arg0, int arg1) {
        ++field954;
        if (arg1 != 2) {
            return true;
        } else {
            return ~arg0 <= -13 && ~arg0 >= -18;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 269)
    public static void method430(int arg0) {
        if (arg0 != 0) {
            method427(115, (byte) -75);
        }
        field964 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I", line = 280)
    public final int[] method140(int arg0, byte arg1) {
        ++field956;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int[][] var4 = super.field270.method2264(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class115.field1637 * this.field951 >> 12;
            int var15 = class115.field1637 * this.field958 >> 12;
            int var16 = class494.field6866 * this.field962 >> 12;
            int var17 = class494.field6866 * this.field952 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field950 = class115.field1637 / 8 * this.field965 >> 12;
            int var18 = class115.field1637 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field953);
            label132: while (true) {
                while (true) {
                    int var22 = class363.method2116(-var14 + var15, var21, true) + var14;
                    int var23 = class363.method2116(-var16 + var17, var21, true) + var16;
                    int var24 = var8 - -var22;
                    if (~var24 < ~class115.field1637) {
                        var24 = class115.field1637;
                        var22 = -var8 + class115.field1637;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var24 - -var5;
                        if (~var29 > -1) {
                            var29 += class115.field1637;
                        }
                        if (~class115.field1637 > ~var29) {
                            var29 -= class115.field1637;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && ~var30[1] <= ~var29) {
                                if (~var9 != ~var26) {
                                    int var31 = var8 - -var5;
                                    if (~var31 > -1) {
                                        var31 += class115.field1637;
                                    }
                                    if (~class115.field1637 > ~var31) {
                                        var31 -= class115.field1637;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var29) {
                                                if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class115.field1637;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method428(var38 - -var7, var39 - var38, var4, -var35 + var25, var35, (byte) 126, var21);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            int var10000 = ~var12;
                            ++var26;
                            if (var10000 >= ~var26) {
                                var26 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (~(var23 + var25) < ~class494.field6866) {
                        var23 = -var25 + class494.field6866;
                    } else {
                        var10 = false;
                    }
                    if (class115.field1637 == var24) {
                        this.method428(var8 - -var6, var22, var4, var23, var25, (byte) 126, var21);
                        if (var10) {
                            break label132;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[2] = var23 + var25;
                        var41[0] = var8;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var13 = 0;
                        var7 = var6;
                        var6 = class363.method2116(class115.field1637, var21, true);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class115.field1637 + var5;
                        }
                        if (~var43 < ~class115.field1637) {
                            var43 -= class115.field1637;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[0] = var8;
                        var45[1] = var24;
                        var45[2] = var23 + var25;
                        this.method428(var6 + var8, var22, var4, var23, var25, (byte) 126, var21);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 > -2) {
            this.method147(-71, (byte) -33, (class379) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLmd;)V", line = 533)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = 2 % ((arg1 - -51) / 37);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field963 = arg2.method2212((byte) 83);
                                        }
                                    } else {
                                        this.field960 = arg2.method2212((byte) 83);
                                    }
                                } else {
                                    this.field957 = arg2.method2238(255);
                                }
                            } else {
                                this.field965 = arg2.method2212((byte) 83);
                            }
                        } else {
                            this.field952 = arg2.method2212((byte) 83);
                        }
                    } else {
                        this.field962 = arg2.method2212((byte) 83);
                    }
                } else {
                    this.field958 = arg2.method2212((byte) 83);
                }
            } else {
                this.field951 = arg2.method2212((byte) 83);
            }
        } else {
            this.field953 = arg2.method2238(255);
        }
        ++field966;
    }
}

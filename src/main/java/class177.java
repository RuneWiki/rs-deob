import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class177 extends class512 {

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    private int field2807 = 4;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    private int field2812 = 4;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field2810 = 0;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "Lqs;")
    public static class496 field2803;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "Lfl;")
    public static class75 field2811;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method75(int arg0, byte arg1) {
        ++field2805;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int var4 = class402.field6113 / this.field2812;
            int var5 = class227.field3953 / this.field2807;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method3013(false, 0, class227.field3953 * var6 / var5);
            } else {
                var7 = this.method3013(false, 0, 0);
            }
            for (int var8 = 0; ~var8 > ~class402.field6113; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class402.field6113 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        int var10 = 109 % ((arg1 - 43) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)[[I", line = 57)
    public final int[][] method278(int arg0, int arg1) {
        ++field2808;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = -30 / ((arg0 - -40) / 47);
        if (super.field7496.field6942) {
            int var5 = class402.field6113 / this.field2812;
            int var6 = class227.field3953 / this.field2807;
            int[][] var7;
            if (~var6 >= -1) {
                var7 = this.method3012(0, 102, 0);
            } else {
                int var8 = arg1 % var6;
                var7 = this.method3012(class227.field3953 * var8 / var6, 80, 0);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var3[0];
            int[] var13 = var3[1];
            int[] var14 = var3[2];
            for (int var15 = 0; class402.field6113 > var15; ++var15) {
                int var16;
                if (var5 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class402.field6113 * var17 / var5;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILjava/lang/Object;I)[B", line = 126)
    public static final byte[] method1195(int arg0, int arg1, Object arg2, int arg3) {
        ++field2806;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class473.method2798(var4, (byte) -122, arg1, arg0);
        } else if (arg2 instanceof class190) {
            class190 var5 = (class190) arg2;
            return var5.method1283(arg0, (byte) 22, arg1);
        } else {
            if (arg3 != 3) {
                field2810 = 93;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 158)
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/Object;ILnv;)V", line = 162)
    public static final void method1196(Object arg0, int arg1, class493 arg2) {
        ++field2809;
        if (arg2.field7197 != null) {
            if (arg1 >= -108) {
                field2811 = null;
            }
            for (int var3 = 0; ~var3 > -51 && arg2.field7197.peekEvent() != null; ++var3) {
                class444.method2667(-28210, 1L);
            }
            if (arg0 != null) {
                arg2.field7197.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lqs;B)V", line = 185)
    public static final void method1197(class496 arg0, byte arg1) {
        if (arg1 != 2) {
            field2811 = null;
        }
        class21.field227 = arg0;
        ++field2813;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lol;Z)Z", line = 197)
    public static final boolean method1198(class290 arg0, boolean arg1) {
        boolean var2 = class360.field5592 == class320.field5039;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method317((byte) 94);
        if (arg0.field4718 >= 0 && arg0.field4717 >= 0 && arg0.field4722 < class236.field4089 && arg0.field4713 < class276.field4537) {
            for (int var6 = arg0.field4718; var6 <= arg0.field4722; ++var6) {
                for (int var9 = arg0.field4717; var9 <= arg0.field4713; ++var9) {
                    class465 var10 = class406.method2512(arg0.field4720, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field4718) {
                            ++var11;
                        }
                        if (var6 < arg0.field4722) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field4717) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field4713) {
                            var11 += 2;
                        }
                        class1 var12 = class529.method3132(true, arg0, var11);
                        class1 var13 = var10.field6898;
                        if (var13 == null) {
                            var10.field6898 = var12;
                        } else {
                            while (var13.field2 != null) {
                                var13 = var13.field2;
                            }
                            var13.field2 = var12;
                        }
                        var10.field6900 = (byte) (var10.field6900 | var11);
                        if (var2 && (class526.field7761[var6][var9] & -16777216) != 0) {
                            var3 = class526.field7761[var6][var9];
                            var4 = class495.field7234[var6][var9];
                            var5 = class374.field5819[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field4718; var7 <= arg0.field4722; ++var7) {
                    for (int var8 = arg0.field4717; var8 <= arg0.field4713; ++var8) {
                        if ((class526.field7761[var7][var8] & -16777216) == 0) {
                            class526.field7761[var7][var8] = var3;
                            class495.field7234[var7][var8] = var4;
                            class374.field5819[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class271.field4497[class510.field7453++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZILia;)V", line = 299)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field2814;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2807 = arg2.method126((byte) -80);
            }
        } else {
            this.field2812 = arg2.method126((byte) -101);
        }
        if (!arg0) {
            method1195(105, -112, (Object) null, 14);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BIIIIIIIII)V", line = 348)
    public static final void method1199(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2804;
        if (arg2 == arg5 && arg1 == arg9 && arg6 == arg8 && arg4 == arg7) {
            class437.method2645(arg3, arg7, (byte) -92, arg9, arg5, arg6);
        } else {
            int var10 = arg5;
            int var11 = arg9;
            int var12 = arg5 * 3;
            int var13 = arg9 * 3;
            int var14 = arg2 * 3;
            int var15 = arg1 * 3;
            int var16 = arg8 * 3;
            int var17 = arg4 * 3;
            int var18 = var14 - arg5 + (arg6 - var16);
            int var19 = -arg9 + var15 + -var17 + arg7;
            int var20 = -var14 + var12 + -var14 + var16;
            int var21 = -var15 + var17 - (-var13 + var15);
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg5;
                int var34 = (var28 + var30 - -var32 >> 12) + arg9;
                class437.method2645(arg3, var34, (byte) -92, var11, var10, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg0 > -30) {
            method1200((byte) -127);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V", line = 426)
    public static void method1200(byte arg0) {
        int var1 = -93 % ((arg0 - -57) / 38);
        field2803 = null;
        field2811 = null;
    }
}

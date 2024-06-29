import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class308 extends class137 implements class339 {

    @OriginalMember(owner = "client!jfa", name = "L", descriptor = "Z")
    private boolean field3926 = false;

    @OriginalMember(owner = "client!jfa", name = "P", descriptor = "Lrea;")
    public class567 field3930;

    @OriginalMember(owner = "client!jfa", name = "Y", descriptor = "Z")
    private boolean field3939;

    @OriginalMember(owner = "client!jfa", name = "H", descriptor = "[I")
    public static int[] field3922 = new int[8];

    @OriginalMember(owner = "client!jfa", name = "I", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!jfa", name = "J", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!jfa", name = "K", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!jfa", name = "M", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!jfa", name = "N", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!jfa", name = "O", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!jfa", name = "Q", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!jfa", name = "R", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!jfa", name = "S", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!jfa", name = "T", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!jfa", name = "U", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!jfa", name = "V", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!jfa", name = "W", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!jfa", name = "X", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!jfa", name = "Z", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jfa", name = "ab", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!jfa", name = "cb", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!jfa", name = "bb", descriptor = "Lsd;")
    private class362 field3942;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method64(int arg0) {
        if (arg0 != 3755) {
            return true;
        } else {
            ++field3924;
            return this.field3930.method3126(arg0 + -3755);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lr;I)Lsd;", line = 14)
    public final class362 method82(class566 arg0, int arg1) {
        ++field3932;
        if (arg1 != -1660704056) {
            this.method83((byte) 98);
        }
        return this.field3942;
    }

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "(I)V", line = 25)
    public static final void method1782(int arg0) {
        ++field3935;
        if (arg0 == -1) {
            if (class220.field2692 != null) {
                class220.field2692.method3119(1);
                class220.field2692 = null;
                class91.field1275 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)I", line = 49)
    public final int method74(byte arg0) {
        ++field3933;
        if (arg0 != 42) {
            field3922 = null;
        }
        return this.field3930.field7925;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V", line = 60)
    public final void method81(boolean arg0) {
        if (!arg0) {
            ++field3925;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lr;Lbda;IIIIIZIIIII)V", line = 72)
    public class308(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field3930 = new class567(arg0, arg1, arg10, arg11, super.field6470, arg3, arg4, arg6, arg7, arg12);
        this.field3939 = arg1.field5560 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZLr;)Log;", line = 85)
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field3927;
        class474 var3 = this.field3930.method3130(!arg0, super.field6461, arg1, true, arg0, super.field6464, 2048);
        if (var3 == null) {
            return null;
        } else {
            class491 var4 = arg1.method995();
            var4.method914(super.field1783 + super.field6461, super.field6458, super.field6464 - -super.field1776);
            class101 var5 = null;
            if (this.field3939) {
                var5 = class676.method3794(!arg0, 1);
            }
            int var6 = super.field6461 >> 9;
            int var7 = super.field6464 >> 9;
            this.field3930.method3129(var3, var6, arg1, var7, true, var6, var7, -118, var4);
            if (class36.field498) {
                var3.method751(var4, var5 != null ? var5.field1361[0] : null, class432.field5406, 0);
            } else {
                var3.method717(var4, var5 == null ? null : var5.field1361[0], 0);
            }
            if (this.field3930.field7939 != null) {
                class27 var8 = this.field3930.field7939.method545();
                if (class36.field498) {
                    arg1.method999(var8, class432.field5406);
                } else {
                    arg1.method993(var8);
                }
            }
            this.field3926 = var3.method740() || this.field3930.field7939 != null;
            if (this.field3942 != null) {
                class227.method1360(var3, super.field6461, this.field3942, super.field6458, super.field6464, 26219);
            } else {
                this.field3942 = class286.method1606(-24294, super.field6458, var3, super.field6464, super.field6461);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(ZLr;)V", line = 139)
    public final void method67(boolean arg0, class566 arg1) {
        ++field3938;
        class474 var3 = this.field3930.method3130(!arg0, super.field6461, arg1, true, arg0, super.field6464, 262144);
        if (var3 != null) {
            int var4 = super.field6461 >> 9;
            int var5 = super.field6464 >> 9;
            class491 var6 = arg1.method995();
            var6.method914(super.field6461, super.field6458, super.field6464);
            this.field3930.method3129(var3, var4, arg1, var5, false, var4, var5, -122, var6);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILwd;IIIIIIIBI)Z", line = 161)
    public static final boolean method1783(int arg0, class356 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        ++field3929;
        int var11 = arg5;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg5;
        int var16 = arg10 - var14;
        if (arg9 > -109) {
            method1784(104);
        }
        class517.field7067[var13][var14] = 99;
        class470.field5973[var13][var14] = 0;
        byte var17 = 0;
        class19.field291[var17] = arg5;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class534.field7204[var10001] = arg10;
        int[][] var19 = arg1.field4537;
        while (~var26 != ~var18) {
            var11 = class19.field291[var18];
            var12 = class534.field7204[var18];
            int var20 = -var16 + var12;
            int var21 = var11 - arg1.field4555;
            int var22 = -arg1.field4547 + var12;
            var18 = var18 - -1 & 4095;
            int var23 = -var15 + var11;
            if (~arg7 != 3) {
                if (arg7 != -3) {
                    if (~arg7 != 1) {
                        if (~arg7 != 0) {
                            if (arg7 != 0 && ~arg7 != -2 && ~arg7 != -3 && arg7 != 3 && arg7 != 9) {
                                if (arg1.method1956(1, -111, arg7, arg8, arg3, var12, var11, arg6)) {
                                    class265.field3372 = var12;
                                    class190.field2379 = var11;
                                    return true;
                                }
                            } else if (arg1.method1967(var11, var12, 1, 67108864, arg8, arg3, arg7, arg6)) {
                                class265.field3372 = var12;
                                class190.field2379 = var11;
                                return true;
                            }
                        } else if (arg1.method1952(-1, arg2, arg6, var12, arg8, arg0, var11, arg4, 1)) {
                            class265.field3372 = var12;
                            class190.field2379 = var11;
                            return true;
                        }
                    } else if (arg1.method1962(arg2, 1, (byte) 101, arg8, arg4, arg6, arg0, var12, var11, 1)) {
                        class265.field3372 = var12;
                        class190.field2379 = var11;
                        return true;
                    }
                } else if (class43.method259(var11, false, 1, var12, arg2, arg6, arg8, 1, arg0)) {
                    class190.field2379 = var11;
                    class265.field3372 = var12;
                    return true;
                }
            } else if (~arg6 == ~var11 && ~arg8 == ~var12) {
                class190.field2379 = var11;
                class265.field3372 = var12;
                return true;
            }
            int var25 = class470.field5973[var23][var20] + 1;
            if (var23 > 0 && ~class517.field7067[var23 + -1][var20] == -1 && ~(var19[var21 + -1][var22] & 1109655552) == -1) {
                class19.field291[var26] = var11 + -1;
                class534.field7204[var26] = var12;
                var26 = var26 - -1 & 4095;
                class517.field7067[var23 + -1][var20] = 2;
                class470.field5973[var23 + -1][var20] = var25;
            }
            if (var23 < 127 && ~class517.field7067[var23 - -1][var20] == -1 && (var19[var21 - -1][var22] & 1612972032) == 0) {
                class19.field291[var26] = var11 - -1;
                class534.field7204[var26] = var12;
                class517.field7067[var23 + 1][var20] = 8;
                var26 = var26 + 1 & 4095;
                class470.field5973[var23 + 1][var20] = var25;
            }
            if (var20 > 0 && ~class517.field7067[var23][var20 + -1] == -1 && ~(1084489728 & var19[var21][var22 - 1]) == -1) {
                class19.field291[var26] = var11;
                class534.field7204[var26] = var12 - 1;
                class517.field7067[var23][var20 + -1] = 1;
                var26 = 4095 & var26 + 1;
                class470.field5973[var23][var20 + -1] = var25;
            }
            if (~var20 > -128 && ~class517.field7067[var23][var20 + 1] == -1 && (var19[var21][var22 + 1] & 1210318848) == 0) {
                class19.field291[var26] = var11;
                class534.field7204[var26] = var12 - -1;
                var26 = var26 + 1 & 4095;
                class517.field7067[var23][var20 - -1] = 4;
                class470.field5973[var23][var20 + 1] = var25;
            }
            if (var23 > 0 && var20 > 0 && class517.field7067[var23 + -1][var20 + -1] == 0 && ~(var19[var21 + -1][var22 + -1] & 1134821376) == -1 && (1109655552 & var19[var21 + -1][var22]) == 0 && (1084489728 & var19[var21][var22 - 1]) == 0) {
                class19.field291[var26] = var11 + -1;
                class534.field7204[var26] = var12 + -1;
                class517.field7067[var23 + -1][var20 + -1] = 3;
                var26 = 4095 & var26 + 1;
                class470.field5973[var23 - 1][var20 + -1] = var25;
            }
            if (~var23 > -128 && ~var20 < -1 && ~class517.field7067[var23 + 1][var20 - 1] == -1 && (var19[var21 - -1][var22 + -1] & 1625554944) == 0 && (var19[var21 + 1][var22] & 1612972032) == 0 && ~(1084489728 & var19[var21][var22 + -1]) == -1) {
                class19.field291[var26] = var11 + 1;
                class534.field7204[var26] = var12 + -1;
                class517.field7067[var23 + 1][var20 + -1] = 9;
                var26 = 4095 & var26 + 1;
                class470.field5973[var23 + 1][var20 - 1] = var25;
            }
            if (var23 > 0 && var20 < 127 && class517.field7067[var23 + -1][var20 - -1] == 0 && ~(1310982144 & var19[var21 + -1][var22 + 1]) == -1 && (1109655552 & var19[var21 + -1][var22]) == 0 && (var19[var21][var22 + 1] & 1210318848) == 0) {
                class19.field291[var26] = var11 - 1;
                class534.field7204[var26] = var12 - -1;
                class517.field7067[var23 + -1][var20 - -1] = 6;
                var26 = var26 + 1 & 4095;
                class470.field5973[var23 + -1][var20 + 1] = var25;
            }
            if (var23 < 127 && var20 < 127 && ~class517.field7067[var23 + 1][var20 + 1] == -1 && (2015625216 & var19[var21 - -1][var22 + 1]) == 0 && (1612972032 & var19[var21 + 1][var22]) == 0 && (var19[var21][var22 + 1] & 1210318848) == 0) {
                class19.field291[var26] = var11 + 1;
                class534.field7204[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class517.field7067[var23 + 1][var20 + 1] = 12;
                class470.field5973[var23 + 1][var20 + 1] = var25;
            }
        }
        class265.field3372 = var12;
        class190.field2379 = var11;
        return false;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)I", line = 412)
    public final int method72(int arg0) {
        if (arg0 != -22496) {
            this.field3942 = null;
        }
        ++field3928;
        return this.field3930.method3128(arg0 + 50606);
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)I", line = 423)
    public final int method65(byte arg0) {
        if (arg0 < 126) {
            method1784(58);
        }
        ++field3936;
        return this.field3930.field7927;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILr;I)Z", line = 437)
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        if (arg3 != 9678) {
            this.field3939 = true;
        }
        ++field3923;
        class474 var5 = this.field3930.method3130(true, super.field6461, arg2, false, false, super.field6464, 131072);
        if (var5 == null) {
            return false;
        } else {
            class491 var6 = arg2.method995();
            var6.method914(super.field1783 + super.field6461, super.field6458, super.field6464 - -super.field1776);
            return class36.field498 ? var5.method738(arg0, arg1, var6, false, class432.field5406) : var5.method744(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "(B)Z", line = 457)
    public final boolean method68(byte arg0) {
        ++field3931;
        if (arg0 < 114) {
            field3922 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLr;)V", line = 469)
    public final void method70(byte arg0, class566 arg1) {
        int var3 = -78 / ((arg0 - -19) / 34);
        ++field3941;
        this.field3930.method3120((byte) 88, arg1);
    }

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "(B)Z", line = 479)
    public final boolean method83(byte arg0) {
        if (arg0 != 23) {
            method1782(-6);
        }
        ++field3940;
        return this.field3926;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(BLr;)V", line = 493)
    public final void method80(byte arg0, class566 arg1) {
        if (arg0 == -114) {
            this.field3930.method3123(2, arg1);
            ++field3937;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "(I)V", line = 504)
    public static void method1784(int arg0) {
        field3922 = null;
        if (arg0 != 1) {
            method1782(-48);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)I", line = 514)
    public final int method78(byte arg0) {
        int var2 = 110 % ((12 - arg0) / 48);
        ++field3934;
        return this.field3930.field7940;
    }

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)I", line = 524)
    public final int method71(int arg0) {
        int var2 = 110 % ((-43 - arg0) / 59);
        ++field3943;
        return this.field3930.method3131((byte) -99);
    }
}

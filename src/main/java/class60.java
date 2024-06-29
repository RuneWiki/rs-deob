import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class60 extends class270 {

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    private int field952 = 819;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    private int field964 = 409;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    private int field957 = 1024;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
    private int field965 = 2048;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    private int field968 = 1024;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    private int field955 = 0;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    private int field971 = 0;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    private int field960 = 1024;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    private int field953 = 1024;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field951 = 0;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "[I")
    public static int[] field962;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
    public static final void method458(byte arg0, int arg1) {
        ++field958;
        class18 var2 = class83.field1360;
        synchronized (class83.field1360) {
            class83.field1360.method104(arg1, (byte) -34);
        }
        if (arg0 != -38) {
            field962 = null;
        }
        class18 var3 = class418.field6059;
        synchronized (class418.field6059) {
            class418.field6059.method104(arg1, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/util/Random;II[[IIII)V")
    private final void method459(Random arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field969;
        if (arg6 != 23196) {
            method460(127);
        }
        int var8 = this.field957 > 0 ? 4096 + -class11.method74(this.field957, 16384, arg0) : 4096;
        int var9 = this.field961 * this.field953 >> 12;
        int var10 = this.field961 + -(var9 > 0 ? class11.method74(var9, 16384, arg0) : 0);
        if (class161.field2445 <= arg4) {
            arg4 -= class161.field2445;
        }
        if (var10 > 0) {
            if (arg5 > 0 && ~arg2 < -1) {
                int var11 = arg2 / 2;
                int var12 = arg5 / 2;
                int var13 = var11 < var10 ? var11 : var10;
                int var14 = var12 < var10 ? var12 : var10;
                int var15 = arg4 + var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; var17 < arg5; ++var17) {
                    int[] var18 = arg3[var17 - -arg1];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field955 != 0) {
                            for (int var20 = 0; var13 > var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class35.method254(class267.field3997, arg4 + var20)] = var18[class35.method254(arg2 + arg4 - var20 + -1, class267.field3997)] = var21 < var19 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class35.method254(class267.field3997, arg4 + var22)] = var18[class35.method254(-var22 + -1 + arg4 + arg2, class267.field3997)] = var19 * var24 >> 12;
                            }
                        }
                        if (~class161.field2445 > ~(var15 + var16)) {
                            int var23 = -var15 + class161.field2445;
                            class82.method638(var18, var15, var23, var19);
                            class82.method638(var18, 0, -var23 + var16, var19);
                        } else {
                            class82.method638(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg5 - var17 + -1;
                        if (~var14 < ~var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field955 == -1) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class35.method254(class267.field3997, arg4 + var27)] = var18[class35.method254(-var27 + arg2 + arg4 + -1, class267.field3997)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class35.method254(arg4 + var29, class267.field3997)] = var18[class35.method254(arg2 + arg4 + -var29 + -1, class267.field3997)] = ~var31 <= ~var26 ? var26 : var31;
                                }
                            }
                            if (class161.field2445 >= var15 + var16) {
                                class82.method638(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class161.field2445;
                                class82.method638(var18, var15, var30, var26);
                                class82.method638(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var13; ++var32) {
                                var18[class35.method254(class267.field3997, arg4 + var32)] = var18[class35.method254(-var32 + arg2 + arg4 + -1, class267.field3997)] = var8 * var32 / var13;
                            }
                            if (~class161.field2445 > ~(var15 + var16)) {
                                int var33 = class161.field2445 - var15;
                                class82.method638(var18, var15, var33, var8);
                                class82.method638(var18, 0, var16 - var33, var8);
                            } else {
                                class82.method638(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg4 - -arg2 <= class161.field2445) {
            for (int var34 = 0; arg5 > var34; ++var34) {
                class82.method638(arg3[arg1 - -var34], arg4, arg2, var8);
            }
        } else {
            int var35 = -arg4 + class161.field2445;
            for (int var36 = 0; ~arg5 < ~var36; ++var36) {
                int[] var37 = arg3[arg1 + var36];
                class82.method638(var37, arg4, var35, var8);
                class82.method638(var37, 0, -var35 + arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V")
    public static void method460(int arg0) {
        field962 = null;
        if (arg0 < 4) {
            method460(-26);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method461(String arg0, int arg1) {
        ++field967;
        int var2 = 101 % ((arg1 - -67) / 38);
        int var3 = arg0.length();
        char[] var4 = new char[var3];
        byte var5 = 2;
        for (int var6 = 0; var3 > var6; ++var6) {
            char var7 = arg0.charAt(var6);
            if (~var5 == -1) {
                var7 = Character.toLowerCase(var7);
            } else if (~var5 == -3 || Character.isUpperCase(var7)) {
                var7 = class229.method1708(var7, -182);
            }
            if (!Character.isLetter(var7)) {
                if (~var7 != -47 && ~var7 != -64 && var7 != '!') {
                    if (!Character.isSpaceChar(var7)) {
                        var5 = 1;
                    } else if (var5 != 2) {
                        var5 = 1;
                    }
                } else {
                    var5 = 2;
                }
            } else {
                var5 = 0;
            }
            var4[var6] = var7;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field957 = arg1.method320((byte) -87);
                                        }
                                    } else {
                                        this.field953 = arg1.method320((byte) -87);
                                    }
                                } else {
                                    this.field955 = arg1.method271((byte) 103);
                                }
                            } else {
                                this.field968 = arg1.method320((byte) -87);
                            }
                        } else {
                            this.field952 = arg1.method320((byte) -87);
                        }
                    } else {
                        this.field964 = arg1.method320((byte) -87);
                    }
                } else {
                    this.field965 = arg1.method320((byte) -87);
                }
            } else {
                this.field960 = arg1.method320((byte) -87);
            }
        } else {
            this.field971 = arg1.method271((byte) 105);
        }
        if (arg0 != 108) {
            this.field965 = 63;
        }
        ++field956;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field959;
        int[] var3 = super.field4053.method396(arg1, 83);
        if (arg0 <= 26) {
            method460(-52);
        }
        if (super.field4053.field815) {
            int[][] var4 = super.field4053.method394(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class161.field2445 * this.field960 >> 12;
            int var15 = class161.field2445 * this.field965 >> 12;
            int var16 = class364.field5188 * this.field964 >> 12;
            int var17 = class364.field5188 * this.field952 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field961 = class161.field2445 / 8 * this.field968 >> 12;
                int var18 = class161.field2445 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field971);
                while (true) {
                    while (true) {
                        int var22 = var14 + class11.method74(-var14 + var15, 16384, var21);
                        int var23 = var16 + class11.method74(-var16 + var17, 16384, var21);
                        int var24 = var8 + var22;
                        if (~var24 < ~class161.field2445) {
                            var24 = class161.field2445;
                            var22 = -var8 + class161.field2445;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var24 - -var5;
                            if (var29 < 0) {
                                var29 += class161.field2445;
                            }
                            if (~class161.field2445 > ~var29) {
                                var29 -= class161.field2445;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && ~var30[1] <= ~var29) {
                                    if (var9 != var26) {
                                        int var31 = var8 - -var5;
                                        if (~var31 > -1) {
                                            var31 += class161.field2445;
                                        }
                                        if (class161.field2445 < var31) {
                                            var31 -= class161.field2445;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var29) {
                                                    if (var36 == 0) {
                                                        var38 = Math.min(var29, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class161.field2445;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var29, var37);
                                                }
                                                this.method459(var21, var35, -var39 + var38, var4, var39 - -var7, var25 - var35, 23196);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class364.field5188 > ~(var25 - -var23)) {
                            var23 = -var25 + class364.field5188;
                        } else {
                            var10 = false;
                        }
                        if (class161.field2445 != var24) {
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            this.method459(var21, var25, var22, var4, var6 + var8, var23, 23196);
                            var8 = var24;
                        } else {
                            this.method459(var21, var25, var22, var4, var6 + var8, var23, 23196);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var23 + var25;
                            var42[0] = var8;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class11.method74(class161.field2445, 16384, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class161.field2445 + var5;
                            }
                            var9 = 0;
                            if (~class161.field2445 > ~var44) {
                                var44 -= class161.field2445;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && var44 <= var45[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        if (!arg0) {
            this.method81((byte) -58, 68);
        }
        ++field966;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZIILmb;)V")
    public static final void method462(int arg0, boolean arg1, int arg2, int arg3, class258 arg4) {
        ++field954;
        int var5 = arg4.field3764;
        if (~arg4.field3909 != -1) {
            if (arg4.field3909 != 1) {
                if (arg4.field3909 != 2) {
                    if (~arg4.field3909 == -4) {
                        if (~arg4.field3793 != -3) {
                            if (arg4.field3793 == 7) {
                                arg4.field3764 = (arg4.field3905 - 1) * arg4.field3769 + arg4.field3905 * 115;
                            }
                        } else {
                            arg4.field3764 = (arg4.field3905 + -1) * arg4.field3769 + arg4.field3905 * 32;
                        }
                    }
                } else {
                    arg4.field3764 = arg4.field3905 * arg0 >> 14;
                }
            } else {
                arg4.field3764 = -arg4.field3905 + arg0;
            }
        } else {
            arg4.field3764 = arg4.field3905;
        }
        int var6 = arg4.field3758;
        if (~arg4.field3883 == -1) {
            arg4.field3758 = arg4.field3814;
        } else if (~arg4.field3883 == -2) {
            arg4.field3758 = arg3 - arg4.field3814;
        } else if (~arg4.field3883 == -3) {
            arg4.field3758 = arg4.field3814 * arg3 >> 14;
        } else if (~arg4.field3883 == -4) {
            if (arg4.field3793 != 2) {
                if (arg4.field3793 == 7) {
                    arg4.field3758 = arg4.field3814 * 12 - -((arg4.field3814 + -1) * arg4.field3755);
                }
            } else {
                arg4.field3758 = (arg4.field3814 + -1) * arg4.field3755 + arg4.field3814 * 32;
            }
        }
        if (arg4.field3909 == 4) {
            arg4.field3764 = arg4.field3859 * arg4.field3758 / arg4.field3794;
        }
        if (arg2 < 54) {
            field963 = -86;
        }
        if (~arg4.field3883 == -5) {
            arg4.field3758 = arg4.field3794 * arg4.field3764 / arg4.field3859;
        }
        if (class342.field4850 && (~client.method1815(arg4).field6033 != -1 || arg4.field3793 == 0)) {
            if (arg4.field3758 < 5 && ~arg4.field3764 > -6) {
                arg4.field3764 = 5;
                arg4.field3758 = 5;
            } else {
                if (arg4.field3764 <= 0) {
                    arg4.field3764 = 5;
                }
                if (arg4.field3758 <= 0) {
                    arg4.field3758 = 5;
                }
            }
        }
        if (arg4.field3821 == 1337) {
            class291.field4331 = arg4;
        }
        if (arg1 && arg4.field3747 != null) {
            if (arg4.field3764 != var5 || ~arg4.field3758 != ~var6) {
                class254 var7 = new class254();
                var7.field3683 = arg4.field3747;
                var7.field3678 = arg4;
                class182.field2688.method148((byte) 100, var7);
            }
        }
    }
}

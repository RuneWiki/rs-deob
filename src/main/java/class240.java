import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class240 extends class115 {

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    private int field3589 = 819;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    private int field3594 = 2048;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    private int field3590 = 1024;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field3591 = 1024;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    private int field3595 = 409;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    private int field3598 = 0;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    private int field3607 = 1024;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    private int field3597 = 0;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    private int field3604 = 1024;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Lqd;")
    public static class37 field3602 = new class37(64);

    @OriginalMember(owner = "client!a", name = "db", descriptor = "Ljava/lang/String;")
    public static String field3609 = "Use";

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "Lu;")
    public static class223 field3599;

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "Z")
    public static boolean field3610;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public static void method1562(boolean arg0) {
        field3609 = null;
        if (!arg0) {
            method1566((byte) 116, (Component) null);
        }
        field3599 = null;
        field3602 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            method1565(-66, -79, -124, 36, 63, 37, 6, -17, 12);
        }
        ++field3592;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int var4 = 0;
            int[][] var5 = super.field1705.method462((byte) -81);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = class77.field1178 * this.field3590 >> 12;
            int var14 = 0;
            int var15 = class77.field1178 * this.field3594 >> 12;
            int var16 = class192.field2753 * this.field3589 >> 12;
            int var17 = class192.field2753 * this.field3595 >> 12;
            if (var16 <= 1) {
                return var5[arg1];
            } else {
                this.field3608 = class77.field1178 / 8 * this.field3604 >> 12;
                int var18 = class77.field1178 / var13 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3598);
                while (true) {
                    while (true) {
                        int var22 = class259.method1734(-var13 + var15, false, var21) + var13;
                        int var23 = var8 + var22;
                        int var24 = class259.method1734(-var17 + var16, false, var21) + var17;
                        if (~var23 < ~class77.field1178) {
                            var23 = class77.field1178;
                            var22 = class77.field1178 - var8;
                        }
                        int var10000;
                        int var28;
                        if (var12) {
                            var28 = 0;
                        } else {
                            int var25 = var9;
                            int var26 = 0;
                            int[] var27 = var20[var9];
                            var28 = var27[2];
                            int var29 = var4 + var23;
                            if (var29 < 0) {
                                var29 += class77.field1178;
                            }
                            if (class77.field1178 < var29) {
                                var29 -= class77.field1178;
                            }
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var30[0] >= ~var29 && var30[1] >= var29) {
                                    if (~var9 != ~var25) {
                                        int var31 = var4 + var8;
                                        if (~var31 > -1) {
                                            var31 += class77.field1178;
                                        }
                                        if (var31 > class77.field1178) {
                                            var31 -= class77.field1178;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var26; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var11];
                                            var28 = Math.max(var28, var40[2]);
                                        }
                                        for (int var33 = 0; ~var26 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var11];
                                            int var35 = var34[2];
                                            if (var28 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 > ~var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 == 0) {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class77.field1178;
                                                }
                                                this.method1564(var35, 2, var6 + var38, -var35 + var28, var5, var21, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var26;
                                var10000 = ~var11;
                                ++var25;
                                if (var10000 >= ~var25) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (var24 + var28 > class192.field2753) {
                            var24 = -var28 + class192.field2753;
                        } else {
                            var10 = false;
                        }
                        if (class77.field1178 != var23) {
                            int[] var41 = var19[var14++];
                            var41[1] = var23;
                            var41[0] = var8;
                            var41[2] = var24 + var28;
                            this.method1564(var28, 2, var8 - -var7, var24, var5, var21, var22);
                            var8 = var23;
                        } else {
                            this.method1564(var28, 2, var7 + var8, var24, var5, var21, var22);
                            if (var10) {
                                return var3;
                            }
                            var12 = false;
                            var10 = true;
                            var9 = 0;
                            var6 = var7;
                            int[] var42 = var19[var14++];
                            var42[1] = var23;
                            var42[2] = var24 + var28;
                            var11 = var14;
                            var42[0] = var8;
                            var7 = class259.method1734(class77.field1178, false, var21);
                            var14 = 0;
                            var4 = -var6 + var7;
                            int var43 = var4;
                            if (var4 < 0) {
                                var43 = class77.field1178 + var4;
                            }
                            int[][] var44 = var20;
                            var20 = var19;
                            var19 = var44;
                            var8 = 0;
                            if (~class77.field1178 > ~var43) {
                                var43 -= class77.field1178;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var43 && ~var45[1] <= ~var43) {
                                    break;
                                }
                                var10000 = ~var11;
                                ++var9;
                                if (var10000 >= ~var9) {
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

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(II)V")
    public static final void method1563(int arg0, int arg1) {
        ++field3605;
        class228.field3418.method258(arg1, (byte) 63);
        if (arg0 != -25770) {
            method1563(-15, 89);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII[[ILjava/util/Random;I)V")
    private final void method1564(int arg0, int arg1, int arg2, int arg3, int[][] arg4, Random arg5, int arg6) {
        ++field3593;
        if (arg1 == 2) {
            int var8 = ~this.field3607 < -1 ? -class259.method1734(this.field3607, false, arg5) + 4096 : 4096;
            int var9 = this.field3608 * this.field3591 >> 12;
            int var10 = this.field3608 + -(var9 > 0 ? class259.method1734(var9, false, arg5) : 0);
            if (class77.field1178 <= arg2) {
                arg2 -= class77.field1178;
            }
            if (var10 > 0) {
                if (~arg3 < -1 && arg6 > 0) {
                    int var11 = arg6 / 2;
                    int var12 = arg3 / 2;
                    int var13 = var11 >= var10 ? var10 : var11;
                    int var14 = ~var10 < ~var12 ? var12 : var10;
                    int var15 = arg2 + var13;
                    int var16 = arg6 - var13 * 2;
                    for (int var17 = 0; var17 < arg3; ++var17) {
                        int[] var18 = arg4[arg0 + var17];
                        if (var17 < var14) {
                            int var19 = var8 * var17 / var14;
                            if (this.field3597 != 0) {
                                for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class184.method1188(class207.field2992, arg2 + var20)] = var18[class184.method1188(class207.field2992, arg2 - -arg6 + -var20 + -1)] = ~var19 >= ~var21 ? var19 : var21;
                                }
                            } else {
                                for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class184.method1188(class207.field2992, arg2 + var22)] = var18[class184.method1188(-var22 + arg2 - 1 + arg6, class207.field2992)] = var19 * var24 >> 12;
                                }
                            }
                            if (var15 + var16 <= class77.field1178) {
                                class164.method1094(var18, var15, var16, var19);
                            } else {
                                int var23 = -var15 + class77.field1178;
                                class164.method1094(var18, var15, var23, var19);
                                class164.method1094(var18, 0, -var23 + var16, var19);
                            }
                        } else {
                            int var25 = arg3 - var17 + -1;
                            if (var25 < var14) {
                                int var26 = var8 * var25 / var14;
                                if (this.field3597 == 0) {
                                    for (int var27 = 0; var27 < var13; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class184.method1188(arg2 + var27, class207.field2992)] = var18[class184.method1188(class207.field2992, -var27 + -1 + arg2 + arg6)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class184.method1188(arg2 + var29, class207.field2992)] = var18[class184.method1188(class207.field2992, arg2 - -arg6 - (var29 + 1))] = ~var26 < ~var31 ? var31 : var26;
                                    }
                                }
                                if (~(var15 + var16) >= ~class77.field1178) {
                                    class164.method1094(var18, var15, var16, var26);
                                } else {
                                    int var30 = -var15 + class77.field1178;
                                    class164.method1094(var18, var15, var30, var26);
                                    class164.method1094(var18, 0, var16 - var30, var26);
                                }
                            } else {
                                for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                    var18[class184.method1188(class207.field2992, arg2 + var32)] = var18[class184.method1188(arg2 - -arg6 - var32 + -1, class207.field2992)] = var8 * var32 / var13;
                                }
                                if (~class77.field1178 > ~(var15 - -var16)) {
                                    int var33 = -var15 + class77.field1178;
                                    class164.method1094(var18, var15, var33, var8);
                                    class164.method1094(var18, 0, -var33 + var16, var8);
                                } else {
                                    class164.method1094(var18, var15, var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (arg2 + arg6 > class77.field1178) {
                int var34 = -arg2 + class77.field1178;
                for (int var35 = 0; var35 < arg3; ++var35) {
                    int[] var36 = arg4[arg0 + var35];
                    class164.method1094(var36, arg2, var34, var8);
                    class164.method1094(var36, 0, -var34 + arg6, var8);
                }
            } else {
                for (int var37 = 0; arg3 > var37; ++var37) {
                    class164.method1094(arg4[arg0 - -var37], arg2, arg6, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3601;
        int var9 = arg1 - arg3;
        int var10 = arg2 - arg4;
        int var11 = (-arg5 + arg8 << 16) / var10;
        if (arg6 != 1285513040) {
            field3602 = null;
        }
        int var12 = (arg7 - arg0 << 16) / var9;
        class86.method576(arg5, arg1, var12, arg0, 0, arg3, (byte) -90, 0, arg4, arg2, var11);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        ++field3596;
        int var2 = 9 / ((arg0 - 78) / 42);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field3607 = arg1.method756(-29901);
                                        }
                                    } else {
                                        this.field3591 = arg1.method756(-29901);
                                    }
                                } else {
                                    this.field3597 = arg1.method760(false);
                                }
                            } else {
                                this.field3604 = arg1.method756(-29901);
                            }
                        } else {
                            this.field3589 = arg1.method756(-29901);
                        }
                    } else {
                        this.field3595 = arg1.method756(arg0 ^ 29900);
                    }
                } else {
                    this.field3594 = arg1.method756(-29901);
                }
            } else {
                this.field3590 = arg1.method756(-29901);
            }
        } else {
            this.field3598 = arg1.method760(false);
        }
        ++field3606;
        if (arg0 != -1) {
            field3609 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1566(byte arg0, Component arg1) {
        ++field3603;
        arg1.addMouseListener(class158.field2300);
        if (arg0 >= 105) {
            arg1.addMouseMotionListener(class158.field2300);
            arg1.addFocusListener(class158.field2300);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I")
    public static final int method1567(byte arg0, int arg1) {
        ++field3600;
        if (arg0 >= -32) {
            return 94;
        } else {
            int var2 = 63 & arg1;
            int var3 = (201 & arg1) >> 6;
            if (~var2 == -19) {
                if (~var3 == -1) {
                    return 1;
                }
                if (~var3 == -2) {
                    return 2;
                }
                if (var3 == 2) {
                    return 4;
                }
                if (var3 == 3) {
                    return 8;
                }
            } else if (var2 == 19 || ~var2 == -22) {
                if (~var3 == -1) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (~var3 == -3) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
            return 0;
        }
    }
}

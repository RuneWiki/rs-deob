import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class728 extends class297 {

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    private int field9852 = 1024;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    private int field9853 = 0;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    private int field9851 = 1024;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field9855 = 1024;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    private int field9859 = 0;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    private int field9858 = 1024;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    private int field9861 = 2048;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    private int field9863 = 409;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    private int field9864 = 819;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Z")
    public static boolean field9848 = true;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "[Llo;")
    public static class751[] field9860 = new class751[1024];

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field9854 = 0;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    private int field9847;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field9849;
        if (arg2 != 31015) {
            field9848 = true;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field9851 = arg0.method1478(842397944);
                                        }
                                    } else {
                                        this.field9855 = arg0.method1478(842397944);
                                    }
                                } else {
                                    this.field9853 = arg0.method1535(arg2 ^ 31192);
                                }
                            } else {
                                this.field9852 = arg0.method1478(842397944);
                            }
                        } else {
                            this.field9864 = arg0.method1478(842397944);
                        }
                    } else {
                        this.field9863 = arg0.method1478(arg2 ^ 842367455);
                    }
                } else {
                    this.field9861 = arg0.method1478(842397944);
                }
            } else {
                this.field9858 = arg0.method1478(842397944);
            }
        } else {
            this.field9859 = arg0.method1535(255);
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        if (arg0 >= 108) {
            ++field9857;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[[ILjava/util/Random;III)V")
    private final void method4030(int arg0, int arg1, int[][] arg2, Random arg3, int arg4, int arg5, int arg6) {
        ++field9850;
        int var8 = ~this.field9851 >= -1 ? 4096 : 4096 - class37.method463((byte) 117, this.field9851, arg3);
        int var9 = 88 % ((arg0 - 57) / 55);
        int var10 = this.field9855 * this.field9847 >> 12;
        int var11 = this.field9847 - (~var10 < -1 ? class37.method463((byte) 82, var10, arg3) : 0);
        if (class525.field7275 <= arg4) {
            arg4 -= class525.field7275;
        }
        if (var11 <= 0) {
            if (~(arg4 + arg6) < ~class525.field7275) {
                int var12 = -arg4 + class525.field7275;
                for (int var13 = 0; ~arg1 < ~var13; ++var13) {
                    int[] var14 = arg2[arg5 + var13];
                    class363.method2321(var14, arg4, var12, var8);
                    class363.method2321(var14, 0, arg6 - var12, var8);
                }
            } else {
                for (int var15 = 0; arg1 > var15; ++var15) {
                    class363.method2321(arg2[arg5 + var15], arg4, arg6, var8);
                }
            }
        } else if (~arg1 < -1 && ~arg6 < -1) {
            int var16 = arg6 / 2;
            int var17 = arg1 / 2;
            int var18 = var16 < var11 ? var16 : var11;
            int var19 = var17 >= var11 ? var11 : var17;
            int var20 = arg4 - -var18;
            int var21 = arg6 - var18 * 2;
            for (int var22 = 0; ~arg1 < ~var22; ++var22) {
                int[] var23 = arg2[var22 - -arg5];
                if (~var19 < ~var22) {
                    int var24 = var8 * var22 / var19;
                    if (~this.field9853 == -1) {
                        for (int var25 = 0; ~var18 < ~var25; ++var25) {
                            int var26 = var8 * var25 / var18;
                            var23[class263.method1762(arg4 + var25, class677.field9204)] = var23[class263.method1762(class677.field9204, arg4 - (var25 - -1 + -arg6))] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; ~var27 > ~var18; ++var27) {
                            int var29 = var8 * var27 / var18;
                            var23[class263.method1762(class677.field9204, arg4 + var27)] = var23[class263.method1762(arg4 - -arg6 + (-var27 - 1), class677.field9204)] = var29 < var24 ? var29 : var24;
                        }
                    }
                    if (class525.field7275 >= var20 + var21) {
                        class363.method2321(var23, var20, var21, var24);
                    } else {
                        int var28 = -var20 + class525.field7275;
                        class363.method2321(var23, var20, var28, var24);
                        class363.method2321(var23, 0, var21 - var28, var24);
                    }
                } else {
                    int var30 = -var22 + arg1 + -1;
                    if (~var30 > ~var19) {
                        int var31 = var8 * var30 / var19;
                        if (this.field9853 == 0) {
                            for (int var32 = 0; var18 > var32; ++var32) {
                                int var33 = var8 * var32 / var18;
                                var23[class263.method1762(class677.field9204, arg4 + var32)] = var23[class263.method1762(class677.field9204, arg6 + -1 + arg4 - var32)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; ~var34 > ~var18; ++var34) {
                                int var36 = var8 * var34 / var18;
                                var23[class263.method1762(class677.field9204, arg4 + var34)] = var23[class263.method1762(class677.field9204, -var34 + arg6 + arg4 + -1)] = var31 <= var36 ? var31 : var36;
                            }
                        }
                        if (var20 + var21 <= class525.field7275) {
                            class363.method2321(var23, var20, var21, var31);
                        } else {
                            int var35 = -var20 + class525.field7275;
                            class363.method2321(var23, var20, var35, var31);
                            class363.method2321(var23, 0, -var35 + var21, var31);
                        }
                    } else {
                        for (int var37 = 0; var37 < var18; ++var37) {
                            var23[class263.method1762(arg4 + var37, class677.field9204)] = var23[class263.method1762(class677.field9204, arg4 - (-arg6 + 1) + -var37)] = var8 * var37 / var18;
                        }
                        if (class525.field7275 >= var20 - -var21) {
                            class363.method2321(var23, var20, var21, var8);
                        } else {
                            int var38 = -var20 + class525.field7275;
                            class363.method2321(var23, var20, var38, var8);
                            class363.method2321(var23, 0, var21 - var38, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(CZLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method4031(char arg0, boolean arg1, String arg2) {
        ++field9856;
        int var3 = class425.method2604(4, arg2, arg0);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        if (!arg1) {
            method4032((byte) -76);
        }
        for (int var7 = 0; ~var3 < ~var7; ++var7) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; ++var8) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static void method4032(byte arg0) {
        field9860 = null;
        if (arg0 > -63) {
            method4032((byte) -91);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class728() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field9862;
        if (arg1 != 255) {
            this.field9853 = 113;
        }
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int[][] var4 = super.field4165.method121((byte) 16);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class525.field7275 * this.field9858 >> 12;
            int var15 = class525.field7275 * this.field9861 >> 12;
            int var16 = class128.field2169 * this.field9863 >> 12;
            int var17 = class128.field2169 * this.field9864 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field9847 = class525.field7275 / 8 * this.field9852 >> 12;
                int var18 = class525.field7275 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field9859);
                while (true) {
                    while (true) {
                        int var22 = var14 + class37.method463((byte) 106, var15 - var14, var21);
                        int var23 = class37.method463((byte) 117, -var16 + var17, var21) + var16;
                        int var24 = var8 + var22;
                        if (var24 > class525.field7275) {
                            var24 = class525.field7275;
                            var22 = class525.field7275 - var8;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class525.field7275;
                            }
                            if (~class525.field7275 > ~var29) {
                                var29 -= class525.field7275;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var29 >= var30[0] && var30[1] >= var29) {
                                    var25 = var27[2];
                                    if (var9 != var26) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class525.field7275;
                                        }
                                        if (~var31 < ~class525.field7275) {
                                            var31 -= class525.field7275;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var29) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class525.field7275;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method4030(124, var25 - var35, var4, var21, var7 + var38, var35, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~(var23 + var25) >= ~class128.field2169) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class128.field2169;
                        }
                        if (~class525.field7275 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            this.method4030(112, var23, var4, var21, var6 + var8, var25, var22);
                            var8 = var24;
                        } else {
                            this.method4030(-59, var23, var4, var21, var6 + var8, var25, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var23 + var25;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class37.method463((byte) 113, class525.field7275, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class525.field7275 + var5;
                            }
                            var9 = 0;
                            if (~class525.field7275 > ~var44) {
                                var44 -= class525.field7275;
                            }
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && var44 <= var45[1]) {
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
}

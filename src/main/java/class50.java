import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class50 extends class11 {

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    private int field600 = 2048;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    private int field603 = 0;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    private int field606 = 1024;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    private int field599 = 819;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    private int field609 = 1024;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
    private int field612 = 1024;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    private int field597 = 0;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
    private int field615 = 409;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
    private int field613 = 1024;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "Lol;")
    public static class187 field607 = new class187("", 17);

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "Lmg;")
    public static class101 field604;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "Lmg;")
    public static class101 field611;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "[Ll;")
    public static class16[] field602;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B[[BLod;)V")
    public static final void method439(byte arg0, byte[][] arg1, class349 arg2) {
        ++field617;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = -37 / ((arg0 - -23) / 57);
        for (int var5 = 0; arg2.field4430 > var5; ++var5) {
            class358.method2144((byte) -95);
            for (int var6 = 0; ~var6 > ~(class527.field7799 >> 3); ++var6) {
                for (int var7 = 0; ~(class422.field6182 >> 3) < ~var7; ++var7) {
                    boolean var8 = false;
                    int var9 = class18.field237[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 62658234) >> 24;
                        if (!arg2.field4433 || ~var10 == -1) {
                            int var11 = var9 >> 1 & 3;
                            int var12 = 1023 & var9 >> 14;
                            int var13 = (16379 & var9) >> 3;
                            int var14 = (var12 / 8 << 8) - -(var13 / 8);
                            for (int var15 = 0; var15 < class310.field4218.length; ++var15) {
                                if (~class310.field4218[var15] == ~var14 && arg1[var15] != null) {
                                    class391 var16 = new class391(arg1[var15]);
                                    arg2.method1877(var7 * 8, class82.field1229, var10, var11, 110, var13, var6 * 8, var16, var5, var12);
                                    var8 = true;
                                    arg2.method2075(var6 * 8, var5, var12, 0, var7 * 8, var11, class269.field3721, var3[0] == -1 ? var3 : null, var16, var10, var13);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        arg2.method1883(var7 * 8, var6 * 8, (byte) 85, var5, 8, 8);
                    }
                }
            }
        }
        if (~var3[0] != 0) {
            class294.field4052 = class214.field2995.method1264(var3[1], var3[3], 0, class328.field4481, var3[0], var3[2]);
            class436.field6378 = var3[4];
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)Z")
    public static final boolean method440(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            return true;
        } else {
            ++field608;
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field605;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field609 = arg0.method2353((byte) 96);
                                        }
                                    } else {
                                        this.field612 = arg0.method2353((byte) 101);
                                    }
                                } else {
                                    this.field597 = arg0.method2348(-2);
                                }
                            } else {
                                this.field606 = arg0.method2353((byte) 78);
                            }
                        } else {
                            this.field599 = arg0.method2353((byte) 81);
                        }
                    } else {
                        this.field615 = arg0.method2353((byte) 93);
                    }
                } else {
                    this.field600 = arg0.method2353((byte) 75);
                }
            } else {
                this.field613 = arg0.method2353((byte) 94);
            }
        } else {
            this.field603 = arg0.method2348(-2);
        }
        if (arg1 > -40) {
            this.method42(false);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/awt/Canvas;)Ldj;")
    public static final class228 method441(byte arg0, Canvas arg1) {
        ++field610;
        try {
            Class var2 = Class.forName("aa");
            class228 var3 = (class228) var2.newInstance();
            if (arg0 <= 7) {
                return null;
            } else {
                var3.method1420(-1, arg1);
                return var3;
            }
        } catch (Throwable var5) {
            class300 var4 = new class300();
            var4.method1420(-1, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([[IIIIIILjava/util/Random;)V")
    private final void method442(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field594;
        int var8 = arg3 < this.field609 ? -class367.method2213(-837693600, this.field609, arg6) + 4096 : 4096;
        int var9 = this.field614 * this.field612 >> 12;
        int var10 = this.field614 + -(var9 > 0 ? class367.method2213(arg3 + -837693600, var9, arg6) : 0);
        if (~arg5 <= ~class90.field1316) {
            arg5 -= class90.field1316;
        }
        if (~var10 >= -1) {
            if (arg4 + arg5 <= class90.field1316) {
                for (int var11 = 0; ~var11 > ~arg2; ++var11) {
                    class91.method681(arg0[arg1 + var11], arg5, arg4, var8);
                }
            } else {
                int var12 = -arg5 + class90.field1316;
                for (int var13 = 0; var13 < arg2; ++var13) {
                    int[] var14 = arg0[arg1 + var13];
                    class91.method681(var14, arg5, var12, var8);
                    class91.method681(var14, 0, -var12 + arg4, var8);
                }
            }
        } else if (arg2 > 0 && arg4 > 0) {
            int var15 = arg4 / 2;
            int var16 = arg2 / 2;
            int var17 = ~var10 >= ~var15 ? var10 : var15;
            int var18 = ~var10 < ~var16 ? var16 : var10;
            int var19 = arg5 + var17;
            int var20 = -(var17 * 2) + arg4;
            for (int var21 = 0; ~var21 > ~arg2; ++var21) {
                int[] var22 = arg0[var21 - -arg1];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field597 != -1) {
                        for (int var24 = 0; var17 > var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class251.method1501(arg5 + var24, class99.field1490)] = var22[class251.method1501(arg4 + arg5 + -var24 + -1, class99.field1490)] = ~var23 < ~var25 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class251.method1501(class99.field1490, arg5 + var26)] = var22[class251.method1501(arg4 - var26 + arg5 + -1, class99.field1490)] = var23 * var28 >> 12;
                        }
                    }
                    if (class90.field1316 < var19 + var20) {
                        int var27 = class90.field1316 - var19;
                        class91.method681(var22, var19, var27, var23);
                        class91.method681(var22, 0, var20 - var27, var23);
                    } else {
                        class91.method681(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg2 + -1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field597 != -1) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class251.method1501(class99.field1490, arg5 + var31)] = var22[class251.method1501(arg4 + -1 + arg5 - var31, class99.field1490)] = ~var30 >= ~var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class251.method1501(class99.field1490, arg5 - -var33)] = var22[class251.method1501(arg5 - -arg4 + (-var33 - 1), class99.field1490)] = var30 * var35 >> 12;
                            }
                        }
                        if (~(var19 + var20) >= ~class90.field1316) {
                            class91.method681(var22, var19, var20, var30);
                        } else {
                            int var34 = class90.field1316 - var19;
                            class91.method681(var22, var19, var34, var30);
                            class91.method681(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class251.method1501(class99.field1490, arg5 + var36)] = var22[class251.method1501(class99.field1490, arg5 + -1 - (-arg4 + var36))] = var8 * var36 / var17;
                        }
                        if (var19 + var20 <= class90.field1316) {
                            class91.method681(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class90.field1316;
                            class91.method681(var22, var19, var37, var8);
                            class91.method681(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field601;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int[][] var4 = super.field158.method1310(3286);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class90.field1316 * this.field613 >> 12;
            int var15 = class90.field1316 * this.field600 >> 12;
            int var16 = class508.field7537 * this.field615 >> 12;
            int var17 = class508.field7537 * this.field599 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field614 = class90.field1316 / 8 * this.field606 >> 12;
            int var18 = class90.field1316 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field603);
            label129: while (true) {
                while (true) {
                    int var22 = var14 - -class367.method2213(-837693600, var15 - var14, var21);
                    int var23 = class367.method2213(-837693600, var17 - var16, var21) + var16;
                    int var24 = var8 - -var22;
                    if (class90.field1316 < var24) {
                        var22 = -var8 + class90.field1316;
                        var24 = class90.field1316;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (~var28 > -1) {
                            var28 += class90.field1316;
                        }
                        if (~class90.field1316 > ~var28) {
                            var28 -= class90.field1316;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && ~var28 >= ~var30[1]) {
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class90.field1316;
                                    }
                                    if (~class90.field1316 > ~var31) {
                                        var31 -= class90.field1316;
                                    }
                                    for (int var32 = 1; var27 >= var32; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var27 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var29 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var28 <= var31) {
                                                if (var36 == 0) {
                                                    var38 = Math.min(var28, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class90.field1316;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var28, var37);
                                            }
                                            this.method442(var4, var35, -var35 + var29, 0, -var39 + var38, var7 + var39, var21);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            int var10000 = ~var12;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~(var23 + var29) < ~class508.field7537) {
                        var23 = -var29 + class508.field7537;
                    } else {
                        var10 = false;
                    }
                    if (class90.field1316 == var24) {
                        this.method442(var4, var29, var23, 0, var22, var6 + var8, var21);
                        if (var10) {
                            break label129;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[2] = var23 + var29;
                        var41[1] = var24;
                        var41[0] = var8;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var13 = 0;
                        var7 = var6;
                        var6 = class367.method2213(-837693600, class90.field1316, var21);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class90.field1316 + var5;
                        }
                        var9 = 0;
                        if (class90.field1316 < var43) {
                            var43 -= class90.field1316;
                        }
                        var11 = false;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var43 >= var44[0] && ~var43 >= ~var44[1]) {
                                break;
                            }
                            ++var9;
                            if (~var9 <= ~var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[0] = var8;
                        var45[2] = var23 + var29;
                        var45[1] = var24;
                        this.method442(var4, var29, var23, 0, var22, var6 + var8, var21);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg0 >= -42) {
            this.method44(53, 115);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
    public final void method42(boolean arg0) {
        ++field598;
        if (!arg0) {
            method445(-110);
        }
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
    public static void method443(int arg0) {
        field602 = null;
        field607 = null;
        field604 = null;
        field611 = null;
        int var1 = 85 % ((58 - arg0) / 39);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
    public static final void method444(int arg0) {
        if (arg0 == 17755) {
            ++field596;
            if (class46.field559) {
                class506.field7454 = null;
                class46.field559 = false;
                class291.field4029 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)I")
    public static final int method445(int arg0) {
        if (arg0 != -8) {
            method441((byte) -49, (Canvas) null);
        }
        ++field595;
        if (class147.field2140 != null) {
            return 3;
        } else {
            return class127.field1891 ? 2 : 1;
        }
    }
}

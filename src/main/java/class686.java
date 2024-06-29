import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class686 extends class5 {

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private int field9627 = 409;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    private int field9633 = 1024;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    private int field9639 = 819;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    private int field9638 = 1024;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    private int field9637 = 1024;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    private int field9642 = 0;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    private int field9644 = 2048;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    private int field9635 = 1024;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    private int field9636 = 0;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "[[Z")
    public static boolean[][] field9641 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Lct;")
    public static class414 field9628 = new class414();

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "[[I")
    public static int[][] field9648 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    private int field9629;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLes;)V", line = 5)
    public static final void method3855(byte arg0, class630 arg1) {
        ++field9646;
        if (arg0 != -126) {
            method3857((byte) -97);
        }
        if (~(arg1.field8804.length + -arg1.field8812) <= -2) {
            int var2 = arg1.method3501(-9268);
            if (var2 >= 0 && ~var2 >= -2) {
                if (arg1.field8804.length - arg1.field8812 >= 2) {
                    int var3 = arg1.method3470(arg0 ^ -13131);
                    if (arg1.field8804.length + -arg1.field8812 >= var3 * 6) {
                        for (int var4 = 0; ~var4 > ~var3; ++var4) {
                            int var5 = arg1.method3470(13111);
                            int var6 = arg1.method3483(arg0 + 198);
                            if (class412.field5150.length > var5 && class287.field3574[var5] && (~class78.field1078.method2176((byte) -127, var5).field9069 != -50 || var6 >= -1 && var6 <= 1)) {
                                class412.field5150[var5] = var6;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z", line = 56)
    public static final boolean method3856(int arg0, int arg1, int arg2) {
        ++field9630;
        if (arg1 != 32) {
            field9648 = null;
        }
        return ~(32 & arg0) != -1;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 208)
    public class686() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILes;I)V", line = 76)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field9638 = arg1.method3470(13111);
                                        }
                                    } else {
                                        this.field9635 = arg1.method3470(13111);
                                    }
                                } else {
                                    this.field9642 = arg1.method3501(-9268);
                                }
                            } else {
                                this.field9633 = arg1.method3470(arg0 + 13110);
                            }
                        } else {
                            this.field9639 = arg1.method3470(13111);
                        }
                    } else {
                        this.field9627 = arg1.method3470(13111);
                    }
                } else {
                    this.field9644 = arg1.method3470(13111);
                }
            } else {
                this.field9637 = arg1.method3470(arg0 ^ 13110);
            }
        } else {
            this.field9636 = arg1.method3501(-9268);
        }
        if (arg0 != 1) {
            method3859(76, -23);
        }
        ++field9632;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V", line = 187)
    public static void method3857(byte arg0) {
        field9628 = null;
        field9641 = null;
        field9648 = null;
        int var1 = 101 % ((-26 - arg0) / 33);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I", line = 211)
    public static final int method3858(int arg0, int arg1) {
        return class180.field2320 != null ? class180.field2320[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)V", line = 217)
    public static final void method3859(int arg0, int arg1) {
        if (arg1 == 1) {
            class486.field6442 = arg0;
            ++field9640;
            class577.field8054.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIILr;)V", line = 229)
    public static final void method3860(int arg0, int arg1, int arg2, int arg3, int arg4, class566 arg5) {
        arg5.method1083(arg1, arg4, arg1 + arg3, arg2 + arg4);
        ++field9647;
        int var6 = -39 / ((arg0 - -42) / 49);
        arg5.method3118(-16777216, arg1, arg4, 1, arg2, arg3);
        if (~class294.field3634 <= -101) {
            float var7 = (float) class656.field9273 / (float) class656.field9259;
            int var8 = arg3;
            int var9 = arg2;
            if (!(var7 < 1.0F)) {
                var8 = (int) ((float) arg2 / var7);
            } else {
                var9 = (int) ((float) arg3 * var7);
            }
            int var10 = (-var9 + arg2) / 2 + arg4;
            int var11 = (-var8 + arg3) / 2 + arg1;
            if (class289.field3594 == null || ~class289.field3594.method167() != ~arg3 || ~class289.field3594.method162() != ~arg2) {
                class656.method3688(class656.field9265, class656.field9273 + class656.field9264, class656.field9265 + class656.field9259, class656.field9264, var11, var10, var8 + var11, var10 - -var9);
                class656.method3674(arg5);
                class289.field3594 = arg5.method1053(var11, var10, var8, var9, false);
            }
            class289.field3594.method2902(var11, var10);
            int var12 = class553.field7701 * var8 / class656.field9259;
            int var13 = class447.field5742 * var9 / class656.field9273;
            int var14 = class239.field2988 * var8 / class656.field9259 + var11;
            int var15 = -(class238.field2970 * var9 / class656.field9273) + var9 + var10 + -var13;
            int var16 = -1996554240;
            if (class98.field1337 == class641.field9035) {
                var16 = -1996488705;
            }
            arg5.method1090(var14, var15, var12, var13, var16, 1);
            arg5.method978(var14, var15, var12, var13, var16, 0);
            if (class590.field8287 > 0) {
                int var17;
                if (class673.field9471 <= 50) {
                    var17 = class673.field9471 * 5;
                } else {
                    var17 = (100 - class673.field9471) * 5;
                }
                for (class316 var18 = (class316) class656.field9247.method237(98); var18 != null; var18 = (class316) class656.field9247.method245((byte) 109)) {
                    class647 var19 = class656.field9234.method3771(var18.field4057, 5);
                    if (class455.method2434(var19, (byte) -66)) {
                        if (~class382.field4823 != ~var18.field4057) {
                            if (class550.field7645 != -1 && class550.field7645 == var19.field9118) {
                                int var20 = var18.field4055 * var8 / class656.field9259 + var11;
                                int var21 = (class656.field9273 - var18.field4056) * var9 / class656.field9273 + var10;
                                arg5.method3118(16776960 | var17 << 24, var20 - 2, var21 + -2, 1, 4, 4);
                            }
                        } else {
                            int var22 = var18.field4055 * var8 / class656.field9259 + var11;
                            int var23 = var10 - -((-var18.field4056 + class656.field9273) * var9 / class656.field9273);
                            arg5.method3118(var17 << 24 | 16776960, var22 + -2, var23 + -2, 1, 4, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 327)
    public final void method46(int arg0) {
        int var2 = -1 / ((arg0 - 64) / 60);
        ++field9643;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[[ILjava/util/Random;II)V", line = 336)
    private final void method3861(int arg0, int arg1, int arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        ++field9634;
        int var8 = ~this.field9638 < -1 ? -class517.method2801(arg4, this.field9638, 126) + 4096 : 4096;
        int var9 = this.field9635 * this.field9629 >> 12;
        int var10 = this.field9629 - (arg6 > ~var9 ? class517.method2801(arg4, var9, 123) : 0);
        if (arg1 >= class657.field9287) {
            arg1 -= class657.field9287;
        }
        if (var10 > 0) {
            if (arg5 > 0 && ~arg2 < -1) {
                int var11 = arg2 / 2;
                int var12 = arg5 / 2;
                int var13 = ~var10 < ~var11 ? var11 : var10;
                int var14 = ~var12 <= ~var10 ? var10 : var12;
                int var15 = arg1 - -var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; ~arg5 < ~var17; ++var17) {
                    int[] var18 = arg3[var17 - -arg0];
                    if (var14 > var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field9642 != -1) {
                            for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class695.method3921(arg1 - -var20, class194.field2440)] = var18[class695.method3921(-var20 + arg1 + -1 + arg2, class194.field2440)] = var19 > var21 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class695.method3921(class194.field2440, arg1 + var22)] = var18[class695.method3921(class194.field2440, -var22 + arg1 + arg2 + -1)] = var19 * var24 >> 12;
                            }
                        }
                        if (~(var15 - -var16) < ~class657.field9287) {
                            int var23 = -var15 + class657.field9287;
                            class293.method1642(var18, var15, var23, var19);
                            class293.method1642(var18, 0, -var23 + var16, var19);
                        } else {
                            class293.method1642(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg5 + -1 - var17;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field9642 != -1) {
                                for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class695.method3921(class194.field2440, arg1 + var27)] = var18[class695.method3921(-var27 + -1 + arg1 + arg2, class194.field2440)] = ~var26 >= ~var28 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; var29 < var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class695.method3921(arg1 + var29, class194.field2440)] = var18[class695.method3921(class194.field2440, arg1 - (-arg2 + var29 + 1))] = var26 * var31 >> 12;
                                }
                            }
                            if (~(var15 + var16) >= ~class657.field9287) {
                                class293.method1642(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class657.field9287;
                                class293.method1642(var18, var15, var30, var26);
                                class293.method1642(var18, 0, var16 - var30, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                var18[class695.method3921(class194.field2440, arg1 - -var32)] = var18[class695.method3921(class194.field2440, arg1 + arg2 + -var32 - 1)] = var8 * var32 / var13;
                            }
                            if (~class657.field9287 > ~(var15 + var16)) {
                                int var33 = class657.field9287 - var15;
                                class293.method1642(var18, var15, var33, var8);
                                class293.method1642(var18, 0, -var33 + var16, var8);
                            } else {
                                class293.method1642(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (class657.field9287 < arg1 - -arg2) {
            int var34 = -arg1 + class657.field9287;
            for (int var35 = 0; arg5 > var35; ++var35) {
                int[] var36 = arg3[arg0 + var35];
                class293.method1642(var36, arg1, var34, var8);
                class293.method1642(var36, 0, -var34 + arg2, var8);
            }
        } else {
            for (int var37 = 0; ~arg5 < ~var37; ++var37) {
                class293.method1642(arg3[arg0 + var37], arg1, arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I", line = 529)
    public final int[] method39(int arg0, int arg1) {
        ++field9631;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = 63 % ((81 - arg0) / 36);
        if (super.field126.field8392) {
            int[][] var5 = super.field126.method3282(false);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = 0;
            int var14 = 0;
            int var15 = class657.field9287 * this.field9637 >> 12;
            int var16 = class657.field9287 * this.field9644 >> 12;
            int var17 = class622.field8706 * this.field9627 >> 12;
            int var18 = class622.field8706 * this.field9639 >> 12;
            if (~var18 >= -2) {
                return var5[arg1];
            } else {
                this.field9629 = class657.field9287 / 8 * this.field9633 >> 12;
                int var19 = class657.field9287 / var15 + 1;
                int[][] var20 = new int[var19][3];
                int[][] var21 = new int[var19][3];
                Random var22 = new Random((long) this.field9636);
                while (true) {
                    while (true) {
                        int var23 = class517.method2801(var22, -var15 + var16, 123) + var15;
                        int var24 = var17 - -class517.method2801(var22, -var17 + var18, 124);
                        int var25 = var9 + var23;
                        if (~var25 < ~class657.field9287) {
                            var25 = class657.field9287;
                            var23 = -var9 + class657.field9287;
                        }
                        int var30;
                        if (var12) {
                            var30 = 0;
                        } else {
                            int var26 = var10;
                            int[] var27 = var21[var10];
                            int var28 = 0;
                            int var29 = var6 + var25;
                            if (var29 < 0) {
                                var29 += class657.field9287;
                            }
                            if (~class657.field9287 > ~var29) {
                                var29 -= class657.field9287;
                            }
                            var30 = var27[2];
                            while (true) {
                                int[] var31 = var21[var26];
                                if (var31[0] <= var29 && var29 <= var31[1]) {
                                    if (var10 != var26) {
                                        int var32 = var9 - -var6;
                                        if (~var32 > -1) {
                                            var32 += class657.field9287;
                                        }
                                        if (~class657.field9287 > ~var32) {
                                            var32 -= class657.field9287;
                                        }
                                        for (int var33 = 1; ~var28 <= ~var33; ++var33) {
                                            int[] var41 = var21[(var10 - -var33) % var13];
                                            var30 = Math.max(var30, var41[2]);
                                        }
                                        for (int var34 = 0; var28 >= var34; ++var34) {
                                            int[] var35 = var21[(var10 + var34) % var13];
                                            int var36 = var35[2];
                                            if (var30 != var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (var29 > var32) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var29, var38);
                                                } else if (~var37 != -1) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class657.field9287;
                                                } else {
                                                    var40 = Math.min(var29, var38);
                                                    var39 = 0;
                                                }
                                                this.method3861(var36, var8 + var39, var40 - var39, var5, var22, -var36 + var30, -1);
                                            }
                                        }
                                    }
                                    var10 = var26;
                                    break;
                                }
                                ++var26;
                                if (var26 >= var13) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (class622.field8706 >= var24 + var30) {
                            var11 = false;
                        } else {
                            var24 = -var30 + class622.field8706;
                        }
                        if (class657.field9287 != var25) {
                            int[] var42 = var20[var14++];
                            var42[2] = var24 + var30;
                            var42[0] = var9;
                            var42[1] = var25;
                            this.method3861(var30, var7 + var9, var23, var5, var22, var24, -1);
                            var9 = var25;
                        } else {
                            this.method3861(var30, var7 + var9, var23, var5, var22, var24, -1);
                            if (var11) {
                                return var3;
                            }
                            var11 = true;
                            int[] var43 = var20[var14++];
                            var43[1] = var25;
                            var43[2] = var24 + var30;
                            var43[0] = var9;
                            int[][] var44 = var21;
                            var21 = var20;
                            var20 = var44;
                            var13 = var14;
                            var14 = 0;
                            var8 = var7;
                            var7 = class517.method2801(var22, class657.field9287, 122);
                            var6 = var7 - var8;
                            var9 = 0;
                            int var45 = var6;
                            if (~var6 > -1) {
                                var45 = class657.field9287 + var6;
                            }
                            var10 = 0;
                            if (~class657.field9287 > ~var45) {
                                var45 -= class657.field9287;
                            }
                            var12 = false;
                            while (true) {
                                int[] var46 = var21[var10];
                                if (~var45 <= ~var46[0] && var45 <= var46[1]) {
                                    break;
                                }
                                int var10000 = ~var13;
                                ++var10;
                                if (var10000 >= ~var10) {
                                    var10 = 0;
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

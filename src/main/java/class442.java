import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class442 extends class334 {

    @OriginalMember(owner = "client!qja", name = "E", descriptor = "I")
    private int field6109 = 1024;

    @OriginalMember(owner = "client!qja", name = "L", descriptor = "I")
    private int field6116 = 1024;

    @OriginalMember(owner = "client!qja", name = "P", descriptor = "I")
    private int field6120 = 819;

    @OriginalMember(owner = "client!qja", name = "K", descriptor = "I")
    private int field6115 = 1024;

    @OriginalMember(owner = "client!qja", name = "N", descriptor = "I")
    private int field6118 = 0;

    @OriginalMember(owner = "client!qja", name = "R", descriptor = "I")
    private int field6122 = 409;

    @OriginalMember(owner = "client!qja", name = "Q", descriptor = "I")
    private int field6121 = 2048;

    @OriginalMember(owner = "client!qja", name = "U", descriptor = "I")
    private int field6125 = 0;

    @OriginalMember(owner = "client!qja", name = "O", descriptor = "I")
    private int field6119 = 1024;

    @OriginalMember(owner = "client!qja", name = "S", descriptor = "Llia;")
    public static class631 field6123 = new class631();

    @OriginalMember(owner = "client!qja", name = "V", descriptor = "I")
    public static int field6126 = 0;

    @OriginalMember(owner = "client!qja", name = "F", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!qja", name = "G", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!qja", name = "H", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!qja", name = "I", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!qja", name = "J", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!qja", name = "M", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!qja", name = "T", descriptor = "I")
    private int field6124;

    @OriginalMember(owner = "client!qja", name = "<init>", descriptor = "()V")
    public class442() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(II)V")
    public static final void method2616(int arg0, int arg1) {
        class172 var2 = class514.field7096[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class172 var4 = class514.field7096[var3][arg0][arg1] = class514.field7096[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class11 var5 = var4.field2594; var5 != null; var5 = var5.field145) {
                    class208 var6 = var5.field143;
                    if (var6.field3027 == arg0 && var6.field3035 == arg1) {
                        --var6.field10361;
                    }
                }
                if (var4.field2595 != null) {
                    --var4.field2595.field10361;
                }
                if (var4.field2593 != null) {
                    --var4.field2593.field10361;
                }
                if (var4.field2600 != null) {
                    --var4.field2600.field10361;
                }
                if (var4.field2591 != null) {
                    --var4.field2591.field10361;
                }
                if (var4.field2598 != null) {
                    --var4.field2598.field10361;
                }
            }
        }
        if (class514.field7096[0][arg0][arg1] == null) {
            class514.field7096[0][arg0][arg1] = new class172(0);
            class514.field7096[0][arg0][arg1].field2599 = 1;
        }
        class514.field7096[0][arg0][arg1].field2592 = var2;
        class514.field7096[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field6113;
        int[] var3 = super.field4743.method1027((byte) -125, arg0);
        if (arg1 != -22563988) {
            this.method27((byte) 90);
        }
        if (super.field4743.field1993) {
            int[][] var4 = super.field4743.method1024((byte) 116);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class439.field6099 * this.field6116 >> 12;
            int var15 = class439.field6099 * this.field6121 >> 12;
            int var16 = class327.field4668 * this.field6122 >> 12;
            int var17 = class327.field4668 * this.field6120 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field6124 = class439.field6099 / 8 * this.field6115 >> 12;
                int var18 = class439.field6099 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6118);
                while (true) {
                    while (true) {
                        int var22 = class728.method4047(127, -var14 + var15, var21) + var14;
                        int var23 = var16 - -class728.method4047(118, -var16 + var17, var21);
                        int var24 = var8 + var22;
                        if (~class439.field6099 > ~var24) {
                            var24 = class439.field6099;
                            var22 = -var8 + class439.field6099;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class439.field6099;
                            }
                            if (var28 > class439.field6099) {
                                var28 -= class439.field6099;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (var29[0] <= var28 && ~var28 >= ~var29[1]) {
                                    var30 = var26[2];
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class439.field6099;
                                        }
                                        if (class439.field6099 < var31) {
                                            var31 -= class439.field6099;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var30 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var28) {
                                                    if (var36 == 0) {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class439.field6099;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method2618(var21, arg1 ^ -22564017, -var35 + var30, -var38 + var39, var35, var4, var38 - -var7);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                ++var25;
                                if (var25 >= var12) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (var23 + var30 > class327.field4668) {
                            var23 = class327.field4668 - var30;
                        } else {
                            var10 = false;
                        }
                        if (class439.field6099 == var24) {
                            this.method2618(var21, -118, var23, var22, var30, var4, var6 + var8);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var30;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var7 = var6;
                            var13 = 0;
                            var6 = class728.method4047(119, class439.field6099, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class439.field6099 + var5;
                            }
                            if (~class439.field6099 > ~var43) {
                                var43 -= class439.field6099;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (var43 >= var44[0] && ~var44[1] <= ~var43) {
                                    var11 = false;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var30 - -var23;
                            var45[1] = var24;
                            var45[0] = var8;
                            this.method2618(var21, 33, var23, var22, var30, var4, var8 - -var6);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        ++field6112;
        if (arg0 > -27) {
            this.method2618((Random) null, 116, -102, -12, -113, (int[][]) null, -93);
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field6114;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field6109 = arg2.method2565((byte) -110);
                                        }
                                    } else {
                                        this.field6119 = arg2.method2565((byte) -119);
                                    }
                                } else {
                                    this.field6125 = arg2.method2557(14929);
                                }
                            } else {
                                this.field6115 = arg2.method2565((byte) -125);
                            }
                        } else {
                            this.field6120 = arg2.method2565((byte) -119);
                        }
                    } else {
                        this.field6122 = arg2.method2565((byte) -100);
                    }
                } else {
                    this.field6121 = arg2.method2565((byte) -122);
                }
            } else {
                this.field6116 = arg2.method2565((byte) -112);
            }
        } else {
            this.field6118 = arg2.method2557(14929);
        }
        if (arg1) {
            method2616(75, 5);
        }
    }

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "(B)V")
    public static void method2617(byte arg0) {
        if (arg0 != 51) {
            method2619((byte) -26, (byte[]) null);
        }
        field6123 = null;
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Ljava/util/Random;IIII[[II)V")
    private final void method2618(Random arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int arg6) {
        ++field6110;
        int var8 = ~this.field6109 < -1 ? 4096 + -class728.method4047(121, this.field6109, arg0) : 4096;
        int var9 = this.field6124 * this.field6119 >> 12;
        int var10 = -120 % ((arg1 - -58) / 60);
        int var11 = this.field6124 - (~var9 < -1 ? class728.method4047(118, var9, arg0) : 0);
        if (class439.field6099 <= arg6) {
            arg6 -= class439.field6099;
        }
        if (~var11 < -1) {
            if (arg2 > 0 && ~arg3 < -1) {
                int var12 = arg3 / 2;
                int var13 = arg2 / 2;
                int var14 = var11 <= var12 ? var11 : var12;
                int var15 = var11 <= var13 ? var11 : var13;
                int var16 = arg6 - -var14;
                int var17 = -(var14 * 2) + arg3;
                for (int var18 = 0; ~var18 > ~arg2; ++var18) {
                    int[] var19 = arg5[arg4 + var18];
                    if (var15 > var18) {
                        int var20 = var8 * var18 / var15;
                        if (~this.field6125 != -1) {
                            for (int var21 = 0; var21 < var14; ++var21) {
                                int var22 = var8 * var21 / var14;
                                var19[class194.method1380(class478.field6578, arg6 + var21)] = var19[class194.method1380(class478.field6578, -var21 + arg3 + arg6 + -1)] = var20 > var22 ? var22 : var20;
                            }
                        } else {
                            for (int var23 = 0; ~var14 < ~var23; ++var23) {
                                int var25 = var8 * var23 / var14;
                                var19[class194.method1380(arg6 + var23, class478.field6578)] = var19[class194.method1380(class478.field6578, arg6 - -arg3 + -var23 + -1)] = var20 * var25 >> 12;
                            }
                        }
                        if (~(var16 + var17) < ~class439.field6099) {
                            int var24 = -var16 + class439.field6099;
                            class171.method1264(var19, var16, var24, var20);
                            class171.method1264(var19, 0, -var24 + var17, var20);
                        } else {
                            class171.method1264(var19, var16, var17, var20);
                        }
                    } else {
                        int var26 = -var18 + arg2 + -1;
                        if (var26 < var15) {
                            int var27 = var8 * var26 / var15;
                            if (~this.field6125 != -1) {
                                for (int var28 = 0; ~var14 < ~var28; ++var28) {
                                    int var29 = var8 * var28 / var14;
                                    var19[class194.method1380(class478.field6578, arg6 + var28)] = var19[class194.method1380(class478.field6578, -var28 + -1 + arg3 + arg6)] = var27 > var29 ? var29 : var27;
                                }
                            } else {
                                for (int var30 = 0; var14 > var30; ++var30) {
                                    int var32 = var8 * var30 / var14;
                                    var19[class194.method1380(class478.field6578, arg6 + var30)] = var19[class194.method1380(class478.field6578, arg3 + arg6 - (var30 - -1))] = var27 * var32 >> 12;
                                }
                            }
                            if (~(var16 + var17) >= ~class439.field6099) {
                                class171.method1264(var19, var16, var17, var27);
                            } else {
                                int var31 = class439.field6099 - var16;
                                class171.method1264(var19, var16, var31, var27);
                                class171.method1264(var19, 0, -var31 + var17, var27);
                            }
                        } else {
                            for (int var33 = 0; ~var14 < ~var33; ++var33) {
                                var19[class194.method1380(arg6 + var33, class478.field6578)] = var19[class194.method1380(class478.field6578, arg3 + arg6 - (var33 - -1))] = var8 * var33 / var14;
                            }
                            if (~class439.field6099 <= ~(var16 + var17)) {
                                class171.method1264(var19, var16, var17, var8);
                            } else {
                                int var34 = -var16 + class439.field6099;
                                class171.method1264(var19, var16, var34, var8);
                                class171.method1264(var19, 0, -var34 + var17, var8);
                            }
                        }
                    }
                }
            }
        } else if (class439.field6099 < arg3 + arg6) {
            int var35 = -arg6 + class439.field6099;
            for (int var36 = 0; arg2 > var36; ++var36) {
                int[] var37 = arg5[arg4 + var36];
                class171.method1264(var37, arg6, var35, var8);
                class171.method1264(var37, 0, -var35 + arg3, var8);
            }
        } else {
            for (int var38 = 0; var38 < arg2; ++var38) {
                class171.method1264(arg5[arg4 - -var38], arg6, arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method2619(byte arg0, byte[] arg1) {
        ++field6117;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class171.method1263(arg1, 0, var2, 0, arg1.length);
            return arg0 != 100 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZBILjava/lang/String;)V")
    public static final void method2620(boolean arg0, byte arg1, int arg2, String arg3) {
        class309.method1900(arg1 + -11973);
        ++field6111;
        if (arg2 == 0) {
            class686.field9702 = class399.method2369(35, class570.field7914, class420.field5820.field9447.method745(17539) * 2, class213.field3128, 0, class425.field5903);
            if (arg3 != null) {
                class686.field9702.method97(0);
                class470 var13 = class119.method1053(class77.field1161, -6394, 0, class274.field3843);
                class443 var14 = class686.field9702.method491(var13, class418.method2472(class176.field2648, class274.field3843, 0), true);
                class39.method294((byte) 83);
                class609.method3526(arg3, class686.field9702, (byte) -20, var13, var14, true);
            }
        } else {
            class475 var4 = null;
            if (arg3 != null) {
                var4 = class399.method2369(arg1 + 150, class570.field7914, 0, class213.field3128, 0, class425.field5903);
                var4.method97(0);
                class470 var5 = class119.method1053(class77.field1161, -6394, 0, class274.field3843);
                class443 var6 = var4.method491(var5, class418.method2472(class176.field2648, class274.field3843, 0), true);
                class39.method294((byte) 83);
                class609.method3526(arg3, var4, (byte) -83, var5, var6, true);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class686.field9702 = class399.method2369(13, class570.field7914, class420.field5820.field9447.method745(arg1 + 17619) * 2, class213.field3128, arg2, class425.field5903);
                    if (arg3 != null) {
                        var4.method97(0);
                        class470 var7 = class119.method1053(class77.field1161, arg1 + -6314, 0, class274.field3843);
                        class443 var8 = var4.method491(var7, class418.method2472(class176.field2648, class274.field3843, 0), true);
                        class39.method294((byte) 83);
                        class609.method3526(arg3, var4, (byte) -86, var7, var8, true);
                    }
                    if (class686.field9702.method475()) {
                        boolean var9 = true;
                        try {
                            var9 = class63.field964.field10844 > 256;
                        } catch (Throwable var28) {
                        }
                        class731 var10;
                        if (!var9) {
                            var10 = class686.field9702.method496(104857600);
                        } else {
                            var10 = class686.field9702.method496(146800640);
                        }
                        class686.field9702.method425(var10);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var11 = class420.field5820.field9482.method2338(arg1 + 17619);
                    if (~var11 == -3) {
                        class61.field934 = true;
                    }
                    class420.field5820.method3781(class420.field5820.field9482, 88, 0);
                    method2620(arg0, (byte) -80, var11, arg3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var4 != null) {
                            try {
                                var4.method2779((byte) 36);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var4 != null) {
                    try {
                        var4.method2779((byte) 36);
                    } catch (Throwable var25) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var4 != null) {
                try {
                    var4.method2779((byte) 36);
                } catch (Throwable var27) {
                }
            }
        }
        class420.field5820.field9482.method2336(0, !arg0);
        class420.field5820.method3781(class420.field5820.field9482, 81, arg2);
        class313.method1911((byte) -84);
        class686.field9702.method461(10000);
        class686.field9702.method509(32);
        class390.field5441 = class686.field9702.method463();
        if (arg1 == -80) {
            class443.field6148 = class686.field9702.method463();
            class554.method3199(200);
            class686.field9702.method466(class420.field5820.field9462.method3157(17539) == 1);
            if (class686.field9702.method421()) {
                class222.method1524(~class420.field5820.field9476.method1941(17539) == -2, (byte) -127);
            }
            class582.method3416(class456.field6225 >> 3, class192.field2891 >> 3, class686.field9702, (byte) 84);
            class166.method1239(false);
            class56.field878 = null;
            class356.field5069 = false;
            class789.field10785 = true;
            class134.method1110((byte) 107);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class229 extends class175 {

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    private int field3838 = 4096;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    private int field3842 = 4096;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    private int field3847 = 4096;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    private int field3840 = 409;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "[I")
    private int[] field3848 = new int[3];

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "Z")
    public static boolean field3841 = false;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[[I")
    public static int[][] field3849 = new int[104][104];

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field3850 = 0;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field3846;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method1447(17);
                            this.field3848[1] = class51.method413(4080, var5 >> 4);
                            this.field3848[0] = class51.method413(var5, 16711680) << 4;
                            this.field3848[2] = class51.method413(0, var5 >> 12);
                        }
                    } else {
                        this.field3838 = arg2.method1441(-100);
                    }
                } else {
                    this.field3842 = arg2.method1441(-72);
                }
            } else {
                this.field3847 = arg2.method1441(70);
            }
        } else {
            this.field3840 = arg2.method1441(119);
        }
        if (!arg0) {
            method1561(119);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)I")
    public static final int method1559(int arg0, int arg1, int arg2) {
        ++field3845;
        if (~arg0 == 0) {
            return 12345678;
        } else {
            if (arg2 != 27353) {
                field3839 = -104;
            }
            int var3 = (127 & arg0) * arg1 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
    public static void method1560(int arg0) {
        if (arg0 != 18560) {
            method1560(-124);
        }
        field3849 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        int[][] var3 = super.field2920.method117(arg0, (byte) -14);
        if (arg1 != -20740) {
            field3850 = 21;
        }
        if (super.field2920.field356) {
            int[][] var4 = this.method1206(0, arg0, (byte) 104);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class211.field3514 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3848[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field3840 > ~var13) {
                    var9[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3848[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field3840) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3848[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field3840 > ~var17) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field3838 * var12 >> 12;
                            var8[var11] = this.field3842 * var14 >> 12;
                            var10[var11] = this.field3847 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field3837;
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)V")
    public static final void method1561(int arg0) {
        class236.field3952.method762((byte) 117);
        if (arg0 == 25219) {
            ++field3844;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lce;Lqj;ILqj;IIII)V")
    public static final void method1562(class10 arg0, class152 arg1, int arg2, class152 arg3, int arg4, int arg5, int arg6, int arg7) {
        class172.field2864 = arg7;
        class36.field684 = arg6;
        class160.field2743 = arg5;
        ++field3843;
        class251.field4352 = arg0;
        class204.field3394 = arg4;
        if (class2.field29 == null) {
            class235.field3927 = true;
            if (class84.field1605 == null) {
                class84.field1605 = class207.method1395(class24.field530, class41.field758, 0, false);
            }
            if (class178.field2977 == null) {
                class178.field2977 = class102.method779(0, -118, class217.field3640, class24.field530);
            }
            if (class236.field3947 == null) {
                class236.field3947 = class102.method779(0, -107, class170.field2852, class24.field530);
            }
            if (class146.field2526 == null) {
                class146.field2526 = class102.method779(0, arg2 + -111, class100.field1848, class24.field530);
            }
            int var8 = class160.field2743 / 5;
            int var9 = class160.field2743 / 5 * 4;
            class158.method1113(class172.field2864, class36.field684, class160.field2743, class204.field3394, arg2, 168);
            class158.method1103(class172.field2864, class36.field684, var8, 23, 12425273, 9135624);
            class158.method1103(class172.field2864 + var8, class36.field684, var9, 23, 5197647, 2697513);
            arg1.method1080(class216.field3573, var8 / 2 + class172.field2864, class36.field684 - -15, 0, -1);
            if (class146.field2526 != null) {
                class146.field2526[1].method516(class172.field2864 - -2 + var8, class36.field684 + 1);
                arg3.method1058(class247.field4304, class172.field2864 + var8 + 12, class36.field684 - -10, 16777215, -1);
                class146.field2526[0].method516(var8 + 2 + class172.field2864, class36.field684 + 12);
                arg3.method1058(class118.field2086, var8 + 12 + class172.field2864, class36.field684 + 21, 16777215, -1);
            }
            if (class236.field3947 != null) {
                int var10 = var8 + 140 + class172.field2864;
                if (class244.field4251[0] == 0 && ~class179.field2988[0] == -1) {
                    class236.field3947[2].method516(var10, class36.field684 - -4);
                } else {
                    class236.field3947[0].method516(var10, class36.field684 + 4);
                }
                if (~class244.field4251[0] == -1 && ~class179.field2988[0] == -2) {
                    class236.field3947[3].method516(var10 - -15, class36.field684 - -4);
                } else {
                    class236.field3947[1].method516(var10 + 15, class36.field684 + 4);
                }
                arg1.method1058(class182.field3002, var10 - -32, class36.field684 + 17, 16777215, -1);
                int var11 = class172.field2864 + 250 + var8;
                if (~class244.field4251[0] == -2 && class179.field2988[0] == 0) {
                    class236.field3947[2].method516(var11, class36.field684 + 4);
                } else {
                    class236.field3947[0].method516(var11, class36.field684 + 4);
                }
                if (class244.field4251[0] == 1 && ~class179.field2988[0] == -2) {
                    class236.field3947[3].method516(var11 + 15, class36.field684 + 4);
                } else {
                    class236.field3947[1].method516(var11 + 15, class36.field684 + 4);
                }
                arg1.method1058(class193.field3202, var11 - -32, class36.field684 - -17, 16777215, -1);
                int var12 = var8 + 360 + class172.field2864;
                if (~class244.field4251[0] == -3 && ~class179.field2988[0] == -1) {
                    class236.field3947[2].method516(var12, class36.field684 + 4);
                } else {
                    class236.field3947[0].method516(var12, class36.field684 + 4);
                }
                if (class244.field4251[0] == 2 && class179.field2988[0] == 1) {
                    class236.field3947[3].method516(var12 - -15, class36.field684 + 4);
                } else {
                    class236.field3947[1].method516(var12 - -15, class36.field684 - -4);
                }
                arg1.method1058(class231.field3882, var12 + 32, class36.field684 + 17, 16777215, -1);
                int var13 = class172.field2864 + 470 + var8;
                if (~class244.field4251[0] == -4 && ~class179.field2988[0] == -1) {
                    class236.field3947[2].method516(var13, class36.field684 + 4);
                } else {
                    class236.field3947[0].method516(var13, class36.field684 + 4);
                }
                if (~class244.field4251[0] == -4 && class179.field2988[0] == 1) {
                    class236.field3947[3].method516(var13 + 15, class36.field684 + 4);
                } else {
                    class236.field3947[1].method516(var13 - -15, class36.field684 + 4);
                }
                arg1.method1058(class31.field626, var13 + 32, class36.field684 + 17, 16777215, -1);
            }
            class158.method1104(class160.field2743 - 10 + -58, class36.field684 - -4, 58, 16, 0);
            class16.field367 = -1;
            if (class84.field1605 != null) {
                byte var14 = 88;
                int var15 = class160.field2743 / (var14 + 1);
                byte var16 = 19;
                int var17 = (class204.field3394 + -23) / (var16 + 1);
                int var18;
                int var19;
                do {
                    var18 = var17;
                    var19 = var15;
                    if (class131.field2293 <= (var15 + -1) * var17) {
                        --var15;
                    }
                    if (~class131.field2293 >= ~((var17 - 1) * var15)) {
                        --var17;
                    }
                    if (~class131.field2293 >= ~((var17 - 1) * var15)) {
                        --var17;
                    }
                } while (var17 != var18 || var15 != var19);
                int var20 = (-(var14 * var15) + class160.field2743) / (var15 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (class160.field2743 - var14 * var15 - (var15 - 1) * var20) / 2;
                int var22 = (class204.field3394 - var16 * var17 + -23) / (var17 + 1);
                int var23 = var21;
                if (var22 > 5) {
                    var22 = 5;
                }
                int var24 = (-((var17 + -1) * var22) + -(var16 * var17) + class204.field3394 + -23) / 2;
                int var25 = 0;
                int var26 = var24 + 23;
                for (int var27 = 0; ~class131.field2293 < ~var27; ++var27) {
                    boolean var28 = true;
                    class57 var29 = class243.field4244[var27];
                    class50 var30 = class78.method579(var29.field1038, -26225);
                    if (var29.field1038 != -1) {
                        if (var29.field1038 > 1980) {
                            var30 = class177.field2954;
                            var28 = false;
                        }
                    } else {
                        var28 = false;
                        var30 = class25.field549;
                    }
                    if (~var23 >= ~class69.field1297 && ~class173.field2904 <= ~var26 && ~(var14 + var23) < ~class69.field1297 && class173.field2904 < var16 + var26 && var28) {
                        class16.field367 = var27;
                        class84.field1605[var29.field1034 ? 1 : 0].method675(class172.field2864 + var23, class36.field684 + var26, 128, 16777215);
                    } else {
                        class84.field1605[!var29.field1034 ? 0 : 1].method673(class172.field2864 + var23, class36.field684 + var26);
                    }
                    if (class178.field2977 != null) {
                        class178.field2977[var29.field1036 + (!var29.field1034 ? 0 : 8)].method516(class172.field2864 + var23 - -29, class36.field684 - -var26);
                    }
                    arg1.method1080(class78.method579(var29.field1032, arg2 ^ -26225), class172.field2864 - -var23 + 15, var16 / 2 + class36.field684 - (-var26 + -5), 0, -1);
                    arg3.method1080(var30, class172.field2864 + 60 + var23, var16 / 2 + class36.field684 + var26 + 5, 268435455, -1);
                    var26 += var16 + var22;
                    ++var25;
                    if (~var25 <= ~var17) {
                        var25 = 0;
                        var26 = var24 + 23;
                        var23 += var20 - -var14;
                    }
                }
            }
        }
    }
}

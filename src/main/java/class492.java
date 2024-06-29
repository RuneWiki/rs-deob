import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class492 extends class573 {

    @OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
    private int field7036 = 1;

    @OriginalMember(owner = "client!iba", name = "O", descriptor = "I")
    private int field7041 = 204;

    @OriginalMember(owner = "client!iba", name = "M", descriptor = "I")
    private int field7039 = 1;

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "[I")
    public static int[] field7035 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!iba", name = "K", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!iba", name = "N", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!iba", name = "P", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!iba", name = "Q", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!iba", name = "R", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!iba", name = "S", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!iba", name = "L", descriptor = "[I")
    public static int[] field7038;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field7044;
        int[] var3 = super.field8321.method3164(arg0, -117);
        if (arg1 != 1) {
            this.method619(-2, -101);
        }
        if (super.field8321.field7825) {
            for (int var4 = 0; var4 < class540.field7555; ++var4) {
                int var5 = class51.field1194[var4];
                int var6 = class230.field3460[arg0];
                int var7 = this.field7039 * var5 >> 12;
                int var8 = this.field7036 * var6 >> 12;
                int var9 = var5 % (4096 / this.field7039) * this.field7039;
                int var10 = var6 % (4096 / this.field7036) * this.field7036;
                if (~var10 > ~this.field7041) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field7041 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field7041 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field7041 = arg0.method723((byte) -25);
                }
            } else {
                this.field7036 = arg0.method732(-559537960);
            }
        } else {
            this.field7039 = arg0.method732(-559537960);
        }
        if (arg2 == 3) {
            ++field7043;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lr;I)V")
    public static final void method2950(class167 arg0, int arg1) {
        ++field7037;
        int var2 = class640.field9206;
        int var3 = class43.field1086;
        int var4 = class134.field2391;
        int var5 = class337.field5033;
        int var6 = -10660793;
        arg0.method1267(var3, var5, 1, var4, var2, var6);
        arg0.method1267(var3 + 1, arg1, 1, var4 - 2, var2 + 1, -16777216);
        arg0.method1261(var5 + -19, arg1 ^ 25536, -16777216, var4 + -2, var2 + 1, var3 + 18);
        class367.field5445.method2558(class265.field3899.method1733(arg1 ^ 239, class140.field2466), var3 + 14, var6, var2 + 3, (byte) 32, -1);
        int var7 = class410.field5945.method1931(-23081);
        int var8 = class410.field5945.method1936(arg1 ^ 110);
        int var9 = 0;
        for (class300 var10 = (class300) class126.field2292.method1224(arg1 ^ -18); var10 != null; var10 = (class300) class126.field2292.method1232(-2)) {
            int var11 = var3 - -((-1 - var9 + class481.field6904) * 16) + 31;
            short var12 = -1;
            if (~var7 < ~var2 && var7 < var2 + var4 && ~(var11 + -13) > ~var8 && ~(var11 + 3) < ~var8 && var10.field4463) {
                var12 = -256;
            }
            int[] var13 = null;
            if (!class129.method1095(-45, var10.field4465)) {
                if (var10.field4471 == -1) {
                    if (!class219.method1522(72, var10.field4465)) {
                        if (class602.method3438(var10.field4465, -97)) {
                            Object var14 = null;
                            class56 var15;
                            if (~var10.field4465 != -1002) {
                                var15 = class237.field3521.method3515((int) (2147483647L & var10.field4472 >>> 32), 50);
                            } else {
                                var15 = class237.field3521.method3515((int) var10.field4472, 50);
                            }
                            if (var15.field1248 != null) {
                                var15 = var15.method662(3433, class113.field2038);
                            }
                            if (var15 != null) {
                                var13 = var15.field1309;
                            }
                        }
                    } else {
                        class436 var16 = (class436) class208.field3179.method2596((long) ((int) var10.field4472), 51);
                        if (var16 != null) {
                            class22 var17 = var16.field6298;
                            class334 var18 = var17.field880;
                            if (var18.field4984 != null) {
                                var18 = var18.method2150(class113.field2038, -32224);
                            }
                            if (var18 != null) {
                                var13 = var18.field4996;
                            }
                        }
                    }
                } else {
                    var13 = class268.field3985.method258(var10.field4471, (byte) -67).field1971;
                }
            } else {
                var13 = class268.field3985.method258((int) var10.field4472, (byte) -67).field1971;
            }
            String var19 = class121.method1047(var10, false);
            if (var13 != null) {
                var19 = var19 + class367.method2319((byte) -85, var13);
            }
            class367.field5445.method2549(var11, 0, var12, 38, class240.field3544, class126.field2308, var2 + 3, var19);
            ++var9;
            if (var10.field4460) {
                class173.field2851.method3914(class141.field2478.method286(var19, -5113) + var2 + 5, var11 - 12);
            }
        }
        class135.method1112(class337.field5033, class640.field9206, class43.field1086, true, class134.field2391);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILom;B)Ldaa;")
    public static final class11 method2951(int arg0, class344 arg1, byte arg2) {
        ++field7040;
        byte[] var3 = arg1.method2242(0, arg0);
        if (arg2 >= -105) {
            method2953(14, false);
        }
        return var3 == null ? null : new class11(var3);
    }

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "(I)V")
    public static void method2952(int arg0) {
        field7038 = null;
        field7035 = null;
        int var1 = -88 / ((-27 - arg0) / 50);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2953(int arg0, boolean arg1) {
        if (!arg1) {
            method2950((class167) null, 105);
        }
        ++field7045;
        return ~arg0 <= -13 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "(I)V")
    public static final void method2954(int arg0) {
        ++field7042;
        int var1 = class304.field4509.length;
        for (int var2 = 0; var2 < var1; ++var2) {
            if (class304.field4509[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class44.field1097; ++var4) {
                    if (class352.field5310[var4] == class335.field5019[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class352.field5310[class44.field1097] = class335.field5019[var2];
                    var3 = class44.field1097++;
                }
                class61 var5 = new class61(class304.field4509[var2]);
                int var6 = 0;
                while (class304.field4509[var2].length > var5.field1393 && var6 < 511 && class363.field5389 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method723((byte) -25);
                    int var9 = var8 >> 14;
                    int var10 = 63 & var8 >> 7;
                    int var11 = 63 & var8;
                    int var12 = (class335.field5019[var2] >> 8) * 64 + -class33.field967 + var10;
                    int var13 = (class335.field5019[var2] & 255) * 64 + -class323.field4749 + var11;
                    class334 var14 = class317.field4681.method806(var5.method723((byte) -25), arg0 + -22364);
                    class436 var15 = (class436) class208.field3179.method2596((long) var7, arg0 + -22238);
                    if (var15 == null && (var14.field4976 & 1) > 0 && ~class432.field6242 == ~var9 && ~var12 <= -1 && class675.field9604 > var14.field4978 + var12 && ~var13 <= -1 && ~(var14.field4978 + var13) > ~class218.field3316) {
                        class22 var16 = new class22();
                        var16.field8728 = var7;
                        class436 var17 = new class436(var16);
                        class208.field3179.method2598(var17, (long) var7, (byte) 8);
                        class459.field6542[class39.field1062++] = var17;
                        class367.field5444[class363.field5389++] = var7;
                        var16.field8683 = class336.field5031;
                        var16.method461((byte) 26, var14);
                        var16.method3459(var16.field880.field4978, 65);
                        var16.field8675 = var16.field880.field4935 << 3;
                        var16.method3454(var16.field880.field4941 + 4 << 11 & 15493, 0, true);
                        var16.method445(0, var13, var9, true, var16.method3446(arg0 ^ 22365), var12);
                    }
                }
            }
        }
        if (arg0 != 22365) {
            field7035 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
    public class492() {
        super(0, true);
    }
}

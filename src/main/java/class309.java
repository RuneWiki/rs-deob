import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class309 extends class261 {

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    private int field5255 = 0;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    private int field5253 = 409;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    private int field5256 = 1024;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    private int field5265 = 0;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    private int field5259 = 1024;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    private int field5267 = 1024;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
    private int field5271 = 819;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    private int field5266 = 2048;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    private int field5270 = 1024;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "Lve;")
    public static class255 field5261 = class87.method607(52, "null");

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    public static int field5269 = 0;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "[I")
    public static int[] field5268 = new int[128];

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "Lve;")
    private static class255 field5274 = class87.method607(117, "skill:");

    @OriginalMember(owner = "client!al", name = "F", descriptor = "Lve;")
    public static class255 field5252 = field5274;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
    private int field5273;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "Lve;")
    public static class255 field5254;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIILve;JI)V", line = 6)
    public static final void method2143(int arg0, int arg1, int arg2, int arg3, class255 arg4, long arg5, int arg6) {
        field5257++;
        class70 var8 = new class70(128);
        var8.method463(false, 10);
        var8.method462((int) (Math.random() * 99999.0D), (byte) -61);
        var8.method462(515, (byte) -61);
        var8.method449(16711680, arg5);
        var8.method436((int) (Math.random() * 9.9999999E7D), -18820);
        var8.method483(-99755000, arg4);
        var8.method436((int) (Math.random() * 9.9999999E7D), -18820);
        var8.method462(client.field4022, (byte) -61);
        var8.method463(false, arg6);
        var8.method463(false, arg0);
        var8.method436((int) (Math.random() * 9.9999999E7D), -18820);
        var8.method462(arg1, (byte) -61);
        var8.method462(arg3, (byte) -61);
        var8.method436((int) (Math.random() * 9.9999999E7D), -18820);
        var8.method452(class206.field3536, true, class54.field852);
        class255.field4318.field1068 = 0;
        if (arg2 != 845398476) {
            return;
        }
        class255.field4318.method463(false, 60);
        class255.field4318.method463(false, var8.field1068);
        class255.field4318.method484((byte) -81, 0, var8.field1066, var8.field1068);
        class172.field2852 = 0;
        class88.field1433 = 1;
        class274.field4715 = 0;
        class46.field693 = -3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIZIZI)V", line = 41)
    public static final void method2144(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field5258++;
        int var7 = -87 % ((52 - arg0) / 40);
        if (arg4 <= arg1) {
            return;
        }
        int var8 = (arg1 + arg4) / 2;
        class238 var9 = class242.field4047[var8];
        int var10 = arg1;
        class242.field4047[var8] = class242.field4047[arg4];
        class242.field4047[arg4] = var9;
        for (int var11 = arg1; var11 < arg4; var11++) {
            if (class229.method1584((byte) -10, var9, arg5, class242.field4047[var11], arg3, arg6, arg2) <= 0) {
                class238 var12 = class242.field4047[var11];
                class242.field4047[var11] = class242.field4047[var10];
                class242.field4047[var10++] = var12;
            }
        }
        class242.field4047[arg4] = class242.field4047[var10];
        class242.field4047[var10] = var9;
        method2144(-44, arg1, arg2, arg3, var10 - 1, arg5, arg6);
        method2144(103, var10 + 1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 88)
    public static void method2145(int arg0) {
        field5261 = null;
        field5252 = null;
        field5274 = null;
        field5268 = null;
        int var1 = 59 % ((arg0 - 28) / 32);
        field5254 = null;
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(B)V", line = 103)
    public final void method111(byte arg0) {
        field5264++;
        if (arg0 != -57) {
            this.method111((byte) -18);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 116)
    public class309() {
        super(0, true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lpb;BI)V", line = 130)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            method2146(3, -1, (class255) null, 111, -55);
        }
        field5272++;
        if (arg2 == 0) {
            this.field5255 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field5267 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field5266 = arg0.method423(255);
        } else if (arg2 == 3) {
            this.field5253 = arg0.method423(255);
        } else if (arg2 == 4) {
            this.field5271 = arg0.method423(255);
        } else if (arg2 == 5) {
            this.field5259 = arg0.method423(255);
        } else if (arg2 == 6) {
            this.field5265 = arg0.method481(0);
        } else if (arg2 == 7) {
            this.field5256 = arg0.method423(255);
        } else if (arg2 == 8) {
            this.field5270 = arg0.method423(255);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILve;II)V", line = 233)
    public static final void method2146(int arg0, int arg1, class255 arg2, int arg3, int arg4) {
        class197 var5 = class91.method685(arg4, (byte) -38, arg3);
        field5260++;
        if (var5 == null) {
            return;
        }
        if (var5.field3326 != null) {
            class26 var6 = new class26();
            var6.field425 = arg2;
            var6.field426 = arg0;
            var6.field414 = var5.field3326;
            var6.field424 = var5;
            class114.method873(-47, var6);
        }
        boolean var7 = true;
        if (var5.field3392 > 0) {
            var7 = class5.method27(var5, 35);
        }
        if (!var7 || !class109.method841(true, arg0 - 1, client.method1673(var5))) {
            return;
        }
        if (arg0 == 1) {
            class172.field2845++;
            class255.field4318.method1523(arg1 ^ 0xFFFFA90E, 39);
            class255.field4318.method436(arg4, -18820);
            class255.field4318.method462(arg3, (byte) -61);
        }
        if (arg0 == 2) {
            class255.field4318.method1523(22260, 131);
            class255.field4318.method436(arg4, -18820);
            class255.field4318.method462(arg3, (byte) -61);
            class206.field3531++;
        }
        if (arg0 == 3) {
            class195.field3216++;
            class255.field4318.method1523(22260, 36);
            class255.field4318.method436(arg4, -18820);
            class255.field4318.method462(arg3, (byte) -61);
        }
        if (arg0 == 4) {
            class255.field4318.method1523(22260, 34);
            class255.field4318.method436(arg4, -18820);
            class154.field2623++;
            class255.field4318.method462(arg3, (byte) -61);
        }
        if (~arg0 == arg1) {
            class41.field648++;
            class255.field4318.method1523(22260, 215);
            class255.field4318.method436(arg4, arg1 ^ 0x4986);
            class255.field4318.method462(arg3, (byte) -61);
        }
        if (arg0 == 6) {
            class255.field4318.method1523(22260, 83);
            class255.field4318.method436(arg4, -18820);
            class255.field4318.method462(arg3, (byte) -61);
            class152.field2580++;
        }
        if (arg0 == 7) {
            class255.field4318.method1523(22260, 237);
            class255.field4318.method436(arg4, arg1 - 18814);
            class255.field4318.method462(arg3, (byte) -61);
            class145.field2410++;
        }
        if (arg0 == 8) {
            class210.field3585++;
            class255.field4318.method1523(22260, 238);
            class255.field4318.method436(arg4, -18820);
            class255.field4318.method462(arg3, (byte) -61);
        }
        if (arg0 == 9) {
            class255.field4318.method1523(22260, 79);
            class255.field4318.method436(arg4, -18820);
            class53.field826++;
            class255.field4318.method462(arg3, (byte) -61);
        }
        if (arg0 == 10) {
            class84.field1353++;
            class255.field4318.method1523(22260, 161);
            class255.field4318.method436(arg4, -18820);
            class255.field4318.method462(arg3, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)[I", line = 361)
    public final int[] method21(byte arg0, int arg1) {
        field5263++;
        int var3 = 56 % ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (!this.field4425.field2043) {
            return var4;
        }
        int var5 = 0;
        int[][] var6 = this.field4425.method904(85);
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean var11 = true;
        boolean var12 = true;
        int var13 = 0;
        int var14 = class92.field1576 * this.field5267 >> 12;
        int var15 = 0;
        int var16 = class210.field3590 * this.field5271 >> 12;
        int var17 = class210.field3590 * this.field5253 >> 12;
        int var18 = class92.field1576 * this.field5266 >> 12;
        if (var16 <= 1) {
            return var6[arg1];
        }
        int var19 = class92.field1576 / var14 + 1;
        this.field5273 = class92.field1576 / 8 * this.field5259 >> 12;
        int[][] var20 = new int[var19][3];
        int[][] var21 = new int[var19][3];
        Random var22 = new Random((long) this.field5255);
        while (true) {
            while (true) {
                int var23 = class212.method1522(var22, var18 - var14, (byte) 108) + var14;
                int var24 = class212.method1522(var22, var16 - var17, (byte) 111) + var17;
                int var25 = var9 + var23;
                if (class92.field1576 < var25) {
                    var23 = class92.field1576 - var9;
                    var25 = class92.field1576;
                }
                int var27;
                if (var12) {
                    var27 = 0;
                } else {
                    int[] var26 = var21[var10];
                    var27 = var26[2];
                    int var28 = var10;
                    int var29 = 0;
                    int var30 = var25 + var5;
                    if (var30 < 0) {
                        var30 += class92.field1576;
                    }
                    if (class92.field1576 < var30) {
                        var30 -= class92.field1576;
                    }
                    while (true) {
                        int[] var31 = var21[var28];
                        if (var30 >= var31[0] && var30 <= var31[1]) {
                            if (var10 != var28) {
                                int var32 = var5 + var9;
                                if (var32 < 0) {
                                    var32 += class92.field1576;
                                }
                                if (var32 > class92.field1576) {
                                    var32 -= class92.field1576;
                                }
                                for (int var33 = 1; var33 <= var29; var33++) {
                                    int[] var34 = var21[(var10 + var33) % var13];
                                    var27 = Math.max(var27, var34[2]);
                                }
                                for (int var35 = 0; var35 <= var29; var35++) {
                                    int[] var36 = var21[(var10 + var35) % var13];
                                    int var37 = var36[2];
                                    if (var27 != var37) {
                                        int var38 = var36[0];
                                        int var39 = var36[1];
                                        int var40;
                                        int var41;
                                        if (var30 > var32) {
                                            var40 = Math.max(var32, var38);
                                            var41 = Math.min(var30, var39);
                                        } else if (var38 == 0) {
                                            var40 = 0;
                                            var41 = Math.min(var30, var39);
                                        } else {
                                            var40 = Math.max(var32, var38);
                                            var41 = class92.field1576;
                                        }
                                        this.method2147(var41 - var40, var6, var22, var40 + var8, var37, -21515, var27 - var37);
                                    }
                                }
                            }
                            var10 = var28;
                            break;
                        }
                        var29++;
                        var28++;
                        if (var28 >= var13) {
                            var28 = 0;
                        }
                    }
                }
                if ((var24 + var27) > class210.field3590) {
                    var24 = class210.field3590 - var27;
                } else {
                    var11 = false;
                }
                if (class92.field1576 == var25) {
                    this.method2147(var23, var6, var22, var9 + var7, var27, -21515, var24);
                    if (var11) {
                        return var4;
                    }
                    var10 = 0;
                    var8 = var7;
                    var12 = false;
                    int[] var43 = var20[var15++];
                    var11 = true;
                    var13 = var15;
                    var15 = 0;
                    var43[0] = var9;
                    var43[1] = var25;
                    int[][] var44 = var21;
                    var43[2] = var24 + var27;
                    var7 = class212.method1522(var22, class92.field1576, (byte) 122);
                    var21 = var20;
                    var5 = var7 - var8;
                    int var45 = var5;
                    var20 = var44;
                    if (var5 < 0) {
                        var45 = class92.field1576 + var5;
                    }
                    if (class92.field1576 < var45) {
                        var45 -= class92.field1576;
                    }
                    var9 = 0;
                    while (true) {
                        int[] var46 = var21[var10];
                        if (var46[0] <= var45 && var45 <= var46[1]) {
                            break;
                        }
                        int var10000 = ~var13;
                        var10++;
                        if (var10000 >= ~var10) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var42 = var20[var15++];
                    var42[1] = var25;
                    var42[0] = var9;
                    var42[2] = var27 + var24;
                    this.method2147(var23, var6, var22, var7 + var9, var27, -21515, var24);
                    var9 = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I[[ILjava/util/Random;IIII)V", line = 635)
    private final void method2147(int arg0, int[][] arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        field5262++;
        if (arg5 != -21515) {
            this.method111((byte) 62);
        }
        int var8 = this.field5270 > 0 ? 4096 - class212.method1522(arg2, this.field5270, (byte) 114) : 4096;
        int var9 = this.field5273 * this.field5256 >> 12;
        int var10 = this.field5273 - (var9 <= 0 ? 0 : class212.method1522(arg2, var9, (byte) 117));
        if (arg3 >= class92.field1576) {
            arg3 -= class92.field1576;
        }
        if (var10 > 0) {
            if (arg6 <= 0 || arg0 <= 0) {
                return;
            }
            int var15 = arg0 / 2;
            int var16 = arg6 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg3 + var17;
            int var20 = arg0 - (var17 * 2);
            for (int var21 = 0; var21 < arg6; var21++) {
                int[] var22 = arg1[var21 + arg4];
                if (var18 <= var21) {
                    int var23 = arg6 - var21 - 1;
                    if (var23 >= var18) {
                        for (int var24 = 0; var24 < var17; var24++) {
                            var22[class154.method1134(class77.field1260, arg3 + var24)] = var22[class154.method1134(arg0 + arg3 - var24 - 1, class77.field1260)] = var8 * var24 / var17;
                        }
                        if (class92.field1576 < var19 + var20) {
                            int var25 = class92.field1576 - var19;
                            class36.method218(var22, var19, var25, var8);
                            class36.method218(var22, 0, var20 - var25, var8);
                        } else {
                            class36.method218(var22, var19, var20, var8);
                        }
                    } else {
                        int var26 = var8 * var23 / var18;
                        if (this.field5265 == 0) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class154.method1134(class77.field1260, arg3 + var27)] = var22[class154.method1134(class77.field1260, arg3 - (var27 - arg0) - 1)] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var29 < var17; var29++) {
                                int var30 = var8 * var29 / var17;
                                var22[class154.method1134(class77.field1260, arg3 + var29)] = var22[class154.method1134(class77.field1260, arg0 + arg3 - var29 - 1)] = var26 <= var30 ? var26 : var30;
                            }
                        }
                        if ((var19 + var20) <= class92.field1576) {
                            class36.method218(var22, var19, var20, var26);
                        } else {
                            int var31 = class92.field1576 - var19;
                            class36.method218(var22, var19, var31, var26);
                            class36.method218(var22, 0, var20 - var31, var26);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field5265 == 0) {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class154.method1134(arg3 + var33, class77.field1260)] = var22[class154.method1134(class77.field1260, arg0 + arg3 - var33 - 1)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class154.method1134(class77.field1260, arg3 + var35)] = var22[class154.method1134(arg0 + arg3 - var35 - 1, class77.field1260)] = var36 < var32 ? var36 : var32;
                        }
                    }
                    if ((var19 + var20) > class92.field1576) {
                        int var37 = class92.field1576 - var19;
                        class36.method218(var22, var19, var37, var32);
                        class36.method218(var22, 0, var20 - var37, var32);
                    } else {
                        class36.method218(var22, var19, var20, var32);
                    }
                }
            }
        } else if ((arg3 + arg0) > class92.field1576) {
            int var11 = class92.field1576 - arg3;
            for (int var12 = 0; var12 < arg6; var12++) {
                int[] var13 = arg1[arg4 + var12];
                class36.method218(var13, arg3, var11, var8);
                class36.method218(var13, 0, arg0 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg6; var14++) {
                class36.method218(arg1[arg4 + var14], arg3, arg0, var8);
            }
        }
    }
}

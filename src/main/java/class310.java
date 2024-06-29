import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class310 extends class317 {

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    private int field4689 = 819;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    private int field4687 = 1024;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    private int field4691 = 1024;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field4692 = 1024;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    private int field4684 = 409;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    private int field4682 = 1024;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    private int field4696 = 2048;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field4698 = 0;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    private int field4699 = 0;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Z")
    public static boolean field4686 = false;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    private int field4685;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILjava/util/Random;III[[I)V", line = 6)
    private final void method2126(int arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        int var8 = this.field4682 <= 0 ? 4096 : 4096 - class175.method1217((byte) 81, arg2, this.field4682);
        int var9 = this.field4691 * this.field4685 >> 12;
        if (arg3 != 1) {
            method2127(-27);
        }
        field4694++;
        int var10 = this.field4685 - (var9 > 0 ? class175.method1217((byte) 97, arg2, var9) : 0);
        if (arg0 >= class326.field4933) {
            arg0 -= class326.field4933;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg5 <= 0) {
                return;
            }
            int var11 = arg5 / 2;
            int var12 = arg4 / 2;
            int var13 = var10 > var11 ? var11 : var10;
            int var14 = var12 >= var10 ? var10 : var12;
            int var15 = arg0 + var13;
            int var16 = arg5 - (var13 * 2);
            for (int var17 = 0; var17 < arg4; var17++) {
                int[] var18 = arg6[arg1 + var17];
                if (var17 >= var14) {
                    int var19 = arg4 - var17 - 1;
                    if (var19 >= var14) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            var18[class47.method303(arg0 + var20, class246.field3548)] = var18[class47.method303(class246.field3548, arg0 + arg5 - var20 - 1)] = var8 * var20 / var13;
                        }
                        if (class326.field4933 >= var15 + var16) {
                            class281.method1944(var18, var15, var16, var8);
                        } else {
                            int var21 = class326.field4933 - var15;
                            class281.method1944(var18, var15, var21, var8);
                            class281.method1944(var18, 0, var16 - var21, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var14;
                        if (this.field4699 == 0) {
                            for (int var25 = 0; var25 < var13; var25++) {
                                int var26 = var8 * var25 / var13;
                                var18[class47.method303(class246.field3548, arg0 + var25)] = var18[class47.method303(arg0 + arg5 - var25 - 1, class246.field3548)] = var22 * var26 >> 12;
                            }
                        } else {
                            for (int var23 = 0; var23 < var13; var23++) {
                                int var24 = var8 * var23 / var13;
                                var18[class47.method303(class246.field3548, arg0 + var23)] = var18[class47.method303(arg0 + arg5 - var23 - 1, class246.field3548)] = var22 > var24 ? var24 : var22;
                            }
                        }
                        if ((var15 + var16) > class326.field4933) {
                            int var27 = class326.field4933 - var15;
                            class281.method1944(var18, var15, var27, var22);
                            class281.method1944(var18, 0, var16 - var27, var22);
                        } else {
                            class281.method1944(var18, var15, var16, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field4699 == 0) {
                        for (int var31 = 0; var31 < var13; var31++) {
                            int var32 = var8 * var31 / var13;
                            var18[class47.method303(class246.field3548, arg0 + var31)] = var18[class47.method303(class246.field3548, arg5 + arg0 - var31 - 1)] = var28 * var32 >> 12;
                        }
                    } else {
                        for (int var29 = 0; var29 < var13; var29++) {
                            int var30 = var8 * var29 / var13;
                            var18[class47.method303(class246.field3548, arg0 + var29)] = var18[class47.method303(arg0 + arg5 - var29 - 1, class246.field3548)] = var30 < var28 ? var30 : var28;
                        }
                    }
                    if (class326.field4933 >= (var15 + var16)) {
                        class281.method1944(var18, var15, var16, var28);
                    } else {
                        int var33 = class326.field4933 - var15;
                        class281.method1944(var18, var15, var33, var28);
                        class281.method1944(var18, 0, var16 - var33, var28);
                    }
                }
            }
        } else if ((arg0 + arg5) <= class326.field4933) {
            for (int var34 = 0; var34 < arg4; var34++) {
                class281.method1944(arg6[arg1 + var34], arg0, arg5, var8);
            }
        } else {
            int var35 = class326.field4933 - arg0;
            for (int var36 = 0; var36 < arg4; var36++) {
                int[] var37 = arg6[arg1 + var36];
                class281.method1944(var37, arg0, var35, var8);
                class281.method1944(var37, 0, arg5 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lcg;II)V", line = 215)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field4695++;
        if (arg2 == 0) {
            this.field4698 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field4687 = arg0.method2220((byte) 80);
        } else if (arg2 == 2) {
            this.field4696 = arg0.method2220((byte) 92);
        } else if (arg2 == 3) {
            this.field4684 = arg0.method2220((byte) 62);
        } else if (arg2 == 4) {
            this.field4689 = arg0.method2220((byte) 71);
        } else if (arg2 == 5) {
            this.field4692 = arg0.method2220((byte) 124);
        } else if (arg2 == 6) {
            this.field4699 = arg0.method2219(16448);
        } else if (arg2 == 7) {
            this.field4691 = arg0.method2220((byte) 54);
        } else if (arg2 == 8) {
            this.field4682 = arg0.method2220((byte) 69);
        }
        int var5 = 69 / ((arg1 + 17) / 40);
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)Lfa;", line = 307)
    public static final class259 method2127(int arg0) {
        field4690++;
        if (class262.field3848.length > class208.field2994) {
            return class262.field3848[class208.field2994++];
        } else {
            if (arg0 >= -34) {
                field4686 = false;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 802)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLkm;Lkm;)V", line = 333)
    public static final void method2128(byte arg0, class133 arg1, class133 arg2) {
        field4679++;
        class37.field426 = class218.method1505((byte) 66, arg2, arg1, class291.field4345, 0);
        if (class67.field908) {
            class109.field1480 = class326.method2279(arg1, arg0 ^ 0xFFFFFFF5, arg2, class291.field4345, 0);
        } else {
            class109.field1480 = (class9) class37.field426;
        }
        if (arg0 != 10) {
            field4686 = true;
        }
        class312.field4716 = class218.method1505((byte) 119, arg2, arg1, class173.field2360, 0);
        class204.field2946 = class218.method1505((byte) 103, arg2, arg1, class37.field421, 0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB[[FLre;Lwf;I[I[[F[[F[[I)V", line = 366)
    public static final void method2129(int arg0, int arg1, byte arg2, float[][] arg3, class270 arg4, class233 arg5, int arg6, int[] arg7, float[][] arg8, float[][] arg9, int[][] arg10) {
        field4688++;
        int[] var11 = new int[arg7.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg7[var12 + var12 + 1];
            int var14 = arg7[var12 + var12];
            if (arg1 == 1) {
                int var15 = var14;
                var14 = var13;
                var13 = 128 - var15;
            } else if (arg1 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg1 == 3) {
                int var16 = var14;
                var14 = 128 - var13;
                var13 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg9[arg6][arg0];
                var18 = arg3[arg6][arg0];
                var19 = arg8[arg6][arg0];
            } else if (var14 == 128 && var13 == 0) {
                var19 = arg8[arg6 + 1][arg0];
                var18 = arg3[arg6 + 1][arg0];
                var17 = arg9[arg6 + 1][arg0];
            } else if (var14 == 128 && var13 == 128) {
                var19 = arg8[arg6 + 1][arg0 + 1];
                var18 = arg3[arg6 + 1][arg0 + 1];
                var17 = arg9[arg6 + 1][arg0 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var18 = arg3[arg6][arg0 + 1];
                var19 = arg8[arg6][arg0 + 1];
                var17 = arg9[arg6][arg0 + 1];
            } else {
                float var20 = arg9[arg6][arg0];
                float var21 = arg8[arg6][arg0];
                float var22 = (float) var14 / 128.0F;
                float var23 = arg3[arg6][arg0];
                float var24 = (arg3[arg6 + 1][arg0] - var23) * var22 + var23;
                float var25 = (arg9[arg6 + 1][arg0] - var20) * var22 + var20;
                float var26 = (float) var13 / 128.0F;
                float var27 = arg3[arg6][arg0 + 1];
                float var28 = (arg3[arg6 + 1][arg0 + 1] - var27) * var22 + var27;
                var18 = (var28 - var24) * var26 + var24;
                float var29 = (arg8[arg6 + 1][arg0] - var21) * var22 + var21;
                float var30 = arg9[arg6][arg0 + 1];
                float var31 = (arg9[arg6 + 1][arg0 + 1] - var30) * var22 + var30;
                var17 = (var31 - var25) * var26 + var25;
                float var32 = arg8[arg6][arg0 + 1];
                float var33 = (arg8[arg6 + 1][arg0 + 1] - var32) * var22 + var32;
                var19 = (var33 - var29) * var26 + var29;
            }
            int var34 = (arg6 << 7) + var14;
            int var35 = class316.method2178(arg6, var14, 128, var13, arg10, arg0);
            int var36 = (arg0 << 7) + var13;
            var11[var12] = arg5.method1609(arg4, var34, var35, var36, var18, var17, var19);
        }
        arg5.method1607(var11);
        int var37 = 79 % ((arg2 - 14) / 36);
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V", line = 483)
    public static final void method2130(int arg0) {
        class330.field4978++;
        field4693++;
        class90.field1264.method2238(98, (byte) -128);
        for (class48 var1 = (class48) class211.field3056.method110(0); var1 != null; var1 = (class48) class211.field3056.method115(0)) {
            if (var1.field594 == 0) {
                class290.method1991(true, (byte) 23, var1);
            }
        }
        if (arg0 != -27883) {
            field4686 = true;
        }
        if (class187.field2591 != null) {
            class255.method1741(class187.field2591, false);
            class187.field2591 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[I", line = 517)
    public final int[] method140(int arg0, int arg1) {
        field4681++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -113);
        if (this.field4847.field2751) {
            int[][] var4 = this.field4847.method1388(-126);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = class326.field4933 * this.field4687 >> 12;
            boolean var14 = true;
            int var15 = class326.field4933 * this.field4696 >> 12;
            int var16 = class340.field5109 * this.field4689 >> 12;
            int var17 = class340.field5109 * this.field4684 >> 12;
            if (var16 <= 1) {
                return var4[arg1];
            }
            int var18 = class326.field4933 / var13 + 1;
            this.field4685 = class326.field4933 / 8 * this.field4692 >> 12;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4698);
            label129: while (true) {
                while (true) {
                    int var22 = var13 + class175.method1217((byte) 76, var21, var15 - var13);
                    int var23 = var17 + class175.method1217((byte) 70, var21, var16 - var17);
                    int var24 = var7 + var22;
                    if (class326.field4933 < var24) {
                        var22 = class326.field4933 - var7;
                        var24 = class326.field4933;
                    }
                    int var29;
                    if (var14) {
                        var29 = 0;
                    } else {
                        int var25 = var12;
                        int[] var26 = var20[var12];
                        int var27 = var24 + var6;
                        int var28 = 0;
                        var29 = var26[2];
                        if (var27 < 0) {
                            var27 += class326.field4933;
                        }
                        if (class326.field4933 < var27) {
                            var27 -= class326.field4933;
                        }
                        while (true) {
                            int[] var30 = var20[var25];
                            if (var27 >= var30[0] && var30[1] >= var27) {
                                if (var12 != var25) {
                                    int var31 = var6 + var7;
                                    if (var31 < 0) {
                                        var31 += class326.field4933;
                                    }
                                    if (class326.field4933 < var31) {
                                        var31 -= class326.field4933;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var20[(var12 + var32) % var10];
                                        var29 = Math.max(var29, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var20[(var12 + var34) % var10];
                                        int var36 = var35[2];
                                        if (var29 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var27 > var31) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var27, var38);
                                            } else if (var37 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var27, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class326.field4933;
                                            }
                                            this.method2126(var8 + var39, var36, var21, 1, var29 - var36, -var39 + var40, var4);
                                        }
                                    }
                                }
                                var12 = var25;
                                break;
                            }
                            var28++;
                            var25++;
                            if (var25 >= var10) {
                                var25 = 0;
                            }
                        }
                    }
                    if ((var23 + var29) > class340.field5109) {
                        var23 = class340.field5109 - var29;
                    } else {
                        var9 = false;
                    }
                    if (class326.field4933 == var24) {
                        this.method2126(var5 + var7, var29, var21, arg0 ^ 0x21F, var23, var22, var4);
                        if (var9) {
                            break label129;
                        }
                        var9 = true;
                        int[] var42 = var19[var11++];
                        var10 = var11;
                        var14 = false;
                        var12 = 0;
                        var42[1] = var24;
                        var42[2] = var29 + var23;
                        var11 = 0;
                        int[][] var43 = var20;
                        var42[0] = var7;
                        var7 = 0;
                        var20 = var19;
                        var8 = var5;
                        var5 = class175.method1217((byte) 114, var21, class326.field4933);
                        var6 = var5 - var8;
                        var19 = var43;
                        int var44 = var6;
                        if (var6 < 0) {
                            var44 = class326.field4933 + var6;
                        }
                        if (var44 > class326.field4933) {
                            var44 -= class326.field4933;
                        }
                        while (true) {
                            int[] var45 = var20[var12];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                break;
                            }
                            int var10000 = ~var10;
                            var12++;
                            if (var10000 >= ~var12) {
                                var12 = 0;
                            }
                        }
                    } else {
                        int[] var41 = var19[var11++];
                        var41[0] = var7;
                        var41[2] = var23 + var29;
                        var41[1] = var24;
                        this.method2126(var5 + var7, var29, var21, 1, var23, var22, var4);
                        var7 = var24;
                    }
                }
            }
        }
        if (arg0 != 542) {
            this.method140(55, -51);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILin;)Lin;", line = 772)
    public static final class344 method2131(int arg0, class344 arg1) {
        field4683++;
        if (arg0 >= -61) {
            field4686 = true;
        }
        if (arg1.field5246 != -1) {
            return class151.method1101(-60, arg1.field5246);
        }
        int var2 = arg1.field5206 >>> 16;
        class239 var3 = new class239(class211.field3056);
        for (class48 var4 = (class48) var3.method1641(false); var4 != null; var4 = (class48) var3.method1639(-1)) {
            if (var4.field595 == var2) {
                return class151.method1101(-67, (int) var4.field2522);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 809)
    public final void method546(int arg0) {
        field4697++;
        if (arg0 != -21522) {
            this.field4692 = -12;
        }
    }
}

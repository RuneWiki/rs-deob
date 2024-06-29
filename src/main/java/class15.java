import java.io.IOException;
import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class15 extends class272 {

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    private int field255 = 1024;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    private int field259 = 2048;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    private int field256 = 0;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field252 = 1024;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    private int field260 = 819;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    private int field264 = 1024;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    private int field266 = 0;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    private int field262 = 409;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    private int field267 = 1024;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Lli;")
    public static class185 field250 = class245.method1649("Connexion au serveur de mise -9 jour en cours", 123);

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "[I")
    public static int[] field257 = new int[100];

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lhi;")
    public static class250 field254;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "Lmb;")
    public static class86 field265;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)Z")
    public static final boolean method111(int arg0) {
        ++field249;
        try {
            return arg0 > -70 ? true : class256.method1742((byte) 106);
        } catch (IOException var4) {
            class182.method1285(0);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class280.field4950 + "," + class189.field3527 + "," + class12.field212 + " - " + class217.field3976 + "," + (class241.field4310.field2651[0] + class77.field1339) + "," + (class241.field4310.field2720[0] + class107.field1933) + " - ";
            for (int var3 = 0; ~class217.field3976 < ~var3 && ~var3 > -51; ++var3) {
                var2 = var2 + class142.field2669.field2115[var3] + ",";
            }
            class3.method33(var2, var5, (byte) 121);
            class157.method1113(109);
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method112(int arg0, int arg1, int arg2, int arg3) {
        if (!class248.method1667(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class188.method1357(var4 + 1, class201.field3694[arg0][arg1][arg2] + arg3, var5 + 1) && class188.method1357(var4 + 128 - 1, class201.field3694[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class188.method1357(var4 + 128 - 1, class201.field3694[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class188.method1357(var4 + 1, class201.field3694[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        ++field253;
        if (arg0 != 0) {
            this.method113(-113);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field263;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field267 = arg0.method827(255);
                                        }
                                    } else {
                                        this.field264 = arg0.method827(255);
                                    }
                                } else {
                                    this.field256 = arg0.method867(false);
                                }
                            } else {
                                this.field255 = arg0.method827(255);
                            }
                        } else {
                            this.field260 = arg0.method827(255);
                        }
                    } else {
                        this.field262 = arg0.method827(255);
                    }
                } else {
                    this.field259 = arg0.method827(255);
                }
            } else {
                this.field252 = arg0.method827(255);
            }
        } else {
            this.field266 = arg0.method867(false);
        }
        int var5 = 70 / ((arg1 - -21) / 55);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lhi;ILhi;)V")
    public static final void method114(class250 arg0, int arg1, class250 arg2) {
        class189.field3523 = class203.method1447(arg0, 0, -26, arg2, class13.field232);
        if (arg1 < 45) {
            method118((byte) -82, -111);
        }
        class117.field2081 = (class53) class189.field3523;
        ++field269;
        class205.field3743 = class203.method1447(arg0, 0, -77, arg2, class119.field2172);
        class82.field1608 = class203.method1447(arg0, 0, -16, arg2, class180.field3309);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
    public static void method115(int arg0) {
        field254 = null;
        field257 = null;
        field265 = null;
        if (arg0 != 0) {
            field257 = null;
        }
        field250 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII[[IILjava/util/Random;)V")
    private final void method116(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, Random arg6) {
        ++field251;
        int var8 = ~this.field267 < -1 ? 4096 - class255.method1729(arg6, 3, this.field267) : 4096;
        if (arg0 != 2783) {
            method118((byte) 29, -19);
        }
        int var9 = this.field264 * this.field258 >> 12;
        int var10 = this.field258 + -(var9 <= 0 ? 0 : class255.method1729(arg6, arg0 + -2780, var9));
        if (class246.field4385 <= arg2) {
            arg2 -= class246.field4385;
        }
        if (~var10 >= -1) {
            if (~class246.field4385 > ~(arg1 + arg2)) {
                int var11 = -arg2 + class246.field4385;
                for (int var12 = 0; ~var12 > ~arg3; ++var12) {
                    int[] var13 = arg4[arg5 + var12];
                    class190.method1367(var13, arg2, var11, var8);
                    class190.method1367(var13, 0, arg1 - var11, var8);
                }
            } else {
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    class190.method1367(arg4[arg5 + var14], arg2, arg1, var8);
                }
            }
        } else if (arg3 > 0 && ~arg1 < -1) {
            int var15 = arg1 / 2;
            int var16 = arg3 / 2;
            int var17 = ~var10 < ~var15 ? var15 : var10;
            int var18 = var16 < var10 ? var16 : var10;
            int var19 = arg2 + var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; ~var21 > ~arg3; ++var21) {
                int[] var22 = arg4[var21 - -arg5];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field256 == -1) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class220.method1526(arg2 - -var24, class59.field1037)] = var22[class220.method1526(class59.field1037, arg2 + -1 - (-arg1 + var24))] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class220.method1526(class59.field1037, arg2 - -var26)] = var22[class220.method1526(class59.field1037, -var26 + arg1 + -1 + arg2)] = ~var23 >= ~var28 ? var23 : var28;
                        }
                    }
                    if (class246.field4385 < var19 - -var20) {
                        int var27 = class246.field4385 - var19;
                        class190.method1367(var22, var19, var27, var23);
                        class190.method1367(var22, 0, -var27 + var20, var23);
                    } else {
                        class190.method1367(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg3 - 1 + -var21;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field256 != -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class220.method1526(class59.field1037, arg2 - -var31)] = var22[class220.method1526(class59.field1037, -var31 + arg2 + -1 - -arg1)] = ~var32 > ~var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class220.method1526(arg2 - -var33, class59.field1037)] = var22[class220.method1526(class59.field1037, arg2 - var33 + arg1 + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (~(var19 + var20) < ~class246.field4385) {
                            int var34 = -var19 + class246.field4385;
                            class190.method1367(var22, var19, var34, var30);
                            class190.method1367(var22, 0, var20 - var34, var30);
                        } else {
                            class190.method1367(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class220.method1526(class59.field1037, arg2 + var36)] = var22[class220.method1526(-var36 - 1 + arg1 + arg2, class59.field1037)] = var8 * var36 / var17;
                        }
                        if (class246.field4385 < var19 + var20) {
                            int var37 = -var19 + class246.field4385;
                            class190.method1367(var22, var19, var37, var8);
                            class190.method1367(var22, 0, -var37 + var20, var8);
                        } else {
                            class190.method1367(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field261;
        if (arg1 != 4421) {
            this.field252 = 2;
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            int var4 = 0;
            int var5 = 0;
            int[][] var6 = super.field4819.method1627(28257);
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = class246.field4385 * this.field252 >> 12;
            int var15 = class246.field4385 * this.field259 >> 12;
            int var16 = class13.field235 * this.field262 >> 12;
            int var17 = class13.field235 * this.field260 >> 12;
            if (~var17 >= -2) {
                return var6[arg0];
            } else {
                this.field258 = class246.field4385 / 8 * this.field255 >> 12;
                int var18 = class246.field4385 / var14 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field266);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = class255.method1729(var20, 3, var15 - var14) + var14;
                        int var23 = var8 + var22;
                        int var24 = class255.method1729(var20, 3, -var16 + var17) + var16;
                        if (~class246.field4385 > ~var23) {
                            var22 = -var8 + class246.field4385;
                            var23 = class246.field4385;
                        }
                        int var25;
                        if (var10) {
                            var25 = 0;
                        } else {
                            int var26 = var11;
                            int[] var27 = var21[var11];
                            var25 = var27[2];
                            int var28 = 0;
                            int var29 = var23 - -var4;
                            if (var29 < 0) {
                                var29 += class246.field4385;
                            }
                            if (~class246.field4385 > ~var29) {
                                var29 -= class246.field4385;
                            }
                            while (true) {
                                int[] var30 = var21[var26];
                                if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                                    if (var11 != var26) {
                                        int var31 = var4 + var8;
                                        if (var31 < 0) {
                                            var31 += class246.field4385;
                                        }
                                        if (class246.field4385 < var31) {
                                            var31 -= class246.field4385;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var21[(var11 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var21[(var11 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class246.field4385;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method116(arg1 + -1638, -var38 + var39, var7 + var38, -var35 + var25, var6, var35, var20);
                                            }
                                        }
                                    }
                                    var11 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (var24 + var25 > class13.field235) {
                            var24 = -var25 + class13.field235;
                        } else {
                            var9 = false;
                        }
                        if (class246.field4385 != var23) {
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[2] = var24 + var25;
                            var41[1] = var23;
                            this.method116(2783, var22, var5 + var8, var24, var6, var25, var20);
                            var8 = var23;
                        } else {
                            this.method116(arg1 ^ 7066, var22, var8 - -var5, var24, var6, var25, var20);
                            if (var9) {
                                return var3;
                            }
                            var10 = false;
                            var7 = var5;
                            var9 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var23;
                            var42[2] = var24 + var25;
                            var11 = 0;
                            var42[0] = var8;
                            var12 = var13;
                            var5 = class255.method1729(var20, 3, class246.field4385);
                            var8 = 0;
                            var4 = -var7 + var5;
                            var13 = 0;
                            int[][] var43 = var21;
                            int var44 = var4;
                            var21 = var19;
                            if (var4 < 0) {
                                var44 = class246.field4385 + var4;
                            }
                            var19 = var43;
                            if (~var44 < ~class246.field4385) {
                                var44 -= class246.field4385;
                            }
                            while (true) {
                                int[] var45 = var21[var11];
                                if (~var44 <= ~var45[0] && var44 <= var45[1]) {
                                    break;
                                }
                                ++var11;
                                if (~var11 <= ~var12) {
                                    var11 = 0;
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

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(JI)Lli;")
    public static final class185 method117(long arg0, int arg1) {
        class199.field3658.setTime(new Date(arg0));
        ++field268;
        int var3 = class199.field3658.get(7);
        int var4 = class199.field3658.get(5);
        int var5 = class199.field3658.get(2);
        if (arg1 <= 15) {
            return null;
        } else {
            int var6 = class199.field3658.get(1);
            int var7 = class199.field3658.get(11);
            int var8 = class199.field3658.get(12);
            int var9 = class199.field3658.get(13);
            return class87.method567(-11039, new class185[] { class212.field3877[var3 + -1], class241.field4309, class90.method591(var4 / 10, 0), class90.method591(var4 % 10, 0), class141.field2643, class26.field447[var5], class141.field2643, class90.method591(var6, 0), class188.field3515, class90.method591(var7 / 10, 0), class90.method591(var7 % 10, 0), class129.field2303, class90.method591(var8 / 10, 0), class90.method591(var8 % 10, 0), class129.field2303, class90.method591(var9 / 10, 0), class90.method591(var9 % 10, 0), class48.field783 });
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I")
    public static final int method118(byte arg0, int arg1) {
        if (arg0 != 69) {
            field247 = 67;
        }
        ++field248;
        return arg1 >>> 8;
    }
}

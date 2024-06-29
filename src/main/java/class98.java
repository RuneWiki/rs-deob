import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class98 extends class185 {

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    private int field1541 = 1024;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    private int field1540 = 409;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    private int field1534 = 819;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    private int field1546 = 1024;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    private int field1537 = 1024;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    private int field1544 = 1024;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    private int field1550 = 0;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    private int field1551 = 2048;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    private int field1556 = 0;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "[Lsb;")
    public static class230[] field1553;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;Lfg;III)Ljf;")
    public static final class65 method629(Component arg0, class12 arg1, int arg2, int arg3, int arg4) {
        ++field1548;
        if (~class248.field3764 == -1) {
            throw new IllegalStateException();
        } else if (~arg2 <= -1 && arg2 < 2) {
            if (~arg3 > -257) {
                arg3 = 256;
            }
            try {
                class65 var5 = (class65) Class.forName("ib").newInstance();
                var5.field1029 = new int[256 * (!class275.field4153 ? 1 : 2)];
                int var6 = 50 % ((arg4 - -83) / 34);
                var5.field1037 = arg3;
                var5.method21(arg0);
                var5.field1044 = (arg3 & -1024) + 1024;
                if (var5.field1044 > 16384) {
                    var5.field1044 = 16384;
                }
                var5.method23(var5.field1044);
                if (class236.field3554 > 0 && class48.field772 == null) {
                    class48.field772 = new class290();
                    class48.field772.field4577 = arg1;
                    arg1.method71(2, class236.field3554, class48.field772);
                }
                if (class48.field772 != null) {
                    if (class48.field772.field4574[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class48.field772.field4574[arg2] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class5 var7 = new class5(arg1, arg2);
                    var7.field1037 = arg3;
                    var7.field1029 = new int[(class275.field4153 ? 2 : 1) * 256];
                    var7.method21(arg0);
                    var7.field1044 = 16384;
                    var7.method23(var7.field1044);
                    if (~class236.field3554 < -1 && class48.field772 == null) {
                        class48.field772 = new class290();
                        class48.field772.field4577 = arg1;
                        arg1.method71(2, class236.field3554, class48.field772);
                    }
                    if (class48.field772 != null) {
                        if (class48.field772.field4574[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class48.field772.field4574[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class65();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (arg0 != -9) {
            this.method34(125, 9);
        }
        ++field1547;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            return null;
        } else {
            ++field1536;
            int[] var3 = super.field2804.method561(arg0, -2);
            if (super.field2804.field1384) {
                int[][] var4 = super.field2804.method563((byte) -27);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                boolean var9 = true;
                int var10 = 0;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class174.field2648 * this.field1544 >> 12;
                int var15 = class174.field2648 * this.field1551 >> 12;
                int var16 = class130.field1933 * this.field1540 >> 12;
                int var17 = class130.field1933 * this.field1534 >> 12;
                if (~var17 >= -2) {
                    return var4[arg0];
                } else {
                    this.field1535 = class174.field2648 / 8 * this.field1541 >> 12;
                    int var18 = class174.field2648 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field1550);
                    while (true) {
                        while (true) {
                            int var22 = class112.method726(-var14 + var15, (byte) 114, var21) + var14;
                            int var23 = class112.method726(-var16 + var17, (byte) 112, var21) + var16;
                            int var24 = var10 + var22;
                            if (~class174.field2648 > ~var24) {
                                var22 = -var10 + class174.field2648;
                                var24 = class174.field2648;
                            }
                            int var27;
                            if (var11) {
                                var27 = 0;
                            } else {
                                int var25 = var8;
                                int[] var26 = var20[var8];
                                var27 = var26[2];
                                int var28 = var24 - -var6;
                                int var29 = 0;
                                if (var28 < 0) {
                                    var28 += class174.field2648;
                                }
                                if (~class174.field2648 > ~var28) {
                                    var28 -= class174.field2648;
                                }
                                while (true) {
                                    int[] var30 = var20[var25];
                                    if (~var30[0] >= ~var28 && ~var30[1] <= ~var28) {
                                        if (var8 != var25) {
                                            int var31 = var6 + var10;
                                            if (var31 < 0) {
                                                var31 += class174.field2648;
                                            }
                                            if (~var31 < ~class174.field2648) {
                                                var31 -= class174.field2648;
                                            }
                                            for (int var32 = 1; ~var32 >= ~var29; ++var32) {
                                                int[] var40 = var20[(var8 + var32) % var12];
                                                var27 = Math.max(var27, var40[2]);
                                            }
                                            for (int var33 = 0; ~var29 <= ~var33; ++var33) {
                                                int[] var34 = var20[(var8 + var33) % var12];
                                                int var35 = var34[2];
                                                if (var27 != var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (var28 > var31) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var28, var37);
                                                    } else if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class174.field2648;
                                                    } else {
                                                        var39 = Math.min(var28, var37);
                                                        var38 = 0;
                                                    }
                                                    this.method634(-var35 + var27, (byte) 43, -var38 + var39, var35, var4, var5 + var38, var21);
                                                }
                                            }
                                        }
                                        var8 = var25;
                                        break;
                                    }
                                    ++var29;
                                    ++var25;
                                    if (~var25 <= ~var12) {
                                        var25 = 0;
                                    }
                                }
                            }
                            if (var27 - -var23 <= class130.field1933) {
                                var9 = false;
                            } else {
                                var23 = -var27 + class130.field1933;
                            }
                            if (~class174.field2648 == ~var24) {
                                this.method634(var23, (byte) 121, var22, var27, var4, var10 - -var7, var21);
                                if (var9) {
                                    return var3;
                                }
                                var11 = false;
                                var5 = var7;
                                var8 = 0;
                                var9 = true;
                                int[] var41 = var19[var13++];
                                var41[2] = var23 + var27;
                                var41[1] = var24;
                                var12 = var13;
                                var13 = 0;
                                var41[0] = var10;
                                var10 = 0;
                                var7 = class112.method726(class174.field2648, (byte) 96, var21);
                                var6 = -var5 + var7;
                                int[][] var42 = var20;
                                int var43 = var6;
                                if (~var6 > -1) {
                                    var43 = class174.field2648 + var6;
                                }
                                var20 = var19;
                                var19 = var42;
                                if (var43 > class174.field2648) {
                                    var43 -= class174.field2648;
                                }
                                while (true) {
                                    int[] var44 = var20[var8];
                                    if (~var43 <= ~var44[0] && var43 <= var44[1]) {
                                        break;
                                    }
                                    ++var8;
                                    if (var8 >= var12) {
                                        var8 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var13++];
                                var45[2] = var23 + var27;
                                var45[0] = var10;
                                var45[1] = var24;
                                this.method634(var23, (byte) 119, var22, var27, var4, var7 + var10, var21);
                                var10 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lpf;ILpf;)V")
    public static final void method630(class294 arg0, int arg1, class294 arg2) {
        ++field1554;
        class91.field1435 = class289.method1916(arg2, class215.field3247, 0, arg0, (byte) -95);
        class36.field502 = (class181) class91.field1435;
        class268.field4036 = class289.method1916(arg2, class83.field1333, 0, arg0, (byte) -77);
        class192.field2953 = class289.method1916(arg2, class13.field176, arg1, arg0, (byte) -65);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method631(int arg0, String arg1, int arg2) {
        if (arg2 >= -127) {
            method633((byte) 46, 98, 75);
        }
        ++field1543;
        class187 var3 = class120.method762((byte) -93, 3, arg0);
        var3.method1167(-117);
        var3.field2835 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field1542;
        if (arg2 == -6357) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (arg0 != 6) {
                                        if (~arg0 != -8) {
                                            if (arg0 == 8) {
                                                this.field1546 = arg1.method1575(false);
                                            }
                                        } else {
                                            this.field1537 = arg1.method1575(false);
                                        }
                                    } else {
                                        this.field1556 = arg1.method1593((byte) 27);
                                    }
                                } else {
                                    this.field1541 = arg1.method1575(false);
                                }
                            } else {
                                this.field1534 = arg1.method1575(false);
                            }
                        } else {
                            this.field1540 = arg1.method1575(false);
                        }
                    } else {
                        this.field1551 = arg1.method1575(false);
                    }
                } else {
                    this.field1544 = arg1.method1575(false);
                }
            } else {
                this.field1550 = arg1.method1593((byte) 27);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method632(int arg0, long arg1) {
        ++field1538;
        if ((long) arg0 < arg1 && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class198.field3003[(int) (-(arg1 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(BII)I")
    public static final int method633(byte arg0, int arg1, int arg2) {
        ++field1555;
        if (~arg1 > ~arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 != 45) {
            return 88;
        } else {
            while (~arg2 != -1) {
                int var4 = arg1 % arg2;
                arg1 = arg2;
                arg2 = var4;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBII[[IILjava/util/Random;)V")
    private final void method634(int arg0, byte arg1, int arg2, int arg3, int[][] arg4, int arg5, Random arg6) {
        ++field1539;
        int var8 = this.field1546 <= 0 ? 4096 : -class112.method726(this.field1546, (byte) 109, arg6) + 4096;
        if (arg1 < 41) {
            field1553 = null;
        }
        int var9 = this.field1537 * this.field1535 >> 12;
        int var10 = this.field1535 + -(~var9 >= -1 ? 0 : class112.method726(var9, (byte) 69, arg6));
        if (arg5 >= class174.field2648) {
            arg5 -= class174.field2648;
        }
        if (var10 <= 0) {
            if (class174.field2648 < arg2 + arg5) {
                int var11 = class174.field2648 - arg5;
                for (int var12 = 0; arg0 > var12; ++var12) {
                    int[] var13 = arg4[arg3 + var12];
                    class193.method1212(var13, arg5, var11, var8);
                    class193.method1212(var13, 0, arg2 - var11, var8);
                }
            } else {
                for (int var14 = 0; var14 < arg0; ++var14) {
                    class193.method1212(arg4[arg3 - -var14], arg5, arg2, var8);
                }
            }
        } else if (arg0 > 0 && arg2 > 0) {
            int var15 = arg0 / 2;
            int var16 = arg2 / 2;
            int var17 = ~var16 <= ~var10 ? var10 : var16;
            int var18 = ~var15 <= ~var10 ? var10 : var15;
            int var19 = arg5 + var17;
            int var20 = -(var17 * 2) + arg2;
            for (int var21 = 0; arg0 > var21; ++var21) {
                int[] var22 = arg4[var21 - -arg3];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field1556 == 0) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class94.method598(class53.field873, arg5 + var24)] = var22[class94.method598(arg2 - 1 + -var24 + arg5, class53.field873)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class94.method598(class53.field873, arg5 - -var26)] = var22[class94.method598(class53.field873, arg2 + arg5 + -1 - var26)] = ~var23 < ~var28 ? var28 : var23;
                        }
                    }
                    if (~class174.field2648 > ~(var19 + var20)) {
                        int var27 = class174.field2648 - var19;
                        class193.method1212(var22, var19, var27, var23);
                        class193.method1212(var22, 0, -var27 + var20, var23);
                    } else {
                        class193.method1212(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg0 - 1;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field1556 != 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class94.method598(arg5 + var31, class53.field873)] = var22[class94.method598(arg2 + arg5 + -var31 - 1, class53.field873)] = ~var30 < ~var32 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class94.method598(class53.field873, arg5 + var33)] = var22[class94.method598(class53.field873, arg5 - (var33 - -1) + arg2)] = var30 * var35 >> 12;
                            }
                        }
                        if (var19 + var20 <= class174.field2648) {
                            class193.method1212(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class174.field2648;
                            class193.method1212(var22, var19, var34, var30);
                            class193.method1212(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class94.method598(arg5 - -var36, class53.field873)] = var22[class94.method598(class53.field873, arg2 - 1 + arg5 + -var36)] = var8 * var36 / var17;
                        }
                        if (~class174.field2648 <= ~(var19 - -var20)) {
                            class193.method1212(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class174.field2648;
                            class193.method1212(var22, var19, var37, var8);
                            class193.method1212(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLrf;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method635(byte arg0, class289 arg1, String arg2) {
        ++field1552;
        if (arg0 != 66) {
            method629((Component) null, (class12) null, 34, 70, 117);
        }
        if (~arg2.indexOf("%") != 0) {
            while (true) {
                int var3 = arg2.indexOf("%1");
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            return arg2;
                                                        }
                                                        String var9 = "";
                                                        if (class22.field266 != null) {
                                                            if (class22.field266.field1250 == null) {
                                                                var9 = class256.method1691(arg0 + -26558, class22.field266.field1252);
                                                            } else {
                                                                var9 = (String) class22.field266.field1250;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class61.method407(class81.method531(arg1, 4, false), false) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class61.method407(class81.method531(arg1, 3, false), false) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class61.method407(class81.method531(arg1, 2, false), false) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class61.method407(class81.method531(arg1, 1, false), false) + arg2.substring(var4 - -2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class61.method407(class81.method531(arg1, 0, false), false) + arg2.substring(var3 + 2);
            }
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(Z)V")
    public static void method636(boolean arg0) {
        field1553 = null;
        if (!arg0) {
            method635((byte) 73, (class289) null, (String) null);
        }
    }
}

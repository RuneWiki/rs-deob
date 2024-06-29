import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class124 extends class398 {

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    private int field1726 = 1024;

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "I")
    private int field1735 = 409;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    private int field1722 = 0;

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
    private int field1732 = 1024;

    @OriginalMember(owner = "client!nq", name = "fb", descriptor = "I")
    private int field1741 = 0;

    @OriginalMember(owner = "client!nq", name = "hb", descriptor = "I")
    private int field1743 = 1024;

    @OriginalMember(owner = "client!nq", name = "jb", descriptor = "I")
    private int field1745 = 2048;

    @OriginalMember(owner = "client!nq", name = "gb", descriptor = "I")
    private int field1742 = 819;

    @OriginalMember(owner = "client!nq", name = "ib", descriptor = "I")
    private int field1744 = 1024;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1725 = "rating: ";

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public static int field1733 = -1;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
    public static int field1728 = 0;

    @OriginalMember(owner = "client!nq", name = "lb", descriptor = "I")
    public static int field1747 = -2;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!nq", name = "Y", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!nq", name = "bb", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!nq", name = "cb", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!nq", name = "db", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!nq", name = "eb", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!nq", name = "kb", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V", line = 5)
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V", line = 13)
    public static final void method786(int arg0) {
        if (arg0 == 0) {
            class390.field5615.method1141(256);
            ++field1746;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IB)V", line = 24)
    public static final void method787(int arg0, byte arg1) {
        ++field1736;
        if (arg0 != 0) {
            if (arg0 == 1) {
                class12.method83(88);
            } else if (~arg0 == -3) {
                class300.method2058((byte) -127);
            } else {
                if (~arg0 != -4) {
                    throw new RuntimeException();
                }
                class94.method654((byte) 14);
            }
            int var2 = -10 / ((arg1 - -18) / 34);
        }
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)V", line = 55)
    public static void method788(int arg0) {
        field1725 = null;
        if (arg0 < 8) {
            field1728 = -110;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I", line = 65)
    public final int[] method95(int arg0, int arg1) {
        ++field1738;
        if (arg1 != 0) {
            return null;
        } else {
            int[] var3 = super.field5927.method305(arg0, (byte) 107);
            if (super.field5927.field591) {
                int[][] var4 = super.field5927.method301(0);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class140.field1922 * this.field1743 >> 12;
                int var15 = class140.field1922 * this.field1745 >> 12;
                int var16 = class329.field4798 * this.field1735 >> 12;
                int var17 = class329.field4798 * this.field1742 >> 12;
                if (~var17 >= -2) {
                    return var4[arg0];
                } else {
                    this.field1730 = class140.field1922 / 8 * this.field1732 >> 12;
                    int var18 = class140.field1922 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field1722);
                    while (true) {
                        while (true) {
                            int var22 = class139.method895(arg1 + -19416, var21, -var14 + var15) + var14;
                            int var23 = class139.method895(arg1 + -19416, var21, var17 - var16) + var16;
                            int var24 = var8 + var22;
                            if (class140.field1922 < var24) {
                                var22 = class140.field1922 - var8;
                                var24 = class140.field1922;
                            }
                            int var29;
                            if (var11) {
                                var29 = 0;
                            } else {
                                int var25 = var9;
                                int[] var26 = var20[var9];
                                int var27 = 0;
                                int var28 = var5 + var24;
                                if (var28 < 0) {
                                    var28 += class140.field1922;
                                }
                                if (class140.field1922 < var28) {
                                    var28 -= class140.field1922;
                                }
                                var29 = var26[2];
                                while (true) {
                                    int[] var30 = var20[var25];
                                    if (~var28 <= ~var30[0] && ~var30[1] <= ~var28) {
                                        if (var9 != var25) {
                                            int var31 = var5 + var8;
                                            if (var31 < 0) {
                                                var31 += class140.field1922;
                                            }
                                            if (var31 > class140.field1922) {
                                                var31 -= class140.field1922;
                                            }
                                            for (int var32 = 1; var32 <= var27; ++var32) {
                                                int[] var40 = var20[(var9 - -var32) % var12];
                                                var29 = Math.max(var29, var40[2]);
                                            }
                                            for (int var33 = 0; var33 <= var27; ++var33) {
                                                int[] var34 = var20[(var9 + var33) % var12];
                                                int var35 = var34[2];
                                                if (var29 != var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (var28 > var31) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var28, var37);
                                                    } else if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class140.field1922;
                                                    } else {
                                                        var39 = Math.min(var28, var37);
                                                        var38 = 0;
                                                    }
                                                    this.method789(var21, -var35 + var29, -var38 + var39, var4, var7 + var38, (byte) 114, var35);
                                                }
                                            }
                                        }
                                        var9 = var25;
                                        break;
                                    }
                                    ++var27;
                                    ++var25;
                                    if (~var25 <= ~var12) {
                                        var25 = 0;
                                    }
                                }
                            }
                            if (var29 - -var23 > class329.field4798) {
                                var23 = -var29 + class329.field4798;
                            } else {
                                var10 = false;
                            }
                            if (class140.field1922 != var24) {
                                int[] var41 = var19[var13++];
                                var41[2] = var29 - -var23;
                                var41[0] = var8;
                                var41[1] = var24;
                                this.method789(var21, var23, var22, var4, var6 + var8, (byte) 92, var29);
                                var8 = var24;
                            } else {
                                this.method789(var21, var23, var22, var4, var6 + var8, (byte) 64, var29);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var42 = var19[var13++];
                                var42[0] = var8;
                                var42[1] = var24;
                                var42[2] = var23 + var29;
                                int[][] var43 = var20;
                                var20 = var19;
                                var19 = var43;
                                var12 = var13;
                                var7 = var6;
                                var13 = 0;
                                var6 = class139.method895(-19416, var21, class140.field1922);
                                var5 = var6 - var7;
                                var8 = 0;
                                int var44 = var5;
                                if (var5 < 0) {
                                    var44 = class140.field1922 + var5;
                                }
                                var9 = 0;
                                if (~class140.field1922 > ~var44) {
                                    var44 -= class140.field1922;
                                }
                                while (true) {
                                    int[] var45 = var20[var9];
                                    if (var45[0] <= var44 && var44 <= var45[1]) {
                                        var11 = false;
                                        break;
                                    }
                                    ++var9;
                                    if (var9 >= var12) {
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

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/util/Random;II[[IIBI)V", line = 319)
    private final void method789(Random arg0, int arg1, int arg2, int[][] arg3, int arg4, byte arg5, int arg6) {
        ++field1737;
        int var8 = ~this.field1744 >= -1 ? 4096 : 4096 - class139.method895(-19416, arg0, this.field1744);
        if (arg5 > 54) {
            int var9 = this.field1730 * this.field1726 >> 12;
            int var10 = this.field1730 + -(var9 > 0 ? class139.method895(-19416, arg0, var9) : 0);
            if (~arg4 <= ~class140.field1922) {
                arg4 -= class140.field1922;
            }
            if (~var10 < -1) {
                if (~arg1 < -1 && ~arg2 < -1) {
                    int var11 = arg2 / 2;
                    int var12 = arg1 / 2;
                    int var13 = ~var11 > ~var10 ? var11 : var10;
                    int var14 = ~var12 > ~var10 ? var12 : var10;
                    int var15 = arg4 - -var13;
                    int var16 = -(var13 * 2) + arg2;
                    for (int var17 = 0; arg1 > var17; ++var17) {
                        int[] var18 = arg3[arg6 + var17];
                        if (var14 > var17) {
                            int var19 = var8 * var17 / var14;
                            if (this.field1741 == 0) {
                                for (int var20 = 0; var20 < var13; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class183.method1117(arg4 + var20, class242.field3233)] = var18[class183.method1117(class242.field3233, arg4 + -1 - (-arg2 - -var20))] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class183.method1117(class242.field3233, arg4 - -var22)] = var18[class183.method1117(class242.field3233, -var22 + arg4 + arg2 + -1)] = ~var19 < ~var24 ? var24 : var19;
                                }
                            }
                            if (~(var15 - -var16) >= ~class140.field1922) {
                                class60.method420(var18, var15, var16, var19);
                            } else {
                                int var23 = -var15 + class140.field1922;
                                class60.method420(var18, var15, var23, var19);
                                class60.method420(var18, 0, -var23 + var16, var19);
                            }
                        } else {
                            int var25 = arg1 - var17 - 1;
                            if (~var14 < ~var25) {
                                int var26 = var8 * var25 / var14;
                                if (~this.field1741 == -1) {
                                    for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class183.method1117(class242.field3233, arg4 + var27)] = var18[class183.method1117(arg2 + arg4 - (var27 - -1), class242.field3233)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class183.method1117(class242.field3233, arg4 + var29)] = var18[class183.method1117(class242.field3233, -var29 + arg4 + -1 + arg2)] = var26 > var31 ? var31 : var26;
                                    }
                                }
                                if (var15 - -var16 > class140.field1922) {
                                    int var30 = -var15 + class140.field1922;
                                    class60.method420(var18, var15, var30, var26);
                                    class60.method420(var18, 0, -var30 + var16, var26);
                                } else {
                                    class60.method420(var18, var15, var16, var26);
                                }
                            } else {
                                for (int var32 = 0; var32 < var13; ++var32) {
                                    var18[class183.method1117(arg4 + var32, class242.field3233)] = var18[class183.method1117(arg4 - (var32 + 1 + -arg2), class242.field3233)] = var8 * var32 / var13;
                                }
                                if (~class140.field1922 <= ~(var15 + var16)) {
                                    class60.method420(var18, var15, var16, var8);
                                } else {
                                    int var33 = -var15 + class140.field1922;
                                    class60.method420(var18, var15, var33, var8);
                                    class60.method420(var18, 0, -var33 + var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (~(arg2 + arg4) >= ~class140.field1922) {
                for (int var34 = 0; ~arg1 < ~var34; ++var34) {
                    class60.method420(arg3[arg6 + var34], arg4, arg2, var8);
                }
            } else {
                int var35 = -arg4 + class140.field1922;
                for (int var36 = 0; arg1 > var36; ++var36) {
                    int[] var37 = arg3[arg6 + var36];
                    class60.method420(var37, arg4, var35, var8);
                    class60.method420(var37, 0, -var35 + arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V", line = 517)
    public final void method209(int arg0) {
        if (arg0 == 16) {
            ++field1727;
        }
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)Lqn;", line = 531)
    public static final class196 method790(int arg0) {
        ++field1729;
        try {
            if (arg0 != -28861) {
                method793(-118, false);
            }
            return (class196) Class.forName("aa").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIZZI)Lmj;", line = 548)
    public static final class169 method791(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field1721;
        class169 var5 = new class169();
        var5.field2275 = arg1;
        if (arg3) {
            method792(-123);
        }
        var5.field2276 = arg0;
        class99.field1377.method381(!arg3, var5, (long) arg4);
        class270.method1853(1, arg1);
        class394 var6 = class196.method1168((byte) -69, arg4);
        if (var6 != null) {
            class407.method2621(var6, 15);
        }
        if (class211.field2807 != null) {
            class407.method2621(class211.field2807, 15);
            class211.field2807 = null;
        }
        class244.method1470(-10);
        if (var6 != null) {
            class235.method1409(var6, !arg2, (byte) -110);
        }
        if (!arg2) {
            class123.method784(arg1);
        }
        if (!arg2 && ~class329.field4790 != 0) {
            class362.method2367(1, class329.field4790, 14336);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)I", line = 588)
    public static final int method792(int arg0) {
        ++field1734;
        if (arg0 < 36) {
            method788(-44);
        }
        return 2;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V", line = 605)
    public static final void method793(int arg0, boolean arg1) {
        ++field1740;
        class189 var2 = class182.field2476;
        synchronized (class182.field2476) {
            class182.field2476.method1142((byte) -83, arg0);
        }
        if (arg1) {
            field1731 = -12;
        }
        class189 var3 = class27.field388;
        synchronized (class27.field388) {
            class27.field388.method1142((byte) -76, arg0);
        }
        class189 var4 = class93.field1340;
        synchronized (class93.field1340) {
            class93.field1340.method1142((byte) -126, arg0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lnj;II)V", line = 638)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field1744 = arg0.method1343(arg2 + 13387);
                                        }
                                    } else {
                                        this.field1726 = arg0.method1343(arg2 + 13387);
                                    }
                                } else {
                                    this.field1741 = arg0.method1348(-113);
                                }
                            } else {
                                this.field1732 = arg0.method1343(arg2 ^ -13237);
                            }
                        } else {
                            this.field1742 = arg0.method1343(255);
                        }
                    } else {
                        this.field1735 = arg0.method1343(255);
                    }
                } else {
                    this.field1745 = arg0.method1343(255);
                }
            } else {
                this.field1743 = arg0.method1343(255);
            }
        } else {
            this.field1722 = arg0.method1348(-88);
        }
        ++field1720;
        if (arg2 != -13132) {
            method790(-97);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lic;)V", line = 746)
    public static final void method794(class227 arg0) {
        if (class339.field4888 < 255) {
            class75.field1078[class339.field4888] = arg0;
            class177.field2338[class339.field4888] = false;
            ++class339.field4888;
            int var1 = arg0.field2987;
            if (arg0.field2986) {
                var1 = 0;
            }
            int var2 = arg0.field2987;
            if (arg0.field2974) {
                var2 = class180.field2380 - 1;
            }
            for (int var3 = var1; var3 <= var2; ++var3) {
                int var4 = 0;
                int var5 = arg0.field5310 - arg0.field5303 + 64 >> 7;
                if (var5 < 0) {
                    var4 -= var5;
                    var5 = 0;
                }
                int var6 = arg0.field5310 + arg0.field5303 - 64 >> 7;
                if (var6 >= class214.field2858) {
                    var6 = class214.field2858 - 1;
                }
                for (int var7 = var5; var7 <= var6; ++var7) {
                    short var8 = arg0.field2983[var4++];
                    int var9 = (var8 >>> 8) + (arg0.field5308 - arg0.field5303 + 64 >> 7);
                    int var10 = (var8 & 255) + var9 - 1;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var10 >= class104.field1436) {
                        var10 = class104.field1436 - 1;
                    }
                    for (int var11 = var9; var11 <= var10; ++var11) {
                        int var12 = class23.field304[var3][var11][var7];
                        if ((var12 & 255) == 0) {
                            class23.field304[var3][var11][var7] = var12 | class339.field4888;
                        } else if ((var12 & 65280) == 0) {
                            class23.field304[var3][var11][var7] = var12 | class339.field4888 << 8;
                        } else if ((var12 & 16711680) == 0) {
                            class23.field304[var3][var11][var7] = var12 | class339.field4888 << 16;
                        } else if ((var12 & -16777216) == 0) {
                            class23.field304[var3][var11][var7] = var12 | class339.field4888 << 24;
                        }
                    }
                }
            }
        }
    }
}

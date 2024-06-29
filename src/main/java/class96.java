import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class96 extends class167 {

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    private int field1758 = 1024;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
    private int field1754 = 409;

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
    private int field1759 = 2048;

    @OriginalMember(owner = "client!ii", name = "jb", descriptor = "I")
    private int field1764 = 819;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    private int field1750 = 1024;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    private int field1753 = 0;

    @OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
    private int field1767 = 1024;

    @OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
    private int field1769 = 1024;

    @OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
    private int field1770 = 0;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    public static int field1756 = -1;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "J")
    public static long field1751 = 0L;

    @OriginalMember(owner = "client!ii", name = "lb", descriptor = "[I")
    public static int[] field1766 = new int[100];

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ii", name = "kb", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ii", name = "nb", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ii", name = "qb", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "[Z")
    public static boolean[] field1760;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1766 = null;
        field1760 = null;
        if (arg0 != -21696) {
            method655((class10) null, -33);
        }
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
    public static final void method651(int arg0) {
        class18.field511.method395((byte) -107);
        ++field1761;
        int var1 = class18.field511.method396(arg0, (byte) -9);
        if (~var1 != -1) {
            int var2 = class18.field511.method396(2, (byte) -9);
            if (var2 == 0) {
                class203.field3679[class215.field3914++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class18.field511.method396(3, (byte) -9);
                class93.field1712.method1509(false, var3, (byte) -113);
                int var4 = class18.field511.method396(1, (byte) -9);
                if (var4 == 1) {
                    class203.field3679[class215.field3914++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class18.field511.method396(3, (byte) -9);
                class93.field1712.method1509(true, var5, (byte) -10);
                int var6 = class18.field511.method396(3, (byte) -9);
                class93.field1712.method1509(true, var6, (byte) -61);
                int var7 = class18.field511.method396(1, (byte) -9);
                if (var7 == 1) {
                    class203.field3679[class215.field3914++] = 2047;
                }
            } else if (~var2 == -4) {
                int var8 = class18.field511.method396(1, (byte) -9);
                class203.field3675 = class18.field511.method396(2, (byte) -9);
                int var9 = class18.field511.method396(1, (byte) -9);
                if (~var9 == -2) {
                    class203.field3679[class215.field3914++] = 2047;
                }
                int var10 = class18.field511.method396(7, (byte) -9);
                int var11 = class18.field511.method396(7, (byte) -9);
                class93.field1712.method1513(var11, var10, arg0 ^ -26448, ~var8 == -2);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field1767 = arg0.method1049((byte) 100);
                                        }
                                    } else {
                                        this.field1750 = arg0.method1049((byte) 100);
                                    }
                                } else {
                                    this.field1770 = arg0.method998(83);
                                }
                            } else {
                                this.field1758 = arg0.method1049((byte) 122);
                            }
                        } else {
                            this.field1764 = arg0.method1049((byte) 107);
                        }
                    } else {
                        this.field1754 = arg0.method1049((byte) 94);
                    }
                } else {
                    this.field1759 = arg0.method1049((byte) 127);
                }
            } else {
                this.field1769 = arg0.method1049((byte) 125);
            }
        } else {
            this.field1753 = arg0.method998(111);
        }
        ++field1749;
        if (arg1) {
            method651(-73);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        int var2 = 102 % ((-18 - arg0) / 59);
        ++field1771;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
    public static final void method652(int arg0) {
        ++field1762;
        if (!(class90.field1672 < class9.field152)) {
            if (class9.field152 < class90.field1672) {
                class90.field1672 -= class90.field1672 / 30.0D;
                if (class90.field1672 < class9.field152) {
                    class90.field1672 = class9.field152;
                }
                class145.method1001((byte) 104);
            }
        } else {
            class90.field1672 += class90.field1672 / 30.0D;
            if (class9.field152 < class90.field1672) {
                class90.field1672 = class9.field152;
            }
            class145.method1001((byte) 109);
        }
        if (class34.field807 != -1 && ~class211.field3837 != 0) {
            int var1 = -class156.field2838 + class34.field807;
            if (~var1 > -3 || ~var1 < -3) {
                var1 >>= 4;
            }
            class156.field2838 += var1;
            int var2 = -class1.field12 + class211.field3837;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 4;
            }
            if (var1 == 0 && ~var2 == -1) {
                class34.field807 = -1;
                class211.field3837 = -1;
            }
            class1.field12 += var2;
            class145.method1001((byte) 126);
        }
        if (arg0 != 2) {
            field1766 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
    private final void method653(int arg0, int arg1, int arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        ++field1765;
        int var8 = this.field1767 <= 0 ? 4096 : 4096 + -class223.method1447(this.field1767, arg5, (byte) -79);
        int var9 = this.field1752 * this.field1750 >> 12;
        int var10 = this.field1752 + -(~var9 >= -1 ? 0 : class223.method1447(var9, arg5, (byte) -79));
        if (arg6 >= class115.field2146) {
            arg6 -= class115.field2146;
        }
        if (arg4 >= -72) {
            method651(35);
        }
        if (~var10 < -1) {
            if (~arg2 < -1 && arg1 > 0) {
                int var11 = arg1 / 2;
                int var12 = var10 > var11 ? var11 : var10;
                int var13 = arg2 / 2;
                int var14 = -(var12 * 2) + arg1;
                int var15 = ~var13 > ~var10 ? var13 : var10;
                int var16 = arg6 + var12;
                for (int var17 = 0; ~var17 > ~arg2; ++var17) {
                    int[] var18 = arg3[var17 - -arg0];
                    if (var17 < var15) {
                        int var19 = var8 * var17 / var15;
                        if (~this.field1770 == -1) {
                            for (int var20 = 0; ~var20 > ~var12; ++var20) {
                                int var21 = var8 * var20 / var12;
                                var18[class209.method1370(class34.field801, arg6 + var20)] = var18[class209.method1370(class34.field801, arg6 + -1 + arg1 + -var20)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var12; ++var22) {
                                int var24 = var8 * var22 / var12;
                                var18[class209.method1370(class34.field801, arg6 + var22)] = var18[class209.method1370(-var22 + arg6 + arg1 + -1, class34.field801)] = ~var19 < ~var24 ? var24 : var19;
                            }
                        }
                        if (class115.field2146 >= var14 + var16) {
                            class2.method8(var18, var16, var14, var19);
                        } else {
                            int var23 = -var16 + class115.field2146;
                            class2.method8(var18, var16, var23, var19);
                            class2.method8(var18, 0, -var23 + var14, var19);
                        }
                    } else {
                        int var25 = -var17 + arg2 - 1;
                        if (var15 > var25) {
                            int var26 = var8 * var25 / var15;
                            if (this.field1770 == 0) {
                                for (int var27 = 0; ~var27 > ~var12; ++var27) {
                                    int var28 = var8 * var27 / var12;
                                    var18[class209.method1370(class34.field801, arg6 + var27)] = var18[class209.method1370(class34.field801, arg1 + arg6 + -var27 + -1)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var12 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var12;
                                    var18[class209.method1370(arg6 - -var29, class34.field801)] = var18[class209.method1370(-var29 + arg1 + arg6 + -1, class34.field801)] = var31 >= var26 ? var26 : var31;
                                }
                            }
                            if (~(var14 + var16) >= ~class115.field2146) {
                                class2.method8(var18, var16, var14, var26);
                            } else {
                                int var30 = -var16 + class115.field2146;
                                class2.method8(var18, var16, var30, var26);
                                class2.method8(var18, 0, -var30 + var14, var26);
                            }
                        } else {
                            for (int var32 = 0; var12 > var32; ++var32) {
                                var18[class209.method1370(arg6 + var32, class34.field801)] = var18[class209.method1370(class34.field801, -var32 + -1 + arg6 + arg1)] = var8 * var32 / var12;
                            }
                            if (var14 + var16 > class115.field2146) {
                                int var33 = -var16 + class115.field2146;
                                class2.method8(var18, var16, var33, var8);
                                class2.method8(var18, 0, -var33 + var14, var8);
                            } else {
                                class2.method8(var18, var16, var14, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg6 - -arg1) < ~class115.field2146) {
            int var34 = class115.field2146 - arg6;
            for (int var35 = 0; ~arg2 < ~var35; ++var35) {
                int[] var36 = arg3[arg0 + var35];
                class2.method8(var36, arg6, var34, var8);
                class2.method8(var36, 0, -var34 + arg1, var8);
            }
        } else {
            for (int var37 = 0; ~arg2 < ~var37; ++var37) {
                class2.method8(arg3[arg0 - -var37], arg6, arg1, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILai;)Z")
    public static final boolean method654(int arg0, int arg1, int arg2, class10 arg3) {
        ++field1763;
        byte[] var4 = arg3.method104(-97, arg2, arg0);
        if (arg1 != -2158) {
            method652(-101);
        }
        if (var4 == null) {
            return false;
        } else {
            class200.method1335((byte) 97, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field1755;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int[][] var8 = super.field3013.method1465(63);
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class115.field2146 * this.field1759 >> 12;
            int var15 = class115.field2146 * this.field1769 >> 12;
            int var16 = class57.field1185 * this.field1754 >> 12;
            int var17 = class57.field1185 * this.field1764 >> 12;
            if (~var17 >= -2) {
                return var8[arg1];
            }
            this.field1752 = class115.field2146 / 8 * this.field1758 >> 12;
            int var18 = class115.field2146 / var15 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field1753);
            label128: while (true) {
                while (true) {
                    int var22 = class223.method1447(-var15 + var14, var21, (byte) -79) + var15;
                    int var23 = var9 + var22;
                    int var24 = var16 + class223.method1447(var17 - var16, var21, (byte) -79);
                    if (var23 > class115.field2146) {
                        var23 = class115.field2146;
                        var22 = -var9 + class115.field2146;
                    }
                    int var26;
                    if (var11) {
                        var26 = 0;
                    } else {
                        int[] var25 = var19[var7];
                        var26 = var25[2];
                        int var27 = 0;
                        int var28 = var7;
                        int var29 = var23 - -var4;
                        if (~var29 > -1) {
                            var29 += class115.field2146;
                        }
                        if (~var29 < ~class115.field2146) {
                            var29 -= class115.field2146;
                        }
                        while (true) {
                            int[] var30 = var19[var28];
                            if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                if (var7 != var28) {
                                    int var31 = var9 - -var4;
                                    if (var31 < 0) {
                                        var31 += class115.field2146;
                                    }
                                    if (var31 > class115.field2146) {
                                        var31 -= class115.field2146;
                                    }
                                    for (int var32 = 1; var32 <= var27; ++var32) {
                                        int[] var40 = var19[(var7 + var32) % var12];
                                        var26 = Math.max(var26, var40[2]);
                                    }
                                    for (int var33 = 0; var27 >= var33; ++var33) {
                                        int[] var34 = var19[(var7 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var26 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var29 < ~var31) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (~var36 != -1) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class115.field2146;
                                            } else {
                                                var39 = Math.min(var29, var37);
                                                var38 = 0;
                                            }
                                            this.method653(var35, -var38 + var39, var26 - var35, var8, -119, var21, var38 - -var6);
                                        }
                                    }
                                }
                                var7 = var28;
                                break;
                            }
                            ++var28;
                            if (~var28 <= ~var12) {
                                var28 = 0;
                            }
                            ++var27;
                        }
                    }
                    if (~(var24 + var26) < ~class57.field1185) {
                        var24 = -var26 + class57.field1185;
                    } else {
                        var10 = false;
                    }
                    if (~class115.field2146 != ~var23) {
                        int[] var41 = var20[var13++];
                        var41[1] = var23;
                        var41[2] = var24 + var26;
                        var41[0] = var9;
                        this.method653(var26, var22, var24, var8, arg0 ^ 33, var21, var5 + var9);
                        var9 = var23;
                    } else {
                        this.method653(var26, var22, var24, var8, -99, var21, var5 + var9);
                        if (var10) {
                            break label128;
                        }
                        var11 = false;
                        var10 = true;
                        var6 = var5;
                        var7 = 0;
                        int[] var42 = var20[var13++];
                        var42[0] = var9;
                        var42[2] = var24 + var26;
                        var42[1] = var23;
                        var9 = 0;
                        var5 = class223.method1447(class115.field2146, var21, (byte) -79);
                        var4 = -var6 + var5;
                        int var43 = var4;
                        int[][] var44 = var19;
                        if (var4 < 0) {
                            var43 = class115.field2146 + var4;
                        }
                        if (~var43 < ~class115.field2146) {
                            var43 -= class115.field2146;
                        }
                        var19 = var20;
                        var12 = var13;
                        var13 = 0;
                        while (true) {
                            int[] var45 = var19[var7];
                            if (var43 >= var45[0] && ~var45[1] <= ~var43) {
                                var20 = var44;
                                break;
                            }
                            int var10000 = ~var12;
                            ++var7;
                            if (var10000 >= ~var7) {
                                var7 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -96) {
            this.field1753 = -9;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lai;I)V")
    public static final void method655(class10 arg0, int arg1) {
        ++field1757;
        if (arg1 == 0) {
            client.field784 = arg0;
        }
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class24 extends class34 {

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    private int field325 = 16;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    private int field323 = 2000;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    private int field329 = 4096;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    private int field331 = 0;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "Lrb;")
    public static class283 field330 = new class283(106, 3);

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "[J")
    public static long[] field334 = new long[32];

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "Lml;")
    public static class27 field328;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method145(int arg0, int arg1, byte arg2) {
        ++field322;
        if (arg2 >= -14) {
            method150(111, 70, 68);
        }
        return (class463.method2689((byte) -121, arg0, arg1) | (8192 & arg1) != 0 | class265.method1558(arg0, arg1, true)) & class281.method1626(arg0, (byte) -22, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V", line = 15)
    public final void method146(byte arg0) {
        if (arg0 >= -84) {
            method147(-86, -98, 57, -39, (class151) null);
        }
        ++field324;
        class114.method856(-124);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 26)
    public class24() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIILiq;)V", line = 31)
    public static final void method147(int arg0, int arg1, int arg2, int arg3, class151 arg4) {
        class532 var5 = class307.method1778(arg0, arg1, arg2);
        if (var5 != null) {
            int var6 = 0;
            arg4.field2327 = (arg1 << class295.field3991) + class392.field5656;
            arg4.field2328 = arg3;
            arg4.field2322 = (arg2 << class295.field3991) + class392.field5656;
            for (class201 var7 = var5.field7828; var7 != null; var7 = var7.field2918) {
                if (var7.field2915.field6280) {
                    int var8 = var7.field2915.method836(-32768);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field2328 += var6;
                arg4.field2320 = true;
            } else if (var5.field7838 != null) {
                arg4.field2328 -= var5.field7838.field2557;
            }
            var5.field7825 = arg4;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V", line = 72)
    public static void method148(byte arg0) {
        field328 = null;
        field334 = null;
        field330 = null;
        if (arg0 != -47) {
            method145(32, -98, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lsv;II)V", line = 87)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field329 = arg0.method1844(-115);
                        }
                    } else {
                        this.field326 = arg0.method1844(-105);
                    }
                } else {
                    this.field325 = arg0.method1869(-68);
                }
            } else {
                this.field323 = arg0.method1844(-104);
            }
        } else {
            this.field331 = arg0.method1869(-94);
        }
        if (arg1 < 16) {
            this.method146((byte) 51);
        }
        ++field327;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I", line = 155)
    public final int[] method64(int arg0, byte arg1) {
        ++field332;
        int var3 = -100 % (-arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 75);
        if (super.field537.field4191) {
            int var5 = this.field329 >> 1;
            int[][] var6 = super.field537.method1781(false);
            Random var7 = new Random((long) this.field331);
            for (int var8 = 0; ~var8 > ~this.field323; ++var8) {
                int var9 = this.field329 > 0 ? this.field326 - var5 - -class322.method1908(this.field329, -128, var7) : this.field326;
                int var10 = var9 >> 4 & 255;
                int var11 = class322.method1908(class383.field5502, -128, var7);
                int var12 = class322.method1908(class494.field7150, -127, var7);
                int var13 = (class135.field2057[var10] * this.field325 >> 12) + var11;
                int var14 = (class38.field574[var10] * this.field325 >> 12) + var12;
                int var15 = var14 - var12;
                int var16 = -var11 + var13;
                if (var16 != 0 || var15 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = var16 < var15;
                    if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        int var19 = var13;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (~var13 > ~var11) {
                        int var20 = var11;
                        var11 = var13;
                        int var21 = var12;
                        var13 = var20;
                        var12 = var14;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = -var11 + var13;
                    int var24 = var14 - var12;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = 1024 + -(class322.method1908(4096, -128, var7) >> 2);
                    int var28 = ~var12 <= ~var14 ? -1 : 1;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    for (int var29 = var11; var13 > var29; ++var29) {
                        int var30 = (-var11 + var29) * var26 + var27 + 1024;
                        int var31 = class120.field1872 & var29;
                        int var32 = class343.field4968 & var22;
                        if (!var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        var25 += var24;
                        if (var25 > 0) {
                            var25 += -var23;
                            var22 -= -var28;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I", line = 288)
    public static final int method149(int arg0, int arg1) {
        int var2 = -99 / ((arg1 - -35) / 38);
        ++field333;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)Z", line = 313)
    public static final boolean method150(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class113.field1823; ++var3) {
            class182 var4 = class274.field3725[var3];
            if (var4.field2707 == 1) {
                int var5 = var4.field2711 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2698 * var5 >> 8) + var4.field2716;
                    int var7 = (var4.field2715 * var5 >> 8) + var4.field2704;
                    int var8 = (var4.field2712 * var5 >> 8) + var4.field2709;
                    int var9 = (var4.field2701 * var5 >> 8) + var4.field2697;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2707 == 2) {
                int var10 = arg0 - var4.field2711;
                if (var10 > 0) {
                    int var11 = (var4.field2698 * var10 >> 8) + var4.field2716;
                    int var12 = (var4.field2715 * var10 >> 8) + var4.field2704;
                    int var13 = (var4.field2712 * var10 >> 8) + var4.field2709;
                    int var14 = (var4.field2701 * var10 >> 8) + var4.field2697;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2707 == 3) {
                int var15 = var4.field2716 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2710 * var15 >> 8) + var4.field2711;
                    int var17 = (var4.field2708 * var15 >> 8) + var4.field2714;
                    int var18 = (var4.field2712 * var15 >> 8) + var4.field2709;
                    int var19 = (var4.field2701 * var15 >> 8) + var4.field2697;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2707 == 4) {
                int var20 = arg2 - var4.field2716;
                if (var20 > 0) {
                    int var21 = (var4.field2710 * var20 >> 8) + var4.field2711;
                    int var22 = (var4.field2708 * var20 >> 8) + var4.field2714;
                    int var23 = (var4.field2712 * var20 >> 8) + var4.field2709;
                    int var24 = (var4.field2701 * var20 >> 8) + var4.field2697;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2707 == 5) {
                int var25 = arg1 - var4.field2709;
                if (var25 > 0) {
                    int var26 = (var4.field2710 * var25 >> 8) + var4.field2711;
                    int var27 = (var4.field2708 * var25 >> 8) + var4.field2714;
                    int var28 = (var4.field2698 * var25 >> 8) + var4.field2716;
                    int var29 = (var4.field2715 * var25 >> 8) + var4.field2704;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

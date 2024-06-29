import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public abstract class class454 extends class215 {

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "B")
    public byte field6517;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "Z")
    public boolean field6519;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "S")
    public short field6524;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "S")
    public short field6516;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "S")
    public short field6521;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "S")
    public short field6526;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "[J")
    public static long[] field6518;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "(I)Z")
    public final boolean method952(int arg0) {
        ++field6515;
        if (arg0 >= -10) {
            this.field6521 = -43;
        }
        return class674.method3740(this.field6521, -3928, this.method1182(-32768), this.field6526, this.field6516, this.field6524, super.field3023);
    }

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "(I)V")
    public void method2555(int arg0) {
        ++field6523;
        if (arg0 != 0) {
            this.field6521 = -31;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I[Lrc;)I")
    public final int method950(int arg0, class498[] arg1) {
        ++field6520;
        if (arg0 != 65535) {
            field6518 = null;
        }
        int var3 = 0;
        label118: for (int var4 = this.field6524; var4 <= this.field6526; ++var4) {
            label116: for (int var5 = this.field6521; ~this.field6516 <= ~var5; ++var5) {
                long var6 = class477.field6789[super.field3019][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class506 var11 = class580.field8172[var10 - 1];
                        for (int var12 = 0; ~var3 < ~var12; ++var12) {
                            if (arg1[var12] == var11.field7165) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field7165;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg1[var13] = null;
        }
        if (~this.field6517 != -1) {
            int var14 = -class435.field6354 + this.field6524;
            int var15 = this.field6521 - class612.field8575;
            short var16;
            int var17;
            int var18;
            short var19;
            if (~this.field6517 != -2) {
                if (var15 <= -var14) {
                    var16 = this.field6521;
                    var17 = this.field6521 - -1;
                    var18 = this.field6524 + 1;
                    var19 = this.field6524;
                } else {
                    var16 = this.field6521;
                    var19 = this.field6524;
                    var17 = this.field6521 + -1;
                    var18 = this.field6524 + -1;
                }
            } else if (var14 >= var15) {
                var18 = this.field6524 + -1;
                var19 = this.field6524;
                var17 = this.field6521 + 1;
                var16 = this.field6521;
            } else {
                var19 = this.field6524;
                var18 = this.field6524 + 1;
                var17 = this.field6521 + -1;
                var16 = this.field6521;
            }
            label82: for (int var20 = 0; ~var3 < ~var20; ++var20) {
                long var21 = class477.field6789[super.field3019][var19][var17];
                while (var21 != 0L) {
                    class506 var27 = class580.field8172[(int) ((var21 & 65535L) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field7165) {
                        continue label82;
                    }
                }
                long var23 = class477.field6789[super.field3019][var18][var16];
                while (~var23 != -1L) {
                    class506 var26 = class580.field8172[(int) ((65535L & var23) - 1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field7165) {
                        continue label82;
                    }
                }
                for (int var25 = var20; var25 < var3 + -1; ++var25) {
                    arg1[var25] = arg1[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "(I)V")
    public static final void method2681(int arg0) {
        ++field6525;
        class460.method2702(class287.field4270.field3699, 4);
        int var1 = (class131.field1928 >> 12) + (class109.field1672 >> 3);
        int var2 = (class413.field6011 >> 12) + (class203.field2874 >> 3);
        class58.field1112 = class648.field9106.field3019 = 0;
        class648.field9106.method2851(arg0 + 47505, 8, 8);
        byte var3 = 18;
        class544.field7660 = new byte[var3][];
        class271.field4086 = new int[var3][4];
        class549.field7718 = new int[var3];
        class505.field7133 = new byte[var3][];
        class44.field708 = new int[var3];
        class131.field1934 = new int[var3];
        class119.field1799 = new byte[var3][];
        class273.field4105 = new int[var3];
        class462.field6663 = new int[var3];
        class475.field6774 = new byte[var3][];
        class248.field3860 = new int[var3];
        class583.field8197 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class199.field2812 >> 4)) / 8; ~(((class199.field2812 >> 4) + var1) / 8) <= ~var5; ++var5) {
            for (int var8 = (var2 - (class232.field3611 >> 4)) / 8; ((class232.field3611 >> 4) + var2) / 8 >= var8; ++var8) {
                int var9 = (var5 << 8) - -var8;
                class273.field4105[var4] = var9;
                class44.field708[var4] = class334.field4954.method2980(-9104, "m" + var5 + "_" + var8);
                class248.field3860[var4] = class334.field4954.method2980(-9104, "l" + var5 + "_" + var8);
                class462.field6663[var4] = class334.field4954.method2980(-9104, "n" + var5 + "_" + var8);
                class549.field7718[var4] = class334.field4954.method2980(-9104, "um" + var5 + "_" + var8);
                class131.field1934[var4] = class334.field4954.method2980(-9104, "ul" + var5 + "_" + var8);
                if (~class462.field6663[var4] == 0) {
                    class44.field708[var4] = -1;
                    class248.field3860[var4] = -1;
                    class549.field7718[var4] = -1;
                    class131.field1934[var4] = -1;
                }
                ++var4;
            }
        }
        if (arg0 != -21844) {
            method2681(26);
        }
        for (int var6 = var4; ~var6 > ~class462.field6663.length; ++var6) {
            class462.field6663[var6] = -1;
            class44.field708[var6] = -1;
            class248.field3860[var6] = -1;
            class549.field7718[var6] = -1;
            class131.field1934[var6] = -1;
        }
        byte var7;
        if (class420.field6113 != 3) {
            var7 = 8;
        } else {
            var7 = 4;
        }
        class264.method1738(arg0 ^ -22356, var1, false, var2, var7);
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(Z)Z")
    public final boolean method948(boolean arg0) {
        ++field6522;
        for (int var2 = this.field6524; ~var2 >= ~this.field6526; ++var2) {
            for (int var3 = this.field6521; var3 <= this.field6516; ++var3) {
                int var4 = -class435.field6354 + var2 + class196.field2802;
                if (var4 >= 0 && class260.field3949.length > var4) {
                    int var5 = -class612.field8575 + var3 + class196.field2802;
                    if (~var5 <= -1 && ~class260.field3949.length < ~var5 && class260.field3949[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        if (!arg0) {
            this.field6524 = 37;
        }
        return false;
    }

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "(I)V")
    public static void method2682(int arg0) {
        field6518 = null;
        if (arg0 >= -79) {
            field6518 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field6517 = arg10;
        this.field6519 = arg9;
        super.field3018 = arg3;
        super.field3029 = arg4;
        super.field3023 = (byte) arg1;
        super.field3019 = (byte) arg0;
        this.field6524 = (short) arg5;
        super.field3024 = arg2;
        this.field6516 = (short) arg8;
        this.field6521 = (short) arg7;
        this.field6526 = (short) arg6;
    }
}

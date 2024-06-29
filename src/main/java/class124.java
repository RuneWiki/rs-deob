import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class124 extends class149 {

    @OriginalMember(owner = "client!pv", name = "W", descriptor = "I")
    private int field1786 = 0;

    @OriginalMember(owner = "client!pv", name = "P", descriptor = "I")
    private int field1779 = 0;

    @OriginalMember(owner = "client!pv", name = "V", descriptor = "I")
    private int field1785 = 0;

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "Z")
    public static boolean field1774 = false;

    @OriginalMember(owner = "client!pv", name = "O", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!pv", name = "L", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!pv", name = "M", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!pv", name = "N", descriptor = "I")
    private int field1777;

    @OriginalMember(owner = "client!pv", name = "Q", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!pv", name = "R", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!pv", name = "S", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!pv", name = "T", descriptor = "I")
    private int field1783;

    @OriginalMember(owner = "client!pv", name = "U", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!pv", name = "X", descriptor = "I")
    private int field1787;

    @OriginalMember(owner = "client!pv", name = "Y", descriptor = "I")
    private int field1788;

    @OriginalMember(owner = "client!pv", name = "Z", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBII)V", line = 3)
    private final void method797(int arg0, byte arg1, int arg2, int arg3) {
        ++field1775;
        if (arg1 != -124) {
            this.field1782 = 51;
        }
        int var5 = ~arg0 >= ~arg3 ? arg3 : arg0;
        int var6 = ~var5 > ~arg2 ? arg2 : var5;
        int var7 = arg3 > arg0 ? arg0 : arg3;
        int var8 = ~var7 < ~arg2 ? arg2 : var7;
        int var9 = var6 - var8;
        this.field1777 = (var6 + var8) / 2;
        if (~var9 < -1) {
            int var10 = (var6 - arg0 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (arg0 == var6) {
                this.field1789 = ~arg3 == ~var8 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg3 == ~var6) {
                this.field1789 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field1789 = ~arg0 != ~var8 ? -var10 + 20480 : 12288 - -var11;
            }
            this.field1789 /= 6;
        } else {
            this.field1789 = 0;
        }
        if (~this.field1777 < -1 && ~this.field1777 > -4097) {
            this.field1787 = (var9 << 12) / (this.field1777 <= 2048 ? this.field1777 * 2 : -(this.field1777 * 2) + 8192);
        } else {
            this.field1787 = 0;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)[[I", line = 63)
    public final int[][] method139(byte arg0, int arg1) {
        if (arg0 >= -45) {
            this.field1785 = -125;
        }
        ++field1784;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int[][] var4 = this.method984((byte) 97, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class316.field4838; ++var11) {
                this.method797(var5[var11], (byte) -124, var7[var11], var6[var11]);
                this.field1777 += this.field1779;
                this.field1789 += this.field1786;
                this.field1787 += this.field1785;
                while (~this.field1789 > -1) {
                    this.field1789 += 4096;
                }
                while (this.field1789 > 4096) {
                    this.field1789 -= 4096;
                }
                if (this.field1787 < 0) {
                    this.field1787 = 0;
                }
                if (~this.field1787 < -4097) {
                    this.field1787 = 4096;
                }
                if (~this.field1777 > -1) {
                    this.field1777 = 0;
                }
                if (this.field1777 > 4096) {
                    this.field1777 = 4096;
                }
                this.method798(-24508, this.field1777, this.field1789, this.field1787);
                var8[var11] = this.field1782;
                var9[var11] = this.field1783;
                var10[var11] = this.field1788;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIII)V", line = 134)
    private final void method798(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -24508) {
            ++field1780;
            int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : arg1 - -arg3 + -(arg1 * arg3 >> 12);
            if (var5 <= 0) {
                this.field1782 = this.field1783 = this.field1788 = arg1;
            } else {
                int var6 = arg2 * 6;
                int var7 = -var5 + arg1 + arg1;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 != -4) {
                                if (var9 != 4) {
                                    if (var9 == 5) {
                                        this.field1783 = var7;
                                        this.field1788 = var15;
                                        this.field1782 = var5;
                                    }
                                } else {
                                    this.field1783 = var7;
                                    this.field1788 = var5;
                                    this.field1782 = var14;
                                }
                            } else {
                                this.field1783 = var15;
                                this.field1788 = var5;
                                this.field1782 = var7;
                            }
                        } else {
                            this.field1783 = var5;
                            this.field1782 = var7;
                            this.field1788 = var14;
                        }
                    } else {
                        this.field1783 = var5;
                        this.field1788 = var7;
                        this.field1782 = var15;
                    }
                } else {
                    this.field1782 = var5;
                    this.field1783 = var14;
                    this.field1788 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V", line = 239)
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBLtl;)V", line = 254)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            this.field1783 = -125;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1779 = (arg2.method619((byte) -23) << 12) / 100;
                }
            } else {
                this.field1785 = (arg2.method619((byte) -23) << 12) / 100;
            }
        } else {
            this.field1786 = arg2.method643((byte) 127);
        }
        ++field1781;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZI)Z", line = 302)
    public static final boolean method799(boolean arg0, int arg1) {
        ++field1773;
        if (!arg0) {
            field1778 = -33;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(B)V", line = 313)
    public static final void method800(byte arg0) {
        ++field1776;
        class429.field6383 = class123.method795(0.4F, 4, 2048, (byte) 121, 8, 8, true, 35);
        int var1 = -92 % ((arg0 - -20) / 41);
    }
}

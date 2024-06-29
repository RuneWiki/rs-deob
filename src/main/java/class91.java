import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class91 extends class4 {

    @OriginalMember(owner = "client!jc", name = "vc", descriptor = "S")
    private short field1783 = 0;

    @OriginalMember(owner = "client!jc", name = "qc", descriptor = "Z")
    public boolean field1778 = false;

    @OriginalMember(owner = "client!jc", name = "Cc", descriptor = "I")
    public int field1790 = 0;

    @OriginalMember(owner = "client!jc", name = "tc", descriptor = "I")
    public int field1781 = -1;

    @OriginalMember(owner = "client!jc", name = "Ic", descriptor = "I")
    public int field1796 = 0;

    @OriginalMember(owner = "client!jc", name = "xc", descriptor = "S")
    private short field1785 = 0;

    @OriginalMember(owner = "client!jc", name = "Jc", descriptor = "I")
    public int field1797 = -1;

    @OriginalMember(owner = "client!jc", name = "Kc", descriptor = "I")
    public int field1798 = 0;

    @OriginalMember(owner = "client!jc", name = "Nc", descriptor = "I")
    public int field1801 = 0;

    @OriginalMember(owner = "client!jc", name = "uc", descriptor = "I")
    public int field1782 = 0;

    @OriginalMember(owner = "client!jc", name = "Fc", descriptor = "[Ltf;")
    public static class185[] field1793 = new class185[5000];

    @OriginalMember(owner = "client!jc", name = "Dc", descriptor = "Ljd;")
    public static class92 field1791 = class202.method1325((byte) 90, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!jc", name = "sc", descriptor = "Ljd;")
    public static class92 field1780 = class202.method1325((byte) 90, "sl_arrows");

    @OriginalMember(owner = "client!jc", name = "Pc", descriptor = "I")
    public static int field1803 = 0;

    @OriginalMember(owner = "client!jc", name = "Qc", descriptor = "Ljd;")
    public static class92 field1804 = class202.method1325((byte) 90, "Clientscript error in: ");

    @OriginalMember(owner = "client!jc", name = "Tc", descriptor = "Ljd;")
    public static class92 field1807 = class202.method1325((byte) 90, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!jc", name = "Uc", descriptor = "I")
    public static int field1808 = 0;

    @OriginalMember(owner = "client!jc", name = "Vc", descriptor = "Ljd;")
    public static class92 field1809 = class202.method1325((byte) 90, "runes");

    @OriginalMember(owner = "client!jc", name = "rc", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!jc", name = "wc", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!jc", name = "yc", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!jc", name = "zc", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!jc", name = "Ac", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!jc", name = "Bc", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jc", name = "Ec", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!jc", name = "Hc", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!jc", name = "Oc", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!jc", name = "Sc", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!jc", name = "Mc", descriptor = "Ldg;")
    public class38 field1800;

    @OriginalMember(owner = "client!jc", name = "Lc", descriptor = "Lig;")
    public class86 field1799;

    @OriginalMember(owner = "client!jc", name = "Rc", descriptor = "Ljd;")
    public class92 field1805;

    @OriginalMember(owner = "client!jc", name = "Gc", descriptor = "[Lrf;")
    public static class167[] field1794;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1786;
        if (this.field1799 != null) {
            class22 var11 = super.field215 != -1 && super.field254 == 0 ? class153.method978(super.field215, -115) : null;
            class22 var12 = ~super.field216 == 0 || this.field1778 || super.field224 == super.field216 && var11 != null ? null : class153.method978(super.field216, -117);
            class38 var13 = this.field1799.method584(super.field260, var12, super.field221, var11, (byte) -49);
            if (var13 != null) {
                var13.method236();
                super.field3511 = var13.field3511;
                if (this.field1783 != 0 && ~this.field1785 != -1) {
                    int var14 = class194.field3787[arg0];
                    int var15 = class194.field3803[arg0];
                    short var16 = this.field1785;
                    short var17 = this.field1783;
                    int var18 = -var16 / 2;
                    int var19 = -var17 / 2;
                    int var20 = var14 * var18 + var15 * var19 >> 16;
                    int var21 = var15 * var18 + -(var14 * var19) >> 16;
                    int var22 = class118.method804(super.field246 + var20, class81.field1639, super.field208 + var21, 0);
                    int var23 = var17 / 2;
                    int var24 = -var16 / 2;
                    int var25 = var14 * var24 + var15 * var23 >> 16;
                    int var26 = var15 * var24 + -(var14 * var23) >> 16;
                    int var27 = class118.method804(super.field246 + var25, class81.field1639, super.field208 + var26, 0);
                    int var28 = -var17 / 2;
                    int var29 = var16 / 2;
                    int var30 = var15 * var29 + -(var14 * var28) >> 16;
                    int var31 = var14 * var29 + var15 * var28 >> 16;
                    int var32 = class118.method804(super.field246 + var31, class81.field1639, super.field208 + var30, 0);
                    int var33 = var17 / 2;
                    int var34 = var16 / 2;
                    int var35 = var14 * var34 - -(var15 * var33) >> 16;
                    int var36 = var15 * var34 + -(var14 * var33) >> 16;
                    int var37 = var27 > var22 ? var22 : var27;
                    int var38 = class118.method804(super.field246 + var35, class81.field1639, super.field208 - -var36, 0);
                    int var39 = var38 > var32 ? var32 : var38;
                    int var40 = ~var38 >= ~var27 ? var38 : var27;
                    int var41 = ~var22 <= ~var32 ? var32 : var22;
                    int var42 = (int) (320.0D * Math.atan2((double) (-var39 + var37), (double) var16)) & 2047;
                    int var43 = (var37 + var39 + var40 + var41) / 4;
                    var13.method243(var42);
                    int var44 = (int) (320.0D * Math.atan2((double) (var41 - var40), (double) var17)) & 2047;
                    var13.method247(var44);
                    var13.method241(0, -super.field248 + var43, 0);
                }
                class38 var45 = null;
                class38 var46 = null;
                if (!this.field1778 && ~super.field238 != 0 && super.field240 != -1) {
                    var45 = class102.method702((byte) -98, super.field238).method383(super.field240, 53);
                    if (var45 != null) {
                        var45.method241(0, -super.field214, 0);
                    }
                }
                if (!this.field1778 && this.field1800 != null) {
                    if (class158.field3150 >= this.field1790) {
                        this.field1800 = null;
                    }
                    if (~class158.field3150 <= ~this.field1798 && ~this.field1790 < ~class158.field3150) {
                        var46 = this.field1800;
                        var46.method241(-super.field246 + this.field1787, -super.field248 + this.field1795, this.field1806 - super.field208);
                        if (~super.field243 == -513) {
                            var46.method251();
                            var46.method251();
                            var46.method251();
                        } else if (super.field243 == 1024) {
                            var46.method251();
                            var46.method251();
                        } else if (super.field243 == 1536) {
                            var46.method251();
                        }
                    }
                }
                if (var45 != null) {
                    var13 = ((class191) var13).method1261(var45);
                }
                if (var46 != null) {
                    var13 = ((class191) var13).method1261(var46);
                }
                var13.field868 = true;
                var13.method600(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var46 != null) {
                    if (~super.field243 == -513) {
                        var46.method251();
                    } else if (~super.field243 == -1025) {
                        var46.method251();
                        var46.method251();
                    } else if (~super.field243 == -1537) {
                        var46.method251();
                        var46.method251();
                        var46.method251();
                    }
                    var46.method241(-this.field1787 + super.field246, -this.field1795 + super.field248, -this.field1806 + super.field208);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)Z")
    public final boolean method24(int arg0) {
        ++field1779;
        if (arg0 != 100) {
            this.method601(-98, (class70) null);
        }
        return this.field1799 != null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILh;)V")
    public final void method601(int arg0, class70 arg1) {
        arg1.field1472 = 0;
        ++field1789;
        int var3 = arg1.method443(255);
        if (~(var3 & 2) != -3) {
            this.field1783 = 0;
            this.field1785 = 0;
        } else {
            this.field1783 = (short) (arg1.method443(255) << 2);
            this.field1785 = (short) (arg1.method443(255) << 2);
        }
        super.field211 = (var3 >> 3) - -1;
        this.field1797 = arg1.method431(-12469);
        this.field1781 = arg1.method431(-12469);
        int var4 = var3 & 1;
        this.field1801 = 0;
        int var5 = -1;
        boolean var6 = (4 & var3) != 0;
        int[] var7 = new int[12];
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg1.method443(255);
            if (var9 == 0) {
                var7[var8] = 0;
            } else {
                int var10 = arg1.method443(255);
                int var11 = (var9 << 8) + var10;
                if (var8 == 0 && ~var11 == -65536) {
                    var5 = arg1.method442(-21351);
                    break;
                }
                if (var11 >= 32768) {
                    int var15 = class61.field1262[var11 + -32768];
                    var7[var8] = class67.method396(var15, 1073741824);
                    int var16 = class92.method626((byte) 59, var15).field2200;
                    if (~var16 != -1) {
                        this.field1801 = var16;
                    }
                } else {
                    var7[var8] = class67.method396(var11 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; var13 < 5; ++var13) {
            int var14 = arg1.method443(255);
            if (~var14 > -1 || ~var14 <= ~class207.field3985[var13].length) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field224 = arg1.method442(-21351);
        if (~super.field224 == -65536) {
            super.field224 = -1;
        }
        super.field201 = arg1.method442(-21351);
        if (super.field201 == 65535) {
            super.field201 = -1;
        }
        super.field192 = super.field201;
        super.field217 = arg1.method442(-21351);
        if (super.field217 == 65535) {
            super.field217 = -1;
        }
        super.field205 = arg1.method442(-21351);
        if (~super.field205 == -65536) {
            super.field205 = -1;
        }
        super.field247 = arg1.method442(-21351);
        if (arg0 < 106) {
            this.method600(-81, 77, -115, 102, -77, -8, 10, 69, 92L);
        }
        if (super.field247 == 65535) {
            super.field247 = -1;
        }
        super.field197 = arg1.method442(-21351);
        if (~super.field197 == -65536) {
            super.field197 = -1;
        }
        super.field237 = arg1.method442(-21351);
        if (~super.field237 == -65536) {
            super.field237 = -1;
        }
        this.field1805 = class129.method855(false, arg1.method448(33)).method617(1);
        this.field1796 = arg1.method443(255);
        if (var6) {
            this.field1782 = arg1.method442(-21351);
        }
        if (this.field1799 == null) {
            this.field1799 = new class86();
        }
        this.field1799.method578(~var4 == -2, var7, 32490, var12, var5);
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)V")
    public static void method602(byte arg0) {
        field1794 = null;
        field1780 = null;
        field1807 = null;
        field1791 = null;
        if (arg0 == 37) {
            field1809 = null;
            field1793 = null;
            field1804 = null;
        }
    }
}

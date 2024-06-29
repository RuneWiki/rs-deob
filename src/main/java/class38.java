import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class38 extends class203 {

    @OriginalMember(owner = "client!dg", name = "oc", descriptor = "I")
    public int field753 = 0;

    @OriginalMember(owner = "client!dg", name = "jc", descriptor = "S")
    private short field748 = 0;

    @OriginalMember(owner = "client!dg", name = "lc", descriptor = "I")
    public int field750 = -1;

    @OriginalMember(owner = "client!dg", name = "hc", descriptor = "I")
    public int field746 = 0;

    @OriginalMember(owner = "client!dg", name = "xc", descriptor = "S")
    private short field762 = 0;

    @OriginalMember(owner = "client!dg", name = "Ec", descriptor = "I")
    public int field769 = -1;

    @OriginalMember(owner = "client!dg", name = "uc", descriptor = "Z")
    public boolean field759 = false;

    @OriginalMember(owner = "client!dg", name = "Cc", descriptor = "I")
    public int field767 = 0;

    @OriginalMember(owner = "client!dg", name = "qc", descriptor = "I")
    public int field755 = 0;

    @OriginalMember(owner = "client!dg", name = "Kc", descriptor = "I")
    public int field775 = 0;

    @OriginalMember(owner = "client!dg", name = "wc", descriptor = "J")
    public static long field761 = 0L;

    @OriginalMember(owner = "client!dg", name = "nc", descriptor = "I")
    public static int field752 = 0;

    @OriginalMember(owner = "client!dg", name = "Dc", descriptor = "[I")
    public static int[] field768 = new int[25];

    @OriginalMember(owner = "client!dg", name = "pc", descriptor = "[S")
    public static short[] field754 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!dg", name = "ic", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!dg", name = "kc", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!dg", name = "mc", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!dg", name = "sc", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!dg", name = "tc", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!dg", name = "vc", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dg", name = "yc", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!dg", name = "zc", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!dg", name = "Bc", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!dg", name = "Fc", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dg", name = "Gc", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!dg", name = "Hc", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dg", name = "Jc", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!dg", name = "Ic", descriptor = "Lob;")
    public class141 field773;

    @OriginalMember(owner = "client!dg", name = "rc", descriptor = "Lfe;")
    public class56 field756;

    @OriginalMember(owner = "client!dg", name = "Ac", descriptor = "Lhc;")
    public class73 field765;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)Z")
    public final boolean method251(byte arg0) {
        ++field770;
        if (this.field765 == null) {
            return false;
        } else {
            return arg0 >= 67;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lra;I)V")
    public static final void method252(class170 arg0, int arg1) {
        ++field758;
        if (arg1 <= -77) {
            if (class8.field126 == arg0.field3285) {
                class141.field2737[arg0.field3387] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public static void method253(byte arg0) {
        field768 = null;
        if (arg0 < 72) {
            method253((byte) 92);
        }
        field754 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()I")
    public final int method16() {
        ++field760;
        return super.field3846;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field749;
        if (this.field765 != null) {
            class26 var11 = super.field3851 != -1 && ~super.field3861 == -1 ? class114.method736(15619, super.field3851) : null;
            class26 var12 = ~super.field3828 == 0 || this.field759 || ~super.field3874 == ~super.field3828 && var11 != null ? null : class114.method736(15619, super.field3828);
            class56 var13 = this.field765.method509(true, super.field3875, super.field3887, var12, var11);
            if (var13 != null) {
                int var14 = 0;
                int var15 = 0;
                super.field3846 = var13.method16();
                int var16 = 0;
                if (~this.field748 != -1 && ~this.field762 != -1) {
                    int var17 = class44.field854[arg0];
                    int var18 = class44.field843[arg0];
                    short var19 = this.field748;
                    short var20 = this.field762;
                    int var21 = -var19 / 2;
                    int var22 = -var20 / 2;
                    int var23 = var18 * var22 + -(var17 * var21) >> 16;
                    int var24 = var17 * var22 - -(var18 * var21) >> 16;
                    int var25 = class206.method1360(class66.field1287, super.field3889 + var24, (byte) 40, super.field3854 + var23);
                    int var26 = -var20 / 2;
                    int var27 = var19 / 2;
                    int var28 = var17 * var26 + var18 * var27 >> 16;
                    int var29 = var18 * var26 - var17 * var27 >> 16;
                    int var30 = class206.method1360(class66.field1287, super.field3889 + var28, (byte) 40, super.field3854 + var29);
                    int var31 = -var19 / 2;
                    int var32 = var20 / 2;
                    int var33 = var18 * var32 + -(var17 * var31) >> 16;
                    int var34 = var17 * var32 + var18 * var31 >> 16;
                    int var35 = class206.method1360(class66.field1287, super.field3889 + var34, (byte) 40, super.field3854 - -var33);
                    int var36 = var19 / 2;
                    int var37 = var20 / 2;
                    int var38 = var17 * var37 + var18 * var36 >> 16;
                    int var39 = var18 * var37 + -(var17 * var36) >> 16;
                    int var40 = var25 >= var30 ? var30 : var25;
                    int var41 = class206.method1360(class66.field1287, super.field3889 + var38, (byte) 40, super.field3854 + var39);
                    int var42 = var25 + var41;
                    int var43 = var41 > var35 ? var35 : var41;
                    if (~(var30 + var35) > ~var42) {
                        var42 = var30 - -var35;
                    }
                    int var44 = ~var30 <= ~var41 ? var41 : var30;
                    int var45 = var25 < var35 ? var25 : var35;
                    var14 = 2047 & (int) (Math.atan2((double) (-var43 + var40), (double) var20) * 325.95D);
                    if (~var14 != -1) {
                        var13.method378(var14);
                    }
                    var15 = (int) (Math.atan2((double) (-var44 + var45), (double) var19) * 325.95D) & 2047;
                    if (var15 != 0) {
                        var13.method380(var15);
                    }
                    var16 = (var42 >> 1) + -super.field3864;
                    if (var16 != 0) {
                        var13.method384(0, var16, 0);
                    }
                }
                class56 var46 = null;
                if (!this.field759 && ~super.field3827 != 0 && ~super.field3883 != 0) {
                    class107 var47 = class111.method730(super.field3827, -62);
                    var46 = var47.method708(13557, super.field3883);
                    if (var46 != null) {
                        var46.method384(0, -super.field3829, 0);
                        if (var47.field2058) {
                            if (~var14 != -1) {
                                var46.method378(var14);
                            }
                            if (var15 != 0) {
                                var46.method380(var15);
                            }
                            if (~var16 != -1) {
                                var46.method384(0, var16, 0);
                            }
                        }
                    }
                }
                class56 var48 = null;
                if (!this.field759 && this.field756 != null) {
                    if (class20.field344 >= this.field746) {
                        this.field756 = null;
                    }
                    if (class20.field344 >= this.field753 && class20.field344 < this.field746) {
                        var48 = this.field756;
                        var48.method384(-super.field3889 + this.field764, -super.field3864 + this.field751, -super.field3854 + this.field766);
                        if (super.field3833 == 512) {
                            var48.method374();
                        } else if (~super.field3833 == -1025) {
                            var48.method382();
                        } else if (super.field3833 == 1536) {
                            var48.method379();
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class75) var13).method519(var46);
                }
                if (var48 != null) {
                    var13 = ((class75) var13).method519(var48);
                }
                var13.field1092 = true;
                var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var48 != null) {
                    if (~super.field3833 != -513) {
                        if (super.field3833 == 1024) {
                            var48.method382();
                        } else if (~super.field3833 == -1537) {
                            var48.method374();
                        }
                    } else {
                        var48.method379();
                    }
                    var48.method384(super.field3889 - this.field764, -this.field751 + super.field3864, -this.field766 + super.field3854);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILog;)V")
    public final void method254(int arg0, class146 arg1) {
        arg1.field2865 = 0;
        if (arg0 != -25014) {
            this.field771 = 65;
        }
        ++field772;
        int var3 = arg1.method991(arg0 ^ -24907);
        if (~(var3 & 2) == -3) {
            this.field748 = (short) (arg1.method991(255) << 2);
            this.field762 = (short) (arg1.method991(arg0 + 25269) << 2);
        } else {
            this.field762 = 0;
            this.field748 = 0;
        }
        boolean var4 = ~(var3 & 4) != -1;
        int[] var5 = new int[12];
        int var6 = 1 & var3;
        int var7 = -1;
        super.field3871 = (var3 >> 3) + 1;
        this.field769 = arg1.method1000(1064893128);
        this.field750 = arg1.method1000(1064893128);
        this.field775 = 0;
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg1.method991(255);
            if (~var9 == -1) {
                var5[var8] = 0;
            } else {
                int var10 = arg1.method991(255);
                int var11 = (var9 << 8) + var10;
                if (~var8 == -1 && ~var11 == -65536) {
                    var7 = arg1.method1007(93);
                    break;
                }
                if (var11 >= 32768) {
                    int var15 = class107.field2069[var11 - 32768];
                    var5[var8] = class57.method389(1073741824, var15);
                    int var16 = class96.method645((byte) -61, var15).field981;
                    if (~var16 != -1) {
                        this.field775 = var16;
                    }
                } else {
                    var5[var8] = class57.method389(Integer.MIN_VALUE, var11 + -256);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; ~var13 > -6; ++var13) {
            int var14 = arg1.method991(arg0 + 25269);
            if (var14 < 0 || ~class110.field2121[var13].length >= ~var14) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field3874 = arg1.method1007(99);
        if (super.field3874 == 65535) {
            super.field3874 = -1;
        }
        super.field3882 = arg1.method1007(82);
        if (~super.field3882 == -65536) {
            super.field3882 = -1;
        }
        super.field3830 = super.field3882;
        super.field3837 = arg1.method1007(arg0 ^ -25081);
        if (super.field3837 == 65535) {
            super.field3837 = -1;
        }
        super.field3859 = arg1.method1007(77);
        if (super.field3859 == 65535) {
            super.field3859 = -1;
        }
        super.field3860 = arg1.method1007(82);
        if (super.field3860 == 65535) {
            super.field3860 = -1;
        }
        super.field3848 = arg1.method1007(101);
        if (~super.field3848 == -65536) {
            super.field3848 = -1;
        }
        super.field3858 = arg1.method1007(44);
        if (~super.field3858 == -65536) {
            super.field3858 = -1;
        }
        this.field773 = class206.method1361(arg1.method977(arg0 ^ -516515414), 0).method898(83);
        this.field767 = arg1.method991(255);
        if (!var4) {
            this.field755 = 0;
        } else {
            this.field755 = arg1.method1007(arg0 + 25122);
        }
        if (this.field765 == null) {
            this.field765 = new class73();
        }
        this.field765.method508(var12, var5, var7, 0, ~var6 == -2);
    }
}

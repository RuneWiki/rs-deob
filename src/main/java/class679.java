import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class679 extends class515 {

    @OriginalMember(owner = "client!wq", name = "Tc", descriptor = "I")
    public int field9421 = 1;

    @OriginalMember(owner = "client!wq", name = "ad", descriptor = "I")
    public int field9428 = 1;

    @OriginalMember(owner = "client!wq", name = "nd", descriptor = "I")
    public int field9441 = -1;

    @OriginalMember(owner = "client!wq", name = "ud", descriptor = "I")
    public int field9448 = -1;

    @OriginalMember(owner = "client!wq", name = "gd", descriptor = "Lgw;")
    public static class690 field9434 = new class690(8);

    @OriginalMember(owner = "client!wq", name = "qd", descriptor = "[S")
    public static short[] field9444 = new short[256];

    @OriginalMember(owner = "client!wq", name = "vd", descriptor = "F")
    public static float field9449 = 0.0F;

    @OriginalMember(owner = "client!wq", name = "Qc", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!wq", name = "Rc", descriptor = "I")
    public int field9419;

    @OriginalMember(owner = "client!wq", name = "Sc", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!wq", name = "Uc", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!wq", name = "Vc", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!wq", name = "Wc", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!wq", name = "Zc", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!wq", name = "bd", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!wq", name = "cd", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!wq", name = "dd", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!wq", name = "ed", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!wq", name = "fd", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!wq", name = "hd", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!wq", name = "jd", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!wq", name = "kd", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!wq", name = "ld", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!wq", name = "md", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!wq", name = "od", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!wq", name = "rd", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!wq", name = "td", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!wq", name = "id", descriptor = "Lsk;")
    public class123 field9436;

    @OriginalMember(owner = "client!wq", name = "sd", descriptor = "Lcu;")
    public static class203 field9446;

    @OriginalMember(owner = "client!wq", name = "pd", descriptor = "Lew;")
    public class688 field9443;

    @OriginalMember(owner = "client!wq", name = "Xc", descriptor = "Ljava/lang/String;")
    public String field9425;

    @OriginalMember(owner = "client!wq", name = "Yc", descriptor = "[[Z")
    public static boolean[][] field9426;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(Lha;B)Liha;")
    public final class613 method653(class548 arg0, byte arg1) {
        if (arg1 != 13) {
            this.method644(-33, (class548) null, 100, (byte) 45);
        }
        ++field9435;
        return null;
    }

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "(I)I")
    public final int method2058(int arg0) {
        ++field9440;
        if (arg0 != 0) {
            this.method2058(4);
        }
        return this.field9436 == null ? 0 : this.field9436.field1639;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(CI)C")
    public static final char method3818(char arg0, int arg1) {
        ++field9422;
        if (arg0 == 198) {
            return 'E';
        } else if (~arg0 == -231) {
            return 'e';
        } else if (~arg0 == -224) {
            return 's';
        } else if (~arg0 == -339) {
            return 'E';
        } else if (arg0 == 339) {
            return 'e';
        } else {
            if (arg1 >= -85) {
                field9449 = -2.0263484F;
            }
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lha;II)Z")
    private final boolean method3819(class548 arg0, int arg1, int arg2) {
        ++field9438;
        int var4 = arg2;
        class32 var5 = this.method3084((byte) -92);
        class57 var6 = super.field7132 != -1 && super.field7170 == 0 ? class607.field8188.method3001(-12575, super.field7132) : null;
        class57 var7 = super.field7159 == -1 || super.field7165 && var6 != null ? null : class607.field8188.method3001(arg1 ^ -12575, super.field7159);
        int var8 = var5.field388;
        int var9 = var5.field424;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field402 != -1 || var5.field386 != 0) {
            arg2 |= 7;
        }
        boolean var10 = super.field7145 != 0 && ~super.field7154 >= ~class483.field6741 && ~super.field7120 < ~class483.field6741;
        if (var10) {
            arg2 |= 524288;
        }
        int var11 = super.field7125.method168(false);
        class284 var12 = super.field7194[0] = this.field9436.method767(var6, super.field7111, true, var11, super.field7151, class464.field6461, super.field7135, super.field7177, super.field7128, arg2, super.field7127, class607.field8188, class124.field1712, arg0, super.field7131, var7, this.field9443, super.field7164);
        if (var12 == null) {
            return false;
        } else {
            super.field7167 = var12.method1668();
            super.field7186 = var12.method1697();
            this.method3079(true, var12);
            if (arg1 == var8 && ~var9 == -1) {
                this.method3080(0, var11, this.method662((byte) 15) << 9, 0, arg1 + -25223, this.method662((byte) 15) << 9);
            } else {
                this.method3080(var5.field413, var11, var9, var5.field426, -25223, var8);
                if (super.field7158 != 0) {
                    super.field7194[0].method1694(super.field7158);
                }
                if (~super.field7176 != -1) {
                    super.field7194[0].method1690(super.field7176);
                }
                if (super.field7146 != 0) {
                    super.field7194[0].method1672(0, super.field7146, 0);
                }
            }
            if (var10) {
                var12.method1700(super.field7157, super.field7104, super.field7163, 255 & super.field7145);
            }
            this.method3076(var8, var4, var5, var11, arg0, (byte) -94, var9);
            return true;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Z")
    public final boolean method3820(int arg0) {
        ++field9431;
        if (arg0 > -19) {
            this.field9428 = -88;
        }
        return this.field9436 != null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lha;I)Lua;")
    public final class3 method660(class548 arg0, int arg1) {
        ++field9424;
        if (this.field9436 != null && this.method3819(arg0, 0, 2048)) {
            class744 var3 = arg0.method1404();
            int var4 = super.field7125.method168(false);
            var3.method895(var4);
            class262 var5 = class137.field1948[super.field4408][super.field4410 >> class371.field5241][super.field4418 >> class371.field5241];
            if (var5 != null && var5.field3844 != null) {
                int var6 = -var5.field3844.field6133 + super.field7108;
                super.field7108 = (int) ((float) super.field7108 - (float) var6 / 10.0F);
            } else {
                super.field7108 = (int) ((float) super.field7108 - (float) super.field7108 / 10.0F);
            }
            var3.method882(super.field4410, super.field4413 + -20 + -super.field7108, super.field4418);
            class32 var7 = this.method3084((byte) -92);
            class123 var8 = this.field9436.field1700 == null ? this.field9436 : this.field9436.method773(class124.field1712, false);
            super.field7200 = false;
            class3 var9 = null;
            if (class332.field4707.field4757.method2151(0) == 1 && var8.field1629 && var7.field405) {
                class57 var10 = ~super.field7132 != 0 && ~super.field7170 == -1 ? class607.field8188.method3001(-12575, super.field7132) : null;
                class57 var11 = ~super.field7159 == 0 || super.field7165 && var10 != null ? null : class607.field8188.method3001(-12575, super.field7159);
                class284 var12 = class259.method1752(super.field7176, 255 & this.field9436.field1626, super.field7146, var4, var11 != null ? var11 : var10, -87, var11 == null ? super.field7127 : super.field7135, 65535 & this.field9436.field1652, super.field7194[0], this.field9436.field1656, 255 & this.field9436.field1682, super.field7158, arg0, 65535 & this.field9436.field1675);
                if (var12 != null) {
                    var9 = class682.method3841(super.field7194.length + 1, this.method3821(-80), arg1 + 28390);
                    super.field7200 = true;
                    arg0.method1529(false);
                    if (!class301.field4261) {
                        var12.method1686(var3, var9.field18[super.field7194.length], 0);
                    } else {
                        var12.method1682(var3, var9.field18[super.field7194.length], class3.field30, 0);
                    }
                    arg0.method1529(true);
                }
            }
            var3.method895(var4);
            var3.method882(super.field4410, -super.field7108 + super.field4413 + -5, super.field4418);
            if (var9 == null) {
                var9 = class682.method3841(super.field7194.length, this.method3821(-19), 28389);
            }
            this.method3075(arg0, super.field7194, false, 0, var3);
            if (class301.field4261) {
                for (int var13 = 0; super.field7194.length > var13; ++var13) {
                    if (super.field7194[var13] != null) {
                        super.field7194[var13].method1682(var3, var9.field18[var13], class3.field30, 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field7194.length; ++var14) {
                    if (super.field7194[var14] != null) {
                        super.field7194[var14].method1686(var3, var9.field18[var14], 0);
                    }
                }
            }
            if (super.field7202 != null) {
                class100 var15 = super.field7202.method3895();
                if (!class301.field4261) {
                    arg0.method1413(var15);
                } else {
                    arg0.method1479(var15, class3.field30);
                }
            }
            if (arg1 != -1) {
                this.method649((byte) -55);
            }
            for (int var16 = 0; var16 < super.field7194.length; ++var16) {
                if (super.field7194[var16] != null) {
                    super.field7200 |= super.field7194[var16].method1673();
                }
            }
            super.field7194[0] = super.field7194[1] = super.field7194[2] = null;
            super.field7156 = class428.field5973;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLha;)V")
    public final void method659(boolean arg0, class548 arg1) {
        ++field9437;
        if (this.field9436 != null) {
            if (super.field7196 || this.method3819(arg1, 0, 0)) {
                class744 var3 = arg1.method1404();
                if (!arg0) {
                    var3.method895(super.field7125.method168(arg0));
                    var3.method882(super.field4410, super.field4413 + -20, super.field4418);
                    this.method3075(arg1, super.field7194, super.field7196, 0, var3);
                    super.field7194[0] = super.field7194[1] = super.field7194[2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILha;IB)Z")
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field9442;
        if (this.field9436 != null && this.method3819(arg1, 0, 131072)) {
            if (arg3 > -58) {
                this.method659(false, (class548) null);
            }
            class744 var5 = arg1.method1404();
            int var6 = super.field7125.method168(false);
            var5.method895(var6);
            var5.method882(super.field4410, super.field4413, super.field4418);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field7194.length; ++var8) {
                if (super.field7194[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (~this.field9436.field1639 >= -1) {
                            label45: {
                                if (~this.field9436.field1693 == 0) {
                                    if (~this.field9436.field1656 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field9436.field1693 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label47;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class301.field4261) {
                        var10 = super.field7194[var8].method1669(arg0, arg2, var5, var9, this.field9436.field1639);
                    } else {
                        var10 = super.field7194[var8].method1653(arg0, arg2, var5, var9, this.field9436.field1639, class3.field30);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field7194[0] = super.field7194[1] = super.field7194[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "(B)I")
    public final int method649(byte arg0) {
        int var2 = -110 / ((-47 - arg0) / 45);
        ++field9432;
        if (this.field9436.field1700 != null) {
            class123 var3 = this.field9436.method773(class124.field1712, false);
            if (var3 != null && var3.field1686 != -1) {
                return var3.field1686;
            }
        }
        return this.field9436.field1686;
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)Z")
    private final boolean method3821(int arg0) {
        if (arg0 >= -5) {
            return true;
        } else {
            ++field9427;
            return this.field9436.field1647;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)Z")
    public static final boolean method3822(byte arg0, int arg1, int arg2) {
        if (arg0 != 118) {
            field9434 = null;
        }
        ++field9445;
        return class35.method189(true, arg1, arg2) | (arg2 & 458752) != 0 || class639.method3568((byte) 102, arg1, arg2);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)I")
    public final int method3085(int arg0) {
        ++field9439;
        int var2 = 40 / ((arg0 - 52) / 33);
        if (this.field9436.field1700 != null) {
            class123 var3 = this.field9436.method773(class124.field1712, false);
            if (var3 != null && var3.field1663 != -1) {
                return var3.field1663;
            }
        }
        return this.field9436.field1663 == -1 ? super.method3085(-88) : this.field9436.field1663;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
    public final void method3823(int arg0, int arg1, int arg2) {
        ++field9423;
        if (arg1 != 524288) {
            this.method642((byte) -73);
        }
        int var4 = super.field7197[0];
        int var5 = super.field7198[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var4;
            ++var5;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (~arg2 == -6) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~super.field7132 != 0 && ~class607.field8188.method3001(-12575, super.field7132).field797 == -2) {
            super.field7105 = null;
            super.field7132 = -1;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        for (int var6 = 0; ~var6 > ~super.field7190.length; ++var6) {
            if (super.field7190[var6].field7339 != -1) {
                class46 var8 = class129.field1776.method4073(arg1 ^ -531716, super.field7190[var6].field7339);
                if (var8.field592 && var8.field596 != -1 && ~class607.field8188.method3001(-12575, var8.field596).field797 == -2) {
                    super.field7190[var6].field7339 = -1;
                }
            }
        }
        if (~super.field7203 > -10) {
            ++super.field7203;
        }
        for (int var7 = super.field7203; ~var7 < -1; --var7) {
            super.field7197[var7] = super.field7197[var7 + -1];
            super.field7198[var7] = super.field7198[var7 + -1];
            super.field7195[var7] = super.field7195[var7 + -1];
        }
        super.field7197[0] = var4;
        super.field7195[0] = (byte) arg0;
        super.field7198[0] = var5;
    }

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "(I)V")
    public final void method641(int arg0) {
        if (arg0 >= 91) {
            ++field9430;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)I")
    public final int method654(boolean arg0) {
        ++field9447;
        if (arg0) {
            return -3;
        } else {
            if (this.field9436.field1700 != null) {
                class123 var2 = this.field9436.method773(class124.field1712, false);
                if (var2 != null && var2.field1661 != -1) {
                    return var2.field1661;
                }
            }
            return this.field9436.field1661;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Z")
    public final boolean method642(byte arg0) {
        ++field9418;
        if (arg0 != 2) {
            this.method648((byte) -75, (class548) null, false, 87, (class318) null, 44, -68);
        }
        return false;
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(Z)V")
    public static void method3824(boolean arg0) {
        field9444 = null;
        field9426 = null;
        if (arg0) {
            field9446 = null;
        }
        field9434 = null;
        field9446 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLha;ZILuq;II)V")
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        ++field9433;
        if (arg0 > -8) {
            this.field9441 = -76;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIZII)V")
    public final void method3825(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        super.field4408 = super.field4419 = (byte) arg0;
        ++field9429;
        if (class479.method2918(arg2, true, arg5)) {
            ++super.field4419;
        }
        if (~super.field7132 != 0 && class607.field8188.method3001(-12575, super.field7132).field797 == 1) {
            super.field7132 = -1;
            super.field7105 = null;
        }
        for (int var7 = 0; ~var7 > ~super.field7190.length; ++var7) {
            if (super.field7190[var7].field7339 != -1) {
                class46 var11 = class129.field1776.method4073(arg4 + 321, super.field7190[var7].field7339);
                if (var11.field592 && ~var11.field596 != 0 && class607.field8188.method3001(-12575, var11.field596).field797 == 1) {
                    super.field7190[var7].field7339 = -1;
                }
            }
        }
        if (!arg3) {
            int var8 = -super.field7197[0] + arg5;
            int var9 = arg2 - super.field7198[0];
            if (~var8 <= 7 && var8 <= 8 && ~var9 <= 7 && var9 <= 8) {
                if (~super.field7203 > -10) {
                    ++super.field7203;
                }
                for (int var10 = super.field7203; ~var10 < -1; --var10) {
                    super.field7197[var10] = super.field7197[var10 + -1];
                    super.field7198[var10] = super.field7198[var10 - 1];
                    super.field7195[var10] = super.field7195[var10 + -1];
                }
                super.field7197[0] = arg5;
                super.field7198[0] = arg2;
                super.field7195[0] = 1;
                return;
            }
        }
        super.field7199 = 0;
        super.field7197[0] = arg5;
        super.field7201 = 0;
        super.field7203 = 0;
        if (arg4 != -7749) {
            this.method642((byte) 46);
        }
        super.field7198[0] = arg2;
        super.field4410 = (super.field7197[0] << 9) + (arg1 << 8);
        super.field4418 = (super.field7198[0] << 9) - -(arg1 << 8);
        if (super.field7202 != null) {
            super.field7202.method3883();
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lsk;I)V")
    public final void method3826(class123 arg0, int arg1) {
        if (arg1 == 0) {
            this.field9436 = arg0;
            ++field9420;
            if (this.field9436 != null) {
                this.field9425 = this.field9436.field1691;
                this.field9419 = this.field9436.field1681;
            }
            if (super.field7202 != null) {
                super.field7202.method3883();
            }
        }
    }
}

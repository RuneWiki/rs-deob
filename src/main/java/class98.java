import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class98 extends class390 {

    @OriginalMember(owner = "client!ri", name = "Uc", descriptor = "Ljava/lang/String;")
    public static String field1533 = "flash3:";

    @OriginalMember(owner = "client!ri", name = "Wc", descriptor = "Ljava/lang/String;")
    public static String field1535 = " more options";

    @OriginalMember(owner = "client!ri", name = "bd", descriptor = "Ljava/lang/String;")
    public static String field1540 = "Loading fonts - ";

    @OriginalMember(owner = "client!ri", name = "Qc", descriptor = "Z")
    public static boolean field1529 = false;

    @OriginalMember(owner = "client!ri", name = "id", descriptor = "I")
    public static int field1547 = -1;

    @OriginalMember(owner = "client!ri", name = "Pc", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ri", name = "Rc", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ri", name = "Sc", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ri", name = "Tc", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ri", name = "Vc", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ri", name = "Xc", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ri", name = "Yc", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ri", name = "Zc", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ri", name = "ad", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ri", name = "cd", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ri", name = "dd", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ri", name = "ed", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ri", name = "fd", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ri", name = "hd", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ri", name = "jd", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ri", name = "kd", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ri", name = "gd", descriptor = "Lbh;")
    public class11 field1545;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 5)
    public final void method54(int arg0) {
        if (arg0 == 0) {
            ++field1549;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 17)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        if (arg1 == 47) {
            ++field1534;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIZZ)Ldp;", line = 28)
    public static final class174 method813(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        ++field1548;
        if (arg2 != 1000000) {
            field1533 = null;
        }
        class281 var5 = null;
        if (class423.field6171 != null) {
            var5 = new class281(arg1, class423.field6171, class278.field4174[arg1], 1000000);
        }
        class359.field5121[arg1] = class1.field2.method993(arg1, class334.field4788, -66, var5);
        if (arg4) {
            class359.field5121[arg1].method2398((byte) 103);
        }
        return new class174(class359.field5121[arg1], arg3, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLja;)Lkh;", line = 50)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field1542;
        if (this.field1545 != null && this.method821(arg1, 0, 1024)) {
            class202 var3 = arg1.method709();
            int var4 = super.field5623.method603(16383);
            if (arg0 < 90) {
                field1540 = null;
            }
            var3.method1541(var4);
            var3.method1528(super.field6520, super.field6506, super.field6519);
            class419 var5 = this.method2476((byte) 104);
            class11 var6 = this.field1545.field135 != null ? this.field1545.method75(0) : this.field1545;
            if (class451.field6550 && var6.field128 && var5.field6071) {
                class51 var7 = ~super.field5620 != 0 && super.field5647 == 0 ? class113.method974(super.field5620, (byte) -88) : null;
                class51 var8 = super.field5642 == -1 || super.field5661 && var7 != null ? null : class113.method974(super.field5642, (byte) -125);
                class100 var9 = class42.method344((byte) -116, this.field1545.field161 & 255, super.field5704[0], super.field5671, arg1, var8 != null ? var8 : var7, this.field1545.field174, 255 & this.field1545.field169, 65535 & this.field1545.field151, var4, super.field5622, super.field5619, var8 == null ? super.field5687 : super.field5659, this.field1545.field126 & 65535, super.field5607);
                if (var9 != null) {
                    float var10 = arg1.method759();
                    float var11 = arg1.method689();
                    arg1.method676(false);
                    arg1.method693(var10, var11 - 150.0F);
                    var9.method530(var3, (class290) null, 0);
                    arg1.method693(var10, var11);
                    arg1.method676(true);
                }
            }
            class69 var12 = null;
            if (this.method819(false)) {
                var12 = class256.method1849(super.field5704.length, 84);
            }
            if (super.field5703 == null) {
                arg1.method756(super.field5704, var3, var12 != null ? var12.field1128 : null, 0);
            } else {
                class30 var13 = super.field5703.method427();
                arg1.method690(super.field5704, var13, var3, var12 != null ? var12.field1128 : null, 0);
            }
            this.method2472(0, super.field5704, arg1, false);
            if (super.field5704[2] != null) {
                if (var4 != 0) {
                    super.field5704[2].method538(var4);
                }
                super.field5704[2].method523(-super.field5710 + super.field6520, -super.field5697 + super.field6506, super.field6519 - super.field5708);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)I", line = 128)
    public final int method814(byte arg0) {
        ++field1536;
        if (arg0 != -14) {
            field1540 = null;
        }
        if (this.field1545.field135 != null) {
            class11 var2 = this.field1545.method75(0);
            if (var2 != null && ~var2.field167 != 0) {
                return var2.field167;
            }
        }
        return this.field1545.field167;
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V", line = 155)
    public static void method815(int arg0) {
        field1540 = null;
        field1535 = null;
        field1533 = null;
        if (arg0 != -7971) {
            method813(16, -104, 85, false, false);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILja;II)Z", line = 167)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field1543;
        if (this.field1545 != null && this.method821(arg1, 0, 65536)) {
            class202 var5 = arg1.method709();
            int var6 = super.field5623.method603(16383);
            var5.method1541(var6);
            var5.method1527(super.field6520, super.field6506, super.field6519);
            for (int var7 = 0; super.field5704.length > var7; ++var7) {
                if (super.field5704[var7] != null) {
                    return super.field5704[var7].method574(arg3, arg0, var5, ~this.field1545.field174 == -2);
                }
            }
            if (arg2 != 28033) {
                this.method53((byte) 119);
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I", line = 198)
    public final int method816(int arg0) {
        if (arg0 != -1) {
            this.field1545 = null;
        }
        ++field1546;
        if (this.field1545.field135 != null) {
            class11 var2 = this.field1545.method75(~arg0);
            if (var2 != null && var2.field156 != -1) {
                return var2.field156;
            }
        }
        return this.field1545.field156;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Z", line = 226)
    public final boolean method53(byte arg0) {
        ++field1538;
        if (arg0 < 58) {
            this.method819(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILja;)V", line = 239)
    public final void method137(int arg0, class90 arg1) {
        int var3 = 123 % ((arg0 - -31) / 51);
        ++field1530;
        if (this.field1545 != null) {
            if (super.field5691 || this.method821(arg1, 0, 0)) {
                this.method2472(0, super.field5704, arg1, super.field5691);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lbh;I)V", line = 266)
    public final void method817(class11 arg0, int arg1) {
        if (arg1 != 17671) {
            field1547 = 99;
        }
        ++field1544;
        this.field1545 = arg0;
        if (super.field5703 != null) {
            super.field5703.method428();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)I", line = 282)
    public final int method818(int arg0) {
        ++field1531;
        if (arg0 != -31403) {
            return -107;
        } else {
            if (this.field1545.field135 != null) {
                class11 var2 = this.field1545.method75(0);
                if (var2 != null && var2.field146 != -1) {
                    return var2.field146;
                }
            }
            return this.field1545.field146 != -1 ? this.field1545.field146 : super.method818(-31403);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(Z)Z", line = 305)
    private final boolean method819(boolean arg0) {
        if (arg0) {
            this.method53((byte) 91);
        }
        ++field1532;
        return this.field1545.field166;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)I", line = 317)
    public final int method136(int arg0) {
        ++field1537;
        return arg0 != 0 ? 91 : super.field5613;
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)Z", line = 330)
    public final boolean method820(int arg0) {
        ++field1539;
        if (arg0 != -1810533241) {
            this.method53((byte) -16);
        }
        return this.field1545 != null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lja;II)Z", line = 349)
    private final boolean method821(class90 arg0, int arg1, int arg2) {
        ++field1541;
        int var4 = arg2;
        class419 var5 = this.method2476((byte) 74);
        class51 var6 = ~super.field5620 != 0 && ~super.field5647 == -1 ? class113.method974(super.field5620, (byte) -84) : null;
        class51 var7 = super.field5642 == -1 || super.field5661 && var6 != null ? null : class113.method974(super.field5642, (byte) -109);
        int var8 = var5.field6085;
        int var9 = var5.field6083;
        if (var8 != 0 || var9 != 0 || ~var5.field6095 != -1 || var5.field6073 != 0) {
            arg2 |= 7;
        }
        class100 var10 = super.field5704[0] = this.field1545.method66(super.field5648, super.field5659, arg2, arg0, var6, var7, super.field5608, super.field5640, super.field5687, class277.method1976(arg1, 29253), super.field5646, super.field5665);
        if (var10 == null) {
            return false;
        } else {
            super.field5613 = var10.method541();
            this.method2470(var10, -1);
            int var11 = super.field5623.method603(16383);
            super.field5622 = 0;
            super.field5671 = 0;
            super.field5607 = arg1;
            if (~var8 == -1 && ~var9 == -1) {
                this.method2480((byte) 127, this.method1070((byte) -50) << 7, this.method1070((byte) -50) << 7, var11);
            } else {
                this.method2480((byte) 127, var8, var9, var11);
                if (super.field5622 != 0) {
                    super.field5704[0].method543(super.field5622);
                }
                if (~super.field5607 != -1) {
                    super.field5704[0].method519(super.field5607);
                }
                if (~super.field5671 != -1) {
                    super.field5704[0].method523(0, super.field5671, 0);
                }
            }
            super.field5704[1] = null;
            if (super.field5683 != -1 && super.field5630 != -1) {
                class389 var12 = class321.method2140(super.field5683, (byte) 75);
                class100 var13 = var12.method2464(arg0, (!var12.field5577 ? 2 : 7) | var4, super.field5681, super.field5651, super.field5630, arg1 ^ 6677);
                if (var13 != null) {
                    var13.method523(0, -super.field5672, 0);
                    if (var12.field5577 && (~var8 != -1 || ~var9 != -1)) {
                        if (super.field5622 != 0) {
                            var13.method543(super.field5622);
                        }
                        if (super.field5607 != 0) {
                            var13.method519(super.field5607);
                        }
                        if (super.field5671 != 0) {
                            var13.method523(0, super.field5671, 0);
                        }
                    }
                    super.field5704[1] = var13;
                }
            }
            super.field5704[2] = null;
            if (super.field5702 != null) {
                if (~super.field5709 >= ~class267.field4002) {
                    super.field5702 = null;
                }
                if (~super.field5707 >= ~class267.field4002 && super.field5709 > class267.field4002) {
                    class100 var14 = super.field5702.method1025((byte) -84, 7 | var4, arg0);
                    if (var14 != null) {
                        var14.method523(super.field5710 - super.field6520, -super.field6506 + super.field5697, -super.field6519 + super.field5708);
                        if (var11 != 0) {
                            var14.method538(var11);
                        }
                        super.field5704[2] = var14;
                    }
                }
            }
            return true;
        }
    }
}

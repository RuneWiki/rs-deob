import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class109 extends class33 {

    @OriginalMember(owner = "client!hh", name = "Fc", descriptor = "I")
    public int field1673 = -1;

    @OriginalMember(owner = "client!hh", name = "Rc", descriptor = "I")
    public int field1685 = -1;

    @OriginalMember(owner = "client!hh", name = "Pc", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!hh", name = "Tc", descriptor = "Z")
    public static boolean field1687;

    @OriginalMember(owner = "client!hh", name = "yc", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!hh", name = "zc", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!hh", name = "Ac", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!hh", name = "Cc", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!hh", name = "Dc", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!hh", name = "Ec", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!hh", name = "Gc", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!hh", name = "Hc", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!hh", name = "Ic", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!hh", name = "Jc", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!hh", name = "Kc", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!hh", name = "Lc", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!hh", name = "Mc", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!hh", name = "Nc", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!hh", name = "Oc", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!hh", name = "Qc", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!hh", name = "Sc", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!hh", name = "Bc", descriptor = "Lhg;")
    public class593 field1669;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field1674;
        if (this.field1669 != null && this.method766(arg1, 2048, 0)) {
            class163 var3 = arg1.method1344();
            int var4 = super.field579.method1166((byte) 66);
            var3.method1047(var4);
            var3.method1051(super.field6037, super.field6042, super.field6029);
            class107 var5 = this.method349(arg0);
            class593 var6 = this.field1669.field8532 != null ? this.field1669.method3516(class189.field2681, 117) : this.field1669;
            if (class491.field6875.field3365 && var6.field8536 && var5.field1634) {
                class78 var7 = super.field535 != -1 && super.field584 == 0 ? class331.field4418.method195(super.field535, (byte) 13) : null;
                class78 var8 = super.field554 == -1 || super.field567 && var7 != null ? null : class331.field4418.method195(super.field554, (byte) 13);
                int var9 = 0;
                if (super.field543 != 0) {
                    var9 = this.method340(-43);
                }
                class157 var10 = class191.method1188(this.field1669.field8549 & 255, this.field1669.field8539 & 65535, (byte) -127, var8 == null ? super.field539 : super.field594, super.field623[0], var4, var9, 255 & this.field1669.field8540, super.field601, arg1, super.field585, super.field569, this.field1669.field8597, var8 != null ? var8 : var7, 65535 & this.field1669.field8577);
                if (var10 != null) {
                    float var11 = arg1.method1326();
                    float var12 = arg1.method1271();
                    arg1.method1309(false);
                    arg1.method1333(var11, var12 + -150.0F);
                    var10.method154(var3, (class631) null, 0);
                    arg1.method1333(var11, var12);
                    arg1.method1309(true);
                }
            }
            class254 var13 = null;
            if (this.method769((byte) 17)) {
                var13 = class110.method772(1, super.field623.length);
            }
            if (super.field613 == null) {
                arg1.method1360(super.field623, var3, var13 == null ? null : var13.field3525, 0);
            } else {
                class274 var14 = super.field613.method2768();
                arg1.method1288(super.field623, var14, var3, var13 == null ? null : var13.field3525, 0);
            }
            this.method339(false, (byte) 110, arg1, super.field623);
            super.field623[0] = super.field623[1] = super.field623[2] = super.field623[3] = null;
            super.field557 = class143.field2215;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIIII)V")
    public final void method765(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1668;
        super.field6035 = (byte) arg4;
        if (~super.field535 != 0 && ~class331.field4418.method195(super.field535, (byte) 13).field1288 == -2) {
            super.field535 = -1;
        }
        if (super.field556 != -1) {
            class258 var7 = class78.field1263.method1564(super.field556, 5);
            if (var7.field3590 && var7.field3583 != -1 && class331.field4418.method195(var7.field3583, (byte) 13).field1288 == 1) {
                super.field556 = -1;
            }
        }
        if (~super.field523 != 0) {
            class258 var8 = class78.field1263.method1564(super.field523, 5);
            if (var8.field3590 && var8.field3583 != -1 && ~class331.field4418.method195(var8.field3583, (byte) 13).field1288 == -2) {
                super.field523 = -1;
            }
        }
        if (!arg0) {
            int var9 = arg1 - super.field616[0];
            int var10 = arg3 - super.field618[0];
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && var10 <= 8) {
                if (super.field617 < 9) {
                    ++super.field617;
                }
                for (int var11 = super.field617; ~var11 < -1; --var11) {
                    super.field616[var11] = super.field616[var11 - 1];
                    super.field618[var11] = super.field618[var11 + -1];
                    super.field620[var11] = super.field620[var11 + -1];
                }
                super.field616[0] = arg1;
                super.field618[0] = arg3;
                super.field620[0] = 1;
                return;
            }
        }
        if (arg2 > 52) {
            super.field621 = 0;
            super.field616[0] = arg1;
            super.field619 = 0;
            super.field617 = 0;
            super.field618[0] = arg3;
            super.field6029 = (super.field618[0] << 7) - -(arg5 << 6);
            super.field6037 = (super.field616[0] << 7) - -(arg5 << 6);
            if (super.field613 != null) {
                super.field613.method2756();
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)I")
    public final int method347(byte arg0) {
        ++field1666;
        if (arg0 != 108) {
            field1683 = 61;
        }
        if (this.field1669.field8532 != null) {
            class593 var2 = this.field1669.method3516(class189.field2681, 96);
            if (var2 != null && ~var2.field8551 != 0) {
                return var2.field8551;
            }
        }
        return this.field1669.field8551;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        ++field1670;
        if (this.field1669 != null && this.method766(arg0, 131072, 0)) {
            class163 var5 = arg0.method1344();
            int var6 = super.field579.method1166((byte) -55);
            var5.method1047(var6);
            var5.method1051(super.field6037, super.field6042, super.field6029);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field623.length; ++var8) {
                if (super.field623[var8] != null && super.field623[var8].method143(arg1, arg2, var5, this.field1669.field8597 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field623[0] = super.field623[arg3] = super.field623[2] = super.field623[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)I")
    public final int method492(int arg0) {
        if (arg0 != 0) {
            field1683 = 36;
        }
        ++field1686;
        return super.field597;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            this.field1673 = 107;
        }
        ++field1681;
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lqa;II)Z")
    private final boolean method766(class207 arg0, int arg1, int arg2) {
        ++field1675;
        int var4 = arg1;
        class107 var5 = this.method349(true);
        class78 var6 = super.field535 != -1 && super.field584 == 0 ? class331.field4418.method195(super.field535, (byte) 13) : null;
        class78 var7 = super.field554 == -1 || super.field567 && var6 != null ? null : class331.field4418.method195(super.field554, (byte) 13);
        int var8 = var5.field1633;
        int var9 = var5.field1648;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field1609 != -1 || var5.field1656 != 0) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field572 != -1 && class405.field5763 >= super.field536 && super.field609 > class405.field5763;
        if (var10) {
            arg1 |= 524288;
        }
        class157 var11 = super.field623[0] = this.field1669.method3511(arg0, super.field539, super.field594, var7, class331.field4418, 0, super.field595, super.field521, var6, class263.field3678, super.field571, super.field566, super.field520, arg1, class189.field2681);
        if (var11 == null) {
            return false;
        } else {
            super.field597 = var11.method133();
            this.method343(0, var11);
            int var12 = super.field579.method1166((byte) -116);
            if (var8 == 0 && ~var9 == -1) {
                this.method345(this.method337(0) << 7, 0, 114, var12, 0, this.method337(0) << 7);
            } else {
                this.method345(var9, var5.field1615, 125, var12, var5.field1639, var8);
                if (~super.field601 != -1) {
                    super.field623[0].method155(super.field601);
                }
                if (super.field585 != 0) {
                    super.field623[0].method141(super.field585);
                }
                if (~super.field569 != -1) {
                    super.field623[0].method152(0, super.field569, 0);
                }
            }
            if (var10) {
                var11.method129(super.field604, super.field599, super.field580, 255 & super.field572);
            }
            if (~super.field556 != arg2 && super.field542 != -1) {
                class258 var13 = class78.field1263.method1564(super.field556, 5);
                boolean var14 = var13.field3579 == 3 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field605 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field590 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class157 var16 = super.field623[1] = var13.method1658((byte) -32, super.field527, var15, super.field542, class331.field4418, arg0, super.field600);
                if (var16 != null) {
                    if (~super.field590 != -1) {
                        var16.method152(0, -super.field590 << 0, 0);
                    }
                    if (~super.field605 != -1) {
                        var16.method140(super.field605 * 2048);
                    }
                    if (var14) {
                        if (super.field601 != 0) {
                            var16.method155(super.field601);
                        }
                        if (super.field585 != 0) {
                            var16.method141(super.field585);
                        }
                        if (super.field569 != 0) {
                            var16.method152(0, super.field569, 0);
                        }
                    }
                }
            } else {
                super.field623[1] = null;
            }
            if (~super.field523 != 0 && ~super.field537 != 0) {
                class258 var17 = class78.field1263.method1564(super.field523, 5);
                boolean var18 = ~var17.field3579 == -4 && (var8 != 0 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field533 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field591 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class157 var20 = super.field623[3] = var17.method1657(super.field537, arg0, 31570, var19, super.field589, class331.field4418, super.field531);
                if (var20 != null) {
                    if (super.field591 != 0) {
                        var20.method152(0, -super.field591 << 0, 0);
                    }
                    if (super.field533 != 0) {
                        var20.method140(super.field533 * 2048);
                    }
                    if (var18) {
                        if (super.field601 != 0) {
                            var20.method155(super.field601);
                        }
                        if (super.field585 != 0) {
                            var20.method141(super.field585);
                        }
                        if (~super.field569 != -1) {
                            var20.method152(0, super.field569, 0);
                        }
                    }
                }
            } else {
                super.field623[3] = null;
            }
            super.field623[2] = null;
            if (super.field615 != null) {
                if (super.field615.field4488 > class405.field5763) {
                    if (~super.field615.field4478 >= ~class405.field5763) {
                        class157 var21 = super.field615.method2039(arg0, (byte) 0, 7 | var4);
                        if (var21 != null) {
                            var21.method152(-super.field6037 + super.field615.field4490, super.field615.field4484 - super.field6042, super.field615.field4480 - super.field6029);
                            if (~var12 != -1) {
                                var21.method140(var12);
                            }
                            super.field623[2] = var21;
                        }
                    }
                } else {
                    super.field615 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "(I)Z")
    public final boolean method767(int arg0) {
        ++field1671;
        if (this.field1669 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                field1683 = 94;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field1682;
        if (this.field1669 != null) {
            if (super.field622 || this.method766(arg0, 0, arg1 + -21)) {
                this.method339(super.field622, (byte) 113, arg0, super.field623);
                if (arg1 != 21) {
                    this.method490(true, (class207) null);
                }
                super.field623[0] = super.field623[1] = super.field623[2] = super.field623[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 != -1) {
            this.method488((class207) null, 65, 66, -114);
        }
        ++field1667;
        if (this.field1669.field8532 != null) {
            class593 var2 = this.field1669.method3516(class189.field2681, 102);
            if (var2 != null && ~var2.field8537 != 0) {
                return var2.field8537;
            }
        }
        return this.field1669.field8537 != -1 ? this.field1669.field8537 : super.method344(-1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (arg0) {
            return null;
        } else {
            ++field1680;
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)V")
    public final void method768(byte arg0, int arg1, int arg2) {
        ++field1676;
        int var4 = super.field616[0];
        int var5 = super.field618[0];
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
        if (~arg2 == -4) {
            --var5;
            ++var4;
        }
        if (arg2 == 4) {
            --var5;
        }
        if (arg0 < 38) {
            this.method347((byte) 73);
        }
        if (~arg2 == -6) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (super.field535 != -1 && class331.field4418.method195(super.field535, (byte) 13).field1288 == 1) {
            super.field535 = -1;
        }
        if (arg2 == 7) {
            ++var5;
            --var4;
        }
        if (super.field556 != -1) {
            class258 var6 = class78.field1263.method1564(super.field556, 5);
            if (var6.field3590 && ~var6.field3583 != 0 && class331.field4418.method195(var6.field3583, (byte) 13).field1288 == 1) {
                super.field556 = -1;
            }
        }
        if (~super.field523 != 0) {
            class258 var7 = class78.field1263.method1564(super.field523, 5);
            if (var7.field3590 && ~var7.field3583 != 0 && class331.field4418.method195(var7.field3583, (byte) 13).field1288 == 1) {
                super.field523 = -1;
            }
        }
        if (super.field617 < 9) {
            ++super.field617;
        }
        for (int var8 = super.field617; var8 > 0; --var8) {
            super.field616[var8] = super.field616[var8 - 1];
            super.field618[var8] = super.field618[var8 + -1];
            super.field620[var8] = super.field620[var8 - 1];
        }
        super.field616[0] = var4;
        super.field620[0] = (byte) arg1;
        super.field618[0] = var5;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field1672;
        if (arg0 != 1) {
            this.method487((class207) null, (byte) 97);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)Z")
    private final boolean method769(byte arg0) {
        ++field1679;
        if (arg0 != 17) {
            this.method336(14);
        }
        return this.field1669.field8541;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
    public final int method336(int arg0) {
        if (arg0 != -2102190848) {
            this.method344(-112);
        }
        ++field1677;
        if (this.field1669.field8532 != null) {
            class593 var2 = this.field1669.method3516(class189.field2681, 126);
            if (var2 != null && var2.field8556 != -1) {
                return var2.field8556;
            }
        }
        return this.field1669.field8556;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        ++field1684;
        if (arg2 < 79) {
            field1683 = 66;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lhg;Z)V")
    public final void method770(class593 arg0, boolean arg1) {
        if (!arg1) {
            this.field1673 = -109;
        }
        ++field1678;
        this.field1669 = arg0;
        if (super.field613 != null) {
            super.field613.method2756();
        }
    }

    static {
        new class104("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field1687 = true;
    }
}

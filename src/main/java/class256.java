import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class256 extends class539 implements class602 {

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "Z")
    private boolean field3809;

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "Z")
    private boolean field3813;

    @OriginalMember(owner = "client!bj", name = "jb", descriptor = "Z")
    private boolean field3820;

    @OriginalMember(owner = "client!bj", name = "hb", descriptor = "S")
    private short field3818;

    @OriginalMember(owner = "client!bj", name = "mb", descriptor = "B")
    private byte field3823;

    @OriginalMember(owner = "client!bj", name = "kb", descriptor = "B")
    private byte field3821;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "Z")
    private boolean field3806;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lr;")
    private class195 field3810;

    @OriginalMember(owner = "client!bj", name = "gb", descriptor = "Lka;")
    public class497 field3817;

    @OriginalMember(owner = "client!bj", name = "sb", descriptor = "Lmw;")
    public static class517 field3829 = new class517(23, 3);

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!bj", name = "eb", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!bj", name = "fb", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!bj", name = "ib", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!bj", name = "lb", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!bj", name = "nb", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!bj", name = "ob", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!bj", name = "pb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!bj", name = "qb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!bj", name = "rb", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "Lln;")
    private class398 field3800;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)I", line = 3)
    public final int method767(boolean arg0) {
        ++field3816;
        if (arg0) {
            return -68;
        } else {
            return this.field3817 != null ? this.field3817.method264() : 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)Z", line = 15)
    public final boolean method777(int arg0) {
        ++field3822;
        int var2 = 46 / ((-34 - arg0) / 59);
        return this.field3817 != null ? this.field3817.method272() : false;
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)Z", line = 29)
    public final boolean method769(int arg0) {
        ++field3828;
        if (arg0 >= -70) {
            this.field3823 = 74;
        }
        if (this.field3817 != null) {
            return !this.field3817.method285();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)Z", line = 43)
    public final boolean method126(byte arg0) {
        ++field3819;
        if (arg0 != -34) {
            this.method767(true);
        }
        return this.field3809;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(Lha;B)Lpia;", line = 55)
    public final class104 method114(class66 arg0, byte arg1) {
        ++field3803;
        if (arg1 != 115) {
            field3829 = null;
        }
        if (this.field3817 == null) {
            return null;
        } else {
            class109 var3 = arg0.method475();
            var3.method814(super.field2802, super.field2815, super.field2810);
            class104 var4 = class568.method3241(1, (byte) 47, this.field3813);
            if (!class408.field5786) {
                this.field3817.method254(var3, var4.field1479[0], 0);
            } else {
                this.field3817.method258(var3, var4.field1479[0], class72.field972, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lha;B)V", line = 84)
    public final void method1742(class66 arg0, byte arg1) {
        if (arg1 > 68) {
            ++field3827;
            Object var3 = null;
            class195 var5;
            if (this.field3810 == null && this.field3806) {
                class786 var4 = this.method1746(262144, arg0, true, (byte) 117);
                var5 = var4 == null ? null : var4.field10801;
            } else {
                var5 = this.field3810;
                this.field3810 = null;
            }
            if (var5 != null) {
                class526.method3052(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(B)I", line = 116)
    public final int method1743(byte arg0) {
        if (arg0 >= -90) {
            this.field3809 = true;
        }
        ++field3798;
        return this.field3817 == null ? 15 : this.field3817.method280() / 4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I", line = 128)
    public final int method1744(int arg0) {
        if (arg0 != 21215) {
            return -64;
        } else {
            ++field3802;
            return this.field3821;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 139)
    public final void method1745(boolean arg0) {
        ++field3808;
        if (arg0) {
            if (this.field3817 != null) {
                this.field3817.method274();
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILha;ZB)Lsw;", line = 152)
    private final class786 method1746(int arg0, class66 arg1, boolean arg2, byte arg3) {
        if (arg3 <= 28) {
            return null;
        } else {
            ++field3814;
            class412 var5 = class210.field2705.method1362(0, 65535 & this.field3818);
            class295 var6;
            class295 var7;
            if (!this.field3820) {
                if (~super.field2809 <= -4) {
                    var6 = null;
                } else {
                    var6 = class648.field8748[super.field2809 - -1];
                }
                var7 = class648.field8748[super.field2809];
            } else {
                var7 = class737.field10008[super.field2809];
                var6 = class648.field8748[0];
            }
            return var5.method2475(super.field2802, var6, ~this.field3823 == -12 ? 10 : this.field3823, arg0, arg2, arg1, (byte) -64, var7, (class711) null, super.field2815, this.field3823 == 11 ? 4 - -this.field3821 : this.field3821, super.field2810);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Z", line = 182)
    public final boolean method1747(byte arg0) {
        ++field3824;
        int var2 = -121 / ((arg0 - -41) / 60);
        return this.field3806;
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)V", line = 193)
    public final void method127(int arg0) {
        if (arg0 != -13127) {
            this.method1750(13);
        }
        ++field3811;
        this.field3809 = false;
        if (this.field3817 != null) {
            this.field3817.method270(-65537 & this.field3817.method260());
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I", line = 209)
    public final int method1748(int arg0) {
        if (arg0 != 5875) {
            this.method1745(true);
        }
        ++field3799;
        return this.field3818 & 65535;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)I", line = 224)
    public final int method774(byte arg0) {
        if (arg0 != 115) {
            this.method1751(-49, (class66) null, -69);
        }
        ++field3804;
        return this.field3817 != null ? this.field3817.method265() : 0;
    }

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "(I)V", line = 235)
    public static void method1749(int arg0) {
        field3829 = null;
        if (arg0 != 0) {
            method1749(-53);
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(Lha;B)Lln;", line = 245)
    public final class398 method119(class66 arg0, byte arg1) {
        if (this.field3800 == null) {
            this.field3800 = class122.method882(this.method1751(110, arg0, 0), super.field2810, super.field2802, super.field2815, -121);
        }
        if (arg1 >= -35) {
            return null;
        } else {
            ++field3826;
            return this.field3800;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lha;Llp;IIIIIZIIIIIIZ)V", line = 261)
    public class256(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5856 == -2, class237.method1503(arg12, arg13, -23));
        this.field3809 = arg14;
        this.field3813 = arg1.field5905 != 0 && !arg7;
        this.field3820 = arg7;
        this.field3818 = (short) arg1.field5850;
        this.field3823 = (byte) arg12;
        super.field2809 = (byte) arg3;
        this.field3821 = (byte) arg13;
        this.field3806 = arg0.method538() && arg1.field5927 && !this.field3820 && ~class125.field1721.field5156.method159(43) != -1;
        int var16 = 2048;
        if (this.field3809) {
            var16 |= 65536;
        }
        class786 var17 = this.method1746(var16, arg0, this.field3806, (byte) 100);
        if (var17 != null) {
            this.field3810 = var17.field10801;
            this.field3817 = var17.field10802;
            if (this.field3809) {
                this.field3817 = this.field3817.method271((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILha;II)Z", line = 295)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        if (arg2 != 6238) {
            this.field3820 = true;
        }
        ++field3805;
        class497 var5 = this.method1751(97, arg1, 131072);
        if (var5 != null) {
            class109 var6 = arg1.method475();
            var6.method814(super.field2802, super.field2815, super.field2810);
            return class408.field5786 ? var5.method245(arg0, arg3, var6, false, 0, class72.field972) : var5.method248(arg0, arg3, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I", line = 321)
    public final int method1750(int arg0) {
        ++field3812;
        if (arg0 != 29244) {
            this.field3821 = -10;
        }
        return this.field3823;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILfq;BIILha;Z)V", line = 332)
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        if (!(arg1 instanceof class278)) {
            if (arg1 instanceof class256) {
                class256 var8 = (class256) arg1;
                if (this.field3817 != null && var8.field3817 != null) {
                    this.field3817.method287(var8.field3817, arg3, arg0, arg4, arg6);
                }
            }
        } else {
            class278 var9 = (class278) arg1;
            if (this.field3817 != null && var9.field4016 != null) {
                this.field3817.method287(var9.field4016, arg3, arg0, arg4, arg6);
            }
        }
        if (arg2 != -103) {
            this.method122(-113, (class66) null, -41, 106);
        }
        ++field3801;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(Lha;B)V", line = 363)
    public final void method131(class66 arg0, byte arg1) {
        if (arg1 != 53) {
            this.method1745(true);
        }
        ++field3825;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILha;I)Lka;", line = 377)
    private final class497 method1751(int arg0, class66 arg1, int arg2) {
        ++field3815;
        if (this.field3817 != null && arg1.method520(this.field3817.method260(), arg2) == 0) {
            return this.field3817;
        } else {
            class786 var4 = this.method1746(arg2, arg1, false, (byte) 81);
            if (arg0 <= 82) {
                field3829 = null;
            }
            return var4 == null ? null : var4.field10802;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Lha;B)V", line = 402)
    public final void method1752(class66 arg0, byte arg1) {
        ++field3807;
        Object var3 = null;
        class195 var5;
        if (this.field3810 == null && this.field3806) {
            class786 var4 = this.method1746(262144, arg0, true, (byte) 33);
            var5 = var4 != null ? var4.field10801 : null;
        } else {
            var5 = this.field3810;
            this.field3810 = null;
        }
        if (var5 != null) {
            class384.method2380(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
        }
        if (arg1 >= -17) {
            this.field3810 = null;
        }
    }
}

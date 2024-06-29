import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class51 extends class56 implements class338 {

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "S")
    private short field777;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "B")
    private byte field782;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Z")
    private boolean field794;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "B")
    private byte field799;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "Z")
    private boolean field804;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "Z")
    private boolean field797;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "B")
    private byte field801;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "Z")
    private boolean field800;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Lc;")
    public class121 field784;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "Lj;")
    private class377 field796;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Lcu;")
    public static class145 field798 = new class145(65, 1);

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "F")
    public static float field807;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqa;Z)V", line = 3)
    public final void method334(class162 arg0, boolean arg1) {
        if (!arg1) {
            this.method337(-64, (class162) null);
        }
        ++field785;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I", line = 13)
    public final int method345(int arg0) {
        ++field783;
        if (arg0 != -1736) {
            method383((byte) -128, (class499) null, (class499) null);
        }
        return this.field801;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 28)
    public final void method342(int arg0) {
        if (this.field784 != null) {
            this.field784.method837();
        }
        int var2 = -89 / ((arg0 - 56) / 52);
        ++field793;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V", line = 42)
    public static void method380(boolean arg0) {
        if (!arg0) {
            method380(false);
        }
        field798 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLqa;I)Lc;", line = 52)
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 != -102) {
            return null;
        } else {
            ++field787;
            return this.method382(arg2, arg1, arg0 + 101);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILqa;I)Z", line = 63)
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field778;
        class121 var5 = this.method382(131072, arg2, arg0);
        if (var5 != null) {
            class414 var6 = arg2.method611();
            var6.method971(super.field879, super.field873, super.field875);
            return var5.method847(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILqa;)V", line = 83)
    public final void method337(int arg0, class162 arg1) {
        ++field791;
        Object var3 = null;
        class377 var5;
        if (this.field796 == null && this.field800) {
            class208 var4 = this.method381(arg1, true, 84, 262144);
            var5 = var4 == null ? null : var4.field2862;
        } else {
            var5 = this.field796;
            this.field796 = null;
        }
        if (arg0 == -7803) {
            if (var5 != null) {
                class382.method2269(var5, this.field799, super.field879, super.field875, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(ILqa;)Lfm;", line = 116)
    public final class514 method339(int arg0, class162 arg1) {
        if (arg0 != 9124) {
            field803 = 112;
        }
        ++field805;
        if (this.field784 == null) {
            return null;
        } else {
            class414 var3 = arg1.method611();
            var3.method971(super.field879, super.field873, super.field875);
            class514 var4 = null;
            if (this.field794) {
                var4 = class148.method1020(0, 1);
            }
            this.field784.method853(var3, var4 == null ? null : var4.field7563[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I", line = 143)
    public final int method344(int arg0) {
        ++field806;
        if (arg0 != -4534) {
            this.field797 = false;
        }
        return this.field782;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILqa;Leq;IIZ)V", line = 157)
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        ++field788;
        if (arg0 != 1) {
            this.method125(false);
        }
        if (arg3 instanceof class51) {
            class51 var8 = (class51) arg3;
            if (this.field784 != null && var8.field784 != null) {
                this.field784.method848(var8.field784, arg4, arg1, arg5, arg6);
            }
        } else {
            if (arg3 instanceof class77) {
                class77 var9 = (class77) arg3;
                if (this.field784 != null && var9.field1137 != null) {
                    this.field784.method848(var9.field1137, arg4, arg1, arg5, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqa;ZII)Len;", line = 189)
    private final class208 method381(class162 arg0, boolean arg1, int arg2, int arg3) {
        ++field795;
        class1 var5 = class402.field5388.method1994(-17294, this.field777 & 65535);
        class35 var6;
        class35 var7;
        if (!this.field797) {
            if (~this.field799 <= -4) {
                var6 = null;
            } else {
                var6 = class209.field2868[this.field799 + 1];
            }
            var7 = class209.field2868[this.field799];
        } else {
            var7 = class37.field582[this.field799];
            var6 = class209.field2868[0];
        }
        if (arg2 < 22) {
            this.method382(110, (class162) null, 87);
        }
        return var5.method19(arg1, this.field801, arg0, super.field875, var7, arg3, 95, var6, super.field879, this.field782, super.field873);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILqa;I)Lc;", line = 221)
    private final class121 method382(int arg0, class162 arg1, int arg2) {
        ++field790;
        if (this.field784 != null && ~arg1.method564(this.field784.method854(), arg0) == -1) {
            return this.field784;
        } else {
            if (arg2 != -1) {
                this.field782 = -80;
            }
            class208 var4 = this.method381(arg1, false, 37, arg0);
            return var4 != null ? var4.field2861 : null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 244)
    public final void method125(boolean arg0) {
        this.field804 = false;
        if (arg0) {
            ++field802;
            if (this.field784 != null) {
                this.field784.method860(-65537 & this.field784.method854());
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLge;Lge;)V", line = 261)
    public static final void method383(byte arg0, class499 arg1, class499 arg2) {
        ++field781;
        if (arg2.field6900 != null) {
            arg2.method2856(0);
        }
        arg2.field6903 = arg1.field6903;
        arg2.field6900 = arg1;
        arg2.field6900.field6903 = arg2;
        arg2.field6903.field6900 = arg2;
        if (arg0 >= -103) {
            method383((byte) -7, (class499) null, (class499) null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lqa;Lus;IIIIZIIZ)V", line = 280)
    public class51(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class118.method812(arg7, -28075, arg8));
        this.field777 = (short) arg1.field33;
        this.field782 = (byte) arg8;
        this.field794 = ~arg1.field83 != -1 && !arg6;
        this.field799 = (byte) arg2;
        this.field804 = arg9;
        this.field797 = arg6;
        this.field801 = (byte) arg7;
        super.field875 = arg5;
        super.field879 = arg3;
        this.field800 = arg0.method557() && arg1.field71 && !this.field797 && ~class154.field2244.method3089((byte) 103, class166.field2414) != -1;
        int var11 = 2048;
        if (this.field804) {
            var11 |= 65536;
        }
        class208 var12 = this.method381(arg0, this.field800, 54, var11);
        if (var12 != null) {
            this.field784 = var12.field2861;
            this.field796 = var12.field2862;
            if (this.field804) {
                this.field784 = this.field784.method863((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I", line = 320)
    public final int method347(byte arg0) {
        if (arg0 != -87) {
            this.method347((byte) 123);
        }
        ++field789;
        return 65535 & this.field777;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqa;I)V", line = 335)
    public final void method340(class162 arg0, int arg1) {
        ++field786;
        if (arg1 != 20203) {
            field798 = null;
        }
        Object var3 = null;
        class377 var5;
        if (this.field796 == null && this.field800) {
            class208 var4 = this.method381(arg0, true, 92, 262144);
            var5 = var4 != null ? var4.field2862 : null;
        } else {
            var5 = this.field796;
            this.field796 = null;
        }
        if (var5 != null) {
            class238.method1477(var5, this.field799, super.field879, super.field875, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Z", line = 367)
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            this.method343(-127, -40, (class162) null, -5);
        }
        ++field779;
        return this.field804;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)Z", line = 381)
    public final boolean method338(int arg0) {
        if (arg0 > -8) {
            method383((byte) -58, (class499) null, (class499) null);
        }
        ++field780;
        return this.field800;
    }
}

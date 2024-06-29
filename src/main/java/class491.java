import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class491 extends class621 implements class238 {

    @OriginalMember(owner = "client!eka", name = "eb", descriptor = "Z")
    private boolean field6836 = false;

    @OriginalMember(owner = "client!eka", name = "rb", descriptor = "Lmw;")
    public class518 field6849;

    @OriginalMember(owner = "client!eka", name = "hb", descriptor = "Z")
    private boolean field6839;

    @OriginalMember(owner = "client!eka", name = "S", descriptor = "I")
    public static int field6824 = 0;

    @OriginalMember(owner = "client!eka", name = "ob", descriptor = "Llf;")
    public static class251 field6846 = new class251(6, 1);

    @OriginalMember(owner = "client!eka", name = "qb", descriptor = "Llja;")
    public static class744 field6848 = new class744(18, 8);

    @OriginalMember(owner = "client!eka", name = "sb", descriptor = "I")
    public static int field6850 = 0;

    @OriginalMember(owner = "client!eka", name = "T", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!eka", name = "U", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!eka", name = "V", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!eka", name = "W", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!eka", name = "X", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!eka", name = "Y", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!eka", name = "Z", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!eka", name = "ab", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!eka", name = "bb", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!eka", name = "cb", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!eka", name = "db", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!eka", name = "fb", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!eka", name = "ib", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!eka", name = "jb", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!eka", name = "kb", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!eka", name = "lb", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!eka", name = "mb", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!eka", name = "nb", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!eka", name = "pb", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!eka", name = "gb", descriptor = "Loba;")
    private class276 field6838;

    @OriginalMember(owner = "client!eka", name = "tb", descriptor = "Lbt;")
    public static class48 field6851;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(IBILha;)Z")
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        if (arg1 <= 19) {
            field6846 = null;
        }
        ++field6825;
        class498 var5 = this.field6849.method3102(131072, false, false, -67, arg3);
        if (var5 == null) {
            return false;
        } else {
            class778 var6 = arg3.method576();
            var6.method130(super.field823, super.field809, super.field813);
            return !class502.field7084 ? var5.method363(arg0, arg2, var6, false, 0) : var5.method379(arg0, arg2, var6, false, 0, class621.field8528);
        }
    }

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "(Lha;I)V")
    public final void method500(class66 arg0, int arg1) {
        ++field6827;
        if (arg1 != -1) {
            this.method501(72, (byte) 33, -42, (class66) null);
        }
        class498 var3 = this.field6849.method3102(262144, true, true, -26, arg0);
        if (var3 != null) {
            int var4 = super.field823 >> 9;
            int var5 = super.field813 >> 9;
            class778 var6 = arg0.method576();
            var6.method130(super.field823, super.field809, super.field813);
            this.field6849.method3109(false, var4, var4, var3, -17230, var5, var6, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lha;I)V")
    public final void method931(class66 arg0, int arg1) {
        this.field6849.method3110(arg0, (byte) 98);
        ++field6841;
        int var3 = 117 / ((28 - arg1) / 63);
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lgt;Z)V")
    public final void method2899(class481 arg0, boolean arg1) {
        this.field6849.method3101(0, arg0);
        ++field6834;
        if (arg1) {
            this.method501(84, (byte) 107, 121, (class66) null);
        }
    }

    @OriginalMember(owner = "client!eka", name = "d", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        if (!arg0) {
            ++field6832;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "(ILha;)Lrk;")
    public final class35 method502(int arg0, class66 arg1) {
        ++field6840;
        class498 var3 = this.field6849.method3102(2048, false, true, -27, arg1);
        if (var3 == null) {
            return null;
        } else {
            class778 var4 = arg1.method576();
            var4.method130(super.field823, super.field809, super.field813);
            class35 var5 = class415.method2476(1, (byte) 102, this.field6839);
            int var6 = super.field823 >> 9;
            int var7 = super.field813 >> 9;
            int var8 = -61 % ((arg0 - 47) / 63);
            this.field6849.method3109(true, var6, var6, var3, -17230, var7, var4, var7, arg1);
            if (!class502.field7084) {
                var3.method355(var4, var5.field537[0], 0);
            } else {
                var3.method388(var4, var5.field537[0], class621.field8528, 0);
            }
            if (this.field6849.field7301 != null) {
                class460 var9 = this.field6849.field7301.method4244();
                if (!class502.field7084) {
                    arg1.method582(var9);
                } else {
                    arg1.method590(var9, class621.field8528);
                }
            }
            this.field6836 = var3.method380() || this.field6849.field7301 != null;
            if (this.field6838 == null) {
                this.field6838 = class792.method4369(super.field809, super.field823, var3, (byte) -5, super.field813);
            } else {
                class521.method3120(110, super.field809, this.field6838, super.field813, var3, super.field823);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Z)V")
    public final void method936(boolean arg0) {
        if (arg0) {
            this.field6839 = true;
        }
        ++field6842;
    }

    @OriginalMember(owner = "client!eka", name = "d", descriptor = "(B)Z")
    public final boolean method504(byte arg0) {
        if (arg0 != -24) {
            this.method927(-19);
        }
        ++field6831;
        return this.field6836;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)I")
    public final int method929(byte arg0) {
        if (arg0 != -45) {
            this.field6836 = false;
        }
        ++field6828;
        return this.field6849.field7289;
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZIII)V")
    public class491(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class682.method3834(arg8, 3, arg9));
        this.field6849 = new class518(arg0, arg1, arg8, arg9, super.field808, arg3, this, arg7, arg10);
        this.field6839 = arg1.field2171 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(ILha;)V")
    public final void method930(int arg0, class66 arg1) {
        this.field6849.method3099(-1, arg1);
        ++field6844;
        if (arg0 != 14353) {
            this.method927(-25);
        }
    }

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "(I)Z")
    public final boolean method935(int arg0) {
        if (arg0 != 25271) {
            this.method531(true);
        }
        ++field6837;
        return this.field6849.method3108((byte) 119);
    }

    @OriginalMember(owner = "client!eka", name = "e", descriptor = "(Z)Z")
    public final boolean method531(boolean arg0) {
        ++field6835;
        if (arg0) {
            this.field6836 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!eka", name = "e", descriptor = "(I)I")
    public final int method508(int arg0) {
        if (arg0 != -4798) {
            return -67;
        } else {
            ++field6847;
            return this.field6849.method3098((byte) -15);
        }
    }

    @OriginalMember(owner = "client!eka", name = "f", descriptor = "(I)I")
    public final int method509(int arg0) {
        ++field6833;
        int var2 = 3 / ((arg0 - -38) / 56);
        return this.field6849.method3106(false);
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lgda;Lha;IIZII)V")
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 >= -6) {
            this.method935(-93);
        }
        ++field6829;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "(Z)Z")
    public final boolean method503(boolean arg0) {
        if (arg0) {
            field6824 = 87;
        }
        ++field6826;
        return false;
    }

    @OriginalMember(owner = "client!eka", name = "i", descriptor = "(I)V")
    public static void method2900(int arg0) {
        field6846 = null;
        field6848 = null;
        if (arg0 != 262144) {
            method2900(10);
        }
        field6851 = null;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZLha;)Loba;")
    public final class276 method507(boolean arg0, class66 arg1) {
        ++field6843;
        if (arg0) {
            this.field6839 = false;
        }
        return this.field6838;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)I")
    public final int method927(int arg0) {
        if (arg0 != -24482) {
            return -83;
        } else {
            ++field6845;
            return this.field6849.field7296;
        }
    }

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)I")
    public final int method928(int arg0) {
        ++field6830;
        if (arg0 != 13272) {
            this.method507(false, (class66) null);
        }
        return this.field6849.field7322;
    }

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "(III)Lab;")
    public static final class699 method2901(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class699 var4 = var3.field10176;
            var3.field10176 = null;
            class502.method3001(var4);
            return var4;
        }
    }
}

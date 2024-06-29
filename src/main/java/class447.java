import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class447 extends class304 implements class267 {

    @OriginalMember(owner = "client!il", name = "N", descriptor = "B")
    private byte field6940;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Z")
    private boolean field6925;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "B")
    private byte field6921;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "B")
    private byte field6926;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "S")
    private short field6931;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "Z")
    private boolean field6937;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "Z")
    private boolean field6945;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "Li;")
    private class521 field6939;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "Le;")
    private class536 field6927;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "Lqu;")
    public static class219 field6933 = new class219(39, -1);

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Z")
    public static boolean field6946 = false;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "Lbi;")
    public static class104 field6938 = new class104(54, -2);

    @OriginalMember(owner = "client!il", name = "V", descriptor = "[I")
    public static int[] field6948 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "[Lo;")
    public static class139[] field6944;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (!arg0) {
            if (this.field6927 != null) {
                this.field6927.method303();
            }
            ++field6936;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        ++field6942;
        if (arg0 < 87) {
            this.field6931 = -105;
        }
        return this.field6931 & 65535;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
    public static void method2820(int arg0) {
        if (arg0 != 11827) {
            field6948 = null;
        }
        field6944 = null;
        field6933 = null;
        field6948 = null;
        field6938 = null;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        ++field6922;
        return arg0 != 18 ? 84 : this.field6921;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        if (arg0 != -6682) {
            this.field6925 = true;
        }
        ++field6930;
        Object var3 = null;
        class521 var5;
        if (this.field6939 == null && this.field6945) {
            class445 var4 = this.method2823(arg1, true, 262144, 1);
            var5 = var4 == null ? null : var4.field6913;
        } else {
            var5 = this.field6939;
            this.field6939 = null;
        }
        if (var5 != null) {
            class174.method1090(var5, this.field6926, super.field4788, super.field4790, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        if (arg0) {
            this.method103(-39);
        }
        ++field6947;
        return this.method2821(arg2, arg1, false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        if (arg1 == 26768) {
            ++field6932;
            Object var3 = null;
            class521 var5;
            if (this.field6939 == null && this.field6945) {
                class445 var4 = this.method2823(arg0, true, 262144, 1);
                var5 = var4 == null ? null : var4.field6913;
            } else {
                var5 = this.field6939;
                this.field6939 = null;
            }
            if (var5 != null) {
                class220.method1611(var5, this.field6926, super.field4788, super.field4790, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I")
    public final int method98(int arg0) {
        ++field6943;
        if (arg0 != 0) {
            return 81;
        } else {
            return this.field6927 != null ? this.field6927.method305() : 0;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILza;Z)Le;")
    private final class536 method2821(int arg0, class497 arg1, boolean arg2) {
        ++field6929;
        if (this.field6927 != null && ~arg1.method1299(this.field6927.method308(), arg0) == -1) {
            return this.field6927;
        } else {
            class445 var4 = this.method2823(arg1, arg2, arg0, 1);
            return var4 == null ? null : var4.field6911;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)I")
    public static final int method2822(int arg0, int arg1) {
        ++field6924;
        return arg1 <= 60 ? -40 : 1023 & arg0;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        if (arg0 != -1) {
            field6933 = null;
        }
        ++field6934;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 < 53) {
            this.method97(-51, (class497) null);
        }
        ++field6923;
        return this.field6940;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        if (arg0 >= -95) {
            field6946 = true;
        }
        ++field6935;
        return this.field6945;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lza;ZII)Loh;")
    private final class445 method2823(class497 arg0, boolean arg1, int arg2, int arg3) {
        ++field6941;
        class156 var5 = class454.field7029.method3002(-1, 65535 & this.field6931);
        if (arg3 != 1) {
            return null;
        } else {
            class223 var6;
            class223 var7;
            if (!this.field6925) {
                var6 = class244.field3956[this.field6926];
                if (~this.field6926 > -4) {
                    var7 = class244.field3956[this.field6926 + 1];
                } else {
                    var7 = null;
                }
            } else {
                var7 = class244.field3956[0];
                var6 = class103.field1520[this.field6926];
            }
            return var5.method958(arg1, super.field4782, super.field4790, arg2, var7, this.field6940, super.field4788, (byte) -100, var6, arg0, this.field6921);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lza;Loq;IIIIZIIIII)V")
    public class447(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class344.method2279(arg10, arg11, true));
        this.field6940 = (byte) arg10;
        this.field6925 = arg6;
        this.field6921 = (byte) arg11;
        this.field6926 = (byte) arg2;
        super.field4790 = arg5;
        this.field6931 = (short) arg1.field2082;
        super.field4788 = arg3;
        this.field6937 = arg1.field2079 != 0 && !arg6;
        this.field6945 = arg0.method1279() && arg1.field2122 && !this.field6925 && class141.field1911.method2603((byte) -93, class452.field7013) != 0;
        class445 var13 = this.method2823(arg0, this.field6945, 2048, 1);
        if (var13 != null) {
            this.field6939 = var13.field6913;
            this.field6927 = var13.field6911;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field6928;
        if (arg1 != 32689) {
            this.method96((byte) -35);
        }
        class536 var5 = this.method2821(131072, arg3, false);
        if (var5 != null) {
            class205 var6 = arg3.method1231();
            var6.method158(super.field4788, super.field4782, super.field4790);
            return var5.method298(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field6920;
            if (this.field6927 == null) {
                return null;
            } else {
                class205 var3 = arg1.method1231();
                var3.method158(super.field4788 + super.field4781, super.field4782, super.field4790 + super.field4777);
                class514 var4 = null;
                if (this.field6937) {
                    var4 = class104.method706(0, 1);
                }
                this.field6927.method295(var3, var4 == null ? null : var4.field7629[0], 0);
                return var4;
            }
        }
    }
}

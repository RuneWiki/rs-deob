import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class268 extends class97 implements class425 {

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Lfs;")
    public class349 field3880;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Z")
    private boolean field3875;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[I")
    public static int[] field3865 = new int[13];

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field3878;
        class375 var5 = this.field3880.method2300(-1, false, super.field1366, 65536, arg3, super.field1362, arg2);
        if (var5 == null) {
            return false;
        } else {
            class177 var6 = arg3.method1735();
            var6.method985(super.field1366, super.field1364, super.field1362);
            return var5.method1594(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public static void method1828(int arg0) {
        if (arg0 < 27) {
            field3865 = null;
        }
        field3865 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        ++field3876;
        class375 var3 = this.field3880.method2300(arg1, true, super.field1366, 1024, arg0, super.field1362, false);
        if (var3 == null) {
            return null;
        } else {
            class177 var4 = arg0.method1735();
            var4.method985(super.field1366, super.field1364, super.field1362);
            class382 var5 = null;
            if (this.field3875) {
                var5 = class397.method2554(1, ~arg1);
            }
            if (arg1 != -1) {
                this.method166(60);
            }
            if (this.field3880.field5070 == null) {
                var3.method1601(var4, var5 == null ? null : var5.field5543[0], 0);
            } else {
                class352 var6 = this.field3880.field5070.method35();
                arg0.method1653(var3, var6, var4, var5 == null ? null : var5.field5543[0], 0);
            }
            this.field3880.method2295(false, super.field1362 >> 7, true, super.field1366 >> 7, super.field1366 >> 7, var3, super.field1362 >> 7, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lii;Lge;IIIIIIIZI)V")
    public class268(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class33.method222(arg2, arg3, -64));
        this.field3880 = new class349(arg0, arg1, arg2, arg3, arg4, arg5, super.field1366, super.field1362, arg9, arg10);
        this.field3875 = arg1.field1455 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field3869;
        return arg0 != -17506;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static final void method1829(int arg0) {
        class237.field3160.method1136((byte) -124);
        if (arg0 != 65536) {
            method1829(-67);
        }
        ++field3867;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            return true;
        } else {
            ++field3873;
            return this.field3880.method2297(-44);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        ++field3864;
        class375 var3 = this.field3880.method2300(-1, true, super.field1366, 131072, arg1, super.field1362, true);
        if (arg0 < 102) {
            this.field3875 = true;
        }
        if (var3 != null) {
            this.field3880.method2295(false, super.field1362 >> 7, false, super.field1366 >> 7, super.field1366 >> 7, var3, super.field1362 >> 7, arg1);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLii;)V")
    public final void method102(byte arg0, class405 arg1) {
        this.field3880.method2290((byte) -113, arg1);
        if (arg0 != 76) {
            method1829(-2);
        }
        ++field3871;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lii;I)V")
    public final void method118(class405 arg0, int arg1) {
        ++field3883;
        if (arg1 == 22295) {
            this.field3880.method2294(1, arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        ++field3879;
        return arg0 != -15123 ? 87 : this.field3880.field5038;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I")
    public final int method120(int arg0) {
        ++field3874;
        if (arg0 != 25940) {
            this.method118((class405) null, -68);
        }
        return this.field3880.field5074;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        if (arg3 < -106) {
            ++field3868;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
    public static final void method1830(int arg0) {
        ++field3872;
        int var1 = -38 / ((arg0 - 69) / 57);
        class69.field894.method1788(class104.field1487, class339.field4891 ? class382.field5541 + 256 : -1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        if (arg0) {
            method1829(108);
        }
        ++field3882;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)I")
    public final int method105(int arg0) {
        if (arg0 >= -4) {
            this.field3875 = true;
        }
        ++field3870;
        return this.field3880.field5059;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILii;I)Ldc;")
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        if (arg2 <= 27) {
            return null;
        } else {
            ++field3877;
            return this.field3880.method2300(-1, false, 0, arg0, arg1, 0, false);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        if (arg0 > -108) {
            this.method176(true);
        }
        ++field3881;
    }
}

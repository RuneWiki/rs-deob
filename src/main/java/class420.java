import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class420 extends class48 implements class9 {

    @OriginalMember(owner = "client!no", name = "E", descriptor = "Lee;")
    public class404 field6003;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "Z")
    private boolean field5996;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "Llg;")
    public static class237 field6007 = new class237(5);

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "Ltq;")
    public static class376 field6004;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lae;B)V")
    public final void method64(class134 arg0, byte arg1) {
        ++field5998;
        class210 var3 = this.field6003.method2576(-12, false, 131072, arg0, super.field571, true, super.field577);
        if (arg1 < -50) {
            if (var3 != null) {
                this.field6003.method2577(16287, super.field571 >> 7, super.field577 >> 7, super.field571 >> 7, false, arg0, var3, super.field577 >> 7);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(B)V")
    public static void method2659(byte arg0) {
        field6004 = null;
        field6007 = null;
        if (arg0 != -19) {
            field6004 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lae;Ljh;IIIIIIIZIIII)V")
    public class420(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class114.method710((byte) 64, arg2, arg3));
        this.field6003 = new class404(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field5996 = arg1.field998 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lae;ZI)Lbk;")
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method64((class134) null, (byte) -123);
        }
        ++field6001;
        return this.field6003.method2576(-12, false, arg2, arg0, 0, false, 0);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILae;)V")
    public final void method72(int arg0, class134 arg1) {
        int var3 = -20 % (arg0 / 55);
        this.field6003.method2585(arg1, (byte) -104);
        ++field6008;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        if (arg0 > -36) {
            return -115;
        } else {
            ++field6000;
            return this.field6003.field5820;
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)I")
    public final int method69(int arg0) {
        ++field5997;
        if (arg0 != -5944) {
            this.method71((byte) -2);
        }
        return this.field6003.field5804;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field6009;
        if (arg0 != 17184) {
            method2659((byte) -34);
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(B)I")
    public final int method278(byte arg0) {
        int var2 = -2 / ((37 - arg0) / 51);
        ++field6005;
        return this.field6003.method2578(-112);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)Z")
    public final boolean method67(int arg0) {
        ++field5995;
        if (arg0 != -3673) {
            this.field5996 = true;
        }
        return this.field6003.method2587(124);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLae;)Ljg;")
    public final class186 method52(byte arg0, class134 arg1) {
        ++field6006;
        class210 var3 = this.field6003.method2576(-12, false, 1024, arg1, super.field571, true, super.field577);
        if (var3 == null) {
            return null;
        } else if (arg0 != -120) {
            return null;
        } else {
            class18 var4 = arg1.method649();
            var4.method116(super.field577 - -super.field567, super.field568, super.field578 + super.field571);
            class186 var5 = null;
            if (this.field5996) {
                var5 = class348.method2229(1, 21534);
            }
            if (this.field6003.field5836 != null) {
                class63 var6 = this.field6003.field5836.method1371();
                arg1.method588(var3, var6, var4, var5 != null ? var5.field2704[0] : null, 0);
            } else {
                var3.method1416(var4, var5 == null ? null : var5.field2704[0], 0);
            }
            this.field6003.method2577(16287, super.field571 >> 7, super.field577 >> 7, super.field571 >> 7, true, arg1, var3, super.field577 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILae;II)Z")
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field5999;
        class210 var5 = this.field6003.method2576(-12, false, 65536, arg1, super.field571, false, super.field577);
        if (var5 == null) {
            return false;
        } else if (arg2 != 4835) {
            return true;
        } else {
            class18 var6 = arg1.method649();
            var6.method116(super.field577 + super.field567, super.field568, super.field578 + super.field571);
            return var5.method1382(arg0, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lae;I)V")
    public final void method66(class134 arg0, int arg1) {
        ++field6002;
        if (arg1 != 4257) {
            this.method65(25);
        }
        this.field6003.method2572(2, arg0);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)I")
    public final int method68(int arg0) {
        if (arg0 < 118) {
            return -92;
        } else {
            ++field6010;
            return this.field6003.field5835;
        }
    }
}

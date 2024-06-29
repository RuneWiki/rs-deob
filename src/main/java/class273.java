import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class273 extends class301 implements class223 {

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lmj;")
    public class171 field3722;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Z")
    private boolean field3738;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field3726 = 0;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "[Lmg;")
    public static class418[] field3733 = new class418[8];

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "Lhc;")
    public static class368 field3729 = new class368("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Lka;")
    public static class408 field3739 = new class408(64);

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "Ljava/awt/Image;")
    public static Image field3734;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "[Lum;")
    public static class186[] field3723;

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lea;Lp;IIIIIIZI)V", line = 6)
    public class273(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field6320, arg1.field6306);
        this.field3722 = new class171(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field3738 = ~arg1.field6297 != -1 && !arg8;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I", line = 15)
    public final int method709(int arg0) {
        ++field3736;
        return arg0 != 30030 ? -75 : this.field3722.field2437;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILea;Lac;ZII)V", line = 28)
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != 22546) {
            field3723 = null;
        }
        ++field3730;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)Z", line = 39)
    public final boolean method706(boolean arg0) {
        if (!arg0) {
            this.method708(-24);
        }
        ++field3732;
        return this.field3722.method1222((byte) -91);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(ILea;)Lms;", line = 50)
    public final class450 method696(int arg0, class58 arg1) {
        ++field3719;
        class116 var3 = this.field3722.method1223(super.field4110, arg1, false, super.field4108, 1024, arg0 + 18928, true);
        if (var3 == null) {
            return null;
        } else {
            class309 var4 = arg1.method210();
            var4.method1866(super.field4110, super.field4109, super.field4108);
            class450 var5 = null;
            if (this.field3738) {
                var5 = class61.method494(-35, 1);
            }
            if (this.field3722.field2434 == null) {
                var3.method896(var4, var5 != null ? var5.field6451[0] : null, 0);
            } else {
                class174 var6 = this.field3722.field2434.method1552();
                arg1.method172(var3, var6, var4, var5 != null ? var5.field6451[0] : null, 0);
            }
            if (arg0 != 0) {
                return null;
            } else {
                this.field3722.method1225((byte) 58, arg1, true, super.field4108 >> 7, super.field4108 >> 7, super.field4110 >> 7, super.field4110 >> 7, var3);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLea;)V", line = 87)
    public final void method698(byte arg0, class58 arg1) {
        ++field3724;
        this.field3722.method1226(-102, arg1);
        int var3 = -60 % ((arg0 - 24) / 49);
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I", line = 97)
    public final int method695(int arg0) {
        if (arg0 != 898) {
            return -96;
        } else {
            ++field3721;
            return this.field3722.field2438;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZILea;I)Z", line = 111)
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        if (!arg0) {
            return true;
        } else {
            ++field3728;
            class116 var5 = this.field3722.method1223(super.field4110, arg2, false, super.field4108, 65536, 18928, false);
            if (var5 == null) {
                return false;
            } else {
                class309 var6 = arg2.method210();
                var6.method1866(super.field4110, super.field4109, super.field4108);
                return var5.method898(arg3, arg1, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILea;)V", line = 131)
    public final void method704(int arg0, class58 arg1) {
        ++field3727;
        this.field3722.method1216(-15436, arg1);
        if (arg0 != -29096) {
            this.method706(false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 143)
    public final void method702(byte arg0) {
        ++field3717;
        if (arg0 != 46) {
            this.method705((class58) null, (byte) -113, 10);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lea;I)V", line = 159)
    public final void method707(class58 arg0, int arg1) {
        if (arg1 >= -99) {
            this.method711(false);
        }
        ++field3731;
        class116 var3 = this.field3722.method1223(super.field4110, arg0, true, super.field4108, 131072, 18928, true);
        if (var3 != null) {
            this.field3722.method1225((byte) 39, arg0, false, super.field4108 >> 7, super.field4108 >> 7, super.field4110 >> 7, super.field4110 >> 7, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 175)
    public final void method708(int arg0) {
        if (arg0 != 26389) {
            this.method704(6, (class58) null);
        }
        ++field3735;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Z", line = 186)
    public final boolean method697(int arg0) {
        if (arg0 < 115) {
            field3726 = 61;
        }
        ++field3718;
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(Z)V", line = 198)
    public static void method1729(boolean arg0) {
        field3723 = null;
        field3739 = null;
        field3733 = null;
        field3729 = null;
        field3734 = null;
        if (arg0) {
            method1729(true);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)I", line = 219)
    public final int method711(boolean arg0) {
        if (!arg0) {
            field3733 = null;
        }
        ++field3720;
        return this.field3722.field2445;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lea;BI)Lts;", line = 244)
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        ++field3737;
        return arg1 != -63 ? null : this.field3722.method1223(0, arg0, false, 0, arg2, 18928, false);
    }
}

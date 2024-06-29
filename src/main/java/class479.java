import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class479 extends class241 implements class269 {

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "Llo;")
    public class640 field6727;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "Z")
    private boolean field6723;

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "Lvj;")
    public static class373 field6732 = new class373(17, 6);

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "Lui;")
    public static class193 field6733 = new class193();

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!tv", name = "P", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "Lso;")
    private class398 field6735;

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "Ldn;")
    public static class438 field6729;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tv", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field6738;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2797(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BZLjava/awt/Component;)Lpp;", line = 4)
    public static final class330 method2794(byte arg0, boolean arg1, Component arg2) {
        ++field6730;
        try {
            Constructor var3 = Class.forName("fe").getDeclaredConstructor(field6738 != null ? field6738 : (field6738 = method2797("java.awt.Component")), Boolean.TYPE);
            return (class330) var3.newInstance(arg2, new Boolean(arg1));
        } catch (Throwable var4) {
            return arg0 >= -52 ? null : new class30(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V", line = 22)
    public final void method314(byte arg0) {
        if (arg0 < 23) {
            this.field6723 = false;
        }
        ++field6731;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(ILqa;)Lso;", line = 33)
    public final class398 method328(int arg0, class206 arg1) {
        ++field6724;
        return arg0 != 12 ? null : this.field6735;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLoe;ILqa;III)V", line = 44)
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        if (arg5 == 13915) {
            ++field6719;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)I", line = 56)
    public final int method337(boolean arg0) {
        ++field6737;
        if (!arg0) {
            this.method339((byte) -99);
        }
        return this.field6727.field9228;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(ILqa;)Loj;", line = 72)
    public final class318 method320(int arg0, class206 arg1) {
        if (arg0 != -1) {
            this.field6735 = null;
        }
        ++field6726;
        class157 var3 = this.field6727.method3668(false, true, 2048, super.field3004, arg1, super.field3005, -3);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1126();
            var4.method661(super.field3005, super.field3009, super.field3004);
            class318 var5 = null;
            if (this.field6723) {
                var5 = class143.method788(~arg0, 1);
            }
            if (this.field6727.field9229 == null) {
                var3.method69(var4, var5 != null ? var5.field4059[0] : null, 0);
            } else {
                class400 var6 = this.field6727.field9229.method2650();
                arg1.method1177(var3, var6, var4, var5 == null ? null : var5.field4059[0], 0);
            }
            if (this.field6735 == null) {
                this.field6735 = class533.method3049(super.field3009, super.field3005, (byte) 39, var3, super.field3004);
            } else {
                class642.method3698(super.field3009, this.field6735, super.field3004, var3, (byte) 117, super.field3005);
            }
            int var7 = super.field3005 >> 7;
            int var8 = super.field3004 >> 7;
            this.field6727.method3674(var7, var3, arg0 + 4442, arg1, var8, true, var8, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)I", line = 120)
    public final int method333(byte arg0) {
        if (arg0 != 70) {
            this.method312(true, (class170) null, 49, (class206) null, 24, -104, -63);
        }
        ++field6728;
        return this.field6727.field9207;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)Lig;", line = 132)
    public static final class202 method2795(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = var3.field4509;
            var3.field4509 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V", line = 143)
    public final void method339(byte arg0) {
        ++field6734;
        if (arg0 > -114) {
            this.field6723 = true;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Z", line = 156)
    public final boolean method332(int arg0) {
        ++field6716;
        int var2 = -63 / ((1 - arg0) / 49);
        return this.field6727.method3675(false);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLqa;)V", line = 166)
    public final void method336(boolean arg0, class206 arg1) {
        ++field6736;
        this.field6727.method3677(arg0, arg1);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILqa;II)Z", line = 174)
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field6722;
        class157 var5 = this.field6727.method3668(false, false, 131072, super.field3004, arg1, super.field3005, -3);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 != -21851) {
                this.field6735 = null;
            }
            class163 var6 = arg1.method1126();
            var6.method661(super.field3005, super.field3009, super.field3004);
            return var5.method91(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I", line = 194)
    public final int method342(int arg0) {
        if (arg0 != -2329) {
            field6732 = null;
        }
        ++field6718;
        return this.field6727.field9237;
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)V", line = 207)
    public static void method2796(byte arg0) {
        field6733 = null;
        field6732 = null;
        if (arg0 >= -77) {
            field6732 = null;
        }
        field6729 = null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lqa;Z)V", line = 220)
    public final void method341(class206 arg0, boolean arg1) {
        ++field6721;
        if (!arg1) {
            this.field6727.method3669(arg0, 262144);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILqa;Z)Lr;", line = 233)
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        ++field6725;
        return !arg2 ? null : this.field6727.method3668(false, false, arg0, 0, arg1, 0, -3);
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lqa;Lcn;IIIIIZIII)V", line = 251)
    public class479(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class177.method982(155, arg9, arg8));
        this.field6727 = new class640(arg0, arg1, arg8, arg9, arg2, arg3, super.field3005, super.field3004, arg7, arg10);
        this.field6723 = ~arg1.field5972 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)Z", line = 260)
    public final boolean method317(int arg0) {
        if (arg0 != 64) {
            return true;
        } else {
            ++field6717;
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILqa;)V", line = 275)
    public final void method326(int arg0, class206 arg1) {
        if (arg0 == 29657) {
            ++field6720;
            class157 var3 = this.field6727.method3668(true, true, 262144, super.field3004, arg1, super.field3005, -3);
            if (var3 != null) {
                int var4 = super.field3005 >> 7;
                int var5 = super.field3004 >> 7;
                this.field6727.method3674(var4, var3, 4441, arg1, var5, false, var5, var4);
            }
        }
    }
}

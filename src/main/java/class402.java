import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class402 extends class450 {

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "Llo;")
    public static class306 field6118 = new class306("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "Lec;")
    public static class68 field6122 = null;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBII)V", line = 3)
    public final void method1111(int arg0, byte arg1, int arg2, int arg3) {
        super.field6712 = arg0;
        if (arg1 <= -94) {
            super.field6706 = arg3;
            super.field6703 = arg2;
            ++field6120;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIBI)V", line = 19)
    public static final void method2493(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field6119;
        if (arg4 != 39) {
            method2497(120);
        }
        if (~arg1 == ~arg3) {
            class507.method2986(arg0, arg5, -1, arg2, arg3);
        } else if (class182.field2877 <= -arg3 + arg2 && ~class235.field4076 <= ~(arg2 - -arg3) && -arg1 + arg0 >= class29.field460 && ~class472.field6996 <= ~(arg0 - -arg1)) {
            class270.method1804(arg3, arg1, arg5, arg2, 1, arg0);
        } else {
            class528.method3130(arg3, -10587, arg5, arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/awt/Component;B)Lws;", line = 42)
    public static final class379 method2494(Component arg0, byte arg1) {
        ++field6116;
        if (arg1 != -54) {
            method2495(-0.20665061177694422D, 23);
        }
        return new class209(arg0);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(DI)V", line = 55)
    public static final void method2495(double arg0, int arg1) {
        if (class207.field3267 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class463.field6877[var3] = var4 > 255 ? 255 : var4;
            }
            class207.field3267 = arg0;
        }
        if (arg1 >= -1) {
            field6113 = 83;
        }
        ++field6114;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(Z)V", line = 81)
    public static void method2496(boolean arg0) {
        if (!arg0) {
            field6118 = null;
        }
        field6118 = null;
        field6122 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIF)V", line = 92)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V", line = 98)
    public static final void method2497(int arg0) {
        for (int var1 = 0; ~class238.field4104 < ~var1; ++var1) {
            class452 var2 = class241.field4163[var1];
            if (~var2.field6750 == -3) {
                if (var2.field6741 != null) {
                    class510.field7455.method1734(var2.field6741);
                } else {
                    var2.field6748 = Integer.MIN_VALUE;
                }
            }
        }
        if (arg0 == Integer.MIN_VALUE) {
            ++field6117;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(FB)V", line = 132)
    public final void method1109(float arg0, byte arg1) {
        super.field6713 = arg0;
        ++field6121;
        if (arg1 != -118) {
            field6113 = -12;
        }
    }
}

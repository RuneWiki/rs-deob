import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class590 extends class289 {

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "[Lfda;")
    public static class628[] field8597;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(FB)V")
    public final void method1778(float arg0, byte arg1) {
        ++field8593;
        super.field4062 = arg0;
        if (arg1 <= 91) {
            method3388(-121);
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIF)V")
    public class590(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIII)V")
    public final void method1770(byte arg0, int arg1, int arg2, int arg3) {
        ++field8595;
        int var5 = -25 / ((arg0 - 35) / 54);
        super.field4066 = arg2;
        super.field4064 = arg3;
        super.field4054 = arg1;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method3386(String arg0, int arg1) throws ClassNotFoundException {
        ++field8594;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg1 != 20310) {
                field8597 = null;
            }
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZI)I")
    public static final int method3387(int arg0, int arg1, boolean arg2, int arg3) {
        ++field8596;
        class569 var4 = class198.method1392(arg0, arg2, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else {
            return ~arg1 <= arg3 && arg1 < var4.field8313.length ? var4.field8313[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V")
    public static void method3388(int arg0) {
        field8597 = null;
        if (arg0 != 0) {
            field8597 = null;
        }
    }
}

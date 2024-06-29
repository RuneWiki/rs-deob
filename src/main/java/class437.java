import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class437 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "J")
    public static long field6385 = -1L;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field6384 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Liu;")
    public static class517 field6383 = new class517(40, 2);

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field6387;

    static {
        new class224("", 76);
        field6388 = 0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lco;Z)Ljava/lang/String;", line = 3)
    public static final String method2589(class268 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field6387++;
            return class544.method3049(false, arg0, 32767);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IFFFI)F", line = 27)
    public static final float method2590(int arg0, float arg1, float arg2, float arg3, int arg4) {
        if (arg4 != -13072) {
            field6385 = -113L;
        }
        field6386++;
        float[] var5 = class158.field2368[arg0];
        return var5[2] * arg1 + var5[0] * arg2 + var5[1] * arg3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 55)
    public static void method2591(int arg0) {
        field6383 = null;
        if (arg0 != 2) {
            method2590(127, -0.546906F, 1.0559434F, -0.65636694F, 125);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)Z", line = 77)
    public static final boolean method2592(int arg0, int arg1, int arg2, int arg3) {
        if (class343.method2091(arg0, arg1, arg2)) {
            int var4 = arg1 << class162.field2401;
            int var5 = arg2 << class162.field2401;
            return class599.method3409(var4 + 1, class88.field1594[arg0].method694(arg1, arg2) + arg3, var5 + 1) && class599.method3409(class390.field5828 + var4 - 1, class88.field1594[arg0].method694(arg1 + 1, arg2) + arg3, var5 + 1) && class599.method3409(class390.field5828 + var4 - 1, class88.field1594[arg0].method694(arg1 + 1, arg2 + 1) + arg3, class390.field5828 + var5 - 1) && class599.method3409(var4 + 1, class88.field1594[arg0].method694(arg1, arg2 + 1) + arg3, class390.field5828 + var5 - 1);
        } else {
            return false;
        }
    }
}

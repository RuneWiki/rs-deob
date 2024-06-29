import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class147 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "J")
    public static long field1991 = -1L;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "[I")
    public static int[] field1990 = new int[4096];

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
    public static boolean field1993 = false;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    public static void method1015(boolean arg0) {
        if (arg0) {
            method1017((byte) -21, -116, -10);
        }
        field1990 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BZIII)Ldp;")
    public static final class182 method1016(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1994++;
        class182 var5 = new class182();
        var5.field2562 = arg3;
        var5.field2564 = arg2;
        class252.field3703.method606(1, var5, (long) arg4);
        class458.method2838(arg2, -12823);
        class223 var6 = class432.method2655((byte) -65, arg4);
        if (var6 != null) {
            class15.method216((byte) 126, var6);
        }
        if (class378.field5539 != null) {
            class15.method216((byte) 126, class378.field5539);
            class378.field5539 = null;
        }
        int var7 = -42 / ((-arg0 - 51) / 44);
        class309.method2060((byte) 66);
        if (var6 != null) {
            class86.method581(!arg1, -114, var6);
        }
        if (!arg1) {
            class107.method764(arg2);
        }
        if (!arg1 && class318.field4672 != -1) {
            class433.method2657(1, (byte) -78, class318.field4672);
        }
        return var5;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)I")
    public static final int method1017(byte arg0, int arg1, int arg2) {
        field1992++;
        int var3 = class215.method1477(arg2 - 1, arg1 + -1, -27631) + class215.method1477(arg2 + 1, arg1 - 1, -27631) + class215.method1477(arg2 + -1, arg1 - -1, -27631) + class215.method1477(arg2 - -1, arg1 + 1, -27631);
        int var4 = -112 / ((arg0 - 71) / 41);
        int var5 = class215.method1477(arg2 - 1, arg1, -27631) + (class215.method1477(arg2 + 1, arg1, -27631) + class215.method1477(arg2, arg1 - 1, -27631) + class215.method1477(arg2, arg1 - -1, -27631));
        int var6 = class215.method1477(arg2, arg1, -27631);
        return var5 / 8 + var3 / 16 + var6 / 4;
    }

    static {
        new class409("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}

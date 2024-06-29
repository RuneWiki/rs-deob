import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class285 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field4758 = 0;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4760 = "wave2:";

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field4763 = -1;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lfa;")
    public static class273 field4761;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method2009(int arg0) {
        field4760 = null;
        if (arg0 != -1005611988) {
            field4761 = null;
        }
        field4761 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
    public static final void method2010(int arg0, int arg1, int arg2) {
        field4759++;
        class178.field2775[arg1] = arg2;
        if (arg0 != 2) {
            method2011(38, (byte) 69, 34, 15, 81, -85, 20, -89);
        }
        class313 var3 = (class313) class36.field450.method872((byte) -110, (long) arg1);
        if (var3 == null) {
            class313 var4 = new class313(4611686018427387905L);
            class36.field450.method857(false, var4, (long) arg1);
        } else if (var3.field5041 != 4611686018427387905L) {
            var3.field5041 = class267.method1841((byte) 105) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method2011(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4762++;
        if (arg2 == arg6) {
            class241.method1683(arg4, arg0, arg3, arg7, arg2, 113, arg5);
            return;
        }
        if (class53.field711 <= (arg5 - arg2) && class87.field1356 >= arg2 + arg5 && class63.field941 <= (arg3 - arg6) && (arg3 + arg6) <= class75.field1180) {
            class253.method1750(arg4, -10488, arg0, arg7, arg2, arg5, arg3, arg6);
        } else {
            class115.method722(arg0, arg5, arg3, arg6, arg4, -105, arg2, arg7);
        }
        if (arg1 > -13) {
            method2011(111, (byte) -126, -84, -29, 116, 35, 60, 75);
        }
    }
}

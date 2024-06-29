import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class349 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Llaa;")
    public static class106 field5022 = new class106(10, 2, 2, 0);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[S")
    public static short[] field5023;

    @OriginalMember(owner = "client!uj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5021++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method2074(byte arg0) {
        if (arg0 <= 63) {
            method2075(-67, -90, 123, 119, (byte) 37);
        }
        field5022 = null;
        field5023 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIB)V")
    public static final void method2075(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5020++;
        class679 var5 = class669.method3708(4, arg0, 1403048928);
        var5.method3748(true);
        var5.field9566 = arg2;
        var5.field9573 = arg1;
        if (arg4 >= -101) {
            field5022 = null;
        }
        var5.field9574 = arg3;
    }
}

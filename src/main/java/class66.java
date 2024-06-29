import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class66 {

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
    public static int[] field1043 = new int[64];

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lsf;")
    public static class108 field1042 = class140.method973(255, "Konfig geladen)3");

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lsf;")
    public static class108 field1045 = class140.method973(255, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method451(int arg0, byte arg1) {
        class121.field2069.method637(arg0, 116);
        int var2 = 25 / ((29 - arg1) / 41);
        field1044++;
        class260.field4586.method637(arg0, 121);
        class110.field1928.method637(arg0, 127);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 49)
    public static void method452(byte arg0) {
        field1042 = null;
        field1043 = null;
        field1045 = null;
        if (arg0 < 88) {
            method452((byte) 117);
        }
    }
}

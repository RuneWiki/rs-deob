import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class108 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Luv;")
    public static class3 field1400;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Luv;")
    public static class3 field1405;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "[I")
    public static int[] field1406;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "J")
    public static long field1407;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "J")
    public long field1401;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Lum;")
    public class108 field1399;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Lum;")
    public class108 field1403;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
    public final void method589(int arg0) {
        field1402++;
        if (arg0 == -8880 && this.field1399 != null) {
            this.field1399.field1403 = this.field1403;
            this.field1403.field1399 = this.field1399;
            this.field1399 = null;
            this.field1403 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1405 = null;
        if (arg0 == 8) {
            field1406 = null;
            field1400 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Z")
    public final boolean method591(int arg0) {
        field1404++;
        if (arg0 <= 96) {
            this.method589(48);
        }
        return this.field1399 != null;
    }

    static {
        new class344(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field1400 = new class3(61, -1);
        field1405 = new class3(2, 11);
        field1406 = new int[8];
        field1407 = -1L;
    }
}

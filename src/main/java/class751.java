import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class751 {

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field10468 = 0;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field10469 = 0;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field10462 = new String[100];

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public int field10464;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public int field10466;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public int field10470;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lla;")
    public static class423 field10461;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Lla;")
    public static class423 field10463;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Lha;")
    public static class543 field10467;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method4184(boolean arg0) {
        if (arg0) {
            field10467 = null;
        }
        field10465++;
        for (int var1 = 0; var1 < 100; var1++) {
            class241.field3566[var1] = null;
        }
        class76.field1105 = 0;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V", line = 33)
    public static void method4185(boolean arg0) {
        if (!arg0) {
            field10463 = null;
        }
        field10461 = null;
        field10467 = null;
        field10463 = null;
        field10462 = null;
    }
}

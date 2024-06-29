import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class88 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
    public static int[] field1348 = new int[1000];

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lhc;")
    public static class151 field1352 = new class151();

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1352 = null;
        if (arg0 != 23638) {
            field1348 = null;
        }
        field1348 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLve;)V")
    public static final void method598(byte arg0, class233 arg1) {
        field1351++;
        if (arg0 <= 37) {
            method598((byte) -50, (class233) null);
        }
        class7.field153 = arg1;
        class248.field3726 = class7.field153.method1525(11672, 4);
    }
}

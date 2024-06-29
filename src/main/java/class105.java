import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class105 {

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "[I")
    public static int[] field1519 = new int[1];

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "Lde;")
    public static class418 field1520;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
    public static void method853(byte arg0) {
        field1520 = null;
        if (arg0 <= -81) {
            field1519 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
    public static final int method854(int arg0) {
        field1518++;
        return arg0 == 1 ? class693.field9762 : -102;
    }
}

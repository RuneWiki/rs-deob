import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class43 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lcc;")
    public static class209 field863 = class259.method1799(160, -2);

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lcc;")
    public static class209 field866 = class95.method669(88, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
    public static int[] field865;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method325(int arg0) {
        if (arg0 != 246) {
            field867 = -50;
        }
        field866 = null;
        field863 = null;
        field865 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILcc;)V")
    public static final void method326(byte arg0, int arg1, class209 arg2) {
        class84.field1677.method287((byte) 121, 246);
        field864++;
        class84.field1677.method756(arg2.method1448(true), (byte) 76);
        if (arg0 > -13) {
            field865 = null;
        }
        class198.field3546++;
        class84.field1677.method728(arg1, -8);
    }
}

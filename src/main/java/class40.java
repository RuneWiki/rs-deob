import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class40 extends class263 {

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "[I")
    public static int[] field579 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public static void method255(int arg0) {
        if (arg0 != 4) {
            method255(15);
        }
        field579 = null;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(II)V")
    public class40(int arg0, int arg1) {
        this.field580 = arg0;
        this.field578 = arg1;
    }
}

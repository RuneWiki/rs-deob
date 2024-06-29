import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class186 extends class464 {

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Lq;")
    public class102 field2797;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "[B")
    public byte[] field2796;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "[Lvt;")
    public static class473[] field2792;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method1318(boolean arg0) {
        if (!arg0) {
            field2792 = null;
        }
        field2792 = null;
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)[B")
    public final byte[] method1319(int arg0) {
        ++field2793;
        if (arg0 != 100) {
            this.method1320(104);
        }
        if (super.field6539) {
            throw new RuntimeException();
        } else {
            return this.field2796;
        }
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)I")
    public final int method1320(int arg0) {
        ++field2794;
        if (arg0 != 0) {
            this.method1320(-26);
        }
        return super.field6539 ? 0 : 100;
    }
}

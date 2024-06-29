import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class616 {

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "[[B")
    public static byte[][] field8342 = new byte[50][];

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V", line = 13)
    public static void method3371(int arg0) {
        if (arg0 != 4) {
            field8342 = null;
        }
        field8342 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)V", line = 23)
    public static final void method3372(byte arg0, int arg1) {
        if (class605.field8192 == null) {
            class605.field8192 = new byte[4][class611.field8258][class656.field9155];
        }
        field8343++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class611.field8258; var3++) {
                for (int var4 = 0; var4 < class656.field9155; var4++) {
                    class605.field8192[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != 28704) {
            field8342 = null;
        }
    }
}

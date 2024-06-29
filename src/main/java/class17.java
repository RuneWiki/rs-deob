import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 extends class77 {

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
    public static int[] field260 = new int[128];

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "Lia;")
    public class88 field264;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    public static final void method119(int arg0, int arg1) {
        field262++;
        if (arg0 == -1066663896) {
            class26 var2 = class32.field657;
            synchronized (class32.field657) {
                class94.field1643 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public static void method120(int arg0) {
        int var1 = 91 / ((arg0 - 27) / 43);
        field260 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)I")
    public static final int method121(boolean arg0, int arg1) {
        field265++;
        if (!arg0) {
            field263 = -103;
        }
        return arg1 >>> 8;
    }
}

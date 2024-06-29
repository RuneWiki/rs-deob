import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class371 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5324 = -1;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
    public static int[] field5326 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
    public static int[] field5329 = new int[3];

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5325;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method2276(byte arg0) {
        field5326 = null;
        if (arg0 == 73) {
            field5325 = null;
            field5329 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lk;B)V")
    public static final void method2277(class567 arg0, byte arg1) {
        field5327++;
        arg0.method2597(-69);
        boolean var2 = false;
        int var3 = 41 / ((-arg1 - 55) / 43);
        for (class567 var4 = (class567) class673.field9386.method3508(-2); var4 != null; var4 = (class567) class673.field9386.method3507(-35)) {
            if (class676.method3884(arg0.method3300((byte) 78), var4.method3300((byte) 90), (byte) -113)) {
                var2 = true;
                class474.method2861(var4, arg0, (byte) 95);
                break;
            }
        }
        if (!var2) {
            class673.field9386.method3505(arg0, 4);
        }
    }
}

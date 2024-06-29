import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class256 extends class116 {

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Lrf;")
    public class92 field4507;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "[I")
    public static int[] field4508 = new int[2];

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "Lda;")
    public static class275 field4509 = class255.method1672(102, "gelb:");

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field4510 = -1;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field4512 = 0;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "[Leh;")
    public static class250[] field4514 = new class250[6];

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLfb;)I")
    public static final int method1676(byte arg0, class109 arg1) {
        int var2 = -104 % ((arg0 + 92) / 32);
        field4511++;
        int var3 = arg1.field1938;
        if (arg1.field1788 == arg1.field1736) {
            var3 = arg1.field1936;
        } else if (arg1.field1788 == arg1.field1761) {
            var3 = arg1.field1934;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lrf;)V")
    public class256(class92 arg0) {
        this.field4507 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public static void method1677(byte arg0) {
        field4514 = null;
        field4509 = null;
        field4508 = null;
        if (arg0 > -73) {
            field4514 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([[IB)V")
    public static final void method1678(int[][] arg0, byte arg1) {
        field4513++;
        class19.field280 = arg0;
        if (arg1 != 27) {
            field4510 = -108;
        }
    }
}

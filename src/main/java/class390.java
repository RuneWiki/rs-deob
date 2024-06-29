import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class390 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Lsj;")
    public static class265 field5730 = new class265(0, -1);

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field5734 = 1;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5735 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5739 = "cyan:";

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field5737 = 0;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field5740 = 0;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "Lrs;")
    public class390 field5732;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Lrs;")
    public class390 field5733;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "[I")
    public static int[] field5738;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public final void method2552(int arg0) {
        field5736++;
        if (arg0 != -1) {
            method2554((byte) 17);
        }
        if (this.field5732 != null) {
            this.field5732.field5733 = this.field5733;
            this.field5733.field5732 = this.field5732;
            this.field5732 = null;
            this.field5733 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lqj;B)V")
    public static final void method2553(class296 arg0, byte arg1) {
        if (arg1 > -58) {
            field5737 = 113;
        }
        class23.field302 = arg0.method1914(-1, "titlebg");
        field5731++;
        class123.field1723 = arg0.method1914(-1, "logo");
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static void method2554(byte arg0) {
        if (arg0 >= -45) {
            field5740 = -92;
        }
        field5735 = null;
        field5738 = null;
        field5739 = null;
        field5730 = null;
    }
}

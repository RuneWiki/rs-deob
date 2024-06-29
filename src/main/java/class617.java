import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class617 {

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public int field8854;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public int field8858;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public int field8859;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field8851;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)V", line = 5)
    public static final void method3530(int arg0, int arg1, int arg2) {
        field8856++;
        class233 var3 = class7.method44(arg0, 16, -1);
        var3.method1422(0);
        if (arg1 != -2) {
            field8853 = -69;
        }
        var3.field3114 = arg2;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 19)
    public static void method3531(int arg0) {
        field8851 = null;
        if (arg0 <= 47) {
            field8853 = 66;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lun;II)V", line = 30)
    private final void method3532(class389 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field8859 = arg0.method2260(-101);
            this.field8854 = arg0.method2229(255);
            this.field8858 = arg0.method2229(255);
        }
        field8852++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lun;I)V", line = 48)
    public final void method3533(class389 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                field8857++;
                if (arg1 != -2) {
                    this.field8858 = -117;
                    return;
                }
                return;
            }
            this.method3532(arg0, var3, -2);
        }
    }
}

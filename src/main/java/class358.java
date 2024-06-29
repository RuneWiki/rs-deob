import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class358 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
    public static int[] field4854 = new int[4096];

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field4855 = 0;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[I")
    public static int[] field4857 = new int[500];

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4859 = new Rectangle[100];

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lbi;")
    public static class139 field4860 = null;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[S")
    public static short[] field4858;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 11)
    public static void method2249(boolean arg0) {
        field4860 = null;
        field4859 = null;
        field4854 = null;
        field4857 = null;
        if (arg0) {
            field4858 = null;
        }
        field4858 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 34)
    public static final void method2250(byte arg0) {
        field4856++;
        if (arg0 < -103) {
            class387.field5450.method254(class239.field3301, class394.field5520, class41.field629);
        }
    }
}

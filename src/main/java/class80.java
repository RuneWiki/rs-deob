import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class80 extends class524 {

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field1105;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Lkg;")
    public static class275 field1106 = new class275(28, 4);

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "Ljava/awt/Font;")
    public static Font field1109;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "[I")
    public static int[] field1108;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V", line = 5)
    public static void method680(byte arg0) {
        if (arg0 < 98) {
            field1108 = null;
        }
        field1106 = null;
        field1109 = null;
        field1108 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method681(int arg0) {
        int var2 = -64 / ((arg0 + 46) / 58);
        field1107++;
        return this.field1105;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lhh;Ljava/lang/Object;I)V", line = 33)
    public class80(class132 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1105 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)Z", line = 41)
    public final boolean method682(int arg0) {
        int var2 = 91 / ((arg0 + 33) / 37);
        field1104++;
        return false;
    }
}

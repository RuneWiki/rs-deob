import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public abstract class class113 extends class659 {

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "[I")
    public static int[] field1539 = new int[6];

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1538 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Z")
    public static boolean field1541 = false;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field1542 = -1;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method835(boolean arg0) {
        field1540++;
        class790.field10847.method1244(30407);
        if (!arg0) {
            method835(false);
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V", line = 19)
    public static void method836(int arg0) {
        field1538 = null;
        field1539 = null;
        if (arg0 != 16777215) {
            field1539 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V", line = 46)
    public class113(int arg0) {
        this.field1543 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method834(int arg0);

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)Z")
    public abstract boolean method837(int arg0);
}

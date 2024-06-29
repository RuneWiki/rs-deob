import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class211 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lgk;")
    private class463 field2714;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2715 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ler;")
    public static class4 field2717;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2712;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method1355(boolean arg0) {
        field2712 = null;
        field2715 = null;
        if (arg0) {
            field2717 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2713++;
        this.field2714.method2798(4, this.field2716);
        super.finalize();
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lgk;II)V")
    public class211(class463 arg0, int arg1, int arg2) {
        this.field2716 = arg2;
        this.field2714 = arg0;
    }
}

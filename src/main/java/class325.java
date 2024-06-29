import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class class325 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4378 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Leba;")
    public static class550 field4380 = new class550(9, 8);

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[Z")
    public static boolean[] field4383 = new boolean[100];

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Laga;")
    public static class658 field4382;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field4379;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z", line = 10)
    public final boolean method1889(int arg0) {
        if (arg0 != 16777215) {
            field4382 = null;
        }
        field4381++;
        return this.method1894((byte) 92) || this.method1891(8) || this.method1887((byte) 69);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 28)
    public static void method1892(byte arg0) {
        if (arg0 >= -5) {
            return;
        }
        field4379 = null;
        field4382 = null;
        field4383 = null;
        field4380 = null;
        field4378 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Lll;")
    public abstract class294 method1886(boolean arg0);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Z")
    public abstract boolean method1887(byte arg0);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public abstract void method1888(int arg0);

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I")
    public abstract int method1890(int arg0);

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Z")
    public abstract boolean method1891(int arg0);

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)I")
    public abstract int method1893(byte arg0);

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)Z")
    public abstract boolean method1894(byte arg0);

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public abstract void method1895(int arg0);
}

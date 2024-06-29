import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class144 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[Lfl;")
    public static class499[] field1862 = new class499[4];

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lak;")
    public static class222 field1866 = new class222(0, 2, 2, 1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field1865;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Z")
    public static boolean field1864;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 4)
    public static final void method906(int arg0) {
        field1863++;
        class181.field2591 = new class356[class184.field2616.method1466(false)][];
        class135.field1730 = new class356[class184.field2616.method1466(false)][];
        if (arg0 >= 38) {
            class370.field5561 = new boolean[class184.field2616.method1466(false)];
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 26)
    public static void method907(byte arg0) {
        field1862 = null;
        field1865 = null;
        int var1 = -41 / ((arg0 + 64) / 45);
        field1866 = null;
    }
}

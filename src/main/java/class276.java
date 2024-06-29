import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class276 extends class163 {

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lwa;")
    public static class75 field4742 = class66.method560("Lade Benutzeroberfl-=che )2 ", false);

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lwa;")
    public static class75 field4743 = class66.method560(")1", false);

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lwa;")
    public static class75 field4747 = class66.method560(" weitere Optionen", false);

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "[I")
    public static int[] field4750 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Lwa;")
    public static class75 field4749 = class66.method560("Lade Benutzeroberfl-=che )2 ", false);

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Z")
    public static volatile boolean field4748 = true;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lwa;")
    public static class75 field4751 = class66.method560("(U2", false);

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4745;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 45)
    public static final void method1962(byte arg0) {
        for (int var1 = 0; var1 < class297.field5084; var1++) {
            class103 var2 = class39.method261(var1, 16);
            if (var2 != null && var2.field1746 == 0) {
                class6.field77[var1] = 0;
                class286.field4920[var1] = 0;
            }
        }
        field4746++;
        int var3 = -19 % ((46 - arg0) / 50);
        class242.field4080 = new class126(16);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 77)
    public static void method1963(int arg0) {
        if (arg0 != 0) {
            field4747 = (class75) null;
        }
        field4750 = null;
        field4747 = null;
        field4745 = null;
        field4742 = null;
        field4749 = null;
        field4743 = null;
        field4751 = null;
    }
}

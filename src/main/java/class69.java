import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class69 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lcd;")
    public static class23 field1617 = class54.method414(")4slr)3ws?order=LPWM", -1);

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lcd;")
    public static class23 field1621 = class54.method414("(Udns", -1);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
    public static boolean field1616 = false;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
    public static int[] field1622 = new int[2048];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1623 = 0;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1625;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method503(boolean arg0) {
        field1622 = null;
        field1617 = null;
        field1621 = null;
        field1625 = null;
        if (!arg0) {
            method503(true);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Lcd;")
    public static final class23 method504(int arg0, int arg1) {
        if (arg1 == 0) {
            field1618++;
            return class3.method14(true, new class23[] { class184.method1132(-1, arg0 >> 24 & 0xFF), class146.field2996, class184.method1132(-1, arg0 >> 16 & 0xFF), class146.field2996, class184.method1132(-1, arg0 >> 8 & 0xFF), class146.field2996, class184.method1132(arg1 - 1, arg0 & 0xFF) });
        } else {
            return null;
        }
    }
}

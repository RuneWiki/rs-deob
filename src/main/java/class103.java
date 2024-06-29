import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class103 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "[Z")
    public static boolean[] field1674 = new boolean[8];

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
    public static boolean field1675 = false;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1676 = 0;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field1673;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1677;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)I")
    public static final int method752(int arg0) {
        if (arg0 == 8) {
            field1678++;
            return class260.field4134.method478(5);
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method753(byte arg0) {
        field1673 = null;
        int var1 = 117 / ((67 - arg0) / 55);
        field1674 = null;
        field1677 = null;
    }
}

import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class177 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
    public static int[] field2482 = new int[64];

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[S")
    public static short[] field2485 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Llc;")
    public static class86 field2479 = new class86(64);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field2484;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field2484 = null;
        if (arg0 <= 43) {
            field2484 = null;
        }
        field2485 = null;
        field2479 = null;
        field2482 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static final void method1161(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class46.field673[var1] = false;
        }
        class200.field2780 = 0;
        class51.field734 = 1;
        class48.field694 = arg0;
        class153.field2122 = -1;
        class143.field1986 = -1;
        field2480++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(CI)Z")
    public static final boolean method1162(char arg0, int arg1) {
        if (arg1 != -58) {
            method1160(109);
        }
        field2481++;
        return arg0 >= '0' && arg0 <= '9';
    }
}

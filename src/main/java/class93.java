import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class93 extends InputStream {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public static int[] field1639 = new int[32];

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field1643 = -1;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lbv;")
    public static class567 field1640 = new class567("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "F")
    public static float field1645;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[Z")
    public static boolean[] field1644;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 5)
    public static void method822(int arg0) {
        field1639 = null;
        field1640 = null;
        if (arg0 == -1) {
            field1644 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "read", descriptor = "()I", line = 19)
    public final int read() {
        field1646++;
        class210.method1342(-50, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 44)
    public static final void method823(int arg0) {
        int var1 = 94 % ((-arg0 - 56) / 36);
        class18.method211();
        field1642++;
    }
}

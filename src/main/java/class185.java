import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class185 extends OutputStream {

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "Lbn;")
    public static class378 field2771 = new class378(11, -1);

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "[I")
    public static int[] field2775 = new int[2048];

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Llu;")
    public static class610 field2774 = new class610(53, -1);

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    public static int field2777 = 0;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!sba", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2776++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field2774 = null;
        field2771 = null;
        if (arg0 != 7389) {
            field2774 = null;
        }
        field2775 = null;
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
    public static final void method1285(int arg0) {
        if (~class472.field6670 == arg0) {
            class18.method117((byte) -85, 4);
        } else if (class472.field6670 == 4 || class472.field6670 == 5) {
            class18.method117((byte) -85, 2);
        } else if (class472.field6670 == 11) {
            class18.method117((byte) -85, 2);
        }
        field2778++;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IBI)I")
    public static final int method1286(int arg0, byte arg1, int arg2) {
        field2773++;
        if (arg1 < 9) {
            return -18;
        } else if (arg2 == 1 || arg2 == 3) {
            return class348.field4773[arg0 & 0x3];
        } else {
            return class427.field5748[arg0 & 0x3];
        }
    }
}

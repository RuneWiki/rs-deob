import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class86 extends class134 {

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Ljava/lang/String;")
    public String field1351;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[I")
    public static int[] field1352 = new int[] { 0, 0, 0, 0, 2, 0, 3, 0, -1, -1, 0, 10, 3, 0, 0, -2, 0, 0, 0, 5, 3, 0, 4, 0, 0, 0, 0, 0, 0, 12, 0, -1, 15, 6, 12, 0, 0, 0, 3, 7, 0, 10, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 6, 0, 2, 0, -1, 0, 0, -2, 0, 0, 8, 0, 0, 5, -1, 2, 1, 9, 3, -1, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, -2, 0, 0, 6, -1, -2, -1, 7, 1, 17, 4, 0, 0, 0, 0, 2, 0, 0, 12, 28, 0, 0, 0, 0, 6, 3, 8, -1, 0, -1, 0, 5, 0, 2, 0, 0, 7, 3, 0, 6, 8, 0, -2, 0, -2, 7, 8, 0, 8, 6, -1, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, -2, 0, -2, 0, 0, 4, 12, 0, 0, -2, 14, -2, 0, 0, 0, 0, 10, 1, 4, 0, -1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 12, 0, 0, 0, 8, 1, 0, 0, 6, 0, 0, 0, 20, 0, 0, 2, 0, 0, 0, 0, 10, 0, 8, 0, 2, -1, 0, 0, 0, 0, 0, 0, -1, 0, 15, 8, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, 3, 8, 0, 0, 0, 0, 0, 6, 14, 6, 0, -2 };

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Z")
    public static boolean field1354 = false;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method571(byte arg0) {
        field1352 = null;
        if (arg0 != 20) {
            field1354 = true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBII)V")
    public static final void method572(int arg0, byte arg1, int arg2, int arg3) {
        field1350++;
        if (arg0 == 0) {
            class276.field4572.method1391(arg1 ^ 0x4F, 38);
            class230.field3689++;
        }
        if (arg0 == 1) {
            class40.field503++;
            class276.field4572.method1391(0, 253);
        }
        class276.field4572.method1433(class101.field1517 + arg3, (byte) -110);
        class276.field4572.method1400((byte) -104, class3.field26[82] ? 1 : 0);
        class276.field4572.method1412(class254.field4063 + arg2, false);
        class276.field4572.method1407(++class143.field2237, false);
        if (arg1 != 79) {
            field1352 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class86() {
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class86(String arg0, int arg1) {
        this.field1351 = arg0;
    }
}

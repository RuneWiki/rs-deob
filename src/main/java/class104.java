import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class104 extends InputStream {

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1507 = -1;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Llu;")
    public static class610 field1508 = new class610(74, -1);

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "[Z")
    public static boolean[] field1511 = new boolean[100];

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1513 = 0;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "[[[I")
    public static int[][][] field1510;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method777(int arg0) {
        class223.field3232 = null;
        class609.field9044 = null;
        class186.field2782 = null;
        if (arg0 != 0) {
            return;
        }
        field1512++;
        class533.field7937 = null;
        class352.field4793 = null;
        class100.field1460 = null;
        class559.field8303 = null;
        class545.field8140 = null;
        class424.field5739 = null;
    }

    @OriginalMember(owner = "client!fv", name = "read", descriptor = "()I", line = 22)
    public final int read() {
        class236.method1513(true, 30000L);
        field1509++;
        return -1;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 45)
    public static void method778(int arg0) {
        if (arg0 <= 111) {
            method777(4);
        }
        field1510 = null;
        field1508 = null;
        field1511 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class62 extends class86 {

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[B")
    public byte[] field863;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "[I")
    public static int[] field861 = new int[100];

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field862 = 0;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Lkg;")
    public static class69 field867;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Ljava/lang/String;")
    public static String field866;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "[I")
    public static int[] field865;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lbe;I)I", line = 4)
    public static final int method403(class283 arg0, int arg1) {
        field864++;
        for (int var2 = arg1; var2 < class148.field2411.length; var2++) {
            if (class148.field2411[var2].method1910(16369, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)V", line = 27)
    public static void method404(byte arg0) {
        field867 = null;
        field866 = null;
        field861 = null;
        field865 = null;
        if (arg0 > -58) {
            method404((byte) -85);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V", line = 61)
    public class62(byte[] arg0) {
        this.field863 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class109 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "J")
    private long field1568;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "[I")
    public static int[] field1566 = new int[13];

    @OriginalMember(owner = "client!en", name = "f", descriptor = "[I")
    public static int[] field1564 = new int[500];

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field1565 = -1;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I", line = 7)
    private final int method802(int arg0, int arg1) {
        field1563++;
        return arg0 == 15 ? (int) (this.field1568 >> class697.field9855 * arg1) & 0xF : 18;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I", line = 20)
    public final int method803(int arg0) {
        field1561++;
        int var2 = -91 / ((arg0 + 31) / 52);
        return this.field1559;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)Lgv;", line = 31)
    public final class697 method804(boolean arg0, int arg1) {
        if (arg0) {
            field1567++;
            return class697.method3920(this.method802(15, arg1), arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lgv;B)V", line = 43)
    private final void method805(class697 arg0, byte arg1) {
        field1562++;
        if (arg1 < 93) {
            this.method804(false, 49);
        }
        this.field1568 |= (arg0.field9847 << class697.field9855 * this.field1559++);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 64)
    public static void method806(int arg0) {
        field1564 = null;
        field1566 = null;
        if (arg0 != -28529) {
            method806(105);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lgv;)V", line = 78)
    public class109(class697 arg0) {
        this.field1559 = 1;
        this.field1568 = arg0.field9847;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "([Lgv;)V", line = 87)
    public class109(class697[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method805(arg0[var2], (byte) 114);
        }
    }
}

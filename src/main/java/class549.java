import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class549 {

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
    private int field7843;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "Lpr;")
    public static class407 field7838 = new class407(58, 0);

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field7839 = 0;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "[I")
    public static int[] field7844 = new int[2];

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "Lpca;")
    public static class653 field7840 = new class653(4);

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "[I")
    public static int[] field7846 = new int[4];

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lmfa;")
    public static class562 field7845 = new class562();

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
    public static void method3103(byte arg0) {
        field7845 = null;
        field7846 = null;
        field7844 = null;
        field7840 = null;
        if (arg0 != -58) {
            field7838 = null;
        }
        field7838 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)Z")
    public static final boolean method3104(int arg0, int arg1, int arg2) {
        if (arg1 < 65) {
            return true;
        } else {
            field7837++;
            return (arg0 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7842++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)I")
    public final int method3105(byte arg0) {
        if (arg0 != -21) {
            field7845 = null;
        }
        field7841++;
        return this.field7843;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(II)V")
    public class549(int arg0, int arg1) {
        this.field7843 = arg0;
    }
}

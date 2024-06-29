import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class653 implements class169 {

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Ljava/lang/String;")
    private String field9068;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Laj;")
    private class333 field9067;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field9063 = 4;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
    public static boolean field9061;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
    public final int method269(byte arg0) {
        field9064++;
        int var2 = 32 % ((6 - arg0) / 59);
        return this.field9067.method2115((byte) 114, this.field9068) ? 100 : 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Ljq;")
    public final class539 method268(int arg0) {
        if (arg0 != -12696) {
            field9062 = 64;
        }
        field9065++;
        return class539.field7331;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
    public static final int method3641(int arg0, int arg1) {
        field9066++;
        int var2 = -21 % ((25 - arg1) / 46);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Laj;Ljava/lang/String;)V")
    public class653(class333 arg0, String arg1) {
        this.field9068 = arg1;
        this.field9067 = arg0;
    }
}

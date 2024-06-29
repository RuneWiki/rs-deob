import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class157 extends class54 {

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field2478;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)Z", line = 12)
    public final boolean method424(int arg0) {
        field2476++;
        if (arg0 != 0) {
            this.field2478 = (Object) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method430(byte arg0) {
        int var2 = -45 % ((arg0 - 12) / 61);
        field2479++;
        return this.field2478;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)Z", line = 38)
    public static final boolean method1217(int arg0, int arg1) {
        int var2 = -58 % ((arg0 + 41) / 33);
        field2475++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)I", line = 47)
    public static final int method1218(int arg0, int arg1, int arg2) {
        field2477++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & arg2) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 66)
    public class157(Object arg0) {
        this.field2478 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class703 {

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public int field9911;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Lpu;")
    public static class522 field9909;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field9912;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 11)
    public static void method3918(int arg0) {
        field9912 = null;
        if (arg0 == 126) {
            field9909 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)I", line = 26)
    public static final int method3919(int arg0, int arg1, int arg2) {
        field9910++;
        int var3 = (arg1 & arg0) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!rw", name = "toString", descriptor = "()Ljava/lang/String;", line = 42)
    public final String toString() {
        field9908++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(II)V", line = 49)
    public class703(int arg0, int arg1) {
        this.field9911 = arg1;
    }
}

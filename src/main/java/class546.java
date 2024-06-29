import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class546 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lnb;")
    private class271 field7814;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    private int field7809;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field7806;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public int field7812;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lai;")
    public static class546 field7810 = new class546(0, 3, class271.field3433);

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lai;")
    public static class546 field7813 = new class546(1, 3, class271.field3433);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lai;")
    public static class546 field7815 = new class546(2, 4, class271.field3429);

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Lai;")
    public static class546 field7816 = new class546(3, 1, class271.field3433);

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Lai;")
    public static class546 field7817 = new class546(4, 2, class271.field3433);

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lai;")
    public static class546 field7818 = new class546(5, 3, class271.field3433);

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Lai;")
    private static class546 field7819 = new class546(6, 4, class271.field3433);

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field7820 = class465.method2644(16, 4);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3092(byte arg0) {
        field7813 = null;
        field7819 = null;
        field7817 = null;
        int var1 = 8 % ((arg0 - 53) / 60);
        field7818 = null;
        field7810 = null;
        field7815 = null;
        field7816 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z")
    public static final boolean method3093(int arg0) {
        field7808++;
        if (arg0 != 6) {
            field7817 = null;
        }
        class270 var1 = class530.field7597.field7992.field3404;
        if (var1 == null || class530.field7597.field7992 == var1) {
            return false;
        }
        class208 var2 = (class208) var1;
        if (var2.field2527 >= 2000) {
            var2.field2527 -= 2000;
        }
        return var2.field2527 == 1002;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)[Lai;")
    public static final class546[] method3094(byte arg0) {
        int var1 = 26 % ((arg0 - 4) / 58);
        field7811++;
        return new class546[] { field7810, field7813, field7815, field7816, field7817, field7818, field7819 };
    }

    @OriginalMember(owner = "client!ai", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7807++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IILnb;)V")
    private class546(int arg0, int arg1, class271 arg2) {
        this.field7814 = arg2;
        this.field7809 = arg1;
        this.field7806 = arg0;
        this.field7812 = this.field7814.field3426 * this.field7809;
        if (this.field7806 >= 16) {
            throw new RuntimeException();
        }
    }
}

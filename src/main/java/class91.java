import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class91 {

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "Lkf;")
    private class720 field1225;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "Llba;")
    public static class91 field1226 = new class91(0, 3, class720.field10168);

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "Llba;")
    public static class91 field1229 = new class91(1, 3, class720.field10168);

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "Llba;")
    public static class91 field1230 = new class91(2, 4, class720.field10164);

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Llba;")
    public static class91 field1231 = new class91(3, 1, class720.field10168);

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "Llba;")
    public static class91 field1232 = new class91(4, 2, class720.field10168);

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "Llba;")
    public static class91 field1233 = new class91(5, 3, class720.field10168);

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "Llba;")
    public static class91 field1234 = new class91(6, 4, class720.field10168);

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    public static int field1235 = class668.method3830((byte) -7, 16);

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "Ljf;")
    public static class640 field1236 = new class640(12, 5);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "Lwu;")
    public static class557 field1237;

    @OriginalMember(owner = "client!lba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1221++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V")
    public static void method549(boolean arg0) {
        field1231 = null;
        field1234 = null;
        field1232 = null;
        field1230 = null;
        if (!arg0) {
            return;
        }
        field1233 = null;
        field1226 = null;
        field1237 = null;
        field1236 = null;
        field1229 = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Llba;")
    public static final class91 method550(int arg0, int arg1) {
        field1224++;
        if (arg1 != 3) {
            field1234 = null;
        }
        if (arg0 == 0) {
            return field1226;
        } else if (arg0 == 1) {
            return field1229;
        } else if (arg0 == 2) {
            return field1230;
        } else if (arg0 == 3) {
            return field1231;
        } else if (arg0 == 4) {
            return field1232;
        } else if (arg0 == 5) {
            return field1233;
        } else if (arg0 == 6) {
            return field1234;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IILkf;)V")
    private class91(int arg0, int arg1, class720 arg2) {
        this.field1225 = arg2;
        this.field1222 = arg0;
        this.field1223 = arg1;
        this.field1227 = this.field1225.field10158 * this.field1223;
        if (this.field1222 >= 16) {
            throw new RuntimeException();
        }
    }
}

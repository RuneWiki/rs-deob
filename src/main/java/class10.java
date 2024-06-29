import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "Lpt;")
    public static class451 field79 = new class451(16);

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "[[I")
    public static int[][] field81 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "Lg;")
    public static class135 field80 = new class135(4);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lraa;B)I", line = 4)
    public static final int method51(class520 arg0, byte arg1) {
        field77++;
        if (arg1 > -115) {
            return 7;
        } else if (class2.field7 == arg0) {
            return 7681;
        } else if (class564.field8287 == arg0) {
            return 8448;
        } else if (class529.field7403 == arg0) {
            return 34165;
        } else if (class402.field5281 == arg0) {
            return 260;
        } else if (class66.field643 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)I", line = 39)
    public static final int method52(int arg0, int arg1, int arg2) {
        if (arg0 != 31129) {
            return 54;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field75++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hba", name = "toString", descriptor = "()Ljava/lang/String;", line = 59)
    public final String toString() {
        field74++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 67)
    public static void method53(int arg0) {
        field80 = null;
        field79 = null;
        field81 = null;
        if (arg0 != -127) {
            field79 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V", line = 81)
    public class10(int arg0) {
        this.field78 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLil;)Z", line = 89)
    public static final boolean method54(byte arg0, class7 arg1) {
        int var2 = 113 / ((arg0 + 67) / 52);
        field76++;
        return class85.field1037 == arg1 || class63.field624 == arg1 || class114.field1428 == arg1 || class622.field8967 == arg1;
    }
}

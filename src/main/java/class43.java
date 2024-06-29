import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class43 extends class104 {

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lmh;")
    private static class62 field651 = class201.method1405(true, "Checking for updates )2 ");

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "Lmh;")
    public static class62 field652 = class201.method1405(true, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "Lmh;")
    public static class62 field656 = field651;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Lmh;")
    public static class62 field655 = class201.method1405(true, "VOLL");

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "B")
    public byte field649;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "Ltj;")
    public static class11 field659;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "Lmi;")
    public class92 field654;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "[I")
    public static int[] field657;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "[[[Lhk;")
    public static class166[][][] field658;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)I", line = 4)
    public final int method285(int arg0) {
        field650++;
        if (this.field654 == null) {
            return 0;
        } else {
            if (arg0 != 100) {
                field652 = (class62) null;
            }
            return this.field654.field1476 * 100 / (this.field654.field1495.length - this.field649);
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V", line = 39)
    public static void method286(int arg0) {
        field652 = null;
        field651 = null;
        field659 = null;
        field655 = null;
        if (arg0 != 0) {
            field658 = (class166[][][]) ((class166[][][]) null);
        }
        field658 = (class166[][][]) null;
        field656 = null;
        field657 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILhi;BI)[Lwg;", line = 67)
    public static final class24[] method287(int arg0, class26 arg1, byte arg2, int arg3) {
        if (arg2 != 80) {
            method286(-98);
        }
        field653++;
        return class127.method951(arg1, arg3, -125, arg0) ? class306.method2091(4096) : null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)[B", line = 81)
    public final byte[] method288(boolean arg0) {
        if (!arg0) {
            field655 = (class62) null;
        }
        field660++;
        if (this.field1706 || (this.field654.field1495.length - this.field649) > this.field654.field1476) {
            throw new RuntimeException();
        }
        return this.field654.field1495;
    }
}

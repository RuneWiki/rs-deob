import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class140 {

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "J")
    public long field2083;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Lqfa;")
    private class106 field2079;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "Lbu;")
    public static class21 field2082 = new class21(113, -1);

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "Lfga;")
    public static class267 field2084 = new class267();

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!hw", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        this.field2079.method773(118, this.field2083);
        field2085++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 15)
    public static void method1011(int arg0) {
        field2082 = null;
        if (arg0 == 31882) {
            field2084 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(CI)Z", line = 29)
    public static final boolean method1012(char arg0, int arg1) {
        field2078++;
        int var2 = -2 % ((arg1 - 38) / 41);
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Z", line = 50)
    public static final boolean method1013(byte arg0) {
        if (arg0 > -36) {
            return false;
        } else {
            field2080++;
            return class632.field8877 != 0;
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lqfa;J[Lmv;)V", line = 61)
    public class140(class106 arg0, long arg1, class394[] arg2) {
        this.field2083 = arg1;
        this.field2079 = arg0;
    }
}

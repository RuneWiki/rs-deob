import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class262 extends class189 {

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
    public static int[] field3862 = new int[5];

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "[I")
    public static int[] field3861 = new int[13];

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 3)
    public static void method1674(int arg0) {
        field3862 = null;
        if (arg0 != 11675) {
            method1674(97);
        }
        field3861 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(ZI)V", line = 15)
    public final void method55(boolean arg0, int arg1) {
        super.field2702.method2950(1, true);
        int var3 = 6 / ((36 - arg1) / 46);
        ++field3866;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V", line = 28)
    public final void method52(byte arg0, int arg1, int arg2) {
        if (arg0 != 117) {
            this.method51((class478) null, -18, (byte) -54);
        }
        ++field3864;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Z", line = 42)
    public final boolean method53(byte arg0) {
        int var2 = 126 / ((-58 - arg0) / 43);
        ++field3865;
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lsv;IB)V", line = 52)
    public final void method51(class478 arg0, int arg1, byte arg2) {
        ++field3860;
        super.field2702.method2968(arg0, -114);
        super.field2702.method2999(arg1, 96);
        if (arg2 != -58) {
            field3861 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lih;)V", line = 66)
    public class262(class503 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 74)
    public final void method48(boolean arg0) {
        if (arg0) {
            ++field3867;
            super.field2702.method2950(1, false);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V", line = 85)
    public final void method47(boolean arg0, int arg1) {
        ++field3863;
        if (arg1 != 2) {
            field3861 = null;
        }
    }
}

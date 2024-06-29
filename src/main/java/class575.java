import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class575 extends class260 {

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "Lbk;")
    public static class395 field8103;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZII)Z", line = 6)
    public static final boolean method3375(boolean arg0, int arg1, int arg2) {
        ++field8104;
        if (!arg0) {
            method3378(114, -41);
        }
        return class25.method238((byte) -78, arg1, arg2) & class132.method979(2048, arg1, arg2);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 17)
    public final void method126(int arg0) {
        if (super.field3829.method4081(24) == class588.field8297) {
            super.field3828 = 2;
        }
        ++field8110;
        if (super.field3828 < 0 || super.field3828 > 2) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            field8103 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)I", line = 34)
    public final int method3376(int arg0) {
        ++field8106;
        if (arg0 >= -14) {
            field8103 = null;
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(Z)V", line = 45)
    public static void method3377(boolean arg0) {
        if (!arg0) {
            field8103 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(II)I", line = 55)
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            method3379((byte) -33, 66);
        }
        ++field8105;
        return 1;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lgn;)V", line = 66)
    public class575(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IB)V", line = 78)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        if (arg1 != 122) {
            this.method3376(77);
        }
        ++field8108;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(ILgn;)V", line = 89)
    public class575(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(II)V", line = 93)
    public static final void method3378(int arg0, int arg1) {
        ++field8109;
        class313 var2 = class312.method1998((long) arg0, arg1, -1);
        var2.method2006(arg1 + 103);
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I", line = 109)
    public final int method123(int arg0) {
        ++field8107;
        if (arg0 != 4377) {
            field8103 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BI)V", line = 122)
    public static final void method3379(byte arg0, int arg1) {
        ++field8111;
        class254.field3744.method3741(arg1, 0);
        class225.field3465.method3741(arg1, 0);
        class31.field430.method3741(arg1, 0);
        class736.field10159.method3741(arg1, 0);
        int var2 = -107 / ((52 - arg0) / 62);
    }
}

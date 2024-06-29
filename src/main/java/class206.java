import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class206 extends class260 {

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lbu;")
    public static class21 field3191 = new class21(57, 0);

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lbu;")
    public static class21 field3193 = new class21(16, 6);

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            this.method126(122);
        }
        ++field3188;
        return 1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        ++field3187;
        if (super.field3828 != 0 && super.field3829.field10089.method124(-106) != 1) {
            super.field3828 = 0;
        }
        if (~super.field3828 > -1 || super.field3828 > 1) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            field3191 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        if (arg0 == 44) {
            field3191 = null;
            field3193 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        if (arg1 != 122) {
            this.method1432(15);
        }
        ++field3189;
        super.field3828 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        ++field3186;
        return ~arg1 != arg0 && super.field3829.field10089.method124(-124) != 1 ? 2 : 1;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lgn;)V")
    public class206(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z")
    public final boolean method1431(int arg0) {
        ++field3192;
        if (arg0 < 73) {
            this.method123(4);
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
    public final int method1432(int arg0) {
        ++field3190;
        if (arg0 > -14) {
            this.method126(77);
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILgn;)V")
    public class206(int arg0, class729 arg1) {
        super(arg0, arg1);
    }
}

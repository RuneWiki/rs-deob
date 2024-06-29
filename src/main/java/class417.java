import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class417 extends class147 implements class532 {

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Lkn;")
    private class770 field5888;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "[I")
    public static int[] field5883 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field5880 = 0;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Lke;")
    public static class622 field5887 = new class622(55, -1);

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)I", line = 3)
    public final int method51(byte arg0) {
        if (arg0 != -105) {
            field5887 = null;
        }
        ++field5884;
        return super.method51((byte) -105);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Log;Lkn;Z)V", line = 14)
    public class417(class673 arg0, class770 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field5888 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 25)
    public static void method2497(boolean arg0) {
        field5883 = null;
        field5887 = null;
        if (arg0) {
            field5880 = 1;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 38)
    public final void method50(boolean arg0, int arg1) {
        super.method50(arg0, this.field5888.field10608 * arg1);
        ++field5881;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z", line = 53)
    public final boolean method49(int arg0) {
        if (arg0 != -11488) {
            this.method47((byte) -37);
        }
        ++field5882;
        return super.method1011(false, super.field1887.field9532);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 75)
    public final Buffer method48(byte arg0, boolean arg1) {
        ++field5886;
        return arg0 != -31 ? null : super.method1012(super.field1887.field9532, arg1, (byte) -35);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 93)
    public final void method47(byte arg0) {
        ++field5885;
        if (arg0 > -18) {
            this.method50(false, 109);
        }
        super.method47((byte) -121);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Lkn;", line = 108)
    public final class770 method46(byte arg0) {
        ++field5889;
        return arg0 != -12 ? null : this.field5888;
    }
}

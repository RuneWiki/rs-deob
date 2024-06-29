import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class674 {

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public int field9586;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Lwq;")
    public static class674 field9587 = new class674(1);

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lwq;")
    public static class674 field9588 = new class674(2);

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Lwq;")
    public static class674 field9589 = new class674(4);

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "Lwq;")
    public static class674 field9590 = new class674(1);

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Lwq;")
    public static class674 field9591 = new class674(2);

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "Lwq;")
    public static class674 field9592 = new class674(4);

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lwq;")
    public static class674 field9593 = new class674(2);

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "Lwq;")
    public static class674 field9594 = new class674(4);

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
    public static int[] field9595;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)I")
    public static final int method3830(int arg0, int arg1) {
        if (arg0 != 825638312) {
            method3831(13);
        }
        field9585++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9583++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method3831(int arg0) {
        if (arg0 != -30335) {
            field9590 = null;
        }
        field9594 = null;
        field9588 = null;
        field9592 = null;
        field9595 = null;
        field9590 = null;
        field9589 = null;
        field9591 = null;
        field9587 = null;
        field9593 = null;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public static final void method3832(int arg0) {
        field9584++;
        class408.field5803 = class79.field1140.field7295 + class79.field1140.field7292 + 2;
        class249.field3619 = class119.field1635.field7295 + class119.field1635.field7292 + 2;
        class445.field6360 = new String[500];
        if (arg0 == -19663) {
            for (int var1 = 0; var1 < class445.field6360.length; var1++) {
                class445.field6360[var1] = "";
            }
            class646.method3726(class608.field8620.method3543(-24350, class45.field748), arg0 + 19557);
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
    private class674(int arg0) {
        this.field9586 = arg0;
    }
}

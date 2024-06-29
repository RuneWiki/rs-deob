import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class585 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field8491;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    private int field8496;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Ljk;")
    public static class585 field8495 = new class585(59, -1);

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field8498 = 0;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field8497 = 1401;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
    public static int[] field8499 = new int[32];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3394(boolean arg0) {
        field8495 = null;
        field8499 = null;
        if (!arg0) {
            field8499 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I", line = 21)
    public final int method3395(int arg0) {
        if (arg0 != 21811) {
            method3397(1, -59, -43);
        }
        field8494++;
        return this.field8496;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 33)
    public static final void method3396(int arg0) {
        if (arg0 == 0) {
            if (class298.field4019 == 2) {
                class271.field3698[0].method3148(class27.field609[0]);
                class271.field3698[1].method3148(class27.field609[1]);
            } else if (class298.field4019 == 3) {
                class271.field3698[0].method3148(class27.field609[0]);
                class271.field3698[1].method3148(class27.field609[1]);
                class271.field3698[2].method3148(class27.field609[2]);
            } else {
                class271.field3698[0].method3148(class27.field609[0]);
                class271.field3698[1].method3148(class27.field609[1]);
                class271.field3698[2].method3148(class27.field609[2]);
                class271.field3698[3].method3148(class27.field609[3]);
            }
        } else if (arg0 == 1) {
            if (class298.field4019 == 2) {
                class271.field3698[0].method3148(class27.field609[2]);
            } else if (class298.field4019 == 3) {
                class271.field3698[0].method3148(class27.field609[3]);
                class271.field3698[1].method3148(class27.field609[4]);
            } else {
                class271.field3698[0].method3148(class27.field609[4]);
                class271.field3698[1].method3148(class27.field609[5]);
                class271.field3698[2].method3148(class27.field609[6]);
            }
        } else if (arg0 == 2) {
            if (class298.field4019 == 2) {
                class271.field3698[0].method3148(class27.field609[3]);
                return;
            }
            if (class298.field4019 == 3) {
                class271.field3698[0].method3148(class27.field609[5]);
                return;
            }
            class271.field3698[0].method3148(class27.field609[7]);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V", line = 104)
    public static final void method3397(int arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            method3394(true);
        }
        field8493++;
        class233 var3 = class7.method44(0, 15, -1);
        var3.method1422(0);
        var3.field3114 = arg0;
        var3.field3116 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;", line = 129)
    public final String toString() {
        field8492++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(II)V", line = 136)
    public class585(int arg0, int arg1) {
        this.field8491 = arg1;
        this.field8496 = arg0;
    }
}

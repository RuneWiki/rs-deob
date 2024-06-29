import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class307 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lwha;")
    private class285 field4041;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Lvt;")
    public static class307 field4043 = new class307(0, 3, class285.field3593);

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Lvt;")
    public static class307 field4048 = new class307(1, 3, class285.field3593);

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Lvt;")
    public static class307 field4049 = new class307(2, 4, class285.field3589);

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lvt;")
    public static class307 field4050 = new class307(3, 1, class285.field3593);

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lvt;")
    public static class307 field4051 = new class307(4, 2, class285.field3593);

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Lvt;")
    public static class307 field4052 = new class307(5, 3, class285.field3593);

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "Lvt;")
    public static class307 field4053 = new class307(6, 4, class285.field3593);

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field4054 = class423.method2356(16, 1);

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "Lfq;")
    public static class204 field4055;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "[I")
    public static int[] field4057;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method1846(int arg0) {
        field4051 = null;
        field4050 = null;
        field4055 = null;
        field4053 = null;
        field4057 = null;
        field4052 = null;
        field4049 = null;
        field4043 = null;
        if (arg0 != 2000) {
            method1848(true);
        }
        field4048 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lvt;")
    public static final class307 method1847(int arg0, int arg1) {
        field4045++;
        if (arg1 == 0) {
            return field4043;
        } else if (arg1 == 1) {
            return field4048;
        } else if (arg1 == 2) {
            return field4049;
        } else if (arg1 == 3) {
            return field4050;
        } else if (arg1 == 4) {
            return field4051;
        } else if (arg1 == 5) {
            return field4052;
        } else if (arg1 == 6) {
            return field4053;
        } else {
            if (arg0 != 4) {
                field4052 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4044++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Z")
    public static final boolean method1848(boolean arg0) {
        field4042++;
        if (!arg0) {
            method1847(-105, 50);
        }
        if (class692.field9614 == null) {
            return false;
        } else {
            if (class692.field9614.field3478 >= 2000) {
                class692.field9614.field3478 -= 2000;
            }
            return class692.field9614.field3478 == 1007;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IILwha;)V")
    private class307(int arg0, int arg1, class285 arg2) {
        this.field4041 = arg2;
        this.field4040 = arg1;
        this.field4047 = arg0;
        this.field4046 = this.field4041.field3586 * this.field4040;
        if (this.field4047 >= 16) {
            throw new RuntimeException();
        }
    }
}

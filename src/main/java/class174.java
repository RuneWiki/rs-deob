import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class174 extends class152 {

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "Z")
    public static boolean field2741 = false;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2743 = "slide:";

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "Luh;")
    public class103 field2747;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lnk;")
    public static class130 field2745;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "[B")
    public byte[] field2744;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        if (arg0 != 0) {
            field2741 = true;
        }
        ++field2746;
        class204.field3185.method1888(101);
        class149.field2354.method1888(arg0 ^ 122);
        class266.field4246.method1888(-103);
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)[B")
    public final byte[] method1024(int arg0) {
        ++field2739;
        if (super.field2377) {
            throw new RuntimeException();
        } else {
            return arg0 >= -98 ? null : this.field2744;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)I")
    public final int method1026(boolean arg0) {
        ++field2749;
        if (super.field2377) {
            return 0;
        } else {
            if (!arg0) {
                method1182((byte) -70);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)V")
    public static final void method1181(byte arg0) {
        ++field2740;
        if (arg0 != -52) {
            method1183(-122, (class235) null, (class5) null, (class235) null, (class235) null);
        }
        class244.field3971.method1888(arg0 + -70);
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2745 = null;
        if (arg0 != 92) {
            field2743 = null;
        }
        field2743 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILhc;Lti;Lhc;Lhc;)Z")
    public static final boolean method1183(int arg0, class235 arg1, class5 arg2, class235 arg3, class235 arg4) {
        ++field2742;
        class103.field1730 = arg4;
        class71.field1129 = arg3;
        class8.field168 = arg1;
        if (arg0 != 0) {
            field2741 = true;
        }
        class6.field122 = arg2;
        return true;
    }
}

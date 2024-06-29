import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class288 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "J")
    public long field5129 = 0L;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Z")
    public static boolean field5139 = false;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lqk;")
    public static class207 field5138 = class24.method212(255, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Lqk;")
    public static class207 field5149 = class24.method212(255, "lila:");

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Lqk;")
    public static class207 field5148 = class24.method212(255, "M");

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Log;")
    public static class219 field5133 = new class219();

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Lqk;")
    public static class207 field5152 = class24.method212(255, "violet:");

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field5141;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public int field5143;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public int field5146;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Ldc;")
    public class235 field5136;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static final void method1963(int arg0) {
        if (arg0 == 1) {
            field5130++;
            class223.field4080.method1382(31346);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg2 >= class124.field2158 && arg1 <= class88.field1599 && arg5 >= class204.field3580 && class204.field3602 >= arg3) {
            if (arg0 == 1) {
                class230.method1653(arg3, 1, arg2, arg1, arg4, arg5);
            } else {
                class195.method1354(arg0, (byte) -73, arg1, arg4, arg2, arg5, arg3);
            }
        } else if (arg0 == 1) {
            class269.method1837(arg2, arg5, (byte) -114, arg3, arg4, arg1);
        } else {
            class75.method542(arg3, arg5, arg0, arg1, true, arg2, arg4);
        }
        if (arg6 <= 23) {
            field5133 = null;
        }
        field5134++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static final void method1965(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field5131++;
        if (class276.field4842 < 0) {
            class276.field4842 = 0;
            class48.field950 = -1;
            class62.field1137 = -1;
        }
        if (class276.field4842 > class197.field3463) {
            class62.field1137 = -1;
            class48.field950 = -1;
            class276.field4842 = class197.field3463;
        }
        if (class39.field786 < 0) {
            class62.field1137 = -1;
            class48.field950 = -1;
            class39.field786 = 0;
        }
        if (class70.field1253 < class39.field786) {
            class48.field950 = -1;
            class39.field786 = class70.field1253;
            class62.field1137 = -1;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static void method1966(int arg0) {
        field5133 = null;
        int var1 = -54 / ((-arg0 - 4) / 53);
        field5138 = null;
        field5149 = null;
        field5148 = null;
        field5152 = null;
    }
}

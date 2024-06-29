import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class284 {

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field4149 = 0;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4150 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4154 = 0;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "D")
    public static double field4156 = -1.0D;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4146 = "glow3:";

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lmi;")
    public static class408 field4148 = new class408();

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4157 = "Loading - please wait.";

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Loc;")
    public class93 field4143;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lqc;")
    public class95 field4144;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 5)
    public static void method1803(byte arg0) {
        field4150 = null;
        field4148 = null;
        field4157 = null;
        field4146 = null;
        if (arg0 != -15) {
            field4149 = 47;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lie;", line = 22)
    public static final class53 method1804(int arg0, byte arg1) {
        field4145++;
        class53 var2 = (class53) class446.field6487.method2319(-12, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class280.field4119.method1472(arg0, 1, 0);
        } else {
            var3 = class189.field2576.method1472(arg0 & 0x7FFF, 1, 0);
        }
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method362((byte) 72, new class265(var3));
        }
        if (arg0 >= 32768) {
            var4.method369(false);
        }
        int var5 = 52 / ((arg1 - 28) / 37);
        class446.field6487.method2318(var4, false, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(CZ)C", line = 53)
    public static final char method1805(char arg0, boolean arg1) {
        field4152++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else {
            return (char) (arg1 ? 65419 : Character.toTitleCase(arg0));
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 70)
    public static final void method1806(boolean arg0) {
        field4153++;
        if (!arg0) {
            class394.field5916.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqj;ZLqj;)V", line = 85)
    public static final void method1807(class238 arg0, boolean arg1, class238 arg2) {
        field4147++;
        class442.field6453 = arg0;
        class123.field1642 = arg2;
        if (arg1) {
            field4149 = -55;
        }
    }
}

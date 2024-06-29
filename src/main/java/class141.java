import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class141 {

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Z")
    public static boolean field1969 = false;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field1967 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[Lbi;")
    public static class91[] field1970;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 20)
    public static void method934(byte arg0) {
        if (arg0 <= 125) {
            field1967 = 88;
        }
        field1970 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lwl;", line = 30)
    public static final class96 method935(int arg0, int arg1, int arg2) {
        field1966++;
        class96 var3 = (class96) class7.field96.method1537((long) arg1 << 32 | (long) arg0, -22708);
        if (var3 == null) {
            var3 = new class96(arg1, arg0);
            class7.field96.method1541(false, var3, var3.field5065);
        }
        return arg2 < 43 ? (class96) null : var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(CII)I", line = 51)
    public static final int method936(char arg0, int arg1, int arg2) {
        field1964++;
        int var3 = 125 % ((arg1 - 71) / 43);
        int var4 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var4 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg2 == 0) {
            var4 = 1762;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I", line = 76)
    public static final int method937(int arg0) {
        field1968++;
        if (class334.field5162 == null) {
            return -1;
        }
        if (arg0 > -69) {
            field1970 = (class91[]) null;
        }
        while (class313.field4837 < class334.field5162.field4249) {
            if (class334.field5162.method1957(19160, class313.field4837)) {
                return class313.field4837++;
            }
            class313.field4837++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILwb;)Lwb;")
    public abstract class164 method933(int arg0, class164 arg1);
}

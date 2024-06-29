import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class151 extends class377 {

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public static int field1802 = -1;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "Lub;")
    public static class20 field1800;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "Liba;")
    public static class495 field1798;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "Lgi;")
    public static class635 field1801;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V", line = 3)
    public static void method938(int arg0) {
        field1801 = null;
        field1800 = null;
        field1798 = null;
        if (arg0 >= -100) {
            method939(-45, null);
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V", line = 15)
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILki;)Z", line = 21)
    public static final boolean method939(int arg0, class663 arg1) {
        field1797++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field8981) {
            return false;
        } else if (!arg1.method3688((byte) 127, class604.field8100)) {
            return false;
        } else if (class599.field8034.method3828((long) arg1.field9014, (byte) -91) != null) {
            return false;
        } else if (class512.field6430.method3828((long) arg1.field8986, (byte) -91) == null) {
            if (arg0 != 0) {
                field1801 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)V", line = 55)
    public static final void method940(int arg0) {
        field1803++;
        class176.method1051(arg0, class309.field3898, (long) class665.field9027);
        if (class305.field3866 != -1) {
            class569.method3015(class305.field3866, (byte) 58);
        }
        for (int var1 = 0; var1 < class211.field2489; var1++) {
            if (class58.field743[var1]) {
                class128.field1559[var1] = true;
            }
            class33.field516[var1] = class58.field743[var1];
            class58.field743[var1] = false;
        }
        class448.field5648 = class665.field9027;
        if (class309.field3898.method419()) {
            class413.field5288 = true;
        }
        if (class305.field3866 != -1) {
            class211.field2489 = 0;
            class568.method3012(-31456);
        }
        class309.field3898.method410();
        class96.method715(7, class309.field3898);
        int var2 = class292.method1760(105);
        if (var2 == -1) {
            var2 = class530.field6684;
        }
        if (var2 == -1) {
            var2 = class585.field7863;
        }
        class288.method1732(var2, arg0 - 16340);
        class231.field3008 = 0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)[I", line = 106)
    public final int[] method88(int arg0, int arg1) {
        int var3 = 40 / ((arg1 - 5) / 53);
        field1796++;
        return class136.field1654;
    }
}

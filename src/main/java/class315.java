import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class315 extends class165 {

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "[[I")
    public static int[][] field4882 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "B")
    public byte field4875;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Ljava/lang/String;")
    public String field4871;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4873;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Ljava/lang/String;")
    public String field4876;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I", line = 8)
    public static final int method2212(boolean arg0) {
        if (!arg0) {
            method2214((class334) null, -96);
        }
        field4881++;
        return class13.field151 && class117.field1770[81] && class185.field3070 > 2 ? class212.field3474[class185.field3070 - 2] : class212.field3474[class185.field3070 - 1];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V", line = 25)
    public static final void method2213(byte arg0, int arg1) {
        class344 var2 = class110.method759(2, arg1, false);
        var2.method2384(-27354);
        field4874++;
        if (arg0 != -101) {
            field4882 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lqm;I)V", line = 38)
    public static final void method2214(class334 arg0, int arg1) {
        field4878++;
        if (arg1 != 0) {
            field4882 = (int[][]) ((int[][]) null);
        }
        class155 var2 = (class155) class77.field1091.method451(class204.method1491(-26916, arg0.field5216), (byte) 100);
        if (var2 == null) {
            return;
        }
        if (var2.field2375 != null) {
            class191.field3127.method118(var2.field2375);
            var2.field2375 = null;
        }
        var2.method1212((byte) 83);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BB)[B", line = 67)
    public static final byte[] method2215(byte[] arg0, byte arg1) {
        if (arg1 <= 28) {
            method2213((byte) 96, -114);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        field4880++;
        class9.method46(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 82)
    public static void method2216(byte arg0) {
        field4882 = (int[][]) null;
        field4873 = null;
        if (arg0 >= -38) {
            method2212(false);
        }
    }
}

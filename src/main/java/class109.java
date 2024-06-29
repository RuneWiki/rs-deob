import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class109 {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lsc;")
    public static class181 field1782 = class149.method967(255, "loginscreen");

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1781 = 0;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[Ljc;")
    public static class8[] field1784 = new class8[4];

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1787 = 0;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lsc;")
    public static class181 field1785 = class149.method967(255, "");

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method728(byte arg0) {
        field1782 = null;
        field1784 = null;
        if (arg0 < 118) {
            method728((byte) 94);
        }
        field1785 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
    public static final void method729(int arg0, boolean arg1) {
        field1783++;
        class76.field1222 = -1;
        if (!arg1) {
            method729(-82, false);
        }
        class203.field3489 = arg0;
        class76.field1222 = -1;
        class25.method218(126);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method730(int arg0) {
        field1780++;
        for (int var1 = arg0; var1 < class152.field2538; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class218.field3750[var1];
            }
            class116 var3 = class39.field602[var2];
            if (var3 != null) {
                class148.method965(var3, -32342, var3.field2619);
            }
        }
    }
}

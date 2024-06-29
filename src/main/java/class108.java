import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class108 {

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lqk;")
    public static class148 field1547 = null;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lcj;")
    public static class443 field1545;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 5)
    public static void method729(int arg0) {
        field1547 = null;
        if (arg0 != 19018) {
            field1545 = null;
        }
        field1545 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lvj;I)V", line = 19)
    public static final void method730(class26 arg0, int arg1) {
        field1544++;
        if ((arg0.field279.length - arg0.field330) < 1) {
            return;
        }
        int var2 = arg0.method194((byte) 119);
        if (var2 < 0 || var2 > 1 || (arg0.field279.length - arg0.field330) < 2) {
            return;
        }
        int var3 = arg0.method193(arg1 + 30826);
        if ((arg0.field279.length - arg0.field330) < (var3 * 6)) {
            return;
        }
        if (arg1 != -30824) {
            field1547 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method193(arg1 + 30826);
            int var6 = arg0.method189(255);
            if (class594.field8568.length > var5 && class504.field7038[var5] && (class468.field6403.method761(var5, 11).field1666 != '1' || var6 >= -1 && var6 <= 1)) {
                class594.field8568[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 67)
    public static final void method731(byte arg0) {
        field1546++;
        if (class218.field3089) {
            return;
        }
        if (arg0 != 78) {
            method731((byte) 90);
        }
        class263.field3586 = true;
        class218.field3089 = true;
        class196.field2836 += (12.0F - class196.field2836) / 2.0F;
    }
}

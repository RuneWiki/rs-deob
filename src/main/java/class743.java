import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class743 {

    @OriginalMember(owner = "client!lja", name = "d", descriptor = "[Lma;")
    public static class14[] field10052 = null;

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "Lkw;")
    public static class263 field10050 = new class263("runescape", 0);

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!lja", name = "e", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IILjava/lang/String;)V", line = 6)
    public static final void method4082(int arg0, int arg1, String arg2) {
        class26.method148(0, arg2, -126, "", arg1, "", "");
        if (arg0 >= -124) {
            field10050 = null;
        }
        field10053++;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIBLcm;I)V", line = 19)
    public static final void method4083(int arg0, int arg1, byte arg2, class758 arg3, int arg4) {
        field10051++;
        int var5 = arg3.field6198[0];
        int var6 = arg3.field6197[0];
        if (var5 < 0 || class102.field1467 <= var5 || var6 < 0 || class393.field5663 <= var6 || arg4 < 0 || class102.field1467 <= arg4 || arg1 < 0 || class393.field5663 <= arg1) {
            return;
        }
        int var7 = class22.method121(-4, arg4, 0, class719.field9786, arg1, true, 0, var6, var5, class257.field3830[arg3.field2813], 0, 0, class605.field8203, arg3.method2563(-12840), 0);
        if (arg0 >= ~var7 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg3.method4154(arg2, class719.field9786[var8], arg0 + 4, class605.field8203[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V", line = 54)
    public static void method4084(int arg0) {
        if (arg0 == 0) {
            field10052 = null;
            field10050 = null;
        }
    }
}

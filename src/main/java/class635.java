import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class635 {

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIB)I")
    public static final int method3511(int arg0, int arg1, byte arg2) {
        if (arg2 >= -11) {
            return -121;
        }
        field8559++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lbi;Lbi;Lbi;ILbi;)V")
    public static final void method3512(class449 arg0, class449 arg1, class449 arg2, int arg3, class449 arg4) {
        class169.field2611 = arg4;
        class301.field4204 = arg1;
        field8560++;
        class618.field8196 = arg2;
        class601.field7977 = new class625[class169.field2611.method2545(arg3 - 401887757)][];
        class569.field7567 = new boolean[class169.field2611.method2545(0)];
        if (arg3 != 401887757) {
            method3512(null, null, null, -40, null);
        }
    }
}

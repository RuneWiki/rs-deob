import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class769 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lqk;")
    public static class1 field10587 = new class1(37, 3);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[I")
    public static int[] field10588 = new int[13];

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)V")
    public static final void method4249(int arg0, byte arg1, int arg2) {
        field10590++;
        if (class80.field901 != arg0) {
            class404.field5705 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class404.field5705[var3] = (var3 << 12) / arg0;
            }
            class639.field8988 = arg0 - 1;
            class80.field901 = arg0;
            class689.field9608 = arg0 * 32;
        }
        if (arg1 != -77) {
            field10588 = null;
        }
        if (class291.field4285 == arg2) {
            return;
        }
        if (class80.field901 == arg2) {
            class300.field4352 = class404.field5705;
        } else {
            class300.field4352 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class300.field4352[var4] = (var4 << 12) / arg2;
            }
        }
        class291.field4285 = arg2;
        class385.field5505 = arg2 - 1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method4250(int arg0) {
        field10588 = null;
        field10587 = null;
        int var1 = 127 % ((65 - arg0) / 60);
    }
}

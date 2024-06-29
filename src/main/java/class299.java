import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class299 {

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field4755 = 2;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "[I")
    public static int[] field4753 = new int[14];

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field4752 = 0;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BII)V", line = 11)
    public static final void method2017(byte arg0, int arg1, int arg2) {
        if (arg0 != 47) {
            return;
        }
        field4754++;
        if (class369.field5610 != arg1) {
            class79.field995 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class79.field995[var3] = (var3 << 12) / arg1;
            }
            class156.field2452 = arg1 * 32;
            class106.field1492 = arg1 - 1;
            class369.field5610 = arg1;
        }
        if (class312.field4921 == arg2) {
            return;
        }
        if (class369.field5610 == arg2) {
            class132.field2064 = class79.field995;
        } else {
            class132.field2064 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class132.field2064[var4] = (var4 << 12) / arg2;
            }
        }
        class312.field4921 = arg2;
        class246.field4033 = arg2 - 1;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 68)
    public static void method2018(int arg0) {
        field4753 = null;
        if (arg0 != 2) {
            method2018(28);
        }
    }
}

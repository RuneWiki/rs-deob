import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class310 {

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "S")
    public static short field3855 = 32767;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Lsq;")
    public static class178 field3854 = new class178(0, 2, 2, 1);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V", line = 4)
    public static void method1846(byte arg0) {
        if (arg0 != -7) {
            field3855 = 107;
        }
        field3854 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1847(int arg0) {
        field3853++;
        class635.field9137.method310((byte) 69);
        for (int var1 = 0; var1 < 32; var1++) {
            class421.field6091[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class718.field10078[var2] = 0L;
        }
        class5.field39 = 0;
    }
}

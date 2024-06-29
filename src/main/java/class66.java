import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class66 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Llg;")
    public static class237 field755 = new class237(50);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public static int[] field758 = new int[4096];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method373(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class311.field4398.length; var1++) {
            for (int var2 = 0; var2 < class311.field4398[var1].length; var2++) {
                class311.field4398[var1][var2] = class82.field951;
            }
        }
        field756++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 37)
    public static void method374(int arg0) {
        field755 = null;
        field758 = null;
        if (arg0 != 0) {
            method373(true);
        }
    }
}

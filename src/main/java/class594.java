import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class594 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
    public static int[] field8433 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
    public static final void method3329(int arg0, boolean arg1) {
        class73.method470((byte) 84);
        if (arg0 != 97) {
            field8433 = null;
        }
        field8435++;
        if (!class621.method3481(-122, class351.field4601)) {
            return;
        }
        class404.field5378++;
        if (class404.field5378 < 50 && !arg1) {
            return;
        }
        class404.field5378 = 0;
        if (!class236.field3000 && class170.field2043 != null) {
            class480.method2802(class5.field36, 16751);
            class438.field6095++;
            try {
                class170.field2043.method1641(-32754, 0, class334.field4314.field6215, class334.field4314.field6209);
                class334.field4314.field6215 = 0;
            } catch (IOException var2) {
                class236.field3000 = true;
            }
        }
        class73.method470((byte) 84);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
    public static final boolean method3330(int arg0, int arg1, int arg2) {
        field8434++;
        if (arg2 != -22077) {
            field8433 = null;
        }
        return class451.method2505((byte) -81, arg1, arg0) | (arg1 & 0x70000) != 0 || class127.method732(arg1, arg0, (byte) -121);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static void method3331(boolean arg0) {
        if (!arg0) {
            method3331(false);
        }
        field8433 = null;
    }
}

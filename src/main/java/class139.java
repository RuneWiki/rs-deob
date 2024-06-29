import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class139 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Z")
    public static volatile boolean field2478 = true;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[I")
    public static int[] field2477 = new int[32];

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field2479 = 0;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public static int[] field2480;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method951(byte arg0) {
        field2480 = null;
        if (arg0 == -117) {
            field2477 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
    public static final void method952(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class75.field1463[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class7 var5 = var4.field3022;
        if (var5 != null) {
            var5.field148 = var5.field148 * arg3 / 16;
            var5.field150 = var5.field150 * arg3 / 16;
        }
    }
}

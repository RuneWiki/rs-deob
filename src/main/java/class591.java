import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class591 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lcfa;")
    public static class179 field8327 = new class179();

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field8330 = 0;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
    public static final void method3439() {
        for (int var0 = 0; var0 < class16.field297.length; var0++) {
            class16.field297[var0].method4246();
        }
        class16.field297 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method3440(byte arg0) {
        if (arg0 != 11) {
            field8329 = -93;
        }
        field8327 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
    public static final boolean method3441(int arg0, int arg1, int arg2) {
        if (arg1 <= 36) {
            field8329 = -25;
        }
        field8328++;
        return (arg0 & 0x800) != 0;
    }
}

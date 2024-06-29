import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class634 extends class435 {

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "[I")
    public static int[] field8978 = null;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Lvo;")
    public static class345 field8977;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)I")
    public abstract int method332(byte arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
    public abstract int method334(boolean arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
    public abstract int method338(int arg0);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)J")
    public abstract long method335(int arg0);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public static void method3572(int arg0) {
        field8977 = null;
        field8978 = null;
        if (arg0 != 2) {
            field8978 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
    public abstract int method333(int arg0);
}

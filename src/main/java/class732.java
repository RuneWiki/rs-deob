import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class732 {

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public int field10193 = 0;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public int field10199 = 2048;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public int field10195 = 2048;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public int field10197 = 0;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field10198 = 0;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "Z")
    public static boolean field10192;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "[Lgg;")
    public static class176[] field10200;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)V")
    public static void method4099(boolean arg0) {
        field10200 = null;
        if (!arg0) {
            field10198 = -58;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLji;)V")
    public final void method4100(byte arg0, class611 arg1) {
        if (arg0 <= 54) {
            this.method4100((byte) 108, null);
        }
        while (true) {
            int var3 = arg1.method3428((byte) -108);
            if (var3 == 0) {
                field10196++;
                return;
            }
            this.method4101(var3, arg1, 116);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILji;I)V")
    private final void method4101(int arg0, class611 arg1, int arg2) {
        field10194++;
        if (arg2 <= 88) {
            this.method4101(-8, null, -88);
        }
        if (arg0 == 1) {
            this.field10197 = arg1.method3428((byte) 21);
        } else if (arg0 == 2) {
            this.field10199 = arg1.method3402((byte) 127);
        } else if (arg0 == 3) {
            this.field10195 = arg1.method3402((byte) 127);
        } else if (arg0 == 4) {
            this.field10193 = arg1.method3413(false);
            return;
        }
    }
}

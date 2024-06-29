import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class785 implements class381 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public int field10790;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public int field10789;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[F")
    public float[] field10792;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "F")
    public static float field10791;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field10788;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field10793;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIILln;I)Z")
    public static final boolean method4306(int arg0, int arg1, int arg2, int arg3, int arg4, class398 arg5, int arg6) {
        field10793++;
        if (!class14.field144 || !class717.field9767) {
            return false;
        }
        if (arg0 != 8833) {
            method4307(-122, -47, 12, 24);
        }
        if (class267.field3915 < 100) {
            return false;
        } else if (arg2 != arg6 || arg1 != arg4) {
            for (int var7 = arg6; var7 <= arg2; var7++) {
                for (int var8 = arg4; var8 <= arg1; var8++) {
                    if (class712.field9720[arg3][var7][var8] == -class228.field2949) {
                        return false;
                    }
                }
            }
            if (class706.method3924(arg5, false)) {
                class479.field6729++;
                return true;
            } else {
                return false;
            }
        } else if (!class482.method2835(101, arg3, arg6, arg4)) {
            return false;
        } else if (class706.method3924(arg5, false)) {
            class479.field6729++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(II)V")
    public class785(int arg0, int arg1) {
        this.field10790 = arg1;
        this.field10789 = arg0;
        this.field10792 = new float[arg0 * arg1];
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)V")
    public static final void method4307(int arg0, int arg1, int arg2, int arg3) {
        class194 var4 = class443.field6387[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class569 var5 = var4.field2529;
        class569 var6 = var4.field2531;
        if (var5 != null) {
            var5.field7762 = (short) (var5.field7762 * arg3 / (0x10 << class478.field6717 - 7));
            var5.field7765 = (short) (var5.field7765 * arg3 / (0x10 << class478.field6717 - 7));
        }
        if (var6 != null) {
            var6.field7762 = (short) (var6.field7762 * arg3 / (0x10 << class478.field6717 - 7));
            var6.field7765 = (short) (var6.field7765 * arg3 / (0x10 << class478.field6717 - 7));
        }
    }
}

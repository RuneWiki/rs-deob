import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class598 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field8341;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lqga;")
    public class187 field8342;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
    public int[] field8339;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public static final void method3394(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 126) {
            method3395(-117, 68, 95);
        }
        field8340++;
        if (arg1 != 8 && arg1 != 16) {
            class14 var5 = class197.field2689[arg0][arg2][arg4];
            if (var5 != null) {
                if (arg1 == 1) {
                    var5.field285 = 0;
                } else if (arg1 == 2) {
                    var5.field286 = 0;
                }
            }
            class701.method3946(false);
            return;
        }
        for (int var6 = 0; var6 < class291.field3814; var6++) {
            class222 var7 = class737.field10238[var6];
            if (var7.field2972 == arg1 && var7.field2964 == arg2 && var7.field2962 == arg4 || var7.field2970 == arg2 && var7.field2962 == arg4) {
                if (class291.field3814 != var6) {
                    class135.method993(class737.field10238, var6 + 1, class737.field10238, var6, -var6 - (1 - class737.field10238.length));
                }
                class291.field3814--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
    public static final int method3395(int arg0, int arg1, int arg2) {
        if (arg0 != 12345678) {
            return 107;
        }
        field8343++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}

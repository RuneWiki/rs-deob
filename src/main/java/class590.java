import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class590 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "Lcw;")
    public static class21 field8471;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "Lsu;")
    public class590 field8467;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "Lgs;")
    public class743 field8468;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)Lei;", line = 7)
    public static final class183 method3503(boolean arg0) {
        field8469++;
        if (!arg0) {
            field8466 = 99;
        }
        return class364.field4657 < class571.field8083.length ? class571.field8083[class364.field4657++] : null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIBIIII)V", line = 23)
    public static final void method3504(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field8470++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class610.field8686 - class13.field179) * var8 / 100 + class13.field179;
        class527.field7375 = class527.field7374 * var9 >> 8;
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class231.field3217[var11] * -var10 >> 14;
            var15 = class231.field3218[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class231.field3217[var12] * var15 >> 14;
            var15 = class231.field3218[var12] * var15 >> 14;
        }
        class24.field266 = arg4 - var13;
        class520.field7268 = 0;
        class57.field798 = arg5 - var14;
        class645.field9148 = arg1;
        class403.field5594 = arg2;
        class235.field3250 = arg0 - var15;
        if (arg3 <= 34) {
            field8466 = -109;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 83)
    public final void method3505(int arg0) {
        field8465++;
        if (class232.field3221 < arg0) {
            this.field8468 = null;
            this.field8467 = class164.field2256;
            class232.field3221++;
            class164.field2256 = this;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V", line = 97)
    public static void method3506(int arg0) {
        field8471 = null;
        if (arg0 >= -78) {
            method3503(false);
        }
    }
}

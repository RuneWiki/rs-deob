import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class481 {

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "J")
    public long field6727;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "[I")
    public int[] field6722;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "[S")
    public short[] field6719;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "[S")
    public short[] field6726;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6718 = null;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field6720 = -1;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Lwb;")
    public static class350 field6724;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Lbt;")
    public static class48 field6728;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 3)
    public static void method2856(byte arg0) {
        field6718 = null;
        field6724 = null;
        field6728 = null;
        if (arg0 <= 88) {
            field6720 = 3;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIII)V", line = 16)
    public static final void method2857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6725++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class380.field4821 - class722.field10135) * var8 / 100 + class722.field10135;
        if (arg1 != -5586) {
            return;
        }
        class621.field8528 = class621.field8527 * var9 >> 8;
        int var10 = arg3 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class789.field10868[var11] * -var10 >> 14;
            var15 = class789.field10864[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class789.field10868[var12] * var15 >> 14;
            var15 = class789.field10864[var12] * var15 >> 14;
        }
        class599.field8107 = arg5 - var13;
        class793.field10893 = arg6;
        class111.field1405 = arg7;
        class303.field3622 = arg0 - var14;
        class641.field8758 = 0;
        class350.field4366 = arg2 - var15;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILbt;)Ltf;", line = 83)
    public static final class312 method2858(int arg0, int arg1, class48 arg2) {
        field6723++;
        class312 var3 = (class312) class198.field2363.method1684((long) arg0, -359);
        if (var3 == null) {
            if (class625.field8573) {
                var3 = class363.field4526.method640(class600.method3431(arg2, arg0), true);
            } else {
                var3 = class748.method4180(0, arg2.method453(arg0, 11040));
            }
            class198.field2363.method1686(-25638, (long) arg0, var3);
        }
        return arg1 == -1 ? var3 : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Lkq;", line = 109)
    public static final class620 method2859(int arg0, int arg1, int arg2) {
        field6721++;
        class620 var3 = class479.method2848(arg1, (byte) -116);
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg2 != 16383) {
                field6724 = null;
            }
            return var3 == null || var3.field8343 == null || var3.field8343.length <= arg0 ? null : var3.field8343[arg0];
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(J[I[S[S)V", line = 130)
    public class481(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field6727 = arg0;
        this.field6722 = arg1;
        this.field6719 = arg3;
        this.field6726 = arg2;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V", line = 140)
    protected class481() {
    }
}

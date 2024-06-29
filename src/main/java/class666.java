import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class666 {

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field9038 = 0;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "[I")
    public static int[] field9046 = new int[1];

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "Lhs;")
    public static class304 field9048 = new class304();

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public int field9039;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public int field9040;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public int field9047;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "Lts;")
    public static class501 field9041;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "[S")
    public static short[] field9042;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lji;I)V")
    public final void method3703(class572 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                field9045++;
                if (arg1 != 0) {
                    method3707(25, null, 52, -85, -27);
                    return;
                }
                return;
            }
            this.method3704(arg0, -104, var3);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lji;II)V")
    private final void method3704(class572 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field9039 = arg0.method3031(-1);
            this.field9040 = arg0.method3097((byte) 12);
            this.field9047 = arg0.method3097((byte) 12);
        }
        if (arg1 >= -55) {
            this.field9039 = -44;
        }
        field9037++;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIII)Lip;")
    public static final class662 method3705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9044++;
        long var7 = (long) arg1 * 76724863L ^ (long) arg0 * 986053L ^ (long) arg4 * 97549L ^ (long) arg2 * 67481L ^ (long) arg6 * 475427L ^ (long) arg5 * 32147369L;
        class662 var9 = (class662) class531.field6705.method1221(var7, true);
        if (var9 != null) {
            return var9;
        }
        class662 var10 = class71.field919.method483(arg2, arg4, arg6, arg0, arg5, arg1);
        class531.field6705.method1230((byte) 81, var7, var10);
        if (arg3 != 5179) {
            method3707(63, null, -74, 35, -16);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public static void method3706(int arg0) {
        if (arg0 == 1) {
            field9046 = null;
            field9041 = null;
            field9042 = null;
            field9048 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILjaa;III)Lhq;")
    public static final class148 method3707(int arg0, class576 arg1, int arg2, int arg3, int arg4) {
        field9043++;
        if (arg2 != 10388) {
            return null;
        } else if (!arg1.field7709 && (!class182.method1084((byte) -24, arg4) || !class182.method1084((byte) -56, arg3))) {
            return arg1.field7651 ? new class148(arg1, 34037, arg0, arg4, arg3) : new class148(arg1, arg0, arg4, arg3, class560.method2979(arg4, (byte) 38), class560.method2979(arg3, (byte) 10));
        } else {
            return new class148(arg1, 3553, arg0, arg4, arg3);
        }
    }
}

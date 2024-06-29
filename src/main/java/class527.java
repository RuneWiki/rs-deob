import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class527 {

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
    public static int field7429 = -1;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public int field7420;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public int field7421;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public int field7424;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public int field7425;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public int field7427;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public int field7431;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "[B")
    public byte[] field7422;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "[B")
    public byte[] field7423;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "[Lrga;")
    public static class215[] field7418;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IILpu;Lpu;)V")
    public static final void method3020(int arg0, int arg1, class522 arg2, class522 arg3) {
        field7426++;
        if (arg1 != 3) {
            field7429 = 104;
        }
        class513.field7219 = arg3;
        class564.field7966 = arg2;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
    public static final void method3021(int arg0, int arg1) {
        class444.field6469 = arg1;
        class394.field5835 = 100;
        class511.field7190 = -1;
        field7428++;
        class14.field132 = 3;
        if (arg0 != -2) {
            field7429 = 115;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method3022(int arg0) {
        if (arg0 == 19879) {
            field7418 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)I")
    public static final int method3023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg1;
            arg1 = var7;
        }
        field7419++;
        int var8 = arg3 & 0x3;
        if (~var8 == arg0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 - arg2 - (arg4 + -1);
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return arg2;
        }
    }
}

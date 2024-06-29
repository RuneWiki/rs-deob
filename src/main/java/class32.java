import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class32 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "S")
    public static short field452 = 256;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljo;")
    public static class382 field451 = new class382(4);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method278(int arg0) {
        if (arg0 != 2277) {
            method279((byte) 110);
        }
        field451 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lhv;")
    public static final class149 method279(byte arg0) {
        if (arg0 < 120) {
            field452 = 53;
        }
        field450++;
        return class137.field2018;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZZ)Z")
    public static boolean method280(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        field453++;
        if (var7 == 0) {
            return arg4;
        } else if (arg5 != 7) {
            return -103;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg6;
        } else {
            return 7 + 1 - arg3 - arg2;
        }
    }
}

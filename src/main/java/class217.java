import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class217 {

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lia;")
    private static class257 field3681 = class28.method234(-127, "Select a world");

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lia;")
    public static class257 field3677 = field3681;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field3675 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public int field3690;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    public static int[] field3673;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method1440(byte arg0) {
        field3677 = null;
        field3673 = null;
        int var1 = -75 % ((arg0 + 60) / 50);
        field3681 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILme;IIIIIB)V")
    public static final void method1441(int arg0, class44 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3676++;
        if (class95.field1800) {
            class25.field493 = 32;
        } else {
            class25.field493 = 0;
        }
        if (arg7 != 123) {
            return;
        }
        class95.field1800 = false;
        if (class94.field1780 != 0) {
            if (arg6 <= arg2 && arg2 < arg6 + 16 && arg4 >= arg0 && arg0 + 16 > arg4) {
                arg1.field873 -= 4;
                class257.method1718(false, arg1);
            } else if (arg2 >= arg6 && arg2 < (arg6 + 16) && arg4 >= (arg0 + arg5 - 16) && arg4 < (arg0 + arg5)) {
                arg1.field873 += 4;
                class257.method1718(false, arg1);
            } else if (arg2 >= arg6 - class25.field493 && (arg6 + class25.field493 + 16) > arg2 && arg4 >= (arg0 + 16) && arg4 < (arg0 - (16 - arg5))) {
                int var8 = (arg5 - 32) * arg5 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - (var8 / 2) - arg0 - 16;
                int var10 = arg5 - var8 - 32;
                arg1.field873 = (arg3 - arg5) * var9 / var10;
                class257.method1718(false, arg1);
                class95.field1800 = true;
            }
        }
        if (class45.field1044 == 0) {
            return;
        }
        int var11 = arg1.field926;
        if (arg6 - var11 <= arg2 && arg4 >= arg0 && (arg6 + 16) > arg2 && arg0 + arg5 >= arg4) {
            arg1.field873 += class45.field1044 * 45;
            class257.method1718(false, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
    public static final int method1442(int arg0, int arg1, int arg2) {
        field3688++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == arg1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }
}

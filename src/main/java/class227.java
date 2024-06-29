import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class227 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3465 = 1;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "S")
    public static short field3468 = 256;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1610(int arg0) {
        class241.method1672(0, -125, 0);
        if (arg0 <= 5) {
            field3468 = 54;
        }
        field3466++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)I", line = 29)
    public static final int method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3470++;
        int var7 = arg6 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg0;
            arg0 = var8;
        }
        int var9 = -13 % ((-arg5 - 15) / 34);
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 - (arg1 + arg3 - 1);
        } else {
            return 1 + 7 - arg0 - arg4;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 61)
    public static final void method1612(boolean arg0) {
        class35.field509.method750((byte) 119);
        if (arg0) {
            method1611(4, -70, 104, -112, 43, 44, -100);
        }
        field3467++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)I", line = 75)
    public static final int method1613(int arg0) {
        if (arg0 == 6) {
            field3469++;
            return 6;
        } else {
            return -126;
        }
    }
}

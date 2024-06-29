import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class244 extends class86 {

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    private int field3792;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    private int field3775;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Lta;")
    public static class262 field3782 = new class262(64);

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Z")
    public static boolean field3791 = false;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static void method1651(int arg0) {
        field3782 = null;
        if (arg0 != 104) {
            method1651(-42);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    public static final boolean method1652(int arg0, int arg1) {
        field3780++;
        if (arg0 >= -29) {
            return false;
        } else if (class83.field1376 == arg1) {
            return false;
        } else {
            class295.field4643 = new int[104][104];
            class290.field4566 = new int[4][13][13];
            for (int var2 = 0; var2 < 4; var2++) {
                class72.field1142[var2] = new class77(104, 104);
            }
            class191.field3041 = new byte[4][104][104];
            class140.field2150 = new byte[4][104][104];
            class83.field1376 = arg1;
            class293.field4613 = new class149[4][104][104];
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)[I")
    public final int[] method1653(int arg0, int arg1, int arg2) {
        field3774++;
        return arg0 <= 20 ? null : new int[] { this.field3777, this.field3793 + arg1 - this.field3783, arg2 - (-this.field3778 + this.field3792) };
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZII)Z")
    public final boolean method1654(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.method1653(-99, -92, 67);
        }
        field3781++;
        return this.field3775 == arg2 && this.field3783 <= arg0 && this.field3785 >= arg0 && this.field3792 <= arg3 && this.field3790 >= arg3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BII)Z")
    public final boolean method1655(byte arg0, int arg1, int arg2) {
        if (arg0 != -108) {
            this.method1653(-112, 119, -111);
        }
        field3776++;
        return this.field3793 <= arg1 && this.field3787 >= arg1 && this.field3778 <= arg2 && this.field3789 >= arg2;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)[I")
    public final int[] method1656(int arg0, int arg1, byte arg2) {
        field3784++;
        return arg2 == 118 ? new int[] { this.field3775, this.field3783 + arg1 - this.field3793, -this.field3778 + this.field3792 + arg0 } : null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)Z")
    public final boolean method1657(int arg0, byte arg1, int arg2) {
        field3773++;
        if (arg1 != 96) {
            this.method1656(-11, -58, (byte) -1);
        }
        return this.field3783 <= arg2 && this.field3785 >= arg2 && this.field3792 <= arg0 && this.field3790 >= arg0;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3783 = arg2;
        this.field3792 = arg3;
        this.field3793 = arg6;
        this.field3787 = arg8;
        this.field3775 = arg0;
        this.field3777 = arg1;
        this.field3785 = arg4;
        this.field3789 = arg9;
        this.field3778 = arg7;
        this.field3790 = arg5;
    }
}

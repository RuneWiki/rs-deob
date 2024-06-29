import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class566 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[[I")
    public static int[][] field8072 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[I")
    public static int[] field8076 = new int[5];

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "F")
    public static float field8073;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public static final void method3208(int arg0, int arg1) {
        field8075++;
        class235.method1397(73);
        int var2 = class624.field8826.method3688(arg0, (byte) -89).field5384;
        if (var2 == 0 || arg1 != 5) {
            return;
        }
        int var3 = class628.field8859.field3693[arg0];
        if (var2 == 5) {
            class436.field6145 = var3;
        }
        if (var2 == 6) {
            class673.field9372 = var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public abstract void method243(int arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZII)V")
    public static final void method3209(int arg0, boolean arg1, int arg2, int arg3) {
        field8071++;
        if (!arg1) {
            method3208(-96, 114);
        }
        if (arg0 == 1008) {
            class281.method1649(class538.field7571, arg2, arg3);
        } else if (arg0 == 1001) {
            class281.method1649(class410.field5470, arg2, arg3);
        } else if (arg0 == 1012) {
            class281.method1649(class315.field3913, arg2, arg3);
        } else if (arg0 == 1010) {
            class281.method1649(class94.field965, arg2, arg3);
            return;
        } else if (arg0 == 1002) {
            class281.method1649(class600.field8446, arg2, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public abstract void method244(int arg0);

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
    public abstract int method252(int arg0);

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z")
    public abstract boolean method250(int arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I")
    public abstract int method253(boolean arg0);

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Laaa;")
    public abstract class103 method249(int arg0);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
    public abstract boolean method245(int arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method3210(byte arg0) {
        field8072 = null;
        field8076 = null;
        if (arg0 > -73) {
            field8073 = -2.4704106F;
        }
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)Z")
    public final boolean method3211(int arg0) {
        field8074++;
        if (arg0 == -15540) {
            return this.method245(20822) || this.method248(127) || this.method250(-93);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "(I)Z")
    public abstract boolean method248(int arg0);
}

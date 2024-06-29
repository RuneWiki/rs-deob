import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class265 {

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "B")
    public byte field3891;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "S")
    public short field3892;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "Z")
    public boolean field3890;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "S")
    public short field3894;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "S")
    public short field3889;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "Lst;")
    public static class335 field3896;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "Z")
    public static boolean field3893;

    static {
        new class585("", 76);
        field3896 = new class335(16, 16);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIBI)V", line = 13)
    public static final void method1812(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3885++;
        if (arg4 != 51) {
            method1812(-26, 47, -33, -103, (byte) -68, -35);
        }
        if (arg1 == arg5) {
            class500.method3018(arg3, arg5, 49, arg0, arg2);
        } else if (class607.field8185 <= arg3 - arg5 && arg3 + arg5 <= class726.field10064 && arg0 - arg1 >= class291.field4181 && class262.field3848 >= (arg0 + arg1)) {
            class70.method544(arg1, arg0, arg4 ^ 0xFFFFFF86, arg5, arg3, arg2);
        } else {
            class445.method2718(56, arg3, arg2, arg5, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 37)
    public static void method1813(int arg0) {
        int var1 = -89 % ((arg0 - 23) / 50);
        field3896 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 48)
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3891 = (byte) arg8;
        this.field3892 = (short) arg6;
        this.field3886 = arg1;
        this.field3884 = arg3;
        this.field3890 = arg10;
        this.field3894 = (short) arg4;
        this.field3883 = arg0;
        this.field3887 = arg2;
        this.field3889 = (short) arg5;
        this.field3888 = arg11;
    }
}

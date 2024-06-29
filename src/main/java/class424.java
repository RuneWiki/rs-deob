import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class class424 extends class404 {

    @OriginalMember(owner = "client!un", name = "D", descriptor = "S")
    public short field6108;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "S")
    public short field6120;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    public static int field6109 = 0;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "Z")
    public static boolean field6112 = false;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field6114 = 2;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field6119 = 0;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "Lof;")
    public static class622 field6105;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I")
    public static final int method2597(int arg0, int arg1) {
        return class315.field4362 != null ? class315.field4362[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)Z")
    public final boolean method939(int arg0) {
        if (arg0 != 0) {
            this.method939(29);
        }
        ++field6106;
        return class196.field2890[(super.field5922 >> class130.field2185) - -class708.field9611 + -class134.field2256][(super.field5933 >> class130.field2185) + -class492.field6813 + class708.field9611];
    }

    @OriginalMember(owner = "client!un", name = "m", descriptor = "(I)V")
    public static void method2598(int arg0) {
        if (arg0 != 0) {
            method2601(-24);
        }
        field6105 = null;
    }

    @OriginalMember(owner = "client!un", name = "n", descriptor = "(I)Z")
    public static final boolean method2599(int arg0) {
        ++field6115;
        if (class47.field999 == null) {
            return false;
        } else {
            if (~class47.field999.field4505 <= -2001) {
                class47.field999.field4505 -= 2000;
            }
            int var1 = -53 % ((-41 - arg0) / 54);
            return class47.field999.field4505 == 1011;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)Z")
    public final boolean method937(byte arg0) {
        ++field6113;
        if (arg0 >= -51) {
            method2600(-102, 81, -103, -31, -95, -90);
        }
        return class323.method2069(super.field5933 >> class130.field2185, this.method38(true), super.field5921, (byte) -79, super.field5922 >> class130.field2185);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        ++field6107;
        if (arg5 >= -106) {
            this.method935((class669[]) null, 52);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!un", name = "j", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        if (arg0 >= -65) {
            return false;
        } else {
            ++field6111;
            return false;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        if (arg0) {
            ++field6118;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII)V")
    public static final void method2600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= class140.field2314 && ~class536.field7419 <= ~arg1 && ~arg5 <= ~class58.field1150 && class479.field6682 >= arg3) {
            class323.method2070(arg3, arg0, arg1, arg4, arg5, arg2);
        } else {
            class218.method1560(arg5, arg4, arg3, arg1, (byte) -114, arg2);
        }
        if (arg0 != 0) {
            field6119 = 42;
        }
        ++field6116;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([Lab;I)I")
    public final int method935(class669[] arg0, int arg1) {
        ++field6110;
        int var3 = 122 % ((-14 - arg1) / 61);
        return this.method2523(arg0, super.field5922 >> class130.field2185, -2, super.field5933 >> class130.field2185);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIII)V")
    public class424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6108 = (short) arg6;
        super.field5921 = (byte) arg4;
        super.field5927 = arg1;
        super.field5922 = arg0;
        this.field6120 = (short) arg5;
        super.field5933 = arg2;
        super.field5926 = (byte) arg3;
    }

    @OriginalMember(owner = "client!un", name = "o", descriptor = "(I)Lmf;")
    public static final class420 method2601(int arg0) {
        ++field6117;
        class33.field843 = 0;
        if (arg0 >= -91) {
            field6114 = -63;
        }
        return class351.method2196(true);
    }
}

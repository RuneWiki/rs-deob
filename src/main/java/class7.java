import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class376 {

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[I")
    public static int[] field57 = new int[50];

    @OriginalMember(owner = "client!il", name = "m", descriptor = "S")
    public static short field59 = 205;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= -77) {
            return;
        }
        field58++;
        if (class326.field4246 <= arg6 && class163.field1942 >= arg1 && class58.field602 <= arg0 && arg2 <= class501.field7217) {
            if (arg4 == 1) {
                class634.method3547(arg5, arg0, (byte) -74, arg6, arg2, arg1);
            } else {
                class419.method2267((byte) 117, arg1, arg5, arg4, arg6, arg0, arg2);
            }
        } else if (arg4 == 1) {
            class606.method3378(arg0, arg5, arg6, arg2, (byte) -109, arg1);
        } else {
            class66.method431(arg5, arg2, arg1, arg4, (byte) 70, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= class326.field4246 && class163.field1942 >= arg4 && class58.field602 <= arg3 && arg5 <= class501.field7217) {
            class690.method3827(arg3, arg7, arg1, arg6, (byte) 91, arg5, arg2, arg4);
        } else {
            class421.method2282(arg4, arg2, arg3, arg6, arg1, arg5, (byte) 117, arg7);
        }
        int var8 = 114 % ((arg0 - 48) / 45);
        field55++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III[B)I")
    public static final int method32(int arg0, int arg1, int arg2, byte[] arg3) {
        field62++;
        int var4 = -1;
        if (arg2 != 3360) {
            field59 = 83;
        }
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = class369.field4797[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z")
    public static final boolean method33(int arg0, int arg1, int arg2) {
        field61++;
        if (arg1 != 0) {
            field57 = null;
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static void method34(int arg0) {
        if (arg0 != -345670968) {
            field57 = null;
        }
        field57 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZI)Z")
    public static final boolean method35(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            field60++;
            return class170.method1013((byte) -123, arg2, arg0) || class407.method2209(arg0, 45056, arg2);
        }
    }
}

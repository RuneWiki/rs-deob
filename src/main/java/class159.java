import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class159 extends class102 {

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Lb;")
    public class97 field2859;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "Lr;")
    public static class66 field2864 = class93.method641(43, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "Lsg;")
    public static class247 field2862;

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lb;)V")
    public class159(class97 arg0) {
        this.field2859 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field2862 = null;
        if (arg0 == 1152) {
            field2864 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lcj;I)V")
    public static final void method1082(class28 arg0, int arg1) {
        if (arg1 > 76) {
            class193.field3348 = arg0;
            field2861++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I")
    public static final int method1083(byte arg0, int arg1) {
        field2860++;
        if (arg0 >= 65 && arg0 <= 90) {
            return arg0 - 65;
        }
        int var2 = -21 % ((-arg1 - 24) / 46);
        if (arg0 >= 97 && arg0 <= 122) {
            return arg0 + 26 - 97;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return arg0 + 4;
        } else if (arg0 == 43) {
            return 62;
        } else if (arg0 == 42) {
            return 62;
        } else if (arg0 == 47) {
            return 63;
        } else if (arg0 == 45) {
            return 63;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIILa;IJZ)Z")
    public static final boolean method1084(int arg0, int arg1, int arg2, int arg3, int arg4, class20 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class176.method1186(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}

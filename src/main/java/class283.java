import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class283 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[I")
    public static int[] field3664 = new int[8];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Luw;")
    public static class208 field3660 = new class208(64, -1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)Z", line = 4)
    public static final boolean method1728(int arg0, boolean arg1) {
        if (arg0 != -2271) {
            method1731(126);
        }
        field3661++;
        boolean var2 = class576.field7320.method899();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class576.field7320.method891();
        } else if (!class576.field7320.method926()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class485.field6252.method2986(arg1 ? 1 : 0, class485.field6252.field6936, (byte) 53);
            class627.method3356(41);
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 45)
    public static final void method1729(byte arg0) {
        field3663++;
        if (class740.field10014.field10571 && class524.field6667.field3371 != -1) {
            class186.method1313(true, class524.field6667.field3371, class524.field6667.field3374);
        }
        if (arg0 != -58) {
            field3658 = 82;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIIIII)V", line = 60)
    public static final void method1730(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3662++;
        if (arg0 != -109) {
            method1730((byte) -128, -102, 70, -30, 30, 127, 69);
        }
        int var7 = class774.method4226(class80.field1131, (byte) -74, class405.field5375, arg5);
        int var8 = class774.method4226(class80.field1131, (byte) -60, class405.field5375, arg3);
        int var9 = class774.method4226(class498.field6390, (byte) -16, class30.field274, arg1);
        int var10 = class774.method4226(class498.field6390, (byte) -98, class30.field274, arg6);
        int var11 = class774.method4226(class80.field1131, (byte) -96, class405.field5375, arg5 + arg4);
        int var12 = class774.method4226(class80.field1131, (byte) -21, class405.field5375, arg3 - arg4);
        for (int var13 = var7; var13 < var11; var13++) {
            class54.method333(var10, class207.field2840[var13], 7, var9, arg2);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class54.method333(var10, class207.field2840[var14], 7, var9, arg2);
        }
        int var15 = class774.method4226(class498.field6390, (byte) -94, class30.field274, arg1 + arg4);
        int var16 = class774.method4226(class498.field6390, (byte) -112, class30.field274, arg6 - arg4);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class207.field2840[var17];
            class54.method333(var15, var18, 7, var9, arg2);
            class54.method333(var10, var18, 7, var16, arg2);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 114)
    public static void method1731(int arg0) {
        if (arg0 == -1) {
            field3664 = null;
            field3660 = null;
        }
    }
}

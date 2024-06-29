import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class196 {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
    public static boolean field3533 = false;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[Ljj;")
    public static class148[] field3534 = new class148[4];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)I", line = 26)
    public static final int method1463(int arg0, byte arg1) {
        class212 var2 = class79.method661((byte) -116, arg0);
        int var3 = var2.field3725;
        field3535++;
        int var4 = var2.field3727;
        int var5 = var2.field3716;
        int var6 = class131.field2390[var5 - var4];
        return arg1 < 96 ? -96 : class326.field5679[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)V", line = 48)
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class195 var7 = new class195();
        var7.field3524 = arg1 / 128;
        var7.field3518 = arg2 / 128;
        var7.field3510 = arg3 / 128;
        var7.field3527 = arg4 / 128;
        var7.field3520 = arg0;
        var7.field3517 = arg1;
        var7.field3506 = arg2;
        var7.field3522 = arg3;
        var7.field3514 = arg4;
        var7.field3509 = arg5;
        var7.field3515 = arg6;
        class37.field840[class167.field3013++] = var7;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1465(int arg0) {
        class311.field5513 = null;
        if (arg0 <= 26) {
            return;
        }
        class182.field3323 = (byte[][][]) null;
        field3531++;
        class35.field790 = null;
        class194.field3486 = (byte[][][]) null;
        class223.field3955 = (byte[][][]) null;
        class184.field3369 = (int[][][]) null;
        class194.field3491 = (byte[][][]) null;
        class11.field362 = null;
        class137.field2471 = null;
        class251.field4489 = null;
        class214.field3774 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZB)V", line = 90)
    public static final void method1466(boolean arg0, byte arg1) {
        class251.field4489 = new int[104];
        class311.field5513 = new int[104];
        class11.field362 = new int[104];
        field3530++;
        class35.field790 = new int[104];
        class301.field5358 = 99;
        class137.field2471 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class223.field3955 = new byte[var2][105][105];
        class194.field3491 = new byte[var2][104][104];
        class194.field3486 = new byte[var2][104][104];
        class214.field3774 = new byte[var2][104][104];
        class184.field3369 = new int[var2][105][105];
        if (arg1 != 20) {
            field3532 = -68;
        }
        class182.field3323 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 120)
    public static void method1467(int arg0) {
        if (arg0 <= 92) {
            method1467(18);
        }
        field3534 = null;
    }
}

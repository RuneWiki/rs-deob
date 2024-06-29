import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class256 {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[I")
    public static int[] field3703 = new int[4];

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lmu;")
    public static class303 field3709 = new class303(68, 6);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[B")
    public byte[] field3710;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[S")
    public short[] field3699;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[S")
    public short[] field3701;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[S")
    public short[] field3708;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1737(int arg0) {
        int var1 = 95 / ((-arg0 - 21) / 45);
        field3703 = null;
        field3709 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)Z")
    public static final boolean method1738(byte arg0, int arg1) {
        field3707++;
        if (arg0 > -93) {
            field3702 = -39;
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILmi;ILat;Laa;III)V")
    public static final void method1739(int arg0, class496 arg1, int arg2, class378 arg3, class487 arg4, int arg5, int arg6, int arg7) {
        field3705++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class438.field6252 == 4) {
            var8 = (int) class451.field6366 & 0x3FFF;
        } else {
            var8 = (int) class451.field6366 + class28.field748 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field5385 / 2, arg3.field5465 / arg6) + 10;
        int var10 = arg7 * arg7 + (arg5 * arg5);
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class255.field3698[var8];
        int var12 = class255.field3695[var8];
        if (class438.field6252 != 4) {
            var12 = var12 * 256 / (class548.field7552 + 256);
            var11 = var11 * 256 / (class548.field7552 + 256);
        }
        int var13 = arg5 * var11 + arg7 * var12 >> 14;
        int var14 = arg5 * var12 - (arg7 * var11) >> 14;
        arg1.method1199(var13 + arg3.field5385 / 2 + arg2 - (arg1.method1618() / 2), arg0 - -(arg3.field5465 / 2) + -var14 + -(arg1.method1614() / 2), arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
    public static final void method1740(int arg0, int arg1, int arg2, int arg3) {
        field3700++;
        int var4 = class693.field9368.field4457.method820(-32350) * arg0 >> 8;
        if (arg1 == arg2 && !class737.field9928) {
            class416.method2571(1);
        } else if (arg1 != -1 && (class277.field3916 != arg1 || !class534.method3078(true)) && var4 != 0 && !class737.field9928) {
            class246.method1690(var4, 18002, false, arg1, class78.field1399, 0, arg3);
            class268.method1785(93);
        }
        if (class277.field3916 != arg1) {
            class287.field4000 = null;
        }
        class277.field3916 = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method1741(String arg0, String arg1, int arg2) {
        if (arg2 > -48) {
            field3709 = null;
        }
        field3704++;
        class274.field3850 = -1;
        class640.field8799 = 1;
        class58.method613(arg0, false, arg1, (byte) -95);
    }
}

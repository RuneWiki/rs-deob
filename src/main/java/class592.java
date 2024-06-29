import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class592 extends class667 {

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Z")
    public static boolean field8309 = false;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field8310 = 0;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "[I")
    public static int[] field8308 = new int[1];

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Z")
    public static boolean field8314 = false;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "Lqe;")
    public static class465 field8312 = new class465(58, 28);

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "Lgba;")
    public static class664 field8313;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(Z)V", line = 3)
    public static void method3397(boolean arg0) {
        field8308 = null;
        field8312 = null;
        field8313 = null;
        if (arg0) {
            method3399(-84, 86, 65, 120, (byte[]) null, true, -92);
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 16)
    public class592() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[I", line = 23)
    public final int[] method117(byte arg0, int arg1) {
        ++field8311;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            field8310 = -113;
        }
        if (super.field9355.field3728) {
            class622.method3592(var3, 0, class77.field1455, class385.field5384[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;B)V", line = 59)
    public static final void method3398(boolean arg0, String arg1, String arg2, byte arg3) {
        class47.field696 = arg1;
        class566.field7985 = arg2;
        class11.field147 = arg0;
        ++field8307;
        if (arg3 != 53) {
            method3397(true);
        }
        if (class11.field147 || !class47.field696.equals("") && !class566.field7985.equals("")) {
            class420.field5904 = false;
            if (~class683.field9617 != -2) {
                class697.field9804 = -1;
                class386.field5410 = 0;
            }
            class552.method3231((byte) -121, -3);
            class208.field2973 = 0;
            class363.field5096 = 1;
            class130.field1950 = 0;
        } else {
            class552.method3231((byte) 65, 3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII[BZI)Z", line = 93)
    public static final boolean method3399(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, int arg6) {
        ++field8306;
        if (!arg5) {
            field8309 = false;
        }
        int var7 = arg2 % arg0;
        int var8;
        if (~var7 == -1) {
            var8 = 0;
        } else {
            var8 = -var7 + arg0;
        }
        int var9 = -((arg0 + arg6 + -1) / arg0);
        int var10 = -((arg0 + arg2 + -1) / arg0);
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; var12 < 0; ++var12) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg0;
            }
            int var13 = arg1 - var8;
            if (~arg4[var13 + -1] == -1) {
                return true;
            }
            arg1 = arg3 + var13;
        }
        return false;
    }
}

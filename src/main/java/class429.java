import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class429 {

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Z")
    public static boolean field5757 = false;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Lr;")
    public class159 field5765;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "Lkda;")
    public static class328 field5766;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "Lk;")
    public class485 field5763;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2511(boolean arg0) {
        field5762++;
        if (!class606.field9002) {
            return;
        }
        class162 var1 = class372.method2217(class205.field3027, 100, class193.field2865);
        if (var1 != null && var1.field2429 != null) {
            class518 var2 = new class518();
            var2.field7376 = var1;
            var2.field7383 = var1.field2429;
            class98.method757(var2);
        }
        class574.field8454 = -1;
        class626.field9224 = -1;
        class606.field9002 = false;
        if (var1 != null) {
            class403.method2371(var1, (byte) -62);
        }
        if (!arg0) {
            method2513(null, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lke;", line = 36)
    public static final class514 method2512(Throwable arg0, String arg1) {
        field5760++;
        class514 var2;
        if ((arg0 instanceof class514)) {
            var2 = (class514) arg0;
            var2.field7341 = var2.field7341 + ' ' + arg1;
        } else {
            var2 = new class514(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lfaa;B)V", line = 56)
    public static final void method2513(class136 arg0, byte arg1) {
        if (arg0 instanceof class571) {
            class571 var2 = (class571) arg0;
            if (var2.field8405 != null) {
                class609.method3582(false, var2, class541.field8119.field8501 != var2.field8501);
            }
        } else if (arg0 instanceof class373) {
            class373 var3 = (class373) arg0;
            class282.method1759(var3, (byte) -20, class541.field8119.field8501 != var3.field8501);
        }
        if (arg1 == -59) {
            field5764++;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIBII)V", line = 84)
    public static final void method2514(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5761++;
        class112.field1589.field2177 = 0;
        class112.field1589.method1049(-1, class204.field3015.field6526);
        class112.field1589.method1049(-1, arg1);
        class112.field1589.method1049(-1, arg4);
        class112.field1589.method1027(255, arg0);
        class112.field1589.method1027(255, arg3);
        class111.field1587 = 0;
        class593.field8768 = -3;
        class536.field7972 = 0;
        if (arg2 != 61) {
            field5766 = null;
        }
        class467.field6580 = 1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BIII[FFFIIII)V", line = 104)
    public static final void method2515(byte arg0, int arg1, int arg2, int arg3, float[] arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3 - arg2;
        int var12 = arg10 - arg1;
        int var13 = arg8 - arg9;
        field5759++;
        int var14 = 87 % ((arg0 - 8) / 54);
        float var15 = arg4[2] * (float) var11 + arg4[0] * (float) var12 + arg4[1] * (float) var13;
        float var16 = arg4[5] * (float) var11 + arg4[3] * (float) var12 + arg4[4] * (float) var13;
        float var17 = arg4[8] * (float) var11 + arg4[7] * (float) var13 + arg4[6] * (float) var12;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg5 != 1.0F) {
            var18 = arg5 * var18;
        }
        float var19 = var16 + arg6 + 0.5F;
        if (arg7 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class239.field3447 = var19;
        class359.field4883 = var18;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)Z", line = 156)
    public static final boolean method2516(int arg0, byte arg1) {
        field5758++;
        if (arg0 != 25536) {
            return false;
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class360.field4900[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 184)
    public static void method2517(int arg0) {
        field5766 = null;
        if (arg0 != 0) {
            method2511(false);
        }
    }
}

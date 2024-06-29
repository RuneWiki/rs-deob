import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class459 extends class90 {

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field6232 = -1;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6240 = null;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public int field6238;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public int field6239;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public int field6242;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Ljava/lang/String;")
    public String field6231;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6241++;
        if (class268.field3766 <= arg2 && arg4 <= class236.field3392 && class223.field3260 <= arg0 && class706.field9700 >= arg3) {
            if (arg5 == 1) {
                class249.method1651((byte) 69, arg0, arg2, arg3, arg4, arg1);
            } else {
                class501.method2869(arg2, arg4, -21577, arg3, arg1, arg0, arg5);
            }
        } else if (arg5 == 1) {
            class101.method875(arg4, arg2, arg3, (byte) -79, arg0, arg1);
        } else {
            class727.method4034(arg0, arg3, arg4, arg1, arg5, (byte) 0, arg2);
        }
        int var7 = -26 % ((49 - arg6) / 48);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;ZBLjava/lang/String;I)V", line = 37)
    public static final void method2639(String arg0, boolean arg1, byte arg2, String arg3, int arg4) {
        if (arg2 > -20) {
            method2641(69);
        }
        class559.method3247(arg3, arg0, (byte) 54, arg4, -1, arg1, true);
        field6237++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZIIII)V", line = 53)
    public static final void method2640(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field6236++;
        long var6 = (long) (arg3 | (arg1 ? Integer.MIN_VALUE : 0));
        class539 var8 = (class539) class85.field1166.method337(var6, 1);
        if (var8 == null) {
            var8 = new class539();
            class85.field1166.method341(var6, var8, (byte) 124);
        }
        if (var8.field7320.length <= arg4) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field7320.length; var11++) {
                var9[var11] = var8.field7320[var11];
                var10[var11] = var8.field7323[var11];
            }
            for (int var12 = var8.field7320.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field7320 = var9;
            var8.field7323 = var10;
        }
        var8.field7320[arg4] = arg5;
        if (arg0 > 65) {
            var8.field7323[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 117)
    public static void method2641(int arg0) {
        if (arg0 > -85) {
            field6240 = null;
        }
        field6240 = null;
    }
}

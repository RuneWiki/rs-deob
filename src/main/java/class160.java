import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class160 {

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Ljw;")
    public static class581 field2196 = new class581(37, -1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILel;IIII)Z", line = 5)
    public static final boolean method1169(int arg0, int arg1, class574 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2195++;
        if (!class522.field7164 || !class791.field10882) {
            return false;
        } else if (~class592.field7964 > arg1) {
            return false;
        } else if (arg0 != arg6 || arg3 != arg4) {
            for (int var7 = arg6; var7 <= arg0; var7++) {
                for (int var8 = arg3; var8 <= arg4; var8++) {
                    if (class719.field10030[arg5][var7][var8] == -class423.field6044) {
                        return false;
                    }
                }
            }
            if (class503.method2924((byte) 58, arg2)) {
                class337.field4880++;
                return true;
            } else {
                return false;
            }
        } else if (!class267.method1744(arg6, arg3, arg5, 19322)) {
            return false;
        } else if (class503.method2924((byte) 58, arg2)) {
            class337.field4880++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 63)
    public static void method1170(int arg0) {
        int var1 = -13 % ((9 - arg0) / 56);
        field2196 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIII)V", line = 77)
    public static final void method1171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2198++;
        if (arg3 != -1) {
            field2196 = null;
        }
        if (arg4 == arg6) {
            class59.method413(arg7, false, arg6, arg5, arg1, arg0, arg2);
        } else if (arg7 - arg6 >= class174.field2335 && class751.field10402 >= (arg7 + arg6) && class523.field7178 <= (arg5 - arg4) && arg4 + arg5 <= class495.field6845) {
            class527.method3039(arg5, 3, arg2, arg7, arg0, arg1, arg6, arg4);
        } else {
            class599.method3328(arg6, arg2, arg0, 3, arg7, arg5, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V", line = 105)
    public static final void method1172(int arg0, int arg1, int arg2) {
        field2197++;
        if (class261.field3874 != arg0) {
            class556.field7498 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class556.field7498[var3] = (var3 << 12) / arg0;
            }
            class625.field8423 = arg0 - 1;
            class27.field409 = arg0 * 32;
            class261.field3874 = arg0;
        }
        int var4 = 109 % ((arg2 - 17) / 40);
        if (class657.field9077 == arg1) {
            return;
        }
        if (class261.field3874 == arg1) {
            class621.field8370 = class556.field7498;
        } else {
            class621.field8370 = new int[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                class621.field8370[var5] = (var5 << 12) / arg1;
            }
        }
        class566.field7574 = arg1 - 1;
        class657.field9077 = arg1;
    }
}

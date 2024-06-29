import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class213 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field3593 = -1;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3595 = "wave:";

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method1512(int arg0, String[] arg1, short[] arg2) {
        field3597++;
        class269.method1891(arg0, arg1, 26755, arg2, arg1.length - 1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method1513(boolean arg0) {
        if (arg0) {
            method1512(-10, (String[]) null, (short[]) null);
        }
        field3595 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIIIIII)I")
    public static final int method1514(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 110) {
            field3593 = 50;
        }
        field3598++;
        int var7 = arg1 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg5;
        } else {
            return 8 - arg6 - arg3;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
    public static final void method1515(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class90.field1498[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class251 var5 = var4.field2817;
        if (var5 != null) {
            var5.field4249 = var5.field4249 * arg3 / 16;
            var5.field4243 = var5.field4243 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLab;)V")
    public static final void method1516(boolean arg0, class249 arg1) {
        byte[] var2 = new byte[24];
        field3594++;
        if (class196.field3164 != null) {
            try {
                int var3 = 0;
                class196.field3164.method1042(0L, true);
                class196.field3164.method1048(var2, 124);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1784(var2, arg0, 24, 0);
    }
}

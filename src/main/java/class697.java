import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class697 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "J")
    public static long field9714;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "J")
    public static long field9716;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BJ)V")
    public static final void method3933(byte arg0, long arg1) {
        if (arg0 != -35) {
            method3935(125, null, 81, false, -2, null, true);
        }
        field9715++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    public static final void method3934(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        if (var3 != null) {
            class543.method3219(var3.field6540);
            if (var3.field6540 != null) {
                var3.field6540 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILnd;IZILnd;Z)I")
    public static final int method3935(int arg0, class138 arg1, int arg2, boolean arg3, int arg4, class138 arg5, boolean arg6) {
        field9713++;
        int var7 = class560.method3303(arg2, 25430, arg1, arg3, arg5);
        if (arg4 != var7) {
            return arg3 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class560.method3303(arg0, arg4 + 25430, arg1, arg6, arg5);
            return arg6 ? -var8 : var8;
        }
    }
}

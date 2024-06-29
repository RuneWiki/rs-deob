import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class647 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field9307 = 0;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[B")
    public static byte[] field9308 = new byte[2048];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Ltca;")
    public static class545 field9305 = new class545();

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V", line = 8)
    public static final void method3682(int arg0, int arg1) {
        field9309++;
        class489 var2 = class704.method3942(arg1, 14, 0);
        if (arg0 != -6830) {
            method3682(1, -98);
        }
        var2.method2799(-95);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V", line = 36)
    public static final void method3683(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9306++;
        if (arg3 != 25638) {
            method3684(92);
        }
        class489 var5 = class704.method3942(arg2, 8, 0);
        var5.method2797(-1);
        var5.field6952 = arg4;
        var5.field6942 = arg1;
        var5.field6945 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 57)
    public static void method3684(int arg0) {
        field9305 = null;
        field9308 = null;
        if (arg0 <= 92) {
            method3684(96);
        }
    }
}

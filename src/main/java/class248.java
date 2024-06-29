import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class248 {

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "Lng;")
    public static class190 field3438 = new class190(2);

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "F")
    public static float field3441;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lmh;BLmh;)V", line = 7)
    public static final void method1545(class376 arg0, byte arg1, class376 arg2) {
        field3440++;
        if (arg2.field5369 != null) {
            arg2.method2459(198);
        }
        arg2.field5369 = arg0.field5369;
        arg2.field5365 = arg0;
        arg2.field5369.field5365 = arg2;
        if (arg1 >= -43) {
            method1547(112, -113, (class210) null, 44, 125);
        }
        arg2.field5365.field5369 = arg2;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 26)
    public static void method1546(int arg0) {
        if (arg0 <= 106) {
            method1547(105, -82, (class210) null, -118, -123);
        }
        field3438 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILom;II)V", line = 39)
    public static final void method1547(int arg0, int arg1, class210 arg2, int arg3, int arg4) {
        field3442++;
        long var5 = (long) (arg1 | arg3 << 14 | arg0 << 28);
        class26 var7 = (class26) class272.field3718.method1412((byte) -54, var5);
        if (var7 == null) {
            class26 var8 = new class26();
            class272.field3718.method1419(var5, 68, var8);
            var8.field423.method1301(arg4 + 94956644, arg2);
            return;
        }
        if (arg4 != -94956594) {
            method1546(76);
        }
        class389 var9 = class347.method2222(arg2.field2829, 18682);
        int var10 = var9.field5677;
        if (var9.field5680 == 1) {
            var10 = (arg2.field2827 + 1) * var10;
        }
        for (class210 var11 = (class210) var7.field423.method1312((byte) 25); var11 != null; var11 = (class210) var7.field423.method1304(-63)) {
            class389 var12 = class347.method2222(var11.field2829, 18682);
            int var13 = var12.field5677;
            if (var12.field5680 == 1) {
                var13 = (var11.field2827 + 1) * var13;
            }
            if (var10 > var13) {
                method1545(var11, (byte) -50, arg2);
                return;
            }
        }
        var7.field423.method1301(50, arg2);
    }
}

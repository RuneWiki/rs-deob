import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class603 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8399 = 0;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8401 = class55.method457(24266, 1600);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Lfc;")
    public static class235 field8404;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)I")
    public static final int method3393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        field8400++;
        if (var7 == 0) {
            return arg4;
        } else if (arg0 != 7) {
            return 34;
        } else if (var7 == 1) {
            return 7 - arg2 - (arg6 - 1);
        } else if (var7 == 2) {
            return 1 + 7 - arg5 - arg4;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static final void method3394(int arg0) {
        field8402++;
        int var1 = class366.field4875.method541(class503.field6917, 1);
        if (var1 == 0) {
            class468.field6439 = null;
            class353.method2030(0, -125);
        } else if (var1 == 1) {
            class13.method61((byte) 0, 0);
            class353.method2030(512, -25);
            if (class492.field6720 != null) {
                class103.method753(0);
            }
        } else {
            class13.method61((byte) (class241.field3299 - 4 & 0xFF), 0);
            class353.method2030(2, -116);
        }
        if (arg0 != -4) {
            field8404 = null;
        }
        class419.field5915 = class367.field4944;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
    public static final void method3395() {
        for (int var0 = 0; var0 < class590.field8286; var0++) {
            class210 var1 = class544.field7388[var0];
            class122.method876(var1, true);
            class544.field7388[var0] = null;
        }
        class590.field8286 = 0;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method3396(int arg0) {
        if (arg0 == -7690) {
            field8404 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class706 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "J")
    public static long field9917 = 0L;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "Lnea;")
    public static class670 field9920 = new class670();

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIII)V")
    public static final void method3897(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9919++;
        class382 var5 = class396.method2276(110, 4, arg0);
        var5.method2232(-46);
        var5.field5106 = arg3;
        if (arg4 != 1) {
            method3897(-53, 56, 67, 12, -79);
        }
        var5.field5104 = arg2;
        var5.field5099 = arg1;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
    public static void method3898(int arg0) {
        if (arg0 != -2) {
            method3897(-35, 53, 87, -116, 115);
        }
        field9920 = null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)I")
    public static final int method3899(int arg0, int arg1, int arg2) {
        field9918++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else if (arg2 >= -26) {
            return -102;
        } else {
            return var3;
        }
    }
}

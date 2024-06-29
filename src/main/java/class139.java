import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class139 extends class91 {

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field2293 = 64;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBI)V")
    public static final void method1133(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2292++;
        float var5 = (float) class751.field10452 / (float) class751.field10441;
        int var6 = arg1;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg1 - var6) / 2;
        int var9 = arg0 - (arg2 - var7) / 2;
        class630.field8932 = -1;
        class761.field10553 = class751.field10441 * var8 / var6;
        class488.field6705 = class751.field10452 - (class751.field10452 * var9 / var7);
        int var10 = -72 / ((69 - arg3) / 51);
        class414.field5684 = -1;
        class274.method1744(1);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field2295 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILsea;IZ)V")
    public static final void method1134(int arg0, int arg1, class416 arg2, int arg3, boolean arg4) {
        field2294++;
        if (arg4) {
            return;
        }
        for (class421 var5 = (class421) class628.field8911.method3731((byte) -67); var5 != null; var5 = (class421) class628.field8911.method3729((byte) -127)) {
            if (var5.field5861 == arg3 && (arg0 << 9) == var5.field5855 && arg1 << 9 == var5.field5849 && var5.field5857.field5746 == arg2.field5746) {
                if (var5.field5835 != null) {
                    class234.field3399.method4220(var5.field5835);
                    var5.field5835 = null;
                }
                if (var5.field5863 != null) {
                    class234.field3399.method4220(var5.field5863);
                    var5.field5863 = null;
                }
                var5.method4237(-1);
                return;
            }
        }
    }
}

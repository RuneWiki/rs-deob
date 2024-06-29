import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class233 {

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Z")
    public static boolean field3597 = false;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method1534(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field3596++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else {
            if (arg0 != 1023) {
                method1534(-95, 61, 59, 107);
            }
            return var4 == 2 ? 1023 - arg1 : 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)I", line = 30)
    public static final int method1535(int arg0) {
        field3594++;
        class288 var1 = class262.field4006;
        boolean var2 = false;
        if (class133.field2236 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class288.method1807(null, 0, var3, 0, 0, null);
            var2 = true;
        }
        int var4 = -31 % ((arg0 + 51) / 37);
        long var5 = class423.method2578(-19698);
        for (int var7 = 0; var7 < 10000; var7++) {
            var1.method310(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var8 = (int) (class423.method2578(-19698) - var5);
        var1.method1809(0, 0, -16777216, 100, 100, -7456);
        if (var2) {
            var1.method1802((byte) -65);
        }
        return var8;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public abstract void method1462(int arg0);

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Lab;")
    public abstract class477 method1465(int arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Z")
    public abstract boolean method1458(int arg0, int arg1);

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
    public abstract void method1460(int arg0);
}

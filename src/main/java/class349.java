import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class349 {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[I")
    public static int[] field4707 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lhc;")
    public static class368 field4706 = new class368("flash1:", "", "", "");

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lij;")
    public static class316 field4708;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method2109(byte arg0, int arg1) {
        field4703++;
        int var2 = -87 % ((31 - arg0) / 40);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 34)
    public static final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -11514) {
            method2111(-42);
        }
        for (int var5 = 0; var5 < class58.field751; var5++) {
            Rectangle var6 = class451.field6479[var5];
            if (var6.x + var6.width > arg0 && (arg0 + arg2) > var6.x && var6.y + var6.height > arg4 && var6.y < (arg1 + arg4)) {
                class363.field4998[var5] = true;
            }
        }
        field4702++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 59)
    public static void method2111(int arg0) {
        if (arg0 != 1) {
            method2110(123, 88, -53, 65, -98);
        }
        field4706 = null;
        field4708 = null;
        field4707 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 71)
    public static final void method2112(byte arg0) {
        class346.field4679.method2530((byte) -111);
        field4704++;
        class339.field4590.method2530((byte) -86);
        if (arg0 != -118) {
            method2110(95, 119, 84, -68, 110);
        }
    }
}

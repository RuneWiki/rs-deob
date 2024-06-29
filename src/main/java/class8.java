import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class8 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Ljava/lang/String;")
    public static String field72 = "Please wait...";

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
    public static int[] field74 = new int[50];

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[Lfd;IBIZ)V", line = 3)
    public static final void method38(int arg0, class194[] arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        field75++;
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class194 var8 = arg1[var6];
            if (var8 != null && var8.field2470 == arg2) {
                class32.method148(var8, arg5, 5, arg4, arg0);
                class451.method2801(arg0, arg4, var8, 63);
                if (var8.field2522 > var8.field2528 - var8.field2501) {
                    var8.field2522 = var8.field2528 - var8.field2501;
                }
                if (var8.field2522 < 0) {
                    var8.field2522 = 0;
                }
                if (var8.field2445 - var8.field2460 < var8.field2565) {
                    var8.field2565 = var8.field2445 - var8.field2460;
                }
                if (var8.field2565 < 0) {
                    var8.field2565 = 0;
                }
                if (var8.field2492 == 0) {
                    class420.method2615((byte) -55, arg5, var8);
                }
            }
        }
        int var7 = 14 % ((-arg3 - 7) / 42);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)I", line = 62)
    public static final int method39(boolean arg0) {
        field73++;
        if (!arg0) {
            method39(false);
        }
        return ((class160.field2062 == 0 ? 0 : 1) << 21) + ((class63.field653 == 0 ? 0 : 1) << 20) + (class169.field2133 & 0x3 << 11) + ((class2.field19 ? 1 : 0) << 9) + ((class448.field6510 ? 1 : 0) << 8) + ((class92.field1058 ? 1 : 0) << 6) + ((class216.field2905 ? 1 : 0) << 5) + ((class177.field2217 ? 1 : 0) << 4) + (class168.field2125 & 0x7) + (((class101.field1195 ? 1 : 0) << 3) - (-((class405.field5900 ? 1 : 0) << 10) - ((class199.field2664 ? 1 : 0) << 13))) + ((class29.field278 ? 1 : 0) << 15) + ((class264.field3609 ? 1 : 0) << 16) + (class292.field3962 << 17) + ((class84.field942 ? 1 : 0) << 19) + ((class295.field4002 == 0 ? 0 : 1) << 22) + (class444.method2757(-32724) << 23) + ((class295.field4005 << 25) + ((class297.field4040 ? 1 : 0) << 27) - -(class417.field6000 << 28));
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)V", line = 73)
    public static void method40(boolean arg0) {
        if (!arg0) {
            field74 = null;
        }
        field74 = null;
        field72 = null;
    }
}

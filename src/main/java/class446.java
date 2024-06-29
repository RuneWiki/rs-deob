import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class446 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5929 = 500;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field5930 = -2;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5933 = 0;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V", line = 8)
    public static final void method2524(int arg0, int arg1, int arg2) {
        field5934++;
        class37 var3 = class636.method3571(6, arg1, -85);
        var3.method232(arg0 ^ 0xFFFF8745);
        if (arg0 != 30904) {
            method2525(33);
        }
        var3.field579 = arg2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)J", line = 33)
    public static final synchronized long method2525(int arg0) {
        field5932++;
        if (arg0 != 500) {
            field5930 = 64;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class169.field2347) {
            class580.field8110 += class169.field2347 - var1;
        }
        class169.field2347 = var1;
        return class580.field8110 + var1;
    }
}

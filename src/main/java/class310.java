import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class310 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ltq;")
    public static class376 field4385;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4384;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 12)
    public static void method2048(int arg0) {
        if (arg0 != -20319) {
            field4383 = 48;
        }
        field4384 = null;
        field4385 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Loj;", line = 25)
    public static final class212 method2049(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class212 var4 = var3.field2769;
            var3.field2769 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBIII)Z", line = 35)
    public static final boolean method2050(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4386++;
        if (arg1 != -77) {
            field4387 = -47;
        }
        if ((class399.field5699[0][arg4][arg2] & 0x2) != 0) {
            return true;
        } else if ((class399.field5699[arg0][arg4][arg2] & 0x10) == 0) {
            return class191.method1299(arg2, arg4, arg0, 80) == arg3;
        } else {
            return false;
        }
    }
}

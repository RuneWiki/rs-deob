import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class469 {

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field6435 = 0;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lwu;")
    public static class376 field6433;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 7)
    public static void method2644(byte arg0) {
        if (arg0 <= -58) {
            field6433 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Ltia;", line = 18)
    public static final class270 method2645(int arg0, int arg1) {
        field6434++;
        class270 var2 = (class270) class756.field10510.method1988((long) arg0, arg1 + 7549);
        if (arg1 != -7550) {
            field6433 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class606.field7972.method2218((byte) 123, arg0, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class270 var4;
        try {
            var4 = class384.method2272((byte) -43, var3);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg0);
        }
        class756.field10510.method1987((long) arg0, (byte) 88, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V", line = 52)
    public static final void method2646(int arg0, boolean arg1) {
        field6432++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (arg1) {
            method2645(55, -84);
        }
        class175.field2642 = arg0;
        class514.field6814 = new class17[class311.field4465[class175.field2642] + 1];
        class401.field5594 = 0;
        class66.field823 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method2647(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            field6435 = 60;
        }
        if (class380.field5289 <= arg2 && class431.field5944 >= arg2) {
            int var5 = class10.method99(class209.field3090, 49, class261.field3632, arg1);
            int var6 = class10.method99(class209.field3090, 80, class261.field3632, arg4);
            class690.method3882(arg2, var6, var5, arg3, (byte) -47);
        }
        field6431++;
    }
}

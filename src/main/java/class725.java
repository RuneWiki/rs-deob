import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class725 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field9520;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Luw;")
    public static class208 field9519 = new class208(85, -1);

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field9521 = -1;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field9523 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!dl", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field9518++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 24)
    public static void method3882(byte arg0) {
        field9519 = null;
        if (arg0 <= 74) {
            method3883(-51, -94, null, 62, 57, -104, true);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 33)
    public class725(int arg0) {
        this.field9520 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILha;IIIZ)Lka;", line = 48)
    public static final class299 method3883(int arg0, int arg1, class570 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9522++;
        long var7 = (long) arg3;
        class299 var9 = (class299) class366.field4470.method2931(var7, (byte) -127);
        short var10 = 2055;
        if (var9 == null) {
            class615 var11 = class50.method321((byte) -89, 0, arg3, class470.field6128);
            if (var11 == null) {
                return null;
            }
            if (var11.field7799 < 13) {
                var11.method3288(110, 2);
            }
            var9 = arg2.method930(var11, var10, class696.field9019, 64, 768);
            class366.field4470.method2918(var7, var9, 93);
        }
        class299 var12 = var9.method1284((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method1253(arg5);
        }
        if (arg0 != 0) {
            var12.method1271(arg0);
        }
        if (arg1 != 0) {
            var12.method1289(arg1);
        }
        if (arg4 != 0) {
            var12.method1263(0, arg4, 0);
        }
        return arg6 ? null : var12;
    }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class75 extends IOException {

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Llca;")
    public static class597 field1306 = new class597(4);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Lwt;")
    public static class279 field1309;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "Lpu;")
    public static class522 field1310;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1310 = null;
        if (arg0 > 44) {
            field1309 = null;
            field1306 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class75(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
    public static final void method706(boolean arg0) {
        field1308++;
        class185.field2592 = null;
        if (!arg0) {
            field1309 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lr;BIILet;I)V")
    public static final void method707(class166 arg0, byte arg1, int arg2, int arg3, class550 arg4, int arg5) {
        field1307++;
        class563 var6 = class27.field401.method3064((byte) 113, arg4.field7792);
        if (var6.field7923 == -1) {
            return;
        }
        int var8;
        if (arg4.field7774) {
            int var7 = arg4.field7772 + arg5;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class702 var9 = var6.method3218(-18081, var8, arg4.field7789, arg0);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field7752;
        int var11 = arg4.field7733;
        if (arg1 != 85) {
            return;
        }
        if ((var8 & 0x1) == 1) {
            var11 = arg4.field7752;
            var10 = arg4.field7733;
        }
        int var12 = var9.method931();
        int var13 = var9.method936();
        if (var6.field7919) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field7924 == 0) {
            var9.method3908(arg2, arg3 - (var11 - 1) * 4, var12, var13);
        } else {
            var9.method3909(arg2, arg3 - ((var11 - 1) * 4), var12, var13, 0, var6.field7924 | 0xFF000000, 1);
        }
    }
}

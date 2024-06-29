import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class59 extends class168 {

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIZILvj;I)Z")
    public static final boolean method449(int arg0, int arg1, int arg2, boolean arg3, int arg4, class94 arg5, int arg6) {
        field819++;
        class230 var7 = class284.method1911(arg5.field1348, 123);
        if (var7.field3660 == -1) {
            return true;
        }
        int var8;
        if (arg5.field1381) {
            int var9 = arg5.field1409 + arg2;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class68 var10 = var7.method1529(var8, -91, arg5.field1338);
        if (var10 == null) {
            return false;
        }
        int var11 = arg5.field1340;
        int var12 = arg5.field1334;
        if (arg3) {
            method449(-126, -1, 93, false, -81, (class94) null, -26);
        }
        if ((var8 & 0x1) == 1) {
            var12 = arg5.field1340;
            var11 = arg5.field1334;
        }
        int var13 = var10.field3431;
        int var14 = var10.field3438;
        if (var7.field3647) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field3652 == 0) {
            var10.method541(arg4 * 4 + 48, (-arg6 + 104 + -var11) * 4 + 48, var14, var13);
        } else {
            var10.method532(arg4 * 4 + 48, (-var11 + 104 - arg6) * 4 + 48, var14, var13, var7.field3652);
        }
        return true;
    }
}

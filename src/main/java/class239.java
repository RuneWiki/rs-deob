import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class239 {

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "Luw;")
    public static class208 field3242 = new class208(42, 3);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 * class485.field6252.field6905.method1340(false) >> 8;
        field3240++;
        if (arg2 != -1) {
            method1574(-10, 104, -25, 44, -102, 102, -6, 13, -82, -96);
        }
        if (var4 == 0 || arg1 == -1) {
            return;
        }
        if (!class718.field9436 && class136.field1797 != -1 && class412.method2390(-6858) && !class193.method1345(-1)) {
            class118.field1597 = class141.method803(123);
            class654 var5 = class176.method1122(class118.field1597, (byte) 117);
            class288.method1748(var5, -65, true);
        }
        class636.method3433(0, class559.field7105, var4, 0, false, arg1);
        class62.method368(-1, (byte) 63, 255);
        class718.field9436 = true;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3241++;
        if (!class86.method536(arg2, arg4, arg3, arg0 ^ 0x5980)) {
            return false;
        }
        int var10 = class120.field1609[2];
        int var11 = class120.field1609[0];
        int var12 = class120.field1609[1];
        if (!class86.method536(arg9, arg8, arg1, 98)) {
            return false;
        }
        int var13 = class120.field1609[2];
        if (arg0 != 23014) {
            method1573(-106, -49, 2, -127);
        }
        int var14 = class120.field1609[1];
        int var15 = class120.field1609[0];
        if (class86.method536(arg7, arg5, arg6, 125)) {
            int var16 = class120.field1609[1];
            int var17 = class120.field1609[0];
            int var18 = class120.field1609[2];
            return class115.method668(var14, var13, var15, arg0 ^ 0xFFFFA670, var12, var17, var18, var11, var16, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
    public static void method1575(int arg0) {
        if (arg0 == 3) {
            field3242 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class348 {

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public int field4867 = 0;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field4869 = 500;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lcea;II)V")
    private final void method2188(class215 arg0, int arg1, int arg2) {
        if (arg1 == 5) {
            this.field4867 = arg0.method1478(842397944);
        }
        field4868++;
        int var4 = 60 % ((arg2 - 33) / 57);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4866++;
        if (class722.method4007(arg1, (byte) 84)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (class241.field3529) {
                var10 = class451.field6369;
                var14 = class68.field1278;
                var12 = class451.field6367;
                var11 = class212.field3010;
                var13 = class480.field6702;
                class68.field1278 = 1;
            }
            if (class605.field8299[arg1] == null) {
                class618.method3501(arg8, arg0, arg3 < 0, arg4, arg2, arg3, arg5, false, class396.field5798[arg1], -1, arg6);
            } else {
                class618.method3501(arg8, arg0, arg3 < 0, arg4, arg2, arg3, arg5, false, class605.field8299[arg1], -1, arg6);
            }
            if (arg7 <= 58) {
                field4869 = -84;
            }
            if (class241.field3529) {
                if (arg3 >= 0 && class68.field1278 == 2) {
                    class546.method3152(-5590, class451.field6369, class451.field6367, class212.field3010, class480.field6702);
                }
                class68.field1278 = var14;
                class451.field6367 = var12;
                class212.field3010 = var11;
                class480.field6702 = var13;
                class451.field6369 = var10;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class286.field3995[var9] = true;
            }
        } else {
            class286.field3995[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lcea;Z)V")
    public final void method2190(class215 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                field4870++;
                if (!arg1) {
                    this.field4867 = 58;
                    return;
                }
                return;
            }
            this.method2188(arg0, var3, -105);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class700 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lcq;")
    public static class110 field9810 = new class110(7, 3);

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Z")
    public static boolean field9812 = false;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 3)
    public static void method3846(byte arg0) {
        if (arg0 != -29) {
            method3848(true, -82);
        }
        field9810 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BIII)V", line = 21)
    public static final void method3847(byte arg0, int arg1, int arg2, int arg3) {
        field9809++;
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        class508.field7300 = var6;
        class654.field9173 = var4;
        if (class538.field7572 == 2) {
            class605.field8502 = var5;
            class485.field6986 = var4;
            class505.field7273 = var6;
        }
        class61.method327(-83);
        if (arg0 == -109) {
            class119.field1336 = true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Z", line = 46)
    public static final boolean method3848(boolean arg0, int arg1) {
        if (arg1 < 64) {
            return true;
        }
        field9811++;
        boolean var2 = class701.field9813.method1044();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class701.field9813.method967();
        } else if (!class701.field9813.method977()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class639.field9075.field6771 = arg0;
            class639.field9075.method2642(-2, class353.field4757);
            return true;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class445 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Z")
    public static boolean field6337 = true;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Z")
    public static boolean field6334 = false;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field6336 = -1;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lvf;")
    public static class166 field6339 = new class166();

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 8)
    public static void method2619(int arg0) {
        field6339 = null;
        if (arg0 != 1) {
            field6334 = false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZII)V", line = 18)
    public static final void method2620(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6338++;
        class188.field2543 = 0L;
        int var5 = class71.method366(102);
        if (~arg1 == arg3 || var5 == 3) {
            arg2 = true;
        }
        if (!class231.field3205.method1438()) {
            arg2 = true;
        }
        class482.method2845(var5, arg1, arg4, arg0, arg3 ^ 0x1, arg2);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V", line = 53)
    public static final void method2621(int arg0, byte arg1) {
        field6335++;
        if (!class480.method2837((byte) 84, arg0)) {
            return;
        }
        if (arg1 <= 40) {
            field6336 = 15;
        }
        class256[] var2 = class284.field4130[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class256 var4 = var2[var3];
            if (var4 != null) {
                var4.field3696 = 0;
                var4.field3639 = 0;
                var4.field3637 = 1;
            }
        }
    }
}

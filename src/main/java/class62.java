import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class62 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Lff;")
    public static class9 field968 = new class9(31, 2);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Lfk;")
    public static class462 field970;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lqa;Z)V")
    public static final void method431(class162 arg0, boolean arg1) {
        if (!arg1) {
            field968 = null;
        }
        if (class206.field2843) {
            class488.method2801((byte) 16, arg0);
        } else {
            class261.method1574(arg0, (byte) 55);
        }
        field967++;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        field970 = null;
        field968 = null;
        if (arg0 != 31) {
            field970 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIBIII)V")
    public static final void method433(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var10 = arg5 + 1;
        class427.method2465(class457.field6299[arg5], arg1, arg3, -7, arg4);
        field969++;
        int var9 = arg0 - 1;
        class427.method2465(class457.field6299[arg0], arg1, arg3, -7, arg4);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var8 = class457.field6299[var6];
            var8[arg3] = var8[arg1] = arg4;
        }
        int var7 = -100 / (-arg2 / 42);
    }
}

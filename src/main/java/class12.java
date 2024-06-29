import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class12 extends class28 {

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "Lpi;")
    public class303 field124;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "Lra;")
    public static class361 field125 = new class361(89, 7);

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "[I")
    public static int[] field127 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "Lpe;")
    public static class615 field123;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZIBIIZI)V")
    public static final void method60(boolean arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 > arg6) {
            int var7 = (arg3 + arg6) / 2;
            int var8 = arg6;
            class138 var9 = class202.field2638[var7];
            class202.field2638[var7] = class202.field2638[arg3];
            class202.field2638[arg3] = var9;
            for (int var10 = arg6; var10 < arg3; var10++) {
                if (class256.method1612(-1, arg1, arg4, arg0, class202.field2638[var10], var9, arg5) <= 0) {
                    class138 var11 = class202.field2638[var10];
                    class202.field2638[var10] = class202.field2638[var8];
                    class202.field2638[var8++] = var11;
                }
            }
            class202.field2638[arg3] = class202.field2638[var8];
            class202.field2638[var8] = var9;
            method60(arg0, arg1, (byte) 67, var8 - 1, arg4, arg5, arg6);
            method60(arg0, arg1, (byte) 103, arg3, arg4, arg5, var8 + 1);
        }
        field126++;
        int var12 = -94 / ((-arg2 - 24) / 52);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
    public static void method61(byte arg0) {
        field123 = null;
        if (arg0 < -37) {
            field125 = null;
            field127 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lpi;)V")
    public class12(class303 arg0) {
        this.field124 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class363 {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field4651 = 0;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Leaa;")
    public static class380 field4650 = new class380("WTWIP", 3);

    @OriginalMember(owner = "client!je", name = "e", descriptor = "F")
    public static float field4652;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method2041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class721.method4044(class591.field8480[arg0], arg5, (byte) -126, arg4, arg1);
        field4649++;
        int var9 = arg2 - 1;
        class721.method4044(class591.field8480[arg2], arg5, (byte) -120, arg4, arg1);
        if (arg3 != 0) {
            field4652 = 0.007931172F;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class591.field8480[var6];
            var7[arg5] = var7[arg4] = arg1;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 38)
    public static void method2042(byte arg0) {
        if (arg0 < 117) {
            method2042((byte) -27);
        }
        field4650 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class442 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "F")
    public static float field6222 = 1.0F;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2662(byte arg0) {
        field6223++;
        class66.field937.method452(((float) class712.field9959.field1278.method2685(50) * 0.1F + 0.7F) * 1.1523438F);
        class66.field937.method533(class382.field5572, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class66.field937.method550(class730.field10129, -1, 0);
        class66.field937.method473(class708.field9928);
        if (arg0 != 35) {
            method2662((byte) -65);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V", line = 20)
    public static final void method2663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6221++;
        int var7 = arg6 - arg5;
        int var8 = arg4 + arg5;
        for (int var9 = arg4; var9 < var8; var9++) {
            class138.method1069(class785.field10808[var9], (byte) -113, arg1, arg3, arg0);
        }
        int var10 = arg3 - arg5;
        int var11 = arg1 + arg5;
        for (int var12 = arg6; var12 > var7; var12--) {
            class138.method1069(class785.field10808[var12], (byte) -48, arg1, arg3, arg0);
        }
        if (arg2 != -1) {
            field6220 = -118;
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class785.field10808[var13];
            class138.method1069(var14, (byte) 93, arg1, var11, arg0);
            class138.method1069(var14, (byte) 91, var10, arg3, arg0);
        }
    }
}

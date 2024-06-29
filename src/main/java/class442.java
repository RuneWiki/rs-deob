import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class442 extends class239 {

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Z")
    public static boolean field6559 = false;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Lbg;")
    public static class324 field6560 = new class324(11, -2);

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "[I")
    public static int[] field6562 = new int[5];

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Lya;")
    public static class38 field6561;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public static void method2697(byte arg0) {
        field6561 = null;
        field6560 = null;
        field6562 = null;
        if (arg0 != -59) {
            field6562 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lwn;[[BB)V")
    public static final void method2698(class507 arg0, byte[][] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.field4002; var3++) {
            class106.method876((byte) -109);
            for (int var4 = 0; var4 < class397.field5828 >> 3; var4++) {
                for (int var5 = 0; var5 < (class457.field6713 >> 3); var5++) {
                    int var6 = class310.field4420[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field3990 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class411.field6110.length; var12++) {
                                if (class411.field6110[var12] == var11 && arg1[var12] != null) {
                                    arg0.method3028(arg1[var12], var4 * 8, (var9 & 0x7) * 8, var8, var5 * 8, var3, class225.field3300, (var10 & 0x7) * 8, class455.field6684, var7, (byte) 103);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field6558++;
        if (arg2 <= 82) {
            field6560 = null;
        }
    }
}

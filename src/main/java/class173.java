import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class173 {

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field2690 = -1;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Lej;")
    public static class124 field2686 = new class124(82, 18);

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIBI)I")
    public static final int method1293(int arg0, int arg1, byte arg2, int arg3) {
        field2691++;
        int var4 = -114 / ((arg2 - 74) / 45);
        int var5 = arg3 / arg0;
        int var6 = arg0 - 1 & arg3;
        int var7 = arg1 / arg0;
        int var8 = arg1 & arg0 - 1;
        int var9 = class211.method1448(var5, -1, var7);
        int var10 = class211.method1448(var5 + 1, -1, var7);
        int var11 = class211.method1448(var5, -1, var7 + 1);
        int var12 = class211.method1448(var5 + 1, -1, var7 + 1);
        int var13 = class514.method3008(var10, (byte) 22, arg0, var6, var9);
        int var14 = class514.method3008(var12, (byte) 22, arg0, var6, var11);
        return class514.method3008(var14, (byte) 22, arg0, var8, var13);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIIII)I")
    public static final int method1294(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2689++;
        int var5 = arg1 & 0xF;
        if (!arg0) {
            field2686 = null;
        }
        int var6 = var5 < 8 ? arg4 : arg3;
        int var7 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg4 : arg2);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BI)V")
    public static final void method1295(byte arg0, int arg1) {
        field2687++;
        if (class591.field8070 == null) {
            class591.field8070 = new byte[4][class376.field5325][class175.field2711];
        }
        if (arg1 != 28587) {
            method1293(35, -47, (byte) 56, -93);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class376.field5325; var3++) {
                for (int var4 = 0; var4 < class175.field2711; var4++) {
                    class591.field8070[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method1296(int arg0) {
        field2686 = null;
        if (arg0 != 1) {
            method1293(-115, 106, (byte) -74, -75);
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
    public static final void method1297(int arg0) {
        field2688++;
        class587.method3353(arg0 ^ 0x315E, false);
        if (arg0 == -12648 && class398.field5839 >= 0 && class398.field5839 != 0) {
            class171.method1284(false, (byte) 116, class398.field5839);
            class398.field5839 = -1;
        }
    }
}

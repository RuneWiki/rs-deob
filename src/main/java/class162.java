import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class162 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[J")
    public static long[] field3052 = new long[500];

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Ldl;")
    public static class31 field3051 = new class31(512);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBII)V")
    public static final void method1167(int arg0, byte arg1, int arg2, int arg3) {
        field3048++;
        class174 var4 = class249.method1671(9, arg2, (byte) 83);
        if (arg1 != -103) {
            field3050 = 57;
        }
        var4.method1233(arg1 ^ 0xFFFFFF99);
        var4.field3186 = arg0;
        var4.field3190 = arg3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method1168(int arg0) {
        field3052 = null;
        field3051 = null;
        if (arg0 != 500) {
            field3051 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static final void method1169(byte arg0) {
        field3053++;
        int var1 = -27 % ((-arg0 - 34) / 37);
        boolean var2 = false;
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < (class127.field2283 - 1); var3++) {
                if (class55.field936[var3] < 1000 && class55.field936[var3 + 1] > 1000) {
                    var2 = false;
                    class185 var4 = class107.field1922[var3];
                    class107.field1922[var3] = class107.field1922[var3 + 1];
                    class107.field1922[var3 + 1] = var4;
                    class185 var5 = class37.field587[var3];
                    class37.field587[var3] = class37.field587[var3 + 1];
                    class37.field587[var3 + 1] = var5;
                    int var6 = class78.field1353[var3];
                    class78.field1353[var3] = class78.field1353[var3 + 1];
                    class78.field1353[var3 + 1] = var6;
                    int var7 = class49.field809[var3];
                    class49.field809[var3] = class49.field809[var3 + 1];
                    class49.field809[var3 + 1] = var7;
                    int var8 = class158.field3004[var3];
                    class158.field3004[var3] = class158.field3004[var3 + 1];
                    class158.field3004[var3 + 1] = var8;
                    short var9 = class55.field936[var3];
                    class55.field936[var3] = class55.field936[var3 + 1];
                    class55.field936[var3 + 1] = var9;
                    long var10 = field3052[var3];
                    field3052[var3] = field3052[var3 + 1];
                    field3052[var3 + 1] = var10;
                }
            }
        }
    }
}

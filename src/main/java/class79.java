import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class79 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[Z")
    public static boolean[] field1379 = new boolean[100];

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lta;")
    public static class105 field1384 = null;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lub;")
    private static class227 field1386 = class257.method1749("Members object", 17263);

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lub;")
    public static class227 field1385 = field1386;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[Lr;")
    public static class65[] field1382;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V")
    public static final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1380++;
        for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
            for (int var12 = arg3; var12 <= (arg3 + arg5); var12++) {
                if (var12 >= 0 && var12 < 104 && var6 >= 0 && var6 < 104) {
                    class51.field895[arg0][var12][var6] = 127;
                }
            }
        }
        int var7 = arg1;
        int var8 = 76 % ((arg4 - 47) / 53);
        while (arg1 + arg2 > var7) {
            for (int var11 = arg3; var11 < (arg3 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var7 >= 0 && var7 < 104) {
                    class98.field1717[arg0][var11][var7] = arg0 <= 0 ? 0 : class98.field1717[arg0 - 1][var11][var7];
                }
            }
            var7++;
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg2; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class98.field1717[arg0][arg3][var9] = class98.field1717[arg0][arg3 - 1][var9];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var10 = arg3 + 1; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class98.field1717[arg0][var10][arg1] = class98.field1717[arg0][var10][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || arg3 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg0 != 0) {
            if (arg3 > 0 && class98.field1717[arg0][arg3 - 1][arg1] != class98.field1717[arg0 - 1][arg3 - 1][arg1]) {
                class98.field1717[arg0][arg3][arg1] = class98.field1717[arg0][arg3 - 1][arg1];
                return;
            }
            if (arg1 > 0 && class98.field1717[arg0][arg3][arg1 - 1] != class98.field1717[arg0 - 1][arg3][arg1 - 1]) {
                class98.field1717[arg0][arg3][arg1] = class98.field1717[arg0][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && class98.field1717[arg0][arg3 - 1][arg1 - 1] != class98.field1717[arg0 - 1][arg3 - 1][arg1 - 1]) {
                class98.field1717[arg0][arg3][arg1] = class98.field1717[arg0][arg3 - 1][arg1 - 1];
                return;
            }
            return;
        }
        if (arg3 > 0 && class98.field1717[arg0][arg3 - 1][arg1] != 0) {
            class98.field1717[arg0][arg3][arg1] = class98.field1717[arg0][arg3 - 1][arg1];
            return;
        }
        if (arg1 > 0 && class98.field1717[arg0][arg3][arg1 - 1] != 0) {
            class98.field1717[arg0][arg3][arg1] = class98.field1717[arg0][arg3][arg1 - 1];
            return;
        }
        if (arg3 > 0 && arg1 > 0 && class98.field1717[arg0][arg3 - 1][arg1 - 1] != 0) {
            class98.field1717[arg0][arg3][arg1] = class98.field1717[arg0][arg3 - 1][arg1 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method461(int arg0) {
        if (arg0 != -105) {
            method460(2, 126, 5, 124, 127, -17);
        }
        field1379 = null;
        field1385 = null;
        field1382 = null;
        field1384 = null;
        field1386 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public static final void method462(int arg0, int arg1, int arg2) {
        class215.field3630 = true;
        class9.field173 = arg0;
        class171.field2867 = arg1;
        class201.field3458 = arg2;
        class8.field160 = -1;
        class261.field4540 = -1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLub;Lnj;)I")
    public static final int method463(byte arg0, class227 arg1, class226 arg2) {
        int var3 = arg2.field3879;
        arg2.method1462(arg1.field3915, false);
        arg2.field3879 += class173.field2889.method1284(arg1.field3915, 0, arg1.field3955, arg2.field3901, arg2.field3879, (byte) -113);
        if (arg0 > -126) {
            field1382 = null;
        }
        field1381++;
        return arg2.field3879 - var3;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static final void method464(int arg0) {
        field1383++;
        if (arg0 != -20923) {
            return;
        }
        while (true) {
            class198 var1 = class192.field3256;
            class41 var2;
            synchronized (class192.field3256) {
                var2 = (class41) class51.field907.method1269((byte) 125);
            }
            if (var2 == null) {
                return;
            }
            var2.field675.method344(var2.field678, -2, false, (int) var2.field1113, var2.field680);
        }
    }
}

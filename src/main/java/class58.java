import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class58 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public static int[] field1177 = new int[1000];

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lcc;")
    public static class209 field1176 = class95.method669(105, "niveau ");

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)I")
    public static final int method446(int arg0, byte arg1, int arg2) {
        if (arg1 <= 83) {
            field1177 = null;
        }
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        field1179++;
        return (var5 & 0x7FAC89B) >> 19;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static final void method447(boolean arg0) {
        field1175++;
        int var1 = class111.field2245;
        if (arg0) {
            return;
        }
        int var2 = class172.field3149;
        int var3 = class186.field3347;
        int var4 = class117.field2349;
        int var5 = 6116423;
        class4.method39(var1, var3, var4, var2, var5);
        class4.method39(var1 + 1, var3 + 1, var4 - 2, 16, 0);
        class4.method41(var1 + 1, var3 + 18, var4 - 2, var2 + -19, 0);
        class66.field1269.method1295(class11.field212, var1 + 3, var3 - -14, var5, -1);
        int var6 = class150.field2735;
        int var7 = class126.field2435;
        for (int var8 = 0; var8 < class98.field1912; var8++) {
            int var9 = 16777215;
            int var10 = (class98.field1912 - var8 - 1) * 15 + var3 + 31;
            if (var6 > var1 && var6 < (var1 + var4) && (var10 - 13) < var7 && var7 < (var10 + 3)) {
                var9 = 16776960;
            }
            class66.field1269.method1295(class99.method690(-128, var8), var1 + 3, var10, var9, 0);
        }
        class193.method1321(class111.field2245, 11053, class172.field3149, class186.field3347, class117.field2349);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method448(int arg0) {
        field1176 = null;
        if (arg0 == -19798) {
            field1177 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)I")
    public static final int method449(int arg0, int arg1, int arg2, int arg3) {
        field1178++;
        if ((class285.field5023[arg1][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class285.field5023[1][arg2][arg0] & 0x2) == 0) {
            return arg3 == -4537 ? arg1 : 98;
        } else {
            return arg1 - 1;
        }
    }
}

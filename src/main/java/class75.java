import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 extends class82 {

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "[I")
    public int[] field1214 = new int[] { -1 };

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[I")
    public int[] field1218 = new int[1];

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Z")
    public static boolean field1216 = false;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field1219 = -1;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field1220 = -1;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Ldb;")
    public static class17 field1215 = new class17(64);

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static final void method503(boolean arg0) {
        int var1 = class295.field4678 >> 7;
        if (arg0) {
            field1221 = -99;
        }
        while (class84.field1336 >= 2048.0F) {
            class84.field1336 -= 2048.0F;
        }
        if (class83.field1327 < 128.0F) {
            class83.field1327 = 128.0F;
        }
        int var2 = class124.field1879 >> 7;
        if (class83.field1327 > 383.0F) {
            class83.field1327 = 383.0F;
        }
        while (class84.field1336 < 0.0F) {
            class84.field1336 += 2048.0F;
        }
        field1213++;
        int var3 = class183.method1139(class99.field1557, class124.field1879, class295.field4678, (byte) 117);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class99.field1557;
                    if (var7 < 3 && (class221.field3333[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = ((class163.field2508[var7][var5][var6] & 0xFF) * 8) + var3 - class67.field1072[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class273.field4113) {
            class273.field4113 += (var9 - class273.field4113) / 24;
        } else if (class273.field4113 > var9) {
            class273.field4113 += (var9 - class273.field4113) / 80;
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static void method504(int arg0) {
        if (arg0 >= -124) {
            field1220 = -58;
        }
        field1215 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public static final int method505(int arg0, int arg1) {
        if (arg1 != -31119) {
            method503(true);
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        field1217++;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}

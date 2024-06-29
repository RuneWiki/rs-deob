import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class222 extends class167 {

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "Lmf;")
    public class150 field3966;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "Le;")
    public static class191 field3968 = class54.method368("underlay", 2047);

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field3970 = -1;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "Le;")
    public static class191 field3971 = class54.method368("Weiter", 2047);

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "[I")
    public static int[] field3967 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "Le;")
    public static class191 field3973 = class54.method368("null", 2047);

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "Le;")
    private static class191 field3969 = class54.method368("Created gameworld", 2047);

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "Le;")
    public static class191 field3972 = field3969;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "Le;")
    public static class191 field3974 = class54.method368("(R", 2047);

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIII)I")
    public static final int method1546(int arg0, int arg1, int arg2, int arg3) {
        field3964++;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg0;
        if (arg0 < 3 && (class270.field4755[1][var5][var4] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = (128 - var6) * class12.field143[var7][var5][var4 + 1] + class12.field143[var7][var5 + 1][var4 + 1] * var6 >> 7;
        int var9 = (128 - var6) * class12.field143[var7][var5][var4] + class12.field143[var7][var5 + 1][var4] * var6 >> 7;
        int var10 = arg2 & 0x7F;
        if (arg3 != 247425607) {
            field3967 = null;
        }
        return (128 - var10) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static void method1547(byte arg0) {
        field3974 = null;
        field3972 = null;
        field3971 = null;
        field3969 = null;
        field3967 = null;
        field3968 = null;
        field3973 = null;
        if (arg0 != 15) {
            field3972 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lmf;)V")
    public class222(class150 arg0) {
        this.field3966 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public static final void method1548(int arg0) {
        while (true) {
            if (class107.field1776.method1100(class253.field4486, (byte) -118) >= 11) {
                int var1 = class107.field1776.method1099((byte) 120, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class245.field4357[var1] == null) {
                        var2 = true;
                        class245.field4357[var1] = new class76();
                        if (class134.field2254[var1] != null) {
                            class245.field4357[var1].method488(class134.field2254[var1], arg0 ^ 0x71);
                        }
                    }
                    class73.field1271[class260.field4586++] = var1;
                    class76 var3 = class245.field4357[var1];
                    var3.field2992 = class135.field2267;
                    int var4 = class107.field1776.method1099((byte) 123, 1);
                    if (var4 == 1) {
                        class18.field247[class90.field1460++] = var1;
                    }
                    int var5 = class192.field3422[class107.field1776.method1099((byte) 117, 3)];
                    if (var2) {
                        var3.field2964 = var3.field2999 = var5;
                    }
                    int var6 = class107.field1776.method1099((byte) 118, 1);
                    int var7 = class107.field1776.method1099((byte) 116, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class107.field1776.method1099((byte) 125, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method492(class175.field2946.field2953[0] + var8, class175.field2946.field3014[0] + var7, (byte) 105, var6 == 1);
                    continue;
                }
            }
            if (arg0 != 1) {
                method1546(-62, -6, 27, 123);
            }
            class107.field1776.method1103((byte) -33);
            field3965++;
            return;
        }
    }
}

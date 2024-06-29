import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class132 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lke;")
    public static class106 field2349 = new class106();

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2354 = 0;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[Ltk;")
    public static class239[] field2352 = new class239[50];

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Lcd;")
    public static class64 field2355 = class44.method335((byte) 71, " <col=ffffff>");

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lcd;")
    private static class64 field2353 = class44.method335((byte) 71, "purple:");

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Lcd;")
    public static class64 field2357 = field2353;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lcd;")
    public static class64 field2358 = field2353;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[[S")
    public static short[][] field2360 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lcd;")
    public static class64 field2359 = class44.method335((byte) 71, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIII)V", line = 4)
    public static final void method946(byte arg0, int arg1, int arg2, int arg3) {
        field2350++;
        if (arg0 == -19) {
            class299 var4 = class158.method1135(arg1, arg0 ^ 0x4E, 9);
            var4.method2091(39);
            var4.field5153 = arg2;
            var4.field5152 = arg3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 36)
    public static void method947(int arg0) {
        field2355 = null;
        field2353 = null;
        if (arg0 != 192) {
            method948(-26, 57, 10, -50, 91, -38);
        }
        field2358 = null;
        field2352 = null;
        field2357 = null;
        field2349 = null;
        field2360 = (short[][]) null;
        field2359 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)Z", line = 52)
    public static final boolean method948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class106.field1957[arg0][var8][var9] == -class226.field3837) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class96.field1764[arg0][arg1][arg3] + arg5;
            if (!class164.method1178(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class164.method1178(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class164.method1178(var10, var12, var14)) {
                return false;
            } else if (class164.method1178(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class281.method1946(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class164.method1178(var6 + 1, class96.field1764[arg0][arg1][arg3] + arg5, var7 + 1) && class164.method1178(var6 + 128 - 1, class96.field1764[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class164.method1178(var6 + 128 - 1, class96.field1764[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class164.method1178(var6 + 1, class96.field1764[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)Lsl;", line = 127)
    public static final class92 method949(int arg0, boolean arg1) {
        field2348++;
        class92 var2 = (class92) class233.field3944.method1194((long) arg0, (byte) -73);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class173.field2992.method1580(0, class175.method1226(arg0, (byte) -102), class2.method5(13446, arg0));
        if (arg1) {
            return (class92) null;
        }
        class92 var4 = new class92();
        var4.field1654 = arg0;
        if (var3 != null) {
            var4.method698(1, new class13(var3));
        }
        var4.method709(-124);
        if (var4.field1681 != -1) {
            var4.method696(method949(var4.field1681, arg1), 98, method949(var4.field1703, arg1));
        }
        if (var4.field1672 != -1) {
            var4.method700(method949(var4.field1672, arg1), method949(var4.field1706, arg1), -5);
        }
        if (!class164.field2887 && var4.field1660) {
            var4.field1713 = null;
            var4.field1682 = null;
            var4.field1653 = false;
            var4.field1669 = class134.field2381;
            var4.field1659 = 0;
        }
        class233.field3944.method1190(12669, var4, (long) arg0);
        return var4;
    }
}

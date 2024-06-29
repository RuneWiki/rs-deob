import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class161 extends class109 {

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Z")
    public static boolean field3282 = false;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Ldd;")
    public static class35 field3283 = class180.method1196((byte) -41, "Welt");

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field3277 = -1;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lo;")
    public class134 field3285;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lhb;")
    public class72 field3281;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[B")
    public byte[] field3274;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)I")
    public static final int method1071(boolean arg0) {
        field3286++;
        if (!arg0) {
            method1074(8, true, 42, 41, -102, -6);
        }
        int var1 = class73.method583(class175.field3585, class8.field122, class26.field571, (byte) 1);
        return var1 - class51.field1150 >= 800 || (class40.field894[class175.field3585][class26.field571 >> 7][class8.field122 >> 7] & 0x4) == 0 ? 3 : class175.field3585;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method1072(byte arg0) {
        field3283 = null;
        int var1 = 72 % ((23 - arg0) / 61);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
    public static final int method1073(int arg0, int arg1, int arg2) {
        field3273++;
        if (arg0 == 0) {
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg2 - var3;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZIIII)Lba;")
    public static final class12 method1074(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3275++;
        long var6 = ((long) arg5 << 16) + (long) arg2 + ((long) arg3 << 38) + ((long) arg4 << 40);
        if (!arg1) {
            class12 var8 = (class12) class45.field971.method817(true, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = class207.method1370((byte) -73, arg2);
        if (arg5 > 1 && var9.field1018 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg5 >= var9.field1028[var11] && var9.field1028[var11] != 0) {
                    var10 = var9.field1018[var11];
                }
            }
            if (var10 != -1) {
                var9 = class207.method1370((byte) -73, var10);
            }
        }
        class177 var12 = var9.method421(128);
        if (var12 == null) {
            return null;
        }
        class12 var13 = null;
        if (var9.field1004 != -1) {
            var13 = method1074(-7338, true, var9.field1035, 1, 0, 10);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class140.field2964;
        int var15 = class140.field2968;
        int[] var16 = new int[4];
        int var17 = class140.field2963;
        class140.method966(var16);
        class12 var18 = new class12(36, 32);
        if (arg0 != -7338) {
            field3283 = null;
        }
        class140.method972(var18.field222, 36, 32);
        class140.method968();
        class11.method85();
        class11.method76(16, 16);
        class11.field200 = false;
        int var19 = var9.field1031;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class11.field211[var9.field1037] * var19 >> 16;
        int var21 = class11.field201[var9.field1037] * var19 >> 16;
        var12.method608();
        var12.method617(0, var9.field1000, var9.field984, var9.field1037, var9.field988, var20 + var9.field1006 - var12.field2440 / 2, var9.field1006 + var21);
        if (arg3 >= 1) {
            var18.method110(1);
        }
        if (arg3 >= 2) {
            var18.method110(16777215);
        }
        if (arg4 != 0) {
            var18.method94(arg4);
        }
        class140.method972(var18.field222, 36, 32);
        if (var9.field1004 != -1) {
            var13.method115(0, 0);
        }
        if (!arg1 && (var9.field983 == 1 || arg5 != 1) && arg5 != -1) {
            class14.field250.method1322(class107.method788(true, arg5), 0, 9, 16776960, 1);
        }
        if (!arg1) {
            class45.field971.method816(var18, var6, 16);
        }
        class140.method972(var14, var15, var17);
        class140.method961(var16);
        class11.method85();
        class11.field200 = true;
        return var18;
    }
}

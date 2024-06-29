import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class265 extends class137 {

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lhh;")
    public static class163 field4600 = class137.method1065(" <col=ffffff>", 17);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lhh;")
    public static class163 field4599 = class137.method1065("null", 17);

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field4605 = 0;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lhh;")
    private static class163 field4601 = class137.method1065("Cancel", 17);

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lhh;")
    public static class163 field4596 = field4601;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lhh;")
    private static class163 field4607 = class137.method1065("Choose Option", 17);

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Lhh;")
    private static class163 field4608 = class137.method1065("Created gameworld", 17);

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "Lhh;")
    public static class163 field4615 = field4607;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Lhh;")
    public static class163 field4617 = class137.method1065("<br>(X100(U(Y", 17);

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Lhh;")
    public static class163 field4614 = field4608;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "[S")
    public static short[] field4602 = new short[256];

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "Lhh;")
    public static class163 field4618 = class137.method1065("hint_mapmarkers", 17);

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Lpa;")
    public static class123 field4610;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1785(int arg0, int arg1, boolean arg2) {
        field4611++;
        if (arg2) {
            field4617 = null;
        }
        return this.field4603 <= arg1 && this.field4598 >= arg1 && arg0 >= this.field4612 && arg0 <= this.field4616;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static final void method1786(boolean arg0) {
        field4613++;
        if (class205.method1455(0) != 2) {
            return;
        }
        byte var1 = (byte) (class114.field2145 - 4 & 0xFF);
        int var2 = class114.field2145 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class125.field2411[var3][var2][var16] = var1;
            }
        }
        if (!arg0) {
            field4601 = null;
        }
        if (class20.field323 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class215.field3921[var4] = -1000000;
            class106.field2013[var4] = 1000000;
            class235.field4197[var4] = 0;
            class134.field2598[var4] = 1000000;
            class258.field4510[var4] = 0;
        }
        if (class5.field99 != 1) {
            int var5 = class127.method1011(class88.field1636, class123.field2367, class20.field323, 29908);
            if (var5 - class191.field3490 < 800 && (class123.field2344[class20.field323][class123.field2367 >> 7][class88.field1636 >> 7] & 0x4) != 0) {
                class87.method683(false, 1, class123.field2367 >> 7, class259.field4542, class88.field1636 >> 7, false);
                return;
            }
            return;
        }
        if ((class123.field2344[class20.field323][class235.field4203.field3633 >> 7][class235.field4203.field3615 >> 7] & 0x4) != 0) {
            class87.method683(false, 0, class235.field4203.field3633 >> 7, class259.field4542, class235.field4203.field3615 >> 7, false);
        }
        if (class13.field201 >= 310) {
            return;
        }
        int var6 = class123.field2367 >> 7;
        int var7 = class88.field1636 >> 7;
        int var8 = class235.field4203.field3615 >> 7;
        int var9 = class235.field4203.field3633 >> 7;
        int var10;
        if (var9 <= var6) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var7 < var8) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var8) {
                if (var7 < var8) {
                    var7++;
                } else if (var8 < var7) {
                    var7--;
                }
                if ((class123.field2344[class20.field323][var6][var7] & 0x4) != 0) {
                    class87.method683(false, 1, var6, class259.field4542, var7, false);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 < var9) {
                        var6++;
                    } else if (var6 > var9) {
                        var6--;
                    }
                    if ((class123.field2344[class20.field323][var6][var7] & 0x4) != 0) {
                        class87.method683(false, 1, var6, class259.field4542, var7, false);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var9) {
            if (var9 > var6) {
                var6++;
            } else if (var6 > var9) {
                var6--;
            }
            if ((class123.field2344[class20.field323][var6][var7] & 0x4) != 0) {
                class87.method683(false, 1, var6, class259.field4542, var7, false);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var7 < var8) {
                    var7++;
                } else if (var8 < var7) {
                    var7--;
                }
                var15 -= 65536;
                if ((class123.field2344[class20.field323][var6][var7] & 0x4) != 0) {
                    class87.method683(false, 1, var6, class259.field4542, var7, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static void method1787(byte arg0) {
        if (arg0 != 115) {
            method1786(false);
        }
        field4607 = null;
        field4602 = null;
        field4599 = null;
        field4600 = null;
        field4608 = null;
        field4610 = null;
        field4615 = null;
        field4618 = null;
        field4617 = null;
        field4601 = null;
        field4614 = null;
        field4596 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)I")
    public static final int method1788(byte arg0, boolean arg1) {
        if (arg0 >= -50) {
            method1786(true);
        }
        long var2 = class7.method55(0);
        field4619++;
        for (class127 var4 = arg1 ? (class127) class169.field3093.method1747((byte) 82) : (class127) class169.field3093.method1745(-32496); var4 != null; var4 = (class127) class169.field3093.method1745(-32496)) {
            if (var2 > (var4.field2468 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field2468 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2641;
                    class119.field2252[var5] = class213.field3881[var5];
                    var4.method1063(97);
                    return var5;
                }
                var4.method1063(85);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field4609++;
        int var8 = arg2 + arg4;
        int var9 = arg6 - arg2;
        for (int var10 = arg4; var10 < var8; var10++) {
            class227.method1585(arg5, (byte) -66, arg3, class85.field1605[var10], arg1);
        }
        int var11 = 48 / ((arg7 + 4) / 32);
        for (int var12 = arg6; var12 > var9; var12--) {
            class227.method1585(arg5, (byte) -66, arg3, class85.field1605[var12], arg1);
        }
        int var13 = arg1 - arg2;
        int var14 = arg2 + arg5;
        for (int var15 = var8; var15 <= var9; var15++) {
            int[] var16 = class85.field1605[var15];
            class227.method1585(arg5, (byte) -66, arg3, var16, var14);
            class227.method1585(var14, (byte) -66, arg0, var16, var13);
            class227.method1585(var13, (byte) -66, arg3, var16, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIII)V")
    public class265(int arg0, int arg1, int arg2, int arg3) {
        this.field4603 = arg0;
        this.field4616 = arg3;
        this.field4612 = arg1;
        this.field4598 = arg2;
    }
}

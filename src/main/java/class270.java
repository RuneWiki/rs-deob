import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class270 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[Lkc;")
    public static class286[] field4275 = new class286[14];

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Z")
    public static boolean field4274 = false;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4279 = 2;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
    public static int[] field4281;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method1824(int arg0) {
        field4278++;
        if (!class179.field2678) {
            return;
        }
        if (arg0 != 64512) {
            method1827(-125, 15, 62);
        }
        class188 var1 = class32.method261(class10.field197, class217.field3369, arg0 - 64420);
        if (var1 != null && var1.field2972 != null) {
            class39 var2 = new class39();
            var2.field657 = var1;
            var2.field647 = var1.field2972;
            class243.method1648((byte) 51, var2);
        }
        class119.field1835 = -1;
        class179.field2678 = false;
        class246.method1663(255, var1);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field4275 = null;
        field4281 = null;
        if (arg0 != 5404) {
            field4274 = true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public static final void method1826(int arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg1 != 96) {
            field4275 = null;
        }
        while (var3 < class17.field273) {
            class202 var4 = class58.method461(var3, (byte) -127);
            if (var4 != null) {
                int var5 = var4.field3159;
                if (var5 >= 0 && !class97.field1547.method1894(var5, -75)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field3152 >= 0) {
                    int var6 = var4.field3152;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg2 + var6 & 0xFC00) + var7 + (var6 & 0x380);
                    var9 = class97.field1561[class116.method843(96, 0, var8)];
                } else if (var5 >= 0) {
                    var9 = class97.field1561[class116.method843(96, arg1 - 96, class97.field1547.method1893(var5, ~arg1))];
                } else if (var4.field3151 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field3151;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class97.field1561[class116.method843(96, 0, var12)];
                }
                class237.field3666[var3 + 1] = var9;
            }
            var3++;
        }
        field4277++;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)I")
    public static final int method1827(int arg0, int arg1, int arg2) {
        field4280++;
        class127 var3 = (class127) class251.field3858.method1414(true, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg2 != 27959) {
                field4281 = null;
            }
            while (var3.field1989.length > var5) {
                if (var3.field1998[var5] == arg1) {
                    var4 += var3.field1989[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method1828(boolean arg0) {
        if (arg0) {
            method1825(-53);
        }
        field4276++;
        class287.field4523.method1782(-95);
    }
}

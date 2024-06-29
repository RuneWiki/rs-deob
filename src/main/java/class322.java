import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class322 extends class42 {

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field4217 = -1;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public int field4226 = 0;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field4225 = 1;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field4223;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Lou;")
    public static class428 field4216;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 3)
    public static void method1858(byte arg0) {
        if (arg0 != 13) {
            method1859(true, 94, null);
        }
        field4216 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILql;)V", line = 20)
    public static final void method1859(boolean arg0, int arg1, class515 arg2) {
        field4221++;
        if (class412.field5693 >= 400) {
            return;
        }
        if (class385.field5232 != arg2) {
            if (arg1 != 8032) {
                field4216 = null;
            }
            String var9;
            if (arg2.field7634 == 0) {
                boolean var3 = true;
                if (class385.field5232.field7629 != -1 && arg2.field7629 != -1) {
                    int var4 = arg2.field7607 >= class385.field5232.field7607 ? arg2.field7607 : class385.field5232.field7607;
                    int var5 = arg2.field7629 <= class385.field5232.field7629 ? arg2.field7629 : class385.field5232.field7629;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class385.field5232.field7607 - arg2.field7607;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class191.field2691 == class155.field2265 ? class57.field886.method1764(class489.field6789, false) : class101.field1502.method1764(class489.field6789, false);
                if (arg2.field7607 < arg2.field7624) {
                    var9 = arg2.method3033(true, false) + (var3 ? class177.method1183((byte) -126, arg2.field7607, class385.field5232.field7607) : "<col=ffffff>") + " (" + var8 + arg2.field7607 + "+" + (arg2.field7624 - arg2.field7607) + ")";
                } else {
                    var9 = arg2.method3033(true, false) + (var3 ? class177.method1183((byte) -95, arg2.field7607, class385.field5232.field7607) : "<col=ffffff>") + " (" + var8 + arg2.field7607 + ")";
                }
            } else {
                var9 = arg2.method3033(true, false) + " (" + class479.field6610.method1764(class489.field6789, false) + arg2.field7634 + ")";
            }
            if (class32.field529) {
                if (!arg0 && (class351.field4740 & 0x8) != 0) {
                    class70.method459(-1, class455.field6214 + " -> <col=ffffff>" + var9, true, 0, 57, 23856, class59.field925, class394.field5341, (long) arg2.field6170, 0, false);
                    class234.field3143++;
                }
            } else if (arg0) {
                class70.method459(0, "", false, 0, -1, arg1 + 15824, "<col=cccccc>" + var9, -1, 0L, 0, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class268.field3532[var10] != null) {
                        short var12 = 0;
                        if (class362.field4883 == class155.field2265 && class268.field3532[var10].equalsIgnoreCase(class191.field2693.method1764(class489.field6789, false))) {
                            if (class385.field5232.field7607 < arg2.field7607) {
                                var12 = 2000;
                            }
                            if (class385.field5232.field7612 != 0 && arg2.field7612 != 0) {
                                if (class385.field5232.field7612 == arg2.field7612) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class170.field2485[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class335.field4387[var10] + var12);
                        int var14 = class291.field3819[var10] == -1 ? class420.field5751 : class291.field3819[var10];
                        class70.method459(-1, "<col=ffffff>" + var9, true, 0, var13, 23856, class268.field3532[var10], var14, (long) arg2.field6170, 0, false);
                        class233.field3142++;
                    }
                }
            }
            if (!arg0) {
                for (class39 var11 = (class39) class415.field5733.method1672((byte) -111); var11 != null; var11 = (class39) class415.field5733.method1668(-1)) {
                    if (var11.field590 == 6) {
                        var11.field594 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class32.field529 && (class351.field4740 & 0x10) != 0) {
            class280.field3686++;
            class70.method459(-1, class455.field6214 + " -> <col=ffffff>" + class5.field132.method1764(class489.field6789, false), true, 0, 18, 23856, class59.field925, class394.field5341, 0L, 0, false);
        }
    }
}

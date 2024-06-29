import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class133 {

    @OriginalMember(owner = "client!db", name = "Ec", descriptor = "Lje;")
    private static class67 field429 = class85.method592(255, "Please remove ");

    @OriginalMember(owner = "client!db", name = "Gc", descriptor = "Lje;")
    public static class67 field431 = field429;

    @OriginalMember(owner = "client!db", name = "Kc", descriptor = "Lje;")
    public static class67 field435 = class85.method592(255, " loggt sich aus)3");

    @OriginalMember(owner = "client!db", name = "Ic", descriptor = "[[B")
    public static byte[][] field433 = new byte[250][];

    @OriginalMember(owner = "client!db", name = "Oc", descriptor = "Lje;")
    private static class67 field439 = class85.method592(255, " has logged in)3");

    @OriginalMember(owner = "client!db", name = "Lc", descriptor = "Lje;")
    public static class67 field436 = class85.method592(255, "Welt");

    @OriginalMember(owner = "client!db", name = "Nc", descriptor = "Lje;")
    public static class67 field438 = class85.method592(255, "Fallen lassen");

    @OriginalMember(owner = "client!db", name = "Jc", descriptor = "Lje;")
    public static class67 field434 = field429;

    @OriginalMember(owner = "client!db", name = "Hc", descriptor = "Lje;")
    public static class67 field432 = class85.method592(255, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!db", name = "Uc", descriptor = "I")
    public static int field445 = 0;

    @OriginalMember(owner = "client!db", name = "Mc", descriptor = "Lje;")
    public static class67 field437 = field439;

    @OriginalMember(owner = "client!db", name = "Fc", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!db", name = "Pc", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!db", name = "Qc", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!db", name = "Sc", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!db", name = "Vc", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!db", name = "Rc", descriptor = "Lqa;")
    public class112 field442;

    @OriginalMember(owner = "client!db", name = "Tc", descriptor = "Lwb;")
    public static class155 field444;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)I")
    public static final int method163(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 51 % ((18 - arg2) / 62);
        if (arg1 > 179) {
            arg0 /= 2;
        }
        ++field446;
        if (arg1 > 192) {
            arg0 /= 2;
        }
        if (arg1 > 217) {
            arg0 /= 2;
        }
        if (arg1 > 243) {
            arg0 /= 2;
        }
        return (arg0 / 32 << 7) + ((arg3 / 4 << 10) - -(arg1 / 2));
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Lad;")
    public final class5 method16(int arg0) {
        ++field430;
        if (this.field442 == null) {
            return null;
        } else {
            class93 var2 = ~super.field2991 != arg0 && super.field2987 == 0 ? class49.method316(super.field2991, false) : null;
            class93 var3 = super.field2960 == -1 || super.field2960 == super.field2954 && var2 != null ? null : class49.method316(super.field2960, false);
            class5 var4 = this.field442.method886(super.field2973, var2, arg0 ^ -15725, var3, super.field2975);
            if (var4 == null) {
                return null;
            } else {
                var4.method42();
                super.field2940 = var4.field2394;
                if (~super.field2990 != 0 && ~super.field2941 != 0) {
                    class5 var5 = class79.method566(super.field2990, false).method1111((byte) -19, super.field2941);
                    if (var5 != null) {
                        var5.method52(0, -super.field2962, 0);
                        class5[] var6 = new class5[] { var4, var5 };
                        var4 = new class5(var6, 2);
                    }
                }
                if (this.field442.field2538 == 1) {
                    var4.field76 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(B)Z")
    public final boolean method164(byte arg0) {
        ++field440;
        int var2 = 100 % ((10 - arg0) / 57);
        return this.field442 != null;
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(B)V")
    public static final void method165(byte arg0) {
        class114.field2580.method767(1);
        ++field441;
        class39.field699.method767(1);
        if (arg0 > -113) {
            field433 = null;
        }
        class133.field2981.method767(1);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([Lkc;IZ)V")
    public static final void method166(class72[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method167(-121);
        }
        for (int var3 = 0; ~var3 > ~arg0.length; ++var3) {
            class72 var4 = arg0[var3];
            if (var4 != null && var4.field1470 == arg1 && (!var4.field1485 || !class60.method417(0, var4))) {
                if (var4.field1546 == 0) {
                    if (!var4.field1485 && class60.method417(0, var4) && class159.field3645 != var4) {
                        continue;
                    }
                    method166(arg0, var4.field1508, true);
                    if (var4.field1494 != null) {
                        method166(var4.field1494, var4.field1508, true);
                    }
                    class60 var5 = (class60) class76.field1634.method1119(28254, (long) var4.field1508);
                    if (var5 != null) {
                        class143.method1105(-124, var5.field1201);
                    }
                }
                if (~var4.field1546 == -7) {
                    if (~var4.field1536 != 0 || ~var4.field1509 != 0) {
                        boolean var6 = class6.method53(var4, (byte) 70);
                        int var7;
                        if (var6) {
                            var7 = var4.field1509;
                        } else {
                            var7 = var4.field1536;
                        }
                        if (~var7 != 0) {
                            class93 var8 = class49.method316(var7, false);
                            var4.field1545 += class60.field1204;
                            while (var4.field1545 > var8.field2072[var4.field1570]) {
                                var4.field1545 -= var8.field2072[var4.field1570];
                                ++var4.field1570;
                                if (~var4.field1570 <= ~var8.field2075.length) {
                                    var4.field1570 -= var8.field2088;
                                    if (~var4.field1570 > -1 || ~var8.field2075.length >= ~var4.field1570) {
                                        var4.field1570 = 0;
                                    }
                                }
                                class23.method160((byte) -29, var4);
                            }
                        }
                    }
                    if (var4.field1555 != 0 && !var4.field1485) {
                        int var9 = var4.field1555 >> 16;
                        int var10 = class60.field1204 * var9;
                        var4.field1542 = var4.field1542 + var10 & 2047;
                        int var11 = var4.field1555 << 16 >> 16;
                        int var12 = class60.field1204 * var11;
                        var4.field1502 = var4.field1502 - -var12 & 2047;
                        class23.method160((byte) -29, var4);
                    }
                }
            }
        }
        ++field443;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static void method167(int arg0) {
        field438 = null;
        field434 = null;
        field444 = null;
        field437 = null;
        field439 = null;
        field435 = null;
        field436 = null;
        field432 = null;
        field429 = null;
        field433 = null;
        int var1 = 93 / ((51 - arg0) / 44);
        field431 = null;
    }
}

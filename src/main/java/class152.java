import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class152 extends class271 {

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field2608 = -1;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[I")
    public static int[] field2610 = new int[32];

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Lwa;")
    public static class75 field2618 = class66.method560("<col=ffffff>", false);

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "J")
    public static long field2613 = 0L;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "Lwa;")
    public static class75 field2622 = class66.method560("Zugewiesener Speicher)3", false);

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Lka;")
    public static class177 field2619;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)[Lje;", line = 6)
    public static final class68[] method1161(int arg0) {
        class68[] var1 = new class68[class149.field2563];
        field2611++;
        for (int var2 = 0; var2 < class149.field2563; var2++) {
            var1[var2] = new class68(class263.field4571, class76.field1321, class85.field1404[var2], class232.field3934[var2], class210.field3590[var2], class287.field4936[var2], class42.field687[var2], class191.field3184);
        }
        class235.method1713(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[B", line = 28)
    public static final byte[] method1162(int arg0, int arg1) {
        if (arg1 != 0) {
            return (byte[]) null;
        }
        class145 var2 = (class145) class158.field2701.method1514(false, (long) arg0);
        field2621++;
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class29.method197(var4, true, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class145(var3);
            class158.field2701.method1509((long) arg0, var2, -1);
        }
        return var2.field2494;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 88)
    public static void method1163(byte arg0) {
        field2610 = null;
        field2618 = null;
        if (arg0 < -97) {
            field2619 = null;
            field2622 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Lwa;", line = 107)
    public static final class75 method1164(boolean arg0) {
        class75 var1 = class51.field837;
        if (!arg0) {
            method1165((byte) 74, (byte) 118);
        }
        if (class265.field4574 != 0) {
            var1 = class238.field4009;
        }
        field2616++;
        return class66.method562((byte) 116, new class75[] { class143.field2476, var1, class20.field272, class67.method565(125, class151.field2592), class83.field1388, class67.method565(87, class98.field1612), class246.field4164 });
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BB)I", line = 135)
    public static final int method1165(byte arg0, byte arg1) {
        field2620++;
        if (arg0 >= 65 && arg0 <= 90) {
            return arg0 - 65;
        } else if (arg0 >= 97 && arg0 <= 122) {
            return arg0 - 71;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return arg0 + 52 - 48;
        } else if (arg0 == 43) {
            return 62;
        } else if (arg0 == 42) {
            return 62;
        } else if (arg0 == 47) {
            return 63;
        } else {
            if (arg1 != -127) {
                field2622 = (class75) null;
            }
            return arg0 == 45 ? 63 : -1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I", line = 177)
    public static final int method1166(int arg0, int arg1, int arg2, int arg3) {
        field2612++;
        if (~(class204.field3459[arg1][arg0][arg2] & 0x8) == arg3) {
            return arg1 <= 0 || (class204.field3459[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)I", line = 196)
    public static final int method1167(int arg0, int arg1) {
        field2609++;
        int var2 = -48 % ((8 - arg0) / 55);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method680(int arg0);

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)Z")
    public abstract boolean method679(int arg0);
}

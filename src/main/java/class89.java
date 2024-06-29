import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class89 extends class182 {

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "[B")
    public byte[] field1627;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "[I")
    public static int[] field1618 = new int[25];

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Lsg;")
    public static class169 field1619 = class165.method1060("Das ist eine Mitglieder)2Welt(Q", 1536);

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "[I")
    public static int[] field1621 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "Lsg;")
    private static class169 field1624 = class165.method1060("This computers address has been blocked", 1536);

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "Lsg;")
    public static class169 field1628 = field1624;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Z")
    public static boolean field1623 = false;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "Lqd;")
    public static class148 field1629;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "[I")
    public static int[] field1622;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
    public static final boolean method523(int arg0, int arg1) {
        if (arg0 > -30) {
            return false;
        } else {
            field1626++;
            return (arg1 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method524(byte arg0) {
        field1624 = null;
        field1618 = null;
        if (arg0 != 54) {
            method524((byte) -97);
        }
        field1629 = null;
        field1619 = null;
        field1628 = null;
        field1621 = null;
        field1622 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
    public static final void method525(int arg0, int arg1, int arg2) {
        field1620++;
        if (class95.field1805 != 0 && class95.field1805 != 3) {
            return;
        }
        if (class56.field1040 == 1) {
            int var3 = class42.field796 - arg0 - 5;
            int var4 = class178.field3480 - arg1 - 25;
            if (var4 >= 0 && var3 >= 0 && var4 < 146 && var3 < 151) {
                var4 -= 73;
                var3 -= 75;
                int var5 = class29.field600 + class182.field3546 & 0x7FF;
                int var6 = class12.field283[var5];
                int var7 = (class148.field2744 + 256) * var6 >> 8;
                int var8 = class12.field279[var5];
                int var9 = (class148.field2744 + 256) * var8 >> 8;
                int var10 = var3 * var7 - var4 * var9 >> 11;
                int var11 = class4.field79.field3679 - var10 >> 7;
                int var12 = var3 * var9 + var4 * var7 >> 11;
                int var13 = class4.field79.field3698 + var12 >> 7;
                boolean var14 = class161.method1037(true, -17868, class4.field79.field3734[0], var13, 1, 0, class4.field79.field3729[0], 0, 0, 0, var11, 0);
                if (var14) {
                    class141.field2621.method821(var4, 64);
                    class141.field2621.method821(var3, arg2 ^ 0xFFFF92D6);
                    class141.field2621.method801(class29.field600, (byte) 87);
                    class141.field2621.method821(57, 64);
                    class141.field2621.method821(class182.field3546, 64);
                    class141.field2621.method821(class148.field2744, 64);
                    class141.field2621.method821(89, 64);
                    class141.field2621.method801(class4.field79.field3698, (byte) 87);
                    class141.field2621.method801(class4.field79.field3679, (byte) 87);
                    class141.field2621.method821(class127.field2365, 64);
                    class141.field2621.method821(63, 64);
                }
            }
        }
        if (arg2 != -28010) {
            method524((byte) -22);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B)V")
    public class89(byte[] arg0) {
        this.field1627 = arg0;
    }
}

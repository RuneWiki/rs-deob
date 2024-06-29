import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public int field1759 = -1;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lmb;")
    private static class84 field1761 = class79.method672(true, "New User");

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lmb;")
    public static class84 field1762 = field1761;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
    public static int[] field1769 = new int[25];

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lhb;")
    public static class51 field1764 = new class51(8);

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lmb;")
    public static class84 field1774 = class79.method672(true, ":");

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "[I")
    public static int[] field1777 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lsb;")
    public class120 field1765;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lsd;")
    public static class122 field1775;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
    public static boolean field1760;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
    public int[] field1766;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "[I")
    public static int[] field1776;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[Lmb;")
    public class84[] field1772;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lsd;B)V")
    public static final void method630(class122 arg0, byte arg1) {
        field1763++;
        class17.field386 = arg0;
        if (arg1 != 17) {
            field1762 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method631(byte arg0) {
        field1764 = null;
        field1762 = null;
        field1761 = null;
        field1769 = null;
        field1775 = null;
        if (arg0 > -32) {
            field1761 = null;
        }
        field1774 = null;
        field1776 = null;
        field1777 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLsd;Lsd;)V")
    public static final void method632(byte arg0, class122 arg1, class122 arg2) {
        class133.field3159 = arg1;
        if (arg0 != -24) {
            method632((byte) 20, null, null);
        }
        field1767++;
        class129.field3104 = arg2;
        class110.field2650 = class133.field3159.method989(3, 87);
    }
}

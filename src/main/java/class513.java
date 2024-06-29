import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class513 extends class539 {

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public int field7010;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public int field7014;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "Lvfa;")
    public static class616 field7017;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)I")
    public final int method2843(byte arg0) {
        field7019++;
        if (arg0 > -27) {
            this.field7010 = -110;
        }
        return (this.field7010 & 0x1FE6B5) >> 18;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)Z")
    public final boolean method2844(boolean arg0) {
        field7011++;
        if (arg0) {
            this.field7014 = -43;
        }
        return (this.field7010 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Z")
    public final boolean method2845(byte arg0) {
        if (arg0 == -94) {
            field7008++;
            return (this.field7010 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2846(int arg0, int arg1, byte arg2) {
        field7016++;
        return arg2 < 34 ? false : (class354.method2100(arg0, -1, arg1) | class469.method2670(arg1, (byte) -105, arg0) | class612.method3377(arg0, arg1, 97)) & class265.method1616(arg0, 119, arg1);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Z")
    public final boolean method2847(byte arg0, int arg1) {
        if (arg0 != -37) {
            this.method2845((byte) -7);
        }
        field7018++;
        return (this.field7010 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
    public final int method2848(int arg0) {
        field7009++;
        return arg0 == -1 ? class110.method824(this.field7010, 114) : 115;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)V")
    public static void method2849(boolean arg0) {
        if (!arg0) {
            field7017 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Z")
    public final boolean method2850(int arg0) {
        if (arg0 == 0) {
            field7015++;
            return (this.field7010 >> 22 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method2851(int arg0, String arg1) {
        field7013++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= (var3 - 2) || class265.method1621(arg1.charAt(var3 - 2), arg0 - 1) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class265.method1621(arg1.charAt(var3 - 1), ~arg0) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class173.method1191(-1, var5, arg1, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ[S)[S")
    public static final short[] method2852(int arg0, boolean arg1, short[] arg2) {
        if (!arg1) {
            method2852(40, false, null);
        }
        field7012++;
        short[] var3 = new short[arg0];
        class282.method1709(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(II)V")
    public class513(int arg0, int arg1) {
        this.field7010 = arg0;
        this.field7014 = arg1;
    }
}

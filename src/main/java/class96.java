import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class96 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ltb;")
    private class173 field1788;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lji;")
    private class134 field1800;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lsk;")
    private class177 field1797;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lha;")
    public static class46 field1786 = class271.method1828(")2", -46);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field1795 = -1;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[I")
    public static int[] field1794 = new int[4096];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lwe;")
    private class75 field1792;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[I")
    public static int[] field1796;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[Lua;")
    private class232[] field1793;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lkb;Lkb;ZZI)Lua;")
    private final class232 method749(class73 arg0, class73 arg1, boolean arg2, boolean arg3, int arg4) {
        field1791++;
        if (this.field1792 == null) {
            throw new RuntimeException();
        }
        this.field1792.field1380 = arg4 * 8 + 5;
        if (this.field1792.field1368.length <= this.field1792.field1380) {
            throw new RuntimeException();
        } else if (this.field1793[arg4] == null) {
            int var6 = this.field1792.method562((byte) -71);
            int var7 = this.field1792.method562((byte) -71);
            if (arg2) {
                class232 var8 = new class232(arg4, arg1, arg0, this.field1788, this.field1800, var6, var7, arg3);
                this.field1793[arg4] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field1793[arg4];
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
    public final boolean method750(byte arg0) {
        field1790++;
        if (this.field1792 != null) {
            return true;
        }
        if (this.field1797 == null) {
            if (this.field1788.method1238((byte) -66)) {
                return false;
            }
            this.field1797 = this.field1788.method1244(true, 255, 255, true, (byte) 0);
        }
        if (this.field1797.field1834) {
            return false;
        } else if (arg0 == -33) {
            this.field1792 = new class75(this.field1797.method20(arg0 ^ 0x5A));
            this.field1793 = new class232[(this.field1792.field1368.length - 5) / 8];
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lkb;ILkb;I)Lua;")
    public final class232 method751(class73 arg0, int arg1, class73 arg2, int arg3) {
        if (arg3 == 255) {
            field1787++;
            return this.method749(arg0, arg2, true, true, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static final void method752(byte arg0) {
        field1789++;
        class58.field967.method285((byte) -90, 202);
        class58.field967.method578((byte) -121, 0L);
        if (arg0 <= 91) {
            field1794 = null;
        }
        class225.field3922++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1796 = null;
        if (arg0 <= 7) {
            method755(-24, -37);
        }
        field1786 = null;
        field1794 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method754(int arg0) {
        field1785++;
        class216.field3818.method83(25216);
        int var1 = -52 % ((-arg0 - 45) / 33);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method755(int arg0, int arg1) {
        if (arg0 != -22551) {
            method754(-109);
        }
        class74.field1332.method81((byte) 30, arg1);
        field1799++;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public final void method756(byte arg0) {
        field1798++;
        if (this.field1793 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1793.length; var2++) {
            if (this.field1793[var2] != null) {
                this.field1793[var2].method1571(-3);
            }
        }
        if (arg0 >= -69) {
            this.field1793 = null;
        }
        for (int var3 = 0; var3 < this.field1793.length; var3++) {
            if (this.field1793[var3] != null) {
                this.field1793[var3].method1583(-32562);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ltb;Lji;)V")
    public class96(class173 arg0, class134 arg1) {
        this.field1788 = arg0;
        this.field1800 = arg1;
        if (!this.field1788.method1238((byte) -66)) {
            this.field1797 = this.field1788.method1244(true, 255, 255, true, (byte) 0);
        }
    }
}

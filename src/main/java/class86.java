import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class86 {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lph;")
    public class32 field1657 = new class32();

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lij;")
    public static class50 field1654 = null;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[I")
    public static int[] field1662 = new int[25];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lph;")
    private class32 field1664;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lph;I)V")
    public final void method677(class32 arg0, int arg1) {
        field1660++;
        if (arg0.field638 != null) {
            arg0.method267(-118);
        }
        if (arg1 != -1) {
            this.field1664 = null;
        }
        arg0.field642 = this.field1657.field642;
        arg0.field638 = this.field1657;
        arg0.field638.field642 = arg0;
        arg0.field642.field638 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILph;Lph;)V")
    public final void method678(int arg0, class32 arg1, class32 arg2) {
        field1651++;
        if (arg1.field638 != null) {
            arg1.method267(111);
        }
        arg1.field638 = arg2.field638;
        arg1.field642 = arg2;
        arg1.field638.field642 = arg1;
        if (arg0 == -1) {
            arg1.field642.field638 = arg1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Lph;")
    public final class32 method679(byte arg0) {
        if (arg0 != -94) {
            return null;
        }
        field1653++;
        class32 var2 = this.field1657.field642;
        if (this.field1657 == var2) {
            return null;
        } else {
            var2.method267(108);
            return var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public final void method680(byte arg0) {
        while (true) {
            class32 var2 = this.field1657.field642;
            if (this.field1657 == var2) {
                field1659++;
                if (arg0 != -68) {
                    this.method678(122, (class32) null, (class32) null);
                }
                this.field1664 = null;
                return;
            }
            var2.method267(arg0 + 173);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Lph;")
    public final class32 method681(int arg0) {
        field1667++;
        class32 var2 = this.field1664;
        if (this.field1657 == var2) {
            this.field1664 = null;
            return null;
        }
        if (arg0 != 2000) {
            method685((byte) -16, 92);
        }
        this.field1664 = var2.field638;
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static void method682(int arg0) {
        if (arg0 != 23952) {
            field1654 = null;
        }
        field1654 = null;
        field1662 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)[B")
    public static final byte[] method683(byte[] arg0, int arg1) {
        field1658++;
        class217 var2 = new class217(arg0);
        int var3 = var2.method1487(255);
        int var4 = var2.method1466((byte) -15);
        if (var4 < 0 || !(class209.field3471 == 0 || class209.field3471 >= var4)) {
            throw new RuntimeException();
        }
        if (arg1 > -101) {
            method683((byte[]) null, 118);
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1456(var5, 128, var4, 0);
            return var5;
        }
        int var6 = var2.method1466((byte) -15);
        if (var6 < 0 || !(class209.field3471 == 0 || var6 <= class209.field3471)) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class168.method1156(var7, var6, arg0, var4, 9);
        } else {
            class172.field2875.method875(var2, (byte) -82, var7);
        }
        return var7;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lph;B)V")
    public final void method684(class32 arg0, byte arg1) {
        if (arg0.field638 != null) {
            arg0.method267(-2);
        }
        arg0.field642 = this.field1657;
        arg0.field638 = this.field1657.field638;
        if (arg1 != 109) {
            field1663 = -54;
        }
        arg0.field638.field642 = arg0;
        field1652++;
        arg0.field642.field638 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Z")
    public static final boolean method685(byte arg0, int arg1) {
        if (arg0 != -126) {
            return false;
        }
        field1655++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class17.field379[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class86() {
        this.field1657.field638 = this.field1657;
        this.field1657.field642 = this.field1657;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
    public static final boolean method686(int arg0, int arg1) {
        int var2 = 17 / ((arg0 + 31) / 46);
        field1661++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)Lph;")
    public final class32 method687(int arg0) {
        if (arg0 != 0) {
            method682(-84);
        }
        field1665++;
        class32 var2 = this.field1657.field638;
        if (this.field1657 == var2) {
            this.field1664 = null;
            return null;
        } else {
            this.field1664 = var2.field638;
            return var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)Lph;")
    public final class32 method688(int arg0) {
        field1666++;
        class32 var2 = this.field1664;
        if (arg0 >= -24) {
            field1654 = null;
        }
        if (this.field1657 == var2) {
            this.field1664 = null;
            return null;
        } else {
            this.field1664 = var2.field642;
            return var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)Lph;")
    public final class32 method689(int arg0) {
        field1656++;
        if (arg0 != 1001) {
            return null;
        }
        class32 var2 = this.field1657.field642;
        if (this.field1657 == var2) {
            this.field1664 = null;
            return null;
        } else {
            this.field1664 = var2.field642;
            return var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)I")
    public final int method690(int arg0) {
        field1649++;
        int var2 = 0;
        if (arg0 >= -123) {
            return -91;
        }
        class32 var3 = this.field1657.field642;
        while (this.field1657 != var3) {
            var3 = var3.field642;
            var2++;
        }
        return var2;
    }
}

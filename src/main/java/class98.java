import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class98 {

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "Lnh;")
    private class128 field1593 = new class128();

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "[[I")
    public static int[][] field1594 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field1603 = 0;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field1601 = new String[200];

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Lnh;")
    private class128 field1596;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLpi;I)V", line = 8)
    public static final void method844(byte arg0, class336 arg1, int arg2) {
        field1599++;
        if (arg0 >= -50 || class112.field1881 == null) {
            return;
        }
        try {
            class112.field1881.method1864(0L, 27);
            class112.field1881.method1865(arg2, 24, -1, arg1.field5342);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 34)
    public final void method845(int arg0) {
        while (true) {
            class128 var2 = this.field1593.field2215;
            if (this.field1593 == var2) {
                field1595++;
                if (arg0 != -3128) {
                    field1590 = 96;
                }
                this.field1596 = null;
                return;
            }
            var2.method1067(40000);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 57)
    public static final void method846(int arg0) {
        if (arg0 != 4483) {
            field1603 = -48;
        }
        class36.field529.method466(-1);
        field1592++;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I", line = 69)
    public final int method847(int arg0) {
        field1591++;
        class128 var2 = this.field1593.field2215;
        int var3 = 0;
        if (arg0 < 20) {
            this.method852(99);
        }
        while (this.field1593 != var2) {
            var2 = var2.field2215;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 95)
    public static void method848(byte arg0) {
        field1601 = null;
        if (arg0 != 11) {
            field1598 = 16;
        }
        field1594 = (int[][]) null;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Lnh;", line = 107)
    public final class128 method849(int arg0) {
        field1600++;
        class128 var2 = this.field1593.field2215;
        if (this.field1593 == var2) {
            this.field1596 = null;
            return null;
        }
        this.field1596 = var2.field2215;
        if (arg0 != 128) {
            field1601 = (String[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V", line = 178)
    public class98() {
        this.field1593.field2215 = this.field1593;
        this.field1593.field2213 = this.field1593;
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Lnh;", line = 130)
    public final class128 method850(int arg0) {
        field1589++;
        class128 var2 = this.field1596;
        if (this.field1593 == var2) {
            this.field1596 = null;
            return null;
        }
        if (arg0 != -5714) {
            method846(-46);
        }
        this.field1596 = var2.field2215;
        return var2;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lnh;B)V", line = 151)
    public final void method851(class128 arg0, byte arg1) {
        field1597++;
        if (arg1 != -44) {
            method846(-29);
        }
        if (arg0.field2213 != null) {
            arg0.method1067(arg1 + 40044);
        }
        arg0.field2213 = this.field1593.field2213;
        arg0.field2215 = this.field1593;
        arg0.field2213.field2215 = arg0;
        arg0.field2215.field2213 = arg0;
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Lnh;", line = 193)
    public final class128 method852(int arg0) {
        if (arg0 != 14278) {
            field1594 = (int[][]) ((int[][]) null);
        }
        field1602++;
        class128 var2 = this.field1593.field2215;
        if (this.field1593 == var2) {
            return null;
        } else {
            var2.method1067(40000);
            return var2;
        }
    }
}

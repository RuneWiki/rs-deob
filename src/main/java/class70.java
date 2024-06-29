import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 {

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    private int field1576 = 0;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[Lgd;")
    private class40[] field1570;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
    public static int[] field1561 = new int[1000];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lec;")
    public static class28 field1563 = class28.method210(-46, "Mar");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lec;")
    public static class28 field1562 = class28.method210(-46, "Welcome to RuneScape");

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lec;")
    public static class28 field1569 = class28.method210(-46, "scape main");

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lec;")
    public static class28 field1571 = class28.method210(-46, "Enter your username (V password)3");

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "J")
    private long field1565;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lea;")
    public static class26 field1557;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lea;")
    public static class26 field1572;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lgd;")
    private class40 field1564;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lgd;")
    private class40 field1574;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Lgd;")
    public final class40 method546(byte arg0) {
        field1559++;
        if (this.field1564 == null) {
            return null;
        }
        class40 var2 = this.field1570[(int) ((long) (this.field1568 - 1) & this.field1565)];
        while (this.field1564 != var2) {
            if (this.field1564.field869 == this.field1565) {
                class40 var3 = this.field1564;
                this.field1564 = this.field1564.field873;
                return var3;
            }
            this.field1564 = this.field1564.field873;
        }
        this.field1564 = null;
        if (arg0 < 4) {
            field1566 = -3;
        }
        return null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)Lgd;")
    private final class40 method547(byte arg0) {
        field1567++;
        if (this.field1576 > 0 && this.field1570[this.field1576 - 1] != this.field1574) {
            class40 var2 = this.field1574;
            this.field1574 = var2.field873;
            return var2;
        }
        while (this.field1576 < this.field1568) {
            class40 var4 = this.field1570[this.field1576++].field873;
            if (this.field1570[this.field1576 - 1] != var4) {
                this.field1574 = var4.field873;
                return var4;
            }
        }
        int var3 = 15 % ((-arg0 - 43) / 33);
        return null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IJLgd;)V")
    public final void method548(int arg0, long arg1, class40 arg2) {
        if (arg2.field875 != null) {
            arg2.method319((byte) 27);
        }
        field1573++;
        int var5 = -103 / ((arg0 - 52) / 57);
        class40 var6 = this.field1570[(int) (arg1 & (long) (this.field1568 - 1))];
        arg2.field873 = var6;
        arg2.field875 = var6.field875;
        arg2.field875.field873 = arg2;
        arg2.field869 = arg1;
        arg2.field873.field875 = arg2;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Lgd;")
    public final class40 method549(byte arg0) {
        this.field1576 = 0;
        field1558++;
        int var2 = 57 / ((86 - arg0) / 38);
        return this.method547((byte) -85);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method550(boolean arg0) {
        field1572 = null;
        field1562 = null;
        field1557 = null;
        field1563 = null;
        if (!arg0) {
            field1566 = 57;
        }
        field1561 = null;
        field1571 = null;
        field1569 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(JI)Lgd;")
    public final class40 method551(long arg0, int arg1) {
        field1575++;
        this.field1565 = arg0;
        class40 var4 = this.field1570[(int) (arg0 & (long) (this.field1568 - 1))];
        for (this.field1564 = var4.field873; this.field1564 != var4; this.field1564 = this.field1564.field873) {
            if (this.field1564.field869 == arg0) {
                class40 var5 = this.field1564;
                this.field1564 = this.field1564.field873;
                return var5;
            }
        }
        if (arg1 != 25238) {
            field1571 = null;
        }
        this.field1564 = null;
        return null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
    public class70(int arg0) {
        this.field1570 = new class40[arg0];
        this.field1568 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class40 var3 = this.field1570[var2] = new class40();
            var3.field875 = var3;
            var3.field873 = var3;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZSSCYSIO")
public class class71 {

    @OriginalMember(owner = "ZSSCYSIO", name = "f", descriptor = "I")
    public int field1724 = -1;

    @OriginalMember(owner = "ZSSCYSIO", name = "h", descriptor = "[I")
    public int[] field1726 = new int[6];

    @OriginalMember(owner = "ZSSCYSIO", name = "i", descriptor = "[I")
    public int[] field1727 = new int[6];

    @OriginalMember(owner = "ZSSCYSIO", name = "j", descriptor = "I")
    public int field1728 = 128;

    @OriginalMember(owner = "ZSSCYSIO", name = "k", descriptor = "I")
    public int field1729 = 128;

    @OriginalMember(owner = "ZSSCYSIO", name = "a", descriptor = "I")
    private static int field1719 = -302;

    @OriginalMember(owner = "ZSSCYSIO", name = "o", descriptor = "LISXEOURU;")
    public static class21 field1733 = new class21(-15730, 30);

    @OriginalMember(owner = "ZSSCYSIO", name = "b", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "ZSSCYSIO", name = "d", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "ZSSCYSIO", name = "e", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "ZSSCYSIO", name = "l", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "ZSSCYSIO", name = "m", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "ZSSCYSIO", name = "n", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "ZSSCYSIO", name = "g", descriptor = "LISUBRNPG;")
    public class20 field1725;

    @OriginalMember(owner = "ZSSCYSIO", name = "c", descriptor = "[LZSSCYSIO;")
    public static class71[] field1721;

    @OriginalMember(owner = "ZSSCYSIO", name = "a", descriptor = "(LLYZBHNJP;I)V")
    public static void method588(class31 arg0, int arg1) {
        class69 var2 = new class69(arg0.method290("spotanim.dat", null), field1719);
        field1720 = var2.method549();
        if (field1721 == null) {
            field1721 = new class71[field1720];
        }
        for (int var3 = 0; var3 < field1720; var3++) {
            if (field1721[var3] == null) {
                field1721[var3] = new class71();
            }
            field1721[var3].field1722 = var3;
            field1721[var3].method589(var2, (byte) 5);
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ZSSCYSIO", name = "a", descriptor = "(LZOMNSJJM;B)V")
    public void method589(class69 arg0, byte arg1) {
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method547();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1723 = arg0.method549();
                } else if (var3 == 2) {
                    this.field1724 = arg0.method549();
                    if (class20.field875 != null) {
                        this.field1725 = class20.field875[this.field1724];
                    }
                } else if (var3 == 4) {
                    this.field1728 = arg0.method549();
                } else if (var3 == 5) {
                    this.field1729 = arg0.method549();
                } else if (var3 == 6) {
                    this.field1730 = arg0.method549();
                } else if (var3 == 7) {
                    this.field1731 = arg0.method547();
                } else if (var3 == 8) {
                    this.field1732 = arg0.method547();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1726[var3 - 40] = arg0.method549();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1727[var3 - 50] = arg0.method549();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "ZSSCYSIO", name = "a", descriptor = "()LCCYECDYX;")
    public class4 method590() {
        class4 var1 = (class4) field1733.method228((long) this.field1722);
        if (var1 != null) {
            return var1;
        }
        class4 var2 = class4.method11(this.field1723, -142);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1726[0] != 0) {
                var2.method25(this.field1726[var3], this.field1727[var3]);
            }
        }
        field1733.method229(15631, (long) this.field1722, var2);
        return var2;
    }
}

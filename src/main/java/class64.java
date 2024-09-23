import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XWNROHZR")
public class class64 {

    @OriginalMember(owner = "XWNROHZR", name = "a", descriptor = "Z")
    private boolean field1663 = true;

    @OriginalMember(owner = "XWNROHZR", name = "f", descriptor = "I")
    public int field1668 = -1;

    @OriginalMember(owner = "XWNROHZR", name = "h", descriptor = "[I")
    public int[] field1670 = new int[6];

    @OriginalMember(owner = "XWNROHZR", name = "i", descriptor = "[I")
    public int[] field1671 = new int[6];

    @OriginalMember(owner = "XWNROHZR", name = "j", descriptor = "I")
    public int field1672 = 128;

    @OriginalMember(owner = "XWNROHZR", name = "k", descriptor = "I")
    public int field1673 = 128;

    @OriginalMember(owner = "XWNROHZR", name = "o", descriptor = "LUECXVCCS;")
    public static class55 field1677 = new class55(30, (byte) -2);

    @OriginalMember(owner = "XWNROHZR", name = "b", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "XWNROHZR", name = "d", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "XWNROHZR", name = "e", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "XWNROHZR", name = "l", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "XWNROHZR", name = "m", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "XWNROHZR", name = "n", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "XWNROHZR", name = "g", descriptor = "LUVDKTGZK;")
    public class58 field1669;

    @OriginalMember(owner = "XWNROHZR", name = "c", descriptor = "[LXWNROHZR;")
    public static class64[] field1665;

    @OriginalMember(owner = "XWNROHZR", name = "a", descriptor = "(LGWOEELWB;B)V")
    public static void method587(class18 arg0, byte arg1) {
        class30 var2 = new class30(true, arg0.method249("spotanim.dat", null));
        if (arg1 != 3) {
            return;
        }
        boolean var3 = false;
        field1664 = var2.method298();
        if (field1665 == null) {
            field1665 = new class64[field1664];
        }
        for (int var4 = 0; var4 < field1664; var4++) {
            if (field1665[var4] == null) {
                field1665[var4] = new class64();
            }
            field1665[var4].field1666 = var4;
            field1665[var4].method588(var2, (byte) 2);
        }
    }

    @OriginalMember(owner = "XWNROHZR", name = "a", descriptor = "(LMLYYHULT;B)V")
    public void method588(class30 arg0, byte arg1) {
        if (arg1 != 2) {
            this.field1663 = !this.field1663;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method296();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1667 = arg0.method298();
                } else if (var3 == 2) {
                    this.field1668 = arg0.method298();
                    if (class58.field1570 != null) {
                        this.field1669 = class58.field1570[this.field1668];
                    }
                } else if (var3 == 4) {
                    this.field1672 = arg0.method298();
                } else if (var3 == 5) {
                    this.field1673 = arg0.method298();
                } else if (var3 == 6) {
                    this.field1674 = arg0.method298();
                } else if (var3 == 7) {
                    this.field1675 = arg0.method296();
                } else if (var3 == 8) {
                    this.field1676 = arg0.method296();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1670[var3 - 40] = arg0.method298();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1671[var3 - 50] = arg0.method298();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "XWNROHZR", name = "a", descriptor = "()LCADBNSXE;")
    public class3 method589() {
        class3 var1 = (class3) field1677.method538((long) this.field1666);
        if (var1 != null) {
            return var1;
        }
        class3 var2 = class3.method11(this.field1667);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1670[0] != 0) {
                var2.method25(this.field1670[var3], this.field1671[var3]);
            }
        }
        field1677.method539(var2, -488, (long) this.field1666);
        return var2;
    }
}

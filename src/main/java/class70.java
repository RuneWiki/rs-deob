import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YTBPTACV")
public class class70 {

    @OriginalMember(owner = "YTBPTACV", name = "a", descriptor = "Z")
    private boolean field1690 = true;

    @OriginalMember(owner = "YTBPTACV", name = "c", descriptor = "I")
    private int field1692 = 411;

    @OriginalMember(owner = "YTBPTACV", name = "h", descriptor = "I")
    public int field1697 = -1;

    @OriginalMember(owner = "YTBPTACV", name = "j", descriptor = "[I")
    public int[] field1699 = new int[6];

    @OriginalMember(owner = "YTBPTACV", name = "k", descriptor = "[I")
    public int[] field1700 = new int[6];

    @OriginalMember(owner = "YTBPTACV", name = "l", descriptor = "I")
    public int field1701 = 128;

    @OriginalMember(owner = "YTBPTACV", name = "m", descriptor = "I")
    public int field1702 = 128;

    @OriginalMember(owner = "YTBPTACV", name = "b", descriptor = "Z")
    private static boolean field1691 = true;

    @OriginalMember(owner = "YTBPTACV", name = "q", descriptor = "LQQBOAQZB;")
    public static class50 field1706 = new class50(3, 30);

    @OriginalMember(owner = "YTBPTACV", name = "d", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "YTBPTACV", name = "f", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "YTBPTACV", name = "g", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "YTBPTACV", name = "n", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "YTBPTACV", name = "o", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "YTBPTACV", name = "p", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "YTBPTACV", name = "i", descriptor = "LHARRRJHW;")
    public class26 field1698;

    @OriginalMember(owner = "YTBPTACV", name = "e", descriptor = "[LYTBPTACV;")
    public static class70[] field1694;

    @OriginalMember(owner = "YTBPTACV", name = "a", descriptor = "(LDYBMLHQM;Z)V")
    public static void method580(class16 arg0, boolean arg1) {
        class29 var2 = new class29((byte) -28, arg0.method248("spotanim.dat", null));
        field1693 = var2.method310();
        if (field1694 == null) {
            field1694 = new class70[field1693];
        }
        for (int var3 = 0; var3 < field1693; var3++) {
            if (field1694[var3] == null) {
                field1694[var3] = new class70();
            }
            field1694[var3].field1695 = var3;
            field1694[var3].method581(6, var2);
        }
        if (arg1) {
            field1691 = !field1691;
        }
    }

    @OriginalMember(owner = "YTBPTACV", name = "a", descriptor = "(ILINLHDAGO;)V")
    public void method581(int arg0, class29 arg1) {
        if (arg0 != 6) {
            this.field1690 = !this.field1690;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method308();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1696 = arg1.method310();
                } else if (var3 == 2) {
                    this.field1697 = arg1.method310();
                    if (class26.field949 != null) {
                        this.field1698 = class26.field949[this.field1697];
                    }
                } else if (var3 == 4) {
                    this.field1701 = arg1.method310();
                } else if (var3 == 5) {
                    this.field1702 = arg1.method310();
                } else if (var3 == 6) {
                    this.field1703 = arg1.method310();
                } else if (var3 == 7) {
                    this.field1704 = arg1.method308();
                } else if (var3 == 8) {
                    this.field1705 = arg1.method308();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1699[var3 - 40] = arg1.method310();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1700[var3 - 50] = arg1.method310();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "YTBPTACV", name = "a", descriptor = "()LDHUPIIUL;")
    public class10 method582() {
        class10 var1 = (class10) field1706.method421((long) this.field1695);
        if (var1 != null) {
            return var1;
        }
        class10 var2 = class10.method191(this.field1692, this.field1696);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1699[0] != 0) {
                var2.method205(this.field1699[var3], this.field1700[var3]);
            }
        }
        field1706.method422(true, var2, (long) this.field1695);
        return var2;
    }
}

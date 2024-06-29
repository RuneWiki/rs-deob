import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EBBSHPSJ")
public class class12 {

    @OriginalMember(owner = "client!EBBSHPSJ", name = "e", descriptor = "I")
    public int field686 = -1;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "g", descriptor = "[I")
    public int[] field688 = new int[6];

    @OriginalMember(owner = "client!EBBSHPSJ", name = "h", descriptor = "[I")
    public int[] field689 = new int[6];

    @OriginalMember(owner = "client!EBBSHPSJ", name = "i", descriptor = "I")
    public int field690 = 128;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "j", descriptor = "I")
    public int field691 = 128;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "n", descriptor = "LQASTZCLF;")
    public static class47 field695 = new class47(30, false);

    @OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "c", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "d", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "k", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "l", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "m", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "f", descriptor = "LXTKQUJNF;")
    public class65 field687;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "b", descriptor = "[LEBBSHPSJ;")
    public static class12[] field683;

    @OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "(LAWEEREDT;I)V")
    public static void method208(class2 arg0, int arg1) {
        class25 var2 = new class25(arg0.method14("spotanim.dat", null), 713);
        field682 = var2.method247();
        if (field683 == null) {
            field683 = new class12[field682];
        }
        for (int var3 = 0; var3 < field682; var3++) {
            if (field683[var3] == null) {
                field683[var3] = new class12();
            }
            field683[var3].field684 = var3;
            field683[var3].method209(var2, (byte) 1);
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "(LIUVBENCV;B)V")
    public void method209(class25 arg0, byte arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method245();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field685 = arg0.method247();
                } else if (var3 == 2) {
                    this.field686 = arg0.method247();
                    if (class65.field1628 != null) {
                        this.field687 = class65.field1628[this.field686];
                    }
                } else if (var3 == 4) {
                    this.field690 = arg0.method247();
                } else if (var3 == 5) {
                    this.field691 = arg0.method247();
                } else if (var3 == 6) {
                    this.field692 = arg0.method247();
                } else if (var3 == 7) {
                    this.field693 = arg0.method245();
                } else if (var3 == 8) {
                    this.field694 = arg0.method245();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field688[var3 - 40] = arg0.method247();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field689[var3 - 50] = arg0.method247();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "()LJJMVUSJJ;")
    public class29 method210() {
        class29 var1 = (class29) field695.method438((long) this.field684);
        if (var1 != null) {
            return var1;
        }
        class29 var2 = class29.method300(this.field685);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field688[0] != 0) {
                var2.method314(this.field688[var3], this.field689[var3]);
            }
        }
        field695.method439(var2, (long) this.field684, -27210);
        return var2;
    }
}

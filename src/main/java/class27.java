import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IDQQUVDL")
public class class27 {

    @OriginalMember(owner = "IDQQUVDL", name = "a", descriptor = "B")
    private byte field845 = 44;

    @OriginalMember(owner = "IDQQUVDL", name = "f", descriptor = "I")
    public int field850 = -1;

    @OriginalMember(owner = "IDQQUVDL", name = "h", descriptor = "[I")
    public int[] field852 = new int[6];

    @OriginalMember(owner = "IDQQUVDL", name = "i", descriptor = "[I")
    public int[] field853 = new int[6];

    @OriginalMember(owner = "IDQQUVDL", name = "j", descriptor = "I")
    public int field854 = 128;

    @OriginalMember(owner = "IDQQUVDL", name = "k", descriptor = "I")
    public int field855 = 128;

    @OriginalMember(owner = "IDQQUVDL", name = "o", descriptor = "LGOHJFVWE;")
    public static class23 field859 = new class23((byte) -54, 30);

    @OriginalMember(owner = "IDQQUVDL", name = "b", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "IDQQUVDL", name = "d", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "IDQQUVDL", name = "e", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "IDQQUVDL", name = "l", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "IDQQUVDL", name = "m", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "IDQQUVDL", name = "n", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "IDQQUVDL", name = "g", descriptor = "LCGWBYVFN;")
    public class9 field851;

    @OriginalMember(owner = "IDQQUVDL", name = "c", descriptor = "[LIDQQUVDL;")
    public static class27[] field847;

    @OriginalMember(owner = "IDQQUVDL", name = "a", descriptor = "(LOTSGNSQM;Z)V")
    public static void method231(class41 arg0, boolean arg1) {
        class68 var2 = new class68(arg0.method376("spotanim.dat", null), -103);
        if (arg1) {
            return;
        }
        field846 = var2.method551();
        if (field847 == null) {
            field847 = new class27[field846];
        }
        for (int var3 = 0; var3 < field846; var3++) {
            if (field847[var3] == null) {
                field847[var3] = new class27();
            }
            field847[var3].field848 = var3;
            field847[var3].method232((byte) 44, var2);
        }
    }

    @OriginalMember(owner = "IDQQUVDL", name = "a", descriptor = "(BLYOXDZEVD;)V")
    public void method232(byte arg0, class68 arg1) {
        if (this.field845 != arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method549();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field849 = arg1.method551();
                } else if (var3 == 2) {
                    this.field850 = arg1.method551();
                    if (class9.field163 != null) {
                        this.field851 = class9.field163[this.field850];
                    }
                } else if (var3 == 4) {
                    this.field854 = arg1.method551();
                } else if (var3 == 5) {
                    this.field855 = arg1.method551();
                } else if (var3 == 6) {
                    this.field856 = arg1.method551();
                } else if (var3 == 7) {
                    this.field857 = arg1.method549();
                } else if (var3 == 8) {
                    this.field858 = arg1.method549();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field852[var3 - 40] = arg1.method551();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field853[var3 - 50] = arg1.method551();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "IDQQUVDL", name = "a", descriptor = "()LOIBEFFXI;")
    public class39 method233() {
        class39 var1 = (class39) field859.method227((long) this.field848);
        if (var1 != null) {
            return var1;
        }
        class39 var2 = class39.method346(true, this.field849);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field852[0] != 0) {
                var2.method360(this.field852[var3], this.field853[var3]);
            }
        }
        field859.method228(0, var2, (long) this.field848);
        return var2;
    }
}

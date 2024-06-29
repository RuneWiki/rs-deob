import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FOXTQZWB")
public class class13 {

    @OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "I")
    private int field686 = 1;

    @OriginalMember(owner = "client!FOXTQZWB", name = "f", descriptor = "I")
    public int field691 = -1;

    @OriginalMember(owner = "client!FOXTQZWB", name = "h", descriptor = "[I")
    public int[] field693 = new int[6];

    @OriginalMember(owner = "client!FOXTQZWB", name = "i", descriptor = "[I")
    public int[] field694 = new int[6];

    @OriginalMember(owner = "client!FOXTQZWB", name = "j", descriptor = "I")
    public int field695 = 128;

    @OriginalMember(owner = "client!FOXTQZWB", name = "k", descriptor = "I")
    public int field696 = 128;

    @OriginalMember(owner = "client!FOXTQZWB", name = "o", descriptor = "LQXKQGEKL;")
    public static class52 field700 = new class52(30, 5);

    @OriginalMember(owner = "client!FOXTQZWB", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!FOXTQZWB", name = "d", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!FOXTQZWB", name = "e", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!FOXTQZWB", name = "l", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!FOXTQZWB", name = "m", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!FOXTQZWB", name = "n", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!FOXTQZWB", name = "g", descriptor = "LKAIFCIAJ;")
    public class27 field692;

    @OriginalMember(owner = "client!FOXTQZWB", name = "c", descriptor = "[LFOXTQZWB;")
    public static class13[] field688;

    @OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "(BLESUFCMYV;)V")
    public static void method208(byte arg0, class11 arg1) {
        class53 var2 = new class53(arg1.method205("spotanim.dat", null), (byte) -17);
        field687 = var2.method457();
        if (field688 == null) {
            field688 = new class13[field687];
        }
        for (int var3 = 0; var3 < field687; var3++) {
            if (field688[var3] == null) {
                field688[var3] = new class13();
            }
            field688[var3].field689 = var3;
            field688[var3].method209(5, var2);
        }
        if (arg0 == 6) {
            boolean var4 = false;
        }
    }

    @OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "(ILRGCGKKUR;)V")
    public void method209(int arg0, class53 arg1) {
        if (arg0 != 5) {
            this.field686 = -193;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method455();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field690 = arg1.method457();
                } else if (var3 == 2) {
                    this.field691 = arg1.method457();
                    if (class27.field849 != null) {
                        this.field692 = class27.field849[this.field691];
                    }
                } else if (var3 == 4) {
                    this.field695 = arg1.method457();
                } else if (var3 == 5) {
                    this.field696 = arg1.method457();
                } else if (var3 == 6) {
                    this.field697 = arg1.method457();
                } else if (var3 == 7) {
                    this.field698 = arg1.method455();
                } else if (var3 == 8) {
                    this.field699 = arg1.method455();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field693[var3 - 40] = arg1.method457();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field694[var3 - 50] = arg1.method457();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "()LNGYJLUVS;")
    public class37 method210() {
        class37 var1 = (class37) field700.method440((long) this.field689);
        if (var1 != null) {
            return var1;
        }
        class37 var2 = class37.method291(this.field690);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field693[0] != 0) {
                var2.method305(this.field693[var3], this.field694[var3]);
            }
        }
        field700.method441((long) this.field689, var2, -501);
        return var2;
    }
}

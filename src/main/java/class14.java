import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DUFZKGOK")
public class class14 {

    @OriginalMember(owner = "DUFZKGOK", name = "i", descriptor = "Z")
    public boolean field800 = false;

    @OriginalMember(owner = "DUFZKGOK", name = "j", descriptor = "I")
    public int field801 = -1;

    @OriginalMember(owner = "DUFZKGOK", name = "a", descriptor = "I")
    private static int field792 = -302;

    @OriginalMember(owner = "DUFZKGOK", name = "b", descriptor = "I")
    private static int field793;

    @OriginalMember(owner = "DUFZKGOK", name = "c", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "DUFZKGOK", name = "f", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "DUFZKGOK", name = "g", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "DUFZKGOK", name = "h", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "DUFZKGOK", name = "k", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "DUFZKGOK", name = "e", descriptor = "Ljava/lang/String;")
    public String field796;

    @OriginalMember(owner = "DUFZKGOK", name = "d", descriptor = "[LDUFZKGOK;")
    public static class14[] field795;

    @OriginalMember(owner = "DUFZKGOK", name = "a", descriptor = "(LLYZBHNJP;I)V")
    public static void method206(class31 arg0, int arg1) {
        class69 var2 = new class69(arg0.method290("varbit.dat", null), field792);
        if (arg1 != 0) {
            field793 = 67;
        }
        field794 = var2.method549();
        if (field795 == null) {
            field795 = new class14[field794];
        }
        for (int var3 = 0; var3 < field794; var3++) {
            if (field795[var3] == null) {
                field795[var3] = new class14();
            }
            field795[var3].method207(var3, 8588, var2);
            if (field795[var3].field800) {
                class40.field1281[field795[var3].field797].field1293 = true;
            }
        }
        if (var2.field1699.length != var2.field1700) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "DUFZKGOK", name = "a", descriptor = "(IILZOMNSJJM;)V")
    public void method207(int arg0, int arg1, class69 arg2) {
        if (arg1 != 8588) {
            return;
        }
        while (true) {
            int var4 = arg2.method547();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field797 = arg2.method549();
                this.field798 = arg2.method547();
                this.field799 = arg2.method547();
            } else if (var4 == 10) {
                this.field796 = arg2.method554();
            } else if (var4 == 2) {
                this.field800 = true;
            } else if (var4 == 3) {
                this.field801 = arg2.method552();
            } else if (var4 == 4) {
                this.field802 = arg2.method552();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

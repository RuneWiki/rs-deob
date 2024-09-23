import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XBHMGKWV")
public class class59 {

    @OriginalMember(owner = "XBHMGKWV", name = "h", descriptor = "Z")
    public boolean field1550 = false;

    @OriginalMember(owner = "XBHMGKWV", name = "i", descriptor = "I")
    public int field1551 = -1;

    @OriginalMember(owner = "XBHMGKWV", name = "a", descriptor = "I")
    private static int field1543;

    @OriginalMember(owner = "XBHMGKWV", name = "b", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "XBHMGKWV", name = "e", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "XBHMGKWV", name = "f", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "XBHMGKWV", name = "g", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "XBHMGKWV", name = "j", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "XBHMGKWV", name = "d", descriptor = "Ljava/lang/String;")
    public String field1546;

    @OriginalMember(owner = "XBHMGKWV", name = "c", descriptor = "[LXBHMGKWV;")
    public static class59[] field1545;

    @OriginalMember(owner = "XBHMGKWV", name = "a", descriptor = "(ILCVNWKEAW;)V")
    public static void method507(int arg0, class7 arg1) {
        if (arg0 != 0) {
            field1543 = -402;
        }
        class62 var2 = new class62(-417, arg1.method180("varbit.dat", null));
        field1544 = var2.method523();
        if (field1545 == null) {
            field1545 = new class59[field1544];
        }
        for (int var3 = 0; var3 < field1544; var3++) {
            if (field1545[var3] == null) {
                field1545[var3] = new class59();
            }
            field1545[var3].method508(var3, var2, (byte) -14);
            if (field1545[var3].field1550) {
                class41.field1141[field1545[var3].field1547].field1153 = true;
            }
        }
        if (var2.field1578.length != var2.field1579) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "XBHMGKWV", name = "a", descriptor = "(ILXOUQUKZW;B)V")
    public void method508(int arg0, class62 arg1, byte arg2) {
        if (arg2 != -14) {
            return;
        }
        while (true) {
            int var4 = arg1.method521();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1547 = arg1.method523();
                this.field1548 = arg1.method521();
                this.field1549 = arg1.method521();
            } else if (var4 == 10) {
                this.field1546 = arg1.method528();
            } else if (var4 == 2) {
                this.field1550 = true;
            } else if (var4 == 3) {
                this.field1551 = arg1.method526();
            } else if (var4 == 4) {
                this.field1552 = arg1.method526();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

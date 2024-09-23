import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VSLUEINI")
public class class67 {

    @OriginalMember(owner = "VSLUEINI", name = "g", descriptor = "Z")
    public boolean field1624 = false;

    @OriginalMember(owner = "VSLUEINI", name = "h", descriptor = "I")
    public int field1625 = -1;

    @OriginalMember(owner = "VSLUEINI", name = "a", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "VSLUEINI", name = "d", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "VSLUEINI", name = "e", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "VSLUEINI", name = "f", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "VSLUEINI", name = "i", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "VSLUEINI", name = "c", descriptor = "Ljava/lang/String;")
    public String field1620;

    @OriginalMember(owner = "VSLUEINI", name = "b", descriptor = "[LVSLUEINI;")
    public static class67[] field1619;

    @OriginalMember(owner = "VSLUEINI", name = "a", descriptor = "(ILQKFGLETG;)V")
    public static void method520(int arg0, class50 arg1) {
        if (arg0 != 0) {
            return;
        }
        class68 var2 = new class68((byte) 9, arg1.method402("varbit.dat", null));
        field1618 = var2.method536();
        if (field1619 == null) {
            field1619 = new class67[field1618];
        }
        for (int var3 = 0; var3 < field1618; var3++) {
            if (field1619[var3] == null) {
                field1619[var3] = new class67();
            }
            field1619[var3].method521(var2, var3, 857);
            if (field1619[var3].field1624) {
                class41.field1125[field1619[var3].field1621].field1137 = true;
            }
        }
        if (var2.field1642.length != var2.field1643) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "VSLUEINI", name = "a", descriptor = "(LXJCNBMKS;II)V")
    public void method521(class68 arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method534();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1621 = arg0.method536();
                this.field1622 = arg0.method534();
                this.field1623 = arg0.method534();
            } else if (var4 == 10) {
                this.field1620 = arg0.method541();
            } else if (var4 == 2) {
                this.field1624 = true;
            } else if (var4 == 3) {
                this.field1625 = arg0.method539();
            } else if (var4 == 4) {
                this.field1626 = arg0.method539();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

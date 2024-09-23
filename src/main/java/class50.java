import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SXQCXZWK")
public class class50 {

    @OriginalMember(owner = "SXQCXZWK", name = "g", descriptor = "Z")
    public boolean field1305 = false;

    @OriginalMember(owner = "SXQCXZWK", name = "h", descriptor = "I")
    public int field1306 = -1;

    @OriginalMember(owner = "SXQCXZWK", name = "a", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "SXQCXZWK", name = "d", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "SXQCXZWK", name = "e", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "SXQCXZWK", name = "f", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "SXQCXZWK", name = "i", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "SXQCXZWK", name = "c", descriptor = "Ljava/lang/String;")
    public String field1301;

    @OriginalMember(owner = "SXQCXZWK", name = "b", descriptor = "[LSXQCXZWK;")
    public static class50[] field1300;

    @OriginalMember(owner = "SXQCXZWK", name = "a", descriptor = "(LOTSGNSQM;Z)V")
    public static void method416(class41 arg0, boolean arg1) {
        class68 var2 = new class68(arg0.method376("varbit.dat", null), -103);
        field1299 = var2.method551();
        if (field1300 == null) {
            field1300 = new class50[field1299];
        }
        for (int var3 = 0; var3 < field1299; var3++) {
            if (field1300[var3] == null) {
                field1300[var3] = new class50();
            }
            field1300[var3].method417((byte) -38, var2, var3);
            if (field1300[var3].field1305) {
                class7.field130[field1300[var3].field1302].field142 = true;
            }
        }
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field1611.length != var2.field1612) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "SXQCXZWK", name = "a", descriptor = "(BLYOXDZEVD;I)V")
    public void method417(byte arg0, class68 arg1, int arg2) {
        if (arg0 != -38) {
            return;
        }
        while (true) {
            int var4 = arg1.method549();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1302 = arg1.method551();
                this.field1303 = arg1.method549();
                this.field1304 = arg1.method549();
            } else if (var4 == 10) {
                this.field1301 = arg1.method556();
            } else if (var4 == 2) {
                this.field1305 = true;
            } else if (var4 == 3) {
                this.field1306 = arg1.method554();
            } else if (var4 == 4) {
                this.field1307 = arg1.method554();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

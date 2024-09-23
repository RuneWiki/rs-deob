import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GDBQCAOA")
public class class18 {

    @OriginalMember(owner = "GDBQCAOA", name = "g", descriptor = "Z")
    public boolean field803 = false;

    @OriginalMember(owner = "GDBQCAOA", name = "h", descriptor = "I")
    public int field804 = -1;

    @OriginalMember(owner = "GDBQCAOA", name = "j", descriptor = "Z")
    public boolean field806 = true;

    @OriginalMember(owner = "GDBQCAOA", name = "a", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "GDBQCAOA", name = "d", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "GDBQCAOA", name = "e", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "GDBQCAOA", name = "f", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "GDBQCAOA", name = "i", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "GDBQCAOA", name = "c", descriptor = "Ljava/lang/String;")
    public String field799;

    @OriginalMember(owner = "GDBQCAOA", name = "b", descriptor = "[LGDBQCAOA;")
    public static class18[] field798;

    @OriginalMember(owner = "GDBQCAOA", name = "a", descriptor = "(ILQDHHNYHL;)V")
    public static void method275(int arg0, class44 arg1) {
        class42 var2 = new class42(5, arg1.method488("varbit.dat", null));
        field797 = var2.method422();
        if (arg0 != 0) {
            return;
        }
        if (field798 == null) {
            field798 = new class18[field797];
        }
        for (int var3 = 0; var3 < field797; var3++) {
            if (field798[var3] == null) {
                field798[var3] = new class18();
            }
            field798[var3].method276((byte) 8, var2, var3);
            if (field798[var3].field803) {
                class70.field1719[field798[var3].field800].field1731 = true;
            }
        }
        if (var2.field1249.length != var2.field1250) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "GDBQCAOA", name = "a", descriptor = "(BLPGNBHFUF;I)V")
    public void method276(byte arg0, class42 arg1, int arg2) {
        if (arg0 != 8) {
            return;
        }
        while (true) {
            int var4 = arg1.method420();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field800 = arg1.method422();
                this.field801 = arg1.method420();
                this.field802 = arg1.method420();
            } else if (var4 == 10) {
                this.field799 = arg1.method427();
            } else if (var4 == 2) {
                this.field803 = true;
            } else if (var4 == 3) {
                this.field804 = arg1.method425();
            } else if (var4 == 4) {
                this.field805 = arg1.method425();
            } else if (var4 == 5) {
                this.field806 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

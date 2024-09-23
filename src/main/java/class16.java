import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GAQBLBTP")
public class class16 {

    @OriginalMember(owner = "GAQBLBTP", name = "b", descriptor = "I")
    private int field790 = 30502;

    @OriginalMember(owner = "GAQBLBTP", name = "i", descriptor = "Z")
    public boolean field797 = false;

    @OriginalMember(owner = "GAQBLBTP", name = "j", descriptor = "I")
    public int field798 = -1;

    @OriginalMember(owner = "GAQBLBTP", name = "a", descriptor = "Z")
    private static boolean field789 = true;

    @OriginalMember(owner = "GAQBLBTP", name = "c", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "GAQBLBTP", name = "f", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "GAQBLBTP", name = "g", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "GAQBLBTP", name = "h", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "GAQBLBTP", name = "k", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "GAQBLBTP", name = "e", descriptor = "Ljava/lang/String;")
    public String field793;

    @OriginalMember(owner = "GAQBLBTP", name = "d", descriptor = "[LGAQBLBTP;")
    public static class16[] field792;

    @OriginalMember(owner = "GAQBLBTP", name = "a", descriptor = "(ILSYUGXMZF;)V")
    public static void method279(int arg0, class55 arg1) {
        if (arg0 >= 0) {
            field789 = !field789;
        }
        class30 var2 = new class30(arg1.method551("varbit.dat", null), -982);
        field791 = var2.method351();
        if (field792 == null) {
            field792 = new class16[field791];
        }
        for (int var3 = 0; var3 < field791; var3++) {
            if (field792[var3] == null) {
                field792[var3] = new class16();
            }
            field792[var3].method280(var3, var2, (byte) 7);
            if (field792[var3].field797) {
                class24.field976[field792[var3].field794].field988 = true;
            }
        }
        if (var2.field1064.length != var2.field1065) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "GAQBLBTP", name = "a", descriptor = "(ILKHOMSBHW;B)V")
    public void method280(int arg0, class30 arg1, byte arg2) {
        if (arg2 != 7) {
            this.field790 = 272;
        }
        while (true) {
            int var4 = arg1.method349();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field794 = arg1.method351();
                this.field795 = arg1.method349();
                this.field796 = arg1.method349();
            } else if (var4 == 10) {
                this.field793 = arg1.method356();
            } else if (var4 == 2) {
                this.field797 = true;
            } else if (var4 == 3) {
                this.field798 = arg1.method354();
            } else if (var4 == 4) {
                this.field799 = arg1.method354();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

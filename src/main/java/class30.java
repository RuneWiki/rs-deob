import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JHLQAAYP")
public class class30 {

    @OriginalMember(owner = "JHLQAAYP", name = "b", descriptor = "Z")
    private boolean field951 = true;

    @OriginalMember(owner = "JHLQAAYP", name = "i", descriptor = "Z")
    public boolean field958 = false;

    @OriginalMember(owner = "JHLQAAYP", name = "j", descriptor = "I")
    public int field959 = -1;

    @OriginalMember(owner = "JHLQAAYP", name = "a", descriptor = "Z")
    private static boolean field950 = true;

    @OriginalMember(owner = "JHLQAAYP", name = "c", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "JHLQAAYP", name = "f", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "JHLQAAYP", name = "g", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "JHLQAAYP", name = "h", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "JHLQAAYP", name = "k", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "JHLQAAYP", name = "e", descriptor = "Ljava/lang/String;")
    public String field954;

    @OriginalMember(owner = "JHLQAAYP", name = "d", descriptor = "[LJHLQAAYP;")
    public static class30[] field953;

    @OriginalMember(owner = "JHLQAAYP", name = "a", descriptor = "(ZLXMRRKSSB;)V")
    public static void method268(boolean arg0, class60 arg1) {
        class62 var2 = new class62(arg1.method465("varbit.dat", null), 49938);
        field952 = var2.method480();
        if (arg0) {
            field950 = !field950;
        }
        if (field953 == null) {
            field953 = new class30[field952];
        }
        for (int var3 = 0; var3 < field952; var3++) {
            if (field953[var3] == null) {
                field953[var3] = new class30();
            }
            field953[var3].method269(true, var2, var3);
            if (field953[var3].field958) {
                class65.field1578[field953[var3].field955].field1590 = true;
            }
        }
        if (var2.field1541.length != var2.field1542) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "JHLQAAYP", name = "a", descriptor = "(ZLXQPFGONL;I)V")
    public void method269(boolean arg0, class62 arg1, int arg2) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method478();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field955 = arg1.method480();
                this.field956 = arg1.method478();
                this.field957 = arg1.method478();
            } else if (var4 == 10) {
                this.field954 = arg1.method485();
            } else if (var4 == 2) {
                this.field958 = true;
            } else if (var4 == 3) {
                this.field959 = arg1.method483();
            } else if (var4 == 4) {
                this.field960 = arg1.method483();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OHEMVFER")
public class class39 {

    @OriginalMember(owner = "OHEMVFER", name = "a", descriptor = "I")
    private int field1193 = 3;

    @OriginalMember(owner = "OHEMVFER", name = "h", descriptor = "Z")
    public boolean field1200 = false;

    @OriginalMember(owner = "OHEMVFER", name = "i", descriptor = "I")
    public int field1201 = -1;

    @OriginalMember(owner = "OHEMVFER", name = "k", descriptor = "Z")
    public boolean field1203 = true;

    @OriginalMember(owner = "OHEMVFER", name = "b", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "OHEMVFER", name = "e", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "OHEMVFER", name = "f", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "OHEMVFER", name = "g", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "OHEMVFER", name = "j", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "OHEMVFER", name = "d", descriptor = "Ljava/lang/String;")
    public String field1196;

    @OriginalMember(owner = "OHEMVFER", name = "c", descriptor = "[LOHEMVFER;")
    public static class39[] field1195;

    @OriginalMember(owner = "OHEMVFER", name = "a", descriptor = "(ILINOFEYKQ;)V")
    public static void method419(int arg0, class21 arg1) {
        if (arg0 >= 0) {
            return;
        }
        class35 var2 = new class35((byte) -103, arg1.method277("varbit.dat", null));
        field1194 = var2.method351();
        if (field1195 == null) {
            field1195 = new class39[field1194];
        }
        for (int var3 = 0; var3 < field1194; var3++) {
            if (field1195[var3] == null) {
                field1195[var3] = new class39();
            }
            field1195[var3].method420(0, var2, var3);
            if (field1195[var3].field1200) {
                class32.field1065[field1195[var3].field1197].field1077 = true;
            }
        }
        if (var2.field1106.length != var2.field1107) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "OHEMVFER", name = "a", descriptor = "(ILNHEPCMLW;I)V")
    public void method420(int arg0, class35 arg1, int arg2) {
        if (arg0 != 0) {
            this.field1193 = -247;
        }
        while (true) {
            int var4 = arg1.method349();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1197 = arg1.method351();
                this.field1198 = arg1.method349();
                this.field1199 = arg1.method349();
            } else if (var4 == 10) {
                this.field1196 = arg1.method356();
            } else if (var4 == 2) {
                this.field1200 = true;
            } else if (var4 == 3) {
                this.field1201 = arg1.method354();
            } else if (var4 == 4) {
                this.field1202 = arg1.method354();
            } else if (var4 == 5) {
                this.field1203 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

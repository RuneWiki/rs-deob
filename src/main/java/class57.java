import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UNSYPSHF")
public class class57 {

    @OriginalMember(owner = "UNSYPSHF", name = "g", descriptor = "Z")
    public boolean field1502 = false;

    @OriginalMember(owner = "UNSYPSHF", name = "h", descriptor = "I")
    public int field1503 = -1;

    @OriginalMember(owner = "UNSYPSHF", name = "j", descriptor = "Z")
    public boolean field1505 = true;

    @OriginalMember(owner = "UNSYPSHF", name = "a", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "UNSYPSHF", name = "d", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "UNSYPSHF", name = "e", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "UNSYPSHF", name = "f", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "UNSYPSHF", name = "i", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "UNSYPSHF", name = "c", descriptor = "Ljava/lang/String;")
    public String field1498;

    @OriginalMember(owner = "UNSYPSHF", name = "b", descriptor = "[LUNSYPSHF;")
    public static class57[] field1497;

    @OriginalMember(owner = "UNSYPSHF", name = "a", descriptor = "(ILRVLWVPJQ;)V")
    public static void method498(int arg0, class50 arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class55 var3 = new class55(741, arg1.method424("varbit.dat", null));
        field1496 = var3.method457();
        if (field1497 == null) {
            field1497 = new class57[field1496];
        }
        for (int var4 = 0; var4 < field1496; var4++) {
            if (field1497[var4] == null) {
                field1497[var4] = new class57();
            }
            field1497[var4].method499(var3, 593, var4);
            if (field1497[var4].field1502) {
                class49.field1311[field1497[var4].field1499].field1323 = true;
            }
        }
        if (var3.field1455.length != var3.field1456) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "UNSYPSHF", name = "a", descriptor = "(LUAWAYCTK;II)V")
    public void method499(class55 arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method455();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1499 = arg0.method457();
                this.field1500 = arg0.method455();
                this.field1501 = arg0.method455();
            } else if (var4 == 10) {
                this.field1498 = arg0.method462();
            } else if (var4 == 2) {
                this.field1502 = true;
            } else if (var4 == 3) {
                this.field1503 = arg0.method460();
            } else if (var4 == 4) {
                this.field1504 = arg0.method460();
            } else if (var4 == 5) {
                this.field1505 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

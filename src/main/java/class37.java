import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LPMARHLZ")
public class class37 {

    @OriginalMember(owner = "LPMARHLZ", name = "i", descriptor = "Z")
    public boolean field1115 = false;

    @OriginalMember(owner = "LPMARHLZ", name = "j", descriptor = "I")
    public int field1116 = -1;

    @OriginalMember(owner = "LPMARHLZ", name = "a", descriptor = "I")
    private static int field1107;

    @OriginalMember(owner = "LPMARHLZ", name = "c", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "LPMARHLZ", name = "f", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "LPMARHLZ", name = "g", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "LPMARHLZ", name = "h", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "LPMARHLZ", name = "k", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "LPMARHLZ", name = "e", descriptor = "Ljava/lang/String;")
    public String field1111;

    @OriginalMember(owner = "LPMARHLZ", name = "b", descriptor = "Z")
    private static boolean field1108;

    @OriginalMember(owner = "LPMARHLZ", name = "d", descriptor = "[LLPMARHLZ;")
    public static class37[] field1110;

    @OriginalMember(owner = "LPMARHLZ", name = "a", descriptor = "(ILSPZBTZXL;)V")
    public static void method456(int arg0, class51 arg1) {
        class34 var2 = new class34(arg1.method515("varbit.dat", null), field1107);
        field1109 = var2.method404();
        int var3 = 78 / arg0;
        if (field1110 == null) {
            field1110 = new class37[field1109];
        }
        for (int var4 = 0; var4 < field1109; var4++) {
            if (field1110[var4] == null) {
                field1110[var4] = new class37();
            }
            field1110[var4].method457(field1108, var2, var4);
            if (field1110[var4].field1115) {
                class14.field678[field1110[var4].field1112].field690 = true;
            }
        }
        if (var2.field1072.length != var2.field1073) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "LPMARHLZ", name = "a", descriptor = "(ZLLDILQFVA;I)V")
    public void method457(boolean arg0, class34 arg1, int arg2) {
        if (arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method402();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1112 = arg1.method404();
                this.field1113 = arg1.method402();
                this.field1114 = arg1.method402();
            } else if (var4 == 10) {
                this.field1111 = arg1.method409();
            } else if (var4 == 2) {
                this.field1115 = true;
            } else if (var4 == 3) {
                this.field1116 = arg1.method407();
            } else if (var4 == 4) {
                this.field1117 = arg1.method407();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AIRUOZLB")
public class class2 {

    @OriginalMember(owner = "AIRUOZLB", name = "g", descriptor = "Z")
    public boolean field11 = false;

    @OriginalMember(owner = "AIRUOZLB", name = "h", descriptor = "I")
    public int field12 = -1;

    @OriginalMember(owner = "AIRUOZLB", name = "f", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "AIRUOZLB", name = "i", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "AIRUOZLB", name = "a", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "AIRUOZLB", name = "d", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "AIRUOZLB", name = "e", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "AIRUOZLB", name = "c", descriptor = "Ljava/lang/String;")
    public String field7;

    @OriginalMember(owner = "AIRUOZLB", name = "b", descriptor = "[LAIRUOZLB;")
    public static class2[] field6;

    @OriginalMember(owner = "AIRUOZLB", name = "a", descriptor = "(ILHRXSNEYZ;)V")
    public static void method2(int arg0, class26 arg1) {
        class31 var2 = new class31(arg1.method289("varbit.dat", null), 8);
        field5 = var2.method308();
        if (arg0 <= 0) {
            return;
        }
        if (field6 == null) {
            field6 = new class2[field5];
        }
        for (int var3 = 0; var3 < field5; var3++) {
            if (field6[var3] == null) {
                field6[var3] = new class2();
            }
            field6[var3].method3(var3, 0, var2);
            if (field6[var3].field11) {
                class17.field654[field6[var3].field8].field666 = true;
            }
        }
        if (var2.field900.length != var2.field901) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "AIRUOZLB", name = "a", descriptor = "(IILJHKSAGUC;)V")
    public void method3(int arg0, int arg1, class31 arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method306();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field8 = arg2.method308();
                this.field9 = arg2.method306();
                this.field10 = arg2.method306();
            } else if (var5 == 10) {
                this.field7 = arg2.method313();
            } else if (var5 == 2) {
                this.field11 = true;
            } else if (var5 == 3) {
                this.field12 = arg2.method311();
            } else if (var5 == 4) {
                this.field13 = arg2.method311();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}

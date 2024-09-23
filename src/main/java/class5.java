import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BUYMNSFH")
public class class5 {

    @OriginalMember(owner = "BUYMNSFH", name = "g", descriptor = "Z")
    public boolean field41 = false;

    @OriginalMember(owner = "BUYMNSFH", name = "h", descriptor = "I")
    public int field42 = -1;

    @OriginalMember(owner = "BUYMNSFH", name = "a", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "BUYMNSFH", name = "d", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "BUYMNSFH", name = "e", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "BUYMNSFH", name = "f", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "BUYMNSFH", name = "i", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "BUYMNSFH", name = "c", descriptor = "Ljava/lang/String;")
    public String field37;

    @OriginalMember(owner = "BUYMNSFH", name = "b", descriptor = "[LBUYMNSFH;")
    public static class5[] field36;

    @OriginalMember(owner = "BUYMNSFH", name = "a", descriptor = "(LMNPBQFWE;B)V")
    public static void method31(class37 arg0, byte arg1) {
        class3 var2 = new class3(false, arg0.method429("varbit.dat", null));
        if (arg1 != 0) {
            return;
        }
        boolean var3 = false;
        field35 = var2.method17();
        if (field36 == null) {
            field36 = new class5[field35];
        }
        for (int var4 = 0; var4 < field35; var4++) {
            if (field36[var4] == null) {
                field36[var4] = new class5();
            }
            field36[var4].method32(var2, 0, var4);
            if (field36[var4].field41) {
                class27.field1016[field36[var4].field38].field1028 = true;
            }
        }
        if (var2.field19.length != var2.field20) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "BUYMNSFH", name = "a", descriptor = "(LBJPWOXRJ;II)V")
    public void method32(class3 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method15();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field38 = arg0.method17();
                this.field39 = arg0.method15();
                this.field40 = arg0.method15();
            } else if (var5 == 10) {
                this.field37 = arg0.method22();
            } else if (var5 == 2) {
                this.field41 = true;
            } else if (var5 == 3) {
                this.field42 = arg0.method20();
            } else if (var5 == 4) {
                this.field43 = arg0.method20();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}

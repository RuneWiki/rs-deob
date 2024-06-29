import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BVXCTZVJ")
public class class9 {

    @OriginalMember(owner = "client!BVXCTZVJ", name = "g", descriptor = "Z")
    public boolean field139 = false;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "h", descriptor = "I")
    public int field140 = -1;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "j", descriptor = "Z")
    public boolean field142 = true;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "a", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "d", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "e", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "f", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "i", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "c", descriptor = "Ljava/lang/String;")
    public String field135;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "b", descriptor = "[LBVXCTZVJ;")
    public static class9[] field134;

    @OriginalMember(owner = "client!BVXCTZVJ", name = "a", descriptor = "(LHBJEXSJX;Z)V")
    public static void method44(class24 arg0, boolean arg1) {
        class18 var2 = new class18(arg0.method348("varbit.dat", null), 0);
        if (!arg1) {
            return;
        }
        field133 = var2.method241();
        if (field134 == null) {
            field134 = new class9[field133];
        }
        for (int var3 = 0; var3 < field133; var3++) {
            if (field134[var3] == null) {
                field134[var3] = new class9();
            }
            field134[var3].method45(var3, var2, 24145);
            if (field134[var3].field139) {
                class52.field1404[field134[var3].field136].field1416 = true;
            }
        }
        if (var2.field793.length != var2.field794) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!BVXCTZVJ", name = "a", descriptor = "(ILEYMNCFMK;I)V")
    public void method45(int arg0, class18 arg1, int arg2) {
        if (arg2 != 24145) {
            return;
        }
        while (true) {
            int var4 = arg1.method239();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field136 = arg1.method241();
                this.field137 = arg1.method239();
                this.field138 = arg1.method239();
            } else if (var4 == 10) {
                this.field135 = arg1.method246();
            } else if (var4 == 2) {
                this.field139 = true;
            } else if (var4 == 3) {
                this.field140 = arg1.method244();
            } else if (var4 == 4) {
                this.field141 = arg1.method244();
            } else if (var4 == 5) {
                this.field142 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

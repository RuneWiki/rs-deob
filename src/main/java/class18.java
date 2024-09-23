import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FTZZSWCP")
public class class18 {

    @OriginalMember(owner = "FTZZSWCP", name = "i", descriptor = "Z")
    public boolean field746 = false;

    @OriginalMember(owner = "FTZZSWCP", name = "j", descriptor = "I")
    public int field747 = -1;

    @OriginalMember(owner = "FTZZSWCP", name = "a", descriptor = "I")
    private static int field738 = 8;

    @OriginalMember(owner = "FTZZSWCP", name = "b", descriptor = "Z")
    private static boolean field739 = true;

    @OriginalMember(owner = "FTZZSWCP", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "FTZZSWCP", name = "f", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "FTZZSWCP", name = "g", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "FTZZSWCP", name = "h", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "FTZZSWCP", name = "k", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "FTZZSWCP", name = "e", descriptor = "Ljava/lang/String;")
    public String field742;

    @OriginalMember(owner = "FTZZSWCP", name = "d", descriptor = "[LFTZZSWCP;")
    public static class18[] field741;

    @OriginalMember(owner = "FTZZSWCP", name = "a", descriptor = "(LFIGUVTWB;Z)V")
    public static void method238(class15 arg0, boolean arg1) {
        class33 var2 = new class33(field738, arg0.method209("varbit.dat", null));
        if (arg1) {
            field739 = !field739;
        }
        field740 = var2.method294();
        if (field741 == null) {
            field741 = new class18[field740];
        }
        for (int var3 = 0; var3 < field740; var3++) {
            if (field741[var3] == null) {
                field741[var3] = new class18();
            }
            field741[var3].method239(0, var2, var3);
            if (field741[var3].field746) {
                class38.field1086[field741[var3].field743].field1098 = true;
            }
        }
        if (var2.field953.length != var2.field954) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "FTZZSWCP", name = "a", descriptor = "(ILMUKVLYLC;I)V")
    public void method239(int arg0, class33 arg1, int arg2) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var4 = arg1.method292();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field743 = arg1.method294();
                this.field744 = arg1.method292();
                this.field745 = arg1.method292();
            } else if (var4 == 10) {
                this.field742 = arg1.method299();
            } else if (var4 == 2) {
                this.field746 = true;
            } else if (var4 == 3) {
                this.field747 = arg1.method297();
            } else if (var4 == 4) {
                this.field748 = arg1.method297();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EKGZTZOT")
public class class12 {

    @OriginalMember(owner = "EKGZTZOT", name = "a", descriptor = "Z")
    private boolean field656 = false;

    @OriginalMember(owner = "EKGZTZOT", name = "b", descriptor = "I")
    private int field657 = -971;

    @OriginalMember(owner = "EKGZTZOT", name = "c", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "EKGZTZOT", name = "d", descriptor = "[LAJSSLSFA;")
    private class2[] field659;

    @OriginalMember(owner = "EKGZTZOT", name = "<init>", descriptor = "(II)V")
    public class12(int arg0, int arg1) {
        this.field658 = arg1;
        this.field659 = new class2[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class2 var5 = this.field659[var3] = new class2();
            var5.field12 = var5;
            var5.field13 = var5;
        }
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "EKGZTZOT", name = "a", descriptor = "(J)LAJSSLSFA;")
    public class2 method227(long arg0) {
        class2 var3 = this.field659[(int) (arg0 & (long) (this.field658 - 1))];
        for (class2 var4 = var3.field12; var4 != var3; var4 = var4.field12) {
            if (var4.field11 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "EKGZTZOT", name = "a", descriptor = "(LAJSSLSFA;JI)V")
    public void method228(class2 arg0, long arg1, int arg2) {
        if (arg0.field13 != null) {
            arg0.method1();
        }
        class2 var5 = this.field659[(int) (arg1 & (long) (this.field658 - 1))];
        arg0.field13 = var5.field13;
        arg0.field12 = var5;
        arg0.field13.field12 = arg0;
        while (arg2 >= 0) {
            this.field656 = !this.field656;
        }
        arg0.field12.field13 = arg0;
        arg0.field11 = arg1;
    }
}

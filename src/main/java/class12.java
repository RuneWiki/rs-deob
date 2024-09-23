import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ECQQOXBD")
public class class12 {

    @OriginalMember(owner = "ECQQOXBD", name = "a", descriptor = "I")
    private int field637 = -40275;

    @OriginalMember(owner = "ECQQOXBD", name = "b", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "ECQQOXBD", name = "c", descriptor = "[LTLIWLEHU;")
    private class54[] field639;

    @OriginalMember(owner = "ECQQOXBD", name = "<init>", descriptor = "(II)V")
    public class12(int arg0, int arg1) {
        this.field638 = arg0;
        int var3 = 34 / arg1;
        this.field639 = new class54[arg0];
        for (int var4 = 0; var4 < arg0; var4++) {
            class54 var5 = this.field639[var4] = new class54();
            var5.field1470 = var5;
            var5.field1471 = var5;
        }
    }

    @OriginalMember(owner = "ECQQOXBD", name = "a", descriptor = "(J)LTLIWLEHU;")
    public class54 method209(long arg0) {
        class54 var3 = this.field639[(int) (arg0 & (long) (this.field638 - 1))];
        for (class54 var4 = var3.field1470; var4 != var3; var4 = var4.field1470) {
            if (var4.field1469 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "ECQQOXBD", name = "a", descriptor = "(JLTLIWLEHU;Z)V")
    public void method210(long arg0, class54 arg1, boolean arg2) {
        if (arg1.field1471 != null) {
            arg1.method471();
        }
        class54 var5 = this.field639[(int) (arg0 & (long) (this.field638 - 1))];
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg1.field1471 = var5.field1471;
        arg1.field1470 = var5;
        arg1.field1471.field1470 = arg1;
        arg1.field1470.field1471 = arg1;
        arg1.field1469 = arg0;
    }
}

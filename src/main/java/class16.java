import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EOXICPMP")
public class class16 {

    @OriginalMember(owner = "EOXICPMP", name = "a", descriptor = "I")
    private int field661 = 497;

    @OriginalMember(owner = "EOXICPMP", name = "b", descriptor = "I")
    private int field662 = -838;

    @OriginalMember(owner = "EOXICPMP", name = "c", descriptor = "LEEYSIGWL;")
    public class14 field663 = new class14();

    @OriginalMember(owner = "EOXICPMP", name = "d", descriptor = "LEEYSIGWL;")
    private class14 field664;

    @OriginalMember(owner = "EOXICPMP", name = "<init>", descriptor = "(Z)V")
    public class16(boolean arg0) {
        this.field663.field653 = this.field663;
        this.field663.field654 = this.field663;
        if (!arg0) {
            this.field661 = 298;
        }
    }

    @OriginalMember(owner = "EOXICPMP", name = "a", descriptor = "(LEEYSIGWL;)V")
    public void method219(class14 arg0) {
        if (arg0.field654 != null) {
            arg0.method215();
        }
        arg0.field654 = this.field663.field654;
        arg0.field653 = this.field663;
        arg0.field654.field653 = arg0;
        arg0.field653.field654 = arg0;
    }

    @OriginalMember(owner = "EOXICPMP", name = "a", descriptor = "()LEEYSIGWL;")
    public class14 method220() {
        class14 var1 = this.field663.field653;
        if (this.field663 == var1) {
            return null;
        } else {
            var1.method215();
            return var1;
        }
    }

    @OriginalMember(owner = "EOXICPMP", name = "b", descriptor = "()LEEYSIGWL;")
    public class14 method221() {
        class14 var1 = this.field663.field653;
        if (this.field663 == var1) {
            this.field664 = null;
            return null;
        } else {
            this.field664 = var1.field653;
            return var1;
        }
    }

    @OriginalMember(owner = "EOXICPMP", name = "a", descriptor = "(I)LEEYSIGWL;")
    public class14 method222(int arg0) {
        class14 var2 = this.field664;
        if (this.field663 == var2) {
            this.field664 = null;
            return null;
        }
        this.field664 = var2.field653;
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "EOXICPMP", name = "c", descriptor = "()I")
    public int method223() {
        int var1 = 0;
        for (class14 var2 = this.field663.field653; var2 != this.field663; var2 = var2.field653) {
            var1++;
        }
        return var1;
    }
}

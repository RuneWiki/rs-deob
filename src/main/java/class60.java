import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UMTLOYSA")
public class class60 {

    @OriginalMember(owner = "UMTLOYSA", name = "a", descriptor = "Z")
    private boolean field1414 = false;

    @OriginalMember(owner = "UMTLOYSA", name = "b", descriptor = "I")
    private int field1415 = 534;

    @OriginalMember(owner = "UMTLOYSA", name = "c", descriptor = "LBIJRHVKA;")
    public class8 field1416 = new class8();

    @OriginalMember(owner = "UMTLOYSA", name = "d", descriptor = "LBIJRHVKA;")
    private class8 field1417;

    @OriginalMember(owner = "UMTLOYSA", name = "<init>", descriptor = "(B)V")
    public class60(byte arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1416.field149 = this.field1416;
        this.field1416.field150 = this.field1416;
    }

    @OriginalMember(owner = "UMTLOYSA", name = "a", descriptor = "(LBIJRHVKA;)V")
    public void method466(class8 arg0) {
        if (arg0.field150 != null) {
            arg0.method35();
        }
        arg0.field150 = this.field1416.field150;
        arg0.field149 = this.field1416;
        arg0.field150.field149 = arg0;
        arg0.field149.field150 = arg0;
    }

    @OriginalMember(owner = "UMTLOYSA", name = "a", descriptor = "()LBIJRHVKA;")
    public class8 method467() {
        class8 var1 = this.field1416.field149;
        if (this.field1416 == var1) {
            return null;
        } else {
            var1.method35();
            return var1;
        }
    }

    @OriginalMember(owner = "UMTLOYSA", name = "b", descriptor = "()LBIJRHVKA;")
    public class8 method468() {
        class8 var1 = this.field1416.field149;
        if (this.field1416 == var1) {
            this.field1417 = null;
            return null;
        } else {
            this.field1417 = var1.field149;
            return var1;
        }
    }

    @OriginalMember(owner = "UMTLOYSA", name = "a", descriptor = "(I)LBIJRHVKA;")
    public class8 method469(int arg0) {
        class8 var2 = this.field1417;
        if (this.field1416 == var2) {
            this.field1417 = null;
            return null;
        }
        this.field1417 = var2.field149;
        if (arg0 < 4 || arg0 > 4) {
            this.field1414 = !this.field1414;
        }
        return var2;
    }

    @OriginalMember(owner = "UMTLOYSA", name = "c", descriptor = "()I")
    public int method470() {
        int var1 = 0;
        for (class8 var2 = this.field1416.field149; var2 != this.field1416; var2 = var2.field149) {
            var1++;
        }
        return var1;
    }
}

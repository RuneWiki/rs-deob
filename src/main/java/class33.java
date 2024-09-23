import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LAPJVQGB")
public class class33 {

    @OriginalMember(owner = "LAPJVQGB", name = "a", descriptor = "Z")
    private boolean field955 = false;

    @OriginalMember(owner = "LAPJVQGB", name = "b", descriptor = "I")
    private int field956 = 280;

    @OriginalMember(owner = "LAPJVQGB", name = "c", descriptor = "LKTAHMSMP;")
    public class31 field957 = new class31();

    @OriginalMember(owner = "LAPJVQGB", name = "d", descriptor = "LKTAHMSMP;")
    private class31 field958;

    @OriginalMember(owner = "LAPJVQGB", name = "<init>", descriptor = "(I)V")
    public class33(int arg0) {
        if (arg0 != -20780) {
            throw new NullPointerException();
        }
        this.field957.field948 = this.field957;
        this.field957.field949 = this.field957;
    }

    @OriginalMember(owner = "LAPJVQGB", name = "a", descriptor = "(LKTAHMSMP;)V")
    public void method346(class31 arg0) {
        if (arg0.field949 != null) {
            arg0.method342();
        }
        arg0.field949 = this.field957.field949;
        arg0.field948 = this.field957;
        arg0.field949.field948 = arg0;
        arg0.field948.field949 = arg0;
    }

    @OriginalMember(owner = "LAPJVQGB", name = "a", descriptor = "()LKTAHMSMP;")
    public class31 method347() {
        class31 var1 = this.field957.field948;
        if (this.field957 == var1) {
            return null;
        } else {
            var1.method342();
            return var1;
        }
    }

    @OriginalMember(owner = "LAPJVQGB", name = "b", descriptor = "()LKTAHMSMP;")
    public class31 method348() {
        class31 var1 = this.field957.field948;
        if (this.field957 == var1) {
            this.field958 = null;
            return null;
        } else {
            this.field958 = var1.field948;
            return var1;
        }
    }

    @OriginalMember(owner = "LAPJVQGB", name = "a", descriptor = "(Z)LKTAHMSMP;")
    public class31 method349(boolean arg0) {
        if (!arg0) {
            this.field955 = !this.field955;
        }
        class31 var2 = this.field958;
        if (this.field957 == var2) {
            this.field958 = null;
            return null;
        } else {
            this.field958 = var2.field948;
            return var2;
        }
    }

    @OriginalMember(owner = "LAPJVQGB", name = "c", descriptor = "()I")
    public int method350() {
        int var1 = 0;
        for (class31 var2 = this.field957.field948; var2 != this.field957; var2 = var2.field948) {
            var1++;
        }
        return var1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QUHNUHWS")
public class class49 {

    @OriginalMember(owner = "QUHNUHWS", name = "a", descriptor = "Z")
    private boolean field1285 = true;

    @OriginalMember(owner = "QUHNUHWS", name = "b", descriptor = "LNFNHZJTP;")
    public class36 field1286 = new class36();

    @OriginalMember(owner = "QUHNUHWS", name = "c", descriptor = "LNFNHZJTP;")
    private class36 field1287;

    @OriginalMember(owner = "QUHNUHWS", name = "<init>", descriptor = "(I)V")
    public class49(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field1286.field1131 = this.field1286;
        this.field1286.field1132 = this.field1286;
    }

    @OriginalMember(owner = "QUHNUHWS", name = "a", descriptor = "(LNFNHZJTP;)V")
    public void method393(class36 arg0) {
        if (arg0.field1132 != null) {
            arg0.method348();
        }
        arg0.field1132 = this.field1286.field1132;
        arg0.field1131 = this.field1286;
        arg0.field1132.field1131 = arg0;
        arg0.field1131.field1132 = arg0;
    }

    @OriginalMember(owner = "QUHNUHWS", name = "a", descriptor = "()LNFNHZJTP;")
    public class36 method394() {
        class36 var1 = this.field1286.field1131;
        if (this.field1286 == var1) {
            return null;
        } else {
            var1.method348();
            return var1;
        }
    }

    @OriginalMember(owner = "QUHNUHWS", name = "b", descriptor = "()LNFNHZJTP;")
    public class36 method395() {
        class36 var1 = this.field1286.field1131;
        if (this.field1286 == var1) {
            this.field1287 = null;
            return null;
        } else {
            this.field1287 = var1.field1131;
            return var1;
        }
    }

    @OriginalMember(owner = "QUHNUHWS", name = "a", descriptor = "(I)LNFNHZJTP;")
    public class36 method396(int arg0) {
        class36 var2 = this.field1287;
        if (this.field1286 == var2) {
            this.field1287 = null;
            return null;
        }
        this.field1287 = var2.field1131;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "QUHNUHWS", name = "c", descriptor = "()I")
    public int method397() {
        int var1 = 0;
        for (class36 var2 = this.field1286.field1131; var2 != this.field1286; var2 = var2.field1131) {
            var1++;
        }
        return var1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TOAGRHDF")
public class class59 {

    @OriginalMember(owner = "TOAGRHDF", name = "a", descriptor = "Z")
    private boolean field1331 = false;

    @OriginalMember(owner = "TOAGRHDF", name = "b", descriptor = "I")
    private int field1332 = 831;

    @OriginalMember(owner = "TOAGRHDF", name = "c", descriptor = "I")
    private int field1333 = -34;

    @OriginalMember(owner = "TOAGRHDF", name = "d", descriptor = "LIZSDUVJF;")
    public class27 field1334 = new class27();

    @OriginalMember(owner = "TOAGRHDF", name = "e", descriptor = "LIZSDUVJF;")
    private class27 field1335;

    @OriginalMember(owner = "TOAGRHDF", name = "<init>", descriptor = "(I)V")
    public class59(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field1334.field916 = this.field1334;
        this.field1334.field917 = this.field1334;
    }

    @OriginalMember(owner = "TOAGRHDF", name = "a", descriptor = "(LIZSDUVJF;)V")
    public void method353(class27 arg0) {
        if (arg0.field917 != null) {
            arg0.method256();
        }
        arg0.field917 = this.field1334.field917;
        arg0.field916 = this.field1334;
        arg0.field917.field916 = arg0;
        arg0.field916.field917 = arg0;
    }

    @OriginalMember(owner = "TOAGRHDF", name = "a", descriptor = "()LIZSDUVJF;")
    public class27 method354() {
        class27 var1 = this.field1334.field916;
        if (this.field1334 == var1) {
            return null;
        } else {
            var1.method256();
            return var1;
        }
    }

    @OriginalMember(owner = "TOAGRHDF", name = "b", descriptor = "()LIZSDUVJF;")
    public class27 method355() {
        class27 var1 = this.field1334.field916;
        if (this.field1334 == var1) {
            this.field1335 = null;
            return null;
        } else {
            this.field1335 = var1.field916;
            return var1;
        }
    }

    @OriginalMember(owner = "TOAGRHDF", name = "a", descriptor = "(I)LIZSDUVJF;")
    public class27 method356(int arg0) {
        class27 var2 = this.field1335;
        if (arg0 <= 0) {
            this.field1333 = -329;
        }
        if (this.field1334 == var2) {
            this.field1335 = null;
            return null;
        } else {
            this.field1335 = var2.field916;
            return var2;
        }
    }

    @OriginalMember(owner = "TOAGRHDF", name = "c", descriptor = "()I")
    public int method357() {
        int var1 = 0;
        for (class27 var2 = this.field1334.field916; var2 != this.field1334; var2 = var2.field916) {
            var1++;
        }
        return var1;
    }
}

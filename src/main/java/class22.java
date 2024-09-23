import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HIGYXWXY")
public class class22 {

    @OriginalMember(owner = "HIGYXWXY", name = "a", descriptor = "LOBKNBIRU;")
    public class40 field860 = new class40();

    @OriginalMember(owner = "HIGYXWXY", name = "b", descriptor = "LOBKNBIRU;")
    private class40 field861;

    @OriginalMember(owner = "HIGYXWXY", name = "<init>", descriptor = "(Z)V")
    public class22(boolean arg0) {
        this.field860.field1073 = this.field860;
        this.field860.field1074 = this.field860;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "HIGYXWXY", name = "a", descriptor = "(LOBKNBIRU;)V")
    public void method244(class40 arg0) {
        if (arg0.field1074 != null) {
            arg0.method312();
        }
        arg0.field1074 = this.field860.field1074;
        arg0.field1073 = this.field860;
        arg0.field1074.field1073 = arg0;
        arg0.field1073.field1074 = arg0;
    }

    @OriginalMember(owner = "HIGYXWXY", name = "a", descriptor = "()LOBKNBIRU;")
    public class40 method245() {
        class40 var1 = this.field860.field1073;
        if (this.field860 == var1) {
            return null;
        } else {
            var1.method312();
            return var1;
        }
    }

    @OriginalMember(owner = "HIGYXWXY", name = "b", descriptor = "()LOBKNBIRU;")
    public class40 method246() {
        class40 var1 = this.field860.field1073;
        if (this.field860 == var1) {
            this.field861 = null;
            return null;
        } else {
            this.field861 = var1.field1073;
            return var1;
        }
    }

    @OriginalMember(owner = "HIGYXWXY", name = "a", descriptor = "(Z)LOBKNBIRU;")
    public class40 method247(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        class40 var2 = this.field861;
        if (this.field860 == var2) {
            this.field861 = null;
            return null;
        } else {
            this.field861 = var2.field1073;
            return var2;
        }
    }

    @OriginalMember(owner = "HIGYXWXY", name = "c", descriptor = "()I")
    public int method248() {
        int var1 = 0;
        for (class40 var2 = this.field860.field1073; var2 != this.field860; var2 = var2.field1073) {
            var1++;
        }
        return var1;
    }
}

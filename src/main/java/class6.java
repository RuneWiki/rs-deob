import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BOZWYCIO")
public class class6 {

    @OriginalMember(owner = "BOZWYCIO", name = "a", descriptor = "Z")
    private boolean field77 = true;

    @OriginalMember(owner = "BOZWYCIO", name = "b", descriptor = "I")
    private int field78 = 4;

    @OriginalMember(owner = "BOZWYCIO", name = "c", descriptor = "LAGCGSOQI;")
    public class1 field79 = new class1();

    @OriginalMember(owner = "BOZWYCIO", name = "d", descriptor = "LAGCGSOQI;")
    private class1 field80;

    @OriginalMember(owner = "BOZWYCIO", name = "<init>", descriptor = "(Z)V")
    public class6(boolean arg0) {
        this.field79.field2 = this.field79;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field79.field3 = this.field79;
    }

    @OriginalMember(owner = "BOZWYCIO", name = "a", descriptor = "(LAGCGSOQI;)V")
    public void method42(class1 arg0) {
        if (arg0.field3 != null) {
            arg0.method1();
        }
        arg0.field3 = this.field79.field3;
        arg0.field2 = this.field79;
        arg0.field3.field2 = arg0;
        arg0.field2.field3 = arg0;
    }

    @OriginalMember(owner = "BOZWYCIO", name = "a", descriptor = "()LAGCGSOQI;")
    public class1 method43() {
        class1 var1 = this.field79.field2;
        if (this.field79 == var1) {
            return null;
        } else {
            var1.method1();
            return var1;
        }
    }

    @OriginalMember(owner = "BOZWYCIO", name = "b", descriptor = "()LAGCGSOQI;")
    public class1 method44() {
        class1 var1 = this.field79.field2;
        if (this.field79 == var1) {
            this.field80 = null;
            return null;
        } else {
            this.field80 = var1.field2;
            return var1;
        }
    }

    @OriginalMember(owner = "BOZWYCIO", name = "a", descriptor = "(Z)LAGCGSOQI;")
    public class1 method45(boolean arg0) {
        if (!arg0) {
            this.field78 = -191;
        }
        class1 var2 = this.field80;
        if (this.field79 == var2) {
            this.field80 = null;
            return null;
        } else {
            this.field80 = var2.field2;
            return var2;
        }
    }

    @OriginalMember(owner = "BOZWYCIO", name = "c", descriptor = "()I")
    public int method46() {
        int var1 = 0;
        for (class1 var2 = this.field79.field2; var2 != this.field79; var2 = var2.field2) {
            var1++;
        }
        return var1;
    }
}

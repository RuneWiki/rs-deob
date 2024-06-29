import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OZVXYFRH")
public class class38 {

    @OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "Z")
    private boolean field1098 = false;

    @OriginalMember(owner = "client!OZVXYFRH", name = "b", descriptor = "LYPOWJZIQ;")
    public class64 field1099 = new class64();

    @OriginalMember(owner = "client!OZVXYFRH", name = "c", descriptor = "LYPOWJZIQ;")
    private class64 field1100;

    @OriginalMember(owner = "client!OZVXYFRH", name = "<init>", descriptor = "(B)V")
    public class38(byte arg0) {
        this.field1099.field1552 = this.field1099;
        if (arg0 != -98) {
            throw new NullPointerException();
        }
        this.field1099.field1553 = this.field1099;
    }

    @OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "(LYPOWJZIQ;)V")
    public void method344(class64 arg0) {
        if (arg0.field1553 != null) {
            arg0.method499();
        }
        arg0.field1553 = this.field1099.field1553;
        arg0.field1552 = this.field1099;
        arg0.field1553.field1552 = arg0;
        arg0.field1552.field1553 = arg0;
        if (class34.field1027) {
        }
    }

    @OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "()LYPOWJZIQ;")
    public class64 method345() {
        class64 var1 = this.field1099.field1552;
        if (this.field1099 == var1) {
            return null;
        } else {
            var1.method499();
            return var1;
        }
    }

    @OriginalMember(owner = "client!OZVXYFRH", name = "b", descriptor = "()LYPOWJZIQ;")
    public class64 method346() {
        class64 var1 = this.field1099.field1552;
        if (this.field1099 == var1) {
            this.field1100 = null;
            return null;
        } else {
            this.field1100 = var1.field1552;
            return var1;
        }
    }

    @OriginalMember(owner = "client!OZVXYFRH", name = "a", descriptor = "(Z)LYPOWJZIQ;")
    public class64 method347(boolean arg0) {
        class64 var2 = this.field1100;
        if (this.field1099 == var2) {
            this.field1100 = null;
            return null;
        }
        this.field1100 = var2.field1552;
        if (arg0) {
            this.field1098 = !this.field1098;
        }
        return var2;
    }

    @OriginalMember(owner = "client!OZVXYFRH", name = "c", descriptor = "()I")
    public int method348() {
        int var1 = 0;
        for (class64 var2 = this.field1099.field1552; var2 != this.field1099; var2 = var2.field1552) {
            var1++;
        }
        return var1;
    }
}

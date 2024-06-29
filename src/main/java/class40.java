import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LXCATFEF")
public class class40 {

    @OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "Z")
    private boolean field1222 = false;

    @OriginalMember(owner = "client!LXCATFEF", name = "b", descriptor = "I")
    private int field1223 = -340;

    @OriginalMember(owner = "client!LXCATFEF", name = "c", descriptor = "LKGLULAMW;")
    public class33 field1224 = new class33();

    @OriginalMember(owner = "client!LXCATFEF", name = "d", descriptor = "LKGLULAMW;")
    private class33 field1225;

    @OriginalMember(owner = "client!LXCATFEF", name = "<init>", descriptor = "(I)V")
    public class40(int arg0) {
        this.field1224.field1134 = this.field1224;
        int var2 = 13 / arg0;
        this.field1224.field1135 = this.field1224;
    }

    @OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "(LKGLULAMW;)V")
    public void method408(class33 arg0) {
        if (arg0.field1135 != null) {
            arg0.method373();
        }
        arg0.field1135 = this.field1224.field1135;
        arg0.field1134 = this.field1224;
        arg0.field1135.field1134 = arg0;
        arg0.field1134.field1135 = arg0;
    }

    @OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "()LKGLULAMW;")
    public class33 method409() {
        class33 var1 = this.field1224.field1134;
        if (this.field1224 == var1) {
            return null;
        } else {
            var1.method373();
            return var1;
        }
    }

    @OriginalMember(owner = "client!LXCATFEF", name = "b", descriptor = "()LKGLULAMW;")
    public class33 method410() {
        class33 var1 = this.field1224.field1134;
        if (this.field1224 == var1) {
            this.field1225 = null;
            return null;
        } else {
            this.field1225 = var1.field1134;
            return var1;
        }
    }

    @OriginalMember(owner = "client!LXCATFEF", name = "a", descriptor = "(I)LKGLULAMW;")
    public class33 method411(int arg0) {
        class33 var2 = this.field1225;
        if (this.field1224 == var2) {
            this.field1225 = null;
            return null;
        }
        this.field1225 = var2.field1134;
        if (arg0 != 0) {
            this.field1223 = -399;
        }
        return var2;
    }

    @OriginalMember(owner = "client!LXCATFEF", name = "c", descriptor = "()I")
    public int method412() {
        int var1 = 0;
        for (class33 var2 = this.field1224.field1134; var2 != this.field1224; var2 = var2.field1134) {
            var1++;
        }
        return var1;
    }
}

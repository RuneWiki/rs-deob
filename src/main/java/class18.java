import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EZRJDJYN")
public class class18 {

    @OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "Z")
    private boolean field753 = false;

    @OriginalMember(owner = "client!EZRJDJYN", name = "b", descriptor = "I")
    private int field754 = 615;

    @OriginalMember(owner = "client!EZRJDJYN", name = "c", descriptor = "LOZZFMONJ;")
    public class42 field755 = new class42();

    @OriginalMember(owner = "client!EZRJDJYN", name = "d", descriptor = "LOZZFMONJ;")
    private class42 field756;

    @OriginalMember(owner = "client!EZRJDJYN", name = "<init>", descriptor = "(I)V")
    public class18(int arg0) {
        if (arg0 != 5) {
            this.field753 = !this.field753;
        }
        this.field755.field1301 = this.field755;
        this.field755.field1302 = this.field755;
    }

    @OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "(LOZZFMONJ;)V")
    public void method190(class42 arg0) {
        if (arg0.field1302 != null) {
            arg0.method371();
        }
        arg0.field1302 = this.field755.field1302;
        arg0.field1301 = this.field755;
        arg0.field1302.field1301 = arg0;
        arg0.field1301.field1302 = arg0;
    }

    @OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "()LOZZFMONJ;")
    public class42 method191() {
        class42 var1 = this.field755.field1301;
        if (this.field755 == var1) {
            return null;
        } else {
            var1.method371();
            return var1;
        }
    }

    @OriginalMember(owner = "client!EZRJDJYN", name = "b", descriptor = "()LOZZFMONJ;")
    public class42 method192() {
        class42 var1 = this.field755.field1301;
        if (this.field755 == var1) {
            this.field756 = null;
            return null;
        } else {
            this.field756 = var1.field1301;
            return var1;
        }
    }

    @OriginalMember(owner = "client!EZRJDJYN", name = "a", descriptor = "(I)LOZZFMONJ;")
    public class42 method193(int arg0) {
        int var2 = 19 / arg0;
        class42 var3 = this.field756;
        if (this.field755 == var3) {
            this.field756 = null;
            return null;
        } else {
            this.field756 = var3.field1301;
            return var3;
        }
    }

    @OriginalMember(owner = "client!EZRJDJYN", name = "c", descriptor = "()I")
    public int method194() {
        int var1 = 0;
        for (class42 var2 = this.field755.field1301; var2 != this.field755; var2 = var2.field1301) {
            var1++;
        }
        return var1;
    }
}

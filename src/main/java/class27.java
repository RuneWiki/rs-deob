import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ISCMIAJK")
public class class27 {

    @OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "I")
    private int field1058 = 40071;

    @OriginalMember(owner = "client!ISCMIAJK", name = "b", descriptor = "Z")
    private boolean field1059 = true;

    @OriginalMember(owner = "client!ISCMIAJK", name = "c", descriptor = "LOHSXMHUZ;")
    public class42 field1060 = new class42();

    @OriginalMember(owner = "client!ISCMIAJK", name = "d", descriptor = "LOHSXMHUZ;")
    private class42 field1061;

    @OriginalMember(owner = "client!ISCMIAJK", name = "<init>", descriptor = "(Z)V")
    public class27(boolean arg0) {
        this.field1060.field1259 = this.field1060;
        if (!arg0) {
            this.field1059 = !this.field1059;
        }
        this.field1060.field1260 = this.field1060;
    }

    @OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "(LOHSXMHUZ;)V")
    public void method307(class42 arg0) {
        if (arg0.field1260 != null) {
            arg0.method432();
        }
        arg0.field1260 = this.field1060.field1260;
        arg0.field1259 = this.field1060;
        arg0.field1260.field1259 = arg0;
        arg0.field1259.field1260 = arg0;
    }

    @OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "()LOHSXMHUZ;")
    public class42 method308() {
        class42 var1 = this.field1060.field1259;
        if (this.field1060 == var1) {
            return null;
        } else {
            var1.method432();
            return var1;
        }
    }

    @OriginalMember(owner = "client!ISCMIAJK", name = "b", descriptor = "()LOHSXMHUZ;")
    public class42 method309() {
        class42 var1 = this.field1060.field1259;
        if (this.field1060 == var1) {
            this.field1061 = null;
            return null;
        } else {
            this.field1061 = var1.field1259;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "(I)LOHSXMHUZ;")
    public class42 method310(int arg0) {
        class42 var2 = this.field1061;
        if (this.field1060 == var2) {
            this.field1061 = null;
            return null;
        } else {
            this.field1061 = var2.field1259;
            int var3 = 6 / arg0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ISCMIAJK", name = "c", descriptor = "()I")
    public int method311() {
        int var1 = 0;
        for (class42 var2 = this.field1060.field1259; var2 != this.field1060; var2 = var2.field1259) {
            var1++;
        }
        return var1;
    }
}

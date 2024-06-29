import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BGTUCWCI")
public class class3 {

    @OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "Z")
    private boolean field49 = false;

    @OriginalMember(owner = "client!BGTUCWCI", name = "b", descriptor = "LUCIRENXU;")
    public class55 field50 = new class55();

    @OriginalMember(owner = "client!BGTUCWCI", name = "c", descriptor = "LUCIRENXU;")
    private class55 field51;

    @OriginalMember(owner = "client!BGTUCWCI", name = "<init>", descriptor = "(I)V")
    public class3(int arg0) {
        this.field50.field1260 = this.field50;
        if (arg0 != 41416) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field50.field1261 = this.field50;
    }

    @OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "(LUCIRENXU;)V")
    public void method13(class55 arg0) {
        if (arg0.field1261 != null) {
            arg0.method456();
        }
        arg0.field1261 = this.field50.field1261;
        arg0.field1260 = this.field50;
        arg0.field1261.field1260 = arg0;
        arg0.field1260.field1261 = arg0;
    }

    @OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "()LUCIRENXU;")
    public class55 method14() {
        class55 var1 = this.field50.field1260;
        if (this.field50 == var1) {
            return null;
        } else {
            var1.method456();
            return var1;
        }
    }

    @OriginalMember(owner = "client!BGTUCWCI", name = "b", descriptor = "()LUCIRENXU;")
    public class55 method15() {
        class55 var1 = this.field50.field1260;
        if (this.field50 == var1) {
            this.field51 = null;
            return null;
        } else {
            this.field51 = var1.field1260;
            return var1;
        }
    }

    @OriginalMember(owner = "client!BGTUCWCI", name = "a", descriptor = "(I)LUCIRENXU;")
    public class55 method16(int arg0) {
        class55 var2 = this.field51;
        if (arg0 < 8 || arg0 > 8) {
            throw new NullPointerException();
        } else if (this.field50 == var2) {
            this.field51 = null;
            return null;
        } else {
            this.field51 = var2.field1260;
            return var2;
        }
    }

    @OriginalMember(owner = "client!BGTUCWCI", name = "c", descriptor = "()I")
    public int method17() {
        int var1 = 0;
        for (class55 var2 = this.field50.field1260; var2 != this.field50; var2 = var2.field1260) {
            var1++;
        }
        return var1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ODYOEFFK")
public class class39 {

    @OriginalMember(owner = "ODYOEFFK", name = "a", descriptor = "Z")
    private boolean field1186 = false;

    @OriginalMember(owner = "ODYOEFFK", name = "b", descriptor = "Z")
    private boolean field1187 = true;

    @OriginalMember(owner = "ODYOEFFK", name = "c", descriptor = "LEWMBJETC;")
    public class13 field1188 = new class13();

    @OriginalMember(owner = "ODYOEFFK", name = "d", descriptor = "LEWMBJETC;")
    private class13 field1189;

    @OriginalMember(owner = "ODYOEFFK", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        this.field1188.field709 = this.field1188;
        this.field1188.field710 = this.field1188;
        int var2 = 36 / arg0;
    }

    @OriginalMember(owner = "ODYOEFFK", name = "a", descriptor = "(LEWMBJETC;)V")
    public void method393(class13 arg0) {
        if (arg0.field710 != null) {
            arg0.method209();
        }
        arg0.field710 = this.field1188.field710;
        arg0.field709 = this.field1188;
        arg0.field710.field709 = arg0;
        arg0.field709.field710 = arg0;
    }

    @OriginalMember(owner = "ODYOEFFK", name = "a", descriptor = "()LEWMBJETC;")
    public class13 method394() {
        class13 var1 = this.field1188.field709;
        if (this.field1188 == var1) {
            return null;
        } else {
            var1.method209();
            return var1;
        }
    }

    @OriginalMember(owner = "ODYOEFFK", name = "b", descriptor = "()LEWMBJETC;")
    public class13 method395() {
        class13 var1 = this.field1188.field709;
        if (this.field1188 == var1) {
            this.field1189 = null;
            return null;
        } else {
            this.field1189 = var1.field709;
            return var1;
        }
    }

    @OriginalMember(owner = "ODYOEFFK", name = "a", descriptor = "(Z)LEWMBJETC;")
    public class13 method396(boolean arg0) {
        if (arg0) {
            this.field1187 = !this.field1187;
        }
        class13 var2 = this.field1189;
        if (this.field1188 == var2) {
            this.field1189 = null;
            return null;
        } else {
            this.field1189 = var2.field709;
            return var2;
        }
    }

    @OriginalMember(owner = "ODYOEFFK", name = "c", descriptor = "()I")
    public int method397() {
        int var1 = 0;
        for (class13 var2 = this.field1188.field709; var2 != this.field1188; var2 = var2.field709) {
            var1++;
        }
        return var1;
    }
}

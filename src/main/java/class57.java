import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VHKTMNAT")
public class class57 {

    @OriginalMember(owner = "VHKTMNAT", name = "a", descriptor = "I")
    private int field1460 = 7;

    @OriginalMember(owner = "VHKTMNAT", name = "b", descriptor = "LWLTWEDNK;")
    public class61 field1461 = new class61();

    @OriginalMember(owner = "VHKTMNAT", name = "c", descriptor = "LWLTWEDNK;")
    private class61 field1462;

    @OriginalMember(owner = "VHKTMNAT", name = "<init>", descriptor = "(Z)V")
    public class57(boolean arg0) {
        this.field1461.field1566 = this.field1461;
        if (!arg0) {
            this.field1460 = -204;
        }
        this.field1461.field1567 = this.field1461;
    }

    @OriginalMember(owner = "VHKTMNAT", name = "a", descriptor = "(LWLTWEDNK;)V")
    public void method489(class61 arg0) {
        if (arg0.field1567 != null) {
            arg0.method524();
        }
        arg0.field1567 = this.field1461.field1567;
        arg0.field1566 = this.field1461;
        arg0.field1567.field1566 = arg0;
        arg0.field1566.field1567 = arg0;
    }

    @OriginalMember(owner = "VHKTMNAT", name = "a", descriptor = "()LWLTWEDNK;")
    public class61 method490() {
        class61 var1 = this.field1461.field1566;
        if (this.field1461 == var1) {
            return null;
        } else {
            var1.method524();
            return var1;
        }
    }

    @OriginalMember(owner = "VHKTMNAT", name = "b", descriptor = "()LWLTWEDNK;")
    public class61 method491() {
        class61 var1 = this.field1461.field1566;
        if (this.field1461 == var1) {
            this.field1462 = null;
            return null;
        } else {
            this.field1462 = var1.field1566;
            return var1;
        }
    }

    @OriginalMember(owner = "VHKTMNAT", name = "a", descriptor = "(B)LWLTWEDNK;")
    public class61 method492(byte arg0) {
        if (arg0 != -96) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class61 var3 = this.field1462;
        if (this.field1461 == var3) {
            this.field1462 = null;
            return null;
        } else {
            this.field1462 = var3.field1566;
            return var3;
        }
    }

    @OriginalMember(owner = "VHKTMNAT", name = "c", descriptor = "()I")
    public int method493() {
        int var1 = 0;
        for (class61 var2 = this.field1461.field1566; var2 != this.field1461; var2 = var2.field1566) {
            var1++;
        }
        return var1;
    }
}

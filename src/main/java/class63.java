import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XWKFKQRL")
public class class63 {

    @OriginalMember(owner = "XWKFKQRL", name = "a", descriptor = "Z")
    private boolean field1521 = true;

    @OriginalMember(owner = "XWKFKQRL", name = "b", descriptor = "I")
    private int field1522 = 798;

    @OriginalMember(owner = "XWKFKQRL", name = "d", descriptor = "I")
    private int field1524 = 3;

    @OriginalMember(owner = "XWKFKQRL", name = "e", descriptor = "LJJFDBATQ;")
    public class30 field1525 = new class30();

    @OriginalMember(owner = "XWKFKQRL", name = "c", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "XWKFKQRL", name = "f", descriptor = "LJJFDBATQ;")
    private class30 field1526;

    @OriginalMember(owner = "XWKFKQRL", name = "<init>", descriptor = "(Z)V")
    public class63(boolean arg0) {
        this.field1525.field945 = this.field1525;
        this.field1525.field946 = this.field1525;
        if (arg0) {
            this.field1521 = !this.field1521;
        }
    }

    @OriginalMember(owner = "XWKFKQRL", name = "a", descriptor = "(LJJFDBATQ;)V")
    public void method520(class30 arg0) {
        if (arg0.field946 != null) {
            arg0.method278();
        }
        arg0.field946 = this.field1525.field946;
        arg0.field945 = this.field1525;
        arg0.field946.field945 = arg0;
        arg0.field945.field946 = arg0;
    }

    @OriginalMember(owner = "XWKFKQRL", name = "a", descriptor = "()LJJFDBATQ;")
    public class30 method521() {
        class30 var1 = this.field1525.field945;
        if (this.field1525 == var1) {
            return null;
        } else {
            var1.method278();
            return var1;
        }
    }

    @OriginalMember(owner = "XWKFKQRL", name = "b", descriptor = "()LJJFDBATQ;")
    public class30 method522() {
        class30 var1 = this.field1525.field945;
        if (this.field1525 == var1) {
            this.field1526 = null;
            return null;
        } else {
            this.field1526 = var1.field945;
            return var1;
        }
    }

    @OriginalMember(owner = "XWKFKQRL", name = "a", descriptor = "(Z)LJJFDBATQ;")
    public class30 method523(boolean arg0) {
        if (arg0) {
            this.field1523 = 273;
        }
        class30 var2 = this.field1526;
        if (this.field1525 == var2) {
            this.field1526 = null;
            return null;
        } else {
            this.field1526 = var2.field945;
            return var2;
        }
    }

    @OriginalMember(owner = "XWKFKQRL", name = "c", descriptor = "()I")
    public int method524() {
        int var1 = 0;
        for (class30 var2 = this.field1525.field945; var2 != this.field1525; var2 = var2.field945) {
            var1++;
        }
        return var1;
    }
}

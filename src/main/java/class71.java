import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZLISRGEK")
public class class71 {

    @OriginalMember(owner = "ZLISRGEK", name = "b", descriptor = "I")
    private int field1743 = 1;

    @OriginalMember(owner = "ZLISRGEK", name = "c", descriptor = "Z")
    private boolean field1744 = true;

    @OriginalMember(owner = "ZLISRGEK", name = "d", descriptor = "I")
    private int field1745 = 36177;

    @OriginalMember(owner = "ZLISRGEK", name = "e", descriptor = "LDRKSBDQX;")
    public class10 field1746 = new class10();

    @OriginalMember(owner = "ZLISRGEK", name = "a", descriptor = "I")
    private int field1742;

    @OriginalMember(owner = "ZLISRGEK", name = "f", descriptor = "LDRKSBDQX;")
    private class10 field1747;

    @OriginalMember(owner = "ZLISRGEK", name = "<init>", descriptor = "(I)V")
    public class71(int arg0) {
        this.field1746.field684 = this.field1746;
        if (arg0 < 8 || arg0 > 8) {
            this.field1743 = -455;
        }
        this.field1746.field685 = this.field1746;
    }

    @OriginalMember(owner = "ZLISRGEK", name = "a", descriptor = "(LDRKSBDQX;)V")
    public void method592(class10 arg0) {
        if (arg0.field685 != null) {
            arg0.method217();
        }
        arg0.field685 = this.field1746.field685;
        arg0.field684 = this.field1746;
        arg0.field685.field684 = arg0;
        arg0.field684.field685 = arg0;
    }

    @OriginalMember(owner = "ZLISRGEK", name = "a", descriptor = "()LDRKSBDQX;")
    public class10 method593() {
        class10 var1 = this.field1746.field684;
        if (this.field1746 == var1) {
            return null;
        } else {
            var1.method217();
            return var1;
        }
    }

    @OriginalMember(owner = "ZLISRGEK", name = "b", descriptor = "()LDRKSBDQX;")
    public class10 method594() {
        class10 var1 = this.field1746.field684;
        if (this.field1746 == var1) {
            this.field1747 = null;
            return null;
        } else {
            this.field1747 = var1.field684;
            return var1;
        }
    }

    @OriginalMember(owner = "ZLISRGEK", name = "a", descriptor = "(B)LDRKSBDQX;")
    public class10 method595(byte arg0) {
        class10 var2 = this.field1747;
        if (this.field1746 == var2) {
            this.field1747 = null;
            return null;
        }
        this.field1747 = var2.field684;
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            this.field1742 = -402;
        }
        return var2;
    }

    @OriginalMember(owner = "ZLISRGEK", name = "c", descriptor = "()I")
    public int method596() {
        int var1 = 0;
        for (class10 var2 = this.field1746.field684; var2 != this.field1746; var2 = var2.field684) {
            var1++;
        }
        return var1;
    }
}

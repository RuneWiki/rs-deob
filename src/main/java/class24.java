import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JCEXAOBP")
public class class24 {

    @OriginalMember(owner = "JCEXAOBP", name = "a", descriptor = "I")
    private int field859 = 7;

    @OriginalMember(owner = "JCEXAOBP", name = "b", descriptor = "LORGNKIAP;")
    public class40 field860 = new class40();

    @OriginalMember(owner = "JCEXAOBP", name = "c", descriptor = "LORGNKIAP;")
    private class40 field861;

    @OriginalMember(owner = "JCEXAOBP", name = "<init>", descriptor = "(Z)V")
    public class24(boolean arg0) {
        this.field860.field1115 = this.field860;
        this.field860.field1116 = this.field860;
        if (!arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "JCEXAOBP", name = "a", descriptor = "(LORGNKIAP;)V")
    public void method249(class40 arg0) {
        if (arg0.field1116 != null) {
            arg0.method400();
        }
        arg0.field1116 = this.field860.field1116;
        arg0.field1115 = this.field860;
        arg0.field1116.field1115 = arg0;
        arg0.field1115.field1116 = arg0;
    }

    @OriginalMember(owner = "JCEXAOBP", name = "a", descriptor = "()LORGNKIAP;")
    public class40 method250() {
        class40 var1 = this.field860.field1115;
        if (this.field860 == var1) {
            return null;
        } else {
            var1.method400();
            return var1;
        }
    }

    @OriginalMember(owner = "JCEXAOBP", name = "b", descriptor = "()LORGNKIAP;")
    public class40 method251() {
        class40 var1 = this.field860.field1115;
        if (this.field860 == var1) {
            this.field861 = null;
            return null;
        } else {
            this.field861 = var1.field1115;
            return var1;
        }
    }

    @OriginalMember(owner = "JCEXAOBP", name = "a", descriptor = "(I)LORGNKIAP;")
    public class40 method252(int arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class40 var3 = this.field861;
        if (this.field860 == var3) {
            this.field861 = null;
            return null;
        } else {
            this.field861 = var3.field1115;
            return var3;
        }
    }

    @OriginalMember(owner = "JCEXAOBP", name = "c", descriptor = "()I")
    public int method253() {
        int var1 = 0;
        for (class40 var2 = this.field860.field1115; var2 != this.field860; var2 = var2.field1115) {
            var1++;
        }
        return var1;
    }
}

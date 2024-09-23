import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FEBLELGD")
public class class19 {

    @OriginalMember(owner = "FEBLELGD", name = "b", descriptor = "I")
    private int field746 = -558;

    @OriginalMember(owner = "FEBLELGD", name = "c", descriptor = "LCYIKEZWP;")
    public class10 field747 = new class10();

    @OriginalMember(owner = "FEBLELGD", name = "a", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "FEBLELGD", name = "d", descriptor = "LCYIKEZWP;")
    private class10 field748;

    @OriginalMember(owner = "FEBLELGD", name = "<init>", descriptor = "(B)V")
    public class19(byte arg0) {
        this.field747.field595 = this.field747;
        this.field747.field596 = this.field747;
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "FEBLELGD", name = "a", descriptor = "(LCYIKEZWP;)V")
    public void method302(class10 arg0) {
        if (arg0.field596 != null) {
            arg0.method177();
        }
        arg0.field596 = this.field747.field596;
        arg0.field595 = this.field747;
        arg0.field596.field595 = arg0;
        arg0.field595.field596 = arg0;
    }

    @OriginalMember(owner = "FEBLELGD", name = "a", descriptor = "()LCYIKEZWP;")
    public class10 method303() {
        class10 var1 = this.field747.field595;
        if (this.field747 == var1) {
            return null;
        } else {
            var1.method177();
            return var1;
        }
    }

    @OriginalMember(owner = "FEBLELGD", name = "b", descriptor = "()LCYIKEZWP;")
    public class10 method304() {
        class10 var1 = this.field747.field595;
        if (this.field747 == var1) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var1.field595;
            return var1;
        }
    }

    @OriginalMember(owner = "FEBLELGD", name = "a", descriptor = "(I)LCYIKEZWP;")
    public class10 method305(int arg0) {
        if (arg0 >= 0) {
            this.field745 = 197;
        }
        class10 var2 = this.field748;
        if (this.field747 == var2) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var2.field595;
            return var2;
        }
    }

    @OriginalMember(owner = "FEBLELGD", name = "c", descriptor = "()I")
    public int method306() {
        int var1 = 0;
        for (class10 var2 = this.field747.field595; var2 != this.field747; var2 = var2.field595) {
            var1++;
        }
        return var1;
    }
}

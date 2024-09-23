import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SYRXWHZM")
public class class51 {

    @OriginalMember(owner = "SYRXWHZM", name = "a", descriptor = "LYLJOEYBF;")
    public class68 field1255 = new class68();

    @OriginalMember(owner = "SYRXWHZM", name = "b", descriptor = "LYLJOEYBF;")
    private class68 field1256;

    @OriginalMember(owner = "SYRXWHZM", name = "<init>", descriptor = "(Z)V")
    public class51(boolean arg0) {
        this.field1255.field1543 = this.field1255;
        if (arg0) {
            throw new NullPointerException();
        }
        this.field1255.field1544 = this.field1255;
    }

    @OriginalMember(owner = "SYRXWHZM", name = "a", descriptor = "(LYLJOEYBF;)V")
    public void method481(class68 arg0) {
        if (arg0.field1544 != null) {
            arg0.method545();
        }
        arg0.field1544 = this.field1255.field1544;
        arg0.field1543 = this.field1255;
        arg0.field1544.field1543 = arg0;
        arg0.field1543.field1544 = arg0;
        if (class53.field1329) {
        }
    }

    @OriginalMember(owner = "SYRXWHZM", name = "a", descriptor = "()LYLJOEYBF;")
    public class68 method482() {
        class68 var1 = this.field1255.field1543;
        if (this.field1255 == var1) {
            return null;
        } else {
            var1.method545();
            return var1;
        }
    }

    @OriginalMember(owner = "SYRXWHZM", name = "b", descriptor = "()LYLJOEYBF;")
    public class68 method483() {
        class68 var1 = this.field1255.field1543;
        if (this.field1255 == var1) {
            this.field1256 = null;
            return null;
        } else {
            this.field1256 = var1.field1543;
            return var1;
        }
    }

    @OriginalMember(owner = "SYRXWHZM", name = "a", descriptor = "(I)LYLJOEYBF;")
    public class68 method484(int arg0) {
        class68 var2 = this.field1256;
        if (this.field1255 == var2) {
            this.field1256 = null;
            return null;
        }
        this.field1256 = var2.field1543;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "SYRXWHZM", name = "c", descriptor = "()I")
    public int method485() {
        int var1 = 0;
        for (class68 var2 = this.field1255.field1543; var2 != this.field1255; var2 = var2.field1543) {
            var1++;
        }
        return var1;
    }
}

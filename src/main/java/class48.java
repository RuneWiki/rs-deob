import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QHOLWOGP")
public class class48 {

    @OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "Z")
    private boolean field1417 = false;

    @OriginalMember(owner = "client!QHOLWOGP", name = "b", descriptor = "LIVMCUDWL;")
    public class26 field1418 = new class26();

    @OriginalMember(owner = "client!QHOLWOGP", name = "c", descriptor = "LIVMCUDWL;")
    private class26 field1419;

    @OriginalMember(owner = "client!QHOLWOGP", name = "<init>", descriptor = "(B)V")
    public class48(byte arg0) {
        this.field1418.field851 = this.field1418;
        this.field1418.field852 = this.field1418;
        if (arg0 != -67) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "(LIVMCUDWL;)V")
    public void method441(class26 arg0) {
        if (arg0.field852 != null) {
            arg0.method282();
        }
        arg0.field852 = this.field1418.field852;
        arg0.field851 = this.field1418;
        arg0.field852.field851 = arg0;
        arg0.field851.field852 = arg0;
    }

    @OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "()LIVMCUDWL;")
    public class26 method442() {
        class26 var1 = this.field1418.field851;
        if (this.field1418 == var1) {
            return null;
        } else {
            var1.method282();
            return var1;
        }
    }

    @OriginalMember(owner = "client!QHOLWOGP", name = "b", descriptor = "()LIVMCUDWL;")
    public class26 method443() {
        class26 var1 = this.field1418.field851;
        if (this.field1418 == var1) {
            this.field1419 = null;
            return null;
        } else {
            this.field1419 = var1.field851;
            return var1;
        }
    }

    @OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "(B)LIVMCUDWL;")
    public class26 method444(byte arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class26 var3 = this.field1419;
        if (this.field1418 == var3) {
            this.field1419 = null;
            return null;
        } else {
            this.field1419 = var3.field851;
            return var3;
        }
    }

    @OriginalMember(owner = "client!QHOLWOGP", name = "c", descriptor = "()I")
    public int method445() {
        int var1 = 0;
        for (class26 var2 = this.field1418.field851; var2 != this.field1418; var2 = var2.field851) {
            var1++;
        }
        return var1;
    }
}

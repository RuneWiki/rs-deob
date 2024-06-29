import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ELLPUVEP")
public class class13 {

    @OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "Z")
    private boolean field662 = true;

    @OriginalMember(owner = "client!ELLPUVEP", name = "b", descriptor = "LICYNFRTV;")
    public class23 field663 = new class23();

    @OriginalMember(owner = "client!ELLPUVEP", name = "c", descriptor = "LICYNFRTV;")
    private class23 field664;

    @OriginalMember(owner = "client!ELLPUVEP", name = "<init>", descriptor = "(B)V")
    public class13(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        this.field663.field831 = this.field663;
        this.field663.field832 = this.field663;
    }

    @OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "(LICYNFRTV;)V")
    public void method280(class23 arg0) {
        if (arg0.field832 != null) {
            arg0.method320();
        }
        arg0.field832 = this.field663.field832;
        arg0.field831 = this.field663;
        arg0.field832.field831 = arg0;
        arg0.field831.field832 = arg0;
    }

    @OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "()LICYNFRTV;")
    public class23 method281() {
        class23 var1 = this.field663.field831;
        if (this.field663 == var1) {
            return null;
        } else {
            var1.method320();
            return var1;
        }
    }

    @OriginalMember(owner = "client!ELLPUVEP", name = "b", descriptor = "()LICYNFRTV;")
    public class23 method282() {
        class23 var1 = this.field663.field831;
        if (this.field663 == var1) {
            this.field664 = null;
            return null;
        } else {
            this.field664 = var1.field831;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ELLPUVEP", name = "a", descriptor = "(Z)LICYNFRTV;")
    public class23 method283(boolean arg0) {
        class23 var2 = this.field664;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field663 == var2) {
            this.field664 = null;
            return null;
        } else {
            this.field664 = var2.field831;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ELLPUVEP", name = "c", descriptor = "()I")
    public int method284() {
        int var1 = 0;
        for (class23 var2 = this.field663.field831; var2 != this.field663; var2 = var2.field831) {
            var1++;
        }
        return var1;
    }
}

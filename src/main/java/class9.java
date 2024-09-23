import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DTFBSXNF")
public class class9 {

    @OriginalMember(owner = "DTFBSXNF", name = "a", descriptor = "Z")
    private boolean field619 = true;

    @OriginalMember(owner = "DTFBSXNF", name = "b", descriptor = "Z")
    private boolean field620 = false;

    @OriginalMember(owner = "DTFBSXNF", name = "c", descriptor = "B")
    private byte field621 = -27;

    @OriginalMember(owner = "DTFBSXNF", name = "d", descriptor = "LIYPTVTAD;")
    public class30 field622 = new class30();

    @OriginalMember(owner = "DTFBSXNF", name = "e", descriptor = "LIYPTVTAD;")
    private class30 field623;

    @OriginalMember(owner = "DTFBSXNF", name = "<init>", descriptor = "(Z)V")
    public class9(boolean arg0) {
        if (arg0) {
            this.field619 = !this.field619;
        }
        this.field622.field988 = this.field622;
        this.field622.field989 = this.field622;
    }

    @OriginalMember(owner = "DTFBSXNF", name = "a", descriptor = "(LIYPTVTAD;)V")
    public void method209(class30 arg0) {
        if (arg0.field989 != null) {
            arg0.method373();
        }
        arg0.field989 = this.field622.field989;
        arg0.field988 = this.field622;
        arg0.field989.field988 = arg0;
        arg0.field988.field989 = arg0;
    }

    @OriginalMember(owner = "DTFBSXNF", name = "a", descriptor = "()LIYPTVTAD;")
    public class30 method210() {
        class30 var1 = this.field622.field988;
        if (this.field622 == var1) {
            return null;
        } else {
            var1.method373();
            return var1;
        }
    }

    @OriginalMember(owner = "DTFBSXNF", name = "b", descriptor = "()LIYPTVTAD;")
    public class30 method211() {
        class30 var1 = this.field622.field988;
        if (this.field622 == var1) {
            this.field623 = null;
            return null;
        } else {
            this.field623 = var1.field988;
            return var1;
        }
    }

    @OriginalMember(owner = "DTFBSXNF", name = "a", descriptor = "(B)LIYPTVTAD;")
    public class30 method212(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        class30 var2 = this.field623;
        if (this.field622 == var2) {
            this.field623 = null;
            return null;
        } else {
            this.field623 = var2.field988;
            return var2;
        }
    }

    @OriginalMember(owner = "DTFBSXNF", name = "c", descriptor = "()I")
    public int method213() {
        int var1 = 0;
        for (class30 var2 = this.field622.field988; var2 != this.field622; var2 = var2.field988) {
            var1++;
        }
        return var1;
    }
}

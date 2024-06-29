import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class16 extends class48 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Z")
    private boolean field148 = false;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lgi;")
    private class253 field149;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public final void method69(int arg0) {
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public final void method70(boolean arg0) {
        this.field480.method2053(8448, 7681);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lna;)V")
    public final void method71(class50 arg0) {
        this.field480.method2032(arg0);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lql;)V")
    public class16(class346 arg0) {
        super(arg0);
        if (arg0.field4767) {
            opengl var2 = this.field480.field4697;
            this.field149 = new class253(arg0, 2);
            this.field149.method1429(0);
            this.field480.method2052(1);
            this.field480.method2053(34165, 7681);
            this.field480.method2062(2, 34168, 770);
            this.field480.method2040(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field480.method2052(0);
            this.field149.method1428();
            this.field149.method1429(1);
            this.field480.method2052(1);
            this.field480.method2053(8448, 8448);
            this.field480.method2062(2, 34166, 770);
            this.field480.method2040(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field480.method2052(0);
            this.field149.method1428();
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()V")
    public final void method72() {
        if (this.field148) {
            this.field149.method1427('\u0001');
            this.field480.method2052(1);
            this.field480.method2032((class50) null);
            this.field480.method2052(0);
        } else {
            this.field480.method2040(0, 5890, 770);
        }
        this.field480.method2053(8448, 8448);
        this.field148 = false;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        class433 var2 = this.field480.method2049();
        if (this.field149 == null || var2 == null || !arg0) {
            this.field480.method2040(0, 34168, 770);
            return;
        }
        opengl var3 = this.field480.field4697;
        this.field149.method1427('\u0000');
        this.field480.method2052(1);
        this.field480.method2032(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field480.field4760.method741(-99), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field480.method2052(0);
        this.field148 = true;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "()Z")
    public final boolean method74() {
        return true;
    }
}

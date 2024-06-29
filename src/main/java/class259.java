import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class259 extends class232 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Z")
    private boolean field3638 = false;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Lbb;")
    private class182 field3637;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V")
    public final void method354(boolean arg0) {
        class10 var2 = this.field3348.method1531();
        if (this.field3637 == null || var2 == null || !arg0) {
            this.field3348.method1572(0, 34168, 770);
            return;
        }
        opengl var3 = this.field3348.field3184;
        this.field3637.method1193('\u0000');
        this.field3348.method1566(1);
        this.field3348.method1559(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field3348.field3213.method2084(85), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field3348.method1566(0);
        this.field3638 = true;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lue;)V")
    public final void method356(class127 arg0) {
        this.field3348.method1559(arg0);
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ltb;)V")
    public class259(class227 arg0) {
        super(arg0);
        if (arg0.field3296) {
            opengl var2 = this.field3348.field3184;
            this.field3637 = new class182(arg0, 2);
            this.field3637.method1192(0);
            this.field3348.method1566(1);
            this.field3348.method1542(34165, 7681);
            this.field3348.method1512(2, 34168, 770);
            this.field3348.method1572(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field3348.method1566(0);
            this.field3637.method1191();
            this.field3637.method1192(1);
            this.field3348.method1566(1);
            this.field3348.method1542(8448, 8448);
            this.field3348.method1512(2, 34166, 770);
            this.field3348.method1572(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field3348.method1566(0);
            this.field3637.method1191();
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public final void method357(boolean arg0) {
        this.field3348.method1542(8448, 7681);
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
    public final void method352() {
        if (this.field3638) {
            this.field3637.method1193('\u0001');
            this.field3348.method1566(1);
            this.field3348.method1559((class127) null);
            this.field3348.method1566(0);
        } else {
            this.field3348.method1572(0, 5890, 770);
        }
        this.field3348.method1542(8448, 8448);
        this.field3638 = false;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()Z")
    public final boolean method358() {
        return true;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public final void method355(int arg0) {
    }
}

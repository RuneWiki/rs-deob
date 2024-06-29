import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class99 extends class304 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Z")
    private boolean field1318 = false;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lns;")
    private class426 field1317;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public final void method625(int arg0) {
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
    public final void method627() {
        if (this.field1318) {
            this.field1317.method2672('\u0001');
            this.field4557.method1862(1);
            this.field4557.method1915((class344) null);
            this.field4557.method1862(0);
        } else {
            this.field4557.method1867(0, 5890, 770);
        }
        this.field4557.method1911(8448, 8448);
        this.field1318 = false;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lse;)V")
    public class99(class282 arg0) {
        super(arg0);
        if (arg0.field4182) {
            opengl var2 = this.field4557.field4140;
            this.field1317 = new class426(arg0, 2);
            this.field1317.method2670(0);
            this.field4557.method1862(1);
            this.field4557.method1911(34165, 7681);
            this.field4557.method1866(2, 34168, 770);
            this.field4557.method1867(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field4557.method1862(0);
            this.field1317.method2671();
            this.field1317.method2670(1);
            this.field4557.method1862(1);
            this.field4557.method1911(8448, 8448);
            this.field4557.method1866(2, 34166, 770);
            this.field4557.method1867(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field4557.method1862(0);
            this.field1317.method2671();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lgd;)V")
    public final void method629(class344 arg0) {
        this.field4557.method1915(arg0);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()Z")
    public final boolean method628() {
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public final void method624(boolean arg0) {
        this.field4557.method1911(8448, 7681);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public final void method630(boolean arg0) {
        class141 var2 = this.field4557.method1887();
        if (this.field1317 == null || var2 == null || !arg0) {
            this.field4557.method1867(0, 34168, 770);
            return;
        }
        opengl var3 = this.field4557.field4140;
        this.field1317.method2672('\u0000');
        this.field4557.method1862(1);
        this.field4557.method1915(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field4557.field4219.method265((byte) -103), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field4557.method1862(0);
        this.field1318 = true;
    }
}

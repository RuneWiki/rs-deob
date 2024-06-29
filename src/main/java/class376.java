import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class376 extends class331 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
    private boolean field5420 = false;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lma;")
    private class10 field5421;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()Z")
    public final boolean method812() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public final void method815(int arg0) {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public final void method811(boolean arg0) {
        class294 var2 = this.field4787.method2016();
        if (this.field5421 == null || var2 == null || !arg0) {
            this.field4787.method2017(0, 34168, 770);
            return;
        }
        opengl var3 = this.field4787.field4445;
        this.field5421.method37('\u0000');
        this.field4787.method1972(1);
        this.field4787.method1967(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field4787.field4523.method2045(false), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field4787.method1972(0);
        this.field5420 = true;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
    public final void method813(boolean arg0) {
        this.field4787.method1992(8448, 7681);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lbl;)V")
    public final void method817(class425 arg0) {
        this.field4787.method1967(arg0);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method816() {
        if (this.field5420) {
            this.field5421.method37('\u0001');
            this.field4787.method1972(1);
            this.field4787.method1967((class425) null);
            this.field4787.method1972(0);
        } else {
            this.field4787.method2017(0, 5890, 770);
        }
        this.field4787.method1992(8448, 8448);
        this.field5420 = false;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lmi;)V")
    public class376(class315 arg0) {
        super(arg0);
        if (arg0.field4509) {
            opengl var2 = this.field4787.field4445;
            this.field5421 = new class10(arg0, 2);
            this.field5421.method39(0);
            this.field4787.method1972(1);
            this.field4787.method1992(34165, 7681);
            this.field4787.method2006(2, 34168, 770);
            this.field4787.method2017(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field4787.method1972(0);
            this.field5421.method38();
            this.field5421.method39(1);
            this.field4787.method1972(1);
            this.field4787.method1992(8448, 8448);
            this.field4787.method2006(2, 34166, 770);
            this.field4787.method2017(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field4787.method1972(0);
            this.field5421.method38();
        }
    }
}

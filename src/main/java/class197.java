import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class197 extends class457 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Z")
    private boolean field2786 = false;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Lhd;")
    private class19 field2787;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        class61 var2 = this.field6752.method1174();
        if (this.field2787 == null || var2 == null || !arg0) {
            this.field6752.method1176(0, 34168, 770);
            return;
        }
        opengl var3 = this.field6752.field2253;
        this.field2787.method235('\u0000');
        this.field6752.method1150(1);
        this.field6752.method1160(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field6752.field2358.method2636(-30862), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field6752.method1150(0);
        this.field2786 = true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()Z")
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lks;)V")
    public class197(class173 arg0) {
        super(arg0);
        if (arg0.field2321) {
            opengl var2 = this.field6752.field2253;
            this.field2787 = new class19(arg0, 2);
            this.field2787.method233(0);
            this.field6752.method1150(1);
            this.field6752.method1161(34165, 7681);
            this.field6752.method1127(2, 34168, 770);
            this.field6752.method1176(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field6752.method1150(0);
            this.field2787.method234();
            this.field2787.method233(1);
            this.field6752.method1150(1);
            this.field6752.method1161(8448, 8448);
            this.field6752.method1127(2, 34166, 770);
            this.field6752.method1176(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field6752.method1150(0);
            this.field2787.method234();
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        this.field6752.method1161(8448, 7681);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "()V")
    public final void method64() {
        if (this.field2786) {
            this.field2787.method235('\u0001');
            this.field6752.method1150(1);
            this.field6752.method1160((class205) null);
            this.field6752.method1150(0);
        } else {
            this.field6752.method1176(0, 5890, 770);
        }
        this.field6752.method1161(8448, 8448);
        this.field2786 = false;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public final void method60(int arg0) {
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lvo;)V")
    public final void method63(class205 arg0) {
        this.field6752.method1160(arg0);
    }
}

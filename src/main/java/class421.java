import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class421 extends class284 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Z")
    private boolean field6068 = false;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Lwm;")
    private class334 field6067;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public final void method696(boolean arg0) {
        this.field3917.method2140(8448, 7681);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lnj;)V")
    public final void method693(class133 arg0) {
        this.field3917.method2165(arg0);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "()Z")
    public final boolean method694() {
        return true;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V")
    public final void method695(boolean arg0) {
        class416 var2 = this.field3917.method2134();
        if (this.field6067 == null || var2 == null || !arg0) {
            this.field3917.method2135(0, 34168, 770);
            return;
        }
        opengl var3 = this.field3917.field4607;
        this.field6067.method2075('\u0000');
        this.field3917.method2162(1);
        this.field3917.method2165(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field3917.field4636.method896(1), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field3917.method2162(0);
        this.field6068 = true;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lhj;)V")
    public class421(class338 arg0) {
        super(arg0);
        if (arg0.field4635) {
            opengl var2 = this.field3917.field4607;
            this.field6067 = new class334(arg0, 2);
            this.field6067.method2073(0);
            this.field3917.method2162(1);
            this.field3917.method2140(34165, 7681);
            this.field3917.method2161(2, 34168, 770);
            this.field3917.method2135(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field3917.method2162(0);
            this.field6067.method2074();
            this.field6067.method2073(1);
            this.field3917.method2162(1);
            this.field3917.method2140(8448, 8448);
            this.field3917.method2161(2, 34166, 770);
            this.field3917.method2135(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field3917.method2162(0);
            this.field6067.method2074();
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
    public final void method699() {
        if (this.field6068) {
            this.field6067.method2075('\u0001');
            this.field3917.method2162(1);
            this.field3917.method2165((class133) null);
            this.field3917.method2162(0);
        } else {
            this.field3917.method2135(0, 5890, 770);
        }
        this.field3917.method2140(8448, 8448);
        this.field6068 = false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public final void method697(int arg0) {
    }
}

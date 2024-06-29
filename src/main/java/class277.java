import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class277 extends class309 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Z")
    private boolean field3962 = false;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lfa;")
    private class433 field3961;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()V", line = 5)
    public final void method54() {
        if (this.field3962) {
            this.field3961.method2588('\u0001');
            this.field4530.method1365(1);
            this.field4530.method1379((class5) null);
            this.field4530.method1365(0);
        } else {
            this.field4530.method1384(0, 5890, 770);
        }
        this.field4530.method1360(8448, 8448);
        this.field3962 = false;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 19)
    public final void method57(boolean arg0) {
        this.field4530.method1360(8448, 7681);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lic;)V", line = 22)
    public class277(class246 arg0) {
        super(arg0);
        if (arg0.field3455) {
            opengl var2 = this.field4530.field3342;
            this.field3961 = new class433(arg0, 2);
            this.field3961.method2589(0);
            this.field4530.method1365(1);
            this.field4530.method1360(34165, 7681);
            this.field4530.method1458(2, 34168, 770);
            this.field4530.method1384(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field4530.method1365(0);
            this.field3961.method2590();
            this.field3961.method2589(1);
            this.field4530.method1365(1);
            this.field4530.method1360(8448, 8448);
            this.field4530.method1458(2, 34166, 770);
            this.field4530.method1384(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field4530.method1365(0);
            this.field3961.method2590();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvd;)V", line = 61)
    public final void method51(class5 arg0) {
        this.field4530.method1379(arg0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()Z", line = 64)
    public final boolean method56() {
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 68)
    public final void method55(boolean arg0) {
        class359 var2 = this.field4530.method1469();
        if (this.field3961 == null || var2 == null || !arg0) {
            this.field4530.method1384(0, 34168, 770);
            return;
        }
        opengl var3 = this.field4530.field3342;
        this.field3961.method2588('\u0000');
        this.field4530.method1365(1);
        this.field4530.method1379(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field4530.field3415.method2051(true), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field4530.method1365(0);
        this.field3962 = true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 88)
    public final void method53(int arg0) {
    }
}

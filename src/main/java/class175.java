import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class175 extends class139 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
    private boolean field2669 = false;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lcq;")
    private class73 field2668;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()Z")
    public final boolean method60() {
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        class92 var2 = this.field1876.method2436();
        if (this.field2668 == null || var2 == null || !arg0) {
            this.field1876.method2462(0, 34168, 770);
            return;
        }
        opengl var3 = this.field1876.field5783;
        this.field2668.method483('\u0000');
        this.field1876.method2452(1);
        this.field1876.method2460(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field1876.field5896.method602(-3139), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field1876.method2452(0);
        this.field2669 = true;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lcg;)V")
    public class175(class393 arg0) {
        super(arg0);
        if (arg0.field5828) {
            opengl var2 = this.field1876.field5783;
            this.field2668 = new class73(arg0, 2);
            this.field2668.method482(0);
            this.field1876.method2452(1);
            this.field1876.method2428(34165, 7681);
            this.field1876.method2425(2, 34168, 770);
            this.field1876.method2462(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field1876.method2452(0);
            this.field2668.method484();
            this.field2668.method482(1);
            this.field1876.method2452(1);
            this.field1876.method2428(8448, 8448);
            this.field1876.method2425(2, 34166, 770);
            this.field1876.method2462(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field1876.method2452(0);
            this.field2668.method484();
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
    public final void method59(boolean arg0) {
        this.field1876.method2428(8448, 7681);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V")
    public final void method58() {
        if (this.field2669) {
            this.field2668.method483('\u0001');
            this.field1876.method2452(1);
            this.field1876.method2460((class325) null);
            this.field1876.method2452(0);
        } else {
            this.field1876.method2462(0, 5890, 770);
        }
        this.field1876.method2428(8448, 8448);
        this.field2669 = false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lq;)V")
    public final void method56(class325 arg0) {
        this.field1876.method2460(arg0);
    }
}

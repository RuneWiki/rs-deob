import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class427 extends class233 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Z")
    private boolean field6332 = false;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lfd;")
    private class195 field6331;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public final void method827(boolean arg0) {
        this.field3283.method2109(8448, 7681);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public final void method828(int arg0) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
    public final void method826() {
        if (this.field6332) {
            this.field6331.method1225('\u0001');
            this.field3283.method2037(1);
            this.field3283.method2186((class223) null);
            this.field3283.method2037(0);
        } else {
            this.field3283.method2029(0, 5890, 770);
        }
        this.field3283.method2109(8448, 8448);
        this.field6332 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ldg;)V")
    public final void method825(class223 arg0) {
        this.field3283.method2186(arg0);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lih;)V")
    public class427(class330 arg0) {
        super(arg0);
        if (arg0.field4823) {
            opengl var2 = this.field3283.field4741;
            this.field6331 = new class195(arg0, 2);
            this.field6331.method1223(0);
            this.field3283.method2037(1);
            this.field3283.method2109(34165, 7681);
            this.field3283.method2072(2, 34168, 770);
            this.field3283.method2029(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field3283.method2037(0);
            this.field6331.method1224();
            this.field6331.method1223(1);
            this.field3283.method2037(1);
            this.field3283.method2109(8448, 8448);
            this.field3283.method2072(2, 34166, 770);
            this.field3283.method2029(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field3283.method2037(0);
            this.field6331.method1224();
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
    public final boolean method830() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
    public final void method829(boolean arg0) {
        class266 var2 = this.field3283.method2129();
        if (this.field6331 == null || var2 == null || !arg0) {
            this.field3283.method2029(0, 34168, 770);
            return;
        }
        opengl var3 = this.field3283.field4741;
        this.field6331.method1225('\u0000');
        this.field3283.method2037(1);
        this.field3283.method2186(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field3283.field4810.method1916(-111), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field3283.method2037(0);
        this.field6332 = true;
    }
}

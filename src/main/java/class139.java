import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class139 extends class44 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Z")
    private boolean field1729 = false;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Leq;")
    private class115 field1730;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Llp;)V")
    public final void method231(class220 arg0) {
        this.field540.method1003(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public final void method230(boolean arg0) {
        this.field540.method981(8448, 7681);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
    public final void method229() {
        if (this.field1729) {
            this.field1730.method714('\u0001');
            this.field540.method1001(1);
            this.field540.method1003((class220) null);
            this.field540.method1001(0);
        } else {
            this.field540.method989(0, 5890, 770);
        }
        this.field540.method981(8448, 8448);
        this.field1729 = false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method228(int arg0) {
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()Z")
    public final boolean method232() {
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lao;)V")
    public class139(class157 arg0) {
        super(arg0);
        if (arg0.field2008) {
            opengl var2 = this.field540.field1927;
            this.field1730 = new class115(arg0, 2);
            this.field1730.method716(0);
            this.field540.method1001(1);
            this.field540.method981(34165, 7681);
            this.field540.method991(2, 34168, 770);
            this.field540.method989(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field540.method1001(0);
            this.field1730.method715();
            this.field1730.method716(1);
            this.field540.method1001(1);
            this.field540.method981(8448, 8448);
            this.field540.method991(2, 34166, 770);
            this.field540.method989(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field540.method1001(0);
            this.field1730.method715();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public final void method227(boolean arg0) {
        class206 var2 = this.field540.method958();
        if (this.field1730 == null || var2 == null || !arg0) {
            this.field540.method989(0, 34168, 770);
            return;
        }
        opengl var3 = this.field540.field1927;
        this.field1730.method714('\u0000');
        this.field540.method1001(1);
        this.field540.method1003(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field540.field2051.method2236((byte) -81), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field540.method1001(0);
        this.field1729 = true;
    }
}

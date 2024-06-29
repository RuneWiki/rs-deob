import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class420 extends class114 {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Z")
    private boolean field5827 = false;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Lhi;")
    private class355 field5826;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lt;)V")
    public final void method307(class321 arg0) {
        this.field1748.method2180(arg0);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public final void method308(int arg0) {
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
    public final void method304(boolean arg0) {
        this.field1748.method2212(8448, 7681);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "()Z")
    public final boolean method309() {
        return true;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)V")
    public final void method303(boolean arg0) {
        class180 var2 = this.field1748.method2146();
        if (this.field5826 == null || var2 == null || !arg0) {
            this.field1748.method2192(0, 34168, 770);
            return;
        }
        opengl var3 = this.field1748.field4794;
        this.field5826.method2132('\u0000');
        this.field1748.method2196(1);
        this.field1748.method2180(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field1748.field4916.method2673(6), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field1748.method2196(0);
        this.field5827 = true;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lmm;)V")
    public class420(class357 arg0) {
        super(arg0);
        if (arg0.field4870) {
            opengl var2 = this.field1748.field4794;
            this.field5826 = new class355(arg0, 2);
            this.field5826.method2130(0);
            this.field1748.method2196(1);
            this.field1748.method2212(34165, 7681);
            this.field1748.method2187(2, 34168, 770);
            this.field1748.method2192(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field1748.method2196(0);
            this.field5826.method2131();
            this.field5826.method2130(1);
            this.field1748.method2196(1);
            this.field1748.method2212(8448, 8448);
            this.field1748.method2187(2, 34166, 770);
            this.field1748.method2192(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field1748.method2196(0);
            this.field5826.method2131();
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "()V")
    public final void method306() {
        if (this.field5827) {
            this.field5826.method2132('\u0001');
            this.field1748.method2196(1);
            this.field1748.method2180((class321) null);
            this.field1748.method2196(0);
        } else {
            this.field1748.method2192(0, 5890, 770);
        }
        this.field1748.method2212(8448, 8448);
        this.field5827 = false;
    }
}

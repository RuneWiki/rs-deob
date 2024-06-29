import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class142 extends class404 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Z")
    private boolean field1675 = false;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Ltp;")
    private class124 field1676;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public final void method351(int arg0) {
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public final void method348(boolean arg0) {
        class254 var2 = this.field5606.method2112();
        if (this.field1676 == null || var2 == null || !arg0) {
            this.field5606.method2066(0, 34168, 770);
            return;
        }
        opengl var3 = this.field5606.field4363;
        this.field1676.method809('\u0000');
        this.field5606.method2115(1);
        this.field5606.method2088(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field5606.field4461.method935(-10795), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field5606.method2115(0);
        this.field1675 = true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public final void method349(boolean arg0) {
        this.field5606.method2056(8448, 7681);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()Z")
    public final boolean method350() {
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lh;)V")
    public class142(class327 arg0) {
        super(arg0);
        if (arg0.field4424) {
            opengl var2 = this.field5606.field4363;
            this.field1676 = new class124(arg0, 2);
            this.field1676.method808(0);
            this.field5606.method2115(1);
            this.field5606.method2056(34165, 7681);
            this.field5606.method2077(2, 34168, 770);
            this.field5606.method2066(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field5606.method2115(0);
            this.field1676.method807();
            this.field1676.method808(1);
            this.field5606.method2115(1);
            this.field5606.method2056(8448, 8448);
            this.field5606.method2077(2, 34166, 770);
            this.field5606.method2066(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field5606.method2115(0);
            this.field1676.method807();
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
    public final void method352() {
        if (this.field1675) {
            this.field1676.method809('\u0001');
            this.field5606.method2115(1);
            this.field5606.method2088((class233) null);
            this.field5606.method2115(0);
        } else {
            this.field5606.method2066(0, 5890, 770);
        }
        this.field5606.method2056(8448, 8448);
        this.field1675 = false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lsd;)V")
    public final void method353(class233 arg0) {
        this.field5606.method2088(arg0);
    }
}

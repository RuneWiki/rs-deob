import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class273 extends class48 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Z")
    private boolean field4389 = false;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lkm;")
    private class197 field4390;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V", line = 3)
    public final void method307(boolean arg0) {
        this.field591.method680(8448, 7681);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()Z", line = 7)
    public final boolean method304() {
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lod;)V", line = 11)
    public final void method308(class293 arg0) {
        this.field591.method688(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()V", line = 16)
    public final void method305() {
        if (this.field4389) {
            this.field4390.method1380('\u0001');
            this.field591.method628(1);
            this.field591.method688((class293) null);
            this.field591.method628(0);
        } else {
            this.field591.method658(0, 5890, 770);
        }
        this.field591.method680(8448, 8448);
        this.field4389 = false;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lsq;)V", line = 33)
    public class273(class96 arg0) {
        super(arg0);
        if (arg0.field1285) {
            opengl var2 = this.field591.field1156;
            this.field4390 = new class197(arg0, 2);
            this.field4390.method1382(0);
            this.field591.method628(1);
            this.field591.method680(34165, 7681);
            this.field591.method712(2, 34168, 770);
            this.field591.method658(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field591.method628(0);
            this.field4390.method1381();
            this.field4390.method1382(1);
            this.field591.method628(1);
            this.field591.method680(8448, 8448);
            this.field591.method712(2, 34166, 770);
            this.field591.method658(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field591.method628(0);
            this.field4390.method1381();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 70)
    public final void method303(boolean arg0) {
        class352 var2 = this.field591.method678();
        if (this.field4390 == null || var2 == null || !arg0) {
            this.field591.method658(0, 34168, 770);
            return;
        }
        opengl var3 = this.field591.field1156;
        this.field4390.method1380('\u0000');
        this.field591.method628(1);
        this.field591.method688(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field591.field1245.method2172(0), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field591.method628(0);
        this.field4389 = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 90)
    public final void method306(int arg0) {
    }
}

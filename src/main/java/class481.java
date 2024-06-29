import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class481 extends class150 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Z")
    private boolean field6798 = false;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Lt;")
    private class391 field6799;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Let;)V")
    public final void method6(class179 arg0) {
        this.field2107.method2692(arg0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()Z")
    public final boolean method7() {
        return true;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()V")
    public final void method2() {
        if (this.field6798) {
            this.field6799.method2339('\u0001');
            this.field2107.method2660(1);
            this.field2107.method2692((class179) null);
            this.field2107.method2660(0);
        } else {
            this.field2107.method2709(0, 5890, 770);
        }
        this.field2107.method2702(8448, 8448);
        this.field6798 = false;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public final void method1(int arg0) {
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
    public final void method3(boolean arg0) {
        this.field2107.method2702(8448, 7681);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V")
    public final void method5(boolean arg0) {
        class452 var2 = this.field2107.method2674();
        if (this.field6799 == null || var2 == null || !arg0) {
            this.field2107.method2709(0, 34168, 770);
            return;
        }
        opengl var3 = this.field2107.field6330;
        this.field6799.method2339('\u0000');
        this.field2107.method2660(1);
        this.field2107.method2692(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field2107.field6365.method1381((byte) 90), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field2107.method2660(0);
        this.field6798 = true;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lqi;)V")
    public class481(class458 arg0) {
        super(arg0);
        if (arg0.field6434) {
            opengl var2 = this.field2107.field6330;
            this.field6799 = new class391(arg0, 2);
            this.field6799.method2338(0);
            this.field2107.method2660(1);
            this.field2107.method2702(34165, 7681);
            this.field2107.method2670(2, 34168, 770);
            this.field2107.method2709(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field2107.method2660(0);
            this.field6799.method2340();
            this.field6799.method2338(1);
            this.field2107.method2660(1);
            this.field2107.method2702(8448, 8448);
            this.field2107.method2670(2, 34166, 770);
            this.field2107.method2709(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field2107.method2660(0);
            this.field6799.method2340();
        }
    }
}

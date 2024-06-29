import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class376 extends class157 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Z")
    private boolean field5292 = false;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lq;")
    private class205 field5291;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lvd;)V")
    public final void method557(class4 arg0) {
        this.field2366.method207(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V")
    public final void method552() {
        if (this.field5292) {
            this.field5291.method1427('\u0001');
            this.field2366.method176(1);
            this.field2366.method207((class4) null);
            this.field2366.method176(0);
        } else {
            this.field2366.method223(0, 5890, 770);
        }
        this.field2366.method145(8448, 8448);
        this.field5292 = false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public final void method556(boolean arg0) {
        this.field2366.method145(8448, 7681);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
        class181 var2 = this.field2366.method96();
        if (this.field5291 == null || var2 == null || !arg0) {
            this.field2366.method223(0, 34168, 770);
            return;
        }
        opengl var3 = this.field2366.field198;
        this.field5291.method1427('\u0000');
        this.field2366.method176(1);
        this.field2366.method207(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field2366.field256.method307(2), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field2366.method176(0);
        this.field5292 = true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()Z")
    public final boolean method555() {
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method553(int arg0) {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lhd;)V")
    public class376(class17 arg0) {
        super(arg0);
        if (arg0.field297) {
            opengl var2 = this.field2366.field198;
            this.field5291 = new class205(arg0, 2);
            this.field5291.method1426(0);
            this.field2366.method176(1);
            this.field2366.method145(34165, 7681);
            this.field2366.method93(2, 34168, 770);
            this.field2366.method223(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field2366.method176(0);
            this.field5291.method1425();
            this.field5291.method1426(1);
            this.field2366.method176(1);
            this.field2366.method145(8448, 8448);
            this.field2366.method93(2, 34166, 770);
            this.field2366.method223(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field2366.method176(0);
            this.field5291.method1425();
        }
    }
}

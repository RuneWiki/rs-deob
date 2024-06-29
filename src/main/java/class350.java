import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class350 extends class42 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
    private boolean field5086 = false;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Loc;")
    private class112 field5085;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public final void method290(int arg0) {
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()Z")
    public final boolean method287() {
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lee;)V")
    public final void method286(class404 arg0) {
        this.field582.method888(arg0);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
    public final void method291() {
        if (this.field5086) {
            this.field5085.method677('\u0001');
            this.field582.method1002(1);
            this.field582.method888((class404) null);
            this.field582.method1002(0);
        } else {
            this.field582.method958(0, 5890, 770);
        }
        this.field582.method926(8448, 8448);
        this.field5086 = false;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
        class234 var2 = this.field582.method875();
        if (this.field5085 == null || var2 == null || !arg0) {
            this.field582.method958(0, 34168, 770);
            return;
        }
        opengl var3 = this.field582.field1918;
        this.field5085.method677('\u0000');
        this.field582.method1002(1);
        this.field582.method888(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field582.field1964.method1779((byte) 115), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field582.method1002(0);
        this.field5086 = true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public final void method288(boolean arg0) {
        this.field582.method926(8448, 7681);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lig;)V")
    public class350(class132 arg0) {
        super(arg0);
        if (arg0.field1968) {
            opengl var2 = this.field582.field1918;
            this.field5085 = new class112(arg0, 2);
            this.field5085.method678(0);
            this.field582.method1002(1);
            this.field582.method926(34165, 7681);
            this.field582.method949(2, 34168, 770);
            this.field582.method958(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field582.method1002(0);
            this.field5085.method679();
            this.field5085.method678(1);
            this.field582.method1002(1);
            this.field582.method926(8448, 8448);
            this.field582.method949(2, 34166, 770);
            this.field582.method958(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field582.method1002(0);
            this.field5085.method679();
        }
    }
}

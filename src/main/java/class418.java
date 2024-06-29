import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class418 extends class189 {

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
    private boolean field5680 = false;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lrj;")
    private class388 field5679;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)V", line = 4)
    public final void method486(boolean arg0) {
        class286 var2 = this.field2580.method2077();
        if (this.field5679 == null || var2 == null || !arg0) {
            this.field2580.method2068(0, 34168, 770);
            return;
        }
        opengl var3 = this.field2580.field4604;
        this.field5679.method2381('\u0000');
        this.field2580.method2067(1);
        this.field2580.method2106(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field2580.field4645.method1026(13), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field2580.method2067(0);
        this.field5680 = true;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lkq;)V", line = 24)
    public final void method492(class386 arg0) {
        this.field2580.method2106(arg0);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 27)
    public final void method490(int arg0) {
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "()V", line = 29)
    public final void method491() {
        if (this.field5680) {
            this.field5679.method2381('\u0001');
            this.field2580.method2067(1);
            this.field2580.method2106((class386) null);
            this.field2580.method2067(0);
        } else {
            this.field2580.method2068(0, 5890, 770);
        }
        this.field2580.method1994(8448, 8448);
        this.field5680 = false;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lbf;)V", line = 44)
    public class418(class344 arg0) {
        super(arg0);
        if (arg0.field4663) {
            opengl var2 = this.field2580.field4604;
            this.field5679 = new class388(arg0, 2);
            this.field5679.method2383(0);
            this.field2580.method2067(1);
            this.field2580.method1994(34165, 7681);
            this.field2580.method1990(2, 34168, 770);
            this.field2580.method2068(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field2580.method2067(0);
            this.field5679.method2382();
            this.field5679.method2383(1);
            this.field2580.method2067(1);
            this.field2580.method1994(8448, 8448);
            this.field2580.method1990(2, 34166, 770);
            this.field2580.method2068(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field2580.method2067(0);
            this.field5679.method2382();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 82)
    public final void method488(boolean arg0) {
        this.field2580.method1994(8448, 7681);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "()Z", line = 86)
    public final boolean method487() {
        return true;
    }
}

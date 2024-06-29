import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class192 extends class30 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Z")
    private boolean field2932 = false;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lp;")
    private class173 field2933;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public final void method261() {
        if (this.field2932) {
            this.field2933.method1192('\u0001');
            this.field405.method1634(1);
            this.field405.method1653((class26) null);
            this.field405.method1634(0);
        } else {
            this.field405.method1662(0, 5890, 770);
        }
        this.field405.method1679(8448, 8448);
        this.field2932 = false;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()Z")
    public final boolean method262() {
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public final void method263(boolean arg0) {
        this.field405.method1679(8448, 7681);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lnm;)V")
    public class192(class254 arg0) {
        super(arg0);
        if (arg0.field3718) {
            opengl var2 = this.field405.field3648;
            this.field2933 = new class173(arg0, 2);
            this.field2933.method1191(0);
            this.field405.method1634(1);
            this.field405.method1679(34165, 7681);
            this.field405.method1621(2, 34168, 770);
            this.field405.method1662(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field405.method1634(0);
            this.field2933.method1193();
            this.field2933.method1191(1);
            this.field405.method1634(1);
            this.field405.method1679(8448, 8448);
            this.field405.method1621(2, 34166, 770);
            this.field405.method1662(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field405.method1634(0);
            this.field2933.method1193();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lap;)V")
    public final void method266(class26 arg0) {
        this.field405.method1653(arg0);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public final void method265(boolean arg0) {
        class60 var2 = this.field405.method1671();
        if (this.field2933 == null || var2 == null || !arg0) {
            this.field405.method1662(0, 34168, 770);
            return;
        }
        opengl var3 = this.field405.field3648;
        this.field2933.method1192('\u0000');
        this.field405.method1634(1);
        this.field405.method1653(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field405.field3700.method657(98), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field405.method1634(0);
        this.field2932 = true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public final void method264(int arg0) {
    }
}

import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class317 extends class399 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
    private boolean field4496 = false;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lel;")
    private class325 field4497;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public final void method377(int arg0) {
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()Z")
    public final boolean method375() {
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lpo;)V")
    public class317(class332 arg0) {
        super(arg0);
        if (arg0.field4797) {
            opengl var2 = this.field5798.field4752;
            this.field4497 = new class325(arg0, 2);
            this.field4497.method2005(0);
            this.field5798.method2062(1);
            this.field5798.method2100(34165, 7681);
            this.field5798.method2086(2, 34168, 770);
            this.field5798.method2087(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field5798.method2062(0);
            this.field4497.method2004();
            this.field4497.method2005(1);
            this.field5798.method2062(1);
            this.field5798.method2100(8448, 8448);
            this.field5798.method2086(2, 34166, 770);
            this.field5798.method2087(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field5798.method2062(0);
            this.field4497.method2004();
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public final void method374(boolean arg0) {
        class205 var2 = this.field5798.method2115();
        if (this.field4497 == null || var2 == null || !arg0) {
            this.field5798.method2087(0, 34168, 770);
            return;
        }
        opengl var3 = this.field5798.field4752;
        this.field4497.method2003('\u0000');
        this.field5798.method2062(1);
        this.field5798.method2085(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field5798.field4865.method119((byte) -98), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field5798.method2062(0);
        this.field4496 = true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
    public final void method379() {
        if (this.field4496) {
            this.field4497.method2003('\u0001');
            this.field5798.method2062(1);
            this.field5798.method2085((class439) null);
            this.field5798.method2062(0);
        } else {
            this.field5798.method2087(0, 5890, 770);
        }
        this.field5798.method2100(8448, 8448);
        this.field4496 = false;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public final void method378(boolean arg0) {
        this.field5798.method2100(8448, 7681);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lfl;)V")
    public final void method376(class439 arg0) {
        this.field5798.method2085(arg0);
    }
}

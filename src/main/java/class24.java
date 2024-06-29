import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class24 extends class436 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
    private boolean field321 = false;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lpa;")
    private class341 field320;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
    public final void method157() {
        if (this.field321) {
            this.field320.method2225('\u0001');
            this.field6402.method1777(1);
            this.field6402.method1669((class360) null);
            this.field6402.method1777(0);
        } else {
            this.field6402.method1763(0, 5890, 770);
        }
        this.field6402.method1627(8448, 8448);
        this.field321 = false;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lnf;)V")
    public class24(class256 arg0) {
        super(arg0);
        if (arg0.field3660) {
            opengl var2 = this.field6402.field3634;
            this.field320 = new class341(arg0, 2);
            this.field320.method2224(0);
            this.field6402.method1777(1);
            this.field6402.method1627(34165, 7681);
            this.field6402.method1634(2, 34168, 770);
            this.field6402.method1763(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field6402.method1777(0);
            this.field320.method2223();
            this.field320.method2224(1);
            this.field6402.method1777(1);
            this.field6402.method1627(8448, 8448);
            this.field6402.method1634(2, 34166, 770);
            this.field6402.method1763(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field6402.method1777(0);
            this.field320.method2223();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        class322 var2 = this.field6402.method1664();
        if (this.field320 == null || var2 == null || !arg0) {
            this.field6402.method1763(0, 34168, 770);
            return;
        }
        opengl var3 = this.field6402.field3634;
        this.field320.method2225('\u0000');
        this.field6402.method1777(1);
        this.field6402.method1669(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field6402.field3674.method1791(1), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field6402.method1777(0);
        this.field321 = true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()Z")
    public final boolean method159() {
        return true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lme;)V")
    public final void method160(class360 arg0) {
        this.field6402.method1669(arg0);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        this.field6402.method1627(8448, 7681);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public final void method162(int arg0) {
    }
}

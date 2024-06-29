import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class121 extends class338 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Z")
    private boolean field1658 = false;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Ljb;")
    private class461 field1659;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public final void method189(int arg0) {
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ltp;)V")
    public final void method188(class375 arg0) {
        this.field4685.method303(arg0);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()Z")
    public final boolean method191() {
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public final void method190(boolean arg0) {
        this.field4685.method353(8448, 7681);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public final void method192() {
        if (this.field1658) {
            this.field1659.method2761('\u0001');
            this.field4685.method407(1);
            this.field4685.method303((class375) null);
            this.field4685.method407(0);
        } else {
            this.field4685.method289(0, 5890, 770);
        }
        this.field4685.method353(8448, 8448);
        this.field1658 = false;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
    public final void method187(boolean arg0) {
        class240 var2 = this.field4685.method359();
        if (this.field1659 == null || var2 == null || !arg0) {
            this.field4685.method289(0, 34168, 770);
            return;
        }
        opengl var3 = this.field4685.field557;
        this.field1659.method2761('\u0000');
        this.field4685.method407(1);
        this.field4685.method303(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field4685.field667.method99(true), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field4685.method407(0);
        this.field1658 = true;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lfu;)V")
    public class121(class42 arg0) {
        super(arg0);
        if (arg0.field682) {
            opengl var2 = this.field4685.field557;
            this.field1659 = new class461(arg0, 2);
            this.field1659.method2760(0);
            this.field4685.method407(1);
            this.field4685.method353(34165, 7681);
            this.field4685.method335(2, 34168, 770);
            this.field4685.method289(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field4685.method407(0);
            this.field1659.method2762();
            this.field1659.method2760(1);
            this.field4685.method407(1);
            this.field4685.method353(8448, 8448);
            this.field4685.method335(2, 34166, 770);
            this.field4685.method289(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field4685.method407(0);
            this.field1659.method2762();
        }
    }
}

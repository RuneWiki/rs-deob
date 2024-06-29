import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class299 extends class300 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    private boolean field4407 = false;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lfr;")
    private class101 field4408;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V", line = 4)
    public final void method7(boolean arg0) {
        this.field4409.method870(8448, 7681);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 8)
    public final void method8(int arg0) {
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V", line = 10)
    public final void method5() {
        if (this.field4407) {
            this.field4408.method836('\u0001');
            this.field4409.method857(1);
            this.field4409.method929((class195) null);
            this.field4409.method857(0);
        } else {
            this.field4409.method889(0, 5890, 770);
        }
        this.field4409.method870(8448, 8448);
        this.field4407 = false;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lge;)V", line = 52)
    public class299(class104 arg0) {
        super(arg0);
        if (arg0.field1664) {
            opengl var2 = this.field4409.field1604;
            this.field4408 = new class101(arg0, 2);
            this.field4408.method835(0);
            this.field4409.method857(1);
            this.field4409.method870(34165, 7681);
            this.field4409.method891(2, 34168, 770);
            this.field4409.method889(0, 34167, 770);
            var2.glTexGeni(8192, 9472, 34066);
            var2.glTexGeni(8193, 9472, 34066);
            var2.glTexGeni(8194, 9472, 34066);
            var2.glEnable(3168);
            var2.glEnable(3169);
            var2.glEnable(3170);
            this.field4409.method857(0);
            this.field4408.method834();
            this.field4408.method835(1);
            this.field4409.method857(1);
            this.field4409.method870(8448, 8448);
            this.field4409.method891(2, 34166, 770);
            this.field4409.method889(0, 5890, 770);
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glDisable(3170);
            var2.glMatrixMode(5890);
            var2.glLoadIdentity();
            var2.glMatrixMode(5888);
            this.field4409.method857(0);
            this.field4408.method834();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 29)
    public final void method6(boolean arg0) {
        class414 var2 = this.field4409.method856();
        if (this.field4408 == null || var2 == null || !arg0) {
            this.field4409.method889(0, 34168, 770);
            return;
        }
        opengl var3 = this.field4409.field1604;
        this.field4408.method836('\u0000');
        this.field4409.method857(1);
        this.field4409.method929(var2);
        var3.glMatrixMode(5890);
        var3.glLoadMatrixf(this.field4409.field1688.method2441((byte) -66), 0);
        var3.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var3.glMatrixMode(5888);
        this.field4409.method857(0);
        this.field4407 = true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()Z", line = 49)
    public final boolean method4() {
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lmo;)V", line = 88)
    public final void method9(class195 arg0) {
        this.field4409.method929(arg0);
    }
}

import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class391 extends class416 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lmi;")
    private class315 field5561;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lnq;")
    private class294 field5559;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
    private static int[] field5560 = new int[4];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
    public final int method2343(byte arg0) {
        if (arg0 != 72) {
            this.field5559 = (class294) null;
        }
        return this.field5559.field4258;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Lnq;")
    public final class294 method24(int arg0) {
        return arg0 == 2040 ? this.field5559 : (class294) null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(FLnq;Lnq;I)V")
    public final void method2344(float arg0, class294 arg1, class294 arg2, int arg3) {
        opengl var5 = this.field5561.field4445;
        class288 var6 = this.field5561.field4561;
        if (this.field5561.field4519.field146 != arg2.field4258 || this.field5561.field4519.field145 != arg2.field4258) {
            this.field5561.field4519 = new class13(this.field5561, 3553, 6408, arg2.field4258, arg2.field4258);
        }
        if (this.field5561.field4500.field146 != arg1.field4258 || this.field5561.field4500.field145 != arg1.field4258) {
            this.field5561.field4500 = new class13(this.field5561, 3553, 6408, arg1.field4258, arg1.field4258);
        }
        this.field5561.method690(field5560);
        this.field5561.method691();
        this.field5561.method1969(var6);
        this.field5561.method1979();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field5559.field4258, this.field5559.field4258);
        this.field5561.method1994(false);
        this.field5561.method1950(false);
        this.field5561.method1955(false);
        this.field5561.method1966(false);
        this.field5561.method2002(-2);
        this.field5561.method1972(1);
        this.field5561.method1960(0.0F, 0.0F, 0.0F, arg0);
        this.field5561.method1992(34165, 34165);
        this.field5561.method1972(arg3);
        this.field5561.method1962(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1802(0, arg2, var8);
            this.field5561.field4519.method94(0, 0, arg2.field4258, arg2.field4258, 0, 0);
            var6.method1802(0, arg1, var8);
            this.field5561.field4500.method94(0, 0, arg1.field4258, arg1.field4258, 0, 0);
            var6.method1802(0, this.field5559, var8);
            this.field5561.method1972(1);
            this.field5561.method1967(this.field5561.field4500);
            this.field5561.method1972(0);
            this.field5561.method1967(this.field5561.field4519);
            var5.glBegin(7);
            var5.glTexCoord2f(0.0F, 0.0F);
            var5.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var5.glVertex2f(0.0F, 0.0F);
            var5.glTexCoord2f(1.0F, 0.0F);
            var5.glMultiTexCoord2f(33985, 1.0F, 0.0F);
            var5.glVertex2f(1.0F, 0.0F);
            var5.glTexCoord2f(1.0F, 1.0F);
            var5.glMultiTexCoord2f(33985, 1.0F, 1.0F);
            var5.glVertex2f(1.0F, 1.0F);
            var5.glTexCoord2f(0.0F, 1.0F);
            var5.glMultiTexCoord2f(33985, 0.0F, 1.0F);
            var5.glVertex2f(0.0F, 1.0F);
            var5.glEnd();
            this.field5561.method1972(1);
            this.field5561.method1967((class425) null);
            this.field5561.method1972(0);
            this.field5561.method1967((class425) null);
        }
        this.field5561.method1972(1);
        this.field5561.method1992(8448, 8448);
        this.field5561.method1972(0);
        var6.method1805(0);
        var5.glPopAttrib();
        this.field5561.method2009(var6);
        this.field5561.method617(field5560[0], field5560[1], field5560[2], field5560[3]);
        this.field5559.method2496();
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lmi;I)V")
    public class391(class315 arg0, int arg1) {
        this.field5561 = arg0;
        this.field5559 = new class294(arg0, 6408, arg1);
    }
}

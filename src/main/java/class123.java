import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class123 extends class383 {

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lsq;")
    private class96 field1817;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lrj;")
    private class352 field1818;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[I")
    private static int[] field1816 = new int[4];

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)I")
    public final int method899(byte arg0) {
        if (arg0 <= 81) {
            this.method900(-62);
        }
        return this.field1818.field5430;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lsq;I)V")
    public class123(class96 arg0, int arg1) {
        this.field1817 = arg0;
        this.field1818 = new class352(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Lrj;")
    public final class352 method900(int arg0) {
        return arg0 == 16057 ? this.field1818 : (class352) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lrj;Lrj;FI)V")
    public final void method901(class352 arg0, class352 arg1, float arg2, int arg3) {
        opengl var5 = this.field1817.field1156;
        class437 var6 = this.field1817.field1223;
        if (this.field1817.field1242.field5455 != arg1.field5430 || this.field1817.field1242.field5456 != arg1.field5430) {
            this.field1817.field1242 = new class355(this.field1817, 3553, 6408, arg1.field5430, arg1.field5430);
        }
        if (this.field1817.field1233.field5455 != arg0.field5430 || this.field1817.field1233.field5456 != arg0.field5430) {
            this.field1817.field1233 = new class355(this.field1817, 3553, 6408, arg0.field5430, arg0.field5430);
        }
        this.field1817.method654(field1816);
        this.field1817.method609();
        this.field1817.method679(var6);
        this.field1817.method716();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, (double) arg3, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field1818.field5430, this.field1818.field5430);
        this.field1817.method722(false);
        this.field1817.method667(false);
        this.field1817.method656(false);
        this.field1817.method592(false);
        this.field1817.method633(-2);
        this.field1817.method628(1);
        this.field1817.method593(0.0F, 0.0F, 0.0F, arg2);
        this.field1817.method680(34165, 34165);
        this.field1817.method628(0);
        this.field1817.method691(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2690(0, arg1, var8);
            this.field1817.field1242.method2308(0, 0, arg1.field5430, arg1.field5430, 0, 0);
            var6.method2690(0, arg0, var8);
            this.field1817.field1233.method2308(0, 0, arg0.field5430, arg0.field5430, 0, 0);
            var6.method2690(0, this.field1818, var8);
            this.field1817.method628(1);
            this.field1817.method688(this.field1817.field1233);
            this.field1817.method628(0);
            this.field1817.method688(this.field1817.field1242);
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
            this.field1817.method628(1);
            this.field1817.method688((class293) null);
            this.field1817.method628(0);
            this.field1817.method688((class293) null);
        }
        this.field1817.method628(1);
        this.field1817.method680(8448, 8448);
        this.field1817.method628(0);
        var6.method2691(0);
        var5.glPopAttrib();
        this.field1817.method698(var6);
        this.field1817.method671(field1816[0], field1816[1], field1816[2], field1816[3]);
        this.field1818.method1978();
    }
}

import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class364 extends class274 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lnm;")
    private class254 field5513;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lcd;")
    private class60 field5514;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
    private static int[] field5512 = new int[4];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I", line = 9)
    public final int method2236(int arg0) {
        if (arg0 != 0) {
            this.method2237(-104, (class60) null, (class60) null, -1.1529293F);
        }
        return this.field5514.field832;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Lcd;", line = 21)
    public final class60 method399(byte arg0) {
        int var2 = 90 % ((17 - arg0) / 42);
        return this.field5514;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILcd;Lcd;F)V", line = 30)
    public final void method2237(int arg0, class60 arg1, class60 arg2, float arg3) {
        opengl var5 = this.field5513.field3648;
        if (arg0 <= 31) {
            return;
        }
        class202 var6 = this.field5513.field3720;
        if (this.field5513.field3683.field566 != arg1.field832 || this.field5513.field3683.field567 != arg1.field832) {
            this.field5513.field3683 = new class41(this.field5513, 3553, 6408, arg1.field832, arg1.field832);
        }
        if (this.field5513.field3758.field566 != arg2.field832 || this.field5513.field3758.field567 != arg2.field832) {
            this.field5513.field3758 = new class41(this.field5513, 3553, 6408, arg2.field832, arg2.field832);
        }
        this.field5513.method540(field5512);
        this.field5513.method493();
        this.field5513.method1612(var6);
        this.field5513.method1682();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field5514.field832, this.field5514.field832);
        this.field5513.method1652(false);
        this.field5513.method1631(false);
        this.field5513.method1613(false);
        this.field5513.method1656(false);
        this.field5513.method1680(-2);
        this.field5513.method1634(1);
        this.field5513.method1616(0.0F, 0.0F, 0.0F, arg3);
        this.field5513.method1679(34165, 34165);
        this.field5513.method1634(0);
        this.field5513.method1636(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1376(0, arg1, var8);
            this.field5513.field3683.method308(0, 0, arg1.field832, arg1.field832, 0, 0);
            var6.method1376(0, arg2, var8);
            this.field5513.field3758.method308(0, 0, arg2.field832, arg2.field832, 0, 0);
            var6.method1376(0, this.field5514, var8);
            this.field5513.method1634(1);
            this.field5513.method1653(this.field5513.field3758);
            this.field5513.method1634(0);
            this.field5513.method1653(this.field5513.field3683);
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
            this.field5513.method1634(1);
            this.field5513.method1653((class26) null);
            this.field5513.method1634(0);
            this.field5513.method1653((class26) null);
        }
        this.field5513.method1634(1);
        this.field5513.method1679(8448, 8448);
        this.field5513.method1634(0);
        var6.method1380(0);
        var5.glPopAttrib();
        this.field5513.method1659(var6);
        this.field5513.method500(field5512[0], field5512[1], field5512[2], field5512[3]);
        this.field5514.method227();
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lnm;I)V", line = 114)
    public class364(class254 arg0, int arg1) {
        this.field5513 = arg0;
        this.field5514 = new class60(arg0, 6408, arg1);
    }
}

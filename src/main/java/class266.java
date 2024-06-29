import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class266 extends class153 {

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Ltb;")
    private class227 field3693;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Lds;")
    private class10 field3692;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "[I")
    private static int[] field3691 = new int[4];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I", line = 7)
    public final int method1730(int arg0) {
        if (arg0 != -22085) {
            field3691 = (int[]) null;
        }
        return this.field3692.field177;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(FILds;Lds;)V", line = 21)
    public final void method1731(float arg0, int arg1, class10 arg2, class10 arg3) {
        opengl var5 = this.field3693.field3184;
        class93 var6 = this.field3693.field3232;
        if (this.field3693.field3262.field4668 != arg2.field177 || this.field3693.field3262.field4667 != arg2.field177) {
            this.field3693.field3262 = new class342(this.field3693, 3553, 6408, arg2.field177, arg2.field177);
        }
        if (this.field3693.field3255.field4668 != arg3.field177 || this.field3693.field3255.field4667 != arg3.field177) {
            this.field3693.field3255 = new class342(this.field3693, 3553, 6408, arg3.field177, arg3.field177);
        }
        this.field3693.method107(field3691);
        this.field3693.method143();
        this.field3693.method1514(var6);
        this.field3693.method1505();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, (double) arg1, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field3692.field177, this.field3692.field177);
        this.field3693.method1520(false);
        this.field3693.method1544(false);
        this.field3693.method1564(false);
        this.field3693.method1519(false);
        this.field3693.method1516(-2);
        this.field3693.method1566(1);
        this.field3693.method1561(0.0F, 0.0F, 0.0F, arg0);
        this.field3693.method1542(34165, 34165);
        this.field3693.method1566(0);
        this.field3693.method1569(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method664(0, arg2, var8);
            this.field3693.field3262.method2170(0, 0, arg2.field177, arg2.field177, 0, 0);
            var6.method664(0, arg3, var8);
            this.field3693.field3255.method2170(0, 0, arg3.field177, arg3.field177, 0, 0);
            var6.method664(0, this.field3692, var8);
            this.field3693.method1566(1);
            this.field3693.method1559(this.field3693.field3255);
            this.field3693.method1566(0);
            this.field3693.method1559(this.field3693.field3262);
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
            this.field3693.method1566(1);
            this.field3693.method1559((class127) null);
            this.field3693.method1566(0);
            this.field3693.method1559((class127) null);
        }
        this.field3693.method1566(1);
        this.field3693.method1542(8448, 8448);
        this.field3693.method1566(0);
        var6.method665(0);
        var5.glPopAttrib();
        this.field3693.method1557(var6);
        this.field3693.method136(field3691[0], field3691[1], field3691[2], field3691[3]);
        this.field3692.method864();
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Lds;", line = 104)
    public final class10 method1031(byte arg0) {
        if (arg0 < 126) {
            field3691 = (int[]) null;
        }
        return this.field3692;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ltb;I)V", line = 112)
    public class266(class227 arg0, int arg1) {
        this.field3693 = arg0;
        this.field3692 = new class10(arg0, 6408, arg1);
    }
}

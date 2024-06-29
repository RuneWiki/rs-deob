import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class43 {

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lbf;")
    private class344 field64;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lqd;")
    private class286 field62;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    private static int[] field63 = new int[4];

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I", line = 4)
    public final int method35(int arg0) {
        return arg0 == 1 ? this.field62.field3873 : -76;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lqd;", line = 14)
    public final class286 method36(int arg0) {
        if (arg0 != 25067) {
            this.method37(-0.5517803F, (class286) null, (byte) 46, (class286) null);
        }
        return this.field62;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(FLqd;BLqd;)V", line = 26)
    public final void method37(float arg0, class286 arg1, byte arg2, class286 arg3) {
        opengl var5 = this.field64.field4604;
        class435 var6 = this.field64.field4654;
        if (this.field64.field4717.field782 != arg3.field3873 || this.field64.field4717.field783 != arg3.field3873) {
            this.field64.field4717 = new class58(this.field64, 3553, 6408, arg3.field3873, arg3.field3873);
        }
        if (this.field64.field4729.field782 != arg1.field3873 || this.field64.field4729.field783 != arg1.field3873) {
            this.field64.field4729 = new class58(this.field64, 3553, 6408, arg1.field3873, arg1.field3873);
        }
        this.field64.method2074(field63);
        this.field64.method2006();
        this.field64.method2028(var6);
        this.field64.method2025();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field62.field3873, this.field62.field3873);
        this.field64.method1971(false);
        this.field64.method1961(false);
        this.field64.method2035(false);
        this.field64.method2040(false);
        this.field64.method1963(-2);
        this.field64.method2067(1);
        this.field64.method2021(0.0F, 0.0F, 0.0F, arg0);
        this.field64.method1994(34165, 34165);
        this.field64.method2067(0);
        this.field64.method1984(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2568(0, arg3, var8);
            this.field64.field4717.method413(0, 0, arg3.field3873, arg3.field3873, 0, 0);
            var6.method2568(0, arg1, var8);
            this.field64.field4729.method413(0, 0, arg1.field3873, arg1.field3873, 0, 0);
            var6.method2568(0, this.field62, var8);
            this.field64.method2067(1);
            this.field64.method2106(this.field64.field4729);
            this.field64.method2067(0);
            this.field64.method2106(this.field64.field4717);
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
            this.field64.method2067(1);
            this.field64.method2106((class386) null);
            this.field64.method2067(0);
            this.field64.method2106((class386) null);
        }
        this.field64.method2067(1);
        this.field64.method1994(8448, 8448);
        if (arg2 < 42) {
            this.method36(-38);
        }
        this.field64.method2067(0);
        var6.method2565(0);
        var5.glPopAttrib();
        this.field64.method2063(var6);
        this.field64.method1981(field63[0], field63[1], field63[2], field63[3]);
        this.field62.method2369();
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lbf;I)V", line = 114)
    public class5(class344 arg0, int arg1) {
        this.field64 = arg0;
        this.field62 = new class286(arg0, 6408, arg1);
    }
}

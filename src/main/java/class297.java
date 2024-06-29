import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class297 extends class157 {

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Lcg;")
    private class393 field4500;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lgm;")
    private class92 field4501;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "[I")
    private static int[] field4499 = new int[4];

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lgm;Lgm;BF)V")
    public final void method1838(class92 arg0, class92 arg1, byte arg2, float arg3) {
        opengl var5 = this.field4500.field5783;
        class366 var6 = this.field4500.field5809;
        if (this.field4500.field5905.field569 != arg0.field1294 || this.field4500.field5905.field567 != arg0.field1294) {
            this.field4500.field5905 = new class46(this.field4500, 3553, 6408, arg0.field1294, arg0.field1294);
        }
        if (this.field4500.field5854.field569 != arg1.field1294 || this.field4500.field5854.field567 != arg1.field1294) {
            this.field4500.field5854 = new class46(this.field4500, 3553, 6408, arg1.field1294, arg1.field1294);
        }
        if (arg2 > -2) {
            return;
        }
        this.field4500.method415(field4499);
        this.field4500.method433();
        this.field4500.method2491(var6);
        this.field4500.method2466();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field4501.field1294, this.field4501.field1294);
        this.field4500.method2481(false);
        this.field4500.method2486(false);
        this.field4500.method2483(false);
        this.field4500.method2465(false);
        this.field4500.method2474(-2);
        this.field4500.method2452(1);
        this.field4500.method2480(0.0F, 0.0F, 0.0F, arg3);
        this.field4500.method2428(34165, 34165);
        this.field4500.method2452(0);
        this.field4500.method2467(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2202(0, arg0, var8);
            this.field4500.field5905.method260(0, 0, arg0.field1294, arg0.field1294, 0, 0);
            var6.method2202(0, arg1, var8);
            this.field4500.field5854.method260(0, 0, arg1.field1294, arg1.field1294, 0, 0);
            var6.method2202(0, this.field4501, var8);
            this.field4500.method2452(1);
            this.field4500.method2460(this.field4500.field5854);
            this.field4500.method2452(0);
            this.field4500.method2460(this.field4500.field5905);
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
            this.field4500.method2452(1);
            this.field4500.method2460((class325) null);
            this.field4500.method2452(0);
            this.field4500.method2460((class325) null);
        }
        this.field4500.method2452(1);
        this.field4500.method2428(8448, 8448);
        this.field4500.method2452(0);
        var6.method2200(0);
        var5.glPopAttrib();
        this.field4500.method2475(var6);
        this.field4500.method436(field4499[0], field4499[1], field4499[2], field4499[3]);
        this.field4501.method1999();
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Lgm;")
    public final class92 method967(int arg0) {
        if (arg0 != -18478) {
            this.method967(84);
        }
        return this.field4501;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)I")
    public final int method1839(int arg0) {
        int var2 = 54 / ((1 - arg0) / 54);
        return this.field4501.field1294;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lcg;I)V")
    public class297(class393 arg0, int arg1) {
        this.field4500 = arg0;
        this.field4501 = new class92(arg0, 6408, arg1);
    }
}

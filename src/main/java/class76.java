import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class76 extends class152 {

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Lig;")
    private class132 field993;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Lwl;")
    private class234 field992;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[I")
    private static int[] field994 = new int[4];

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)I")
    public final int method454(int arg0) {
        if (arg0 != 1) {
            this.method454(39);
        }
        return this.field992.field3452;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lig;I)V")
    public class76(class132 arg0, int arg1) {
        this.field993 = arg0;
        this.field992 = new class234(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILwl;FLwl;)V")
    public final void method455(int arg0, class234 arg1, float arg2, class234 arg3) {
        opengl var5 = this.field993.field1918;
        class95 var6 = this.field993.field2042;
        if (this.field993.field1993.field3366 != arg3.field3452 || this.field993.field1993.field3367 != arg3.field3452) {
            this.field993.field1993 = new class225(this.field993, 3553, 6408, arg3.field3452, arg3.field3452);
        }
        if (this.field993.field2027.field3366 != arg1.field3452 || this.field993.field2027.field3367 != arg1.field3452) {
            this.field993.field2027 = new class225(this.field993, 3553, 6408, arg1.field3452, arg1.field3452);
        }
        this.field993.method904(field994);
        this.field993.method931();
        this.field993.method872(var6);
        this.field993.method979();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field992.field3452, this.field992.field3452);
        this.field993.method942(false);
        this.field993.method996(false);
        this.field993.method938(false);
        this.field993.method969(false);
        this.field993.method977(-2);
        this.field993.method1002(1);
        this.field993.method929(0.0F, (float) arg0, 0.0F, arg2);
        this.field993.method926(34165, 34165);
        this.field993.method1002(0);
        this.field993.method913(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method559(0, arg3, var8);
            this.field993.field1993.method1576(0, 0, arg3.field3452, arg3.field3452, 0, 0);
            var6.method559(0, arg1, var8);
            this.field993.field2027.method1576(0, 0, arg1.field3452, arg1.field3452, 0, 0);
            var6.method559(0, this.field992, var8);
            this.field993.method1002(1);
            this.field993.method888(this.field993.field2027);
            this.field993.method1002(0);
            this.field993.method888(this.field993.field1993);
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
            this.field993.method1002(1);
            this.field993.method888((class404) null);
            this.field993.method1002(0);
            this.field993.method888((class404) null);
        }
        this.field993.method1002(1);
        this.field993.method926(8448, 8448);
        this.field993.method1002(0);
        var6.method558(0);
        var5.glPopAttrib();
        this.field993.method966(var6);
        this.field993.method937(field994[0], field994[1], field994[2], field994[3]);
        this.field992.method2527();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Lwl;")
    public final class234 method456(int arg0) {
        if (arg0 != -32077) {
            this.method455(65, (class234) null, -0.07196873F, (class234) null);
        }
        return this.field992;
    }
}

import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class100 extends class95 {

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lqi;")
    private class458 field1407;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lqh;")
    private class452 field1408;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
    private static int[] field1409 = new int[4];

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Lqh;", line = 4)
    public final class452 method618(byte arg0) {
        if (arg0 < 94) {
            this.method618((byte) 30);
        }
        return this.field1408;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I", line = 15)
    public final int method634(int arg0) {
        return arg0 == -8114 ? this.field1408.field6250 : 95;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lqi;I)V", line = 24)
    public class100(class458 arg0, int arg1) {
        this.field1407 = arg0;
        this.field1408 = new class452(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqh;FILqh;)V", line = 36)
    public final void method635(class452 arg0, float arg1, int arg2, class452 arg3) {
        opengl var5 = this.field1407.field6330;
        class273 var6 = this.field1407.field6355;
        if (this.field1407.field6425.field2882 != arg3.field6250 || this.field1407.field6425.field2881 != arg3.field6250) {
            this.field1407.field6425 = new class201(this.field1407, 3553, 6408, arg3.field6250, arg3.field6250);
        }
        if (this.field1407.field6406.field2882 != arg0.field6250 || this.field1407.field6406.field2881 != arg0.field6250) {
            this.field1407.field6406 = new class201(this.field1407, 3553, 6408, arg0.field6250, arg0.field6250);
        }
        this.field1407.method1077(field1409);
        this.field1407.method1137();
        this.field1407.method2680(var6);
        this.field1407.method2668();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field1408.field6250, this.field1408.field6250);
        this.field1407.method2694(false);
        this.field1407.method2652(false);
        this.field1407.method2663(false);
        if (arg2 < 97) {
            this.field1408 = (class452) null;
        }
        this.field1407.method2651(false);
        this.field1407.method2647(-2);
        this.field1407.method2660(1);
        this.field1407.method2669(0.0F, 0.0F, 0.0F, arg1);
        this.field1407.method2702(34165, 34165);
        this.field1407.method2660(0);
        this.field1407.method2696(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1718(0, arg3, var8);
            this.field1407.field6425.method1275(0, 0, arg3.field6250, arg3.field6250, 0, 0);
            var6.method1718(0, arg0, var8);
            this.field1407.field6406.method1275(0, 0, arg0.field6250, arg0.field6250, 0, 0);
            var6.method1718(0, this.field1408, var8);
            this.field1407.method2660(1);
            this.field1407.method2692(this.field1407.field6406);
            this.field1407.method2660(0);
            this.field1407.method2692(this.field1407.field6425);
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
            this.field1407.method2660(1);
            this.field1407.method2692((class179) null);
            this.field1407.method2660(0);
            this.field1407.method2692((class179) null);
        }
        this.field1407.method2660(1);
        this.field1407.method2702(8448, 8448);
        this.field1407.method2660(0);
        var6.method1712(0);
        var5.glPopAttrib();
        this.field1407.method2657(var6);
        this.field1407.method1094(field1409[0], field1409[1], field1409[2], field1409[3]);
        this.field1408.method1169();
    }
}

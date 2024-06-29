import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class182 extends class408 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lh;")
    private class327 field2117;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lhp;")
    private class254 field2116;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    private static int[] field2115 = new int[4];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)I")
    public final int method1136(boolean arg0) {
        return arg0 ? this.field2116.field3308 : 82;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lhp;")
    public final class254 method1137(int arg0) {
        int var2 = -32 % ((arg0 + 81) / 40);
        return this.field2116;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(FILhp;Lhp;)V")
    public final void method1138(float arg0, int arg1, class254 arg2, class254 arg3) {
        opengl var5 = this.field2117.field4363;
        class260 var6 = this.field2117.field4438;
        if (this.field2117.field4460.field4216 != arg3.field3308 || this.field2117.field4460.field4218 != arg3.field3308) {
            this.field2117.field4460 = new class313(this.field2117, 3553, 6408, arg3.field3308, arg3.field3308);
        }
        if (this.field2117.field4402.field4216 != arg2.field3308 || this.field2117.field4402.field4218 != arg2.field3308) {
            this.field2117.field4402 = new class313(this.field2117, 3553, 6408, arg2.field3308, arg2.field3308);
        }
        this.field2117.method722(field2115);
        this.field2117.method732();
        this.field2117.method2117(var6);
        this.field2117.method2069();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field2116.field3308, this.field2116.field3308);
        this.field2117.method2113(false);
        this.field2117.method2051(false);
        this.field2117.method2063(false);
        this.field2117.method2082(false);
        this.field2117.method2059(-2);
        this.field2117.method2115(1);
        this.field2117.method2109(0.0F, 0.0F, 0.0F, arg0);
        this.field2117.method2056(34165, 34165);
        this.field2117.method2115(0);
        this.field2117.method2083(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1645(0, arg3, var8);
            this.field2117.field4460.method1972(0, 0, arg3.field3308, arg3.field3308, 0, 0);
            var6.method1645(0, arg2, var8);
            this.field2117.field4402.method1972(0, 0, arg2.field3308, arg2.field3308, 0, 0);
            var6.method1645(0, this.field2116, var8);
            this.field2117.method2115(1);
            this.field2117.method2088(this.field2117.field4402);
            this.field2117.method2115(0);
            this.field2117.method2088(this.field2117.field4460);
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
            this.field2117.method2115(1);
            this.field2117.method2088((class233) null);
            this.field2117.method2115(0);
            this.field2117.method2088((class233) null);
        }
        this.field2117.method2115(1);
        if (arg1 != -30961) {
            this.method1136(false);
        }
        this.field2117.method2056(8448, 8448);
        this.field2117.method2115(0);
        var6.method1643(0);
        var5.glPopAttrib();
        this.field2117.method2103(var6);
        this.field2117.method774(field2115[0], field2115[1], field2115[2], field2115[3]);
        this.field2116.method1502();
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lh;I)V")
    public class182(class327 arg0, int arg1) {
        this.field2117 = arg0;
        this.field2116 = new class254(arg0, 6408, arg1);
    }
}

import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class384 extends class372 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lhj;")
    private class338 field5614;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lih;")
    private class416 field5613;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "[I")
    private static int[] field5615 = new int[4];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FLih;ILih;)V", line = 7)
    public final void method2514(float arg0, class416 arg1, int arg2, class416 arg3) {
        opengl var5 = this.field5614.field4607;
        class317 var6 = this.field5614.field4678;
        if (this.field5614.field4653.field2701 != arg1.field6021 || this.field5614.field4653.field2699 != arg1.field6021) {
            this.field5614.field4653 = new class195(this.field5614, 3553, 6408, arg1.field6021, arg1.field6021);
        }
        if (this.field5614.field4712.field2701 != arg3.field6021 || this.field5614.field4712.field2699 != arg3.field6021) {
            this.field5614.field4712 = new class195(this.field5614, 3553, 6408, arg3.field6021, arg3.field6021);
        }
        this.field5614.method1796(field5615);
        this.field5614.method1812();
        this.field5614.method2128(var6);
        this.field5614.method2141();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field5613.field6021, this.field5613.field6021);
        this.field5614.method2122(false);
        this.field5614.method2147(false);
        this.field5614.method2159(false);
        this.field5614.method2133(false);
        this.field5614.method2146(-2);
        this.field5614.method2162(1);
        this.field5614.method2104(0.0F, 0.0F, 0.0F, arg0);
        this.field5614.method2140(34165, 34165);
        this.field5614.method2162(0);
        this.field5614.method2129(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2019(0, arg1, var8);
            this.field5614.field4653.method1296(0, 0, arg1.field6021, arg1.field6021, 0, 0);
            var6.method2019(0, arg3, var8);
            this.field5614.field4712.method1296(0, 0, arg3.field6021, arg3.field6021, 0, 0);
            var6.method2019(0, this.field5613, var8);
            this.field5614.method2162(1);
            this.field5614.method2165(this.field5614.field4712);
            this.field5614.method2162(0);
            this.field5614.method2165(this.field5614.field4653);
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
            this.field5614.method2162(1);
            this.field5614.method2165((class133) null);
            this.field5614.method2162(0);
            this.field5614.method2165((class133) null);
        }
        if (arg2 != -23862) {
            this.method2515(33);
        }
        this.field5614.method2162(1);
        this.field5614.method2140(8448, 8448);
        this.field5614.method2162(0);
        var6.method2018(0);
        var5.glPopAttrib();
        this.field5614.method2170(var6);
        this.field5614.method1735(field5615[0], field5615[1], field5615[2], field5615[3]);
        this.field5613.method911();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Lih;", line = 91)
    public final class416 method2030(byte arg0) {
        if (arg0 > -20) {
            this.method2030((byte) -90);
        }
        return this.field5613;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I", line = 101)
    public final int method2515(int arg0) {
        return arg0 == -15853 ? this.field5613.field6021 : -78;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lhj;I)V", line = 110)
    public class384(class338 arg0, int arg1) {
        this.field5614 = arg0;
        this.field5613 = new class416(arg0, 6408, arg1);
    }
}

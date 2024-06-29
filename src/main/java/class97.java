import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class97 extends class164 {

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lmm;")
    private class357 field1330;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lfq;")
    private class180 field1329;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "[I")
    private static int[] field1328 = new int[4];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILfq;Lfq;F)V")
    public final void method753(int arg0, class180 arg1, class180 arg2, float arg3) {
        opengl var5 = this.field1330.field4794;
        class3 var6 = this.field1330.field4923;
        if (this.field1330.field4891.field3570 != arg1.field2553 || this.field1330.field4891.field3571 != arg1.field2553) {
            this.field1330.field4891 = new class257(this.field1330, 3553, 6408, arg1.field2553, arg1.field2553);
        }
        if (this.field1330.field4926.field3570 != arg2.field2553 || this.field1330.field4926.field3571 != arg2.field2553) {
            this.field1330.field4926 = new class257(this.field1330, 3553, 6408, arg2.field2553, arg2.field2553);
        }
        if (arg0 != 6408) {
            this.method754(-96);
        }
        this.field1330.method173(field1328);
        this.field1330.method204();
        this.field1330.method2188(var6);
        this.field1330.method2159();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field1329.field2553, this.field1329.field2553);
        this.field1330.method2141(false);
        this.field1330.method2198(false);
        this.field1330.method2204(false);
        this.field1330.method2174(false);
        this.field1330.method2169(-2);
        this.field1330.method2196(1);
        this.field1330.method2179(0.0F, 0.0F, 0.0F, arg3);
        this.field1330.method2212(34165, 34165);
        this.field1330.method2196(0);
        this.field1330.method2158(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method16(0, arg1, var8);
            this.field1330.field4891.method1661(0, 0, arg1.field2553, arg1.field2553, 0, 0);
            var6.method16(0, arg2, var8);
            this.field1330.field4926.method1661(0, 0, arg2.field2553, arg2.field2553, 0, 0);
            var6.method16(0, this.field1329, var8);
            this.field1330.method2196(1);
            this.field1330.method2180(this.field1330.field4926);
            this.field1330.method2196(0);
            this.field1330.method2180(this.field1330.field4891);
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
            this.field1330.method2196(1);
            this.field1330.method2180((class321) null);
            this.field1330.method2196(0);
            this.field1330.method2180((class321) null);
        }
        this.field1330.method2196(1);
        this.field1330.method2212(8448, 8448);
        this.field1330.method2196(0);
        var6.method13(0);
        var5.glPopAttrib();
        this.field1330.method2191(var6);
        this.field1330.method227(field1328[0], field1328[1], field1328[2], field1328[3]);
        this.field1329.method1956();
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I")
    public final int method754(int arg0) {
        if (arg0 != 3553) {
            this.method755(49);
        }
        return this.field1329.field2553;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lfq;")
    public final class180 method755(int arg0) {
        if (arg0 != -17479) {
            this.method754(-13);
        }
        return this.field1329;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lmm;I)V")
    public class97(class357 arg0, int arg1) {
        this.field1330 = arg0;
        this.field1329 = new class180(arg0, 6408, arg1);
    }
}

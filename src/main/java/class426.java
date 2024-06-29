import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class426 extends class294 {

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Lih;")
    private class330 field6330;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lsg;")
    private class266 field6328;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
    private static int[] field6329 = new int[4];

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Lsg;", line = 6)
    public final class266 method292(int arg0) {
        if (arg0 != -1457) {
            this.method2735(false);
        }
        return this.field6328;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILsg;Lsg;F)V", line = 22)
    public final void method2734(int arg0, class266 arg1, class266 arg2, float arg3) {
        opengl var5 = this.field6330.field4741;
        class89 var6 = this.field6330.field4814;
        if (this.field6330.field4777.field1864 != arg1.field3921 || this.field6330.field4777.field1863 != arg1.field3921) {
            this.field6330.field4777 = new class140(this.field6330, 3553, 6408, arg1.field3921, arg1.field3921);
        }
        if (this.field6330.field4871.field1864 != arg2.field3921 || this.field6330.field4871.field1863 != arg2.field3921) {
            this.field6330.field4871 = new class140(this.field6330, 3553, 6408, arg2.field3921, arg2.field3921);
        }
        this.field6330.method2101(field6329);
        this.field6330.method2034();
        this.field6330.method2103(var6);
        this.field6330.method2126();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, arg0, this.field6328.field3921, this.field6328.field3921);
        this.field6330.method2157(false);
        this.field6330.method2134(false);
        this.field6330.method2061(false);
        this.field6330.method2184(false);
        this.field6330.method2127(-2);
        this.field6330.method2037(1);
        this.field6330.method2094(0.0F, 0.0F, 0.0F, arg3);
        this.field6330.method2109(34165, 34165);
        this.field6330.method2037(0);
        this.field6330.method2171(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method555(0, arg1, var8);
            this.field6330.field4777.method943(0, 0, arg1.field3921, arg1.field3921, 0, 0);
            var6.method555(0, arg2, var8);
            this.field6330.field4871.method943(0, 0, arg2.field3921, arg2.field3921, 0, 0);
            var6.method555(0, this.field6328, var8);
            this.field6330.method2037(1);
            this.field6330.method2186(this.field6330.field4871);
            this.field6330.method2037(0);
            this.field6330.method2186(this.field6330.field4777);
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
            this.field6330.method2037(1);
            this.field6330.method2186((class223) null);
            this.field6330.method2037(0);
            this.field6330.method2186((class223) null);
        }
        this.field6330.method2037(1);
        this.field6330.method2109(8448, 8448);
        this.field6330.method2037(0);
        var6.method551(0);
        var5.glPopAttrib();
        this.field6330.method2159(var6);
        this.field6330.method2155(field6329[0], field6329[1], field6329[2], field6329[3]);
        this.field6328.method1388();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I", line = 103)
    public final int method2735(boolean arg0) {
        if (!arg0) {
            this.method2734(-103, (class266) null, (class266) null, -0.097263336F);
        }
        return this.field6328.field3921;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lih;I)V", line = 111)
    public class426(class330 arg0, int arg1) {
        this.field6330 = arg0;
        this.field6328 = new class266(arg0, 6408, arg1);
    }
}

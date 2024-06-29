import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class319 extends class171 {

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Lhd;")
    private class17 field4314;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lm;")
    private class181 field4313;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "[I")
    private static int[] field4312 = new int[4];

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILm;FLm;)V", line = 6)
    public final void method2024(int arg0, class181 arg1, float arg2, class181 arg3) {
        opengl var5 = this.field4314.field198;
        class337 var6 = this.field4314.field253;
        if (this.field4314.field236.field3193 != arg1.field2643 || this.field4314.field236.field3192 != arg1.field2643) {
            this.field4314.field236 = new class231(this.field4314, 3553, 6408, arg1.field2643, arg1.field2643);
        }
        if (this.field4314.field282.field3193 != arg3.field2643 || this.field4314.field282.field3192 != arg3.field2643) {
            this.field4314.field282 = new class231(this.field4314, 3553, 6408, arg3.field2643, arg3.field2643);
        }
        this.field4314.method90(field4312);
        this.field4314.method122();
        this.field4314.method260(var6);
        this.field4314.method216();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        if (arg0 < 3) {
            this.method1280(false);
        }
        var5.glViewport(0, 0, this.field4313.field2643, this.field4313.field2643);
        this.field4314.method184(false);
        this.field4314.method127(false);
        this.field4314.method138(false);
        this.field4314.method158(false);
        this.field4314.method190(-2);
        this.field4314.method176(1);
        this.field4314.method164(0.0F, 0.0F, 0.0F, arg2);
        this.field4314.method145(34165, 34165);
        this.field4314.method176(0);
        this.field4314.method159(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2141(0, arg1, var8);
            this.field4314.field236.method1545(0, 0, arg1.field2643, arg1.field2643, 0, 0);
            var6.method2141(0, arg3, var8);
            this.field4314.field282.method1545(0, 0, arg3.field2643, arg3.field2643, 0, 0);
            var6.method2141(0, this.field4313, var8);
            this.field4314.method176(1);
            this.field4314.method207(this.field4314.field282);
            this.field4314.method176(0);
            this.field4314.method207(this.field4314.field236);
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
            this.field4314.method176(1);
            this.field4314.method207((class4) null);
            this.field4314.method176(0);
            this.field4314.method207((class4) null);
        }
        this.field4314.method176(1);
        this.field4314.method145(8448, 8448);
        this.field4314.method176(0);
        var6.method2138(0);
        var5.glPopAttrib();
        this.field4314.method214(var6);
        this.field4314.method111(field4312[0], field4312[1], field4312[2], field4312[3]);
        this.field4313.method27();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Lm;", line = 93)
    public final class181 method1280(boolean arg0) {
        return arg0 ? this.field4313 : (class181) null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)I", line = 103)
    public final int method2025(boolean arg0) {
        return arg0 ? this.field4313.field2643 : 62;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lhd;I)V", line = 112)
    public class319(class17 arg0, int arg1) {
        this.field4314 = arg0;
        this.field4313 = new class181(arg0, 6408, arg1);
    }
}

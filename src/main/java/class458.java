import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class458 extends class438 {

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lfu;")
    private class42 field6470;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lbl;")
    private class240 field6469;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "[I")
    private static int[] field6471 = new int[4];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)I", line = 5)
    public final int method2746(boolean arg0) {
        if (!arg0) {
            this.method2746(true);
        }
        return this.field6469.field3509;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Lbl;", line = 15)
    public final class240 method1966(byte arg0) {
        return arg0 > -60 ? (class240) null : this.field6469;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BFLbl;Lbl;)V", line = 28)
    public final void method2747(byte arg0, float arg1, class240 arg2, class240 arg3) {
        opengl var5 = this.field6470.field557;
        class148 var6 = this.field6470.field602;
        if (this.field6470.field642.field5978 != arg2.field3509 || this.field6470.field642.field5977 != arg2.field3509) {
            this.field6470.field642 = new class429(this.field6470, 3553, 6408, arg2.field3509, arg2.field3509);
        }
        if (this.field6470.field646.field5978 != arg3.field3509 || this.field6470.field646.field5977 != arg3.field3509) {
            this.field6470.field646 = new class429(this.field6470, 3553, 6408, arg3.field3509, arg3.field3509);
        }
        this.field6470.method409(field6471);
        this.field6470.method360();
        this.field6470.method319(var6);
        this.field6470.method317();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field6469.field3509, this.field6469.field3509);
        this.field6470.method412(false);
        this.field6470.method339(false);
        this.field6470.method313(false);
        this.field6470.method388(false);
        this.field6470.method347(-2);
        this.field6470.method407(1);
        this.field6470.method371(0.0F, 0.0F, 0.0F, arg1);
        this.field6470.method353(34165, 34165);
        this.field6470.method407(0);
        this.field6470.method421(0);
        if (arg0 != -55) {
            this.field6470 = (class42) null;
        }
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1049(0, arg2, var8);
            this.field6470.field642.method2562(0, 0, arg2.field3509, arg2.field3509, 0, 0);
            var6.method1049(0, arg3, var8);
            this.field6470.field646.method2562(0, 0, arg3.field3509, arg3.field3509, 0, 0);
            var6.method1049(0, this.field6469, var8);
            this.field6470.method407(1);
            this.field6470.method303(this.field6470.field646);
            this.field6470.method407(0);
            this.field6470.method303(this.field6470.field642);
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
            this.field6470.method407(1);
            this.field6470.method303((class375) null);
            this.field6470.method407(0);
            this.field6470.method303((class375) null);
        }
        this.field6470.method407(1);
        this.field6470.method353(8448, 8448);
        this.field6470.method407(0);
        var6.method1050(0);
        var5.glPopAttrib();
        this.field6470.method413(var6);
        this.field6470.method453(field6471[0], field6471[1], field6471[2], field6471[3]);
        this.field6469.method2299();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lfu;I)V", line = 114)
    public class458(class42 arg0, int arg1) {
        this.field6470 = arg0;
        this.field6469 = new class240(arg0, 6408, arg1);
    }
}

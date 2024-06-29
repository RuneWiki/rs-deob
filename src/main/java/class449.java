import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class449 extends class438 {

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lao;")
    private class157 field6443;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Lvk;")
    private class206 field6441;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
    private static int[] field6442 = new int[4];

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)I")
    public final int method2785(byte arg0) {
        if (arg0 != 107) {
            this.method2785((byte) 86);
        }
        return this.field6441.field2934;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lao;I)V")
    public class449(class157 arg0, int arg1) {
        this.field6443 = arg0;
        this.field6441 = new class206(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lvk;Lvk;FB)V")
    public final void method2786(class206 arg0, class206 arg1, float arg2, byte arg3) {
        opengl var5 = this.field6443.field1927;
        class80 var6 = this.field6443.field1968;
        if (this.field6443.field2035.field4987 != arg1.field2934 || this.field6443.field2035.field4986 != arg1.field2934) {
            this.field6443.field2035 = new class354(this.field6443, 3553, 6408, arg1.field2934, arg1.field2934);
        }
        if (this.field6443.field1982.field4987 != arg0.field2934 || this.field6443.field1982.field4986 != arg0.field2934) {
            this.field6443.field1982 = new class354(this.field6443, 3553, 6408, arg0.field2934, arg0.field2934);
        }
        this.field6443.method659(field6442);
        this.field6443.method624();
        this.field6443.method998(var6);
        this.field6443.method984();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field6441.field2934, this.field6441.field2934);
        this.field6443.method948(false);
        this.field6443.method969(false);
        this.field6443.method1009(false);
        if (arg3 != -104) {
            return;
        }
        this.field6443.method959(false);
        this.field6443.method979(-2);
        this.field6443.method1001(1);
        this.field6443.method1000(0.0F, 0.0F, 0.0F, arg2);
        this.field6443.method981(34165, 34165);
        this.field6443.method1001(0);
        this.field6443.method975(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method452(0, arg1, var8);
            this.field6443.field2035.method2251(0, 0, arg1.field2934, arg1.field2934, 0, 0);
            var6.method452(0, arg0, var8);
            this.field6443.field1982.method2251(0, 0, arg0.field2934, arg0.field2934, 0, 0);
            var6.method452(0, this.field6441, var8);
            this.field6443.method1001(1);
            this.field6443.method1003(this.field6443.field1982);
            this.field6443.method1001(0);
            this.field6443.method1003(this.field6443.field2035);
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
            this.field6443.method1001(1);
            this.field6443.method1003((class220) null);
            this.field6443.method1001(0);
            this.field6443.method1003((class220) null);
        }
        this.field6443.method1001(1);
        this.field6443.method981(8448, 8448);
        this.field6443.method1001(0);
        var6.method449(0);
        var5.glPopAttrib();
        this.field6443.method947(var6);
        this.field6443.method660(field6442[0], field6442[1], field6442[2], field6442[3]);
        this.field6441.method1481();
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)Lvk;")
    public final class206 method1145(byte arg0) {
        if (arg0 < 90) {
            field6442 = (int[]) null;
        }
        return this.field6441;
    }
}

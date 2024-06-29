import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class39 extends class280 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lks;")
    private class173 field542;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lea;")
    private class61 field541;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    private static int[] field540 = new int[4];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lea;", line = 5)
    public final class61 method344(int arg0) {
        return arg0 == 15733 ? this.field541 : (class61) null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I", line = 15)
    public final int method345(byte arg0) {
        if (arg0 != -84) {
            this.method344(64);
        }
        return this.field541.field812;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(FLea;Lea;I)V", line = 28)
    public final void method346(float arg0, class61 arg1, class61 arg2, int arg3) {
        opengl var5 = this.field542.field2253;
        class442 var6 = this.field542.field2305;
        if (this.field542.field2355.field1094 != arg2.field812 || this.field542.field2355.field1093 != arg2.field812) {
            this.field542.field2355 = new class89(this.field542, 3553, 6408, arg2.field812, arg2.field812);
        }
        if (this.field542.field2356.field1094 != arg1.field812 || this.field542.field2356.field1093 != arg1.field812) {
            this.field542.field2356 = new class89(this.field542, 3553, 6408, arg1.field812, arg1.field812);
        }
        this.field542.method76(field540);
        this.field542.method162();
        this.field542.method1131(var6);
        this.field542.method1170();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, arg3, this.field541.field812, this.field541.field812);
        this.field542.method1142(false);
        this.field542.method1132(false);
        this.field542.method1162(false);
        this.field542.method1189(false);
        this.field542.method1133(-2);
        this.field542.method1150(1);
        this.field542.method1137(0.0F, 0.0F, 0.0F, arg0);
        this.field542.method1161(34165, 34165);
        this.field542.method1150(0);
        this.field542.method1143(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2712(0, arg2, var8);
            this.field542.field2355.method596(0, 0, arg2.field812, arg2.field812, 0, 0);
            var6.method2712(0, arg1, var8);
            this.field542.field2356.method596(0, 0, arg1.field812, arg1.field812, 0, 0);
            var6.method2712(0, this.field541, var8);
            this.field542.method1150(1);
            this.field542.method1160(this.field542.field2356);
            this.field542.method1150(0);
            this.field542.method1160(this.field542.field2355);
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
            this.field542.method1150(1);
            this.field542.method1160((class205) null);
            this.field542.method1150(0);
            this.field542.method1160((class205) null);
        }
        this.field542.method1150(1);
        this.field542.method1161(8448, 8448);
        this.field542.method1150(0);
        var6.method2711(0);
        var5.glPopAttrib();
        this.field542.method1182(var6);
        this.field542.method77(field540[0], field540[1], field540[2], field540[3]);
        this.field541.method1413();
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lks;I)V", line = 108)
    public class39(class173 arg0, int arg1) {
        this.field542 = arg0;
        this.field541 = new class61(arg0, 6408, arg1);
    }
}

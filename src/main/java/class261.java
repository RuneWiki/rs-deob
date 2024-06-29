import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class261 extends class138 {

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Lge;")
    private class104 field3933;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lca;")
    private class414 field3934;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[I")
    private static int[] field3935 = new int[4];

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)I", line = 5)
    public final int method1877(int arg0) {
        if (arg0 > -61) {
            this.field3934 = (class414) null;
        }
        return this.field3934.field6003;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)Lca;", line = 15)
    public final class414 method1123(byte arg0) {
        if (arg0 != 11) {
            this.method1123((byte) -13);
        }
        return this.field3934;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(FBLca;Lca;)V", line = 28)
    public final void method1878(float arg0, byte arg1, class414 arg2, class414 arg3) {
        if (arg1 != 111) {
            this.method1123((byte) -77);
        }
        opengl var5 = this.field3933.field1604;
        class130 var6 = this.field3933.field1642;
        if (this.field3933.field1705.field3038 != arg2.field6003 || this.field3933.field1705.field3039 != arg2.field6003) {
            this.field3933.field1705 = new class208(this.field3933, 3553, 6408, arg2.field6003, arg2.field6003);
        }
        if (this.field3933.field1726.field3038 != arg3.field6003 || this.field3933.field1726.field3039 != arg3.field6003) {
            this.field3933.field1726 = new class208(this.field3933, 3553, 6408, arg3.field6003, arg3.field6003);
        }
        this.field3933.method708(field3935);
        this.field3933.method751();
        this.field3933.method903(var6);
        this.field3933.method897();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field3934.field6003, this.field3934.field6003);
        this.field3933.method867(false);
        this.field3933.method911(false);
        this.field3933.method913(false);
        this.field3933.method864(false);
        this.field3933.method899(-2);
        this.field3933.method857(1);
        this.field3933.method907(0.0F, 0.0F, 0.0F, arg0);
        this.field3933.method870(34165, 34165);
        this.field3933.method857(0);
        this.field3933.method884(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1093(0, arg2, var8);
            this.field3933.field1705.method1572(0, 0, arg2.field6003, arg2.field6003, 0, 0);
            var6.method1093(0, arg3, var8);
            this.field3933.field1726.method1572(0, 0, arg3.field6003, arg3.field6003, 0, 0);
            var6.method1093(0, this.field3934, var8);
            this.field3933.method857(1);
            this.field3933.method929(this.field3933.field1726);
            this.field3933.method857(0);
            this.field3933.method929(this.field3933.field1705);
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
            this.field3933.method857(1);
            this.field3933.method929((class195) null);
            this.field3933.method857(0);
            this.field3933.method929((class195) null);
        }
        this.field3933.method857(1);
        this.field3933.method870(8448, 8448);
        this.field3933.method857(0);
        var6.method1092(0);
        var5.glPopAttrib();
        this.field3933.method869(var6);
        this.field3933.method752(field3935[0], field3935[1], field3935[2], field3935[3]);
        this.field3934.method1494();
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lge;I)V", line = 114)
    public class261(class104 arg0, int arg1) {
        this.field3933 = arg0;
        this.field3934 = new class414(arg0, 6408, arg1);
    }
}

import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class341 extends class271 {

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Lic;")
    private class246 field4886;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Lnb;")
    private class359 field4885;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "[I")
    private static int[] field4887 = new int[4];

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Lnb;")
    public final class359 method456(int arg0) {
        if (arg0 > -103) {
            this.method2072(-41);
        }
        return this.field4885;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILnb;FLnb;)V")
    public final void method2071(int arg0, class359 arg1, float arg2, class359 arg3) {
        opengl var5 = this.field4886.field3342;
        class161 var6 = this.field4886.field3437;
        if (this.field4886.field3433.field1826 != arg1.field5175 || this.field4886.field3433.field1825 != arg1.field5175) {
            this.field4886.field3433 = new class151(this.field4886, 3553, 6408, arg1.field5175, arg1.field5175);
        }
        if (this.field4886.field3447.field1826 != arg3.field5175 || this.field4886.field3447.field1825 != arg3.field5175) {
            this.field4886.field3447 = new class151(this.field4886, 3553, 6408, arg3.field5175, arg3.field5175);
        }
        this.field4886.method1500(field4887);
        this.field4886.method1352();
        this.field4886.method1348(var6);
        this.field4886.method1391();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field4885.field5175, this.field4885.field5175);
        this.field4886.method1437(false);
        this.field4886.method1353(false);
        this.field4886.method1402(false);
        this.field4886.method1441(false);
        int var7 = 27 % ((arg0 + 9) / 58);
        this.field4886.method1418(-2);
        this.field4886.method1365(1);
        this.field4886.method1452(0.0F, 0.0F, 0.0F, arg2);
        this.field4886.method1360(34165, 34165);
        this.field4886.method1365(0);
        this.field4886.method1455(0);
        for (int var8 = 0; var8 < 6; var8++) {
            int var9 = var8 + 34069;
            var6.method781(0, arg1, var9);
            this.field4886.field3433.method731(0, 0, arg1.field5175, arg1.field5175, 0, 0);
            var6.method781(0, arg3, var9);
            this.field4886.field3447.method731(0, 0, arg3.field5175, arg3.field5175, 0, 0);
            var6.method781(0, this.field4885, var9);
            this.field4886.method1365(1);
            this.field4886.method1379(this.field4886.field3447);
            this.field4886.method1365(0);
            this.field4886.method1379(this.field4886.field3433);
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
            this.field4886.method1365(1);
            this.field4886.method1379((class5) null);
            this.field4886.method1365(0);
            this.field4886.method1379((class5) null);
        }
        this.field4886.method1365(1);
        this.field4886.method1360(8448, 8448);
        this.field4886.method1365(0);
        var6.method774(0);
        var5.glPopAttrib();
        this.field4886.method1454(var6);
        this.field4886.method1351(field4887[0], field4887[1], field4887[2], field4887[3]);
        this.field4885.method39();
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)I")
    public final int method2072(int arg0) {
        if (arg0 < 39) {
            this.method456(2);
        }
        return this.field4885.field5175;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lic;I)V")
    public class341(class246 arg0, int arg1) {
        this.field4886 = arg0;
        this.field4885 = new class359(arg0, 6408, arg1);
    }
}

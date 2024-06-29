import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class79 extends class207 {

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Lse;")
    private class282 field1099;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "Lpi;")
    private class141 field1100;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "[I")
    private static int[] field1101 = new int[4];

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lpi;FZLpi;)V")
    public final void method621(class141 arg0, float arg1, boolean arg2, class141 arg3) {
        opengl var5 = this.field1099.field4140;
        class18 var6 = this.field1099.field4197;
        if (this.field1099.field4199.field1570 != arg3.field1801 || this.field1099.field4199.field1568 != arg3.field1801) {
            this.field1099.field4199 = new class121(this.field1099, 3553, 6408, arg3.field1801, arg3.field1801);
        }
        if (this.field1099.field4207.field1570 != arg0.field1801 || this.field1099.field4207.field1568 != arg0.field1801) {
            this.field1099.field4207 = new class121(this.field1099, 3553, 6408, arg0.field1801, arg0.field1801);
        }
        this.field1099.method474(field1101);
        this.field1099.method472();
        this.field1099.method1884(var6);
        this.field1099.method1899();
        var5.glMatrixMode(5889);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field1100.field1801, this.field1100.field1801);
        this.field1099.method1903(false);
        this.field1099.method1931(arg2);
        this.field1099.method1922(false);
        this.field1099.method1892(false);
        this.field1099.method1861(-2);
        this.field1099.method1862(1);
        this.field1099.method1908(0.0F, 0.0F, 0.0F, arg1);
        this.field1099.method1911(34165, 34165);
        this.field1099.method1862(0);
        this.field1099.method1910(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method137(0, arg3, var8);
            this.field1099.field4199.method870(0, 0, arg3.field1801, arg3.field1801, 0, 0);
            var6.method137(0, arg0, var8);
            this.field1099.field4207.method870(0, 0, arg0.field1801, arg0.field1801, 0, 0);
            var6.method137(0, this.field1100, var8);
            this.field1099.method1862(1);
            this.field1099.method1915(this.field1099.field4207);
            this.field1099.method1862(0);
            this.field1099.method1915(this.field1099.field4199);
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
            this.field1099.method1862(1);
            this.field1099.method1915((class344) null);
            this.field1099.method1862(0);
            this.field1099.method1915((class344) null);
        }
        this.field1099.method1862(1);
        this.field1099.method1911(8448, 8448);
        this.field1099.method1862(0);
        var6.method131(0);
        var5.glPopAttrib();
        this.field1099.method1916(var6);
        this.field1099.method462(field1101[0], field1101[1], field1101[2], field1101[3]);
        this.field1100.method2278();
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Lpi;")
    public final class141 method622(byte arg0) {
        if (arg0 <= 118) {
            this.method621((class141) null, -0.5483916F, true, (class141) null);
        }
        return this.field1100;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lse;I)V")
    public class79(class282 arg0, int arg1) {
        this.field1099 = arg0;
        this.field1100 = new class141(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)I")
    public final int method623(int arg0) {
        return arg0 < 90 ? 11 : this.field1100.field1801;
    }
}

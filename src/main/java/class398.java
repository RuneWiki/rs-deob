import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class398 extends class259 {

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lpo;")
    private class332 field5796;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lbc;")
    private class205 field5795;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[I")
    private static int[] field5797 = new int[4];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILbc;Lbc;F)V")
    public final void method2528(int arg0, class205 arg1, class205 arg2, float arg3) {
        opengl var5 = this.field5796.field4752;
        class86 var6 = this.field5796.field4848;
        if (this.field5796.field4822.field1990 != arg2.field2801 || this.field5796.field4822.field1992 != arg2.field2801) {
            this.field5796.field4822 = new class141(this.field5796, 3553, 6408, arg2.field2801, arg2.field2801);
        }
        if (this.field5796.field4799.field1990 != arg1.field2801 || this.field5796.field4799.field1992 != arg1.field2801) {
            this.field5796.field4799 = new class141(this.field5796, 3553, 6408, arg1.field2801, arg1.field2801);
        }
        this.field5796.method1004(field5797);
        this.field5796.method957();
        this.field5796.method2078(var6);
        this.field5796.method2132();
        var5.glMatrixMode(arg0);
        var5.glLoadIdentity();
        var5.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var5.glMatrixMode(5888);
        var5.glLoadIdentity();
        var5.glPushAttrib(2048);
        var5.glViewport(0, 0, this.field5795.field2801, this.field5795.field2801);
        this.field5796.method2099(false);
        this.field5796.method2110(false);
        this.field5796.method2056(false);
        this.field5796.method2063(false);
        this.field5796.method2109(-2);
        this.field5796.method2062(1);
        this.field5796.method2076(0.0F, 0.0F, 0.0F, arg3);
        this.field5796.method2100(34165, 34165);
        this.field5796.method2062(0);
        this.field5796.method2116(0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method472(0, arg2, var8);
            this.field5796.field4822.method835(0, 0, arg2.field2801, arg2.field2801, 0, 0);
            var6.method472(0, arg1, var8);
            this.field5796.field4799.method835(0, 0, arg1.field2801, arg1.field2801, 0, 0);
            var6.method472(0, this.field5795, var8);
            this.field5796.method2062(1);
            this.field5796.method2085(this.field5796.field4799);
            this.field5796.method2062(0);
            this.field5796.method2085(this.field5796.field4822);
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
            this.field5796.method2062(1);
            this.field5796.method2085((class439) null);
            this.field5796.method2062(0);
            this.field5796.method2085((class439) null);
        }
        this.field5796.method2062(1);
        this.field5796.method2100(8448, 8448);
        this.field5796.method2062(0);
        var6.method466(0);
        var5.glPopAttrib();
        this.field5796.method2104(var6);
        this.field5796.method968(field5797[0], field5797[1], field5797[2], field5797[3]);
        this.field5795.method2730();
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)Lbc;")
    public final class205 method1619(byte arg0) {
        int var2 = -4 / ((-arg0 - 29) / 34);
        return this.field5795;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
    public final int method2529(int arg0) {
        if (arg0 != 1) {
            this.method1619((byte) -76);
        }
        return this.field5795.field2801;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lpo;I)V")
    public class398(class332 arg0, int arg1) {
        this.field5796 = arg0;
        this.field5795 = new class205(arg0, 6408, arg1);
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class331 extends class372 {

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "Lbo;")
    private class511 field4356;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "Lef;")
    private class336 field4357;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "Lcu;")
    public static class145 field4359 = new class145(46, 3);

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "[[F")
    public static float[][] field4363 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILef;FLef;)Z")
    public final boolean method1903(int arg0, class336 arg1, float arg2, class336 arg3) {
        field4358++;
        boolean var5 = true;
        class48 var6 = this.field4356.field7478;
        class48 var7 = this.field4356.field7472;
        if (this.field4356.field7504.field4144 != arg1.field4404 || this.field4356.field7504.field4143 != arg1.field4404) {
            this.field4356.field7504 = new class316(this.field4356, 3553, 6408, arg1.field4404, arg1.field4404);
        }
        if (this.field4356.field7525.field4144 != arg3.field4404 || this.field4356.field7525.field4143 != arg3.field4404) {
            this.field4356.field7525 = new class316(this.field4356, 3553, 6408, arg3.field4404, arg3.field4404);
        }
        this.field4356.method613(class245.field3264);
        this.field4356.method539();
        this.field4356.method2995((byte) 36);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4357.field4404, this.field4357.field4404);
        this.field4356.method2945(false, (byte) -102);
        this.field4356.method2969(false, 4940);
        this.field4356.method2982(false, 2929);
        this.field4356.method2951(false, arg0 ^ 0x9F87);
        this.field4356.method2935(47, -2);
        this.field4356.method3003(1, 60);
        this.field4356.method2966(0.0F, arg2, 0.0F, 0.0F, 114);
        this.field4356.method3002((byte) -87, 34165, 34165);
        this.field4356.method2980(null, 112);
        this.field4356.method3003(0, arg0 ^ 0x1B7E);
        if (arg0 != 7013) {
            return false;
        }
        this.field4356.method2976((byte) 127, 1);
        this.field4356.method2980(null, 116);
        int var8 = 0;
        while (var8 < 6) {
            this.field4356.method3010((byte) -51, var6);
            int var9 = var8 + 34069;
            var6.method358(0, (byte) -111, var9, arg1);
            this.field4356.method2991(var7, false);
            var7.method363(true, 0, this.field4356.field7504);
            if (var6.method366((byte) 23) && var7.method366((byte) 23)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg1.field4404, arg1.field4404, 0, 0, arg1.field4404, arg1.field4404, 16384, 9728);
                var6.method358(0, (byte) -124, var9, arg3);
                var7.method363(true, 0, this.field4356.field7525);
                if (var6.method366((byte) 23) && var7.method366((byte) 23)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg1.field4404, arg1.field4404, 0, 0, arg1.field4404, arg1.field4404, 16384, 9728);
                    var6.method362(arg0 + 540, 0);
                    this.field4356.method2983(var6, (byte) 99);
                    var7.method362(7553, 0);
                    this.field4356.method2988(2, var7);
                    this.field4356.method2938(var6, 10);
                    var6.method358(0, (byte) -113, var9, this.field4357);
                    if (!var6.method366((byte) 23)) {
                        var6.method362(arg0 + 540, 0);
                        var5 = false;
                        this.field4356.method2942(2, var6);
                        break;
                    }
                    this.field4356.method3003(1, 47);
                    this.field4356.method2980(this.field4356.field7525, 121);
                    this.field4356.method3003(0, arg0 - 6933);
                    this.field4356.method2980(this.field4356.field7504, 125);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    this.field4356.method3003(1, 11);
                    this.field4356.method2980(null, arg0 - 6888);
                    this.field4356.method3003(0, arg0 ^ 0x1B52);
                    this.field4356.method2980(null, 113);
                    var6.method362(7553, 0);
                    this.field4356.method2942(2, var6);
                    var8++;
                    continue;
                }
                var6.method362(7553, 0);
                this.field4356.method2983(var6, (byte) 58);
                var7.method362(7553, 0);
                this.field4356.method2988(2, var7);
                var5 = false;
                break;
            }
            var6.method362(7553, 0);
            this.field4356.method2983(var6, (byte) 127);
            var7.method362(7553, 0);
            var5 = false;
            this.field4356.method2988(2, var7);
            break;
        }
        this.field4356.method3003(1, arg0 ^ 0x1B28);
        this.field4356.method3002((byte) -85, 8448, 8448);
        this.field4356.method3003(0, arg0 - 6894);
        OpenGL.glPopAttrib();
        this.field4356.method572(class245.field3264[0], class245.field3264[1], class245.field3264[2], class245.field3264[3]);
        if (var5) {
            this.field4357.method2868(arg0 - 7106);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)Lef;")
    public final class336 method1904(byte arg0) {
        field4361++;
        if (arg0 != -34) {
            field4363 = null;
        }
        return this.field4357;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLpc;)V")
    public static final void method1905(byte arg0, class473 arg1) {
        field4354++;
        class402.field5392 = arg1.method2704("titlebg", true);
        int var2 = -64 / ((32 - arg0) / 51);
        class364.field4926 = arg1.method2704("logo", true);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
    public static final void method1906(int arg0, int arg1, int arg2) {
        field4360++;
        class253 var3 = class332.method1911(0, (byte) -120, 15);
        var3.method1522(arg0 ^ arg0);
        var3.field3356 = arg2;
        var3.field3355 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)I")
    public final int method1907(byte arg0) {
        if (arg0 <= 80) {
            this.field4357 = null;
        }
        field4364++;
        return this.field4357.field4404;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
    public static void method1908(int arg0) {
        field4363 = null;
        field4359 = null;
        int var1 = -105 / ((arg0 + 54) / 58);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILdm;I)Lkf;")
    public static final class165 method1909(int arg0, class37 arg1, int arg2) {
        field4362++;
        if (arg2 != 0) {
            method1906(-86, -29, -44);
        }
        class165 var3;
        if (class206.field2848 == null) {
            var3 = new class165();
        } else {
            var3 = class206.field2848;
            class206.field2848 = class206.field2848.field2400;
            var3.field2400 = null;
            class213.field2892--;
        }
        var3.field2401 = arg0;
        var3.field2402 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lbo;I)V")
    public class331(class511 arg0, int arg1) {
        this.field4356 = arg0;
        this.field4357 = new class336(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1910(byte arg0, String arg1, int arg2) {
        field4355++;
        class253 var3 = class332.method1911(arg2, (byte) -118, 3);
        var3.method1522(0);
        var3.field3353 = arg1;
        if (arg0 <= 15) {
            field4363 = null;
        }
    }
}

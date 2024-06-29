import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class253 extends class271 {

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Lrl;")
    private class487 field3656;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Lgh;")
    private class368 field3654;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Li;")
    public static class30 field3653;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "[I")
    public static int[] field3658;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILqn;IIIB)Ljava/awt/Frame;")
    public static final Frame method1583(int arg0, class44 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3655++;
        if (!arg1.method338((byte) 54)) {
            return null;
        }
        if (arg4 == 0) {
            class7[] var6 = class115.method666(74, arg1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field127 == arg3 && var6[var8].field125 == arg2 && (arg0 == 0 || var6[var8].field121 == arg0) && (!var7 || arg4 < var6[var8].field128)) {
                    var7 = true;
                    arg4 = var6[var8].field128;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg5 != 21) {
            return null;
        }
        class439 var9 = arg1.method320(arg5 ^ 0x44EE, arg0, arg2, arg4, arg3);
        while (var9.field6417 == 0) {
            class322.method1935(true, 10L);
        }
        Frame var10 = (Frame) var9.field6416;
        if (var10 == null) {
            return null;
        } else if (var9.field6417 == 2) {
            class238.method1438(var10, arg1, 1);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILgh;Lgh;F)Z")
    public final boolean method1584(int arg0, class368 arg1, class368 arg2, float arg3) {
        field3657++;
        boolean var5 = true;
        class295 var6 = this.field3656.field7428;
        class295 var7 = this.field3656.field7346;
        if (this.field3656.field7349.field435 != arg2.field5528 || this.field3656.field7349.field433 != arg2.field5528) {
            this.field3656.field7349 = new class26(this.field3656, 3553, 6408, arg2.field5528, arg2.field5528);
        }
        if (this.field3656.field7358.field435 != arg1.field5528 || this.field3656.field7358.field433 != arg1.field5528) {
            this.field3656.field7358 = new class26(this.field3656, 3553, 6408, arg1.field5528, arg1.field5528);
        }
        this.field3656.method785(class159.field2071);
        this.field3656.method836();
        this.field3656.method2901(-110);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3654.field5528, this.field3654.field5528);
        this.field3656.method2880(false, arg0 - 119);
        this.field3656.method2884(false, (byte) 98);
        this.field3656.method2868(false, 105);
        this.field3656.method2908(false, (byte) 82);
        this.field3656.method2867(0, -2);
        this.field3656.method2849(1, (byte) -109);
        this.field3656.method2853(0.0F, 0.0F, -126, arg3, 0.0F);
        this.field3656.method2919(34165, 34165, false);
        this.field3656.method2883(null, -93);
        this.field3656.method2849(0, (byte) -109);
        this.field3656.method2914(126, 1);
        this.field3656.method2883(null, arg0 + 39);
        int var8 = 0;
        while (var8 < 6) {
            this.field3656.method2907(255, var6);
            int var9 = var8 + 34069;
            var6.method1785(arg2, var9, 0, arg0 + 66);
            this.field3656.method2889(var7, 10);
            var7.method1783((byte) 64, this.field3656.field7349, 0);
            if (var6.method1789(false) && var7.method1789(false)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg2.field5528, arg2.field5528, 0, 0, arg2.field5528, arg2.field5528, 16384, 9728);
                var6.method1785(arg1, var9, 0, arg0 ^ 0x7F);
                var7.method1783((byte) 64, this.field3656.field7358, 0);
                if (var6.method1789(false) && var7.method1789(false)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg2.field5528, arg2.field5528, 0, 0, arg2.field5528, arg2.field5528, 16384, 9728);
                    var6.method1782(arg0 ^ 0xFFFFFFFE, 0);
                    this.field3656.method2894(var6, 16711680);
                    var7.method1782(-1, 0);
                    this.field3656.method2878(var7, -70);
                    this.field3656.method2872(126, var6);
                    var6.method1785(this.field3654, var9, 0, -117);
                    if (!var6.method1789(false)) {
                        var6.method1782(arg0 ^ 0xFFFFFFFE, 0);
                        var5 = false;
                        this.field3656.method2927(14921, var6);
                        break;
                    }
                    this.field3656.method2849(1, (byte) -109);
                    this.field3656.method2883(this.field3656.field7358, 70);
                    this.field3656.method2849(0, (byte) -109);
                    this.field3656.method2883(this.field3656.field7349, 49);
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
                    this.field3656.method2849(1, (byte) -109);
                    this.field3656.method2883(null, arg0 - 100);
                    this.field3656.method2849(0, (byte) -109);
                    this.field3656.method2883(null, arg0 - 125);
                    var6.method1782(-1, 0);
                    this.field3656.method2927(arg0 ^ 0x3A48, var6);
                    var8++;
                    continue;
                }
                var6.method1782(-1, 0);
                this.field3656.method2894(var6, arg0 + 16711679);
                var7.method1782(-1, 0);
                var5 = false;
                this.field3656.method2878(var7, -66);
                break;
            }
            var6.method1782(-1, 0);
            this.field3656.method2894(var6, 16711680);
            var7.method1782(-1, 0);
            this.field3656.method2878(var7, -102);
            var5 = false;
            break;
        }
        this.field3656.method2849(1, (byte) -109);
        this.field3656.method2919(8448, 8448, false);
        this.field3656.method2849(0, (byte) -109);
        OpenGL.glPopAttrib();
        this.field3656.method810(class159.field2071[0], class159.field2071[arg0], class159.field2071[2], class159.field2071[3]);
        if (var5) {
            this.field3654.method1369(-1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)I")
    public final int method1585(int arg0) {
        int var2 = 109 / ((arg0 + 4) / 50);
        field3651++;
        return this.field3654.field5528;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lgh;")
    public final class368 method1586(int arg0) {
        field3652++;
        if (arg0 != 1) {
            this.method1586(-13);
        }
        return this.field3654;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)V")
    public static void method1587(byte arg0) {
        field3658 = null;
        field3653 = null;
        if (arg0 >= -123) {
            method1583(-6, null, 29, 46, 26, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lrl;I)V")
    public class253(class487 arg0, int arg1) {
        this.field3656 = arg0;
        this.field3654 = new class368(arg0, 6408, arg1);
    }

    static {
        new class194("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field3653 = new class30();
        field3658 = new int[1000];
    }
}

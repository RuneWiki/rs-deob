import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class185 extends class172 {

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    private int field2978 = -1;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    private int field2975 = -1;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    private int field2979 = 0;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    private int field2980 = 0;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "[I")
    private int[] field2976;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Lta;")
    public static class300 field2977 = new class300(4);

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[I")
    private static int[] field2982 = new int[4];

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    private static int field2981 = -1;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "[F")
    private static float[] field2984 = new float[4];

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "[I")
    private static int[] field2983 = null;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwc;Lwc;F)Lwc;", line = 11)
    public final class185 method1454(class185 arg0, class185 arg1, float arg2) {
        GL var4 = class42.field627;
        class185 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class42.field606) {
            return var5;
        }
        this.method1458();
        if (field2983 == null || class199.field3172 != field2981) {
            field2983 = new int[2];
            var4.glGenTextures(2, field2983, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class42.method273(field2983[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field2981 = class199.field3172;
        }
        int var7 = arg0.field2978 > arg1.field2978 ? arg0.field2978 : arg1.field2978;
        if (this.field2978 != var7) {
            this.field2978 = var7;
            var4.glBindTexture(34067, this.field2975);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field2978, this.field2978, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method1456();
        arg1.method1456();
        class244.method1868(field2982);
        class244.method1863();
        class212.method1604(class42.method271());
        var4.glPushAttrib(2048);
        class42.method286(false);
        class42.method283(false);
        class42.method278(false);
        class42.method275(1);
        class42.method277(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field2978, 0.0D, (double) this.field2978, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field2978, this.field2978);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field2983[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field2984[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field2984, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method1460(var4, arg0.field2975, var11, arg0.field2978, field2983[0])) {
                var9 = false;
                break;
            }
            if (!method1460(var4, arg1.field2975, var11, arg1.field2978, field2983[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field2975, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class42.method273(field2983[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field2978, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field2978, this.field2978);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field2978);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class42.method278(true);
        class42.method283(true);
        class42.method286(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class212.method1596();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class244.method1861(field2982);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)Lwc;", line = 154)
    public static final class185 method1455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class185 var8 = (class185) field2977.method2147((byte) 66, var6);
        if (var8 == null) {
            class185 var9 = new class185(arg0, arg1, arg2, arg3, arg4, arg5);
            field2977.method2149(var9, -32563, var6);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 293)
    public class185() {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2976 = new int[6];
        this.field2976[0] = arg0;
        this.field2976[1] = arg1;
        this.field2976[2] = arg2;
        this.field2976[3] = arg3;
        this.field2976[4] = arg4;
        this.field2976[5] = arg5;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 172)
    public final void method1456() {
        GL var1 = class42.field627;
        this.method1458();
        var1.glBindTexture(34067, this.field2975);
        if (this.field2976 == null || this.field2980 == 2) {
            return;
        }
        if (this.method1459()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field2976[var3];
                this.field2978 = class153.field2439.method771(var4, 255) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field2978;
                } else if (this.field2978 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class153.field2439.method768(-126, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class199.field3173 += var6 - this.field2979;
            this.field2979 = var6;
            this.field2980 = 2;
        } else if (this.field2980 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class153.field2444, class153.field2439.method770(this.field2976[var7], -47), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class199.field3173 += 3 - this.field2979;
                this.field2979 = 3;
            }
            this.field2980 = 1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()V", line = 239)
    public static void method1457() {
        field2977 = null;
        field2983 = null;
        field2984 = null;
        field2982 = null;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()V", line = 245)
    private final void method1458() {
        if (this.field2975 >= 0 && class199.field3172 == this.field2974) {
            return;
        }
        GL var1 = class42.field627;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2975 = var2[0];
        var1.glBindTexture(34067, this.field2975);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field2974 = class199.field3172;
        this.field2980 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V", line = 263)
    protected final void finalize() throws Throwable {
        if (this.field2975 != -1) {
            class199.method1535(this.field2975, this.field2979, this.field2974);
            this.field2975 = -1;
            this.field2979 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()Z", line = 282)
    private final boolean method1459() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class153.field2439.method760((byte) -127, this.field2976[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 296)
    private static final boolean method1460(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method273(arg4);
        arg0.glFramebufferTexture2DEXT(36160, 36064, arg2, arg1, 0);
        arg0.glReadBuffer(36064);
        int var5 = arg0.glCheckFramebufferStatusEXT(36160);
        if (var5 == 36053) {
            arg0.glCopyTexImage2D(3553, 0, 6407, 0, 0, arg3, arg3, 0);
            return true;
        } else {
            return false;
        }
    }
}

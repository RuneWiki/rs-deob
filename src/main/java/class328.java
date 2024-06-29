import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class328 extends class8 {

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    private int field5069 = 0;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    private int field5068 = -1;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    private int field5066 = -1;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    private int field5074 = 0;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "[I")
    private int[] field5076;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lgi;")
    public static class109 field5067 = new class109(4);

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    private static int field5073 = -1;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "[I")
    private static int[] field5071 = null;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "[I")
    private static int[] field5075 = new int[4];

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "[F")
    private static float[] field5072 = new float[4];

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    private int field5070;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 6)
    private static final boolean method2294(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.method1662(arg4);
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

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Lha;", line = 20)
    public static final class328 method2295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class328 var8 = (class328) field5067.method755(var6, false);
        if (var8 == null) {
            class328 var9 = new class328(arg0, arg1, arg2, arg3, arg4, arg5);
            field5067.method750(var9, var6, -18339);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z", line = 37)
    private final boolean method2296() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class170.field2814.method959(true, this.field5076[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 49)
    public static void method2297() {
        field5067 = null;
        field5071 = null;
        field5072 = null;
        field5075 = null;
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() throws Throwable {
        if (this.field5066 != -1) {
            class230.method1630(this.field5066, this.field5074, this.field5070);
            this.field5066 = -1;
            this.field5074 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V", line = 78)
    public final void method2298() {
        GL var1 = class232.field3716;
        this.method2299();
        var1.glBindTexture(34067, this.field5066);
        if (this.field5076 == null || this.field5069 == 2) {
            return;
        }
        if (this.method2296()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field5076[var3];
                this.field5068 = class170.field2814.method951(false, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field5068;
                } else if (this.field5068 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class170.field2814.method942(var4, -20467));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class230.field3663 += var6 - this.field5074;
            this.field5074 = var6;
            this.field5069 = 2;
        } else if (this.field5069 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class170.field2812, class170.field2814.method945(this.field5076[var7], 255), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class230.field3663 += 3 - this.field5074;
                this.field5074 = 3;
            }
            this.field5069 = 1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 321)
    public class328() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5076 = new int[6];
        this.field5076[0] = arg0;
        this.field5076[1] = arg1;
        this.field5076[2] = arg2;
        this.field5076[3] = arg3;
        this.field5076[4] = arg4;
        this.field5076[5] = arg5;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V", line = 156)
    private final void method2299() {
        if (this.field5066 >= 0 && class230.field3658 == this.field5070) {
            return;
        }
        GL var1 = class232.field3716;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field5066 = var2[0];
        var1.glBindTexture(34067, this.field5066);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field5070 = class230.field3658;
        this.field5069 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lha;Lha;F)Lha;", line = 175)
    public final class328 method2300(class328 arg0, class328 arg1, float arg2) {
        GL var4 = class232.field3716;
        class328 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class232.field3692) {
            return var5;
        }
        this.method2299();
        if (field5071 == null || field5073 != class230.field3658) {
            field5071 = new int[2];
            var4.glGenTextures(2, field5071, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class232.method1662(field5071[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field5073 = class230.field3658;
        }
        int var7 = arg0.field5068 > arg1.field5068 ? arg0.field5068 : arg1.field5068;
        if (this.field5068 != var7) {
            this.field5068 = var7;
            var4.glBindTexture(34067, this.field5066);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field5068, this.field5068, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method2298();
        arg1.method2298();
        class75.method513(field5075);
        class75.method508();
        class299.method2129(class232.method1685());
        var4.glPushAttrib(2048);
        class232.method1647(false);
        class232.method1660(false);
        class232.method1674(false);
        class232.method1677(1);
        class232.method1664(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field5068, 0.0D, (double) this.field5068, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field5068, this.field5068);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field5071[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field5072[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field5072, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method2294(var4, arg0.field5066, var11, arg0.field5068, field5071[0])) {
                var9 = false;
                break;
            }
            if (!method2294(var4, arg1.field5066, var11, arg1.field5068, field5071[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field5066, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class232.method1662(field5071[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field5068, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field5068, this.field5068);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field5068);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class232.method1674(true);
        class232.method1660(true);
        class232.method1647(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class299.method2130();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class75.method511(field5075);
        return var9 ? this : var5;
    }
}

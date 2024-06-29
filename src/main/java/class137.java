import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class137 extends class312 {

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    private int field2121 = -1;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    private int field2122 = 0;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    private int field2124 = -1;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    private int field2126 = 0;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[I")
    private int[] field2123;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "Lkn;")
    public static class52 field2125 = new class52(4);

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "[F")
    private static float[] field2129 = new float[4];

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "[I")
    private static int[] field2127 = null;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private static int field2128 = -1;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "[I")
    private static int[] field2131 = new int[4];

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 9)
    private static final boolean method931(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class333.method2282(arg4);
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

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 288)
    public class137() {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIII)V", line = 290)
    private class137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2123 = new int[6];
        this.field2123[0] = arg0;
        this.field2123[1] = arg1;
        this.field2123[2] = arg2;
        this.field2123[3] = arg3;
        this.field2123[4] = arg4;
        this.field2123[5] = arg5;
    }

    @OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() throws Throwable {
        if (this.field2121 != -1) {
            class301.method1983(this.field2121, this.field2122, this.field2130);
            this.field2121 = -1;
            this.field2122 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V", line = 40)
    public final void method932() {
        GL var1 = class333.field5160;
        this.method937();
        var1.glBindTexture(34067, this.field2121);
        if (this.field2123 == null || this.field2126 == 2) {
            return;
        }
        if (this.method935()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field2123[var3];
                this.field2124 = class12.field126.method471(var4, false) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field2124;
                } else if (this.field2124 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class12.field126.method475(var4, (byte) -87));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class301.field4648 += var6 - this.field2122;
            this.field2122 = var6;
            this.field2126 = 2;
        } else if (this.field2126 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class12.field129, class12.field126.method477(7053, this.field2123[var7]), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class301.field4648 += 3 - this.field2122;
                this.field2122 = 3;
            }
            this.field2126 = 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lee;Lee;F)Lee;", line = 112)
    public final class137 method933(class137 arg0, class137 arg1, float arg2) {
        GL var4 = class333.field5160;
        class137 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class333.field5142) {
            return var5;
        }
        this.method937();
        if (field2127 == null || class301.field4649 != field2128) {
            field2127 = new int[2];
            var4.glGenTextures(2, field2127, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class333.method2282(field2127[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field2128 = class301.field4649;
        }
        int var7 = arg0.field2124 > arg1.field2124 ? arg0.field2124 : arg1.field2124;
        if (this.field2124 != var7) {
            this.field2124 = var7;
            var4.glBindTexture(34067, this.field2121);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field2124, this.field2124, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method932();
        arg1.method932();
        class238.method1630(field2131);
        class238.method1629();
        class127.method857(class333.method2323());
        var4.glPushAttrib(2048);
        class333.method2312(false);
        class333.method2308(false);
        class333.method2316(false);
        class333.method2306(1);
        class333.method2285(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field2124, 0.0D, (double) this.field2124, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field2124, this.field2124);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field2127[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field2129[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field2129, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method931(var4, arg0.field2121, var11, arg0.field2124, field2127[0])) {
                var9 = false;
                break;
            }
            if (!method931(var4, arg1.field2121, var11, arg1.field2124, field2127[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field2121, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class333.method2282(field2127[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field2124, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field2124, this.field2124);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field2124);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class333.method2316(true);
        class333.method2308(true);
        class333.method2312(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class127.method851();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class238.method1620(field2131);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V", line = 258)
    public static void method934() {
        field2125 = null;
        field2127 = null;
        field2129 = null;
        field2131 = null;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()Z", line = 276)
    private final boolean method935() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class12.field126.method470((byte) -125, this.field2123[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)Lee;", line = 304)
    public static final class137 method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class137 var8 = (class137) field2125.method355(var6, 6487);
        if (var8 == null) {
            class137 var9 = new class137(arg0, arg1, arg2, arg3, arg4, arg5);
            field2125.method350(var6, var9, true);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()V", line = 315)
    private final void method937() {
        if (this.field2121 >= 0 && class301.field4649 == this.field2130) {
            return;
        }
        GL var1 = class333.field5160;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2121 = var2[0];
        var1.glBindTexture(34067, this.field2121);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field2130 = class301.field4649;
        this.field2126 = 0;
    }
}

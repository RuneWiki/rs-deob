import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class156 extends class29 {

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    private int field2390 = -1;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    private int field2394 = -1;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    private int field2391 = 0;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    private int field2399 = 0;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "[I")
    private int[] field2393;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lpm;")
    public static class111 field2389 = new class111(4);

    @OriginalMember(owner = "client!va", name = "F", descriptor = "[I")
    private static int[] field2395 = new int[4];

    @OriginalMember(owner = "client!va", name = "I", descriptor = "[I")
    private static int[] field2398 = null;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "[F")
    private static float[] field2392 = new float[4];

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    private static int field2397 = -1;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()Z", line = 7)
    private final boolean method1081() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class25.field365.method373(this.field2393[var1], -128)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V", line = 20)
    private final void method1082() {
        if (this.field2394 >= 0 && class275.field4359 == this.field2396) {
            return;
        }
        GL var1 = class186.field2990;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2394 = var2[0];
        var1.glBindTexture(34067, this.field2394);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field2396 = class275.field4359;
        this.field2391 = 0;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 321)
    public class156() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2393 = new int[6];
        this.field2393[0] = arg0;
        this.field2393[1] = arg1;
        this.field2393[2] = arg2;
        this.field2393[3] = arg3;
        this.field2393[4] = arg4;
        this.field2393[5] = arg5;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()V", line = 51)
    public final void method1083() {
        GL var1 = class186.field2990;
        this.method1082();
        var1.glBindTexture(34067, this.field2394);
        if (this.field2393 == null || this.field2391 == 2) {
            return;
        }
        if (this.method1081()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field2393[var3];
                this.field2390 = class25.field365.method383(var4, (byte) -128) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field2390;
                } else if (this.field2390 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class25.field365.method371(29, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class275.field4358 += var6 - this.field2399;
            this.field2399 = var6;
            this.field2391 = 2;
        } else if (this.field2391 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class25.field368, class25.field365.method376((byte) -122, this.field2393[var7]), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class275.field4358 += 3 - this.field2399;
                this.field2399 = 3;
            }
            this.field2391 = 1;
        }
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 115)
    protected final void finalize() throws Throwable {
        if (this.field2394 != -1) {
            class275.method1957(this.field2394, this.field2399, this.field2396);
            this.field2394 = -1;
            this.field2399 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)Lva;", line = 129)
    public static final class156 method1084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class156 var8 = (class156) field2389.method768(var6, false);
        if (var8 == null) {
            class156 var9 = new class156(arg0, arg1, arg2, arg3, arg4, arg5);
            field2389.method770(var9, 0, var6);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lva;Lva;F)Lva;", line = 144)
    public final class156 method1085(class156 arg0, class156 arg1, float arg2) {
        GL var4 = class186.field2990;
        class156 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class186.field3004) {
            return var5;
        }
        this.method1082();
        if (field2398 == null || class275.field4359 != field2397) {
            field2398 = new int[2];
            var4.glGenTextures(2, field2398, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class186.method1288(field2398[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field2397 = class275.field4359;
        }
        int var7 = arg0.field2390 > arg1.field2390 ? arg0.field2390 : arg1.field2390;
        if (this.field2390 != var7) {
            this.field2390 = var7;
            var4.glBindTexture(34067, this.field2394);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field2390, this.field2390, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method1083();
        arg1.method1083();
        class344.method2369(field2395);
        class344.method2372();
        class345.method2395(class186.method1317());
        var4.glPushAttrib(2048);
        class186.method1290(false);
        class186.method1316(false);
        class186.method1274(false);
        class186.method1281(1);
        class186.method1299(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field2390, 0.0D, (double) this.field2390, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field2390, this.field2390);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field2398[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field2392[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field2392, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method1087(var4, arg0.field2394, var11, arg0.field2390, field2398[0])) {
                var9 = false;
                break;
            }
            if (!method1087(var4, arg1.field2394, var11, arg1.field2390, field2398[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field2394, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class186.method1288(field2398[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field2390, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field2390, this.field2390);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field2390);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class186.method1274(true);
        class186.method1316(true);
        class186.method1290(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class345.method2390();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class344.method2370(field2395);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V", line = 288)
    public static void method1086() {
        field2389 = null;
        field2398 = null;
        field2392 = null;
        field2395 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 310)
    private static final boolean method1087(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class186.method1288(arg4);
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

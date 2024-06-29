import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class98 extends class213 {

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    private int field1287 = -1;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    private int field1291 = 0;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    private int field1288 = 0;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    private int field1292 = -1;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[I")
    private int[] field1285;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Ldj;")
    public static class143 field1284 = new class143(4);

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
    private static int[] field1286 = null;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
    private static int[] field1289 = new int[4];

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    private static int field1290 = -1;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "[F")
    private static float[] field1293 = new float[4];

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V", line = 7)
    private final void method702() {
        if (this.field1287 >= 0 && class298.field4320 == this.field1294) {
            return;
        }
        GL var1 = class47.field592;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1287 = var2[0];
        var1.glBindTexture(34067, this.field1287);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field1294 = class298.field4320;
        this.field1291 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V", line = 26)
    public static void method703() {
        field1284 = null;
        field1286 = null;
        field1293 = null;
        field1289 = null;
    }

    @OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        if (this.field1287 != -1) {
            class298.method2037(this.field1287, this.field1288, this.field1294);
            this.field1287 = -1;
            this.field1288 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V", line = 48)
    public final void method704() {
        GL var1 = class47.field592;
        this.method702();
        var1.glBindTexture(34067, this.field1287);
        if (this.field1285 == null || this.field1291 == 2) {
            return;
        }
        if (this.method706()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field1285[var3];
                this.field1292 = class350.field5467.method914(0, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field1292;
                } else if (this.field1292 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class350.field5467.method910(var4, (byte) 27));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class298.field4318 += var6 - this.field1288;
            this.field1288 = var6;
            this.field1291 = 2;
        } else if (this.field1291 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class350.field5463, class350.field5467.method907(this.field1285[var7], 65535), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class298.field4318 += 3 - this.field1288;
                this.field1288 = 3;
            }
            this.field1291 = 1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 321)
    public class98() {
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1285 = new int[6];
        this.field1285[0] = arg0;
        this.field1285[1] = arg1;
        this.field1285[2] = arg2;
        this.field1285[3] = arg3;
        this.field1285[4] = arg4;
        this.field1285[5] = arg5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lib;Lib;F)Lib;", line = 120)
    public final class98 method705(class98 arg0, class98 arg1, float arg2) {
        GL var4 = class47.field592;
        class98 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class47.field614) {
            return var5;
        }
        this.method702();
        if (field1286 == null || field1290 != class298.field4320) {
            field1286 = new int[2];
            var4.glGenTextures(2, field1286, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class47.method357(field1286[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field1290 = class298.field4320;
        }
        int var7 = arg0.field1292 > arg1.field1292 ? arg0.field1292 : arg1.field1292;
        if (this.field1292 != var7) {
            this.field1292 = var7;
            var4.glBindTexture(34067, this.field1287);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field1292, this.field1292, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method704();
        arg1.method704();
        class129.method982(field1289);
        class129.method994();
        class320.method2214(class47.method371());
        var4.glPushAttrib(2048);
        class47.method350(false);
        class47.method367(false);
        class47.method345(false);
        class47.method354(1);
        class47.method364(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field1292, 0.0D, (double) this.field1292, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field1292, this.field1292);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field1286[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field1293[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field1293, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method707(var4, arg0.field1287, var11, arg0.field1292, field1286[0])) {
                var9 = false;
                break;
            }
            if (!method707(var4, arg1.field1287, var11, arg1.field1292, field1286[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field1287, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class47.method357(field1286[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field1292, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field1292, this.field1292);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field1292);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class47.method345(true);
        class47.method367(true);
        class47.method350(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class320.method2213();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class129.method991(field1289);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()Z", line = 272)
    private final boolean method706() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class350.field5467.method909(this.field1285[var1], true)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 287)
    private static final boolean method707(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method357(arg4);
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

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIIII)Lib;", line = 301)
    public static final class98 method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class98 var8 = (class98) field1284.method1116(17301, var6);
        if (var8 == null) {
            class98 var9 = new class98(arg0, arg1, arg2, arg3, arg4, arg5);
            field1284.method1115(var6, 56, var9);
            return var9;
        } else {
            return var8;
        }
    }
}

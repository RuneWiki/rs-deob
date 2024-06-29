import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class88 extends class279 {

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    private int field1196 = 0;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    private int field1194 = 0;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    private int field1195 = -1;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    private int field1199 = -1;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "[I")
    private int[] field1197;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "Lod;")
    public static class223 field1198 = new class223(4);

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "[F")
    private static float[] field1200 = new float[4];

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private static int field1202 = -1;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "[I")
    private static int[] field1201 = null;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
    private static int[] field1203 = new int[4];

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)Lgb;", line = 7)
    public static final class88 method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class88 var8 = (class88) field1198.method1628(true, var6);
        if (var8 == null) {
            class88 var9 = new class88(arg0, arg1, arg2, arg3, arg4, arg5);
            field1198.method1627((byte) 97, var9, var6);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z", line = 21)
    private final boolean method632() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class31.field466.method457(this.field1197[var1], -83)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        if (this.field1195 != -1) {
            class103.method714(this.field1195, this.field1194, this.field1193);
            this.field1195 = -1;
            this.field1194 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V", line = 44)
    public final void method633() {
        GL var1 = class109.field1456;
        this.method636();
        var1.glBindTexture(34067, this.field1195);
        if (this.field1197 == null || this.field1196 == 2) {
            return;
        }
        if (this.method632()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field1197[var3];
                this.field1199 = class31.field466.method449(var4, true) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field1199;
                } else if (this.field1199 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class31.field466.method445(var4, (byte) -88));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class103.field1374 += var6 - this.field1194;
            this.field1194 = var6;
            this.field1196 = 2;
        } else if (this.field1196 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class31.field461, class31.field466.method458(17701, this.field1197[var7]), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class103.field1374 += 3 - this.field1194;
                this.field1194 = 3;
            }
            this.field1196 = 1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 318)
    public class88() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIII)V", line = 320)
    private class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1197 = new int[6];
        this.field1197[0] = arg0;
        this.field1197[1] = arg1;
        this.field1197[2] = arg2;
        this.field1197[3] = arg3;
        this.field1197[4] = arg4;
        this.field1197[5] = arg5;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V", line = 114)
    public static void method634() {
        field1198 = null;
        field1201 = null;
        field1200 = null;
        field1203 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 125)
    private static final boolean method635(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class109.method752(arg4);
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

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V", line = 141)
    private final void method636() {
        if (this.field1195 >= 0 && class103.field1369 == this.field1193) {
            return;
        }
        GL var1 = class109.field1456;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1195 = var2[0];
        var1.glBindTexture(34067, this.field1195);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field1193 = class103.field1369;
        this.field1196 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lgb;Lgb;F)Lgb;", line = 176)
    public final class88 method637(class88 arg0, class88 arg1, float arg2) {
        GL var4 = class109.field1456;
        class88 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class109.field1480) {
            return var5;
        }
        this.method636();
        if (field1201 == null || field1202 != class103.field1369) {
            field1201 = new int[2];
            var4.glGenTextures(2, field1201, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class109.method752(field1201[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field1202 = class103.field1369;
        }
        int var7 = arg0.field1199 > arg1.field1199 ? arg0.field1199 : arg1.field1199;
        if (this.field1199 != var7) {
            this.field1199 = var7;
            var4.glBindTexture(34067, this.field1195);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field1199, this.field1199, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method633();
        arg1.method633();
        class122.method881(field1203);
        class122.method898();
        class90.method651(class109.method771());
        var4.glPushAttrib(2048);
        class109.method740(false);
        class109.method749(false);
        class109.method753(false);
        class109.method766(1);
        class109.method756(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field1199, 0.0D, (double) this.field1199, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field1199, this.field1199);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field1201[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field1200[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field1200, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method635(var4, arg0.field1195, var11, arg0.field1199, field1201[0])) {
                var9 = false;
                break;
            }
            if (!method635(var4, arg1.field1195, var11, arg1.field1199, field1201[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field1195, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class109.method752(field1201[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field1199, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field1199, this.field1199);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field1199);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class109.method753(true);
        class109.method749(true);
        class109.method740(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class90.method653();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class122.method883(field1203);
        return var9 ? this : var5;
    }
}

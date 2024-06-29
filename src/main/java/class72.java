import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class72 extends class123 {

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    private int field1100 = 0;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    private int field1099 = -1;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    private int field1095 = -1;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    private int field1104 = 0;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "[I")
    private int[] field1097;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Lok;")
    public static class160 field1096 = new class160(4);

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "[F")
    private static float[] field1101 = new float[4];

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    private static int field1103 = -1;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "[I")
    private static int[] field1098 = null;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "[I")
    private static int[] field1102 = new int[4];

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()V", line = 8)
    public final void method577() {
        GL var1 = class162.field2654;
        this.method581();
        var1.glBindTexture(34067, this.field1095);
        if (this.field1097 == null || this.field1100 == 2) {
            return;
        }
        if (this.method583()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field1097[var3];
                this.field1099 = class40.field614.method264(108, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field1099;
                } else if (this.field1099 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class40.field614.method256(255, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class177.field2820 += var6 - this.field1104;
            this.field1104 = var6;
            this.field1100 = 2;
        } else if (this.field1100 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class40.field606, class40.field614.method251(false, this.field1097[var7]), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class177.field2820 += 3 - this.field1104;
                this.field1104 = 3;
            }
            this.field1100 = 1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)Lbn;", line = 74)
    public static final class72 method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class72 var8 = (class72) field1096.method1183(var6, (byte) -101);
        if (var8 == null) {
            class72 var9 = new class72(arg0, arg1, arg2, arg3, arg4, arg5);
            field1096.method1182((byte) -39, var6, var9);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lbn;Lbn;F)Lbn;", line = 86)
    public final class72 method579(class72 arg0, class72 arg1, float arg2) {
        GL var4 = class162.field2654;
        class72 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class162.field2655) {
            return var5;
        }
        this.method581();
        if (field1098 == null || field1103 != class177.field2819) {
            field1098 = new int[2];
            var4.glGenTextures(2, field1098, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class162.method1219(field1098[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field1103 = class177.field2819;
        }
        int var7 = arg0.field1099 > arg1.field1099 ? arg0.field1099 : arg1.field1099;
        if (this.field1099 != var7) {
            this.field1099 = var7;
            var4.glBindTexture(34067, this.field1095);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field1099, this.field1099, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method577();
        arg1.method577();
        class114.method898(field1102);
        class114.method892();
        class46.method397(class162.method1213());
        var4.glPushAttrib(2048);
        class162.method1207(false);
        class162.method1205(false);
        class162.method1193(false);
        class162.method1206(1);
        class162.method1211(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field1099, 0.0D, (double) this.field1099, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field1099, this.field1099);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field1098[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field1101[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field1101, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method580(var4, arg0.field1095, var11, arg0.field1099, field1098[0])) {
                var9 = false;
                break;
            }
            if (!method580(var4, arg1.field1095, var11, arg1.field1099, field1098[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field1095, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class162.method1219(field1098[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field1099, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field1099, this.field1099);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field1099);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class162.method1193(true);
        class162.method1205(true);
        class162.method1207(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class46.method398();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class114.method896(field1102);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 231)
    private static final boolean method580(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.method1219(arg4);
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

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 297)
    public class72() {
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIII)V", line = 309)
    private class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1097 = new int[6];
        this.field1097[0] = arg0;
        this.field1097[1] = arg1;
        this.field1097[2] = arg2;
        this.field1097[3] = arg3;
        this.field1097[4] = arg4;
        this.field1097[5] = arg5;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "()V", line = 252)
    private final void method581() {
        if (this.field1095 >= 0 && class177.field2819 == this.field1094) {
            return;
        }
        GL var1 = class162.field2654;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1095 = var2[0];
        var1.glBindTexture(34067, this.field1095);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field1094 = class177.field2819;
        this.field1100 = 0;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()V", line = 274)
    public static void method582() {
        field1096 = null;
        field1098 = null;
        field1101 = null;
        field1102 = null;
    }

    @OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V", line = 300)
    protected final void finalize() throws Throwable {
        if (this.field1095 != -1) {
            class177.method1308(this.field1095, this.field1104, this.field1094);
            this.field1095 = -1;
            this.field1104 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "()Z", line = 321)
    private final boolean method583() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class40.field614.method255(this.field1097[var1], 65535)) {
                return false;
            }
        }
        return true;
    }
}

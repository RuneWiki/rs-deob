import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class96 extends class320 {

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    private int field1450 = 0;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    private int field1453 = -1;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    private int field1455 = 0;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    private int field1459 = -1;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "[I")
    private int[] field1452;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "Ldf;")
    public static class177 field1451 = new class177(4);

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "[F")
    private static float[] field1454 = new float[4];

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "[I")
    private static int[] field1456 = null;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "[I")
    private static int[] field1458 = new int[4];

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    private static int field1460 = -1;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 5)
    public static void method842() {
        field1451 = null;
        field1456 = null;
        field1454 = null;
        field1458 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwm;Lwm;F)Lwm;", line = 12)
    public final class96 method843(class96 arg0, class96 arg1, float arg2) {
        GL var4 = class240.field3771;
        class96 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class240.field3730) {
            return var5;
        }
        this.method848();
        if (field1456 == null || field1460 != class28.field455) {
            field1456 = new int[2];
            var4.glGenTextures(2, field1456, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class240.method1786(field1456[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field1460 = class28.field455;
        }
        int var7 = arg0.field1453 > arg1.field1453 ? arg0.field1453 : arg1.field1453;
        if (this.field1453 != var7) {
            this.field1453 = var7;
            var4.glBindTexture(34067, this.field1459);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field1453, this.field1453, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method844();
        arg1.method844();
        class213.method1586(field1458);
        class213.method1596();
        class17.method181(class240.method1799());
        var4.glPushAttrib(2048);
        class240.method1815(false);
        class240.method1801(false);
        class240.method1807(false);
        class240.method1814(1);
        class240.method1806(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field1453, 0.0D, (double) this.field1453, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field1453, this.field1453);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field1456[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field1454[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field1454, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method847(var4, arg0.field1459, var11, arg0.field1453, field1456[0])) {
                var9 = false;
                break;
            }
            if (!method847(var4, arg1.field1459, var11, arg1.field1453, field1456[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field1459, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class240.method1786(field1456[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field1453, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field1453, this.field1453);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field1453);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class240.method1807(true);
        class240.method1801(true);
        class240.method1815(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class17.method177();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class213.method1583(field1458);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()V", line = 153)
    public final void method844() {
        GL var1 = class240.field3771;
        this.method848();
        var1.glBindTexture(34067, this.field1459);
        if (this.field1452 == null || this.field1450 == 2) {
            return;
        }
        if (this.method846()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field1452[var3];
                this.field1453 = class107.field1619.method751(var4, -53) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field1453;
                } else if (this.field1453 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class107.field1619.method761(25673, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class28.field459 += var6 - this.field1455;
            this.field1455 = var6;
            this.field1450 = 2;
        } else if (this.field1450 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class107.field1603, class107.field1619.method760(this.field1452[var7], 1), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class28.field459 += 3 - this.field1455;
                this.field1455 = 3;
            }
            this.field1450 = 1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 321)
    public class96() {
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1452 = new int[6];
        this.field1452[0] = arg0;
        this.field1452[1] = arg1;
        this.field1452[2] = arg2;
        this.field1452[3] = arg3;
        this.field1452[4] = arg4;
        this.field1452[5] = arg5;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)Lwm;", line = 224)
    public static final class96 method845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class96 var8 = (class96) field1451.method1386(-1, var6);
        if (var8 == null) {
            class96 var9 = new class96(arg0, arg1, arg2, arg3, arg4, arg5);
            field1451.method1385(var9, (byte) -30, var6);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "()Z", line = 243)
    private final boolean method846() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class107.field1619.method753(0, this.field1452[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 271)
    private static final boolean method847(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.method1786(arg4);
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

    @OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V", line = 286)
    protected final void finalize() throws Throwable {
        if (this.field1459 != -1) {
            class28.method324(this.field1459, this.field1455, this.field1457);
            this.field1459 = -1;
            this.field1455 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "()V", line = 301)
    private final void method848() {
        if (this.field1459 >= 0 && class28.field455 == this.field1457) {
            return;
        }
        GL var1 = class240.field3771;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1459 = var2[0];
        var1.glBindTexture(34067, this.field1459);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field1457 = class28.field455;
        this.field1450 = 0;
    }
}

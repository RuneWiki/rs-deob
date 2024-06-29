import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class35 extends class308 {

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    private int field538 = -1;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    private int field540 = 0;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    private int field537 = 0;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    private int field535 = -1;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "[I")
    private int[] field534;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "Lmi;")
    public static class227 field533 = new class227(4);

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    private static int field541 = -1;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "[I")
    private static int[] field542 = new int[4];

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "[F")
    private static float[] field539 = new float[4];

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "[I")
    private static int[] field543 = null;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)Lqh;", line = 9)
    public static final class35 method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class35 var8 = (class35) field533.method1539(-115, var6);
        if (var8 == null) {
            class35 var9 = new class35(arg0, arg1, arg2, arg3, arg4, arg5);
            field533.method1538(120, var6, var9);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!qh", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        if (this.field538 != -1) {
            class173.method1198(this.field538, this.field540, this.field536);
            this.field538 = -1;
            this.field540 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 31)
    public final void method292() {
        GL var1 = class245.field3884;
        this.method295();
        var1.glBindTexture(34067, this.field538);
        if (this.field534 == null || this.field537 == 2) {
            return;
        }
        if (this.method296()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field534[var3];
                this.field535 = class272.field4467.method403((byte) -119, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field535;
                } else if (this.field535 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class272.field4467.method410(false, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class173.field2704 += var6 - this.field540;
            this.field540 = var6;
            this.field537 = 2;
        } else if (this.field537 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class272.field4474, class272.field4467.method405(this.field534[var7], -8237), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class173.field2704 += 3 - this.field540;
                this.field540 = 3;
            }
            this.field537 = 1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 98)
    private static final boolean method293(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class245.method1729(arg4);
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

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lqh;Lqh;F)Lqh;", line = 113)
    public final class35 method294(class35 arg0, class35 arg1, float arg2) {
        GL var4 = class245.field3884;
        class35 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class245.field3889) {
            return var5;
        }
        this.method295();
        if (field543 == null || field541 != class173.field2703) {
            field543 = new int[2];
            var4.glGenTextures(2, field543, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class245.method1729(field543[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field541 = class173.field2703;
        }
        int var7 = arg0.field535 > arg1.field535 ? arg0.field535 : arg1.field535;
        if (this.field535 != var7) {
            this.field535 = var7;
            var4.glBindTexture(34067, this.field538);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field535, this.field535, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method292();
        arg1.method292();
        class335.method2372(field542);
        class335.method2379();
        class93.method622(class245.method1728());
        var4.glPushAttrib(2048);
        class245.method1743(false);
        class245.method1740(false);
        class245.method1742(false);
        class245.method1721(1);
        class245.method1709(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field535, 0.0D, (double) this.field535, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field535, this.field535);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field543[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field539[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field539, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method293(var4, arg0.field538, var11, arg0.field535, field543[0])) {
                var9 = false;
                break;
            }
            if (!method293(var4, arg1.field538, var11, arg1.field535, field543[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field538, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class245.method1729(field543[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field535, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field535, this.field535);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field535);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class245.method1742(true);
        class245.method1740(true);
        class245.method1743(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class93.method617();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class335.method2367(field542);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()V", line = 253)
    private final void method295() {
        if (this.field538 >= 0 && class173.field2703 == this.field536) {
            return;
        }
        GL var1 = class245.field3884;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field538 = var2[0];
        var1.glBindTexture(34067, this.field538);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field536 = class173.field2703;
        this.field537 = 0;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()Z", line = 275)
    private final boolean method296() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class272.field4467.method395(this.field534[var1], -112)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 318)
    public class35() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field534 = new int[6];
        this.field534[0] = arg0;
        this.field534[1] = arg1;
        this.field534[2] = arg2;
        this.field534[3] = arg3;
        this.field534[4] = arg4;
        this.field534[5] = arg5;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()V", line = 296)
    public static void method297() {
        field533 = null;
        field543 = null;
        field539 = null;
        field542 = null;
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class16 extends class150 {

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    private int field233 = -1;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    private int field235 = 0;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    private int field234 = -1;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    private int field236 = 0;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method110(byte[] arg0, int[] arg1) {
        this.field239 = class313.method2175((byte) 62, this.field2341);
        this.field238 = class313.method2175((byte) 99, this.field2351);
        byte[] var3 = new byte[this.field239 * this.field238 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2351; var6++) {
            for (int var7 = 0; var7 < this.field2341; var7++) {
                byte var8 = arg0[var5++];
                if (var8 == 0) {
                    var4 += 4;
                } else {
                    int var9 = arg1[var8];
                    var3[var4++] = (byte) (var9 >> 16);
                    var3[var4++] = (byte) (var9 >> 8);
                    var3[var4++] = (byte) var9;
                    var3[var4++] = -1;
                }
            }
            var4 += (this.field239 - this.field2341) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class255.field4181;
        if (this.field233 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field233 = var12[0];
            this.field237 = class197.field3058;
        }
        class255.method1790(this.field233);
        var11.glTexImage2D(3553, 0, 6408, this.field239, this.field238, 0, 6408, 5121, var10);
        class197.field3060 += var10.limit() - this.field236;
        this.field236 = var10.limit();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V", line = 64)
    public final void method111(int arg0, int arg1, int arg2) {
        class255.method1768();
        int var4 = this.field2353 + arg0;
        int var5 = this.field2344 + arg1;
        GL var6 = class255.field4181;
        class255.method1790(this.field233);
        this.method112(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class255.field4188 - var5), 0.0F);
        var6.glCallList(this.field234);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 77)
    private final void method112(int arg0) {
        if (this.field235 == arg0) {
            return;
        }
        this.field235 = arg0;
        GL var2 = class255.field4181;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 97)
    public final void method113(int arg0, int arg1) {
        class255.method1762();
        int var3 = this.field2353 + arg0;
        int var4 = this.field2344 + arg1;
        GL var5 = class255.field4181;
        class255.method1790(this.field233);
        this.method112(1);
        var5.glTranslatef((float) var3, (float) (class255.field4188 - var4), 0.0F);
        var5.glCallList(this.field234);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2352 = arg0;
        this.field2349 = arg1;
        this.field2353 = arg2;
        this.field2344 = arg3;
        this.field2341 = arg4;
        this.field2351 = arg5;
        this.method110(arg6, arg7);
        this.method114();
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V", line = 115)
    protected final void finalize() throws Throwable {
        if (this.field233 != -1) {
            class197.method1328(this.field233, this.field236, this.field237);
            this.field233 = -1;
            this.field236 = 0;
        }
        if (this.field234 != -1) {
            class197.method1323(this.field234, this.field237);
            this.field234 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V", line = 132)
    private final void method114() {
        float var1 = (float) this.field2341 / (float) this.field239;
        float var2 = (float) this.field2351 / (float) this.field238;
        GL var3 = class255.field4181;
        if (this.field234 == -1) {
            this.field234 = var3.glGenLists(1);
            this.field237 = class197.field3058;
        }
        var3.glNewList(this.field234, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2341, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2351));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2341, (float) (-this.field2351));
        var3.glEnd();
        var3.glEndList();
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class75 extends class129 {

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    private int field1408 = 0;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    private int field1411 = -1;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    private int field1410 = 0;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    private int field1412 = -1;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        if (this.field1411 != -1) {
            class263.method1863(this.field1411, this.field1408, this.field1407);
            this.field1411 = -1;
            this.field1408 = 0;
        }
        if (this.field1412 != -1) {
            class263.method1866(this.field1412, this.field1407);
            this.field1412 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 23)
    private final void method540() {
        float var1 = (float) this.field2294 / (float) this.field1413;
        float var2 = (float) this.field2299 / (float) this.field1409;
        GL var3 = class108.field1899;
        if (this.field1412 == -1) {
            this.field1412 = var3.glGenLists(1);
            this.field1407 = class263.field4547;
        }
        var3.glNewList(this.field1412, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2294, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2299));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2294, (float) (-this.field2299));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V", line = 49)
    public final void method541(int arg0, int arg1, int arg2) {
        class108.method772();
        int var4 = this.field2301 + arg0;
        int var5 = this.field2295 + arg1;
        GL var6 = class108.field1899;
        class108.method736(this.field1411);
        this.method542(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class108.field1916 - var5), 0.0F);
        var6.glCallList(this.field1412);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2298 = arg0;
        this.field2297 = arg1;
        this.field2301 = arg2;
        this.field2295 = arg3;
        this.field2294 = arg4;
        this.field2299 = arg5;
        this.method544(arg6, arg7);
        this.method540();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 66)
    private final void method542(int arg0) {
        if (this.field1410 == arg0) {
            return;
        }
        this.field1410 = arg0;
        GL var2 = class108.field1899;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V", line = 87)
    public final void method543(int arg0, int arg1) {
        class108.method744();
        int var3 = this.field2301 + arg0;
        int var4 = this.field2295 + arg1;
        GL var5 = class108.field1899;
        class108.method736(this.field1411);
        this.method542(1);
        var5.glTranslatef((float) var3, (float) (class108.field1916 - var4), 0.0F);
        var5.glCallList(this.field1412);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([B[I)V", line = 108)
    private final void method544(byte[] arg0, int[] arg1) {
        this.field1413 = class5.method28(-106, this.field2294);
        this.field1409 = class5.method28(-119, this.field2299);
        byte[] var3 = new byte[this.field1413 * this.field1409 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2299; var6++) {
            for (int var7 = 0; var7 < this.field2294; var7++) {
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
            var4 += (this.field1413 - this.field2294) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class108.field1899;
        if (this.field1411 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1411 = var12[0];
            this.field1407 = class263.field4547;
        }
        class108.method736(this.field1411);
        var11.glTexImage2D(3553, 0, 6408, this.field1413, this.field1409, 0, 6408, 5121, var10);
        class263.field4544 += var10.limit() - this.field1408;
        this.field1408 = var10.limit();
    }
}

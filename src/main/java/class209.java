import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class209 extends class274 {

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    private int field3342 = 0;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    private int field3346 = 0;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    private int field3344 = -1;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    private int field3340 = -1;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    private int field3345;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 5)
    private final void method1524(int arg0) {
        if (this.field3342 == arg0) {
            return;
        }
        this.field3342 = arg0;
        GL var2 = class265.field4099;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 26)
    private final void method1525() {
        float var1 = (float) this.field4264 / (float) this.field3341;
        float var2 = (float) this.field4256 / (float) this.field3345;
        GL var3 = class265.field4099;
        if (this.field3340 == -1) {
            this.field3340 = var3.glGenLists(1);
            this.field3343 = class214.field3409;
        }
        var3.glNewList(this.field3340, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4264, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4256));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4264, (float) (-this.field4256));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 54)
    public final void method1526(int arg0, int arg1) {
        class265.method1903();
        int var3 = this.field4262 + arg0;
        int var4 = this.field4267 + arg1;
        GL var5 = class265.field4099;
        class265.method1889(this.field3344);
        this.method1524(1);
        var5.glTranslatef((float) var3, (float) (class265.field4101 - var4), 0.0F);
        var5.glCallList(this.field3340);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V", line = 67)
    public final void method1527(int arg0, int arg1, int arg2) {
        class265.method1890();
        int var4 = this.field4262 + arg0;
        int var5 = this.field4267 + arg1;
        GL var6 = class265.field4099;
        class265.method1889(this.field3344);
        this.method1524(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class265.field4101 - var5), 0.0F);
        var6.glCallList(this.field3340);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4263 = arg0;
        this.field4266 = arg1;
        this.field4262 = arg2;
        this.field4267 = arg3;
        this.field4264 = arg4;
        this.field4256 = arg5;
        this.method1528(arg6, arg7);
        this.method1525();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([B[I)V", line = 93)
    private final void method1528(byte[] arg0, int[] arg1) {
        this.field3341 = class210.method1532(-1429694904, this.field4264);
        this.field3345 = class210.method1532(-1429694904, this.field4256);
        byte[] var3 = new byte[this.field3345 * this.field3341 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4256; var6++) {
            for (int var7 = 0; var7 < this.field4264; var7++) {
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
            var4 += (this.field3341 - this.field4264) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class265.field4099;
        if (this.field3344 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3344 = var12[0];
            this.field3343 = class214.field3409;
        }
        class265.method1889(this.field3344);
        var11.glTexImage2D(3553, 0, 6408, this.field3341, this.field3345, 0, 6408, 5121, var10);
        class214.field3411 += var10.limit() - this.field3346;
        this.field3346 = var10.limit();
    }

    @OriginalMember(owner = "client!tl", name = "finalize", descriptor = "()V", line = 152)
    protected final void finalize() throws Throwable {
        if (this.field3344 != -1) {
            class214.method1551(this.field3344, this.field3346, this.field3343);
            this.field3344 = -1;
            this.field3346 = 0;
        }
        if (this.field3340 != -1) {
            class214.method1550(this.field3340, this.field3343);
            this.field3340 = -1;
        }
        super.finalize();
    }
}

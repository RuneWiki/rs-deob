import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class302 extends class189 {

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    private int field5151 = -1;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    private int field5153 = 0;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    private int field5152 = 0;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    private int field5154 = -1;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    private int field5150;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    private int field5155;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    private int field5156;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method2104(byte[] arg0, int[] arg1) {
        this.field5155 = class43.method293(true, this.field3162);
        this.field5150 = class43.method293(true, this.field3157);
        byte[] var3 = new byte[this.field5155 * this.field5150 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3157; var6++) {
            for (int var7 = 0; var7 < this.field3162; var7++) {
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
            var4 += (this.field5155 - this.field3162) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class55.field812;
        if (this.field5154 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field5154 = var12[0];
            this.field5156 = class104.field1712;
        }
        class55.method407(this.field5154);
        var11.glTexImage2D(3553, 0, 6408, this.field5155, this.field5150, 0, 6408, 5121, var10);
        class104.field1714 += var10.limit() - this.field5153;
        this.field5153 = var10.limit();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 65)
    private final void method2105() {
        float var1 = (float) this.field3162 / (float) this.field5155;
        float var2 = (float) this.field3157 / (float) this.field5150;
        GL var3 = class55.field812;
        if (this.field5151 == -1) {
            this.field5151 = var3.glGenLists(1);
            this.field5156 = class104.field1712;
        }
        var3.glNewList(this.field5151, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3162, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3157));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3162, (float) (-this.field3157));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 92)
    public final void method38(int arg0, int arg1) {
        class55.method410();
        int var3 = this.field3165 + arg0;
        int var4 = this.field3171 + arg1;
        GL var5 = class55.field812;
        class55.method407(this.field5154);
        this.method2106(1);
        var5.glTranslatef((float) var3, (float) (class55.field806 - var4), 0.0F);
        var5.glCallList(this.field5151);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 154)
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3173 = arg0;
        this.field3168 = arg1;
        this.field3165 = arg2;
        this.field3171 = arg3;
        this.field3162 = arg4;
        this.field3157 = arg5;
        this.method2104(arg6, arg7);
        this.method2105();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V", line = 119)
    public final void method39(int arg0, int arg1, int arg2) {
        class55.method394();
        int var4 = this.field3165 + arg0;
        int var5 = this.field3171 + arg1;
        GL var6 = class55.field812;
        class55.method407(this.field5154);
        this.method2106(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class55.field806 - var5), 0.0F);
        var6.glCallList(this.field5151);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 132)
    private final void method2106(int arg0) {
        if (this.field5152 == arg0) {
            return;
        }
        this.field5152 = arg0;
        GL var2 = class55.field812;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 165)
    protected final void finalize() throws Throwable {
        if (this.field5154 != -1) {
            class104.method790(this.field5154, this.field5153, this.field5156);
            this.field5154 = -1;
            this.field5153 = 0;
        }
        if (this.field5151 != -1) {
            class104.method784(this.field5151, this.field5156);
            this.field5151 = -1;
        }
        super.finalize();
    }
}

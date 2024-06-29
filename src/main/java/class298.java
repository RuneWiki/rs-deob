import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class298 extends class74 {

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    private int field5010 = -1;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    private int field5009 = 0;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    private int field5007 = -1;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    private int field5012 = 0;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    private int field5013;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V", line = 10)
    public final void method527(int arg0, int arg1, int arg2) {
        class45.method308();
        int var4 = this.field1170 + arg0;
        int var5 = this.field1165 + arg1;
        GL var6 = class45.field688;
        class45.method321(this.field5010);
        this.method2010(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class45.field667 - var5), 0.0F);
        var6.glCallList(this.field5007);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() throws Throwable {
        if (this.field5010 != -1) {
            class36.method259(this.field5010, this.field5012, this.field5008);
            this.field5010 = -1;
            this.field5012 = 0;
        }
        if (this.field5007 != -1) {
            class36.method261(this.field5007, this.field5008);
            this.field5007 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 39)
    public final void method525(int arg0, int arg1) {
        class45.method331();
        int var3 = this.field1170 + arg0;
        int var4 = this.field1165 + arg1;
        GL var5 = class45.field688;
        class45.method321(this.field5010);
        this.method2010(1);
        var5.glTranslatef((float) var3, (float) (class45.field667 - var4), 0.0F);
        var5.glCallList(this.field5007);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1162 = arg0;
        this.field1171 = arg1;
        this.field1170 = arg2;
        this.field1165 = arg3;
        this.field1163 = arg4;
        this.field1172 = arg5;
        this.method2011(arg6, arg7);
        this.method2012();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 65)
    private final void method2010(int arg0) {
        if (this.field5009 == arg0) {
            return;
        }
        this.field5009 = arg0;
        GL var2 = class45.field688;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([B[I)V", line = 84)
    private final void method2011(byte[] arg0, int[] arg1) {
        this.field5013 = class275.method1871(this.field1163, 1110164296);
        this.field5011 = class275.method1871(this.field1172, 1110164296);
        byte[] var3 = new byte[this.field5013 * this.field5011 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1172; var6++) {
            for (int var7 = 0; var7 < this.field1163; var7++) {
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
            var4 += (this.field5013 - this.field1163) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class45.field688;
        if (this.field5010 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field5010 = var12[0];
            this.field5008 = class36.field576;
        }
        class45.method321(this.field5010);
        var11.glTexImage2D(3553, 0, 6408, this.field5013, this.field5011, 0, 6408, 5121, var10);
        class36.field573 += var10.limit() - this.field5012;
        this.field5012 = var10.limit();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 146)
    private final void method2012() {
        float var1 = (float) this.field1163 / (float) this.field5013;
        float var2 = (float) this.field1172 / (float) this.field5011;
        GL var3 = class45.field688;
        if (this.field5007 == -1) {
            this.field5007 = var3.glGenLists(1);
            this.field5008 = class36.field576;
        }
        var3.glNewList(this.field5007, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1163, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1172));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1163, (float) (-this.field1172));
        var3.glEnd();
        var3.glEndList();
    }
}

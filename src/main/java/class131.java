import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class131 extends class87 {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    private int field2211 = -1;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    private int field2215 = 0;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    private int field2214 = 0;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    private int field2213 = -1;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    private int field2216;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method817(byte[] arg0, int[] arg1) {
        this.field2212 = class53.method336(-1753429918, this.field1464);
        this.field2216 = class53.method336(-1753429918, this.field1465);
        byte[] var3 = new byte[this.field2216 * this.field2212 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1465; var6++) {
            for (int var7 = 0; var7 < this.field1464; var7++) {
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
            var4 += (this.field2212 - this.field1464) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class167.field2806;
        if (this.field2213 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2213 = var12[0];
            this.field2217 = class101.field1723;
        }
        class167.method1033(this.field2213);
        var11.glTexImage2D(3553, 0, 6408, this.field2212, this.field2216, 0, 6408, 5121, var10);
        class101.field1722 += var10.limit() - this.field2214;
        this.field2214 = var10.limit();
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1468 = arg0;
        this.field1475 = arg1;
        this.field1474 = arg2;
        this.field1470 = arg3;
        this.field1464 = arg4;
        this.field1465 = arg5;
        this.method817(arg6, arg7);
        this.method819();
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 72)
    private final void method818(int arg0) {
        if (this.field2215 == arg0) {
            return;
        }
        this.field2215 = arg0;
        GL var2 = class167.field2806;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V", line = 91)
    protected final void finalize() throws Throwable {
        if (this.field2213 != -1) {
            class101.method671(this.field2213, this.field2214, this.field2217);
            this.field2213 = -1;
            this.field2214 = 0;
        }
        if (this.field2211 != -1) {
            class101.method670(this.field2211, this.field2217);
            this.field2211 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 120)
    public final void method560(int arg0, int arg1) {
        class167.method1054();
        int var3 = this.field1474 + arg0;
        int var4 = this.field1470 + arg1;
        GL var5 = class167.field2806;
        class167.method1033(this.field2213);
        this.method818(1);
        var5.glTranslatef((float) var3, (float) (class167.field2808 - var4), 0.0F);
        var5.glCallList(this.field2211);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V", line = 132)
    public final void method562(int arg0, int arg1, int arg2) {
        class167.method1027();
        int var4 = this.field1474 + arg0;
        int var5 = this.field1470 + arg1;
        GL var6 = class167.field2806;
        class167.method1033(this.field2213);
        this.method818(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class167.field2808 - var5), 0.0F);
        var6.glCallList(this.field2211);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V", line = 146)
    private final void method819() {
        float var1 = (float) this.field1464 / (float) this.field2212;
        float var2 = (float) this.field1465 / (float) this.field2216;
        GL var3 = class167.field2806;
        if (this.field2211 == -1) {
            this.field2211 = var3.glGenLists(1);
            this.field2217 = class101.field1723;
        }
        var3.glNewList(this.field2211, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1464, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1465));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1464, (float) (-this.field1465));
        var3.glEnd();
        var3.glEndList();
    }
}

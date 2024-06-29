import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class143 extends class18 {

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private int field2268 = -1;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    private int field2272 = -1;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    private int field2271 = 0;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    private int field2270 = 0;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    private int field2267;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    private int field2269;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    private int field2273;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V", line = 6)
    private final void method1065() {
        float var1 = (float) this.field297 / (float) this.field2273;
        float var2 = (float) this.field290 / (float) this.field2269;
        GL var3 = class109.field1456;
        if (this.field2272 == -1) {
            this.field2272 = var3.glGenLists(1);
            this.field2267 = class103.field1369;
        }
        var3.glNewList(this.field2272, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field297, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field290));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field297, (float) (-this.field290));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V", line = 33)
    public final void method198(int arg0, int arg1) {
        class109.method761();
        int var3 = this.field298 + arg0;
        int var4 = this.field296 + arg1;
        GL var5 = class109.field1456;
        class109.method752(this.field2268);
        this.method1066(1);
        var5.glTranslatef((float) var3, (float) (class109.field1499 - var4), 0.0F);
        var5.glCallList(this.field2272);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 47)
    private final void method1066(int arg0) {
        if (this.field2271 == arg0) {
            return;
        }
        this.field2271 = arg0;
        GL var2 = class109.field1456;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!bb", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() throws Throwable {
        if (this.field2268 != -1) {
            class103.method718(this.field2268, this.field2270, this.field2267);
            this.field2268 = -1;
            this.field2270 = 0;
        }
        if (this.field2272 != -1) {
            class103.method720(this.field2272, this.field2267);
            this.field2272 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([B[I)V", line = 82)
    private final void method1067(byte[] arg0, int[] arg1) {
        this.field2273 = class215.method1568(479166497, this.field297);
        this.field2269 = class215.method1568(479166497, this.field290);
        byte[] var3 = new byte[this.field2273 * this.field2269 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field290; var6++) {
            for (int var7 = 0; var7 < this.field297; var7++) {
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
            var4 += (this.field2273 - this.field297) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class109.field1456;
        if (this.field2268 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2268 = var12[0];
            this.field2267 = class103.field1369;
        }
        class109.method752(this.field2268);
        var11.glTexImage2D(3553, 0, 6408, this.field2273, this.field2269, 0, 6408, 5121, var10);
        class103.field1370 += var10.limit() - this.field2270;
        this.field2270 = var10.limit();
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 169)
    public class143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field284 = arg0;
        this.field289 = arg1;
        this.field298 = arg2;
        this.field296 = arg3;
        this.field297 = arg4;
        this.field290 = arg5;
        this.method1067(arg6, arg7);
        this.method1065();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V", line = 156)
    public final void method195(int arg0, int arg1, int arg2) {
        class109.method754();
        int var4 = this.field298 + arg0;
        int var5 = this.field296 + arg1;
        GL var6 = class109.field1456;
        class109.method752(this.field2268);
        this.method1066(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class109.field1499 - var5), 0.0F);
        var6.glCallList(this.field2272);
        var6.glLoadIdentity();
    }
}

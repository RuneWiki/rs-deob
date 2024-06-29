import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class140 extends class79 {

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    private int field2158 = -1;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    private int field2159 = -1;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    private int field2164 = 0;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    private int field2163 = 0;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    private int field2162;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V", line = 7)
    private final void method949(int arg0) {
        if (this.field2164 == arg0) {
            return;
        }
        this.field2164 = arg0;
        GL var2 = class333.field5160;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!eh", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() throws Throwable {
        if (this.field2159 != -1) {
            class301.method1979(this.field2159, this.field2163, this.field2162);
            this.field2159 = -1;
            this.field2163 = 0;
        }
        if (this.field2158 != -1) {
            class301.method1978(this.field2158, this.field2162);
            this.field2158 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 42)
    public final void method159(int arg0, int arg1) {
        class333.method2310();
        int var3 = this.field1168 + arg0;
        int var4 = this.field1165 + arg1;
        GL var5 = class333.field5160;
        class333.method2282(this.field2159);
        this.method949(1);
        var5.glTranslatef((float) var3, (float) (class333.field5182 - var4), 0.0F);
        var5.glCallList(this.field2158);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1171 = arg0;
        this.field1175 = arg1;
        this.field1168 = arg2;
        this.field1165 = arg3;
        this.field1166 = arg4;
        this.field1170 = arg5;
        this.method951(arg6, arg7);
        this.method950();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 61)
    private final void method950() {
        float var1 = (float) this.field1166 / (float) this.field2160;
        float var2 = (float) this.field1170 / (float) this.field2161;
        GL var3 = class333.field5160;
        if (this.field2158 == -1) {
            this.field2158 = var3.glGenLists(1);
            this.field2162 = class301.field4649;
        }
        var3.glNewList(this.field2158, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1166, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1170));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1166, (float) (-this.field1170));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([B[I)V", line = 87)
    private final void method951(byte[] arg0, int[] arg1) {
        this.field2160 = class47.method330((byte) 29, this.field1166);
        this.field2161 = class47.method330((byte) 18, this.field1170);
        byte[] var3 = new byte[this.field2161 * this.field2160 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1170; var6++) {
            for (int var7 = 0; var7 < this.field1166; var7++) {
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
            var4 += (this.field2160 - this.field1166) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class333.field5160;
        if (this.field2159 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2159 = var12[0];
            this.field2162 = class301.field4649;
        }
        class333.method2282(this.field2159);
        var11.glTexImage2D(3553, 0, 6408, this.field2160, this.field2161, 0, 6408, 5121, var10);
        class301.field4647 += var10.limit() - this.field2163;
        this.field2163 = var10.limit();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V", line = 155)
    public final void method157(int arg0, int arg1, int arg2) {
        class333.method2281();
        int var4 = this.field1168 + arg0;
        int var5 = this.field1165 + arg1;
        GL var6 = class333.field5160;
        class333.method2282(this.field2159);
        this.method949(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class333.field5182 - var5), 0.0F);
        var6.glCallList(this.field2158);
        var6.glLoadIdentity();
    }
}

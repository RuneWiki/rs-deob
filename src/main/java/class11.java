import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class11 extends class314 {

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    private int field138 = -1;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    private int field141 = 0;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    private int field143 = 0;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    private int field144 = -1;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        if (this.field144 != -1) {
            class103.method713(this.field144, this.field141, this.field139);
            this.field144 = -1;
            this.field141 = 0;
        }
        if (this.field138 != -1) {
            class103.method716(this.field138, this.field139);
            this.field138 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 24)
    private final void method41() {
        float var1 = (float) this.field5306 / (float) this.field142;
        float var2 = (float) this.field5300 / (float) this.field140;
        GL var3 = class166.field2648;
        if (this.field138 == -1) {
            this.field138 = var3.glGenLists(1);
            this.field139 = class103.field1460;
        }
        var3.glNewList(this.field138, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field5306, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field5300));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field5306, (float) (-this.field5300));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field5292 = arg0;
        this.field5291 = arg1;
        this.field5304 = arg2;
        this.field5290 = arg3;
        this.field5306 = arg4;
        this.field5300 = arg5;
        this.method42(arg6, arg7);
        this.method41();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([B[I)V", line = 55)
    private final void method42(byte[] arg0, int[] arg1) {
        this.field142 = class110.method746(this.field5306, -705295902);
        this.field140 = class110.method746(this.field5300, -705295902);
        byte[] var3 = new byte[this.field142 * this.field140 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field5300; var6++) {
            for (int var7 = 0; var7 < this.field5306; var7++) {
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
            var4 += (this.field142 - this.field5306) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class166.field2648;
        if (this.field144 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field144 = var12[0];
            this.field139 = class103.field1460;
        }
        class166.method1182(this.field144);
        var11.glTexImage2D(3553, 0, 6408, this.field142, this.field140, 0, 6408, 5121, var10);
        class103.field1458 += var10.limit() - this.field141;
        this.field141 = var10.limit();
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)V", line = 118)
    public final void method43(int arg0, int arg1, int arg2) {
        class166.method1176();
        int var4 = this.field5304 + arg0;
        int var5 = this.field5290 + arg1;
        GL var6 = class166.field2648;
        class166.method1182(this.field144);
        this.method45(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class166.field2651 - var5), 0.0F);
        var6.glCallList(this.field138);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 132)
    public final void method44(int arg0, int arg1) {
        class166.method1189();
        int var3 = this.field5304 + arg0;
        int var4 = this.field5290 + arg1;
        GL var5 = class166.field2648;
        class166.method1182(this.field144);
        this.method45(1);
        var5.glTranslatef((float) var3, (float) (class166.field2651 - var4), 0.0F);
        var5.glCallList(this.field138);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 144)
    private final void method45(int arg0) {
        if (this.field143 == arg0) {
            return;
        }
        this.field143 = arg0;
        GL var2 = class166.field2648;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}

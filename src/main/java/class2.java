import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class2 extends class4 {

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    private int field18 = -1;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    private int field21 = 0;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    private int field16 = -1;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method6(byte[] arg0, int[] arg1) {
        this.field20 = class110.method804(this.field28, (byte) 72);
        this.field17 = class110.method804(this.field38, (byte) 72);
        byte[] var3 = new byte[this.field20 * this.field17 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field38; var6++) {
            for (int var7 = 0; var7 < this.field28; var7++) {
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
            var4 += (this.field20 - this.field28) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class67.field899;
        if (this.field18 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field18 = var12[0];
            this.field19 = class180.field2413;
        }
        class67.method479(this.field18);
        var11.glTexImage2D(3553, 0, 6408, this.field20, this.field17, 0, 6408, 5121, var10);
        class180.field2414 += var10.limit() - this.field22;
        this.field22 = var10.limit();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V", line = 64)
    public final void method7(int arg0, int arg1, int arg2) {
        class67.method467();
        int var4 = this.field40 + arg0;
        int var5 = this.field32 + arg1;
        GL var6 = class67.field899;
        class67.method479(this.field18);
        this.method10(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class67.field897 - var5), 0.0F);
        var6.glCallList(this.field16);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 79)
    public final void method8(int arg0, int arg1) {
        class67.method455();
        int var3 = this.field40 + arg0;
        int var4 = this.field32 + arg1;
        GL var5 = class67.field899;
        class67.method479(this.field18);
        this.method10(1);
        var5.glTranslatef((float) var3, (float) (class67.field897 - var4), 0.0F);
        var5.glCallList(this.field16);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V", line = 92)
    private final void method9() {
        float var1 = (float) this.field28 / (float) this.field20;
        float var2 = (float) this.field38 / (float) this.field17;
        GL var3 = class67.field899;
        if (this.field16 == -1) {
            this.field16 = var3.glGenLists(1);
            this.field19 = class180.field2413;
        }
        var3.glNewList(this.field16, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field28, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field38));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field28, (float) (-this.field38));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field31 = arg0;
        this.field30 = arg1;
        this.field40 = arg2;
        this.field32 = arg3;
        this.field28 = arg4;
        this.field38 = arg5;
        this.method6(arg6, arg7);
        this.method9();
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 122)
    private final void method10(int arg0) {
        if (this.field21 == arg0) {
            return;
        }
        this.field21 = arg0;
        GL var2 = class67.field899;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V", line = 150)
    protected final void finalize() throws Throwable {
        if (this.field18 != -1) {
            class180.method1247(this.field18, this.field22, this.field19);
            this.field18 = -1;
            this.field22 = 0;
        }
        if (this.field16 != -1) {
            class180.method1244(this.field16, this.field19);
            this.field16 = -1;
        }
        super.finalize();
    }
}

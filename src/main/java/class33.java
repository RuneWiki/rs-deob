import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class33 extends class175 {

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    private int field546 = -1;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    private int field545 = -1;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    private int field547 = 0;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    private int field543 = 0;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([B[I)V", line = 6)
    private final void method277(byte[] arg0, int[] arg1) {
        this.field548 = class143.method1013((byte) 37, this.field3008);
        this.field544 = class143.method1013((byte) 50, this.field3011);
        byte[] var3 = new byte[this.field548 * this.field544 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3011; var6++) {
            for (int var7 = 0; var7 < this.field3008; var7++) {
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
            var4 += (this.field548 - this.field3008) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class123.field2212;
        if (this.field545 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field545 = var12[0];
            this.field542 = class285.field4893;
        }
        class123.method867(this.field545);
        var11.glTexImage2D(3553, 0, 6408, this.field548, this.field544, 0, 6408, 5121, var10);
        class285.field4890 += var10.limit() - this.field543;
        this.field543 = var10.limit();
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V", line = 65)
    private final void method278(int arg0) {
        if (this.field547 == arg0) {
            return;
        }
        this.field547 = arg0;
        GL var2 = class123.field2212;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 84)
    public final void method279(int arg0, int arg1) {
        class123.method863();
        int var3 = this.field3009 + arg0;
        int var4 = this.field3007 + arg1;
        GL var5 = class123.field2212;
        class123.method867(this.field545);
        this.method278(1);
        var5.glTranslatef((float) var3, (float) (class123.field2207 - var4), 0.0F);
        var5.glCallList(this.field546);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 98)
    private final void method280() {
        float var1 = (float) this.field3008 / (float) this.field548;
        float var2 = (float) this.field3011 / (float) this.field544;
        GL var3 = class123.field2212;
        if (this.field546 == -1) {
            this.field546 = var3.glGenLists(1);
            this.field542 = class285.field4893;
        }
        var3.glNewList(this.field546, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3008, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3011));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3008, (float) (-this.field3011));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3001 = arg0;
        this.field3003 = arg1;
        this.field3009 = arg2;
        this.field3007 = arg3;
        this.field3008 = arg4;
        this.field3011 = arg5;
        this.method277(arg6, arg7);
        this.method280();
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V", line = 129)
    protected final void finalize() throws Throwable {
        if (this.field545 != -1) {
            class285.method1974(this.field545, this.field543, this.field542);
            this.field545 = -1;
            this.field543 = 0;
        }
        if (this.field546 != -1) {
            class285.method1976(this.field546, this.field542);
            this.field546 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 157)
    public final void method281(int arg0, int arg1, int arg2) {
        class123.method899();
        int var4 = this.field3009 + arg0;
        int var5 = this.field3007 + arg1;
        GL var6 = class123.field2212;
        class123.method867(this.field545);
        this.method278(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class123.field2207 - var5), 0.0F);
        var6.glCallList(this.field546);
        var6.glLoadIdentity();
    }
}

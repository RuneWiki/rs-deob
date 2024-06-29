import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class232 extends class193 {

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    private int field3735 = -1;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    private int field3737 = 0;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field3738 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    private int field3732 = -1;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    private int field3733;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    private int field3736;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 5)
    public final void method1364(int arg0, int arg1, int arg2) {
        class90.method620();
        int var4 = this.field3142 + arg0;
        int var5 = this.field3146 + arg1;
        GL var6 = class90.field1390;
        class90.method617(this.field3735);
        this.method1578(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class90.field1379 - var5), 0.0F);
        var6.glCallList(this.field3732);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 19)
    private final void method1578(int arg0) {
        if (this.field3737 == arg0) {
            return;
        }
        this.field3737 = arg0;
        GL var2 = class90.field1390;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V", line = 39)
    public final void method1363(int arg0, int arg1) {
        class90.method610();
        int var3 = this.field3142 + arg0;
        int var4 = this.field3146 + arg1;
        GL var5 = class90.field1390;
        class90.method617(this.field3735);
        this.method1578(1);
        var5.glTranslatef((float) var3, (float) (class90.field1379 - var4), 0.0F);
        var5.glCallList(this.field3732);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        if (this.field3735 != -1) {
            class7.method31(this.field3735, this.field3738, this.field3736);
            this.field3735 = -1;
            this.field3738 = 0;
        }
        if (this.field3732 != -1) {
            class7.method29(this.field3732, this.field3736);
            this.field3732 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 169)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3134 = arg0;
        this.field3141 = arg1;
        this.field3142 = arg2;
        this.field3146 = arg3;
        this.field3139 = arg4;
        this.field3135 = arg5;
        this.method1579(arg6, arg7);
        this.method1580();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([B[I)V", line = 76)
    private final void method1579(byte[] arg0, int[] arg1) {
        this.field3734 = class180.method1294(true, this.field3139);
        this.field3733 = class180.method1294(true, this.field3135);
        byte[] var3 = new byte[this.field3734 * this.field3733 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3135; var6++) {
            for (int var7 = 0; var7 < this.field3139; var7++) {
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
            var4 += (this.field3734 - this.field3139) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class90.field1390;
        if (this.field3735 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3735 = var12[0];
            this.field3736 = class7.field91;
        }
        class90.method617(this.field3735);
        var11.glTexImage2D(3553, 0, 6408, this.field3734, this.field3733, 0, 6408, 5121, var10);
        class7.field90 += var10.limit() - this.field3738;
        this.field3738 = var10.limit();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 142)
    private final void method1580() {
        float var1 = (float) this.field3139 / (float) this.field3734;
        float var2 = (float) this.field3135 / (float) this.field3733;
        GL var3 = class90.field1390;
        if (this.field3732 == -1) {
            this.field3732 = var3.glGenLists(1);
            this.field3736 = class7.field91;
        }
        var3.glNewList(this.field3732, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3139, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3135));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3139, (float) (-this.field3135));
        var3.glEnd();
        var3.glEndList();
    }
}

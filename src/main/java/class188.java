import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class188 extends class59 {

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    private int field3446 = -1;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    private int field3447 = 0;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    private int field3445 = 0;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    private int field3443 = -1;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([B[I)V", line = 8)
    private final void method1346(byte[] arg0, int[] arg1) {
        this.field3448 = class117.method832(this.field889, (byte) 113);
        this.field3444 = class117.method832(this.field884, (byte) 66);
        byte[] var3 = new byte[this.field3448 * this.field3444 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field884; var6++) {
            for (int var7 = 0; var7 < this.field889; var7++) {
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
            var4 += (this.field3448 - this.field889) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class231.field4052;
        if (this.field3443 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3443 = var12[0];
            this.field3442 = class124.field2099;
        }
        class231.method1597(this.field3443);
        var11.glTexImage2D(3553, 0, 6408, this.field3448, this.field3444, 0, 6408, 5121, var10);
        class124.field2101 += var10.limit() - this.field3447;
        this.field3447 = var10.limit();
    }

    @OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() throws Throwable {
        if (this.field3443 != -1) {
            class124.method859(this.field3443, this.field3447, this.field3442);
            this.field3443 = -1;
            this.field3447 = 0;
        }
        if (this.field3446 != -1) {
            class124.method862(this.field3446, this.field3442);
            this.field3446 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 89)
    private final void method1347() {
        float var1 = (float) this.field889 / (float) this.field3448;
        float var2 = (float) this.field884 / (float) this.field3444;
        GL var3 = class231.field4052;
        if (this.field3446 == -1) {
            this.field3446 = var3.glGenLists(1);
            this.field3442 = class124.field2099;
        }
        var3.glNewList(this.field3446, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field889, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field884));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field889, (float) (-this.field884));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 114)
    public final void method404(int arg0, int arg1) {
        class231.method1590();
        int var3 = this.field878 + arg0;
        int var4 = this.field881 + arg1;
        GL var5 = class231.field4052;
        class231.method1597(this.field3443);
        this.method1348(1);
        var5.glTranslatef((float) var3, (float) (class231.field4079 - var4), 0.0F);
        var5.glCallList(this.field3446);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field888 = arg0;
        this.field886 = arg1;
        this.field878 = arg2;
        this.field881 = arg3;
        this.field889 = arg4;
        this.field884 = arg5;
        this.method1346(arg6, arg7);
        this.method1347();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V", line = 130)
    public final void method402(int arg0, int arg1, int arg2) {
        class231.method1578();
        int var4 = this.field878 + arg0;
        int var5 = this.field881 + arg1;
        GL var6 = class231.field4052;
        class231.method1597(this.field3443);
        this.method1348(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class231.field4079 - var5), 0.0F);
        var6.glCallList(this.field3446);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 149)
    private final void method1348(int arg0) {
        if (this.field3445 == arg0) {
            return;
        }
        this.field3445 = arg0;
        GL var2 = class231.field4052;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}

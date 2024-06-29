import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class232 extends class250 {

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    private int field3851 = 0;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    private int field3847 = -1;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private int field3852 = 0;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    private int field3853 = -1;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    private int field3849;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    private int field3850;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 8)
    private final void method1665() {
        float var1 = (float) this.field4054 / (float) this.field3848;
        float var2 = (float) this.field4048 / (float) this.field3849;
        GL var3 = class43.field651;
        if (this.field3853 == -1) {
            this.field3853 = var3.glGenLists(1);
            this.field3850 = class151.field2669;
        }
        var3.glNewList(this.field3853, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4054, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4048));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4054, (float) (-this.field4048));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 33)
    private final void method1666(int arg0) {
        if (this.field3851 == arg0) {
            return;
        }
        this.field3851 = arg0;
        GL var2 = class43.field651;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([B[I)V", line = 54)
    private final void method1667(byte[] arg0, int[] arg1) {
        this.field3848 = class168.method1318(this.field4054, false);
        this.field3849 = class168.method1318(this.field4048, false);
        byte[] var3 = new byte[this.field3849 * this.field3848 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4048; var6++) {
            for (int var7 = 0; var7 < this.field4054; var7++) {
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
            var4 += (this.field3848 - this.field4054) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class43.field651;
        if (this.field3847 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3847 = var12[0];
            this.field3850 = class151.field2669;
        }
        class43.method390(this.field3847);
        var11.glTexImage2D(3553, 0, 6408, this.field3848, this.field3849, 0, 6408, 5121, var10);
        class151.field2667 += var10.limit() - this.field3852;
        this.field3852 = var10.limit();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 112)
    public final void method1596(int arg0, int arg1) {
        class43.method391();
        int var3 = this.field4051 + arg0;
        int var4 = this.field4052 + arg1;
        GL var5 = class43.field651;
        class43.method390(this.field3847);
        this.method1666(1);
        var5.glTranslatef((float) var3, (float) (class43.field665 - var4), 0.0F);
        var5.glCallList(this.field3853);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V", line = 127)
    public final void method1604(int arg0, int arg1, int arg2) {
        class43.method384();
        int var4 = this.field4051 + arg0;
        int var5 = this.field4052 + arg1;
        GL var6 = class43.field651;
        class43.method390(this.field3847);
        this.method1666(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class43.field665 - var5), 0.0F);
        var6.glCallList(this.field3853);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4047 = arg0;
        this.field4050 = arg1;
        this.field4051 = arg2;
        this.field4052 = arg3;
        this.field4054 = arg4;
        this.field4048 = arg5;
        this.method1667(arg6, arg7);
        this.method1665();
    }

    @OriginalMember(owner = "client!lb", name = "finalize", descriptor = "()V", line = 144)
    protected final void finalize() throws Throwable {
        if (this.field3847 != -1) {
            class151.method1186(this.field3847, this.field3852, this.field3850);
            this.field3847 = -1;
            this.field3852 = 0;
        }
        if (this.field3853 != -1) {
            class151.method1192(this.field3853, this.field3850);
            this.field3853 = -1;
        }
        super.finalize();
    }
}

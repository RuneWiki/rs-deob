import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class172 extends class252 {

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    private int field2612 = -1;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    private int field2611 = 0;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field2610 = 0;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    private int field2616 = -1;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    private int field2613;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    private int field2615;

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3977 = arg0;
        this.field3975 = arg1;
        this.field3981 = arg2;
        this.field3973 = arg3;
        this.field3972 = arg4;
        this.field3980 = arg5;
        this.method1240(arg6, arg7);
        this.method1242();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([B[I)V", line = 16)
    private final void method1240(byte[] arg0, int[] arg1) {
        this.field2615 = class10.method73((byte) -113, this.field3972);
        this.field2613 = class10.method73((byte) -18, this.field3980);
        byte[] var3 = new byte[this.field2615 * this.field2613 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3980; var6++) {
            for (int var7 = 0; var7 < this.field3972; var7++) {
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
            var4 += (this.field2615 - this.field3972) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class94.field1473;
        if (this.field2616 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2616 = var12[0];
            this.field2614 = class198.field2966;
        }
        class94.method698(this.field2616);
        var11.glTexImage2D(3553, 0, 6408, this.field2615, this.field2613, 0, 6408, 5121, var10);
        class198.field2964 += var10.limit() - this.field2610;
        this.field2610 = var10.limit();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 77)
    private final void method1241(int arg0) {
        if (this.field2611 == arg0) {
            return;
        }
        this.field2611 = arg0;
        GL var2 = class94.field1473;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 99)
    public final void method1210(int arg0, int arg1) {
        class94.method681();
        int var3 = this.field3981 + arg0;
        int var4 = this.field3973 + arg1;
        GL var5 = class94.field1473;
        class94.method698(this.field2616);
        this.method1241(1);
        var5.glTranslatef((float) var3, (float) (class94.field1513 - var4), 0.0F);
        var5.glCallList(this.field2612);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V", line = 111)
    public final void method1204(int arg0, int arg1, int arg2) {
        class94.method707();
        int var4 = this.field3981 + arg0;
        int var5 = this.field3973 + arg1;
        GL var6 = class94.field1473;
        class94.method698(this.field2616);
        this.method1241(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class94.field1513 - var5), 0.0F);
        var6.glCallList(this.field2612);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V", line = 126)
    protected final void finalize() throws Throwable {
        if (this.field2616 != -1) {
            class198.method1403(this.field2616, this.field2610, this.field2614);
            this.field2616 = -1;
            this.field2610 = 0;
        }
        if (this.field2612 != -1) {
            class198.method1406(this.field2612, this.field2614);
            this.field2612 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V", line = 146)
    private final void method1242() {
        float var1 = (float) this.field3972 / (float) this.field2615;
        float var2 = (float) this.field3980 / (float) this.field2613;
        GL var3 = class94.field1473;
        if (this.field2612 == -1) {
            this.field2612 = var3.glGenLists(1);
            this.field2614 = class198.field2966;
        }
        var3.glNewList(this.field2612, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3972, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3980));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3972, (float) (-this.field3980));
        var3.glEnd();
        var3.glEndList();
    }
}

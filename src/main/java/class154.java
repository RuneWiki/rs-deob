import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class154 extends class28 {

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    private int field2591 = 0;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    private int field2596 = -1;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    private int field2595 = 0;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    private int field2594 = -1;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    private int field2592;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    private int field2593;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field482 = arg0;
        this.field488 = arg1;
        this.field486 = arg2;
        this.field490 = arg3;
        this.field480 = arg4;
        this.field485 = arg5;
        this.method1205(arg6, arg7);
        this.method1206();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V", line = 11)
    public final void method179(int arg0, int arg1, int arg2) {
        class271.method1965();
        int var4 = this.field486 + arg0;
        int var5 = this.field490 + arg1;
        GL var6 = class271.field4641;
        class271.method1978(this.field2594);
        this.method1207(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class271.field4628 - var5), 0.0F);
        var6.glCallList(this.field2596);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([B[I)V", line = 35)
    private final void method1205(byte[] arg0, int[] arg1) {
        this.field2597 = class272.method1993(this.field480, 107);
        this.field2593 = class272.method1993(this.field485, 106);
        byte[] var3 = new byte[this.field2597 * this.field2593 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field485; var6++) {
            for (int var7 = 0; var7 < this.field480; var7++) {
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
            var4 += (this.field2597 - this.field480) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class271.field4641;
        if (this.field2594 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2594 = var12[0];
            this.field2592 = class68.field1125;
        }
        class271.method1978(this.field2594);
        var11.glTexImage2D(3553, 0, 6408, this.field2597, this.field2593, 0, 6408, 5121, var10);
        class68.field1129 += var10.limit() - this.field2595;
        this.field2595 = var10.limit();
    }

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 93)
    protected final void finalize() throws Throwable {
        if (this.field2594 != -1) {
            class68.method503(this.field2594, this.field2595, this.field2592);
            this.field2594 = -1;
            this.field2595 = 0;
        }
        if (this.field2596 != -1) {
            class68.method502(this.field2596, this.field2592);
            this.field2596 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V", line = 110)
    private final void method1206() {
        float var1 = (float) this.field480 / (float) this.field2597;
        float var2 = (float) this.field485 / (float) this.field2593;
        GL var3 = class271.field4641;
        if (this.field2596 == -1) {
            this.field2596 = var3.glGenLists(1);
            this.field2592 = class68.field1125;
        }
        var3.glNewList(this.field2596, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field480, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field485));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field480, (float) (-this.field485));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 136)
    private final void method1207(int arg0) {
        if (this.field2591 == arg0) {
            return;
        }
        this.field2591 = arg0;
        GL var2 = class271.field4641;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V", line = 155)
    public final void method180(int arg0, int arg1) {
        class271.method1967();
        int var3 = this.field486 + arg0;
        int var4 = this.field490 + arg1;
        GL var5 = class271.field4641;
        class271.method1978(this.field2594);
        this.method1207(1);
        var5.glTranslatef((float) var3, (float) (class271.field4628 - var4), 0.0F);
        var5.glCallList(this.field2596);
        var5.glLoadIdentity();
    }
}

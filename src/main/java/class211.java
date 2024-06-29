import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class211 extends class254 {

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    private int field3451 = 0;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    private int field3448 = -1;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    private int field3450 = 0;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    private int field3453 = -1;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V", line = 7)
    public final void method854(int arg0, int arg1) {
        class186.method1278();
        int var3 = this.field4034 + arg0;
        int var4 = this.field4031 + arg1;
        GL var5 = class186.field2990;
        class186.method1288(this.field3453);
        this.method1544(1);
        var5.glTranslatef((float) var3, (float) (class186.field2980 - var4), 0.0F);
        var5.glCallList(this.field3448);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        if (this.field3453 != -1) {
            class275.method1961(this.field3453, this.field3451, this.field3449);
            this.field3453 = -1;
            this.field3451 = 0;
        }
        if (this.field3448 != -1) {
            class275.method1964(this.field3448, this.field3449);
            this.field3448 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 38)
    private final void method1542() {
        float var1 = (float) this.field4037 / (float) this.field3454;
        float var2 = (float) this.field4039 / (float) this.field3452;
        GL var3 = class186.field2990;
        if (this.field3448 == -1) {
            this.field3448 = var3.glGenLists(1);
            this.field3449 = class275.field4359;
        }
        var3.glNewList(this.field3448, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4037, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4039));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4037, (float) (-this.field4039));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B[I)V", line = 63)
    private final void method1543(byte[] arg0, int[] arg1) {
        this.field3454 = class290.method2032(114, this.field4037);
        this.field3452 = class290.method2032(63, this.field4039);
        byte[] var3 = new byte[this.field3454 * this.field3452 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4039; var6++) {
            for (int var7 = 0; var7 < this.field4037; var7++) {
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
            var4 += (this.field3454 - this.field4037) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class186.field2990;
        if (this.field3453 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3453 = var12[0];
            this.field3449 = class275.field4359;
        }
        class186.method1288(this.field3453);
        var11.glTexImage2D(3553, 0, 6408, this.field3454, this.field3452, 0, 6408, 5121, var10);
        class275.field4357 += var10.limit() - this.field3451;
        this.field3451 = var10.limit();
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 169)
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4027 = arg0;
        this.field4028 = arg1;
        this.field4034 = arg2;
        this.field4031 = arg3;
        this.field4037 = arg4;
        this.field4039 = arg5;
        this.method1543(arg6, arg7);
        this.method1542();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 132)
    public final void method853(int arg0, int arg1, int arg2) {
        class186.method1313();
        int var4 = this.field4034 + arg0;
        int var5 = this.field4031 + arg1;
        GL var6 = class186.field2990;
        class186.method1288(this.field3453);
        this.method1544(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class186.field2980 - var5), 0.0F);
        var6.glCallList(this.field3448);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 148)
    private final void method1544(int arg0) {
        if (this.field3450 == arg0) {
            return;
        }
        this.field3450 = arg0;
        GL var2 = class186.field2990;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}

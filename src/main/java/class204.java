import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class204 extends class250 {

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    private int field2997 = 0;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    private int field2999 = -1;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    private int field3001 = -1;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    private int field3002 = 0;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    private int field2998;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method1478(byte[] arg0, int[] arg1) {
        this.field3000 = class344.method2409(this.field3715, -24724);
        this.field2996 = class344.method2409(this.field3716, -24724);
        byte[] var3 = new byte[this.field3000 * this.field2996 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3716; var6++) {
            for (int var7 = 0; var7 < this.field3715; var7++) {
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
            var4 += (this.field3000 - this.field3715) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class141.field2025;
        if (this.field3001 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3001 = var12[0];
            this.field2998 = class305.field4573;
        }
        class141.method1000(this.field3001);
        var11.glTexImage2D(3553, 0, 6408, this.field3000, this.field2996, 0, 6408, 5121, var10);
        class305.field4569 += var10.limit() - this.field3002;
        this.field3002 = var10.limit();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V", line = 64)
    private final void method1479() {
        float var1 = (float) this.field3715 / (float) this.field3000;
        float var2 = (float) this.field3716 / (float) this.field2996;
        GL var3 = class141.field2025;
        if (this.field2999 == -1) {
            this.field2999 = var3.glGenLists(1);
            this.field2998 = class305.field4573;
        }
        var3.glNewList(this.field2999, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3715, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3716));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3715, (float) (-this.field3716));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILbg;)V", line = 89)
    public final void method1480(int arg0, int arg1, class325 arg2) {
        if (arg2 == null) {
            return;
        }
        class141.method1001();
        class141.method1000(arg2.field4891);
        arg2.method2252(1);
        GL var4 = class141.field2025;
        class141.method1000(this.field3001);
        this.method1481(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4891);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class205.field3004) / (float) arg2.field4889;
        float var6 = (float) (arg1 - class205.field3006) / (float) arg2.field4890;
        float var7 = (float) (this.field3715 + arg0 - class205.field3004) / (float) arg2.field4889;
        float var8 = (float) (this.field3716 + arg1 - class205.field3006) / (float) arg2.field4890;
        int var9 = this.field3708 + arg0;
        int var10 = this.field3711 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field3715 / (float) this.field3000;
        float var12 = (float) this.field3716 / (float) this.field2996;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field3715 + var9), (float) (class141.field2044 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class141.field2044 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class141.field2044 - (this.field3716 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field3715 + var9), (float) (class141.field2044 - (this.field3716 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 142)
    private final void method1481(int arg0) {
        if (this.field2997 == arg0) {
            return;
        }
        this.field2997 = arg0;
        GL var2 = class141.field2025;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V", line = 162)
    protected final void finalize() throws Throwable {
        if (this.field3001 != -1) {
            class305.method2143(this.field3001, this.field3002, this.field2998);
            this.field3001 = -1;
            this.field3002 = 0;
        }
        if (this.field2999 != -1) {
            class305.method2147(this.field2999, this.field2998);
            this.field2999 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V", line = 180)
    public final void method1482(int arg0, int arg1) {
        class141.method1001();
        int var3 = this.field3708 + arg0;
        int var4 = this.field3711 + arg1;
        GL var5 = class141.field2025;
        class141.method1000(this.field3001);
        this.method1481(1);
        var5.glTranslatef((float) var3, (float) (class141.field2044 - var4), 0.0F);
        var5.glCallList(this.field2999);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 220)
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3719 = arg0;
        this.field3713 = arg1;
        this.field3708 = arg2;
        this.field3711 = arg3;
        this.field3715 = arg4;
        this.field3716 = arg5;
        this.method1478(arg6, arg7);
        this.method1479();
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lwi;)V", line = 230)
    public class204(class234 arg0) {
        this.field3715 = arg0.field3715;
        this.field3716 = arg0.field3716;
        this.field3708 = arg0.field3708;
        this.field3711 = arg0.field3711;
        this.field3719 = arg0.field3719;
        this.field3713 = arg0.field3713;
        this.method1478(arg0.field3528, arg0.field3527);
        this.method1479();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 197)
    public final void method1483(int arg0, int arg1, int arg2) {
        class141.method1017();
        int var4 = this.field3708 + arg0;
        int var5 = this.field3711 + arg1;
        GL var6 = class141.field2025;
        class141.method1000(this.field3001);
        this.method1481(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class141.field2044 - var5), 0.0F);
        var6.glCallList(this.field2999);
        var6.glLoadIdentity();
    }
}

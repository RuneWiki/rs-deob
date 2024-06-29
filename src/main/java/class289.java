import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class289 extends class246 {

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    private int field4501 = -1;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    private int field4500 = 0;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    private int field4499 = -1;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    private int field4502 = 0;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    private int field4496;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    private int field4497;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    private int field4498;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 6)
    private final void method2086(int arg0) {
        if (this.field4500 == arg0) {
            return;
        }
        this.field4500 = arg0;
        GL var2 = class240.field3771;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILml;)V", line = 29)
    public final void method2087(int arg0, int arg1, class2 arg2) {
        if (arg2 == null) {
            return;
        }
        class240.method1780();
        class240.method1786(arg2.field8);
        arg2.method6(1);
        GL var4 = class240.field3771;
        class240.method1786(this.field4499);
        this.method2086(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field8);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class213.field3342) / (float) arg2.field12;
        float var6 = (float) (arg1 - class213.field3344) / (float) arg2.field7;
        float var7 = (float) (this.field3827 + arg0 - class213.field3342) / (float) arg2.field12;
        float var8 = (float) (this.field3826 + arg1 - class213.field3344) / (float) arg2.field7;
        int var9 = this.field3831 + arg0;
        int var10 = this.field3828 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field3827 / (float) this.field4498;
        float var12 = (float) this.field3826 / (float) this.field4496;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field3827 + var9), (float) (class240.field3749 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class240.field3749 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class240.field3749 - (this.field3826 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field3827 + var9), (float) (class240.field3749 - (this.field3826 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([B[I)V", line = 79)
    private final void method2088(byte[] arg0, int[] arg1) {
        this.field4498 = class261.method1918(this.field3827, 22);
        this.field4496 = class261.method1918(this.field3826, 22);
        byte[] var3 = new byte[this.field4498 * this.field4496 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3826; var6++) {
            for (int var7 = 0; var7 < this.field3827; var7++) {
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
            var4 += (this.field4498 - this.field3827) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class240.field3771;
        if (this.field4499 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4499 = var12[0];
            this.field4497 = class28.field455;
        }
        class240.method1786(this.field4499);
        var11.glTexImage2D(3553, 0, 6408, this.field4498, this.field4496, 0, 6408, 5121, var10);
        class28.field458 += var10.limit() - this.field4502;
        this.field4502 = var10.limit();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 137)
    public final void method711(int arg0, int arg1) {
        class240.method1780();
        int var3 = this.field3831 + arg0;
        int var4 = this.field3828 + arg1;
        GL var5 = class240.field3771;
        class240.method1786(this.field4499);
        this.method2086(1);
        var5.glTranslatef((float) var3, (float) (class240.field3749 - var4), 0.0F);
        var5.glCallList(this.field4501);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V", line = 150)
    private final void method2089() {
        float var1 = (float) this.field3827 / (float) this.field4498;
        float var2 = (float) this.field3826 / (float) this.field4496;
        GL var3 = class240.field3771;
        if (this.field4501 == -1) {
            this.field4501 = var3.glGenLists(1);
            this.field4497 = class28.field455;
        }
        var3.glNewList(this.field4501, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3827, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3826));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3827, (float) (-this.field3826));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!il", name = "finalize", descriptor = "()V", line = 178)
    protected final void finalize() throws Throwable {
        if (this.field4499 != -1) {
            class28.method327(this.field4499, this.field4502, this.field4497);
            this.field4499 = -1;
            this.field4502 = 0;
        }
        if (this.field4501 != -1) {
            class28.method326(this.field4501, this.field4497);
            this.field4501 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 220)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3832 = arg0;
        this.field3825 = arg1;
        this.field3831 = arg2;
        this.field3828 = arg3;
        this.field3827 = arg4;
        this.field3826 = arg5;
        this.method2088(arg6, arg7);
        this.method2089();
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lkk;)V", line = 230)
    public class289(class77 arg0) {
        this.field3827 = arg0.field3827;
        this.field3826 = arg0.field3826;
        this.field3831 = arg0.field3831;
        this.field3828 = arg0.field3828;
        this.field3832 = arg0.field3832;
        this.field3825 = arg0.field3825;
        this.method2088(arg0.field1124, arg0.field1123);
        this.method2089();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 208)
    public final void method714(int arg0, int arg1, int arg2) {
        class240.method1781();
        int var4 = this.field3831 + arg0;
        int var5 = this.field3828 + arg1;
        GL var6 = class240.field3771;
        class240.method1786(this.field4499);
        this.method2086(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class240.field3749 - var5), 0.0F);
        var6.glCallList(this.field4501);
        var6.glLoadIdentity();
    }
}

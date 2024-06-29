import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 extends class187 {

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    private int field1246 = -1;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    private int field1250 = -1;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    private int field1251 = 0;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    private int field1248 = 0;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        if (this.field1250 != -1) {
            class173.method1191(this.field1250, this.field1248, this.field1247);
            this.field1250 = -1;
            this.field1248 = 0;
        }
        if (this.field1246 != -1) {
            class173.method1195(this.field1246, this.field1247);
            this.field1246 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILko;)V", line = 21)
    public final void method567(int arg0, int arg1, class232 arg2) {
        if (arg2 == null) {
            return;
        }
        class245.method1725();
        class245.method1729(arg2.field3695);
        arg2.method1600(1);
        GL var4 = class245.field3884;
        class245.method1729(this.field1250);
        this.method569(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3695);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class335.field5430) / (float) arg2.field3693;
        float var6 = (float) (arg1 - class335.field5427) / (float) arg2.field3697;
        float var7 = (float) (this.field2915 + arg0 - class335.field5430) / (float) arg2.field3693;
        float var8 = (float) (this.field2913 + arg1 - class335.field5427) / (float) arg2.field3697;
        int var9 = this.field2907 + arg0;
        int var10 = this.field2916 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2915 / (float) this.field1252;
        float var12 = (float) this.field2913 / (float) this.field1249;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2915 + var9), (float) (class245.field3862 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class245.field3862 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class245.field3862 - (this.field2913 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2915 + var9), (float) (class245.field3862 - (this.field2913 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 220)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2917 = arg0;
        this.field2909 = arg1;
        this.field2907 = arg2;
        this.field2916 = arg3;
        this.field2915 = arg4;
        this.field2913 = arg5;
        this.method571(arg6, arg7);
        this.method568();
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lfo;)V", line = 230)
    public class87(class239 arg0) {
        this.field2915 = arg0.field2915;
        this.field2913 = arg0.field2913;
        this.field2907 = arg0.field2907;
        this.field2916 = arg0.field2916;
        this.field2917 = arg0.field2917;
        this.field2909 = arg0.field2909;
        this.method571(arg0.field3776, arg0.field3775);
        this.method568();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 78)
    private final void method568() {
        float var1 = (float) this.field2915 / (float) this.field1252;
        float var2 = (float) this.field2913 / (float) this.field1249;
        GL var3 = class245.field3884;
        if (this.field1246 == -1) {
            this.field1246 = var3.glGenLists(1);
            this.field1247 = class173.field2703;
        }
        var3.glNewList(this.field1246, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2915, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2913));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2915, (float) (-this.field2913));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 105)
    private final void method569(int arg0) {
        if (this.field1251 == arg0) {
            return;
        }
        this.field1251 = arg0;
        GL var2 = class245.field3884;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 130)
    public final void method570(int arg0, int arg1, int arg2) {
        class245.method1726();
        int var4 = this.field2907 + arg0;
        int var5 = this.field2916 + arg1;
        GL var6 = class245.field3884;
        class245.method1729(this.field1250);
        this.method569(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class245.field3862 - var5), 0.0F);
        var6.glCallList(this.field1246);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([B[I)V", line = 148)
    private final void method571(byte[] arg0, int[] arg1) {
        this.field1252 = class329.method2347(this.field2915, (byte) -96);
        this.field1249 = class329.method2347(this.field2913, (byte) -96);
        byte[] var3 = new byte[this.field1252 * this.field1249 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2913; var6++) {
            for (int var7 = 0; var7 < this.field2915; var7++) {
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
            var4 += (this.field1252 - this.field2915) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class245.field3884;
        if (this.field1250 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1250 = var12[0];
            this.field1247 = class173.field2703;
        }
        class245.method1729(this.field1250);
        var11.glTexImage2D(3553, 0, 6408, this.field1252, this.field1249, 0, 6408, 5121, var10);
        class173.field2705 += var10.limit() - this.field1248;
        this.field1248 = var10.limit();
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V", line = 206)
    public final void method572(int arg0, int arg1) {
        class245.method1725();
        int var3 = this.field2907 + arg0;
        int var4 = this.field2916 + arg1;
        GL var5 = class245.field3884;
        class245.method1729(this.field1250);
        this.method569(1);
        var5.glTranslatef((float) var3, (float) (class245.field3862 - var4), 0.0F);
        var5.glCallList(this.field1246);
        var5.glLoadIdentity();
    }
}

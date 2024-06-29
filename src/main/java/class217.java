import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class217 extends class149 {

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    private int field3266 = 0;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    private int field3268 = -1;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    private int field3264 = -1;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    private int field3265 = 0;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    private int field3267;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    private int field3269;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    private int field3270;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILaf;)V", line = 5)
    public final void method1511(int arg0, int arg1, class200 arg2) {
        if (arg2 == null) {
            return;
        }
        class272.method1939();
        class272.method1965(arg2.field3034);
        arg2.method1394(1);
        GL var4 = class272.field4310;
        class272.method1965(this.field3264);
        this.method1513(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3034);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class239.field3665) / (float) arg2.field3028;
        float var6 = (float) (arg1 - class239.field3666) / (float) arg2.field3030;
        float var7 = (float) (this.field2366 + arg0 - class239.field3665) / (float) arg2.field3028;
        float var8 = (float) (this.field2361 + arg1 - class239.field3666) / (float) arg2.field3030;
        int var9 = this.field2362 + arg0;
        int var10 = this.field2365 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2366 / (float) this.field3270;
        float var12 = (float) this.field2361 / (float) this.field3269;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2366 + var9), (float) (class272.field4311 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class272.field4311 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class272.field4311 - (this.field2361 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2366 + var9), (float) (class272.field4311 - (this.field2361 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 59)
    private final void method1512() {
        float var1 = (float) this.field2366 / (float) this.field3270;
        float var2 = (float) this.field2361 / (float) this.field3269;
        GL var3 = class272.field4310;
        if (this.field3268 == -1) {
            this.field3268 = var3.glGenLists(1);
            this.field3267 = class1.field3;
        }
        var3.glNewList(this.field3268, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2366, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2361));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2366, (float) (-this.field2361));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V", line = 84)
    protected final void finalize() throws Throwable {
        if (this.field3264 != -1) {
            class1.method5(this.field3264, this.field3266, this.field3267);
            this.field3264 = -1;
            this.field3266 = 0;
        }
        if (this.field3268 != -1) {
            class1.method7(this.field3268, this.field3267);
            this.field3268 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 102)
    private final void method1513(int arg0) {
        if (this.field3265 == arg0) {
            return;
        }
        this.field3265 = arg0;
        GL var2 = class272.field4310;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 220)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2369 = arg0;
        this.field2360 = arg1;
        this.field2362 = arg2;
        this.field2365 = arg3;
        this.field2366 = arg4;
        this.field2361 = arg5;
        this.method1514(arg6, arg7);
        this.method1512();
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lfe;)V", line = 230)
    public class217(class270 arg0) {
        this.field2366 = arg0.field2366;
        this.field2361 = arg0.field2361;
        this.field2362 = arg0.field2362;
        this.field2365 = arg0.field2365;
        this.field2369 = arg0.field2369;
        this.field2360 = arg0.field2360;
        this.method1514(arg0.field4255, arg0.field4256);
        this.method1512();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V", line = 126)
    public final void method1087(int arg0, int arg1, int arg2) {
        class272.method1944();
        int var4 = this.field2362 + arg0;
        int var5 = this.field2365 + arg1;
        GL var6 = class272.field4310;
        class272.method1965(this.field3264);
        this.method1513(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class272.field4311 - var5), 0.0F);
        var6.glCallList(this.field3268);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([B[I)V", line = 142)
    private final void method1514(byte[] arg0, int[] arg1) {
        this.field3270 = class226.method1571(true, this.field2366);
        this.field3269 = class226.method1571(true, this.field2361);
        byte[] var3 = new byte[this.field3270 * this.field3269 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2361; var6++) {
            for (int var7 = 0; var7 < this.field2366; var7++) {
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
            var4 += (this.field3270 - this.field2366) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class272.field4310;
        if (this.field3264 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3264 = var12[0];
            this.field3267 = class1.field3;
        }
        class272.method1965(this.field3264);
        var11.glTexImage2D(3553, 0, 6408, this.field3270, this.field3269, 0, 6408, 5121, var10);
        class1.field5 += var10.limit() - this.field3266;
        this.field3266 = var10.limit();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V", line = 201)
    public final void method1089(int arg0, int arg1) {
        class272.method1939();
        int var3 = this.field2362 + arg0;
        int var4 = this.field2365 + arg1;
        GL var5 = class272.field4310;
        class272.method1965(this.field3264);
        this.method1513(1);
        var5.glTranslatef((float) var3, (float) (class272.field4311 - var4), 0.0F);
        var5.glCallList(this.field3268);
        var5.glLoadIdentity();
    }
}

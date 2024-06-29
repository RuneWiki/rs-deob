import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class323 {

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    private int field67 = 0;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    private int field68 = -1;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    private int field70 = -1;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method30(byte[] arg0, int[] arg1) {
        this.field69 = class311.method2264(this.field5229, (byte) -86);
        this.field64 = class311.method2264(this.field5236, (byte) -98);
        byte[] var3 = new byte[this.field69 * this.field64 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field5236; var6++) {
            for (int var7 = 0; var7 < this.field5229; var7++) {
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
            var4 += (this.field69 - this.field5229) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class241.field4012;
        if (this.field68 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field68 = var12[0];
            this.field66 = class239.field3974;
        }
        class241.method1687(this.field68);
        var11.glTexImage2D(3553, 0, 6408, this.field69, this.field64, 0, 6408, 5121, var10);
        class239.field3976 += var10.limit() - this.field65;
        this.field65 = var10.limit();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 64)
    private final void method31(int arg0) {
        if (this.field67 == arg0) {
            return;
        }
        this.field67 = arg0;
        GL var2 = class241.field4012;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V", line = 84)
    public final void method32(int arg0, int arg1, int arg2) {
        class241.method1701();
        int var4 = this.field5232 + arg0;
        int var5 = this.field5238 + arg1;
        GL var6 = class241.field4012;
        class241.method1687(this.field68);
        this.method31(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class241.field3993 - var5), 0.0F);
        var6.glCallList(this.field70);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V", line = 97)
    protected final void finalize() throws Throwable {
        if (this.field68 != -1) {
            class239.method1668(this.field68, this.field65, this.field66);
            this.field68 = -1;
            this.field65 = 0;
        }
        if (this.field70 != -1) {
            class239.method1673(this.field70, this.field66);
            this.field70 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 117)
    private final void method33() {
        float var1 = (float) this.field5229 / (float) this.field69;
        float var2 = (float) this.field5236 / (float) this.field64;
        GL var3 = class241.field4012;
        if (this.field70 == -1) {
            this.field70 = var3.glGenLists(1);
            this.field66 = class239.field3974;
        }
        var3.glNewList(this.field70, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field5229, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field5236));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field5229, (float) (-this.field5236));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 220)
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field5239 = arg0;
        this.field5228 = arg1;
        this.field5232 = arg2;
        this.field5238 = arg3;
        this.field5229 = arg4;
        this.field5236 = arg5;
        this.method30(arg6, arg7);
        this.method33();
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lka;)V", line = 230)
    public class3(class211 arg0) {
        this.field5229 = arg0.field5229;
        this.field5236 = arg0.field5236;
        this.field5232 = arg0.field5232;
        this.field5238 = arg0.field5238;
        this.field5239 = arg0.field5239;
        this.field5228 = arg0.field5228;
        this.method30(arg0.field3507, arg0.field3508);
        this.method33();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 151)
    public final void method34(int arg0, int arg1) {
        class241.method1683();
        int var3 = this.field5232 + arg0;
        int var4 = this.field5238 + arg1;
        GL var5 = class241.field4012;
        class241.method1687(this.field68);
        this.method31(1);
        var5.glTranslatef((float) var3, (float) (class241.field3993 - var4), 0.0F);
        var5.glCallList(this.field70);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILof;)V", line = 163)
    public final void method35(int arg0, int arg1, class265 arg2) {
        if (arg2 == null) {
            return;
        }
        class241.method1683();
        class241.method1687(arg2.field4336);
        arg2.method1862(1);
        GL var4 = class241.field4012;
        class241.method1687(this.field68);
        this.method31(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4336);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class337.field5348) / (float) arg2.field4339;
        float var6 = (float) (arg1 - class337.field5350) / (float) arg2.field4340;
        float var7 = (float) (this.field5229 + arg0 - class337.field5348) / (float) arg2.field4339;
        float var8 = (float) (this.field5236 + arg1 - class337.field5350) / (float) arg2.field4340;
        int var9 = this.field5232 + arg0;
        int var10 = this.field5238 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field5229 / (float) this.field69;
        float var12 = (float) this.field5236 / (float) this.field64;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field5229 + var9), (float) (class241.field3993 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class241.field3993 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class241.field3993 - (this.field5236 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field5229 + var9), (float) (class241.field3993 - (this.field5236 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }
}

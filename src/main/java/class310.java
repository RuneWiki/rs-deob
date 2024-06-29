import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class310 implements class210 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Z")
    private boolean field5222 = false;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[I")
    private int[] field5220 = null;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    private int field5224 = -1;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    private static int field5219 = 96;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    private static int field5221 = 36;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    private static int field5223 = 12;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()V", line = 7)
    public final void method483() {
        GL var1 = class108.field1899;
        if (class329.field5607) {
            class108.method765(1);
            var1.glCallList(this.field5224);
        } else {
            var1.glTexEnvi(8960, 34184, 34167);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 21)
    public final void method484(int arg0) {
        GL var2 = class108.field1899;
        if (class329.field5607 && this.field5220 != null) {
            var2.glActiveTexture(33985);
            var2.glBindTexture(34067, this.field5220[arg0 - 1]);
            var2.glActiveTexture(33984);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()I", line = 31)
    public final int method482() {
        return 4;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()V", line = 44)
    private final void method2103() {
        GL var1 = class108.field1899;
        this.field5224 = var1.glGenLists(2);
        var1.glNewList(this.field5224, 4864);
        if (this.field5220 == null) {
            var1.glTexEnvi(8960, 34184, 34167);
        } else {
            var1.glActiveTexture(33985);
            var1.glTexGeni(8192, 9472, 34065);
            var1.glTexGeni(8193, 9472, 34065);
            var1.glTexGeni(8194, 9472, 34065);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            var1.glMatrixMode(5888);
            if (this.field5222) {
                var1.glTexEnvi(8960, 34161, 260);
                var1.glTexEnvi(8960, 34192, 770);
                var1.glTexEnvi(8960, 34162, 7681);
                var1.glTexEnvi(8960, 34184, 34167);
            } else {
                var1.glTexEnvi(8960, 34161, 7681);
                var1.glTexEnvi(8960, 34176, 34168);
                var1.glTexEnvi(8960, 34162, 8448);
                var1.glActiveTexture(33986);
                var1.glTexEnvi(8960, 8704, 34160);
                var1.glTexEnvi(8960, 34161, 260);
                var1.glTexEnvi(8960, 34176, 34168);
                var1.glTexEnvi(8960, 34177, 34168);
                var1.glTexEnvi(8960, 34193, 770);
                var1.glTexEnvi(8960, 34162, 7681);
                var1.glTexEnvi(8960, 34184, 34167);
                var1.glBindTexture(3553, class108.field1892);
                var1.glEnable(3553);
            }
            var1.glActiveTexture(33984);
        }
        var1.glEndList();
        var1.glNewList(this.field5224 + 1, 4864);
        if (this.field5220 == null) {
            var1.glTexEnvi(8960, 34184, 5890);
        } else {
            var1.glActiveTexture(33985);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            if (this.field5222) {
                var1.glTexEnvi(8960, 34161, 8448);
                var1.glTexEnvi(8960, 34192, 768);
                var1.glTexEnvi(8960, 34162, 8448);
                var1.glTexEnvi(8960, 34184, 5890);
            } else {
                var1.glTexEnvi(8960, 34161, 8448);
                var1.glTexEnvi(8960, 34176, 5890);
                var1.glActiveTexture(33986);
                var1.glTexEnvi(8960, 8704, 8448);
                var1.glTexEnvi(8960, 34161, 8448);
                var1.glTexEnvi(8960, 34176, 5890);
                var1.glTexEnvi(8960, 34193, 768);
                var1.glTexEnvi(8960, 34162, 8448);
                var1.glTexEnvi(8960, 34184, 5890);
                var1.glDisable(3553);
            }
            var1.glActiveTexture(33984);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 281)
    public class310() {
        if (class108.field1919 && class108.field1921 >= 2) {
            this.method2104();
            GL var1 = class108.field1899;
            var1.glBindTexture(34067, this.field5220[0]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field5220[1]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field5220[2]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            this.field5222 = class108.field1921 < 3;
        }
        this.method2103();
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()V", line = 143)
    public final void method486() {
        GL var1 = class108.field1899;
        if (class329.field5607) {
            var1.glCallList(this.field5224 + 1);
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "()V", line = 165)
    private final void method2104() {
        GL var1 = class108.field1899;
        if (this.field5220 == null) {
            this.field5220 = new int[3];
            var1.glGenTextures(3, this.field5220, 0);
        }
        short var2 = 4096;
        byte[] var3 = new byte[var2];
        byte[] var4 = new byte[var2];
        byte[] var5 = new byte[var2];
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = 0;
            for (int var8 = 0; var8 < 64; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    float var10 = (float) var9 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var10 * var10 + 1.0F)));
                    float var13 = var10 * var12;
                    float var14 = var11 * var12;
                    float var15;
                    if (var6 == 0) {
                        var15 = -var13;
                    } else if (var6 == 1) {
                        var15 = var13;
                    } else if (var6 == 2) {
                        var15 = var14;
                    } else if (var6 == 3) {
                        var15 = -var14;
                    } else if (var6 == 4) {
                        var15 = var12;
                    } else {
                        var15 = -var12;
                    }
                    int var16;
                    int var17;
                    int var18;
                    if (var15 > 0.0F) {
                        var16 = (int) (Math.pow((double) var15, (double) field5219) * 255.0D);
                        var17 = (int) (Math.pow((double) var15, (double) field5221) * 255.0D);
                        var18 = (int) (Math.pow((double) var15, (double) field5223) * 255.0D);
                    } else {
                        var18 = 0;
                        var17 = 0;
                        var16 = 0;
                    }
                    int var19;
                    int var20;
                    int var21;
                    if (class108.field1921 < 3) {
                        var19 = var16 / 5;
                        var20 = var17 / 5;
                        var21 = var18 / 5;
                    } else {
                        var19 = var16 / 2;
                        var20 = var17 / 2;
                        var21 = var18 / 2;
                    }
                    var4[var7] = (byte) var19;
                    var5[var7] = (byte) var20;
                    var3[var7] = (byte) var21;
                    var7++;
                }
            }
            var1.glBindTexture(34067, this.field5220[0]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var4));
            var1.glBindTexture(34067, this.field5220[1]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var5));
            var1.glBindTexture(34067, this.field5220[2]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var3));
            class263.field4549 += var2 * 3;
        }
    }
}

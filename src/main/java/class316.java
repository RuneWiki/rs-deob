import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class316 implements class145 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    private int field4972 = -1;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Z")
    private boolean field4974 = false;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
    private int[] field4973 = null;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()V", line = 16)
    private final void method2154() {
        GL var1 = class333.field5160;
        if (this.field4973 == null) {
            this.field4973 = new int[3];
            var1.glGenTextures(3, this.field4973, 0);
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
                        var16 = (int) (Math.pow((double) var15, 96.0D) * 255.0D);
                        var17 = (int) (Math.pow((double) var15, 36.0D) * 255.0D);
                        var18 = (int) (Math.pow((double) var15, 12.0D) * 255.0D);
                    } else {
                        var18 = 0;
                        var17 = 0;
                        var16 = 0;
                    }
                    int var19;
                    int var20;
                    int var21;
                    if (class333.field5174 < 3) {
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
            var1.glBindTexture(34067, this.field4973[0]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var4));
            var1.glBindTexture(34067, this.field4973[1]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var5));
            var1.glBindTexture(34067, this.field4973[2]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var3));
            class301.field4648 += var2 * 3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V", line = 132)
    public final void method318() {
        GL var1 = class333.field5160;
        if (class192.field2903) {
            var1.glCallList(this.field4972 + 1);
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 271)
    public class316() {
        if (class333.field5185 && class333.field5174 >= 2) {
            this.method2154();
            GL var1 = class333.field5160;
            var1.glBindTexture(34067, this.field4973[0]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field4973[1]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field4973[2]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            this.field4974 = class333.field5174 < 3;
        }
        this.method2155();
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V", line = 145)
    public final void method315() {
        GL var1 = class333.field5160;
        class333.method2285(1);
        if (class192.field2903) {
            var1.glCallList(this.field4972);
        } else {
            var1.glTexEnvi(8960, 34184, 34167);
        }
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()V", line = 159)
    private final void method2155() {
        GL var1 = class333.field5160;
        this.field4972 = var1.glGenLists(2);
        var1.glNewList(this.field4972, 4864);
        if (this.field4973 == null) {
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
            if (this.field4974) {
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
                var1.glBindTexture(3553, class333.field5161);
                var1.glEnable(3553);
            }
            var1.glActiveTexture(33984);
        }
        var1.glEndList();
        var1.glNewList(this.field4972 + 1, 4864);
        if (this.field4973 == null) {
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
            if (this.field4974) {
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

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 255)
    public final void method321(int arg0) {
        GL var2 = class333.field5160;
        if (class192.field2903 && this.field4973 != null) {
            var2.glActiveTexture(33985);
            var2.glBindTexture(34067, this.field4973[arg0 - 1]);
            var2.glActiveTexture(33984);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 266)
    public final int method320() {
        return 4;
    }
}

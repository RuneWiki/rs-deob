import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class171 implements class21 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
    private boolean field2839 = false;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    private int field2842 = -1;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
    private int[] field2837 = null;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    private static int field2838 = 12;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private static int field2841 = 96;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    private static int field2840 = 36;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V", line = 8)
    public final void method116() {
        GL var1 = class281.field4839;
        if (class114.field1921) {
            var1.glCallList(this.field2842 + 1);
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()V", line = 18)
    public final void method118() {
        GL var1 = class281.field4839;
        if (class114.field1921) {
            class281.method1983(1);
            var1.glCallList(this.field2842);
        } else {
            var1.glTexEnvi(8960, 34184, 34167);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 278)
    public class171() {
        if (class281.field4836 && class281.field4817 >= 2) {
            this.method1223();
            GL var1 = class281.field4839;
            var1.glBindTexture(34067, this.field2837[0]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field2837[1]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field2837[2]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            this.field2839 = class281.field4817 < 3;
        }
        this.method1222();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 42)
    public final void method119(int arg0) {
        GL var2 = class281.field4839;
        if (class114.field1921 && this.field2837 != null) {
            var2.glActiveTexture(33985);
            var2.glBindTexture(34067, this.field2837[arg0 - 1]);
            var2.glActiveTexture(33984);
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()V", line = 53)
    private final void method1222() {
        GL var1 = class281.field4839;
        this.field2842 = var1.glGenLists(2);
        var1.glNewList(this.field2842, 4864);
        if (this.field2837 == null) {
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
            if (this.field2839) {
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
                var1.glBindTexture(3553, class281.field4814);
                var1.glEnable(3553);
            }
            var1.glActiveTexture(33984);
        }
        var1.glEndList();
        var1.glNewList(this.field2842 + 1, 4864);
        if (this.field2837 == null) {
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
            if (this.field2839) {
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

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()I", line = 147)
    public final int method117() {
        return 4;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "()V", line = 162)
    private final void method1223() {
        GL var1 = class281.field4839;
        if (this.field2837 == null) {
            this.field2837 = new int[3];
            var1.glGenTextures(3, this.field2837, 0);
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
                        var16 = (int) (Math.pow((double) var15, (double) field2841) * 255.0D);
                        var17 = (int) (Math.pow((double) var15, (double) field2840) * 255.0D);
                        var18 = (int) (Math.pow((double) var15, (double) field2838) * 255.0D);
                    } else {
                        var18 = 0;
                        var17 = 0;
                        var16 = 0;
                    }
                    int var19;
                    int var20;
                    int var21;
                    if (class281.field4817 < 3) {
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
            var1.glBindTexture(34067, this.field2837[0]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var4));
            var1.glBindTexture(34067, this.field2837[1]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var5));
            var1.glBindTexture(34067, this.field2837[2]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var3));
            class139.field2326 += var2 * 3;
        }
    }
}

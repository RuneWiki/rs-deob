import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class56 implements class14 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[I")
    private int[] field792 = null;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Z")
    private boolean field793 = false;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    private int field790 = -1;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    private static int field791 = 12;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    private static int field789 = 96;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    private static int field794 = 36;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V", line = 10)
    private final void method380() {
        GL var1 = class99.field1682;
        this.field790 = var1.glGenLists(2);
        var1.glNewList(this.field790, 4864);
        if (this.field792 == null) {
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
            if (this.field793) {
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
                var1.glBindTexture(3553, class99.field1694);
                var1.glEnable(3553);
            }
            var1.glActiveTexture(33984);
        }
        var1.glEndList();
        var1.glNewList(this.field790 + 1, 4864);
        if (this.field792 == null) {
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
            if (this.field793) {
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

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V", line = 107)
    public final void method79() {
        GL var1 = class99.field1682;
        if (class88.field1483) {
            class99.method765(1);
            var1.glCallList(this.field790);
        } else {
            var1.glTexEnvi(8960, 34184, 34167);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 119)
    public final void method80() {
        GL var1 = class99.field1682;
        if (class88.field1483) {
            var1.glCallList(this.field790 + 1);
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 129)
    public final void method84(int arg0) {
        GL var2 = class99.field1682;
        if (class88.field1483 && this.field792 != null) {
            var2.glActiveTexture(33985);
            var2.glBindTexture(34067, this.field792[arg0 - 1]);
            var2.glActiveTexture(33984);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 281)
    public class56() {
        if (class99.field1662 && class99.field1688 >= 2) {
            this.method381();
            GL var1 = class99.field1682;
            var1.glBindTexture(34067, this.field792[0]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field792[1]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            var1.glBindTexture(34067, this.field792[2]);
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            var1.glTexParameteri(34067, 32882, 33071);
            var1.glTexParameteri(34067, 10242, 33071);
            var1.glTexParameteri(34067, 10243, 33071);
            this.field793 = class99.field1688 < 3;
        }
        this.method380();
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V", line = 151)
    private final void method381() {
        GL var1 = class99.field1682;
        if (this.field792 == null) {
            this.field792 = new int[3];
            var1.glGenTextures(3, this.field792, 0);
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
                        var16 = (int) (Math.pow((double) var15, (double) field789) * 255.0D);
                        var17 = (int) (Math.pow((double) var15, (double) field794) * 255.0D);
                        var18 = (int) (Math.pow((double) var15, (double) field791) * 255.0D);
                    } else {
                        var18 = 0;
                        var17 = 0;
                        var16 = 0;
                    }
                    int var19;
                    int var20;
                    int var21;
                    if (class99.field1688 < 3) {
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
            var1.glBindTexture(34067, this.field792[0]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var4));
            var1.glBindTexture(34067, this.field792[1]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var5));
            var1.glBindTexture(34067, this.field792[2]);
            var1.glTexImage2D(var6 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var3));
            class274.field4578 += var2 * 3;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()I", line = 265)
    public final int method83() {
        return 4;
    }
}

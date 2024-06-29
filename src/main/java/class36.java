import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class36 extends class259 {

    @OriginalMember(owner = "client!ec", name = "Hb", descriptor = "I")
    private int field689 = -1;

    @OriginalMember(owner = "client!ec", name = "Kb", descriptor = "I")
    private int field692 = 0;

    @OriginalMember(owner = "client!ec", name = "Ib", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!ec", name = "Lb", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!ec", name = "Jb", descriptor = "[I")
    private int[] field691;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 13)
    public class36(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method306(arg5);
        this.method305();
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() throws Throwable {
        if (this.field689 != -1) {
            class136.method1007(this.field689, this.field692, this.field693);
            this.field689 = -1;
            this.field692 = 0;
        }
        if (this.field691 != null) {
            for (int var1 = 0; var1 < this.field691.length; var1++) {
                class136.method1006(this.field691[var1], this.field693);
            }
            this.field691 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V", line = 40)
    private final void method305() {
        if (this.field691 != null) {
            return;
        }
        this.field691 = new int[256];
        GL var1 = class21.field377;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4333[var2] / (float) this.field690 + var3;
            float var6 = (float) this.field4336[var2] / (float) this.field690 + var4;
            this.field691[var2] = var1.glGenLists(1);
            var1.glNewList(this.field691[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4333[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4336[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4333[var2], (float) (-this.field4336[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field693 = class136.field2300;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([[B)V", line = 80)
    private final void method306(byte[][] arg0) {
        if (this.field689 != -1) {
            return;
        }
        this.field690 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4336[var2] > this.field690) {
                this.field690 = this.field4336[var2];
            }
            if (this.field4333[var2] > this.field690) {
                this.field690 = this.field4333[var2];
            }
        }
        this.field690 *= 16;
        this.field690 = class151.method1130(76, this.field690);
        int var3 = this.field690 / 16;
        byte[] var4 = new byte[this.field690 * this.field690 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field690 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4336[var5];
            int var11 = this.field4333[var5];
            byte[] var12 = arg0[var5];
            for (int var13 = 0; var13 < var10; var13++) {
                for (int var14 = 0; var14 < var11; var14++) {
                    if (var12[var9++] == 0) {
                        var8 += 2;
                    } else {
                        var4[var8++] = -1;
                        var4[var8++] = -1;
                    }
                }
                var8 += (this.field690 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class21.field377;
        if (this.field689 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field689 = var17[0];
            this.field693 = class136.field2300;
        }
        class21.method140(this.field689);
        var16.glTexImage2D(3553, 0, 6410, this.field690, this.field690, 0, 6410, 5121, var15);
        class136.field2301 += var15.limit() - this.field692;
        this.field692 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIZ)V", line = 172)
    public final void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class111.field1934 == null) {
            class21.method148();
            GL var18 = class21.field377;
            class21.method140(this.field689);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class21.field361 - arg2), 0.0F);
            var18.glCallList(this.field691[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class21.method148();
        GL var8 = class21.field377;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class21.field361 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4333[arg0] / (float) this.field690 + var9;
        float var12 = (float) this.field4336[arg0] / (float) this.field690 + var10;
        class21.method140(this.field689);
        class100 var13 = class111.field1934;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field1768);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class111.field1936) / (float) var13.field1765;
        float var15 = (float) (arg2 - class111.field1937) / (float) var13.field1763;
        float var16 = (float) (arg1 + arg3 - class111.field1936) / (float) var13.field1765;
        float var17 = (float) (arg2 + arg4 - class111.field1937) / (float) var13.field1763;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4333[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field4336[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4333[arg0], (float) (-this.field4336[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIZ)V", line = 241)
    public final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class21.method148();
        GL var9 = class21.field377;
        class21.method140(this.field689);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class21.field361 - arg2), 0.0F);
        var9.glCallList(this.field691[arg0]);
        var9.glLoadIdentity();
    }
}

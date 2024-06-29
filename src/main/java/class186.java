import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class186 extends class292 {

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    private int field2977 = -1;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    private int field2975 = -1;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    private int field2976 = 0;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    private int field2981 = 0;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    private int field2978;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    private int field2979;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method1348(byte[] arg0, int[] arg1) {
        this.field2979 = class230.method1638((byte) 89, this.field4579);
        this.field2980 = class230.method1638((byte) 89, this.field4595);
        byte[] var3 = new byte[this.field2980 * this.field2979 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4595; var6++) {
            for (int var7 = 0; var7 < this.field4579; var7++) {
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
            var4 += (this.field2979 - this.field4579) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class36.field518;
        if (this.field2977 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2977 = var12[0];
            this.field2978 = class166.field2498;
        }
        class36.method310(this.field2977);
        var11.glTexImage2D(3553, 0, 6408, this.field2979, this.field2980, 0, 6408, 5121, var10);
        class166.field2495 += var10.limit() - this.field2976;
        this.field2976 = var10.limit();
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 64)
    private final void method1349(int arg0) {
        if (this.field2981 == arg0) {
            return;
        }
        this.field2981 = arg0;
        GL var2 = class36.field518;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 88)
    private final void method1350() {
        float var1 = (float) this.field4579 / (float) this.field2979;
        float var2 = (float) this.field4595 / (float) this.field2980;
        GL var3 = class36.field518;
        if (this.field2975 == -1) {
            this.field2975 = var3.glGenLists(1);
            this.field2978 = class166.field2498;
        }
        var3.glNewList(this.field2975, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4579, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4595));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4579, (float) (-this.field4595));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 154)
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4582 = arg0;
        this.field4578 = arg1;
        this.field4589 = arg2;
        this.field4583 = arg3;
        this.field4579 = arg4;
        this.field4595 = arg5;
        this.method1348(arg6, arg7);
        this.method1350();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 125)
    public final void method589(int arg0, int arg1) {
        class36.method339();
        int var3 = this.field4589 + arg0;
        int var4 = this.field4583 + arg1;
        GL var5 = class36.field518;
        class36.method310(this.field2977);
        this.method1349(1);
        var5.glTranslatef((float) var3, (float) (class36.field522 - var4), 0.0F);
        var5.glCallList(this.field2975);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V", line = 137)
    public final void method582(int arg0, int arg1, int arg2) {
        class36.method325();
        int var4 = this.field4589 + arg0;
        int var5 = this.field4583 + arg1;
        GL var6 = class36.field518;
        class36.method310(this.field2977);
        this.method1349(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class36.field522 - var5), 0.0F);
        var6.glCallList(this.field2975);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V", line = 165)
    protected final void finalize() throws Throwable {
        if (this.field2977 != -1) {
            class166.method1220(this.field2977, this.field2976, this.field2978);
            this.field2977 = -1;
            this.field2976 = 0;
        }
        if (this.field2975 != -1) {
            class166.method1216(this.field2975, this.field2978);
            this.field2975 = -1;
        }
        super.finalize();
    }
}

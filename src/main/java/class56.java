import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class56 extends class50 {

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private int field1204 = -1;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    private int field1207 = -1;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    private int field1209 = 0;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    private int field1210 = 0;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    private int field1206;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!sj", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        if (this.field1204 != -1) {
            class308.method2198(this.field1204, this.field1210, this.field1208);
            this.field1204 = -1;
            this.field1210 = 0;
        }
        if (this.field1207 != -1) {
            class308.method2195(this.field1207, this.field1208);
            this.field1207 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1036 = arg0;
        this.field1033 = arg1;
        this.field1034 = arg2;
        this.field1028 = arg3;
        this.field1041 = arg4;
        this.field1027 = arg5;
        this.method519(arg6, arg7);
        this.method518();
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()V", line = 30)
    private final void method518() {
        float var1 = (float) this.field1041 / (float) this.field1205;
        float var2 = (float) this.field1027 / (float) this.field1206;
        GL var3 = class97.field1801;
        if (this.field1207 == -1) {
            this.field1207 = var3.glGenLists(1);
            this.field1208 = class308.field5469;
        }
        var3.glNewList(this.field1207, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1041, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1027));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1041, (float) (-this.field1027));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([B[I)V", line = 56)
    private final void method519(byte[] arg0, int[] arg1) {
        this.field1205 = class189.method1440(1, this.field1041);
        this.field1206 = class189.method1440(1, this.field1027);
        byte[] var3 = new byte[this.field1206 * this.field1205 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1027; var6++) {
            for (int var7 = 0; var7 < this.field1041; var7++) {
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
            var4 += (this.field1205 - this.field1041) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class97.field1801;
        if (this.field1204 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1204 = var12[0];
            this.field1208 = class308.field5469;
        }
        class97.method803(this.field1204);
        var11.glTexImage2D(3553, 0, 6408, this.field1205, this.field1206, 0, 6408, 5121, var10);
        class308.field5473 += var10.limit() - this.field1210;
        this.field1210 = var10.limit();
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 115)
    private final void method520(int arg0) {
        if (this.field1209 == arg0) {
            return;
        }
        this.field1209 = arg0;
        GL var2 = class97.field1801;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 135)
    public final void method423(int arg0, int arg1) {
        class97.method814();
        int var3 = this.field1034 + arg0;
        int var4 = this.field1028 + arg1;
        GL var5 = class97.field1801;
        class97.method803(this.field1204);
        this.method520(1);
        var5.glTranslatef((float) var3, (float) (class97.field1809 - var4), 0.0F);
        var5.glCallList(this.field1207);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V", line = 149)
    public final void method425(int arg0, int arg1, int arg2) {
        class97.method807();
        int var4 = this.field1034 + arg0;
        int var5 = this.field1028 + arg1;
        GL var6 = class97.field1801;
        class97.method803(this.field1204);
        this.method520(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class97.field1809 - var5), 0.0F);
        var6.glCallList(this.field1207);
        var6.glLoadIdentity();
    }
}

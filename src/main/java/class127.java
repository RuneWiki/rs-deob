import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class127 extends class81 {

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    private int field1952 = -1;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    private int field1950 = 0;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    private int field1951 = -1;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    private int field1948 = 0;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    private int field1954;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V", line = 5)
    public final void method249(int arg0, int arg1, int arg2) {
        class264.method1738();
        int var4 = this.field1232 + arg0;
        int var5 = this.field1242 + arg1;
        GL var6 = class264.field4313;
        class264.method1722(this.field1951);
        this.method851(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class264.field4290 - var5), 0.0F);
        var6.glCallList(this.field1952);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([B[I)V", line = 18)
    private final void method849(byte[] arg0, int[] arg1) {
        this.field1949 = class140.method925(this.field1243, (byte) 105);
        this.field1954 = class140.method925(this.field1241, (byte) 119);
        byte[] var3 = new byte[this.field1954 * this.field1949 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1241; var6++) {
            for (int var7 = 0; var7 < this.field1243; var7++) {
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
            var4 += (this.field1949 - this.field1243) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class264.field4313;
        if (this.field1951 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1951 = var12[0];
            this.field1953 = class143.field2280;
        }
        class264.method1722(this.field1951);
        var11.glTexImage2D(3553, 0, 6408, this.field1949, this.field1954, 0, 6408, 5121, var10);
        class143.field2277 += var10.limit() - this.field1950;
        this.field1950 = var10.limit();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V", line = 81)
    private final void method850() {
        float var1 = (float) this.field1243 / (float) this.field1949;
        float var2 = (float) this.field1241 / (float) this.field1954;
        GL var3 = class264.field4313;
        if (this.field1952 == -1) {
            this.field1952 = var3.glGenLists(1);
            this.field1953 = class143.field2280;
        }
        var3.glNewList(this.field1952, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1243, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1241));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1243, (float) (-this.field1241));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V", line = 107)
    protected final void finalize() throws Throwable {
        if (this.field1951 != -1) {
            class143.method939(this.field1951, this.field1950, this.field1953);
            this.field1951 = -1;
            this.field1950 = 0;
        }
        if (this.field1952 != -1) {
            class143.method938(this.field1952, this.field1953);
            this.field1952 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V", line = 126)
    public final void method246(int arg0, int arg1) {
        class264.method1716();
        int var3 = this.field1232 + arg0;
        int var4 = this.field1242 + arg1;
        GL var5 = class264.field4313;
        class264.method1722(this.field1951);
        this.method851(1);
        var5.glTranslatef((float) var3, (float) (class264.field4290 - var4), 0.0F);
        var5.glCallList(this.field1952);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1230 = arg0;
        this.field1231 = arg1;
        this.field1232 = arg2;
        this.field1242 = arg3;
        this.field1243 = arg4;
        this.field1241 = arg5;
        this.method849(arg6, arg7);
        this.method850();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 142)
    private final void method851(int arg0) {
        if (this.field1948 == arg0) {
            return;
        }
        this.field1948 = arg0;
        GL var2 = class264.field4313;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}

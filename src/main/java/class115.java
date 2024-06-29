import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class115 extends class26 {

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    private int field1940 = 0;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    private int field1944 = 0;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    private int field1942 = -1;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    private int field1945 = -1;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    private int field1939;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    private int field1943;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 7)
    private final void method756(int arg0) {
        if (this.field1940 == arg0) {
            return;
        }
        this.field1940 = arg0;
        GL var2 = class56.field848;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([B[I)V", line = 27)
    private final void method757(byte[] arg0, int[] arg1) {
        this.field1943 = class301.method2026(this.field376, false);
        this.field1939 = class301.method2026(this.field375, false);
        byte[] var3 = new byte[this.field1943 * this.field1939 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field375; var6++) {
            for (int var7 = 0; var7 < this.field376; var7++) {
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
            var4 += (this.field1943 - this.field376) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class56.field848;
        if (this.field1945 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1945 = var12[0];
            this.field1941 = class121.field2023;
        }
        class56.method354(this.field1945);
        var11.glTexImage2D(3553, 0, 6408, this.field1943, this.field1939, 0, 6408, 5121, var10);
        class121.field2022 += var10.limit() - this.field1944;
        this.field1944 = var10.limit();
    }

    @OriginalMember(owner = "client!mm", name = "finalize", descriptor = "()V", line = 85)
    protected final void finalize() throws Throwable {
        if (this.field1945 != -1) {
            class121.method793(this.field1945, this.field1944, this.field1941);
            this.field1945 = -1;
            this.field1944 = 0;
        }
        if (this.field1942 != -1) {
            class121.method791(this.field1942, this.field1941);
            this.field1942 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V", line = 104)
    public final void method10(int arg0, int arg1) {
        class56.method364();
        int var3 = this.field368 + arg0;
        int var4 = this.field363 + arg1;
        GL var5 = class56.field848;
        class56.method354(this.field1945);
        this.method756(1);
        var5.glTranslatef((float) var3, (float) (class56.field870 - var4), 0.0F);
        var5.glCallList(this.field1942);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field360 = arg0;
        this.field367 = arg1;
        this.field368 = arg2;
        this.field363 = arg3;
        this.field376 = arg4;
        this.field375 = arg5;
        this.method757(arg6, arg7);
        this.method758();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V", line = 128)
    public final void method11(int arg0, int arg1, int arg2) {
        class56.method383();
        int var4 = this.field368 + arg0;
        int var5 = this.field363 + arg1;
        GL var6 = class56.field848;
        class56.method354(this.field1945);
        this.method756(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class56.field870 - var5), 0.0F);
        var6.glCallList(this.field1942);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V", line = 142)
    private final void method758() {
        float var1 = (float) this.field376 / (float) this.field1943;
        float var2 = (float) this.field375 / (float) this.field1939;
        GL var3 = class56.field848;
        if (this.field1942 == -1) {
            this.field1942 = var3.glGenLists(1);
            this.field1941 = class121.field2023;
        }
        var3.glNewList(this.field1942, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field376, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field375));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field376, (float) (-this.field375));
        var3.glEnd();
        var3.glEndList();
    }
}

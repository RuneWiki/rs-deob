import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class314 extends class112 {

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    private int field4765 = -1;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    private int field4768 = -1;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    private int field4769 = 0;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    private int field4771 = 0;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    private int field4766;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    private int field4770;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V", line = 5)
    private final void method2136(int arg0) {
        if (this.field4771 == arg0) {
            return;
        }
        this.field4771 = arg0;
        GL var2 = class249.field3898;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V", line = 25)
    public final void method718(int arg0, int arg1, int arg2) {
        class249.method1684();
        int var4 = this.field1982 + arg0;
        int var5 = this.field1969 + arg1;
        GL var6 = class249.field3898;
        class249.method1689(this.field4765);
        this.method2136(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class249.field3888 - var5), 0.0F);
        var6.glCallList(this.field4768);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V", line = 39)
    public final void method717(int arg0, int arg1) {
        class249.method1679();
        int var3 = this.field1982 + arg0;
        int var4 = this.field1969 + arg1;
        GL var5 = class249.field3898;
        class249.method1689(this.field4765);
        this.method2136(1);
        var5.glTranslatef((float) var3, (float) (class249.field3888 - var4), 0.0F);
        var5.glCallList(this.field4768);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 169)
    public class314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1971 = arg0;
        this.field1973 = arg1;
        this.field1982 = arg2;
        this.field1969 = arg3;
        this.field1968 = arg4;
        this.field1970 = arg5;
        this.method2138(arg6, arg7);
        this.method2137();
    }

    @OriginalMember(owner = "client!ai", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() throws Throwable {
        if (this.field4765 != -1) {
            class258.method1730(this.field4765, this.field4769, this.field4767);
            this.field4765 = -1;
            this.field4769 = 0;
        }
        if (this.field4768 != -1) {
            class258.method1728(this.field4768, this.field4767);
            this.field4768 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V", line = 83)
    private final void method2137() {
        float var1 = (float) this.field1968 / (float) this.field4770;
        float var2 = (float) this.field1970 / (float) this.field4766;
        GL var3 = class249.field3898;
        if (this.field4768 == -1) {
            this.field4768 = var3.glGenLists(1);
            this.field4767 = class258.field4013;
        }
        var3.glNewList(this.field4768, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1968, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1970));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1968, (float) (-this.field1970));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([B[I)V", line = 109)
    private final void method2138(byte[] arg0, int[] arg1) {
        this.field4770 = class226.method1510(27147, this.field1968);
        this.field4766 = class226.method1510(27147, this.field1970);
        byte[] var3 = new byte[this.field4770 * this.field4766 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1970; var6++) {
            for (int var7 = 0; var7 < this.field1968; var7++) {
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
            var4 += (this.field4770 - this.field1968) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class249.field3898;
        if (this.field4765 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4765 = var12[0];
            this.field4767 = class258.field4013;
        }
        class249.method1689(this.field4765);
        var11.glTexImage2D(3553, 0, 6408, this.field4770, this.field4766, 0, 6408, 5121, var10);
        class258.field4011 += var10.limit() - this.field4769;
        this.field4769 = var10.limit();
    }
}

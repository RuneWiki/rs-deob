import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 extends class290 {

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    private int field23 = 0;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    private int field28 = -1;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    private int field27 = -1;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 5)
    public final void method12(int arg0, int arg1) {
        class253.method1712();
        int var3 = this.field5026 + arg0;
        int var4 = this.field5014 + arg1;
        GL var5 = class253.field4319;
        class253.method1714(this.field28);
        this.method14(1);
        var5.glTranslatef((float) var3, (float) (class253.field4329 - var4), 0.0F);
        var5.glCallList(this.field27);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B[I)V", line = 19)
    private final void method13(byte[] arg0, int[] arg1) {
        this.field24 = class124.method859((byte) -96, this.field5015);
        this.field29 = class124.method859((byte) -98, this.field5009);
        byte[] var3 = new byte[this.field29 * this.field24 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field5009; var6++) {
            for (int var7 = 0; var7 < this.field5015; var7++) {
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
            var4 += (this.field24 - this.field5015) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class253.field4319;
        if (this.field28 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field28 = var12[0];
            this.field25 = class221.field3871;
        }
        class253.method1714(this.field28);
        var11.glTexImage2D(3553, 0, 6408, this.field24, this.field29, 0, 6408, 5121, var10);
        class221.field3867 += var10.limit() - this.field23;
        this.field23 = var10.limit();
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 77)
    private final void method14(int arg0) {
        if (this.field26 == arg0) {
            return;
        }
        this.field26 = arg0;
        GL var2 = class253.field4319;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field5018 = arg0;
        this.field5008 = arg1;
        this.field5026 = arg2;
        this.field5014 = arg3;
        this.field5015 = arg4;
        this.field5009 = arg5;
        this.method13(arg6, arg7);
        this.method16();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V", line = 103)
    public final void method15(int arg0, int arg1, int arg2) {
        class253.method1705();
        int var4 = this.field5026 + arg0;
        int var5 = this.field5014 + arg1;
        GL var6 = class253.field4319;
        class253.method1714(this.field28);
        this.method14(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class253.field4329 - var5), 0.0F);
        var6.glCallList(this.field27);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 122)
    private final void method16() {
        float var1 = (float) this.field5015 / (float) this.field24;
        float var2 = (float) this.field5009 / (float) this.field29;
        GL var3 = class253.field4319;
        if (this.field27 == -1) {
            this.field27 = var3.glGenLists(1);
            this.field25 = class221.field3871;
        }
        var3.glNewList(this.field27, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field5015, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field5009));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field5015, (float) (-this.field5009));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V", line = 148)
    protected final void finalize() throws Throwable {
        if (this.field28 != -1) {
            class221.method1525(this.field28, this.field23, this.field25);
            this.field28 = -1;
            this.field23 = 0;
        }
        if (this.field27 != -1) {
            class221.method1523(this.field27, this.field25);
            this.field27 = -1;
        }
        super.finalize();
    }
}

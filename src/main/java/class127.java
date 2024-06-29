import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class127 extends class145 {

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    private int field1695 = -1;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    private int field1697 = 0;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    private int field1696 = 0;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    private int field1691 = -1;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 9)
    public final void method937(int arg0, int arg1) {
        class47.method353();
        int var3 = this.field2018 + arg0;
        int var4 = this.field2019 + arg1;
        GL var5 = class47.field592;
        class47.method357(this.field1695);
        this.method940(1);
        var5.glTranslatef((float) var3, (float) (class47.field621 - var4), 0.0F);
        var5.glCallList(this.field1691);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() throws Throwable {
        if (this.field1695 != -1) {
            class298.method2039(this.field1695, this.field1696, this.field1692);
            this.field1695 = -1;
            this.field1696 = 0;
        }
        if (this.field1691 != -1) {
            class298.method2034(this.field1691, this.field1692);
            this.field1691 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 40)
    private final void method938() {
        float var1 = (float) this.field2024 / (float) this.field1693;
        float var2 = (float) this.field2029 / (float) this.field1694;
        GL var3 = class47.field592;
        if (this.field1691 == -1) {
            this.field1691 = var3.glGenLists(1);
            this.field1692 = class298.field4320;
        }
        var3.glNewList(this.field1691, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2024, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2029));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2024, (float) (-this.field2029));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 220)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2028 = arg0;
        this.field2026 = arg1;
        this.field2018 = arg2;
        this.field2019 = arg3;
        this.field2024 = arg4;
        this.field2029 = arg5;
        this.method941(arg6, arg7);
        this.method938();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lfe;)V", line = 230)
    public class127(class153 arg0) {
        this.field2024 = arg0.field2024;
        this.field2029 = arg0.field2029;
        this.field2018 = arg0.field2018;
        this.field2019 = arg0.field2019;
        this.field2028 = arg0.field2028;
        this.field2026 = arg0.field2026;
        this.method941(arg0.field2140, arg0.field2139);
        this.method938();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V", line = 68)
    public final void method939(int arg0, int arg1, int arg2) {
        class47.method382();
        int var4 = this.field2018 + arg0;
        int var5 = this.field2019 + arg1;
        GL var6 = class47.field592;
        class47.method357(this.field1695);
        this.method940(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class47.field621 - var5), 0.0F);
        var6.glCallList(this.field1691);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 81)
    private final void method940(int arg0) {
        if (this.field1697 == arg0) {
            return;
        }
        this.field1697 = arg0;
        GL var2 = class47.field592;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([B[I)V", line = 103)
    private final void method941(byte[] arg0, int[] arg1) {
        this.field1693 = class262.method1805(this.field2024, (byte) 112);
        this.field1694 = class262.method1805(this.field2029, (byte) 108);
        byte[] var3 = new byte[this.field1694 * this.field1693 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2029; var6++) {
            for (int var7 = 0; var7 < this.field2024; var7++) {
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
            var4 += (this.field1693 - this.field2024) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class47.field592;
        if (this.field1695 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1695 = var12[0];
            this.field1692 = class298.field4320;
        }
        class47.method357(this.field1695);
        var11.glTexImage2D(3553, 0, 6408, this.field1693, this.field1694, 0, 6408, 5121, var10);
        class298.field4323 += var10.limit() - this.field1696;
        this.field1696 = var10.limit();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILoa;)V", line = 164)
    public final void method942(int arg0, int arg1, class361 arg2) {
        if (arg2 == null) {
            return;
        }
        class47.method353();
        class47.method357(arg2.field5639);
        arg2.method2512(1);
        GL var4 = class47.field592;
        class47.method357(this.field1695);
        this.method940(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field5639);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class129.field1763) / (float) arg2.field5642;
        float var6 = (float) (arg1 - class129.field1766) / (float) arg2.field5645;
        float var7 = (float) (this.field2024 + arg0 - class129.field1763) / (float) arg2.field5642;
        float var8 = (float) (this.field2029 + arg1 - class129.field1766) / (float) arg2.field5645;
        int var9 = this.field2018 + arg0;
        int var10 = this.field2019 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2024 / (float) this.field1693;
        float var12 = (float) this.field2029 / (float) this.field1694;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2024 + var9), (float) (class47.field621 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class47.field621 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class47.field621 - (this.field2029 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2024 + var9), (float) (class47.field621 - (this.field2029 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }
}

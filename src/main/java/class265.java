import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class265 extends class285 {

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    private int field4439 = -1;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private int field4438 = -1;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    private int field4441 = 0;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    private int field4442 = 0;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    private int field4440;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    private int field4444;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 6)
    public final void method2014(int arg0, int arg1, int arg2) {
        class42.method276();
        int var4 = this.field4645 + arg0;
        int var5 = this.field4650 + arg1;
        GL var6 = class42.field627;
        class42.method273(this.field4439);
        this.method2019(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class42.field622 - var5), 0.0F);
        var6.glCallList(this.field4438);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 19)
    public final void method2015(int arg0, int arg1) {
        class42.method307();
        int var3 = this.field4645 + arg0;
        int var4 = this.field4650 + arg1;
        GL var5 = class42.field627;
        class42.method273(this.field4439);
        this.method2019(1);
        var5.glTranslatef((float) var3, (float) (class42.field622 - var4), 0.0F);
        var5.glCallList(this.field4438);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILwe;)V", line = 31)
    public final void method2016(int arg0, int arg1, class58 arg2) {
        if (arg2 == null) {
            return;
        }
        class42.method307();
        class42.method273(arg2.field1007);
        arg2.method493(1);
        GL var4 = class42.field627;
        class42.method273(this.field4439);
        this.method2019(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field1007);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class244.field4009) / (float) arg2.field1004;
        float var6 = (float) (arg1 - class244.field4005) / (float) arg2.field1001;
        float var7 = (float) (this.field4652 + arg0 - class244.field4009) / (float) arg2.field1004;
        float var8 = (float) (this.field4649 + arg1 - class244.field4005) / (float) arg2.field1001;
        int var9 = this.field4645 + arg0;
        int var10 = this.field4650 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4652 / (float) this.field4443;
        float var12 = (float) this.field4649 / (float) this.field4444;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4652 + var9), (float) (class42.field622 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class42.field622 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class42.field622 - (this.field4649 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4652 + var9), (float) (class42.field622 - (this.field4649 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([B[I)V", line = 82)
    private final void method2017(byte[] arg0, int[] arg1) {
        this.field4443 = class206.method1575(this.field4652, (byte) 99);
        this.field4444 = class206.method1575(this.field4649, (byte) 99);
        byte[] var3 = new byte[this.field4444 * this.field4443 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4649; var6++) {
            for (int var7 = 0; var7 < this.field4652; var7++) {
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
            var4 += (this.field4443 - this.field4652) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class42.field627;
        if (this.field4439 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4439 = var12[0];
            this.field4440 = class199.field3172;
        }
        class42.method273(this.field4439);
        var11.glTexImage2D(3553, 0, 6408, this.field4443, this.field4444, 0, 6408, 5121, var10);
        class199.field3174 += var10.limit() - this.field4441;
        this.field4441 = var10.limit();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 143)
    private final void method2018() {
        float var1 = (float) this.field4652 / (float) this.field4443;
        float var2 = (float) this.field4649 / (float) this.field4444;
        GL var3 = class42.field627;
        if (this.field4438 == -1) {
            this.field4438 = var3.glGenLists(1);
            this.field4440 = class199.field3172;
        }
        var3.glNewList(this.field4438, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4652, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4649));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4652, (float) (-this.field4649));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 168)
    private final void method2019(int arg0) {
        if (this.field4442 == arg0) {
            return;
        }
        this.field4442 = arg0;
        GL var2 = class42.field627;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 220)
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4642 = arg0;
        this.field4644 = arg1;
        this.field4645 = arg2;
        this.field4650 = arg3;
        this.field4652 = arg4;
        this.field4649 = arg5;
        this.method2017(arg6, arg7);
        this.method2018();
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Llb;)V", line = 230)
    public class265(class341 arg0) {
        this.field4652 = arg0.field4652;
        this.field4649 = arg0.field4649;
        this.field4645 = arg0.field4645;
        this.field4650 = arg0.field4650;
        this.field4642 = arg0.field4642;
        this.field4644 = arg0.field4644;
        this.method2017(arg0.field5444, arg0.field5443);
        this.method2018();
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 196)
    protected final void finalize() throws Throwable {
        if (this.field4439 != -1) {
            class199.method1531(this.field4439, this.field4441, this.field4440);
            this.field4439 = -1;
            this.field4441 = 0;
        }
        if (this.field4438 != -1) {
            class199.method1532(this.field4438, this.field4440);
            this.field4438 = -1;
        }
        super.finalize();
    }
}

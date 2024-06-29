import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class125 extends class200 {

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    private int field2012 = 0;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    private int field2013 = 0;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    private int field2014 = -1;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    private int field2015 = -1;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    private int field2010;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    private int field2016;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method987(byte[] arg0, int[] arg1) {
        this.field2016 = class319.method2255(1, this.field3065);
        this.field2011 = class319.method2255(1, this.field3064);
        byte[] var3 = new byte[this.field2016 * this.field2011 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3064; var6++) {
            for (int var7 = 0; var7 < this.field3065; var7++) {
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
            var4 += (this.field2016 - this.field3065) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class162.field2654;
        if (this.field2015 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2015 = var12[0];
            this.field2010 = class177.field2819;
        }
        class162.method1219(this.field2015);
        var11.glTexImage2D(3553, 0, 6408, this.field2016, this.field2011, 0, 6408, 5121, var10);
        class177.field2821 += var10.limit() - this.field2012;
        this.field2012 = var10.limit();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 68)
    public final void method988(int arg0, int arg1, int arg2) {
        class162.method1204();
        int var4 = this.field3063 + arg0;
        int var5 = this.field3067 + arg1;
        GL var6 = class162.field2654;
        class162.method1219(this.field2015);
        this.method991(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class162.field2618 - var5), 0.0F);
        var6.glCallList(this.field2014);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 151)
    public class125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3066 = arg0;
        this.field3070 = arg1;
        this.field3063 = arg2;
        this.field3067 = arg3;
        this.field3065 = arg4;
        this.field3064 = arg5;
        this.method987(arg6, arg7);
        this.method989();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 85)
    private final void method989() {
        float var1 = (float) this.field3065 / (float) this.field2016;
        float var2 = (float) this.field3064 / (float) this.field2011;
        GL var3 = class162.field2654;
        if (this.field2014 == -1) {
            this.field2014 = var3.glGenLists(1);
            this.field2010 = class177.field2819;
        }
        var3.glNewList(this.field2014, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3065, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3064));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3065, (float) (-this.field3064));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V", line = 113)
    protected final void finalize() throws Throwable {
        if (this.field2015 != -1) {
            class177.method1307(this.field2015, this.field2012, this.field2010);
            this.field2015 = -1;
            this.field2012 = 0;
        }
        if (this.field2014 != -1) {
            class177.method1302(this.field2014, this.field2010);
            this.field2014 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V", line = 140)
    public final void method990(int arg0, int arg1) {
        class162.method1195();
        int var3 = this.field3063 + arg0;
        int var4 = this.field3067 + arg1;
        GL var5 = class162.field2654;
        class162.method1219(this.field2015);
        this.method991(1);
        var5.glTranslatef((float) var3, (float) (class162.field2618 - var4), 0.0F);
        var5.glCallList(this.field2014);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 162)
    private final void method991(int arg0) {
        if (this.field2013 == arg0) {
            return;
        }
        this.field2013 = arg0;
        GL var2 = class162.field2654;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}

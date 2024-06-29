import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class79 extends class249 {

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    private int field1332 = -1;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    private int field1333 = 0;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    private int field1336 = -1;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    private int field1337 = 0;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 169)
    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4114 = arg0;
        this.field4124 = arg1;
        this.field4122 = arg2;
        this.field4119 = arg3;
        this.field4116 = arg4;
        this.field4128 = arg5;
        this.method589(arg6, arg7);
        this.method590();
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() throws Throwable {
        if (this.field1332 != -1) {
            class136.method1007(this.field1332, this.field1337, this.field1338);
            this.field1332 = -1;
            this.field1337 = 0;
        }
        if (this.field1336 != -1) {
            class136.method1006(this.field1336, this.field1338);
            this.field1336 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V", line = 30)
    public final void method586(int arg0, int arg1, int arg2) {
        class21.method151();
        int var4 = this.field4122 + arg0;
        int var5 = this.field4119 + arg1;
        GL var6 = class21.field377;
        class21.method140(this.field1332);
        this.method588(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class21.field361 - var5), 0.0F);
        var6.glCallList(this.field1336);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V", line = 44)
    public final void method587(int arg0, int arg1) {
        class21.method134();
        int var3 = this.field4122 + arg0;
        int var4 = this.field4119 + arg1;
        GL var5 = class21.field377;
        class21.method140(this.field1332);
        this.method588(1);
        var5.glTranslatef((float) var3, (float) (class21.field361 - var4), 0.0F);
        var5.glCallList(this.field1336);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 57)
    private final void method588(int arg0) {
        if (this.field1333 == arg0) {
            return;
        }
        this.field1333 = arg0;
        GL var2 = class21.field377;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([B[I)V", line = 78)
    private final void method589(byte[] arg0, int[] arg1) {
        this.field1335 = class151.method1130(93, this.field4116);
        this.field1334 = class151.method1130(121, this.field4128);
        byte[] var3 = new byte[this.field1335 * this.field1334 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4128; var6++) {
            for (int var7 = 0; var7 < this.field4116; var7++) {
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
            var4 += (this.field1335 - this.field4116) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class21.field377;
        if (this.field1332 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1332 = var12[0];
            this.field1338 = class136.field2300;
        }
        class21.method140(this.field1332);
        var11.glTexImage2D(3553, 0, 6408, this.field1335, this.field1334, 0, 6408, 5121, var10);
        class136.field2301 += var10.limit() - this.field1337;
        this.field1337 = var10.limit();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 140)
    private final void method590() {
        float var1 = (float) this.field4116 / (float) this.field1335;
        float var2 = (float) this.field4128 / (float) this.field1334;
        GL var3 = class21.field377;
        if (this.field1336 == -1) {
            this.field1336 = var3.glGenLists(1);
            this.field1338 = class136.field2300;
        }
        var3.glNewList(this.field1336, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4116, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4128));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4116, (float) (-this.field4128));
        var3.glEnd();
        var3.glEndList();
    }
}

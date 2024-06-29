import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class255 extends class257 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([I)V", line = 5)
    public final void method1776(int[] arg0) {
        this.field4334 = class229.method1622(true, this.field2207);
        this.field4338 = class229.method1622(true, this.field2202);
        byte[] var2 = new byte[this.field4338 * this.field4334 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4334 - this.field2207) * 4;
        for (int var6 = 0; var6 < this.field2202; var6++) {
            for (int var7 = 0; var7 < this.field2207; var7++) {
                int var8 = arg0[var4++];
                if (var8 == 0) {
                    var3 += 4;
                } else {
                    var2[var3++] = (byte) (var8 >> 16);
                    var2[var3++] = (byte) (var8 >> 8);
                    var2[var3++] = (byte) var8;
                    var2[var3++] = (byte) (var8 >> 24);
                }
            }
            var3 += var5;
        }
        ByteBuffer var9 = ByteBuffer.wrap(var2);
        GL var10 = class154.field2479;
        if (this.field4336 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4336 = var11[0];
        }
        class154.method1141(this.field4336);
        var10.glTexImage2D(3553, 0, 6408, this.field4334, this.field4338, 0, 6408, 5121, var9);
        class79.field1321 += var9.limit() - this.field4339;
        this.field4339 = var9.limit();
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lkb;)V", line = 62)
    public class255(class82 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class260 extends class232 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([I)V", line = 5)
    public final void method1605(int[] arg0) {
        this.field3693 = class329.method2347(this.field4802, (byte) -96);
        this.field3697 = class329.method2347(this.field4811, (byte) -96);
        byte[] var2 = new byte[this.field3697 * this.field3693 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3693 - this.field4802) * 4;
        for (int var6 = 0; var6 < this.field4811; var6++) {
            for (int var7 = 0; var7 < this.field4802; var7++) {
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
        GL var10 = class245.field3884;
        if (this.field3695 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3695 = var11[0];
        }
        class245.method1729(this.field3695);
        var10.glTexImage2D(3553, 0, 6408, this.field3693, this.field3697, 0, 6408, 5121, var9);
        class173.field2705 += var9.limit() - this.field3694;
        this.field3694 = var9.limit();
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lle;)V", line = 65)
    public class260(class137 arg0) {
        super(arg0);
    }
}

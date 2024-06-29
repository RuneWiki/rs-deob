import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class98 extends class137 {

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lfd;)V", line = 5)
    public class98(class206 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([I)V", line = 8)
    public final void method645(int[] arg0) {
        this.field2296 = class226.method1510(27147, this.field4377);
        this.field2294 = class226.method1510(27147, this.field4383);
        byte[] var2 = new byte[this.field2296 * this.field2294 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2296 - this.field4377) * 4;
        for (int var6 = 0; var6 < this.field4383; var6++) {
            for (int var7 = 0; var7 < this.field4377; var7++) {
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
        GL var10 = class249.field3898;
        if (this.field2292 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2292 = var11[0];
        }
        class249.method1689(this.field2292);
        var10.glTexImage2D(3553, 0, 6408, this.field2296, this.field2294, 0, 6408, 5121, var9);
        class258.field4011 += var9.limit() - this.field2297;
        this.field2297 = var9.limit();
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

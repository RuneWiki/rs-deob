import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class120 extends class361 {

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lvn;)V", line = 5)
    public class120(class11 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I)V", line = 8)
    public final void method872(int[] arg0) {
        this.field5642 = class262.method1805(this.field2252, (byte) -89);
        this.field5645 = class262.method1805(this.field2250, (byte) -42);
        byte[] var2 = new byte[this.field5645 * this.field5642 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field5642 - this.field2252) * 4;
        for (int var6 = 0; var6 < this.field2250; var6++) {
            for (int var7 = 0; var7 < this.field2252; var7++) {
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
        GL var10 = class47.field592;
        if (this.field5639 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field5639 = var11[0];
        }
        class47.method357(this.field5639);
        var10.glTexImage2D(3553, 0, 6408, this.field5642, this.field5645, 0, 6408, 5121, var9);
        class298.field4323 += var9.limit() - this.field5644;
        this.field5644 = var9.limit();
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

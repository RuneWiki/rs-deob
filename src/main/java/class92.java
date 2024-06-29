import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class92 extends class314 {

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lek;)V", line = 5)
    public class92(class220 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIII[I)V", line = 8)
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([I)V", line = 11)
    public final void method619(int[] arg0) {
        this.field4870 = class120.method843(-102, this.field825);
        this.field4867 = class120.method843(111, this.field816);
        byte[] var2 = new byte[this.field4870 * this.field4867 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4870 - this.field825) * 4;
        for (int var6 = 0; var6 < this.field816; var6++) {
            for (int var7 = 0; var7 < this.field825; var7++) {
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
        GL var10 = class232.field3716;
        if (this.field4868 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4868 = var11[0];
        }
        class232.method1662(this.field4868);
        var10.glTexImage2D(3553, 0, 6408, this.field4870, this.field4867, 0, 6408, 5121, var9);
        class230.field3662 += var9.limit() - this.field4865;
        this.field4865 = var9.limit();
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class326 extends class210 {

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljm;)V", line = 8)
    public class326(class303 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([I)V", line = 11)
    public final void method1514(int[] arg0) {
        this.field3688 = class135.method922(21793, this.field1543);
        this.field3690 = class135.method922(21793, this.field1533);
        byte[] var2 = new byte[this.field3690 * this.field3688 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3688 - this.field1543) * 4;
        for (int var6 = 0; var6 < this.field1533; var6++) {
            for (int var7 = 0; var7 < this.field1543; var7++) {
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
        GL var10 = class147.field2479;
        if (this.field3693 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3693 = var11[0];
        }
        class147.method1002(this.field3693);
        var10.glTexImage2D(3553, 0, 6408, this.field3688, this.field3690, 0, 6408, 5121, var9);
        class6.field48 += var9.limit() - this.field3692;
        this.field3692 = var9.limit();
    }
}

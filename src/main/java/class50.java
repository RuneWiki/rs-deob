import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class50 extends class303 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([I)V", line = 5)
    public final void method341(int[] arg0) {
        this.field4621 = class104.method731(this.field3533, -107);
        this.field4623 = class104.method731(this.field3537, -94);
        byte[] var2 = new byte[this.field4623 * this.field4621 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4621 - this.field3533) * 4;
        for (int var6 = 0; var6 < this.field3537; var6++) {
            for (int var7 = 0; var7 < this.field3533; var7++) {
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
        GL var10 = class117.field1801;
        if (this.field4618 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4618 = var11[0];
        }
        class117.method814(this.field4618);
        var10.glTexImage2D(3553, 0, 6408, this.field4621, this.field4623, 0, 6408, 5121, var9);
        class174.field2593 += var9.limit() - this.field4622;
        this.field4622 = var9.limit();
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lle;)V", line = 65)
    public class50(class127 arg0) {
        super(arg0);
    }
}

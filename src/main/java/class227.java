import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class227 extends class203 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([I)V", line = 5)
    public final void method1501(int[] arg0) {
        this.field3615 = class189.method1440(1, this.field1377);
        this.field3612 = class189.method1440(1, this.field1375);
        byte[] var2 = new byte[this.field3615 * this.field3612 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3615 - this.field1377) * 4;
        for (int var6 = 0; var6 < this.field1375; var6++) {
            for (int var7 = 0; var7 < this.field1377; var7++) {
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
        GL var10 = class97.field1801;
        if (this.field3614 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3614 = var11[0];
        }
        class97.method803(this.field3614);
        var10.glTexImage2D(3553, 0, 6408, this.field3615, this.field3612, 0, 6408, 5121, var9);
        class308.field5473 += var9.limit() - this.field3609;
        this.field3609 = var9.limit();
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lbn;)V", line = 65)
    public class227(class66 arg0) {
        super(arg0);
    }
}

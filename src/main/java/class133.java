import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class133 extends class326 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([I)V", line = 5)
    public final void method920(int[] arg0) {
        this.field5487 = class5.method28(-127, this.field667);
        this.field5485 = class5.method28(-83, this.field669);
        byte[] var2 = new byte[this.field5487 * this.field5485 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field5487 - this.field667) * 4;
        for (int var6 = 0; var6 < this.field669; var6++) {
            for (int var7 = 0; var7 < this.field667; var7++) {
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
        GL var10 = class108.field1899;
        if (this.field5486 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field5486 = var11[0];
        }
        class108.method736(this.field5486);
        var10.glTexImage2D(3553, 0, 6408, this.field5487, this.field5485, 0, 6408, 5121, var9);
        class263.field4544 += var9.limit() - this.field5489;
        this.field5489 = var9.limit();
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lsm;)V", line = 62)
    public class133(class159 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

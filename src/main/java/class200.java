import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class200 extends class2 {

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lqn;)V", line = 8)
    public class200(class361 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([I)V", line = 11)
    public final void method7(int[] arg0) {
        this.field12 = class261.method1918(this.field3366, 22);
        this.field7 = class261.method1918(this.field3367, 22);
        byte[] var2 = new byte[this.field7 * this.field12 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field12 - this.field3366) * 4;
        for (int var6 = 0; var6 < this.field3367; var6++) {
            for (int var7 = 0; var7 < this.field3366; var7++) {
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
        GL var10 = class240.field3771;
        if (this.field8 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field8 = var11[0];
        }
        class240.method1786(this.field8);
        var10.glTexImage2D(3553, 0, 6408, this.field12, this.field7, 0, 6408, 5121, var9);
        class28.field458 += var9.limit() - this.field13;
        this.field13 = var9.limit();
    }
}

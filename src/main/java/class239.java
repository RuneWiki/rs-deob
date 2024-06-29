import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class239 extends class221 {

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([I)V", line = 8)
    public final void method1576(int[] arg0) {
        this.field3462 = class230.method1638((byte) 92, this.field312);
        this.field3465 = class230.method1638((byte) 106, this.field315);
        byte[] var2 = new byte[this.field3465 * this.field3462 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3462 - this.field312) * 4;
        for (int var6 = 0; var6 < this.field315; var6++) {
            for (int var7 = 0; var7 < this.field312; var7++) {
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
        GL var10 = class36.field518;
        if (this.field3464 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3464 = var11[0];
        }
        class36.method310(this.field3464);
        var10.glTexImage2D(3553, 0, 6408, this.field3462, this.field3465, 0, 6408, 5121, var9);
        class166.field2495 += var9.limit() - this.field3461;
        this.field3461 = var9.limit();
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lvd;)V", line = 65)
    public class239(class134 arg0) {
        super(arg0);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class334 extends class44 {

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([I)V", line = 8)
    public final void method340(int[] arg0) {
        this.field624 = class312.method2135(984942384, this.field4175);
        this.field628 = class312.method2135(984942384, this.field4184);
        byte[] var2 = new byte[this.field628 * this.field624 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field624 - this.field4175) * 4;
        for (int var6 = 0; var6 < this.field4184; var6++) {
            for (int var7 = 0; var7 < this.field4175; var7++) {
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
        GL var10 = class73.field1051;
        if (this.field626 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field626 = var11[0];
        }
        class73.method537(this.field626);
        var10.glTexImage2D(3553, 0, 6408, this.field624, this.field628, 0, 6408, 5121, var9);
        class80.field1184 += var9.limit() - this.field627;
        this.field627 = var9.limit();
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Laf;)V", line = 65)
    public class334(class195 arg0) {
        super(arg0);
    }
}

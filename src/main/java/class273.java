import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class273 extends class109 {

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lfi;)V", line = 5)
    public class273(class222 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIII[I)V", line = 8)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([I)V", line = 11)
    public final void method722(int[] arg0) {
        this.field1624 = class275.method1871(this.field3918, 1110164296);
        this.field1626 = class275.method1871(this.field3914, 1110164296);
        byte[] var2 = new byte[this.field1626 * this.field1624 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1624 - this.field3918) * 4;
        for (int var6 = 0; var6 < this.field3914; var6++) {
            for (int var7 = 0; var7 < this.field3918; var7++) {
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
        GL var10 = class45.field688;
        if (this.field1622 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1622 = var11[0];
        }
        class45.method321(this.field1622);
        var10.glTexImage2D(3553, 0, 6408, this.field1624, this.field1626, 0, 6408, 5121, var9);
        class36.field573 += var9.limit() - this.field1623;
        this.field1623 = var9.limit();
    }
}

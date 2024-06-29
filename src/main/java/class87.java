import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class87 extends class17 {

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Laf;)V", line = 5)
    public class87(class72 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([I)V", line = 8)
    public final void method86(int[] arg0) {
        this.field220 = class110.method746(this.field3200, -705295902);
        this.field221 = class110.method746(this.field3189, -705295902);
        byte[] var2 = new byte[this.field221 * this.field220 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field220 - this.field3200) * 4;
        for (int var6 = 0; var6 < this.field3189; var6++) {
            for (int var7 = 0; var7 < this.field3200; var7++) {
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
        GL var10 = class166.field2648;
        if (this.field222 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field222 = var11[0];
        }
        class166.method1182(this.field222);
        var10.glTexImage2D(3553, 0, 6408, this.field220, this.field221, 0, 6408, 5121, var9);
        class103.field1458 += var9.limit() - this.field218;
        this.field218 = var9.limit();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

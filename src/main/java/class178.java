import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class178 extends class68 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([I)V", line = 5)
    public final void method433(int[] arg0) {
        this.field998 = class270.method1847(this.field3281, 96);
        this.field1003 = class270.method1847(this.field3284, 96);
        byte[] var2 = new byte[this.field998 * this.field1003 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field998 - this.field3281) * 4;
        for (int var6 = 0; var6 < this.field3284; var6++) {
            for (int var7 = 0; var7 < this.field3281; var7++) {
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
        GL var10 = class217.field3551;
        if (this.field999 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field999 = var11[0];
        }
        class217.method1457(this.field999);
        var10.glTexImage2D(3553, 0, 6408, this.field998, this.field1003, 0, 6408, 5121, var9);
        class207.field3382 += var9.limit() - this.field1001;
        this.field1001 = var9.limit();
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ldc;)V", line = 65)
    public class178(class109 arg0) {
        super(arg0);
    }
}

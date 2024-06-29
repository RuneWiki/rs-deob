import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class19 extends class239 {

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lun;)V", line = 8)
    public class19(class190 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([I)V", line = 11)
    public final void method201(int[] arg0) {
        this.field3733 = class215.method1568(479166497, this.field2788);
        this.field3738 = class215.method1568(479166497, this.field2791);
        byte[] var2 = new byte[this.field3738 * this.field3733 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3733 - this.field2788) * 4;
        for (int var6 = 0; var6 < this.field2791; var6++) {
            for (int var7 = 0; var7 < this.field2788; var7++) {
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
        GL var10 = class109.field1456;
        if (this.field3739 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3739 = var11[0];
        }
        class109.method752(this.field3739);
        var10.glTexImage2D(3553, 0, 6408, this.field3733, this.field3738, 0, 6408, 5121, var9);
        class103.field1370 += var9.limit() - this.field3737;
        this.field3737 = var9.limit();
    }
}

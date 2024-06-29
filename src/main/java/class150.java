import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class150 extends class140 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([I)V", line = 5)
    public final void method1094(int[] arg0) {
        this.field2495 = class237.method1678(this.field1131, -31981);
        this.field2493 = class237.method1678(this.field1135, -31981);
        byte[] var2 = new byte[this.field2495 * this.field2493 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2495 - this.field1131) * 4;
        for (int var6 = 0; var6 < this.field1135; var6++) {
            for (int var7 = 0; var7 < this.field1131; var7++) {
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
        GL var10 = class117.field2143;
        if (this.field2489 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2489 = var11[0];
        }
        class117.method939(this.field2489);
        var10.glTexImage2D(3553, 0, 6408, this.field2495, this.field2493, 0, 6408, 5121, var9);
        class41.field661 += var9.limit() - this.field2492;
        this.field2492 = var9.limit();
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lud;)V", line = 65)
    public class150(class79 arg0) {
        super(arg0);
    }
}

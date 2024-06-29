import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class256 extends class58 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([I)V", line = 5)
    public final void method498(int[] arg0) {
        this.field1004 = class206.method1575(this.field197, (byte) 99);
        this.field1001 = class206.method1575(this.field199, (byte) 99);
        byte[] var2 = new byte[this.field1004 * this.field1001 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1004 - this.field197) * 4;
        for (int var6 = 0; var6 < this.field199; var6++) {
            for (int var7 = 0; var7 < this.field197; var7++) {
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
        GL var10 = class42.field627;
        if (this.field1007 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1007 = var11[0];
        }
        class42.method273(this.field1007);
        var10.glTexImage2D(3553, 0, 6408, this.field1004, this.field1001, 0, 6408, 5121, var9);
        class199.field3174 += var9.limit() - this.field1002;
        this.field1002 = var9.limit();
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lsi;)V", line = 62)
    public class256(class351 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

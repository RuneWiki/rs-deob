import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class311 extends class136 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([I)V", line = 5)
    public final void method974(int[] arg0) {
        this.field2419 = class143.method1013((byte) 43, this.field627);
        this.field2423 = class143.method1013((byte) 70, this.field629);
        byte[] var2 = new byte[this.field2423 * this.field2419 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2419 - this.field627) * 4;
        for (int var6 = 0; var6 < this.field629; var6++) {
            for (int var7 = 0; var7 < this.field627; var7++) {
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
        GL var10 = class123.field2212;
        if (this.field2422 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2422 = var11[0];
        }
        class123.method867(this.field2422);
        var10.glTexImage2D(3553, 0, 6408, this.field2419, this.field2423, 0, 6408, 5121, var9);
        class285.field4890 += var9.limit() - this.field2424;
        this.field2424 = var9.limit();
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lvd;)V", line = 65)
    public class311(class127 arg0) {
        super(arg0);
    }
}

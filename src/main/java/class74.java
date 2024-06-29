import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class74 extends class86 {

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lgm;)V", line = 8)
    public class74(class249 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([I)V", line = 11)
    public final void method548(int[] arg0) {
        this.field1400 = class10.method73((byte) -68, this.field4202);
        this.field1398 = class10.method73((byte) 1, this.field4207);
        byte[] var2 = new byte[this.field1400 * this.field1398 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1400 - this.field4202) * 4;
        for (int var6 = 0; var6 < this.field4207; var6++) {
            for (int var7 = 0; var7 < this.field4202; var7++) {
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
        GL var10 = class94.field1473;
        if (this.field1396 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1396 = var11[0];
        }
        class94.method698(this.field1396);
        var10.glTexImage2D(3553, 0, 6408, this.field1400, this.field1398, 0, 6408, 5121, var9);
        class198.field2964 += var9.limit() - this.field1394;
        this.field1394 = var9.limit();
    }
}

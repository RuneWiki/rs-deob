import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class45 extends class160 {

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lra;)V", line = 8)
    public class45(class43 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([I)V", line = 11)
    public final void method347(int[] arg0) {
        this.field2540 = class140.method925(this.field1347, (byte) 100);
        this.field2545 = class140.method925(this.field1345, (byte) 109);
        byte[] var2 = new byte[this.field2545 * this.field2540 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2540 - this.field1347) * 4;
        for (int var6 = 0; var6 < this.field1345; var6++) {
            for (int var7 = 0; var7 < this.field1347; var7++) {
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
        GL var10 = class264.field4313;
        if (this.field2544 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2544 = var11[0];
        }
        class264.method1722(this.field2544);
        var10.glTexImage2D(3553, 0, 6408, this.field2540, this.field2545, 0, 6408, 5121, var9);
        class143.field2277 += var9.limit() - this.field2541;
        this.field2541 = var9.limit();
    }
}

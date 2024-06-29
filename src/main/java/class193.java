import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class193 extends class277 {

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lcm;)V", line = 5)
    public class193(class181 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([I)V", line = 8)
    public final void method1450(int[] arg0) {
        this.field4755 = class118.method904(1440830960, this.field4318);
        this.field4752 = class118.method904(1440830960, this.field4320);
        byte[] var2 = new byte[this.field4755 * this.field4752 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4755 - this.field4318) * 4;
        for (int var6 = 0; var6 < this.field4320; var6++) {
            for (int var7 = 0; var7 < this.field4318; var7++) {
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
        GL var10 = class47.field739;
        if (this.field4753 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4753 = var11[0];
        }
        class47.method317(this.field4753);
        var10.glTexImage2D(3553, 0, 6408, this.field4755, this.field4752, 0, 6408, 5121, var9);
        class119.field2005 += var9.limit() - this.field4756;
        this.field4756 = var9.limit();
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

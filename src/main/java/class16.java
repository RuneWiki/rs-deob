import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class16 extends class186 {

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ln;)V", line = 5)
    public class16(class178 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([I)V", line = 8)
    public final void method122(int[] arg0) {
        this.field2837 = class47.method330((byte) 83, this.field3847);
        this.field2838 = class47.method330((byte) -123, this.field3844);
        byte[] var2 = new byte[this.field2838 * this.field2837 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2837 - this.field3847) * 4;
        for (int var6 = 0; var6 < this.field3844; var6++) {
            for (int var7 = 0; var7 < this.field3847; var7++) {
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
        GL var10 = class333.field5160;
        if (this.field2834 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2834 = var11[0];
        }
        class333.method2282(this.field2834);
        var10.glTexImage2D(3553, 0, 6408, this.field2837, this.field2838, 0, 6408, 5121, var9);
        class301.field4647 += var9.limit() - this.field2840;
        this.field2840 = var9.limit();
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

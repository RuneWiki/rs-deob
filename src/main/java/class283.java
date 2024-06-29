import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class283 extends class325 {

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lln;)V", line = 5)
    public class283(class118 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIII[I)V", line = 8)
    public class283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([I)V", line = 11)
    public final void method2056(int[] arg0) {
        this.field4889 = class344.method2409(this.field2536, -24724);
        this.field4890 = class344.method2409(this.field2553, -24724);
        byte[] var2 = new byte[this.field4890 * this.field4889 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4889 - this.field2536) * 4;
        for (int var6 = 0; var6 < this.field2553; var6++) {
            for (int var7 = 0; var7 < this.field2536; var7++) {
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
        GL var10 = class141.field2025;
        if (this.field4891 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4891 = var11[0];
        }
        class141.method1000(this.field4891);
        var10.glTexImage2D(3553, 0, 6408, this.field4889, this.field4890, 0, 6408, 5121, var9);
        class305.field4569 += var9.limit() - this.field4894;
        this.field4894 = var9.limit();
    }
}

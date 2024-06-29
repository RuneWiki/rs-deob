import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class136 extends class40 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([I)V", line = 5)
    public final void method275(int[] arg0) {
        this.field843 = class58.method383((byte) -68, this.field1058);
        this.field844 = class58.method383((byte) -110, this.field1060);
        byte[] var2 = new byte[this.field844 * this.field843 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field843 - this.field1058) * 4;
        for (int var6 = 0; var6 < this.field1060; var6++) {
            for (int var7 = 0; var7 < this.field1058; var7++) {
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
        GL var10 = class247.field4253;
        if (this.field842 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field842 = var11[0];
        }
        class247.method1691(this.field842);
        var10.glTexImage2D(3553, 0, 6408, this.field843, this.field844, 0, 6408, 5121, var9);
        class274.field4746 += var9.limit() - this.field845;
        this.field845 = var9.limit();
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lqg;)V", line = 65)
    public class136(class231 arg0) {
        super(arg0);
    }
}

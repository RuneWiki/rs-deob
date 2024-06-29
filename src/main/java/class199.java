import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class199 extends class202 {

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Laf;)V", line = 5)
    public class199(class189 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIII[I)V", line = 8)
    public class199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([I)V", line = 11)
    public final void method1374(int[] arg0) {
        this.field2849 = class258.method1873(this.field1136, 832520144);
        this.field2851 = class258.method1873(this.field1144, 832520144);
        byte[] var2 = new byte[this.field2851 * this.field2849 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2849 - this.field1136) * 4;
        for (int var6 = 0; var6 < this.field1144; var6++) {
            for (int var7 = 0; var7 < this.field1136; var7++) {
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
        GL var10 = class250.field3818;
        if (this.field2850 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2850 = var11[0];
        }
        class250.method1806(this.field2850);
        var10.glTexImage2D(3553, 0, 6408, this.field2849, this.field2851, 0, 6408, 5121, var9);
        class266.field4195 += var9.limit() - this.field2848;
        this.field2848 = var9.limit();
    }
}

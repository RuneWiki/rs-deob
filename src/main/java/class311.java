import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class311 extends class14 {

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ln;)V", line = 5)
    public class311(class298 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V", line = 8)
    public final void method92(int[] arg0) {
        this.field165 = class290.method2032(111, this.field5040);
        this.field171 = class290.method2032(53, this.field5030);
        byte[] var2 = new byte[this.field171 * this.field165 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field165 - this.field5040) * 4;
        for (int var6 = 0; var6 < this.field5030; var6++) {
            for (int var7 = 0; var7 < this.field5040; var7++) {
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
        GL var10 = class186.field2990;
        if (this.field166 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field166 = var11[0];
        }
        class186.method1288(this.field166);
        var10.glTexImage2D(3553, 0, 6408, this.field165, this.field171, 0, 6408, 5121, var9);
        class275.field4357 += var9.limit() - this.field170;
        this.field170 = var9.limit();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

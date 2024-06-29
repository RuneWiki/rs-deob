import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class20 extends class87 {

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([I)V", line = 8)
    public final void method120(int[] arg0) {
        this.field1480 = class303.method2049(this.field4785, 2539);
        this.field1479 = class303.method2049(this.field4786, 2539);
        byte[] var2 = new byte[this.field1480 * this.field1479 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1480 - this.field4785) * 4;
        for (int var6 = 0; var6 < this.field4786; var6++) {
            for (int var7 = 0; var7 < this.field4785; var7++) {
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
        GL var10 = class99.field1682;
        if (this.field1478 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1478 = var11[0];
        }
        class99.method749(this.field1478);
        var10.glTexImage2D(3553, 0, 6408, this.field1480, this.field1479, 0, 6408, 5121, var9);
        class274.field4581 += var9.limit() - this.field1475;
        this.field1475 = var9.limit();
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lrl;)V", line = 65)
    public class20(class327 arg0) {
        super(arg0);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class313 extends class265 {

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lsc;)V", line = 8)
    public class313(class288 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([I)V", line = 11)
    public final void method1859(int[] arg0) {
        this.field4339 = class311.method2264(this.field1353, (byte) -76);
        this.field4340 = class311.method2264(this.field1356, (byte) -51);
        byte[] var2 = new byte[this.field4340 * this.field4339 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4339 - this.field1353) * 4;
        for (int var6 = 0; var6 < this.field1356; var6++) {
            for (int var7 = 0; var7 < this.field1353; var7++) {
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
        GL var10 = class241.field4012;
        if (this.field4336 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4336 = var11[0];
        }
        class241.method1687(this.field4336);
        var10.glTexImage2D(3553, 0, 6408, this.field4339, this.field4340, 0, 6408, 5121, var9);
        class239.field3976 += var9.limit() - this.field4338;
        this.field4338 = var9.limit();
    }
}

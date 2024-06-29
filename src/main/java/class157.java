import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class157 extends class200 {

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lch;)V", line = 5)
    public class157(class158 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I)V", line = 8)
    public final void method1141(int[] arg0) {
        this.field3028 = class226.method1571(true, this.field13);
        this.field3030 = class226.method1571(true, this.field24);
        byte[] var2 = new byte[this.field3030 * this.field3028 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3028 - this.field13) * 4;
        for (int var6 = 0; var6 < this.field24; var6++) {
            for (int var7 = 0; var7 < this.field13; var7++) {
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
        GL var10 = class272.field4310;
        if (this.field3034 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3034 = var11[0];
        }
        class272.method1965(this.field3034);
        var10.glTexImage2D(3553, 0, 6408, this.field3028, this.field3030, 0, 6408, 5121, var9);
        class1.field5 += var9.limit() - this.field3031;
        this.field3031 = var9.limit();
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

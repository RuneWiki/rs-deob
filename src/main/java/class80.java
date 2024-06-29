import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class80 extends class266 {

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lgi;)V", line = 5)
    public class80(class204 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I)V", line = 8)
    public final void method525(int[] arg0) {
        this.field4511 = class53.method336(-1753429918, this.field1828);
        this.field4507 = class53.method336(-1753429918, this.field1821);
        byte[] var2 = new byte[this.field4511 * this.field4507 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4511 - this.field1828) * 4;
        for (int var6 = 0; var6 < this.field1821; var6++) {
            for (int var7 = 0; var7 < this.field1828; var7++) {
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
        GL var10 = class167.field2806;
        if (this.field4508 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4508 = var11[0];
        }
        class167.method1033(this.field4508);
        var10.glTexImage2D(3553, 0, 6408, this.field4511, this.field4507, 0, 6408, 5121, var9);
        class101.field1722 += var9.limit() - this.field4509;
        this.field4509 = var9.limit();
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

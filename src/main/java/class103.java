import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class103 extends class87 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V", line = 5)
    public final void method638(int[] arg0) {
        this.field1568 = class124.method859((byte) -96, this.field2343);
        this.field1569 = class124.method859((byte) -96, this.field2348);
        byte[] var2 = new byte[this.field1569 * this.field1568 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1568 - this.field2343) * 4;
        for (int var6 = 0; var6 < this.field2348; var6++) {
            for (int var7 = 0; var7 < this.field2343; var7++) {
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
        GL var10 = class253.field4319;
        if (this.field1573 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1573 = var11[0];
        }
        class253.method1714(this.field1573);
        var10.glTexImage2D(3553, 0, 6408, this.field1568, this.field1569, 0, 6408, 5121, var9);
        class221.field3867 += var9.limit() - this.field1570;
        this.field1570 = var9.limit();
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lj;)V", line = 62)
    public class103(class227 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

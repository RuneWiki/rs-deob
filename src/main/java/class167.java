import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class167 extends class100 {

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lmb;)V", line = 8)
    public class167(class99 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([I)V", line = 11)
    public final void method760(int[] arg0) {
        this.field1765 = class151.method1130(40, this.field2976);
        this.field1763 = class151.method1130(60, this.field2981);
        byte[] var2 = new byte[this.field1765 * this.field1763 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1765 - this.field2976) * 4;
        for (int var6 = 0; var6 < this.field2981; var6++) {
            for (int var7 = 0; var7 < this.field2976; var7++) {
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
        GL var10 = class21.field377;
        if (this.field1768 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1768 = var11[0];
        }
        class21.method140(this.field1768);
        var10.glTexImage2D(3553, 0, 6408, this.field1765, this.field1763, 0, 6408, 5121, var9);
        class136.field2301 += var9.limit() - this.field1762;
        this.field1762 = var9.limit();
    }
}

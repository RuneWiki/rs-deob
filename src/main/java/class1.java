import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class105 {

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIII[I)V", line = 5)
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([I)V", line = 8)
    public final void method1(int[] arg0) {
        this.field1773 = class210.method1532(-1429694904, this.field2007);
        this.field1775 = class210.method1532(-1429694904, this.field2011);
        byte[] var2 = new byte[this.field1775 * this.field1773 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1773 - this.field2007) * 4;
        for (int var6 = 0; var6 < this.field2011; var6++) {
            for (int var7 = 0; var7 < this.field2007; var7++) {
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
        GL var10 = class265.field4099;
        if (this.field1776 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1776 = var11[0];
        }
        class265.method1889(this.field1776);
        var10.glTexImage2D(3553, 0, 6408, this.field1773, this.field1775, 0, 6408, 5121, var9);
        class214.field3411 += var9.limit() - this.field1771;
        this.field1771 = var9.limit();
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lgk;)V", line = 65)
    public class1(class7 arg0) {
        super(arg0);
    }
}

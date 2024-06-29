import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class66 extends class258 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I)V", line = 5)
    public final void method375(int[] arg0) {
        this.field4384 = class180.method1294(true, this.field4801);
        this.field4385 = class180.method1294(true, this.field4808);
        byte[] var2 = new byte[this.field4385 * this.field4384 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4384 - this.field4801) * 4;
        for (int var6 = 0; var6 < this.field4808; var6++) {
            for (int var7 = 0; var7 < this.field4801; var7++) {
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
        GL var10 = class90.field1390;
        if (this.field4380 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4380 = var11[0];
        }
        class90.method617(this.field4380);
        var10.glTexImage2D(3553, 0, 6408, this.field4384, this.field4385, 0, 6408, 5121, var9);
        class7.field90 += var9.limit() - this.field4383;
        this.field4383 = var9.limit();
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lha;)V", line = 62)
    public class66(class49 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

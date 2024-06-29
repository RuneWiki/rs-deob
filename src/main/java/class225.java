import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class225 extends class328 {

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lkn;)V", line = 5)
    public class225(class178 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([I)V", line = 8)
    public final void method1582(int[] arg0) {
        this.field4949 = class110.method804(this.field2323, (byte) 72);
        this.field4953 = class110.method804(this.field2317, (byte) 72);
        byte[] var2 = new byte[this.field4953 * this.field4949 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4949 - this.field2323) * 4;
        for (int var6 = 0; var6 < this.field2317; var6++) {
            for (int var7 = 0; var7 < this.field2323; var7++) {
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
        GL var10 = class67.field899;
        if (this.field4950 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4950 = var11[0];
        }
        class67.method479(this.field4950);
        var10.glTexImage2D(3553, 0, 6408, this.field4949, this.field4953, 0, 6408, 5121, var9);
        class180.field2414 += var9.limit() - this.field4952;
        this.field4952 = var9.limit();
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

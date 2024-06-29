import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class153 extends class49 {

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lse;)V", line = 5)
    public class153(class12 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIII[I)V", line = 8)
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([I)V", line = 11)
    public final void method341(int[] arg0) {
        this.field714 = class117.method832(this.field2347, (byte) 85);
        this.field711 = class117.method832(this.field2329, (byte) 75);
        byte[] var2 = new byte[this.field714 * this.field711 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field714 - this.field2347) * 4;
        for (int var6 = 0; var6 < this.field2329; var6++) {
            for (int var7 = 0; var7 < this.field2347; var7++) {
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
        GL var10 = class231.field4052;
        if (this.field708 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field708 = var11[0];
        }
        class231.method1597(this.field708);
        var10.glTexImage2D(3553, 0, 6408, this.field714, this.field711, 0, 6408, 5121, var9);
        class124.field2101 += var9.limit() - this.field710;
        this.field710 = var9.limit();
    }
}

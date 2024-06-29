import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class6 extends class198 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([I)V", line = 5)
    public final void method34(int[] arg0) {
        this.field3385 = class301.method2026(this.field4595, false);
        this.field3386 = class301.method2026(this.field4601, false);
        byte[] var2 = new byte[this.field3386 * this.field3385 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3385 - this.field4595) * 4;
        for (int var6 = 0; var6 < this.field4601; var6++) {
            for (int var7 = 0; var7 < this.field4595; var7++) {
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
        GL var10 = class56.field848;
        if (this.field3381 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3381 = var11[0];
        }
        class56.method354(this.field3381);
        var10.glTexImage2D(3553, 0, 6408, this.field3385, this.field3386, 0, 6408, 5121, var9);
        class121.field2022 += var9.limit() - this.field3382;
        this.field3382 = var9.limit();
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lvj;)V", line = 62)
    public class6(class184 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIII[I)V", line = 65)
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}

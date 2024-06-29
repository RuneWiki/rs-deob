import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class119 extends class130 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([I)V", line = 5)
    public final void method822(int[] arg0) {
        this.field1982 = class313.method2175((byte) 111, this.field2320);
        this.field1986 = class313.method2175((byte) 76, this.field2308);
        byte[] var2 = new byte[this.field1986 * this.field1982 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1982 - this.field2320) * 4;
        for (int var6 = 0; var6 < this.field2308; var6++) {
            for (int var7 = 0; var7 < this.field2320; var7++) {
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
        GL var10 = class255.field4181;
        if (this.field1984 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1984 = var11[0];
        }
        class255.method1790(this.field1984);
        var10.glTexImage2D(3553, 0, 6408, this.field1982, this.field1986, 0, 6408, 5121, var9);
        class197.field3060 += var9.limit() - this.field1981;
        this.field1981 = var9.limit();
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIII[I)V", line = 62)
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lmm;)V", line = 65)
    public class119(class256 arg0) {
        super(arg0);
    }
}

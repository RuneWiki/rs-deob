import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class167 extends class127 {

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2910;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "[B")
    private byte[] field2909;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)V", line = 6)
    public final void method314(int arg0, int arg1) {
        class123.method882();
        if (this.field2909 == null) {
            this.field2909 = new byte[this.field629 * this.field627 * 4];
            this.field2910 = ByteBuffer.wrap(this.field2909);
        }
        int var3 = 0;
        for (int var4 = this.field629 - 1; var4 >= 0; var4--) {
            int var5 = this.field627 * var4;
            for (int var6 = 0; var6 < this.field627; var6++) {
                int var7 = this.field2274[var5++];
                if (var7 == 0) {
                    this.field2909[var3++] = 0;
                    this.field2909[var3++] = 0;
                    this.field2909[var3++] = 0;
                    this.field2909[var3++] = 0;
                } else {
                    this.field2909[var3++] = (byte) (var7 >> 16);
                    this.field2909[var3++] = (byte) (var7 >> 8);
                    this.field2909[var3++] = (byte) var7;
                    this.field2909[var3++] = -1;
                }
            }
        }
        GL var8 = class123.field2212;
        var8.glRasterPos2i(this.field624 + arg0, class123.field2207 - (this.field621 + arg1) - this.field629);
        var8.glDrawPixels(this.field627, this.field629, 6408, 5121, this.field2910);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 56)
    public final void method306(int arg0, int arg1) {
        this.method314(arg0, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(II)V", line = 62)
    public class167(int arg0, int arg1) {
        super(arg0, arg1);
    }
}

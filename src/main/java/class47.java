import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class47 extends class82 {

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field696;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "[B")
    private byte[] field695;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 6)
    public final void method304(int arg0, int arg1) {
        class154.method1140();
        if (this.field695 == null) {
            this.field695 = new byte[this.field2207 * this.field2202 * 4];
            this.field696 = ByteBuffer.wrap(this.field695);
        }
        int var3 = 0;
        for (int var4 = this.field2202 - 1; var4 >= 0; var4--) {
            int var5 = this.field2207 * var4;
            for (int var6 = 0; var6 < this.field2207; var6++) {
                int var7 = this.field1363[var5++];
                if (var7 == 0) {
                    this.field695[var3++] = 0;
                    this.field695[var3++] = 0;
                    this.field695[var3++] = 0;
                    this.field695[var3++] = 0;
                } else {
                    this.field695[var3++] = (byte) (var7 >> 16);
                    this.field695[var3++] = (byte) (var7 >> 8);
                    this.field695[var3++] = (byte) var7;
                    this.field695[var3++] = -1;
                }
            }
        }
        GL var8 = class154.field2479;
        var8.glRasterPos2i(this.field2209 + arg0, class154.field2464 - (this.field2193 + arg1) - this.field2202);
        var8.glDrawPixels(this.field2207, this.field2202, 6408, 5121, this.field696);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V", line = 57)
    public class47(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)V", line = 61)
    public final void method305(int arg0, int arg1) {
        this.method304(arg0, arg1);
    }
}

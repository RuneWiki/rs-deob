import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class38 extends class79 {

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field598;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "[B")
    private byte[] field597;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V", line = 5)
    public final void method285(int arg0, int arg1) {
        this.method286(arg0, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(II)V", line = 8)
    public class38(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V", line = 15)
    public final void method286(int arg0, int arg1) {
        class117.method938();
        if (this.field597 == null) {
            this.field597 = new byte[this.field1135 * this.field1131 * 4];
            this.field598 = ByteBuffer.wrap(this.field597);
        }
        int var3 = 0;
        for (int var4 = this.field1135 - 1; var4 >= 0; var4--) {
            int var5 = this.field1131 * var4;
            for (int var6 = 0; var6 < this.field1131; var6++) {
                int var7 = this.field1384[var5++];
                if (var7 == 0) {
                    this.field597[var3++] = 0;
                    this.field597[var3++] = 0;
                    this.field597[var3++] = 0;
                    this.field597[var3++] = 0;
                } else {
                    this.field597[var3++] = (byte) (var7 >> 16);
                    this.field597[var3++] = (byte) (var7 >> 8);
                    this.field597[var3++] = (byte) var7;
                    this.field597[var3++] = -1;
                }
            }
        }
        GL var8 = class117.field2143;
        var8.glRasterPos2i(this.field1139 + arg0, class117.field2126 - (this.field1130 + arg1) - this.field1135);
        var8.glDrawPixels(this.field1131, this.field1135, 6408, 5121, this.field598);
    }
}

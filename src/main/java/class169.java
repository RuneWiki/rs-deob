import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class169 extends class303 {

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2941;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "[B")
    private byte[] field2942;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II)V", line = 7)
    public class169(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(II)V", line = 10)
    public final void method600(int arg0, int arg1) {
        this.method606(arg0, arg1);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II)V", line = 13)
    public final void method606(int arg0, int arg1) {
        class147.method996();
        if (this.field2942 == null) {
            this.field2942 = new byte[this.field1543 * this.field1533 * 4];
            this.field2941 = ByteBuffer.wrap(this.field2942);
        }
        int var3 = 0;
        for (int var4 = this.field1533 - 1; var4 >= 0; var4--) {
            int var5 = this.field1543 * var4;
            for (int var6 = 0; var6 < this.field1543; var6++) {
                int var7 = this.field5160[var5++];
                if (var7 == 0) {
                    this.field2942[var3++] = 0;
                    this.field2942[var3++] = 0;
                    this.field2942[var3++] = 0;
                    this.field2942[var3++] = 0;
                } else {
                    this.field2942[var3++] = (byte) (var7 >> 16);
                    this.field2942[var3++] = (byte) (var7 >> 8);
                    this.field2942[var3++] = (byte) var7;
                    this.field2942[var3++] = -1;
                }
            }
        }
        GL var8 = class147.field2479;
        var8.glRasterPos2i(this.field1540 + arg0, class147.field2495 - (this.field1535 + arg1) - this.field1533);
        var8.glDrawPixels(this.field1543, this.field1533, 6408, 5121, this.field2941);
    }
}

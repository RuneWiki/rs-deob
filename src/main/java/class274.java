import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class274 extends class41 {

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4749;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "[B")
    private byte[] field4748;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)V", line = 7)
    public final void method321(int arg0, int arg1) {
        class257.method1737();
        if (this.field4748 == null) {
            this.field4748 = new byte[this.field1148 * this.field1141 * 4];
            this.field4749 = ByteBuffer.wrap(this.field4748);
        }
        int var3 = 0;
        for (int var4 = this.field1148 - 1; var4 >= 0; var4--) {
            int var5 = this.field1141 * var4;
            for (int var6 = 0; var6 < this.field1141; var6++) {
                int var7 = this.field573[var5++];
                if (var7 == 0) {
                    this.field4748[var3++] = 0;
                    this.field4748[var3++] = 0;
                    this.field4748[var3++] = 0;
                    this.field4748[var3++] = 0;
                } else {
                    this.field4748[var3++] = (byte) (var7 >> 16);
                    this.field4748[var3++] = (byte) (var7 >> 8);
                    this.field4748[var3++] = (byte) var7;
                    this.field4748[var3++] = -1;
                }
            }
        }
        GL var8 = class257.field4409;
        var8.glRasterPos2i(this.field1137 + arg0, class257.field4423 - (this.field1150 + arg1) - this.field1148);
        var8.glDrawPixels(this.field1141, this.field1148, 6408, 5121, this.field4749);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V", line = 58)
    public final void method327(int arg0, int arg1) {
        this.method321(arg0, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V", line = 61)
    public class274(int arg0, int arg1) {
        super(arg0, arg1);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class108 extends class72 {

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1519;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "[B")
    private byte[] field1518;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 6)
    public final void method83(int arg0, int arg1) {
        this.method77(arg0, arg1);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V", line = 10)
    public class108(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)V", line = 14)
    public final void method77(int arg0, int arg1) {
        class166.method1186();
        if (this.field1518 == null) {
            this.field1518 = new byte[this.field3200 * this.field3189 * 4];
            this.field1519 = ByteBuffer.wrap(this.field1518);
        }
        int var3 = 0;
        for (int var4 = this.field3189 - 1; var4 >= 0; var4--) {
            int var5 = this.field3200 * var4;
            for (int var6 = 0; var6 < this.field3200; var6++) {
                int var7 = this.field1070[var5++];
                if (var7 == 0) {
                    this.field1518[var3++] = 0;
                    this.field1518[var3++] = 0;
                    this.field1518[var3++] = 0;
                    this.field1518[var3++] = 0;
                } else {
                    this.field1518[var3++] = (byte) (var7 >> 16);
                    this.field1518[var3++] = (byte) (var7 >> 8);
                    this.field1518[var3++] = (byte) var7;
                    this.field1518[var3++] = -1;
                }
            }
        }
        GL var8 = class166.field2648;
        var8.glRasterPos2i(this.field3195 + arg0, class166.field2651 - (this.field3188 + arg1) - this.field3189);
        var8.glDrawPixels(this.field3200, this.field3189, 6408, 5121, this.field1519);
    }
}

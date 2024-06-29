import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class30 extends class222 {

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field481;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "[B")
    private byte[] field482;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)V", line = 7)
    public final void method213(int arg0, int arg1) {
        this.method214(arg0, arg1);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 10)
    public final void method214(int arg0, int arg1) {
        class45.method329();
        if (this.field482 == null) {
            this.field482 = new byte[this.field3918 * this.field3914 * 4];
            this.field481 = ByteBuffer.wrap(this.field482);
        }
        int var3 = 0;
        for (int var4 = this.field3914 - 1; var4 >= 0; var4--) {
            int var5 = this.field3918 * var4;
            for (int var6 = 0; var6 < this.field3918; var6++) {
                int var7 = this.field3652[var5++];
                if (var7 == 0) {
                    this.field482[var3++] = 0;
                    this.field482[var3++] = 0;
                    this.field482[var3++] = 0;
                    this.field482[var3++] = 0;
                } else {
                    this.field482[var3++] = (byte) (var7 >> 16);
                    this.field482[var3++] = (byte) (var7 >> 8);
                    this.field482[var3++] = (byte) var7;
                    this.field482[var3++] = -1;
                }
            }
        }
        GL var8 = class45.field688;
        var8.glRasterPos2i(this.field3921 + arg0, class45.field667 - (this.field3925 + arg1) - this.field3914);
        var8.glDrawPixels(this.field3918, this.field3914, 6408, 5121, this.field481);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(II)V", line = 62)
    public class30(int arg0, int arg1) {
        super(arg0, arg1);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 extends class159 {

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1673;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "[B")
    private byte[] field1674;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(II)V", line = 8)
    public class92(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)V", line = 11)
    public final void method316(int arg0, int arg1) {
        class108.method735();
        if (this.field1674 == null) {
            this.field1674 = new byte[this.field669 * this.field667 * 4];
            this.field1673 = ByteBuffer.wrap(this.field1674);
        }
        int var3 = 0;
        for (int var4 = this.field669 - 1; var4 >= 0; var4--) {
            int var5 = this.field667 * var4;
            for (int var6 = 0; var6 < this.field667; var6++) {
                int var7 = this.field2708[var5++];
                if (var7 == 0) {
                    this.field1674[var3++] = 0;
                    this.field1674[var3++] = 0;
                    this.field1674[var3++] = 0;
                    this.field1674[var3++] = 0;
                } else {
                    this.field1674[var3++] = (byte) (var7 >> 16);
                    this.field1674[var3++] = (byte) (var7 >> 8);
                    this.field1674[var3++] = (byte) var7;
                    this.field1674[var3++] = -1;
                }
            }
        }
        GL var8 = class108.field1899;
        var8.glRasterPos2i(this.field657 + arg0, class108.field1916 - (this.field658 + arg1) - this.field669);
        var8.glDrawPixels(this.field667, this.field669, 6408, 5121, this.field1673);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V", line = 61)
    public final void method314(int arg0, int arg1) {
        this.method316(arg0, arg1);
    }
}

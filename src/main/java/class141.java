import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class141 extends class99 {

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2376;

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "[B")
    private byte[] field2375;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(II)V", line = 5)
    public final void method735(int arg0, int arg1) {
        class21.method132();
        if (this.field2375 == null) {
            this.field2375 = new byte[this.field2981 * this.field2976 * 4];
            this.field2376 = ByteBuffer.wrap(this.field2375);
        }
        int var3 = 0;
        for (int var4 = this.field2981 - 1; var4 >= 0; var4--) {
            int var5 = this.field2976 * var4;
            for (int var6 = 0; var6 < this.field2976; var6++) {
                int var7 = this.field1761[var5++];
                if (var7 == 0) {
                    this.field2375[var3++] = 0;
                    this.field2375[var3++] = 0;
                    this.field2375[var3++] = 0;
                    this.field2375[var3++] = 0;
                } else {
                    this.field2375[var3++] = (byte) (var7 >> 16);
                    this.field2375[var3++] = (byte) (var7 >> 8);
                    this.field2375[var3++] = (byte) var7;
                    this.field2375[var3++] = -1;
                }
            }
        }
        GL var8 = class21.field377;
        var8.glRasterPos2i(this.field2983 + arg0, class21.field361 - (this.field2977 + arg1) - this.field2981);
        var8.glDrawPixels(this.field2976, this.field2981, 6408, 5121, this.field2376);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V", line = 55)
    public class141(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V", line = 58)
    public final void method744(int arg0, int arg1) {
        this.method735(arg0, arg1);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class30 extends class49 {

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field367;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "[B")
    private byte[] field366;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 7)
    public final void method151(int arg0, int arg1) {
        this.method152(arg0, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V", line = 11)
    public class30(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V", line = 15)
    public final void method152(int arg0, int arg1) {
        class90.method613();
        if (this.field366 == null) {
            this.field366 = new byte[this.field4808 * this.field4801 * 4];
            this.field367 = ByteBuffer.wrap(this.field366);
        }
        int var3 = 0;
        for (int var4 = this.field4808 - 1; var4 >= 0; var4--) {
            int var5 = this.field4801 * var4;
            for (int var6 = 0; var6 < this.field4801; var6++) {
                int var7 = this.field598[var5++];
                if (var7 == 0) {
                    this.field366[var3++] = 0;
                    this.field366[var3++] = 0;
                    this.field366[var3++] = 0;
                    this.field366[var3++] = 0;
                } else {
                    this.field366[var3++] = (byte) (var7 >> 16);
                    this.field366[var3++] = (byte) (var7 >> 8);
                    this.field366[var3++] = (byte) var7;
                    this.field366[var3++] = -1;
                }
            }
        }
        GL var8 = class90.field1390;
        var8.glRasterPos2i(this.field4807 + arg0, class90.field1379 - (this.field4805 + arg1) - this.field4808);
        var8.glDrawPixels(this.field4801, this.field4808, 6408, 5121, this.field367);
    }
}

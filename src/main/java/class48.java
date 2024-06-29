import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class48 extends class83 {

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field726;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "[B")
    private byte[] field727;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 6)
    public final void method290(int arg0, int arg1) {
        class281.method1981();
        if (this.field727 == null) {
            this.field727 = new byte[this.field4628 * this.field4619 * 4];
            this.field726 = ByteBuffer.wrap(this.field727);
        }
        int var3 = 0;
        for (int var4 = this.field4628 - 1; var4 >= 0; var4--) {
            int var5 = this.field4619 * var4;
            for (int var6 = 0; var6 < this.field4619; var6++) {
                int var7 = this.field1344[var5++];
                if (var7 == 0) {
                    this.field727[var3++] = 0;
                    this.field727[var3++] = 0;
                    this.field727[var3++] = 0;
                    this.field727[var3++] = 0;
                } else {
                    this.field727[var3++] = (byte) (var7 >> 16);
                    this.field727[var3++] = (byte) (var7 >> 8);
                    this.field727[var3++] = (byte) var7;
                    this.field727[var3++] = -1;
                }
            }
        }
        GL var8 = class281.field4839;
        var8.glRasterPos2i(this.field4632 + arg0, class281.field4823 - (this.field4625 + arg1) - this.field4628);
        var8.glDrawPixels(this.field4619, this.field4628, 6408, 5121, this.field726);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V", line = 58)
    public class48(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V", line = 62)
    public final void method291(int arg0, int arg1) {
        this.method290(arg0, arg1);
    }
}

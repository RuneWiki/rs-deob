import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class235 extends class204 {

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3948;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "[B")
    private byte[] field3947;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(II)V", line = 7)
    public class235(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V", line = 11)
    public final void method711(int arg0, int arg1) {
        this.method708(arg0, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 15)
    public final void method708(int arg0, int arg1) {
        class167.method1051();
        if (this.field3947 == null) {
            this.field3947 = new byte[this.field1828 * this.field1821 * 4];
            this.field3948 = ByteBuffer.wrap(this.field3947);
        }
        int var3 = 0;
        for (int var4 = this.field1821 - 1; var4 >= 0; var4--) {
            int var5 = this.field1828 * var4;
            for (int var6 = 0; var6 < this.field1828; var6++) {
                int var7 = this.field3484[var5++];
                if (var7 == 0) {
                    this.field3947[var3++] = 0;
                    this.field3947[var3++] = 0;
                    this.field3947[var3++] = 0;
                    this.field3947[var3++] = 0;
                } else {
                    this.field3947[var3++] = (byte) (var7 >> 16);
                    this.field3947[var3++] = (byte) (var7 >> 8);
                    this.field3947[var3++] = (byte) var7;
                    this.field3947[var3++] = -1;
                }
            }
        }
        GL var8 = class167.field2806;
        var8.glRasterPos2i(this.field1830 + arg0, class167.field2808 - (this.field1826 + arg1) - this.field1821);
        var8.glDrawPixels(this.field1828, this.field1821, 6408, 5121, this.field3948);
    }
}

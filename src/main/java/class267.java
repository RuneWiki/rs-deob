import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class267 extends class327 {

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4489;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "[B")
    private byte[] field4490;

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(II)V", line = 6)
    public class267(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)V", line = 9)
    public final void method653(int arg0, int arg1) {
        this.method647(arg0, arg1);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V", line = 12)
    public final void method647(int arg0, int arg1) {
        class99.method744();
        if (this.field4490 == null) {
            this.field4490 = new byte[this.field4786 * this.field4785 * 4];
            this.field4489 = ByteBuffer.wrap(this.field4490);
        }
        int var3 = 0;
        for (int var4 = this.field4786 - 1; var4 >= 0; var4--) {
            int var5 = this.field4785 * var4;
            for (int var6 = 0; var6 < this.field4785; var6++) {
                int var7 = this.field5579[var5++];
                if (var7 == 0) {
                    this.field4490[var3++] = 0;
                    this.field4490[var3++] = 0;
                    this.field4490[var3++] = 0;
                    this.field4490[var3++] = 0;
                } else {
                    this.field4490[var3++] = (byte) (var7 >> 16);
                    this.field4490[var3++] = (byte) (var7 >> 8);
                    this.field4490[var3++] = (byte) var7;
                    this.field4490[var3++] = -1;
                }
            }
        }
        GL var8 = class99.field1682;
        var8.glRasterPos2i(this.field4784 + arg0, class99.field1685 - (this.field4792 + arg1) - this.field4786);
        var8.glDrawPixels(this.field4785, this.field4786, 6408, 5121, this.field4489);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class186 extends class231 {

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3234;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "[B")
    private byte[] field3235;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V", line = 6)
    public final void method278(int arg0, int arg1) {
        class247.method1683();
        if (this.field3235 == null) {
            this.field3235 = new byte[this.field1060 * this.field1058 * 4];
            this.field3234 = ByteBuffer.wrap(this.field3235);
        }
        int var3 = 0;
        for (int var4 = this.field1060 - 1; var4 >= 0; var4--) {
            int var5 = this.field1058 * var4;
            for (int var6 = 0; var6 < this.field1058; var6++) {
                int var7 = this.field4003[var5++];
                if (var7 == 0) {
                    this.field3235[var3++] = 0;
                    this.field3235[var3++] = 0;
                    this.field3235[var3++] = 0;
                    this.field3235[var3++] = 0;
                } else {
                    this.field3235[var3++] = (byte) (var7 >> 16);
                    this.field3235[var3++] = (byte) (var7 >> 8);
                    this.field3235[var3++] = (byte) var7;
                    this.field3235[var3++] = -1;
                }
            }
        }
        GL var8 = class247.field4253;
        var8.glRasterPos2i(this.field1057 + arg0, class247.field4246 - (this.field1063 + arg1) - this.field1060);
        var8.glDrawPixels(this.field1058, this.field1060, 6408, 5121, this.field3234);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(II)V", line = 56)
    public class186(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 60)
    public final void method273(int arg0, int arg1) {
        this.method278(arg0, arg1);
    }
}

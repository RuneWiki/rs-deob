import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class308 extends class181 {

    @OriginalMember(owner = "client!km", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5243;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "[B")
    private byte[] field5242;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(II)V", line = 8)
    public final void method157(int arg0, int arg1) {
        this.method156(arg0, arg1);
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V", line = 11)
    public final void method156(int arg0, int arg1) {
        class47.method312();
        if (this.field5242 == null) {
            this.field5242 = new byte[this.field4320 * this.field4318 * 4];
            this.field5243 = ByteBuffer.wrap(this.field5242);
        }
        int var3 = 0;
        for (int var4 = this.field4320 - 1; var4 >= 0; var4--) {
            int var5 = this.field4318 * var4;
            for (int var6 = 0; var6 < this.field4318; var6++) {
                int var7 = this.field3029[var5++];
                if (var7 == 0) {
                    this.field5242[var3++] = 0;
                    this.field5242[var3++] = 0;
                    this.field5242[var3++] = 0;
                    this.field5242[var3++] = 0;
                } else {
                    this.field5242[var3++] = (byte) (var7 >> 16);
                    this.field5242[var3++] = (byte) (var7 >> 8);
                    this.field5242[var3++] = (byte) var7;
                    this.field5242[var3++] = -1;
                }
            }
        }
        GL var8 = class47.field739;
        var8.glRasterPos2i(this.field4326 + arg0, class47.field762 - (this.field4323 + arg1) - this.field4320);
        var8.glDrawPixels(this.field4318, this.field4320, 6408, 5121, this.field5243);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(II)V", line = 62)
    public class308(int arg0, int arg1) {
        super(arg0, arg1);
    }
}

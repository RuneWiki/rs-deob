import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class214 extends class12 {

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3798;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "[B")
    private byte[] field3799;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(II)V", line = 7)
    public final void method81(int arg0, int arg1) {
        this.method68(arg0, arg1);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V", line = 10)
    public final void method68(int arg0, int arg1) {
        class231.method1571();
        if (this.field3799 == null) {
            this.field3799 = new byte[this.field2347 * this.field2329 * 4];
            this.field3798 = ByteBuffer.wrap(this.field3799);
        }
        int var3 = 0;
        for (int var4 = this.field2329 - 1; var4 >= 0; var4--) {
            int var5 = this.field2347 * var4;
            for (int var6 = 0; var6 < this.field2347; var6++) {
                int var7 = this.field141[var5++];
                if (var7 == 0) {
                    this.field3799[var3++] = 0;
                    this.field3799[var3++] = 0;
                    this.field3799[var3++] = 0;
                    this.field3799[var3++] = 0;
                } else {
                    this.field3799[var3++] = (byte) (var7 >> 16);
                    this.field3799[var3++] = (byte) (var7 >> 8);
                    this.field3799[var3++] = (byte) var7;
                    this.field3799[var3++] = -1;
                }
            }
        }
        GL var8 = class231.field4052;
        var8.glRasterPos2i(this.field2326 + arg0, class231.field4079 - (this.field2338 + arg1) - this.field2329);
        var8.glDrawPixels(this.field2347, this.field2329, 6408, 5121, this.field3798);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V", line = 60)
    public class214(int arg0, int arg1) {
        super(arg0, arg1);
    }
}

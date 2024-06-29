import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class52 extends class47 {

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field780;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "[B")
    private byte[] field781;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V", line = 5)
    public final void method337(int arg0, int arg1) {
        this.method341(arg0, arg1);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V", line = 9)
    public class52(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V", line = 13)
    public final void method341(int arg0, int arg1) {
        class55.method409();
        if (this.field781 == null) {
            this.field781 = new byte[this.field4342 * this.field4337 * 4];
            this.field780 = ByteBuffer.wrap(this.field781);
        }
        int var3 = 0;
        for (int var4 = this.field4337 - 1; var4 >= 0; var4--) {
            int var5 = this.field4342 * var4;
            for (int var6 = 0; var6 < this.field4342; var6++) {
                int var7 = this.field757[var5++];
                if (var7 == 0) {
                    this.field781[var3++] = 0;
                    this.field781[var3++] = 0;
                    this.field781[var3++] = 0;
                    this.field781[var3++] = 0;
                } else {
                    this.field781[var3++] = (byte) (var7 >> 16);
                    this.field781[var3++] = (byte) (var7 >> 8);
                    this.field781[var3++] = (byte) var7;
                    this.field781[var3++] = -1;
                }
            }
        }
        GL var8 = class55.field812;
        var8.glRasterPos2i(this.field4340 + arg0, class55.field806 - (this.field4345 + arg1) - this.field4337);
        var8.glDrawPixels(this.field4342, this.field4337, 6408, 5121, this.field780);
    }
}

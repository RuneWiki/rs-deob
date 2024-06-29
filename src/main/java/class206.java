import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class206 extends class220 {

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()V")
    public final void method44() {
        this.field3101.field1927.glFramebufferTexture2DEXT(36160, this.field2935, 3553, 0, 0);
        this.field2935 = -1;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lao;II)V")
    public class206(class157 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field3101.field1927;
        this.field2934 = arg2;
        this.field3101.method1003(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field3100, arg2, arg2, 0, 32993, this.field3101.field1986, (Buffer) null);
        }
        this.method1476(true);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
    public final void method1355(int arg0, int arg1, int arg2) {
        this.field3101.field1927.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field3097, arg1);
        this.field2935 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lao;IIZ[[I)V")
    public class206(class157 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field3101.field1927;
        this.field2934 = arg2;
        this.field3101.method1003(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1479(var6, var7 + 34069, this.field3100, arg2, arg2, 32993, this.field3101.field1986, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field3100, arg2, arg2, 0, 32993, this.field3101.field1986, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1476(true);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lao;IIZ[[BI)V")
    public class206(class157 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field3101.field1927;
        this.field2934 = arg2;
        this.field3101.method1003(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field3100, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1476(true);
    }
}

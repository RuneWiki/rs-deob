import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class181 extends class4 {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V", line = 7)
    public final void method1330(int arg0, int arg1, int arg2) {
        this.field24.field198.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field28, arg1);
        this.field2644 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lhd;IIZ[[I)V", line = 14)
    public class181(class17 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field24.field198;
        this.field2643 = arg2;
        this.field24.method207(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method20(var6, var7 + 34069, this.field27, arg2, arg2, 32993, this.field24.field340, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field27, arg2, arg2, 0, 32993, this.field24.field340, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method17(true);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lhd;II)V", line = 45)
    public class181(class17 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field24.field198;
        this.field2643 = arg2;
        this.field24.method207(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field27, arg2, arg2, 0, 32993, this.field24.field340, (Buffer) null);
        }
        this.method17(true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 60)
    public final void method889() {
        this.field24.field198.glFramebufferTexture2DEXT(36160, this.field2644, 3553, 0, 0);
        this.field2644 = -1;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lhd;IIZ[[BI)V", line = 64)
    public class181(class17 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field24.field198;
        this.field2643 = arg2;
        this.field24.method207(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field27, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method17(true);
    }
}

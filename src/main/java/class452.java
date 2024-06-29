import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class452 extends class179 {

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public int field6250;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    private int field6249;

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lqi;IIZ[[I)V")
    public class452(class458 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var6 = this.field2602.field6330;
        this.field6250 = arg2;
        this.field2602.method2692(this);
        if (arg3) {
            for (int var7 = 0; var7 < 6; var7++) {
                method1171(var6, var7 + 34069, this.field2599, arg2, arg2, 32993, this.field2602.field6363, arg4[var7]);
            }
        } else {
            for (int var8 = 0; var8 < 6; var8++) {
                var6.glTexImage2D(var8 + 34069, 0, this.field2599, arg2, arg2, 0, 32993, this.field2602.field6363, IntBuffer.wrap(arg4[var8]));
            }
        }
        this.method1168(true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public final void method2613(int arg0, int arg1, int arg2) {
        this.field2602.field6330.glFramebufferTexture2DEXT(36160, arg0, arg2, this.field2595, arg1);
        this.field6249 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
    public final void method1050() {
        this.field2602.field6330.glFramebufferTexture2DEXT(36160, this.field6249, 3553, 0, 0);
        this.field6249 = -1;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lqi;II)V")
    public class452(class458 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        opengl var4 = this.field2602.field6330;
        this.field6250 = arg2;
        this.field2602.method2692(this);
        for (int var5 = 0; var5 < 6; var5++) {
            var4.glTexImage2D(var5 + 34069, 0, this.field2599, arg2, arg2, 0, 32993, this.field2602.field6363, (Buffer) null);
        }
        this.method1168(true);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lqi;IIZ[[BI)V")
    public class452(class458 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        opengl var7 = this.field2602.field6330;
        this.field6250 = arg2;
        this.field2602.method2692(this);
        for (int var8 = 0; var8 < 6; var8++) {
            var7.glTexImage2D(var8 + 34069, 0, this.field2599, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[var8]));
        }
        this.method1168(true);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class358 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field5590 = 3553;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field5591 = 34037;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field5592 = 6407;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field5593 = 6408;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field5594 = 32993;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field5595 = 34843;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field5596 = 34842;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field5597 = 34837;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field5598 = 34836;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field5599 = 6406;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field5600 = 6402;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field5601 = 9729;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field5602 = 9728;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field5603 = 5126;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field5604 = 5121;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[I")
    private static int[] field5605 = new int[1];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII[B)V", line = 6)
    public static final void method2484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class47.field592.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V", line = 14)
    public static final void method2485(int arg0, int arg1, int arg2) {
        method2484(field5591, arg0, arg1, arg2, field5592, field5604, (byte[]) null);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII[B)I", line = 22)
    public static final int method2486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class47.field592;
        int var10 = method2490();
        if (arg0 == 3553) {
            class47.method357(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method2484(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 36)
    public static final void method2487(int arg0) {
        field5605[0] = arg0;
        class47.field592.glDeleteTextures(1, field5605, 0);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V", line = 40)
    public static final void method2488(int arg0, int arg1, int arg2) {
        method2484(field5590, arg0, arg1, arg2, field5592, field5604, (byte[]) null);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(III)I", line = 44)
    public static final int method2489(int arg0, int arg1, int arg2) {
        return method2486(field5590, arg0, arg1, arg2, field5601, field5601, arg0, field5604, (byte[]) null);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I", line = 50)
    public static final int method2490() {
        class47.field592.glGenTextures(1, field5605, 0);
        return field5605[0];
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III[B)I", line = 54)
    public static final int method2491(int arg0, int arg1, int arg2, byte[] arg3) {
        return method2486(field5590, arg0, arg1, arg2, field5601, field5601, arg0, field5604, arg3);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()V", line = 59)
    public static void method2492() {
        field5605 = null;
    }
}

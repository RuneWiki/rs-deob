import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class200 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3068 = 3553;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3069 = 34037;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3070 = 6407;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3071 = 6408;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3072 = 32993;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3073 = 34843;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3074 = 34842;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3075 = 34837;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field3076 = 34836;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3077 = 6406;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3078 = 6402;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3079 = 9729;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3080 = 9728;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field3081 = 5126;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3082 = 5121;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "[I")
    private static int[] field3083 = new int[1];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III[B)I", line = 7)
    public static final int method1363(int arg0, int arg1, int arg2, byte[] arg3) {
        return method1366(field3068, arg0, arg1, arg2, field3079, field3079, arg0, field3082, arg3);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()I", line = 10)
    public static final int method1364() {
        class245.field3884.glGenTextures(1, field3083, 0);
        return field3083[0];
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 22)
    public static final void method1365(int arg0, int arg1, int arg2) {
        method1367(field3068, arg0, arg1, arg2, field3070, field3082, (byte[]) null);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIII[B)I", line = 27)
    public static final int method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class245.field3884;
        int var10 = method1364();
        if (arg0 == 3553) {
            class245.method1729(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method1367(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII[B)V", line = 42)
    public static final void method1367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class245.field3884.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)I", line = 46)
    public static final int method1368(int arg0, int arg1, int arg2) {
        return method1366(field3068, arg0, arg1, arg2, field3079, field3079, arg0, field3082, (byte[]) null);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()V", line = 50)
    public static void method1369() {
        field3083 = null;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(III)V", line = 53)
    public static final void method1370(int arg0, int arg1, int arg2) {
        method1367(field3069, arg0, arg1, arg2, field3070, field3082, (byte[]) null);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 56)
    public static final void method1371(int arg0) {
        field3083[0] = arg0;
        class245.field3884.glDeleteTextures(1, field3083, 0);
    }
}

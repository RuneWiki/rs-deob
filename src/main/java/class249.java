import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class249 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field3902 = 3553;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field3903 = 34037;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field3904 = 6407;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field3905 = 6408;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field3906 = 32993;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field3907 = 34843;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field3908 = 34842;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field3909 = 34837;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field3910 = 34836;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field3911 = 6406;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field3912 = 6402;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field3913 = 9729;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field3914 = 9728;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field3915 = 5126;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field3916 = 5121;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[I")
    private static int[] field3917 = new int[1];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1765(int arg0) {
        field3917[0] = arg0;
        class232.field3716.glDeleteTextures(1, field3917, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 10)
    public static final void method1766(int arg0, int arg1, int arg2) {
        method1771(field3903, arg0, arg1, arg2, field3904, field3916, (byte[]) null);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)I", line = 13)
    public static final int method1767(int arg0, int arg1, int arg2) {
        return method1768(field3902, arg0, arg1, arg2, field3913, field3913, arg0, field3916, (byte[]) null);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII[B)I", line = 17)
    public static final int method1768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class232.field3716;
        int var10 = method1770();
        if (arg0 == 3553) {
            class232.method1662(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method1771(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[B)I", line = 36)
    public static final int method1769(int arg0, int arg1, int arg2, byte[] arg3) {
        return method1768(field3902, arg0, arg1, arg2, field3913, field3913, arg0, field3916, arg3);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()I", line = 40)
    public static final int method1770() {
        class232.field3716.glGenTextures(1, field3917, 0);
        return field3917[0];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIII[B)V", line = 50)
    public static final void method1771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class232.field3716.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(III)V", line = 55)
    public static final void method1772(int arg0, int arg1, int arg2) {
        method1771(field3902, arg0, arg1, arg2, field3904, field3916, (byte[]) null);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "()V", line = 58)
    public static void method1773() {
        field3917 = null;
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class254 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3787 = 3553;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3788 = 34037;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3789 = 6407;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3790 = 6408;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field3791 = 32993;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3792 = 34843;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3793 = 34842;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3794 = 34837;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field3795 = 34836;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3796 = 6406;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3797 = 6402;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field3798 = 9729;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field3799 = 9728;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field3800 = 5126;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field3801 = 5121;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "[I")
    private static int[] field3802 = new int[1];

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V", line = 10)
    public static void method1860() {
        field3802 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III[B)I", line = 14)
    public static final int method1861(int arg0, int arg1, int arg2, byte[] arg3) {
        return method1864(field3787, arg0, arg1, arg2, field3798, field3798, arg0, field3801, arg3);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1862(int arg0) {
        field3802[0] = arg0;
        class141.field2025.glDeleteTextures(1, field3802, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I", line = 26)
    public static final int method1863(int arg0, int arg1, int arg2) {
        return method1864(field3787, arg0, arg1, arg2, field3798, field3798, arg0, field3801, (byte[]) null);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIII[B)I", line = 34)
    public static final int method1864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class141.field2025;
        int var10 = method1867();
        if (arg0 == 3553) {
            class141.method1000(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method1865(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIII[B)V", line = 49)
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class141.field2025.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)V", line = 54)
    public static final void method1866(int arg0, int arg1, int arg2) {
        method1865(field3788, arg0, arg1, arg2, field3789, field3801, (byte[]) null);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()I", line = 58)
    public static final int method1867() {
        class141.field2025.glGenTextures(1, field3802, 0);
        return field3802[0];
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(III)V", line = 65)
    public static final void method1868(int arg0, int arg1, int arg2) {
        method1865(field3787, arg0, arg1, arg2, field3789, field3801, (byte[]) null);
    }
}

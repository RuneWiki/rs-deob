import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class66 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field791 = 3553;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field792 = 34037;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field793 = 6407;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field794 = 6408;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field795 = 32993;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field796 = 34843;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field797 = 34842;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field798 = 34837;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field799 = 34836;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field800 = 6406;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field801 = 6402;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field802 = 9729;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field803 = 9728;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field804 = 5126;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field805 = 5121;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[I")
    private static int[] field806 = new int[1];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III[B)I", line = 9)
    public static final int method397(int arg0, int arg1, int arg2, byte[] arg3) {
        return method399(field791, arg0, arg1, arg2, field802, field802, arg0, field805, arg3);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII[B)V", line = 13)
    public static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class272.field4310.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII[B)I", line = 18)
    public static final int method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class272.field4310;
        int var10 = method403();
        if (arg0 == 3553) {
            class272.method1965(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method398(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 32)
    public static final void method400(int arg0, int arg1, int arg2) {
        method398(field791, arg0, arg1, arg2, field793, field805, (byte[]) null);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 43)
    public static final void method401(int arg0) {
        field806[0] = arg0;
        class272.field4310.glDeleteTextures(1, field806, 0);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)I", line = 47)
    public static final int method402(int arg0, int arg1, int arg2) {
        return method399(field791, arg0, arg1, arg2, field802, field802, arg0, field805, (byte[]) null);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()I", line = 50)
    public static final int method403() {
        class272.field4310.glGenTextures(1, field806, 0);
        return field806[0];
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(III)V", line = 54)
    public static final void method404(int arg0, int arg1, int arg2) {
        method398(field792, arg0, arg1, arg2, field793, field805, (byte[]) null);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V", line = 57)
    public static void method405() {
        field806 = null;
    }
}

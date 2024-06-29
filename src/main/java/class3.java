import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field38 = 3553;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field39 = 34037;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field40 = 6407;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field41 = 6408;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field42 = 32993;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field43 = 34843;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field44 = 34842;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field45 = 34837;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field46 = 34836;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field47 = 6406;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field48 = 6402;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field49 = 9729;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field50 = 9728;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field51 = 5126;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field52 = 5121;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[I")
    private static int[] field53 = new int[1];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII[B)I", line = 6)
    public static final int method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class43.field651;
        int var10 = method19();
        if (arg0 == 3553) {
            class43.method390(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method17(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 20)
    public static void method13() {
        field53 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 33)
    public static final void method14(int arg0) {
        field53[0] = arg0;
        class43.field651.glDeleteTextures(1, field53, 0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V", line = 37)
    public static final void method15(int arg0, int arg1, int arg2) {
        method17(field39, arg0, arg1, arg2, field40, field52, (byte[]) null);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)I", line = 48)
    public static final int method16(int arg0, int arg1, int arg2, byte[] arg3) {
        return method12(field38, arg0, arg1, arg2, field49, field49, arg0, field52, arg3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII[B)V", line = 53)
    public static final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class43.field651.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V", line = 57)
    public static final void method18(int arg0, int arg1, int arg2) {
        method17(field38, arg0, arg1, arg2, field40, field52, (byte[]) null);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()I", line = 62)
    public static final int method19() {
        class43.field651.glGenTextures(1, field53, 0);
        return field53[0];
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)I", line = 71)
    public static final int method20(int arg0, int arg1, int arg2) {
        return method12(field38, arg0, arg1, arg2, field49, field49, arg0, field52, (byte[]) null);
    }
}

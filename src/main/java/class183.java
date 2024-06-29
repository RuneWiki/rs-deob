import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class183 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2869 = 3553;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2870 = 34037;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2871 = 6407;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2872 = 6408;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2873 = 32993;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2874 = 34843;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2875 = 34842;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2876 = 34837;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2877 = 34836;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2878 = 6406;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2879 = 6402;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2880 = 9729;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2881 = 9728;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2882 = 5126;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2883 = 5121;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[I")
    private static int[] field2884 = new int[1];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)I", line = 7)
    public static final int method1411(int arg0, int arg1, int arg2, byte[] arg3) {
        return method1416(field2869, arg0, arg1, arg2, field2880, field2880, arg0, field2883, arg3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII[B)V", line = 11)
    public static final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class240.field3771.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()I", line = 19)
    public static final int method1413() {
        class240.field3771.glGenTextures(1, field2884, 0);
        return field2884[0];
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 23)
    public static void method1414() {
        field2884 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1415(int arg0) {
        field2884[0] = arg0;
        class240.field3771.glDeleteTextures(1, field2884, 0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII[B)I", line = 32)
    public static final int method1416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class240.field3771;
        int var10 = method1413();
        if (arg0 == 3553) {
            class240.method1786(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method1412(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V", line = 46)
    public static final void method1417(int arg0, int arg1, int arg2) {
        method1412(field2870, arg0, arg1, arg2, field2871, field2883, (byte[]) null);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V", line = 50)
    public static final void method1418(int arg0, int arg1, int arg2) {
        method1412(field2869, arg0, arg1, arg2, field2871, field2883, (byte[]) null);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)I", line = 57)
    public static final int method1419(int arg0, int arg1, int arg2) {
        return method1416(field2869, arg0, arg1, arg2, field2880, field2880, arg0, field2883, (byte[]) null);
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class313 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field4897 = 3553;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field4898 = 34037;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field4899 = 6407;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field4900 = 6408;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4901 = 32993;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field4902 = 34843;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4903 = 34842;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field4904 = 34837;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field4905 = 34836;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field4906 = 6406;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field4907 = 6402;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field4908 = 9729;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field4909 = 9728;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field4910 = 5126;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field4911 = 5121;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "[I")
    private static int[] field4912 = new int[1];

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V", line = 5)
    public static final void method2179(int arg0, int arg1, int arg2) {
        method2184(field4898, arg0, arg1, arg2, field4899, field4911, (byte[]) null);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2180(int arg0) {
        field4912[0] = arg0;
        class109.field1456.glDeleteTextures(1, field4912, 0);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[B)I", line = 21)
    public static final int method2181(int arg0, int arg1, int arg2, byte[] arg3) {
        return method2183(field4897, arg0, arg1, arg2, field4908, field4908, arg0, field4911, arg3);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V", line = 25)
    public static void method2182() {
        field4912 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIII[B)I", line = 29)
    public static final int method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class109.field1456;
        int var10 = method2187();
        if (arg0 == 3553) {
            class109.method752(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method2184(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIII[B)V", line = 47)
    public static final void method2184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class109.field1456.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)I", line = 54)
    public static final int method2185(int arg0, int arg1, int arg2) {
        return method2183(field4897, arg0, arg1, arg2, field4908, field4908, arg0, field4911, (byte[]) null);
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)V", line = 57)
    public static final void method2186(int arg0, int arg1, int arg2) {
        method2184(field4897, arg0, arg1, arg2, field4899, field4911, (byte[]) null);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "()I", line = 60)
    public static final int method2187() {
        class109.field1456.glGenTextures(1, field4912, 0);
        return field4912[0];
    }
}

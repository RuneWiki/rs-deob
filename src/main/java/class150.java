import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class150 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2262 = 3553;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2263 = 34037;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2264 = 6407;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2265 = 6408;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2266 = 32993;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2267 = 34843;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2268 = 34842;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2269 = 34837;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2270 = 34836;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2271 = 6406;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2272 = 6402;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2273 = 9729;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field2274 = 9728;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2275 = 5126;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2276 = 5121;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "[I")
    private static int[] field2277 = new int[1];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1123(int arg0, int arg1, int arg2) {
        method1126(field2262, arg0, arg1, arg2, field2264, field2276, (byte[]) null);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()I", line = 9)
    public static final int method1124() {
        class73.field1051.glGenTextures(1, field2277, 0);
        return field2277[0];
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 13)
    public static final void method1125(int arg0) {
        field2277[0] = arg0;
        class73.field1051.glDeleteTextures(1, field2277, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII[B)V", line = 18)
    public static final void method1126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class73.field1051.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V", line = 22)
    public static final void method1127(int arg0, int arg1, int arg2) {
        method1126(field2263, arg0, arg1, arg2, field2264, field2276, (byte[]) null);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()V", line = 25)
    public static void method1128() {
        field2277 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIII[B)I", line = 29)
    public static final int method1129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class73.field1051;
        int var10 = method1124();
        if (arg0 == 3553) {
            class73.method537(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method1126(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III[B)I", line = 49)
    public static final int method1130(int arg0, int arg1, int arg2, byte[] arg3) {
        return method1129(field2262, arg0, arg1, arg2, field2273, field2273, arg0, field2276, arg3);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(III)I", line = 56)
    public static final int method1131(int arg0, int arg1, int arg2) {
        return method1129(field2262, arg0, arg1, arg2, field2273, field2273, arg0, field2276, (byte[]) null);
    }
}

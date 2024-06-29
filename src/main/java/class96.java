import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class96 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1462 = 3553;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1463 = 34037;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field1464 = 6407;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field1465 = 6408;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field1466 = 32993;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field1467 = 34843;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1468 = 34842;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1469 = 34837;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field1470 = 34836;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field1471 = 6406;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field1472 = 6402;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field1473 = 9729;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field1474 = 9728;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field1475 = 5126;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field1476 = 5121;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
    private static int[] field1477 = new int[1];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII[B)I", line = 6)
    public static final int method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class186.field2990;
        int var10 = method686();
        if (arg0 == 3553) {
            class186.method1288(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method685(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 27)
    public static final void method682(int arg0) {
        field1477[0] = arg0;
        class186.field2990.glDeleteTextures(1, field1477, 0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V", line = 31)
    public static final void method683(int arg0, int arg1, int arg2) {
        method685(field1462, arg0, arg1, arg2, field1464, field1476, (byte[]) null);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)V", line = 38)
    public static final void method684(int arg0, int arg1, int arg2) {
        method685(field1463, arg0, arg1, arg2, field1464, field1476, (byte[]) null);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII[B)V", line = 46)
    public static final void method685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class186.field2990.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()I", line = 51)
    public static final int method686() {
        class186.field2990.glGenTextures(1, field1477, 0);
        return field1477[0];
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()V", line = 59)
    public static void method687() {
        field1477 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III[B)I", line = 66)
    public static final int method688(int arg0, int arg1, int arg2, byte[] arg3) {
        return method681(field1462, arg0, arg1, arg2, field1473, field1473, arg0, field1476, arg3);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(III)I", line = 70)
    public static final int method689(int arg0, int arg1, int arg2) {
        return method681(field1462, arg0, arg1, arg2, field1473, field1473, arg0, field1476, (byte[]) null);
    }
}

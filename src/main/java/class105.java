import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class105 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1806 = 3553;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field1807 = 34037;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field1808 = 6407;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field1809 = 6408;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field1810 = 32993;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field1811 = 34843;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field1812 = 34842;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field1813 = 34837;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field1814 = 34836;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field1815 = 6406;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field1816 = 6402;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field1817 = 9729;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field1818 = 9728;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field1819 = 5126;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field1820 = 5121;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[I")
    private static int[] field1821 = new int[1];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[B)I", line = 10)
    public static final int method680(int arg0, int arg1, int arg2, byte[] arg3) {
        return method681(field1806, arg0, arg1, arg2, field1817, field1817, arg0, field1820, arg3);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIII[B)I", line = 14)
    public static final int method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class249.field3898;
        int var10 = method686();
        if (arg0 == 3553) {
            class249.method1689(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method687(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)I", line = 28)
    public static final int method682(int arg0, int arg1, int arg2) {
        return method681(field1806, arg0, arg1, arg2, field1817, field1817, arg0, field1820, (byte[]) null);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)V", line = 31)
    public static final void method683(int arg0, int arg1, int arg2) {
        method687(field1807, arg0, arg1, arg2, field1808, field1820, (byte[]) null);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)V", line = 38)
    public static final void method684(int arg0, int arg1, int arg2) {
        method687(field1806, arg0, arg1, arg2, field1808, field1820, (byte[]) null);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 44)
    public static final void method685(int arg0) {
        field1821[0] = arg0;
        class249.field3898.glDeleteTextures(1, field1821, 0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()I", line = 49)
    public static final int method686() {
        class249.field3898.glGenTextures(1, field1821, 0);
        return field1821[0];
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII[B)V", line = 54)
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class249.field3898.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()V", line = 58)
    public static void method688() {
        field1821 = null;
    }
}

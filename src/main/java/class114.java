import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class114 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field1749 = 3553;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field1750 = 34037;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field1751 = 6407;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field1752 = 6408;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field1753 = 32993;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field1754 = 34843;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field1755 = 34842;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field1756 = 34837;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field1757 = 34836;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field1758 = 6406;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field1759 = 6402;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field1760 = 9729;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field1761 = 9728;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field1762 = 5126;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field1763 = 5121;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "[I")
    private static int[] field1764 = new int[1];

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()V", line = 5)
    public static void method842() {
        field1764 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 8)
    public static final void method843(int arg0) {
        field1764[0] = arg0;
        class94.field1473.glDeleteTextures(1, field1764, 0);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)I", line = 12)
    public static final int method844(int arg0, int arg1, int arg2) {
        return method845(field1749, arg0, arg1, arg2, field1760, field1760, arg0, field1763, (byte[]) null);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIII[B)I", line = 20)
    public static final int method845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class94.field1473;
        int var10 = method846();
        if (arg0 == 3553) {
            class94.method698(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method850(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()I", line = 39)
    public static final int method846() {
        class94.field1473.glGenTextures(1, field1764, 0);
        return field1764[0];
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V", line = 46)
    public static final void method847(int arg0, int arg1, int arg2) {
        method850(field1750, arg0, arg1, arg2, field1751, field1763, (byte[]) null);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III[B)I", line = 53)
    public static final int method848(int arg0, int arg1, int arg2, byte[] arg3) {
        return method845(field1749, arg0, arg1, arg2, field1760, field1760, arg0, field1763, arg3);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(III)V", line = 56)
    public static final void method849(int arg0, int arg1, int arg2) {
        method850(field1749, arg0, arg1, arg2, field1751, field1763, (byte[]) null);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIII[B)V", line = 61)
    public static final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class94.field1473.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }
}

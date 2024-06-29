import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class46 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field557 = 3553;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field558 = 34037;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field559 = 6407;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field560 = 6408;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field561 = 32993;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field562 = 34843;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field563 = 34842;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field564 = 34837;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field565 = 34836;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field566 = 6406;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field567 = 6402;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field568 = 9729;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field569 = 9728;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field570 = 5126;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field571 = 5121;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "[I")
    private static int[] field572 = new int[1];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)I", line = 5)
    public static final int method290(int arg0, int arg1, int arg2) {
        return method294(field557, arg0, arg1, arg2, field568, field568, arg0, field571, (byte[]) null);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 13)
    public static void method291() {
        field572 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 16)
    public static final void method292(int arg0) {
        field572[0] = arg0;
        class67.field899.glDeleteTextures(1, field572, 0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIII[B)V", line = 28)
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class67.field899.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIII[B)I", line = 34)
    public static final int method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class67.field899;
        int var10 = method295();
        if (arg0 == 3553) {
            class67.method479(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method293(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()I", line = 48)
    public static final int method295() {
        class67.field899.glGenTextures(1, field572, 0);
        return field572[0];
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[B)I", line = 52)
    public static final int method296(int arg0, int arg1, int arg2, byte[] arg3) {
        return method294(field557, arg0, arg1, arg2, field568, field568, arg0, field571, arg3);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)V", line = 58)
    public static final void method297(int arg0, int arg1, int arg2) {
        method293(field557, arg0, arg1, arg2, field559, field571, (byte[]) null);
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)V", line = 61)
    public static final void method298(int arg0, int arg1, int arg2) {
        method293(field558, arg0, arg1, arg2, field559, field571, (byte[]) null);
    }
}

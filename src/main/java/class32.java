import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class32 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field394 = 3553;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field395 = 34037;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field396 = 6407;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field397 = 6408;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field398 = 32993;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field399 = 34843;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field400 = 34842;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field401 = 34837;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field402 = 34836;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field403 = 6406;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field404 = 6402;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field405 = 9729;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field406 = 9728;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field407 = 5126;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field408 = 5121;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[I")
    private static int[] field409 = new int[1];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII[B)V", line = 6)
    public static final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class333.field5160.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 10)
    public static final void method236(int arg0) {
        field409[0] = arg0;
        class333.field5160.glDeleteTextures(1, field409, 0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V", line = 14)
    public static void method237() {
        field409 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V", line = 17)
    public static final void method238(int arg0, int arg1, int arg2) {
        method235(field395, arg0, arg1, arg2, field396, field408, (byte[]) null);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII[B)I", line = 21)
    public static final int method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class333.field5160;
        int var10 = method241();
        if (arg0 == 3553) {
            class333.method2282(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method235(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)I", line = 36)
    public static final int method240(int arg0, int arg1, int arg2) {
        return method239(field394, arg0, arg1, arg2, field405, field405, arg0, field408, (byte[]) null);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()I", line = 39)
    public static final int method241() {
        class333.field5160.glGenTextures(1, field409, 0);
        return field409[0];
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(III)V", line = 47)
    public static final void method242(int arg0, int arg1, int arg2) {
        method235(field394, arg0, arg1, arg2, field396, field408, (byte[]) null);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[B)I", line = 56)
    public static final int method243(int arg0, int arg1, int arg2, byte[] arg3) {
        return method239(field394, arg0, arg1, arg2, field405, field405, arg0, field408, arg3);
    }
}

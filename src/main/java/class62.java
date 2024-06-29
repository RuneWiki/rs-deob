import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class62 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1195 = 3553;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field1196 = 34037;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field1197 = 6407;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field1198 = 6408;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1199 = 32993;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field1200 = 34843;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field1201 = 34842;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field1202 = 34837;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1203 = 34836;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field1204 = 6406;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field1205 = 6402;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field1206 = 9729;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field1207 = 9728;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field1208 = 5126;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field1209 = 5121;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    private static int[] field1210 = new int[1];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V", line = 10)
    public static final void method500(int arg0, int arg1, int arg2) {
        method504(field1196, arg0, arg1, arg2, field1197, field1209, (byte[]) null);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 15)
    public static void method501() {
        field1210 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)V", line = 18)
    public static final void method502(int arg0, int arg1, int arg2) {
        method504(field1195, arg0, arg1, arg2, field1197, field1209, (byte[]) null);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)I", line = 21)
    public static final int method503(int arg0, int arg1, int arg2) {
        return method506(field1195, arg0, arg1, arg2, field1206, field1206, arg0, field1209, (byte[]) null);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII[B)V", line = 25)
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class241.field4012.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()I", line = 29)
    public static final int method505() {
        class241.field4012.glGenTextures(1, field1210, 0);
        return field1210[0];
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII[B)I", line = 37)
    public static final int method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class241.field4012;
        int var10 = method505();
        if (arg0 == 3553) {
            class241.method1687(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method504(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)I", line = 53)
    public static final int method507(int arg0, int arg1, int arg2, byte[] arg3) {
        return method506(field1195, arg0, arg1, arg2, field1206, field1206, arg0, field1209, arg3);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 70)
    public static final void method508(int arg0) {
        field1210[0] = arg0;
        class241.field4012.glDeleteTextures(1, field1210, 0);
    }
}

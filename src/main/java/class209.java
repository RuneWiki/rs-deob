import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class209 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field2958 = 3553;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field2959 = 34037;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field2960 = 6407;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field2961 = 6408;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field2962 = 32993;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field2963 = 34843;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field2964 = 34842;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field2965 = 34837;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field2966 = 34836;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field2967 = 6406;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field2968 = 6402;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field2969 = 9729;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field2970 = 9728;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field2971 = 5126;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field2972 = 5121;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "[I")
    private static int[] field2973 = new int[1];

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III[B)I", line = 6)
    public static final int method1434(int arg0, int arg1, int arg2, byte[] arg3) {
        return method1436(field2958, arg0, arg1, arg2, field2969, field2969, arg0, field2972, arg3);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)I", line = 9)
    public static final int method1435(int arg0, int arg1, int arg2) {
        return method1436(field2958, arg0, arg1, arg2, field2969, field2969, arg0, field2972, (byte[]) null);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII[B)I", line = 14)
    public static final int method1436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class250.field3818;
        int var10 = method1437();
        if (arg0 == 3553) {
            class250.method1806(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method1439(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()I", line = 28)
    public static final int method1437() {
        class250.field3818.glGenTextures(1, field2973, 0);
        return field2973[0];
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V", line = 36)
    public static final void method1438(int arg0, int arg1, int arg2) {
        method1439(field2959, arg0, arg1, arg2, field2960, field2972, (byte[]) null);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII[B)V", line = 40)
    public static final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class250.field3818.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(III)V", line = 44)
    public static final void method1440(int arg0, int arg1, int arg2) {
        method1439(field2958, arg0, arg1, arg2, field2960, field2972, (byte[]) null);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "()V", line = 53)
    public static void method1441() {
        field2973 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 56)
    public static final void method1442(int arg0) {
        field2973[0] = arg0;
        class250.field3818.glDeleteTextures(1, field2973, 0);
    }
}

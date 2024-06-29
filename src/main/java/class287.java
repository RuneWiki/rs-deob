import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class287 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4489 = 3553;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4490 = 34037;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4491 = 6407;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4492 = 6408;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4493 = 32993;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4494 = 34843;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4495 = 34842;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field4496 = 34837;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4497 = 34836;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4498 = 6406;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field4499 = 6402;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4500 = 9729;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4501 = 9728;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4502 = 5126;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field4503 = 5121;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
    private static int[] field4504 = new int[1];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III[B)I", line = 5)
    public static final int method2014(int arg0, int arg1, int arg2, byte[] arg3) {
        return method2018(field4489, arg0, arg1, arg2, field4500, field4500, arg0, field4503, arg3);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V", line = 12)
    public static final void method2015(int arg0, int arg1, int arg2) {
        method2019(field4490, arg0, arg1, arg2, field4491, field4503, (byte[]) null);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)I", line = 15)
    public static final int method2016(int arg0, int arg1, int arg2) {
        return method2018(field4489, arg0, arg1, arg2, field4500, field4500, arg0, field4503, (byte[]) null);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2017(int arg0) {
        field4504[0] = arg0;
        class162.field2654.glDeleteTextures(1, field4504, 0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII[B)I", line = 27)
    public static final int method2018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class162.field2654;
        int var10 = method2021();
        if (arg0 == 3553) {
            class162.method1219(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method2019(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII[B)V", line = 42)
    public static final void method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class162.field2654.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V", line = 46)
    public static void method2020() {
        field4504 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()I", line = 52)
    public static final int method2021() {
        class162.field2654.glGenTextures(1, field4504, 0);
        return field4504[0];
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V", line = 56)
    public static final void method2022(int arg0, int arg1, int arg2) {
        method2019(field4489, arg0, arg1, arg2, field4491, field4503, (byte[]) null);
    }
}

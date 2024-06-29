import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class291 extends class220 {

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    private int field4980 = -1;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    private int field4983 = 0;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "Lmh;")
    public static class128 field4970 = class22.method156(127, "gr-Un:");

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "J")
    public static long field4973 = 0L;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "Lmh;")
    public static class128 field4982 = class22.method156(122, "Fps:");

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Lmh;")
    public static class128 field4981 = class22.method156(125, "(U0a )2 in: ");

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Ldj;")
    public static class314 field4975;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Ldj;")
    public static class314 field4976;

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        if (this.field4980 != -1) {
            class274.method1927(this.field4980, this.field4983, this.field4971);
            this.field4980 = -1;
            this.field4983 = 0;
        }
        super.finalize();
        field4979++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIII)V", line = 51)
    public static final void method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class247.field4247) {
            int var8 = arg0 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class289.field4947 - class27.field589) * var8 / 100 + class27.field589;
            arg6 = arg6 * var9 >> 8;
        }
        int var10 = 2048 - arg4 & 0x7FF;
        if (arg2 != 24738) {
            method2001(-10, 61, 53, 3, -5, 112, 55, -121);
        }
        int var11 = 2048 - arg7 & 0x7FF;
        field4969++;
        int var12 = arg6;
        int var13 = 0;
        int var14 = 0;
        if (var10 != 0) {
            int var15 = class141.field2411[var10];
            int var16 = class141.field2424[var10];
            var14 = -arg6 * var16 >> 16;
            var12 = arg6 * var15 >> 16;
        }
        if (var11 != 0) {
            int var17 = class141.field2424[var11];
            int var18 = class141.field2411[var11];
            var13 = var12 * var17 >> 16;
            var12 = var12 * var18 >> 16;
        }
        class33.field716 = arg7;
        class187.field3249 = arg3 - var14;
        class143.field2445 = arg1 - var12;
        class142.field2436 = arg5 - var13;
        class311.field5271 = arg4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([[IZ)V", line = 117)
    public static final void method2002(int[][] arg0, boolean arg1) {
        if (!arg1) {
            class219.field3850 = arg0;
            field4977++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V", line = 131)
    public static void method2003(int arg0) {
        if (arg0 > -84) {
            method2001(57, 10, -17, 89, 40, 86, -38, -52);
        }
        field4982 = null;
        field4981 = null;
        field4976 = null;
        field4970 = null;
        field4975 = null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V", line = 178)
    public class291(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class247.field4253;
        var3.glGenTextures(1, var2, 0);
        this.field4971 = class274.field4748;
        this.field4980 = var2[0];
        class247.method1691(this.field4980);
        int var4 = class141.field2413[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class274.field4744 += var6.limit() - this.field4983;
        this.field4983 = var6.limit();
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 150)
    public final void method2004(int arg0) {
        field4978++;
        int var2 = class167.method1092(39);
        if ((var2 & arg0) == 0) {
            class247.method1691(this.field4980);
        }
        if ((var2 & 0x2) == 0) {
            class247.method1701(0);
        }
        if ((var2 & 0x4) == 0) {
            class247.method1687(0);
        }
    }
}

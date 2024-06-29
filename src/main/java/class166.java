import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class166 extends class433 implements class306 {

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    private int field2581;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    private int field2588;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    private int field2586;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "Lq;")
    public static class397 field2583;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2585;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "[I")
    public static int[] field2582;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)V", line = 4)
    public static void method1137(int arg0) {
        if (arg0 != -1) {
            field2583 = null;
        }
        field2585 = null;
        field2583 = null;
        field2582 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 24)
    public static final String method1138(String arg0, int arg1) {
        ++field2587;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (~var3 < ~var2 && class709.method3906(arg0.charAt(var2), -46)) {
                ++var2;
            }
            if (arg1 != 3317) {
                field2582 = null;
            }
            while (var3 > var2 && class709.method3906(arg0.charAt(var3 + -1), -46)) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var3 > var6; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class488.method2728(arg1 + -3436, var7)) {
                        char var8 = class170.method1157(var7, (byte) -64);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ldc;Lhi;III[B)V", line = 87)
    public class166(class5 arg0, class193 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class294.field4160, arg3 * arg4 * arg2, false);
        this.field2581 = arg3;
        this.field2588 = arg4;
        this.field2586 = arg2;
        super.field5925.method897(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5915, 0, this.method2461(-95), this.field2586, this.field2581, this.field2588, 0, class420.method2414(144, super.field5922), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}

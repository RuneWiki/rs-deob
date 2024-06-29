import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class588 extends class17 implements class270 {

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "[I")
    public static int[] field8349 = new int[32];

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "[Lie;")
    public static class6[] field8351 = new class6[2048];

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "J")
    public static long field8352 = 0L;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "Lws;")
    public static class328 field8350 = new class328(6, 17);

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "Ljo;")
    public static class307 field8353 = new class307("", 15);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public static void method3436(byte arg0) {
        int var1 = -33 % ((arg0 - -24) / 60);
        field8351 = null;
        field8353 = null;
        field8350 = null;
        field8349 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lbea;IZ[[I)V")
    public class588(class205 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class86.field1055, class134.field2197, arg1 * arg1 * 6, arg2);
        super.field300.method2271(this, 5180);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method251(arg3[var5], var5 + 34069, arg1, arg1, (byte) -3);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method248(10241), arg1, arg1, 0, class250.method1782((byte) 95, super.field285), super.field300.field3438, arg3[var6], 0);
            }
        }
    }
}

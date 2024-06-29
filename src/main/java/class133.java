import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class133 extends class42 implements class168 {

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "[I")
    public static int[] field1949 = new int[250];

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lqfa;")
    public static class98 field1950 = new class98(25, 6);

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lbd;")
    public static class60 field1951 = new class60(13, 19);

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lgda;")
    public static class53 field1952 = new class53(15, 2);

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lfha;IZ[[I)V")
    public class133(class378 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class165.field2263, class309.field4305, arg1 * 6 * arg1, arg2);
        super.field506.method1663(this, -2);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method283(arg1, (byte) -2, var5 + 34069, arg1, arg3[var5]);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method284(-89), arg1, arg1, 0, class651.method3587((byte) -80, super.field516), super.field506.field5412, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        int var1 = -24 / ((-37 - arg0) / 40);
        field1952 = null;
        field1949 = null;
        field1951 = null;
        field1950 = null;
    }
}

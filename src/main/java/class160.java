import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class160 extends class753 implements class158 {

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Lfja;")
    public static class783 field2573 = new class783(77, 3);

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field2575 = 2;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Lsk;")
    public static class650 field2574;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Loia;IZ[[I)V", line = 3)
    public class160(class97 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class530.field7176, class497.field6799, arg1 * 6 * arg1, arg2);
        super.field10392.method3090(this, (byte) 77);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method4178(6409), arg1, arg1, 0, class298.method1917(-118, super.field10382), super.field10392.field1590, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                this.method4177(arg3[var6], arg1, var6 + 34069, arg1, 1);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 41)
    public static void method1228(byte arg0) {
        field2574 = null;
        field2573 = null;
        if (arg0 >= -83) {
            field2571 = -89;
        }
    }
}

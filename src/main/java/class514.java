import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class514 extends class50 implements class639 {

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Lvh;")
    public static class125 field7626 = new class125(18, -1);

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field7630 = 0;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[Lf;")
    public static class257[] field7628;

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lad;IZ[[I)V", line = 3)
    public class514(class669 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class297.field4191, class689.field9771, arg1 * 6 * arg1, arg2);
        super.field663.method2924(13528, this);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method393(var5 + 34069, (byte) -100, arg1, arg3[var5], arg1);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method397((byte) 93), arg1, arg1, 0, class21.method211(super.field654, 49), super.field663.field9528, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)Lph;", line = 38)
    public static final class699 method3052(byte arg0) {
        ++field7627;
        if (arg0 >= -81) {
            field7629 = -64;
        }
        return class10.field130 == 0 ? new class699() : class407.field5836[--class10.field130];
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 56)
    public static void method3053(int arg0) {
        field7626 = null;
        int var1 = 63 % ((12 - arg0) / 45);
        field7628 = null;
    }
}

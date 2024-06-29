import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class139 extends class651 implements class320 {

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "Lke;")
    public static class622 field1794 = new class622(37, -2);

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Log;IZ[[I)V")
    public class139(class673 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class12.field247, class770.field10614, arg1 * 6 * arg1, arg2);
        super.field9169.method1104(true, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method3727(false, arg1, arg3[var5], arg1, var5 + 34069);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method3733(-113), arg1, arg1, 0, class379.method2342(super.field9176, 6410), super.field9169.field9539, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIIII)V")
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 55) {
            method973(false);
        }
        ++field1793;
        if (arg3 > arg1) {
            class382.method2347(arg1, class347.field5087[arg0], arg4, 7, arg3);
        } else {
            class382.method2347(arg3, class347.field5087[arg0], arg4, 7, arg1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method973(boolean arg0) {
        if (arg0) {
            method973(false);
        }
        field1794 = null;
    }
}

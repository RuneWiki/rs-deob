import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class364 extends class664 implements class64 {

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "[I")
    public static int[] field5239 = new int[50];

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V", line = 3)
    public static void method2235(int arg0) {
        field5239 = null;
        if (arg0 > -48) {
            field5239 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lmc;IZ[[I)V", line = 14)
    public class364(class381 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class420.field5862, class680.field9664, arg1 * arg1 * 6, arg2);
        super.field9406.method1884(this, -2);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method3678(-17641), arg1, arg1, 0, class54.method313(-120, super.field9405), super.field9406.field5546, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method3685(arg3[var6], arg1, arg1, var6 + 34069, -7441);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)Lch;", line = 49)
    public static final class19 method2236(int arg0, int arg1, int arg2) {
        ++field5240;
        class19 var3 = (class19) class608.field8292.method2506(arg0 ^ 1248116646, (long) arg2 << 32 | (long) arg1);
        if (arg0 != 1248116640) {
            method2236(107, 47, 34);
        }
        if (var3 == null) {
            var3 = new class19(arg2, arg1);
            class608.field8292.method2504(var3.field272, 111, var3);
        }
        return var3;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class204 extends class235 {

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
    public static int[] field3694 = new int[50];

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Lhh;")
    public static class163 field3698 = class137.method1065("<col=ffffff> )4 ", 17);

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field3699 = 0;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Lpa;")
    public static class123 field3697;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "[Lne;")
    public static class94[] field3695;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method1453(byte arg0) {
        field3694 = null;
        field3698 = null;
        if (arg0 < 120) {
            method1453((byte) 63);
        }
        field3695 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIIIII)V")
    public static final void method1454(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3696++;
        int var8 = arg2 + 1;
        class227.method1585(arg3, (byte) -66, arg4, class85.field1605[arg2], arg1);
        int var9 = arg5 - 1;
        class227.method1585(arg3, (byte) -66, arg4, class85.field1605[arg5], arg1);
        if (arg0 >= -13) {
            field3699 = 96;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class85.field1605[var6];
            var7[arg3] = var7[arg1] = arg4;
        }
    }
}

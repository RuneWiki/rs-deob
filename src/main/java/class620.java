import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class620 {

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lvda;")
    public static class311 field8927 = new class311();

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lgn;")
    public static class635 field8928 = new class635();

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field8930 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public int field8921;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field8922;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field8926;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lkr;")
    public static class329 field8931;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
    public static int[] field8929;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method3554(String arg0, byte arg1, int arg2, String arg3, String arg4, String arg5, int arg6, int arg7) {
        field8924++;
        class530 var8 = class615.field8872[99];
        if (arg1 != -57) {
            return;
        }
        for (int var9 = 99; var9 > 0; var9--) {
            class615.field8872[var9] = class615.field8872[var9 - 1];
        }
        if (var8 == null) {
            var8 = new class530(arg2, arg7, arg4, arg0, arg5, arg6, arg3);
        } else {
            var8.method2955(arg3, arg7, arg2, arg6, arg4, (byte) -23, arg0, arg5);
        }
        class615.field8872[0] = var8;
        class582.field8155 = class591.field8533;
        class315.field4365++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method3555(byte arg0) {
        if (arg0 == 77) {
            field8928 = null;
            field8931 = null;
            field8929 = null;
            field8927 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)I")
    public static final int method3556(int arg0, int arg1, int arg2, int arg3) {
        field8920++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        if (arg1 != 15199) {
            field8930 = -11;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg2;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
    public static final boolean method3557(int arg0, int arg1, int arg2) {
        field8923++;
        if (arg2 != -1) {
            method3554(null, (byte) -66, 29, null, null, null, 127, 28);
        }
        return (arg1 & 0x70000) != 0 | class310.method1870(arg2 ^ 0xFFFFFFC0, arg0, arg1) || class611.method3495(arg0, arg1, 4090);
    }
}

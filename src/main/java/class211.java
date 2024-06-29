import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class211 extends class235 {

    @OriginalMember(owner = "client!th", name = "x", descriptor = "J")
    public long field3608;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Lgj;")
    public static class226 field3606 = new class226(4);

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Lwa;")
    public static class219 field3609 = new class219(32);

    @OriginalMember(owner = "client!th", name = "E", descriptor = "[Z")
    public static boolean[] field3615 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Lgj;")
    public static class226 field3614 = new class226(64);

    @OriginalMember(owner = "client!th", name = "G", descriptor = "[I")
    public static int[] field3617 = new int[50];

    @OriginalMember(owner = "client!th", name = "F", descriptor = "B")
    public static byte field3616;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Lw;")
    public static class100 field3611;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1415(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3607++;
        if (class229.field3933 <= (arg6 - arg0) && arg0 + arg6 <= class106.field1899 && class116.field2077 <= arg5 - arg0 && (arg0 + arg5) <= class215.field3666) {
            class253.method1748(arg1, arg5, arg4, arg3, arg6, (byte) 111, arg0);
        } else {
            class113.method846(arg4, arg5, arg1, arg6, arg3, true, arg0);
        }
        if (arg2 > -49) {
            method1415(20, 31, (byte) 6, -99, -116, -22, -27);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method1416(int arg0) {
        field3611 = null;
        if (arg0 != 32) {
            method1415(64, 41, (byte) -27, 81, 86, -104, -127);
        }
        field3609 = null;
        field3617 = null;
        field3615 = null;
        field3606 = null;
        field3614 = null;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
    public static final void method1417(byte arg0) {
        int var1 = 124 / ((arg0 + 19) / 48);
        class53.field849.method1554((byte) -109);
        field3604++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1418(int arg0, int arg1, int arg2, long arg3) {
        class71 var5 = class31.field553[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1141 != null && var5.field1141.field3874 == arg3) {
            return true;
        } else if (var5.field1157 != null && var5.field1157.field3535 == arg3) {
            return true;
        } else if (var5.field1132 != null && var5.field1132.field852 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1149; var6++) {
                if (var5.field1140[var6].field260 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class211() {
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(J)V")
    public class211(long arg0) {
        this.field3608 = arg0;
    }
}

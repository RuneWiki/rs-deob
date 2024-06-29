import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class276 extends class317 {

    @OriginalMember(owner = "client!rp", name = "G", descriptor = "[I")
    public static int[] field3649 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "Lhu;")
    public static class76 field3642 = new class76(4);

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!rp", name = "F", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
    public int field3650;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "J")
    public long field3646;

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "[Lnn;")
    public static class263[] field3652;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)I")
    public final int method1546(boolean arg0) {
        field3654++;
        if (!arg0) {
            method1552(64, 6, 29, -93, (byte) 121, 55, -93);
        }
        return this.field3647;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)V")
    public static final void method1547(byte arg0, int arg1) {
        field3644++;
        if (class191.field2589 == null) {
            class191.field2589 = new byte[4][class295.field3947][class39.field567];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class295.field3947; var3++) {
                for (int var4 = 0; var4 < class39.field567; var4++) {
                    class191.field2589[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 >= -71) {
            method1547((byte) 16, 46);
        }
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)V")
    public static void method1548(int arg0) {
        field3649 = null;
        field3642 = null;
        if (arg0 != 0) {
            method1547((byte) 84, -19);
        }
        field3652 = null;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)I")
    public final int method1549(byte arg0) {
        if (arg0 != 108) {
            method1550(69, (class381) null);
        }
        field3648++;
        return this.field3650;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILid;)Z")
    public static final boolean method1550(int arg0, class381 arg1) {
        field3645++;
        class88 var2 = class1.field23.method935(arg1.method13(63), (byte) -119);
        if (var2.field1235 == -1) {
            return true;
        }
        class351 var3 = class171.field2351.method2198(34, var2.field1235);
        if (var3.field4873 == -1) {
            return true;
        } else if (arg0 == 38) {
            return var3.method2172(true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
    public final int method1551(int arg0) {
        field3653++;
        if (arg0 != 128) {
            this.field3647 = -91;
        }
        return this.field3655;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1552(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        for (class64 var7 = (class64) class367.field5048.method2764((byte) 97); var7 != null; var7 = (class64) class367.field5048.method2769(true)) {
            if (class70.field968 >= var7.field847) {
                var7.method1541(-3);
            } else {
                class377.method2316(arg1, var7.field855, arg3 >> 1, (var7.field846 << 7) + 64, var7.field851 * 2, arg2 >> 1, (var7.field856 << 7) + 64, arg6, -69);
                class93.field1366.method2127(var7.field857, 0, true, class168.field2324[1] + arg0, var7.field854 | 0xFF000000, class168.field2324[0] + arg5);
            }
        }
        if (arg4 != -54) {
            method1552(97, 2, -56, 72, (byte) 63, -123, -18);
        }
        field3643++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIB)V")
    public static final void method1553(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class444.field6033 = arg3;
        int var5 = -87 / ((-arg4 - 33) / 52);
        class154.field2155 = arg1;
        field3651++;
        class460.field6229 = arg0;
        class311.field4107 = arg2;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)J")
    public final long method1554(byte arg0) {
        field3641++;
        return arg0 == -15 ? this.field3646 : -78L;
    }
}

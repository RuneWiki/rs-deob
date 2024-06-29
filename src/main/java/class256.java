import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class256 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field4323 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lmh;")
    public static class62 field4331 = class201.method1405(true, "T");

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
    public static int[] field4329 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field4321 = -1;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lmh;")
    public static class62 field4325 = class201.method1405(true, "(U0a )2 in: ");

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
    public static int[] field4332 = new int[2];

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[[B")
    public static byte[][] field4327;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[[[Lhk;")
    public static class166[][][] field4320;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILmh;Lmh;Lmh;B)V", line = 17)
    public static final void method1777(int arg0, class62 arg1, class62 arg2, class62 arg3, byte arg4) {
        field4322++;
        if (arg4 <= -29) {
            class38.method260(arg0, arg3, arg2, -1, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1778(int arg0) {
        field4326++;
        class40.method271();
        class163.field2647 = new class95[7];
        class163.field2647[1] = new class188();
        class163.field2647[2] = new class145();
        class163.field2647[3] = new class273();
        class163.field2647[4] = new class59();
        class163.field2647[5] = new class244();
        class163.field2647[arg0] = new class310();
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)Z", line = 50)
    public static final boolean method1779(boolean arg0, int arg1) {
        if (arg0) {
            field4325 = (class62) null;
        }
        field4333++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 74)
    public static void method1780(boolean arg0) {
        field4325 = null;
        field4332 = null;
        if (arg0) {
            return;
        }
        field4331 = null;
        field4327 = (byte[][]) null;
        field4323 = null;
        field4320 = (class166[][][]) null;
        field4329 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lmh;B)Z", line = 94)
    public static final boolean method1781(class62 arg0, byte arg1) {
        field4328++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class190.field3042; var2++) {
            if (arg0.method436(class294.field5022[var2], 32)) {
                return true;
            }
        }
        if (arg1 != 37) {
            field4325 = (class62) null;
        }
        if (arg0.method436(class268.field4551.field2430, 32)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z", line = 133)
    public static final boolean method1782(int arg0, int arg1) {
        if (arg1 > -54) {
            field4321 = -14;
        }
        field4324++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 144)
    public static final void method1783(int arg0) {
        field4330++;
        if (arg0 != 2) {
            field4332 = (int[]) null;
        }
        class236.field4051.method1392(0);
    }
}

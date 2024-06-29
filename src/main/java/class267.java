import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class267 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lte;")
    public static class357 field3957 = new class357(64);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "F")
    public static float field3961 = 0.0F;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lbo;")
    public static class453 field3962 = new class453(64);

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lir;")
    public static class185 field3958;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[S")
    public static short[] field3960;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Z")
    public static final boolean method1784(int arg0, byte arg1) {
        field3959++;
        if (arg0 == 7 || arg0 == 10 || arg0 == 39 || arg0 == 19 || arg0 == 18) {
            return true;
        } else if (arg0 == 46 || arg0 == 17 || arg0 == 1005) {
            return true;
        } else {
            if (arg1 > -61) {
                method1787(-105, 24, 78);
            }
            if (arg0 == 8 || arg0 == 4 || arg0 == 47 || arg0 == 15 || arg0 == 30) {
                return true;
            } else {
                return arg0 == 21 || arg0 == 33 || arg0 == 1002 || arg0 == 3;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsj;IIZ)V")
    public static final void method1785(class248 arg0, int arg1, int arg2, boolean arg3) {
        field3963++;
        if (arg3) {
            return;
        }
        class421 var4 = arg0.method1620(0, class126.field1647);
        if (var4 == null) {
            return;
        }
        class126.field1647.method462(arg1, arg2, arg0.field3531 + arg1, arg2 - -arg0.field3564);
        if (class163.field2223 < 3) {
            class390.field5706.method2069((float) arg0.field3531 / 2.0F + (float) arg1, (float) arg0.field3564 / 2.0F + (float) arg2, 4096, (int) (-class247.field3479) & 0x3FFF << 2, var4, arg1, arg2);
        } else {
            class126.field1647.method515(-16777216, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1786(int arg0) {
        field3958 = null;
        if (arg0 != -48) {
            field3958 = null;
        }
        field3962 = null;
        field3957 = null;
        field3960 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public static final void method1787(int arg0, int arg1, int arg2) {
        boolean var3 = class106.field1405[0][arg1][arg2] != null && class106.field1405[0][arg1][arg2].field1061 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class106.field1405[var4][arg1][arg2] == null) {
                class77 var5 = class106.field1405[var4][arg1][arg2] = new class77(var4, arg1, arg2);
                if (var3) {
                    var5.field1073++;
                }
            }
        }
    }
}

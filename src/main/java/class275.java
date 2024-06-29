import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class275 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lnk;")
    public static class326 field4523 = new class326(29, -1);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4528 = -1;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "F")
    public static float field4522;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lln;")
    public static class169 field4529;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[Lhd;")
    public static class239[] field4527;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 6)
    public static void method1814(byte arg0) {
        field4523 = null;
        field4527 = null;
        if (arg0 >= 62) {
            field4529 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Z", line = 21)
    public static final boolean method1815(byte arg0, int arg1) {
        field4525++;
        int var2 = 114 / ((-arg0 - 48) / 63);
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Z", line = 31)
    public static final boolean method1816(int arg0) {
        int var1 = -54 % ((-arg0 - 16) / 38);
        field4524++;
        return class480.field7080 > 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBLid;)V", line = 44)
    public static final void method1817(int arg0, int arg1, int arg2, byte arg3, class292 arg4) {
        field4526++;
        long var5 = (long) (arg1 | arg0 << 14 | arg2 << 28);
        class279 var7 = (class279) class244.field4176.method2516(var5, -1);
        if (var7 == null) {
            class279 var8 = new class279();
            class244.field4176.method2517(var8, var5, (byte) 5);
            var8.field4577.method2541(0, arg4);
            return;
        }
        int var9 = 26 / ((arg3 - 37) / 38);
        class104 var10 = class20.field218.method2221(arg4.field4737, -1);
        int var11 = var10.field1734;
        if (var10.field1745 == 1) {
            var11 = (arg4.field4738 + 1) * var11;
        }
        for (class292 var12 = (class292) var7.field4577.method2538(-3); var12 != null; var12 = (class292) var7.field4577.method2535((byte) -48)) {
            class104 var13 = class20.field218.method2221(var12.field4737, -1);
            int var14 = var13.field1734;
            if (var13.field1745 == 1) {
                var14 = (var12.field4738 + 1) * var14;
            }
            if (var11 > var14) {
                class304.method1944(var12, -97, arg4);
                return;
            }
        }
        var7.field4577.method2541(0, arg4);
    }
}

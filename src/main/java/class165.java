import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class165 extends class24 {

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Lok;")
    public static class41 field2607 = class137.method956("Lade Schrifts-=tze )2 ", 45);

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field2609 = -1;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "[Z")
    public static boolean[] field2615 = new boolean[100];

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field2616 = 0;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lak;")
    public static class20 field2608 = new class20(64);

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 6)
    public static void method1153(int arg0) {
        field2608 = null;
        field2607 = null;
        field2615 = null;
        if (arg0 != 25424) {
            field2615 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 37)
    public static final void method1154(int arg0, int arg1) {
        field2612++;
        class46 var2 = class195.method1396(2, arg0, false);
        var2.method336(true);
        int var3 = -45 % ((42 - arg1) / 48);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I", line = 60)
    public static final int method1155(int arg0, int arg1) {
        field2614++;
        return arg0 == -125679832 ? arg1 >>> 8 : -82;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)Lti;", line = 72)
    public static final class147 method1156(int arg0, byte arg1) {
        field2610++;
        class147 var2 = (class147) class32.field466.method136((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -86) {
            method1157(true, -13);
        }
        byte[] var3 = class107.field1514.method454(class202.method1434(arg0, -69), 0, class153.method1092((byte) -119, arg0));
        class147 var4 = new class147();
        var4.field2247 = arg0;
        if (var3 != null) {
            var4.method1025(-18217, new class112(var3));
        }
        var4.method1020(31530);
        class32.field466.method132((long) arg0, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Lbc;", line = 110)
    public static final class302 method1157(boolean arg0, int arg1) {
        field2611++;
        if (arg0) {
            field2608 = (class20) null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class273.field4446[var2] == null || class273.field4446[var2][var3] == null) {
            boolean var4 = class32.method223(var2, 255);
            if (!var4) {
                return null;
            }
        }
        return class273.field4446[var2][var3];
    }
}

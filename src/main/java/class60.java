import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fi")
public class class60 extends class71 {

    @OriginalMember(owner = "fi", name = "t", descriptor = "Z")
    public boolean field1180 = false;

    @OriginalMember(owner = "fi", name = "u", descriptor = "Llf;")
    public static class109 field1181 = class35.method275("cross", 2);

    @OriginalMember(owner = "fi", name = "p", descriptor = "[I")
    public static int[] field1176 = new int[100];

    @OriginalMember(owner = "fi", name = "s", descriptor = "Llf;")
    public static class109 field1179 = class35.method275("<col=ffffff>", 2);

    @OriginalMember(owner = "fi", name = "r", descriptor = "Llf;")
    public static class109 field1178 = class35.method275(":clanreq:", 2);

    @OriginalMember(owner = "fi", name = "w", descriptor = "Llf;")
    private static class109 field1183 = class35.method275("Type", 2);

    @OriginalMember(owner = "fi", name = "v", descriptor = "Llf;")
    public static class109 field1182 = field1183;

    @OriginalMember(owner = "fi", name = "y", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "fi", name = "n", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "fi", name = "o", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "fi", name = "q", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "fi", name = "x", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "fi", name = "a", descriptor = "(III)Lba;")
    public static final class12 method392(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        return var3 == null ? null : var3.field31;
    }

    @OriginalMember(owner = "fi", name = "a", descriptor = "(ILvg;IB)V")
    public static final void method393(int arg0, class200 arg1, int arg2, byte arg3) {
        field1177++;
        if (class40.field845 != 0 && class40.field845 != 3) {
            return;
        }
        int var4 = arg2 - arg1.field3881 / 2;
        int var5 = arg0 - arg1.field3901 / 2;
        int var6 = class69.field1343 + class47.field970 & 0x7FF;
        int var7 = class124.field2383[var6];
        int var8 = (class144.field2780 + 256) * var7 >> 8;
        int var9 = class124.field2387[var6];
        int var10 = (class144.field2780 + 256) * var9 >> 8;
        int var11 = var5 * var10 - var4 * var8 >> 11;
        int var12 = class157.field2955.field3609 - var11 >> 7;
        if (arg3 <= 84) {
            field1179 = null;
        }
        int var13 = var4 * var10 + var5 * var8 >> 11;
        int var14 = class157.field2955.field3549 + var13 >> 7;
        boolean var15 = class55.method358(0, 0, 0, var14, 0, 1, class157.field2955.field3567[0], class157.field2955.field3547[0], true, var12, 0, 0);
        if (!var15) {
            return;
        }
        class200.field3850.method568(-13488, var4);
        class200.field3850.method568(-13488, var5);
        class200.field3850.method557(9698, class69.field1343);
        class200.field3850.method568(-13488, 57);
        class200.field3850.method568(-13488, class47.field970);
        class200.field3850.method568(-13488, class144.field2780);
        class200.field3850.method568(-13488, 89);
        class200.field3850.method557(9698, class157.field2955.field3549);
        class200.field3850.method557(9698, class157.field2955.field3609);
        class200.field3850.method568(-13488, class82.field1617);
        class200.field3850.method568(-13488, 63);
    }

    @OriginalMember(owner = "fi", name = "a", descriptor = "(I)V")
    public static void method394(int arg0) {
        field1183 = null;
        field1179 = null;
        field1176 = null;
        field1178 = null;
        field1182 = null;
        field1181 = null;
        if (arg0 != -27022) {
            method393(29, null, -94, (byte) 102);
        }
    }

    @OriginalMember(owner = "fi", name = "a", descriptor = "(II)V")
    public static final void method395(int arg0, int arg1) {
        class3 var2 = class78.field1550[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class3 var4 = class78.field1550[var3][arg0][arg1] = class78.field1550[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field19--;
                for (int var5 = 0; var5 < var4.field13; var5++) {
                    class45 var6 = var4.field17[var5];
                    if ((var6.field949 >> 29 & 0x3L) == 2L && var6.field947 == arg0 && var6.field932 == arg1) {
                        var6.field939--;
                    }
                }
            }
        }
        if (class78.field1550[0][arg0][arg1] == null) {
            class78.field1550[0][arg0][arg1] = new class3(0, arg0, arg1);
        }
        class78.field1550[0][arg0][arg1].field24 = var2;
        class78.field1550[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "fi", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method396(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 41) {
            method395(105, -58);
        }
        field1175++;
        class81 var10 = null;
        for (class81 var11 = (class81) class47.field976.method1230(53); var11 != null; var11 = (class81) class47.field976.method1234(-1)) {
            if (var11.field1591 == arg3 && var11.field1595 == arg0 && var11.field1590 == arg1 && var11.field1606 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class81();
            var10.field1590 = arg1;
            var10.field1595 = arg0;
            var10.field1606 = arg2;
            var10.field1591 = arg3;
            class168.method1127(arg5 - 41, var10);
            class47.field976.method1231(var10, arg5 - 41);
        }
        var10.field1601 = arg6;
        var10.field1602 = arg8;
        var10.field1600 = arg9;
        var10.field1598 = arg7;
        var10.field1605 = arg4;
    }
}

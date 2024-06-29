import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class28 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ltl;")
    public static class59 field370 = class85.method639("Verbindung zum Update)2Server hergestellt)3", 9588);

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Ltl;")
    public static class59 field371 = class85.method639("::cardmem", 9588);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 9)
    public static void method177(int arg0) {
        if (arg0 != 0) {
            method177(-127);
        }
        field371 = null;
        field370 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIBIIIIIIIZ)Z", line = 34)
    public static final boolean method178(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field372++;
        if (arg3 != -6) {
            method180(false, 31, (class23) null, -4);
        }
        if (class286.field4920.method776(true) == 2) {
            return class291.method2018(arg4, arg7, arg10, arg5, arg6, arg11, (byte) 52, arg2, arg0, arg8, arg9, arg1);
        } else if (class286.field4920.method776(true) <= 2) {
            return class146.method1059(arg0, arg11, arg9, arg2, arg4, arg5, arg1, (byte) -91, arg7, arg10, arg6, arg8);
        } else {
            return class229.method1592(arg5, arg1, arg7, arg8, arg2, class286.field4920.method776(true), arg4, (byte) -97, arg10, arg0, arg9, arg6, arg11);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IFIIZIII)[I", line = 53)
    public static final int[] method179(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field366++;
        if (arg0 <= 4) {
            return (int[]) null;
        }
        class100 var8 = new class100();
        var8.field1607 = (int) (arg1 * 4096.0F);
        var8.field1604 = arg7;
        var8.field1615 = arg2;
        var8.field1628 = arg3;
        var8.field1620 = arg4;
        var8.field1601 = arg5;
        int[] var9 = new int[arg6];
        var8.method319((byte) -79);
        class133.method973(arg6, 1, 123);
        var8.method762(0, var9, 2048);
        return var9;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZILp;I)V", line = 84)
    public static final void method180(boolean arg0, int arg1, class23 arg2, int arg3) {
        if (arg2.field1737 == arg1 && arg1 != -1) {
            class129 var4 = class265.method1834((byte) -39, arg1);
            int var5 = var4.field2140;
            if (var5 == 1) {
                arg2.field1721 = 0;
                arg2.field1786 = arg3;
                arg2.field1789 = 0;
                arg2.field1781 = 0;
                class29.method182(1048575, false, arg2.field1774, var4, arg2.field1781, arg2.field1769);
            }
            if (var5 == 2) {
                arg2.field1721 = 0;
            }
        } else if (arg1 == -1 || arg2.field1737 == -1 || class265.method1834((byte) -39, arg1).field2111 >= class265.method1834((byte) -39, arg2.field1737).field2111) {
            arg2.field1781 = 0;
            arg2.field1737 = arg1;
            arg2.field1789 = 0;
            arg2.field1786 = arg3;
            arg2.field1779 = arg2.field1790;
            arg2.field1721 = 0;
            if (arg2.field1737 != -1) {
                class29.method182(1048575, false, arg2.field1774, class265.method1834((byte) -39, arg2.field1737), arg2.field1781, arg2.field1769);
            }
        }
        if (arg0) {
            field369 = 116;
        }
        field365++;
    }
}

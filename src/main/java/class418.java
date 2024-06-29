import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class418 {

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public static int field6149 = 1;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "[I")
    public static int[] field6148 = new int[1000];

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!gia", name = "f", descriptor = "Ltc;")
    public static class73 field6153;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIILjn;IILnha;III)V")
    public static final void method2568(int arg0, int arg1, int arg2, int arg3, int arg4, class322 arg5, int arg6, int arg7, class686 arg8, int arg9, int arg10, int arg11) {
        class40.field711 = arg5;
        if (arg0 != 4095) {
            field6148 = null;
        }
        class447.field6530 = null;
        class64.field1033 = arg11;
        class401.field5954 = null;
        class639.field8971 = arg3;
        class19.field200 = arg9;
        class124.field1899 = arg7;
        class576.field8164 = arg1;
        field6152++;
        class718.field10074 = null;
        class150.field2337 = arg6;
        class144.field2235 = arg4;
        class235.field3754 = arg8;
        class238.field3834 = arg10;
        class146.field2297 = arg2;
        class97.method795((byte) -20);
        class757.field10546 = true;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
    public static final void method2569(int arg0) {
        field6150++;
        class327 var1 = null;
        try {
            var1 = class731.method4065("2", true);
            class301 var2 = new class301(class315.field4733 * 6 + 3);
            var2.method1926(arg0, 65280);
            var2.method1939(class315.field4733, arg0 + 1134947719);
            for (int var3 = 0; var3 < class472.field6852.length; var3++) {
                if (class618.field8712[var3]) {
                    var2.method1939(var3, 1134947720);
                    var2.method1970((byte) 29, class472.field6852[var3]);
                }
            }
            var1.method2108(0, 97, var2.field4543, var2.field4534);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2110((byte) 52);
            }
        } catch (Exception var4) {
        }
        class470.field6825 = class18.method109(-11121);
        class292.field4487 = false;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIII)I")
    public static final int method2570(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field6151++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 4095 - arg2;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            if (arg3 >= -122) {
                field6148 = null;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)V")
    public static void method2571(int arg0) {
        if (arg0 != 883) {
            method2568(-115, -95, -52, -72, -8, null, -6, 87, null, 111, -42, 78);
        }
        field6148 = null;
        field6153 = null;
    }
}

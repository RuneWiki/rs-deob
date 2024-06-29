import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class167 extends class566 {

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "Lem;")
    public static class206 field2431 = new class206(47, 2);

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "[S")
    public static short[] field2437 = new short[] { 18, 17, 13, 51, 3, 15, 48, 58 };

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "[I")
    public static int[] field2441 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "[[Lin;")
    public static class78[][] field2439;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BII)Z")
    public static final boolean method1176(byte arg0, int arg1, int arg2) {
        if (arg0 != -118) {
            method1179((byte) -71);
        }
        field2434++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)V")
    public static final void method1177(int arg0) {
        field2432++;
        if (arg0 != 5926) {
            method1177(-14);
        }
        class109.field1504.method974(-20470);
        class207.field2905.method974(arg0 - 26396);
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)V")
    public static void method1178(byte arg0) {
        if (arg0 < 77) {
            field2435 = 65;
        }
        field2441 = null;
        field2437 = null;
        field2439 = null;
        field2431 = null;
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)V")
    public static final void method1179(byte arg0) {
        class321.method1928(-1, 255, (byte) 126);
        if (arg0 >= -97) {
            method1176((byte) 78, -2, -77);
        }
        field2433++;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1180(String arg0, int arg1) {
        field2438++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class430.method2473(arg1 ^ 0x3CD3, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class671.field9419; var3++) {
            String var4 = class696.field9891[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class430.method2473(15570, var4);
            if (var5 != null && var5.equals(var2)) {
                class671.field9419--;
                for (int var6 = var3; var6 < class671.field9419; var6++) {
                    class696.field9891[var6] = class696.field9891[var6 + 1];
                    class287.field3952[var6] = class287.field3952[var6 + 1];
                    class531.field7187[var6] = class531.field7187[var6 + 1];
                    class423.field5950[var6] = class423.field5950[var6 + 1];
                    class389.field5497[var6] = class389.field5497[var6 + 1];
                    class29.field366[var6] = class29.field366[var6 + 1];
                }
                class164.field2356++;
                class433.field6034 = class436.field6066;
                class352 var7 = class290.method1786(98, class199.field2836, class66.field861);
                var7.field4686.method2817(class705.method3947((byte) -47, arg0), true);
                var7.field4686.method2820(100, arg0);
                class602.method3388(var7, (byte) 28);
                break;
            }
        }
        if (arg1 != 1) {
            field2435 = -78;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Loh;")
    public final class370 method640(int arg0) {
        field2436++;
        if (arg0 != 58) {
            method1176((byte) 122, -10, 81);
        }
        return class659.field9161;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lor;Lma;IIIIIIIIIIIIII)V")
    public class167(class594 arg0, class12 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field2440 = arg15;
    }
}

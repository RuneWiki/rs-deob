import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class397 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lub;")
    public static class15 field5583 = new class15(50);

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "[I")
    public static int[] field5590 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "J")
    public static long field5589 = 0L;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Lsm;")
    public static class156 field5588;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2490(int arg0) {
        field5585++;
        for (int var1 = 0; var1 < class320.field4692.length; var1++) {
            for (int var2 = 0; var2 < class320.field4692[0].length; var2++) {
                for (int var3 = 0; var3 < class320.field4692[0][0].length; var3++) {
                    class320.field4692[var1][var2][var3] = 0;
                }
            }
        }
        if (arg0 != 1) {
            method2495(-80, 0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIBI)V", line = 40)
    public static final void method2491(int arg0, int arg1, byte arg2, int arg3) {
        class378.field5385 = arg0;
        class209.field2987 = arg3;
        int var4 = -72 / ((arg2 + 4) / 45);
        field5582++;
        class260.field3849 = arg1;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BII)V", line = 52)
    public static final void method2492(byte arg0, int arg1, int arg2) {
        field5587++;
        if (class410.field5886 != arg1) {
            class9.field124 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class9.field124[var3] = (var3 << 12) / arg1;
            }
            class84.field1067 = arg1 - 1;
            class370.field5259 = arg1 * 32;
            class410.field5886 = arg1;
        }
        int var4 = -55 % ((arg0 - 40) / 45);
        if (class440.field6297 == arg2) {
            return;
        }
        if (class410.field5886 == arg2) {
            class86.field1123 = class9.field124;
        } else {
            class86.field1123 = new int[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                class86.field1123[var5] = (var5 << 12) / arg2;
            }
        }
        class440.field6297 = arg2;
        class169.field2395 = arg2 - 1;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 98)
    public static void method2493(int arg0) {
        field5588 = null;
        int var1 = 19 % ((67 - arg0) / 58);
        field5590 = null;
        field5583 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZI)V", line = 117)
    public static final void method2494(int arg0, boolean arg1, int arg2) {
        field5584++;
        int var3 = class181.field2555.field4595[0];
        int var4 = class181.field2555.field4601[0];
        if (class317.field4656 == 1) {
            if (class452.method2815(var4, arg2, 1, var3, 1, 0, false, (byte) -11, -2, 0, arg0)) {
                return;
            }
            class452.method2815(var4, arg2, 1, var3, 1, 0, false, (byte) -11, -3, 0, arg0);
        } else if (class452.method2815(var4, arg2, 1, var3, 1, 0, false, (byte) -11, -3, 0, arg0)) {
            return;
        } else {
            class452.method2815(var4, arg2, 1, var3, 1, 0, false, (byte) -11, -2, 0, arg0);
        }
        if (!arg1) {
            field5589 = -80L;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)I", line = 149)
    public static final int method2495(int arg0, int arg1) {
        field5586++;
        return arg0 == 1799 ? arg1 & 0x7F : -53;
    }
}

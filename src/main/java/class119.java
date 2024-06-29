import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class119 extends class311 {

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Ljm;")
    public class162 field1805 = new class162();

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Z")
    public static boolean field1806 = false;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
    public static boolean field1807 = false;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Z")
    public static boolean field1814 = true;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1816 = null;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "[I")
    public static int[] field1810;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)I", line = 4)
    public static final int method925(int arg0, int arg1) {
        if (arg0 == 209268044) {
            field1808++;
            return arg1 >>> 8;
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 15)
    public static final void method926(int arg0, int arg1, int arg2) {
        if (class303.field4135 != arg1) {
            class332.field4478 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class332.field4478[var3] = (var3 << 12) / arg1;
            }
            class362.field4991 = arg1 * 32;
            class65.field898 = arg1 - 1;
            class303.field4135 = arg1;
        }
        field1813++;
        if (arg2 != 209268044) {
            field1815 = -26;
        }
        if (class423.field5866 == arg0) {
            return;
        }
        if (class303.field4135 == arg0) {
            class409.field5711 = class332.field4478;
        } else {
            class409.field5711 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class409.field5711[var4] = (var4 << 12) / arg0;
            }
        }
        class423.field5866 = arg0;
        class174.field2484 = arg0 - 1;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 67)
    public static void method927(int arg0) {
        field1816 = null;
        if (arg0 != -24788) {
            method930(-25, false, -28);
        }
        field1810 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 93)
    public static final String method928(String arg0, boolean arg1) {
        if (arg1) {
            method926(-45, 91, -1);
        }
        field1809++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class416.method2570(var6, 32021);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZZ)V", line = 149)
    public static final void method929(int arg0, boolean arg1, boolean arg2) {
        field1811++;
        if (arg0 == 0) {
            class354.field4765 = class58.method452(class104.field1447, class122.field1839, class353.field4745 * 2, (byte) 54, arg0, class122.field1846);
        } else {
            if (arg1) {
                class354.field4765 = class58.method452(class104.field1447, class122.field1839, 0, (byte) 54, 0, class122.field1846);
                class354.field4765.method183(0);
                class389 var3 = class1.method1(256, class170.field2406, 0, class366.field5083);
                class61 var4 = class354.field4765.method262(var3, class96.method748(class112.field1726, class366.field5083, 0), true);
                class405.method2502(1, true, var4, class326.field4432.method2313((byte) -68, class445.field6241));
                class354.field4765.method169();
                class72.method566((byte) -125);
                class354.field4765.method449((byte) -74);
            }
            try {
                class354.field4765 = class58.method452(class104.field1447, class122.field1839, class353.field4745 * 2, (byte) 54, arg0, class122.field1846);
            } catch (Throwable var7) {
                class354.field4765 = class58.method452(class104.field1447, class122.field1839, 0, (byte) 54, 0, class122.field1846);
                arg0 = 0;
            }
        }
        if (class354.field4765.method241()) {
            class341 var5 = class354.field4765.method236(134217728);
            class354.field4765.method231(var5);
        }
        class22.field284 = arg0;
        class233.method1530((byte) 104);
        if (!class354.field4765.method186()) {
            class141.field2068 = 1;
        }
        class354.field4765.method265(class141.field2068);
        class354.field4765.method181(0);
        class406.field5619 = class354.field4765.method220();
        if (!arg2) {
            method926(-10, 85, 103);
        }
        class130.field1957 = class354.field4765.method220();
        int var6 = (int) ((double) class11.field107 * 34.46D);
        if (class354.field4765.method216()) {
            var6 += 128;
        }
        class354.field4765.method238(50, var6);
        class354.field4765.method207(!class215.field3009);
        if (class354.field4765.method263()) {
            class350.method2116(5, class415.field5752);
        }
        class416.field5766 = !class397.method2461(-27);
        class227.method1485(class264.field3620 >> 3, class11.field107 >> 3, class354.field4765, (byte) 73);
        class453.method2823(0);
        class404.field5589 = false;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 227)
    public static final String method930(int arg0, boolean arg1, int arg2) {
        field1812++;
        if (arg2 != 1458) {
            method927(12);
        }
        return arg1 && arg0 >= 0 ? class109.method839(arg0, 10, arg1, 48) : Integer.toString(arg0);
    }
}

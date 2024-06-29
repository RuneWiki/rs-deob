import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class199 extends class223 {

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public int field2907 = 0;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public int field2904 = -1;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lsl;")
    public static class318 field2908 = new class318(48, 1);

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Lsl;")
    public static class318 field2913 = new class318(79, -1);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "[[I")
    public static int[][] field2917;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method1399(int arg0) {
        if (arg0 != -1) {
            method1401(-60, (byte) 0, null);
        }
        field2916++;
        class292.method1851();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
    public static final boolean method1400(int arg0, int arg1, int arg2) {
        int var3 = 9 / ((62 - arg2) / 58);
        field2915++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBLr;)V")
    public static final void method1401(int arg0, byte arg1, class121 arg2) {
        field2906++;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field1692 > class263.field3867) {
            class335.method2047(arg2, 24068);
        } else if (arg2.field1698 >= class263.field3867) {
            class182.method1289(arg2, arg1 ^ 0xFFFFFF76);
        } else {
            class391.method2399(-81, false, arg2);
            var4 = class369.field5488;
            var3 = class247.field3665;
        }
        if (arg2.field6335 < 128 || arg2.field6334 < 128 || arg2.field6335 >= class397.field5828 * 128 - 128 || (class457.field6713 * 128 - 128) <= arg2.field6334) {
            var4 = 0;
            arg2.field1698 = 0;
            var3 = -1;
            arg2.field1692 = 0;
            arg2.field1728 = -1;
            arg2.field1707 = -1;
            arg2.field1696 = -1;
            arg2.field6335 = arg2.field1777[0] * 128 + arg2.method963((byte) 127) * 64;
            arg2.field6334 = arg2.field1778[0] * 128 + arg2.method963((byte) 127) * 64;
            arg2.method954(arg1 ^ 0xFFFFEA63);
        }
        if (class435.field6375 == arg2 && (arg2.field6335 < 1536 || arg2.field6334 < 1536 || (class397.field5828 * 128 - 1536) <= arg2.field6335 || (class457.field6713 - 12) * 128 <= arg2.field6334)) {
            var3 = -1;
            arg2.field1728 = -1;
            arg2.field1696 = -1;
            var4 = 0;
            arg2.field1698 = 0;
            arg2.field1692 = 0;
            arg2.field1707 = -1;
            arg2.field6335 = arg2.field1777[0] * 128 + arg2.method963((byte) 127) * 64;
            arg2.field6334 = arg2.field1778[0] * 128 + (arg2.method963((byte) 127) * 64);
            arg2.method954(arg1 ^ 0xFFFFEA63);
        }
        int var5 = class94.method823((byte) -17, arg2);
        if (arg1 == -10) {
            class394.method2414(arg2, var3, var4, var5, -119);
            class165.method1168(arg2, -121);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
    public static void method1402(byte arg0) {
        if (arg0 != 58) {
            field2917 = null;
        }
        field2917 = null;
        field2908 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1403(int arg0, long arg1) {
        field2903++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else if (arg0 <= 91) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class256.field3752[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }
}

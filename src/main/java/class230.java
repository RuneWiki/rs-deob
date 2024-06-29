import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class230 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "[I")
    public static int[] field3482 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "J")
    public static long field3484;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lnk;")
    public static class16 field3486;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 5)
    public static void method1594(byte arg0) {
        field3486 = null;
        field3482 = null;
        if (arg0 >= -46) {
            field3482 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 17)
    public static final void method1595(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field3488++;
        class323 var5 = class291.method2078(arg1, arg4, 0);
        if (var5 == null) {
            return;
        }
        if (var5.field5137 != null) {
            class185 var6 = new class185();
            var6.field2786 = arg0;
            var6.field2789 = var5.field5137;
            var6.field2793 = var5;
            var6.field2779 = arg2;
            class208.method1456(-7155, var6);
        }
        if (arg3 != -5568) {
            field3486 = (class16) null;
        }
        boolean var7 = true;
        if (var5.field5182 > 0) {
            var7 = class253.method1792(var5, 126);
        }
        if (!var7 || !client.method2013(var5).method483(arg0 - 1, -4150)) {
            return;
        }
        if (arg0 == 1) {
            class344.field5452++;
            class328.field5282.method304(215, 19830);
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, -2);
        }
        if (arg0 == 2) {
            class328.field5282.method304(77, 19830);
            class95.field1304++;
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, arg3 + 5566);
        }
        if (arg0 == 3) {
            class328.field5282.method304(63, 19830);
            class246.field3868++;
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, arg3 + 5566);
        }
        if (arg0 == 4) {
            class328.field5282.method304(33, arg3 ^ 0xFFFFA736);
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, arg3 ^ 0x15BE);
            class4.field44++;
        }
        if (arg0 == 5) {
            class328.field5282.method304(89, 19830);
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, -2);
            class176.field2670++;
        }
        if (arg0 == 6) {
            class328.field5282.method304(99, 19830);
            class328.field5282.method1052(arg1, false);
            class36.field422++;
            class328.field5282.method1003(arg4, -2);
        }
        if (arg0 == 7) {
            class328.field5282.method304(107, 19830);
            class85.field1110++;
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, -2);
        }
        if (arg0 == 8) {
            class110.field1508++;
            class328.field5282.method304(82, 19830);
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, arg3 + 5566);
        }
        if (arg0 == 9) {
            class210.field3162++;
            class328.field5282.method304(83, 19830);
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, -2);
        }
        if (arg0 == 10) {
            class353.field5627++;
            class328.field5282.method304(79, 19830);
            class328.field5282.method1052(arg1, false);
            class328.field5282.method1003(arg4, -2);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I", line = 144)
    public static final int method1596(int arg0, int arg1) {
        if (arg1 != -8) {
            method1594((byte) -108);
        }
        field3489++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 179)
    public static final String method1597(long arg0, byte arg1) {
        field3487++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            int var4 = -44 % ((arg1 - 6) / 53);
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class128.field1868[(int) (var8 - (arg0 * 37L))]);
            }
            return var7.reverse().toString();
        }
    }
}

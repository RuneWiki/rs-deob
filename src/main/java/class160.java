import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class160 {

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[Z")
    public static boolean[] field2276 = new boolean[100];

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
    public static boolean field2272 = true;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[I")
    public static int[] field2279 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lij;")
    public static class316 field2273;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
    public static int[] field2277;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field2277 = null;
        field2276 = null;
        field2273 = null;
        field2279 = null;
        if (arg0 < 35) {
            method1157((String) null, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Lg;")
    public static final class435 method1156(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2269++;
        if (arg0 != 7228) {
            field2279 = null;
        }
        class435 var5 = new class435();
        var5.field6140 = arg2;
        var5.field6146 = arg1;
        class171.field2415.method835(4, var5, (long) arg3);
        class436.method2683(arg1, (byte) -75);
        class108 var6 = class157.method1139(arg3, false);
        if (var6 != null) {
            class298.method1821((byte) -78, var6);
        }
        if (class50.field640 != null) {
            class298.method1821((byte) -87, class50.field640);
            class50.field640 = null;
        }
        class149.method1109(0);
        if (var6 != null) {
            class6.method40(!arg4, var6, false);
        }
        if (!arg4) {
            class172.method1232(arg1);
        }
        if (!arg4 && class350.field4712 != -1) {
            class282.method1769(0, 1, class350.field4712);
        }
        return var5;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1157(String arg0, byte arg1) {
        field2280++;
        if (arg1 >= -115) {
            method1155(-73);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZBILij;Lij;)V")
    public static final void method1158(boolean arg0, byte arg1, int arg2, class316 arg3, class316 arg4) {
        field2271++;
        class409.field5702 = arg3;
        class141.field2071 = arg0;
        class393.field5456 = arg4;
        class106.field1492 = arg2;
        int var5 = class409.field5702.method1933(0) - 1;
        class104.field1436 = class409.field5702.method1934((byte) 28, var5) + var5 * 256;
        class194.field2803 = new String[] { null, null, class189.field2724.method2313((byte) -82, class106.field1492), null, null };
        class19.field255 = new String[] { null, null, null, null, class266.field3660.method2313((byte) -106, class106.field1492) };
        int var6 = 81 % ((arg1 - 28) / 47);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)I")
    public static final int method1159(byte arg0, int arg1, int arg2) {
        field2274++;
        int var3 = -30 / ((arg0 + 40) / 62);
        return arg1 == 4 || arg1 == 5 ? class91.field1279[arg2 & 0x3] : 256;
    }
}

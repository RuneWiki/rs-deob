import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class428 {

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Lbc;")
    public static class225 field5789 = new class225("", 17);

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field5790 = 0;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field5792 = 64;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field5791 = 0;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I", line = 4)
    public static final int method2519(int arg0, int arg1, int arg2) {
        field5786++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg0 != 0) {
            method2520(-115);
        }
        return (var5 & 0x7FB9B08) >> 19;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 21)
    public static final void method2520(int arg0) {
        field5787++;
        if (class196.field2674 == -1) {
            return;
        }
        int var1 = 22 % ((arg0 + 86) / 39);
        int var2 = class34.field523.method1916((byte) -21);
        int var3 = class34.field523.method1925(50);
        if (class187.field2569 != null) {
            var2 = class187.field2569.method1551(128);
            var3 = class187.field2569.method1549((byte) 108);
        }
        class203.method1158(0, class72.field986, class424.field5738, 0, 0, var2, class196.field2674, (byte) 126, var3, 0);
        if (class181.field2492 != null) {
            class413.method2475((byte) 99, var2, var3);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 53)
    public static final void method2521(String arg0, boolean arg1, byte arg2) {
        field5785++;
        if (arg0 == null) {
            return;
        }
        if (class65.field865 >= 100) {
            class78.method514(0, class302.field4029.method1176(class110.field1676, (byte) -111));
            return;
        }
        String var3 = class92.method589(116, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class65.field865; var4++) {
            String var9 = class92.method589(79, class34.field524[var4]);
            if (var9 != null && var9.equals(var3)) {
                class78.method514(0, arg0 + class160.field2204.method1176(class110.field1676, (byte) -95));
                return;
            }
            if (class31.field424[var4] != null) {
                String var10 = class92.method589(77, class31.field424[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class78.method514(0, arg0 + class160.field2204.method1176(class110.field1676, (byte) -108));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class90.field1317; var5++) {
            String var7 = class92.method589(84, class233.field3106[var5]);
            if (var7 != null && var7.equals(var3)) {
                class78.method514(0, class384.field5311.method1176(class110.field1676, (byte) -92) + arg0 + class33.field501.method1176(class110.field1676, (byte) -123));
                return;
            }
            if (class405.field5554[var5] != null) {
                String var8 = class92.method589(34, class405.field5554[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class78.method514(0, class384.field5311.method1176(class110.field1676, (byte) -91) + arg0 + class33.field501.method1176(class110.field1676, (byte) -121));
                    return;
                }
            }
        }
        int var6 = -30 / ((-arg2 - 5) / 47);
        if (class92.method589(96, class233.field3103.field6742).equals(var3)) {
            class78.method514(0, class68.field918.method1176(class110.field1676, (byte) -88));
            return;
        }
        class130.field1923++;
        class491.method2861(class16.field226, 1);
        class203.field2751.method228(class231.method1292((byte) 3, arg0) + 1, 32);
        class203.field2751.method208(arg0, -127);
        class203.field2751.method228(arg1 ? 1 : 0, 32);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 147)
    public static final void method2522(int arg0) {
        class455.field6170 = 0;
        int var1 = -49 / ((arg0 - 16) / 49);
        class124.field1817 = -1;
        field5788++;
        class345.field4761 = -1;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 161)
    public static void method2523(byte arg0) {
        int var1 = -49 / ((45 - arg0) / 54);
        field5789 = null;
    }
}

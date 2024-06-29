import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class180 extends class601 {

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "Lkr;")
    public static class602 field2477 = new class602(73, 6);

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I", line = 3)
    public final int method45(int arg0) {
        ++field2479;
        if (arg0 != 8976) {
            field2477 = null;
        }
        return 127;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 15)
    public static final void method1139(byte arg0, String arg1) {
        ++field2474;
        if (class160.field2235 && (24 & class623.field8403) != 0) {
            boolean var2 = false;
            int var3 = class209.field2736;
            int[] var4 = class344.field4898;
            int var5 = 0;
            if (arg0 >= 10) {
                while (~var3 < ~var5) {
                    class96 var6 = class251.field3675[var4[var5]];
                    if (var6.field1313 != null && var6.field1313.equalsIgnoreCase(arg1) && (class388.field5601 == var6 && (class623.field8403 & 16) != 0 || var6 != null && ~(class623.field8403 & 8) != -1)) {
                        ++class713.field9961;
                        class583 var7 = class54.method400(class213.field2800, (byte) 114, class449.field6211);
                        var7.field7963.method465(0, (byte) 83);
                        var7.field7963.method453(var4[var5], (byte) 66);
                        var7.field7963.method492(-2, class209.field2732);
                        var7.field7963.method453(class442.field6137, (byte) -76);
                        var7.field7963.method509(class401.field5748, 1470420840);
                        class463.method2838(var7, (byte) 125);
                        var2 = true;
                        class21.method112(var6.field7197[0], true, 1, var6.field7198[0], 0, var6.method662((byte) 15), var6.method662((byte) 15), 0, -2);
                        break;
                    }
                    ++var5;
                }
                if (!var2) {
                    class75.method566(4, true, class155.field2140.method978(class120.field1576, (byte) -122) + arg1);
                }
                if (class160.field2235) {
                    class594.method3413((byte) 86);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(ILqea;)V", line = 73)
    public class180(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V", line = 76)
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = 50 / ((22 - arg0) / 34);
        ++field2478;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)I", line = 86)
    public final int method1140(int arg0) {
        if (arg0 != 0) {
            return 53;
        } else {
            ++field2476;
            return super.field8131;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lqea;)V", line = 103)
    public class180(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 108)
    public static void method1141(int arg0) {
        field2477 = null;
        if (arg0 != 73) {
            field2480 = 109;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 121)
    public final void method41(byte arg0) {
        ++field2475;
        if (~super.field8131 > -1 && super.field8131 > 127) {
            super.field8131 = this.method45(8976);
        }
        int var2 = -80 % ((59 - arg0) / 33);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I", line = 134)
    public final int method36(int arg0, byte arg1) {
        ++field2473;
        if (arg1 != 22) {
            this.method36(-96, (byte) -121);
        }
        return 1;
    }
}

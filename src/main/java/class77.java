import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class77 {

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Lnea;")
    public static class664 field1331 = new class664(69, 0);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "Lq;")
    public class391 field1332;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Lin;")
    public class77 field1323;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBZII)V", line = 4)
    public static final void method708(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        if (class328.field4859 == 0) {
            class8.method44(false, (byte) -125);
        } else {
            class457.field6544 = class328.field4859;
            class33.method363(arg1 - 30047, 0);
        }
        field1322++;
        class120.field1824 = arg0;
        class120.field1825 = arg2;
        if (arg1 == -5) {
            class491.field6980 = arg4;
            class25.method292(arg3);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 34)
    public static final void method709(int arg0) {
        if (arg0 != 8) {
            method709(92);
        }
        field1336++;
        if (class179.field2549 != null) {
            class179.field2549.method1154(false);
            class287.field4279 = null;
            class179.field2549 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 54)
    public static void method710(int arg0) {
        if (arg0 != 15147) {
            field1335 = 33;
        }
        field1331 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z[[BLbd;)V", line = 66)
    public static final void method711(boolean arg0, byte[][] arg1, class56 arg2) {
        field1328++;
        if (!arg0) {
            method710(-56);
        }
        for (int var3 = 0; var3 < arg2.field4779; var3++) {
            class263.method1730(-1);
            for (int var4 = 0; var4 < (class199.field2812 >> 3); var4++) {
                for (int var5 = 0; var5 < class232.field3611 >> 3; var5++) {
                    int var6 = class188.field2713[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field4760 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class273.field4105.length; var12++) {
                                if (class273.field4105[var12] == var11 && arg1[var12] != null) {
                                    arg2.method607(var5 * 8, arg1[var12], var4 * 8, var3, 0, (var10 & 0x7) * 8, class282.field4228, (var9 & 0x7) * 8, class423.field6155, var8, var7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 138)
    public static final void method712(String arg0, int arg1) {
        field1329++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class563.method3220((byte) 55, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg1; var3 < class363.field5180; var3++) {
            String var4 = class98.field1547[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class563.method3220((byte) 122, var4);
            if (var5 != null && var5.equals(var2)) {
                class363.field5180--;
                for (int var6 = var3; var6 < class363.field5180; var6++) {
                    class98.field1547[var6] = class98.field1547[var6 + 1];
                    class172.field2443[var6] = class172.field2443[var6 + 1];
                    class484.field6879[var6] = class484.field6879[var6 + 1];
                    class591.field8280[var6] = class591.field8280[var6 + 1];
                    class42.field688[var6] = class42.field688[var6 + 1];
                }
                class491.field6954++;
                class264.field4013 = class363.field5184;
                class135 var7 = class688.method3794(class704.field9913, class583.field8198, (byte) 38);
                var7.field1978.method3853((byte) 51, class652.method3606(arg1 + 12351, arg0));
                var7.field1978.method3837(arg1 ^ 0x1006, arg0);
                class19.method223(var7, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Lcfa;", line = 199)
    public final class152 method713(boolean arg0) {
        if (!arg0) {
            method711(true, null, null);
        }
        field1325++;
        return class429.method2567(-3, this.field1326);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)Lin;", line = 213)
    public final class77 method714(int arg0, byte arg1) {
        if (arg1 >= -55) {
            method708(-123, (byte) 123, true, -86, 43);
        }
        field1324++;
        return new class77(this.field1326, arg0);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V", line = 223)
    public class77(int arg0, int arg1) {
        this.field1326 = arg0;
        this.field1333 = arg1;
    }
}

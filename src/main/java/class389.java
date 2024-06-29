import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class389 extends class42 {

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public int field5524;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field5522;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[S")
    public static short[] field5520 = new short[256];

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field5526 = 0;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Lbd;")
    public static class44 field5525 = new class44("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field5529 = 0;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lag;")
    public static class491 field5528;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method2349(boolean arg0) {
        field5525 = null;
        field5520 = null;
        if (!arg0) {
            method2351(null, 66);
        }
        field5528 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
    public static final void method2350(int arg0, int arg1, int arg2, int arg3) {
        field5527++;
        class275 var4 = class213.method1433((byte) 74, 9, arg0);
        var4.method1778(0);
        var4.field4104 = arg3;
        var4.field4113 = arg2;
        if (arg1 != -15016) {
            method2351(null, -27);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
    public class389(int arg0, int arg1) {
        this.field5524 = arg0;
        this.field5522 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lqa;I)V")
    public static final void method2351(class167 arg0, int arg1) {
        field5523++;
        if (!(class430.field6184 >= 2 || class219.field3351) || class290.field4312 != null || arg1 != 16) {
            return;
        }
        String var2;
        if (class219.field3351 && class430.field6184 < 2) {
            var2 = class89.field1442 + class172.field2559.method426(class503.field7255, 51) + class503.field7268 + " ->";
        } else if (class65.field1106 && class218.field3339.method74(81, arg1 + 48) && class430.field6184 > 2) {
            var2 = class136.method991(112, (class341) class258.field3829.field1835.field859.field859);
        } else {
            class341 var3 = (class341) class258.field3829.field1835.field859;
            var2 = class136.method991(114, var3);
            int[] var4 = null;
            if (class303.method1937(arg1 - 16, var3.field5039)) {
                var4 = class58.field1052.method1646(21708, (int) var3.field5037).field1799;
            } else if (var3.field5035 != -1) {
                var4 = class58.field1052.method1646(arg1 + 21692, var3.field5035).field1799;
            } else if (class15.method85(var3.field5039, -20)) {
                class193 var5 = (class193) class390.field5539.method2284(true, (long) ((int) var3.field5037));
                if (var5 != null) {
                    class279 var6 = var5.field2805;
                    class311 var7 = var6.field4157;
                    if (var7.field4631 != null) {
                        var7 = var7.method1972(class84.field1335, (byte) -105);
                    }
                    if (var7 != null) {
                        var4 = var7.field4582;
                    }
                }
            } else if (class116.method833(var3.field5039, (byte) 109)) {
                Object var8 = null;
                class261 var9;
                if (var3.field5039 == 1007) {
                    var9 = class277.field4139.method569((byte) 123, (int) var3.field5037);
                } else {
                    var9 = class277.field4139.method569((byte) 87, (int) (var3.field5037 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field3926 != null) {
                    var9 = var9.method1679(class84.field1335, 1349439392);
                }
                if (var9 != null) {
                    var4 = var9.field3891;
                }
            }
            if (var4 != null) {
                var2 = var2 + class176.method1233(83, var4);
            }
        }
        if (class430.field6184 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class430.field6184 - 2) + class464.field6742.method426(class503.field7255, 41);
        }
        if (class154.field2347 != null) {
            class269 var11 = class154.field2347.method1349(arg0, -742);
            if (var11 == null) {
                var11 = class270.field4072;
            }
            var11.method1736(class154.field2347.field2910, class154.field2347.field3029, class154.field2347.field2988, class154.field2347.field3008, class484.field7021, class258.field3828, class175.field2613, class349.field5123, class385.field5500, var2, class7.field40, class182.field2684, class154.field2347.field2967, (byte) -117, class154.field2347.field2953);
            class251.method1626(class385.field5500[0], class385.field5500[2], 0, class385.field5500[3], class385.field5500[1]);
        } else if (class212.field3192 != null && client.field3115 == class14.field163) {
            int var10 = class270.field4072.method1744(var2, class491.field7073 + 4, class484.field7021, 0, class7.field40, 16777215, class511.field7426 + 16, class349.field5123, arg1 + 19265, class175.field2613);
            class251.method1626(class491.field7073 + 4, class425.field6028.method875(var2, (byte) 5) + var10, 0, 16, class511.field7426);
            return;
        }
    }
}

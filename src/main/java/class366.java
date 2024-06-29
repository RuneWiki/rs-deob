import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class366 {

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Lhn;")
    public static class509 field5391 = new class509(85, 16);

    @OriginalMember(owner = "client!um", name = "e", descriptor = "J")
    public static long field5392 = 0L;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "F")
    public static float field5395;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[Ll;")
    public static class16[] field5393;

    static {
        new class234("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLod;Ljava/awt/Frame;)V", line = 5)
    public static final void method2289(byte arg0, class352 arg1, Frame arg2) {
        field5389++;
        if (arg0 < 41) {
            field5391 = null;
        }
        while (true) {
            class449 var3 = arg1.method2204(arg2, -12949);
            while (var3.field6570 == 0) {
                class434.method2690(10, 10L);
            }
            if (var3.field6570 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class434.method2690(10, 100L);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIII)V", line = 32)
    public static final void method2290(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5388++;
        if (!arg1 && class136.field2073 == arg0 && class517.field7520 == arg2 && class61.field726 == class154.field2286 || class193.field3258.method938(class96.field1384, -103)) {
            return;
        }
        class517.field7520 = arg2;
        class136.field2073 = arg0;
        class61.field726 = class154.field2286;
        if (class193.field3258.method938(class96.field1384, -75)) {
            class61.field726 = 0;
        }
        class74.method643(arg3, (byte) -90);
        class258.method1730(true, class59.field709.method1635(class224.field3673, (byte) 123), true, class313.field4722);
        int var5 = class390.field5842;
        int var6 = class176.field2613;
        class390.field5842 = (class136.field2073 - (class69.field976 >> 4)) * arg4;
        class176.field2613 = (class517.field7520 - (class285.field4328 >> 4)) * 8;
        class407.field6063 = class7.method45(class136.field2073 * 8, class517.field7520 * 8);
        class130.field1992 = null;
        int var7 = class390.field5842 - var5;
        int var8 = class176.field2613 - var6;
        if (arg3 == 10) {
            for (int var9 = 0; var9 < 32768; var9++) {
                class116 var10 = class153.field2265[var9];
                if (var10 != null) {
                    for (int var11 = 0; var11 < 10; var11++) {
                        var10.field1978[var11] -= var7;
                        var10.field1976[var11] -= var8;
                    }
                    var10.field5833 -= var8 * 128;
                    var10.field5837 -= var7 * 128;
                }
            }
        } else {
            class167.field2471 = 0;
            int var12 = class69.field976 * 128 - 128;
            int var13 = class285.field4328 * 128 - 128;
            for (int var14 = 0; var14 < 32768; var14++) {
                class116 var22 = class153.field2265[var14];
                if (var22 != null) {
                    var22.field5833 -= var8 * 128;
                    var22.field5837 -= var7 * 128;
                    if (var22.field5837 >= 0 && var22.field5837 <= var12 && var22.field5833 >= 0 && var22.field5833 <= var13) {
                        boolean var23 = true;
                        for (int var24 = 0; var24 < 10; var24++) {
                            var22.field1978[var24] -= var7;
                            var22.field1976[var24] -= var8;
                            if (var22.field1978[var24] < 0 || var22.field1978[var24] >= class69.field976 || var22.field1976[var24] < 0 || class285.field4328 <= var22.field1976[var24]) {
                                var23 = false;
                            }
                        }
                        if (var23) {
                            class470.field6797[class167.field2471++] = var14;
                        } else {
                            class153.field2265[var14].method877(null, 28766);
                            class153.field2265[var14] = null;
                        }
                    } else {
                        class153.field2265[var14].method877(null, 28766);
                        class153.field2265[var14] = null;
                    }
                }
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class177 var20 = class26.field319[var15];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field1978[var21] -= var7;
                    var20.field1976[var21] -= var8;
                }
                var20.field5833 -= var8 * 128;
                var20.field5837 -= var7 * 128;
            }
        }
        class109[] var16 = class303.field4580;
        for (int var17 = 0; var17 < var16.length; var17++) {
            class109 var19 = var16[var17];
            if (var19 != null) {
                var19.field1517 -= var7 * 128;
                var19.field1524 -= var8 * 128;
            }
        }
        class469.method2831(var8, var7, 29826);
        for (class155 var18 = (class155) class483.field6941.method1004((byte) -127); var18 != null; var18 = (class155) class483.field6941.method996(1)) {
            var18.field2306 -= var7;
            var18.field2302 -= var8;
            if (class265.field4073 != 3 && (var18.field2306 < 0 || var18.field2302 < 0 || class69.field976 <= var18.field2306 || class285.field4328 <= var18.field2302)) {
                var18.method2677(-22491);
            }
        }
        if (class114.field1692 != 0) {
            class523.field7652 -= var8;
            class114.field1692 -= var7;
        }
        class359.method2253(0);
        if (arg3 != 10) {
            class199.field3323 -= var7;
            class71.field1024 -= var8 * 128;
            class412.field6180 -= var7 * 128;
            class273.field4188 -= var8;
            class121.field1828 -= var7;
            class299.field4545 -= var8;
            if (Math.abs(var7) > class69.field976 || Math.abs(var8) > class285.field4328) {
                class245.method1666(arg4 ^ 0x8);
            }
        } else if (class176.field2611 == 4) {
            class476.field6868 -= var8 * 128;
            class380.field5738 -= var7 * 128;
            class468.field6767 -= var8 * 128;
            class222.field3637 -= var7 * 128;
        } else {
            class176.field2611 = 1;
        }
        class134.method980(25);
        class77.method668(false);
        class100.field1431.method993(113);
        class409.field6101.method993(122);
        class316.field4776.method1959(arg4 - 8);
        class234.method1636(113);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 261)
    public static void method2291(int arg0) {
        field5391 = null;
        field5393 = null;
        if (arg0 != 0) {
            field5395 = 0.09919439F;
        }
    }
}

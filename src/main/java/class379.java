import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class379 extends class539 {

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "S")
    public short field5339;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field5341 = 2;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field5342 = 0;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLfaa;Loa;)V")
    public static final void method2195(byte arg0, class140 arg1, class638 arg2) {
        field5343++;
        boolean var3 = class648.field9184.method3050(arg1.field2053 ? class253.field3576.field3989 : null, arg1.field2014, 64, arg2, arg1.field2118, arg1.field1969, arg1.field2038 | 0xFF000000, arg1.field2065) == null;
        if (var3) {
            class539.field7307.method1273(new class284(arg1.field1969, arg1.field2065, arg1.field2014, arg1.field2038 | 0xFF000000, arg1.field2118, arg1.field2053), (byte) 122);
            class432.method2481(arg1, 101);
        }
        int var4 = -64 % ((arg0 - 65) / 60);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static final void method2196(int arg0) {
        if (class630.field8790 != null) {
            class91.field1210.method3683(arg0 + 14962);
            class223.method1427();
            class690.method3799(20445);
            class517.method2877(-2127751325);
            class174.method1195(arg0);
            class626.method3485((byte) -127);
            if (class127.field1765 != null) {
                class127.field1765.method2520(arg0 ^ 0x9EE);
            }
            class671.method3712((byte) -27);
            class658.method3646(arg0 + 14344);
            class477.method2715(0);
            class524.method2905(-13994);
            class212.method1390(64, false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class286 var5 = class495.field6821[var1];
                if (var5 != null) {
                    var5.field6486 = null;
                    for (int var6 = 0; var6 < var5.field6478.length; var6++) {
                        var5.field6478[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class679.field9578; var2++) {
                class225 var3 = class252.field3537[var2].field2634;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field6478.length; var4++) {
                        var3.field6478[var4] = null;
                    }
                }
            }
            class37.field500 = null;
            class75.field1040 = null;
            class630.field8790.method3554(true);
            class630.field8790 = null;
        }
        field5338++;
        if (arg0 != 0) {
            method2195((byte) 8, null, null);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([Lfaa;BI)V")
    public static final void method2197(class140[] arg0, byte arg1, int arg2) {
        if (arg1 > -60) {
            field5342 = 96;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class140 var4 = arg0[var3];
            if (var4 != null && var4.field2054 == arg2 && !client.method1658(var4)) {
                if (var4.field2023 == 0) {
                    method2197(arg0, (byte) -100, var4.field2100);
                    if (var4.field2043 != null) {
                        method2197(var4.field2043, (byte) -81, var4.field2100);
                    }
                    class198 var5 = (class198) class368.field5262.method2061(-17305, (long) var4.field2100);
                    if (var5 != null) {
                        class514.method2853(var5.field2922, -1);
                    }
                }
                if (var4.field2023 == 6 && var4.field1992 != -1) {
                    class131 var6 = class301.field4465.method2763(var4.field1992, 31696);
                    if (var6 != null) {
                        var4.field2110 += class371.field5290;
                        while (var6.field1810[var4.field1955] < var4.field2110) {
                            var4.field2110 -= var6.field1810[var4.field1955];
                            var4.field1955++;
                            if (var4.field1955 >= var6.field1806.length) {
                                var4.field1955 -= var6.field1800;
                                if (var4.field1955 < 0 || var6.field1806.length <= var4.field1955) {
                                    var4.field1955 = 0;
                                }
                            }
                            var4.field2001 = var4.field1955 + 1;
                            if (var4.field2001 >= var6.field1806.length) {
                                var4.field2001 -= var6.field1800;
                                if (var4.field2001 < 0 || var6.field1806.length <= var4.field2001) {
                                    var4.field2001 = -1;
                                }
                            }
                            class432.method2481(var4, 75);
                        }
                    }
                }
            }
        }
        field5337++;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
    public class379() {
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(S)V")
    public class379(short arg0) {
        this.field5339 = arg0;
    }
}

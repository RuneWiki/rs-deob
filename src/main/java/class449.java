import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class449 extends class583 {

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public int field6373 = 0;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Ljava/lang/String;")
    public static String field6370 = "";

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field6371 = 500;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "D")
    public static double field6367;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([Ljb;BI)V")
    public static final void method2688(class493[] arg0, byte arg1, int arg2) {
        field6374++;
        int var3 = 0;
        if (arg1 != -9) {
            field6370 = null;
        }
        while (arg0.length > var3) {
            class493 var4 = arg0[var3];
            if (var4 != null && var4.field7078 == arg2 && !client.method1947(var4)) {
                if (var4.field7016 == 0) {
                    method2688(arg0, (byte) -9, var4.field6956);
                    if (var4.field7009 != null) {
                        method2688(var4.field7009, (byte) -9, var4.field6956);
                    }
                    class47 var5 = (class47) class475.field6744.method1180((byte) 26, (long) var4.field6956);
                    if (var5 != null) {
                        class55.method359(var5.field550, -112);
                    }
                }
                if (var4.field7016 == 6 && var4.field6976 != -1) {
                    class709 var6 = class343.field4785.method3525(var4.field6976, (byte) -119);
                    if (var6 != null) {
                        var4.field6987 += class144.field2064;
                        int var7 = var4.field7024;
                        while (true) {
                            if (var4.field6987 <= var6.field9849[var4.field7024]) {
                                if (var4.field7024 != var7) {
                                    class469.method2803((byte) 115, var4.field7024, var6);
                                }
                                break;
                            }
                            var4.field6987 -= var6.field9849[var4.field7024];
                            var4.field7024++;
                            if (var4.field7024 >= var6.field9826.length) {
                                var4.field7024 -= var6.field9840;
                                if (var4.field7024 < 0 || var4.field7024 >= var6.field9826.length) {
                                    var4.field7024 = 0;
                                }
                            }
                            var4.field7030 = var4.field7024 + 1;
                            if (var4.field7030 >= var6.field9826.length) {
                                var4.field7030 -= var6.field9840;
                                if (var4.field7030 < 0 || var6.field9826.length <= var4.field7030) {
                                    var4.field7030 = -1;
                                }
                            }
                            class543.method3149(var4, 1);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILee;)V")
    public final void method2689(int arg0, class675 arg1) {
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                field6372++;
                if (arg0 != -15650) {
                    field6367 = 0.31228642064890216D;
                    return;
                }
                return;
            }
            this.method2690((byte) 63, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILee;)V")
    private final void method2690(byte arg0, int arg1, class675 arg2) {
        if (arg0 == 63) {
            if (arg1 == 2) {
                this.field6373 = arg2.method3757((byte) -65);
            }
            field6369++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
    public static void method2691(byte arg0) {
        field6370 = null;
        if (arg0 <= 34) {
            method2691((byte) -93);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILha;)V")
    public static final void method2692(int arg0, class58 arg1) {
        if (arg0 == 31885) {
            field6368++;
            if (class674.field9143 != class660.field9039.field1266 && class553.field7776 != null && class636.method3536(arg1, class660.field9039.field1266, 4)) {
                class674.field9143 = class660.field9039.field1266;
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class208 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lgj;")
    public static class381 field2959;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field2959 = null;
        if (arg0 < 38) {
            field2958 = -43;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    public static final void method1359(int arg0, boolean arg1) {
        if (arg1) {
            if (class248.field3548 != -1) {
                class292.method1936(class248.field3548, (byte) -122);
            }
            for (class167 var2 = (class167) class22.field280.method1884(0); var2 != null; var2 = (class167) class22.field280.method1890(arg0)) {
                if (!var2.method2598((byte) 35)) {
                    var2 = (class167) class22.field280.method1884(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class286.method1869(var2, true, false, (byte) 88);
            }
            class248.field3548 = -1;
            class22.field280 = new class288(8);
            class215.method1448((byte) 118);
            class248.field3548 = class204.field2929;
            class340.method2185(false, false);
            class406.method2593(false);
            class201.method1331(class248.field3548);
        }
        field2956++;
        class244.method1654(920);
        class297.field4161 = -1;
        class404.method2579(-1, class360.field5145);
        class384.field5422 = new class40();
        class384.field5422.field3284 = 6656;
        class384.field5422.field5677[0] = 52;
        class384.field5422.field3269 = 6656;
        class265.field3774 = 0;
        class334.field4730 = 0;
        class384.field5422.field5664[0] = 52;
        if (class129.field1568 == 2) {
            class334.field4730 = class160.field2105 << 7;
            class265.field3774 = class65.field745 << 7;
        } else {
            class382.method2457(arg0 + 127);
        }
        class223.method1495((byte) -73);
        if (~class334.field4730 == arg0 || class265.field3774 == 0) {
            class178.method1210(10, -117);
        } else {
            class418.method2654(13511);
            class178.method1210(28, 74);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILtq;)V")
    public static final void method1360(int arg0, class376 arg1) {
        field2957++;
        class186.field2699 = arg1;
        if (arg0 != -1) {
            method1360(-51, (class376) null);
        }
    }

    static {
        new class362("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field2958 = 0;
    }
}

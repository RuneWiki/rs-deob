import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class223 {

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "Ltm;")
    public static class334 field3616 = new class334(39, 6);

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IBIII)V")
    public static final void method1577(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3618++;
        if (arg4 == 8 || arg4 == 16) {
            for (int var6 = 0; var6 < class304.field4624; var6++) {
                class328 var7 = class258.field4045[var6];
                if (var7.field4850 == arg4 && var7.field4833 == arg2 && var7.field4846 == arg3 || var7.field4849 == arg2 && var7.field4846 == arg3) {
                    if (class304.field4624 != var6) {
                        class571.method3310(class258.field4045, var6 + 1, class258.field4045, var6, class258.field4045.length - var6 - 1);
                    }
                    class304.field4624--;
                    return;
                }
            }
        } else {
            class114 var5 = class488.field7062[arg0][arg2][arg3];
            if (var5 != null) {
                if (arg4 == 1) {
                    var5.field1765 = 0;
                } else if (arg4 == 2) {
                    var5.field1773 = 0;
                }
            }
            class344.method2205(-3639);
        }
        if (arg1 != -64) {
            field3616 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IC)Z")
    public static final boolean method1578(int arg0, char arg1) {
        if (arg0 != -30852) {
            field3616 = null;
        }
        field3620++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZ)V")
    public static final void method1579(int arg0, boolean arg1) {
        class654.field9289.method2292(72, arg0, class654.field9289.field5403);
        field3617++;
        class654.field9289.method2292(arg0 ^ 0xFFFFFFA1, 0, class654.field9289.field5453);
        class654.field9289.method2292(arg0 ^ 0x4C, 1, class654.field9289.field5444);
        class654.field9289.method2292(-123, 1, class654.field9289.field5404);
        class654.field9289.method2292(-98, 0, class654.field9289.field5433);
        class654.field9289.method2292(arg0 ^ 0xFFFFFFB9, 0, class654.field9289.field5436);
        class654.field9289.method2292(arg0 ^ 0xFFFFFFAC, 0, class654.field9289.field5427);
        class654.field9289.method2292(arg0 - 63, 0, class654.field9289.field5434);
        class654.field9289.method2292(-51, 0, class654.field9289.field5438);
        class654.field9289.method2292(115, 0, class654.field9289.field5445);
        class654.field9289.method2292(-96, 0, class654.field9289.field5431);
        class654.field9289.method2292(arg0 ^ 0x77, 0, class654.field9289.field5448);
        class654.field9289.method2292(109, 0, class654.field9289.field5447);
        class654.field9289.method2292(107, 0, class654.field9289.field5440);
        class654.field9289.method2292(77, 0, class654.field9289.field5412);
        class654.field9289.method2292(106, 0, class654.field9289.field5417);
        class654.field9289.method2292(-57, 0, class654.field9289.field5441);
        class654.field9289.method2292(-109, 0, class654.field9289.field5422);
        class654.field9289.method2292(67, 0, class654.field9289.field5429);
        class298.method1916(-125);
        class654.field9289.method2292(125, 2, class654.field9289.field5407);
        class654.field9289.method2292(-50, 1, class654.field9289.field5443);
        class710.method3930((byte) 63);
        class525.method3121(-11701);
        class515.field7466 = true;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
    public static void method1580(byte arg0) {
        if (arg0 <= 19) {
            method1580((byte) -49);
        }
        field3616 = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILofa;)V")
    public static final void method1581(int arg0, class301 arg1) {
        for (int var2 = 0; var2 < class7.field68; var2++) {
            int var3 = arg1.method1968((byte) 86);
            int var4 = arg1.method1989((byte) -49);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class155.field2403[var3] != null) {
                class155.field2403[var3].field4706 = var4;
            }
        }
        if (arg0 == -1) {
            field3619++;
        }
    }
}

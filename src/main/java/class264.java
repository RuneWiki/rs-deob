import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class264 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lha;")
    public static class63 field4629 = null;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field4627 = 0;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lr;")
    private static class66 field4628 = class93.method641(43, "Attack");

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lr;")
    public static class66 field4625 = field4628;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILr;)V")
    public static final void method1788(int arg0, int arg1, class66 arg2) {
        field4626++;
        class66 var3 = arg2.method472(99).method467(12688);
        boolean var4 = false;
        for (int var5 = arg0; var5 < client.field1650; var5++) {
            class45 var6 = class59.field988[class192.field3335[var5]];
            if (var6 != null && var6.field815 != null && var6.field815.method470(false, var3)) {
                var4 = true;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var6.field2086[0], false, 0, -3, 2, var6.field2039[0]);
                if (arg1 == 1) {
                    class208.field3609++;
                    class28.field412.method578(arg0 ^ 0x61, 160);
                    class28.field412.method1656(class192.field3335[var5], (byte) 38);
                } else if (arg1 == 4) {
                    class93.field1779++;
                    class28.field412.method578(-78, 253);
                    class28.field412.method1685((byte) 19, class192.field3335[var5]);
                } else if (arg1 == 6) {
                    class7.field69++;
                    class28.field412.method578(-64, 35);
                    class28.field412.method1685((byte) 19, class192.field3335[var5]);
                } else if (arg1 == 7) {
                    class28.field412.method578(-98, 93);
                    class28.field412.method1685((byte) 19, class192.field3335[var5]);
                    class54.field943++;
                }
                break;
            }
        }
        if (!var4) {
            class234.method1533(class85.field1679, -85, class212.method1372(2, new class66[] { class238.field4136, var3 }), 0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method1789(int arg0) {
        field4625 = null;
        if (arg0 >= 39) {
            field4628 = null;
            field4629 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class200 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Z")
    public boolean field3618 = true;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public int field3609;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Loh;")
    public static class263 field3612 = class253.method1681(-123, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lsi;")
    public static class194 field3616 = new class194(new byte[5000]);

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3621 = 0;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Ltf;")
    public static class104 field3623;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lfd;")
    public static class119 field3620;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lw;")
    public static class141 field3617;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)Loh;")
    public static final class263 method1388(int arg0, boolean arg1) {
        field3610++;
        if (arg1) {
            field3612 = null;
        }
        return class68.field1382[arg0].method1740(-127) <= 0 ? class156.field2811[arg0] : class124.method797(-121, new class263[] { class156.field2811[arg0], class277.field4856, class68.field1382[arg0] });
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLsi;I)Loh;")
    public static final class263 method1389(byte arg0, class194 arg1, int arg2) {
        field3619++;
        try {
            if (arg0 != -12) {
                field3621 = -63;
            }
            class263 var3 = new class263();
            var3.field4591 = arg1.method1311(-127);
            if (arg2 < var3.field4591) {
                var3.field4591 = arg2;
            }
            var3.field4605 = new byte[var3.field4591];
            arg1.field3497 += class24.field686.method1237(0, var3.field4605, var3.field4591, arg1.field3469, (byte) 44, arg1.field3497);
            return var3;
        } catch (Exception var4) {
            return class131.field2401;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)Z")
    public static final boolean method1390(byte arg0, int arg1) {
        if (arg0 != 37) {
            method1388(10, false);
        }
        field3607++;
        class130 var2 = class249.method1671(1824, arg1);
        if (var2 == null) {
            return false;
        } else if (class262.field4547 == 1 || class262.field4547 == 2 || class55.field1157 == 2) {
            byte[] var3 = var2.field2392.method1753(arg0 ^ 0xFFFFFFDA);
            class32.field793 = new String(var3, 0, var3.length);
            class7.field127 = var2.field2397;
            if (class55.field1157 != 0) {
                class245.field4323 = class7.field127 + 50000;
                class182.field3298 = class7.field127 + 40000;
                class118.field2201 = class182.field3298;
            }
            return true;
        } else {
            class263 var4 = class3.field62;
            if (class55.field1157 != 0) {
                var4 = class124.method797(-114, new class263[] { class23.field678, class136.method891(-77, var2.field2397 + 7000) });
            }
            class263 var5 = class3.field62;
            if (class276.field4835 != null) {
                var5 = class124.method797(-119, new class263[] { class38.field873, class276.field4835 });
            }
            class263 var6 = class124.method797(-59, new class263[] { class171.field3129, var2.field2392, var4, class248.field4328, class136.method891(-105, class17.field388), class50.field1083, class136.method891(-53, class271.field4789), var5, class79.field1600, class260.field4515 ? class127.field2363 : class243.field4289, class81.field1607, class1.field18 ? class127.field2363 : class243.field4289, class94.field1860, class191.field3433 ? class127.field2363 : class243.field4289 });
            try {
                class233.field4074.getAppletContext().showDocument(var6.method1752(false), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1391(byte arg0) {
        field3617 = null;
        field3623 = null;
        field3612 = null;
        field3616 = null;
        int var1 = 88 % ((-arg0 - 62) / 61);
        field3620 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lue;IIIIZI)V")
    public static final void method1392(class86 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class84.field1667 = arg2;
        class81.field1611 = arg5;
        class181.field3294 = arg4;
        if (arg1 <= 29) {
            return;
        }
        class71.field1431 = arg0;
        class139.field2561 = arg6;
        class177.field3242 = 1;
        class119.field2219 = arg3;
        field3614++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public static final void method1393(int arg0, int arg1) {
        if (arg0 > -27) {
            field3624 = 65;
        }
        class64 var2 = class84.method563(4, arg1, 55);
        field3608++;
        var2.method393(-81);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3611 = arg0;
        this.field3613 = arg1;
        this.field3618 = arg6;
        this.field3606 = arg5;
        this.field3605 = arg3;
        this.field3604 = arg4;
        this.field3609 = arg2;
    }
}

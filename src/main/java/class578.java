import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class578 {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Led;")
    public static class115 field8241 = new class115();

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Lbv;")
    public static class567 field8247 = new class567("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public int field8242;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public int field8243;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public int field8244;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public int field8245;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Lgp;")
    public static class561 field8246;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 5)
    public static void method3303(byte arg0) {
        field8247 = null;
        field8246 = null;
        field8241 = null;
        if (arg0 != -50) {
            field8247 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)I", line = 21)
    public static final int method3304(int arg0, byte arg1) {
        field8240++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            if (arg1 != -60) {
                method3305(null, -59);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Loh;I)V", line = 56)
    public static final void method3305(class549 arg0, int arg1) {
        field8248++;
        if (!class90.field1620) {
            return;
        }
        if (arg1 > -54) {
            method3306(null, false, (byte) 103);
        }
        if (arg0.field7735 != null) {
            class549 var2 = class547.method3061(4096, class388.field5795, class293.field4224);
            if (var2 != null) {
                class526 var3 = new class526();
                var3.field7315 = arg0;
                var3.field7314 = arg0.field7735;
                var3.field7320 = var2;
                class30.method277(var3);
            }
        }
        class552.field7824++;
        class624.method3537(-97, class434.field6379);
        class127.field2088.method1702(arg0.field7734, false);
        class127.field2088.method1742(arg0.field7761, false);
        class127.field2088.method1718(-3, arg0.field7703);
        class127.field2088.method1703(1653774696, class293.field4224);
        class127.field2088.method1699(true, class388.field5795);
        class127.field2088.method1699(true, class68.field1296);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BZB)V", line = 101)
    public static final void method3306(byte[] arg0, boolean arg1, byte arg2) {
        if (class300.field4333 == null) {
            class300.field4333 = new class268(20000);
        }
        field8239++;
        class300.field4333.method1725(0, arg0.length, (byte) -12, arg0);
        if (arg1) {
            class582.method3333((byte) -93, class300.field4333.field3952);
            class445.field6493 = new class225[class10.field111];
            int var3 = 0;
            for (int var4 = class92.field1624; var4 <= class12.field129; var4++) {
                class225 var5 = class290.method1836((byte) 35, var4);
                if (var5 != null) {
                    class445.field6493[var3++] = var5;
                }
            }
            class88.field1595 = false;
            class41.field576 = class508.method2860(false);
            class300.field4333 = null;
        }
        if (arg2 < 110) {
            field8246 = null;
        }
    }
}

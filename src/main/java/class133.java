import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class133 {

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Ljr;")
    private class100 field1615;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lmr;")
    public static class133 field1606 = new class133(0, 3, class100.field1292);

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Lmr;")
    public static class133 field1611 = new class133(1, 3, class100.field1292);

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "Lmr;")
    public static class133 field1617 = new class133(2, 4, class100.field1288);

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "Lmr;")
    public static class133 field1618 = new class133(3, 1, class100.field1292);

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "Lmr;")
    public static class133 field1619 = new class133(4, 2, class100.field1292);

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Lmr;")
    public static class133 field1620 = new class133(5, 3, class100.field1292);

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Lmr;")
    private static class133 field1621 = new class133(6, 4, class100.field1292);

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1622 = class505.method2756(16, -65537);

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "Lvf;")
    public static class141 field1623 = new class141(4, 1, 1, 1);

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B[B)Z")
    public static final boolean method862(byte arg0, byte[] arg1) {
        field1607++;
        if (arg0 < 86) {
            method863((byte) 95);
        }
        class572 var2 = new class572(arg1);
        int var3 = var2.method3097((byte) 12);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3097((byte) 12) == 1;
        if (var4) {
            class234.method1411(var2, false);
        }
        class275.method1654(12782, var2);
        return true;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static final void method863(byte arg0) {
        class106.method748((byte) 5);
        field1609++;
        if (arg0 <= 15) {
            method864(-60);
        }
        class367.field4732 = null;
        class71.field919 = null;
        class337.field4165 = null;
        class37.field543 = null;
        class667.field9052 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)[Lmr;")
    public static final class133[] method864(int arg0) {
        if (arg0 != 17551) {
            method866(-17, -34, true, -123, null, 102);
        }
        field1616++;
        return new class133[] { field1606, field1611, field1617, field1618, field1619, field1620, field1621 };
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public static void method865(boolean arg0) {
        field1619 = null;
        field1617 = null;
        field1611 = null;
        field1618 = null;
        if (!arg0) {
            method866(-74, 48, true, 21, null, 101);
        }
        field1623 = null;
        field1621 = null;
        field1606 = null;
        field1620 = null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IILjr;)V")
    private class133(int arg0, int arg1, class100 arg2) {
        this.field1614 = arg0;
        this.field1610 = arg1;
        this.field1615 = arg2;
        this.field1608 = this.field1615.field1284 * this.field1610;
        if (this.field1614 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1613++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZI[Lrr;I)V")
    public static final void method866(int arg0, int arg1, boolean arg2, int arg3, class337[] arg4, int arg5) {
        field1612++;
        if (arg3 >= -82) {
            method862((byte) -45, null);
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class337 var7 = arg4[var6];
            if (var7 != null && var7.field4190 == arg5) {
                class72.method570(arg0, (byte) 109, arg2, arg1, var7);
                class89.method667(var7, arg1, arg0, (byte) -116);
                if (var7.field4300 > var7.field4181 - var7.field4309) {
                    var7.field4300 = var7.field4181 - var7.field4309;
                }
                if (var7.field4300 < 0) {
                    var7.field4300 = 0;
                }
                if (var7.field4208 > (var7.field4280 - var7.field4211)) {
                    var7.field4208 = var7.field4280 - var7.field4211;
                }
                if (var7.field4208 < 0) {
                    var7.field4208 = 0;
                }
                if (var7.field4212 == 0) {
                    class480.method2620(arg2, var7, -1);
                }
            }
        }
    }
}

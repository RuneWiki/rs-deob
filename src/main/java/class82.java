import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class82 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Llh;")
    private class114 field1593 = new class114();

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Luh;")
    private class146 field1604 = new class146();

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lsc;")
    private class56 field1606;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
    public static int[] field1597 = new int[128];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field1590 = 0;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field1599 = 0;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lia;")
    public static class257 field1600 = class28.method234(-115, "Standort");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lmb;")
    public static class178 field1594;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)V")
    public static final void method612(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class40.field834 = arg2;
        class145.field2540 = arg0;
        class255.field4371 = arg3;
        if (!arg4) {
            class123.field2211 = arg1;
            field1595++;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Ldh;")
    public final class30 method613(byte arg0) {
        field1601++;
        if (arg0 != 38) {
            this.method615(false, 33L);
        }
        return this.field1606.method428(false);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public final void method614(int arg0) {
        this.field1604.method989(-11937);
        this.field1606.method431(12747);
        field1602++;
        if (arg0 == 0) {
            this.field1593 = new class114();
            this.field1605 = this.field1607;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZJ)Llh;")
    public final class114 method615(boolean arg0, long arg1) {
        field1592++;
        class114 var4 = (class114) this.field1606.method434((byte) -93, arg1);
        if (var4 != null) {
            this.field1604.method985(var4, (byte) 27);
        }
        if (arg0) {
            this.method613((byte) -58);
        }
        return var4;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)Ldh;")
    public final class30 method616(byte arg0) {
        int var2 = -53 / ((arg0 + 29) / 45);
        field1598++;
        return this.field1606.method427((byte) 58);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBII)V")
    public static final void method617(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1603++;
        for (int var5 = 0; var5 < class44.field1030; var5++) {
            if ((client.field1519[var5] + class13.field242[var5]) > arg4 && arg1 + arg4 > client.field1519[var5] && arg0 < class11.field215[var5] + class197.field3327[var5] && class11.field215[var5] < arg0 + arg3) {
                class137.field2456[var5] = true;
            }
        }
        if (arg2 >= -81) {
            field1597 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static void method618(int arg0) {
        if (arg0 != 1) {
            field1600 = null;
        }
        field1597 = null;
        field1594 = null;
        field1600 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLlh;J)V")
    public final void method619(byte arg0, class114 arg1, long arg2) {
        if (this.field1605 == 0) {
            class114 var5 = this.field1604.method995(-1);
            var5.method254(1);
            var5.method815((byte) -105);
            if (this.field1593 == var5) {
                class114 var6 = this.field1604.method995(-1);
                var6.method254(1);
                var6.method815((byte) 120);
            }
        } else {
            this.field1605--;
        }
        field1591++;
        this.field1606.method424(arg1, (byte) -40, arg2);
        int var7 = 119 / ((-arg0 - 33) / 57);
        this.field1604.method985(arg1, (byte) 27);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([SI[Lia;)V")
    public static final void method620(short[] arg0, int arg1, class257[] arg2) {
        class30.method255(arg2.length - 1, arg1, false, arg2, arg0);
        field1596++;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I)V")
    public class82(int arg0) {
        this.field1607 = arg0;
        this.field1605 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1606 = new class56(var2);
    }
}

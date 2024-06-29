import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class94 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "S")
    public static short field1580 = 320;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    public static int[] field1582 = new int[128];

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lbe;")
    public static class283 field1581 = class153.method941(-58, "gleiten:");

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "S")
    public static short field1588 = 32767;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lbe;")
    public static class283 field1592 = class153.method941(8, "Abbrechen");

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "[I")
    public static int[] field1595 = new int[128];

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lbe;")
    public static class283 field1586 = class153.method941(-98, "rot:");

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Loh;")
    public static class15 field1578 = new class15(128);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lek;")
    public static class172 field1587;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 5)
    public static final void method602(int arg0) {
        field1583++;
        class103.field1740 = 0;
        class69.field1015 = 0;
        class217.method1432(true);
        class46.method274(2);
        class182.method1202((byte) 79);
        class295.method2003(false);
        if (arg0 != 915) {
            method606(20, 101, (byte) -88);
        }
        for (int var1 = 0; var1 < class103.field1740; var1++) {
            int var2 = class15.field170[var1];
            if (class75.field1309 != class149.field2436[var2].field1186) {
                if (class149.field2436[var2].field3282 > 0) {
                    class16.method90(class149.field2436[var2], 8735);
                }
                class149.field2436[var2] = null;
            }
        }
        if (class260.field4419 != class262.field4462.field3905) {
            throw new RuntimeException("gpp1 pos:" + class262.field4462.field3905 + " psize:" + class260.field4419);
        }
        for (int var3 = 0; var3 < class297.field5033; var3++) {
            if (class149.field2436[class162.field2666[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class297.field5033);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 62)
    public static void method603(int arg0) {
        field1587 = null;
        if (arg0 != 128) {
            field1588 = 100;
        }
        field1578 = null;
        field1586 = null;
        field1582 = null;
        field1581 = null;
        field1592 = null;
        field1595 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZILfe;)V", line = 112)
    private final void method604(boolean arg0, int arg1, class229 arg2) {
        if (arg0) {
            this.field1590 = 113;
        }
        if (arg1 == 1) {
            this.field1585 = arg2.method1496(true);
            this.field1590 = arg2.method1535((byte) 127);
            this.field1594 = arg2.method1535((byte) 107);
        }
        field1579++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lfe;I)V", line = 135)
    public final void method605(class229 arg0, int arg1) {
        int var3 = 123 / ((64 - arg1) / 54);
        while (true) {
            int var4 = arg0.method1535((byte) 73);
            if (var4 == 0) {
                field1591++;
                return;
            }
            this.method604(false, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V", line = 164)
    public static final void method606(int arg0, int arg1, byte arg2) {
        class228.field3831.method621(239, 8);
        class112.field1897++;
        int var3 = -49 % ((39 - arg2) / 59);
        class228.field3831.method1533(true, arg0);
        class228.field3831.method1501(arg1, -14657);
        field1577++;
    }
}

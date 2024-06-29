import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class231 extends class84 {

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "[B")
    public byte[] field3493;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field3496 = 0;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "[I")
    public static int[] field3500 = new int[2];

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "Llc;")
    public static class86 field3497 = new class86(32);

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lhc;")
    public static class235 field3508;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
    public static void method1523(int arg0) {
        if (arg0 != 20421) {
            field3497 = null;
        }
        field3497 = null;
        field3508 = null;
        field3500 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lhc;B)V")
    public static final void method1524(class235 arg0, byte arg1) {
        class265.field3974 = arg0;
        field3499++;
        if (arg1 != -8) {
            method1527((byte) -83);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
    public class231(byte[] arg0) {
        this.field3493 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
    public static final void method1525(boolean arg0) {
        if (!arg0) {
            method1529(111);
        }
        class221.field3319.method544(false);
        field3495++;
        class195.field2695.method544(false);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public static final int method1526(int arg0, int arg1) {
        field3505++;
        if (arg1 != -952) {
            field3497 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
    public static final void method1527(byte arg0) {
        if (arg0 <= 55) {
            method1525(false);
        }
        field3494++;
        class177.field2479.method546(-90762264);
        class62.field858.method546(-90762264);
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
    public static final void method1528(int arg0) {
        field3502++;
        try {
            if (class202.field2806 == 1) {
                int var1 = class181.field2541.method1325(-1);
                if (var1 > 0 && class181.field2541.method1345((byte) 47)) {
                    int var2 = var1 - class76.field1068;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class181.field2541.method1343(true, var2);
                    return;
                }
                class181.field2541.method1324((byte) 103);
                class181.field2541.method1320((byte) -100);
                if (client.field2186 == null) {
                    class202.field2806 = 0;
                } else {
                    class202.field2806 = 2;
                }
                class197.field2741 = null;
                class255.field3909 = null;
            }
            int var3 = -124 / ((5 - arg0) / 55);
        } catch (Exception var5) {
            var5.printStackTrace();
            class181.field2541.method1324((byte) -127);
            client.field2186 = null;
            class255.field3909 = null;
            class197.field2741 = null;
            class202.field2806 = 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)V")
    public static final void method1529(int arg0) {
        field3498++;
        class236 var1 = class287.field4533;
        synchronized (class287.field4533) {
            class266.field4000++;
            int var2 = 127 % ((arg0 - 33) / 53);
            class169.field2349 = class202.field2801;
            if (class237.field3604 >= 0) {
                while (class4.field19 != class237.field3604) {
                    int var3 = class111.field1618[class4.field19];
                    class4.field19 = class4.field19 + 1 & 0x7F;
                    if (var3 < 0) {
                        class138.field1928[~var3] = false;
                    } else {
                        class138.field1928[var3] = true;
                    }
                }
            } else {
                for (int var4 = 0; var4 < 112; var4++) {
                    class138.field1928[var4] = false;
                }
                class237.field3604 = class4.field19;
            }
            class202.field2801 = class184.field2557;
        }
    }
}

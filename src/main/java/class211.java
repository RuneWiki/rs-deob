import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class211 extends class116 {

    @OriginalMember(owner = "client!va", name = "A", descriptor = "[B")
    public byte[] field3569;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "[I")
    public static int[] field3571 = new int[100];

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Lda;")
    public static class275 field3573 = class255.method1672(107, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!va", name = "J", descriptor = "Lda;")
    public static class275 field3570 = class255.method1672(107, ")2");

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lda;")
    private static class275 field3572 = class255.method1672(111, " more options");

    @OriginalMember(owner = "client!va", name = "T", descriptor = "S")
    public static short field3580 = 205;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "Lda;")
    public static class275 field3582 = field3572;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "Lda;")
    public static class275 field3583 = class255.method1672(125, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
    public static final void method1357(int arg0) {
        class9.field146.method987((byte) 33);
        field3575++;
        class123.field2202.method987((byte) 43);
        if (arg0 != 22555) {
            method1360(56, true);
        }
        class104.field1732.method987((byte) -113);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
    public static final void method1358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class261.field4531 = class255.field4497 * arg1 / arg3;
        class258.field4521 = class5.field67 * arg2 / arg0;
        field3576++;
        class163.field2840 = arg4;
        class51.field842 = -1;
        class138.method994((byte) 63);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static void method1359(byte arg0) {
        field3573 = null;
        field3582 = null;
        field3571 = null;
        if (arg0 == 34) {
            field3570 = null;
            field3572 = null;
            field3583 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
    public static final void method1360(int arg0, boolean arg1) {
        if (arg0 != 127) {
            return;
        }
        for (int var2 = 0; var2 < class181.field3118; var2++) {
            long var3 = (long) class228.field3851[var2] << 32 | 0x20000000L;
            class165 var5 = class31.field478[class228.field3851[var2]];
            if (var5 != null && var5.method747(1529241680) && var5.field2873.field390 == arg1 && var5.field2873.method151(arg0 ^ 0xFFFFFFF1)) {
                int var6 = var5.field1770 >> 7;
                int var7 = var5.field1758 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.method750((byte) -125) == 1 && (var5.field1770 & 0x7F) == 64 && (var5.field1758 & 0x7F) == 64) {
                        if (class158.field2774[var6][var7] == class168.field2925) {
                            continue;
                        }
                        class158.field2774[var6][var7] = class168.field2925;
                    }
                    if (!var5.field2873.field402) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field1767 = class89.method647(var5.field1758, class159.field2790, var5.field1770, -91);
                    class82.method533(class159.field2790, var5.field1770, var5.field1758, var5.field1767, var5.method750((byte) -113) * 64 - 4, var5, var5.field1787, var3, var5.field1771);
                }
            }
        }
        field3578++;
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)I")
    public static final int method1361(int arg0) {
        field3574++;
        if (arg0 <= 0) {
            method1360(-124, false);
        }
        return 2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBI)V")
    public static final void method1362(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 115 / ((arg3 - 27) / 35);
        class96.field1632 = arg2;
        class246.field4355 = arg1;
        class149.field2603 = arg0;
        field3577++;
        class141.field2493 = arg4;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([B)V")
    public class211(byte[] arg0) {
        this.field3569 = arg0;
    }
}

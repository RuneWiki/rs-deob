import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class292 {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[I")
    private int[] field4606;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4597 = "cyan:";

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[C")
    public static char[] field4593 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    public static boolean field4600 = false;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static volatile int field4604 = 0;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[B")
    public static byte[] field4598;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
    public static int[] field4592;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[S")
    public static short[] field4594;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static void method1953(boolean arg0) {
        field4593 = null;
        field4598 = null;
        field4592 = null;
        if (arg0) {
            field4593 = null;
        }
        field4594 = null;
        field4597 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4599++;
        if (class231.field3677 == 1) {
            class145.field2306[class284.field4501 / 100].method856(class157.field2448 - 8, class177.field2768 + -8);
        }
        if (arg4 != -1) {
            field4594 = null;
        }
        if (class231.field3677 == 2) {
            class145.field2306[class284.field4501 / 100 + 4].method856(class157.field2448 - 8, class177.field2768 + -8);
        }
        class166.method1121(-13172);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZZ)V")
    public static final void method1955(boolean arg0, boolean arg1) {
        if (!arg0) {
            field4595 = 18;
        }
        if (arg1) {
            if (class75.field1236 != -1) {
                class66.method488(false, class75.field1236);
            }
            for (class251 var2 = (class251) class127.field2007.method287(-127); var2 != null; var2 = (class251) class127.field2007.method291((byte) -105)) {
                class177.method1198(var2, (byte) -118, true);
            }
            class75.field1236 = -1;
            class127.field2007 = new class39(8);
            class29.method226(-756);
            class75.field1236 = field4595;
            class297.method1981(false, 19992);
            class256.method1738(31);
            class42.method308(class75.field1236, -1);
        }
        field4605++;
        class248.field4020 = -1;
        class230.method1537(-1, class28.field395);
        class283.field4473 = new class236();
        class283.field4473.field2240 = 3000;
        class283.field4473.field2278 = 3000;
        if (class167.field2613 == 0) {
            class204.method1374((byte) -82, class130.field2055);
            client.method1042(!arg0, 10);
            return;
        }
        if (class259.field4130 == 2) {
            class293.field4624 = class86.field1434 << 7;
            class219.field3375 = class272.field4366 << 7;
        } else {
            class113.method801(128);
        }
        class288.method1928(-108);
        client.method1042(false, 28);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lai;B)Lke;")
    public static final class110 method1956(class88 arg0, byte arg1) {
        if (arg1 != -74) {
            return null;
        }
        field4601++;
        class110 var2 = new class110();
        var2.field1809 = arg0.method645(11596);
        var2.field1801 = class71.method512(arg1 - 46, var2.field1809);
        return var2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z")
    public static final boolean method1957(int arg0) {
        field4596++;
        class58 var1 = class254.field4065;
        synchronized (class254.field4065) {
            if (arg0 < 29) {
                field4594 = null;
            }
            if (class280.field4431 == class161.field2526) {
                return false;
            } else {
                class85.field1432 = class205.field3206[class280.field4431];
                class154.field2401 = class143.field2183[class280.field4431];
                class280.field4431 = class280.field4431 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)I")
    public final int method1958(int arg0, byte arg1) {
        if (arg1 < 32) {
            field4598 = null;
        }
        field4602++;
        int var3 = (this.field4606.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4606[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4606[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V")
    public class292(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4606 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4606[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4606[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4606[var5 + var5] = arg0[var4];
            this.field4606[var5 + var5 + 1] = var4++;
        }
    }
}

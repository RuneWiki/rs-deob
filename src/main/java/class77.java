import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class77 {

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
    private int[] field1769;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1760 = 0;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1762 = -1;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lrd;")
    public static class114 field1751 = class84.method656("Nehmen", (byte) 124);

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lrd;")
    public static class114 field1761 = class84.method656("invback", (byte) 121);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1759 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1758 = -1;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lrd;")
    private static class114 field1766 = class84.method656("Connection lost", (byte) 127);

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1764 = 0;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lrd;")
    public static class114 field1755 = field1766;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[[[Lmd;")
    public static class84[][][] field1767 = new class84[4][104][104];

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Luc;")
    public static class131 field1752 = new class131(5000);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lhe;")
    public static class54 field1749;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
    public static int[] field1754;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method612(byte arg0) {
        field1766 = null;
        field1751 = null;
        field1755 = null;
        field1767 = null;
        field1749 = null;
        field1761 = null;
        field1754 = null;
        field1752 = null;
        if (arg0 != 14) {
            field1754 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)I")
    public static final int method613(byte arg0, int arg1, int arg2) {
        field1750++;
        class132 var3 = (class132) class132.field3197.method783(-1, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 9 / ((arg0 + 46) / 47);
            int var5 = 0;
            for (int var6 = 0; var6 < var3.field3186.length; var6++) {
                if (var3.field3193[var6] == arg2) {
                    var5 += var3.field3186[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[BZI)V")
    public static final void method614(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field1763++;
        if (class98.field2216 == null || arg0 > -34) {
            return;
        }
        if (class36.field699 >= 0) {
            arg4 -= 20;
            if (arg4 < 1) {
                arg4 = 1;
            }
            class110.field2575 = arg4;
            if (class36.field699 == 0) {
                class127.field3023 = 0;
            } else {
                int var5 = class106.method810(class36.field699, (byte) -114);
                int var6 = var5 - class125.field2973;
                class127.field3023 = (arg4 + var6 + 3600 - 1) / arg4;
            }
            class20.field371 = arg1;
            class65.field1395 = arg2;
            client.field400 = arg3;
        } else if (class110.field2575 == 0) {
            class63.method513((byte) -110, arg1, arg2, arg3);
        } else {
            class65.field1395 = arg2;
            client.field400 = arg3;
            class20.field371 = arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public final int method615(int arg0, int arg1) {
        if (arg0 > -41) {
            this.method615(-20, 18);
        }
        field1756++;
        int var3 = this.field1769.length - 2;
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field1769[var4];
            if (arg1 == var5) {
                return this.field1769[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V")
    public static final void method616(byte arg0, int arg1) {
        field1768++;
        if (arg1 == -1 || !class1.method1(0, arg1)) {
            return;
        }
        class90[] var2 = class78.field1772[arg1];
        int var3 = -32 / ((arg0 + 86) / 35);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class90 var5 = var2[var4];
            if (var5.field2020 != null) {
                class80.method636(var5.field2020, 0, 0, 0, 23, null, var5);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([I)V")
    public class77(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1769 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1769[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1769[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field1769[var5 + var5] = arg0[var4];
            this.field1769[var5 + var5 + 1] = var4++;
        }
    }
}

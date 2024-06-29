import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class110 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1584 = 0;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1587 = 0;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lpg;")
    public static class77 field1586 = new class77(5000);

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "J")
    public static long field1590 = 0L;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lqi;")
    public static class131 field1588;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
    public static boolean field1583;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public static int[] field1581;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method808(byte arg0) {
        field1581 = null;
        field1588 = null;
        int var1 = -39 % ((arg0 + 35) / 53);
        field1586 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static final void method809(boolean arg0) {
        if (class172.field2765 < 0) {
            class29.field339 = -1;
            class172.field2765 = 0;
            class112.field1613 = -1;
        }
        field1582++;
        if (class172.field2765 > class85.field1245) {
            class112.field1613 = -1;
            class29.field339 = -1;
            class172.field2765 = class85.field1245;
        }
        if (!arg0) {
            method810(-89, 7, (short[]) null, (String[]) null, 114);
        }
        if (class296.field4682 < 0) {
            class29.field339 = -1;
            class112.field1613 = -1;
            class296.field4682 = 0;
        }
        if (class52.field753 < class296.field4682) {
            class296.field4682 = class52.field753;
            class29.field339 = -1;
            class112.field1613 = -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
    public static final void method810(int arg0, int arg1, short[] arg2, String[] arg3, int arg4) {
        field1580++;
        if (arg0 != 0) {
            field1583 = false;
        }
        if (arg4 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        String var6 = arg3[var5];
        int var7 = arg1;
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var6;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var8;
        for (int var9 = arg1; var9 < arg4; var9++) {
            if (var6 == null || arg3[var9] != null && arg3[var9].compareTo(var6) < (var9 & 0x1)) {
                String var10 = arg3[var9];
                arg3[var9] = arg3[var7];
                arg3[var7] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var7];
                arg2[var7++] = var11;
            }
        }
        arg3[arg4] = arg3[var7];
        arg3[var7] = var6;
        arg2[arg4] = arg2[var7];
        arg2[var7] = var8;
        method810(0, arg1, arg2, arg3, var7 - 1);
        method810(0, var7 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static final void method811(byte arg0) {
        class205.field3280 = 0;
        class291.field4613 = -1;
        class104.field1512 = -1;
        class288.field4580 = 0;
        class220.field3532.field2511 = 0;
        field1579++;
        if (arg0 >= -92) {
            return;
        }
        class243.field3890 = 0;
        class221.field3534 = 0;
        class206.field3315 = false;
        class50.field732.field2511 = 0;
        class100.field1471 = 0;
        class277.field4442 = -1;
        class151.field2453 = 0;
        class102.field1501 = -1;
        for (int var1 = 0; var1 < class92.field1374.length; var1++) {
            if (class92.field1374[var1] != null) {
                class92.field1374[var1].field1894 = -1;
            }
        }
        for (int var2 = 0; var2 < class169.field2730.length; var2++) {
            if (class169.field2730[var2] != null) {
                class169.field2730[var2].field1894 = -1;
            }
        }
        class104.method776(-20481);
        class176.field2853 = 1;
        class256.method1811(30, true);
        for (int var3 = 0; var3 < 100; var3++) {
            class190.field3070[var3] = true;
        }
        class59.method423(98);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
    public static final void method812(byte arg0, int arg1) {
        int var2 = -20 % ((arg0 + 64) / 34);
        field1589++;
        class29.field339 = -1;
        class112.field1613 = -1;
        class172.field2765 = arg1;
        method809(true);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILq;I)V")
    public static final void method813(int arg0, class128 arg1, int arg2) {
        if (arg1.field1913 > class264.field4290) {
            class224.method1603(arg1, (byte) 87);
        } else if (class264.field4290 <= arg1.field1902) {
            class96.method746(-63, arg1);
        } else {
            class280.method1918(-16156, arg1);
        }
        if (arg1.field1979 < 128 || arg1.field1910 < 128 || arg1.field1979 >= 13184 || arg1.field1910 >= 13184) {
            arg1.field1932 = -1;
            arg1.field1913 = 0;
            arg1.field1902 = 0;
            arg1.field1934 = -1;
            arg1.field1979 = arg1.field1917[0] * 128 + (arg1.method205(117) * 64);
            arg1.field1910 = arg1.field1974[0] * 128 + arg1.method205(71) * 64;
            arg1.method921(-1);
        }
        if (arg0 != -6569) {
            method812((byte) -107, -100);
        }
        field1585++;
        if (class186.field2993 == arg1 && (arg1.field1979 < 1536 || arg1.field1910 < 1536 || arg1.field1979 >= 11776 || arg1.field1910 >= 11776)) {
            arg1.field1934 = -1;
            arg1.field1932 = -1;
            arg1.field1913 = 0;
            arg1.field1902 = 0;
            arg1.field1979 = arg1.field1917[0] * 128 + (arg1.method205(122) * 64);
            arg1.field1910 = arg1.field1974[0] * 128 + (arg1.method205(79) * 64);
            arg1.method921(-1);
        }
        class101.method770(arg1, 0);
        class156.method1159(arg1, arg0 + 6568);
    }
}

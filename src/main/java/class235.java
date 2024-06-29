import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class235 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field4095 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lda;")
    public static class275 field4098 = null;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field4104 = 0;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    public static int[] field4097 = new int[32];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[Lwb;")
    public static class179[] field4103;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[Lwb;")
    public static class179[] field4105;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[[[Lhb;")
    public static class3[][][] field4094;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[[[Lhb;")
    public static class3[][][] field4101;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1528(byte arg0) {
        field4098 = null;
        if (arg0 != -57) {
            field4104 = -77;
        }
        field4103 = null;
        field4105 = null;
        field4101 = null;
        field4097 = null;
        field4094 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[B)I")
    public static final int method1529(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 0) {
            method1533((class234) null, 76, -80, 112);
        }
        field4100++;
        return class258.method1682((byte) 62, arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method340(byte arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
    public static final int method1530(int arg0, int arg1, int arg2) {
        field4099++;
        if (arg1 < 117) {
            field4097 = null;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V")
    public static final void method1531(int arg0, boolean arg1) {
        field4096++;
        int var2 = class32.field486;
        if ((class66.field1094.field1770 >> 7) == class220.field3746 && (class66.field1094.field1758 >> 7) == class108.field1878) {
            class220.field3746 = 0;
        }
        if (arg0 != 1653179047) {
            field4103 = null;
        }
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class109 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class66.field1094;
            } else {
                var4 = (long) class149.field2595[var3] << 32;
                var6 = class16.field238[class149.field2595[var3]];
            }
            if (var6 != null && var6.method747(1529241680)) {
                int var7 = var6.field1770 >> 7;
                var6.field1933 = false;
                int var8 = var6.field1758 >> 7;
                if ((class76.field1257 && class32.field486 > 200 || class32.field486 > 50) && !arg1 && var6.field1788 == var6.field1736) {
                    var6.field1933 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field1904 == null || class35.field576 < var6.field1909 || class35.field576 >= var6.field1912) {
                        if (var6.method750((byte) -115) == 1 && (var6.field1770 & 0x7F) == 64 && (var6.field1758 & 0x7F) == 64) {
                            if (class158.field2774[var7][var8] == class168.field2925) {
                                continue;
                            }
                            class158.field2774[var7][var8] = class168.field2925;
                        }
                        var6.field1767 = class89.method647(var6.field1758, class159.field2790, var6.field1770, 122);
                        class82.method533(class159.field2790, var6.field1770, var6.field1758, var6.field1767, var6.method750((byte) -107) * 64 + 60 - 64, var6, var6.field1787, var4, var6.field1771);
                    } else {
                        var6.field1933 = false;
                        var6.field1767 = class89.method647(var6.field1758, class159.field2790, var6.field1770, -51);
                        class142.method1022(class159.field2790, var6.field1770, var6.field1758, var6.field1767, var6, var6.field1787, var4, var6.field1937, var6.field1894, var6.field1916, var6.field1930);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public abstract int method339(int arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static final void method1532(byte arg0) {
        class159.field2779++;
        class149.field2597.method526((byte) -116, 82);
        if (arg0 != 27) {
            field4101 = null;
        }
        class149.field2597.method575((byte) 125, class56.method353(true));
        field4102++;
        class149.field2597.method600(class249.field4391, (byte) 78);
        class149.field2597.method600(class212.field3587, (byte) 92);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
    public abstract void method337(int arg0, byte arg1);

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Lp;")
    public abstract class125 method336(byte arg0);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lak;III)V")
    public static final void method1533(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class247.field4359) {
            class3 var4 = field4101[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field39 != null && var4.field39.field3648.method1523()) {
                arg0.method1527(var4.field39.field3648, 128, 0, 0, true);
            }
        }
        if (arg3 < class247.field4359) {
            class3 var5 = field4101[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field39 != null && var5.field39.field3648.method1523()) {
                arg0.method1527(var5.field39.field3648, 0, 0, 128, true);
            }
        }
        if (arg2 < class247.field4359 && arg3 < class172.field2997) {
            class3 var6 = field4101[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field39 != null && var6.field39.field3648.method1523()) {
                arg0.method1527(var6.field39.field3648, 128, 0, 128, true);
            }
        }
        if (arg2 < class247.field4359 && arg3 > 0) {
            class3 var7 = field4101[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field39 != null && var7.field39.field3648.method1523()) {
                arg0.method1527(var7.field39.field3648, 128, 0, -128, true);
            }
        }
    }
}

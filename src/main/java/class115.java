import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class115 {

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
    private int[] field2056;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[[[Lvf;")
    public static class48[][][] field2050 = new class48[4][104][104];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2048 = -1;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[I")
    public static int[] field2051 = new int[5];

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field2061 = 0;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "[[I")
    public static int[][] field2068 = new int[104][104];

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "[I")
    public static int[] field2071 = new int[1000];

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Z")
    public static boolean field2062 = true;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lhh;")
    public static class38 field2053;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Ltg;")
    public static class75 field2058;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Ltg;")
    public static class75 field2065;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "[Lqh;")
    public static class24[] field2069;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "[S")
    public static short[] field2059;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI)I")
    public static final int method856(int arg0, byte arg1, int arg2) {
        field2060++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (arg1 >= -3) {
                method861(44, (byte) 24, 8);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public static final void method857(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 87) {
            method867(-33);
        }
        class98 var4 = class186.method1288(new class98[] { class96.field1649, class125.method930(25904, arg1), class62.field1044, class125.method930(25904, arg3 >> 6), class62.field1044, class125.method930(25904, arg2 >> 6), class62.field1044, class125.method930(25904, arg3 & 0x3F), class62.field1044, class125.method930(25904, arg2 & 0x3F) }, 31618);
        field2057++;
        var4.method720(0);
        class83.method621(var4, 220983719);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)I")
    public final int method858(int arg0, byte arg1) {
        field2047++;
        int var3 = (this.field2056.length >> 1) - 1;
        if (arg1 != 13) {
            field2048 = 7;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field2056[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2056[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lnd;I)I")
    public static final int method859(class192 arg0, int arg1) {
        field2049++;
        int var2 = arg0.field3339;
        if (arg0.field4510 == arg0.field4479) {
            var2 = arg0.field3353;
        } else if (arg0.field4490 == arg0.field4479) {
            var2 = arg0.field3335;
        }
        if (arg1 != -11492) {
            field2071 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public static final void method860(int arg0, int arg1) {
        field2064++;
        class162.field2934.method1561(-102, arg0);
        class60.field986.method1561(-96, arg0);
        if (arg1 != -1) {
            method862(-67);
        }
        class48.field801.method1561(-127, arg0);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IBI)Lhf;")
    public static final class134 method861(int arg0, byte arg1, int arg2) {
        if (arg1 != 32) {
            field2067 = -36;
        }
        field2055++;
        class134 var3 = (class134) class86.field1508.method1511((byte) -122, (long) arg0 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class134(arg0, arg2);
            class86.field1508.method1513(var3.field4061, var3, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([I)V")
    public class115(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2056 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2056[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2056[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field2056[var5 + var5] = arg0[var4];
            this.field2056[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method862(int arg0) {
        field2071 = null;
        field2050 = null;
        field2069 = null;
        field2051 = null;
        field2053 = null;
        field2059 = null;
        field2058 = null;
        field2065 = null;
        if (arg0 == 1) {
            field2068 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLkh;)V")
    public static final void method863(byte arg0, class5 arg1) {
        field2070++;
        class168 var2 = null;
        try {
            class22 var3 = arg1.method26("runescape", false);
            if (arg0 != 35) {
                return;
            }
            while (var3.field445 == 0) {
                class234.method1603(1L, 85);
            }
            if (var3.field445 == 1) {
                var2 = (class168) var3.field447;
                class216 var4 = class191.method1315(1);
                var2.method1201(var4.field3728, 1, var4.field3706, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1199((byte) 110);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method864(byte arg0) {
        field2054++;
        if (class9.field210 == 0) {
            return;
        }
        try {
            if ((++class177.field3070) > 2000) {
                if (class46.field774 != null) {
                    class46.field774.method790(false);
                    class46.field774 = null;
                }
                if (class245.field4331 >= 1) {
                    class202.field3440 = -5;
                    class9.field210 = 0;
                    return;
                }
                class9.field210 = 1;
                class245.field4331++;
                if (class236.field4076 == class156.field2848) {
                    class236.field4076 = class188.field3235;
                } else {
                    class236.field4076 = class156.field2848;
                }
                class177.field3070 = 0;
            }
            if (class9.field210 == 1) {
                class62.field1035 = class119.field2145.method38(class236.field4076, class85.field1507, -122);
                class9.field210 = 2;
            }
            if (class9.field210 == 2) {
                if (class62.field1035.field445 == 2) {
                    throw new IOException();
                }
                if (class62.field1035.field445 != 1) {
                    return;
                }
                class46.field774 = new class102((Socket) class62.field1035.field447, class119.field2145);
                class62.field1035 = null;
                class46.field774.method788(true, 0, class237.field4084.field3728, class237.field4084.field3706);
                if (class262.field4606 != null) {
                    class262.field4606.method1579((byte) 64);
                }
                if (class235.field4057 != null) {
                    class235.field4057.method1579((byte) 64);
                }
                int var1 = class46.field774.method785(-1795);
                if (class262.field4606 != null) {
                    class262.field4606.method1579((byte) 64);
                }
                if (class235.field4057 != null) {
                    class235.field4057.method1579((byte) 64);
                }
                if (var1 != 21) {
                    class9.field210 = 0;
                    class202.field3440 = var1;
                    class46.field774.method790(false);
                    class46.field774 = null;
                    return;
                }
                class9.field210 = 3;
            }
            if (class9.field210 == 3) {
                if (class46.field774.method786(4316) < 1) {
                    return;
                }
                class104.field1857 = new class98[class46.field774.method785(-1795)];
                class9.field210 = 4;
            }
            if (class9.field210 == 4) {
                if (class46.field774.method786(4316) < class104.field1857.length * 8) {
                    return;
                }
                class144.field2536.field3728 = 0;
                class46.field774.method787(class144.field2536.field3706, 0, 0, class104.field1857.length * 8);
                for (int var2 = 0; var2 < class104.field1857.length; var2++) {
                    class104.field1857[var2] = class106.method814(class144.field2536.method1439(-715833952), (byte) -128);
                }
                class9.field210 = 0;
                class202.field3440 = 21;
                class46.field774.method790(false);
                class46.field774 = null;
                return;
            }
        } catch (IOException var3) {
            if (class46.field774 != null) {
                class46.field774.method790(false);
                class46.field774 = null;
            }
            if (class245.field4331 < 1) {
                class177.field3070 = 0;
                class9.field210 = 1;
                if (class236.field4076 == class156.field2848) {
                    class236.field4076 = class188.field3235;
                } else {
                    class236.field4076 = class156.field2848;
                }
                class245.field4331++;
            } else {
                class9.field210 = 0;
                class202.field3440 = -4;
            }
        }
        if (arg0 > -88) {
            method864((byte) 20);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lsf;")
    public static final class180 method865(byte arg0, int arg1) {
        field2066++;
        class180 var2 = (class180) class92.field1610.method1307((byte) -69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class205.field3507.method571(arg1, 0, -99);
        if (var3 == null) {
            return null;
        }
        class180 var4 = new class180();
        class216 var5 = new class216(var3);
        var5.field3728 = var5.field3706.length - 2;
        int var6 = var5.method1487(35);
        int var7 = var5.field3706.length - var6 - 2 - 12;
        var5.field3728 = var7;
        int var8 = var5.method1442(-1330139880);
        var4.field3099 = var5.method1487(63);
        if (arg0 > -5) {
            field2062 = true;
        }
        var4.field3096 = var5.method1487(83);
        var4.field3098 = var5.method1487(61);
        var4.field3110 = var5.method1487(5);
        int var9 = var5.method1446(5350);
        if (var9 > 0) {
            var4.field3105 = new class219[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1487(52);
                class219 var12 = new class219(class186.method1286((byte) 113, var11));
                var4.field3105[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1442(-1330139880);
                    int var14 = var5.method1442(-1330139880);
                    var12.method1513((long) var13, new class224(var14), -1);
                }
            }
        }
        var5.field3728 = 0;
        var4.field3103 = var5.method1468(-31958);
        int var15 = 0;
        var4.field3094 = new class98[var8];
        var4.field3095 = new int[var8];
        var4.field3108 = new int[var8];
        while (var5.field3728 < var7) {
            int var16 = var5.method1487(82);
            if (var16 == 3) {
                var4.field3094[var15] = var5.method1445(-3);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3108[var15] = var5.method1446(5350);
            } else {
                var4.field3108[var15] = var5.method1442(-1330139880);
            }
            var4.field3095[var15++] = var16;
        }
        class92.field1610.method1312(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field2052++;
        int var9 = arg6 - arg3;
        int var10 = arg4 - arg1;
        int var11 = (arg5 - arg0 << 16) / var9;
        int var12 = (arg2 - arg8 << 16) / var10;
        class236.method1612(arg0, 29913, arg1, var12, arg6, var11, arg4, arg8, 0, 0, arg3);
        if (arg7 < 96) {
            method863((byte) 72, (class5) null);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method867(int arg0) {
        field2063++;
        if (arg0 < 36) {
            method856(-125, (byte) 52, 46);
        }
        if (class235.field4057 != null) {
            class235.field4057.method1580(5386);
        }
        if (class262.field4606 != null) {
            class262.field4606.method1580(5386);
        }
    }
}

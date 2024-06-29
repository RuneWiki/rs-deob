import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class150 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Z")
    public boolean field2104 = false;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lct;")
    public static class285 field2108 = new class285(23, 7);

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Les;")
    public static class441 field2114 = new class441("LIVE", 0);

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lj;")
    public static class240 field2115 = new class240(12, 17);

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2116 = new Rectangle[100];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lpo;")
    public class365 field2105;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lui;")
    public static class451 field2106;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2110;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method1014(byte arg0, int arg1) {
        field2111++;
        if (arg0 != -59) {
            method1020(42, (byte) -115, -103);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method1015(byte arg0) {
        if (arg0 >= -93) {
            method1017();
        }
        field2103++;
        return this.field2105.field5525.method2672(this.field2100, 23775);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lre;B)V", line = 27)
    public final void method1016(class446 arg0, byte arg1) {
        field2112++;
        while (true) {
            int var3 = arg0.method2628(arg1 + 49268);
            if (var3 == 0) {
                if (arg1 == -116) {
                    return;
                } else {
                    this.field2100 = -123;
                    return;
                }
            }
            this.method1022(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V", line = 47)
    public static final void method1017() {
        if (class138.field1990 != null) {
            for (int var0 = 0; var0 < class138.field1990.length; var0++) {
                for (int var1 = 0; var1 < class412.field5957; var1++) {
                    for (int var2 = 0; var2 < class315.field4743; var2++) {
                        if (class138.field1990[var0][var1][var2] != null) {
                            class138.field1990[var0][var1][var2].method2064(-5068);
                        }
                        class138.field1990[var0][var1][var2] = null;
                    }
                }
            }
        }
        class138.field1990 = null;
        class483.field6781 = null;
        if (class475.field6650 != null) {
            for (int var3 = 0; var3 < class475.field6650.length; var3++) {
                for (int var4 = 0; var4 < class412.field5957; var4++) {
                    for (int var5 = 0; var5 < class315.field4743; var5++) {
                        if (class475.field6650[var3][var4][var5] != null) {
                            class475.field6650[var3][var4][var5].method2064(-5068);
                        }
                        class475.field6650[var3][var4][var5] = null;
                    }
                }
            }
        }
        class475.field6650 = null;
        class55.field765 = null;
        class170.field2427 = null;
        class479.field6745 = null;
        class387.field5713 = 0;
        if (class454.field6460 != null) {
            for (int var6 = 0; var6 < class387.field5713; var6++) {
                class454.field6460[var6] = null;
            }
        }
        if (class166.field2343 != null) {
            for (int var7 = 0; var7 < class270.field3992; var7++) {
                class166.field2343[var7] = null;
            }
            class270.field3992 = 0;
        }
        if (class78.field1108 != null) {
            for (int var8 = 0; var8 < class363.field5511; var8++) {
                class78.field1108[var8] = null;
            }
            for (int var9 = 0; var9 < class344.field5192; var9++) {
                for (int var10 = 0; var10 < class412.field5957; var10++) {
                    for (int var11 = 0; var11 < class315.field4743; var11++) {
                        class275.field4190[var9][var10][var11] = 0L;
                    }
                }
            }
            class363.field5511 = 0;
        }
        class157.field2193 = null;
        class198.method1347((byte) 106);
        class453.field6428.method1590(-15139);
        class314.field4724 = null;
        class111.field1568 = null;
        class318.field4780 = null;
        class44.field632 = null;
        class163.field2269 = null;
        class432.field6150 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILtq;ZI)Ldp;", line = 191)
    public final class319 method1018(int arg0, class63 arg1, boolean arg2, int arg3) {
        field2101++;
        long var5 = (long) (arg1.field870 << 19 | this.field2100 | arg3 << 16 | (arg2 ? 262144 : 0));
        class319 var7 = (class319) this.field2105.field5531.method2393(-128, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field2105.field5525.method2672(this.field2100, 23775)) {
            class368 var8 = class368.method2265(this.field2105.field5525, this.field2100, arg0);
            if (var8 != null) {
                var8.field5558 = var8.field5560 = var8.field5556 = var8.field5555 = 0;
                if (arg2) {
                    var8.method2268();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2269();
                }
            }
            class319 var10 = arg1.method547(var8, true);
            if (var10 != null) {
                this.field2105.field5531.method2395(0, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 237)
    public static void method1019(int arg0) {
        field2110 = null;
        field2106 = null;
        if (arg0 == -5) {
            field2108 = null;
            field2116 = null;
            field2115 = null;
            field2114 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)V", line = 261)
    public static final void method1020(int arg0, byte arg1, int arg2) {
        field2113++;
        int var3 = class131.field1828.method3(class473.field6624.method2036(class4.field85, (byte) -21), (byte) 92);
        for (class146 var4 = (class146) class451.field6377.method2456(32101); var4 != null; var4 = (class146) class451.field6377.method2461(301)) {
            int var9 = class270.method1757(var4, false);
            if (var3 < var9) {
                var3 = var9;
            }
        }
        var3 += 8;
        int var5 = class186.field2817 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (class342.field5115 < var3 + var6) {
            var6 = class342.field5115 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (var5 + arg2 > class233.field3411) {
            var7 = class233.field3411 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class432.field6144 = var6;
        class166.field2335 = true;
        int var8 = 119 / ((arg1 - 43) / 62);
        class450.field6355 = (class486.field6828 ? 26 : 22) + class186.field2817 * 16;
        class330.field4935 = var3;
        class99.field1414 = var7;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;IZLui;)Lgn;", line = 314)
    public static final class486 method1021(String arg0, int arg1, boolean arg2, class451 arg3) {
        field2109++;
        int var4 = arg3.method2676(arg0, (byte) -87);
        if (var4 == -1) {
            return new class486(0);
        } else if (arg1 == 23) {
            int[] var5 = arg3.method2689(var4, 104);
            class486 var6 = new class486(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var6.field6831 > var7) {
                    class446 var9 = new class446(arg3.method2691(var5[var8++], var4, 0));
                    int var10 = var9.method2604(51);
                    int var11 = var9.method2631(2530);
                    int var12 = var9.method2628(arg1 + 49129);
                    if (!arg2 && var12 == 1) {
                        var6.field6831--;
                    } else {
                        var6.field6827[var7] = var10;
                        var6.field6830[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILre;I)V", line = 361)
    private final void method1022(int arg0, class446 arg1, int arg2) {
        if (arg2 != 0) {
            field2108 = null;
        }
        if (arg0 == 1) {
            this.field2100 = arg1.method2631(arg2 + 2530);
        } else if (arg0 == 2) {
            this.field2107 = arg1.method2613(-25778);
        } else if (arg0 == 3) {
            this.field2104 = true;
        } else if (arg0 == 4) {
            this.field2100 = -1;
        }
        field2102++;
    }
}

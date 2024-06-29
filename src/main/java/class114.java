import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class114 extends class147 {

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "Lli;")
    public class277 field2143 = new class277();

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "Ldi;")
    public class172 field2145 = new class172();

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Ltg;")
    private class177 field2128;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "[I")
    public static int[] field2136 = new int[128];

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Loh;")
    public static class263 field2134 = class253.method1681(-120, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Lwd;")
    public static final class22 method739(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class22 var4 = var3.field43;
            var3.field43 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static final void method740(int arg0) {
        for (int var1 = 0; var1 < class112.field2107; var1++) {
            int var10002 = class24.field680[var1]--;
            if (class24.field680[var1] >= -10) {
                class193 var3 = class150.field2713[var1];
                if (var3 == null) {
                    var3 = class193.method1261(class17.field389, class55.field1154[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class24.field680[var1] += var3.method1262();
                    class150.field2713[var1] = var3;
                }
                if (class24.field680[var1] < 0) {
                    int var10;
                    if (class243.field4294[var1] == 0) {
                        var10 = class265.field4632;
                    } else {
                        int var4 = class243.field4294[var1] >> 16 & 0xFF;
                        int var5 = (class243.field4294[var1] & 0xFF15) >> 8;
                        int var6 = (class243.field4294[var1] & 0xFF) * 128;
                        int var7 = var4 * 128 + 64 - class229.field4018.field4688;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 * 128 + 64 - class229.field4018.field4705;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var9 > var6) {
                            class24.field680[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var6 - var9) * class214.field3798 / var6;
                    }
                    if (var10 > 0) {
                        class250 var11 = var3.method1263().method1672(class138.field2544);
                        class199 var12 = class199.method1368(var11, 100, var10);
                        var12.method1370(class35.field824[var1] - 1);
                        class43.field933.method1134(var12);
                    }
                    class24.field680[var1] = -100;
                }
            } else {
                class112.field2107--;
                for (int var2 = var1; var2 < class112.field2107; var2++) {
                    class55.field1154[var2] = class55.field1154[var2 + 1];
                    class150.field2713[var2] = class150.field2713[var2 + 1];
                    class35.field824[var2] = class35.field824[var2 + 1];
                    class24.field680[var2] = class24.field680[var2 + 1];
                    class243.field4294[var2] = class243.field4294[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 22681) {
            field2136 = null;
        }
        if (class143.field2612 && !class94.method660(arg0 ^ 0x7122)) {
            if (class95.field1866 != 0 && class186.field3358 != -1) {
                class237.method1586(false, class186.field3358, class142.field2609, class95.field1866, 0, arg0 - 22804);
            }
            class143.field2612 = false;
        } else if (class95.field1866 != 0 && class186.field3358 != -1 && !class94.method660(arg0 ^ 0x7122)) {
            class154.field2792.method1516(-85, 19);
            class240.field4215++;
            class154.field2792.method1286(arg0 ^ 0xFFFF8ABD, class186.field3358);
            class186.field3358 = -1;
        }
        field2127++;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "()I")
    public final int method741() {
        field2133++;
        return 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()Lv;")
    public final class147 method742() {
        field2131++;
        class196 var1;
        do {
            var1 = (class196) this.field2143.method1881(112);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3567 == null);
        return var1.field3567;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BILoh;)V")
    public static final void method743(byte arg0, int arg1, class263 arg2) {
        field2132++;
        class64 var3 = class84.method563(3, arg1, -116);
        var3.method396(true);
        var3.field1282 = arg2;
        int var4 = 2 % ((-arg0 - 47) / 41);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public final void method744(int arg0) {
        this.field2145.method744(arg0);
        field2135++;
        for (class196 var2 = (class196) this.field2143.method1878(true); var2 != null; var2 = (class196) this.field2143.method1881(-100)) {
            if (!this.field2128.method1160(var2, (byte) 119)) {
                int var3 = arg0;
                do {
                    if (var2.field3556 >= var3) {
                        this.method751(var3, var2, (byte) 63);
                        var2.field3556 -= var3;
                        break;
                    }
                    this.method751(var2.field3556, var2, (byte) 111);
                    var3 -= var2.field3556;
                } while (!this.field2128.method1181(96, var3, (int[]) null, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lbf;IIII[I)V")
    private final void method745(class196 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (~(this.field2128.field3234[arg0.field3564] & 0x4) != arg4 && arg0.field3562 < 0) {
            int var7 = this.field2128.field3218[arg0.field3564] / class198.field3580;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field3549) / var7;
                if (arg2 < var8) {
                    arg0.field3549 += arg2 * var7;
                    break;
                }
                arg0.field3567.method748(arg5, arg3, var8);
                arg2 -= var8;
                arg0.field3549 += var7 * var8 - 1048576;
                int var9 = class198.field3580 / 100;
                int var10 = 262144 / var7;
                arg3 += var8;
                if (var9 > var10) {
                    var9 = var10;
                }
                class199 var11 = arg0.field3567;
                if (this.field2128.field3229[arg0.field3564] == 0) {
                    arg0.field3567 = class199.method1387(arg0.field3569, var11.method1366(), var11.method1373(), var11.method1348());
                } else {
                    arg0.field3567 = class199.method1387(arg0.field3569, var11.method1366(), 0, var11.method1348());
                    this.field2128.method1183(arg4 + 9134, arg0, arg0.field3575.field405[arg0.field3554] < 0);
                    arg0.field3567.method1362(var9, var11.method1373());
                }
                if (arg0.field3575.field405[arg0.field3554] < 0) {
                    arg0.field3567.method1370(-1);
                }
                var11.method1372(var9);
                var11.method748(arg5, arg3, arg1 - arg3);
                if (var11.method1352()) {
                    this.field2145.method1134(var11);
                }
            }
        }
        arg0.field3567.method748(arg5, arg3, arg2);
        field2130++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([BB)[B")
    public static final byte[] method746(byte[] arg0, byte arg1) {
        field2140++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class149.method977(arg0, 0, var3, 0, var2);
        if (arg1 >= -64) {
            method739(77, 49, -98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()Lv;")
    public final class147 method747() {
        field2139++;
        class196 var1 = (class196) this.field2143.method1878(true);
        if (var1 == null) {
            return null;
        } else if (var1.field3567 == null) {
            return this.method742();
        } else {
            return var1.field3567;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([III)V")
    public final void method748(int[] arg0, int arg1, int arg2) {
        field2126++;
        this.field2145.method748(arg0, arg1, arg2);
        for (class196 var4 = (class196) this.field2143.method1878(true); var4 != null; var4 = (class196) this.field2143.method1881(-51)) {
            if (!this.field2128.method1160(var4, (byte) 127)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3556 >= var5) {
                        this.method745(var4, var6 + var5, var5, var6, -1, arg0);
                        var4.field3556 -= var5;
                        break;
                    }
                    this.method745(var4, var5 + var6, var4.field3556, var6, -1, arg0);
                    var5 -= var4.field3556;
                    var6 += var4.field3556;
                } while (!this.field2128.method1181(127, var5, arg0, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public static void method749(int arg0) {
        field2134 = null;
        if (arg0 != 0) {
            field2125 = 64;
        }
        field2136 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBIIIII)V")
    public static final void method750(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2142++;
        if (arg1 >= -62) {
            method746((byte[]) null, (byte) -20);
        }
        if (class51.field1099 <= arg5 && class198.field3587 >= arg2 && arg0 >= class11.field249 && class276.field4831 >= arg3) {
            if (arg4 == 1) {
                class209.method1437(arg6, arg2, arg5, arg3, arg0, (byte) 60);
            } else {
                class173.method1143(arg5, arg2, arg0, arg4, arg3, arg6, 1);
            }
        } else if (arg4 == 1) {
            class233.method1562(arg6, arg0, -94, arg2, arg3, arg5);
        } else {
            class216.method1465(false, arg2, arg5, arg4, arg0, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILbf;B)V")
    private final void method751(int arg0, class196 arg1, byte arg2) {
        field2141++;
        if ((this.field2128.field3234[arg1.field3564] & 0x4) != 0 && arg1.field3562 < 0) {
            int var4 = this.field2128.field3218[arg1.field3564] / class198.field3580;
            int var5 = (var4 + 1048575 - arg1.field3549) / var4;
            arg1.field3549 = arg0 * var4 + arg1.field3549 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field2128.field3229[arg1.field3564] == 0) {
                    arg1.field3567 = class199.method1387(arg1.field3569, arg1.field3567.method1366(), arg1.field3567.method1373(), arg1.field3567.method1348());
                } else {
                    arg1.field3567 = class199.method1387(arg1.field3569, arg1.field3567.method1366(), 0, arg1.field3567.method1348());
                    this.field2128.method1183(9133, arg1, arg1.field3575.field405[arg1.field3554] < 0);
                }
                if (arg1.field3575.field405[arg1.field3554] < 0) {
                    arg1.field3567.method1370(-1);
                }
                arg0 = arg1.field3549 / var4;
            }
        }
        if (arg2 > 37) {
            arg1.field3567.method744(arg0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)I")
    public static final int method752(int arg0, int arg1, int arg2) {
        if (arg0 >= -60) {
            field2136 = null;
        }
        field2137++;
        class103 var3 = (class103) class184.field3327.method31(-32665, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field1951.length > arg2) {
            return var3.field1951[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Ltg;)V")
    public class114(class177 arg0) {
        this.field2128 = arg0;
    }
}

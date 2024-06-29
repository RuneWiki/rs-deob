import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class390 {

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "Lka;")
    private class473 field5631 = new class473(64);

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "Ldk;")
    private class421 field5628;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "Ldk;")
    public class421 field5624;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Lrb;")
    public static class283 field5626 = new class283(95, -1);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "Lvu;")
    public static class155 field5634;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "Ldk;")
    public static class421 field5633;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
    public final void method2310(byte arg0) {
        field5630++;
        class473 var2 = this.field5631;
        synchronized (this.field5631) {
            if (arg0 == 40) {
                this.field5631.method2774((byte) 106);
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)V")
    public final void method2311(byte arg0, int arg1) {
        class473 var3 = this.field5631;
        synchronized (this.field5631) {
            if (arg0 != 89) {
                return;
            }
            this.field5631.method2779(14896, arg1);
        }
        field5627++;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIIII[[[Lwr;)Z")
    public static final boolean method2312(boolean arg0, int arg1, int arg2, int arg3, int arg4, class532[][][] arg5) {
        field5625++;
        if (arg1 != 9568256) {
            field5626 = null;
        }
        byte var6 = arg0 ? 1 : (byte) (class367.field5267 & 0xFF);
        if (class398.field5712[class366.field5260][arg4][arg2] == var6) {
            return false;
        } else if ((class27.field379[class366.field5260][arg4][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class168.field2563[var7] = arg4;
            int var8 = 0;
            int var35 = var7 + 1;
            class333.field4649[var7] = arg2;
            class398.field5712[class366.field5260][arg4][arg2] = var6;
            while (var35 != var8) {
                int var9 = class168.field2563[var8] & 0xFFFF;
                int var10 = (class168.field2563[var8] & 0xFFFFD0) >> 16;
                int var11 = class168.field2563[var8] >> 24 & 0xFF;
                int var12 = class333.field4649[var8] & 0xFFFF;
                int var13 = (class333.field4649[var8] & 0xFF735E) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class27.field379[class366.field5260][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class366.field5260 + 1; var16 <= 3; var16++) {
                    if ((class27.field379[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field7830 != null) {
                                int var20 = class181.method1235(64, var10);
                                if (arg5[var16][var9][var12].field7830.field2566 == var20 || arg5[var16][var9][var12].field7822 != null && arg5[var16][var9][var12].field7822.field2566 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class181.method1235(64, var11);
                                    if (arg5[var16][var9][var12].field7830.field2566 == var21 || arg5[var16][var9][var12].field7822 != null && arg5[var16][var9][var12].field7822.field2566 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class181.method1235(64, var13);
                                    if (arg5[var16][var9][var12].field7830.field2566 == var22 || arg5[var16][var9][var12].field7822 != null && arg5[var16][var9][var12].field7822.field2566 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class532 var23 = arg5[var16][var9][var12];
                            if (var23.field7828 != null) {
                                for (class201 var24 = var23.field7828; var24 != null; var24 = var24.field2918) {
                                    class434 var25 = var24.field2915;
                                    if (var25 instanceof class303) {
                                        class303 var26 = (class303) var25;
                                        int var27 = var26.method159(arg1 - 9568294);
                                        int var28 = var26.method157((byte) -22);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class532 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field7828 != null) {
                            for (class201 var31 = var30.field7828; var31 != null; var31 = var31.field2918) {
                                class434 var32 = var31.field2915;
                                if (var32.field6290 != var32.field6288 || var32.field6282 != var32.field6277) {
                                    for (int var33 = var32.field6290; var33 <= var32.field6288; var33++) {
                                        for (int var34 = var32.field6277; var34 <= var32.field6282; var34++) {
                                            class398.field5712[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class398.field5712[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class492.field7122[class366.field5260 + 1].method85(var9, var12);
                    if (var17 > class109.field1770[arg3]) {
                        class109.field1770[arg3] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class292.field3953[arg3] > var18) {
                        class292.field3953[arg3] = var18;
                    } else if (var18 > class437.field6310[arg3]) {
                        class437.field6310[arg3] = var18;
                    }
                    if (var19 < class278.field3785[arg3]) {
                        class278.field3785[arg3] = var19;
                    } else if (class325.field4447[arg3] < var19) {
                        class325.field4447[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class398.field5712[class366.field5260][var9 - 1][var12] != var6) {
                        class168.field2563[var35] = class219.method1367(class219.method1367(1179648, var9 - 1), -754974720);
                        class333.field4649[var35] = class219.method1367(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class398.field5712[class366.field5260][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class192.field2809;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class398.field5712[class366.field5260][var9 - 1][var12] != var6 && (class27.field379[class366.field5260][var9][var12] & 0x4) == 0 && (class27.field379[class366.field5260][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class168.field2563[var35] = class219.method1367(1375731712, class219.method1367(var9 - 1, 1179648));
                            class333.field4649[var35] = class219.method1367(1245184, var12);
                            class398.field5712[class366.field5260][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class398.field5712[class366.field5260][var9][var12] != var6) {
                            class168.field2563[var35] = class219.method1367(318767104, class219.method1367(var9, 5373952));
                            class333.field4649[var35] = class219.method1367(var12, 5439488);
                            class398.field5712[class366.field5260][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class9.field111 > var9 + 1 && class398.field5712[class366.field5260][var9 + 1][var12] != var6 && (class27.field379[class366.field5260][var9][var12] & 0x4) == 0 && (class27.field379[class366.field5260][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class168.field2563[var35] = class219.method1367(class219.method1367(5373952, var9 + 1), -1845493760);
                            class333.field4649[var35] = class219.method1367(var12, 5439488);
                            class398.field5712[class366.field5260][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class9.field111 > (var9 + 1) && class398.field5712[class366.field5260][var9 + 1][var12] != var6) {
                        class168.field2563[var35] = class219.method1367(class219.method1367(var9 + 1, 9568256), 1392508928);
                        class333.field4649[var35] = class219.method1367(var12, 9633792);
                        class398.field5712[class366.field5260][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class398.field5712[class366.field5260][var9 - 1][var12] != var6 && (class27.field379[class366.field5260][var9][var12] & 0x4) == 0 && (class27.field379[class366.field5260][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class168.field2563[var35] = class219.method1367(class219.method1367(13762560, var9 - 1), 301989888);
                            class333.field4649[var35] = class219.method1367(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class398.field5712[class366.field5260][var9 - 1][var12] = var6;
                        }
                        if (class398.field5712[class366.field5260][var9][var12] != var6) {
                            class168.field2563[var35] = class219.method1367(class219.method1367(13762560, var9), -1828716544);
                            class333.field4649[var35] = class219.method1367(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class398.field5712[class366.field5260][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class9.field111 && class398.field5712[class366.field5260][var9 + 1][var12] != var6 && (class27.field379[class366.field5260][var9][var12] & 0x4) == 0 && (class27.field379[class366.field5260][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class168.field2563[var35] = class219.method1367(class219.method1367(9568256, var9 + 1), -771751936);
                            class333.field4649[var35] = class219.method1367(9633792, var12);
                            class398.field5712[class366.field5260][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class109.field1770[arg3] != -1000000) {
                class109.field1770[arg3] += 10;
                class292.field3953[arg3] -= 50;
                class437.field6310[arg3] += 50;
                class325.field4447[arg3] += 50;
                class278.field3785[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public static void method2313(int arg0) {
        field5634 = null;
        field5626 = null;
        int var1 = -93 % ((30 - arg0) / 53);
        field5633 = null;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
    public final void method2314(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field5623++;
        class473 var2 = this.field5631;
        synchronized (this.field5631) {
            this.field5631.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "([ILpg;II[II)Lt;")
    public static final class397 method2315(int[] arg0, class333 arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field5629++;
        if (arg5 != 4526) {
            return null;
        }
        byte[] var6 = new byte[arg2 * arg3];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg3 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class397(arg1, arg3, arg2, var6);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lad;ILdk;Ldk;)V")
    public class390(class12 arg0, int arg1, class421 arg2, class421 arg3) {
        this.field5628 = arg2;
        this.field5624 = arg3;
        this.field5628.method2509(0, 3);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZ)Lhc;")
    public final class320 method2316(int arg0, boolean arg1) {
        field5632++;
        if (!arg1) {
            this.field5628 = null;
        }
        class473 var3 = this.field5631;
        class320 var4;
        synchronized (this.field5631) {
            var4 = (class320) this.field5631.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field5628;
        byte[] var6;
        synchronized (this.field5628) {
            var6 = this.field5628.method2512(3, (byte) -93, arg0);
        }
        class320 var7 = new class320();
        var7.field4408 = this;
        if (var6 != null) {
            var7.method1898((byte) 22, new class319(var6));
        }
        class473 var8 = this.field5631;
        synchronized (this.field5631) {
            this.field5631.method2777(-1025, var7, (long) arg0);
            return var7;
        }
    }
}

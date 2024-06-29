import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class375 {

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    private int field4878;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "B")
    public byte field4880;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Ldg;")
    public class375 field4866;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field4874 = 0;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4865 = "";

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field4864;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field4867;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public int field4868;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public int field4885;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZ[[[Lne;)Z")
    public static final boolean method2059(int arg0, int arg1, int arg2, int arg3, boolean arg4, class287[][][] arg5) {
        field4883++;
        byte var6 = arg4 ? 1 : (byte) (class273.field3463 & 0xFF);
        if (class242.field3146[class353.field4625][arg0][arg2] == var6) {
            return false;
        } else if (~(class379.field4922[class353.field4625][arg0][arg2] & 0x4) == arg1) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class64.field681[var7] = arg0;
            int var35 = var7 + 1;
            class470.field6560[var7] = arg2;
            class242.field3146[class353.field4625][arg0][arg2] = var6;
            while (var35 != var8) {
                int var9 = class64.field681[var8] & 0xFFFF;
                int var10 = class64.field681[var8] >> 16 & 0xFF;
                int var11 = class64.field681[var8] >> 24 & 0xFF;
                int var12 = class470.field6560[var8] & 0xFFFF;
                int var13 = class470.field6560[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class379.field4922[class353.field4625][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label233: for (int var16 = class353.field4625 + 1; var16 <= 3; var16++) {
                    if ((class379.field4922[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field3697 != null) {
                                int var20 = class502.method2889(var10, 0);
                                if (arg5[var16][var9][var12].field3697.field3158 == var20 || arg5[var16][var9][var12].field3690 != null && arg5[var16][var9][var12].field3690.field3158 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class502.method2889(var11, 0);
                                    if (arg5[var16][var9][var12].field3697.field3158 == var21 || arg5[var16][var9][var12].field3690 != null && arg5[var16][var9][var12].field3690.field3158 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class502.method2889(var13, arg1 + 1);
                                    if (arg5[var16][var9][var12].field3697.field3158 == var22 || arg5[var16][var9][var12].field3690 != null && arg5[var16][var9][var12].field3690.field3158 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class287 var23 = arg5[var16][var9][var12];
                            if (var23.field3680 != null) {
                                for (class60 var24 = var23.field3680; var24 != null; var24 = var24.field623) {
                                    class354 var25 = var24.field625;
                                    if (var25 instanceof class670) {
                                        class670 var26 = (class670) var25;
                                        int var27 = var26.method447((byte) -91);
                                        int var28 = var26.method443((byte) 51);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class287 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field3680 != null) {
                            for (class60 var31 = var30.field3680; var31 != null; var31 = var31.field623) {
                                class354 var32 = var31.field625;
                                if (var32.field4645 != var32.field4642 || var32.field4648 != var32.field4639) {
                                    for (int var33 = var32.field4642; var33 <= var32.field4645; var33++) {
                                        for (int var34 = var32.field4648; var34 <= var32.field4639; var34++) {
                                            class242.field3146[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class242.field3146[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class628.field8912[class353.field4625 + 1].method253(var9, var12);
                    if (class319.field4129[arg3] < var17) {
                        class319.field4129[arg3] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (var18 < class247.field3181[arg3]) {
                        class247.field3181[arg3] = var18;
                    } else if (var18 > class406.field5417[arg3]) {
                        class406.field5417[arg3] = var18;
                    }
                    if (class609.field8603[arg3] > var19) {
                        class609.field8603[arg3] = var19;
                    } else if (var19 > class353.field4629[arg3]) {
                        class353.field4629[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class242.field3146[class353.field4625][var9 - 1][var12] != var6) {
                        class64.field681[var35] = class139.method776(-754974720, class139.method776(var9 - 1, 1179648));
                        class470.field6560[var35] = class139.method776(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class242.field3146[class353.field4625][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class349.field4567) {
                        if ((var9 - 1) >= 0 && class242.field3146[class353.field4625][var9 - 1][var12] != var6 && (class379.field4922[class353.field4625][var9][var12] & 0x4) == 0 && (class379.field4922[class353.field4625][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class64.field681[var35] = class139.method776(class139.method776(var9 - 1, 1179648), 1375731712);
                            class470.field6560[var35] = class139.method776(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class242.field3146[class353.field4625][var9 - 1][var12] = var6;
                        }
                        if (class242.field3146[class353.field4625][var9][var12] != var6) {
                            class64.field681[var35] = class139.method776(318767104, class139.method776(5373952, var9));
                            class470.field6560[var35] = class139.method776(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class242.field3146[class353.field4625][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class399.field5338 && class242.field3146[class353.field4625][var9 + 1][var12] != var6 && (class379.field4922[class353.field4625][var9][var12] & 0x4) == 0 && (class379.field4922[class353.field4625][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class64.field681[var35] = class139.method776(-1845493760, class139.method776(var9 + 1, 5373952));
                            class470.field6560[var35] = class139.method776(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class242.field3146[class353.field4625][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class399.field5338 && class242.field3146[class353.field4625][var9 + 1][var12] != var6) {
                        class64.field681[var35] = class139.method776(class139.method776(9568256, var9 + 1), 1392508928);
                        class470.field6560[var35] = class139.method776(9633792, var12);
                        class242.field3146[class353.field4625][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class242.field3146[class353.field4625][var9 - 1][var12] != var6 && (class379.field4922[class353.field4625][var9][var12] & 0x4) == 0 && (class379.field4922[class353.field4625][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class64.field681[var35] = class139.method776(301989888, class139.method776(var9 - 1, 13762560));
                            class470.field6560[var35] = class139.method776(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class242.field3146[class353.field4625][var9 - 1][var12] = var6;
                        }
                        if (class242.field3146[class353.field4625][var9][var12] != var6) {
                            class64.field681[var35] = class139.method776(class139.method776(var9, 13762560), -1828716544);
                            class470.field6560[var35] = class139.method776(13828096, var12);
                            class242.field3146[class353.field4625][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class399.field5338 && class242.field3146[class353.field4625][var9 + 1][var12] != var6 && (class379.field4922[class353.field4625][var9][var12] & 0x4) == 0 && (class379.field4922[class353.field4625][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class64.field681[var35] = class139.method776(-771751936, class139.method776(var9 + 1, 9568256));
                            class470.field6560[var35] = class139.method776(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class242.field3146[class353.field4625][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class319.field4129[arg3] != -1000000) {
                class319.field4129[arg3] += 10;
                class247.field3181[arg3] -= 50;
                class406.field5417[arg3] += 50;
                class353.field4629[arg3] += 50;
                class609.field8603[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lvp;IIIII)V")
    public static final void method2060(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2054 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class2.field17[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class247 var13 = class256.field3279[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field2054; var14++) {
                            if (arg0.field2056[var14] == var13.field3189) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field2056[arg0.field2054++] = var13.field3189;
                        if (arg0.field2054 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field2054; var15 < 4; var15++) {
            arg0.field2056[var15] = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)Ldg;")
    public final class375 method2061(int arg0, int arg1, int arg2, int arg3) {
        field4876++;
        if (arg2 != -1553) {
            this.field4867 = -41;
        }
        return new class375(this.field4878, arg1, arg3, arg0, this.field4880);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method2062(int arg0) {
        field4865 = null;
        if (arg0 != 1375731712) {
            method2060(null, 55, -32, -30, 87, 17);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Lsf;")
    public final class478 method2063(int arg0) {
        if (arg0 != 5439488) {
            this.field4879 = 100;
        }
        field4873++;
        return class463.method2639(this.field4878, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2064(byte arg0, String arg1) {
        if (arg0 > -75) {
            method2059(80, 16, 74, 83, false, null);
        }
        field4872++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class487.method2819(2, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class210.field2549; var3++) {
            String var4 = class314.field4077[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class487.method2819(2, var4);
            if (var5 != null && var5.equals(var2)) {
                class210.field2549--;
                for (int var6 = var3; var6 < class210.field2549; var6++) {
                    class314.field4077[var6] = class314.field4077[var6 + 1];
                    class485.field7061[var6] = class485.field7061[var6 + 1];
                    class270.field3396[var6] = class270.field3396[var6 + 1];
                    class118.field1353[var6] = class118.field1353[var6 + 1];
                    class417.field5534[var6] = class417.field5534[var6 + 1];
                    class520.field7452[var6] = class520.field7452[var6 + 1];
                }
                class362.field4722++;
                class491.field7117 = class204.field2494;
                class480.method2802(class84.field897, 16751);
                class334.field4314.method2525(class265.method1504(arg1, (byte) 88), -81849);
                class334.field4314.method2573(arg1, 16746);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIB)V")
    public class375(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4877 = arg1;
        this.field4884 = arg2;
        this.field4882 = arg3;
        this.field4878 = arg0;
        this.field4880 = arg4;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ldg;I)V")
    public class375(class375 arg0, int arg1) {
        this.field4866 = arg0;
        this.field4878 = this.field4866.field4878;
        this.field4882 = this.field4866.field4882 + arg1;
        this.field4877 = this.field4866.field4877 + arg1;
        this.field4880 = this.field4866.field4880;
        this.field4884 = this.field4866.field4884 + arg1;
    }
}

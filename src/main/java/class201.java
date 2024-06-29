import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class201 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    private int field2608 = 0;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Lgq;")
    private class710 field2615 = null;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    private int field2610 = 0;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    private int field2612 = 0;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "Lji;")
    private class622 field2619;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "Lpm;")
    private class553 field2614;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "[Loj;")
    private class592[] field2609;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "Leb;")
    public class8 field2617;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "Lnj;")
    public static class415 field2616 = new class415(9, 6);

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Z")
    public static boolean field2618 = false;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Leg;")
    public static class366 field2620 = new class366();

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Lme;")
    public static class668 field2622 = new class668(5);

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "F")
    public static float field2623;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B[[[Lgn;ZIII)Z", line = 7)
    public static final boolean method1310(byte arg0, class530[][][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2606++;
        byte var6 = arg2 ? 1 : (byte) (class413.field5318 & 0xFF);
        if (class605.field8192[class390.field4991][arg3][arg4] == var6) {
            return false;
        } else if ((class159.field1994[class390.field4991][arg3][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class210.field2697[var7] = arg3;
            int var35 = var7 + 1;
            class196.field2571[var7] = arg4;
            class605.field8192[class390.field4991][arg3][arg4] = var6;
            while (var35 != var8) {
                int var9 = class210.field2697[var8] & 0xFFFF;
                int var10 = class210.field2697[var8] >> 16 & 0xFF;
                int var11 = class210.field2697[var8] >> 24 & 0xFF;
                int var12 = class196.field2571[var8] & 0xFFFF;
                int var13 = (class196.field2571[var8] & 0xFFE0BA) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class159.field1994[class390.field4991][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class390.field4991 + 1; var16 <= 3; var16++) {
                    if ((class159.field1994[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field6879 != null) {
                                int var20 = class265.method1640(var10, arg0 + 73);
                                if (arg1[var16][var9][var12].field6879.field188 == var20 || arg1[var16][var9][var12].field6886 != null && arg1[var16][var9][var12].field6886.field188 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class265.method1640(var11, arg0 + 73);
                                    if (arg1[var16][var9][var12].field6879.field188 == var21 || arg1[var16][var9][var12].field6886 != null && arg1[var16][var9][var12].field6886.field188 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class265.method1640(var13, -2);
                                    if (arg1[var16][var9][var12].field6879.field188 == var22 || arg1[var16][var9][var12].field6886 != null && arg1[var16][var9][var12].field6886.field188 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class530 var23 = arg1[var16][var9][var12];
                            if (var23.field6887 != null) {
                                for (class571 var24 = var23.field6887; var24 != null; var24 = var24.field7445) {
                                    class34 var25 = var24.field7444;
                                    if (var25 instanceof class620) {
                                        class620 var26 = (class620) var25;
                                        int var27 = var26.method66((byte) -42);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method70(true);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class530 var30 = arg1[var16][var9][var12];
                        if (var30 != null && var30.field6887 != null) {
                            for (class571 var31 = var30.field6887; var31 != null; var31 = var31.field7445) {
                                class34 var32 = var31.field7444;
                                if (var32.field501 != var32.field497 || var32.field505 != var32.field502) {
                                    for (int var33 = var32.field497; var33 <= var32.field501; var33++) {
                                        for (int var34 = var32.field502; var34 <= var32.field505; var34++) {
                                            class605.field8192[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class605.field8192[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class392.field4997[class390.field4991 + 1].method668(var9, var12);
                    if (var17 > class625.field8742[arg5]) {
                        class625.field8742[arg5] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (class505.field6644[arg5] > var18) {
                        class505.field6644[arg5] = var18;
                    } else if (class457.field5991[arg5] < var18) {
                        class457.field5991[arg5] = var18;
                    }
                    if (var19 < class37.field544[arg5]) {
                        class37.field544[arg5] = var19;
                    } else if (class354.field4578[arg5] < var19) {
                        class354.field4578[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class605.field8192[class390.field4991][var9 - 1][var12] != var6) {
                        class210.field2697[var35] = class131.method954(-754974720, class131.method954(1179648, var9 - 1));
                        class196.field2571[var35] = class131.method954(var12, 1245184);
                        class605.field8192[class390.field4991][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class656.field9155 > var12) {
                        if ((var9 - 1) >= 0 && class605.field8192[class390.field4991][var9 - 1][var12] != var6 && (class159.field1994[class390.field4991][var9][var12] & 0x4) == 0 && (class159.field1994[class390.field4991][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class210.field2697[var35] = class131.method954(1375731712, class131.method954(var9 - 1, 1179648));
                            class196.field2571[var35] = class131.method954(var12, 1245184);
                            class605.field8192[class390.field4991][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class605.field8192[class390.field4991][var9][var12] != var6) {
                            class210.field2697[var35] = class131.method954(class131.method954(5373952, var9), 318767104);
                            class196.field2571[var35] = class131.method954(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class605.field8192[class390.field4991][var9][var12] = var6;
                        }
                        if (var9 + 1 < class611.field8258 && class605.field8192[class390.field4991][var9 + 1][var12] != var6 && (class159.field1994[class390.field4991][var9][var12] & 0x4) == 0 && (class159.field1994[class390.field4991][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class210.field2697[var35] = class131.method954(class131.method954(var9 + 1, 5373952), -1845493760);
                            class196.field2571[var35] = class131.method954(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class605.field8192[class390.field4991][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class611.field8258 && class605.field8192[class390.field4991][var9 + 1][var12] != var6) {
                        class210.field2697[var35] = class131.method954(1392508928, class131.method954(var9 + 1, 9568256));
                        class196.field2571[var35] = class131.method954(9633792, var12);
                        class605.field8192[class390.field4991][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class605.field8192[class390.field4991][var9 - 1][var12] != var6 && (class159.field1994[class390.field4991][var9][var12] & 0x4) == 0 && (class159.field1994[class390.field4991][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class210.field2697[var35] = class131.method954(class131.method954(var9 - 1, 13762560), 301989888);
                            class196.field2571[var35] = class131.method954(var12, 13828096);
                            class605.field8192[class390.field4991][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class605.field8192[class390.field4991][var9][var12] != var6) {
                            class210.field2697[var35] = class131.method954(class131.method954(var9, 13762560), -1828716544);
                            class196.field2571[var35] = class131.method954(13828096, var12);
                            class605.field8192[class390.field4991][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class611.field8258 && class605.field8192[class390.field4991][var9 + 1][var12] != var6 && (class159.field1994[class390.field4991][var9][var12] & 0x4) == 0 && (class159.field1994[class390.field4991][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class210.field2697[var35] = class131.method954(class131.method954(9568256, var9 + 1), -771751936);
                            class196.field2571[var35] = class131.method954(9633792, var12);
                            class605.field8192[class390.field4991][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (arg0 != -75) {
                field2620 = null;
            }
            if (class625.field8742[arg5] != -1000000) {
                class625.field8742[arg5] += 10;
                class505.field6644[arg5] -= 50;
                class457.field5991[arg5] += 50;
                class354.field4578[arg5] += 50;
                class37.field544[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 328)
    public static void method1311(int arg0) {
        field2616 = null;
        if (arg0 <= -21) {
            field2622 = null;
            field2620 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)Z", line = 340)
    public final boolean method1312(byte arg0, int arg1) {
        if (arg0 != -97) {
            this.field2617 = null;
        }
        field2611++;
        return this.field2609[arg1].method30((byte) -97);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZZIIZ)V", line = 352)
    public final void method1313(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg1 & this.field2619.method387();
        field2607++;
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg3 = arg0;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg2) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (!arg5) {
            field2620 = null;
        }
        if (this.field2608 != arg4) {
            if (this.field2608 != 0) {
                this.field2609[Integer.MAX_VALUE & this.field2608].method29(-1640);
            }
            if (arg4 != 0) {
                this.field2609[arg4 & Integer.MAX_VALUE].method32(-1, arg2);
                this.field2609[arg4 & Integer.MAX_VALUE].method27(arg2, (byte) -72);
                this.field2609[arg4 & Integer.MAX_VALUE].method33(!arg5, arg0, arg3);
            }
            this.field2612 = arg0;
            this.field2608 = arg4;
            this.field2610 = arg3;
            this.field2615 = null;
        } else if (this.field2608 != 0) {
            this.field2609[this.field2608 & Integer.MAX_VALUE].method27(arg2, (byte) -101);
            if (this.field2612 != arg0 || this.field2610 != arg3) {
                this.field2609[Integer.MAX_VALUE & this.field2608].method33(!arg5, arg0, arg3);
                this.field2612 = arg0;
                this.field2610 = arg3;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLgq;I)Z", line = 409)
    public final boolean method1314(byte arg0, class710 arg1, int arg2) {
        field2621++;
        if (this.field2608 == 0) {
            return false;
        }
        if (this.field2615 != arg1) {
            this.field2609[Integer.MAX_VALUE & this.field2608].method35(arg2, 458752, arg1);
            this.field2615 = arg1;
        }
        if (arg0 > -87) {
            method1311(45);
        }
        return true;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lji;)V", line = 488)
    public class201(class622 arg0) {
        this.field2619 = arg0;
        this.field2614 = new class553(arg0);
        this.field2609 = new class592[10];
        this.field2609[1] = new class454(arg0);
        this.field2609[2] = new class23(arg0, this.field2614);
        this.field2609[4] = new class491(arg0, this.field2614);
        this.field2609[5] = new class510(arg0, this.field2614);
        this.field2609[6] = new class425(arg0);
        this.field2609[7] = new class349(arg0);
        this.field2609[3] = this.field2617 = new class8(arg0);
        this.field2609[8] = new class278(arg0, this.field2614);
        this.field2609[9] = new class638(arg0, this.field2614);
        if (!this.field2609[8].method30((byte) -103)) {
            this.field2609[8] = this.field2609[4];
        }
        if (!this.field2609[9].method30((byte) -102)) {
            this.field2609[9] = this.field2609[8];
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lmca;IZ)Lsr;", line = 461)
    public static final class571 method1315(class34 arg0, int arg1, boolean arg2) {
        field2613++;
        class571 var3;
        if (class589.field7997 == null) {
            var3 = new class571();
        } else {
            var3 = class589.field7997;
            class589.field7997 = class589.field7997.field7445;
            var3.field7445 = null;
            class499.field6558--;
        }
        if (arg2) {
            return null;
        } else {
            var3.field7443 = arg1;
            var3.field7444 = arg0;
            return var3;
        }
    }
}

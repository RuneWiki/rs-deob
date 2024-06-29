import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class279 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lka;")
    public static class408 field3801;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lsa;")
    public static class412 field3802;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lhc;")
    public static class368 field3804;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[[I")
    public static int[][] field3805;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLrg;)V")
    public final void method1757(byte arg0, class366 arg1) {
        int var3 = 103 / ((arg0 - 63) / 44);
        while (true) {
            int var4 = arg1.method2306((byte) 26);
            if (var4 == 0) {
                field3798++;
                return;
            }
            this.method1760(arg1, 54, var4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1758(int arg0) {
        field3801 = null;
        field3804 = null;
        field3805 = null;
        if (arg0 == 4) {
            field3802 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([[[Lr;IIIIZ)Z")
    public static final boolean method1759(class63[][][] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3803++;
        byte var6 = arg5 ? 1 : (byte) (class368.field5106 & 0xFF);
        if (class237.field3379[class343.field4623][arg3][arg1] == var6) {
            return false;
        } else if ((class302.field4122[class343.field4623][arg3][arg1] & arg2) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class56.field736[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class30.field418[var7] = arg1;
            class237.field3379[class343.field4623][arg3][arg1] = var6;
            while (var35 != var8) {
                int var9 = class56.field736[var8] & 0xFFFF;
                int var10 = class56.field736[var8] >> 16 & 0xFF;
                int var11 = class56.field736[var8] >> 24 & 0xFF;
                int var12 = class30.field418[var8] & 0xFFFF;
                int var13 = class30.field418[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class302.field4122[class343.field4623][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label233: for (int var16 = class343.field4623 + 1; var16 <= 3; var16++) {
                    if ((class302.field4122[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field867 != null) {
                                int var20 = class55.method440(-19, var10);
                                if (arg0[var16][var9][var12].field867.field5570 == var20 || arg0[var16][var9][var12].field863 != null && arg0[var16][var9][var12].field863.field5570 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class55.method440(-19, var11);
                                    if (arg0[var16][var9][var12].field867.field5570 == var21 || arg0[var16][var9][var12].field863 != null && arg0[var16][var9][var12].field863.field5570 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class55.method440(-19, var13);
                                    if (arg0[var16][var9][var12].field867.field5570 == var22 || arg0[var16][var9][var12].field863 != null && arg0[var16][var9][var12].field863.field5570 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class63 var23 = arg0[var16][var9][var12];
                            if (var23.field853 != null) {
                                for (class48 var24 = var23.field853; var24 != null; var24 = var24.field608) {
                                    class5 var25 = var24.field617;
                                    if (var25 instanceof class223) {
                                        class223 var26 = (class223) var25;
                                        int var27 = var26.method695(arg2 + 894);
                                        int var28 = var26.method709(30030);
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
                        class63 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field853 != null) {
                            for (class48 var31 = var30.field853; var31 != null; var31 = var31.field608) {
                                class5 var32 = var31.field617;
                                if (var32.field52 != var32.field47 || var32.field55 != var32.field41) {
                                    for (int var33 = var32.field52; var33 <= var32.field47; var33++) {
                                        for (int var34 = var32.field55; var34 <= var32.field41; var34++) {
                                            class237.field3379[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class237.field3379[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class436.field6160[class343.field4623 + 1].method329(var9, var12);
                    if (var17 > class344.field4658[arg4]) {
                        class344.field4658[arg4] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class219.field3080[arg4] > var18) {
                        class219.field3080[arg4] = var18;
                    } else if (var18 > class149.field2164[arg4]) {
                        class149.field2164[arg4] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class196.field2844[arg4]) {
                        class196.field2844[arg4] = var19;
                    } else if (var19 > class191.field2756[arg4]) {
                        class191.field2756[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class237.field3379[class343.field4623][var9 - 1][var12] != var6) {
                        class56.field736[var35] = class431.method2655(class431.method2655(1179648, var9 - 1), -754974720);
                        class30.field418[var35] = class431.method2655(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class237.field3379[class343.field4623][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class264.field3620) {
                        if ((var9 - 1) >= 0 && class237.field3379[class343.field4623][var9 - 1][var12] != var6 && (class302.field4122[class343.field4623][var9][var12] & 0x4) == 0 && (class302.field4122[class343.field4623][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class56.field736[var35] = class431.method2655(1375731712, class431.method2655(1179648, var9 - 1));
                            class30.field418[var35] = class431.method2655(var12, 1245184);
                            class237.field3379[class343.field4623][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class237.field3379[class343.field4623][var9][var12] != var6) {
                            class56.field736[var35] = class431.method2655(318767104, class431.method2655(5373952, var9));
                            class30.field418[var35] = class431.method2655(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class237.field3379[class343.field4623][var9][var12] = var6;
                        }
                        if (class11.field107 > var9 + 1 && class237.field3379[class343.field4623][var9 + 1][var12] != var6 && (class302.field4122[class343.field4623][var9][var12] & 0x4) == 0 && (class302.field4122[class343.field4623][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class56.field736[var35] = class431.method2655(class431.method2655(var9 + 1, 5373952), -1845493760);
                            class30.field418[var35] = class431.method2655(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class237.field3379[class343.field4623][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class11.field107 && class237.field3379[class343.field4623][var9 + 1][var12] != var6) {
                        class56.field736[var35] = class431.method2655(1392508928, class431.method2655(9568256, var9 + 1));
                        class30.field418[var35] = class431.method2655(var12, 9633792);
                        class237.field3379[class343.field4623][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class237.field3379[class343.field4623][var9 - 1][var12] != var6 && (class302.field4122[class343.field4623][var9][var12] & 0x4) == 0 && (class302.field4122[class343.field4623][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class56.field736[var35] = class431.method2655(class431.method2655(var9 - 1, 13762560), 301989888);
                            class30.field418[var35] = class431.method2655(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class237.field3379[class343.field4623][var9 - 1][var12] = var6;
                        }
                        if (class237.field3379[class343.field4623][var9][var12] != var6) {
                            class56.field736[var35] = class431.method2655(class431.method2655(13762560, var9), -1828716544);
                            class30.field418[var35] = class431.method2655(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class237.field3379[class343.field4623][var9][var12] = var6;
                        }
                        if (class11.field107 > (var9 + 1) && class237.field3379[class343.field4623][var9 + 1][var12] != var6 && (class302.field4122[class343.field4623][var9][var12] & 0x4) == 0 && (class302.field4122[class343.field4623][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class56.field736[var35] = class431.method2655(-771751936, class431.method2655(9568256, var9 + 1));
                            class30.field418[var35] = class431.method2655(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class237.field3379[class343.field4623][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class344.field4658[arg4] != -1000000) {
                class344.field4658[arg4] += 10;
                class219.field3080[arg4] -= 50;
                class149.field2164[arg4] += 50;
                class191.field2756[arg4] += 50;
                class196.field2844[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lrg;II)V")
    private final void method1760(class366 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field3796 = arg0.method2297(13352);
            this.field3800 = arg0.method2306((byte) 56);
            this.field3797 = arg0.method2306((byte) 89);
        }
        if (arg1 <= 48) {
            field3805 = null;
        }
        field3806++;
    }

    static {
        new class368("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field3801 = new class408(64);
        field3802 = new class412(0, 0);
        field3804 = new class368("wave2:", "welle2:", "ondulation2:", "onda2:");
        field3805 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
    }
}

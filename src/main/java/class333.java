import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class333 implements class21 {

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "Ljava/lang/String;")
    public String field4574;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public int field4571;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public int field4573;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Lcp;")
    public class679 field4567;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Lrt;")
    public class212 field4563;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public int field4572;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Ldb;")
    public static class298 field4561 = new class298(109, 19);

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Lcu;")
    public static class206 field4576 = new class206(19, 15);

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "[S")
    public static short[] field4578 = new short[256];

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Los;", line = 3)
    public final class412 method193(byte arg0) {
        field4570++;
        if (arg0 >= -21) {
            this.method193((byte) 55);
        }
        return class464.field6265;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([[[Lfba;IIZZI)Z", line = 15)
    public static final boolean method1975(class24[][][] arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field4568++;
        byte var6 = arg4 ? 1 : (byte) (class20.field321 & 0xFF);
        if (class431.field5903[class29.field476][arg5][arg2] == var6) {
            return false;
        } else if ((class477.field6362[class29.field476][arg5][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class97.field1467[var7] = arg5;
            int var35 = var7 + 1;
            class373.field5042[var7] = arg2;
            class431.field5903[class29.field476][arg5][arg2] = var6;
            while (var35 != var8) {
                int var9 = class97.field1467[var8] & 0xFFFF;
                int var10 = class97.field1467[var8] >> 16 & 0xFF;
                int var11 = class97.field1467[var8] >> 24 & 0xFF;
                int var12 = class373.field5042[var8] & 0xFFFF;
                int var13 = class373.field5042[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class477.field6362[class29.field476][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label242: for (int var16 = class29.field476 + 1; var16 <= 3; var16++) {
                    if ((class477.field6362[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field411 != null) {
                                int var20 = class301.method1832(var10, -15);
                                if (arg0[var16][var9][var12].field411.field6357 == var20 || arg0[var16][var9][var12].field406 != null && arg0[var16][var9][var12].field406.field6357 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class301.method1832(var11, -115);
                                    if (arg0[var16][var9][var12].field411.field6357 == var21 || arg0[var16][var9][var12].field406 != null && arg0[var16][var9][var12].field406.field6357 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class301.method1832(var13, 114);
                                    if (arg0[var16][var9][var12].field411.field6357 == var22 || arg0[var16][var9][var12].field406 != null && arg0[var16][var9][var12].field406.field6357 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class24 var23 = arg0[var16][var9][var12];
                            if (var23.field409 != null) {
                                for (class684 var24 = var23.field409; var24 != null; var24 = var24.field9618) {
                                    class641 var25 = var24.field9619;
                                    if (var25 instanceof class532) {
                                        class532 var26 = (class532) var25;
                                        int var27 = var26.method151((byte) 78);
                                        int var28 = var26.method152(!arg3);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label242;
                                        }
                                    }
                                }
                            }
                        }
                        class24 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field409 != null) {
                            for (class684 var31 = var30.field409; var31 != null; var31 = var31.field9618) {
                                class641 var32 = var31.field9619;
                                if (var32.field8622 != var32.field8611 || var32.field8618 != var32.field8610) {
                                    for (int var33 = var32.field8611; var33 <= var32.field8622; var33++) {
                                        for (int var34 = var32.field8618; var34 <= var32.field8610; var34++) {
                                            class431.field5903[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class431.field5903[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class218.field3099[class29.field476 + 1].method195(var9, var12);
                    if (class405.field5463[arg1] < var17) {
                        class405.field5463[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 < class235.field3314[arg1]) {
                        class235.field3314[arg1] = var18;
                    } else if (class267.field3709[arg1] < var18) {
                        class267.field3709[arg1] = var18;
                    }
                    int var19 = var12 << 9;
                    if (var19 < class693.field9749[arg1]) {
                        class693.field9749[arg1] = var19;
                    } else if (var19 > class11.field206[arg1]) {
                        class11.field206[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class431.field5903[class29.field476][var9 - 1][var12] != var6) {
                        class97.field1467[var35] = class220.method1393(-754974720, class220.method1393(var9 - 1, 1179648));
                        class373.field5042[var35] = class220.method1393(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class431.field5903[class29.field476][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class34.field531;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class431.field5903[class29.field476][var9 - 1][var12] != var6 && (class477.field6362[class29.field476][var9][var12] & 0x4) == 0 && (class477.field6362[class29.field476][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class97.field1467[var35] = class220.method1393(1375731712, class220.method1393(var9 - 1, 1179648));
                            class373.field5042[var35] = class220.method1393(var12, 1245184);
                            class431.field5903[class29.field476][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class431.field5903[class29.field476][var9][var12] != var6) {
                            class97.field1467[var35] = class220.method1393(class220.method1393(var9, 5373952), 318767104);
                            class373.field5042[var35] = class220.method1393(var12, 5439488);
                            class431.field5903[class29.field476][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class34.field530 > var9 + 1 && class431.field5903[class29.field476][var9 + 1][var12] != var6 && (class477.field6362[class29.field476][var9][var12] & 0x4) == 0 && (class477.field6362[class29.field476][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class97.field1467[var35] = class220.method1393(class220.method1393(5373952, var9 + 1), -1845493760);
                            class373.field5042[var35] = class220.method1393(var12, 5439488);
                            class431.field5903[class29.field476][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class34.field530 && class431.field5903[class29.field476][var9 + 1][var12] != var6) {
                        class97.field1467[var35] = class220.method1393(class220.method1393(9568256, var9 + 1), 1392508928);
                        class373.field5042[var35] = class220.method1393(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class431.field5903[class29.field476][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class431.field5903[class29.field476][var9 - 1][var12] != var6 && (class477.field6362[class29.field476][var9][var12] & 0x4) == 0 && (class477.field6362[class29.field476][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class97.field1467[var35] = class220.method1393(301989888, class220.method1393(13762560, var9 - 1));
                            class373.field5042[var35] = class220.method1393(var12, 13828096);
                            class431.field5903[class29.field476][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class431.field5903[class29.field476][var9][var12] != var6) {
                            class97.field1467[var35] = class220.method1393(class220.method1393(13762560, var9), -1828716544);
                            class373.field5042[var35] = class220.method1393(var12, 13828096);
                            class431.field5903[class29.field476][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class34.field530 > var9 + 1 && class431.field5903[class29.field476][var9 + 1][var12] != var6 && (class477.field6362[class29.field476][var9][var12] & 0x4) == 0 && (class477.field6362[class29.field476][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class97.field1467[var35] = class220.method1393(-771751936, class220.method1393(9568256, var9 + 1));
                            class373.field5042[var35] = class220.method1393(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class431.field5903[class29.field476][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class405.field5463[arg1] != -1000000) {
                class405.field5463[arg1] += 10;
                class235.field3314[arg1] -= 50;
                class267.field3709[arg1] += 50;
                class11.field206[arg1] += 50;
                class693.field9749[arg1] -= 50;
            }
            if (arg3) {
                field4578 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V", line = 333)
    public static void method1976(boolean arg0) {
        field4561 = null;
        if (!arg0) {
            method1977((byte) 72);
        }
        field4578 = null;
        field4576 = null;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)V", line = 357)
    public static final void method1977(byte arg0) {
        class391.field5161 = 0;
        class344.field4713 = 0;
        class124.field2085 = 0;
        class692.field9745 = 0;
        field4560++;
        if (arg0 != -54) {
            method1975(null, -16, -106, false, true, 73);
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;Lrt;Lcp;IIIIIIIIII)V", line = 378)
    public class333(String arg0, class212 arg1, class679 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field4564 = arg12;
        this.field4575 = arg3;
        this.field4574 = arg0;
        this.field4565 = arg5;
        this.field4571 = arg9;
        this.field4566 = arg8;
        this.field4569 = arg11;
        this.field4573 = arg10;
        this.field4567 = arg2;
        this.field4563 = arg1;
        this.field4562 = arg6;
        this.field4572 = arg7;
        this.field4577 = arg4;
    }
}

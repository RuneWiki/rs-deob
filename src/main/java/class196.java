import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class196 extends class304 {

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field3021 = -1;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "Ljd;")
    public static class95 field3022;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 7)
    public class196() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I", line = 11)
    public final int[] method71(int arg0, int arg1) {
        field3023++;
        if (arg0 != 7) {
            method1434((class161[]) null, -18, (byte) 11);
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[][] var4 = this.method2082(0, (byte) -83, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class218.field3333; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I", line = 53)
    public static final int method1433(byte arg0) {
        field3019++;
        if (arg0 <= 114) {
            return 93;
        } else if (class224.field3430 == 0) {
            return 0;
        } else {
            return class178.field2831[class224.field3430].method352();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([Lmn;IB)V", line = 72)
    public static final void method1434(class161[] arg0, int arg1, byte arg2) {
        field3018++;
        if (arg2 != -10) {
            field3024 = 99;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class161 var4 = arg0[var3];
            if (var4 != null && var4.field2566 == arg1 && (!var4.field2550 || !client.method1002(var4))) {
                if (var4.field2590 == 0) {
                    if (!var4.field2550 && client.method1002(var4) && class3.field40 != var4) {
                        continue;
                    }
                    method1434(arg0, var4.field2615, (byte) -10);
                    if (var4.field2509 != null) {
                        method1434(var4.field2509, var4.field2615, (byte) -10);
                    }
                    class242 var5 = (class242) class222.field3383.method1716(-1, (long) var4.field2615);
                    if (var5 != null) {
                        class13.method98(-17099, var5.field3689);
                    }
                }
                if (var4.field2590 == 6) {
                    if (var4.field2494 != -1 || var4.field2458 != -1) {
                        boolean var6 = class304.method2083(true, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2458;
                        } else {
                            var7 = var4.field2494;
                        }
                        if (var7 != -1) {
                            class28 var8 = client.method1010(var7, (byte) 127);
                            if (var8 != null) {
                                var4.field2470 += class228.field3488;
                                while (var8.field328[var4.field2460] < var4.field2470) {
                                    var4.field2470 -= var8.field328[var4.field2460];
                                    var4.field2460++;
                                    if (var4.field2460 >= var8.field312.length) {
                                        var4.field2460 -= var8.field339;
                                        if (var4.field2460 < 0 || var8.field312.length <= var4.field2460) {
                                            var4.field2460 = 0;
                                        }
                                    }
                                    var4.field2532 = var4.field2460 + 1;
                                    if (var4.field2532 >= var8.field312.length) {
                                        var4.field2532 -= var8.field339;
                                        if (var4.field2532 < 0 || var4.field2532 >= var8.field312.length) {
                                            var4.field2532 = -1;
                                        }
                                    }
                                    class254.method1776(4, var4);
                                }
                            }
                        }
                    }
                    if (var4.field2617 != 0 && !var4.field2550) {
                        int var9 = var4.field2617 >> 16;
                        int var10 = class228.field3488 * var9;
                        var4.field2622 = var4.field2622 + var10 & 0x7FF;
                        int var11 = var4.field2617 << 16 >> 16;
                        int var12 = class228.field3488 * var11;
                        var4.field2473 = var4.field2473 + var12 & 0x7FF;
                        class254.method1776(4, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 190)
    public static void method1435(boolean arg0) {
        field3022 = null;
        if (arg0) {
            method1434((class161[]) null, 66, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILge;Lge;)V", line = 203)
    public static final void method1436(int arg0, class325 arg1, class325 arg2) {
        if (arg1.field5018 != null) {
            arg1.method2257(false);
        }
        field3020++;
        arg1.field5017 = arg2.field5017;
        arg1.field5018 = arg2;
        arg1.field5018.field5017 = arg1;
        if (arg0 > -114) {
            method1436(86, (class325) null, (class325) null);
        }
        arg1.field5017.field5018 = arg1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class106 extends class372 {

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    private int field1600 = 0;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lnt;")
    private class152 field1596 = new class152();

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lmv;")
    public static class259 field1598;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lci;")
    public static class320 field1605;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method769(int arg0) {
        while (super.field5365 != super.field5359) {
            this.method771((byte) -40);
        }
        ++field1604;
        if (arg0 > -76) {
            method774(-121, 8, (byte[]) null, (byte[]) null, (byte) -13, -2, -17, -99, 97);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
    public final void method770(int arg0, int arg1) {
        ++field1601;
        super.field5367[super.field5359] = (byte) arg0;
        ++super.field5359;
        if (arg1 != -26602) {
            this.method770(-86, -125);
        }
        if (super.field5359 >= 5000) {
            super.field5359 = 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    private final void method771(byte arg0) {
        ++field1599;
        int var2 = super.field5365++;
        if (~super.field5365 <= -5001) {
            super.field5365 = 0;
        }
        this.field1600 = super.field5367[var2];
        Object var3 = super.field5357[var2];
        super.field5357[var2] = null;
        if (arg0 == -40) {
            if (~this.field1600 == -22) {
                class117.method851(this.field1596, (class188) var3);
            } else {
                if (~this.field1600 != -21) {
                    if (~this.field1600 <= -31 && this.field1600 <= 33) {
                        class141.field2179.method221(3000.0F, super.field5362[var2] * 1.5F);
                        ((class24) var3).method152(class295.field4418, class118.field1845, class272.field4085, class334.field4958, ~(this.field1600 + -30) == -1);
                        return;
                    }
                    if (this.field1600 >= 40 && ~this.field1600 >= -44) {
                        class141.field2179.method221(3000.0F, super.field5362[var2] * 1.5F);
                        ((class24) var3).method152(class295.field4418, class118.field1845, class272.field4085, class214.field3232, ~(this.field1600 + -40) == -1);
                        return;
                    }
                    if (this.field1600 == 22) {
                        class141.field2179.method190(-1, 1583160, 40, 127);
                        return;
                    }
                    if (this.field1600 == 23) {
                        class141.field2179.method305();
                        return;
                    }
                    if (this.field1600 == 24) {
                        class141.field2179.method226(0, (class369[]) null);
                        return;
                    }
                } else {
                    class188 var4 = (class188) var3;
                    if (var4.field2764 != null) {
                        var4.field2764.method552(class141.field2179, (byte) -120);
                    }
                    if (var4.field2751 != null) {
                        var4.field2751.method552(class141.field2179, (byte) -125);
                    }
                    if (var4.field2755 != null) {
                        var4.field2755.method552(class141.field2179, (byte) -128);
                    }
                    if (var4.field2774 != null) {
                        var4.field2774.method552(class141.field2179, (byte) -124);
                    }
                    if (var4.field2756 != null) {
                        var4.field2756.method552(class141.field2179, (byte) -127);
                    }
                    for (class317 var5 = var4.field2773; var5 != null; var5 = var5.field4709) {
                        var5.field4711.method552(class141.field2179, (byte) -120);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lmm;Z)V")
    public final void method772(class188 arg0, boolean arg1) {
        if (!arg1) {
            this.method777((byte) 9);
        }
        super.field5367[super.field5359] = 20;
        ++field1609;
        super.field5357[super.field5359] = arg0;
        ++super.field5359;
        if (super.field5359 >= 5000) {
            super.field5359 = 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method773(int arg0) {
        field1605 = null;
        if (arg0 == -17926) {
            field1598 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[B[BBIIII)V")
    public static final void method774(int arg0, int arg1, byte[] arg2, byte[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != -53) {
            field1605 = null;
        }
        ++field1607;
        int var9 = -(arg7 >> 2);
        int var10 = -(3 & arg7);
        for (int var11 = -arg8; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg3[arg5++]);
                int var14 = arg1++;
                arg2[var14] = (byte) (arg2[var14] + -arg3[arg5++]);
                int var15 = arg1++;
                arg2[var15] = (byte) (arg2[var15] + -arg3[arg5++]);
                int var16 = arg1++;
                arg2[var16] = (byte) (arg2[var16] + -arg3[arg5++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg3[arg5++]);
            }
            arg1 += arg0;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLmm;)V")
    public final void method775(byte arg0, class188 arg1) {
        ++field1603;
        super.field5367[super.field5359] = 21;
        super.field5357[super.field5359] = arg1;
        ++super.field5359;
        if (super.field5359 >= 5000) {
            super.field5359 = 0;
        }
        if (arg0 > 0) {
            this.method775((byte) -97, (class188) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILmm;)V")
    public final void method776(int arg0, class188 arg1) {
        --super.field5365;
        ++field1606;
        if (super.field5365 < arg0) {
            super.field5365 = 4999;
        }
        super.field5367[super.field5365] = 21;
        super.field5357[super.field5365] = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public final void method777(byte arg0) {
        int var2 = 38 % ((48 - arg0) / 62);
        ++field1608;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lo;ZFII)V")
    public final void method778(class24 arg0, boolean arg1, float arg2, int arg3, int arg4) {
        ++field1597;
        super.field5367[super.field5359] = (byte) (arg1 ? arg4 + 40 : arg4 + 30);
        super.field5357[super.field5359] = arg0;
        if (arg3 > -18) {
            method781(false, (String) null, 6);
        }
        super.field5362[super.field5359] = arg2;
        ++super.field5359;
        if (super.field5359 >= 5000) {
            super.field5359 = 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method779(int arg0, int arg1, int arg2, int arg3) {
        if (!class526.method3116(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class322.field4795;
            int var5 = arg2 << class322.field4795;
            int var6 = class146.field2262[arg0].method156(arg1, arg2) - 1;
            int var7 = var6 - (120 << class322.field4795 - 7);
            int var8 = var6 - (230 << class322.field4795 - 7);
            int var9 = var6 - (238 << class322.field4795 - 7);
            if (arg3 == 1) {
                if (var4 > class510.field7387) {
                    if (!class544.method3193(var4, var6, var5)) {
                        return false;
                    }
                    if (!class544.method3193(var4, var6, class185.field2738 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(var4, var6, class291.field4317 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class544.method3193(var4, var7, var5)) {
                        return false;
                    }
                    if (!class544.method3193(var4, var7, class185.field2738 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(var4, var7, class291.field4317 + var5)) {
                        return false;
                    }
                }
                if (!class544.method3193(var4, var8, var5)) {
                    return false;
                } else if (!class544.method3193(var4, var8, class185.field2738 + var5)) {
                    return false;
                } else {
                    return class544.method3193(var4, var8, class291.field4317 + var5);
                }
            } else if (arg3 == 2) {
                if (var5 < class14.field161) {
                    if (!class544.method3193(var4, var6, class291.field4317 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(class185.field2738 + var4, var6, class291.field4317 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var6, class291.field4317 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class544.method3193(var4, var7, class291.field4317 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(class185.field2738 + var4, var7, class291.field4317 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var7, class291.field4317 + var5)) {
                        return false;
                    }
                }
                if (!class544.method3193(var4, var8, class291.field4317 + var5)) {
                    return false;
                } else if (!class544.method3193(class185.field2738 + var4, var8, class291.field4317 + var5)) {
                    return false;
                } else {
                    return class544.method3193(class291.field4317 + var4, var8, class291.field4317 + var5);
                }
            } else if (arg3 == 4) {
                if (var4 < class510.field7387) {
                    if (!class544.method3193(class291.field4317 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var6, class185.field2738 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var6, class291.field4317 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class544.method3193(class291.field4317 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var7, class185.field2738 + var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var7, class291.field4317 + var5)) {
                        return false;
                    }
                }
                if (!class544.method3193(class291.field4317 + var4, var8, var5)) {
                    return false;
                } else if (!class544.method3193(class291.field4317 + var4, var8, class185.field2738 + var5)) {
                    return false;
                } else {
                    return class544.method3193(class291.field4317 + var4, var8, class291.field4317 + var5);
                }
            } else if (arg3 == 8) {
                if (var5 > class14.field161) {
                    if (!class544.method3193(var4, var6, var5)) {
                        return false;
                    }
                    if (!class544.method3193(class185.field2738 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class544.method3193(var4, var7, var5)) {
                        return false;
                    }
                    if (!class544.method3193(class185.field2738 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class544.method3193(class291.field4317 + var4, var7, var5)) {
                        return false;
                    }
                }
                if (!class544.method3193(var4, var8, var5)) {
                    return false;
                } else if (!class544.method3193(class185.field2738 + var4, var8, var5)) {
                    return false;
                } else {
                    return class544.method3193(class291.field4317 + var4, var8, var5);
                }
            } else if (!class544.method3193(class185.field2738 + var4, var9, class185.field2738 + var5)) {
                return false;
            } else if (arg3 == 16) {
                return class544.method3193(var4, var8, class291.field4317 + var5);
            } else if (arg3 == 32) {
                return class544.method3193(class291.field4317 + var4, var8, class291.field4317 + var5);
            } else if (arg3 == 64) {
                return class544.method3193(class291.field4317 + var4, var8, var5);
            } else if (arg3 == 128) {
                return class544.method3193(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public final void method780(int arg0, int arg1) {
        if (arg0 <= -82) {
            ++field1610;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method781(boolean arg0, String arg1, int arg2) {
        ++field1602;
        if (arg1 != null) {
            if (class8.field71 >= 100) {
                class171.method1208((byte) -108, class70.field1148.method426(class503.field7255, 79));
            } else {
                String var3 = class274.method1769(0, arg1);
                if (var3 != null) {
                    for (int var4 = 0; ~class8.field71 < ~var4; ++var4) {
                        String var8 = class274.method1769(arg2, class440.field6273[var4]);
                        if (var8 != null && var8.equals(var3)) {
                            class171.method1208((byte) 21, arg1 + class529.field7743.method426(class503.field7255, 76));
                            return;
                        }
                        if (class350.field5133[var4] != null) {
                            String var9 = class274.method1769(arg2, class350.field5133[var4]);
                            if (var9 != null && var9.equals(var3)) {
                                class171.method1208((byte) -107, arg1 + class529.field7743.method426(class503.field7255, 86));
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; var5 < class290.field4314; ++var5) {
                        String var6 = class274.method1769(arg2, class163.field2463[var5]);
                        if (var6 != null && var6.equals(var3)) {
                            class171.method1208((byte) 114, class92.field1468.method426(class503.field7255, 61) + arg1 + class530.field7827.method426(class503.field7255, 77));
                            return;
                        }
                        if (class397.field5630[var5] != null) {
                            String var7 = class274.method1769(0, class397.field5630[var5]);
                            if (var7 != null && var7.equals(var3)) {
                                class171.method1208((byte) 64, class92.field1468.method426(class503.field7255, 62) + arg1 + class530.field7827.method426(class503.field7255, 87));
                                return;
                            }
                        }
                    }
                    if (class274.method1769(arg2 ^ arg2, class364.field5293.field7363).equals(var3)) {
                        class171.method1208((byte) -110, class263.field3976.method426(class503.field7255, 67));
                    } else {
                        ++class415.field5878;
                        class228.method1528(true, class208.field3162);
                        class276.field4124.method3048(arg2 ^ -2034159384, class132.method966(arg1, arg2 ^ 10240) + 1);
                        class276.field4124.method3057((byte) -28, arg1);
                        class276.field4124.method3048(-2034159384, arg0 ? 1 : 0);
                    }
                }
            }
        }
    }

    static {
        new class405("", 76);
    }
}

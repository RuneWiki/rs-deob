import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class123 extends class232 {

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "F")
    private float field1595 = 0.0F;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "Llo;")
    private class785 field1601;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field1606 = -1;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method905(int arg0, byte arg1) {
        ++field1599;
        int var2 = 31 % ((-3 - arg1) / 51);
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lsf;IIIII)V", line = 18)
    public static final void method906(class547 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class456.field6545 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class151.field2074) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class12.field249 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class379 var14 = class378.field5427[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class622.field8777[var11].method1976(var12, -1, var13) + class622.field8777[var11].method1976(var12 + 1, -1, var13) + class622.field8777[var11].method1976(var12, -1, var13 + 1) + class622.field8777[var11].method1976(var12 + 1, -1, var13 + 1)) / 4 - (class622.field8777[arg1].method1976(arg2, -1, arg3) + class622.field8777[arg1].method1976(arg2 + 1, -1, arg3) + class622.field8777[arg1].method1976(arg2, -1, arg3 + 1) + class622.field8777[arg1].method1976(arg2 + 1, -1, arg3 + 1)) / 4;
                                    class719 var16 = var14.field5439;
                                    class719 var17 = var14.field5430;
                                    if (var16 != null && var16.method244(106)) {
                                        arg0.method242((var13 - arg3) * class13.field254 + (1 - arg5) * class503.field7200, var16, class711.field10005, (byte) 0, (var12 - arg2) * class13.field254 + (1 - arg4) * class503.field7200, var15, var6);
                                    }
                                    if (var17 != null && var17.method244(57)) {
                                        arg0.method242((var13 - arg3) * class13.field254 + (1 - arg5) * class503.field7200, var17, class711.field10005, (byte) 0, (var12 - arg2) * class13.field254 + (1 - arg4) * class503.field7200, var15, var6);
                                    }
                                    for (class393 var18 = var14.field5437; var18 != null; var18 = var18.field5574) {
                                        class778 var19 = var18.field5578;
                                        if (var19 != null && var19.method244(62) && (var19.field10733 == var12 || var7 == var12) && (var19.field10730 == var13 || var9 == var13)) {
                                            int var20 = var19.field10727 - var19.field10733 + 1;
                                            int var21 = var19.field10736 - var19.field10730 + 1;
                                            arg0.method242((var19.field10730 - arg3) * class13.field254 + (var21 - arg5) * class503.field7200, var19, class711.field10005, (byte) 0, (var19.field10733 - arg2) * class13.field254 + (var20 - arg4) * class503.field7200, var15, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lija;III)J", line = 107)
    public static final long method907(class362 arg0, int arg1, int arg2, int arg3) {
        ++field1608;
        if (arg1 != 6951) {
            return 0L;
        } else {
            long var4 = 4194304L;
            long var6 = Long.MIN_VALUE;
            class322 var8 = class496.field7061.method319(arg1 ^ -7001, arg0.method650(-99));
            long var9 = (long) (1073741824 | arg3 << 7 | arg2 | arg0.method646((byte) 45) << 14 | arg0.method643(false) << 20);
            if (var8.field4761 == 0) {
                var9 |= var6;
            }
            if (var8.field4796 == 1) {
                var9 |= var4;
            }
            return var9 | (long) arg0.method650(-48) << 32;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 135)
    public final void method908(byte arg0) {
        if (~super.field3368.method1064((byte) 48) == -1) {
            class468 var2 = super.field3368.method1165(false);
            super.field3368.method1140((byte) -91, 1);
            class468 var3 = super.field3368.method1043(false);
            var3.method1950(var2);
            var3.method2777(1.0F, 0.125F, 0.125F, true);
            var3.method2760(this.field1595, 0.0F, 3, 0.0F);
            super.field3368.method1073(class144.field1840, 25216);
            super.field3368.method1140((byte) -66, 0);
        }
        ++field1603;
        if (arg0 <= 101) {
            this.method569(-12, -18, 100);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lwk;Llo;)V", line = 177)
    public class123(class151 arg0, class785 arg1) {
        super(arg0);
        this.field1601 = arg1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILdr;I)V", line = 166)
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 == 2305) {
            super.field3368.method1104(true, arg1);
            ++field1602;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZB)V", line = 187)
    public final void method568(boolean arg0, byte arg1) {
        super.field3368.method1140((byte) -43, 1);
        ++field1597;
        super.field3368.method1136((byte) -124, class576.field8141, class438.field6278);
        super.field3368.method1057(0, false, class412.field5814, true, (byte) 122);
        if (arg1 == -126) {
            super.field3368.method1157(1, 0, class490.field6967);
            super.field3368.method1069(0, (byte) 19);
            super.field3368.method1140((byte) -48, 0);
            super.field3368.method1059(true, -16777216);
            super.field3368.method1157(arg1 ^ -125, 0, class490.field6966);
            this.method908((byte) 110);
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)Z", line = 206)
    public final boolean method571(int arg0) {
        ++field1596;
        if (arg0 != -30998) {
            method907((class362) null, -48, 118, 83);
        }
        return this.field1601.method4301(arg0 ^ -29702);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 219)
    public final void method573(byte arg0) {
        if (arg0 > 77) {
            super.field3368.method1140((byte) -62, 1);
            ++field1600;
            super.field3368.method1136((byte) -127, class174.field2460, class174.field2460);
            super.field3368.method1056(32, class412.field5814, 0);
            super.field3368.method1157(1, 0, class412.field5814);
            super.field3368.method1069(1, (byte) 86);
            super.field3368.method1104(true, (class749) null);
            super.field3368.method1140((byte) -60, 0);
            super.field3368.method1157(1, 0, class412.field5814);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V", line = 239)
    public final void method569(int arg0, int arg1, int arg2) {
        ++field1594;
        super.field3368.method1140((byte) -91, 1);
        int var4 = 41 / ((48 - arg0) / 51);
        if (~(128 & arg2) == -1) {
            if (~(arg1 & 1) == -2) {
                if (!this.field1601.field10788) {
                    int var5 = super.field3368.field2209 % 4000 * 16 / 4000;
                    super.field3368.method1104(true, this.field1601.field10787[var5]);
                } else {
                    this.field1595 = (float) (super.field3368.field2209 % 4000) / 4000.0F;
                    super.field3368.method1104(true, this.field1601.field10792);
                }
            } else if (!this.field1601.field10788) {
                super.field3368.method1104(true, this.field1601.field10787[0]);
            } else {
                super.field3368.method1104(true, this.field1601.field10792);
            }
        } else {
            super.field3368.method1104(true, (class749) null);
        }
        super.field3368.method1140((byte) -15, 0);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V", line = 286)
    public final void method572(boolean arg0, int arg1) {
        super.field3368.method1136((byte) -118, class174.field2460, class438.field6278);
        ++field1604;
        if (arg1 <= 21) {
            field1598 = -84;
        }
    }
}

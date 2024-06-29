import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class93 extends class124 {

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "[I")
    public static int[] field1517 = new int[128];

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "Le;")
    public static class191 field1520 = class54.method368("::errortest", 2047);

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "Le;")
    public static class191 field1529 = class54.method368(" steht bereits auf Ihrer Freunde)2Liste(Q", 2047);

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "Lvf;")
    public static class51 field1527;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        if (arg1 != -7) {
            this.method137(-73, (byte) -80);
        }
        ++field1519;
        int[][] var3 = super.field2053.method1775((byte) -116, arg0);
        if (super.field2053.field4558) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class64.field1132 < ~var7; ++var7) {
                var4[var7] = this.field1526;
                var5[var7] = this.field1518;
                var6[var7] = this.field1525;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 == 23382) {
            ++field1524;
            if (~arg1 <= -1 && ~arg4 <= -1 && ~arg1 > -104 && ~arg4 > -104) {
                if (arg0 == 0) {
                    class254 var8 = class143.method938(arg5, arg1, arg4);
                    if (var8 != null) {
                        int var9 = (int) (var8.field4498 >>> 32) & Integer.MAX_VALUE;
                        if (~arg7 == -3) {
                            var8.field4499 = new class261(var9, 2, arg3 + 4, arg5, arg1, arg4, arg2, false, var8.field4499);
                            var8.field4493 = new class261(var9, 2, 3 & arg3 + 1, arg5, arg1, arg4, arg2, false, var8.field4493);
                        } else {
                            var8.field4499 = new class261(var9, arg7, arg3, arg5, arg1, arg4, arg2, false, var8.field4499);
                        }
                    }
                }
                if (~arg0 == -2) {
                    class9 var10 = class8.method62(arg5, arg1, arg4);
                    if (var10 != null) {
                        int var11 = (int) (var10.field86 >>> 32) & Integer.MAX_VALUE;
                        if (~arg7 != -5 && ~arg7 != -6) {
                            if (arg7 == 6) {
                                var10.field94 = new class261(var11, 4, arg3 + 4, arg5, arg1, arg4, arg2, false, var10.field94);
                            } else if (arg7 == 7) {
                                var10.field94 = new class261(var11, 4, (3 & arg3 - -2) - -4, arg5, arg1, arg4, arg2, false, var10.field94);
                            } else if (arg7 == 8) {
                                var10.field94 = new class261(var11, 4, arg3 - -4, arg5, arg1, arg4, arg2, false, var10.field94);
                                var10.field88 = new class261(var11, 4, (arg3 - -2 & 3) + 4, arg5, arg1, arg4, arg2, false, var10.field88);
                            }
                        } else {
                            var10.field94 = new class261(var11, 4, arg3, arg5, arg1, arg4, arg2, false, var10.field94);
                        }
                    }
                }
                if (arg0 == 2) {
                    if (~arg7 == -12) {
                        arg7 = 10;
                    }
                    class12 var12 = class221.method1518(arg5, arg1, arg4);
                    if (var12 != null) {
                        var12.field155 = new class261((int) (var12.field136 >>> 32) & Integer.MAX_VALUE, arg7, arg3, arg5, arg1, arg4, arg2, false, var12.field155);
                    }
                }
                if (arg0 == 3) {
                    class257 var13 = class8.method60(arg5, arg1, arg4);
                    if (var13 != null) {
                        var13.field4562 = new class261(Integer.MAX_VALUE & (int) (var13.field4566 >>> 32), 22, arg3, arg5, arg1, arg4, arg2, false, var13.field4562);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(BI)V")
    private final void method567(byte arg0, int arg1) {
        ++field1530;
        this.field1526 = (arg1 & 16711680) >> 12;
        this.field1525 = (255 & arg1) << 4;
        if (arg0 > -109) {
            method566(-61, 50, -37, -32, -107, 68, 96, 107);
        }
        this.field1518 = arg1 >> 4 & 4080;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field1516;
        if (arg2) {
            if (arg0 == 0) {
                this.method567((byte) -114, arg1.method1591(2));
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class93() {
        this(0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI[Leg;)V")
    public static final void method568(byte arg0, int arg1, class33[] arg2) {
        ++field1523;
        if (arg0 != -94) {
            field1527 = null;
        }
        for (int var3 = 0; ~var3 > ~arg2.length; ++var3) {
            class33 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field493 == 0) {
                    if (var4.field548 != null) {
                        method568((byte) -94, arg1, var4.field548);
                    }
                    class267 var5 = (class267) class73.field1259.method612((long) var4.field491, true);
                    if (var5 != null) {
                        class244.method1709(var5.field4721, 0, arg1);
                    }
                }
                if (arg1 == 0 && var4.field629 != null) {
                    class61 var6 = new class61();
                    var6.field1101 = var4.field629;
                    var6.field1089 = var4;
                    class12.method87(var6, -12934);
                }
                if (arg1 == 1 && var4.field626 != null) {
                    if (~var4.field589 <= -1) {
                        class33 var7 = class233.method1646(5877, var4.field491);
                        if (var7 == null || var7.field548 == null || ~var4.field589 <= ~var7.field548.length || var7.field548[var4.field589] != var4) {
                            continue;
                        }
                    }
                    class61 var8 = new class61();
                    var8.field1089 = var4;
                    var8.field1101 = var4.field626;
                    class12.method87(var8, -12934);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
    private class93(int arg0) {
        super(0, false);
        this.method567((byte) -110, arg0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public static final void method569(int arg0, int arg1) {
        ++field1531;
        if (arg0 != 0) {
            method566(112, 67, 56, -4, 76, 99, -57, 110);
        }
        class132.field2203.method990(83, arg1);
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)V")
    public static void method570(int arg0) {
        field1517 = null;
        field1527 = null;
        field1520 = null;
        if (arg0 == 0) {
            field1529 = null;
        }
    }
}

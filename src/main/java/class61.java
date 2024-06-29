import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class61 extends class60 {

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    private final int field1018;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    private final int field1014;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    private final int field1035;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    private final int field1028;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    private final int field1030;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    private final int field1023;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    private final int field1025;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    private final int field1022;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Lha;")
    public static class46 field1016 = class271.method1828("Schrifts-=tze geladen)3", -46);

    @OriginalMember(owner = "client!af", name = "E", descriptor = "Lha;")
    public static class46 field1026 = class271.method1828("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -46);

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field1024 = 0;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "[I")
    public static int[] field1033 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lpi;")
    public static class181 field1015;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZII)V")
    public final void method405(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field1027 = -55;
        }
        ++field1019;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method413(byte arg0) {
        field1033 = null;
        field1015 = null;
        field1016 = null;
        field1026 = null;
        int var1 = 19 / ((48 - arg0) / 51);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public final void method410(int arg0, int arg1, int arg2) {
        int var4 = this.field1022 * arg1 >> 12;
        int var5 = 99 % ((53 - arg2) / 54);
        ++field1029;
        int var6 = this.field1023 * arg0 >> 12;
        int var7 = this.field1014 * arg0 >> 12;
        int var8 = this.field1018 * arg1 >> 12;
        int var9 = this.field1030 * arg0 >> 12;
        int var10 = this.field1035 * arg1 >> 12;
        int var11 = this.field1025 * arg0 >> 12;
        int var12 = this.field1028 * arg1 >> 12;
        class199.method1419(var11, (byte) -53, var10, var4, var6, super.field1009, var8, var12, var9, var7);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static final void method414(byte arg0) {
        ++field1034;
        class29.field575.method83(arg0 ^ -25268);
        if (arg0 != -52) {
            method415((byte) -24, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1018 = arg3;
        this.field1014 = arg2;
        this.field1035 = arg5;
        this.field1028 = arg7;
        this.field1030 = arg4;
        this.field1023 = arg0;
        this.field1025 = arg6;
        this.field1022 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method415(byte arg0, byte[] arg1) {
        ++field1032;
        class75 var2 = new class75(arg1);
        int var3 = var2.method558(1);
        if (arg0 != -90) {
            return null;
        } else {
            int var4 = var2.method562((byte) -71);
            if (var4 < 0 || class169.field2980 != 0 && class169.field2980 < var4) {
                throw new RuntimeException();
            } else if (~var3 == -1) {
                byte[] var7 = new byte[var4];
                var2.method553(-1, var4, var7, 0);
                return var7;
            } else {
                int var5 = var2.method562((byte) -71);
                if (var5 >= 0 && (class169.field2980 == 0 || class169.field2980 >= var5)) {
                    byte[] var6 = new byte[var5];
                    if (var3 != 1) {
                        class181.field3238.method1586(var2, var6, (byte) -113);
                    } else {
                        class132.method1026(var6, var5, arg1, var4, 9);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V")
    public final void method412(byte arg0, int arg1, int arg2) {
        ++field1017;
        int var4 = 71 / ((45 - arg0) / 42);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BZII[Luf;IIIIB)V")
    public static final void method416(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, class154[] arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        if (arg10 <= -39) {
            ++field1031;
            int var11 = -1;
            class75 var12 = new class75(arg1);
            while (true) {
                int var13 = var12.method573((byte) 110);
                if (~var13 == -1) {
                    return;
                }
                var11 += var13;
                int var14 = 0;
                while (true) {
                    int var15 = var12.method557(-22718);
                    if (var15 == 0) {
                        break;
                    }
                    var14 += var15 - 1;
                    int var16 = var14 & 63;
                    int var17 = (4052 & var14) >> 6;
                    int var18 = var14 >> 12;
                    int var19 = var12.method558(1);
                    int var20 = 3 & var19;
                    int var21 = var19 >> 2;
                    if (arg6 == var18 && ~arg4 >= ~var17 && ~var17 > ~(arg4 + 8) && ~var16 <= ~arg9 && ~var16 > ~(arg9 + 8)) {
                        class236 var22 = class157.method1158(var11, 109);
                        int var23 = arg0 - -class200.method1426(var22.field4130, var22.field4152, 7 & var17, arg3, var20, (byte) -119, var16 & 7);
                        int var24 = arg7 + class209.method1475(var22.field4152, var16 & 7, var20, var22.field4130, 7 & var17, -105, arg3);
                        if (var23 > 0 && ~var24 < -1 && ~var23 > -104 && var24 < 103) {
                            class154 var25 = null;
                            if (!arg2) {
                                int var26 = arg8;
                                if ((2 & class111.field2081[1][var23][var24]) == 2) {
                                    var26 = arg8 - 1;
                                }
                                if (~var26 <= -1) {
                                    var25 = arg5[var26];
                                }
                            }
                            class261.method1748(var23, 3 & arg3 + var20, var21, arg8, arg8, var25, var11, var24, arg2, 22, !arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIILha;)V")
    public static final void method417(int arg0, int arg1, int arg2, int arg3, class46 arg4) {
        ++field1020;
        class24 var5 = class108.method841(arg2, arg3, -1);
        if (var5 != null) {
            if (var5.field385 != null) {
                class275 var6 = new class275();
                var6.field4796 = var5.field385;
                var6.field4792 = var5;
                var6.field4805 = arg4;
                var6.field4791 = arg1;
                class215.method1509(var6, -90);
            }
            boolean var7 = true;
            if (~var5.field407 < -1) {
                var7 = class86.method674((byte) -122, var5);
            }
            if (var7) {
                if (class199.method1422(arg1 + -1, client.method1811(var5), 255)) {
                    if (arg1 == 1) {
                        class58.field967.method285((byte) -90, 243);
                        class58.field967.method581(true, arg2);
                        ++class116.field2183;
                        class58.field967.method546((byte) 120, arg3);
                    }
                    if (~arg1 == -3) {
                        ++class50.field856;
                        class58.field967.method285((byte) -90, 64);
                        class58.field967.method581(true, arg2);
                        class58.field967.method546((byte) 98, arg3);
                    }
                    if (arg1 == 3) {
                        class58.field967.method285((byte) -90, 127);
                        class58.field967.method581(true, arg2);
                        ++class220.field3870;
                        class58.field967.method546((byte) 112, arg3);
                    }
                    if (~arg1 == -5) {
                        class58.field967.method285((byte) -90, 117);
                        ++class127.field2345;
                        class58.field967.method581(true, arg2);
                        class58.field967.method546((byte) 111, arg3);
                    }
                    if (arg0 != 199959756) {
                        field1026 = null;
                    }
                    if (~arg1 == -6) {
                        class58.field967.method285((byte) -90, 201);
                        class58.field967.method581(true, arg2);
                        ++class270.field4708;
                        class58.field967.method546((byte) 118, arg3);
                    }
                    if (~arg1 == -7) {
                        class58.field967.method285((byte) -90, 134);
                        ++class58.field971;
                        class58.field967.method581(true, arg2);
                        class58.field967.method546((byte) 115, arg3);
                    }
                    if (~arg1 == -8) {
                        class58.field967.method285((byte) -90, 132);
                        class58.field967.method581(true, arg2);
                        class58.field967.method546((byte) 112, arg3);
                        ++class109.field2063;
                    }
                    if (~arg1 == -9) {
                        class58.field967.method285((byte) -90, 244);
                        ++class24.field439;
                        class58.field967.method581(true, arg2);
                        class58.field967.method546((byte) 106, arg3);
                    }
                    if (~arg1 == -10) {
                        class58.field967.method285((byte) -90, 233);
                        class58.field967.method581(true, arg2);
                        class58.field967.method546((byte) 123, arg3);
                        ++class146.field2635;
                    }
                    if (~arg1 == -11) {
                        ++class90.field1697;
                        class58.field967.method285((byte) -90, 240);
                        class58.field967.method581(true, arg2);
                        class58.field967.method546((byte) 120, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lpi;Lpi;I)V")
    public static final void method418(class181 arg0, class181 arg1, int arg2) {
        ++field1021;
        class95.field1766 = arg0;
        class80.field1523 = arg1;
        if (arg2 != -3) {
            method418((class181) null, (class181) null, 96);
        }
    }
}

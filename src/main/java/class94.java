import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class94 extends class298 {

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    private int field1165 = 16;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
    private int field1173 = 2000;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    private int field1167 = 0;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    private int field1170 = 4096;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    private int field1172 = 0;

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "S")
    public static short field1174;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "[I")
    public static int[] field1176;

    @OriginalMember(owner = "client!dq", name = "Y", descriptor = "[I")
    public static int[] field1178;

    @OriginalMember(owner = "client!dq", name = "bb", descriptor = "[I")
    public static int[] field1181;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!dq", name = "Z", descriptor = "Loj;")
    public static class280 field1179;

    @OriginalMember(owner = "client!dq", name = "ab", descriptor = "Lrg;")
    public static class395 field1180;

    @OriginalMember(owner = "client!dq", name = "X", descriptor = "[I")
    public static int[] field1177;

    static {
        new class40("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field1174 = 205;
        field1176 = new int[256];
        field1178 = new int[5];
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field1176[var0] = var1;
        }
        field1181 = new int[32];
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILvt;)V", line = 3)
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field1171;
        if (arg0 < -44) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (arg1 == 4) {
                                this.field1170 = arg2.method916(21933);
                            }
                        } else {
                            this.field1172 = arg2.method916(21933);
                        }
                    } else {
                        this.field1165 = arg2.method895((byte) -118);
                    }
                } else {
                    this.field1173 = arg2.method916(21933);
                }
            } else {
                this.field1167 = arg2.method895((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 62)
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V", line = 66)
    public static final void method464(int arg0) {
        ++field1164;
        if (class487.field6911 != 0) {
            try {
                if (++class294.field4364 > 1500) {
                    if (class322.field4655 != null) {
                        class322.field4655.method669(5000);
                        class322.field4655 = null;
                    }
                    if (class135.field1633 >= 1) {
                        class487.field6911 = 0;
                        class224.field3107 = -5;
                        return;
                    }
                    class487.field6911 = 1;
                    if (~class457.field6442 != ~class302.field4488) {
                        class302.field4488 = class457.field6442;
                    } else {
                        class302.field4488 = class189.field2594;
                    }
                    ++class135.field1633;
                    class294.field4364 = 0;
                }
                if (~class487.field6911 == -2) {
                    class224.field3105 = class42.field512.method2175(class302.field4488, (byte) 96, class104.field1258);
                    class487.field6911 = 2;
                }
                if (~class487.field6911 == -3) {
                    if (class224.field3105.field5759 == 2) {
                        throw new IOException();
                    }
                    if (~class224.field3105.field5759 != -2) {
                        return;
                    }
                    class322.field4655 = new class142((Socket) class224.field3105.field5755, class42.field512);
                    class224.field3105 = null;
                    class322.field4655.method675(class230.field3185.field2206, 0, (byte) -109, class230.field3185.field2159);
                    if (class46.field594 != null) {
                        class46.field594.method2655((byte) 106);
                    }
                    if (class460.field6501 != null) {
                        class460.field6501.method2655((byte) 106);
                    }
                    int var1 = class322.field4655.method673(arg0 ^ -3125);
                    if (class46.field594 != null) {
                        class46.field594.method2655((byte) 106);
                    }
                    if (class460.field6501 != null) {
                        class460.field6501.method2655((byte) 106);
                    }
                    if (var1 != 101) {
                        class487.field6911 = 0;
                        class224.field3107 = var1;
                        class322.field4655.method669(arg0 ^ 6024);
                        class322.field4655 = null;
                        return;
                    }
                    class487.field6911 = 3;
                }
                if (arg0 != 1024) {
                    field1179 = null;
                }
                if (~class487.field6911 == -4) {
                    if (~class322.field4655.method676((byte) 123) <= -3) {
                        int var2 = class322.field4655.method673(-2101) << 8 | class322.field4655.method673(-2101);
                        class207.method1144(6990, var2);
                        if (class232.field3220 == -1) {
                            class487.field6911 = 0;
                            class224.field3107 = 6;
                            class322.field4655.method669(arg0 + 3976);
                            class322.field4655 = null;
                        } else {
                            class487.field6911 = 0;
                            class322.field4655.method669(5000);
                            class322.field4655 = null;
                            class126.method600(128);
                        }
                    }
                }
            } catch (IOException var3) {
                if (class322.field4655 != null) {
                    class322.field4655.method669(5000);
                    class322.field4655 = null;
                }
                if (class135.field1633 >= 1) {
                    class224.field3107 = -4;
                    class487.field6911 = 0;
                } else {
                    if (class457.field6442 == class302.field4488) {
                        class302.field4488 = class189.field2594;
                    } else {
                        class302.field4488 = class457.field6442;
                    }
                    class487.field6911 = 1;
                    class294.field4364 = 0;
                    ++class135.field1633;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)I", line = 213)
    public static final int method465(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 11887) {
            field1177 = null;
        }
        ++field1175;
        int var4 = (-16711936 & (16711935 & arg3) * arg2 | (arg3 & 65280) * arg2 & 16711680) >>> 8;
        int var5 = -arg2 + 255;
        return ((-16711936 & (arg1 & 16711935) * var5 | 16711680 & (65280 & arg1) * var5) >>> 8) - -var4;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZ)[I", line = 235)
    public final int[] method13(int arg0, boolean arg1) {
        ++field1169;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int var4 = this.field1170 >> 1;
            int[][] var5 = super.field4443.method2876(0);
            Random var6 = new Random((long) this.field1167);
            for (int var7 = 0; this.field1173 > var7; ++var7) {
                int var8 = this.field1170 > 0 ? -var4 + this.field1172 + class459.method2706(this.field1170, var6, -21) : this.field1172;
                int var9 = (4092 & var8) >> 4;
                int var10 = class459.method2706(class158.field1877, var6, 124);
                int var11 = class459.method2706(class388.field5561, var6, -55);
                int var12 = var10 - -(class159.field1909[var9] * this.field1165 >> 12);
                int var13 = (class420.field6058[var9] * this.field1165 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class459.method2706(4096, var6, 127) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var11 <= ~var13 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class474.field6656 & var28;
                        int var31 = var21 & class208.field2886;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        if (!arg1) {
            method464(-121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIILpe;IIII)Z", line = 368)
    public static final boolean method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class424 arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1166;
        if (arg8 != 26596) {
            return false;
        } else {
            int var12 = arg5;
            int var13 = arg0;
            byte var14 = 64;
            byte var15 = 64;
            int var16 = -var14 + arg5;
            class223.field3095[var14][var15] = 99;
            int var17 = -var15 + arg0;
            class172.field2071[var14][var15] = 0;
            byte var18 = 0;
            int var19 = 0;
            class334.field4807[var18] = arg5;
            int var35 = var18 + 1;
            class413.field5887[var18] = arg0;
            int[][] var20 = arg7.field6118;
            while (true) {
                label286: while (true) {
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var26;
                    do {
                        do {
                            do {
                                label263: do {
                                    if (var35 == var19) {
                                        class356.field5113 = var13;
                                        class312.field4564 = var12;
                                        return false;
                                    }
                                    var13 = class413.field5887[var19];
                                    var12 = class334.field4807[var19];
                                    var19 = var19 + 1 & 4095;
                                    var21 = var13 - var17;
                                    var22 = -var16 + var12;
                                    var23 = -arg7.field6116 + var12;
                                    var24 = -arg7.field6121 + var13;
                                    if (arg9 != -4) {
                                        if (arg9 != -3) {
                                            if (~arg9 != 1) {
                                                if (~arg9 != 0) {
                                                    if (arg9 != 0 && ~arg9 != -2 && ~arg9 != -3 && arg9 != 3 && ~arg9 != -10) {
                                                        if (arg7.method2527(var12, arg1, arg6, arg2, (byte) -120, var13, arg3, arg9)) {
                                                            class356.field5113 = var13;
                                                            class312.field4564 = var12;
                                                            return true;
                                                        }
                                                    } else if (arg7.method2526(arg6, var13, arg1, arg9, false, arg2, arg3, var12)) {
                                                        class312.field4564 = var12;
                                                        class356.field5113 = var13;
                                                        return true;
                                                    }
                                                } else if (arg7.method2530(var12, arg1, arg3, var13, arg10, arg2, arg11, 110, arg4)) {
                                                    class356.field5113 = var13;
                                                    class312.field4564 = var12;
                                                    return true;
                                                }
                                            } else if (arg7.method2529(76, arg11, arg3, arg10, arg1, var13, arg4, var12, arg2, arg3)) {
                                                class312.field4564 = var12;
                                                class356.field5113 = var13;
                                                return true;
                                            }
                                        } else if (class390.method2348(arg4, arg2, var12, arg1, var13, arg11, arg3, 89, arg3)) {
                                            class356.field5113 = var13;
                                            class312.field4564 = var12;
                                            return true;
                                        }
                                    } else if (arg2 == var12 && arg1 == var13) {
                                        class356.field5113 = var13;
                                        class312.field4564 = var12;
                                        return true;
                                    }
                                    var26 = class172.field2071[var22][var21] + 1;
                                    if (var22 > 0 && class223.field3095[var22 - 1][var21] == 0 && ~(var20[var23 + -1][var24] & 1134821376) == -1 && (1310982144 & var20[var23 + -1][var24 + -1 - -arg3]) == 0) {
                                        int var27 = 1;
                                        while (true) {
                                            if (~var27 <= ~(arg3 - 1)) {
                                                class334.field4807[var35] = var12 + -1;
                                                class413.field5887[var35] = var13;
                                                class223.field3095[var22 + -1][var21] = 2;
                                                var35 = 4095 & var35 + 1;
                                                class172.field2071[var22 + -1][var21] = var26;
                                                break;
                                            }
                                            if (~(1336147968 & var20[var23 + -1][var24 + var27]) != -1) {
                                                break;
                                            }
                                            ++var27;
                                        }
                                    }
                                    if (~(-arg3 + 128) < ~var22 && ~class223.field3095[var22 + 1][var21] == -1 && (1625554944 & var20[arg3 + var23][var24]) == 0 && (2015625216 & var20[arg3 + var23][arg3 + var24 + -1]) == 0) {
                                        int var28 = 1;
                                        while (true) {
                                            if (var28 >= arg3 + -1) {
                                                class334.field4807[var35] = var12 + 1;
                                                class413.field5887[var35] = var13;
                                                var35 = var35 + 1 & 4095;
                                                class223.field3095[var22 + 1][var21] = 8;
                                                class172.field2071[var22 + 1][var21] = var26;
                                                break;
                                            }
                                            if (~(2028208128 & var20[arg3 + var23][var24 + var28]) != -1) {
                                                break;
                                            }
                                            ++var28;
                                        }
                                    }
                                    if (~var21 < -1 && class223.field3095[var22][var21 + -1] == 0 && ~(1134821376 & var20[var23][var24 + -1]) == -1 && ~(var20[arg3 + -1 + var23][var24 + -1] & 1625554944) == -1) {
                                        int var29 = 1;
                                        while (true) {
                                            if (~var29 <= ~(arg3 - 1)) {
                                                class334.field4807[var35] = var12;
                                                class413.field5887[var35] = var13 + -1;
                                                class223.field3095[var22][var21 - 1] = 1;
                                                var35 = var35 + 1 & 4095;
                                                class172.field2071[var22][var21 + -1] = var26;
                                                break;
                                            }
                                            if ((1675886592 & var20[var23 - -var29][var24 + -1]) != 0) {
                                                break;
                                            }
                                            ++var29;
                                        }
                                    }
                                    if (var21 < -arg3 + 128 && class223.field3095[var22][var21 + 1] == 0 && (var20[var23][arg3 + var24] & 1310982144) == 0 && ~(var20[var23 - -arg3 + -1][var24 - -arg3] & 2015625216) == -1) {
                                        int var30 = 1;
                                        while (true) {
                                            if (arg3 + -1 <= var30) {
                                                class334.field4807[var35] = var12;
                                                class413.field5887[var35] = var13 + 1;
                                                var35 = var35 + 1 & 4095;
                                                class223.field3095[var22][var21 + 1] = 4;
                                                class172.field2071[var22][var21 + 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + var30][var24 - -arg3] & 2116288512) != 0) {
                                                break;
                                            }
                                            ++var30;
                                        }
                                    }
                                    if (~var22 < -1 && ~var21 < -1 && class223.field3095[var22 + -1][var21 + -1] == 0 && ~(var20[var23 + -1][var24 + -1] & 1134821376) == -1) {
                                        int var31 = 1;
                                        while (true) {
                                            if (~arg3 >= ~var31) {
                                                class334.field4807[var35] = var12 + -1;
                                                class413.field5887[var35] = var13 + -1;
                                                class223.field3095[var22 + -1][var21 + -1] = 3;
                                                var35 = 4095 & var35 + 1;
                                                class172.field2071[var22 - 1][var21 + -1] = var26;
                                                break;
                                            }
                                            if ((1336147968 & var20[var23 + -1][var24 - 1 + var31]) != 0 || (1675886592 & var20[var23 - -var31 + -1][var24 - 1]) != 0) {
                                                break;
                                            }
                                            ++var31;
                                        }
                                    }
                                    if (-arg3 + 128 > var22 && var21 > 0 && class223.field3095[var22 + 1][var21 + -1] == 0 && ~(1625554944 & var20[arg3 + var23][var24 + -1]) == -1) {
                                        int var32 = 1;
                                        while (true) {
                                            if (~var32 <= ~arg3) {
                                                class334.field4807[var35] = var12 - -1;
                                                class413.field5887[var35] = var13 + -1;
                                                var35 = var35 - -1 & 4095;
                                                class223.field3095[var22 + 1][var21 + -1] = 9;
                                                class172.field2071[var22 + 1][var21 + -1] = var26;
                                                break;
                                            }
                                            if (~(2028208128 & var20[arg3 + var23][-1 - -var32 + var24]) != -1 || ~(var20[var23 + var32][var24 + -1] & 1675886592) != -1) {
                                                break;
                                            }
                                            ++var32;
                                        }
                                    }
                                    if (~var22 < -1 && ~(-arg3 + 128) < ~var21 && ~class223.field3095[var22 + -1][var21 - -1] == -1 && (var20[var23 - 1][var24 - -arg3] & 1310982144) == 0) {
                                        for (int var33 = 1; ~var33 > ~arg3; ++var33) {
                                            if (~(1336147968 & var20[var23 + -1][var24 - -var33]) != -1 || (var20[var23 + -1 - -var33][var24 - -arg3] & 2116288512) != 0) {
                                                continue label263;
                                            }
                                        }
                                        class334.field4807[var35] = var12 + -1;
                                        class413.field5887[var35] = var13 + 1;
                                        class223.field3095[var22 + -1][var21 + 1] = 6;
                                        var35 = 4095 & var35 + 1;
                                        class172.field2071[var22 + -1][var21 + 1] = var26;
                                    }
                                } while (~var22 <= ~(-arg3 + 128));
                            } while (~(-arg3 + 128) >= ~var21);
                        } while (~class223.field3095[var22 - -1][var21 + 1] != -1);
                    } while ((2015625216 & var20[var23 - -arg3][arg3 + var24]) != 0);
                    for (int var34 = 1; ~var34 > ~arg3; ++var34) {
                        if ((var20[var23 + var34][arg3 + var24] & 2116288512) != 0 || (var20[arg3 + var23][var24 - -var34] & 2028208128) != 0) {
                            continue label286;
                        }
                    }
                    class334.field4807[var35] = var12 + 1;
                    class413.field5887[var35] = var13 + 1;
                    var35 = 4095 & var35 + 1;
                    class223.field3095[var22 + 1][var21 + 1] = 12;
                    class172.field2071[var22 + 1][var21 + 1] = var26;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 825)
    public final void method15(int arg0) {
        ++field1168;
        if (arg0 <= -41) {
            class292.method1836(6090);
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(Z)V", line = 873)
    public static void method467(boolean arg0) {
        field1176 = null;
        field1180 = null;
        if (arg0) {
            method467(true);
        }
        field1177 = null;
        field1179 = null;
        field1178 = null;
        field1181 = null;
    }
}

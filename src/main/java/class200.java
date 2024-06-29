import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class200 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
    public boolean field3023 = false;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public int field3031 = 2;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Z")
    public boolean field3034 = false;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field3033 = -1;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public int field3022 = -1;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public int field3038 = 5;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field3021 = -1;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public int field3049 = 99;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field3046 = -1;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Z")
    public boolean field3048 = false;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public int field3047 = -1;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Z")
    public boolean field3051 = false;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Lvf;")
    public class163 field3045;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
    public int[] field3024;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
    public int[] field3027;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
    public int[] field3030;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[I")
    public int[] field3035;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
    public int[] field3040;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
    private int[] field3042;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[Z")
    public boolean[] field3037;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[[I")
    public int[][] field3043;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBLka;)Lka;")
    public final class499 method1436(int arg0, int arg1, int arg2, int arg3, byte arg4, class499 arg5) {
        field3029++;
        int var7 = this.field3024[arg0];
        int var8 = this.field3040[arg0];
        class366 var9 = this.field3045.method1277(var8 >> 16, -1);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method324((byte) 1, arg3, true);
        }
        class366 var11 = null;
        if ((this.field3048 || class499.field6821) && arg1 != -1 && arg1 < this.field3040.length) {
            int var12 = this.field3040[arg1];
            var11 = this.field3045.method1277(var12 >> 16, -1);
            arg1 = var12 & 0xFFFF;
        }
        class366 var13 = null;
        class366 var14 = null;
        if (arg4 != -78) {
            return null;
        }
        int var15 = 0;
        int var16 = 0;
        if (this.field3042 != null) {
            if (this.field3042.length > arg0) {
                var15 = this.field3042[arg0];
                if (var15 != 65535) {
                    var13 = this.field3045.method1277(var15 >> 16, -1);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3048 || class499.field6821) && arg1 != -1 && this.field3042.length > arg1) {
                var16 = this.field3042[arg1];
                if (var16 != 65535) {
                    var14 = this.field3045.method1277(var16 >> 16, -1);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3034) {
            arg3 |= 0x200;
        }
        if (var9.method2236(var10, (byte) 106)) {
            arg3 |= 0x80;
        }
        if (var9.method2238(var10, arg4 + 78)) {
            arg3 |= 0x100;
        }
        if (var9.method2231(68, var10)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2236(var15, (byte) -113)) {
                arg3 |= 0x80;
            }
            if (var13.method2238(var15, 0)) {
                arg3 |= 0x100;
            }
            if (var13.method2231(100, var15)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2236(arg1, (byte) -75)) {
                arg3 |= 0x80;
            }
            if (var11.method2238(arg1, arg4 + 78)) {
                arg3 |= 0x100;
            }
            if (var11.method2231(114, arg1)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2236(var16, (byte) 71)) {
                arg3 |= 0x80;
            }
            if (var14.method2238(var16, 0)) {
                arg3 |= 0x100;
            }
            if (var14.method2231(61, var16)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        class499 var18 = arg5.method324((byte) 1, var17, true);
        var18.method2854(0, this.field3034, var7, arg2 - 1, arg1, -78, var9, var11, var10);
        if (var13 != null) {
            var18.method2854(0, this.field3034, var7, arg2 - 1, var16, 127, var13, var14, var15);
        }
        return var18;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILfca;)V")
    private final void method1437(int arg0, int arg1, class93 arg2) {
        field3026++;
        if (arg0 != -8310) {
            this.field3030 = null;
        }
        if (arg1 == 1) {
            int var16 = arg2.method763(-4);
            this.field3024 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field3024[var17] = arg2.method763(119);
            }
            this.field3040 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field3040[var18] = arg2.method763(74);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field3040[var19] = (arg2.method763(88) << 16) + this.field3040[var19];
            }
        } else if (arg1 == 2) {
            this.field3033 = arg2.method763(104);
        } else if (arg1 == 3) {
            this.field3037 = new boolean[256];
            int var14 = arg2.method793((byte) 114);
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3037[arg2.method793((byte) 116)] = true;
            }
        } else if (arg1 == 5) {
            this.field3038 = arg2.method793((byte) 98);
        } else if (arg1 == 6) {
            this.field3046 = arg2.method763(arg0 + 8247);
        } else if (arg1 == 7) {
            this.field3021 = arg2.method763(arg0 + 8397);
        } else if (arg1 == 8) {
            this.field3049 = arg2.method793((byte) 54);
        } else if (arg1 == 9) {
            this.field3047 = arg2.method793((byte) 68);
        } else if (arg1 == 10) {
            this.field3022 = arg2.method793((byte) 19);
        } else if (arg1 == 11) {
            this.field3031 = arg2.method793((byte) 22);
        } else if (arg1 == 12) {
            int var4 = arg2.method793((byte) 109);
            this.field3042 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3042[var5] = arg2.method763(arg0 + 8401);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3042[var6] = (arg2.method763(arg0 + 8398) << 16) + this.field3042[var6];
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method763(116);
            this.field3043 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method793((byte) 19);
                if (var12 > 0) {
                    this.field3043[var11] = new int[var12];
                    this.field3043[var11][0] = arg2.method767((byte) -121);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field3043[var11][var13] = arg2.method763(89);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field3034 = true;
        } else if (arg1 == 15) {
            this.field3048 = true;
        } else if (arg1 == 16) {
            this.field3051 = true;
        } else if (arg1 == 18) {
            this.field3023 = true;
            return;
        } else if (arg1 == 19) {
            if (this.field3035 == null) {
                this.field3035 = new int[this.field3043.length];
                for (int var7 = 0; var7 < this.field3043.length; var7++) {
                    this.field3035[var7] = 255;
                }
            }
            this.field3035[arg2.method793((byte) 15)] = arg2.method793((byte) 56);
            return;
        } else if (arg1 == 20) {
            if (this.field3030 == null || this.field3027 == null) {
                this.field3030 = new int[this.field3043.length];
                this.field3027 = new int[this.field3043.length];
                for (int var8 = 0; var8 < this.field3043.length; var8++) {
                    this.field3030[var8] = 256;
                    this.field3027[var8] = 256;
                }
            }
            int var9 = arg2.method793((byte) 21);
            this.field3030[var9] = arg2.method763(107);
            this.field3027[var9] = arg2.method763(-43);
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBIBLka;)Lka;")
    public final class499 method1438(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, byte arg6, class499 arg7) {
        field3041++;
        int var9 = this.field3024[arg0];
        int var10 = this.field3040[arg0];
        class366 var11 = this.field3045.method1277(var10 >> 16, -1);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method324(arg6, arg5, true);
        }
        class366 var13 = null;
        if ((this.field3048 || class499.field6821) && arg3 != -1 && this.field3040.length > arg3) {
            int var14 = this.field3040[arg3];
            var13 = this.field3045.method1277(var14 >> 16, -1);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field3034) {
            arg5 |= 0x200;
        }
        if (var11.method2236(var12, (byte) -101)) {
            arg5 |= 0x80;
        }
        if (var11.method2238(var12, 0)) {
            arg5 |= 0x100;
        }
        if (var11.method2231(112, var12)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2236(arg3, (byte) 119)) {
                arg5 |= 0x80;
            }
            if (var13.method2238(arg3, 0)) {
                arg5 |= 0x100;
            }
            if (var13.method2231(79, arg3)) {
                arg5 |= 0x400;
            }
        }
        if (arg4 < 29) {
            this.field3037 = null;
        }
        int var15 = arg5 | 0x20;
        class499 var16 = arg7.method324(arg6, var15, true);
        var16.method2854(arg2, this.field3034, var9, arg1 - 1, arg3, -118, var11, var13, var12);
        return var16;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method1439(int arg0) {
        field3036++;
        if (this.field3047 == -1) {
            if (this.field3037 == null) {
                this.field3047 = 0;
            } else {
                this.field3047 = 2;
            }
        }
        int var2 = 59 / ((-arg0 - 37) / 60);
        if (this.field3022 != -1) {
            return;
        }
        if (this.field3037 == null) {
            this.field3022 = 0;
        } else {
            this.field3022 = 2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIZ)I")
    public final int method1440(byte arg0, int arg1, int arg2, boolean arg3) {
        field3044++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3040[arg1];
        class366 var8 = null;
        class366 var9 = this.field3045.method1277(var7 >> 16, -1);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3048 || class499.field6821) && arg2 != -1 && this.field3040.length > arg2) {
            int var11 = this.field3040[arg2];
            var8 = this.field3045.method1277(var11 >> 16, -1);
            var6 = var11 & 0xFFFF;
        }
        if (this.field3034) {
            var5 |= 0x200;
        }
        if (var9.method2236(var10, (byte) 117)) {
            var5 |= 0x80;
        }
        if (var9.method2238(var10, 0)) {
            var5 |= 0x100;
        }
        if (var9.method2231(arg0 ^ 0x43, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2236(var6, (byte) 127)) {
                var5 |= 0x80;
            }
            if (var8.method2238(var6, 0)) {
                var5 |= 0x100;
            }
            if (var8.method2231(82, var6)) {
                var5 |= 0x400;
            }
        }
        if (arg0 != 56) {
            method1443(true);
        }
        if (this.field3042 != null && arg3) {
            if (this.field3042.length > arg1) {
                int var12 = this.field3042[arg1];
                if (var12 != 65535) {
                    class366 var13 = this.field3045.method1277(var12 >> 16, -1);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2236(var14, (byte) 64)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2238(var14, arg0 - 56)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2231(69, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3048 || class499.field6821) && arg2 != -1 && arg2 < this.field3042.length) {
                int var15 = this.field3042[arg2];
                if (var15 != 65535) {
                    class366 var16 = this.field3045.method1277(var15 >> 16, -1);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2236(var17, (byte) -107)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2238(var17, arg0 - 56)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2231(arg0 + 43, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Z")
    public static final boolean method1441(byte arg0) {
        int var1 = -97 % ((arg0 + 23) / 36);
        field3025++;
        return class690.field9574 > 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfca;I)V")
    public final void method1442(class93 arg0, int arg1) {
        int var3 = -84 % ((66 - arg1) / 37);
        while (true) {
            int var4 = arg0.method793((byte) 89);
            if (var4 == 0) {
                field3052++;
                return;
            }
            this.method1437(-8310, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static final void method1443(boolean arg0) {
        field3032++;
        if (!class675.field9384) {
            return;
        }
        class17 var1 = class326.method2066(class657.field9100, class342.field4609, 73);
        if (var1 != null && var1.field363 != null) {
            class255 var2 = new class255();
            var2.field3583 = var1;
            var2.field3586 = var1.field363;
            class76.method644(var2);
        }
        class335.field4516 = -1;
        class675.field9384 = arg0;
        class783.field10758 = -1;
        if (var1 != null) {
            class410.method2433(var1, 14049);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIIII[Lkh;IIII)V")
    public static final void method1444(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class17[] arg6, int arg7, int arg8, int arg9, int arg10) {
        class95.field1472.method512(arg9, arg3, arg7, arg10);
        field3028++;
        if (arg1 != -1) {
            return;
        }
        for (int var11 = 0; var11 < arg6.length; var11++) {
            class17 var12 = arg6[var11];
            if (var12 != null && (var12.field336 == arg2 || arg2 == -1412584499 && class84.field1157 == var12)) {
                int var13 = var12.field248 + arg8;
                int var14 = var12.field416 + arg4;
                int var15 = var12.field347 + var13 + 1;
                int var16 = var12.field330 + var14 + 1;
                int var17;
                if (arg5 == -1) {
                    class713.field9815[class526.field7139].setBounds(var12.field248 + arg8, var12.field416 + arg4, var12.field347, var12.field330);
                    var17 = class526.field7139++;
                } else {
                    var17 = arg5;
                }
                var12.field297 = var17;
                var12.field290 = class440.field5977;
                if (!client.method2030(var12)) {
                    if (var12.field379 != 0) {
                        class169.method1303((byte) -80, var12);
                    }
                    int var18 = var12.field248 + arg8;
                    int var19 = var12.field416 + arg4;
                    int var20 = 0;
                    int var21 = 0;
                    if (class618.field8597) {
                        var20 = class146.method1175(arg1 - 29908);
                        var21 = class605.method3435((byte) -98);
                    }
                    int var22 = var12.field245;
                    if (class178.field2814 && (client.method2010(var12).field9638 != 0 || var12.field352 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class84.field1157 == var12) {
                        if (arg2 != -1412584499 && (class715.field9844 == var12.field406 || class172.field2739 == var12.field406)) {
                            class478.field6464 = arg8;
                            class513.field7011 = arg6;
                            class549.field7469 = arg4;
                            continue;
                        }
                        if (class280.field3896 && class454.field6201) {
                            int var23 = class420.field5727.method1326((byte) 111) + var20;
                            int var24 = var21 + class420.field5727.method1319((byte) 126);
                            int var25 = var23 - class262.field3675;
                            int var26 = var24 - class455.field6206;
                            if (class517.field7030 > var25) {
                                var25 = class517.field7030;
                            }
                            if (var26 < class300.field4136) {
                                var26 = class300.field4136;
                            }
                            if ((class517.field7030 + class679.field9452.field347) < (var12.field347 + var25)) {
                                var25 = class517.field7030 + class679.field9452.field347 - var12.field347;
                            }
                            var18 = var25;
                            if ((class300.field4136 + class679.field9452.field330) < (var26 + var12.field330)) {
                                var26 = class300.field4136 + class679.field9452.field330 - var12.field330;
                            }
                            var19 = var26;
                        }
                        if (class172.field2739 == var12.field406) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field352 == 2) {
                        var29 = arg9;
                        var31 = arg7;
                        var32 = arg10;
                        var30 = arg3;
                    } else {
                        int var27 = var18 + var12.field347;
                        int var28 = var19 + var12.field330;
                        var29 = arg9 < var18 ? var18 : arg9;
                        if (var12.field352 == 9) {
                            var27++;
                            var28++;
                        }
                        var30 = arg3 >= var19 ? arg3 : var19;
                        var31 = arg7 <= var27 ? arg7 : var27;
                        var32 = var28 >= arg10 ? arg10 : var28;
                    }
                    if (var29 < var31 && var30 < var32) {
                        if (var12.field379 != 0) {
                            if (class323.field4424 == var12.field379 || class622.field8681 == var12.field379) {
                                class259.method1687(var18, 10403, var12, var19);
                                if (!class618.field8597) {
                                    class45.method334(var19, var18, var12.field347, -573243581, var12.field330, class622.field8681 == var12.field379);
                                    class95.field1472.method512(arg9, arg3, arg7, arg10);
                                }
                                class377.field5145[var17] = true;
                                continue;
                            }
                            if (class55.field792 == var12.field379) {
                                if (var12.method102(class95.field1472, -256) != null) {
                                    class204.method1458(arg1 ^ 0x4599);
                                    class526.method2993(var19, 27064, var18, class95.field1472, var12);
                                    class684.field9516[var17] = true;
                                    class95.field1472.method512(arg9, arg3, arg7, arg10);
                                    if (class618.field8597) {
                                        if (arg0) {
                                            class686.method3861(var13, var15, arg1 + 22739, var14, var16);
                                        } else {
                                            class185.method1377(var13, var15, true, var16, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class720.field9896 == var12.field379) {
                                class192.method1403(var18, var19, class95.field1472, arg1 ^ 0xFFFF8355, var12);
                                continue;
                            }
                            if (class592.field8326 == var12.field379) {
                                class165.method1293(var12, var12.field273 % 64, var19, var18, false, class95.field1472);
                                continue;
                            }
                            if (class732.field10103 == var12.field379) {
                                if (var12.method102(class95.field1472, -256) != null) {
                                    class62.method431((byte) -123, var12, var18, var19);
                                    class684.field9516[var17] = true;
                                    class95.field1472.method512(arg9, arg3, arg7, arg10);
                                    if (class618.field8597) {
                                        if (arg0) {
                                            class686.method3861(var13, var15, 22738, var14, var16);
                                        } else {
                                            class185.method1377(var13, var15, true, var16, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class624.field8707 == var12.field379) {
                                class218.method1510(var19, class95.field1472, var12.field347, var12.field330, class583.field8256, var18, -15301);
                                class377.field5145[var17] = true;
                                class95.field1472.method512(arg9, arg3, arg7, arg10);
                                continue;
                            }
                            if (class149.field2479 == var12.field379) {
                                class525.method2989(var12.field347, var19, var18, 4, var12.field330, class95.field1472);
                                class377.field5145[var17] = true;
                                class95.field1472.method512(arg9, arg3, arg7, arg10);
                                continue;
                            }
                            if (class671.field9320 == var12.field379) {
                                if (!class236.field3391 && !class593.field8334) {
                                    continue;
                                }
                                int var33 = var18 + var12.field347;
                                if (class618.field8597) {
                                    if (arg0) {
                                        class686.method3861(var13, var15, 22738, var14, var16);
                                    } else {
                                        class185.method1377(var13, var15, true, var16, var14);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class236.field3391) {
                                    int var35 = -256;
                                    if (class698.field9637 < 20) {
                                        var35 = -65536;
                                    }
                                    class359.field4908.method605(var34, var33, "Fps:" + class698.field9637, -1, var35, (byte) -96);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class770.field10614) {
                                            class189.method1389(13534);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class629.method3535("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4, -2309);
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class359.field4908.method605(var34, var33, "Mem:" + var37 + "k", -1, var38, (byte) -122);
                                    var34 += 15;
                                    class359.field4908.method605(var34, var33, "In:" + class523.field7114 + "B/s Out:" + class262.field3669 + "B/s", -1, -256, (byte) 33);
                                    var34 += 15;
                                    int var40 = class95.field1472.method497() / 1024;
                                    class359.field4908.method605(var34, var33, "Offheap:" + var40 + "k", -1, ~var40 >= -65537 ? -256 : -65536, (byte) 126);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class473.field6407[var44] != null) {
                                            var41 += class473.field6407[var44].method2303((byte) 69);
                                            var42 += class473.field6407[var44].method2292((byte) 0);
                                            var43 += class473.field6407[var44].method2302(true);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class121.method1057(arg1 - 20745, (long) var46, true, 2, 0) + "% (" + var45 + "%)";
                                    class555.field7842.method605(var34, var33, var47, -1, -256, (byte) 33);
                                    var34 += 12;
                                }
                                if (class201.field3057 > 0) {
                                    class555.field7842.method605(var34, var33, "Particles: " + class259.field3636 + " / " + class201.field3057, -1, -256, (byte) 124);
                                }
                                var34 += 12;
                                if (class593.field8334) {
                                    class555.field7842.method605(var34, var33, "Polys: " + class95.field1472.method538() + " Models: " + class95.field1472.method572(), -1, -256, (byte) -38);
                                    var34 += 12;
                                    class555.field7842.method605(var34, var33, "Ls: " + class271.field3791 + " La: " + class124.field2207 + " NPC: " + class527.field7162 + " Pl: " + class558.field7906, -1, -256, (byte) 26);
                                    var34 += 12;
                                    class388.method2359(128);
                                }
                                class377.field5145[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field352 == 0) {
                            if (class637.field8791 == var12.field379 && class95.field1472.method577()) {
                                class95.field1472.method514(var18, var19, var12.field347, var12.field330);
                            }
                            method1444(arg0, -1, var12.field372, var30, var19 - var12.field362, var17, arg6, var31, var18 - var12.field252, var29, var32);
                            if (var12.field320 != null) {
                                method1444(arg0, -1, var12.field372, var30, var19 - var12.field362, var17, var12.field320, var31, var18 - var12.field252, var29, var32);
                            }
                            class637 var48 = (class637) class186.field2881.method337((long) var12.field372, 1);
                            if (var48 != null) {
                                class423.method2502(var18, var32, var30, var19, -122, var31, var29, var48.field8789, var17);
                            }
                            if (class637.field8791 == var12.field379 && class95.field1472.method577()) {
                                class95.field1472.method558();
                            }
                            class95.field1472.method512(arg9, arg3, arg7, arg10);
                        }
                        if (class338.field4574[var17] || class652.field9029 > 1) {
                            if (var12.field352 == 3) {
                                if (var22 == 0) {
                                    if (var12.field415) {
                                        class95.field1472.method537(var18, var19, var12.field347, var12.field330, var12.field273, 0);
                                    } else {
                                        class95.field1472.method519(var18, var19, var12.field347, var12.field330, var12.field273, 0);
                                    }
                                } else if (var12.field415) {
                                    class95.field1472.method537(var18, var19, var12.field347, var12.field330, var12.field273 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                } else {
                                    class95.field1472.method519(var18, var19, var12.field347, var12.field330, 255 - (var22 & 0xFF) << 24 | var12.field273 & 0xFFFFFF, 1);
                                }
                                if (class618.field8597) {
                                    if (arg0) {
                                        class686.method3861(var13, var15, arg1 + 22739, var14, var16);
                                    } else {
                                        class185.method1377(var13, var15, true, var16, var14);
                                    }
                                }
                            } else if (var12.field352 == 4) {
                                class67 var49 = var12.method113(arg1 - 120, class95.field1472);
                                if (var49 != null) {
                                    int var50 = var12.field273;
                                    String var51 = var12.field316;
                                    if (var12.field355 != -1) {
                                        class730 var52 = class143.field2427.method1410((byte) 13, var12.field355);
                                        var51 = var52.field10079;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field10042 == 1 || var12.field279 != 1) && var12.field279 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class14.method76(var12.field279, -123);
                                        }
                                    }
                                    if (var12.field317 != -1) {
                                        var51 = class634.method3549(true, var12.field317);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class652.field9033 == var12) {
                                        var51 = class641.field8849.method3566((byte) 115, class464.field6309);
                                        var50 = var12.field273;
                                    }
                                    if (class358.field4901) {
                                        class95.field1472.method550(var18, var19, var12.field347 + var18, var12.field330 + var19);
                                    }
                                    var49.method604(0, var12.field285, true, var12.field377 ? 255 - (var22 & 0xFF) << 24 : -1, null, var51, var18, var50 | 255 - (var22 & 0xFF) << 24, var12.field407, var12.field347, var12.field330, class70.field1037, var12.field342, 0, var12.field304, null, var19);
                                    if (class358.field4901) {
                                        class95.field1472.method512(arg9, arg3, arg7, arg10);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class358.field4901) {
                                            class145 var53 = class95.method806(class95.field1472, (byte) -124, var12.field350);
                                            int var54 = var53.method1166((byte) 90, var12.field347, class70.field1037, var51);
                                            int var55 = var53.method1165(class70.field1037, var12.field407, var51, 0, var12.field347);
                                            if (class618.field8597) {
                                                if (arg0) {
                                                    class686.method3861(var18, var18 + var54, 22738, var19, var19 + var55);
                                                } else {
                                                    class185.method1377(var18, var18 + var54, true, var19 + var55, var19);
                                                }
                                            }
                                        } else if (class618.field8597) {
                                            if (arg0) {
                                                class686.method3861(var13, var15, 22738, var14, var16);
                                            } else {
                                                class185.method1377(var13, var15, true, var16, var14);
                                            }
                                        }
                                    }
                                } else if (class235.field3380) {
                                    class410.method2433(var12, arg1 ^ 0xFFFFC91E);
                                }
                            } else if (var12.field352 == 5) {
                                if (var12.field354 < 0) {
                                    class604 var56;
                                    if (var12.field355 != -1) {
                                        class112 var57 = var12.field257 ? class235.field3379.field10630 : null;
                                        var56 = class143.field2427.method1411(var12.field355, var12.field389 | 0xFF000000, arg1, var12.field280, var12.field279, class95.field1472, var57, var12.field293);
                                    } else if (var12.field317 == -1) {
                                        var56 = var12.method108(-29246, class95.field1472);
                                    } else {
                                        var56 = class389.method2361(class95.field1472, 200, var12.field317);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method224();
                                        int var59 = var56.method218();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field273 == 0 ? 16777215 : var12.field273 & 0xFFFFFF);
                                        if (var12.field344) {
                                            class95.field1472.method550(var18, var19, var12.field347 + var18, var12.field330 + var19);
                                            if (var12.field298 != 0) {
                                                int var61 = (var12.field347 + var58 - 1) / var58;
                                                int var62 = (var12.field330 - (1 - var59)) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field273 == 0) {
                                                            var56.method3431((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field298);
                                                        } else {
                                                            var56.method3429((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field298, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field273 == 0 && var22 == 0) {
                                                var56.method3426(var18, var19, var12.field347, var12.field330);
                                            } else {
                                                var56.method226(var18, var19, var12.field347, var12.field330, 0, var60, 1);
                                            }
                                            class95.field1472.method512(arg9, arg3, arg7, arg10);
                                        } else if (var12.field273 == 0 && var22 == 0) {
                                            if (var12.field298 != 0) {
                                                var56.method3431((float) var12.field347 / 2.0F + (float) var18, (float) var12.field330 / 2.0F + (float) var19, var12.field347 * 4096 / var58, var12.field298);
                                            } else if (var12.field347 == var58 && var12.field330 == var59) {
                                                var56.method3430(var18, var19);
                                            } else {
                                                var56.method3424(var18, var19, var12.field347, var12.field330);
                                            }
                                        } else if (var12.field298 != 0) {
                                            var56.method3429((float) var12.field347 / 2.0F + (float) var18, (float) var12.field330 / 2.0F + (float) var19, var12.field347 * 4096 / var58, var12.field298, 0, var60, 1);
                                        } else if (var12.field347 == var58 && var12.field330 == var59) {
                                            var56.method215(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method3433(var18, var19, var12.field347, var12.field330, 0, var60, 1);
                                        }
                                    } else if (class235.field3380) {
                                        class410.method2433(var12, arg1 ^ 0xFFFFC91E);
                                    }
                                } else {
                                    var12.method118(58, class498.field6811, class780.field10746).method2650(var12.field347, (byte) -103, var12.field330, var18, var12.field308 << 3, class95.field1472, var19, 0, 0, var12.field378 << 3);
                                }
                                if (class618.field8597) {
                                    if (arg0) {
                                        class686.method3861(var13, var15, 22738, var14, var16);
                                    } else {
                                        class185.method1377(var13, var15, true, var16, var14);
                                    }
                                }
                            } else if (var12.field352 == 6) {
                                class495.method2839((byte) 88);
                                Object var65 = null;
                                class499 var66 = null;
                                int var67 = 0;
                                if (var12.field355 != -1) {
                                    class730 var68 = class143.field2427.method1410((byte) 59, var12.field355);
                                    if (var68 != null) {
                                        class730 var69 = var68.method4045(var12.field279, (byte) 75);
                                        class200 var70 = var12.field259 == -1 ? null : class108.field1696.method1279((byte) 92, var12.field259);
                                        class112 var71 = var12.field257 ? class235.field3379.field10630 : null;
                                        var66 = var69.method4052(class95.field1472, 2048, -105, var12.field374, var71, 1, var70, var12.field375, var12.field247);
                                        if (var66 == null) {
                                            class410.method2433(var12, arg1 ^ 0xFFFFC91E);
                                        } else {
                                            var67 = -var66.method276() >> 1;
                                        }
                                    }
                                } else if (var12.field272 == 5) {
                                    int var72 = var12.field339;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class771 var73 = class527.field7150[var72];
                                        class200 var74 = var12.field259 == -1 ? null : class108.field1696.method1279((byte) 92, var12.field259);
                                        if (var73 != null && (class483.field6533 == var72 || class220.method1513(var73.field10641, 0) == var12.field276)) {
                                            var66 = var73.field10630.method1020(0, class108.field1696, var12.field247, -1, null, var12.field374, true, 2048, var74, 0, null, class694.field9613, class495.field6783, class143.field2427, 0, (byte) -99, null, class178.field2808, class95.field1472, class706.field9695, var12.field375);
                                        }
                                    }
                                } else if (var12.field272 == 8 || var12.field272 == 9) {
                                    class539 var76 = class210.method1479(false, -114, var12.field339);
                                    class200 var77 = var12.field259 == -1 ? null : class108.field1696.method1279((byte) 92, var12.field259);
                                    if (var76 != null) {
                                        class112 var78 = var12.field257 ? class235.field3379.field10630 : null;
                                        var66 = var76.method3049(var12.field375, var12.field374, 65535, var77, var12.field247, var12.field272 == 9, var12.field276, class95.field1472, 2048, var78);
                                    }
                                } else if (var12.field259 == -1) {
                                    var66 = var12.method106((class325) var65, 2048, -1, class235.field3379.field10630, class95.field1472, 0, class495.field6783, -1, class143.field2427, null, class706.field9695, class694.field9613, 65535, class178.field2808, class108.field1696);
                                    if (var66 == null && class235.field3380) {
                                        class410.method2433(var12, 14049);
                                    }
                                } else {
                                    class200 var75 = class108.field1696.method1279((byte) 92, var12.field259);
                                    var66 = var12.method106((class325) var65, 2048, var12.field247, class235.field3379.field10630, class95.field1472, var12.field374, class495.field6783, var12.field375, class143.field2427, var75, class706.field9695, class694.field9613, 65535, class178.field2808, class108.field1696);
                                    if (var66 == null && class235.field3380) {
                                        class410.method2433(var12, 14049);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field381 > 0) {
                                        var79 = (var12.field347 << 9) / var12.field381;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80;
                                    if (var12.field392 <= 0) {
                                        var80 = 512;
                                    } else {
                                        var80 = (var12.field330 << 9) / var12.field392;
                                    }
                                    int var81 = var12.field347 / 2 + var18;
                                    int var82 = var19 + (var12.field330 / 2);
                                    if (!var12.field242) {
                                        var82 += var12.field383 * var80 >> 9;
                                        var81 += var12.field271 * var79 >> 9;
                                    }
                                    class417.field5701.method1862();
                                    class95.field1472.method503(class417.field5701);
                                    class95.field1472.method521(var81, var82, var79, var80);
                                    class95.field1472.method494();
                                    if (var12.field314) {
                                        class95.field1472.method557(false);
                                    }
                                    if (var12.field242) {
                                        class160.field2574.method1884(var12.field295);
                                        class160.field2574.method1875(var12.field414);
                                        class160.field2574.method1869(var12.field399);
                                        class160.field2574.method1860(var12.field271, var12.field383, var12.field387);
                                    } else {
                                        int var83 = (var12.field412 << 2) * class191.field2937[var12.field295 << 3] >> 14;
                                        int var84 = (var12.field412 << 2) * class191.field2936[var12.field295 << 3] >> 14;
                                        class160.field2574.method1890(-var12.field399 << 3);
                                        class160.field2574.method1875(var12.field414 << 3);
                                        class160.field2574.method1860(var12.field326 << 2, (var12.field313 << 2) + var83 + var67, (var12.field313 << 2) + var84);
                                        class160.field2574.method1877(var12.field295 << 3);
                                    }
                                    var12.method110(class440.field5977, class95.field1472, var66, class160.field2574, (byte) 126);
                                    if (class358.field4901) {
                                        class95.field1472.method550(var18, var19, var18 + var12.field347, var19 - -var12.field330);
                                    }
                                    if (var12.field242) {
                                        if (var12.field411) {
                                            var66.method310(class160.field2574, null, var12.field412, 1);
                                        } else {
                                            var66.method301(class160.field2574, null, 1);
                                            if (var12.field253 != null) {
                                                class95.field1472.method478(var12.field253.method4304());
                                            }
                                        }
                                    } else if (var12.field411) {
                                        var66.method310(class160.field2574, null, var12.field412 << 2, 1);
                                    } else {
                                        var66.method301(class160.field2574, null, 1);
                                        if (var12.field253 != null) {
                                            class95.field1472.method478(var12.field253.method4304());
                                        }
                                    }
                                    if (class358.field4901) {
                                        class95.field1472.method512(arg9, arg3, arg7, arg10);
                                    }
                                    if (var12.field314) {
                                        class95.field1472.method557(true);
                                    }
                                }
                                if (class618.field8597) {
                                    if (arg0) {
                                        class686.method3861(var13, var15, 22738, var14, var16);
                                    } else {
                                        class185.method1377(var13, var15, true, var16, var14);
                                    }
                                }
                            } else if (var12.field352 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field286) {
                                    var85 = var12.field347 + var18;
                                    var86 = var18;
                                    var87 = var19;
                                    var88 = var19 + var12.field330;
                                } else {
                                    var88 = var19;
                                    var87 = var19 + var12.field330;
                                    var85 = var12.field347 + var18;
                                    var86 = var18;
                                }
                                if (var12.field325 == 1) {
                                    class95.field1472.method508(var86, var88, var85, var87, var12.field273, 0);
                                } else {
                                    class95.field1472.method522(var86, var88, var85, var87, var12.field273, var12.field325, 0);
                                }
                                if (class618.field8597) {
                                    if (arg0) {
                                        class686.method3861(var13, var15, 22738, var14, var16);
                                    } else {
                                        class185.method1377(var13, var15, true, var16, var14);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfca;Ljava/lang/String;I)I")
    public static final int method1445(class93 arg0, String arg1, int arg2) {
        if (arg2 >= -70) {
            return -93;
        }
        field3050++;
        int var3 = arg0.field1442;
        byte[] var4 = class503.method2877(arg1, 85);
        arg0.method762(var4.length, (byte) -72);
        arg0.field1442 += class223.field3254.method2526(arg0.field1413, 0, arg0.field1442, var4.length, var4, 1680161187);
        return arg0.field1442 - var3;
    }
}
